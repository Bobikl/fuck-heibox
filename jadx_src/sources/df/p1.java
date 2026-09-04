package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentContainerView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ActivityMiniProgramHostBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class p1 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final ConstraintLayout f114380a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final r70 f114381b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final FragmentContainerView f114382c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f114383d;

    private p1(@androidx.annotation.n0 ConstraintLayout constraintLayout, @androidx.annotation.n0 r70 r70Var, @androidx.annotation.n0 FragmentContainerView fragmentContainerView, @androidx.annotation.n0 LinearLayout linearLayout) {
        this.f114380a = constraintLayout;
        this.f114381b = r70Var;
        this.f114382c = fragmentContainerView;
        this.f114383d = linearLayout;
    }

    @androidx.annotation.n0
    public static p1 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 16508, new Class[]{View.class}, p1.class);
        if (patchProxyResultProxy.isSupported) {
            return (p1) patchProxyResultProxy.result;
        }
        int i10 = R.id.layout_little_program_bar;
        View viewA = l3.d.a(view, R.id.layout_little_program_bar);
        if (viewA != null) {
            r70 r70VarA = r70.a(viewA);
            int i11 = R.id.nav_host_fragment;
            FragmentContainerView fragmentContainerView = (FragmentContainerView) l3.d.a(view, R.id.nav_host_fragment);
            if (fragmentContainerView != null) {
                i11 = R.id.vg_little_program_root;
                LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.vg_little_program_root);
                if (linearLayout != null) {
                    return new p1((ConstraintLayout) view, r70VarA, fragmentContainerView, linearLayout);
                }
            }
            i10 = i11;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static p1 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 16506, new Class[]{LayoutInflater.class}, p1.class);
        return patchProxyResultProxy.isSupported ? (p1) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static p1 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 16507, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, p1.class);
        if (patchProxyResultProxy.isSupported) {
            return (p1) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.activity_mini_program_host, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public ConstraintLayout b() {
        return this.f114380a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 16509, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
