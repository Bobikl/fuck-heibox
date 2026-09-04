package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.max.hbcustomview.HorizontalScrollListView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemR6PlayerOperatorDataHeaderBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class dv implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f109885a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final mb.o f109886b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final HorizontalScrollListView f109887c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f109888d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f109889e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f109890f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f109891g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f109892h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f109893i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f109894j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f109895k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f109896l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f109897m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f109898n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f109899o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f109900p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f109901q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f109902r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f109903s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f109904t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f109905u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f109906v;

    private dv(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 mb.o oVar, @androidx.annotation.n0 HorizontalScrollListView horizontalScrollListView, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 ImageView imageView2, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 TextView textView4, @androidx.annotation.n0 TextView textView5, @androidx.annotation.n0 TextView textView6, @androidx.annotation.n0 TextView textView7, @androidx.annotation.n0 TextView textView8, @androidx.annotation.n0 TextView textView9, @androidx.annotation.n0 TextView textView10, @androidx.annotation.n0 TextView textView11, @androidx.annotation.n0 TextView textView12, @androidx.annotation.n0 TextView textView13, @androidx.annotation.n0 TextView textView14, @androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 LinearLayout linearLayout2, @androidx.annotation.n0 LinearLayout linearLayout3) {
        this.f109885a = relativeLayout;
        this.f109886b = oVar;
        this.f109887c = horizontalScrollListView;
        this.f109888d = imageView;
        this.f109889e = imageView2;
        this.f109890f = textView;
        this.f109891g = textView2;
        this.f109892h = textView3;
        this.f109893i = textView4;
        this.f109894j = textView5;
        this.f109895k = textView6;
        this.f109896l = textView7;
        this.f109897m = textView8;
        this.f109898n = textView9;
        this.f109899o = textView10;
        this.f109900p = textView11;
        this.f109901q = textView12;
        this.f109902r = textView13;
        this.f109903s = textView14;
        this.f109904t = linearLayout;
        this.f109905u = linearLayout2;
        this.f109906v = linearLayout3;
    }

    @androidx.annotation.n0
    public static dv a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 19572, new Class[]{View.class}, dv.class);
        if (patchProxyResultProxy.isSupported) {
            return (dv) patchProxyResultProxy.result;
        }
        int i10 = R.id.divider;
        View viewA = l3.d.a(view, R.id.divider);
        if (viewA != null) {
            mb.o oVarA = mb.o.a(viewA);
            i10 = R.id.hsv_header;
            HorizontalScrollListView horizontalScrollListView = (HorizontalScrollListView) l3.d.a(view, R.id.hsv_header);
            if (horizontalScrollListView != null) {
                i10 = R.id.iv_gradient_header;
                ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_gradient_header);
                if (imageView != null) {
                    i10 = R.id.iv_icon;
                    ImageView imageView2 = (ImageView) l3.d.a(view, R.id.iv_icon);
                    if (imageView2 != null) {
                        i10 = R.id.tv_name;
                        TextView textView = (TextView) l3.d.a(view, R.id.tv_name);
                        if (textView != null) {
                            i10 = R.id.tv_sort_d;
                            TextView textView2 = (TextView) l3.d.a(view, R.id.tv_sort_d);
                            if (textView2 != null) {
                                i10 = R.id.tv_sort_d_per_round;
                                TextView textView3 = (TextView) l3.d.a(view, R.id.tv_sort_d_per_round);
                                if (textView3 != null) {
                                    i10 = R.id.tv_sort_k;
                                    TextView textView4 = (TextView) l3.d.a(view, R.id.tv_sort_k);
                                    if (textView4 != null) {
                                        i10 = R.id.tv_sort_k_per_round;
                                        TextView textView5 = (TextView) l3.d.a(view, R.id.tv_sort_k_per_round);
                                        if (textView5 != null) {
                                            i10 = R.id.tv_sort_kd;
                                            TextView textView6 = (TextView) l3.d.a(view, R.id.tv_sort_kd);
                                            if (textView6 != null) {
                                                i10 = R.id.tv_sort_mmr;
                                                TextView textView7 = (TextView) l3.d.a(view, R.id.tv_sort_mmr);
                                                if (textView7 != null) {
                                                    i10 = R.id.tv_sort_penta_kill;
                                                    TextView textView8 = (TextView) l3.d.a(view, R.id.tv_sort_penta_kill);
                                                    if (textView8 != null) {
                                                        i10 = R.id.tv_sort_rank;
                                                        TextView textView9 = (TextView) l3.d.a(view, R.id.tv_sort_rank);
                                                        if (textView9 != null) {
                                                            i10 = R.id.tv_sort_rounds_multi_kill_ratio;
                                                            TextView textView10 = (TextView) l3.d.a(view, R.id.tv_sort_rounds_multi_kill_ratio);
                                                            if (textView10 != null) {
                                                                i10 = R.id.tv_sort_rounds_played;
                                                                TextView textView11 = (TextView) l3.d.a(view, R.id.tv_sort_rounds_played);
                                                                if (textView11 != null) {
                                                                    i10 = R.id.tv_sort_rounds_survived;
                                                                    TextView textView12 = (TextView) l3.d.a(view, R.id.tv_sort_rounds_survived);
                                                                    if (textView12 != null) {
                                                                        i10 = R.id.tv_sort_timeplayed;
                                                                        TextView textView13 = (TextView) l3.d.a(view, R.id.tv_sort_timeplayed);
                                                                        if (textView13 != null) {
                                                                            i10 = R.id.tv_sort_win_rate;
                                                                            TextView textView14 = (TextView) l3.d.a(view, R.id.tv_sort_win_rate);
                                                                            if (textView14 != null) {
                                                                                i10 = R.id.vg_container;
                                                                                LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.vg_container);
                                                                                if (linearLayout != null) {
                                                                                    i10 = R.id.vg_progress;
                                                                                    LinearLayout linearLayout2 = (LinearLayout) l3.d.a(view, R.id.vg_progress);
                                                                                    if (linearLayout2 != null) {
                                                                                        i10 = R.id.vg_sort_mmr_rank;
                                                                                        LinearLayout linearLayout3 = (LinearLayout) l3.d.a(view, R.id.vg_sort_mmr_rank);
                                                                                        if (linearLayout3 != null) {
                                                                                            return new dv((RelativeLayout) view, oVarA, horizontalScrollListView, imageView, imageView2, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9, textView10, textView11, textView12, textView13, textView14, linearLayout, linearLayout2, linearLayout3);
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
    public static dv c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 19570, new Class[]{LayoutInflater.class}, dv.class);
        return patchProxyResultProxy.isSupported ? (dv) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static dv d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 19571, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, dv.class);
        if (patchProxyResultProxy.isSupported) {
            return (dv) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_r6_player_operator_data_header, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f109885a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 19573, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
