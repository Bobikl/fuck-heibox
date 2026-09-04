package com.max.xiaoheihe.bean.game.gameoverview;

import androidx.compose.runtime.internal.o;
import com.alibaba.fastjson.annotation.JSONField;
import com.google.gson.annotations.SerializedName;
import com.max.xiaoheihe.bean.game.dota2.Dota2ChartObj;
import com.meituan.robust.ChangeQuickRedirect;
import dl.e;
import java.util.List;

/* JADX INFO: compiled from: GameOverviewChartObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class GameOverviewChartObj extends BaseGameOverviewObj {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @SerializedName(alternate = {"mmr_changes"}, value = "list")
    @e
    @JSONField(alternateNames = {"mmr_changes"}, name = "list")
    private List<Dota2ChartObj> list;

    @e
    private String msg;

    @e
    private String title;

    @e
    public final List<Dota2ChartObj> getList() {
        return this.list;
    }

    @e
    public final String getMsg() {
        return this.msg;
    }

    @e
    public final String getTitle() {
        return this.title;
    }

    public final void setList(@e List<Dota2ChartObj> list) {
        this.list = list;
    }

    public final void setMsg(@e String str) {
        this.msg = str;
    }

    public final void setTitle(@e String str) {
        this.title = str;
    }
}
