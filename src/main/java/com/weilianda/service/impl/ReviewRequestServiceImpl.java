package com.weilianda.service.impl;

import com.weilianda.mapper.ReviewRequestMapper;
import com.weilianda.pojo.ReviewRequest;
import com.weilianda.pojo.ReviewRequestExample;
import com.weilianda.service.ReviewRequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author LLF
 * @date 2019/8/5 - 14:21
 */
@Service
public class ReviewRequestServiceImpl implements ReviewRequestService {

    @Autowired
    public ReviewRequestMapper reviewRequestMapper;

    @Override
    public void save(ReviewRequest reviewRequest) {
        reviewRequestMapper.insert(reviewRequest);
    }

    @Override
    public ReviewRequest selectByPostId(String postId) {
        ReviewRequestExample example=new ReviewRequestExample();
        ReviewRequestExample.Criteria criteria = example.createCriteria();
        criteria.andPostIdEqualTo(postId);
        List<ReviewRequest> reviewRequests = reviewRequestMapper.selectByExample(example);
        if(reviewRequests!=null&&reviewRequests.size()>0)
        {
            return reviewRequests.get(0);
        }
        return null;
    }

}
