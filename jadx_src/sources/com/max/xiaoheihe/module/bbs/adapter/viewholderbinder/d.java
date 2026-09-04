package com.max.xiaoheihe.module.bbs.adapter.viewholderbinder;

import androidx.compose.runtime.internal.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: LinkViewHolderBinderFactory.kt */
/* JADX INFO: loaded from: classes10.dex */
@o(parameters = 0)
public final class d implements cb.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final d f80680a = new d();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f80681b = 0;
    public static ChangeQuickRedirect changeQuickRedirect;

    private d() {
    }

    @dl.d
    public final c a(@dl.d b param) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{param}, this, changeQuickRedirect, false, 27546, new Class[]{b.class}, c.class);
        if (patchProxyResultProxy.isSupported) {
            return (c) patchProxyResultProxy.result;
        }
        f0.p(param, "param");
        return new a(param);
    }
}
