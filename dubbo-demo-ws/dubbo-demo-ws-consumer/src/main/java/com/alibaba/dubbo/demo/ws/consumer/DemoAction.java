package com.alibaba.dubbo.demo.ws.consumer;

import com.alibaba.dubbo.demo.ws.DemoService;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created
 * User: <a href="http://micmiu.com">micmiu</a>
 * Date: 10/13/2015
 * Time: 14:26
 */
public class DemoAction {

	private DemoService demoService;

	public void setDemoService(DemoService demoService) {
		this.demoService = demoService;
	}

	public void start() throws Exception {
		for (int i = 0; i < Integer.MAX_VALUE; i++) {
			try {
				String hello = demoService.sayHello("micmiu.com" + i);
				System.out.println("[" + new SimpleDateFormat("HH:mm:ss").format(new Date()) + "] " + hello);
			} catch (Exception e) {
				e.printStackTrace();
			}
			Thread.sleep(2000);
		}
	}
}
