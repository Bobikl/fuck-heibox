package com.max.xiaoheihe.bean.mall;

import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public class GameStoreOrderKeyObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = -1189354056753923666L;
    private String deadline;
    private String key;
    private String title;

    public String getDeadline() {
        return this.deadline;
    }

    public String getKey() {
        return this.key;
    }

    public String getTitle() {
        return this.title;
    }

    public void setDeadline(String str) {
        this.deadline = str;
    }

    public void setKey(String str) {
        this.key = str;
    }

    public void setTitle(String str) {
        this.title = str;
    }
}
