package com.max.xiaoheihe.router;

import android.content.Context;
import androidx.compose.runtime.internal.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.sankuai.waimai.router.common.k;
import com.sankuai.waimai.router.components.g;
import com.sankuai.waimai.router.core.e;
import dl.d;
import kotlin.jvm.internal.u;
import xh.i;

/* JADX INFO: compiled from: HeyboxRootUriHandler.kt */
/* JADX INFO: loaded from: classes13.dex */
@o(parameters = 0)
public final class a extends e {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f94890h = 8;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @d
    private final k f94891e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @d
    private final com.sankuai.waimai.router.common.o f94892f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @d
    private final com.sankuai.waimai.router.regex.c f94893g;

    @i
    public a(@dl.e Context context) {
        this(context, null, null, 6, null);
    }

    @i
    public a(@dl.e Context context, @dl.e String str) {
        this(context, str, null, 4, null);
    }

    @i
    public a(@dl.e Context context, @dl.e String str, @dl.e String str2) {
        super(context);
        k kVarW = w();
        this.f94891e = kVarW;
        com.sankuai.waimai.router.common.o oVarY = y(str, str2);
        this.f94892f = oVarY;
        com.sankuai.waimai.router.regex.c cVarX = x();
        this.f94893g = cVarX;
        h(kVarW, 300);
        h(oVarY, 200);
        h(cVarX, 100);
        h(new c(), 400);
        u(g.f96466g);
    }

    public /* synthetic */ a(Context context, String str, String str2, int i10, u uVar) {
        this(context, (i10 & 2) != 0 ? null : str, (i10 & 4) != 0 ? null : str2);
    }

    @d
    public final com.sankuai.waimai.router.regex.c A() {
        return this.f94893g;
    }

    @d
    public final com.sankuai.waimai.router.common.o B() {
        return this.f94892f;
    }

    @Override // com.sankuai.waimai.router.core.e
    public void r() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 48100, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f94891e.p();
        this.f94892f.j();
        this.f94893g.m();
    }

    @d
    public final k w() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 48101, new Class[0], k.class);
        return patchProxyResultProxy.isSupported ? (k) patchProxyResultProxy.result : new k();
    }

    @d
    public final com.sankuai.waimai.router.regex.c x() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 48103, new Class[0], com.sankuai.waimai.router.regex.c.class);
        return patchProxyResultProxy.isSupported ? (com.sankuai.waimai.router.regex.c) patchProxyResultProxy.result : new com.sankuai.waimai.router.regex.c();
    }

    @d
    public final com.sankuai.waimai.router.common.o y(@dl.e String str, @dl.e String str2) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2}, this, changeQuickRedirect, false, 48102, new Class[]{String.class, String.class}, com.sankuai.waimai.router.common.o.class);
        return patchProxyResultProxy.isSupported ? (com.sankuai.waimai.router.common.o) patchProxyResultProxy.result : new com.sankuai.waimai.router.common.o(str, str2);
    }

    @d
    public final k z() {
        return this.f94891e;
    }
}
