package com.max.xiaoheihe.bean.game;

import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public class GameMobileBundleTitleObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 8105964481638732341L;
    private String desc;
    private String key;
    private String more;

    public String getDesc() {
        return this.desc;
    }

    public String getKey() {
        return this.key;
    }

    public String getMore() {
        return this.more;
    }

    public void setDesc(String str) {
        this.desc = str;
    }

    public void setKey(String str) {
        this.key = str;
    }

    public void setMore(String str) {
        this.more = str;
    }
}
