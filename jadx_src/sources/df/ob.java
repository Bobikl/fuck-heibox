package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.donkingliang.consecutivescroller.ConsecutiveScrollerLayout;
import com.max.hbcommon.component.ListSectionHeader;
import com.max.hbcommon.component.bottombutton.BottomButtonLeftItemView;
import com.max.hbcustomview.HBLineHeightTextView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;

/* JADX INFO: compiled from: FragmentSteamDirectPurchaseOrderBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class ob implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    @androidx.annotation.n0
    public final FrameLayout A;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final ConstraintLayout f114160a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final HBLineHeightTextView f114161b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final HBLineHeightTextView f114162c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final HBLineHeightTextView f114163d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final HBLineHeightTextView f114164e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final HBLineHeightTextView f114165f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final HBLineHeightTextView f114166g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final FrameLayout f114167h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final ConsecutiveScrollerLayout f114168i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f114169j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.n0
    public final AppCompatImageView f114170k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @androidx.annotation.n0
    public final AppCompatImageView f114171l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @androidx.annotation.n0
    public final ListSectionHeader f114172m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @androidx.annotation.n0
    public final RecyclerView f114173n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @androidx.annotation.n0
    public final SmartRefreshLayout f114174o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f114175p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @androidx.annotation.n0
    public final AppCompatTextView f114176q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f114177r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f114178s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f114179t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @androidx.annotation.n0
    public final BottomButtonLeftItemView f114180u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @androidx.annotation.n0
    public final ConstraintLayout f114181v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f114182w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @androidx.annotation.n0
    public final nc0 f114183x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f114184y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f114185z;

    private ob(@androidx.annotation.n0 ConstraintLayout constraintLayout, @androidx.annotation.n0 HBLineHeightTextView hBLineHeightTextView, @androidx.annotation.n0 HBLineHeightTextView hBLineHeightTextView2, @androidx.annotation.n0 HBLineHeightTextView hBLineHeightTextView3, @androidx.annotation.n0 HBLineHeightTextView hBLineHeightTextView4, @androidx.annotation.n0 HBLineHeightTextView hBLineHeightTextView5, @androidx.annotation.n0 HBLineHeightTextView hBLineHeightTextView6, @androidx.annotation.n0 FrameLayout frameLayout, @androidx.annotation.n0 ConsecutiveScrollerLayout consecutiveScrollerLayout, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 AppCompatImageView appCompatImageView, @androidx.annotation.n0 AppCompatImageView appCompatImageView2, @androidx.annotation.n0 ListSectionHeader listSectionHeader, @androidx.annotation.n0 RecyclerView recyclerView, @androidx.annotation.n0 SmartRefreshLayout smartRefreshLayout, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 AppCompatTextView appCompatTextView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 TextView textView4, @androidx.annotation.n0 BottomButtonLeftItemView bottomButtonLeftItemView, @androidx.annotation.n0 ConstraintLayout constraintLayout2, @androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 nc0 nc0Var, @androidx.annotation.n0 LinearLayout linearLayout2, @androidx.annotation.n0 LinearLayout linearLayout3, @androidx.annotation.n0 FrameLayout frameLayout2) {
        this.f114160a = constraintLayout;
        this.f114161b = hBLineHeightTextView;
        this.f114162c = hBLineHeightTextView2;
        this.f114163d = hBLineHeightTextView3;
        this.f114164e = hBLineHeightTextView4;
        this.f114165f = hBLineHeightTextView5;
        this.f114166g = hBLineHeightTextView6;
        this.f114167h = frameLayout;
        this.f114168i = consecutiveScrollerLayout;
        this.f114169j = imageView;
        this.f114170k = appCompatImageView;
        this.f114171l = appCompatImageView2;
        this.f114172m = listSectionHeader;
        this.f114173n = recyclerView;
        this.f114174o = smartRefreshLayout;
        this.f114175p = textView;
        this.f114176q = appCompatTextView;
        this.f114177r = textView2;
        this.f114178s = textView3;
        this.f114179t = textView4;
        this.f114180u = bottomButtonLeftItemView;
        this.f114181v = constraintLayout2;
        this.f114182w = linearLayout;
        this.f114183x = nc0Var;
        this.f114184y = linearLayout2;
        this.f114185z = linearLayout3;
        this.A = frameLayout2;
    }

    @androidx.annotation.n0
    public static ob a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 17544, new Class[]{View.class}, ob.class);
        if (patchProxyResultProxy.isSupported) {
            return (ob) patchProxyResultProxy.result;
        }
        int i10 = R.id.buy_tip0;
        HBLineHeightTextView hBLineHeightTextView = (HBLineHeightTextView) l3.d.a(view, R.id.buy_tip0);
        if (hBLineHeightTextView != null) {
            i10 = R.id.buy_tip1;
            HBLineHeightTextView hBLineHeightTextView2 = (HBLineHeightTextView) l3.d.a(view, R.id.buy_tip1);
            if (hBLineHeightTextView2 != null) {
                i10 = R.id.buy_tip2;
                HBLineHeightTextView hBLineHeightTextView3 = (HBLineHeightTextView) l3.d.a(view, R.id.buy_tip2);
                if (hBLineHeightTextView3 != null) {
                    i10 = R.id.buy_tip3;
                    HBLineHeightTextView hBLineHeightTextView4 = (HBLineHeightTextView) l3.d.a(view, R.id.buy_tip3);
                    if (hBLineHeightTextView4 != null) {
                        i10 = R.id.buy_tip4;
                        HBLineHeightTextView hBLineHeightTextView5 = (HBLineHeightTextView) l3.d.a(view, R.id.buy_tip4);
                        if (hBLineHeightTextView5 != null) {
                            i10 = R.id.buy_tip5;
                            HBLineHeightTextView hBLineHeightTextView6 = (HBLineHeightTextView) l3.d.a(view, R.id.buy_tip5);
                            if (hBLineHeightTextView6 != null) {
                                i10 = R.id.container_bottom_bar;
                                FrameLayout frameLayout = (FrameLayout) l3.d.a(view, R.id.container_bottom_bar);
                                if (frameLayout != null) {
                                    i10 = R.id.csl;
                                    ConsecutiveScrollerLayout consecutiveScrollerLayout = (ConsecutiveScrollerLayout) l3.d.a(view, R.id.csl);
                                    if (consecutiveScrollerLayout != null) {
                                        i10 = R.id.iv_copy_order_id;
                                        ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_copy_order_id);
                                        if (imageView != null) {
                                            i10 = R.id.iv_help_avartar;
                                            AppCompatImageView appCompatImageView = (AppCompatImageView) l3.d.a(view, R.id.iv_help_avartar);
                                            if (appCompatImageView != null) {
                                                i10 = R.id.iv_help_title;
                                                AppCompatImageView appCompatImageView2 = (AppCompatImageView) l3.d.a(view, R.id.iv_help_title);
                                                if (appCompatImageView2 != null) {
                                                    i10 = R.id.lsh_title;
                                                    ListSectionHeader listSectionHeader = (ListSectionHeader) l3.d.a(view, R.id.lsh_title);
                                                    if (listSectionHeader != null) {
                                                        i10 = R.id.rv_rec_goods;
                                                        RecyclerView recyclerView = (RecyclerView) l3.d.a(view, R.id.rv_rec_goods);
                                                        if (recyclerView != null) {
                                                            i10 = R.id.srl;
                                                            SmartRefreshLayout smartRefreshLayout = (SmartRefreshLayout) l3.d.a(view, R.id.srl);
                                                            if (smartRefreshLayout != null) {
                                                                i10 = R.id.tv_confirm_tips;
                                                                TextView textView = (TextView) l3.d.a(view, R.id.tv_confirm_tips);
                                                                if (textView != null) {
                                                                    i10 = R.id.tv_help_subtitle;
                                                                    AppCompatTextView appCompatTextView = (AppCompatTextView) l3.d.a(view, R.id.tv_help_subtitle);
                                                                    if (appCompatTextView != null) {
                                                                        i10 = R.id.tv_order_id;
                                                                        TextView textView2 = (TextView) l3.d.a(view, R.id.tv_order_id);
                                                                        if (textView2 != null) {
                                                                            i10 = R.id.tv_order_id_name;
                                                                            TextView textView3 = (TextView) l3.d.a(view, R.id.tv_order_id_name);
                                                                            if (textView3 != null) {
                                                                                i10 = R.id.tv_product_title;
                                                                                TextView textView4 = (TextView) l3.d.a(view, R.id.tv_product_title);
                                                                                if (textView4 != null) {
                                                                                    i10 = R.id.vg_action_bar;
                                                                                    BottomButtonLeftItemView bottomButtonLeftItemView = (BottomButtonLeftItemView) l3.d.a(view, R.id.vg_action_bar);
                                                                                    if (bottomButtonLeftItemView != null) {
                                                                                        i10 = R.id.vg_help_card;
                                                                                        ConstraintLayout constraintLayout = (ConstraintLayout) l3.d.a(view, R.id.vg_help_card);
                                                                                        if (constraintLayout != null) {
                                                                                            i10 = R.id.vg_order_info_card;
                                                                                            LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.vg_order_info_card);
                                                                                            if (linearLayout != null) {
                                                                                                i10 = R.id.vg_order_state;
                                                                                                View viewA = l3.d.a(view, R.id.vg_order_state);
                                                                                                if (viewA != null) {
                                                                                                    nc0 nc0VarA = nc0.a(viewA);
                                                                                                    i10 = R.id.vg_product_card;
                                                                                                    LinearLayout linearLayout2 = (LinearLayout) l3.d.a(view, R.id.vg_product_card);
                                                                                                    if (linearLayout2 != null) {
                                                                                                        i10 = R.id.vg_product_info;
                                                                                                        LinearLayout linearLayout3 = (LinearLayout) l3.d.a(view, R.id.vg_product_info);
                                                                                                        if (linearLayout3 != null) {
                                                                                                            i10 = R.id.vg_product_title;
                                                                                                            FrameLayout frameLayout2 = (FrameLayout) l3.d.a(view, R.id.vg_product_title);
                                                                                                            if (frameLayout2 != null) {
                                                                                                                return new ob((ConstraintLayout) view, hBLineHeightTextView, hBLineHeightTextView2, hBLineHeightTextView3, hBLineHeightTextView4, hBLineHeightTextView5, hBLineHeightTextView6, frameLayout, consecutiveScrollerLayout, imageView, appCompatImageView, appCompatImageView2, listSectionHeader, recyclerView, smartRefreshLayout, textView, appCompatTextView, textView2, textView3, textView4, bottomButtonLeftItemView, constraintLayout, linearLayout, nc0VarA, linearLayout2, linearLayout3, frameLayout2);
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
    public static ob c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 17542, new Class[]{LayoutInflater.class}, ob.class);
        return patchProxyResultProxy.isSupported ? (ob) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static ob d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 17543, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, ob.class);
        if (patchProxyResultProxy.isSupported) {
            return (ob) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.fragment_steam_direct_purchase_order, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public ConstraintLayout b() {
        return this.f114160a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 17545, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
