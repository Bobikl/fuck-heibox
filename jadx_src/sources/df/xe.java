package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.max.hbcustomview.GradientTextView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemChannelRankingBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class xe implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final ConstraintLayout f117539a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final Guideline f117540b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final Guideline f117541c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final View f117542d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f117543e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f117544f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f117545g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f117546h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f117547i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f117548j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.n0
    public final GradientTextView f117549k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f117550l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f117551m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f117552n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f117553o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @androidx.annotation.n0
    public final View f117554p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f117555q;

    private xe(@androidx.annotation.n0 ConstraintLayout constraintLayout, @androidx.annotation.n0 Guideline guideline, @androidx.annotation.n0 Guideline guideline2, @androidx.annotation.n0 View view, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 ImageView imageView2, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 TextView textView4, @androidx.annotation.n0 GradientTextView gradientTextView, @androidx.annotation.n0 TextView textView5, @androidx.annotation.n0 TextView textView6, @androidx.annotation.n0 TextView textView7, @androidx.annotation.n0 TextView textView8, @androidx.annotation.n0 View view2, @androidx.annotation.n0 LinearLayout linearLayout) {
        this.f117539a = constraintLayout;
        this.f117540b = guideline;
        this.f117541c = guideline2;
        this.f117542d = view;
        this.f117543e = imageView;
        this.f117544f = imageView2;
        this.f117545g = textView;
        this.f117546h = textView2;
        this.f117547i = textView3;
        this.f117548j = textView4;
        this.f117549k = gradientTextView;
        this.f117550l = textView5;
        this.f117551m = textView6;
        this.f117552n = textView7;
        this.f117553o = textView8;
        this.f117554p = view2;
        this.f117555q = linearLayout;
    }

    @androidx.annotation.n0
    public static xe a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 17892, new Class[]{View.class}, xe.class);
        if (patchProxyResultProxy.isSupported) {
            return (xe) patchProxyResultProxy.result;
        }
        int i10 = R.id.guardline_1;
        Guideline guideline = (Guideline) l3.d.a(view, R.id.guardline_1);
        if (guideline != null) {
            i10 = R.id.guardline_2;
            Guideline guideline2 = (Guideline) l3.d.a(view, R.id.guardline_2);
            if (guideline2 != null) {
                i10 = R.id.guardline_3;
                View viewA = l3.d.a(view, R.id.guardline_3);
                if (viewA != null) {
                    i10 = R.id.iv_icon;
                    ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_icon);
                    if (imageView != null) {
                        i10 = R.id.iv_trend;
                        ImageView imageView2 = (ImageView) l3.d.a(view, R.id.iv_trend);
                        if (imageView2 != null) {
                            i10 = R.id.tv_data;
                            TextView textView = (TextView) l3.d.a(view, R.id.tv_data);
                            if (textView != null) {
                                i10 = R.id.tv_k_1;
                                TextView textView2 = (TextView) l3.d.a(view, R.id.tv_k_1);
                                if (textView2 != null) {
                                    i10 = R.id.tv_k_2;
                                    TextView textView3 = (TextView) l3.d.a(view, R.id.tv_k_2);
                                    if (textView3 != null) {
                                        i10 = R.id.tv_name;
                                        TextView textView4 = (TextView) l3.d.a(view, R.id.tv_name);
                                        if (textView4 != null) {
                                            i10 = R.id.tv_rank;
                                            GradientTextView gradientTextView = (GradientTextView) l3.d.a(view, R.id.tv_rank);
                                            if (gradientTextView != null) {
                                                i10 = R.id.tv_trend;
                                                TextView textView5 = (TextView) l3.d.a(view, R.id.tv_trend);
                                                if (textView5 != null) {
                                                    i10 = R.id.tv_v_1;
                                                    TextView textView6 = (TextView) l3.d.a(view, R.id.tv_v_1);
                                                    if (textView6 != null) {
                                                        i10 = R.id.tv_v_2;
                                                        TextView textView7 = (TextView) l3.d.a(view, R.id.tv_v_2);
                                                        if (textView7 != null) {
                                                            i10 = R.id.tv_wiki;
                                                            TextView textView8 = (TextView) l3.d.a(view, R.id.tv_wiki);
                                                            if (textView8 != null) {
                                                                i10 = R.id.v_divider;
                                                                View viewA2 = l3.d.a(view, R.id.v_divider);
                                                                if (viewA2 != null) {
                                                                    i10 = R.id.vg_trend;
                                                                    LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.vg_trend);
                                                                    if (linearLayout != null) {
                                                                        return new xe((ConstraintLayout) view, guideline, guideline2, viewA, imageView, imageView2, textView, textView2, textView3, textView4, gradientTextView, textView5, textView6, textView7, textView8, viewA2, linearLayout);
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
    public static xe c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 17890, new Class[]{LayoutInflater.class}, xe.class);
        return patchProxyResultProxy.isSupported ? (xe) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static xe d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 17891, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, xe.class);
        if (patchProxyResultProxy.isSupported) {
            return (xe) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_channel_ranking, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public ConstraintLayout b() {
        return this.f117539a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 17893, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
