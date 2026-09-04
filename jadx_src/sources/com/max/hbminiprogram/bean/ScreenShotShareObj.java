package com.max.hbminiprogram.bean;

import bb.c;
import com.google.gson.JsonObject;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: ScreenShotShareObj.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class ScreenShotShareObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private JsonObject screen_shot_share_info;

    @e
    private ScreenStyleInfoObj style_info;

    public ScreenShotShareObj(@e JsonObject jsonObject, @e ScreenStyleInfoObj screenStyleInfoObj) {
        this.screen_shot_share_info = jsonObject;
        this.style_info = screenStyleInfoObj;
    }

    public static /* synthetic */ ScreenShotShareObj copy$default(ScreenShotShareObj screenShotShareObj, JsonObject jsonObject, ScreenStyleInfoObj screenStyleInfoObj, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{screenShotShareObj, jsonObject, screenStyleInfoObj, new Integer(i10), obj}, null, changeQuickRedirect, true, c.h.M, new Class[]{ScreenShotShareObj.class, JsonObject.class, ScreenStyleInfoObj.class, Integer.TYPE, Object.class}, ScreenShotShareObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (ScreenShotShareObj) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            jsonObject = screenShotShareObj.screen_shot_share_info;
        }
        if ((i10 & 2) != 0) {
            screenStyleInfoObj = screenShotShareObj.style_info;
        }
        return screenShotShareObj.copy(jsonObject, screenStyleInfoObj);
    }

    @e
    public final JsonObject component1() {
        return this.screen_shot_share_info;
    }

    @e
    public final ScreenStyleInfoObj component2() {
        return this.style_info;
    }

    @d
    public final ScreenShotShareObj copy(@e JsonObject jsonObject, @e ScreenStyleInfoObj screenStyleInfoObj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{jsonObject, screenStyleInfoObj}, this, changeQuickRedirect, false, c.h.L, new Class[]{JsonObject.class, ScreenStyleInfoObj.class}, ScreenShotShareObj.class);
        return patchProxyResultProxy.isSupported ? (ScreenShotShareObj) patchProxyResultProxy.result : new ScreenShotShareObj(jsonObject, screenStyleInfoObj);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, c.h.P, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ScreenShotShareObj)) {
            return false;
        }
        ScreenShotShareObj screenShotShareObj = (ScreenShotShareObj) obj;
        return f0.g(this.screen_shot_share_info, screenShotShareObj.screen_shot_share_info) && f0.g(this.style_info, screenShotShareObj.style_info);
    }

    @e
    public final JsonObject getScreen_shot_share_info() {
        return this.screen_shot_share_info;
    }

    @e
    public final ScreenStyleInfoObj getStyle_info() {
        return this.style_info;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.h.O, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        JsonObject jsonObject = this.screen_shot_share_info;
        int iHashCode = (jsonObject == null ? 0 : jsonObject.hashCode()) * 31;
        ScreenStyleInfoObj screenStyleInfoObj = this.style_info;
        return iHashCode + (screenStyleInfoObj != null ? screenStyleInfoObj.hashCode() : 0);
    }

    public final void setScreen_shot_share_info(@e JsonObject jsonObject) {
        this.screen_shot_share_info = jsonObject;
    }

    public final void setStyle_info(@e ScreenStyleInfoObj screenStyleInfoObj) {
        this.style_info = screenStyleInfoObj;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.h.N, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "ScreenShotShareObj(screen_shot_share_info=" + this.screen_shot_share_info + ", style_info=" + this.style_info + ')';
    }
}
