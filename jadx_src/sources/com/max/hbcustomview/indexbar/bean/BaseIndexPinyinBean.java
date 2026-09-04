package com.max.hbcustomview.indexbar.bean;

import com.max.hbcustomview.indexbar.a;
import com.meituan.robust.ChangeQuickRedirect;

/* JADX INFO: loaded from: classes10.dex */
public abstract class BaseIndexPinyinBean extends BaseIndexTagBean implements a {
    public static ChangeQuickRedirect changeQuickRedirect;
    private String pyCity;

    public String getPyCity() {
        return this.pyCity;
    }

    public void setPyCity(String str) {
        this.pyCity = str;
    }
}
