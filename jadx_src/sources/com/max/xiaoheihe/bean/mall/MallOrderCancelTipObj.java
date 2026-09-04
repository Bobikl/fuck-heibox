package com.max.xiaoheihe.bean.mall;

import androidx.compose.runtime.internal.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: MallOrderCancelTipObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class MallOrderCancelTipObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String count;

    @e
    private String discount;

    @e
    private String msg;

    @e
    private String protocol;

    @e
    private String title;

    @e
    private String type;

    public MallOrderCancelTipObj(@e String str, @e String str2, @e String str3, @e String str4, @e String str5, @e String str6) {
        this.type = str;
        this.msg = str2;
        this.title = str3;
        this.protocol = str4;
        this.count = str5;
        this.discount = str6;
    }

    public static /* synthetic */ MallOrderCancelTipObj copy$default(MallOrderCancelTipObj mallOrderCancelTipObj, String str, String str2, String str3, String str4, String str5, String str6, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{mallOrderCancelTipObj, str, str2, str3, str4, str5, str6, new Integer(i10), obj}, null, changeQuickRedirect, true, 15496, new Class[]{MallOrderCancelTipObj.class, String.class, String.class, String.class, String.class, String.class, String.class, Integer.TYPE, Object.class}, MallOrderCancelTipObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (MallOrderCancelTipObj) patchProxyResultProxy.result;
        }
        return mallOrderCancelTipObj.copy((i10 & 1) != 0 ? mallOrderCancelTipObj.type : str, (i10 & 2) != 0 ? mallOrderCancelTipObj.msg : str2, (i10 & 4) != 0 ? mallOrderCancelTipObj.title : str3, (i10 & 8) != 0 ? mallOrderCancelTipObj.protocol : str4, (i10 & 16) != 0 ? mallOrderCancelTipObj.count : str5, (i10 & 32) != 0 ? mallOrderCancelTipObj.discount : str6);
    }

    @e
    public final String component1() {
        return this.type;
    }

    @e
    public final String component2() {
        return this.msg;
    }

    @e
    public final String component3() {
        return this.title;
    }

    @e
    public final String component4() {
        return this.protocol;
    }

    @e
    public final String component5() {
        return this.count;
    }

    @e
    public final String component6() {
        return this.discount;
    }

    @d
    public final MallOrderCancelTipObj copy(@e String str, @e String str2, @e String str3, @e String str4, @e String str5, @e String str6) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2, str3, str4, str5, str6}, this, changeQuickRedirect, false, 15495, new Class[]{String.class, String.class, String.class, String.class, String.class, String.class}, MallOrderCancelTipObj.class);
        return patchProxyResultProxy.isSupported ? (MallOrderCancelTipObj) patchProxyResultProxy.result : new MallOrderCancelTipObj(str, str2, str3, str4, str5, str6);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 15499, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MallOrderCancelTipObj)) {
            return false;
        }
        MallOrderCancelTipObj mallOrderCancelTipObj = (MallOrderCancelTipObj) obj;
        return f0.g(this.type, mallOrderCancelTipObj.type) && f0.g(this.msg, mallOrderCancelTipObj.msg) && f0.g(this.title, mallOrderCancelTipObj.title) && f0.g(this.protocol, mallOrderCancelTipObj.protocol) && f0.g(this.count, mallOrderCancelTipObj.count) && f0.g(this.discount, mallOrderCancelTipObj.discount);
    }

    @e
    public final String getCount() {
        return this.count;
    }

    @e
    public final String getDiscount() {
        return this.discount;
    }

    @e
    public final String getMsg() {
        return this.msg;
    }

    @e
    public final String getProtocol() {
        return this.protocol;
    }

    @e
    public final String getTitle() {
        return this.title;
    }

    @e
    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15498, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.type;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.msg;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.title;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.protocol;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.count;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.discount;
        return iHashCode5 + (str6 != null ? str6.hashCode() : 0);
    }

    public final void setCount(@e String str) {
        this.count = str;
    }

    public final void setDiscount(@e String str) {
        this.discount = str;
    }

    public final void setMsg(@e String str) {
        this.msg = str;
    }

    public final void setProtocol(@e String str) {
        this.protocol = str;
    }

    public final void setTitle(@e String str) {
        this.title = str;
    }

    public final void setType(@e String str) {
        this.type = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15497, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "MallOrderCancelTipObj(type=" + this.type + ", msg=" + this.msg + ", title=" + this.title + ", protocol=" + this.protocol + ", count=" + this.count + ", discount=" + this.discount + ')';
    }
}
