/**
 * Project Name:consumer-feign
 * File Name:FeignApplication.java
 * Package Name:com.springcloud.feign
 * Date:2017年7月25日下午10:50:09
 * author 屈志刚  email:598700560
 *
*/

package com.springcloud.feign;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * ClassName:FeignApplication <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2017年7月25日 下午10:50:09 <br/>
 * @author   屈志刚
 * @version  
 * @since    JDK 1.7
 * @see 	 
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class FeignApplication {
	
	public static void main(String[] args) {
		
		new SpringApplicationBuilder(FeignApplication.class).web(true).run(args);
	}

}

