package com.sahan.jms.repository;

import com.sahan.jms.model.Sms;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface SmsRepository extends JpaRepository<Sms, Integer> {
    Sms findSmsById(int id);
}
