package com.max.xiaoheihe.bean.game.gameoverview;

import androidx.compose.runtime.internal.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: ConsecutiveInfoObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class ConsecutiveInfoObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String consecutive_color;

    @e
    private String consecutive_desc;

    @e
    private String consecutive_icon;

    @e
    private String consecutive_num;

    public ConsecutiveInfoObj(@e String str, @e String str2, @e String str3, @e String str4) {
        this.consecutive_num = str;
        this.consecutive_desc = str2;
        this.consecutive_icon = str3;
        this.consecutive_color = str4;
    }

    public static /* synthetic */ ConsecutiveInfoObj copy$default(ConsecutiveInfoObj consecutiveInfoObj, String str, String str2, String str3, String str4, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{consecutiveInfoObj, str, str2, str3, str4, new Integer(i10), obj}, null, changeQuickRedirect, true, 15215, new Class[]{ConsecutiveInfoObj.class, String.class, String.class, String.class, String.class, Integer.TYPE, Object.class}, ConsecutiveInfoObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (ConsecutiveInfoObj) patchProxyResultProxy.result;
        }
        return consecutiveInfoObj.copy((i10 & 1) != 0 ? consecutiveInfoObj.consecutive_num : str, (i10 & 2) != 0 ? consecutiveInfoObj.consecutive_desc : str2, (i10 & 4) != 0 ? consecutiveInfoObj.consecutive_icon : str3, (i10 & 8) != 0 ? consecutiveInfoObj.consecutive_color : str4);
    }

    @e
    public final String component1() {
        return this.consecutive_num;
    }

    @e
    public final String component2() {
        return this.consecutive_desc;
    }

    @e
    public final String component3() {
        return this.consecutive_icon;
    }

    @e
    public final String component4() {
        return this.consecutive_color;
    }

    @d
    public final ConsecutiveInfoObj copy(@e String str, @e String str2, @e String str3, @e String str4) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2, str3, str4}, this, changeQuickRedirect, false, 15214, new Class[]{String.class, String.class, String.class, String.class}, ConsecutiveInfoObj.class);
        return patchProxyResultProxy.isSupported ? (ConsecutiveInfoObj) patchProxyResultProxy.result : new ConsecutiveInfoObj(str, str2, str3, str4);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 15218, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ConsecutiveInfoObj)) {
            return false;
        }
        ConsecutiveInfoObj consecutiveInfoObj = (ConsecutiveInfoObj) obj;
        return f0.g(this.consecutive_num, consecutiveInfoObj.consecutive_num) && f0.g(this.consecutive_desc, consecutiveInfoObj.consecutive_desc) && f0.g(this.consecutive_icon, consecutiveInfoObj.consecutive_icon) && f0.g(this.consecutive_color, consecutiveInfoObj.consecutive_color);
    }

    @e
    public final String getConsecutive_color() {
        return this.consecutive_color;
    }

    @e
    public final String getConsecutive_desc() {
        return this.consecutive_desc;
    }

    @e
    public final String getConsecutive_icon() {
        return this.consecutive_icon;
    }

    @e
    public final String getConsecutive_num() {
        return this.consecutive_num;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15217, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.consecutive_num;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.consecutive_desc;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.consecutive_icon;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.consecutive_color;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public final void setConsecutive_color(@e String str) {
        this.consecutive_color = str;
    }

    public final void setConsecutive_desc(@e String str) {
        this.consecutive_desc = str;
    }

    public final void setConsecutive_icon(@e String str) {
        this.consecutive_icon = str;
    }

    public final void setConsecutive_num(@e String str) {
        this.consecutive_num = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15216, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "ConsecutiveInfoObj(consecutive_num=" + this.consecutive_num + ", consecutive_desc=" + this.consecutive_desc + ", consecutive_icon=" + this.consecutive_icon + ", consecutive_color=" + this.consecutive_color + ')';
    }
}
