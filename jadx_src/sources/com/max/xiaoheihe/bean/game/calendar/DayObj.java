package com.max.xiaoheihe.bean.game.calendar;

import androidx.compose.runtime.internal.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: DayObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class DayObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private ColorObj color_info;

    @e
    private String count;

    @e
    private String day_timestamp;

    public DayObj(@e String str, @e String str2, @e ColorObj colorObj) {
        this.day_timestamp = str;
        this.count = str2;
        this.color_info = colorObj;
    }

    public /* synthetic */ DayObj(String str, String str2, ColorObj colorObj, int i10, u uVar) {
        this(str, (i10 & 2) != 0 ? "" : str2, (i10 & 4) != 0 ? null : colorObj);
    }

    public static /* synthetic */ DayObj copy$default(DayObj dayObj, String str, String str2, ColorObj colorObj, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{dayObj, str, str2, colorObj, new Integer(i10), obj}, null, changeQuickRedirect, true, 15030, new Class[]{DayObj.class, String.class, String.class, ColorObj.class, Integer.TYPE, Object.class}, DayObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (DayObj) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            str = dayObj.day_timestamp;
        }
        if ((i10 & 2) != 0) {
            str2 = dayObj.count;
        }
        if ((i10 & 4) != 0) {
            colorObj = dayObj.color_info;
        }
        return dayObj.copy(str, str2, colorObj);
    }

    @e
    public final String component1() {
        return this.day_timestamp;
    }

    @e
    public final String component2() {
        return this.count;
    }

    @e
    public final ColorObj component3() {
        return this.color_info;
    }

    @d
    public final DayObj copy(@e String str, @e String str2, @e ColorObj colorObj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2, colorObj}, this, changeQuickRedirect, false, 15029, new Class[]{String.class, String.class, ColorObj.class}, DayObj.class);
        return patchProxyResultProxy.isSupported ? (DayObj) patchProxyResultProxy.result : new DayObj(str, str2, colorObj);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 15028, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (!(obj != null ? obj instanceof DayObj : true)) {
            return super.equals(obj);
        }
        DayObj dayObj = (DayObj) obj;
        return f0.g(this.day_timestamp, dayObj != null ? dayObj.day_timestamp : null);
    }

    @e
    public final ColorObj getColor_info() {
        return this.color_info;
    }

    @e
    public final String getCount() {
        return this.count;
    }

    @e
    public final String getDay_timestamp() {
        return this.day_timestamp;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15032, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.day_timestamp;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.count;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        ColorObj colorObj = this.color_info;
        return iHashCode2 + (colorObj != null ? colorObj.hashCode() : 0);
    }

    public final void setColor_info(@e ColorObj colorObj) {
        this.color_info = colorObj;
    }

    public final void setCount(@e String str) {
        this.count = str;
    }

    public final void setDay_timestamp(@e String str) {
        this.day_timestamp = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15031, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "DayObj(day_timestamp=" + this.day_timestamp + ", count=" + this.count + ", color_info=" + this.color_info + ')';
    }
}
