package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemR6OperatorsBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class yu implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f118050a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f118051b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final ProgressBar f118052c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f118053d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f118054e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f118055f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f118056g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f118057h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f118058i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f118059j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f118060k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @androidx.annotation.n0
    public final View f118061l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f118062m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f118063n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f118064o;

    private yu(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 ProgressBar progressBar, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 TextView textView4, @androidx.annotation.n0 TextView textView5, @androidx.annotation.n0 TextView textView6, @androidx.annotation.n0 TextView textView7, @androidx.annotation.n0 TextView textView8, @androidx.annotation.n0 View view, @androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 LinearLayout linearLayout2, @androidx.annotation.n0 LinearLayout linearLayout3) {
        this.f118050a = relativeLayout;
        this.f118051b = imageView;
        this.f118052c = progressBar;
        this.f118053d = textView;
        this.f118054e = textView2;
        this.f118055f = textView3;
        this.f118056g = textView4;
        this.f118057h = textView5;
        this.f118058i = textView6;
        this.f118059j = textView7;
        this.f118060k = textView8;
        this.f118061l = view;
        this.f118062m = linearLayout;
        this.f118063n = linearLayout2;
        this.f118064o = linearLayout3;
    }

    @androidx.annotation.n0
    public static yu a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 19552, new Class[]{View.class}, yu.class);
        if (patchProxyResultProxy.isSupported) {
            return (yu) patchProxyResultProxy.result;
        }
        int i10 = R.id.iv_icon;
        ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_icon);
        if (imageView != null) {
            i10 = R.id.pb_ranking;
            ProgressBar progressBar = (ProgressBar) l3.d.a(view, R.id.pb_ranking);
            if (progressBar != null) {
                i10 = R.id.tv_divier;
                TextView textView = (TextView) l3.d.a(view, R.id.tv_divier);
                if (textView != null) {
                    i10 = R.id.tv_item_matches_kd;
                    TextView textView2 = (TextView) l3.d.a(view, R.id.tv_item_matches_kd);
                    if (textView2 != null) {
                        i10 = R.id.tv_item_matches_kd_hint;
                        TextView textView3 = (TextView) l3.d.a(view, R.id.tv_item_matches_kd_hint);
                        if (textView3 != null) {
                            i10 = R.id.tv_item_name;
                            TextView textView4 = (TextView) l3.d.a(view, R.id.tv_item_name);
                            if (textView4 != null) {
                                i10 = R.id.tv_item_rank;
                                TextView textView5 = (TextView) l3.d.a(view, R.id.tv_item_rank);
                                if (textView5 != null) {
                                    i10 = R.id.tv_item_rank_hint;
                                    TextView textView6 = (TextView) l3.d.a(view, R.id.tv_item_rank_hint);
                                    if (textView6 != null) {
                                        i10 = R.id.tv_item_winrate;
                                        TextView textView7 = (TextView) l3.d.a(view, R.id.tv_item_winrate);
                                        if (textView7 != null) {
                                            i10 = R.id.tv_rounds_count;
                                            TextView textView8 = (TextView) l3.d.a(view, R.id.tv_rounds_count);
                                            if (textView8 != null) {
                                                i10 = R.id.v_divider;
                                                View viewA = l3.d.a(view, R.id.v_divider);
                                                if (viewA != null) {
                                                    i10 = R.id.vg_kd;
                                                    LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.vg_kd);
                                                    if (linearLayout != null) {
                                                        i10 = R.id.vg_progress;
                                                        LinearLayout linearLayout2 = (LinearLayout) l3.d.a(view, R.id.vg_progress);
                                                        if (linearLayout2 != null) {
                                                            i10 = R.id.vg_rank;
                                                            LinearLayout linearLayout3 = (LinearLayout) l3.d.a(view, R.id.vg_rank);
                                                            if (linearLayout3 != null) {
                                                                return new yu((RelativeLayout) view, imageView, progressBar, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, viewA, linearLayout, linearLayout2, linearLayout3);
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
    public static yu c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 19550, new Class[]{LayoutInflater.class}, yu.class);
        return patchProxyResultProxy.isSupported ? (yu) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static yu d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 19551, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, yu.class);
        if (patchProxyResultProxy.isSupported) {
            return (yu) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_r6_operators, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f118050a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 19553, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
