package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.max.hbcustomview.GradientTextView;
import com.max.hbcustomview.bannerview.BannerViewPager;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: DialogSignInBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class n6 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final ConstraintLayout f113691a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final BannerViewPager f113692b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final ConstraintLayout f113693c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final CardView f113694d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final CardView f113695e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f113696f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f113697g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f113698h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f113699i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f113700j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f113701k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f113702l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f113703m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @androidx.annotation.n0
    public final GradientTextView f113704n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f113705o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f113706p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f113707q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @androidx.annotation.n0
    public final mb.o f113708r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f113709s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @androidx.annotation.n0
    public final View f113710t;

    private n6(@androidx.annotation.n0 ConstraintLayout constraintLayout, @androidx.annotation.n0 BannerViewPager bannerViewPager, @androidx.annotation.n0 ConstraintLayout constraintLayout2, @androidx.annotation.n0 CardView cardView, @androidx.annotation.n0 CardView cardView2, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 ImageView imageView2, @androidx.annotation.n0 ImageView imageView3, @androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 LinearLayout linearLayout2, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 GradientTextView gradientTextView, @androidx.annotation.n0 TextView textView4, @androidx.annotation.n0 TextView textView5, @androidx.annotation.n0 TextView textView6, @androidx.annotation.n0 mb.o oVar, @androidx.annotation.n0 LinearLayout linearLayout3, @androidx.annotation.n0 View view) {
        this.f113691a = constraintLayout;
        this.f113692b = bannerViewPager;
        this.f113693c = constraintLayout2;
        this.f113694d = cardView;
        this.f113695e = cardView2;
        this.f113696f = imageView;
        this.f113697g = imageView2;
        this.f113698h = imageView3;
        this.f113699i = linearLayout;
        this.f113700j = linearLayout2;
        this.f113701k = textView;
        this.f113702l = textView2;
        this.f113703m = textView3;
        this.f113704n = gradientTextView;
        this.f113705o = textView4;
        this.f113706p = textView5;
        this.f113707q = textView6;
        this.f113708r = oVar;
        this.f113709s = linearLayout3;
        this.f113710t = view;
    }

    @androidx.annotation.n0
    public static n6 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 17020, new Class[]{View.class}, n6.class);
        if (patchProxyResultProxy.isSupported) {
            return (n6) patchProxyResultProxy.result;
        }
        int i10 = R.id.banner;
        BannerViewPager bannerViewPager = (BannerViewPager) l3.d.a(view, R.id.banner);
        if (bannerViewPager != null) {
            i10 = R.id.container;
            ConstraintLayout constraintLayout = (ConstraintLayout) l3.d.a(view, R.id.container);
            if (constraintLayout != null) {
                i10 = R.id.cv_banner;
                CardView cardView = (CardView) l3.d.a(view, R.id.cv_banner);
                if (cardView != null) {
                    i10 = R.id.cv_confirm;
                    CardView cardView2 = (CardView) l3.d.a(view, R.id.cv_confirm);
                    if (cardView2 != null) {
                        i10 = R.id.iv_exp_up;
                        ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_exp_up);
                        if (imageView != null) {
                            i10 = R.id.iv_hcoin_up;
                            ImageView imageView2 = (ImageView) l3.d.a(view, R.id.iv_hcoin_up);
                            if (imageView2 != null) {
                                i10 = R.id.iv_icon;
                                ImageView imageView3 = (ImageView) l3.d.a(view, R.id.iv_icon);
                                if (imageView3 != null) {
                                    i10 = R.id.ll_award;
                                    LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.ll_award);
                                    if (linearLayout != null) {
                                        i10 = R.id.ll_blank;
                                        LinearLayout linearLayout2 = (LinearLayout) l3.d.a(view, R.id.ll_blank);
                                        if (linearLayout2 != null) {
                                            i10 = R.id.tv_confirm;
                                            TextView textView = (TextView) l3.d.a(view, R.id.tv_confirm);
                                            if (textView != null) {
                                                i10 = R.id.tv_exp;
                                                TextView textView2 = (TextView) l3.d.a(view, R.id.tv_exp);
                                                if (textView2 != null) {
                                                    i10 = R.id.tv_hcoin;
                                                    TextView textView3 = (TextView) l3.d.a(view, R.id.tv_hcoin);
                                                    if (textView3 != null) {
                                                        i10 = R.id.tv_member_hcoin;
                                                        GradientTextView gradientTextView = (GradientTextView) l3.d.a(view, R.id.tv_member_hcoin);
                                                        if (gradientTextView != null) {
                                                            i10 = R.id.tv_notify_description;
                                                            TextView textView4 = (TextView) l3.d.a(view, R.id.tv_notify_description);
                                                            if (textView4 != null) {
                                                                i10 = R.id.tv_streak;
                                                                TextView textView5 = (TextView) l3.d.a(view, R.id.tv_streak);
                                                                if (textView5 != null) {
                                                                    i10 = R.id.tv_title;
                                                                    TextView textView6 = (TextView) l3.d.a(view, R.id.tv_title);
                                                                    if (textView6 != null) {
                                                                        i10 = R.id.v_divider;
                                                                        View viewA = l3.d.a(view, R.id.v_divider);
                                                                        if (viewA != null) {
                                                                            mb.o oVarA = mb.o.a(viewA);
                                                                            i10 = R.id.vg_desc;
                                                                            LinearLayout linearLayout3 = (LinearLayout) l3.d.a(view, R.id.vg_desc);
                                                                            if (linearLayout3 != null) {
                                                                                i10 = R.id.view2;
                                                                                View viewA2 = l3.d.a(view, R.id.view2);
                                                                                if (viewA2 != null) {
                                                                                    return new n6((ConstraintLayout) view, bannerViewPager, constraintLayout, cardView, cardView2, imageView, imageView2, imageView3, linearLayout, linearLayout2, textView, textView2, textView3, gradientTextView, textView4, textView5, textView6, oVarA, linearLayout3, viewA2);
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
    public static n6 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 17018, new Class[]{LayoutInflater.class}, n6.class);
        return patchProxyResultProxy.isSupported ? (n6) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static n6 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 17019, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, n6.class);
        if (patchProxyResultProxy.isSupported) {
            return (n6) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.dialog_sign_in, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public ConstraintLayout b() {
        return this.f113691a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 17021, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
