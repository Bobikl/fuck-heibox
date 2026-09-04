package com.max.xiaoheihe.bean;

import com.max.hbcommon.bean.KeyDescObj;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class MenusObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    private String key;
    private List<KeyDescObj> menu;

    public String getKey() {
        return this.key;
    }

    public List<KeyDescObj> getMenu() {
        return this.menu;
    }

    public void setKey(String str) {
        this.key = str;
    }

    public void setMenu(List<KeyDescObj> list) {
        this.menu = list;
    }
}
