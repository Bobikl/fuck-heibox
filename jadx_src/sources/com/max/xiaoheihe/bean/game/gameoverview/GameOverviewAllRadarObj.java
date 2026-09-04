package com.max.xiaoheihe.bean.game.gameoverview;

import androidx.compose.runtime.internal.o;
import com.meituan.robust.ChangeQuickRedirect;
import dl.e;
import java.util.List;

/* JADX INFO: compiled from: GameOverviewAllRadarObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class GameOverviewAllRadarObj extends BaseGameOverviewObj {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private List<Dota2RadarListObj> radar_list;
    private int selectIndex;

    @e
    private String title;

    @e
    public final List<Dota2RadarListObj> getRadar_list() {
        return this.radar_list;
    }

    public final int getSelectIndex() {
        return this.selectIndex;
    }

    @e
    public final String getTitle() {
        return this.title;
    }

    public final void setRadar_list(@e List<Dota2RadarListObj> list) {
        this.radar_list = list;
    }

    public final void setSelectIndex(int i10) {
        this.selectIndex = i10;
    }

    public final void setTitle(@e String str) {
        this.title = str;
    }
}
