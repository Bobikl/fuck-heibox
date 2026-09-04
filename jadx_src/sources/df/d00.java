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

/* JADX INFO: compiled from: ItemTradePurchaseFinishedBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class d00 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final ConstraintLayout f109554a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final Barrier f109555b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final ConstraintLayout f109556c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f109557d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f109558e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f109559f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f109560g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f109561h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f109562i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f109563j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f109564k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @androidx.annotation.n0
    public final ub0 f109565l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f109566m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @androidx.annotation.n0
    public final View f109567n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @androidx.annotation.n0
    public final View f109568o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @androidx.annotation.n0
    public final CardView f109569p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f109570q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f109571r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f109572s;

    private d00(@androidx.annotation.n0 ConstraintLayout constraintLayout, @androidx.annotation.n0 Barrier barrier, @androidx.annotation.n0 ConstraintLayout constraintLayout2, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 ImageView imageView2, @androidx.annotation.n0 ImageView imageView3, @androidx.annotation.n0 ImageView imageView4, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 TextView textView4, @androidx.annotation.n0 ub0 ub0Var, @androidx.annotation.n0 ImageView imageView5, @androidx.annotation.n0 View view, @androidx.annotation.n0 View view2, @androidx.annotation.n0 CardView cardView, @androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 LinearLayout linearLayout2, @androidx.annotation.n0 LinearLayout linearLayout3) {
        this.f109554a = constraintLayout;
        this.f109555b = barrier;
        this.f109556c = constraintLayout2;
        this.f109557d = imageView;
        this.f109558e = imageView2;
        this.f109559f = imageView3;
        this.f109560g = imageView4;
        this.f109561h = textView;
        this.f109562i = textView2;
        this.f109563j = textView3;
        this.f109564k = textView4;
        this.f109565l = ub0Var;
        this.f109566m = imageView5;
        this.f109567n = view;
        this.f109568o = view2;
        this.f109569p = cardView;
        this.f109570q = linearLayout;
        this.f109571r = linearLayout2;
        this.f109572s = linearLayout3;
    }

    @androidx.annotation.n0
    public static d00 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 20088, new Class[]{View.class}, d00.class);
        if (patchProxyResultProxy.isSupported) {
            return (d00) patchProxyResultProxy.result;
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
                            i10 = R.id.tv_float_value;
                            TextView textView = (TextView) l3.d.a(view, R.id.tv_float_value);
                            if (textView != null) {
                                i10 = R.id.tv_owned;
                                TextView textView2 = (TextView) l3.d.a(view, R.id.tv_owned);
                                if (textView2 != null) {
                                    i10 = R.id.tv_receive_time;
                                    TextView textView3 = (TextView) l3.d.a(view, R.id.tv_receive_time);
                                    if (textView3 != null) {
                                        i10 = R.id.tv_supply;
                                        TextView textView4 = (TextView) l3.d.a(view, R.id.tv_supply);
                                        if (textView4 != null) {
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
                                                        i10 = R.id.v_supply_state;
                                                        View viewA3 = l3.d.a(view, R.id.v_supply_state);
                                                        if (viewA3 != null) {
                                                            i10 = R.id.vg_item_img;
                                                            CardView cardView = (CardView) l3.d.a(view, R.id.vg_item_img);
                                                            if (cardView != null) {
                                                                i10 = R.id.vg_stickers;
                                                                LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.vg_stickers);
                                                                if (linearLayout != null) {
                                                                    i10 = R.id.vg_supply_state;
                                                                    LinearLayout linearLayout2 = (LinearLayout) l3.d.a(view, R.id.vg_supply_state);
                                                                    if (linearLayout2 != null) {
                                                                        i10 = R.id.vg_tag;
                                                                        LinearLayout linearLayout3 = (LinearLayout) l3.d.a(view, R.id.vg_tag);
                                                                        if (linearLayout3 != null) {
                                                                            return new d00(constraintLayout, barrier, constraintLayout, imageView, imageView2, imageView3, imageView4, textView, textView2, textView3, textView4, ub0VarA, imageView5, viewA2, viewA3, cardView, linearLayout, linearLayout2, linearLayout3);
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
    public static d00 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 20086, new Class[]{LayoutInflater.class}, d00.class);
        return patchProxyResultProxy.isSupported ? (d00) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static d00 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 20087, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, d00.class);
        if (patchProxyResultProxy.isSupported) {
            return (d00) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_trade_purchase_finished, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public ConstraintLayout b() {
        return this.f109554a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 20089, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
