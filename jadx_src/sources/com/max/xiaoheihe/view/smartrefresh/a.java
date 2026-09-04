package com.max.xiaoheihe.view.smartrefresh;

import android.content.Context;
import androidx.annotation.n0;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import ng.f;
import ng.g;
import ng.j;

/* JADX INFO: compiled from: SmartRefreshInitializer.java */
/* JADX INFO: loaded from: classes13.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static boolean f96153a = false;
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: com.max.xiaoheihe.view.smartrefresh.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: SmartRefreshInitializer.java */
    public class C0912a implements ng.c {
        public static ChangeQuickRedirect changeQuickRedirect;

        C0912a() {
        }

        @Override // ng.c
        public void a(@n0 Context context, @n0 j jVar) {
            if (PatchProxy.proxy(new Object[]{context, jVar}, this, changeQuickRedirect, false, 49703, new Class[]{Context.class, j.class}, Void.TYPE).isSupported) {
                return;
            }
            jVar.z(250);
        }
    }

    /* JADX INFO: compiled from: SmartRefreshInitializer.java */
    public class b implements ng.b {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // ng.b
        public g a(Context context, j jVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, jVar}, this, changeQuickRedirect, false, 49704, new Class[]{Context.class, j.class}, g.class);
            return patchProxyResultProxy.isSupported ? (g) patchProxyResultProxy.result : new HeyBoxHeaderV2(context);
        }
    }

    /* JADX INFO: compiled from: SmartRefreshInitializer.java */
    public class c implements ng.a {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // ng.a
        public f a(Context context, j jVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, jVar}, this, changeQuickRedirect, false, 49705, new Class[]{Context.class, j.class}, f.class);
            return patchProxyResultProxy.isSupported ? (f) patchProxyResultProxy.result : new HeyBoxFooterV2(context);
        }
    }

    public static void a() {
        if (PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 49702, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        SmartRefreshLayout.setDefaultRefreshInitializer(new C0912a());
        SmartRefreshLayout.setDefaultRefreshHeaderCreator(new b());
        SmartRefreshLayout.setDefaultRefreshFooterCreator(new c());
    }
}
