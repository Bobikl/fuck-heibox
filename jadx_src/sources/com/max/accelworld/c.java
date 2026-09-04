package com.max.accelworld;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: AccelWorldDimension.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class c {
    public static ChangeQuickRedirect changeQuickRedirect;

    public static final float a(float f10, @dl.d Context context) {
        Object[] objArr = {new Float(f10), context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Float.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, bb.c.b.f30866pf, new Class[]{cls, Context.class}, cls);
        if (patchProxyResultProxy.isSupported) {
            return ((Float) patchProxyResultProxy.result).floatValue();
        }
        f0.p(context, "context");
        return b(context, f10);
    }

    public static final float b(@dl.d Context context, float f10) {
        Object[] objArr = {context, new Float(f10)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Float.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, bb.c.b.f30843of, new Class[]{Context.class, cls}, cls);
        if (patchProxyResultProxy.isSupported) {
            return ((Float) patchProxyResultProxy.result).floatValue();
        }
        f0.p(context, "context");
        return f10 * context.getResources().getDisplayMetrics().density;
    }

    public static final int c(int i10, @dl.d Context context) {
        Object[] objArr = {new Integer(i10), context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, bb.c.b.f30911rf, new Class[]{cls, Context.class}, cls);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        f0.p(context, "context");
        return d(context, i10);
    }

    public static final int d(@dl.d Context context, int i10) {
        Object[] objArr = {context, new Integer(i10)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, bb.c.b.f30889qf, new Class[]{Context.class, cls}, cls);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        f0.p(context, "context");
        return (int) ((i10 * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public static final float e(float f10, @dl.d Context context) {
        Object[] objArr = {new Float(f10), context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Float.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, bb.c.b.f30999vf, new Class[]{cls, Context.class}, cls);
        if (patchProxyResultProxy.isSupported) {
            return ((Float) patchProxyResultProxy.result).floatValue();
        }
        f0.p(context, "context");
        return f(context, f10);
    }

    public static final float f(@dl.d Context context, float f10) {
        Object[] objArr = {context, new Float(f10)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Float.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, bb.c.b.f30977uf, new Class[]{Context.class, cls}, cls);
        if (patchProxyResultProxy.isSupported) {
            return ((Float) patchProxyResultProxy.result).floatValue();
        }
        f0.p(context, "context");
        return (f10 * context.getResources().getDisplayMetrics().density) / context.getResources().getDisplayMetrics().scaledDensity;
    }

    public static final int g(int i10, @dl.d Context context) {
        Object[] objArr = {new Integer(i10), context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, bb.c.b.f30955tf, new Class[]{cls, Context.class}, cls);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        f0.p(context, "context");
        return h(context, i10);
    }

    public static final int h(@dl.d Context context, int i10) {
        Object[] objArr = {context, new Integer(i10)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, bb.c.b.f30933sf, new Class[]{Context.class, cls}, cls);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        f0.p(context, "context");
        return (int) (((i10 * context.getResources().getDisplayMetrics().density) / context.getResources().getDisplayMetrics().scaledDensity) + 0.5f);
    }

    public static final float i(float f10, @dl.d Context context) {
        Object[] objArr = {new Float(f10), context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Float.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, bb.c.b.f31043xf, new Class[]{cls, Context.class}, cls);
        if (patchProxyResultProxy.isSupported) {
            return ((Float) patchProxyResultProxy.result).floatValue();
        }
        f0.p(context, "context");
        return j(context, f10);
    }

    public static final float j(@dl.d Context context, float f10) {
        Object[] objArr = {context, new Float(f10)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Float.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, bb.c.b.f31021wf, new Class[]{Context.class, cls}, cls);
        if (patchProxyResultProxy.isSupported) {
            return ((Float) patchProxyResultProxy.result).floatValue();
        }
        f0.p(context, "context");
        return f10 / context.getResources().getDisplayMetrics().density;
    }

    public static final int k(int i10, @dl.d Context context) {
        Object[] objArr = {new Integer(i10), context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, bb.c.b.f31087zf, new Class[]{cls, Context.class}, cls);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        f0.p(context, "context");
        return l(context, i10);
    }

    public static final int l(@dl.d Context context, int i10) {
        Object[] objArr = {context, new Integer(i10)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, bb.c.b.f31065yf, new Class[]{Context.class, cls}, cls);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        f0.p(context, "context");
        return (int) ((i10 / context.getResources().getDisplayMetrics().density) + 0.5f);
    }
}
