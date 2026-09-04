package com.max.xiaoheihe.bean.game;

import com.max.hbcommon.bean.FiltersObj;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class GamePlatformPriceObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 2189174244787969514L;
    private List<FiltersObj> filters;
    private List<GameRegionPriceObj> list;
    private List<GamePlatformInfoObj> platforms;

    public List<FiltersObj> getFilters() {
        return this.filters;
    }

    public List<GameRegionPriceObj> getList() {
        return this.list;
    }

    public List<GamePlatformInfoObj> getPlatforms() {
        return this.platforms;
    }

    public void setFilters(List<FiltersObj> list) {
        this.filters = list;
    }

    public void setList(List<GameRegionPriceObj> list) {
        this.list = list;
    }

    public void setPlatforms(List<GamePlatformInfoObj> list) {
        this.platforms = list;
    }
}
