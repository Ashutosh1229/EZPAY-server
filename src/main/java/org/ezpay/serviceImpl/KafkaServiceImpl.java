package org.ezpay.serviceImpl;

import org.ezpay.service.KafkaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import static org.ezpay.helper.Contants.AD_KAFKA;

@Service
public class KafkaServiceImpl implements KafkaService {
    @Autowired
    private KafkaTemplate<String,String> kafkaTemplate;
    @Override
    public boolean sendAds(String adMessage) {
        this.kafkaTemplate.send(AD_KAFKA,adMessage);
        return true;
    }
}
