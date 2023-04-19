package com.example.realestate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RealEstateApplication {

    public static void main(String[] args) {
        SpringApplication.run(RealEstateApplication.class, args);
        ClientUser client= new ClientUser();
        client.setId(31436752);
        client.setEmail("mainabonface4@gmail.com");
        client.setFirstName("Bonface");
        client.setLastName("Maina");
        System.out.println("My name is "+client.getFirstName()+" "+client.getLastName()
                +" and my email address is "+client.getEmail() +" and my Id number is "+ client.getId());
    }

}
