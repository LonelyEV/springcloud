/**
 * Project Name:eureka-consumer
 * File Name:EurekaConsumerApplication.java
 * Package Name:com.springcloud.eureka.consumer
 * Date:2017年7月25日下午9:04:03
 * author 屈志刚  email:598700560
 *
*/

package com.springcloud.consumer;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * ClassName:EurekaConsumerApplication <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2017年7月25日 下午9:04:03 <br/>
 * @author   屈志刚
 * @version  
 * @since    JDK 1.7
 * @see 	 
 */
@SpringBootApplication
@EnableDiscoveryClient
public class EurekaConsumerApplication {
	
	@Bean
	public RestTemplate getRestTemplate(){
		return new RestTemplate();
	}
	
	public static void main(String[] args) {
		
		new SpringApplicationBuilder(EurekaConsumerApplication.class).web(true).run(args);
	}

}

