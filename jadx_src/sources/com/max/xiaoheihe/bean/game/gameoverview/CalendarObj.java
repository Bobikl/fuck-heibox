package com.max.xiaoheihe.bean.game.gameoverview;

import androidx.compose.runtime.internal.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: CalendarObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class CalendarObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String count;

    @e
    private String count_color;

    @e
    private String date;

    @e
    private Boolean extra;

    @e
    private String lose_count;

    @e
    private String win_color;

    @e
    private String win_count;

    @e
    private String win_rate;

    public CalendarObj() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    public CalendarObj(@e String str, @e String str2, @e String str3, @e String str4, @e String str5, @e String str6, @e String str7, @e Boolean bool) {
        this.date = str;
        this.count_color = str2;
        this.win_color = str3;
        this.win_rate = str4;
        this.count = str5;
        this.win_count = str6;
        this.lose_count = str7;
        this.extra = bool;
    }

    public /* synthetic */ CalendarObj(String str, String str2, String str3, String str4, String str5, String str6, String str7, Boolean bool, int i10, u uVar) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : str3, (i10 & 8) != 0 ? null : str4, (i10 & 16) != 0 ? null : str5, (i10 & 32) != 0 ? null : str6, (i10 & 64) == 0 ? str7 : null, (i10 & 128) != 0 ? Boolean.FALSE : bool);
    }

    public static /* synthetic */ CalendarObj copy$default(CalendarObj calendarObj, String str, String str2, String str3, String str4, String str5, String str6, String str7, Boolean bool, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{calendarObj, str, str2, str3, str4, str5, str6, str7, bool, new Integer(i10), obj}, null, changeQuickRedirect, true, 15205, new Class[]{CalendarObj.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, Boolean.class, Integer.TYPE, Object.class}, CalendarObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (CalendarObj) patchProxyResultProxy.result;
        }
        return calendarObj.copy((i10 & 1) != 0 ? calendarObj.date : str, (i10 & 2) != 0 ? calendarObj.count_color : str2, (i10 & 4) != 0 ? calendarObj.win_color : str3, (i10 & 8) != 0 ? calendarObj.win_rate : str4, (i10 & 16) != 0 ? calendarObj.count : str5, (i10 & 32) != 0 ? calendarObj.win_count : str6, (i10 & 64) != 0 ? calendarObj.lose_count : str7, (i10 & 128) != 0 ? calendarObj.extra : bool);
    }

    @e
    public final String component1() {
        return this.date;
    }

    @e
    public final String component2() {
        return this.count_color;
    }

    @e
    public final String component3() {
        return this.win_color;
    }

    @e
    public final String component4() {
        return this.win_rate;
    }

    @e
    public final String component5() {
        return this.count;
    }

    @e
    public final String component6() {
        return this.win_count;
    }

    @e
    public final String component7() {
        return this.lose_count;
    }

    @e
    public final Boolean component8() {
        return this.extra;
    }

    @d
    public final CalendarObj copy(@e String str, @e String str2, @e String str3, @e String str4, @e String str5, @e String str6, @e String str7, @e Boolean bool) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2, str3, str4, str5, str6, str7, bool}, this, changeQuickRedirect, false, 15204, new Class[]{String.class, String.class, String.class, String.class, String.class, String.class, String.class, Boolean.class}, CalendarObj.class);
        return patchProxyResultProxy.isSupported ? (CalendarObj) patchProxyResultProxy.result : new CalendarObj(str, str2, str3, str4, str5, str6, str7, bool);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 15208, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CalendarObj)) {
            return false;
        }
        CalendarObj calendarObj = (CalendarObj) obj;
        return f0.g(this.date, calendarObj.date) && f0.g(this.count_color, calendarObj.count_color) && f0.g(this.win_color, calendarObj.win_color) && f0.g(this.win_rate, calendarObj.win_rate) && f0.g(this.count, calendarObj.count) && f0.g(this.win_count, calendarObj.win_count) && f0.g(this.lose_count, calendarObj.lose_count) && f0.g(this.extra, calendarObj.extra);
    }

    @e
    public final String getCount() {
        return this.count;
    }

    @e
    public final String getCount_color() {
        return this.count_color;
    }

    @e
    public final String getDate() {
        return this.date;
    }

    @e
    public final Boolean getExtra() {
        return this.extra;
    }

    @e
    public final String getLose_count() {
        return this.lose_count;
    }

    @e
    public final String getWin_color() {
        return this.win_color;
    }

    @e
    public final String getWin_count() {
        return this.win_count;
    }

    @e
    public final String getWin_rate() {
        return this.win_rate;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15207, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.date;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.count_color;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.win_color;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.win_rate;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.count;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.win_count;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.lose_count;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Boolean bool = this.extra;
        return iHashCode7 + (bool != null ? bool.hashCode() : 0);
    }

    public final void setCount(@e String str) {
        this.count = str;
    }

    public final void setCount_color(@e String str) {
        this.count_color = str;
    }

    public final void setDate(@e String str) {
        this.date = str;
    }

    public final void setExtra(@e Boolean bool) {
        this.extra = bool;
    }

    public final void setLose_count(@e String str) {
        this.lose_count = str;
    }

    public final void setWin_color(@e String str) {
        this.win_color = str;
    }

    public final void setWin_count(@e String str) {
        this.win_count = str;
    }

    public final void setWin_rate(@e String str) {
        this.win_rate = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15206, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "CalendarObj(date=" + this.date + ", count_color=" + this.count_color + ", win_color=" + this.win_color + ", win_rate=" + this.win_rate + ", count=" + this.count + ", win_count=" + this.win_count + ", lose_count=" + this.lose_count + ", extra=" + this.extra + ')';
    }
}
