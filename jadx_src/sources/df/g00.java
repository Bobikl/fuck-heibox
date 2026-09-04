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

/* JADX INFO: compiled from: ItemTradeSupplyListBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class g00 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final ConstraintLayout f110744a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final ConstraintLayout f110745b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f110746c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f110747d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f110748e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f110749f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f110750g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f110751h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f110752i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f110753j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f110754k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f110755l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f110756m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f110757n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f110758o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f110759p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @androidx.annotation.n0
    public final View f110760q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @androidx.annotation.n0
    public final CardView f110761r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @androidx.annotation.n0
    public final ConstraintLayout f110762s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f110763t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f110764u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f110765v;

    private g00(@androidx.annotation.n0 ConstraintLayout constraintLayout, @androidx.annotation.n0 ConstraintLayout constraintLayout2, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 ImageView imageView2, @androidx.annotation.n0 ImageView imageView3, @androidx.annotation.n0 ImageView imageView4, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 TextView textView4, @androidx.annotation.n0 TextView textView5, @androidx.annotation.n0 TextView textView6, @androidx.annotation.n0 TextView textView7, @androidx.annotation.n0 TextView textView8, @androidx.annotation.n0 TextView textView9, @androidx.annotation.n0 TextView textView10, @androidx.annotation.n0 View view, @androidx.annotation.n0 CardView cardView, @androidx.annotation.n0 ConstraintLayout constraintLayout3, @androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 LinearLayout linearLayout2, @androidx.annotation.n0 LinearLayout linearLayout3) {
        this.f110744a = constraintLayout;
        this.f110745b = constraintLayout2;
        this.f110746c = imageView;
        this.f110747d = imageView2;
        this.f110748e = imageView3;
        this.f110749f = imageView4;
        this.f110750g = textView;
        this.f110751h = textView2;
        this.f110752i = textView3;
        this.f110753j = textView4;
        this.f110754k = textView5;
        this.f110755l = textView6;
        this.f110756m = textView7;
        this.f110757n = textView8;
        this.f110758o = textView9;
        this.f110759p = textView10;
        this.f110760q = view;
        this.f110761r = cardView;
        this.f110762s = constraintLayout3;
        this.f110763t = linearLayout;
        this.f110764u = linearLayout2;
        this.f110765v = linearLayout3;
    }

    @androidx.annotation.n0
    public static g00 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 20100, new Class[]{View.class}, g00.class);
        if (patchProxyResultProxy.isSupported) {
            return (g00) patchProxyResultProxy.result;
        }
        ConstraintLayout constraintLayout = (ConstraintLayout) view;
        int i10 = R.id.iv_item_bg;
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
                        i10 = R.id.tv_count;
                        TextView textView = (TextView) l3.d.a(view, R.id.tv_count);
                        if (textView != null) {
                            i10 = R.id.tv_create_time;
                            TextView textView2 = (TextView) l3.d.a(view, R.id.tv_create_time);
                            if (textView2 != null) {
                                i10 = R.id.tv_highest_price;
                                TextView textView3 = (TextView) l3.d.a(view, R.id.tv_highest_price);
                                if (textView3 != null) {
                                    i10 = R.id.tv_name;
                                    TextView textView4 = (TextView) l3.d.a(view, R.id.tv_name);
                                    if (textView4 != null) {
                                        i10 = R.id.tv_price;
                                        TextView textView5 = (TextView) l3.d.a(view, R.id.tv_price);
                                        if (textView5 != null) {
                                            i10 = R.id.tv_price_desc;
                                            TextView textView6 = (TextView) l3.d.a(view, R.id.tv_price_desc);
                                            if (textView6 != null) {
                                                i10 = R.id.tv_price_symbol;
                                                TextView textView7 = (TextView) l3.d.a(view, R.id.tv_price_symbol);
                                                if (textView7 != null) {
                                                    i10 = R.id.tv_record_state;
                                                    TextView textView8 = (TextView) l3.d.a(view, R.id.tv_record_state);
                                                    if (textView8 != null) {
                                                        i10 = R.id.tv_supply_state;
                                                        TextView textView9 = (TextView) l3.d.a(view, R.id.tv_supply_state);
                                                        if (textView9 != null) {
                                                            i10 = R.id.tv_total;
                                                            TextView textView10 = (TextView) l3.d.a(view, R.id.tv_total);
                                                            if (textView10 != null) {
                                                                i10 = R.id.v_supply_state;
                                                                View viewA = l3.d.a(view, R.id.v_supply_state);
                                                                if (viewA != null) {
                                                                    i10 = R.id.vg_item_img;
                                                                    CardView cardView = (CardView) l3.d.a(view, R.id.vg_item_img);
                                                                    if (cardView != null) {
                                                                        i10 = R.id.vg_price_info;
                                                                        ConstraintLayout constraintLayout2 = (ConstraintLayout) l3.d.a(view, R.id.vg_price_info);
                                                                        if (constraintLayout2 != null) {
                                                                            i10 = R.id.vg_supply_info;
                                                                            LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.vg_supply_info);
                                                                            if (linearLayout != null) {
                                                                                i10 = R.id.vg_supply_state;
                                                                                LinearLayout linearLayout2 = (LinearLayout) l3.d.a(view, R.id.vg_supply_state);
                                                                                if (linearLayout2 != null) {
                                                                                    i10 = R.id.vg_tag;
                                                                                    LinearLayout linearLayout3 = (LinearLayout) l3.d.a(view, R.id.vg_tag);
                                                                                    if (linearLayout3 != null) {
                                                                                        return new g00(constraintLayout, constraintLayout, imageView, imageView2, imageView3, imageView4, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9, textView10, viewA, cardView, constraintLayout2, linearLayout, linearLayout2, linearLayout3);
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
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static g00 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 20098, new Class[]{LayoutInflater.class}, g00.class);
        return patchProxyResultProxy.isSupported ? (g00) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static g00 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 20099, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, g00.class);
        if (patchProxyResultProxy.isSupported) {
            return (g00) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_trade_supply_list, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public ConstraintLayout b() {
        return this.f110744a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 20101, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
