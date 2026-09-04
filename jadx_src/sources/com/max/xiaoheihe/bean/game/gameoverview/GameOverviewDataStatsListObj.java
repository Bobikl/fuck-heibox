package com.max.xiaoheihe.bean.game.gameoverview;

import androidx.compose.runtime.internal.o;
import com.alibaba.fastjson.annotation.JSONField;
import com.google.gson.annotations.SerializedName;
import com.max.hbcommon.bean.KeyDescObj;
import com.meituan.robust.ChangeQuickRedirect;
import dl.e;
import java.util.List;

/* JADX INFO: compiled from: GameOverviewDataStatsListObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class GameOverviewDataStatsListObj extends BaseGameOverviewObj {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @SerializedName(alternate = {"recent_stats_list", "all_stats_list"}, value = "data_list")
    @e
    @JSONField(alternateNames = {"recent_stats_list", "all_stats_list"}, name = "data_list")
    private List<KeyDescObj> data_list;

    @e
    private Boolean isExpend = Boolean.FALSE;

    @e
    public final List<KeyDescObj> getData_list() {
        return this.data_list;
    }

    @e
    public final Boolean isExpend() {
        return this.isExpend;
    }

    public final void setData_list(@e List<KeyDescObj> list) {
        this.data_list = list;
    }

    public final void setExpend(@e Boolean bool) {
        this.isExpend = bool;
    }
}
