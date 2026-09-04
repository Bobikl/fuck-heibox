package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemPubgShareCardBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class iu implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final CardView f111876a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final CardView f111877b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f111878c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f111879d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f111880e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f111881f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f111882g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f111883h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f111884i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f111885j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f111886k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f111887l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f111888m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f111889n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f111890o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f111891p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f111892q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f111893r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f111894s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f111895t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @androidx.annotation.n0
    public final View f111896u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f111897v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f111898w;

    private iu(@androidx.annotation.n0 CardView cardView, @androidx.annotation.n0 CardView cardView2, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 ImageView imageView2, @androidx.annotation.n0 ImageView imageView3, @androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 RelativeLayout relativeLayout2, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 TextView textView4, @androidx.annotation.n0 TextView textView5, @androidx.annotation.n0 TextView textView6, @androidx.annotation.n0 TextView textView7, @androidx.annotation.n0 TextView textView8, @androidx.annotation.n0 TextView textView9, @androidx.annotation.n0 TextView textView10, @androidx.annotation.n0 TextView textView11, @androidx.annotation.n0 TextView textView12, @androidx.annotation.n0 TextView textView13, @androidx.annotation.n0 View view, @androidx.annotation.n0 RelativeLayout relativeLayout3, @androidx.annotation.n0 RelativeLayout relativeLayout4) {
        this.f111876a = cardView;
        this.f111877b = cardView2;
        this.f111878c = imageView;
        this.f111879d = imageView2;
        this.f111880e = imageView3;
        this.f111881f = relativeLayout;
        this.f111882g = relativeLayout2;
        this.f111883h = textView;
        this.f111884i = textView2;
        this.f111885j = textView3;
        this.f111886k = textView4;
        this.f111887l = textView5;
        this.f111888m = textView6;
        this.f111889n = textView7;
        this.f111890o = textView8;
        this.f111891p = textView9;
        this.f111892q = textView10;
        this.f111893r = textView11;
        this.f111894s = textView12;
        this.f111895t = textView13;
        this.f111896u = view;
        this.f111897v = relativeLayout3;
        this.f111898w = relativeLayout4;
    }

    @androidx.annotation.n0
    public static iu a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 19488, new Class[]{View.class}, iu.class);
        if (patchProxyResultProxy.isSupported) {
            return (iu) patchProxyResultProxy.result;
        }
        CardView cardView = (CardView) view;
        int i10 = R.id.iv_avatar;
        ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_avatar);
        if (imageView != null) {
            i10 = R.id.iv_item_matches_mode;
            ImageView imageView2 = (ImageView) l3.d.a(view, R.id.iv_item_matches_mode);
            if (imageView2 != null) {
                i10 = R.id.iv_score;
                ImageView imageView3 = (ImageView) l3.d.a(view, R.id.iv_score);
                if (imageView3 != null) {
                    i10 = R.id.rl_avatar;
                    RelativeLayout relativeLayout = (RelativeLayout) l3.d.a(view, R.id.rl_avatar);
                    if (relativeLayout != null) {
                        i10 = R.id.rl_bg;
                        RelativeLayout relativeLayout2 = (RelativeLayout) l3.d.a(view, R.id.rl_bg);
                        if (relativeLayout2 != null) {
                            i10 = R.id.tv_item_matches_count;
                            TextView textView = (TextView) l3.d.a(view, R.id.tv_item_matches_count);
                            if (textView != null) {
                                i10 = R.id.tv_item_matches_kd;
                                TextView textView2 = (TextView) l3.d.a(view, R.id.tv_item_matches_kd);
                                if (textView2 != null) {
                                    i10 = R.id.tv_item_matches_kd_hint;
                                    TextView textView3 = (TextView) l3.d.a(view, R.id.tv_item_matches_kd_hint);
                                    if (textView3 != null) {
                                        i10 = R.id.tv_item_matches_rating;
                                        TextView textView4 = (TextView) l3.d.a(view, R.id.tv_item_matches_rating);
                                        if (textView4 != null) {
                                            i10 = R.id.tv_item_matches_rating_diff;
                                            TextView textView5 = (TextView) l3.d.a(view, R.id.tv_item_matches_rating_diff);
                                            if (textView5 != null) {
                                                i10 = R.id.tv_item_matches_rating_hint;
                                                TextView textView6 = (TextView) l3.d.a(view, R.id.tv_item_matches_rating_hint);
                                                if (textView6 != null) {
                                                    i10 = R.id.tv_item_matches_region;
                                                    TextView textView7 = (TextView) l3.d.a(view, R.id.tv_item_matches_region);
                                                    if (textView7 != null) {
                                                        i10 = R.id.tv_item_matches_time;
                                                        TextView textView8 = (TextView) l3.d.a(view, R.id.tv_item_matches_time);
                                                        if (textView8 != null) {
                                                            i10 = R.id.tv_name;
                                                            TextView textView9 = (TextView) l3.d.a(view, R.id.tv_name);
                                                            if (textView9 != null) {
                                                                i10 = R.id.tv_rank;
                                                                TextView textView10 = (TextView) l3.d.a(view, R.id.tv_rank);
                                                                if (textView10 != null) {
                                                                    i10 = R.id.tv_rank_header;
                                                                    TextView textView11 = (TextView) l3.d.a(view, R.id.tv_rank_header);
                                                                    if (textView11 != null) {
                                                                        i10 = R.id.tv_season;
                                                                        TextView textView12 = (TextView) l3.d.a(view, R.id.tv_season);
                                                                        if (textView12 != null) {
                                                                            i10 = R.id.tv_team_count;
                                                                            TextView textView13 = (TextView) l3.d.a(view, R.id.tv_team_count);
                                                                            if (textView13 != null) {
                                                                                i10 = R.id.v_item_matches_sign;
                                                                                View viewA = l3.d.a(view, R.id.v_item_matches_sign);
                                                                                if (viewA != null) {
                                                                                    i10 = R.id.vg_matches_count;
                                                                                    RelativeLayout relativeLayout3 = (RelativeLayout) l3.d.a(view, R.id.vg_matches_count);
                                                                                    if (relativeLayout3 != null) {
                                                                                        i10 = R.id.vg_rank;
                                                                                        RelativeLayout relativeLayout4 = (RelativeLayout) l3.d.a(view, R.id.vg_rank);
                                                                                        if (relativeLayout4 != null) {
                                                                                            return new iu(cardView, cardView, imageView, imageView2, imageView3, relativeLayout, relativeLayout2, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9, textView10, textView11, textView12, textView13, viewA, relativeLayout3, relativeLayout4);
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
    public static iu c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 19486, new Class[]{LayoutInflater.class}, iu.class);
        return patchProxyResultProxy.isSupported ? (iu) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static iu d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 19487, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, iu.class);
        if (patchProxyResultProxy.isSupported) {
            return (iu) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_pubg_share_card, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public CardView b() {
        return this.f111876a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 19489, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
