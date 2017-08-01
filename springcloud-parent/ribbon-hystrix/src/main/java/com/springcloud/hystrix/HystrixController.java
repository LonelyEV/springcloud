/**
 * Project Name:ribbon-hystrix
 * File Name:HystrixController.java
 * Package Name:com.springcloud.hystrix.controller
 * Date:2017年8月1日下午10:45:46
 * author 屈志刚  email:598700560
 *
*/

package com.springcloud.hystrix;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ClassName:HystrixController <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2017年8月1日 下午10:45:46 <br/>
 * @author   屈志刚
 * @version  
 * @since    JDK 1.7
 * @see 	 
 */
@RestController
public class HystrixController {
	
	@Autowired
	private ConsumerService consumerService;
	
	@RequestMapping("consumer")
	public String consumer() throws InterruptedException{
		return consumerService.consumer();
	}

}

