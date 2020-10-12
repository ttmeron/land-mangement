package com.aaca.LandMangement.service;


import com.aaca.LandMangement.entities.Employee;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;


//for string messages
@Service
public class Consumer {
        @KafkaListener(topics = "land",groupId = "group_Id")
        public void consumer(String message) {

            System.out.println("Consumed " + message);
        }

//        @KafkaListener(topics = "land",groupId = "Object_Id",containerFactory = "userKafkaListenerContainerFactory")
//        public void consumeObject(Object object) {
//
//            System.out.println("Consume Employee " + object);
//        }

}
