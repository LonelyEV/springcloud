/**
 * Project Name:eureka-consumer-robbon
 * File Name:EurekaConsumerRobbonController.java
 * Package Name:com.springcloud.eureka.consumer.robbon.controller
 * Date:2017年7月25日下午9:48:14
 * author 屈志刚  email:598700560
 *
*/

package com.springcloud.ribbon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * ClassName:EurekaConsumerRobbonController <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2017年7月25日 下午9:48:14 <br/>
 * @author   屈志刚
 * @version  
 * @since    JDK 1.7
 * @see 	 
 */
@RestController
public class EurekaConsumerRibbonController {
	
	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping("consumer")
	public String consumer(){
		
		return restTemplate.getForObject("http://eureka-client/testClient", String.class);
	}

}

