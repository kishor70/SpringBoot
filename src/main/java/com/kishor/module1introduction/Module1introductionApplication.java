package com.kishor.module1introduction;

import com.kishor.module1introduction.impl.EmailNotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
public class Module1introductionApplication implements CommandLineRunner {


//    final NotificationService notificationServiceObj; //field dependency injection --> recommend not to use in production
//
//    public Module1introductionApplication( //@Qualifier("emailNoti")
//                                            NotificationService notificationServiceObj) {
//        this.notificationServiceObj = notificationServiceObj; //contructor dependency injection --> preferred way
//    }

    @Autowired
    Map<String,NotificationService> notificationServiceMap = new HashMap<>();



    public static void main(String[] args) {
		SpringApplication.run(Module1introductionApplication.class, args);
	}


    @Override
    public void run(String... args) throws Exception {

//       notificationServiceObj.send("hello");
        for(var notificationService: notificationServiceMap.entrySet()){
           System.out.println(notificationService.getKey());
           notificationService.getValue().send("Hello");
        }

    }
}
