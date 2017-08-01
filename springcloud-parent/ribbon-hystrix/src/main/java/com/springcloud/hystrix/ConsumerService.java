/**
 * Project Name:ribbon-hystrix
 * File Name:ConsumerService.java
 * Package Name:com.springcloud.hystrix.controller
 * Date:2017年8月1日下午10:49:01
 * author 屈志刚  email:598700560
 *
*/

package com.springcloud.hystrix;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

/**
 * ClassName:ConsumerService <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2017年8月1日 下午10:49:01 <br/>
 * @author   屈志刚
 * @version  
 * @since    JDK 1.7
 * @see 	 
 */
@Service
public class ConsumerService {
	
	@Autowired
	private RestTemplate restTemplate;
	
	@HystrixCommand(fallbackMethod="fallback")
	public String consumer() throws InterruptedException{
		Thread.sleep(50000L);
		return restTemplate.getForObject("http://eureka-client/testClient", String.class);
	}
	
	public String fallback(){
		return "fallback";
	}

}

