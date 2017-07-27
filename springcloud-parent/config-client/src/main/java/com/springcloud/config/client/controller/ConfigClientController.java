/**
 * Project Name:config-client
 * File Name:ConfigClientController.java
 * Package Name:com.springcloud.config.client.controller
 * Date:2017年7月27日下午11:09:26
 * author 屈志刚  email:598700560
 *
*/

package com.springcloud.config.client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ClassName:ConfigClientController <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2017年7月27日 下午11:09:26 <br/>
 * @author   屈志刚
 * @version  
 * @since    JDK 1.7
 * @see 	 
 */
@RefreshScope
@RestController
public class ConfigClientController {
	
	@Value("${from}")
	private String from;
	
	@GetMapping("getFrom")
	public String getFrom(){
		
		return from; 
	}

}

