package com.max.xiaoheihe.bean.game;

import androidx.compose.runtime.internal.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: CalendarGameGroupObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class CalendarGameGroupObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String day_timestamp;

    @e
    private List<GamePublishBaseObj> game_list;

    @e
    private String group_name;

    @e
    private String month_timestamp;

    public CalendarGameGroupObj(@e String str, @e String str2, @e String str3, @e List<GamePublishBaseObj> list) {
        this.month_timestamp = str;
        this.day_timestamp = str2;
        this.group_name = str3;
        this.game_list = list;
    }

    public static /* synthetic */ CalendarGameGroupObj copy$default(CalendarGameGroupObj calendarGameGroupObj, String str, String str2, String str3, List list, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{calendarGameGroupObj, str, str2, str3, list, new Integer(i10), obj}, null, changeQuickRedirect, true, 14642, new Class[]{CalendarGameGroupObj.class, String.class, String.class, String.class, List.class, Integer.TYPE, Object.class}, CalendarGameGroupObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (CalendarGameGroupObj) patchProxyResultProxy.result;
        }
        return calendarGameGroupObj.copy((i10 & 1) != 0 ? calendarGameGroupObj.month_timestamp : str, (i10 & 2) != 0 ? calendarGameGroupObj.day_timestamp : str2, (i10 & 4) != 0 ? calendarGameGroupObj.group_name : str3, (i10 & 8) != 0 ? calendarGameGroupObj.game_list : list);
    }

    @e
    public final String component1() {
        return this.month_timestamp;
    }

    @e
    public final String component2() {
        return this.day_timestamp;
    }

    @e
    public final String component3() {
        return this.group_name;
    }

    @e
    public final List<GamePublishBaseObj> component4() {
        return this.game_list;
    }

    @d
    public final CalendarGameGroupObj copy(@e String str, @e String str2, @e String str3, @e List<GamePublishBaseObj> list) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2, str3, list}, this, changeQuickRedirect, false, 14641, new Class[]{String.class, String.class, String.class, List.class}, CalendarGameGroupObj.class);
        return patchProxyResultProxy.isSupported ? (CalendarGameGroupObj) patchProxyResultProxy.result : new CalendarGameGroupObj(str, str2, str3, list);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 14645, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CalendarGameGroupObj)) {
            return false;
        }
        CalendarGameGroupObj calendarGameGroupObj = (CalendarGameGroupObj) obj;
        return f0.g(this.month_timestamp, calendarGameGroupObj.month_timestamp) && f0.g(this.day_timestamp, calendarGameGroupObj.day_timestamp) && f0.g(this.group_name, calendarGameGroupObj.group_name) && f0.g(this.game_list, calendarGameGroupObj.game_list);
    }

    @e
    public final String getDay_timestamp() {
        return this.day_timestamp;
    }

    @e
    public final List<GamePublishBaseObj> getGame_list() {
        return this.game_list;
    }

    @e
    public final String getGroup_name() {
        return this.group_name;
    }

    @e
    public final String getMonth_timestamp() {
        return this.month_timestamp;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14644, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.month_timestamp;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.day_timestamp;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.group_name;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List<GamePublishBaseObj> list = this.game_list;
        return iHashCode3 + (list != null ? list.hashCode() : 0);
    }

    public final void setDay_timestamp(@e String str) {
        this.day_timestamp = str;
    }

    public final void setGame_list(@e List<GamePublishBaseObj> list) {
        this.game_list = list;
    }

    public final void setGroup_name(@e String str) {
        this.group_name = str;
    }

    public final void setMonth_timestamp(@e String str) {
        this.month_timestamp = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14643, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "CalendarGameGroupObj(month_timestamp=" + this.month_timestamp + ", day_timestamp=" + this.day_timestamp + ", group_name=" + this.group_name + ", game_list=" + this.game_list + ')';
    }
}
