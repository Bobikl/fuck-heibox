package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import com.max.hbcommon.component.bottombutton.BottomButtonLeftItemView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: FragmentMallRegisterOrderDialogBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class y9 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final LinearLayout f117841a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final BottomButtonLeftItemView f117842b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final k60 f117843c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final mb.o f117844d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f117845e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f117846f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final ScrollView f117847g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f117848h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f117849i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f117850j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f117851k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f117852l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @androidx.annotation.n0
    public final sn f117853m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f117854n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f117855o;

    private y9(@androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 BottomButtonLeftItemView bottomButtonLeftItemView, @androidx.annotation.n0 k60 k60Var, @androidx.annotation.n0 mb.o oVar, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 LinearLayout linearLayout2, @androidx.annotation.n0 ScrollView scrollView, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 TextView textView4, @androidx.annotation.n0 TextView textView5, @androidx.annotation.n0 sn snVar, @androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 LinearLayout linearLayout3) {
        this.f117841a = linearLayout;
        this.f117842b = bottomButtonLeftItemView;
        this.f117843c = k60Var;
        this.f117844d = oVar;
        this.f117845e = imageView;
        this.f117846f = linearLayout2;
        this.f117847g = scrollView;
        this.f117848h = textView;
        this.f117849i = textView2;
        this.f117850j = textView3;
        this.f117851k = textView4;
        this.f117852l = textView5;
        this.f117853m = snVar;
        this.f117854n = relativeLayout;
        this.f117855o = linearLayout3;
    }

    @androidx.annotation.n0
    public static y9 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 17376, new Class[]{View.class}, y9.class);
        if (patchProxyResultProxy.isSupported) {
            return (y9) patchProxyResultProxy.result;
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
                            i10 = R.id.sv_content;
                            ScrollView scrollView = (ScrollView) l3.d.a(view, R.id.sv_content);
                            if (scrollView != null) {
                                i10 = R.id.tv_cost_coin;
                                TextView textView = (TextView) l3.d.a(view, R.id.tv_cost_coin);
                                if (textView != null) {
                                    i10 = R.id.tv_cost_rmb;
                                    TextView textView2 = (TextView) l3.d.a(view, R.id.tv_cost_rmb);
                                    if (textView2 != null) {
                                        i10 = R.id.tv_cost_rmb_symbol;
                                        TextView textView3 = (TextView) l3.d.a(view, R.id.tv_cost_rmb_symbol);
                                        if (textView3 != null) {
                                            i10 = R.id.tv_inventory;
                                            TextView textView4 = (TextView) l3.d.a(view, R.id.tv_inventory);
                                            if (textView4 != null) {
                                                i10 = R.id.tv_reference_price;
                                                TextView textView5 = (TextView) l3.d.a(view, R.id.tv_reference_price);
                                                if (textView5 != null) {
                                                    i10 = R.id.vg_get_coupon;
                                                    View viewA3 = l3.d.a(view, R.id.vg_get_coupon);
                                                    if (viewA3 != null) {
                                                        sn snVarA = sn.a(viewA3);
                                                        i10 = R.id.vg_progress;
                                                        RelativeLayout relativeLayout = (RelativeLayout) l3.d.a(view, R.id.vg_progress);
                                                        if (relativeLayout != null) {
                                                            LinearLayout linearLayout2 = (LinearLayout) view;
                                                            return new y9(linearLayout2, bottomButtonLeftItemView, k60VarA, oVarA, imageView, linearLayout, scrollView, textView, textView2, textView3, textView4, textView5, snVarA, relativeLayout, linearLayout2);
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
    public static y9 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 17374, new Class[]{LayoutInflater.class}, y9.class);
        return patchProxyResultProxy.isSupported ? (y9) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static y9 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 17375, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, y9.class);
        if (patchProxyResultProxy.isSupported) {
            return (y9) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.fragment_mall_register_order_dialog, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public LinearLayout b() {
        return this.f117841a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 17377, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
