package com.weixinserver.pojo.req;

/**
 * @description: 图片信息
 * @author:panguangyi
 * @date: 2017-11-18
 */
public class ImageMessage extends RequestMessage {
    //图片链接
    private String PicUrl;

    public String getPicUrl() {
        return PicUrl;
    }

    public void setPicUrl(String picUrl) {
        PicUrl = picUrl;
    }
}
