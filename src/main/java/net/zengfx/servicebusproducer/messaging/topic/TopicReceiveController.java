package net.zengfx.servicebusproducer.messaging.topic;

import net.zengfx.servicebusproducer.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class TopicReceiveController {

    private static final String TOPIC_NAME = "email";

    private static final String SUBSCRIPTION_NAME = "testsendermail";

    private final Logger logger = LoggerFactory.getLogger(TopicReceiveController.class);

    @JmsListener(destination = TOPIC_NAME, containerFactory = "topicJmsListenerContainerFactory",
            subscription = SUBSCRIPTION_NAME)
    public void receiveMessage(User user) {
        logger.info("Received message: {}", user.getName());
    }
}