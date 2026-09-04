package com.sankuai.waimai.router.common;

import android.content.Context;
import androidx.annotation.n0;
import androidx.annotation.p0;

/* JADX INFO: compiled from: DefaultRootUriHandler.java */
/* JADX INFO: loaded from: classes8.dex */
public class b extends com.sankuai.waimai.router.core.e {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final k f96423e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final o f96424f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final com.sankuai.waimai.router.regex.c f96425g;

    public b(Context context) {
        this(context, null, null);
    }

    public b(Context context, @p0 String str, @p0 String str2) {
        super(context);
        k kVarW = w();
        this.f96423e = kVarW;
        o oVarY = y(str, str2);
        this.f96424f = oVarY;
        com.sankuai.waimai.router.regex.c cVarX = x();
        this.f96425g = cVarX;
        h(kVarW, 300);
        h(oVarY, 200);
        h(cVarX, 100);
        h(new n(), -100);
        u(com.sankuai.waimai.router.components.g.f96466g);
    }

    public com.sankuai.waimai.router.regex.c A() {
        return this.f96425g;
    }

    public o B() {
        return this.f96424f;
    }

    @Override // com.sankuai.waimai.router.core.e
    public void r() {
        this.f96423e.p();
        this.f96424f.j();
        this.f96425g.m();
    }

    @n0
    protected k w() {
        return new k();
    }

    @n0
    protected com.sankuai.waimai.router.regex.c x() {
        return new com.sankuai.waimai.router.regex.c();
    }

    @n0
    protected o y(@p0 String str, @p0 String str2) {
        return new o(str, str2);
    }

    public k z() {
        return this.f96423e;
    }
}
