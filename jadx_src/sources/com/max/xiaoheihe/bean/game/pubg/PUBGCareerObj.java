package com.max.xiaoheihe.bean.game.pubg;

import com.max.hbcommon.bean.KeyDescObj;
import com.max.xiaoheihe.bean.game.GameGridDataCardObj;
import com.meituan.robust.ChangeQuickRedirect;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class PUBGCareerObj {
    public static ChangeQuickRedirect changeQuickRedirect;
    private List<GameGridDataCardObj> overview;
    private List<KeyDescObj> seasons;

    public List<GameGridDataCardObj> getOverview() {
        return this.overview;
    }

    public List<KeyDescObj> getSeasons() {
        return this.seasons;
    }

    public void setOverview(List<GameGridDataCardObj> list) {
        this.overview = list;
    }

    public void setSeasons(List<KeyDescObj> list) {
        this.seasons = list;
    }
}
