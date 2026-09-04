package com.max.xiaoheihe.bean.game;

import com.max.hbcommon.bean.KeyDescObj;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class GameGlobalPricesObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 6431365352390835362L;
    private List<GlobalRegionPriceObj> prices;
    private ArrayList<KeyDescObj> versions;

    public List<GlobalRegionPriceObj> getPrices() {
        return this.prices;
    }

    public ArrayList<KeyDescObj> getVersions() {
        return this.versions;
    }

    public void setPrices(List<GlobalRegionPriceObj> list) {
        this.prices = list;
    }

    public void setVersions(ArrayList<KeyDescObj> arrayList) {
        this.versions = arrayList;
    }
}
