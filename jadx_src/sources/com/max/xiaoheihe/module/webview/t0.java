package com.max.xiaoheihe.module.webview;

import com.max.hbutils.bean.Result;
import com.max.xiaoheihe.bean.WhiteHostnamesResult;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: compiled from: WhiteHostnamesManager.kt */
/* JADX INFO: loaded from: classes12.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
public final class t0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    public static final String f94780b = "white_list";
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final t0 f94779a = new t0();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private static List<String> f94781c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f94782d = 8;

    /* JADX INFO: compiled from: WhiteHostnamesManager.kt */
    public static final class a extends com.max.hbcommon.network.d<WhiteHostnamesResult> {
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        public void a(@dl.d WhiteHostnamesResult result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 47490, new Class[]{WhiteHostnamesResult.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(result, "result");
            t0 t0Var = t0.f94779a;
            t0.b(t0Var, result);
            t0.a(t0Var, result.getWhite_hostnames_version());
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 47489, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(e10, "e");
            t0.a(t0.f94779a, null);
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 47491, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            a((WhiteHostnamesResult) obj);
        }
    }

    /* JADX INFO: compiled from: WhiteHostnamesManager.kt */
    public static final class b extends com.max.hbcommon.network.d<Result<WhiteHostnamesResult>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        public void onNext(@dl.d Result<WhiteHostnamesResult> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 47492, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(result, "result");
            if (result.getResult().getWhite_hostnames() != null) {
                t0.b(t0.f94779a, result.getResult());
                com.max.hbcache.b.h(t0.f94780b, result.getResult());
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 47493, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<WhiteHostnamesResult>) obj);
        }
    }

    private t0() {
    }

    public static final /* synthetic */ void a(t0 t0Var, String str) {
        if (PatchProxy.proxy(new Object[]{t0Var, str}, null, changeQuickRedirect, true, 47487, new Class[]{t0.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        t0Var.h(str);
    }

    public static final /* synthetic */ void b(t0 t0Var, WhiteHostnamesResult whiteHostnamesResult) {
        if (PatchProxy.proxy(new Object[]{t0Var, whiteHostnamesResult}, null, changeQuickRedirect, true, 47488, new Class[]{t0.class, WhiteHostnamesResult.class}, Void.TYPE).isSupported) {
            return;
        }
        t0Var.j(whiteHostnamesResult);
    }

    @xh.m
    public static final boolean e(@dl.e String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 47486, new Class[]{String.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (str != null) {
            return Pattern.compile("(.*\\.)?(maxjia.com|xiaoheihe.cn|max-c.com|dotamax.com|debugmode.cn|mall.heybox.hk)$").matcher(str).matches();
        }
        return false;
    }

    @xh.m
    public static final boolean f(@dl.e String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 47485, new Class[]{String.class}, Boolean.TYPE);
        return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : e(com.max.xiaoheihe.utils.l0.s(str));
    }

    private final void h(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 47483, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        com.max.xiaoheihe.network.i.a().v5(str).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).g(new b());
    }

    private final void j(WhiteHostnamesResult whiteHostnamesResult) {
        List<String> white_hostnames;
        if (PatchProxy.proxy(new Object[]{whiteHostnamesResult}, this, changeQuickRedirect, false, 47482, new Class[]{WhiteHostnamesResult.class}, Void.TYPE).isSupported || whiteHostnamesResult == null || (white_hostnames = whiteHostnamesResult.getWhite_hostnames()) == null) {
            return;
        }
        f94781c.clear();
        f94781c.addAll(white_hostnames);
    }

    @dl.d
    public final List<String> c() {
        return f94781c;
    }

    public final void d() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 47481, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        com.max.hbcache.b.a(f94780b, WhiteHostnamesResult.class).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).g(new a());
    }

    public final boolean g(@dl.e String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 47484, new Class[]{String.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (str == null || str.length() == 0) {
            return false;
        }
        if (e(str)) {
            return true;
        }
        if (com.max.hbcommon.utils.c.w(f94781c)) {
            return StringsKt__StringsKt.W2(str, com.max.xiaoheihe.a.f76428e, false, 2, null) || StringsKt__StringsKt.W2(str, "heybox", false, 2, null);
        }
        return f94781c.contains(str);
    }

    public final void i(@dl.d List<String> list) {
        if (PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, 47480, new Class[]{List.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(list, "<set-?>");
        f94781c = list;
    }
}
