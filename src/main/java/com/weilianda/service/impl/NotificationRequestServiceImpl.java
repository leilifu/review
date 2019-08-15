package com.weilianda.service.impl;

import com.weilianda.mapper.NotificationRequestMapper;
import com.weilianda.pojo.NotificationRequest;
import com.weilianda.pojo.ReviewRequest;
import com.weilianda.service.NotificationRequestService;
import com.weilianda.service.ReviewRequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author LLF
 * @date 2019/8/5 - 14:46
 */
@Service
public class NotificationRequestServiceImpl implements NotificationRequestService {
    @Autowired
    public NotificationRequestMapper notificationRequestMapper;
    @Autowired
    public ReviewRequestService reviewRequestService;

    @Override
    public void save(NotificationRequest notificationRequest) {
        ReviewRequest reviewRequest = reviewRequestService.selectByPostId(notificationRequest.getPostId());
        notificationRequest.setRequestId(reviewRequest.getRequestId());
        notificationRequestMapper.insert(notificationRequest);
    }
}
