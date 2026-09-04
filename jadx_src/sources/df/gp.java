package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemInventoryItemPutOnBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class gp implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final ConstraintLayout f111051a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final Barrier f111052b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final ConstraintLayout f111053c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final EditText f111054d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final EditText f111055e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f111056f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f111057g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f111058h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f111059i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final Switch f111060j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f111061k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f111062l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f111063m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f111064n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f111065o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @androidx.annotation.n0
    public final ub0 f111066p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f111067q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @androidx.annotation.n0
    public final View f111068r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @androidx.annotation.n0
    public final CardView f111069s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f111070t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f111071u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f111072v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f111073w;

    private gp(@androidx.annotation.n0 ConstraintLayout constraintLayout, @androidx.annotation.n0 Barrier barrier, @androidx.annotation.n0 ConstraintLayout constraintLayout2, @androidx.annotation.n0 EditText editText, @androidx.annotation.n0 EditText editText2, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 ImageView imageView2, @androidx.annotation.n0 ImageView imageView3, @androidx.annotation.n0 ImageView imageView4, @androidx.annotation.n0 Switch r12, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 TextView textView4, @androidx.annotation.n0 TextView textView5, @androidx.annotation.n0 ub0 ub0Var, @androidx.annotation.n0 ImageView imageView5, @androidx.annotation.n0 View view, @androidx.annotation.n0 CardView cardView, @androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 LinearLayout linearLayout2, @androidx.annotation.n0 LinearLayout linearLayout3, @androidx.annotation.n0 LinearLayout linearLayout4) {
        this.f111051a = constraintLayout;
        this.f111052b = barrier;
        this.f111053c = constraintLayout2;
        this.f111054d = editText;
        this.f111055e = editText2;
        this.f111056f = imageView;
        this.f111057g = imageView2;
        this.f111058h = imageView3;
        this.f111059i = imageView4;
        this.f111060j = r12;
        this.f111061k = textView;
        this.f111062l = textView2;
        this.f111063m = textView3;
        this.f111064n = textView4;
        this.f111065o = textView5;
        this.f111066p = ub0Var;
        this.f111067q = imageView5;
        this.f111068r = view;
        this.f111069s = cardView;
        this.f111070t = linearLayout;
        this.f111071u = linearLayout2;
        this.f111072v = linearLayout3;
        this.f111073w = linearLayout4;
    }

    @androidx.annotation.n0
    public static gp a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 18964, new Class[]{View.class}, gp.class);
        if (patchProxyResultProxy.isSupported) {
            return (gp) patchProxyResultProxy.result;
        }
        int i10 = R.id.barrier;
        Barrier barrier = (Barrier) l3.d.a(view, R.id.barrier);
        if (barrier != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) view;
            i10 = R.id.et_desc;
            EditText editText = (EditText) l3.d.a(view, R.id.et_desc);
            if (editText != null) {
                i10 = R.id.et_trade_price;
                EditText editText2 = (EditText) l3.d.a(view, R.id.et_trade_price);
                if (editText2 != null) {
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
                                    i10 = R.id.sb_bargain;
                                    Switch r13 = (Switch) l3.d.a(view, R.id.sb_bargain);
                                    if (r13 != null) {
                                        i10 = R.id.tv_float_value;
                                        TextView textView = (TextView) l3.d.a(view, R.id.tv_float_value);
                                        if (textView != null) {
                                            i10 = R.id.tv_name;
                                            TextView textView2 = (TextView) l3.d.a(view, R.id.tv_name);
                                            if (textView2 != null) {
                                                i10 = R.id.tv_price_symbol;
                                                TextView textView3 = (TextView) l3.d.a(view, R.id.tv_price_symbol);
                                                if (textView3 != null) {
                                                    i10 = R.id.tv_suggest_price;
                                                    TextView textView4 = (TextView) l3.d.a(view, R.id.tv_suggest_price);
                                                    if (textView4 != null) {
                                                        i10 = R.id.tv_switch_desc;
                                                        TextView textView5 = (TextView) l3.d.a(view, R.id.tv_switch_desc);
                                                        if (textView5 != null) {
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
                                                                                i10 = R.id.vg_switch;
                                                                                LinearLayout linearLayout2 = (LinearLayout) l3.d.a(view, R.id.vg_switch);
                                                                                if (linearLayout2 != null) {
                                                                                    i10 = R.id.vg_tag;
                                                                                    LinearLayout linearLayout3 = (LinearLayout) l3.d.a(view, R.id.vg_tag);
                                                                                    if (linearLayout3 != null) {
                                                                                        i10 = R.id.vg_trade_price;
                                                                                        LinearLayout linearLayout4 = (LinearLayout) l3.d.a(view, R.id.vg_trade_price);
                                                                                        if (linearLayout4 != null) {
                                                                                            return new gp(constraintLayout, barrier, constraintLayout, editText, editText2, imageView, imageView2, imageView3, imageView4, r13, textView, textView2, textView3, textView4, textView5, ub0VarA, imageView5, viewA2, cardView, linearLayout, linearLayout2, linearLayout3, linearLayout4);
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
    public static gp c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 18962, new Class[]{LayoutInflater.class}, gp.class);
        return patchProxyResultProxy.isSupported ? (gp) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static gp d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 18963, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, gp.class);
        if (patchProxyResultProxy.isSupported) {
            return (gp) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_inventory_item_put_on, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public ConstraintLayout b() {
        return this.f111051a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 18965, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
