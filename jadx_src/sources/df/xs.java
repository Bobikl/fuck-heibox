package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemPlayerLeaderboardsHeaderPubgBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class xs implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final LinearLayout f117615a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f117616b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final RecyclerView f117617c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f117618d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f117619e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f117620f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f117621g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f117622h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f117623i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f117624j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f117625k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @androidx.annotation.n0
    public final v80 f117626l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @androidx.annotation.n0
    public final w80 f117627m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f117628n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @androidx.annotation.n0
    public final zs f117629o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f117630p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f117631q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f117632r;

    private xs(@androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 RecyclerView recyclerView, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 TextView textView4, @androidx.annotation.n0 TextView textView5, @androidx.annotation.n0 TextView textView6, @androidx.annotation.n0 TextView textView7, @androidx.annotation.n0 TextView textView8, @androidx.annotation.n0 v80 v80Var, @androidx.annotation.n0 w80 w80Var, @androidx.annotation.n0 LinearLayout linearLayout2, @androidx.annotation.n0 zs zsVar, @androidx.annotation.n0 LinearLayout linearLayout3, @androidx.annotation.n0 LinearLayout linearLayout4, @androidx.annotation.n0 LinearLayout linearLayout5) {
        this.f117615a = linearLayout;
        this.f117616b = imageView;
        this.f117617c = recyclerView;
        this.f117618d = textView;
        this.f117619e = textView2;
        this.f117620f = textView3;
        this.f117621g = textView4;
        this.f117622h = textView5;
        this.f117623i = textView6;
        this.f117624j = textView7;
        this.f117625k = textView8;
        this.f117626l = v80Var;
        this.f117627m = w80Var;
        this.f117628n = linearLayout2;
        this.f117629o = zsVar;
        this.f117630p = linearLayout3;
        this.f117631q = linearLayout4;
        this.f117632r = linearLayout5;
    }

    @androidx.annotation.n0
    public static xs a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 19344, new Class[]{View.class}, xs.class);
        if (patchProxyResultProxy.isSupported) {
            return (xs) patchProxyResultProxy.result;
        }
        int i10 = R.id.iv_rating_space;
        ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_rating_space);
        if (imageView != null) {
            i10 = R.id.rv_rating_distribution;
            RecyclerView recyclerView = (RecyclerView) l3.d.a(view, R.id.rv_rating_distribution);
            if (recyclerView != null) {
                i10 = R.id.tv_board_value_desc;
                TextView textView = (TextView) l3.d.a(view, R.id.tv_board_value_desc);
                if (textView != null) {
                    i10 = R.id.tv_board_value_desc0;
                    TextView textView2 = (TextView) l3.d.a(view, R.id.tv_board_value_desc0);
                    if (textView2 != null) {
                        i10 = R.id.tv_board_value_desc1;
                        TextView textView3 = (TextView) l3.d.a(view, R.id.tv_board_value_desc1);
                        if (textView3 != null) {
                            i10 = R.id.tv_distribution_title;
                            TextView textView4 = (TextView) l3.d.a(view, R.id.tv_distribution_title);
                            if (textView4 != null) {
                                i10 = R.id.tv_rating_desc;
                                TextView textView5 = (TextView) l3.d.a(view, R.id.tv_rating_desc);
                                if (textView5 != null) {
                                    i10 = R.id.tv_rating_percentile;
                                    TextView textView6 = (TextView) l3.d.a(view, R.id.tv_rating_percentile);
                                    if (textView6 != null) {
                                        i10 = R.id.tv_rating_start_end;
                                        TextView textView7 = (TextView) l3.d.a(view, R.id.tv_rating_start_end);
                                        if (textView7 != null) {
                                            i10 = R.id.tv_rating_top;
                                            TextView textView8 = (TextView) l3.d.a(view, R.id.tv_rating_top);
                                            if (textView8 != null) {
                                                i10 = R.id.vg_destiny2_header;
                                                View viewA = l3.d.a(view, R.id.vg_destiny2_header);
                                                if (viewA != null) {
                                                    v80 v80VarA = v80.a(viewA);
                                                    i10 = R.id.vg_eclipse_header;
                                                    View viewA2 = l3.d.a(view, R.id.vg_eclipse_header);
                                                    if (viewA2 != null) {
                                                        w80 w80VarA = w80.a(viewA2);
                                                        i10 = R.id.vg_filter;
                                                        LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.vg_filter);
                                                        if (linearLayout != null) {
                                                            i10 = R.id.vg_player_header;
                                                            View viewA3 = l3.d.a(view, R.id.vg_player_header);
                                                            if (viewA3 != null) {
                                                                zs zsVarA = zs.a(viewA3);
                                                                i10 = R.id.vg_pubg_header;
                                                                LinearLayout linearLayout2 = (LinearLayout) l3.d.a(view, R.id.vg_pubg_header);
                                                                if (linearLayout2 != null) {
                                                                    i10 = R.id.vg_rating_detail;
                                                                    LinearLayout linearLayout3 = (LinearLayout) l3.d.a(view, R.id.vg_rating_detail);
                                                                    if (linearLayout3 != null) {
                                                                        i10 = R.id.vg_rating_distribution;
                                                                        LinearLayout linearLayout4 = (LinearLayout) l3.d.a(view, R.id.vg_rating_distribution);
                                                                        if (linearLayout4 != null) {
                                                                            return new xs((LinearLayout) view, imageView, recyclerView, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, v80VarA, w80VarA, linearLayout, zsVarA, linearLayout2, linearLayout3, linearLayout4);
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
    public static xs c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 19342, new Class[]{LayoutInflater.class}, xs.class);
        return patchProxyResultProxy.isSupported ? (xs) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static xs d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 19343, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, xs.class);
        if (patchProxyResultProxy.isSupported) {
            return (xs) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_player_leaderboards_header_pubg, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public LinearLayout b() {
        return this.f117615a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 19345, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
