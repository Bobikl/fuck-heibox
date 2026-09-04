package com.max.xiaoheihe.bean;

import com.max.hbcustomview.indexbar.bean.BaseIndexPinyinBean;
import com.meituan.robust.ChangeQuickRedirect;

/* JADX INFO: loaded from: classes3.dex */
public class AreaCodeItemObj extends BaseIndexPinyinBean {
    public static ChangeQuickRedirect changeQuickRedirect;
    private String index;
    private String name;

    public String getName() {
        return this.name;
    }

    @Override // com.max.hbcustomview.indexbar.a
    public String getTarget() {
        return this.index;
    }

    public void setIndex(String str) {
        this.index = str;
    }

    public void setName(String str) {
        this.name = str;
    }
}
