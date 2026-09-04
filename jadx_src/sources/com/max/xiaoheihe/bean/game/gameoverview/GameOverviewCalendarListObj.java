package com.max.xiaoheihe.bean.game.gameoverview;

import androidx.compose.runtime.internal.o;
import com.alibaba.fastjson.annotation.JSONField;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import dl.e;
import java.util.List;

/* JADX INFO: compiled from: GameOverviewCalendarListObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class GameOverviewCalendarListObj extends BaseGameOverviewObj {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @SerializedName(alternate = {"data"}, value = "calendar")
    @e
    @JSONField(alternateNames = {"data"}, name = "calendar")
    private List<CalendarObj> calendar;

    @e
    private String title;

    @e
    private Boolean win = Boolean.FALSE;

    @e
    public final List<CalendarObj> getCalendar() {
        return this.calendar;
    }

    @e
    public final String getTitle() {
        return this.title;
    }

    @e
    public final Boolean getWin() {
        return this.win;
    }

    public final void setCalendar(@e List<CalendarObj> list) {
        this.calendar = list;
    }

    public final void setTitle(@e String str) {
        this.title = str;
    }

    public final void setWin(@e Boolean bool) {
        this.win = bool;
    }
}
