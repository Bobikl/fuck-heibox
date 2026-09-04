package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.max.hbcustomview.HBLineHeightTextView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemMallRecProductV2Binding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class fq implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final CardView f110648a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final CardView f110649b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final CardView f110650c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f110651d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f110652e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f110653f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f110654g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final HBLineHeightTextView f110655h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f110656i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final View f110657j;

    private fq(@androidx.annotation.n0 CardView cardView, @androidx.annotation.n0 CardView cardView2, @androidx.annotation.n0 CardView cardView3, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 HBLineHeightTextView hBLineHeightTextView, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 View view) {
        this.f110648a = cardView;
        this.f110649b = cardView2;
        this.f110650c = cardView3;
        this.f110651d = imageView;
        this.f110652e = linearLayout;
        this.f110653f = textView;
        this.f110654g = textView2;
        this.f110655h = hBLineHeightTextView;
        this.f110656i = textView3;
        this.f110657j = view;
    }

    @androidx.annotation.n0
    public static fq a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 19064, new Class[]{View.class}, fq.class);
        if (patchProxyResultProxy.isSupported) {
            return (fq) patchProxyResultProxy.result;
        }
        CardView cardView = (CardView) view;
        int i10 = R.id.cv_htag;
        CardView cardView2 = (CardView) l3.d.a(view, R.id.cv_htag);
        if (cardView2 != null) {
            i10 = R.id.iv_img;
            ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_img);
            if (imageView != null) {
                i10 = R.id.ll_htag;
                LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.ll_htag);
                if (linearLayout != null) {
                    i10 = R.id.tv_current_price;
                    TextView textView = (TextView) l3.d.a(view, R.id.tv_current_price);
                    if (textView != null) {
                        i10 = R.id.tv_discount_info;
                        TextView textView2 = (TextView) l3.d.a(view, R.id.tv_discount_info);
                        if (textView2 != null) {
                            i10 = R.id.tv_name;
                            HBLineHeightTextView hBLineHeightTextView = (HBLineHeightTextView) l3.d.a(view, R.id.tv_name);
                            if (hBLineHeightTextView != null) {
                                i10 = R.id.tv_original_price;
                                TextView textView3 = (TextView) l3.d.a(view, R.id.tv_original_price);
                                if (textView3 != null) {
                                    i10 = R.id.v_stoke;
                                    View viewA = l3.d.a(view, R.id.v_stoke);
                                    if (viewA != null) {
                                        return new fq(cardView, cardView, cardView2, imageView, linearLayout, textView, textView2, hBLineHeightTextView, textView3, viewA);
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
    public static fq c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 19062, new Class[]{LayoutInflater.class}, fq.class);
        return patchProxyResultProxy.isSupported ? (fq) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static fq d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 19063, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, fq.class);
        if (patchProxyResultProxy.isSupported) {
            return (fq) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_mall_rec_product_v2, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public CardView b() {
        return this.f110648a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 19065, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
