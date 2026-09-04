package com.max.xiaoheihe.bean.bbs;

import com.max.xiaoheihe.bean.account.PushStateObj;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public class BBSFloorCommentObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = -5074489125928948371L;
    private String captcha_url;
    private BBSCommentsObj comment;
    private PushStateObj reply_push_state;
    private String verify_reason;

    public String getCaptcha_url() {
        return this.captcha_url;
    }

    public BBSCommentsObj getComment() {
        return this.comment;
    }

    public PushStateObj getReply_push_state() {
        return this.reply_push_state;
    }

    public String getVerify_reason() {
        return this.verify_reason;
    }

    public void setCaptcha_url(String str) {
        this.captcha_url = str;
    }

    public void setComment(BBSCommentsObj bBSCommentsObj) {
        this.comment = bBSCommentsObj;
    }

    public void setReply_push_state(PushStateObj pushStateObj) {
        this.reply_push_state = pushStateObj;
    }

    public void setVerify_reason(String str) {
        this.verify_reason = str;
    }
}
