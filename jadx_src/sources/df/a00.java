package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemTradeOfferBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class a00 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final ConstraintLayout f108265a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final ConstraintLayout f108266b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f108267c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f108268d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f108269e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f108270f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f108271g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f108272h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f108273i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f108274j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f108275k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f108276l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f108277m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f108278n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @androidx.annotation.n0
    public final CardView f108279o;

    private a00(@androidx.annotation.n0 ConstraintLayout constraintLayout, @androidx.annotation.n0 ConstraintLayout constraintLayout2, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 ImageView imageView2, @androidx.annotation.n0 ImageView imageView3, @androidx.annotation.n0 ImageView imageView4, @androidx.annotation.n0 ImageView imageView5, @androidx.annotation.n0 ImageView imageView6, @androidx.annotation.n0 ImageView imageView7, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 TextView textView4, @androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 CardView cardView) {
        this.f108265a = constraintLayout;
        this.f108266b = constraintLayout2;
        this.f108267c = imageView;
        this.f108268d = imageView2;
        this.f108269e = imageView3;
        this.f108270f = imageView4;
        this.f108271g = imageView5;
        this.f108272h = imageView6;
        this.f108273i = imageView7;
        this.f108274j = textView;
        this.f108275k = textView2;
        this.f108276l = textView3;
        this.f108277m = textView4;
        this.f108278n = linearLayout;
        this.f108279o = cardView;
    }

    @androidx.annotation.n0
    public static a00 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 20076, new Class[]{View.class}, a00.class);
        if (patchProxyResultProxy.isSupported) {
            return (a00) patchProxyResultProxy.result;
        }
        ConstraintLayout constraintLayout = (ConstraintLayout) view;
        int i10 = R.id.iv_btn;
        ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_btn);
        if (imageView != null) {
            i10 = R.id.iv_count_arrow;
            ImageView imageView2 = (ImageView) l3.d.a(view, R.id.iv_count_arrow);
            if (imageView2 != null) {
                i10 = R.id.iv_item_bg;
                ImageView imageView3 = (ImageView) l3.d.a(view, R.id.iv_item_bg);
                if (imageView3 != null) {
                    i10 = R.id.iv_item_img;
                    ImageView imageView4 = (ImageView) l3.d.a(view, R.id.iv_item_img);
                    if (imageView4 != null) {
                        i10 = R.id.iv_rarity_tag;
                        ImageView imageView5 = (ImageView) l3.d.a(view, R.id.iv_rarity_tag);
                        if (imageView5 != null) {
                            i10 = R.id.iv_special;
                            ImageView imageView6 = (ImageView) l3.d.a(view, R.id.iv_special);
                            if (imageView6 != null) {
                                i10 = R.id.iv_steam;
                                ImageView imageView7 = (ImageView) l3.d.a(view, R.id.iv_steam);
                                if (imageView7 != null) {
                                    i10 = R.id.tv_btn;
                                    TextView textView = (TextView) l3.d.a(view, R.id.tv_btn);
                                    if (textView != null) {
                                        i10 = R.id.tv_count;
                                        TextView textView2 = (TextView) l3.d.a(view, R.id.tv_count);
                                        if (textView2 != null) {
                                            i10 = R.id.tv_join_time;
                                            TextView textView3 = (TextView) l3.d.a(view, R.id.tv_join_time);
                                            if (textView3 != null) {
                                                i10 = R.id.tv_name;
                                                TextView textView4 = (TextView) l3.d.a(view, R.id.tv_name);
                                                if (textView4 != null) {
                                                    i10 = R.id.vg_btn;
                                                    LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.vg_btn);
                                                    if (linearLayout != null) {
                                                        i10 = R.id.vg_item_img;
                                                        CardView cardView = (CardView) l3.d.a(view, R.id.vg_item_img);
                                                        if (cardView != null) {
                                                            return new a00(constraintLayout, constraintLayout, imageView, imageView2, imageView3, imageView4, imageView5, imageView6, imageView7, textView, textView2, textView3, textView4, linearLayout, cardView);
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
    public static a00 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 20074, new Class[]{LayoutInflater.class}, a00.class);
        return patchProxyResultProxy.isSupported ? (a00) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static a00 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 20075, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, a00.class);
        if (patchProxyResultProxy.isSupported) {
            return (a00) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_trade_offer, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public ConstraintLayout b() {
        return this.f108265a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 20077, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
