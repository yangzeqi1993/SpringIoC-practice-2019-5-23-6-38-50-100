package com.example.SpringIoCpractice;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringIoCPracticeApplicationTests {

	@Test
	public void contextLoads() {

//		//1加载配置文件，根据创建对象
//		ApplicationContext context = new FileSystemXmlApplicationContext("hello.xml");
//		//2得到创建的对象
//		HelloWorld hello=(HelloWorld) context.getBean("helloworld");
//		hello.getHello();
//		//System.out.println(hello);
	}

}
