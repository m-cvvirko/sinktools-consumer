package pl.achp.sinktools.sinktools.consumer.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pl.achp.sinktools.sinktools.consumer.model.MessageRecord;
import pl.achp.sinktools.sinktools.consumer.repository.MessageRecordRepository;

@Service
public class MessageRecordService {

    private final MessageRecordRepository recordRepository;

    public MessageRecordService(MessageRecordRepository recordRepository) {
        this.recordRepository = recordRepository;
    }

    @Transactional
    public void saveRecord(String data) {
        MessageRecord record = new MessageRecord();
        record.setData(data);
        recordRepository.save(record);
    }
}

