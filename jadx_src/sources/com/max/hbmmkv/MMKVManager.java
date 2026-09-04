package com.max.hbmmkv;

import android.app.Application;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.tencent.mmkv.MMKV;
import dl.d;
import dl.e;
import kotlin.b2;
import kotlin.jvm.internal.f0;
import kotlin.text.u;
import yh.l;

/* JADX INFO: compiled from: MMKVManager.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class MMKVManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @d
    public static final MMKVManager f71329a = new MMKVManager();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @d
    private static final String f71330b = "user_prefix";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @d
    public static final String f71331c = "default";
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @d
    public static final String f71332d = "mmkv_ids_mmkv";

    private MMKVManager() {
    }

    private final String a(boolean z10, String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0), str}, this, changeQuickRedirect, false, bb.c.i.W1, new Class[]{Boolean.TYPE, String.class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        if (!z10) {
            return str;
        }
        return f71330b + str;
    }

    private final void c(final String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, bb.c.i.Y1, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        c.a(f71332d, new l<b, b2>() { // from class: com.max.hbmmkv.MMKVManager$fastRegisterMMKV$1
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void a(@d b withMMKV) {
                if (PatchProxy.proxy(new Object[]{withMMKV}, this, changeQuickRedirect, false, bb.c.i.f33298c2, new Class[]{b.class}, Void.TYPE).isSupported) {
                    return;
                }
                f0.p(withMMKV, "$this$withMMKV");
                String str2 = str;
                if (str2 != null) {
                    withMMKV.h(str2);
                }
            }

            /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, kotlin.b2] */
            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(b bVar) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{bVar}, this, changeQuickRedirect, false, bb.c.i.f33304d2, new Class[]{Object.class}, Object.class);
                if (patchProxyResultProxy.isSupported) {
                    return patchProxyResultProxy.result;
                }
                a(bVar);
                return b2.f124493a;
            }
        });
    }

    private final MMKV h(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, bb.c.i.X1, new Class[]{String.class}, MMKV.class);
        if (patchProxyResultProxy.isSupported) {
            return (MMKV) patchProxyResultProxy.result;
        }
        return f0.g(str, "default") ? MMKV.defaultMMKV() : MMKV.mmkvWithID(str);
    }

    public final void b() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.i.Z1, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        c.a(f71332d, new l<b, b2>() { // from class: com.max.hbmmkv.MMKVManager$clearUserRelatedData$1
            public static ChangeQuickRedirect changeQuickRedirect;

            public final void a(@d b withMMKV) {
                if (PatchProxy.proxy(new Object[]{withMMKV}, this, changeQuickRedirect, false, bb.c.i.f33286a2, new Class[]{b.class}, Void.TYPE).isSupported) {
                    return;
                }
                f0.p(withMMKV, "$this$withMMKV");
                String[] strArrA = withMMKV.a();
                if (strArrA != null) {
                    for (String str : strArrA) {
                        MMKV mmkvDefaultMMKV = f0.g(str, "default") ? MMKV.defaultMMKV() : MMKV.mmkvWithID(str);
                        String[] strArrAllKeys = mmkvDefaultMMKV != null ? mmkvDefaultMMKV.allKeys() : null;
                        if (strArrAllKeys != null) {
                            for (String str2 : strArrAllKeys) {
                                f0.m(str2);
                                if (u.v2(str2, "user_prefix", false, 2, null)) {
                                    mmkvDefaultMMKV.removeValueForKey(str2);
                                }
                            }
                        }
                    }
                }
            }

            /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, kotlin.b2] */
            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(b bVar) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{bVar}, this, changeQuickRedirect, false, bb.c.i.f33292b2, new Class[]{Object.class}, Object.class);
                if (patchProxyResultProxy.isSupported) {
                    return patchProxyResultProxy.result;
                }
                a(bVar);
                return b2.f124493a;
            }
        });
    }

    public final boolean d(@e String str, @e String str2, boolean z10, boolean z11) {
        Object[] objArr = {str, str2, new Byte(z10 ? (byte) 1 : (byte) 0), new Byte(z11 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Boolean.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.i.R1, new Class[]{String.class, String.class, cls, cls}, cls);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (str == null || str2 == null) {
            return z10;
        }
        c(str);
        MMKV mmkvH = h(str);
        return mmkvH != null ? mmkvH.getBoolean(a(z11, str2), z10) : z10;
    }

    public final float e(@e String str, @e String str2, float f10, boolean z10) {
        Object[] objArr = {str, str2, new Float(f10), new Byte(z10 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Float.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.i.T1, new Class[]{String.class, String.class, cls, Boolean.TYPE}, cls);
        if (patchProxyResultProxy.isSupported) {
            return ((Float) patchProxyResultProxy.result).floatValue();
        }
        if (str == null || str2 == null) {
            return f10;
        }
        c(str);
        MMKV mmkvH = h(str);
        return mmkvH != null ? mmkvH.getFloat(a(z10, str2), f10) : f10;
    }

    public final int f(@e String str, @e String str2, int i10, boolean z10) {
        Object[] objArr = {str, str2, new Integer(i10), new Byte(z10 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.i.P1, new Class[]{String.class, String.class, cls, Boolean.TYPE}, cls);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        if (str == null || str2 == null) {
            return i10;
        }
        c(str);
        MMKV mmkvH = h(str);
        return mmkvH != null ? mmkvH.getInt(a(z10, str2), i10) : i10;
    }

    public final long g(@e String str, @e String str2, long j10, boolean z10) {
        Object[] objArr = {str, str2, new Long(j10), new Byte(z10 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Long.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.i.V1, new Class[]{String.class, String.class, cls, Boolean.TYPE}, cls);
        if (patchProxyResultProxy.isSupported) {
            return ((Long) patchProxyResultProxy.result).longValue();
        }
        if (str == null || str2 == null) {
            return j10;
        }
        c(str);
        MMKV mmkvH = h(str);
        return mmkvH != null ? mmkvH.getLong(a(z10, str2), j10) : j10;
    }

    @e
    public final String i(@e String str, @e String str2, @e String str3, boolean z10) {
        String string;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2, str3, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, bb.c.i.N1, new Class[]{String.class, String.class, String.class, Boolean.TYPE}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        if (str == null || str2 == null) {
            return str3;
        }
        c(str);
        MMKV mmkvH = h(str);
        return (mmkvH == null || (string = mmkvH.getString(a(z10, str2), str3)) == null) ? str3 : string;
    }

    public final void j(@d Application application) {
        if (PatchProxy.proxy(new Object[]{application}, this, changeQuickRedirect, false, bb.c.i.L1, new Class[]{Application.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(application, "application");
        MMKV.initialize(application);
        c("default");
    }

    public final void k(@e String str, @e String str2, boolean z10, boolean z11) {
        Object[] objArr = {str, str2, new Byte(z10 ? (byte) 1 : (byte) 0), new Byte(z11 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Boolean.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.i.Q1, new Class[]{String.class, String.class, cls, cls}, Void.TYPE).isSupported || str == null || str2 == null) {
            return;
        }
        c(str);
        MMKV mmkvH = h(str);
        String strA = a(z11, str2);
        if (mmkvH != null) {
            mmkvH.putBoolean(strA, z10);
        }
    }

    public final void l(@e String str, @e String str2, float f10, boolean z10) {
        if (PatchProxy.proxy(new Object[]{str, str2, new Float(f10), new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, bb.c.i.S1, new Class[]{String.class, String.class, Float.TYPE, Boolean.TYPE}, Void.TYPE).isSupported || str == null || str2 == null) {
            return;
        }
        c(str);
        MMKV mmkvH = h(str);
        String strA = a(z10, str2);
        if (mmkvH != null) {
            mmkvH.putFloat(strA, f10);
        }
    }

    public final void m(@e String str, @e String str2, int i10, boolean z10) {
        if (PatchProxy.proxy(new Object[]{str, str2, new Integer(i10), new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, bb.c.i.O1, new Class[]{String.class, String.class, Integer.TYPE, Boolean.TYPE}, Void.TYPE).isSupported || str == null || str2 == null) {
            return;
        }
        c(str);
        MMKV mmkvH = h(str);
        String strA = a(z10, str2);
        if (mmkvH != null) {
            mmkvH.putInt(strA, i10);
        }
    }

    public final void n(@e String str, @e String str2, long j10, boolean z10) {
        if (PatchProxy.proxy(new Object[]{str, str2, new Long(j10), new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, bb.c.i.U1, new Class[]{String.class, String.class, Long.TYPE, Boolean.TYPE}, Void.TYPE).isSupported || str == null || str2 == null) {
            return;
        }
        c(str);
        MMKV mmkvH = h(str);
        String strA = a(z10, str2);
        if (mmkvH != null) {
            mmkvH.putLong(strA, j10);
        }
    }

    public final void o(@e String str, @e String str2, @e String str3, boolean z10) {
        if (PatchProxy.proxy(new Object[]{str, str2, str3, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, bb.c.i.M1, new Class[]{String.class, String.class, String.class, Boolean.TYPE}, Void.TYPE).isSupported || str == null || str2 == null) {
            return;
        }
        c(str);
        MMKV mmkvH = h(str);
        String strA = a(z10, str2);
        if (mmkvH != null) {
            mmkvH.putString(strA, str3);
        }
    }
}
