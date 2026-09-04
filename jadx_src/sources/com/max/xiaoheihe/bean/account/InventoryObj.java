package com.max.xiaoheihe.bean.account;

import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public class InventoryObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    private String icon_url;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private String f76948id;
    private String name;

    public String getIcon_url() {
        return this.icon_url;
    }

    public String getId() {
        return this.f76948id;
    }

    public String getName() {
        return this.name;
    }

    public void setIcon_url(String str) {
        this.icon_url = str;
    }

    public void setId(String str) {
        this.f76948id = str;
    }

    public void setName(String str) {
        this.name = str;
    }
}
