package com.max.xiaoheihe.bean.bbs;

import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.umeng.socialize.net.utils.SocializeProtocolConstants;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class FeedBackObj {
    public static ChangeQuickRedirect changeQuickRedirect;
    private List<FaqObj> auto_reply;

    @SerializedName(alternate = {"create_time"}, value = SocializeProtocolConstants.CREATE_AT)
    private String create_at;
    private String device_id;
    private List<FaqObj> faqs;
    private String feedback_id;
    private PostImageObj img;
    private String is_user;
    private String text;
    private String url;

    public List<FaqObj> getAuto_reply() {
        return this.auto_reply;
    }

    public String getCreate_at() {
        return this.create_at;
    }

    public String getDevice_id() {
        return this.device_id;
    }

    public List<FaqObj> getFaqs() {
        return this.faqs;
    }

    public String getFeedback_id() {
        return this.feedback_id;
    }

    public PostImageObj getImg() {
        return this.img;
    }

    public String getIs_user() {
        return this.is_user;
    }

    public String getText() {
        return this.text;
    }

    public String getUrl() {
        return this.url;
    }

    public void setAuto_reply(List<FaqObj> list) {
        this.auto_reply = list;
    }

    public void setCreate_at(String str) {
        this.create_at = str;
    }

    public void setDevice_id(String str) {
        this.device_id = str;
    }

    public void setFaqs(List<FaqObj> list) {
        this.faqs = list;
    }

    public void setFeedback_id(String str) {
        this.feedback_id = str;
    }

    public void setImg(PostImageObj postImageObj) {
        this.img = postImageObj;
    }

    public void setIs_user(String str) {
        this.is_user = str;
    }

    public void setText(String str) {
        this.text = str;
    }

    public void setUrl(String str) {
        this.url = str;
    }
}
