package com.max.xiaoheihe.bean.game.gameoverview;

import androidx.compose.runtime.internal.o;
import com.meituan.robust.ChangeQuickRedirect;
import dl.e;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: compiled from: GameOverviewCalendarListListObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class GameOverviewCalendarListListObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private List<GameOverviewCalendarListObj> calendar;

    @e
    private GameOverviewHeaderInfoObj header_info;

    @e
    private String title;

    @e
    public final List<GameOverviewCalendarListObj> getCalendar() {
        return this.calendar;
    }

    @e
    public final GameOverviewHeaderInfoObj getHeader_info() {
        return this.header_info;
    }

    @e
    public final String getTitle() {
        return this.title;
    }

    public final void setCalendar(@e List<GameOverviewCalendarListObj> list) {
        this.calendar = list;
    }

    public final void setHeader_info(@e GameOverviewHeaderInfoObj gameOverviewHeaderInfoObj) {
        this.header_info = gameOverviewHeaderInfoObj;
    }

    public final void setTitle(@e String str) {
        this.title = str;
    }
}
