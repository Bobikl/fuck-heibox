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

/* JADX INFO: compiled from: ItemOwHeroOverviewBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class gs implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final ConstraintLayout f111083a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final Guideline f111084b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f111085c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f111086d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final ProgressBar f111087e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f111088f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f111089g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f111090h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f111091i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f111092j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f111093k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @androidx.annotation.n0
    public final View f111094l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f111095m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f111096n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f111097o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f111098p;

    private gs(@androidx.annotation.n0 ConstraintLayout constraintLayout, @androidx.annotation.n0 Guideline guideline, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 ImageView imageView2, @androidx.annotation.n0 ProgressBar progressBar, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 TextView textView4, @androidx.annotation.n0 TextView textView5, @androidx.annotation.n0 TextView textView6, @androidx.annotation.n0 View view, @androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 RelativeLayout relativeLayout2, @androidx.annotation.n0 RelativeLayout relativeLayout3, @androidx.annotation.n0 RelativeLayout relativeLayout4) {
        this.f111083a = constraintLayout;
        this.f111084b = guideline;
        this.f111085c = imageView;
        this.f111086d = imageView2;
        this.f111087e = progressBar;
        this.f111088f = textView;
        this.f111089g = textView2;
        this.f111090h = textView3;
        this.f111091i = textView4;
        this.f111092j = textView5;
        this.f111093k = textView6;
        this.f111094l = view;
        this.f111095m = relativeLayout;
        this.f111096n = relativeLayout2;
        this.f111097o = relativeLayout3;
        this.f111098p = relativeLayout4;
    }

    @androidx.annotation.n0
    public static gs a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 19276, new Class[]{View.class}, gs.class);
        if (patchProxyResultProxy.isSupported) {
            return (gs) patchProxyResultProxy.result;
        }
        int i10 = R.id.guardline_1;
        Guideline guideline = (Guideline) l3.d.a(view, R.id.guardline_1);
        if (guideline != null) {
            i10 = R.id.iv_arrow;
            ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_arrow);
            if (imageView != null) {
                i10 = R.id.iv_icon;
                ImageView imageView2 = (ImageView) l3.d.a(view, R.id.iv_icon);
                if (imageView2 != null) {
                    i10 = R.id.pb_ranking;
                    ProgressBar progressBar = (ProgressBar) l3.d.a(view, R.id.pb_ranking);
                    if (progressBar != null) {
                        i10 = R.id.tv_k_2;
                        TextView textView = (TextView) l3.d.a(view, R.id.tv_k_2);
                        if (textView != null) {
                            i10 = R.id.tv_name;
                            TextView textView2 = (TextView) l3.d.a(view, R.id.tv_name);
                            if (textView2 != null) {
                                i10 = R.id.tv_pb_desc;
                                TextView textView3 = (TextView) l3.d.a(view, R.id.tv_pb_desc);
                                if (textView3 != null) {
                                    i10 = R.id.tv_v_1;
                                    TextView textView4 = (TextView) l3.d.a(view, R.id.tv_v_1);
                                    if (textView4 != null) {
                                        i10 = R.id.tv_v_2;
                                        TextView textView5 = (TextView) l3.d.a(view, R.id.tv_v_2);
                                        if (textView5 != null) {
                                            i10 = R.id.tv_v_3;
                                            TextView textView6 = (TextView) l3.d.a(view, R.id.tv_v_3);
                                            if (textView6 != null) {
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
                                                                    return new gs((ConstraintLayout) view, guideline, imageView, imageView2, progressBar, textView, textView2, textView3, textView4, textView5, textView6, viewA, relativeLayout, relativeLayout2, relativeLayout3, relativeLayout4);
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
    public static gs c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 19274, new Class[]{LayoutInflater.class}, gs.class);
        return patchProxyResultProxy.isSupported ? (gs) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static gs d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 19275, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, gs.class);
        if (patchProxyResultProxy.isSupported) {
            return (gs) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_ow_hero_overview, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public ConstraintLayout b() {
        return this.f111083a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 19277, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
