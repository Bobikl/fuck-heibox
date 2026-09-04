package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
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

/* JADX INFO: compiled from: ItemTradeFavourBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class wz implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    @androidx.annotation.n0
    public final FrameLayout A;

    @androidx.annotation.n0
    public final CardView B;

    @androidx.annotation.n0
    public final LinearLayout C;

    @androidx.annotation.n0
    public final LinearLayout D;

    @androidx.annotation.n0
    public final LinearLayout E;

    @androidx.annotation.n0
    public final LinearLayout F;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final ConstraintLayout f117278a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final Barrier f117279b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final ConstraintLayout f117280c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f117281d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f117282e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f117283f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f117284g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f117285h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f117286i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f117287j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f117288k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f117289l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f117290m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f117291n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f117292o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f117293p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f117294q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f117295r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f117296s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f117297t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f117298u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f117299v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @androidx.annotation.n0
    public final View f117300w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @androidx.annotation.n0
    public final ub0 f117301x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f117302y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @androidx.annotation.n0
    public final View f117303z;

    private wz(@androidx.annotation.n0 ConstraintLayout constraintLayout, @androidx.annotation.n0 Barrier barrier, @androidx.annotation.n0 ConstraintLayout constraintLayout2, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 ImageView imageView2, @androidx.annotation.n0 ImageView imageView3, @androidx.annotation.n0 ImageView imageView4, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 TextView textView4, @androidx.annotation.n0 TextView textView5, @androidx.annotation.n0 TextView textView6, @androidx.annotation.n0 TextView textView7, @androidx.annotation.n0 TextView textView8, @androidx.annotation.n0 TextView textView9, @androidx.annotation.n0 TextView textView10, @androidx.annotation.n0 TextView textView11, @androidx.annotation.n0 TextView textView12, @androidx.annotation.n0 TextView textView13, @androidx.annotation.n0 TextView textView14, @androidx.annotation.n0 TextView textView15, @androidx.annotation.n0 View view, @androidx.annotation.n0 ub0 ub0Var, @androidx.annotation.n0 ImageView imageView5, @androidx.annotation.n0 View view2, @androidx.annotation.n0 FrameLayout frameLayout, @androidx.annotation.n0 CardView cardView, @androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 LinearLayout linearLayout2, @androidx.annotation.n0 LinearLayout linearLayout3, @androidx.annotation.n0 LinearLayout linearLayout4) {
        this.f117278a = constraintLayout;
        this.f117279b = barrier;
        this.f117280c = constraintLayout2;
        this.f117281d = imageView;
        this.f117282e = imageView2;
        this.f117283f = imageView3;
        this.f117284g = imageView4;
        this.f117285h = textView;
        this.f117286i = textView2;
        this.f117287j = textView3;
        this.f117288k = textView4;
        this.f117289l = textView5;
        this.f117290m = textView6;
        this.f117291n = textView7;
        this.f117292o = textView8;
        this.f117293p = textView9;
        this.f117294q = textView10;
        this.f117295r = textView11;
        this.f117296s = textView12;
        this.f117297t = textView13;
        this.f117298u = textView14;
        this.f117299v = textView15;
        this.f117300w = view;
        this.f117301x = ub0Var;
        this.f117302y = imageView5;
        this.f117303z = view2;
        this.A = frameLayout;
        this.B = cardView;
        this.C = linearLayout;
        this.D = linearLayout2;
        this.E = linearLayout3;
        this.F = linearLayout4;
    }

    @androidx.annotation.n0
    public static wz a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 20060, new Class[]{View.class}, wz.class);
        if (patchProxyResultProxy.isSupported) {
            return (wz) patchProxyResultProxy.result;
        }
        int i10 = R.id.barrier2;
        Barrier barrier = (Barrier) l3.d.a(view, R.id.barrier2);
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
                            i10 = R.id.tv_arrow;
                            TextView textView = (TextView) l3.d.a(view, R.id.tv_arrow);
                            if (textView != null) {
                                i10 = R.id.tv_buy_state;
                                TextView textView2 = (TextView) l3.d.a(view, R.id.tv_buy_state);
                                if (textView2 != null) {
                                    i10 = R.id.tv_count;
                                    TextView textView3 = (TextView) l3.d.a(view, R.id.tv_count);
                                    if (textView3 != null) {
                                        i10 = R.id.tv_float_value;
                                        TextView textView4 = (TextView) l3.d.a(view, R.id.tv_float_value);
                                        if (textView4 != null) {
                                            i10 = R.id.tv_name;
                                            TextView textView5 = (TextView) l3.d.a(view, R.id.tv_name);
                                            if (textView5 != null) {
                                                i10 = R.id.tv_price_symbol;
                                                TextView textView6 = (TextView) l3.d.a(view, R.id.tv_price_symbol);
                                                if (textView6 != null) {
                                                    i10 = R.id.tv_pruchase_desc;
                                                    TextView textView7 = (TextView) l3.d.a(view, R.id.tv_pruchase_desc);
                                                    if (textView7 != null) {
                                                        i10 = R.id.tv_pruchase_price;
                                                        TextView textView8 = (TextView) l3.d.a(view, R.id.tv_pruchase_price);
                                                        if (textView8 != null) {
                                                            i10 = R.id.tv_pruchase_price_symbol;
                                                            TextView textView9 = (TextView) l3.d.a(view, R.id.tv_pruchase_price_symbol);
                                                            if (textView9 != null) {
                                                                i10 = R.id.tv_purchase;
                                                                TextView textView10 = (TextView) l3.d.a(view, R.id.tv_purchase);
                                                                if (textView10 != null) {
                                                                    i10 = R.id.tv_sale_desc;
                                                                    TextView textView11 = (TextView) l3.d.a(view, R.id.tv_sale_desc);
                                                                    if (textView11 != null) {
                                                                        i10 = R.id.tv_trade_price;
                                                                        TextView textView12 = (TextView) l3.d.a(view, R.id.tv_trade_price);
                                                                        if (textView12 != null) {
                                                                            i10 = R.id.tv_trend_price;
                                                                            TextView textView13 = (TextView) l3.d.a(view, R.id.tv_trend_price);
                                                                            if (textView13 != null) {
                                                                                i10 = R.id.tv_trend_symbol;
                                                                                TextView textView14 = (TextView) l3.d.a(view, R.id.tv_trend_symbol);
                                                                                if (textView14 != null) {
                                                                                    i10 = R.id.tv_view;
                                                                                    TextView textView15 = (TextView) l3.d.a(view, R.id.tv_view);
                                                                                    if (textView15 != null) {
                                                                                        i10 = R.id.v_divider;
                                                                                        View viewA = l3.d.a(view, R.id.v_divider);
                                                                                        if (viewA != null) {
                                                                                            i10 = R.id.v_float_bar;
                                                                                            View viewA2 = l3.d.a(view, R.id.v_float_bar);
                                                                                            if (viewA2 != null) {
                                                                                                ub0 ub0VarA = ub0.a(viewA2);
                                                                                                i10 = R.id.v_float_cursor;
                                                                                                ImageView imageView5 = (ImageView) l3.d.a(view, R.id.v_float_cursor);
                                                                                                if (imageView5 != null) {
                                                                                                    i10 = R.id.v_progress;
                                                                                                    View viewA3 = l3.d.a(view, R.id.v_progress);
                                                                                                    if (viewA3 != null) {
                                                                                                        i10 = R.id.vg_favour_info;
                                                                                                        FrameLayout frameLayout = (FrameLayout) l3.d.a(view, R.id.vg_favour_info);
                                                                                                        if (frameLayout != null) {
                                                                                                            i10 = R.id.vg_item_img;
                                                                                                            CardView cardView = (CardView) l3.d.a(view, R.id.vg_item_img);
                                                                                                            if (cardView != null) {
                                                                                                                i10 = R.id.vg_purchase_info;
                                                                                                                LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.vg_purchase_info);
                                                                                                                if (linearLayout != null) {
                                                                                                                    i10 = R.id.vg_stickers;
                                                                                                                    LinearLayout linearLayout2 = (LinearLayout) l3.d.a(view, R.id.vg_stickers);
                                                                                                                    if (linearLayout2 != null) {
                                                                                                                        i10 = R.id.vg_tag;
                                                                                                                        LinearLayout linearLayout3 = (LinearLayout) l3.d.a(view, R.id.vg_tag);
                                                                                                                        if (linearLayout3 != null) {
                                                                                                                            i10 = R.id.vg_trade_price;
                                                                                                                            LinearLayout linearLayout4 = (LinearLayout) l3.d.a(view, R.id.vg_trade_price);
                                                                                                                            if (linearLayout4 != null) {
                                                                                                                                return new wz(constraintLayout, barrier, constraintLayout, imageView, imageView2, imageView3, imageView4, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9, textView10, textView11, textView12, textView13, textView14, textView15, viewA, ub0VarA, imageView5, viewA3, frameLayout, cardView, linearLayout, linearLayout2, linearLayout3, linearLayout4);
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
    public static wz c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 20058, new Class[]{LayoutInflater.class}, wz.class);
        return patchProxyResultProxy.isSupported ? (wz) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static wz d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 20059, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, wz.class);
        if (patchProxyResultProxy.isSupported) {
            return (wz) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_trade_favour, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public ConstraintLayout b() {
        return this.f117278a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 20061, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
