package com.max.xiaoheihe.module.account.utils;

import androidx.compose.runtime.internal.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.b2;

/* JADX INFO: compiled from: HBSteamInfoUtils.kt */
/* JADX INFO: loaded from: classes9.dex */
@o(parameters = 0)
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final g f79313a = new g();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private static final Map<String, String> f79314b = new LinkedHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f79315c = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    private g() {
    }

    public final void a() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 25425, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        Map<String, String> map = f79314b;
        synchronized (map) {
            map.clear();
            b2 b2Var = b2.f124493a;
        }
    }

    public final boolean b(@dl.e String str) {
        boolean zContainsKey;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 25428, new Class[]{String.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (str == null) {
            return false;
        }
        Map<String, String> map = f79314b;
        synchronized (map) {
            zContainsKey = map.containsKey(str);
        }
        return zContainsKey;
    }

    @dl.e
    public final String c(@dl.e String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 25427, new Class[]{String.class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        String str2 = null;
        if (str == null) {
            return null;
        }
        Map<String, String> map = f79314b;
        synchronized (map) {
            String strB = map.get(str);
            if (strB != null) {
                str2 = strB;
            } else {
                strB = HBSteamInfoUtilsKt.b(str);
                if (strB != null) {
                    map.put(str, strB);
                    str2 = strB;
                }
            }
        }
        return str2;
    }

    public final boolean d(@dl.e String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 25429, new Class[]{String.class}, Boolean.TYPE);
        return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : !b(str);
    }

    public final void e(@dl.e String str, @dl.e String str2) {
        if (PatchProxy.proxy(new Object[]{str, str2}, this, changeQuickRedirect, false, 25426, new Class[]{String.class, String.class}, Void.TYPE).isSupported || str == null || str2 == null) {
            return;
        }
        Map<String, String> map = f79314b;
        synchronized (map) {
            map.put(str, str2);
            HBSteamInfoUtilsKt.d(str, str2);
            b2 b2Var = b2.f124493a;
        }
    }
}
