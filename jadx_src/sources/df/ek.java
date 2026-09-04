package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemGameBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class ek implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final LinearLayout f110216a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final CardView f110217b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final View f110218c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f110219d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f110220e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f110221f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f110222g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f110223h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f110224i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f110225j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f110226k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f110227l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f110228m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f110229n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f110230o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f110231p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f110232q;

    private ek(@androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 CardView cardView, @androidx.annotation.n0 View view, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 ImageView imageView2, @androidx.annotation.n0 LinearLayout linearLayout2, @androidx.annotation.n0 LinearLayout linearLayout3, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 TextView textView4, @androidx.annotation.n0 TextView textView5, @androidx.annotation.n0 TextView textView6, @androidx.annotation.n0 LinearLayout linearLayout4, @androidx.annotation.n0 LinearLayout linearLayout5, @androidx.annotation.n0 LinearLayout linearLayout6, @androidx.annotation.n0 LinearLayout linearLayout7) {
        this.f110216a = linearLayout;
        this.f110217b = cardView;
        this.f110218c = view;
        this.f110219d = imageView;
        this.f110220e = imageView2;
        this.f110221f = linearLayout2;
        this.f110222g = linearLayout3;
        this.f110223h = textView;
        this.f110224i = textView2;
        this.f110225j = textView3;
        this.f110226k = textView4;
        this.f110227l = textView5;
        this.f110228m = textView6;
        this.f110229n = linearLayout4;
        this.f110230o = linearLayout5;
        this.f110231p = linearLayout6;
        this.f110232q = linearLayout7;
    }

    @androidx.annotation.n0
    public static ek a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 18439, new Class[]{View.class}, ek.class);
        if (patchProxyResultProxy.isSupported) {
            return (ek) patchProxyResultProxy.result;
        }
        int i10 = R.id.cv_game_img;
        CardView cardView = (CardView) l3.d.a(view, R.id.cv_game_img);
        if (cardView != null) {
            i10 = R.id.divider;
            View viewA = l3.d.a(view, R.id.divider);
            if (viewA != null) {
                i10 = R.id.iv_follow_icon;
                ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_follow_icon);
                if (imageView != null) {
                    i10 = R.id.iv_img;
                    ImageView imageView2 = (ImageView) l3.d.a(view, R.id.iv_img);
                    if (imageView2 != null) {
                        i10 = R.id.ll_genres;
                        LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.ll_genres);
                        if (linearLayout != null) {
                            i10 = R.id.ll_platform_icon;
                            LinearLayout linearLayout2 = (LinearLayout) l3.d.a(view, R.id.ll_platform_icon);
                            if (linearLayout2 != null) {
                                i10 = R.id.tv_deadline_date;
                                TextView textView = (TextView) l3.d.a(view, R.id.tv_deadline_date);
                                if (textView != null) {
                                    i10 = R.id.tv_follow_num;
                                    TextView textView2 = (TextView) l3.d.a(view, R.id.tv_follow_num);
                                    if (textView2 != null) {
                                        i10 = R.id.tv_follow_num_unit;
                                        TextView textView3 = (TextView) l3.d.a(view, R.id.tv_follow_num_unit);
                                        if (textView3 != null) {
                                            i10 = R.id.tv_follow_state;
                                            TextView textView4 = (TextView) l3.d.a(view, R.id.tv_follow_state);
                                            if (textView4 != null) {
                                                i10 = R.id.tv_peak_user_num;
                                                TextView textView5 = (TextView) l3.d.a(view, R.id.tv_peak_user_num);
                                                if (textView5 != null) {
                                                    i10 = R.id.tv_release_date;
                                                    TextView textView6 = (TextView) l3.d.a(view, R.id.tv_release_date);
                                                    if (textView6 != null) {
                                                        i10 = R.id.vg_follow_num;
                                                        LinearLayout linearLayout3 = (LinearLayout) l3.d.a(view, R.id.vg_follow_num);
                                                        if (linearLayout3 != null) {
                                                            LinearLayout linearLayout4 = (LinearLayout) view;
                                                            i10 = R.id.vg_is_owned;
                                                            LinearLayout linearLayout5 = (LinearLayout) l3.d.a(view, R.id.vg_is_owned);
                                                            if (linearLayout5 != null) {
                                                                i10 = R.id.vg_name;
                                                                LinearLayout linearLayout6 = (LinearLayout) l3.d.a(view, R.id.vg_name);
                                                                if (linearLayout6 != null) {
                                                                    return new ek(linearLayout4, cardView, viewA, imageView, imageView2, linearLayout, linearLayout2, textView, textView2, textView3, textView4, textView5, textView6, linearLayout3, linearLayout4, linearLayout5, linearLayout6);
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
    public static ek c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 18437, new Class[]{LayoutInflater.class}, ek.class);
        return patchProxyResultProxy.isSupported ? (ek) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static ek d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 18438, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, ek.class);
        if (patchProxyResultProxy.isSupported) {
            return (ek) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_game, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public LinearLayout b() {
        return this.f110216a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 18440, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
