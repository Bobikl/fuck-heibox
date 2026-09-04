package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.max.hbcustomview.QMUIRadiusImageView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemInventoryGroupPutOnBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class dp implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final ConstraintLayout f109845a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final Barrier f109846b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final ConstraintLayout f109847c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final EditText f109848d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final QMUIRadiusImageView f109849e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final QMUIRadiusImageView f109850f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f109851g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f109852h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f109853i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f109854j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f109855k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f109856l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f109857m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f109858n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f109859o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f109860p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @androidx.annotation.n0
    public final CardView f109861q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f109862r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f109863s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f109864t;

    private dp(@androidx.annotation.n0 ConstraintLayout constraintLayout, @androidx.annotation.n0 Barrier barrier, @androidx.annotation.n0 ConstraintLayout constraintLayout2, @androidx.annotation.n0 EditText editText, @androidx.annotation.n0 QMUIRadiusImageView qMUIRadiusImageView, @androidx.annotation.n0 QMUIRadiusImageView qMUIRadiusImageView2, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 ImageView imageView2, @androidx.annotation.n0 ImageView imageView3, @androidx.annotation.n0 ImageView imageView4, @androidx.annotation.n0 ImageView imageView5, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 TextView textView4, @androidx.annotation.n0 TextView textView5, @androidx.annotation.n0 CardView cardView, @androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 LinearLayout linearLayout2, @androidx.annotation.n0 LinearLayout linearLayout3) {
        this.f109845a = constraintLayout;
        this.f109846b = barrier;
        this.f109847c = constraintLayout2;
        this.f109848d = editText;
        this.f109849e = qMUIRadiusImageView;
        this.f109850f = qMUIRadiusImageView2;
        this.f109851g = imageView;
        this.f109852h = imageView2;
        this.f109853i = imageView3;
        this.f109854j = imageView4;
        this.f109855k = imageView5;
        this.f109856l = textView;
        this.f109857m = textView2;
        this.f109858n = textView3;
        this.f109859o = textView4;
        this.f109860p = textView5;
        this.f109861q = cardView;
        this.f109862r = linearLayout;
        this.f109863s = linearLayout2;
        this.f109864t = linearLayout3;
    }

    @androidx.annotation.n0
    public static dp a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 18952, new Class[]{View.class}, dp.class);
        if (patchProxyResultProxy.isSupported) {
            return (dp) patchProxyResultProxy.result;
        }
        int i10 = R.id.barrier;
        Barrier barrier = (Barrier) l3.d.a(view, R.id.barrier);
        if (barrier != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) view;
            i10 = R.id.et_trade_price;
            EditText editText = (EditText) l3.d.a(view, R.id.et_trade_price);
            if (editText != null) {
                i10 = R.id.iv_bg_1;
                QMUIRadiusImageView qMUIRadiusImageView = (QMUIRadiusImageView) l3.d.a(view, R.id.iv_bg_1);
                if (qMUIRadiusImageView != null) {
                    i10 = R.id.iv_bg_2;
                    QMUIRadiusImageView qMUIRadiusImageView2 = (QMUIRadiusImageView) l3.d.a(view, R.id.iv_bg_2);
                    if (qMUIRadiusImageView2 != null) {
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
                                        i10 = R.id.iv_warn_tag;
                                        ImageView imageView5 = (ImageView) l3.d.a(view, R.id.iv_warn_tag);
                                        if (imageView5 != null) {
                                            i10 = R.id.tv_count;
                                            TextView textView = (TextView) l3.d.a(view, R.id.tv_count);
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
                                                            i10 = R.id.tv_warn_desc;
                                                            TextView textView5 = (TextView) l3.d.a(view, R.id.tv_warn_desc);
                                                            if (textView5 != null) {
                                                                i10 = R.id.vg_item_img;
                                                                CardView cardView = (CardView) l3.d.a(view, R.id.vg_item_img);
                                                                if (cardView != null) {
                                                                    i10 = R.id.vg_tag;
                                                                    LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.vg_tag);
                                                                    if (linearLayout != null) {
                                                                        i10 = R.id.vg_trade_price;
                                                                        LinearLayout linearLayout2 = (LinearLayout) l3.d.a(view, R.id.vg_trade_price);
                                                                        if (linearLayout2 != null) {
                                                                            i10 = R.id.vg_warn;
                                                                            LinearLayout linearLayout3 = (LinearLayout) l3.d.a(view, R.id.vg_warn);
                                                                            if (linearLayout3 != null) {
                                                                                return new dp(constraintLayout, barrier, constraintLayout, editText, qMUIRadiusImageView, qMUIRadiusImageView2, imageView, imageView2, imageView3, imageView4, imageView5, textView, textView2, textView3, textView4, textView5, cardView, linearLayout, linearLayout2, linearLayout3);
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
    public static dp c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 18950, new Class[]{LayoutInflater.class}, dp.class);
        return patchProxyResultProxy.isSupported ? (dp) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static dp d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 18951, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, dp.class);
        if (patchProxyResultProxy.isSupported) {
            return (dp) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_inventory_group_put_on, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public ConstraintLayout b() {
        return this.f109845a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 18953, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
