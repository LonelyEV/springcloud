/**
 * Project Name:consumer-feign
 * File Name:FeignController.java
 * Package Name:com.springcloud.feign.controller
 * Date:2017年7月25日下午11:22:07
 * author 屈志刚  email:598700560
 *
*/

package com.springcloud.feign;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ClassName:FeignController <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2017年7月25日 下午11:22:07 <br/>
 * @author   屈志刚
 * @version  
 * @since    JDK 1.7
 * @see 	 
 */
@RestController
public class FeignController {
	
	@Autowired
	private ClientService clientService;
	
	@GetMapping("feignConsumer")
	public String consumer(){
		
		return clientService.testClient();
	}

}

