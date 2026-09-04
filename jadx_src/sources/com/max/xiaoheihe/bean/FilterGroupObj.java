package com.max.xiaoheihe.bean;

import com.max.hbcommon.bean.FiltersObj;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class FilterGroupObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 8685104427117705240L;
    private List<FiltersObj> groups;
    private String key;

    public List<FiltersObj> getGroups() {
        return this.groups;
    }

    public String getKey() {
        return this.key;
    }

    public void setGroups(List<FiltersObj> list) {
        this.groups = list;
    }

    public void setKey(String str) {
        this.key = str;
    }
}
