package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemR6OperatorsTitleBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class zu implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f118464a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final View f118465b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f118466c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f118467d;

    private zu(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 View view, @androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 LinearLayout linearLayout2) {
        this.f118464a = relativeLayout;
        this.f118465b = view;
        this.f118466c = linearLayout;
        this.f118467d = linearLayout2;
    }

    @androidx.annotation.n0
    public static zu a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 19556, new Class[]{View.class}, zu.class);
        if (patchProxyResultProxy.isSupported) {
            return (zu) patchProxyResultProxy.result;
        }
        int i10 = R.id.v_item_matches_divider;
        View viewA = l3.d.a(view, R.id.v_item_matches_divider);
        if (viewA != null) {
            i10 = R.id.vg_kd;
            LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.vg_kd);
            if (linearLayout != null) {
                i10 = R.id.vg_rank;
                LinearLayout linearLayout2 = (LinearLayout) l3.d.a(view, R.id.vg_rank);
                if (linearLayout2 != null) {
                    return new zu((RelativeLayout) view, viewA, linearLayout, linearLayout2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static zu c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 19554, new Class[]{LayoutInflater.class}, zu.class);
        return patchProxyResultProxy.isSupported ? (zu) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static zu d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 19555, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, zu.class);
        if (patchProxyResultProxy.isSupported) {
            return (zu) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_r6_operators_title, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f118464a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 19557, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
