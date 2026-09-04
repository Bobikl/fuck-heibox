package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.uc.crashsdk.export.LogType;

/* JADX INFO: compiled from: ActivityTradeWantToBuyItemBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class w2 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final SmartRefreshLayout f116980a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final EditText f116981b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final EditText f116982c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f116983d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f116984e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f116985f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f116986g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final SmartRefreshLayout f116987h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f116988i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f116989j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f116990k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f116991l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f116992m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f116993n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f116994o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f116995p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @androidx.annotation.n0
    public final ConstraintLayout f116996q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @androidx.annotation.n0
    public final CardView f116997r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @androidx.annotation.n0
    public final FrameLayout f116998s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @androidx.annotation.n0
    public final FrameLayout f116999t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f117000u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f117001v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f117002w;

    private w2(@androidx.annotation.n0 SmartRefreshLayout smartRefreshLayout, @androidx.annotation.n0 EditText editText, @androidx.annotation.n0 EditText editText2, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 ImageView imageView2, @androidx.annotation.n0 ImageView imageView3, @androidx.annotation.n0 ImageView imageView4, @androidx.annotation.n0 SmartRefreshLayout smartRefreshLayout2, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 TextView textView4, @androidx.annotation.n0 TextView textView5, @androidx.annotation.n0 TextView textView6, @androidx.annotation.n0 TextView textView7, @androidx.annotation.n0 TextView textView8, @androidx.annotation.n0 ConstraintLayout constraintLayout, @androidx.annotation.n0 CardView cardView, @androidx.annotation.n0 FrameLayout frameLayout, @androidx.annotation.n0 FrameLayout frameLayout2, @androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 LinearLayout linearLayout2, @androidx.annotation.n0 LinearLayout linearLayout3) {
        this.f116980a = smartRefreshLayout;
        this.f116981b = editText;
        this.f116982c = editText2;
        this.f116983d = imageView;
        this.f116984e = imageView2;
        this.f116985f = imageView3;
        this.f116986g = imageView4;
        this.f116987h = smartRefreshLayout2;
        this.f116988i = textView;
        this.f116989j = textView2;
        this.f116990k = textView3;
        this.f116991l = textView4;
        this.f116992m = textView5;
        this.f116993n = textView6;
        this.f116994o = textView7;
        this.f116995p = textView8;
        this.f116996q = constraintLayout;
        this.f116997r = cardView;
        this.f116998s = frameLayout;
        this.f116999t = frameLayout2;
        this.f117000u = linearLayout;
        this.f117001v = linearLayout2;
        this.f117002w = linearLayout3;
    }

    @androidx.annotation.n0
    public static w2 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, LogType.UNEXP_RESTART, new Class[]{View.class}, w2.class);
        if (patchProxyResultProxy.isSupported) {
            return (w2) patchProxyResultProxy.result;
        }
        int i10 = R.id.et_count;
        EditText editText = (EditText) l3.d.a(view, R.id.et_count);
        if (editText != null) {
            i10 = R.id.et_price;
            EditText editText2 = (EditText) l3.d.a(view, R.id.et_price);
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
                                SmartRefreshLayout smartRefreshLayout = (SmartRefreshLayout) view;
                                i10 = R.id.tv_action;
                                TextView textView = (TextView) l3.d.a(view, R.id.tv_action);
                                if (textView != null) {
                                    i10 = R.id.tv_desc;
                                    TextView textView2 = (TextView) l3.d.a(view, R.id.tv_desc);
                                    if (textView2 != null) {
                                        i10 = R.id.tv_highest_price;
                                        TextView textView3 = (TextView) l3.d.a(view, R.id.tv_highest_price);
                                        if (textView3 != null) {
                                            i10 = R.id.tv_highest_price_symbol;
                                            TextView textView4 = (TextView) l3.d.a(view, R.id.tv_highest_price_symbol);
                                            if (textView4 != null) {
                                                i10 = R.id.tv_lowest_price;
                                                TextView textView5 = (TextView) l3.d.a(view, R.id.tv_lowest_price);
                                                if (textView5 != null) {
                                                    i10 = R.id.tv_lowest_price_symbol;
                                                    TextView textView6 = (TextView) l3.d.a(view, R.id.tv_lowest_price_symbol);
                                                    if (textView6 != null) {
                                                        i10 = R.id.tv_name;
                                                        TextView textView7 = (TextView) l3.d.a(view, R.id.tv_name);
                                                        if (textView7 != null) {
                                                            i10 = R.id.tv_suggest_price;
                                                            TextView textView8 = (TextView) l3.d.a(view, R.id.tv_suggest_price);
                                                            if (textView8 != null) {
                                                                i10 = R.id.vg_item;
                                                                ConstraintLayout constraintLayout = (ConstraintLayout) l3.d.a(view, R.id.vg_item);
                                                                if (constraintLayout != null) {
                                                                    i10 = R.id.vg_item_img;
                                                                    CardView cardView = (CardView) l3.d.a(view, R.id.vg_item_img);
                                                                    if (cardView != null) {
                                                                        i10 = R.id.vg_minus;
                                                                        FrameLayout frameLayout = (FrameLayout) l3.d.a(view, R.id.vg_minus);
                                                                        if (frameLayout != null) {
                                                                            i10 = R.id.vg_plus;
                                                                            FrameLayout frameLayout2 = (FrameLayout) l3.d.a(view, R.id.vg_plus);
                                                                            if (frameLayout2 != null) {
                                                                                i10 = R.id.vg_price_faq;
                                                                                LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.vg_price_faq);
                                                                                if (linearLayout != null) {
                                                                                    i10 = R.id.vg_price_info;
                                                                                    LinearLayout linearLayout2 = (LinearLayout) l3.d.a(view, R.id.vg_price_info);
                                                                                    if (linearLayout2 != null) {
                                                                                        i10 = R.id.vg_tag;
                                                                                        LinearLayout linearLayout3 = (LinearLayout) l3.d.a(view, R.id.vg_tag);
                                                                                        if (linearLayout3 != null) {
                                                                                            return new w2(smartRefreshLayout, editText, editText2, imageView, imageView2, imageView3, imageView4, smartRefreshLayout, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, constraintLayout, cardView, frameLayout, frameLayout2, linearLayout, linearLayout2, linearLayout3);
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
    public static w2 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 16638, new Class[]{LayoutInflater.class}, w2.class);
        return patchProxyResultProxy.isSupported ? (w2) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static w2 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 16639, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, w2.class);
        if (patchProxyResultProxy.isSupported) {
            return (w2) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.activity_trade_want_to_buy_item, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public SmartRefreshLayout b() {
        return this.f116980a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 16641, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
