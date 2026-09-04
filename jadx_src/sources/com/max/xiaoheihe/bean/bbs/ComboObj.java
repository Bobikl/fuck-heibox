package com.max.xiaoheihe.bean.bbs;

import androidx.compose.runtime.internal.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: ComboObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class ComboObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String is_max_charge;

    @e
    private String msg;

    public ComboObj(@e String str, @e String str2) {
        this.is_max_charge = str;
        this.msg = str2;
    }

    public static /* synthetic */ ComboObj copy$default(ComboObj comboObj, String str, String str2, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{comboObj, str, str2, new Integer(i10), obj}, null, changeQuickRedirect, true, 14248, new Class[]{ComboObj.class, String.class, String.class, Integer.TYPE, Object.class}, ComboObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (ComboObj) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            str = comboObj.is_max_charge;
        }
        if ((i10 & 2) != 0) {
            str2 = comboObj.msg;
        }
        return comboObj.copy(str, str2);
    }

    @e
    public final String component1() {
        return this.is_max_charge;
    }

    @e
    public final String component2() {
        return this.msg;
    }

    @d
    public final ComboObj copy(@e String str, @e String str2) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2}, this, changeQuickRedirect, false, 14247, new Class[]{String.class, String.class}, ComboObj.class);
        return patchProxyResultProxy.isSupported ? (ComboObj) patchProxyResultProxy.result : new ComboObj(str, str2);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 14251, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ComboObj)) {
            return false;
        }
        ComboObj comboObj = (ComboObj) obj;
        return f0.g(this.is_max_charge, comboObj.is_max_charge) && f0.g(this.msg, comboObj.msg);
    }

    @e
    public final String getMsg() {
        return this.msg;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14250, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.is_max_charge;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.msg;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @e
    public final String is_max_charge() {
        return this.is_max_charge;
    }

    public final void setMsg(@e String str) {
        this.msg = str;
    }

    public final void set_max_charge(@e String str) {
        this.is_max_charge = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14249, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "ComboObj(is_max_charge=" + this.is_max_charge + ", msg=" + this.msg + ')';
    }
}
