package com.max.hbcommon.component.bottomsheet;

import android.os.Bundle;
import android.text.SpannableString;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: BottomSheetsCardShare.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class i {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final BottomSheetsParams f67270a = new BottomSheetsParams();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.e
    private View f67271b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.e
    private CharSequence f67272c;

    @dl.d
    public final h a() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.d.f31285hj, new Class[0], h.class);
        if (patchProxyResultProxy.isSupported) {
            return (h) patchProxyResultProxy.result;
        }
        h hVar = new h();
        Bundle bundle = new Bundle();
        bundle.putSerializable("ARG_PARAMS", this.f67270a);
        hVar.setArguments(bundle);
        hVar.o4(this.f67271b);
        hVar.p4(this.f67272c);
        return hVar;
    }

    @dl.e
    public final View b() {
        return this.f67271b;
    }

    @dl.e
    public final CharSequence c() {
        return this.f67272c;
    }

    @dl.d
    public final BottomSheetsParams d() {
        return this.f67270a;
    }

    @dl.d
    public final i e(@androidx.annotation.l int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.d.f31423nj, new Class[]{Integer.TYPE}, i.class);
        if (patchProxyResultProxy.isSupported) {
            return (i) patchProxyResultProxy.result;
        }
        this.f67270a.n(Integer.valueOf(i10));
        return this;
    }

    @dl.d
    public final i f(boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, bb.c.d.f31354kj, new Class[]{Boolean.TYPE}, i.class);
        if (patchProxyResultProxy.isSupported) {
            return (i) patchProxyResultProxy.result;
        }
        this.f67270a.z(z10);
        return this;
    }

    @dl.d
    public final i g(@dl.d SpannableString desc) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{desc}, this, changeQuickRedirect, false, bb.c.d.f31400mj, new Class[]{SpannableString.class}, i.class);
        if (patchProxyResultProxy.isSupported) {
            return (i) patchProxyResultProxy.result;
        }
        f0.p(desc, "desc");
        this.f67272c = desc;
        return this;
    }

    @dl.d
    public final i h(@androidx.annotation.l int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.d.f31331jj, new Class[]{Integer.TYPE}, i.class);
        if (patchProxyResultProxy.isSupported) {
            return (i) patchProxyResultProxy.result;
        }
        this.f67270a.s(Integer.valueOf(i10));
        return this;
    }

    public final void i(@dl.e View view) {
        this.f67271b = view;
    }

    public final void j(@dl.e CharSequence charSequence) {
        this.f67272c = charSequence;
    }

    @dl.d
    public final i k(boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, bb.c.d.f31307ij, new Class[]{Boolean.TYPE}, i.class);
        if (patchProxyResultProxy.isSupported) {
            return (i) patchProxyResultProxy.result;
        }
        this.f67270a.w(z10);
        return this;
    }

    @dl.d
    public final i l(@dl.d String title) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{title}, this, changeQuickRedirect, false, bb.c.d.f31377lj, new Class[]{String.class}, i.class);
        if (patchProxyResultProxy.isSupported) {
            return (i) patchProxyResultProxy.result;
        }
        f0.p(title, "title");
        this.f67270a.y(title);
        return this;
    }
}
