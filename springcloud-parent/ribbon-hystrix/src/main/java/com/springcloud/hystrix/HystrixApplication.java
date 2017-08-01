/**
 * Project Name:ribbon-hystrix
 * File Name:HystrixApplication.java
 * Package Name:com.springcloud.hystrix
 * Date:2017年8月1日下午10:30:00
 * author 屈志刚  email:598700560
 *
*/

package com.springcloud.hystrix;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * ClassName:HystrixApplication <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2017年8月1日 下午10:30:00 <br/>
 * @author   屈志刚
 * @version  
 * @since    JDK 1.7
 * @see 	 
 */
//@EnableCircuitBreaker
@EnableHystrix
@EnableDiscoveryClient
@SpringBootApplication
public class HystrixApplication {
	
	@Bean
	@LoadBalanced
	public RestTemplate initRestTemplate(){
		return  new RestTemplate();
	}
	
	public static void main(String[] args) {
		
		new SpringApplicationBuilder(HystrixApplication.class).web(true).run(args);
	}

}

