package com.weixinserver.pojo.resp;

/**
 * @description:消息返回基类 (公众帐号 -> 普通用户)
 * @author:panguangyi
 * @date: 2017-11-18
 */
public class ResponseMessage {
    //开发者微信号
    private String ToUserName;
    //发送方账号(一个OpenID)
    private String FromUserName;
    //消息创建时间(整型)
    private long CreateTime;
    //消息类型(text/image/location/link)
    private String MsgType;
    //位0x0001被标志时，星标刚收到的消息
    private int FuncFlag;

    public String getToUserName() {
        return ToUserName;
    }

    public void setToUserName(String toUserName) {
        ToUserName = toUserName;
    }

    public String getFromUserName() {
        return FromUserName;
    }

    public void setFromUserName(String fromUserName) {
        FromUserName = fromUserName;
    }

    public long getCreateTime() {
        return CreateTime;
    }

    public void setCreateTime(long createTime) {
        CreateTime = createTime;
    }

    public String getMsgType() {
        return MsgType;
    }

    public void setMsgType(String msgType) {
        MsgType = msgType;
    }

    public int getFuncFlag() {
        return FuncFlag;
    }

    public void setFuncFlag(int funcFlag) {
        FuncFlag = funcFlag;
    }
}
