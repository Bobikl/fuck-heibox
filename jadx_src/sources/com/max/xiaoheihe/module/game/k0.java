package com.max.xiaoheihe.module.game;

import android.os.Bundle;
import com.max.xiaoheihe.bean.game.GameListObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.HashMap;

/* JADX INFO: compiled from: GameRollRoomListFragmentArgs.java */
/* JADX INFO: loaded from: classes11.dex */
public class k0 implements androidx.navigation.m {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final HashMap f87784a;

    /* JADX INFO: compiled from: GameRollRoomListFragmentArgs.java */
    public static final class b {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final HashMap f87785a;

        public b() {
            this.f87785a = new HashMap();
        }

        public b(@androidx.annotation.n0 k0 k0Var) {
            HashMap map = new HashMap();
            this.f87785a = map;
            map.putAll(k0Var.f87784a);
        }

        @androidx.annotation.n0
        public k0 a() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 33687, new Class[0], k0.class);
            return patchProxyResultProxy.isSupported ? (k0) patchProxyResultProxy.result : new k0(this.f87785a);
        }

        @androidx.annotation.p0
        public String b() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 33689, new Class[0], String.class);
            return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : (String) this.f87785a.get("page_type");
        }

        @androidx.annotation.n0
        public b c(@androidx.annotation.p0 String str) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 33688, new Class[]{String.class}, b.class);
            if (patchProxyResultProxy.isSupported) {
                return (b) patchProxyResultProxy.result;
            }
            this.f87785a.put("page_type", str);
            return this;
        }
    }

    private k0() {
        this.f87784a = new HashMap();
    }

    private k0(HashMap map) {
        HashMap map2 = new HashMap();
        this.f87784a = map2;
        map2.putAll(map);
    }

    @androidx.annotation.n0
    public static k0 b(@androidx.annotation.n0 androidx.lifecycle.q0 q0Var) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var}, null, changeQuickRedirect, true, 33680, new Class[]{androidx.lifecycle.q0.class}, k0.class);
        if (patchProxyResultProxy.isSupported) {
            return (k0) patchProxyResultProxy.result;
        }
        k0 k0Var = new k0();
        if (q0Var.f("page_type")) {
            k0Var.f87784a.put("page_type", (String) q0Var.h("page_type"));
        } else {
            k0Var.f87784a.put("page_type", GameListObj.ROLL_PAGE_TYPE_HOME);
        }
        return k0Var;
    }

    @androidx.annotation.n0
    public static k0 fromBundle(@androidx.annotation.n0 Bundle bundle) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{bundle}, null, changeQuickRedirect, true, 33679, new Class[]{Bundle.class}, k0.class);
        if (patchProxyResultProxy.isSupported) {
            return (k0) patchProxyResultProxy.result;
        }
        k0 k0Var = new k0();
        bundle.setClassLoader(k0.class.getClassLoader());
        if (bundle.containsKey("page_type")) {
            k0Var.f87784a.put("page_type", bundle.getString("page_type"));
        } else {
            k0Var.f87784a.put("page_type", GameListObj.ROLL_PAGE_TYPE_HOME);
        }
        return k0Var;
    }

    @androidx.annotation.p0
    public String c() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 33681, new Class[0], String.class);
        return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : (String) this.f87784a.get("page_type");
    }

    @androidx.annotation.n0
    public Bundle d() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 33682, new Class[0], Bundle.class);
        if (patchProxyResultProxy.isSupported) {
            return (Bundle) patchProxyResultProxy.result;
        }
        Bundle bundle = new Bundle();
        if (this.f87784a.containsKey("page_type")) {
            bundle.putString("page_type", (String) this.f87784a.get("page_type"));
        } else {
            bundle.putString("page_type", GameListObj.ROLL_PAGE_TYPE_HOME);
        }
        return bundle;
    }

    @androidx.annotation.n0
    public androidx.lifecycle.q0 e() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 33683, new Class[0], androidx.lifecycle.q0.class);
        if (patchProxyResultProxy.isSupported) {
            return (androidx.lifecycle.q0) patchProxyResultProxy.result;
        }
        androidx.lifecycle.q0 q0Var = new androidx.lifecycle.q0();
        if (this.f87784a.containsKey("page_type")) {
            q0Var.q("page_type", (String) this.f87784a.get("page_type"));
        } else {
            q0Var.q("page_type", GameListObj.ROLL_PAGE_TYPE_HOME);
        }
        return q0Var;
    }

    public boolean equals(Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 33684, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        k0 k0Var = (k0) obj;
        if (this.f87784a.containsKey("page_type") != k0Var.f87784a.containsKey("page_type")) {
            return false;
        }
        return c() == null ? k0Var.c() == null : c().equals(k0Var.c());
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 33685, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        return 31 + (c() != null ? c().hashCode() : 0);
    }

    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 33686, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "GameRollRoomListFragmentArgs{pageType=" + c() + z5.g.f141884d;
    }
}
