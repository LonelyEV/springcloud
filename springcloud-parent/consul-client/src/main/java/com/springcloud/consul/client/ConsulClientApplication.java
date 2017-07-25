/**
 * Project Name:consul-client
 * File Name:ConsulClientApplication.java
 * Package Name:com.springcloud.consul.client
 * Date:2017年7月25日下午6:00:39
 * Copyright (c) 2017, Shanghai Law Cloud Technology Co., Ltd. All Rights Reserved.
 *
*/

package com.springcloud.consul.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * ClassName:ConsulClientApplication <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2017年7月25日 下午6:00:39 <br/>
 * @author   屈志刚  
 * @version  
 * @since    JDK 1.7
 * @see 	 
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ConsulClientApplication {
	
	public static void main(String[] args) {
		
		new SpringApplicationBuilder(ConsulClientApplication.class).web(true).run(args);
	}

}

