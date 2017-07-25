/**
 * Project Name:eureka-client
 * File Name:EurekaClientApplication.java
 * Package Name:com.springcloud.eureka.client
 * Date:2017年7月25日下午4:56:31
 * Copyright (c) 2017, Shanghai Law Cloud Technology Co., Ltd. All Rights Reserved.
 *
*/

package com.springcloud.eureka.client;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * ClassName:EurekaClientApplication <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2017年7月25日 下午4:56:31 <br/>
 * @author   屈志刚  
 * @version  
 * @since    JDK 1.7
 * @see 	 
 */
@SpringBootApplication
@EnableDiscoveryClient
public class EurekaClientApplication {
	
	public static void main(String[] args) {
		new SpringApplicationBuilder(EurekaClientApplication.class).web(true).run(args);
	}

}

