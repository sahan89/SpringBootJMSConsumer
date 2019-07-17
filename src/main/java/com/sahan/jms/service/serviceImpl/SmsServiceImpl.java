package com.sahan.jms.service.serviceImpl;

import com.sahan.jms.model.Sms;
import com.sahan.jms.repository.SmsRepository;
import com.sahan.jms.service.SmsService;
import com.sahan.jms.utility.SmsStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SmsServiceImpl implements SmsService {

    @Autowired
    private final SmsRepository smsRepository;

    public SmsServiceImpl(SmsRepository smsRepository) {
        this.smsRepository = smsRepository;
    }

    @Override
    public Sms updateSms(Sms sms) {
        sms.setStatus(SmsStatus.PENDING.getSmsStatusId());
        if (sms != null) {
            Sms smsById = smsRepository.findSmsById(sms.getId());
            smsById.setStatus(SmsStatus.SENT.getSmsStatusId());
            Sms updateSms = smsRepository.save(smsById);
            return updateSms;
        }
        return null;
    }
}
