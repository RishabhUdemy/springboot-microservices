package com.boot;

import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.boot.controller.EmployeeJobTypeController;
import com.boot.vo.EmployeeVO;

@SpringBootApplication
public class Springboot01PersonMiniprojAutoConfigurationApplication {

	public static void main(String[] args) throws Exception {
		//read the input
		Scanner scr = new Scanner(System.in);
		System.out.println("Please enter the job type::");
		int count = scr.nextInt();
		String[] jobType = null;
		if(count > 0)
			jobType = new String[count];
		else {
			System.out.println("invalid job type");
			return ;
		}
		for(int i=0;i<jobType.length;i++) {
			System.out.println("Enter the type of jobType::"+ (i+1));
			String jobT = scr.next();
			jobType[i] = jobT;
		}
		
		ApplicationContext ctx = SpringApplication.run(Springboot01PersonMiniprojAutoConfigurationApplication.class, args);
		
		//get controller
		EmployeeJobTypeController controller = ctx.getBean("empcontroller",EmployeeJobTypeController.class);
		try {
			List<EmployeeVO> listvo =  controller.showEmployeeJobType(jobType);
			listvo.forEach(System.out::println);
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("Some internal problem "+e.getMessage());
		}
		
		((ConfigurableApplicationContext)ctx).close();
		
	}

}
