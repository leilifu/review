package com.weilianda.service;

import com.weilianda.pojo.RequestParam;
import com.weilianda.pojo.ReviewRequest;

/**
 * @author LLF
 * @date 2019/8/5 - 14:08
 * 请求的参数类
 */
public interface RequestParamService {
    /**
     * @param requestParam  要保存的请求
     * @param reviewRequest 要保存的具体请求参数
     *                      保存请求
     */
    public void save(RequestParam requestParam, ReviewRequest reviewRequest);
}
