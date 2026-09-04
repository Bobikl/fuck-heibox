package com.max.xiaoheihe.bean.game;

import com.max.hbcommon.bean.KeyDescObj;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class GameMobileSubscribeAwardObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    private List<KeyDescObj> list;
    private String reached;

    public List<KeyDescObj> getList() {
        return this.list;
    }

    public String getReached() {
        return this.reached;
    }

    public void setList(List<KeyDescObj> list) {
        this.list = list;
    }

    public void setReached(String str) {
        this.reached = str;
    }
}
