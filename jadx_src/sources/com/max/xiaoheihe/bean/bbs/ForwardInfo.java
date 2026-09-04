package com.max.xiaoheihe.bean.bbs;

import com.meituan.robust.ChangeQuickRedirect;

/* JADX INFO: loaded from: classes3.dex */
public class ForwardInfo {
    public static ChangeQuickRedirect changeQuickRedirect;
    private String authorID;
    private String authorName;
    private String cardText;
    private String imgUrl;
    private String isDeleted;
    private String linkID;

    public ForwardInfo(String str, String str2, String str3, String str4, String str5, String str6) {
        this.cardText = str;
        this.authorName = str2;
        this.authorID = str3;
        this.linkID = str4;
        this.imgUrl = str5;
        this.isDeleted = str6;
    }

    public String getAuthorID() {
        return this.authorID;
    }

    public String getAuthorName() {
        return this.authorName;
    }

    public String getCardText() {
        return this.cardText;
    }

    public String getImgUrl() {
        return this.imgUrl;
    }

    public String getIsDeleted() {
        return this.isDeleted;
    }

    public String getLinkID() {
        return this.linkID;
    }

    public void setAuthorID(String str) {
        this.authorID = str;
    }

    public void setAuthorName(String str) {
        this.authorName = str;
    }

    public void setCardText(String str) {
        this.cardText = str;
    }

    public void setImgUrl(String str) {
        this.imgUrl = str;
    }

    public void setIsDeleted(String str) {
        this.isDeleted = str;
    }

    public void setLinkID(String str) {
        this.linkID = str;
    }
}
