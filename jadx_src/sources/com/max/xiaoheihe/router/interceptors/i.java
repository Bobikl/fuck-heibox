package com.max.xiaoheihe.router.interceptors;

import android.net.Uri;
import android.util.Log;
import com.max.hbcommon.bean.KeyDescObj;
import com.max.hbutils.bean.Result;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: MallOrderPathInterceptor.kt */
/* JADX INFO: loaded from: classes13.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
public final class i implements com.sankuai.waimai.router.core.h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f94982b = 0;
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f94983a = i.class.getSimpleName();

    /* JADX INFO: compiled from: MallOrderPathInterceptor.kt */
    public static final class a extends com.max.hbcommon.network.d<Result<KeyDescObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.sankuai.waimai.router.core.f f94984b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.sankuai.waimai.router.core.i f94985c;

        a(com.sankuai.waimai.router.core.f fVar, com.sankuai.waimai.router.core.i iVar) {
            this.f94984b = fVar;
            this.f94985c = iVar;
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 48125, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(e10, "e");
            this.f94984b.a();
        }

        public void onNext(@dl.d Result<KeyDescObj> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 48126, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(result, "result");
            if (!f0.g(result.getResult().getType(), "cart")) {
                this.f94984b.a();
            } else {
                this.f94985c.y(Uri.parse("hblink://universal/mall/order_detail_cart"));
                this.f94984b.onComplete(301);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 48127, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<KeyDescObj>) obj);
        }
    }

    @Override // com.sankuai.waimai.router.core.h
    public void a(@dl.d com.sankuai.waimai.router.core.i request, @dl.d com.sankuai.waimai.router.core.f callback) {
        if (PatchProxy.proxy(new Object[]{request, callback}, this, changeQuickRedirect, false, 48124, new Class[]{com.sankuai.waimai.router.core.i.class, com.sankuai.waimai.router.core.f.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(request, "request");
        f0.p(callback, "callback");
        Uri uriM = request.m();
        f0.o(uriM, "request.uri");
        String path = uriM.getPath();
        boolean zB = m.b(request, "definite_type", false);
        Log.d(this.f94983a, "Path: " + path);
        if (!f0.g(lb.d.X1, path) || zB) {
            callback.a();
        } else {
            Log.d(this.f94983a, "Parsing Uri");
            com.max.xiaoheihe.network.i.a().S7(m.g(request, "order_id")).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).g(new a(callback, request));
        }
    }

    public final String b() {
        return this.f94983a;
    }
}
