package com.max.xiaoheihe.bean.game;

import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class GameBindInfoObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    private List<BindInfoObj> bind_infos;

    public List<BindInfoObj> getBind_infos() {
        return this.bind_infos;
    }

    public void setBind_infos(List<BindInfoObj> list) {
        this.bind_infos = list;
    }
}
