package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemMatchCsgob5Binding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class jq implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f112238a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f112239b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f112240c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f112241d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f112242e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f112243f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f112244g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f112245h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f112246i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f112247j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f112248k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f112249l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f112250m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @androidx.annotation.n0
    public final View f112251n;

    private jq(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 ImageView imageView2, @androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 TextView textView4, @androidx.annotation.n0 TextView textView5, @androidx.annotation.n0 TextView textView6, @androidx.annotation.n0 TextView textView7, @androidx.annotation.n0 TextView textView8, @androidx.annotation.n0 TextView textView9, @androidx.annotation.n0 View view) {
        this.f112238a = relativeLayout;
        this.f112239b = imageView;
        this.f112240c = imageView2;
        this.f112241d = linearLayout;
        this.f112242e = textView;
        this.f112243f = textView2;
        this.f112244g = textView3;
        this.f112245h = textView4;
        this.f112246i = textView5;
        this.f112247j = textView6;
        this.f112248k = textView7;
        this.f112249l = textView8;
        this.f112250m = textView9;
        this.f112251n = view;
    }

    @androidx.annotation.n0
    public static jq a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 19080, new Class[]{View.class}, jq.class);
        if (patchProxyResultProxy.isSupported) {
            return (jq) patchProxyResultProxy.result;
        }
        int i10 = R.id.iv_elo;
        ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_elo);
        if (imageView != null) {
            i10 = R.id.iv_more;
            ImageView imageView2 = (ImageView) l3.d.a(view, R.id.iv_more);
            if (imageView2 != null) {
                i10 = R.id.ll_settlement;
                LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.ll_settlement);
                if (linearLayout != null) {
                    i10 = R.id.tv_class_name;
                    TextView textView = (TextView) l3.d.a(view, R.id.tv_class_name);
                    if (textView != null) {
                        i10 = R.id.tv_elo;
                        TextView textView2 = (TextView) l3.d.a(view, R.id.tv_elo);
                        if (textView2 != null) {
                            i10 = R.id.tv_elo_change;
                            TextView textView3 = (TextView) l3.d.a(view, R.id.tv_elo_change);
                            if (textView3 != null) {
                                i10 = R.id.tv_kad_detail;
                                TextView textView4 = (TextView) l3.d.a(view, R.id.tv_kad_detail);
                                if (textView4 != null) {
                                    i10 = R.id.tv_map_name;
                                    TextView textView5 = (TextView) l3.d.a(view, R.id.tv_map_name);
                                    if (textView5 != null) {
                                        i10 = R.id.tv_rating;
                                        TextView textView6 = (TextView) l3.d.a(view, R.id.tv_rating);
                                        if (textView6 != null) {
                                            i10 = R.id.tv_result;
                                            TextView textView7 = (TextView) l3.d.a(view, R.id.tv_result);
                                            if (textView7 != null) {
                                                i10 = R.id.tv_score;
                                                TextView textView8 = (TextView) l3.d.a(view, R.id.tv_score);
                                                if (textView8 != null) {
                                                    i10 = R.id.tv_time;
                                                    TextView textView9 = (TextView) l3.d.a(view, R.id.tv_time);
                                                    if (textView9 != null) {
                                                        i10 = R.id.view_rank_highlight;
                                                        View viewA = l3.d.a(view, R.id.view_rank_highlight);
                                                        if (viewA != null) {
                                                            return new jq((RelativeLayout) view, imageView, imageView2, linearLayout, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9, viewA);
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
    public static jq c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 19078, new Class[]{LayoutInflater.class}, jq.class);
        return patchProxyResultProxy.isSupported ? (jq) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static jq d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 19079, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, jq.class);
        if (patchProxyResultProxy.isSupported) {
            return (jq) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_match_csgob5, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f112238a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 19081, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
