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

/* JADX INFO: compiled from: ItemWaitDeliverBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class o10 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final ConstraintLayout f114023a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final Barrier f114024b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final Barrier f114025c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final ConstraintLayout f114026d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f114027e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f114028f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f114029g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f114030h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f114031i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f114032j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f114033k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f114034l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f114035m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f114036n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f114037o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @androidx.annotation.n0
    public final View f114038p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @androidx.annotation.n0
    public final ub0 f114039q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f114040r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @androidx.annotation.n0
    public final View f114041s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @androidx.annotation.n0
    public final CardView f114042t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f114043u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f114044v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f114045w;

    private o10(@androidx.annotation.n0 ConstraintLayout constraintLayout, @androidx.annotation.n0 Barrier barrier, @androidx.annotation.n0 Barrier barrier2, @androidx.annotation.n0 ConstraintLayout constraintLayout2, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 ImageView imageView2, @androidx.annotation.n0 ImageView imageView3, @androidx.annotation.n0 ImageView imageView4, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 TextView textView4, @androidx.annotation.n0 TextView textView5, @androidx.annotation.n0 TextView textView6, @androidx.annotation.n0 TextView textView7, @androidx.annotation.n0 View view, @androidx.annotation.n0 ub0 ub0Var, @androidx.annotation.n0 ImageView imageView5, @androidx.annotation.n0 View view2, @androidx.annotation.n0 CardView cardView, @androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 LinearLayout linearLayout2, @androidx.annotation.n0 LinearLayout linearLayout3) {
        this.f114023a = constraintLayout;
        this.f114024b = barrier;
        this.f114025c = barrier2;
        this.f114026d = constraintLayout2;
        this.f114027e = imageView;
        this.f114028f = imageView2;
        this.f114029g = imageView3;
        this.f114030h = imageView4;
        this.f114031i = textView;
        this.f114032j = textView2;
        this.f114033k = textView3;
        this.f114034l = textView4;
        this.f114035m = textView5;
        this.f114036n = textView6;
        this.f114037o = textView7;
        this.f114038p = view;
        this.f114039q = ub0Var;
        this.f114040r = imageView5;
        this.f114041s = view2;
        this.f114042t = cardView;
        this.f114043u = linearLayout;
        this.f114044v = linearLayout2;
        this.f114045w = linearLayout3;
    }

    @androidx.annotation.n0
    public static o10 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 20236, new Class[]{View.class}, o10.class);
        if (patchProxyResultProxy.isSupported) {
            return (o10) patchProxyResultProxy.result;
        }
        int i10 = R.id.barrier;
        Barrier barrier = (Barrier) l3.d.a(view, R.id.barrier);
        if (barrier != null) {
            i10 = R.id.barrier2;
            Barrier barrier2 = (Barrier) l3.d.a(view, R.id.barrier2);
            if (barrier2 != null) {
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
                                    i10 = R.id.tv_float_value;
                                    TextView textView2 = (TextView) l3.d.a(view, R.id.tv_float_value);
                                    if (textView2 != null) {
                                        i10 = R.id.tv_name;
                                        TextView textView3 = (TextView) l3.d.a(view, R.id.tv_name);
                                        if (textView3 != null) {
                                            i10 = R.id.tv_price_symbol;
                                            TextView textView4 = (TextView) l3.d.a(view, R.id.tv_price_symbol);
                                            if (textView4 != null) {
                                                i10 = R.id.tv_time_left;
                                                TextView textView5 = (TextView) l3.d.a(view, R.id.tv_time_left);
                                                if (textView5 != null) {
                                                    i10 = R.id.tv_time_left_desc;
                                                    TextView textView6 = (TextView) l3.d.a(view, R.id.tv_time_left_desc);
                                                    if (textView6 != null) {
                                                        i10 = R.id.tv_trade_price;
                                                        TextView textView7 = (TextView) l3.d.a(view, R.id.tv_trade_price);
                                                        if (textView7 != null) {
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
                                                                            i10 = R.id.vg_item_img;
                                                                            CardView cardView = (CardView) l3.d.a(view, R.id.vg_item_img);
                                                                            if (cardView != null) {
                                                                                i10 = R.id.vg_stickers;
                                                                                LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.vg_stickers);
                                                                                if (linearLayout != null) {
                                                                                    i10 = R.id.vg_tag;
                                                                                    LinearLayout linearLayout2 = (LinearLayout) l3.d.a(view, R.id.vg_tag);
                                                                                    if (linearLayout2 != null) {
                                                                                        i10 = R.id.vg_trade_price;
                                                                                        LinearLayout linearLayout3 = (LinearLayout) l3.d.a(view, R.id.vg_trade_price);
                                                                                        if (linearLayout3 != null) {
                                                                                            return new o10(constraintLayout, barrier, barrier2, constraintLayout, imageView, imageView2, imageView3, imageView4, textView, textView2, textView3, textView4, textView5, textView6, textView7, viewA, ub0VarA, imageView5, viewA3, cardView, linearLayout, linearLayout2, linearLayout3);
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
    public static o10 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 20234, new Class[]{LayoutInflater.class}, o10.class);
        return patchProxyResultProxy.isSupported ? (o10) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static o10 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 20235, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, o10.class);
        if (patchProxyResultProxy.isSupported) {
            return (o10) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_wait_deliver, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public ConstraintLayout b() {
        return this.f114023a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 20237, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
