package com.max.xiaoheihe.bean.mall.purchase;

import androidx.compose.runtime.internal.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: DeductInfoObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class DeductInfoObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private Boolean enable_deduct;

    @e
    private String max_deduct_coin;

    public DeductInfoObj(@e Boolean bool, @e String str) {
        this.enable_deduct = bool;
        this.max_deduct_coin = str;
    }

    public static /* synthetic */ DeductInfoObj copy$default(DeductInfoObj deductInfoObj, Boolean bool, String str, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{deductInfoObj, bool, str, new Integer(i10), obj}, null, changeQuickRedirect, true, 15655, new Class[]{DeductInfoObj.class, Boolean.class, String.class, Integer.TYPE, Object.class}, DeductInfoObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (DeductInfoObj) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            bool = deductInfoObj.enable_deduct;
        }
        if ((i10 & 2) != 0) {
            str = deductInfoObj.max_deduct_coin;
        }
        return deductInfoObj.copy(bool, str);
    }

    @e
    public final Boolean component1() {
        return this.enable_deduct;
    }

    @e
    public final String component2() {
        return this.max_deduct_coin;
    }

    @d
    public final DeductInfoObj copy(@e Boolean bool, @e String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{bool, str}, this, changeQuickRedirect, false, 15654, new Class[]{Boolean.class, String.class}, DeductInfoObj.class);
        return patchProxyResultProxy.isSupported ? (DeductInfoObj) patchProxyResultProxy.result : new DeductInfoObj(bool, str);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 15658, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeductInfoObj)) {
            return false;
        }
        DeductInfoObj deductInfoObj = (DeductInfoObj) obj;
        return f0.g(this.enable_deduct, deductInfoObj.enable_deduct) && f0.g(this.max_deduct_coin, deductInfoObj.max_deduct_coin);
    }

    @e
    public final Boolean getEnable_deduct() {
        return this.enable_deduct;
    }

    @e
    public final String getMax_deduct_coin() {
        return this.max_deduct_coin;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15657, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        Boolean bool = this.enable_deduct;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        String str = this.max_deduct_coin;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final void setEnable_deduct(@e Boolean bool) {
        this.enable_deduct = bool;
    }

    public final void setMax_deduct_coin(@e String str) {
        this.max_deduct_coin = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15656, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "DeductInfoObj(enable_deduct=" + this.enable_deduct + ", max_deduct_coin=" + this.max_deduct_coin + ')';
    }
}
