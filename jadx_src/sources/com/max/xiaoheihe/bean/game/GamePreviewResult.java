package com.max.xiaoheihe.bean.game;

import com.max.hbcommon.bean.FiltersObj;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class GamePreviewResult implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 1875276758262925083L;
    private List<FiltersObj> filters;
    private List<GamePreviewObj> games;

    public List<FiltersObj> getFilters() {
        return this.filters;
    }

    public List<GamePreviewObj> getGames() {
        return this.games;
    }

    public void setFilters(List<FiltersObj> list) {
        this.filters = list;
    }

    public void setGames(List<GamePreviewObj> list) {
        this.games = list;
    }
}
