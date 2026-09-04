package com.max.xiaoheihe.bean.game;

import androidx.compose.runtime.internal.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: CoffeeDialogDataObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class CoffeeDialogDataObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String btnTap;

    @e
    private String btnText;

    @e
    private String cancel_btn_tap;

    @e
    private String cancel_btn_text;
    private boolean cancelable_custom;

    @e
    private String loading;

    @d
    private List<CoffeeDialogProgressObj> steps;

    @e
    private String title;

    public CoffeeDialogDataObj(@e String str, @d List<CoffeeDialogProgressObj> steps, @e String str2, @e String str3, @e String str4, boolean z10, @e String str5, @e String str6) {
        f0.p(steps, "steps");
        this.title = str;
        this.steps = steps;
        this.loading = str2;
        this.btnText = str3;
        this.btnTap = str4;
        this.cancelable_custom = z10;
        this.cancel_btn_text = str5;
        this.cancel_btn_tap = str6;
    }

    public /* synthetic */ CoffeeDialogDataObj(String str, List list, String str2, String str3, String str4, boolean z10, String str5, String str6, int i10, u uVar) {
        this(str, list, str2, str3, str4, (i10 & 32) != 0 ? true : z10, str5, str6);
    }

    public static /* synthetic */ CoffeeDialogDataObj copy$default(CoffeeDialogDataObj coffeeDialogDataObj, String str, List list, String str2, String str3, String str4, boolean z10, String str5, String str6, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{coffeeDialogDataObj, str, list, str2, str3, str4, new Byte(z10 ? (byte) 1 : (byte) 0), str5, str6, new Integer(i10), obj}, null, changeQuickRedirect, true, 14648, new Class[]{CoffeeDialogDataObj.class, String.class, List.class, String.class, String.class, String.class, Boolean.TYPE, String.class, String.class, Integer.TYPE, Object.class}, CoffeeDialogDataObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (CoffeeDialogDataObj) patchProxyResultProxy.result;
        }
        return coffeeDialogDataObj.copy((i10 & 1) != 0 ? coffeeDialogDataObj.title : str, (i10 & 2) != 0 ? coffeeDialogDataObj.steps : list, (i10 & 4) != 0 ? coffeeDialogDataObj.loading : str2, (i10 & 8) != 0 ? coffeeDialogDataObj.btnText : str3, (i10 & 16) != 0 ? coffeeDialogDataObj.btnTap : str4, (i10 & 32) != 0 ? coffeeDialogDataObj.cancelable_custom : z10 ? 1 : 0, (i10 & 64) != 0 ? coffeeDialogDataObj.cancel_btn_text : str5, (i10 & 128) != 0 ? coffeeDialogDataObj.cancel_btn_tap : str6);
    }

    @e
    public final String component1() {
        return this.title;
    }

    @d
    public final List<CoffeeDialogProgressObj> component2() {
        return this.steps;
    }

    @e
    public final String component3() {
        return this.loading;
    }

    @e
    public final String component4() {
        return this.btnText;
    }

    @e
    public final String component5() {
        return this.btnTap;
    }

    public final boolean component6() {
        return this.cancelable_custom;
    }

    @e
    public final String component7() {
        return this.cancel_btn_text;
    }

    @e
    public final String component8() {
        return this.cancel_btn_tap;
    }

    @d
    public final CoffeeDialogDataObj copy(@e String str, @d List<CoffeeDialogProgressObj> steps, @e String str2, @e String str3, @e String str4, boolean z10, @e String str5, @e String str6) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, steps, str2, str3, str4, new Byte(z10 ? (byte) 1 : (byte) 0), str5, str6}, this, changeQuickRedirect, false, 14647, new Class[]{String.class, List.class, String.class, String.class, String.class, Boolean.TYPE, String.class, String.class}, CoffeeDialogDataObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (CoffeeDialogDataObj) patchProxyResultProxy.result;
        }
        f0.p(steps, "steps");
        return new CoffeeDialogDataObj(str, steps, str2, str3, str4, z10, str5, str6);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 14651, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CoffeeDialogDataObj)) {
            return false;
        }
        CoffeeDialogDataObj coffeeDialogDataObj = (CoffeeDialogDataObj) obj;
        return f0.g(this.title, coffeeDialogDataObj.title) && f0.g(this.steps, coffeeDialogDataObj.steps) && f0.g(this.loading, coffeeDialogDataObj.loading) && f0.g(this.btnText, coffeeDialogDataObj.btnText) && f0.g(this.btnTap, coffeeDialogDataObj.btnTap) && this.cancelable_custom == coffeeDialogDataObj.cancelable_custom && f0.g(this.cancel_btn_text, coffeeDialogDataObj.cancel_btn_text) && f0.g(this.cancel_btn_tap, coffeeDialogDataObj.cancel_btn_tap);
    }

    @e
    public final String getBtnTap() {
        return this.btnTap;
    }

    @e
    public final String getBtnText() {
        return this.btnText;
    }

    @e
    public final String getCancel_btn_tap() {
        return this.cancel_btn_tap;
    }

    @e
    public final String getCancel_btn_text() {
        return this.cancel_btn_text;
    }

    public final boolean getCancelable_custom() {
        return this.cancelable_custom;
    }

    @e
    public final String getLoading() {
        return this.loading;
    }

    @d
    public final List<CoffeeDialogProgressObj> getSteps() {
        return this.steps;
    }

    @e
    public final String getTitle() {
        return this.title;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v14, types: [int] */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v24 */
    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14650, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.title;
        int iHashCode = (((str == null ? 0 : str.hashCode()) * 31) + this.steps.hashCode()) * 31;
        String str2 = this.loading;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.btnText;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.btnTap;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        boolean z10 = this.cancelable_custom;
        ?? r10 = z10;
        if (z10) {
            r10 = 1;
        }
        int i10 = (iHashCode4 + r10) * 31;
        String str5 = this.cancel_btn_text;
        int iHashCode5 = (i10 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.cancel_btn_tap;
        return iHashCode5 + (str6 != null ? str6.hashCode() : 0);
    }

    public final void setBtnTap(@e String str) {
        this.btnTap = str;
    }

    public final void setBtnText(@e String str) {
        this.btnText = str;
    }

    public final void setCancel_btn_tap(@e String str) {
        this.cancel_btn_tap = str;
    }

    public final void setCancel_btn_text(@e String str) {
        this.cancel_btn_text = str;
    }

    public final void setCancelable_custom(boolean z10) {
        this.cancelable_custom = z10;
    }

    public final void setLoading(@e String str) {
        this.loading = str;
    }

    public final void setSteps(@d List<CoffeeDialogProgressObj> list) {
        if (PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, 14646, new Class[]{List.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(list, "<set-?>");
        this.steps = list;
    }

    public final void setTitle(@e String str) {
        this.title = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14649, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "CoffeeDialogDataObj(title=" + this.title + ", steps=" + this.steps + ", loading=" + this.loading + ", btnText=" + this.btnText + ", btnTap=" + this.btnTap + ", cancelable_custom=" + this.cancelable_custom + ", cancel_btn_text=" + this.cancel_btn_text + ", cancel_btn_tap=" + this.cancel_btn_tap + ')';
    }
}
