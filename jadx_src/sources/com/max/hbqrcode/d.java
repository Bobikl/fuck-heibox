package com.max.hbqrcode;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.max.hbpermission.PermissionManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.waimai.router.core.f;
import com.sankuai.waimai.router.core.h;
import com.sankuai.waimai.router.core.i;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: ScanPathInterceptor.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class d implements h {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: compiled from: ScanPathInterceptor.kt */
    public static final class a implements com.max.hbpermission.a {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ f f71866a;

        a(f fVar) {
            this.f71866a = fVar;
        }

        @Override // com.max.hbpermission.a
        public void h() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.k.K0, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            this.f71866a.onComplete(500);
        }

        @Override // com.max.hbpermission.a
        public void onSuccess() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.k.J0, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            this.f71866a.a();
        }
    }

    @Override // com.sankuai.waimai.router.core.h
    public void a(@dl.d i request, @dl.d f callback) {
        if (PatchProxy.proxy(new Object[]{request, callback}, this, changeQuickRedirect, false, bb.c.k.I0, new Class[]{i.class, f.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(request, "request");
        f0.p(callback, "callback");
        if (!(request.b() instanceof FragmentActivity)) {
            callback.onComplete(500);
            return;
        }
        PermissionManager permissionManager = PermissionManager.f71603a;
        Context contextB = request.b();
        f0.n(contextB, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        permissionManager.U((FragmentActivity) contextB, new a(callback));
    }
}
