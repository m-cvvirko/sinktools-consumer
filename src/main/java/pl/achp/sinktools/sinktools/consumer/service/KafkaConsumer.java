package pl.achp.sinktools.sinktools.consumer.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaConsumer {

    private final MessageRecordService recordService;

    public KafkaConsumer(MessageRecordService recordService) {
        this.recordService = recordService;
    }

    @KafkaListener(topics = "your_topic_name", groupId = "test")
    public void listen(String message) {
        System.out.println("Received Message in group 'test': " + message);
        recordService.saveRecord(message);
    }
}

