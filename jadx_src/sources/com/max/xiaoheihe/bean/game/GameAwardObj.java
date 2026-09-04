package com.max.xiaoheihe.bean.game;

import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public class GameAwardObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 365162800716914513L;
    private String collection_id;
    private String desc;
    private String detail_name;
    private String prot;

    public String getCollection_id() {
        return this.collection_id;
    }

    public String getDesc() {
        return this.desc;
    }

    public String getDetail_name() {
        return this.detail_name;
    }

    public String getProt() {
        return this.prot;
    }

    public void setCollection_id(String str) {
        this.collection_id = str;
    }

    public void setDesc(String str) {
        this.desc = str;
    }

    public void setDetail_name(String str) {
        this.detail_name = str;
    }

    public void setProt(String str) {
        this.prot = str;
    }
}
