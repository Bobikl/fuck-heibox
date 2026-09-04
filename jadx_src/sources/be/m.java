package be;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.cardview.widget.CardView;
import com.max.hbwallet.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: HbwalletItemCouponBinding.java */
/* JADX INFO: loaded from: classes2.dex */
public final class m implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @n0
    private final CardView f35349a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @n0
    public final CardView f35350b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @n0
    public final ImageView f35351c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @n0
    public final ImageView f35352d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @n0
    public final ImageView f35353e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @n0
    public final RelativeLayout f35354f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @n0
    public final TextView f35355g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @n0
    public final TextView f35356h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @n0
    public final TextView f35357i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @n0
    public final TextView f35358j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @n0
    public final TextView f35359k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @n0
    public final TextView f35360l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @n0
    public final TextView f35361m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @n0
    public final TextView f35362n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @n0
    public final TextView f35363o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @n0
    public final TextView f35364p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @n0
    public final TextView f35365q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @n0
    public final LinearLayout f35366r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @n0
    public final LinearLayout f35367s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @n0
    public final LinearLayout f35368t;

    private m(@n0 CardView cardView, @n0 CardView cardView2, @n0 ImageView imageView, @n0 ImageView imageView2, @n0 ImageView imageView3, @n0 RelativeLayout relativeLayout, @n0 TextView textView, @n0 TextView textView2, @n0 TextView textView3, @n0 TextView textView4, @n0 TextView textView5, @n0 TextView textView6, @n0 TextView textView7, @n0 TextView textView8, @n0 TextView textView9, @n0 TextView textView10, @n0 TextView textView11, @n0 LinearLayout linearLayout, @n0 LinearLayout linearLayout2, @n0 LinearLayout linearLayout3) {
        this.f35349a = cardView;
        this.f35350b = cardView2;
        this.f35351c = imageView;
        this.f35352d = imageView2;
        this.f35353e = imageView3;
        this.f35354f = relativeLayout;
        this.f35355g = textView;
        this.f35356h = textView2;
        this.f35357i = textView3;
        this.f35358j = textView4;
        this.f35359k = textView5;
        this.f35360l = textView6;
        this.f35361m = textView7;
        this.f35362n = textView8;
        this.f35363o = textView9;
        this.f35364p = textView10;
        this.f35365q = textView11;
        this.f35366r = linearLayout;
        this.f35367s = linearLayout2;
        this.f35368t = linearLayout3;
    }

    @n0
    public static m a(@n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, bb.c.l.f34084d5, new Class[]{View.class}, m.class);
        if (patchProxyResultProxy.isSupported) {
            return (m) patchProxyResultProxy.result;
        }
        CardView cardView = (CardView) view;
        int i10 = R.id.iv_check_state;
        ImageView imageView = (ImageView) l3.d.a(view, i10);
        if (imageView != null) {
            i10 = R.id.iv_coupon_bg;
            ImageView imageView2 = (ImageView) l3.d.a(view, i10);
            if (imageView2 != null) {
                i10 = R.id.iv_present_avatar;
                ImageView imageView3 = (ImageView) l3.d.a(view, i10);
                if (imageView3 != null) {
                    i10 = R.id.rl_coupon;
                    RelativeLayout relativeLayout = (RelativeLayout) l3.d.a(view, i10);
                    if (relativeLayout != null) {
                        i10 = R.id.tv_coupon_desc;
                        TextView textView = (TextView) l3.d.a(view, i10);
                        if (textView != null) {
                            i10 = R.id.tv_coupon_give;
                            TextView textView2 = (TextView) l3.d.a(view, i10);
                            if (textView2 != null) {
                                i10 = R.id.tv_coupon_name;
                                TextView textView3 = (TextView) l3.d.a(view, i10);
                                if (textView3 != null) {
                                    i10 = R.id.tv_coupon_option;
                                    TextView textView4 = (TextView) l3.d.a(view, i10);
                                    if (textView4 != null) {
                                        i10 = R.id.tv_coupon_time_desc;
                                        TextView textView5 = (TextView) l3.d.a(view, i10);
                                        if (textView5 != null) {
                                            i10 = R.id.tv_coupon_value;
                                            TextView textView6 = (TextView) l3.d.a(view, i10);
                                            if (textView6 != null) {
                                                i10 = R.id.tv_discount;
                                                TextView textView7 = (TextView) l3.d.a(view, i10);
                                                if (textView7 != null) {
                                                    i10 = R.id.tv_present_desc;
                                                    TextView textView8 = (TextView) l3.d.a(view, i10);
                                                    if (textView8 != null) {
                                                        i10 = R.id.tv_present_name;
                                                        TextView textView9 = (TextView) l3.d.a(view, i10);
                                                        if (textView9 != null) {
                                                            i10 = R.id.tv_present_time_desc;
                                                            TextView textView10 = (TextView) l3.d.a(view, i10);
                                                            if (textView10 != null) {
                                                                i10 = R.id.tv_rmb_symbol;
                                                                TextView textView11 = (TextView) l3.d.a(view, i10);
                                                                if (textView11 != null) {
                                                                    i10 = R.id.vg_coupon_option;
                                                                    LinearLayout linearLayout = (LinearLayout) l3.d.a(view, i10);
                                                                    if (linearLayout != null) {
                                                                        i10 = R.id.vg_coupon_value;
                                                                        LinearLayout linearLayout2 = (LinearLayout) l3.d.a(view, i10);
                                                                        if (linearLayout2 != null) {
                                                                            i10 = R.id.vg_present_desc;
                                                                            LinearLayout linearLayout3 = (LinearLayout) l3.d.a(view, i10);
                                                                            if (linearLayout3 != null) {
                                                                                return new m(cardView, cardView, imageView, imageView2, imageView3, relativeLayout, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9, textView10, textView11, linearLayout, linearLayout2, linearLayout3);
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

    @n0
    public static m c(@n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, bb.c.l.f34038b5, new Class[]{LayoutInflater.class}, m.class);
        return patchProxyResultProxy.isSupported ? (m) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @n0
    public static m d(@n0 LayoutInflater layoutInflater, @p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, bb.c.l.f34061c5, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, m.class);
        if (patchProxyResultProxy.isSupported) {
            return (m) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.hbwallet_item_coupon, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @n0
    public CardView b() {
        return this.f35349a;
    }

    @Override // l3.c
    @n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.l.f34107e5, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
