package com.professionalit.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.professionalit.event.OrderExecutionEvent;

@Service
public class ExecutionConsumer {

	@KafkaListener(
	            topics = "order.execution",
	            groupId = "matching-engine"
	    )
	    public void consume(OrderExecutionEvent  order) {

	        System.out.println(
	                "Kafka order received: "
	                        + order.getOrderId());

	        //matchingEngine.submitOrder(order);
	    }

}
