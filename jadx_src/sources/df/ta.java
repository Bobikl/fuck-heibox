package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.max.hbcustomview.chart.RadarView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;

/* JADX INFO: compiled from: FragmentPubgDetailV2Binding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class ta implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final SmartRefreshLayout f115907a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f115908b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f115909c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f115910d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f115911e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final RadarView f115912f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final RecyclerView f115913g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final RecyclerView f115914h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final SmartRefreshLayout f115915i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f115916j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f115917k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f115918l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @androidx.annotation.n0
    public final k90 f115919m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f115920n;

    private ta(@androidx.annotation.n0 SmartRefreshLayout smartRefreshLayout, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 ImageView imageView2, @androidx.annotation.n0 ImageView imageView3, @androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 RadarView radarView, @androidx.annotation.n0 RecyclerView recyclerView, @androidx.annotation.n0 RecyclerView recyclerView2, @androidx.annotation.n0 SmartRefreshLayout smartRefreshLayout2, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 k90 k90Var, @androidx.annotation.n0 LinearLayout linearLayout2) {
        this.f115907a = smartRefreshLayout;
        this.f115908b = imageView;
        this.f115909c = imageView2;
        this.f115910d = imageView3;
        this.f115911e = linearLayout;
        this.f115912f = radarView;
        this.f115913g = recyclerView;
        this.f115914h = recyclerView2;
        this.f115915i = smartRefreshLayout2;
        this.f115916j = textView;
        this.f115917k = textView2;
        this.f115918l = textView3;
        this.f115919m = k90Var;
        this.f115920n = linearLayout2;
    }

    @androidx.annotation.n0
    public static ta a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 17460, new Class[]{View.class}, ta.class);
        if (patchProxyResultProxy.isSupported) {
            return (ta) patchProxyResultProxy.result;
        }
        int i10 = R.id.iv_arrow;
        ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_arrow);
        if (imageView != null) {
            i10 = R.id.iv_mode;
            ImageView imageView2 = (ImageView) l3.d.a(view, R.id.iv_mode);
            if (imageView2 != null) {
                i10 = R.id.iv_rating_img;
                ImageView imageView3 = (ImageView) l3.d.a(view, R.id.iv_rating_img);
                if (imageView3 != null) {
                    i10 = R.id.ll_mode;
                    LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.ll_mode);
                    if (linearLayout != null) {
                        i10 = R.id.radar;
                        RadarView radarView = (RadarView) l3.d.a(view, R.id.radar);
                        if (radarView != null) {
                            i10 = R.id.rv_overview;
                            RecyclerView recyclerView = (RecyclerView) l3.d.a(view, R.id.rv_overview);
                            if (recyclerView != null) {
                                i10 = R.id.rv_stats;
                                RecyclerView recyclerView2 = (RecyclerView) l3.d.a(view, R.id.rv_stats);
                                if (recyclerView2 != null) {
                                    SmartRefreshLayout smartRefreshLayout = (SmartRefreshLayout) view;
                                    i10 = R.id.tv_match_count;
                                    TextView textView = (TextView) l3.d.a(view, R.id.tv_match_count);
                                    if (textView != null) {
                                        i10 = R.id.tv_mode;
                                        TextView textView2 = (TextView) l3.d.a(view, R.id.tv_mode);
                                        if (textView2 != null) {
                                            i10 = R.id.tv_radar_title;
                                            TextView textView3 = (TextView) l3.d.a(view, R.id.tv_radar_title);
                                            if (textView3 != null) {
                                                i10 = R.id.vg_matches;
                                                View viewA = l3.d.a(view, R.id.vg_matches);
                                                if (viewA != null) {
                                                    k90 k90VarA = k90.a(viewA);
                                                    i10 = R.id.vg_radar;
                                                    LinearLayout linearLayout2 = (LinearLayout) l3.d.a(view, R.id.vg_radar);
                                                    if (linearLayout2 != null) {
                                                        return new ta(smartRefreshLayout, imageView, imageView2, imageView3, linearLayout, radarView, recyclerView, recyclerView2, smartRefreshLayout, textView, textView2, textView3, k90VarA, linearLayout2);
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
    public static ta c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 17458, new Class[]{LayoutInflater.class}, ta.class);
        return patchProxyResultProxy.isSupported ? (ta) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static ta d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 17459, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, ta.class);
        if (patchProxyResultProxy.isSupported) {
            return (ta) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.fragment_pubg_detail_v2, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public SmartRefreshLayout b() {
        return this.f115907a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 17461, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
