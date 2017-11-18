package com.weixinserver.pojo.resp;

/**
 * @description:文本消息
 * @author:panguangyi
 * @date: 2017-11-18
 */
public class TextMessage extends ResponseMessage {
    //消息内容
    private String Content;

    public String getContent() {
        return Content;
    }

    public void setContent(String content) {
        Content = content;
    }
}
