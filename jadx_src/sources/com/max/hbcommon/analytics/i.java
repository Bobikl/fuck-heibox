package com.max.hbcommon.analytics;

import androidx.room.j2;
import com.google.gson.JsonObject;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: PageEventJsonObjectConverter.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class i {
    public static ChangeQuickRedirect changeQuickRedirect;

    @j2
    @dl.e
    public final String a(@dl.e JsonObject jsonObject) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{jsonObject}, this, changeQuickRedirect, false, bb.c.b.Is, new Class[]{JsonObject.class}, String.class);
        return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : com.max.hbutils.utils.k.p(jsonObject);
    }

    @j2
    @dl.e
    public final JsonObject b(@dl.e String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, bb.c.b.Js, new Class[]{String.class}, JsonObject.class);
        return patchProxyResultProxy.isSupported ? (JsonObject) patchProxyResultProxy.result : (JsonObject) com.max.hbutils.utils.k.a(str, JsonObject.class);
    }
}
