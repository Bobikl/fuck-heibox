package com.max.xiaoheihe.bean.bbs;

import com.max.hbcommon.bean.KeyDescObj;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class SearchLinkResult implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = -8025507919468740739L;
    private List<BBSLinkObj> list;
    private List<KeyDescObj> sort_filter;

    public List<BBSLinkObj> getList() {
        return this.list;
    }

    public List<KeyDescObj> getSort_filter() {
        return this.sort_filter;
    }

    public void setList(List<BBSLinkObj> list) {
        this.list = list;
    }

    public void setSort_filter(List<KeyDescObj> list) {
        this.sort_filter = list;
    }
}
