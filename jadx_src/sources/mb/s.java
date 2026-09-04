package mb;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.max.hbcommon.R;
import com.max.hbcommon.component.TitleBar;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: FragmentBaseBinding.java */
/* JADX INFO: loaded from: classes9.dex */
public final class s implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final LinearLayout f131734a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final FrameLayout f131735b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final TitleBar f131736c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final o f131737d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f131738e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f131739f;

    private s(@androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 FrameLayout frameLayout, @androidx.annotation.n0 TitleBar titleBar, @androidx.annotation.n0 o oVar, @androidx.annotation.n0 LinearLayout linearLayout2, @androidx.annotation.n0 RelativeLayout relativeLayout) {
        this.f131734a = linearLayout;
        this.f131735b = frameLayout;
        this.f131736c = titleBar;
        this.f131737d = oVar;
        this.f131738e = linearLayout2;
        this.f131739f = relativeLayout;
    }

    @androidx.annotation.n0
    public static s a(@androidx.annotation.n0 View view) {
        View viewA;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, bb.c.e.P6, new Class[]{View.class}, s.class);
        if (patchProxyResultProxy.isSupported) {
            return (s) patchProxyResultProxy.result;
        }
        int i10 = R.id.multi_status_view_container;
        FrameLayout frameLayout = (FrameLayout) l3.d.a(view, i10);
        if (frameLayout != null) {
            i10 = R.id.tb_title;
            TitleBar titleBar = (TitleBar) l3.d.a(view, i10);
            if (titleBar != null && (viewA = l3.d.a(view, (i10 = R.id.title_bar_divider))) != null) {
                o oVarA = o.a(viewA);
                LinearLayout linearLayout = (LinearLayout) view;
                i10 = R.id.vg_title;
                RelativeLayout relativeLayout = (RelativeLayout) l3.d.a(view, i10);
                if (relativeLayout != null) {
                    return new s(linearLayout, frameLayout, titleBar, oVarA, linearLayout, relativeLayout);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static s c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, bb.c.e.N6, new Class[]{LayoutInflater.class}, s.class);
        return patchProxyResultProxy.isSupported ? (s) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static s d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, bb.c.e.O6, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, s.class);
        if (patchProxyResultProxy.isSupported) {
            return (s) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.fragment_base, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public LinearLayout b() {
        return this.f131734a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.e.Q6, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
