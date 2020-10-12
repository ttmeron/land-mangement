package com.aaca.LandMangement.configration;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.common.serialization.StringSerializer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.core.DefaultKafkaProducerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.core.ProducerFactory;


import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import static org.apache.kafka.clients.producer.ProducerConfig.*;

@EnableKafka
@Configuration
public class KafkaConfig {
//
//    @Value("${jsa.kafka.bootstrap-servers}")
//        private String bootstrapServer;

//    private static final Logger logger = LogManager.getLogger(Object.class);

        @Bean
    public ProducerFactory<String,Object> producerFactory(){
//        logger.trace("Creating Kafka Producer");
        Map<String, Object> config = new HashMap<>();
//        config.put(BOOTSTRAP_SERVERS_CONFIG,  bootstrapServer);
//        config.put(CLIENT_ID_CONFIG,"Hello Employee");
        config.put(BOOTSTRAP_SERVERS_CONFIG,  "127.0.0.1:9092");
        config.put(KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
        config.put(VALUE_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
        return new DefaultKafkaProducerFactory<>(config);

    }
    @Bean
    public KafkaTemplate<String, Object> kafkaTemplate(){
        return new KafkaTemplate<String, Object>(producerFactory());
    }
//    @Bean
//    public ProducerFactory<String, Object> producerFactory() {
//
//        Properties properties = new Properties();
//
//        properties.put(CLIENT_ID_CONFIG, "Hello Employee");
//        properties.put(BOOTSTRAP_SERVERS_CONFIG, "127.0.0.1:9092");
//        properties.put(KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
//        properties.put(VALUE_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
//        return new DefaultKafkaProducerFactory(properties);
//    }
//
//
//    @Bean
//    public KafkaProducer <String, Object> producer(producerFactory()) {
//        return new KafkaProducer<String, Object>();
//    }
}
