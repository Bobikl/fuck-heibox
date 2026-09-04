package com.max.xiaoheihe.bean.account;

import androidx.compose.runtime.internal.o;
import com.max.hbuikit.bean.UiKitViewObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: SignBirthdayDialogInfoObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class SignBirthdayDialogInfoObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String bg_color;

    @e
    private DialogButtonObj button;

    @e
    private List<GifImageObj> fullscreen_imgs;

    @e
    private String tips;

    @e
    private UiKitViewObj uikit;

    public SignBirthdayDialogInfoObj(@e List<GifImageObj> list, @e UiKitViewObj uiKitViewObj, @e String str, @e String str2, @e DialogButtonObj dialogButtonObj) {
        this.fullscreen_imgs = list;
        this.uikit = uiKitViewObj;
        this.tips = str;
        this.bg_color = str2;
        this.button = dialogButtonObj;
    }

    public static /* synthetic */ SignBirthdayDialogInfoObj copy$default(SignBirthdayDialogInfoObj signBirthdayDialogInfoObj, List list, UiKitViewObj uiKitViewObj, String str, String str2, DialogButtonObj dialogButtonObj, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{signBirthdayDialogInfoObj, list, uiKitViewObj, str, str2, dialogButtonObj, new Integer(i10), obj}, null, changeQuickRedirect, true, 13956, new Class[]{SignBirthdayDialogInfoObj.class, List.class, UiKitViewObj.class, String.class, String.class, DialogButtonObj.class, Integer.TYPE, Object.class}, SignBirthdayDialogInfoObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (SignBirthdayDialogInfoObj) patchProxyResultProxy.result;
        }
        return signBirthdayDialogInfoObj.copy((i10 & 1) != 0 ? signBirthdayDialogInfoObj.fullscreen_imgs : list, (i10 & 2) != 0 ? signBirthdayDialogInfoObj.uikit : uiKitViewObj, (i10 & 4) != 0 ? signBirthdayDialogInfoObj.tips : str, (i10 & 8) != 0 ? signBirthdayDialogInfoObj.bg_color : str2, (i10 & 16) != 0 ? signBirthdayDialogInfoObj.button : dialogButtonObj);
    }

    @e
    public final List<GifImageObj> component1() {
        return this.fullscreen_imgs;
    }

    @e
    public final UiKitViewObj component2() {
        return this.uikit;
    }

    @e
    public final String component3() {
        return this.tips;
    }

    @e
    public final String component4() {
        return this.bg_color;
    }

    @e
    public final DialogButtonObj component5() {
        return this.button;
    }

    @d
    public final SignBirthdayDialogInfoObj copy(@e List<GifImageObj> list, @e UiKitViewObj uiKitViewObj, @e String str, @e String str2, @e DialogButtonObj dialogButtonObj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{list, uiKitViewObj, str, str2, dialogButtonObj}, this, changeQuickRedirect, false, 13955, new Class[]{List.class, UiKitViewObj.class, String.class, String.class, DialogButtonObj.class}, SignBirthdayDialogInfoObj.class);
        return patchProxyResultProxy.isSupported ? (SignBirthdayDialogInfoObj) patchProxyResultProxy.result : new SignBirthdayDialogInfoObj(list, uiKitViewObj, str, str2, dialogButtonObj);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 13959, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SignBirthdayDialogInfoObj)) {
            return false;
        }
        SignBirthdayDialogInfoObj signBirthdayDialogInfoObj = (SignBirthdayDialogInfoObj) obj;
        return f0.g(this.fullscreen_imgs, signBirthdayDialogInfoObj.fullscreen_imgs) && f0.g(this.uikit, signBirthdayDialogInfoObj.uikit) && f0.g(this.tips, signBirthdayDialogInfoObj.tips) && f0.g(this.bg_color, signBirthdayDialogInfoObj.bg_color) && f0.g(this.button, signBirthdayDialogInfoObj.button);
    }

    @e
    public final String getBg_color() {
        return this.bg_color;
    }

    @e
    public final DialogButtonObj getButton() {
        return this.button;
    }

    @e
    public final List<GifImageObj> getFullscreen_imgs() {
        return this.fullscreen_imgs;
    }

    @e
    public final String getTips() {
        return this.tips;
    }

    @e
    public final UiKitViewObj getUikit() {
        return this.uikit;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 13958, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        List<GifImageObj> list = this.fullscreen_imgs;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        UiKitViewObj uiKitViewObj = this.uikit;
        int iHashCode2 = (iHashCode + (uiKitViewObj == null ? 0 : uiKitViewObj.hashCode())) * 31;
        String str = this.tips;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.bg_color;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        DialogButtonObj dialogButtonObj = this.button;
        return iHashCode4 + (dialogButtonObj != null ? dialogButtonObj.hashCode() : 0);
    }

    public final void setBg_color(@e String str) {
        this.bg_color = str;
    }

    public final void setButton(@e DialogButtonObj dialogButtonObj) {
        this.button = dialogButtonObj;
    }

    public final void setFullscreen_imgs(@e List<GifImageObj> list) {
        this.fullscreen_imgs = list;
    }

    public final void setTips(@e String str) {
        this.tips = str;
    }

    public final void setUikit(@e UiKitViewObj uiKitViewObj) {
        this.uikit = uiKitViewObj;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 13957, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "SignBirthdayDialogInfoObj(fullscreen_imgs=" + this.fullscreen_imgs + ", uikit=" + this.uikit + ", tips=" + this.tips + ", bg_color=" + this.bg_color + ", button=" + this.button + ')';
    }
}
