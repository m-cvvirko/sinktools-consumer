package pl.achp.sinktools.sinktools.consumer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.achp.sinktools.sinktools.consumer.model.MessageRecord;

@Repository
public interface MessageRecordRepository extends JpaRepository<MessageRecord, Long> {
}