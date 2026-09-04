package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.max.hbcommon.component.bottombutton.BottomButtonLeftItemView;
import com.max.hbview.HBScrollView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: FragmentPurchaseGameDialogBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class ya implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final LinearLayout f117859a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final BottomButtonLeftItemView f117860b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final k60 f117861c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final mb.o f117862d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f117863e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f117864f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f117865g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f117866h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final HBScrollView f117867i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f117868j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f117869k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f117870l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f117871m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f117872n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f117873o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @androidx.annotation.n0
    public final sn f117874p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f117875q;

    private ya(@androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 BottomButtonLeftItemView bottomButtonLeftItemView, @androidx.annotation.n0 k60 k60Var, @androidx.annotation.n0 mb.o oVar, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 LinearLayout linearLayout2, @androidx.annotation.n0 LinearLayout linearLayout3, @androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 HBScrollView hBScrollView, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 TextView textView4, @androidx.annotation.n0 TextView textView5, @androidx.annotation.n0 TextView textView6, @androidx.annotation.n0 sn snVar, @androidx.annotation.n0 RelativeLayout relativeLayout2) {
        this.f117859a = linearLayout;
        this.f117860b = bottomButtonLeftItemView;
        this.f117861c = k60Var;
        this.f117862d = oVar;
        this.f117863e = imageView;
        this.f117864f = linearLayout2;
        this.f117865g = linearLayout3;
        this.f117866h = relativeLayout;
        this.f117867i = hBScrollView;
        this.f117868j = textView;
        this.f117869k = textView2;
        this.f117870l = textView3;
        this.f117871m = textView4;
        this.f117872n = textView5;
        this.f117873o = textView6;
        this.f117874p = snVar;
        this.f117875q = relativeLayout2;
    }

    @androidx.annotation.n0
    public static ya a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 17480, new Class[]{View.class}, ya.class);
        if (patchProxyResultProxy.isSupported) {
            return (ya) patchProxyResultProxy.result;
        }
        int i10 = R.id.bottom_button;
        BottomButtonLeftItemView bottomButtonLeftItemView = (BottomButtonLeftItemView) l3.d.a(view, R.id.bottom_button);
        if (bottomButtonLeftItemView != null) {
            i10 = R.id.cv_game_img;
            View viewA = l3.d.a(view, R.id.cv_game_img);
            if (viewA != null) {
                k60 k60VarA = k60.a(viewA);
                i10 = R.id.divider;
                View viewA2 = l3.d.a(view, R.id.divider);
                if (viewA2 != null) {
                    mb.o oVarA = mb.o.a(viewA2);
                    i10 = R.id.iv_close;
                    ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_close);
                    if (imageView != null) {
                        i10 = R.id.ll_choose_options;
                        LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.ll_choose_options);
                        if (linearLayout != null) {
                            i10 = R.id.ll_faq;
                            LinearLayout linearLayout2 = (LinearLayout) l3.d.a(view, R.id.ll_faq);
                            if (linearLayout2 != null) {
                                i10 = R.id.rl_content;
                                RelativeLayout relativeLayout = (RelativeLayout) l3.d.a(view, R.id.rl_content);
                                if (relativeLayout != null) {
                                    i10 = R.id.sv_content;
                                    HBScrollView hBScrollView = (HBScrollView) l3.d.a(view, R.id.sv_content);
                                    if (hBScrollView != null) {
                                        i10 = R.id.tv_cost_coin;
                                        TextView textView = (TextView) l3.d.a(view, R.id.tv_cost_coin);
                                        if (textView != null) {
                                            i10 = R.id.tv_cost_rmb;
                                            TextView textView2 = (TextView) l3.d.a(view, R.id.tv_cost_rmb);
                                            if (textView2 != null) {
                                                i10 = R.id.tv_cost_rmb_symbol;
                                                TextView textView3 = (TextView) l3.d.a(view, R.id.tv_cost_rmb_symbol);
                                                if (textView3 != null) {
                                                    i10 = R.id.tv_desc;
                                                    TextView textView4 = (TextView) l3.d.a(view, R.id.tv_desc);
                                                    if (textView4 != null) {
                                                        i10 = R.id.tv_inventory;
                                                        TextView textView5 = (TextView) l3.d.a(view, R.id.tv_inventory);
                                                        if (textView5 != null) {
                                                            i10 = R.id.tv_reference_price;
                                                            TextView textView6 = (TextView) l3.d.a(view, R.id.tv_reference_price);
                                                            if (textView6 != null) {
                                                                i10 = R.id.vg_get_coupon;
                                                                View viewA3 = l3.d.a(view, R.id.vg_get_coupon);
                                                                if (viewA3 != null) {
                                                                    sn snVarA = sn.a(viewA3);
                                                                    i10 = R.id.vg_progress;
                                                                    RelativeLayout relativeLayout2 = (RelativeLayout) l3.d.a(view, R.id.vg_progress);
                                                                    if (relativeLayout2 != null) {
                                                                        return new ya((LinearLayout) view, bottomButtonLeftItemView, k60VarA, oVarA, imageView, linearLayout, linearLayout2, relativeLayout, hBScrollView, textView, textView2, textView3, textView4, textView5, textView6, snVarA, relativeLayout2);
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
    public static ya c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 17478, new Class[]{LayoutInflater.class}, ya.class);
        return patchProxyResultProxy.isSupported ? (ya) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static ya d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 17479, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, ya.class);
        if (patchProxyResultProxy.isSupported) {
            return (ya) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.fragment_purchase_game_dialog, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public LinearLayout b() {
        return this.f117859a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 17481, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
