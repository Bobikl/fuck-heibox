package com.max.xiaoheihe.bean.account;

import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public class PushStateObj implements Serializable {
    public static final String PUSH_TYPE_REPLY = "3";
    public static ChangeQuickRedirect changeQuickRedirect;
    private boolean isTitle = false;
    private String push_state;
    private String push_type;
    private String push_type_desc;

    public String getPush_state() {
        return this.push_state;
    }

    public String getPush_type() {
        return this.push_type;
    }

    public String getPush_type_desc() {
        return this.push_type_desc;
    }

    public boolean isTitle() {
        return this.isTitle;
    }

    public void setPush_state(String str) {
        this.push_state = str;
    }

    public void setPush_type(String str) {
        this.push_type = str;
    }

    public void setPush_type_desc(String str) {
        this.push_type_desc = str;
    }

    public void setTitle(boolean z10) {
        this.isTitle = z10;
    }
}
