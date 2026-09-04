package com.max.xiaoheihe.bean.game;

import androidx.compose.runtime.internal.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: GroupingPriceObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class GroupingPriceObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String deadline_timestamp;

    @e
    private String desc;

    @e
    private String price;

    public GroupingPriceObj(@e String str, @e String str2, @e String str3) {
        this.price = str;
        this.desc = str2;
        this.deadline_timestamp = str3;
    }

    public static /* synthetic */ GroupingPriceObj copy$default(GroupingPriceObj groupingPriceObj, String str, String str2, String str3, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{groupingPriceObj, str, str2, str3, new Integer(i10), obj}, null, changeQuickRedirect, true, 14894, new Class[]{GroupingPriceObj.class, String.class, String.class, String.class, Integer.TYPE, Object.class}, GroupingPriceObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (GroupingPriceObj) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            str = groupingPriceObj.price;
        }
        if ((i10 & 2) != 0) {
            str2 = groupingPriceObj.desc;
        }
        if ((i10 & 4) != 0) {
            str3 = groupingPriceObj.deadline_timestamp;
        }
        return groupingPriceObj.copy(str, str2, str3);
    }

    @e
    public final String component1() {
        return this.price;
    }

    @e
    public final String component2() {
        return this.desc;
    }

    @e
    public final String component3() {
        return this.deadline_timestamp;
    }

    @d
    public final GroupingPriceObj copy(@e String str, @e String str2, @e String str3) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2, str3}, this, changeQuickRedirect, false, 14893, new Class[]{String.class, String.class, String.class}, GroupingPriceObj.class);
        return patchProxyResultProxy.isSupported ? (GroupingPriceObj) patchProxyResultProxy.result : new GroupingPriceObj(str, str2, str3);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 14897, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupingPriceObj)) {
            return false;
        }
        GroupingPriceObj groupingPriceObj = (GroupingPriceObj) obj;
        return f0.g(this.price, groupingPriceObj.price) && f0.g(this.desc, groupingPriceObj.desc) && f0.g(this.deadline_timestamp, groupingPriceObj.deadline_timestamp);
    }

    @e
    public final String getDeadline_timestamp() {
        return this.deadline_timestamp;
    }

    @e
    public final String getDesc() {
        return this.desc;
    }

    @e
    public final String getPrice() {
        return this.price;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14896, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.price;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.desc;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.deadline_timestamp;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final void setDeadline_timestamp(@e String str) {
        this.deadline_timestamp = str;
    }

    public final void setDesc(@e String str) {
        this.desc = str;
    }

    public final void setPrice(@e String str) {
        this.price = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14895, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "GroupingPriceObj(price=" + this.price + ", desc=" + this.desc + ", deadline_timestamp=" + this.deadline_timestamp + ')';
    }
}
