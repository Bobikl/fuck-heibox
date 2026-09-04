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

/* JADX INFO: compiled from: ItemMatchesBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class kq implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final ConstraintLayout f112678a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f112679b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final Guideline f112680c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f112681d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f112682e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f112683f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f112684g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f112685h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f112686i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f112687j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f112688k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f112689l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f112690m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f112691n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f112692o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f112693p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f112694q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f112695r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @androidx.annotation.n0
    public final View f112696s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @androidx.annotation.n0
    public final View f112697t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f112698u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f112699v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f112700w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f112701x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f112702y;

    private kq(@androidx.annotation.n0 ConstraintLayout constraintLayout, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 Guideline guideline, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 TextView textView4, @androidx.annotation.n0 TextView textView5, @androidx.annotation.n0 TextView textView6, @androidx.annotation.n0 TextView textView7, @androidx.annotation.n0 TextView textView8, @androidx.annotation.n0 TextView textView9, @androidx.annotation.n0 TextView textView10, @androidx.annotation.n0 TextView textView11, @androidx.annotation.n0 TextView textView12, @androidx.annotation.n0 TextView textView13, @androidx.annotation.n0 TextView textView14, @androidx.annotation.n0 TextView textView15, @androidx.annotation.n0 View view, @androidx.annotation.n0 View view2, @androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 RelativeLayout relativeLayout2, @androidx.annotation.n0 RelativeLayout relativeLayout3, @androidx.annotation.n0 RelativeLayout relativeLayout4, @androidx.annotation.n0 RelativeLayout relativeLayout5) {
        this.f112678a = constraintLayout;
        this.f112679b = imageView;
        this.f112680c = guideline;
        this.f112681d = textView;
        this.f112682e = textView2;
        this.f112683f = textView3;
        this.f112684g = textView4;
        this.f112685h = textView5;
        this.f112686i = textView6;
        this.f112687j = textView7;
        this.f112688k = textView8;
        this.f112689l = textView9;
        this.f112690m = textView10;
        this.f112691n = textView11;
        this.f112692o = textView12;
        this.f112693p = textView13;
        this.f112694q = textView14;
        this.f112695r = textView15;
        this.f112696s = view;
        this.f112697t = view2;
        this.f112698u = relativeLayout;
        this.f112699v = relativeLayout2;
        this.f112700w = relativeLayout3;
        this.f112701x = relativeLayout4;
        this.f112702y = relativeLayout5;
    }

    @androidx.annotation.n0
    public static kq a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 19084, new Class[]{View.class}, kq.class);
        if (patchProxyResultProxy.isSupported) {
            return (kq) patchProxyResultProxy.result;
        }
        int i10 = R.id.iv_item_matches_mode;
        ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_item_matches_mode);
        if (imageView != null) {
            i10 = R.id.line_guide;
            Guideline guideline = (Guideline) l3.d.a(view, R.id.line_guide);
            if (guideline != null) {
                i10 = R.id.tv_fpp;
                TextView textView = (TextView) l3.d.a(view, R.id.tv_fpp);
                if (textView != null) {
                    i10 = R.id.tv_item_matches_count;
                    TextView textView2 = (TextView) l3.d.a(view, R.id.tv_item_matches_count);
                    if (textView2 != null) {
                        i10 = R.id.tv_item_matches_count_desc;
                        TextView textView3 = (TextView) l3.d.a(view, R.id.tv_item_matches_count_desc);
                        if (textView3 != null) {
                            i10 = R.id.tv_item_matches_kd;
                            TextView textView4 = (TextView) l3.d.a(view, R.id.tv_item_matches_kd);
                            if (textView4 != null) {
                                i10 = R.id.tv_item_matches_kd_hint;
                                TextView textView5 = (TextView) l3.d.a(view, R.id.tv_item_matches_kd_hint);
                                if (textView5 != null) {
                                    i10 = R.id.tv_item_matches_rating;
                                    TextView textView6 = (TextView) l3.d.a(view, R.id.tv_item_matches_rating);
                                    if (textView6 != null) {
                                        i10 = R.id.tv_item_matches_rating_diff;
                                        TextView textView7 = (TextView) l3.d.a(view, R.id.tv_item_matches_rating_diff);
                                        if (textView7 != null) {
                                            i10 = R.id.tv_item_matches_rating_hint;
                                            TextView textView8 = (TextView) l3.d.a(view, R.id.tv_item_matches_rating_hint);
                                            if (textView8 != null) {
                                                i10 = R.id.tv_item_matches_region;
                                                TextView textView9 = (TextView) l3.d.a(view, R.id.tv_item_matches_region);
                                                if (textView9 != null) {
                                                    i10 = R.id.tv_item_matches_score;
                                                    TextView textView10 = (TextView) l3.d.a(view, R.id.tv_item_matches_score);
                                                    if (textView10 != null) {
                                                        i10 = R.id.tv_item_matches_time;
                                                        TextView textView11 = (TextView) l3.d.a(view, R.id.tv_item_matches_time);
                                                        if (textView11 != null) {
                                                            i10 = R.id.tv_map;
                                                            TextView textView12 = (TextView) l3.d.a(view, R.id.tv_map);
                                                            if (textView12 != null) {
                                                                i10 = R.id.tv_rank;
                                                                TextView textView13 = (TextView) l3.d.a(view, R.id.tv_rank);
                                                                if (textView13 != null) {
                                                                    i10 = R.id.tv_rank_header;
                                                                    TextView textView14 = (TextView) l3.d.a(view, R.id.tv_rank_header);
                                                                    if (textView14 != null) {
                                                                        i10 = R.id.tv_team_count;
                                                                        TextView textView15 = (TextView) l3.d.a(view, R.id.tv_team_count);
                                                                        if (textView15 != null) {
                                                                            i10 = R.id.v_item_matches_divider;
                                                                            View viewA = l3.d.a(view, R.id.v_item_matches_divider);
                                                                            if (viewA != null) {
                                                                                i10 = R.id.v_item_matches_sign;
                                                                                View viewA2 = l3.d.a(view, R.id.v_item_matches_sign);
                                                                                if (viewA2 != null) {
                                                                                    i10 = R.id.vg_kd;
                                                                                    RelativeLayout relativeLayout = (RelativeLayout) l3.d.a(view, R.id.vg_kd);
                                                                                    if (relativeLayout != null) {
                                                                                        i10 = R.id.vg_matches_count;
                                                                                        RelativeLayout relativeLayout2 = (RelativeLayout) l3.d.a(view, R.id.vg_matches_count);
                                                                                        if (relativeLayout2 != null) {
                                                                                            i10 = R.id.vg_mode;
                                                                                            RelativeLayout relativeLayout3 = (RelativeLayout) l3.d.a(view, R.id.vg_mode);
                                                                                            if (relativeLayout3 != null) {
                                                                                                i10 = R.id.vg_rank;
                                                                                                RelativeLayout relativeLayout4 = (RelativeLayout) l3.d.a(view, R.id.vg_rank);
                                                                                                if (relativeLayout4 != null) {
                                                                                                    i10 = R.id.vg_rating;
                                                                                                    RelativeLayout relativeLayout5 = (RelativeLayout) l3.d.a(view, R.id.vg_rating);
                                                                                                    if (relativeLayout5 != null) {
                                                                                                        return new kq((ConstraintLayout) view, imageView, guideline, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9, textView10, textView11, textView12, textView13, textView14, textView15, viewA, viewA2, relativeLayout, relativeLayout2, relativeLayout3, relativeLayout4, relativeLayout5);
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
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static kq c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 19082, new Class[]{LayoutInflater.class}, kq.class);
        return patchProxyResultProxy.isSupported ? (kq) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static kq d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 19083, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, kq.class);
        if (patchProxyResultProxy.isSupported) {
            return (kq) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_matches, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public ConstraintLayout b() {
        return this.f112678a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 19085, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
