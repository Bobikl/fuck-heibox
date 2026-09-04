package com.max.xiaoheihe.bean.trade;

import androidx.compose.runtime.internal.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: TradeSaleSettingsObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class TradeSaleSettingsObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String auto_sale_setting;

    @e
    private String auto_start;

    @e
    private String auto_stop;

    @e
    private String sale_setting;

    public TradeSaleSettingsObj(@e String str, @e String str2, @e String str3, @e String str4) {
        this.sale_setting = str;
        this.auto_sale_setting = str2;
        this.auto_start = str3;
        this.auto_stop = str4;
    }

    public static /* synthetic */ TradeSaleSettingsObj copy$default(TradeSaleSettingsObj tradeSaleSettingsObj, String str, String str2, String str3, String str4, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{tradeSaleSettingsObj, str, str2, str3, str4, new Integer(i10), obj}, null, changeQuickRedirect, true, 16172, new Class[]{TradeSaleSettingsObj.class, String.class, String.class, String.class, String.class, Integer.TYPE, Object.class}, TradeSaleSettingsObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (TradeSaleSettingsObj) patchProxyResultProxy.result;
        }
        return tradeSaleSettingsObj.copy((i10 & 1) != 0 ? tradeSaleSettingsObj.sale_setting : str, (i10 & 2) != 0 ? tradeSaleSettingsObj.auto_sale_setting : str2, (i10 & 4) != 0 ? tradeSaleSettingsObj.auto_start : str3, (i10 & 8) != 0 ? tradeSaleSettingsObj.auto_stop : str4);
    }

    @e
    public final String component1() {
        return this.sale_setting;
    }

    @e
    public final String component2() {
        return this.auto_sale_setting;
    }

    @e
    public final String component3() {
        return this.auto_start;
    }

    @e
    public final String component4() {
        return this.auto_stop;
    }

    @d
    public final TradeSaleSettingsObj copy(@e String str, @e String str2, @e String str3, @e String str4) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2, str3, str4}, this, changeQuickRedirect, false, 16171, new Class[]{String.class, String.class, String.class, String.class}, TradeSaleSettingsObj.class);
        return patchProxyResultProxy.isSupported ? (TradeSaleSettingsObj) patchProxyResultProxy.result : new TradeSaleSettingsObj(str, str2, str3, str4);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 16175, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TradeSaleSettingsObj)) {
            return false;
        }
        TradeSaleSettingsObj tradeSaleSettingsObj = (TradeSaleSettingsObj) obj;
        return f0.g(this.sale_setting, tradeSaleSettingsObj.sale_setting) && f0.g(this.auto_sale_setting, tradeSaleSettingsObj.auto_sale_setting) && f0.g(this.auto_start, tradeSaleSettingsObj.auto_start) && f0.g(this.auto_stop, tradeSaleSettingsObj.auto_stop);
    }

    @e
    public final String getAuto_sale_setting() {
        return this.auto_sale_setting;
    }

    @e
    public final String getAuto_start() {
        return this.auto_start;
    }

    @e
    public final String getAuto_stop() {
        return this.auto_stop;
    }

    @e
    public final String getSale_setting() {
        return this.sale_setting;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 16174, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.sale_setting;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.auto_sale_setting;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.auto_start;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.auto_stop;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public final void setAuto_sale_setting(@e String str) {
        this.auto_sale_setting = str;
    }

    public final void setAuto_start(@e String str) {
        this.auto_start = str;
    }

    public final void setAuto_stop(@e String str) {
        this.auto_stop = str;
    }

    public final void setSale_setting(@e String str) {
        this.sale_setting = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 16173, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "TradeSaleSettingsObj(sale_setting=" + this.sale_setting + ", auto_sale_setting=" + this.auto_sale_setting + ", auto_start=" + this.auto_start + ", auto_stop=" + this.auto_stop + ')';
    }
}
