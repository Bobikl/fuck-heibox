package com.max.xiaoheihe.bean.game.gameoverview;

import androidx.compose.runtime.internal.o;
import com.max.hbcommon.bean.AdsBannerObj;
import com.meituan.robust.ChangeQuickRedirect;
import dl.e;
import java.util.List;

/* JADX INFO: compiled from: GameOverviewBannerObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class GameOverviewBannerObj extends BaseGameOverviewObj {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private List<AdsBannerObj> ad_list;

    @e
    public final List<AdsBannerObj> getAd_list() {
        return this.ad_list;
    }

    public final void setAd_list(@e List<AdsBannerObj> list) {
        this.ad_list = list;
    }
}
