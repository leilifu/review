package com.weilianda.controller;

import com.alibaba.fastjson.JSON;
import com.weilianda.pojo.NotificationRequest;
import com.weilianda.pojo.ReviewRequest;
import com.weilianda.service.NotificationRequestService;
import com.weilianda.service.RequestParamService;
import com.weilianda.util.BaiDuApi;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author LLF
 * @date 2019/8/1 - 17:57
 */
@RestController
@RequestMapping("/v1")
public class Article {
    @Autowired
    public RequestParamService requestParamService;
    @Autowired
    public NotificationRequestService notificationRequestService;

    @PostMapping("/review")
    public String review( ReviewRequest reviewRequest, HttpServletRequest request) {
        Map map = new HashMap<>(16);
        try {
            //用于存放传递的参数
            Map<String, String> reviewArgs = new HashMap(16);
            //文本内容
            StringBuilder text = new StringBuilder();
            List<String> imgUrl = new ArrayList();
            //构造一个HTML，带有ID和标签，以此容易识别
            String html = "<div id='a'><article>" + reviewRequest.getContent() + "</article></div>";
            Document doc = Jsoup.parseBodyFragment(html);
            //获取图片
            Element content = doc.getElementById("a");
            Elements a = content.getElementsByTag("article");
            //文本内容
            for (Element element : a) {
                System.out.println(element.text());
                text.append(element.text());
            }
            //图片URL
            Elements imgs = doc.select("img");
            for (Element img : imgs) {
                //解析图片的结果
                System.out.println(img.attr("src"));
                imgUrl.add(img.attr("src"));
            }
            if (imgUrl != null && imgUrl.size() > 0) {
                reviewArgs.put("imgUrl", JSON.toJSONString(imgUrl));
            }
            if (text != null && text.length() > 0) {
                reviewArgs.put("text", text.toString());
            }
            //文章ID
            reviewArgs.put("postId", reviewRequest.getPostId());
            //审核回调地址
            reviewArgs.put("notify", reviewRequest.getNotify());
            BaiDuApi.review(reviewArgs);
            map.put("code", "0");
            map.put("msg", "亲，您的文章审核请求已提交");
        } catch (Exception e) {
            e.printStackTrace();
            map.put("code", "1");
            map.put("msg", "抱歉，文章提交失败，请重新提交");
        }
        String rtnJson = JSON.toJSONString(map);
       /* try {
            RequestParam requestParam = new RequestParam();
            requestParam.setIp(getRealIp(request));
            requestParam.setCreateTime(new Date());
            requestParam.setResult(rtnJson);
            requestParamService.save(requestParam, reviewRequest);
        } catch (Exception e) {
            e.printStackTrace();
        }*/
        return rtnJson;
    }

    /**
     * 测试用
     * @param notificationRequest
     */
    @PostMapping("/save")
    public void requestNotify(@RequestBody NotificationRequest notificationRequest) {
        notificationRequestService.save(notificationRequest);
    }

    @PostMapping("/tongguo")
    public String tongGuo() {
        Map map = new HashMap(16);
        map.put("code", "0");
        return JSON.toJSONString(map);
    }

    /**
     * 获取真实IP
     *
     * @param request 请求体
     * @return 真实IP
     */
    public static String getRealIp(HttpServletRequest request) {
        // 这个一般是Nginx反向代理设置的参数
        String ip = request.getHeader("X-Real-IP");
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("X-Forwarded-For");
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("Proxy-Client-IP");
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("WL-Proxy-Client-IP");
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getRemoteAddr();
        }
        // 处理多IP的情况（只取第一个IP）
        if (ip != null && ip.contains(",")) {
            String[] ipArray = ip.split(",");
            ip = ipArray[0];
        }
        return ip;
    }
}
