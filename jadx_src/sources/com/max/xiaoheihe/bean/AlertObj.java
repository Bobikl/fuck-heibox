package com.max.xiaoheihe.bean;

import androidx.compose.runtime.internal.o;
import bb.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: AlertObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class AlertObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String cancel_btn_text;

    @e
    private String confirm_btn_text;

    @e
    private String msg;

    @e
    private String title;

    public AlertObj(@e String str, @e String str2, @e String str3, @e String str4) {
        this.title = str;
        this.msg = str2;
        this.confirm_btn_text = str3;
        this.cancel_btn_text = str4;
    }

    public static /* synthetic */ AlertObj copy$default(AlertObj alertObj, String str, String str2, String str3, String str4, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{alertObj, str, str2, str3, str4, new Integer(i10), obj}, null, changeQuickRedirect, true, c.m.lL, new Class[]{AlertObj.class, String.class, String.class, String.class, String.class, Integer.TYPE, Object.class}, AlertObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (AlertObj) patchProxyResultProxy.result;
        }
        return alertObj.copy((i10 & 1) != 0 ? alertObj.title : str, (i10 & 2) != 0 ? alertObj.msg : str2, (i10 & 4) != 0 ? alertObj.confirm_btn_text : str3, (i10 & 8) != 0 ? alertObj.cancel_btn_text : str4);
    }

    @e
    public final String component1() {
        return this.title;
    }

    @e
    public final String component2() {
        return this.msg;
    }

    @e
    public final String component3() {
        return this.confirm_btn_text;
    }

    @e
    public final String component4() {
        return this.cancel_btn_text;
    }

    @d
    public final AlertObj copy(@e String str, @e String str2, @e String str3, @e String str4) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2, str3, str4}, this, changeQuickRedirect, false, c.m.kL, new Class[]{String.class, String.class, String.class, String.class}, AlertObj.class);
        return patchProxyResultProxy.isSupported ? (AlertObj) patchProxyResultProxy.result : new AlertObj(str, str2, str3, str4);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, c.m.oL, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AlertObj)) {
            return false;
        }
        AlertObj alertObj = (AlertObj) obj;
        return f0.g(this.title, alertObj.title) && f0.g(this.msg, alertObj.msg) && f0.g(this.confirm_btn_text, alertObj.confirm_btn_text) && f0.g(this.cancel_btn_text, alertObj.cancel_btn_text);
    }

    @e
    public final String getCancel_btn_text() {
        return this.cancel_btn_text;
    }

    @e
    public final String getConfirm_btn_text() {
        return this.confirm_btn_text;
    }

    @e
    public final String getMsg() {
        return this.msg;
    }

    @e
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.m.nL, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.msg;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.confirm_btn_text;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.cancel_btn_text;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public final void setCancel_btn_text(@e String str) {
        this.cancel_btn_text = str;
    }

    public final void setConfirm_btn_text(@e String str) {
        this.confirm_btn_text = str;
    }

    public final void setMsg(@e String str) {
        this.msg = str;
    }

    public final void setTitle(@e String str) {
        this.title = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.m.mL, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "AlertObj(title=" + this.title + ", msg=" + this.msg + ", confirm_btn_text=" + this.confirm_btn_text + ", cancel_btn_text=" + this.cancel_btn_text + ')';
    }
}
