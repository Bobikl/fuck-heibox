package com.max.xiaoheihe.module.account.debug;

import android.content.Intent;
import android.net.Uri;
import com.google.gson.JsonObject;
import com.max.hbutils.bean.Result;
import com.max.hbutils.core.BaseApplication;
import com.max.hbutils.utils.c;
import com.max.hbutils.utils.k;
import com.max.heybox.hblog.g;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;

/* JADX INFO: compiled from: DebugTagConfig.kt */
/* JADX INFO: loaded from: classes9.dex */
@t0({"SMAP\nDebugTagConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DebugTagConfig.kt\ncom/max/xiaoheihe/module/account/debug/DebugTagConfig\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,101:1\n1747#2,3:102\n*S KotlinDebug\n*F\n+ 1 DebugTagConfig.kt\ncom/max/xiaoheihe/module/account/debug/DebugTagConfig\n*L\n80#1:102,3\n*E\n"})
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @d
    public static final a f78923a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @e
    private static DebugTagModel f78924b;
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: com.max.xiaoheihe.module.account.debug.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: DebugTagConfig.kt */
    public static final class C0652a extends com.max.hbcommon.network.d<Result<JsonObject>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        C0652a() {
        }

        public void onNext(@d Result<JsonObject> t10) {
            if (PatchProxy.proxy(new Object[]{t10}, this, changeQuickRedirect, false, 24947, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(t10, "t");
            c.f("配置更新成功");
            com.max.hbcache.c.x(com.max.hbcache.c.f66147s0, k.p(t10.getResult()));
            a.a(a.f78923a);
            BaseApplication.a().sendBroadcast(new Intent(lb.a.f130978i0));
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 24948, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<JsonObject>) obj);
        }
    }

    private a() {
    }

    public static final /* synthetic */ void a(a aVar) {
        if (PatchProxy.proxy(new Object[]{aVar}, null, changeQuickRedirect, true, 24946, new Class[]{a.class}, Void.TYPE).isSupported) {
            return;
        }
        aVar.g();
    }

    private final void c(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 24940, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
    }

    private final void g() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 24941, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        String strF = com.max.hbcache.c.f(com.max.hbcache.c.f66147s0, "");
        f0.m(strF);
        if (strF.length() > 0) {
            f78924b = (DebugTagModel) k.a(strF, DebugTagModel.class);
        }
    }

    public final boolean b(@d String text) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{text}, this, changeQuickRedirect, false, 24939, new Class[]{String.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        f0.p(text, "text");
        Matcher matcher = Pattern.compile("hbcfg:/([A-Za-z0-9+/=]+)").matcher(text);
        if (!matcher.find()) {
            return false;
        }
        String strGroup = matcher.group(1);
        f0.m(strGroup);
        c(strGroup);
        return true;
    }

    public final void d() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 24945, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        com.max.hbcache.c.x(com.max.hbcache.c.f66147s0, "");
        f78924b = null;
    }

    @d
    public final String e() {
        String strF;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 24944, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        DebugTagModel debugTagModel = f78924b;
        return (debugTagModel == null || (strF = debugTagModel.f()) == null) ? f() : strF;
    }

    @d
    public final String f() {
        String strH;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 24943, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        DebugTagModel debugTagModel = f78924b;
        return (debugTagModel == null || (strH = debugTagModel.h()) == null) ? "自动" : strH;
    }

    @d
    public final String h(@d String url) {
        Boolean boolValueOf;
        DebugTagRoute debugTagRoute;
        boolean z10 = true;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{url}, this, changeQuickRedirect, false, 24942, new Class[]{String.class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        f0.p(url, "url");
        if (f78924b == null) {
            g();
        }
        if (f78924b == null) {
            return "";
        }
        g.a aVar = g.f74531b;
        aVar.q("[DebugTagConfig] url: " + url);
        Uri uri = Uri.parse(url);
        aVar.q("[DebugTagConfig] uri: " + uri);
        DebugTagModel debugTagModel = f78924b;
        f0.m(debugTagModel);
        ArrayList<DebugTagRoute> arrayListG = debugTagModel.g();
        if (arrayListG != null) {
            if (!arrayListG.isEmpty()) {
                Iterator<T> it = arrayListG.iterator();
                do {
                    if (!it.hasNext()) {
                        z10 = false;
                        break;
                    }
                    debugTagRoute = (DebugTagRoute) it.next();
                } while (!(f0.g(debugTagRoute.e(), uri.getHost()) && f0.g(debugTagRoute.f(), uri.getPath())));
            } else {
                z10 = false;
                break;
            }
            boolValueOf = Boolean.valueOf(z10);
        } else {
            boolValueOf = null;
        }
        if (!f0.g(boolValueOf, Boolean.TRUE)) {
            return "";
        }
        DebugTagModel debugTagModel2 = f78924b;
        f0.m(debugTagModel2);
        return debugTagModel2.h();
    }
}
