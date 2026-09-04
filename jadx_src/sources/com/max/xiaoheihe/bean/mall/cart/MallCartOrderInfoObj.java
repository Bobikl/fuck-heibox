package com.max.xiaoheihe.bean.mall.cart;

import androidx.compose.runtime.internal.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: MallCartOrderDetailObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class MallCartOrderInfoObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String create_time;

    @e
    private String h_src;

    @e
    private String order_id;

    @e
    private String pay_time;

    @e
    private String time_remaining;

    public MallCartOrderInfoObj(@e String str, @e String str2, @e String str3, @e String str4, @e String str5) {
        this.time_remaining = str;
        this.h_src = str2;
        this.order_id = str3;
        this.create_time = str4;
        this.pay_time = str5;
    }

    public static /* synthetic */ MallCartOrderInfoObj copy$default(MallCartOrderInfoObj mallCartOrderInfoObj, String str, String str2, String str3, String str4, String str5, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{mallCartOrderInfoObj, str, str2, str3, str4, str5, new Integer(i10), obj}, null, changeQuickRedirect, true, 15597, new Class[]{MallCartOrderInfoObj.class, String.class, String.class, String.class, String.class, String.class, Integer.TYPE, Object.class}, MallCartOrderInfoObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (MallCartOrderInfoObj) patchProxyResultProxy.result;
        }
        return mallCartOrderInfoObj.copy((i10 & 1) != 0 ? mallCartOrderInfoObj.time_remaining : str, (i10 & 2) != 0 ? mallCartOrderInfoObj.h_src : str2, (i10 & 4) != 0 ? mallCartOrderInfoObj.order_id : str3, (i10 & 8) != 0 ? mallCartOrderInfoObj.create_time : str4, (i10 & 16) != 0 ? mallCartOrderInfoObj.pay_time : str5);
    }

    @e
    public final String component1() {
        return this.time_remaining;
    }

    @e
    public final String component2() {
        return this.h_src;
    }

    @e
    public final String component3() {
        return this.order_id;
    }

    @e
    public final String component4() {
        return this.create_time;
    }

    @e
    public final String component5() {
        return this.pay_time;
    }

    @d
    public final MallCartOrderInfoObj copy(@e String str, @e String str2, @e String str3, @e String str4, @e String str5) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2, str3, str4, str5}, this, changeQuickRedirect, false, 15596, new Class[]{String.class, String.class, String.class, String.class, String.class}, MallCartOrderInfoObj.class);
        return patchProxyResultProxy.isSupported ? (MallCartOrderInfoObj) patchProxyResultProxy.result : new MallCartOrderInfoObj(str, str2, str3, str4, str5);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 15600, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MallCartOrderInfoObj)) {
            return false;
        }
        MallCartOrderInfoObj mallCartOrderInfoObj = (MallCartOrderInfoObj) obj;
        return f0.g(this.time_remaining, mallCartOrderInfoObj.time_remaining) && f0.g(this.h_src, mallCartOrderInfoObj.h_src) && f0.g(this.order_id, mallCartOrderInfoObj.order_id) && f0.g(this.create_time, mallCartOrderInfoObj.create_time) && f0.g(this.pay_time, mallCartOrderInfoObj.pay_time);
    }

    @e
    public final String getCreate_time() {
        return this.create_time;
    }

    @e
    public final String getH_src() {
        return this.h_src;
    }

    @e
    public final String getOrder_id() {
        return this.order_id;
    }

    @e
    public final String getPay_time() {
        return this.pay_time;
    }

    @e
    public final String getTime_remaining() {
        return this.time_remaining;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15599, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.time_remaining;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.h_src;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.order_id;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.create_time;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.pay_time;
        return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    public final void setCreate_time(@e String str) {
        this.create_time = str;
    }

    public final void setH_src(@e String str) {
        this.h_src = str;
    }

    public final void setOrder_id(@e String str) {
        this.order_id = str;
    }

    public final void setPay_time(@e String str) {
        this.pay_time = str;
    }

    public final void setTime_remaining(@e String str) {
        this.time_remaining = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15598, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "MallCartOrderInfoObj(time_remaining=" + this.time_remaining + ", h_src=" + this.h_src + ", order_id=" + this.order_id + ", create_time=" + this.create_time + ", pay_time=" + this.pay_time + ')';
    }
}
