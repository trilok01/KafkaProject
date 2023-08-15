package kafkaProducerWikimedia;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class WikimediaChangesProducer {
	private static final Logger LOGGER = LoggerFactory.getLogger(WikimediaChangesProducer.class);
	
	private KafkaTemplate<String, String> kafkaTemplate;

	public WikimediaChangesProducer(KafkaTemplate<String, String> kafkaTemplate) {
		this.kafkaTemplate = kafkaTemplate;
	}
	
	public void sendMessage() {
		String topic = "wikimedia-recent-change";
		
		// To read realtime stream data from wikimedia, we use event source.
	}
}
