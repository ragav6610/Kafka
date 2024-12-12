package com.delbi.v1.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class KafkaConfig {

    @Bean
    public NewTopic topicSri() {
        return new NewTopic("sri", 1, (short) 1);
    }

    @Bean
    public NewTopic topicRagav() {
        return new NewTopic("ragav", 1, (short) 1);
    }
}

