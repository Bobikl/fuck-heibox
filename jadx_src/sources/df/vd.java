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

/* JADX INFO: compiled from: ItemBargainOrderListBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class vd implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final LinearLayout f116795a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final Barrier f116796b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final Barrier f116797c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final ConstraintLayout f116798d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f116799e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f116800f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f116801g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f116802h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f116803i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f116804j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f116805k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f116806l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f116807m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f116808n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f116809o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f116810p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f116811q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @androidx.annotation.n0
    public final ub0 f116812r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f116813s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @androidx.annotation.n0
    public final View f116814t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @androidx.annotation.n0
    public final CardView f116815u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f116816v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f116817w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f116818x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f116819y;

    private vd(@androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 Barrier barrier, @androidx.annotation.n0 Barrier barrier2, @androidx.annotation.n0 ConstraintLayout constraintLayout, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 ImageView imageView2, @androidx.annotation.n0 ImageView imageView3, @androidx.annotation.n0 ImageView imageView4, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 TextView textView4, @androidx.annotation.n0 TextView textView5, @androidx.annotation.n0 TextView textView6, @androidx.annotation.n0 TextView textView7, @androidx.annotation.n0 TextView textView8, @androidx.annotation.n0 TextView textView9, @androidx.annotation.n0 ub0 ub0Var, @androidx.annotation.n0 ImageView imageView5, @androidx.annotation.n0 View view, @androidx.annotation.n0 CardView cardView, @androidx.annotation.n0 LinearLayout linearLayout2, @androidx.annotation.n0 LinearLayout linearLayout3, @androidx.annotation.n0 LinearLayout linearLayout4, @androidx.annotation.n0 LinearLayout linearLayout5) {
        this.f116795a = linearLayout;
        this.f116796b = barrier;
        this.f116797c = barrier2;
        this.f116798d = constraintLayout;
        this.f116799e = imageView;
        this.f116800f = imageView2;
        this.f116801g = imageView3;
        this.f116802h = imageView4;
        this.f116803i = textView;
        this.f116804j = textView2;
        this.f116805k = textView3;
        this.f116806l = textView4;
        this.f116807m = textView5;
        this.f116808n = textView6;
        this.f116809o = textView7;
        this.f116810p = textView8;
        this.f116811q = textView9;
        this.f116812r = ub0Var;
        this.f116813s = imageView5;
        this.f116814t = view;
        this.f116815u = cardView;
        this.f116816v = linearLayout2;
        this.f116817w = linearLayout3;
        this.f116818x = linearLayout4;
        this.f116819y = linearLayout5;
    }

    @androidx.annotation.n0
    public static vd a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 17780, new Class[]{View.class}, vd.class);
        if (patchProxyResultProxy.isSupported) {
            return (vd) patchProxyResultProxy.result;
        }
        int i10 = R.id.barrier;
        Barrier barrier = (Barrier) l3.d.a(view, R.id.barrier);
        if (barrier != null) {
            i10 = R.id.barrier2;
            Barrier barrier2 = (Barrier) l3.d.a(view, R.id.barrier2);
            if (barrier2 != null) {
                i10 = R.id.cl_root;
                ConstraintLayout constraintLayout = (ConstraintLayout) l3.d.a(view, R.id.cl_root);
                if (constraintLayout != null) {
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
                                    i10 = R.id.tv_bargain_price;
                                    TextView textView = (TextView) l3.d.a(view, R.id.tv_bargain_price);
                                    if (textView != null) {
                                        i10 = R.id.tv_create_time;
                                        TextView textView2 = (TextView) l3.d.a(view, R.id.tv_create_time);
                                        if (textView2 != null) {
                                            i10 = R.id.tv_float_value;
                                            TextView textView3 = (TextView) l3.d.a(view, R.id.tv_float_value);
                                            if (textView3 != null) {
                                                i10 = R.id.tv_name;
                                                TextView textView4 = (TextView) l3.d.a(view, R.id.tv_name);
                                                if (textView4 != null) {
                                                    i10 = R.id.tv_respond_bargain;
                                                    TextView textView5 = (TextView) l3.d.a(view, R.id.tv_respond_bargain);
                                                    if (textView5 != null) {
                                                        i10 = R.id.tv_state_desc;
                                                        TextView textView6 = (TextView) l3.d.a(view, R.id.tv_state_desc);
                                                        if (textView6 != null) {
                                                            i10 = R.id.tv_time_left;
                                                            TextView textView7 = (TextView) l3.d.a(view, R.id.tv_time_left);
                                                            if (textView7 != null) {
                                                                i10 = R.id.tv_time_left_desc;
                                                                TextView textView8 = (TextView) l3.d.a(view, R.id.tv_time_left_desc);
                                                                if (textView8 != null) {
                                                                    i10 = R.id.tv_trade_price;
                                                                    TextView textView9 = (TextView) l3.d.a(view, R.id.tv_trade_price);
                                                                    if (textView9 != null) {
                                                                        i10 = R.id.v_float_bar;
                                                                        View viewA = l3.d.a(view, R.id.v_float_bar);
                                                                        if (viewA != null) {
                                                                            ub0 ub0VarA = ub0.a(viewA);
                                                                            i10 = R.id.v_float_cursor;
                                                                            ImageView imageView5 = (ImageView) l3.d.a(view, R.id.v_float_cursor);
                                                                            if (imageView5 != null) {
                                                                                i10 = R.id.v_progress;
                                                                                View viewA2 = l3.d.a(view, R.id.v_progress);
                                                                                if (viewA2 != null) {
                                                                                    i10 = R.id.vg_item_img;
                                                                                    CardView cardView = (CardView) l3.d.a(view, R.id.vg_item_img);
                                                                                    if (cardView != null) {
                                                                                        i10 = R.id.vg_stickers;
                                                                                        LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.vg_stickers);
                                                                                        if (linearLayout != null) {
                                                                                            i10 = R.id.vg_tag;
                                                                                            LinearLayout linearLayout2 = (LinearLayout) l3.d.a(view, R.id.vg_tag);
                                                                                            if (linearLayout2 != null) {
                                                                                                i10 = R.id.vg_time_left;
                                                                                                LinearLayout linearLayout3 = (LinearLayout) l3.d.a(view, R.id.vg_time_left);
                                                                                                if (linearLayout3 != null) {
                                                                                                    i10 = R.id.vg_trade_price;
                                                                                                    LinearLayout linearLayout4 = (LinearLayout) l3.d.a(view, R.id.vg_trade_price);
                                                                                                    if (linearLayout4 != null) {
                                                                                                        return new vd((LinearLayout) view, barrier, barrier2, constraintLayout, imageView, imageView2, imageView3, imageView4, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9, ub0VarA, imageView5, viewA2, cardView, linearLayout, linearLayout2, linearLayout3, linearLayout4);
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
    public static vd c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 17778, new Class[]{LayoutInflater.class}, vd.class);
        return patchProxyResultProxy.isSupported ? (vd) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static vd d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 17779, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, vd.class);
        if (patchProxyResultProxy.isSupported) {
            return (vd) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_bargain_order_list, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public LinearLayout b() {
        return this.f116795a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 17781, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
