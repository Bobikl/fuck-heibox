package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.max.hbcommon.component.bottombutton.BottomButtonLeftItemView;
import com.max.hbcustomview.MaxHeightRecyclerView;
import com.max.hbcustomview.VerBanner;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.module.mall.component.PurchaseTotalCountView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: DialogFragmentPurchaseDetailBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class g5 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    @androidx.annotation.n0
    public final LinearLayout A;

    @androidx.annotation.n0
    public final mu B;

    @androidx.annotation.n0
    public final v70 C;

    @androidx.annotation.n0
    public final LinearLayout D;

    @androidx.annotation.n0
    public final LinearLayout E;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f110787a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final BottomButtonLeftItemView f110788b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final k60 f110789c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final mb.o f110790d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f110791e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f110792f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f110793g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f110794h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final RecyclerView f110795i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final MaxHeightRecyclerView f110796j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.n0
    public final RecyclerView f110797k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f110798l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f110799m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f110800n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f110801o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f110802p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f110803q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f110804r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f110805s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @androidx.annotation.n0
    public final PurchaseTotalCountView f110806t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @androidx.annotation.n0
    public final VerBanner f110807u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f110808v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @androidx.annotation.n0
    public final mu f110809w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f110810x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @androidx.annotation.n0
    public final mu f110811y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f110812z;

    private g5(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 BottomButtonLeftItemView bottomButtonLeftItemView, @androidx.annotation.n0 k60 k60Var, @androidx.annotation.n0 mb.o oVar, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 LinearLayout linearLayout2, @androidx.annotation.n0 RelativeLayout relativeLayout2, @androidx.annotation.n0 RecyclerView recyclerView, @androidx.annotation.n0 MaxHeightRecyclerView maxHeightRecyclerView, @androidx.annotation.n0 RecyclerView recyclerView2, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 TextView textView4, @androidx.annotation.n0 TextView textView5, @androidx.annotation.n0 TextView textView6, @androidx.annotation.n0 TextView textView7, @androidx.annotation.n0 TextView textView8, @androidx.annotation.n0 PurchaseTotalCountView purchaseTotalCountView, @androidx.annotation.n0 VerBanner verBanner, @androidx.annotation.n0 LinearLayout linearLayout3, @androidx.annotation.n0 mu muVar, @androidx.annotation.n0 RelativeLayout relativeLayout3, @androidx.annotation.n0 mu muVar2, @androidx.annotation.n0 RelativeLayout relativeLayout4, @androidx.annotation.n0 LinearLayout linearLayout4, @androidx.annotation.n0 mu muVar3, @androidx.annotation.n0 v70 v70Var, @androidx.annotation.n0 LinearLayout linearLayout5, @androidx.annotation.n0 LinearLayout linearLayout6) {
        this.f110787a = relativeLayout;
        this.f110788b = bottomButtonLeftItemView;
        this.f110789c = k60Var;
        this.f110790d = oVar;
        this.f110791e = imageView;
        this.f110792f = linearLayout;
        this.f110793g = linearLayout2;
        this.f110794h = relativeLayout2;
        this.f110795i = recyclerView;
        this.f110796j = maxHeightRecyclerView;
        this.f110797k = recyclerView2;
        this.f110798l = textView;
        this.f110799m = textView2;
        this.f110800n = textView3;
        this.f110801o = textView4;
        this.f110802p = textView5;
        this.f110803q = textView6;
        this.f110804r = textView7;
        this.f110805s = textView8;
        this.f110806t = purchaseTotalCountView;
        this.f110807u = verBanner;
        this.f110808v = linearLayout3;
        this.f110809w = muVar;
        this.f110810x = relativeLayout3;
        this.f110811y = muVar2;
        this.f110812z = relativeLayout4;
        this.A = linearLayout4;
        this.B = muVar3;
        this.C = v70Var;
        this.D = linearLayout5;
        this.E = linearLayout6;
    }

    @androidx.annotation.n0
    public static g5 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 16888, new Class[]{View.class}, g5.class);
        if (patchProxyResultProxy.isSupported) {
            return (g5) patchProxyResultProxy.result;
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
                                    i10 = R.id.rv_buy_type;
                                    RecyclerView recyclerView = (RecyclerView) l3.d.a(view, R.id.rv_buy_type);
                                    if (recyclerView != null) {
                                        i10 = R.id.rv_goods_type;
                                        MaxHeightRecyclerView maxHeightRecyclerView = (MaxHeightRecyclerView) l3.d.a(view, R.id.rv_goods_type);
                                        if (maxHeightRecyclerView != null) {
                                            i10 = R.id.rv_pay_type;
                                            RecyclerView recyclerView2 = (RecyclerView) l3.d.a(view, R.id.rv_pay_type);
                                            if (recyclerView2 != null) {
                                                i10 = R.id.tv_cost_coin;
                                                TextView textView = (TextView) l3.d.a(view, R.id.tv_cost_coin);
                                                if (textView != null) {
                                                    i10 = R.id.tv_cost_rmb;
                                                    TextView textView2 = (TextView) l3.d.a(view, R.id.tv_cost_rmb);
                                                    if (textView2 != null) {
                                                        i10 = R.id.tv_cost_rmb_symbol;
                                                        TextView textView3 = (TextView) l3.d.a(view, R.id.tv_cost_rmb_symbol);
                                                        if (textView3 != null) {
                                                            i10 = R.id.tv_count;
                                                            TextView textView4 = (TextView) l3.d.a(view, R.id.tv_count);
                                                            if (textView4 != null) {
                                                                i10 = R.id.tv_desc;
                                                                TextView textView5 = (TextView) l3.d.a(view, R.id.tv_desc);
                                                                if (textView5 != null) {
                                                                    i10 = R.id.tv_inventory;
                                                                    TextView textView6 = (TextView) l3.d.a(view, R.id.tv_inventory);
                                                                    if (textView6 != null) {
                                                                        i10 = R.id.tv_mall_agreement;
                                                                        TextView textView7 = (TextView) l3.d.a(view, R.id.tv_mall_agreement);
                                                                        if (textView7 != null) {
                                                                            i10 = R.id.tv_reference_price;
                                                                            TextView textView8 = (TextView) l3.d.a(view, R.id.tv_reference_price);
                                                                            if (textView8 != null) {
                                                                                i10 = R.id.v_purchase_total_count;
                                                                                PurchaseTotalCountView purchaseTotalCountView = (PurchaseTotalCountView) l3.d.a(view, R.id.v_purchase_total_count);
                                                                                if (purchaseTotalCountView != null) {
                                                                                    i10 = R.id.ver_banner;
                                                                                    VerBanner verBanner = (VerBanner) l3.d.a(view, R.id.ver_banner);
                                                                                    if (verBanner != null) {
                                                                                        i10 = R.id.vg_bottom;
                                                                                        LinearLayout linearLayout3 = (LinearLayout) l3.d.a(view, R.id.vg_bottom);
                                                                                        if (linearLayout3 != null) {
                                                                                            i10 = R.id.vg_buy_type_title;
                                                                                            View viewA3 = l3.d.a(view, R.id.vg_buy_type_title);
                                                                                            if (viewA3 != null) {
                                                                                                mu muVarA = mu.a(viewA3);
                                                                                                i10 = R.id.vg_cost_info;
                                                                                                RelativeLayout relativeLayout2 = (RelativeLayout) l3.d.a(view, R.id.vg_cost_info);
                                                                                                if (relativeLayout2 != null) {
                                                                                                    i10 = R.id.vg_goods_title;
                                                                                                    View viewA4 = l3.d.a(view, R.id.vg_goods_title);
                                                                                                    if (viewA4 != null) {
                                                                                                        mu muVarA2 = mu.a(viewA4);
                                                                                                        i10 = R.id.vg_group_buy_user;
                                                                                                        RelativeLayout relativeLayout3 = (RelativeLayout) l3.d.a(view, R.id.vg_group_buy_user);
                                                                                                        if (relativeLayout3 != null) {
                                                                                                            i10 = R.id.vg_pay_type;
                                                                                                            LinearLayout linearLayout4 = (LinearLayout) l3.d.a(view, R.id.vg_pay_type);
                                                                                                            if (linearLayout4 != null) {
                                                                                                                i10 = R.id.vg_pay_type_title;
                                                                                                                View viewA5 = l3.d.a(view, R.id.vg_pay_type_title);
                                                                                                                if (viewA5 != null) {
                                                                                                                    mu muVarA3 = mu.a(viewA5);
                                                                                                                    i10 = R.id.vg_price_info;
                                                                                                                    View viewA6 = l3.d.a(view, R.id.vg_price_info);
                                                                                                                    if (viewA6 != null) {
                                                                                                                        v70 v70VarA = v70.a(viewA6);
                                                                                                                        i10 = R.id.vg_price_info_card;
                                                                                                                        LinearLayout linearLayout5 = (LinearLayout) l3.d.a(view, R.id.vg_price_info_card);
                                                                                                                        if (linearLayout5 != null) {
                                                                                                                            i10 = R.id.vg_purchase_detail;
                                                                                                                            LinearLayout linearLayout6 = (LinearLayout) l3.d.a(view, R.id.vg_purchase_detail);
                                                                                                                            if (linearLayout6 != null) {
                                                                                                                                return new g5((RelativeLayout) view, bottomButtonLeftItemView, k60VarA, oVarA, imageView, linearLayout, linearLayout2, relativeLayout, recyclerView, maxHeightRecyclerView, recyclerView2, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, purchaseTotalCountView, verBanner, linearLayout3, muVarA, relativeLayout2, muVarA2, relativeLayout3, linearLayout4, muVarA3, v70VarA, linearLayout5, linearLayout6);
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
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static g5 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 16886, new Class[]{LayoutInflater.class}, g5.class);
        return patchProxyResultProxy.isSupported ? (g5) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static g5 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 16887, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, g5.class);
        if (patchProxyResultProxy.isSupported) {
            return (g5) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.dialog_fragment_purchase_detail, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f110787a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 16889, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
