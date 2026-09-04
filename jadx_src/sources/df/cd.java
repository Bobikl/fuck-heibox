package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemApexLogBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class cd implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final ConstraintLayout f109324a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final Guideline f109325b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f109326c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f109327d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f109328e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f109329f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f109330g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f109331h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f109332i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f109333j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f109334k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @androidx.annotation.n0
    public final View f109335l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f109336m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f109337n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f109338o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f109339p;

    private cd(@androidx.annotation.n0 ConstraintLayout constraintLayout, @androidx.annotation.n0 Guideline guideline, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 TextView textView4, @androidx.annotation.n0 TextView textView5, @androidx.annotation.n0 TextView textView6, @androidx.annotation.n0 TextView textView7, @androidx.annotation.n0 TextView textView8, @androidx.annotation.n0 View view, @androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 RelativeLayout relativeLayout2, @androidx.annotation.n0 RelativeLayout relativeLayout3, @androidx.annotation.n0 RelativeLayout relativeLayout4) {
        this.f109324a = constraintLayout;
        this.f109325b = guideline;
        this.f109326c = imageView;
        this.f109327d = textView;
        this.f109328e = textView2;
        this.f109329f = textView3;
        this.f109330g = textView4;
        this.f109331h = textView5;
        this.f109332i = textView6;
        this.f109333j = textView7;
        this.f109334k = textView8;
        this.f109335l = view;
        this.f109336m = relativeLayout;
        this.f109337n = relativeLayout2;
        this.f109338o = relativeLayout3;
        this.f109339p = relativeLayout4;
    }

    @androidx.annotation.n0
    public static cd a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 17704, new Class[]{View.class}, cd.class);
        if (patchProxyResultProxy.isSupported) {
            return (cd) patchProxyResultProxy.result;
        }
        int i10 = R.id.guardline_1;
        Guideline guideline = (Guideline) l3.d.a(view, R.id.guardline_1);
        if (guideline != null) {
            i10 = R.id.iv_icon;
            ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_icon);
            if (imageView != null) {
                i10 = R.id.tv_k_1;
                TextView textView = (TextView) l3.d.a(view, R.id.tv_k_1);
                if (textView != null) {
                    i10 = R.id.tv_k_2;
                    TextView textView2 = (TextView) l3.d.a(view, R.id.tv_k_2);
                    if (textView2 != null) {
                        i10 = R.id.tv_k_3;
                        TextView textView3 = (TextView) l3.d.a(view, R.id.tv_k_3);
                        if (textView3 != null) {
                            i10 = R.id.tv_name;
                            TextView textView4 = (TextView) l3.d.a(view, R.id.tv_name);
                            if (textView4 != null) {
                                i10 = R.id.tv_time;
                                TextView textView5 = (TextView) l3.d.a(view, R.id.tv_time);
                                if (textView5 != null) {
                                    i10 = R.id.tv_v_1;
                                    TextView textView6 = (TextView) l3.d.a(view, R.id.tv_v_1);
                                    if (textView6 != null) {
                                        i10 = R.id.tv_v_2;
                                        TextView textView7 = (TextView) l3.d.a(view, R.id.tv_v_2);
                                        if (textView7 != null) {
                                            i10 = R.id.tv_v_3;
                                            TextView textView8 = (TextView) l3.d.a(view, R.id.tv_v_3);
                                            if (textView8 != null) {
                                                i10 = R.id.v_divider;
                                                View viewA = l3.d.a(view, R.id.v_divider);
                                                if (viewA != null) {
                                                    i10 = R.id.vg_1;
                                                    RelativeLayout relativeLayout = (RelativeLayout) l3.d.a(view, R.id.vg_1);
                                                    if (relativeLayout != null) {
                                                        i10 = R.id.vg_2;
                                                        RelativeLayout relativeLayout2 = (RelativeLayout) l3.d.a(view, R.id.vg_2);
                                                        if (relativeLayout2 != null) {
                                                            i10 = R.id.vg_3;
                                                            RelativeLayout relativeLayout3 = (RelativeLayout) l3.d.a(view, R.id.vg_3);
                                                            if (relativeLayout3 != null) {
                                                                i10 = R.id.vg_name;
                                                                RelativeLayout relativeLayout4 = (RelativeLayout) l3.d.a(view, R.id.vg_name);
                                                                if (relativeLayout4 != null) {
                                                                    return new cd((ConstraintLayout) view, guideline, imageView, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, viewA, relativeLayout, relativeLayout2, relativeLayout3, relativeLayout4);
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
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
    public static cd c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 17702, new Class[]{LayoutInflater.class}, cd.class);
        return patchProxyResultProxy.isSupported ? (cd) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static cd d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 17703, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, cd.class);
        if (patchProxyResultProxy.isSupported) {
            return (cd) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_apex_log, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public ConstraintLayout b() {
        return this.f109324a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 17705, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
