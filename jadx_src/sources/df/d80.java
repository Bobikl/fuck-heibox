package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentContainerView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: LayoutMiniProgramFragmentContainerBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class d80 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final ConstraintLayout f109688a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final FragmentContainerView f109689b;

    private d80(@androidx.annotation.n0 ConstraintLayout constraintLayout, @androidx.annotation.n0 FragmentContainerView fragmentContainerView) {
        this.f109688a = constraintLayout;
        this.f109689b = fragmentContainerView;
    }

    @androidx.annotation.n0
    public static d80 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 20914, new Class[]{View.class}, d80.class);
        if (patchProxyResultProxy.isSupported) {
            return (d80) patchProxyResultProxy.result;
        }
        FragmentContainerView fragmentContainerView = (FragmentContainerView) l3.d.a(view, R.id.nav_fragment);
        if (fragmentContainerView != null) {
            return new d80((ConstraintLayout) view, fragmentContainerView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.nav_fragment)));
    }

    @androidx.annotation.n0
    public static d80 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 20912, new Class[]{LayoutInflater.class}, d80.class);
        return patchProxyResultProxy.isSupported ? (d80) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static d80 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 20913, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, d80.class);
        if (patchProxyResultProxy.isSupported) {
            return (d80) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.layout_mini_program_fragment_container, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public ConstraintLayout b() {
        return this.f109688a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 20915, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
