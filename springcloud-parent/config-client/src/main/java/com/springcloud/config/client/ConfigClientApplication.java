/**
 * Project Name:config-client
 * File Name:ConfigClientApplication.java
 * Package Name:com.springcloud.config.client
 * Date:2017年7月27日下午11:05:28
 * author 屈志刚  email:598700560
 *
*/

package com.springcloud.config.client;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

/**
 * ClassName:ConfigClientApplication <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2017年7月27日 下午11:05:28 <br/>
 * @author   屈志刚
 * @version  
 * @since    JDK 1.7
 * @see 	 
 */
@SpringBootApplication
public class ConfigClientApplication {
	
	public static void main(String[] args) {
		
		new SpringApplicationBuilder(ConfigClientApplication.class).web(true).run(args);
	}

}

