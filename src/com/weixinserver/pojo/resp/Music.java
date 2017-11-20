package com.weixinserver.pojo.resp;

/**
 * @description:音乐
 * @author:panguangyi
 * @date: 2017-11-18
 */
public class Music {
    //音乐标题
    private String Title;
    //音乐描述
    private String Description;
    //音乐链接
    private String MusicUrl;
    //高质量音乐链接，WIFI环境优先使用该链接播放音乐
    private String HQMusicUr;

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getMusicUrl() {
        return MusicUrl;
    }

    public void setMusicUrl(String musicUrl) {
        MusicUrl = musicUrl;
    }

    public String getHQMusicUr() {
        return HQMusicUr;
    }

    public void setHQMusicUr(String HQMusicUr) {
        this.HQMusicUr = HQMusicUr;
    }
}
