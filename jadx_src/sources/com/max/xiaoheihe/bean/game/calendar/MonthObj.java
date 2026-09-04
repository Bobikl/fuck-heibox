package com.max.xiaoheihe.bean.game.calendar;

import androidx.compose.runtime.internal.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: MonthObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class MonthObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private List<DayObj> count_by_day;

    @e
    private String month_timestamp;

    public MonthObj(@e String str, @e List<DayObj> list) {
        this.month_timestamp = str;
        this.count_by_day = list;
    }

    public static /* synthetic */ MonthObj copy$default(MonthObj monthObj, String str, List list, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{monthObj, str, list, new Integer(i10), obj}, null, changeQuickRedirect, true, 15050, new Class[]{MonthObj.class, String.class, List.class, Integer.TYPE, Object.class}, MonthObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (MonthObj) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            str = monthObj.month_timestamp;
        }
        if ((i10 & 2) != 0) {
            list = monthObj.count_by_day;
        }
        return monthObj.copy(str, list);
    }

    @e
    public final String component1() {
        return this.month_timestamp;
    }

    @e
    public final List<DayObj> component2() {
        return this.count_by_day;
    }

    @d
    public final MonthObj copy(@e String str, @e List<DayObj> list) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, list}, this, changeQuickRedirect, false, 15049, new Class[]{String.class, List.class}, MonthObj.class);
        return patchProxyResultProxy.isSupported ? (MonthObj) patchProxyResultProxy.result : new MonthObj(str, list);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 15053, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MonthObj)) {
            return false;
        }
        MonthObj monthObj = (MonthObj) obj;
        return f0.g(this.month_timestamp, monthObj.month_timestamp) && f0.g(this.count_by_day, monthObj.count_by_day);
    }

    @e
    public final List<DayObj> getCount_by_day() {
        return this.count_by_day;
    }

    @e
    public final String getMonth_timestamp() {
        return this.month_timestamp;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15052, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.month_timestamp;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<DayObj> list = this.count_by_day;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public final void setCount_by_day(@e List<DayObj> list) {
        this.count_by_day = list;
    }

    public final void setMonth_timestamp(@e String str) {
        this.month_timestamp = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15051, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "MonthObj(month_timestamp=" + this.month_timestamp + ", count_by_day=" + this.count_by_day + ')';
    }
}
