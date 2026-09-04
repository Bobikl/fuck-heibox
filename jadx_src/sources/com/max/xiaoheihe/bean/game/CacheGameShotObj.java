package com.max.xiaoheihe.bean.game;

import androidx.compose.runtime.internal.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import java.util.HashMap;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: CacheGameShotObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class CacheGameShotObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private HashMap<String, String> map;

    /* JADX WARN: Multi-variable type inference failed */
    public CacheGameShotObj() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public CacheGameShotObj(@e HashMap<String, String> map) {
        this.map = map;
    }

    public /* synthetic */ CacheGameShotObj(HashMap map, int i10, u uVar) {
        this((i10 & 1) != 0 ? new HashMap() : map);
    }

    public static /* synthetic */ CacheGameShotObj copy$default(CacheGameShotObj cacheGameShotObj, HashMap map, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{cacheGameShotObj, map, new Integer(i10), obj}, null, changeQuickRedirect, true, 14627, new Class[]{CacheGameShotObj.class, HashMap.class, Integer.TYPE, Object.class}, CacheGameShotObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (CacheGameShotObj) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            map = cacheGameShotObj.map;
        }
        return cacheGameShotObj.copy(map);
    }

    @e
    public final HashMap<String, String> component1() {
        return this.map;
    }

    @d
    public final CacheGameShotObj copy(@e HashMap<String, String> map) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{map}, this, changeQuickRedirect, false, 14626, new Class[]{HashMap.class}, CacheGameShotObj.class);
        return patchProxyResultProxy.isSupported ? (CacheGameShotObj) patchProxyResultProxy.result : new CacheGameShotObj(map);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 14630, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        return (obj instanceof CacheGameShotObj) && f0.g(this.map, ((CacheGameShotObj) obj).map);
    }

    @e
    public final HashMap<String, String> getMap() {
        return this.map;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14629, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        HashMap<String, String> map = this.map;
        if (map == null) {
            return 0;
        }
        return map.hashCode();
    }

    public final void setMap(@e HashMap<String, String> map) {
        this.map = map;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14628, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "CacheGameShotObj(map=" + this.map + ')';
    }
}
