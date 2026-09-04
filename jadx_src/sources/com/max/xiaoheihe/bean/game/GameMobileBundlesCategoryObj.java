package com.max.xiaoheihe.bean.game;

import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class GameMobileBundlesCategoryObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 1729341187750490306L;
    private String has_more;
    private List<GameMobileBundleObj> list;
    private String sort_type;
    private String title;

    public String getHas_more() {
        return this.has_more;
    }

    public List<GameMobileBundleObj> getList() {
        return this.list;
    }

    public String getSort_type() {
        return this.sort_type;
    }

    public String getTitle() {
        return this.title;
    }

    public void setHas_more(String str) {
        this.has_more = str;
    }

    public void setList(List<GameMobileBundleObj> list) {
        this.list = list;
    }

    public void setSort_type(String str) {
        this.sort_type = str;
    }

    public void setTitle(String str) {
        this.title = str;
    }
}
