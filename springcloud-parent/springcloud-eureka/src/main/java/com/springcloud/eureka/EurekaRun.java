/**
 * Project Name:springcloud-eureka
 * File Name:EurekaRun.java
 * Package Name:com.springcloud.eureka
 * Date:2017年7月24日下午9:51:29
 * author 屈志刚  email:598700560
 *
*/

package com.springcloud.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * ClassName:EurekaRun <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2017年7月24日 下午9:51:29 <br/>
 * @author   屈志刚
 * @version  
 * @since    JDK 1.7
 * @see 	 
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaRun {
	
	public static void main(String[] args) {
		SpringApplication.run(EurekaRun.class, args);
	}
	
	//在当前项目下执行cmd 命令  mvn clean package
	//然后 cd E:\learn-git\springcloud\springcloud-parent\springcloud-eureka\target 执行以下两条命令（分两次执行）
/*	
 * java -jar springcloud-eureka-0.0.1-SNAPSHOT.jar --spring.profiles.active=peer1 
	java -jar springcloud-eureka-0.0.1-SNAPSHOT.jar --spring.profiles.active=peer2
	*/

}

