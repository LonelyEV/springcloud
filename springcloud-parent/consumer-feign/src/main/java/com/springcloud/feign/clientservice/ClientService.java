/**
 * Project Name:consumer-feign
 * File Name:ClientService.java
 * Package Name:com.springcloud.feign.clientservice
 * Date:2017年7月25日下午10:52:26
 * author 屈志刚  email:598700560
 *
*/

package com.springcloud.feign.clientservice;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * ClassName:ClientService <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2017年7月25日 下午10:52:26 <br/>
 * @author   屈志刚
 * @version  
 * @since    JDK 1.7
 * @see 	 
 */
@FeignClient("eureka-client")
public interface ClientService {
	
	@GetMapping("/testClient")
	String testClient();

}

