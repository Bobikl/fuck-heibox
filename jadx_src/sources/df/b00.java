package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemTradeOrderListBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class b00 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final ConstraintLayout f108688a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final Barrier f108689b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final ConstraintLayout f108690c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f108691d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f108692e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f108693f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f108694g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f108695h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f108696i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f108697j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f108698k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f108699l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f108700m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f108701n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @androidx.annotation.n0
    public final CardView f108702o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f108703p;

    private b00(@androidx.annotation.n0 ConstraintLayout constraintLayout, @androidx.annotation.n0 Barrier barrier, @androidx.annotation.n0 ConstraintLayout constraintLayout2, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 ImageView imageView2, @androidx.annotation.n0 ImageView imageView3, @androidx.annotation.n0 ImageView imageView4, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 TextView textView4, @androidx.annotation.n0 TextView textView5, @androidx.annotation.n0 TextView textView6, @androidx.annotation.n0 TextView textView7, @androidx.annotation.n0 CardView cardView, @androidx.annotation.n0 LinearLayout linearLayout) {
        this.f108688a = constraintLayout;
        this.f108689b = barrier;
        this.f108690c = constraintLayout2;
        this.f108691d = imageView;
        this.f108692e = imageView2;
        this.f108693f = imageView3;
        this.f108694g = imageView4;
        this.f108695h = textView;
        this.f108696i = textView2;
        this.f108697j = textView3;
        this.f108698k = textView4;
        this.f108699l = textView5;
        this.f108700m = textView6;
        this.f108701n = textView7;
        this.f108702o = cardView;
        this.f108703p = linearLayout;
    }

    @androidx.annotation.n0
    public static b00 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 20080, new Class[]{View.class}, b00.class);
        if (patchProxyResultProxy.isSupported) {
            return (b00) patchProxyResultProxy.result;
        }
        int i10 = R.id.barrier;
        Barrier barrier = (Barrier) l3.d.a(view, R.id.barrier);
        if (barrier != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) view;
            i10 = R.id.iv_item_bg;
            ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_item_bg);
            if (imageView != null) {
                i10 = R.id.iv_item_img;
                ImageView imageView2 = (ImageView) l3.d.a(view, R.id.iv_item_img);
                if (imageView2 != null) {
                    i10 = R.id.iv_rarity_tag;
                    ImageView imageView3 = (ImageView) l3.d.a(view, R.id.iv_rarity_tag);
                    if (imageView3 != null) {
                        i10 = R.id.iv_special;
                        ImageView imageView4 = (ImageView) l3.d.a(view, R.id.iv_special);
                        if (imageView4 != null) {
                            i10 = R.id.tv_amount;
                            TextView textView = (TextView) l3.d.a(view, R.id.tv_amount);
                            if (textView != null) {
                                i10 = R.id.tv_btn_action;
                                TextView textView2 = (TextView) l3.d.a(view, R.id.tv_btn_action);
                                if (textView2 != null) {
                                    i10 = R.id.tv_create_time;
                                    TextView textView3 = (TextView) l3.d.a(view, R.id.tv_create_time);
                                    if (textView3 != null) {
                                        i10 = R.id.tv_name;
                                        TextView textView4 = (TextView) l3.d.a(view, R.id.tv_name);
                                        if (textView4 != null) {
                                            i10 = R.id.tv_order_desc;
                                            TextView textView5 = (TextView) l3.d.a(view, R.id.tv_order_desc);
                                            if (textView5 != null) {
                                                i10 = R.id.tv_price_symbol;
                                                TextView textView6 = (TextView) l3.d.a(view, R.id.tv_price_symbol);
                                                if (textView6 != null) {
                                                    i10 = R.id.tv_trade_price;
                                                    TextView textView7 = (TextView) l3.d.a(view, R.id.tv_trade_price);
                                                    if (textView7 != null) {
                                                        i10 = R.id.vg_item_img;
                                                        CardView cardView = (CardView) l3.d.a(view, R.id.vg_item_img);
                                                        if (cardView != null) {
                                                            i10 = R.id.vg_tag;
                                                            LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.vg_tag);
                                                            if (linearLayout != null) {
                                                                return new b00(constraintLayout, barrier, constraintLayout, imageView, imageView2, imageView3, imageView4, textView, textView2, textView3, textView4, textView5, textView6, textView7, cardView, linearLayout);
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
    public static b00 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 20078, new Class[]{LayoutInflater.class}, b00.class);
        return patchProxyResultProxy.isSupported ? (b00) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static b00 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 20079, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, b00.class);
        if (patchProxyResultProxy.isSupported) {
            return (b00) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_trade_order_list, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public ConstraintLayout b() {
        return this.f108688a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 20081, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
