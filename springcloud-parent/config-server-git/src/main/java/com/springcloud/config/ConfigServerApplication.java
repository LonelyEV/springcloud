/**
 * Project Name:config-server-git
 * File Name:ConfigServerApplication.java
 * Package Name:com.springcloud.config
 * Date:2017年7月26日下午11:34:21
 * author 屈志刚  email:598700560
 *
*/

package com.springcloud.config;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * ClassName:ConfigServerApplication <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2017年7月26日 下午11:34:21 <br/>e
 * @author   屈志刚
 * @version  
 * @since    JDK 1.7
 * @see 	 
 */
@SpringBootApplication
@EnableConfigServer
public class ConfigServerApplication {
	
	public static void main(String[] args) {
		
		new SpringApplicationBuilder(ConfigServerApplication.class).web(true).run(args);
	}

}

