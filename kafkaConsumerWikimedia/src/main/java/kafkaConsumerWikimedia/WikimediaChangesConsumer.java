package kafkaConsumerWikimedia;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class WikimediaChangesConsumer {
	private static final Logger LOGGER = LoggerFactory.getLogger(WikimediaChangesConsumer.class);
	
	@KafkaListener(topics = "wikimedia-recent-change", groupId = "newTestGroup")
	public void consume(String eventMessage) {
		LOGGER.info("Reveived message: {}", eventMessage);
	}
}
