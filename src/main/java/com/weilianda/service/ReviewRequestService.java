package com.weilianda.service;

import com.weilianda.pojo.ReviewRequest;

/**
 * @author LLF
 * @date 2019/8/5 - 14:09
 */
public interface ReviewRequestService {
    /**
     * 保存请求数据
     *
     * @param reviewRequest
     */
    void save(ReviewRequest reviewRequest);

    /**
     * 根据文章ID查询请求
     * @param postId
     * @return
     */
    ReviewRequest selectByPostId(String postId);
}
