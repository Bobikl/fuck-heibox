package com.max.xiaoheihe.bean.game;

import androidx.compose.runtime.internal.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: CoffeeDialogProgressObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class CoffeeDialogProgressObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String failedStr;

    @e
    private String state;

    @e
    private String title;

    public CoffeeDialogProgressObj(@e String str, @e String str2, @e String str3) {
        this.title = str;
        this.state = str2;
        this.failedStr = str3;
    }

    public /* synthetic */ CoffeeDialogProgressObj(String str, String str2, String str3, int i10, u uVar) {
        this(str, str2, (i10 & 4) != 0 ? null : str3);
    }

    public static /* synthetic */ CoffeeDialogProgressObj copy$default(CoffeeDialogProgressObj coffeeDialogProgressObj, String str, String str2, String str3, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{coffeeDialogProgressObj, str, str2, str3, new Integer(i10), obj}, null, changeQuickRedirect, true, 14653, new Class[]{CoffeeDialogProgressObj.class, String.class, String.class, String.class, Integer.TYPE, Object.class}, CoffeeDialogProgressObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (CoffeeDialogProgressObj) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            str = coffeeDialogProgressObj.title;
        }
        if ((i10 & 2) != 0) {
            str2 = coffeeDialogProgressObj.state;
        }
        if ((i10 & 4) != 0) {
            str3 = coffeeDialogProgressObj.failedStr;
        }
        return coffeeDialogProgressObj.copy(str, str2, str3);
    }

    @e
    public final String component1() {
        return this.title;
    }

    @e
    public final String component2() {
        return this.state;
    }

    @e
    public final String component3() {
        return this.failedStr;
    }

    @d
    public final CoffeeDialogProgressObj copy(@e String str, @e String str2, @e String str3) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2, str3}, this, changeQuickRedirect, false, 14652, new Class[]{String.class, String.class, String.class}, CoffeeDialogProgressObj.class);
        return patchProxyResultProxy.isSupported ? (CoffeeDialogProgressObj) patchProxyResultProxy.result : new CoffeeDialogProgressObj(str, str2, str3);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 14656, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CoffeeDialogProgressObj)) {
            return false;
        }
        CoffeeDialogProgressObj coffeeDialogProgressObj = (CoffeeDialogProgressObj) obj;
        return f0.g(this.title, coffeeDialogProgressObj.title) && f0.g(this.state, coffeeDialogProgressObj.state) && f0.g(this.failedStr, coffeeDialogProgressObj.failedStr);
    }

    @e
    public final String getFailedStr() {
        return this.failedStr;
    }

    @e
    public final String getState() {
        return this.state;
    }

    @e
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14655, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.state;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.failedStr;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final void setFailedStr(@e String str) {
        this.failedStr = str;
    }

    public final void setState(@e String str) {
        this.state = str;
    }

    public final void setTitle(@e String str) {
        this.title = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14654, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "CoffeeDialogProgressObj(title=" + this.title + ", state=" + this.state + ", failedStr=" + this.failedStr + ')';
    }
}
