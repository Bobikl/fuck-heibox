package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.max.hbcustomview.ViewPagerFixed;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: LayoutHeaderVpBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class c70 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final LinearLayout f109203a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final ds f109204b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final ViewPagerFixed f109205c;

    private c70(@androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 ds dsVar, @androidx.annotation.n0 ViewPagerFixed viewPagerFixed) {
        this.f109203a = linearLayout;
        this.f109204b = dsVar;
        this.f109205c = viewPagerFixed;
    }

    @androidx.annotation.n0
    public static c70 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 20808, new Class[]{View.class}, c70.class);
        if (patchProxyResultProxy.isSupported) {
            return (c70) patchProxyResultProxy.result;
        }
        int i10 = R.id.list_header;
        View viewA = l3.d.a(view, R.id.list_header);
        if (viewA != null) {
            ds dsVarA = ds.a(viewA);
            ViewPagerFixed viewPagerFixed = (ViewPagerFixed) l3.d.a(view, R.id.vp);
            if (viewPagerFixed != null) {
                return new c70((LinearLayout) view, dsVarA, viewPagerFixed);
            }
            i10 = R.id.vp;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static c70 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 20806, new Class[]{LayoutInflater.class}, c70.class);
        return patchProxyResultProxy.isSupported ? (c70) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static c70 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 20807, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, c70.class);
        if (patchProxyResultProxy.isSupported) {
            return (c70) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.layout_header_vp, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public LinearLayout b() {
        return this.f109203a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 20809, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
