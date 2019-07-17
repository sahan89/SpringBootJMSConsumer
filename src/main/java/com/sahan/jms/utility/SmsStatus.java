package com.sahan.jms.utility;

public enum SmsStatus {
    PENDING("Pending", 0),
    SENT("Sent", 1);

    SmsStatus(String smsStatus, Integer smsStatusId) {
        this.smsStatus = smsStatus;
        this.smsStatusId = smsStatusId;
    }

    private String smsStatus;
    private Integer smsStatusId;

    public String getSmsStatus() {
        return smsStatus;
    }

    public void setSmsStatus(String smsStatus) {
        this.smsStatus = smsStatus;
    }

    public Integer getSmsStatusId() {
        return smsStatusId;
    }

    public void setSmsStatusId(Integer smsStatusId) {
        this.smsStatusId = smsStatusId;
    }
}
