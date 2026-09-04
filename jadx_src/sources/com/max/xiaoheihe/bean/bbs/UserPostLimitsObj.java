package com.max.xiaoheihe.bean.bbs;

import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public class UserPostLimitsObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = -1300445287251539136L;
    private PostLimitObj article_limit;
    private boolean can_post_comment;
    private boolean can_post_danmaku;
    private boolean can_post_link;
    private PostLimitObj cate_link_limit;
    private PostLimitObj link_limit;
    private String max_input_limit_post_comment;
    private String max_pictures_num;
    private String msg_post_comment;
    private String msg_post_danmaku;
    private String msg_post_link;
    private PostLimitObj pic_link_limit;

    public PostLimitObj getArticle_limit() {
        return this.article_limit;
    }

    public PostLimitObj getCate_link_limit() {
        return this.cate_link_limit;
    }

    public PostLimitObj getLink_limit() {
        return this.link_limit;
    }

    public String getMax_input_limit_post_comment() {
        return this.max_input_limit_post_comment;
    }

    public String getMax_pictures_num() {
        return this.max_pictures_num;
    }

    public String getMsg_post_comment() {
        return this.msg_post_comment;
    }

    public String getMsg_post_danmaku() {
        return this.msg_post_danmaku;
    }

    public String getMsg_post_link() {
        return this.msg_post_link;
    }

    public PostLimitObj getPic_link_limit() {
        return this.pic_link_limit;
    }

    public boolean isCan_post_comment() {
        return this.can_post_comment;
    }

    public boolean isCan_post_danmaku() {
        return this.can_post_danmaku;
    }

    public boolean isCan_post_link() {
        return this.can_post_link;
    }

    public void setArticle_limit(PostLimitObj postLimitObj) {
        this.article_limit = postLimitObj;
    }

    public void setCan_post_comment(boolean z10) {
        this.can_post_comment = z10;
    }

    public void setCan_post_danmaku(boolean z10) {
        this.can_post_danmaku = z10;
    }

    public void setCan_post_link(boolean z10) {
        this.can_post_link = z10;
    }

    public void setCate_link_limit(PostLimitObj postLimitObj) {
        this.cate_link_limit = postLimitObj;
    }

    public void setLink_limit(PostLimitObj postLimitObj) {
        this.link_limit = postLimitObj;
    }

    public void setMax_input_limit_post_comment(String str) {
        this.max_input_limit_post_comment = str;
    }

    public void setMax_pictures_num(String str) {
        this.max_pictures_num = str;
    }

    public void setMsg_post_comment(String str) {
        this.msg_post_comment = str;
    }

    public void setMsg_post_danmaku(String str) {
        this.msg_post_danmaku = str;
    }

    public void setMsg_post_link(String str) {
        this.msg_post_link = str;
    }

    public void setPic_link_limit(PostLimitObj postLimitObj) {
        this.pic_link_limit = postLimitObj;
    }
}
