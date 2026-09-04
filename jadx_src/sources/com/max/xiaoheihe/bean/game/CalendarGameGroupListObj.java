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

/* JADX INFO: compiled from: CalendarGameGroupListObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class CalendarGameGroupListObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private List<CalendarGameGroupObj> grouped_game_list;

    public CalendarGameGroupListObj(@e List<CalendarGameGroupObj> list) {
        this.grouped_game_list = list;
    }

    public static /* synthetic */ CalendarGameGroupListObj copy$default(CalendarGameGroupListObj calendarGameGroupListObj, List list, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{calendarGameGroupListObj, list, new Integer(i10), obj}, null, changeQuickRedirect, true, 14637, new Class[]{CalendarGameGroupListObj.class, List.class, Integer.TYPE, Object.class}, CalendarGameGroupListObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (CalendarGameGroupListObj) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            list = calendarGameGroupListObj.grouped_game_list;
        }
        return calendarGameGroupListObj.copy(list);
    }

    @e
    public final List<CalendarGameGroupObj> component1() {
        return this.grouped_game_list;
    }

    @d
    public final CalendarGameGroupListObj copy(@e List<CalendarGameGroupObj> list) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, 14636, new Class[]{List.class}, CalendarGameGroupListObj.class);
        return patchProxyResultProxy.isSupported ? (CalendarGameGroupListObj) patchProxyResultProxy.result : new CalendarGameGroupListObj(list);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 14640, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        return (obj instanceof CalendarGameGroupListObj) && f0.g(this.grouped_game_list, ((CalendarGameGroupListObj) obj).grouped_game_list);
    }

    @e
    public final List<CalendarGameGroupObj> getGrouped_game_list() {
        return this.grouped_game_list;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14639, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        List<CalendarGameGroupObj> list = this.grouped_game_list;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final void setGrouped_game_list(@e List<CalendarGameGroupObj> list) {
        this.grouped_game_list = list;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14638, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "CalendarGameGroupListObj(grouped_game_list=" + this.grouped_game_list + ')';
    }
}
