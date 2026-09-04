package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemApexLegendBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class ad implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final ConstraintLayout f108494a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final Guideline f108495b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f108496c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final ProgressBar f108497d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f108498e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f108499f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f108500g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f108501h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f108502i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f108503j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f108504k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f108505l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f108506m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @androidx.annotation.n0
    public final View f108507n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f108508o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f108509p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f108510q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f108511r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f108512s;

    private ad(@androidx.annotation.n0 ConstraintLayout constraintLayout, @androidx.annotation.n0 Guideline guideline, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 ProgressBar progressBar, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 TextView textView4, @androidx.annotation.n0 TextView textView5, @androidx.annotation.n0 TextView textView6, @androidx.annotation.n0 TextView textView7, @androidx.annotation.n0 TextView textView8, @androidx.annotation.n0 TextView textView9, @androidx.annotation.n0 View view, @androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 RelativeLayout relativeLayout2, @androidx.annotation.n0 RelativeLayout relativeLayout3, @androidx.annotation.n0 RelativeLayout relativeLayout4, @androidx.annotation.n0 RelativeLayout relativeLayout5) {
        this.f108494a = constraintLayout;
        this.f108495b = guideline;
        this.f108496c = imageView;
        this.f108497d = progressBar;
        this.f108498e = textView;
        this.f108499f = textView2;
        this.f108500g = textView3;
        this.f108501h = textView4;
        this.f108502i = textView5;
        this.f108503j = textView6;
        this.f108504k = textView7;
        this.f108505l = textView8;
        this.f108506m = textView9;
        this.f108507n = view;
        this.f108508o = relativeLayout;
        this.f108509p = relativeLayout2;
        this.f108510q = relativeLayout3;
        this.f108511r = relativeLayout4;
        this.f108512s = relativeLayout5;
    }

    @androidx.annotation.n0
    public static ad a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 17696, new Class[]{View.class}, ad.class);
        if (patchProxyResultProxy.isSupported) {
            return (ad) patchProxyResultProxy.result;
        }
        int i10 = R.id.guardline_1;
        Guideline guideline = (Guideline) l3.d.a(view, R.id.guardline_1);
        if (guideline != null) {
            i10 = R.id.iv_icon;
            ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_icon);
            if (imageView != null) {
                i10 = R.id.pb_ranking;
                ProgressBar progressBar = (ProgressBar) l3.d.a(view, R.id.pb_ranking);
                if (progressBar != null) {
                    i10 = R.id.tv_k_1;
                    TextView textView = (TextView) l3.d.a(view, R.id.tv_k_1);
                    if (textView != null) {
                        i10 = R.id.tv_k_2;
                        TextView textView2 = (TextView) l3.d.a(view, R.id.tv_k_2);
                        if (textView2 != null) {
                            i10 = R.id.tv_k_3;
                            TextView textView3 = (TextView) l3.d.a(view, R.id.tv_k_3);
                            if (textView3 != null) {
                                i10 = R.id.tv_k_4;
                                TextView textView4 = (TextView) l3.d.a(view, R.id.tv_k_4);
                                if (textView4 != null) {
                                    i10 = R.id.tv_name;
                                    TextView textView5 = (TextView) l3.d.a(view, R.id.tv_name);
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
                                                    i10 = R.id.tv_v_4;
                                                    TextView textView9 = (TextView) l3.d.a(view, R.id.tv_v_4);
                                                    if (textView9 != null) {
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
                                                                        i10 = R.id.vg_4;
                                                                        RelativeLayout relativeLayout4 = (RelativeLayout) l3.d.a(view, R.id.vg_4);
                                                                        if (relativeLayout4 != null) {
                                                                            i10 = R.id.vg_name;
                                                                            RelativeLayout relativeLayout5 = (RelativeLayout) l3.d.a(view, R.id.vg_name);
                                                                            if (relativeLayout5 != null) {
                                                                                return new ad((ConstraintLayout) view, guideline, imageView, progressBar, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9, viewA, relativeLayout, relativeLayout2, relativeLayout3, relativeLayout4, relativeLayout5);
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
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static ad c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 17694, new Class[]{LayoutInflater.class}, ad.class);
        return patchProxyResultProxy.isSupported ? (ad) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static ad d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 17695, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, ad.class);
        if (patchProxyResultProxy.isSupported) {
            return (ad) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_apex_legend, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public ConstraintLayout b() {
        return this.f108494a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 17697, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
