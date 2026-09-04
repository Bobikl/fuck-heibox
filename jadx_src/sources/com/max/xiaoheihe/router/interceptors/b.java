package com.max.xiaoheihe.router.interceptors;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.util.Log;
import androidx.appcompat.app.AppCompatActivity;
import com.max.xiaoheihe.module.bbs.ChannelsDetailActivity;
import com.max.xiaoheihe.module.game.GameImpressionDialogFragment;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: ChannelPathInterceptor.kt */
/* JADX INFO: loaded from: classes13.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
public final class b implements com.sankuai.waimai.router.core.h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f94961b = 0;
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f94962a = b.class.getSimpleName();

    /* JADX INFO: compiled from: ChannelPathInterceptor.kt */
    public static final class a implements GameImpressionDialogFragment.b {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.sankuai.waimai.router.core.i f94963a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f94964b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ AppCompatActivity f94965c;

        a(com.sankuai.waimai.router.core.i iVar, String str, AppCompatActivity appCompatActivity) {
            this.f94963a = iVar;
            this.f94964b = str;
            this.f94965c = appCompatActivity;
        }

        @Override // com.max.xiaoheihe.module.game.GameImpressionDialogFragment.b
        public void a() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 48113, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            Context contextB = this.f94963a.b();
            f0.o(contextB, "request.context");
            com.sankuai.waimai.router.common.c cVarK = com.max.xiaoheihe.base.router.b.k(contextB, this.f94964b, 0, null, true);
            if (this.f94965c instanceof ChannelsDetailActivity) {
                cVarK.C(1);
            }
            cVarK.A();
        }
    }

    @Override // com.sankuai.waimai.router.core.h
    public void a(@dl.d com.sankuai.waimai.router.core.i request, @dl.d com.sankuai.waimai.router.core.f callback) {
        AppCompatActivity appCompatActivity;
        int iC;
        if (PatchProxy.proxy(new Object[]{request, callback}, this, changeQuickRedirect, false, 48112, new Class[]{com.sankuai.waimai.router.core.i.class, com.sankuai.waimai.router.core.f.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(request, "request");
        f0.p(callback, "callback");
        Uri uriM = request.m();
        f0.o(uriM, "request.uri");
        String path = uriM.getPath();
        Log.d(this.f94962a, "Path: " + path);
        if (f0.g(path, lb.d.X2)) {
            m.l(request, "page", "game");
            String strG = m.g(request, "app_id");
            if ((strG == null || strG.length() == 0) && (iC = m.c(request, "app_id", -1)) != -1) {
                m.l(request, "app_id", String.valueOf(iC));
            }
            callback.a();
            return;
        }
        if (!f0.g(path, lb.d.Z2)) {
            callback.a();
            return;
        }
        String strG2 = m.g(request, "app_id");
        if (strG2 != null) {
            if (request.b() instanceof AppCompatActivity) {
                Context contextB = request.b();
                f0.n(contextB, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
                appCompatActivity = (AppCompatActivity) contextB;
            } else {
                Activity activityA = com.max.hbutils.utils.e.b().a();
                f0.n(activityA, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
                appCompatActivity = (AppCompatActivity) activityA;
            }
            GameImpressionDialogFragment gameImpressionDialogFragmentA = GameImpressionDialogFragment.f84468q.a(strG2);
            gameImpressionDialogFragmentA.f4(new a(request, strG2, appCompatActivity));
            gameImpressionDialogFragmentA.show(appCompatActivity.getSupportFragmentManager(), "GameImpressionDialogFragment");
            callback.onComplete(200);
        }
    }

    public final String b() {
        return this.f94962a;
    }
}
