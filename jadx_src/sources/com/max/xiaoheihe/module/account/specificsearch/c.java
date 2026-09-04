package com.max.xiaoheihe.module.account.specificsearch;

import android.net.Uri;
import android.util.Log;
import androidx.compose.runtime.internal.o;
import com.max.xiaoheihe.router.interceptors.m;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.waimai.router.core.f;
import com.sankuai.waimai.router.core.h;
import com.sankuai.waimai.router.core.i;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: UserCenteredSearchInterceptor.kt */
/* JADX INFO: loaded from: classes9.dex */
@o(parameters = 0)
public final class c implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f79263a = 0;
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.sankuai.waimai.router.core.h
    public void a(@dl.d i request, @dl.d f callback) {
        int iHashCode;
        if (PatchProxy.proxy(new Object[]{request, callback}, this, changeQuickRedirect, false, 25351, new Class[]{i.class, f.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(request, "request");
        f0.p(callback, "callback");
        Uri uriM = request.m();
        f0.o(uriM, "request.uri");
        String path = uriM.getPath();
        Log.d("UserCenteredSearchInterceptor-dbg", "Path: " + path + ", uri: " + uriM + ", request.fields : " + request.f());
        if (path == null || ((iHashCode = path.hashCode()) == -908820524 ? !path.equals(lb.d.H) : !(iHashCode == 1166926108 ? path.equals(lb.d.G) : iHashCode == 1475263227 && path.equals(lb.d.F)))) {
            callback.a();
            return;
        }
        m.l(request, UserCenteredSearchActivity.R, path);
        request.y(Uri.parse("hblink://universal/search/user_centered_search"));
        callback.onComplete(301);
    }
}
