/**
 * Project Name:eureka-client
 * File Name:ClientController.java
 * Package Name:com.springcloud.eureka.client.controller
 * Date:2017年7月25日下午5:02:01
 * Copyright (c) 2017, Shanghai Law Cloud Technology Co., Ltd. All Rights Reserved.
 *
*/

package com.springcloud.eureka.client.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * ClassName:ClientController <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2017年7月25日 下午5:02:01 <br/>
 * @author   屈志刚  
 * @version  
 * @since    JDK 1.7
 * @see 	 
 */
@RestController
public class ClientController {
	
	private final Logger logger = Logger.getLogger(ClientController.class);
	
	@Autowired
	private DiscoveryClient discoveryClient;
	
	@GetMapping("testClient")
	public String testClient(){
	
		String services = "Services :" + discoveryClient.getServices();
		logger.info("services");
		return services;
		
	}
	
	

}

