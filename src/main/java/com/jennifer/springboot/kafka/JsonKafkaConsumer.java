package com.jennifer.springboot.kafka;

import com.jennifer.springboot.model.User;
import org.slf4j.Logger;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class JsonKafkaConsumer {
    private static final Logger LOGGER = org.slf4j.LoggerFactory.getLogger(JsonKafkaConsumer.class);
    @KafkaListener(topics = "firstTopic_Json", groupId = "myGroup")

    public void consume(User data){
        LOGGER.info(String.format("Json Message Received -> %s", data.toString()));

    }
}
