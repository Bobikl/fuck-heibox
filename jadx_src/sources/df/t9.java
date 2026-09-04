package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.donkingliang.consecutivescroller.ConsecutiveScrollerLayout;
import com.max.hbcommon.component.bottombutton.BottomButtonLeftItemView;
import com.max.hbcustomview.MarqueeTextView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;

/* JADX INFO: compiled from: FragmentMallCartBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class t9 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f115890a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final ConsecutiveScrollerLayout f115891b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final RecyclerView f115892c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final SmartRefreshLayout f115893d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final MarqueeTextView f115894e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final View f115895f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final BottomButtonLeftItemView f115896g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f115897h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final h30 f115898i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final BottomButtonLeftItemView f115899j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.n0
    public final up f115900k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f115901l;

    private t9(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 ConsecutiveScrollerLayout consecutiveScrollerLayout, @androidx.annotation.n0 RecyclerView recyclerView, @androidx.annotation.n0 SmartRefreshLayout smartRefreshLayout, @androidx.annotation.n0 MarqueeTextView marqueeTextView, @androidx.annotation.n0 View view, @androidx.annotation.n0 BottomButtonLeftItemView bottomButtonLeftItemView, @androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 h30 h30Var, @androidx.annotation.n0 BottomButtonLeftItemView bottomButtonLeftItemView2, @androidx.annotation.n0 up upVar, @androidx.annotation.n0 LinearLayout linearLayout2) {
        this.f115890a = relativeLayout;
        this.f115891b = consecutiveScrollerLayout;
        this.f115892c = recyclerView;
        this.f115893d = smartRefreshLayout;
        this.f115894e = marqueeTextView;
        this.f115895f = view;
        this.f115896g = bottomButtonLeftItemView;
        this.f115897h = linearLayout;
        this.f115898i = h30Var;
        this.f115899j = bottomButtonLeftItemView2;
        this.f115900k = upVar;
        this.f115901l = linearLayout2;
    }

    @androidx.annotation.n0
    public static t9 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 17356, new Class[]{View.class}, t9.class);
        if (patchProxyResultProxy.isSupported) {
            return (t9) patchProxyResultProxy.result;
        }
        int i10 = R.id.csl;
        ConsecutiveScrollerLayout consecutiveScrollerLayout = (ConsecutiveScrollerLayout) l3.d.a(view, R.id.csl);
        if (consecutiveScrollerLayout != null) {
            i10 = R.id.rv;
            RecyclerView recyclerView = (RecyclerView) l3.d.a(view, R.id.rv);
            if (recyclerView != null) {
                i10 = R.id.srl;
                SmartRefreshLayout smartRefreshLayout = (SmartRefreshLayout) l3.d.a(view, R.id.srl);
                if (smartRefreshLayout != null) {
                    i10 = R.id.tv_message;
                    MarqueeTextView marqueeTextView = (MarqueeTextView) l3.d.a(view, R.id.tv_message);
                    if (marqueeTextView != null) {
                        i10 = R.id.v_divider;
                        View viewA = l3.d.a(view, R.id.v_divider);
                        if (viewA != null) {
                            i10 = R.id.vg_bottom_bar;
                            BottomButtonLeftItemView bottomButtonLeftItemView = (BottomButtonLeftItemView) l3.d.a(view, R.id.vg_bottom_bar);
                            if (bottomButtonLeftItemView != null) {
                                i10 = R.id.vg_bottom_expand_bar;
                                LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.vg_bottom_expand_bar);
                                if (linearLayout != null) {
                                    i10 = R.id.vg_cart_empty;
                                    View viewA2 = l3.d.a(view, R.id.vg_cart_empty);
                                    if (viewA2 != null) {
                                        h30 h30VarA = h30.a(viewA2);
                                        i10 = R.id.vg_edit_bar;
                                        BottomButtonLeftItemView bottomButtonLeftItemView2 = (BottomButtonLeftItemView) l3.d.a(view, R.id.vg_edit_bar);
                                        if (bottomButtonLeftItemView2 != null) {
                                            i10 = R.id.vg_header;
                                            View viewA3 = l3.d.a(view, R.id.vg_header);
                                            if (viewA3 != null) {
                                                up upVarA = up.a(viewA3);
                                                i10 = R.id.vg_message;
                                                LinearLayout linearLayout2 = (LinearLayout) l3.d.a(view, R.id.vg_message);
                                                if (linearLayout2 != null) {
                                                    return new t9((RelativeLayout) view, consecutiveScrollerLayout, recyclerView, smartRefreshLayout, marqueeTextView, viewA, bottomButtonLeftItemView, linearLayout, h30VarA, bottomButtonLeftItemView2, upVarA, linearLayout2);
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
    public static t9 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 17354, new Class[]{LayoutInflater.class}, t9.class);
        return patchProxyResultProxy.isSupported ? (t9) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static t9 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 17355, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, t9.class);
        if (patchProxyResultProxy.isSupported) {
            return (t9) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.fragment_mall_cart, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f115890a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 17357, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
