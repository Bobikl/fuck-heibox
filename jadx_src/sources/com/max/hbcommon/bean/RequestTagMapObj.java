package com.max.hbcommon.bean;

import bb.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import java.util.HashMap;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: RequestTagMapObj.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class RequestTagMapObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;

    @d
    private final HashMap<String, String> map = new HashMap<>();

    @e
    public final String get(@d String key) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{key}, this, changeQuickRedirect, false, c.d.f31543t4, new Class[]{String.class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        f0.p(key, "key");
        return this.map.get(key);
    }

    public final void put(@d String key, @d String value) {
        if (PatchProxy.proxy(new Object[]{key, value}, this, changeQuickRedirect, false, c.d.f31521s4, new Class[]{String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(key, "key");
        f0.p(value, "value");
        this.map.put(key, value);
    }
}
