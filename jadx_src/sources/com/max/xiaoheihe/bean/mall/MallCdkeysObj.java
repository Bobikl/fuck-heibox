package com.max.xiaoheihe.bean.mall;

import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class MallCdkeysObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 6068987150467569599L;
    private String count;
    private List<String> keys;

    public String getCount() {
        return this.count;
    }

    public List<String> getKeys() {
        return this.keys;
    }

    public void setCount(String str) {
        this.count = str;
    }

    public void setKeys(List<String> list) {
        this.keys = list;
    }
}
