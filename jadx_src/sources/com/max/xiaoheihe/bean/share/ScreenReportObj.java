package com.max.xiaoheihe.bean.share;

import androidx.compose.runtime.internal.o;
import com.google.gson.JsonObject;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: ScreenShareInfoObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class ScreenReportObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private JsonObject extra;

    @e
    private String src;

    public ScreenReportObj(@e String str, @e JsonObject jsonObject) {
        this.src = str;
        this.extra = jsonObject;
    }

    public static /* synthetic */ ScreenReportObj copy$default(ScreenReportObj screenReportObj, String str, JsonObject jsonObject, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{screenReportObj, str, jsonObject, new Integer(i10), obj}, null, changeQuickRedirect, true, 15913, new Class[]{ScreenReportObj.class, String.class, JsonObject.class, Integer.TYPE, Object.class}, ScreenReportObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (ScreenReportObj) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            str = screenReportObj.src;
        }
        if ((i10 & 2) != 0) {
            jsonObject = screenReportObj.extra;
        }
        return screenReportObj.copy(str, jsonObject);
    }

    @e
    public final String component1() {
        return this.src;
    }

    @e
    public final JsonObject component2() {
        return this.extra;
    }

    @d
    public final ScreenReportObj copy(@e String str, @e JsonObject jsonObject) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, jsonObject}, this, changeQuickRedirect, false, 15912, new Class[]{String.class, JsonObject.class}, ScreenReportObj.class);
        return patchProxyResultProxy.isSupported ? (ScreenReportObj) patchProxyResultProxy.result : new ScreenReportObj(str, jsonObject);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 15916, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ScreenReportObj)) {
            return false;
        }
        ScreenReportObj screenReportObj = (ScreenReportObj) obj;
        return f0.g(this.src, screenReportObj.src) && f0.g(this.extra, screenReportObj.extra);
    }

    @e
    public final JsonObject getExtra() {
        return this.extra;
    }

    @e
    public final String getSrc() {
        return this.src;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15915, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.src;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        JsonObject jsonObject = this.extra;
        return iHashCode + (jsonObject != null ? jsonObject.hashCode() : 0);
    }

    public final void setExtra(@e JsonObject jsonObject) {
        this.extra = jsonObject;
    }

    public final void setSrc(@e String str) {
        this.src = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15914, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "ScreenReportObj(src=" + this.src + ", extra=" + this.extra + ')';
    }
}
