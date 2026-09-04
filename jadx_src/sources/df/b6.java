package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.max.hbcustomview.QMUIRadiusImageView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: DialogPayTypeInMallBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class b6 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    @androidx.annotation.n0
    public final LinearLayout A;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f108798a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final CheckBox f108799b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final CheckBox f108800c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final CheckBox f108801d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final CheckBox f108802e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f108803f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f108804g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final QMUIRadiusImageView f108805h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f108806i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f108807j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f108808k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f108809l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f108810m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f108811n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f108812o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f108813p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f108814q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @androidx.annotation.n0
    public final FrameLayout f108815r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @androidx.annotation.n0
    public final FrameLayout f108816s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f108817t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f108818u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f108819v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f108820w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f108821x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f108822y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f108823z;

    private b6(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 CheckBox checkBox, @androidx.annotation.n0 CheckBox checkBox2, @androidx.annotation.n0 CheckBox checkBox3, @androidx.annotation.n0 CheckBox checkBox4, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 ImageView imageView2, @androidx.annotation.n0 QMUIRadiusImageView qMUIRadiusImageView, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 TextView textView4, @androidx.annotation.n0 TextView textView5, @androidx.annotation.n0 TextView textView6, @androidx.annotation.n0 TextView textView7, @androidx.annotation.n0 TextView textView8, @androidx.annotation.n0 TextView textView9, @androidx.annotation.n0 FrameLayout frameLayout, @androidx.annotation.n0 FrameLayout frameLayout2, @androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 LinearLayout linearLayout2, @androidx.annotation.n0 RelativeLayout relativeLayout2, @androidx.annotation.n0 RelativeLayout relativeLayout3, @androidx.annotation.n0 RelativeLayout relativeLayout4, @androidx.annotation.n0 RelativeLayout relativeLayout5, @androidx.annotation.n0 RelativeLayout relativeLayout6, @androidx.annotation.n0 LinearLayout linearLayout3) {
        this.f108798a = relativeLayout;
        this.f108799b = checkBox;
        this.f108800c = checkBox2;
        this.f108801d = checkBox3;
        this.f108802e = checkBox4;
        this.f108803f = imageView;
        this.f108804g = imageView2;
        this.f108805h = qMUIRadiusImageView;
        this.f108806i = textView;
        this.f108807j = textView2;
        this.f108808k = textView3;
        this.f108809l = textView4;
        this.f108810m = textView5;
        this.f108811n = textView6;
        this.f108812o = textView7;
        this.f108813p = textView8;
        this.f108814q = textView9;
        this.f108815r = frameLayout;
        this.f108816s = frameLayout2;
        this.f108817t = linearLayout;
        this.f108818u = linearLayout2;
        this.f108819v = relativeLayout2;
        this.f108820w = relativeLayout3;
        this.f108821x = relativeLayout4;
        this.f108822y = relativeLayout5;
        this.f108823z = relativeLayout6;
        this.A = linearLayout3;
    }

    @androidx.annotation.n0
    public static b6 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 16972, new Class[]{View.class}, b6.class);
        if (patchProxyResultProxy.isSupported) {
            return (b6) patchProxyResultProxy.result;
        }
        int i10 = R.id.cb_alipay;
        CheckBox checkBox = (CheckBox) l3.d.a(view, R.id.cb_alipay);
        if (checkBox != null) {
            i10 = R.id.cb_h5;
            CheckBox checkBox2 = (CheckBox) l3.d.a(view, R.id.cb_h5);
            if (checkBox2 != null) {
                i10 = R.id.cb_hbalancepay;
                CheckBox checkBox3 = (CheckBox) l3.d.a(view, R.id.cb_hbalancepay);
                if (checkBox3 != null) {
                    i10 = R.id.cb_weixinpay;
                    CheckBox checkBox4 = (CheckBox) l3.d.a(view, R.id.cb_weixinpay);
                    if (checkBox4 != null) {
                        i10 = R.id.iv_close;
                        ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_close);
                        if (imageView != null) {
                            i10 = R.id.iv_faq;
                            ImageView imageView2 = (ImageView) l3.d.a(view, R.id.iv_faq);
                            if (imageView2 != null) {
                                i10 = R.id.iv_icon_h5;
                                QMUIRadiusImageView qMUIRadiusImageView = (QMUIRadiusImageView) l3.d.a(view, R.id.iv_icon_h5);
                                if (qMUIRadiusImageView != null) {
                                    i10 = R.id.tv_ali_pay;
                                    TextView textView = (TextView) l3.d.a(view, R.id.tv_ali_pay);
                                    if (textView != null) {
                                        i10 = R.id.tv_ali_pay_desc;
                                        TextView textView2 = (TextView) l3.d.a(view, R.id.tv_ali_pay_desc);
                                        if (textView2 != null) {
                                            i10 = R.id.tv_confirm;
                                            TextView textView3 = (TextView) l3.d.a(view, R.id.tv_confirm);
                                            if (textView3 != null) {
                                                i10 = R.id.tv_desc_h5;
                                                TextView textView4 = (TextView) l3.d.a(view, R.id.tv_desc_h5);
                                                if (textView4 != null) {
                                                    i10 = R.id.tv_hbalance;
                                                    TextView textView5 = (TextView) l3.d.a(view, R.id.tv_hbalance);
                                                    if (textView5 != null) {
                                                        i10 = R.id.tv_pay_tips;
                                                        TextView textView6 = (TextView) l3.d.a(view, R.id.tv_pay_tips);
                                                        if (textView6 != null) {
                                                            i10 = R.id.tv_price;
                                                            TextView textView7 = (TextView) l3.d.a(view, R.id.tv_price);
                                                            if (textView7 != null) {
                                                                i10 = R.id.tv_profit_desc;
                                                                TextView textView8 = (TextView) l3.d.a(view, R.id.tv_profit_desc);
                                                                if (textView8 != null) {
                                                                    i10 = R.id.tv_profit_exchange;
                                                                    TextView textView9 = (TextView) l3.d.a(view, R.id.tv_profit_exchange);
                                                                    if (textView9 != null) {
                                                                        i10 = R.id.vg_alipay_to_hcash;
                                                                        FrameLayout frameLayout = (FrameLayout) l3.d.a(view, R.id.vg_alipay_to_hcash);
                                                                        if (frameLayout != null) {
                                                                            i10 = R.id.vg_bg;
                                                                            FrameLayout frameLayout2 = (FrameLayout) l3.d.a(view, R.id.vg_bg);
                                                                            if (frameLayout2 != null) {
                                                                                i10 = R.id.vg_bottom_bar;
                                                                                LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.vg_bottom_bar);
                                                                                if (linearLayout != null) {
                                                                                    i10 = R.id.vg_container;
                                                                                    LinearLayout linearLayout2 = (LinearLayout) l3.d.a(view, R.id.vg_container);
                                                                                    if (linearLayout2 != null) {
                                                                                        i10 = R.id.vg_faq;
                                                                                        RelativeLayout relativeLayout = (RelativeLayout) l3.d.a(view, R.id.vg_faq);
                                                                                        if (relativeLayout != null) {
                                                                                            i10 = R.id.vg_pay_ali;
                                                                                            RelativeLayout relativeLayout2 = (RelativeLayout) l3.d.a(view, R.id.vg_pay_ali);
                                                                                            if (relativeLayout2 != null) {
                                                                                                i10 = R.id.vg_pay_h5;
                                                                                                RelativeLayout relativeLayout3 = (RelativeLayout) l3.d.a(view, R.id.vg_pay_h5);
                                                                                                if (relativeLayout3 != null) {
                                                                                                    i10 = R.id.vg_pay_hbalace;
                                                                                                    RelativeLayout relativeLayout4 = (RelativeLayout) l3.d.a(view, R.id.vg_pay_hbalace);
                                                                                                    if (relativeLayout4 != null) {
                                                                                                        i10 = R.id.vg_pay_weixin;
                                                                                                        RelativeLayout relativeLayout5 = (RelativeLayout) l3.d.a(view, R.id.vg_pay_weixin);
                                                                                                        if (relativeLayout5 != null) {
                                                                                                            i10 = R.id.vg_profit_tips;
                                                                                                            LinearLayout linearLayout3 = (LinearLayout) l3.d.a(view, R.id.vg_profit_tips);
                                                                                                            if (linearLayout3 != null) {
                                                                                                                return new b6((RelativeLayout) view, checkBox, checkBox2, checkBox3, checkBox4, imageView, imageView2, qMUIRadiusImageView, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9, frameLayout, frameLayout2, linearLayout, linearLayout2, relativeLayout, relativeLayout2, relativeLayout3, relativeLayout4, relativeLayout5, linearLayout3);
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
    public static b6 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 16970, new Class[]{LayoutInflater.class}, b6.class);
        return patchProxyResultProxy.isSupported ? (b6) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static b6 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 16971, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, b6.class);
        if (patchProxyResultProxy.isSupported) {
            return (b6) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.dialog_pay_type_in_mall, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f108798a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 16973, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
