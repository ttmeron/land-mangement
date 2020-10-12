package com.aaca.LandMangement;

import org.apache.kafka.streams.StreamsBuilder;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import scala.collection.immutable.Stream;


@SpringBootApplication
public class LandManagementApplication {
//		private static final Logger logger = LogManager.getLogger(Object.class);
	public static void main(String[] args) {

		SpringApplication.run(LandManagementApplication.class, args);
		
//		String topicName;
//		int numEvents;
//		if(args.length != 2){
//			System.out.println("please provide command line arguments: topicName numEvents");
//			System.exit(-1);
//		}
//		topicName = args[0];
//		numEvents= Integer.valueOf(args[1]);
//		logger.info("Starting employee producer");
//		logger.debug("topicName" +topicName,"numEvent"+numEvents);

//
//
//		logger.trace("Creating Kafka Producer");
//		Properties properties = new Properties();
//		properties.put(CLIENT_ID_CONFIG,"Hello Employee");
//		properties.put(BOOTSTRAP_SERVERS_CONFIG,  "127.0.0.1:9092");
//		properties.put(KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
//		properties.put(VALUE_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
//
//
//		KafkaProducer<Integer, String> producer = new KafkaProducer<>(properties);
//
//		logger.trace("starting sending message ");
//		try {
//			for (int i = 1; i <= numEvents; i++) {
//				producer.send(new ProducerRecord<>(topicName, i, "Simple Message" + i));
//			}
//		}catch (KafkaException e){
//			logger.error("Exception Occurred  Check log for more details.\n" + e.getMessage());
//			System.exit(-1);
//		}
//		finally {
//			logger.info("Finished Employee producer Closing Kafka Producer");
//			producer.close();
//		}
//	}
	}
		@Bean
		RestTemplate getRestTemplate () {

			return new RestTemplate();
		}
	}

