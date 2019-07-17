package com.sahan.jms.consumer;

import com.sahan.jms.model.Sms;
import com.sahan.jms.service.SmsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class JmsConsumer {

    @Autowired
    private final SmsService smsService;

    public JmsConsumer(SmsService smsService) {
        this.smsService = smsService;
    }

    @JmsListener(destination = "${activemq.queue}")
    public void receive(Sms sms) {
        Sms updateSms = smsService.updateSms(sms);
        if (updateSms != null) {
            System.out.println("Received Message: " + "Mobile No: " + sms.getMobileNumber() + " | " + "Message: "
                    + sms.getMessage() + " | " + "Date: " + sms.getSendDate());
        }
    }
}
