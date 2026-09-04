package com.max.hbcommon.component.bottomsheet;

import android.os.Bundle;
import android.text.SpannableString;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: BottomSheetsPictureShare.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class s {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final BottomSheetsParams f67290a = new BottomSheetsParams();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.e
    private View f67291b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.e
    private CharSequence f67292c;

    @dl.d
    public final BottomSheetsPictureShare a() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.d.f31263gk, new Class[0], BottomSheetsPictureShare.class);
        if (patchProxyResultProxy.isSupported) {
            return (BottomSheetsPictureShare) patchProxyResultProxy.result;
        }
        BottomSheetsPictureShare bottomSheetsPictureShare = new BottomSheetsPictureShare();
        Bundle bundle = new Bundle();
        bundle.putSerializable("ARG_PARAMS", this.f67290a);
        bottomSheetsPictureShare.setArguments(bundle);
        bottomSheetsPictureShare.o4(this.f67291b);
        bottomSheetsPictureShare.p4("分享");
        return bottomSheetsPictureShare;
    }

    @dl.e
    public final View b() {
        return this.f67291b;
    }

    @dl.e
    public final CharSequence c() {
        return this.f67292c;
    }

    @dl.d
    public final BottomSheetsParams d() {
        return this.f67290a;
    }

    @dl.d
    public final s e(@dl.d SpannableString desc) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{desc}, this, changeQuickRedirect, false, bb.c.d.f31308ik, new Class[]{SpannableString.class}, s.class);
        if (patchProxyResultProxy.isSupported) {
            return (s) patchProxyResultProxy.result;
        }
        f0.p(desc, "desc");
        this.f67292c = desc;
        return this;
    }

    public final void f(@dl.e View view) {
        this.f67291b = view;
    }

    public final void g(@dl.e CharSequence charSequence) {
        this.f67292c = charSequence;
    }

    @dl.d
    public final s h(boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, bb.c.d.f31286hk, new Class[]{Boolean.TYPE}, s.class);
        if (patchProxyResultProxy.isSupported) {
            return (s) patchProxyResultProxy.result;
        }
        this.f67290a.w(z10);
        return this;
    }
}
