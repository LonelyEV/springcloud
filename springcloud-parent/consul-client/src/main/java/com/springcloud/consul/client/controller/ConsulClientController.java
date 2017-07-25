/**
 * Project Name:consul-client
 * File Name:ConsulClientController.java
 * Package Name:com.springcloud.consul.client.controller
 * Date:2017年7月25日下午6:05:35
 * Copyright (c) 2017, Shanghai Law Cloud Technology Co., Ltd. All Rights Reserved.
 *
*/

package com.springcloud.consul.client.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ClassName:ConsulClientController <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2017年7月25日 下午6:05:35 <br/>
 * @author   屈志刚  
 * @version  
 * @since    JDK 1.7
 * @see 	 
 */

@RestController
public class ConsulClientController {
	
	
	private final static Logger logger = Logger.getLogger(ConsulClientController.class);
	
	@Autowired
	private DiscoveryClient discoveryClient;
	
	@GetMapping("testConsulClient")
	public String testConsulClient(){
		
		String services = "services :"+ discoveryClient.getServices();
		logger.info(services);
		return services;
		
	}

}

