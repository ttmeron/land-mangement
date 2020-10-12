//package com.aaca.LandMangement.configration;
//
//import org.apache.kafka.clients.consumer.ConsumerConfig;
//import org.apache.kafka.clients.consumer.KafkaConsumer;
//import org.apache.kafka.common.serialization.Serdes;
//import org.apache.kafka.common.serialization.StringSerializer;
//import org.apache.kafka.streams.KafkaStreams;
//import org.apache.kafka.streams.StreamsBuilder;
//import org.apache.kafka.streams.StreamsConfig;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.kafka.config.ConcurrentKafkaListenerContainerFactory;
//import org.springframework.kafka.core.ConsumerFactory;
//import org.springframework.kafka.core.DefaultKafkaConsumerFactory;
//import org.springframework.kafka.core.KafkaTemplate;
//import org.springframework.kafka.core.ProducerFactory;
//
//import java.util.HashMap;
//import java.util.Map;
//import java.util.Properties;
//
//import static org.apache.kafka.clients.producer.ProducerConfig.*;
//
//@Configuration
//public class WordCountConfig {
//    private Object DefaultKafkaConsumerFactory;
//
//    @Bean
//    public ConsumerFactory<String,String> consumerFactory(){
////        Properties config = new Properties();
//        Map<String,Object> config = new HashMap<>();
//        config.put(StreamsConfig.APPLICATION_ID_CONFIG,"" );
//        config.put(ConsumerConfig.AUTO_OFFSET_RESET_CONFIG,"");
//        config.put(StreamsConfig.BOOTSTRAP_SERVERS_CONFIG,  "127.0.0.1:9092");
//        config.put(StreamsConfig.DEFAULT_KEY_SERDE_CLASS_CONFIG, Serdes.String().getClass());
//        config.put(StreamsConfig.DEFAULT_VALUE_SERDE_CLASS_CONFIG, Serdes.String().getClass());
//        config.put(VALUE_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
//        return new DefaultKafkaConsumerFactory<>(config);
//    }
//    @Bean
//    public ConcurrentKafkaListenerContainerFactory<String,String> kafkaListenerContainerFactory() {
//        ConcurrentKafkaListenerContainerFactory<String,String> factory = new ConcurrentKafkaListenerContainerFactory();
//        factory.setConsumerFactory(consumerFactory());
//        return factory;
//    }
//
//    @Bean
//    public StreamsBuilder streamsBuilder(){
//        StreamsBuilder() builder = new StreamsBuilder();
//        return  builder;
//    }

//
//
//
//}
