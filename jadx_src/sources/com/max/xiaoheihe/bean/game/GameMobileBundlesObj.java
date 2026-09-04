package com.max.xiaoheihe.bean.game;

import com.max.xiaoheihe.bean.bbs.TopicNavObj;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class GameMobileBundlesObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 2388659311286653520L;
    private List<GameMobileBundlesCategoryObj> all_list;
    private List<TopicNavObj> header;

    public List<GameMobileBundlesCategoryObj> getAll_list() {
        return this.all_list;
    }

    public List<TopicNavObj> getHeader() {
        return this.header;
    }

    public void setAll_list(List<GameMobileBundlesCategoryObj> list) {
        this.all_list = list;
    }

    public void setHeader(List<TopicNavObj> list) {
        this.header = list;
    }
}
