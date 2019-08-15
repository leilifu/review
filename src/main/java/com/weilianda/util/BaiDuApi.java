package com.weilianda.util;

import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.stereotype.Component;

import javax.jms.Queue;
import java.util.Map;

/**
 * @author LLF
 * @date 2019/8/2 - 14:16
 */
@Component
public class BaiDuApi {
    private static Queue queue;
    private static JmsMessagingTemplate jmsMessagingTemplate;

    @Autowired
    public void setQueue(Queue queue) {
        BaiDuApi.queue = queue;
    }

    @Autowired
    public void setJmsMessagingTemplate(JmsMessagingTemplate jmsMessagingTemplate) {
        BaiDuApi.jmsMessagingTemplate = jmsMessagingTemplate;
    }

    /**
     * @param reviewArgs 文章审核的参数，里面应该包含回调地址和文章ID
     */
    public static void review(Map<String,String> reviewArgs) {
        String reviewArg=JSON.toJSONString(reviewArgs);
        jmsMessagingTemplate.convertAndSend(queue,reviewArg);
    }
}
