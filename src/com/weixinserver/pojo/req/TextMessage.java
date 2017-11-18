package com.weixinserver.pojo.req;

/**
 * @description:
 * @author:panguangyi
 * @date: 2017-11-18
 */
public class TextMessage extends RequestMessage {
    // 消息内容
    private String Content;

    public String getContent() {
        return Content;
    }

    public void setContent(String content) {
        Content = content;
    }
}
