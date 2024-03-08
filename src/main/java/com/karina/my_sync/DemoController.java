package com.karina.my_sync;

import java.util.concurrent.Future;

import org.springframework.scheduling.annotation.Async;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@Async
@RestController
public class DemoController {
	@RequestMapping("/sleep")
	public String test()
	{
		   for (int n=0;n<=10;n++)
		   {
			   System.out.println("n is"+n);	   
		   }
		   return "after thread";
	}
	@RequestMapping("/hello")
	Future<String> hello() throws InterruptedException 
	{
		for (int x=0;x<=10;x++)
		{
			Thread.sleep(2000);
			System.out.println("x is" +x);
			
		}
		return null;
	}
	
	@RequestMapping("/web")
	Future <Void> web() throws InterruptedException 
	{
		for (int y=0;y<=10;y++)
		{
			Thread.sleep(300);
			System.out.println("y is " +y);
			
		}
		return null;
		
	}

}
