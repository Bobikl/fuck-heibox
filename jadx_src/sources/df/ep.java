package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemInventoryItemBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class ep implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final FrameLayout f110253a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final ConstraintLayout f110254b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f110255c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f110256d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f110257e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f110258f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f110259g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f110260h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f110261i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f110262j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f110263k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f110264l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @androidx.annotation.n0
    public final ub0 f110265m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f110266n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @androidx.annotation.n0
    public final View f110267o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @androidx.annotation.n0
    public final FrameLayout f110268p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f110269q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f110270r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f110271s;

    private ep(@androidx.annotation.n0 FrameLayout frameLayout, @androidx.annotation.n0 ConstraintLayout constraintLayout, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 ImageView imageView2, @androidx.annotation.n0 ImageView imageView3, @androidx.annotation.n0 ImageView imageView4, @androidx.annotation.n0 ImageView imageView5, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 TextView textView4, @androidx.annotation.n0 TextView textView5, @androidx.annotation.n0 ub0 ub0Var, @androidx.annotation.n0 ImageView imageView6, @androidx.annotation.n0 View view, @androidx.annotation.n0 FrameLayout frameLayout2, @androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 LinearLayout linearLayout2, @androidx.annotation.n0 LinearLayout linearLayout3) {
        this.f110253a = frameLayout;
        this.f110254b = constraintLayout;
        this.f110255c = imageView;
        this.f110256d = imageView2;
        this.f110257e = imageView3;
        this.f110258f = imageView4;
        this.f110259g = imageView5;
        this.f110260h = textView;
        this.f110261i = textView2;
        this.f110262j = textView3;
        this.f110263k = textView4;
        this.f110264l = textView5;
        this.f110265m = ub0Var;
        this.f110266n = imageView6;
        this.f110267o = view;
        this.f110268p = frameLayout2;
        this.f110269q = linearLayout;
        this.f110270r = linearLayout2;
        this.f110271s = linearLayout3;
    }

    @androidx.annotation.n0
    public static ep a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 18956, new Class[]{View.class}, ep.class);
        if (patchProxyResultProxy.isSupported) {
            return (ep) patchProxyResultProxy.result;
        }
        int i10 = R.id.cl_root;
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
                            i10 = R.id.iv_trade_state;
                            ImageView imageView5 = (ImageView) l3.d.a(view, R.id.iv_trade_state);
                            if (imageView5 != null) {
                                i10 = R.id.tv_float_value;
                                TextView textView = (TextView) l3.d.a(view, R.id.tv_float_value);
                                if (textView != null) {
                                    i10 = R.id.tv_name;
                                    TextView textView2 = (TextView) l3.d.a(view, R.id.tv_name);
                                    if (textView2 != null) {
                                        i10 = R.id.tv_price;
                                        TextView textView3 = (TextView) l3.d.a(view, R.id.tv_price);
                                        if (textView3 != null) {
                                            i10 = R.id.tv_price_symbol;
                                            TextView textView4 = (TextView) l3.d.a(view, R.id.tv_price_symbol);
                                            if (textView4 != null) {
                                                i10 = R.id.tv_trade_info;
                                                TextView textView5 = (TextView) l3.d.a(view, R.id.tv_trade_info);
                                                if (textView5 != null) {
                                                    i10 = R.id.v_float_bar;
                                                    View viewA = l3.d.a(view, R.id.v_float_bar);
                                                    if (viewA != null) {
                                                        ub0 ub0VarA = ub0.a(viewA);
                                                        i10 = R.id.v_float_cursor;
                                                        ImageView imageView6 = (ImageView) l3.d.a(view, R.id.v_float_cursor);
                                                        if (imageView6 != null) {
                                                            i10 = R.id.v_progress;
                                                            View viewA2 = l3.d.a(view, R.id.v_progress);
                                                            if (viewA2 != null) {
                                                                i10 = R.id.vg_checked;
                                                                FrameLayout frameLayout = (FrameLayout) l3.d.a(view, R.id.vg_checked);
                                                                if (frameLayout != null) {
                                                                    i10 = R.id.vg_stickers;
                                                                    LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.vg_stickers);
                                                                    if (linearLayout != null) {
                                                                        i10 = R.id.vg_tag;
                                                                        LinearLayout linearLayout2 = (LinearLayout) l3.d.a(view, R.id.vg_tag);
                                                                        if (linearLayout2 != null) {
                                                                            i10 = R.id.vg_trade_info;
                                                                            LinearLayout linearLayout3 = (LinearLayout) l3.d.a(view, R.id.vg_trade_info);
                                                                            if (linearLayout3 != null) {
                                                                                return new ep((FrameLayout) view, constraintLayout, imageView, imageView2, imageView3, imageView4, imageView5, textView, textView2, textView3, textView4, textView5, ub0VarA, imageView6, viewA2, frameLayout, linearLayout, linearLayout2, linearLayout3);
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
    public static ep c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 18954, new Class[]{LayoutInflater.class}, ep.class);
        return patchProxyResultProxy.isSupported ? (ep) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static ep d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 18955, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, ep.class);
        if (patchProxyResultProxy.isSupported) {
            return (ep) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_inventory_item, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public FrameLayout b() {
        return this.f110253a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 18957, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
