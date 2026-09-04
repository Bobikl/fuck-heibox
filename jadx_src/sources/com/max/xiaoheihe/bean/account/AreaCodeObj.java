package com.max.xiaoheihe.bean.account;

import com.meituan.robust.ChangeQuickRedirect;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class AreaCodeObj {
    public static ChangeQuickRedirect changeQuickRedirect;
    private String name;
    private List<String> value;

    public String getName() {
        return this.name;
    }

    public List<String> getValue() {
        return this.value;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setValue(List<String> list) {
        this.value = list;
    }
}
