#!/bin/bash
# Create topics
#kafka-topics --create --if-not-exists --bootstrap-server localhost:9092 --partitions 1 --replication-factor 1 --topic example-topic

sleep 10
# Create topics
IFS=',' read -ra ADDR <<< "$KAFKA_CREATE_TOPICS"
for i in "${ADDR[@]}"; do
  kafka-topics.sh --create --bootstrap-server localhost:9092 --partitions ${i%:*:*} --replication-factor ${i##*:} --topic ${i%%:*}
done