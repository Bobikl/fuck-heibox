package com.max.xiaoheihe.bean.bbs;

import com.max.hbcommon.bean.KeyDescObj;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public class ForbidInfoObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 3626173427688174202L;
    private String admin_id;
    private String comment;
    private String duration;
    private String post_at;
    private String reason;
    private String remained_seconds;
    private String start_at;
    private KeyDescObj violated_rule;

    public String getAdmin_id() {
        return this.admin_id;
    }

    public String getComment() {
        return this.comment;
    }

    public String getDuration() {
        return this.duration;
    }

    public String getPost_at() {
        return this.post_at;
    }

    public String getReason() {
        return this.reason;
    }

    public String getRemained_seconds() {
        return this.remained_seconds;
    }

    public String getStart_at() {
        return this.start_at;
    }

    public KeyDescObj getViolated_rule() {
        return this.violated_rule;
    }

    public void setAdmin_id(String str) {
        this.admin_id = str;
    }

    public void setComment(String str) {
        this.comment = str;
    }

    public void setDuration(String str) {
        this.duration = str;
    }

    public void setPost_at(String str) {
        this.post_at = str;
    }

    public void setReason(String str) {
        this.reason = str;
    }

    public void setRemained_seconds(String str) {
        this.remained_seconds = str;
    }

    public void setStart_at(String str) {
        this.start_at = str;
    }

    public void setViolated_rule(KeyDescObj keyDescObj) {
        this.violated_rule = keyDescObj;
    }
}
