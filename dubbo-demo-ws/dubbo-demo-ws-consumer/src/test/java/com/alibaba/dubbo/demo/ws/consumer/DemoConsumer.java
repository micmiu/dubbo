/*
 * Copyright 1999-2011 Alibaba Group.
 *  
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *  
 *      http://www.apache.org/licenses/LICENSE-2.0
 *  
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.alibaba.dubbo.demo.ws.consumer;

import com.alibaba.dubbo.demo.ws.DemoService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created
 * User: <a href="http://micmiu.com">micmiu</a>
 * Date: 10/18/2015
 * Time: 14:26
 */
public class DemoConsumer {

	public static void main(String[] args) {
		com.alibaba.dubbo.container.Main.main(args);

		//main2();

	}

	public static void main2() {
		ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("META-INF/spring/dubbo-demo-ws-consumer.xml");
		classPathXmlApplicationContext.start();

		DemoService demoService = (DemoService) classPathXmlApplicationContext.getBean("demoService");
		String world = demoService.sayHello("micmiu");

		System.out.println("=====================================");
		System.out.println(world);
		System.out.println("=====================================");
	}

}