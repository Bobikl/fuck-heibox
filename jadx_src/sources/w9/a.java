package w9;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager2.widget.ViewPager2;
import com.heybox.imageviewer.R;
import com.heybox.imageviewer.widgets.BackgroundView;
import com.heybox.imageviewer.widgets.InterceptLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: FragmentImageViewerDialogBinding.java */
/* JADX INFO: loaded from: classes7.dex */
public final class a implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @n0
    private final InterceptLayout f141005a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @n0
    public final BackgroundView f141006b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @n0
    public final ConstraintLayout f141007c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @n0
    public final ViewPager2 f141008d;

    private a(@n0 InterceptLayout interceptLayout, @n0 BackgroundView backgroundView, @n0 ConstraintLayout constraintLayout, @n0 ViewPager2 viewPager2) {
        this.f141005a = interceptLayout;
        this.f141006b = backgroundView;
        this.f141007c = constraintLayout;
        this.f141008d = viewPager2;
    }

    @n0
    public static a a(@n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 177, new Class[]{View.class}, a.class);
        if (patchProxyResultProxy.isSupported) {
            return (a) patchProxyResultProxy.result;
        }
        int i10 = R.id.background;
        BackgroundView backgroundView = (BackgroundView) l3.d.a(view, i10);
        if (backgroundView != null) {
            i10 = R.id.overlayView;
            ConstraintLayout constraintLayout = (ConstraintLayout) l3.d.a(view, i10);
            if (constraintLayout != null) {
                i10 = R.id.viewer;
                ViewPager2 viewPager2 = (ViewPager2) l3.d.a(view, i10);
                if (viewPager2 != null) {
                    return new a((InterceptLayout) view, backgroundView, constraintLayout, viewPager2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @n0
    public static a c(@n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, bb.c.b.f30940t0, new Class[]{LayoutInflater.class}, a.class);
        return patchProxyResultProxy.isSupported ? (a) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @n0
    public static a d(@n0 LayoutInflater layoutInflater, @p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 176, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, a.class);
        if (patchProxyResultProxy.isSupported) {
            return (a) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.fragment_image_viewer_dialog, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @n0
    public InterceptLayout b() {
        return this.f141005a;
    }

    @Override // l3.c
    @n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 178, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
