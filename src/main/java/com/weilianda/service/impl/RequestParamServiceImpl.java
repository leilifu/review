package com.weilianda.service.impl;

import com.weilianda.mapper.RequestParamMapper;
import com.weilianda.pojo.RequestParam;
import com.weilianda.pojo.ReviewRequest;
import com.weilianda.service.RequestParamService;
import com.weilianda.service.ReviewRequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author LLF
 * @date 2019/8/5 - 14:13
 */
@Service
public class RequestParamServiceImpl implements RequestParamService {
    @Autowired
    public ReviewRequestService reviewRequestService;
    @Autowired
    public RequestParamMapper requestParamMapper;

    @Override
    public void save(RequestParam requestParam, ReviewRequest reviewRequest) {
        requestParamMapper.insert(requestParam);
        reviewRequest.setRequestId(requestParam.getId());
        reviewRequestService.save(reviewRequest);
    }
}
