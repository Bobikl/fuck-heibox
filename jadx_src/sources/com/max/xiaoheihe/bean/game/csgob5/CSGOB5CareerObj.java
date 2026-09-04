package com.max.xiaoheihe.bean.game.csgob5;

import com.max.hbcommon.bean.KeyDescObj;
import com.meituan.robust.ChangeQuickRedirect;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class CSGOB5CareerObj {
    public static ChangeQuickRedirect changeQuickRedirect;
    private List<KeyDescObj> header;
    private List<KeyDescObj> overview;

    public List<KeyDescObj> getHeader() {
        return this.header;
    }

    public List<KeyDescObj> getOverview() {
        return this.overview;
    }

    public void setHeader(List<KeyDescObj> list) {
        this.header = list;
    }

    public void setOverview(List<KeyDescObj> list) {
        this.overview = list;
    }
}
