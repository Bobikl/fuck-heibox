package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.flexbox.FlexboxLayout;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemMallProductHorizonBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class cq implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final ConstraintLayout f109471a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final FlexboxLayout f109472b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f109473c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f109474d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f109475e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f109476f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f109477g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f109478h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f109479i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f109480j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f109481k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @androidx.annotation.n0
    public final CardView f109482l;

    private cq(@androidx.annotation.n0 ConstraintLayout constraintLayout, @androidx.annotation.n0 FlexboxLayout flexboxLayout, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 ImageView imageView2, @androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 LinearLayout linearLayout2, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 TextView textView4, @androidx.annotation.n0 LinearLayout linearLayout3, @androidx.annotation.n0 CardView cardView) {
        this.f109471a = constraintLayout;
        this.f109472b = flexboxLayout;
        this.f109473c = imageView;
        this.f109474d = imageView2;
        this.f109475e = linearLayout;
        this.f109476f = linearLayout2;
        this.f109477g = textView;
        this.f109478h = textView2;
        this.f109479i = textView3;
        this.f109480j = textView4;
        this.f109481k = linearLayout3;
        this.f109482l = cardView;
    }

    @androidx.annotation.n0
    public static cq a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 19052, new Class[]{View.class}, cq.class);
        if (patchProxyResultProxy.isSupported) {
            return (cq) patchProxyResultProxy.result;
        }
        int i10 = R.id.fl_tags;
        FlexboxLayout flexboxLayout = (FlexboxLayout) l3.d.a(view, R.id.fl_tags);
        if (flexboxLayout != null) {
            i10 = R.id.iv_game_bg;
            ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_game_bg);
            if (imageView != null) {
                i10 = R.id.iv_img;
                ImageView imageView2 = (ImageView) l3.d.a(view, R.id.iv_img);
                if (imageView2 != null) {
                    i10 = R.id.ll_htag;
                    LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.ll_htag);
                    if (linearLayout != null) {
                        i10 = R.id.ll_price;
                        LinearLayout linearLayout2 = (LinearLayout) l3.d.a(view, R.id.ll_price);
                        if (linearLayout2 != null) {
                            i10 = R.id.tv_current_price;
                            TextView textView = (TextView) l3.d.a(view, R.id.tv_current_price);
                            if (textView != null) {
                                i10 = R.id.tv_discount;
                                TextView textView2 = (TextView) l3.d.a(view, R.id.tv_discount);
                                if (textView2 != null) {
                                    i10 = R.id.tv_name;
                                    TextView textView3 = (TextView) l3.d.a(view, R.id.tv_name);
                                    if (textView3 != null) {
                                        i10 = R.id.tv_original_price;
                                        TextView textView4 = (TextView) l3.d.a(view, R.id.tv_original_price);
                                        if (textView4 != null) {
                                            i10 = R.id.vg_btn;
                                            LinearLayout linearLayout3 = (LinearLayout) l3.d.a(view, R.id.vg_btn);
                                            if (linearLayout3 != null) {
                                                i10 = R.id.vg_img;
                                                CardView cardView = (CardView) l3.d.a(view, R.id.vg_img);
                                                if (cardView != null) {
                                                    return new cq((ConstraintLayout) view, flexboxLayout, imageView, imageView2, linearLayout, linearLayout2, textView, textView2, textView3, textView4, linearLayout3, cardView);
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
    public static cq c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 19050, new Class[]{LayoutInflater.class}, cq.class);
        return patchProxyResultProxy.isSupported ? (cq) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static cq d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 19051, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, cq.class);
        if (patchProxyResultProxy.isSupported) {
            return (cq) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_mall_product_horizon, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public ConstraintLayout b() {
        return this.f109471a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 19053, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
