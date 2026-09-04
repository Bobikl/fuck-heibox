package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.max.hbcustomview.ViewPagerFixed;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: LayoutSampleVpBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class ia0 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final ViewPagerFixed f111721a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final ViewPagerFixed f111722b;

    private ia0(@androidx.annotation.n0 ViewPagerFixed viewPagerFixed, @androidx.annotation.n0 ViewPagerFixed viewPagerFixed2) {
        this.f111721a = viewPagerFixed;
        this.f111722b = viewPagerFixed2;
    }

    @androidx.annotation.n0
    public static ia0 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 21142, new Class[]{View.class}, ia0.class);
        if (patchProxyResultProxy.isSupported) {
            return (ia0) patchProxyResultProxy.result;
        }
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        ViewPagerFixed viewPagerFixed = (ViewPagerFixed) view;
        return new ia0(viewPagerFixed, viewPagerFixed);
    }

    @androidx.annotation.n0
    public static ia0 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 21140, new Class[]{LayoutInflater.class}, ia0.class);
        return patchProxyResultProxy.isSupported ? (ia0) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static ia0 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 21141, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, ia0.class);
        if (patchProxyResultProxy.isSupported) {
            return (ia0) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.layout_sample_vp, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public ViewPagerFixed b() {
        return this.f111721a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 21143, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
