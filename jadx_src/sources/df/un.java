package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemGlobalPriceTrendBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class un implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final ConstraintLayout f116476a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f116477b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f116478c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f116479d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f116480e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f116481f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f116482g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f116483h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f116484i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f116485j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f116486k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @androidx.annotation.n0
    public final View f116487l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f116488m;

    private un(@androidx.annotation.n0 ConstraintLayout constraintLayout, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 ImageView imageView2, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 TextView textView4, @androidx.annotation.n0 TextView textView5, @androidx.annotation.n0 TextView textView6, @androidx.annotation.n0 TextView textView7, @androidx.annotation.n0 TextView textView8, @androidx.annotation.n0 View view, @androidx.annotation.n0 LinearLayout linearLayout) {
        this.f116476a = constraintLayout;
        this.f116477b = imageView;
        this.f116478c = imageView2;
        this.f116479d = textView;
        this.f116480e = textView2;
        this.f116481f = textView3;
        this.f116482g = textView4;
        this.f116483h = textView5;
        this.f116484i = textView6;
        this.f116485j = textView7;
        this.f116486k = textView8;
        this.f116487l = view;
        this.f116488m = linearLayout;
    }

    @androidx.annotation.n0
    public static un a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 18812, new Class[]{View.class}, un.class);
        if (patchProxyResultProxy.isSupported) {
            return (un) patchProxyResultProxy.result;
        }
        int i10 = R.id.iv_flag;
        ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_flag);
        if (imageView != null) {
            i10 = R.id.iv_ps_plus;
            ImageView imageView2 = (ImageView) l3.d.a(view, R.id.iv_ps_plus);
            if (imageView2 != null) {
                i10 = R.id.tv_current_price;
                TextView textView = (TextView) l3.d.a(view, R.id.tv_current_price);
                if (textView != null) {
                    i10 = R.id.tv_current_symbol;
                    TextView textView2 = (TextView) l3.d.a(view, R.id.tv_current_symbol);
                    if (textView2 != null) {
                        i10 = R.id.tv_deadline_date;
                        TextView textView3 = (TextView) l3.d.a(view, R.id.tv_deadline_date);
                        if (textView3 != null) {
                            i10 = R.id.tv_discount;
                            TextView textView4 = (TextView) l3.d.a(view, R.id.tv_discount);
                            if (textView4 != null) {
                                i10 = R.id.tv_go_buy;
                                TextView textView5 = (TextView) l3.d.a(view, R.id.tv_go_buy);
                                if (textView5 != null) {
                                    i10 = R.id.tv_lowest_price;
                                    TextView textView6 = (TextView) l3.d.a(view, R.id.tv_lowest_price);
                                    if (textView6 != null) {
                                        i10 = R.id.tv_name;
                                        TextView textView7 = (TextView) l3.d.a(view, R.id.tv_name);
                                        if (textView7 != null) {
                                            i10 = R.id.tv_usd_price;
                                            TextView textView8 = (TextView) l3.d.a(view, R.id.tv_usd_price);
                                            if (textView8 != null) {
                                                i10 = R.id.v_divider;
                                                View viewA = l3.d.a(view, R.id.v_divider);
                                                if (viewA != null) {
                                                    i10 = R.id.vg_region;
                                                    LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.vg_region);
                                                    if (linearLayout != null) {
                                                        return new un((ConstraintLayout) view, imageView, imageView2, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, viewA, linearLayout);
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
    public static un c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 18810, new Class[]{LayoutInflater.class}, un.class);
        return patchProxyResultProxy.isSupported ? (un) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static un d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 18811, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, un.class);
        if (patchProxyResultProxy.isSupported) {
            return (un) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_global_price_trend, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public ConstraintLayout b() {
        return this.f116476a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 18813, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
