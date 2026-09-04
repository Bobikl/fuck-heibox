package com.max.xiaoheihe.bean.game.gamedata;

import com.max.hbcommon.bean.KeyDescObj;
import com.meituan.robust.ChangeQuickRedirect;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class GameDataTrendInfoObj {
    public static ChangeQuickRedirect changeQuickRedirect;
    private List<KeyDescObj> attrs;
    private List<GameDataTrendObj> data;

    public List<KeyDescObj> getAttrs() {
        return this.attrs;
    }

    public List<GameDataTrendObj> getData() {
        return this.data;
    }

    public void setAttrs(List<KeyDescObj> list) {
        this.attrs = list;
    }

    public void setData(List<GameDataTrendObj> list) {
        this.data = list;
    }
}
