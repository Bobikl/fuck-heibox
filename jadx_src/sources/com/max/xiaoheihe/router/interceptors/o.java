package com.max.xiaoheihe.router.interceptors;

import android.content.Context;
import android.net.Uri;
import android.util.Log;
import com.max.hbcommon.bean.KeyDescObj;
import com.max.hbutils.bean.Result;
import com.max.xiaoheihe.bean.WebProtocolObj;
import com.max.xiaoheihe.module.game.nswitch.SwitchDetailActivity;
import com.max.xiaoheihe.router.protocol.HeyboxWebProtocolHandler;
import com.max.xiaoheihe.utils.l0;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.Arrays;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.v0;

/* JADX INFO: compiled from: SwitchDetailInterceptor.kt */
/* JADX INFO: loaded from: classes13.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
public final class o implements com.sankuai.waimai.router.core.h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f94994b = 0;
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f94995a = o.class.getSimpleName();

    /* JADX INFO: compiled from: SwitchDetailInterceptor.kt */
    public static final class a extends com.max.hbcommon.network.d<Result<KeyDescObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.sankuai.waimai.router.core.f f94996b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.sankuai.waimai.router.core.i f94997c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f94998d;

        a(com.sankuai.waimai.router.core.f fVar, com.sankuai.waimai.router.core.i iVar, String str) {
            this.f94996b = fVar;
            this.f94997c = iVar;
            this.f94998d = str;
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 48195, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(e10, "e");
            this.f94996b.a();
        }

        public void onNext(@dl.d Result<KeyDescObj> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 48196, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(result, "result");
            if (!f0.g(result.getResult().getType(), "web")) {
                if (!f0.g(SwitchDetailActivity.P, result.getResult().getType())) {
                    this.f94996b.a();
                    return;
                }
                Context contextB = this.f94997c.b();
                f0.o(contextB, "request.context");
                com.max.xiaoheihe.base.router.b.k0(contextB, result.getResult().getProtocol());
                return;
            }
            HeyboxWebProtocolHandler heyboxWebProtocolHandler = l0.f95687b;
            Context contextB2 = this.f94997c.b();
            f0.o(contextB2, "request.context");
            v0 v0Var = v0.f124986a;
            String SWITCH_JP_ACCOUNT = lb.a.f131000l4;
            f0.o(SWITCH_JP_ACCOUNT, "SWITCH_JP_ACCOUNT");
            String str = String.format(SWITCH_JP_ACCOUNT, Arrays.copyOf(new Object[]{this.f94998d}, 1));
            f0.o(str, "format(format, *args)");
            WebProtocolObj webProtocolObjA = l0.A(str, null, false, true, true, false);
            f0.o(webProtocolObjA, "getOpenWindowWebProtocol…                        )");
            heyboxWebProtocolHandler.C(contextB2, null, webProtocolObjA, null);
            this.f94996b.onComplete(200);
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 48197, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<KeyDescObj>) obj);
        }
    }

    @Override // com.sankuai.waimai.router.core.h
    public void a(@dl.d com.sankuai.waimai.router.core.i request, @dl.d com.sankuai.waimai.router.core.f callback) {
        if (PatchProxy.proxy(new Object[]{request, callback}, this, changeQuickRedirect, false, 48194, new Class[]{com.sankuai.waimai.router.core.i.class, com.sankuai.waimai.router.core.f.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(request, "request");
        f0.p(callback, "callback");
        Uri uriM = request.m();
        f0.o(uriM, "request.uri");
        String path = uriM.getPath();
        Log.d(this.f94995a, "Path: " + path);
        Log.d(this.f94995a, "Parsing Uri");
        String strG = m.g(request, "user_id");
        String strG2 = m.g(request, "type");
        String strG3 = m.g(request, SwitchDetailActivity.P);
        if (strG2 == null || strG2.length() == 0) {
            com.max.xiaoheihe.network.i.a().Pa(strG).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).g(new a(callback, request, strG));
            return;
        }
        if (!f0.g("web", strG2)) {
            if (!f0.g(SwitchDetailActivity.P, strG2)) {
                callback.a();
                return;
            }
            Context contextB = request.b();
            f0.o(contextB, "request.context");
            com.max.xiaoheihe.base.router.b.k0(contextB, strG3);
            return;
        }
        HeyboxWebProtocolHandler heyboxWebProtocolHandler = l0.f95687b;
        Context contextB2 = request.b();
        f0.o(contextB2, "request.context");
        v0 v0Var = v0.f124986a;
        String SWITCH_JP_ACCOUNT = lb.a.f131000l4;
        f0.o(SWITCH_JP_ACCOUNT, "SWITCH_JP_ACCOUNT");
        String str = String.format(SWITCH_JP_ACCOUNT, Arrays.copyOf(new Object[]{strG}, 1));
        f0.o(str, "format(format, *args)");
        WebProtocolObj webProtocolObjA = l0.A(str, null, false, true, true, false);
        f0.o(webProtocolObjA, "getOpenWindowWebProtocol…lse\n                    )");
        heyboxWebProtocolHandler.C(contextB2, null, webProtocolObjA, null);
        callback.onComplete(200);
    }

    public final String b() {
        return this.f94995a;
    }
}
