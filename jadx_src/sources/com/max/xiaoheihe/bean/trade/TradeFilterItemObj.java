package com.max.xiaoheihe.bean.trade;

import androidx.compose.runtime.internal.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: TradeFilterItemObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class TradeFilterItemObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @d
    private String desc;

    @e
    private String desc_in_hsv;

    @d
    private String img;

    @d
    private String value;

    public TradeFilterItemObj(@d String desc, @e String str, @d String value, @d String img) {
        f0.p(desc, "desc");
        f0.p(value, "value");
        f0.p(img, "img");
        this.desc = desc;
        this.desc_in_hsv = str;
        this.value = value;
        this.img = img;
    }

    public static /* synthetic */ TradeFilterItemObj copy$default(TradeFilterItemObj tradeFilterItemObj, String str, String str2, String str3, String str4, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{tradeFilterItemObj, str, str2, str3, str4, new Integer(i10), obj}, null, changeQuickRedirect, true, 16067, new Class[]{TradeFilterItemObj.class, String.class, String.class, String.class, String.class, Integer.TYPE, Object.class}, TradeFilterItemObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (TradeFilterItemObj) patchProxyResultProxy.result;
        }
        return tradeFilterItemObj.copy((i10 & 1) != 0 ? tradeFilterItemObj.desc : str, (i10 & 2) != 0 ? tradeFilterItemObj.desc_in_hsv : str2, (i10 & 4) != 0 ? tradeFilterItemObj.value : str3, (i10 & 8) != 0 ? tradeFilterItemObj.img : str4);
    }

    @d
    public final String component1() {
        return this.desc;
    }

    @e
    public final String component2() {
        return this.desc_in_hsv;
    }

    @d
    public final String component3() {
        return this.value;
    }

    @d
    public final String component4() {
        return this.img;
    }

    @d
    public final TradeFilterItemObj copy(@d String desc, @e String str, @d String value, @d String img) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{desc, str, value, img}, this, changeQuickRedirect, false, 16066, new Class[]{String.class, String.class, String.class, String.class}, TradeFilterItemObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (TradeFilterItemObj) patchProxyResultProxy.result;
        }
        f0.p(desc, "desc");
        f0.p(value, "value");
        f0.p(img, "img");
        return new TradeFilterItemObj(desc, str, value, img);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 16065, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!f0.g(TradeFilterItemObj.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        f0.n(obj, "null cannot be cast to non-null type com.max.xiaoheihe.bean.trade.TradeFilterItemObj");
        return f0.g(this.value, ((TradeFilterItemObj) obj).value);
    }

    @d
    public final String getDesc() {
        return this.desc;
    }

    @e
    public final String getDesc_in_hsv() {
        return this.desc_in_hsv;
    }

    @d
    public final String getImg() {
        return this.img;
    }

    @d
    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 16069, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        int iHashCode = this.desc.hashCode() * 31;
        String str = this.desc_in_hsv;
        return ((((iHashCode + (str != null ? str.hashCode() : 0)) * 31) + this.value.hashCode()) * 31) + this.img.hashCode();
    }

    public final void setDesc(@d String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 16062, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(str, "<set-?>");
        this.desc = str;
    }

    public final void setDesc_in_hsv(@e String str) {
        this.desc_in_hsv = str;
    }

    public final void setImg(@d String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 16064, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(str, "<set-?>");
        this.img = str;
    }

    public final void setValue(@d String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 16063, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(str, "<set-?>");
        this.value = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 16068, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "TradeFilterItemObj(desc=" + this.desc + ", desc_in_hsv=" + this.desc_in_hsv + ", value=" + this.value + ", img=" + this.img + ')';
    }
}
