package com.max.xiaoheihe.bean.game;

import androidx.compose.runtime.internal.o;
import com.max.xiaoheihe.bean.game.calendar.GameEventCountDownObj;
import com.max.xiaoheihe.bean.game.calendar.MonthObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: CalendarGameCountObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class CalendarGameCountObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private List<MonthObj> count_by_month;

    @e
    private GameEventCountDownObj event_countdown;

    public CalendarGameCountObj(@e List<MonthObj> list, @e GameEventCountDownObj gameEventCountDownObj) {
        this.count_by_month = list;
        this.event_countdown = gameEventCountDownObj;
    }

    public /* synthetic */ CalendarGameCountObj(List list, GameEventCountDownObj gameEventCountDownObj, int i10, u uVar) {
        this((i10 & 1) != 0 ? null : list, gameEventCountDownObj);
    }

    public static /* synthetic */ CalendarGameCountObj copy$default(CalendarGameCountObj calendarGameCountObj, List list, GameEventCountDownObj gameEventCountDownObj, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{calendarGameCountObj, list, gameEventCountDownObj, new Integer(i10), obj}, null, changeQuickRedirect, true, 14632, new Class[]{CalendarGameCountObj.class, List.class, GameEventCountDownObj.class, Integer.TYPE, Object.class}, CalendarGameCountObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (CalendarGameCountObj) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            list = calendarGameCountObj.count_by_month;
        }
        if ((i10 & 2) != 0) {
            gameEventCountDownObj = calendarGameCountObj.event_countdown;
        }
        return calendarGameCountObj.copy(list, gameEventCountDownObj);
    }

    @e
    public final List<MonthObj> component1() {
        return this.count_by_month;
    }

    @e
    public final GameEventCountDownObj component2() {
        return this.event_countdown;
    }

    @d
    public final CalendarGameCountObj copy(@e List<MonthObj> list, @e GameEventCountDownObj gameEventCountDownObj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{list, gameEventCountDownObj}, this, changeQuickRedirect, false, 14631, new Class[]{List.class, GameEventCountDownObj.class}, CalendarGameCountObj.class);
        return patchProxyResultProxy.isSupported ? (CalendarGameCountObj) patchProxyResultProxy.result : new CalendarGameCountObj(list, gameEventCountDownObj);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 14635, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CalendarGameCountObj)) {
            return false;
        }
        CalendarGameCountObj calendarGameCountObj = (CalendarGameCountObj) obj;
        return f0.g(this.count_by_month, calendarGameCountObj.count_by_month) && f0.g(this.event_countdown, calendarGameCountObj.event_countdown);
    }

    @e
    public final List<MonthObj> getCount_by_month() {
        return this.count_by_month;
    }

    @e
    public final GameEventCountDownObj getEvent_countdown() {
        return this.event_countdown;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14634, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        List<MonthObj> list = this.count_by_month;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        GameEventCountDownObj gameEventCountDownObj = this.event_countdown;
        return iHashCode + (gameEventCountDownObj != null ? gameEventCountDownObj.hashCode() : 0);
    }

    public final void setCount_by_month(@e List<MonthObj> list) {
        this.count_by_month = list;
    }

    public final void setEvent_countdown(@e GameEventCountDownObj gameEventCountDownObj) {
        this.event_countdown = gameEventCountDownObj;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14633, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "CalendarGameCountObj(count_by_month=" + this.count_by_month + ", event_countdown=" + this.event_countdown + ')';
    }
}
