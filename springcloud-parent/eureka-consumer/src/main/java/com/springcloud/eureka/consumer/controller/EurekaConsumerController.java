/**
 * Project Name:eureka-consumer
 * File Name:EurekaConsumerController.java
 * Package Name:com.springcloud.eureka.consumer
 * Date:2017年7月25日下午9:08:21
 * author 屈志刚  email:598700560
 *
*/

package com.springcloud.eureka.consumer.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * ClassName:EurekaConsumerController <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2017年7月25日 下午9:08:21 <br/>
 * @author   屈志刚
 * @version  
 * @since    JDK 1.7
 * @see 	 
 */
@RestController
public class EurekaConsumerController {
	
	private final static Logger logger = Logger.getLogger(EurekaConsumerController.class);
	
	@Autowired
	private LoadBalancerClient loadBalancerClient;
	
	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping("consumer")
	public String consumer(){
		
		// loadBalancerClient 负载均衡来选择一个服务
		ServiceInstance serviceInstance = loadBalancerClient.choose("eureka-client");  
		// 拼接要调用的url
		String url = "http://"+serviceInstance.getHost()+":"+serviceInstance.getPort()+"/testClient";
		logger.info(url);
		// 调用
		return restTemplate.getForObject(url, String.class);
	}

}

