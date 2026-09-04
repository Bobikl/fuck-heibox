package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemOwHeroOverviewHeaderBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class hs implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final ConstraintLayout f111513a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final Guideline f111514b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f111515c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f111516d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f111517e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f111518f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f111519g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final View f111520h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f111521i;

    private hs(@androidx.annotation.n0 ConstraintLayout constraintLayout, @androidx.annotation.n0 Guideline guideline, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 TextView textView4, @androidx.annotation.n0 TextView textView5, @androidx.annotation.n0 View view, @androidx.annotation.n0 LinearLayout linearLayout) {
        this.f111513a = constraintLayout;
        this.f111514b = guideline;
        this.f111515c = textView;
        this.f111516d = textView2;
        this.f111517e = textView3;
        this.f111518f = textView4;
        this.f111519g = textView5;
        this.f111520h = view;
        this.f111521i = linearLayout;
    }

    @androidx.annotation.n0
    public static hs a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 19280, new Class[]{View.class}, hs.class);
        if (patchProxyResultProxy.isSupported) {
            return (hs) patchProxyResultProxy.result;
        }
        int i10 = R.id.guardline_1;
        Guideline guideline = (Guideline) l3.d.a(view, R.id.guardline_1);
        if (guideline != null) {
            i10 = R.id.tv_1;
            TextView textView = (TextView) l3.d.a(view, R.id.tv_1);
            if (textView != null) {
                i10 = R.id.tv_3;
                TextView textView2 = (TextView) l3.d.a(view, R.id.tv_3);
                if (textView2 != null) {
                    i10 = R.id.tv_header_0;
                    TextView textView3 = (TextView) l3.d.a(view, R.id.tv_header_0);
                    if (textView3 != null) {
                        i10 = R.id.tv_k_2;
                        TextView textView4 = (TextView) l3.d.a(view, R.id.tv_k_2);
                        if (textView4 != null) {
                            i10 = R.id.tv_v_2;
                            TextView textView5 = (TextView) l3.d.a(view, R.id.tv_v_2);
                            if (textView5 != null) {
                                i10 = R.id.v_divider;
                                View viewA = l3.d.a(view, R.id.v_divider);
                                if (viewA != null) {
                                    i10 = R.id.vg_2;
                                    LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.vg_2);
                                    if (linearLayout != null) {
                                        return new hs((ConstraintLayout) view, guideline, textView, textView2, textView3, textView4, textView5, viewA, linearLayout);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static hs c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 19278, new Class[]{LayoutInflater.class}, hs.class);
        return patchProxyResultProxy.isSupported ? (hs) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static hs d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 19279, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, hs.class);
        if (patchProxyResultProxy.isSupported) {
            return (hs) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_ow_hero_overview_header, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public ConstraintLayout b() {
        return this.f111513a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 19281, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
