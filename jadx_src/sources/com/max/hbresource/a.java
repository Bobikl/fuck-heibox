package com.max.hbresource;

import android.content.Context;
import android.graphics.Typeface;
import android.util.Log;
import androidx.annotation.y;
import androidx.core.content.res.i;
import bb.c;
import com.max.hbdatastore.HBPreferences;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import java.lang.reflect.Field;
import java.util.HashMap;
import kotlin.jvm.internal.f0;
import xh.e;
import xh.m;

/* JADX INFO: compiled from: FontProvider.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class a {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @d
    private static final String f71896d = "system_font";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static Context f71898f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @d
    public static final a f71893a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @e
    public static final int f71894b = R.font.mi_sans_regular_lite;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @e
    public static final int f71895c = R.font.mi_sans_medium_lite;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @d
    private static final HashMap<Integer, Typeface> f71897e = new HashMap<>();

    private a() {
    }

    @m
    private static /* synthetic */ void b() {
    }

    private final Typeface e(Context context, @y int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, new Integer(i10)}, this, changeQuickRedirect, false, c.k.f33422a1, new Class[]{Context.class, Integer.TYPE}, Typeface.class);
        if (patchProxyResultProxy.isSupported) {
            return (Typeface) patchProxyResultProxy.result;
        }
        Typeface typefaceJ = i.j(context, i10);
        f71897e.put(Integer.valueOf(i10), typefaceJ);
        return typefaceJ;
    }

    private final void f() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.k.Z0, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        if (d()) {
            Typeface typeface = Typeface.DEFAULT;
            try {
                Log.i("FontProvider", "使用系统字体");
                Field declaredField = Typeface.class.getDeclaredField("SERIF");
                declaredField.setAccessible(true);
                declaredField.set(null, typeface);
                Field declaredField2 = Typeface.class.getDeclaredField("SANS_SERIF");
                declaredField2.setAccessible(true);
                declaredField2.set(null, typeface);
                return;
            } catch (Exception e10) {
                e10.printStackTrace();
                return;
            }
        }
        try {
            Log.i("FontProvider", "使用自定义字体");
            Typeface typefaceA = a(f71895c);
            Typeface typefaceA2 = a(f71894b);
            Field declaredField3 = Typeface.class.getDeclaredField("SERIF");
            declaredField3.setAccessible(true);
            declaredField3.set(null, typefaceA2);
            Field declaredField4 = Typeface.class.getDeclaredField("SANS_SERIF");
            declaredField4.setAccessible(true);
            declaredField4.set(null, typefaceA);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @dl.e
    public final Typeface a(@y int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, c.k.Y0, new Class[]{Integer.TYPE}, Typeface.class);
        if (patchProxyResultProxy.isSupported) {
            return (Typeface) patchProxyResultProxy.result;
        }
        if (d()) {
            return Typeface.DEFAULT;
        }
        Typeface typeface = f71897e.get(Integer.valueOf(i10));
        if (typeface != null) {
            return typeface;
        }
        Context context = f71898f;
        if (context == null) {
            f0.S("appContext");
            context = null;
        }
        return e(context, i10);
    }

    public final void c(@d Context app) {
        if (PatchProxy.proxy(new Object[]{app}, this, changeQuickRedirect, false, c.k.V0, new Class[]{Context.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(app, "app");
        f71898f = app;
        e(app, f71894b);
        e(app, f71895c);
        f();
    }

    public final boolean d() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.k.W0, new Class[0], Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        HBPreferences hBPreferences = HBPreferences.f69810a;
        Context context = f71898f;
        if (context == null) {
            f0.S("appContext");
            context = null;
        }
        return ((Boolean) hBPreferences.s(hBPreferences.u(context), f71896d, Boolean.FALSE)).booleanValue();
    }

    public final void g(boolean z10) throws InterruptedException {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, c.k.X0, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        HBPreferences hBPreferences = HBPreferences.f69810a;
        Context context = f71898f;
        if (context == null) {
            f0.S("appContext");
            context = null;
        }
        hBPreferences.C(hBPreferences.u(context), f71896d, Boolean.valueOf(z10));
    }
}
