package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.max.hbcustomview.HorizontalScrollListView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemR6PlayerOperatorDataBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class cv implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f109510a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final mb.o f109511b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final HorizontalScrollListView f109512c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f109513d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f109514e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final ProgressBar f109515f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f109516g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f109517h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f109518i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f109519j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f109520k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f109521l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f109522m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f109523n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f109524o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f109525p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f109526q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f109527r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f109528s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f109529t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f109530u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f109531v;

    private cv(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 mb.o oVar, @androidx.annotation.n0 HorizontalScrollListView horizontalScrollListView, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 ImageView imageView2, @androidx.annotation.n0 ProgressBar progressBar, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 TextView textView4, @androidx.annotation.n0 TextView textView5, @androidx.annotation.n0 TextView textView6, @androidx.annotation.n0 TextView textView7, @androidx.annotation.n0 TextView textView8, @androidx.annotation.n0 TextView textView9, @androidx.annotation.n0 TextView textView10, @androidx.annotation.n0 TextView textView11, @androidx.annotation.n0 TextView textView12, @androidx.annotation.n0 TextView textView13, @androidx.annotation.n0 TextView textView14, @androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 LinearLayout linearLayout2) {
        this.f109510a = relativeLayout;
        this.f109511b = oVar;
        this.f109512c = horizontalScrollListView;
        this.f109513d = imageView;
        this.f109514e = imageView2;
        this.f109515f = progressBar;
        this.f109516g = textView;
        this.f109517h = textView2;
        this.f109518i = textView3;
        this.f109519j = textView4;
        this.f109520k = textView5;
        this.f109521l = textView6;
        this.f109522m = textView7;
        this.f109523n = textView8;
        this.f109524o = textView9;
        this.f109525p = textView10;
        this.f109526q = textView11;
        this.f109527r = textView12;
        this.f109528s = textView13;
        this.f109529t = textView14;
        this.f109530u = linearLayout;
        this.f109531v = linearLayout2;
    }

    @androidx.annotation.n0
    public static cv a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 19568, new Class[]{View.class}, cv.class);
        if (patchProxyResultProxy.isSupported) {
            return (cv) patchProxyResultProxy.result;
        }
        int i10 = R.id.divider;
        View viewA = l3.d.a(view, R.id.divider);
        if (viewA != null) {
            mb.o oVarA = mb.o.a(viewA);
            i10 = R.id.hsv;
            HorizontalScrollListView horizontalScrollListView = (HorizontalScrollListView) l3.d.a(view, R.id.hsv);
            if (horizontalScrollListView != null) {
                i10 = R.id.iv_gradient;
                ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_gradient);
                if (imageView != null) {
                    i10 = R.id.iv_icon;
                    ImageView imageView2 = (ImageView) l3.d.a(view, R.id.iv_icon);
                    if (imageView2 != null) {
                        i10 = R.id.pb_win_rate;
                        ProgressBar progressBar = (ProgressBar) l3.d.a(view, R.id.pb_win_rate);
                        if (progressBar != null) {
                            i10 = R.id.tv_d;
                            TextView textView = (TextView) l3.d.a(view, R.id.tv_d);
                            if (textView != null) {
                                i10 = R.id.tv_d_per_round;
                                TextView textView2 = (TextView) l3.d.a(view, R.id.tv_d_per_round);
                                if (textView2 != null) {
                                    i10 = R.id.tv_k;
                                    TextView textView3 = (TextView) l3.d.a(view, R.id.tv_k);
                                    if (textView3 != null) {
                                        i10 = R.id.tv_k_per_round;
                                        TextView textView4 = (TextView) l3.d.a(view, R.id.tv_k_per_round);
                                        if (textView4 != null) {
                                            i10 = R.id.tv_kd;
                                            TextView textView5 = (TextView) l3.d.a(view, R.id.tv_kd);
                                            if (textView5 != null) {
                                                i10 = R.id.tv_mmr;
                                                TextView textView6 = (TextView) l3.d.a(view, R.id.tv_mmr);
                                                if (textView6 != null) {
                                                    i10 = R.id.tv_multi_kill_ratio;
                                                    TextView textView7 = (TextView) l3.d.a(view, R.id.tv_multi_kill_ratio);
                                                    if (textView7 != null) {
                                                        i10 = R.id.tv_name;
                                                        TextView textView8 = (TextView) l3.d.a(view, R.id.tv_name);
                                                        if (textView8 != null) {
                                                            i10 = R.id.tv_penta_kill;
                                                            TextView textView9 = (TextView) l3.d.a(view, R.id.tv_penta_kill);
                                                            if (textView9 != null) {
                                                                i10 = R.id.tv_rank;
                                                                TextView textView10 = (TextView) l3.d.a(view, R.id.tv_rank);
                                                                if (textView10 != null) {
                                                                    i10 = R.id.tv_rounds_played;
                                                                    TextView textView11 = (TextView) l3.d.a(view, R.id.tv_rounds_played);
                                                                    if (textView11 != null) {
                                                                        i10 = R.id.tv_rounds_survived;
                                                                        TextView textView12 = (TextView) l3.d.a(view, R.id.tv_rounds_survived);
                                                                        if (textView12 != null) {
                                                                            i10 = R.id.tv_timeplayed;
                                                                            TextView textView13 = (TextView) l3.d.a(view, R.id.tv_timeplayed);
                                                                            if (textView13 != null) {
                                                                                i10 = R.id.tv_win_rate;
                                                                                TextView textView14 = (TextView) l3.d.a(view, R.id.tv_win_rate);
                                                                                if (textView14 != null) {
                                                                                    i10 = R.id.vg_container;
                                                                                    LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.vg_container);
                                                                                    if (linearLayout != null) {
                                                                                        i10 = R.id.vg_progress;
                                                                                        LinearLayout linearLayout2 = (LinearLayout) l3.d.a(view, R.id.vg_progress);
                                                                                        if (linearLayout2 != null) {
                                                                                            return new cv((RelativeLayout) view, oVarA, horizontalScrollListView, imageView, imageView2, progressBar, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9, textView10, textView11, textView12, textView13, textView14, linearLayout, linearLayout2);
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
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static cv c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 19566, new Class[]{LayoutInflater.class}, cv.class);
        return patchProxyResultProxy.isSupported ? (cv) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static cv d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 19567, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, cv.class);
        if (patchProxyResultProxy.isSupported) {
            return (cv) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_r6_player_operator_data, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f109510a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 19569, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
