package com.weilianda.service;

import com.weilianda.pojo.NotificationRequest;

/**
 * @author LLF
 * @date 2019/8/5 - 14:46
 */
public interface NotificationRequestService {
    /**
     * 保存审核结果
     * @param notificationRequest
     */
    void save(NotificationRequest notificationRequest);
}
