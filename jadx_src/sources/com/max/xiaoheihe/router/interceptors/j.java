package com.max.xiaoheihe.router.interceptors;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.max.xiaoheihe.module.account.MeHomeActivity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: MeHomePathInterceptor.kt */
/* JADX INFO: loaded from: classes13.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
public final class j implements com.sankuai.waimai.router.core.h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f94986b = 0;
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f94987a = j.class.getSimpleName();

    @Override // com.sankuai.waimai.router.core.h
    public void a(@dl.d com.sankuai.waimai.router.core.i request, @dl.d com.sankuai.waimai.router.core.f callback) {
        Bundle arguments;
        String string;
        String stringExtra;
        if (PatchProxy.proxy(new Object[]{request, callback}, this, changeQuickRedirect, false, 48128, new Class[]{com.sankuai.waimai.router.core.i.class, com.sankuai.waimai.router.core.f.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(request, "request");
        f0.p(callback, "callback");
        com.max.hbcommon.analytics.l lVar = com.max.hbcommon.analytics.l.f66572a;
        Object objB = lVar.b();
        m.l(request, MeHomeActivity.O, lVar.e());
        if (com.max.hbcommon.utils.c.u(m.g(request, "h_src"))) {
            if (objB instanceof Activity) {
                Intent intent = ((Activity) objB).getIntent();
                if (intent != null && (stringExtra = intent.getStringExtra("h_src")) != null) {
                    m.l(request, "h_src", stringExtra);
                }
            } else if ((objB instanceof Fragment) && (arguments = ((Fragment) objB).getArguments()) != null && (string = arguments.getString("h_src")) != null) {
                m.l(request, "h_src", string);
            }
        }
        callback.a();
    }

    public final String b() {
        return this.f94987a;
    }
}
