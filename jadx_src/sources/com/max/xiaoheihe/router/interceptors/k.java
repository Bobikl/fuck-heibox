package com.max.xiaoheihe.router.interceptors;

import android.net.Uri;
import android.util.Log;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: MessageCenterInterceptor.kt */
/* JADX INFO: loaded from: classes13.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
public final class k implements com.sankuai.waimai.router.core.h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f94988b = 0;
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f94989a = k.class.getSimpleName();

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.sankuai.waimai.router.core.h
    public void a(@dl.d com.sankuai.waimai.router.core.i request, @dl.d com.sankuai.waimai.router.core.f callback) {
        if (PatchProxy.proxy(new Object[]{request, callback}, this, changeQuickRedirect, false, 48137, new Class[]{com.sankuai.waimai.router.core.i.class, com.sankuai.waimai.router.core.f.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(request, "request");
        f0.p(callback, "callback");
        Uri uriM = request.m();
        f0.o(uriM, "request.uri");
        String path = uriM.getPath();
        String strG = m.g(request, "list_type");
        String strG2 = m.g(request, "message_type");
        Log.d(this.f94989a, "Path: " + path);
        if (path != null) {
            switch (path.hashCode()) {
                case -2129234740:
                    if (path.equals(lb.d.A4) && strG == null) {
                        m.l(request, "list_type", "0");
                    }
                    break;
                case -1688750070:
                    if (path.equals(lb.d.f131300z4) && strG == null) {
                        m.l(request, "list_type", "1");
                    }
                    break;
                case -1622637188:
                    if (path.equals(lb.d.f131279w4) && strG == null) {
                        m.l(request, "list_type", "2");
                    }
                    break;
                case -675564636:
                    if (path.equals(lb.d.C4) && strG2 == null) {
                        m.l(request, "message_type", "4");
                    }
                    break;
                case -127502938:
                    if (path.equals(lb.d.G4) && strG2 == null) {
                        m.l(request, "message_type", "16");
                    }
                    break;
                case 229516657:
                    if (path.equals(lb.d.D4) && strG == null) {
                        m.l(request, "list_type", "9");
                    }
                    break;
            }
        }
        callback.a();
    }

    public final String b() {
        return this.f94989a;
    }
}
