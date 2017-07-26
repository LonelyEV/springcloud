/**
 * Project Name:eureka-consumer
 * File Name:ConsumerController.java
 * Package Name:com.springcloud.consumer.controller
 * Date:2017年7月26日下午10:25:49
 * author 屈志刚  email:598700560
 *
*/

package com.springcloud.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.netflix.discovery.converters.Auto;

/**
 * ClassName:ConsumerController <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2017年7月26日 下午10:25:49 <br/>
 * @author   屈志刚
 * @version  
 * @since    JDK 1.7
 * @see 	 
 */
@RestController
public class ConsumerController {
	
	
	@Autowired
	private RestTemplate restTemplate;
	
	@Autowired
	private LoadBalancerClient loadBalancerClient;
	
	
	@GetMapping("consumer")
	public String consumer(){
		
        ServiceInstance serviceInstance = loadBalancerClient.choose("eureka-client");
        String url = "http://" + serviceInstance.getHost() + ":" + serviceInstance.getPort() + "/testClient";
        System.out.println(url);
        return restTemplate.getForObject(url, String.class);
	}

}

