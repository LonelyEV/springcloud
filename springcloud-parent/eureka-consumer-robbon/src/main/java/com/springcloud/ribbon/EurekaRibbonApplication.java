package com.springcloud.ribbon;

/**
 * Project Name:eureka-consumer-robbon
 * File Name:EurekaConsumerRobbon.java
 * Package Name:com.springcloud.eureka.consumer.robbon
 * Date:2017年7月25日下午9:42:46
 * author 屈志刚  email:598700560
 *
*/


import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * ClassName:EurekaConsumerRobbon <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2017年7月25日 下午9:42:46 <br/>
 * @author   屈志刚
 * @version  
 * @since    JDK 1.7
 * @see 	 
 */
@SpringBootApplication
@EnableDiscoveryClient
public class EurekaRibbonApplication {
	
	@Bean
	@LoadBalanced
	public RestTemplate getRestTemplate(){
		return new RestTemplate();
	}
	
	public static void main(String[] args) {
		
		new SpringApplicationBuilder(EurekaRibbonApplication.class).web(true).run(args);
		
	}

}

