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
import androidx.constraintlayout.widget.Guideline;
import androidx.recyclerview.widget.RecyclerView;
import com.donkingliang.consecutivescroller.ConsecutiveScrollerLayout;
import com.flyco.tablayout.CommonTabLayout;
import com.max.hbwallet.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;

/* JADX INFO: compiled from: HbwalletActivityHbWalletBinding.java */
/* JADX INFO: loaded from: classes2.dex */
public final class b implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @n0
    private final SmartRefreshLayout f35230a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @n0
    public final ConsecutiveScrollerLayout f35231b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @n0
    public final Guideline f35232c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @n0
    public final ImageView f35233d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @n0
    public final RecyclerView f35234e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @n0
    public final SmartRefreshLayout f35235f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @n0
    public final CommonTabLayout f35236g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @n0
    public final TextView f35237h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @n0
    public final LinearLayout f35238i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @n0
    public final RelativeLayout f35239j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @n0
    public final p f35240k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @n0
    public final p f35241l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @n0
    public final p f35242m;

    private b(@n0 SmartRefreshLayout smartRefreshLayout, @n0 ConsecutiveScrollerLayout consecutiveScrollerLayout, @n0 Guideline guideline, @n0 ImageView imageView, @n0 RecyclerView recyclerView, @n0 SmartRefreshLayout smartRefreshLayout2, @n0 CommonTabLayout commonTabLayout, @n0 TextView textView, @n0 LinearLayout linearLayout, @n0 RelativeLayout relativeLayout, @n0 p pVar, @n0 p pVar2, @n0 p pVar3) {
        this.f35230a = smartRefreshLayout;
        this.f35231b = consecutiveScrollerLayout;
        this.f35232c = guideline;
        this.f35233d = imageView;
        this.f35234e = recyclerView;
        this.f35235f = smartRefreshLayout2;
        this.f35236g = commonTabLayout;
        this.f35237h = textView;
        this.f35238i = linearLayout;
        this.f35239j = relativeLayout;
        this.f35240k = pVar;
        this.f35241l = pVar2;
        this.f35242m = pVar3;
    }

    @n0
    public static b a(@n0 View view) {
        View viewA;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, bb.c.l.f34266l4, new Class[]{View.class}, b.class);
        if (patchProxyResultProxy.isSupported) {
            return (b) patchProxyResultProxy.result;
        }
        int i10 = R.id.csl;
        ConsecutiveScrollerLayout consecutiveScrollerLayout = (ConsecutiveScrollerLayout) l3.d.a(view, i10);
        if (consecutiveScrollerLayout != null) {
            i10 = R.id.guardline_1;
            Guideline guideline = (Guideline) l3.d.a(view, i10);
            if (guideline != null) {
                i10 = R.id.iv_arrow;
                ImageView imageView = (ImageView) l3.d.a(view, i10);
                if (imageView != null) {
                    i10 = R.id.rv;
                    RecyclerView recyclerView = (RecyclerView) l3.d.a(view, i10);
                    if (recyclerView != null) {
                        SmartRefreshLayout smartRefreshLayout = (SmartRefreshLayout) view;
                        i10 = R.id.tab_title;
                        CommonTabLayout commonTabLayout = (CommonTabLayout) l3.d.a(view, i10);
                        if (commonTabLayout != null) {
                            i10 = R.id.tv_empty_desc;
                            TextView textView = (TextView) l3.d.a(view, i10);
                            if (textView != null) {
                                i10 = R.id.vg_empty;
                                LinearLayout linearLayout = (LinearLayout) l3.d.a(view, i10);
                                if (linearLayout != null) {
                                    i10 = R.id.vg_get_coupon;
                                    RelativeLayout relativeLayout = (RelativeLayout) l3.d.a(view, i10);
                                    if (relativeLayout != null && (viewA = l3.d.a(view, (i10 = R.id.vg_hcash))) != null) {
                                        p pVarA = p.a(viewA);
                                        i10 = R.id.vg_hcoin;
                                        View viewA2 = l3.d.a(view, i10);
                                        if (viewA2 != null) {
                                            p pVarA2 = p.a(viewA2);
                                            i10 = R.id.vg_profit;
                                            View viewA3 = l3.d.a(view, i10);
                                            if (viewA3 != null) {
                                                return new b(smartRefreshLayout, consecutiveScrollerLayout, guideline, imageView, recyclerView, smartRefreshLayout, commonTabLayout, textView, linearLayout, relativeLayout, pVarA, pVarA2, p.a(viewA3));
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
    public static b c(@n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, bb.c.l.f34220j4, new Class[]{LayoutInflater.class}, b.class);
        return patchProxyResultProxy.isSupported ? (b) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @n0
    public static b d(@n0 LayoutInflater layoutInflater, @p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, bb.c.l.f34243k4, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, b.class);
        if (patchProxyResultProxy.isSupported) {
            return (b) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.hbwallet_activity_hb_wallet, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @n0
    public SmartRefreshLayout b() {
        return this.f35230a;
    }

    @Override // l3.c
    @n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.l.f34289m4, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
