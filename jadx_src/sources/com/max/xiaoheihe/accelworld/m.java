package com.max.xiaoheihe.accelworld;

import com.google.gson.Gson;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.tencent.mmkv.MMKV;
import java.util.Calendar;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: AccelWorldMMKV.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long f76763a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f76764b = 1000;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final long f76765c = 60000;
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final long f76766d = 3600000;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final long f76767e = 86400000;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.d
    public static final String f76768f = "has_show_flash_animation";

    public static final boolean a(@dl.d MMKV mmkv, @dl.d String key, boolean z10) {
        Object[] objArr = {mmkv, key, new Byte(z10 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Boolean.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, bb.c.m.fx, new Class[]{MMKV.class, String.class, cls}, cls);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        f0.p(mmkv, "<this>");
        f0.p(key, "key");
        String string = mmkv.getString(key, null);
        if (string == null) {
            return z10;
        }
        try {
            u uVar = (u) new Gson().fromJson(string, u.class);
            if (uVar.e() >= System.currentTimeMillis()) {
                return uVar.f();
            }
            mmkv.remove(key);
            return z10;
        } catch (Exception unused) {
            mmkv.remove(key);
            return z10;
        }
    }

    public static final void b(@dl.d MMKV mmkv, @dl.d String key, boolean z10) {
        if (PatchProxy.proxy(new Object[]{mmkv, key, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, bb.c.m.ex, new Class[]{MMKV.class, String.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(mmkv, "<this>");
        f0.p(key, "key");
        Calendar calendar = Calendar.getInstance();
        calendar.add(6, 1);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        mmkv.putString(key, new Gson().toJson(new u(z10, calendar.getTimeInMillis())));
    }
}
