package com.max.hbcommon.utils;

import android.content.Context;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.ArrayList;
import kotlin.b2;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: ImageViewerP.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class ImageViewerP {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final a f68181a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private static yh.r<? super Context, ? super String[], ? super ArrayList<View>, ? super Integer, b2> f68182b = new yh.r<Context, String[], ArrayList<View>, Integer, b2>() { // from class: com.max.hbcommon.utils.ImageViewerP$Companion$showIVAction$1
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX WARN: Type inference failed for: r10v3, types: [java.lang.Object, kotlin.b2] */
        @Override // yh.r
        public /* bridge */ /* synthetic */ b2 U0(Context context, String[] strArr, ArrayList<View> arrayList, Integer num) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, strArr, arrayList, num}, this, changeQuickRedirect, false, bb.c.f.N0, new Class[]{Object.class, Object.class, Object.class, Object.class}, Object.class);
            if (patchProxyResultProxy.isSupported) {
                return patchProxyResultProxy.result;
            }
            a(context, strArr, arrayList, num.intValue());
            return b2.f124493a;
        }

        public final void a(@dl.d Context context, @dl.d String[] strArr, @dl.d ArrayList<View> arrayList, int i10) {
            if (PatchProxy.proxy(new Object[]{context, strArr, arrayList, new Integer(i10)}, this, changeQuickRedirect, false, bb.c.f.M0, new Class[]{Context.class, String[].class, ArrayList.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(context, "<anonymous parameter 0>");
            f0.p(strArr, "<anonymous parameter 1>");
            f0.p(arrayList, "<anonymous parameter 2>");
        }
    };
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: compiled from: ImageViewerP.kt */
    public static final class a {
        public static ChangeQuickRedirect changeQuickRedirect;

        private a() {
        }

        public /* synthetic */ a(u uVar) {
            this();
        }

        @xh.m
        public static /* synthetic */ void b() {
        }

        @dl.d
        public final yh.r<Context, String[], ArrayList<View>, Integer, b2> a() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.J0, new Class[0], yh.r.class);
            return patchProxyResultProxy.isSupported ? (yh.r) patchProxyResultProxy.result : ImageViewerP.f68182b;
        }

        public final void c(@dl.d yh.r<? super Context, ? super String[], ? super ArrayList<View>, ? super Integer, b2> rVar) {
            if (PatchProxy.proxy(new Object[]{rVar}, this, changeQuickRedirect, false, bb.c.f.K0, new Class[]{yh.r.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(rVar, "<set-?>");
            ImageViewerP.f68182b = rVar;
        }

        @xh.m
        public final void d(@dl.d Context context, @dl.d String[] urlList, @dl.d ArrayList<View> viewList, int i10) {
            if (PatchProxy.proxy(new Object[]{context, urlList, viewList, new Integer(i10)}, this, changeQuickRedirect, false, bb.c.f.L0, new Class[]{Context.class, String[].class, ArrayList.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(context, "context");
            f0.p(urlList, "urlList");
            f0.p(viewList, "viewList");
            a().U0(context, urlList, viewList, Integer.valueOf(i10));
        }
    }

    @dl.d
    public static final yh.r<Context, String[], ArrayList<View>, Integer, b2> c() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, bb.c.f.G0, new Class[0], yh.r.class);
        return patchProxyResultProxy.isSupported ? (yh.r) patchProxyResultProxy.result : f68181a.a();
    }

    public static final void d(@dl.d yh.r<? super Context, ? super String[], ? super ArrayList<View>, ? super Integer, b2> rVar) {
        if (PatchProxy.proxy(new Object[]{rVar}, null, changeQuickRedirect, true, bb.c.f.H0, new Class[]{yh.r.class}, Void.TYPE).isSupported) {
            return;
        }
        f68181a.c(rVar);
    }

    @xh.m
    public static final void e(@dl.d Context context, @dl.d String[] strArr, @dl.d ArrayList<View> arrayList, int i10) {
        if (PatchProxy.proxy(new Object[]{context, strArr, arrayList, new Integer(i10)}, null, changeQuickRedirect, true, bb.c.f.I0, new Class[]{Context.class, String[].class, ArrayList.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        f68181a.d(context, strArr, arrayList, i10);
    }
}
