package com.weixinserver.pojo.req;

/**
 * @description:语音消息
 * @author:panguangyi
 * @date: 2017-11-18
 */
public class VoliceMessage extends RequestMessage {
    //媒体ID
    private String MediaId;
    //语音格式
    private String Format;

    public String getFormat() {
        return Format;
    }

    public void setFormat(String format) {
        Format = format;
    }

    public String getMediaId() {

        return MediaId;
    }

    public void setMediaId(String mediaId) {
        MediaId = mediaId;
    }
}
