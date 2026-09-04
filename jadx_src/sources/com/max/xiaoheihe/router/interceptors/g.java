package com.max.xiaoheihe.router.interceptors;

import android.net.Uri;
import android.util.Log;
import com.max.xiaoheihe.utils.c0;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: HomePathInterceptor.kt */
/* JADX INFO: loaded from: classes13.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
public final class g implements com.sankuai.waimai.router.core.h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f94973b = 0;
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f94974a = g.class.getSimpleName();

    /* JADX WARN: Code duplicated, block: B:34:0x00c3 A[ADDED_TO_REGION, REMOVE] */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.io.Serializable, java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.io.Serializable, java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.io.Serializable, java.lang.String[]] */
    @Override // com.sankuai.waimai.router.core.h
    public void a(@dl.d com.sankuai.waimai.router.core.i request, @dl.d com.sankuai.waimai.router.core.f callback) {
        if (PatchProxy.proxy(new Object[]{request, callback}, this, changeQuickRedirect, false, 48118, new Class[]{com.sankuai.waimai.router.core.i.class, com.sankuai.waimai.router.core.f.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(request, "request");
        f0.p(callback, "callback");
        Uri uriM = request.m();
        f0.o(uriM, "request.uri");
        String path = uriM.getPath();
        Log.d(this.f94974a, "Path: " + path);
        if (path == null) {
            m.k(request, "pages", c0.e(path));
        } else {
            int iHashCode = path.hashCode();
            if (iHashCode != -1888392978) {
                if (iHashCode != 46613902) {
                    if (iHashCode == 65834537 && path.equals("/bbs/list") && c0.e(path) == null) {
                        request.y(Uri.parse("hblink://universal/bbs/topic/list"));
                        callback.onComplete(301);
                        return;
                    }
                    m.k(request, "pages", c0.e(path));
                } else if (path.equals(lb.d.f131204m)) {
                    callback.a();
                } else {
                    m.k(request, "pages", c0.e(path));
                }
            } else {
                if (path.equals("/game/comment_recommend") && c0.e(path) == null) {
                    request.y(Uri.parse("hblink://universal/game/comment_recommend_ind"));
                    callback.onComplete(301);
                    return;
                }
                m.k(request, "pages", c0.e(path));
            }
        }
        callback.a();
    }

    public final String b() {
        return this.f94974a;
    }
}
