package com.max.xiaoheihe.bean.bbs;

import com.max.hbminiprogram.bean.MiniProgramObj;
import com.max.xiaoheihe.bean.game.calendar.ColorObj;
import com.meituan.robust.ChangeQuickRedirect;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class BBSTopicMenusObj {
    public static ChangeQuickRedirect changeQuickRedirect;
    private ColorObj bg_color;
    private HashtagObj hashtag;
    private String is_favour;
    private String media_view_new_style;
    private List<BBSTopicMenuObj> menu;
    private List<MiniProgramObj> mini_programs;
    private BBSTopicObj topic;

    public ColorObj getBg_color() {
        return this.bg_color;
    }

    public HashtagObj getHashtag() {
        return this.hashtag;
    }

    public String getIs_favour() {
        return this.is_favour;
    }

    public String getMedia_view_new_style() {
        return this.media_view_new_style;
    }

    public List<BBSTopicMenuObj> getMenu() {
        return this.menu;
    }

    public List<MiniProgramObj> getMini_programs() {
        return this.mini_programs;
    }

    public BBSTopicObj getTopic() {
        return this.topic;
    }

    public void setBg_color(ColorObj colorObj) {
        this.bg_color = colorObj;
    }

    public void setHashtag(HashtagObj hashtagObj) {
        this.hashtag = hashtagObj;
    }

    public void setIs_favour(String str) {
        this.is_favour = str;
    }

    public void setMedia_view_new_style(String str) {
        this.media_view_new_style = str;
    }

    public void setMenu(List<BBSTopicMenuObj> list) {
        this.menu = list;
    }

    public void setMini_programs(List<MiniProgramObj> list) {
        this.mini_programs = list;
    }

    public void setTopic(BBSTopicObj bBSTopicObj) {
        this.topic = bBSTopicObj;
    }
}
