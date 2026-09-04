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

/* JADX INFO: compiled from: ItemHashtagRankingBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class fo implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final ConstraintLayout f110619a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final Guideline f110620b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final Guideline f110621c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final View f110622d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f110623e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f110624f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f110625g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f110626h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final GradientTextView f110627i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f110628j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f110629k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f110630l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @androidx.annotation.n0
    public final View f110631m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f110632n;

    private fo(@androidx.annotation.n0 ConstraintLayout constraintLayout, @androidx.annotation.n0 Guideline guideline, @androidx.annotation.n0 Guideline guideline2, @androidx.annotation.n0 View view, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 GradientTextView gradientTextView, @androidx.annotation.n0 TextView textView4, @androidx.annotation.n0 TextView textView5, @androidx.annotation.n0 TextView textView6, @androidx.annotation.n0 View view2, @androidx.annotation.n0 LinearLayout linearLayout) {
        this.f110619a = constraintLayout;
        this.f110620b = guideline;
        this.f110621c = guideline2;
        this.f110622d = view;
        this.f110623e = imageView;
        this.f110624f = textView;
        this.f110625g = textView2;
        this.f110626h = textView3;
        this.f110627i = gradientTextView;
        this.f110628j = textView4;
        this.f110629k = textView5;
        this.f110630l = textView6;
        this.f110631m = view2;
        this.f110632n = linearLayout;
    }

    @androidx.annotation.n0
    public static fo a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 18856, new Class[]{View.class}, fo.class);
        if (patchProxyResultProxy.isSupported) {
            return (fo) patchProxyResultProxy.result;
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
                    i10 = R.id.iv_trend;
                    ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_trend);
                    if (imageView != null) {
                        i10 = R.id.tv_k_1;
                        TextView textView = (TextView) l3.d.a(view, R.id.tv_k_1);
                        if (textView != null) {
                            i10 = R.id.tv_k_2;
                            TextView textView2 = (TextView) l3.d.a(view, R.id.tv_k_2);
                            if (textView2 != null) {
                                i10 = R.id.tv_name;
                                TextView textView3 = (TextView) l3.d.a(view, R.id.tv_name);
                                if (textView3 != null) {
                                    i10 = R.id.tv_rank;
                                    GradientTextView gradientTextView = (GradientTextView) l3.d.a(view, R.id.tv_rank);
                                    if (gradientTextView != null) {
                                        i10 = R.id.tv_trend;
                                        TextView textView4 = (TextView) l3.d.a(view, R.id.tv_trend);
                                        if (textView4 != null) {
                                            i10 = R.id.tv_v_1;
                                            TextView textView5 = (TextView) l3.d.a(view, R.id.tv_v_1);
                                            if (textView5 != null) {
                                                i10 = R.id.tv_v_2;
                                                TextView textView6 = (TextView) l3.d.a(view, R.id.tv_v_2);
                                                if (textView6 != null) {
                                                    i10 = R.id.v_divider;
                                                    View viewA2 = l3.d.a(view, R.id.v_divider);
                                                    if (viewA2 != null) {
                                                        i10 = R.id.vg_trend;
                                                        LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.vg_trend);
                                                        if (linearLayout != null) {
                                                            return new fo((ConstraintLayout) view, guideline, guideline2, viewA, imageView, textView, textView2, textView3, gradientTextView, textView4, textView5, textView6, viewA2, linearLayout);
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
    public static fo c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 18854, new Class[]{LayoutInflater.class}, fo.class);
        return patchProxyResultProxy.isSupported ? (fo) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static fo d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 18855, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, fo.class);
        if (patchProxyResultProxy.isSupported) {
            return (fo) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_hashtag_ranking, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public ConstraintLayout b() {
        return this.f110619a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 18857, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
