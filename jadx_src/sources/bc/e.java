package bc;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.n0;
import androidx.annotation.p0;
import com.max.hbcustomview.R;
import com.max.hbcustomview.swipebacklayout.ActivitySwipeBackLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: HbcustomviewLayoutSwipebackBinding.java */
/* JADX INFO: loaded from: classes10.dex */
public final class e implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @n0
    private final ActivitySwipeBackLayout f35205a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @n0
    public final ActivitySwipeBackLayout f35206b;

    private e(@n0 ActivitySwipeBackLayout activitySwipeBackLayout, @n0 ActivitySwipeBackLayout activitySwipeBackLayout2) {
        this.f35205a = activitySwipeBackLayout;
        this.f35206b = activitySwipeBackLayout2;
    }

    @n0
    public static e a(@n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, bb.c.f.Ni, new Class[]{View.class}, e.class);
        if (patchProxyResultProxy.isSupported) {
            return (e) patchProxyResultProxy.result;
        }
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        ActivitySwipeBackLayout activitySwipeBackLayout = (ActivitySwipeBackLayout) view;
        return new e(activitySwipeBackLayout, activitySwipeBackLayout);
    }

    @n0
    public static e c(@n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, bb.c.f.Li, new Class[]{LayoutInflater.class}, e.class);
        return patchProxyResultProxy.isSupported ? (e) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @n0
    public static e d(@n0 LayoutInflater layoutInflater, @p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, bb.c.f.Mi, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, e.class);
        if (patchProxyResultProxy.isSupported) {
            return (e) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.hbcustomview_layout_swipeback, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @n0
    public ActivitySwipeBackLayout b() {
        return this.f35205a;
    }

    @Override // l3.c
    @n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.Oi, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
