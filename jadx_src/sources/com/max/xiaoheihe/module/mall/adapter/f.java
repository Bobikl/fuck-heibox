package com.max.xiaoheihe.module.mall.adapter;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: MallProductAdapterV2.kt */
/* JADX INFO: loaded from: classes11.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
public final class f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f89955c = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final Context f89956a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private c f89957b;

    public f(@dl.d Context context) {
        f0.p(context, "context");
        this.f89956a = context;
        this.f89957b = new l();
    }

    public final void a(@dl.e String str, @dl.e String str2, @dl.e String str3) {
        if (PatchProxy.proxy(new Object[]{str, str2, str3}, this, changeQuickRedirect, false, 41126, new Class[]{String.class, String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        if (f0.g(str, "true")) {
            this.f89957b = new s(this.f89956a);
            return;
        }
        if (f0.g(str2, "1")) {
            this.f89957b = new k(this.f89956a);
        } else if (f0.g(str3, "1")) {
            this.f89957b = new e(this.f89956a);
        } else {
            this.f89957b = new l();
        }
    }

    @dl.d
    public final Context b() {
        return this.f89956a;
    }

    @dl.d
    public final c c() {
        return this.f89957b;
    }

    public final boolean d(@dl.e String str, @dl.e String str2, @dl.e String str3) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2, str3}, this, changeQuickRedirect, false, 41125, new Class[]{String.class, String.class, String.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        a(str, str2, str3);
        return this.f89957b instanceof l;
    }
}
