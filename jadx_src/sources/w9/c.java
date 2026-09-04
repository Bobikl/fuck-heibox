package w9;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.n0;
import androidx.annotation.p0;
import com.heybox.imageviewer.R;
import com.heybox.imageviewer.widgets.SubsamplingScaleImageView2;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemImageviewerSubsamplingBinding.java */
/* JADX INFO: loaded from: classes7.dex */
public final class c implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @n0
    private final FrameLayout f141011a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @n0
    public final SubsamplingScaleImageView2 f141012b;

    private c(@n0 FrameLayout frameLayout, @n0 SubsamplingScaleImageView2 subsamplingScaleImageView2) {
        this.f141011a = frameLayout;
        this.f141012b = subsamplingScaleImageView2;
    }

    @n0
    public static c a(@n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 185, new Class[]{View.class}, c.class);
        if (patchProxyResultProxy.isSupported) {
            return (c) patchProxyResultProxy.result;
        }
        int i10 = R.id.subsamplingView;
        SubsamplingScaleImageView2 subsamplingScaleImageView2 = (SubsamplingScaleImageView2) l3.d.a(view, i10);
        if (subsamplingScaleImageView2 != null) {
            return new c((FrameLayout) view, subsamplingScaleImageView2);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @n0
    public static c c(@n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 183, new Class[]{LayoutInflater.class}, c.class);
        return patchProxyResultProxy.isSupported ? (c) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @n0
    public static c d(@n0 LayoutInflater layoutInflater, @p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 184, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, c.class);
        if (patchProxyResultProxy.isSupported) {
            return (c) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_imageviewer_subsampling, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @n0
    public FrameLayout b() {
        return this.f141011a;
    }

    @Override // l3.c
    @n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.b.E0, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
