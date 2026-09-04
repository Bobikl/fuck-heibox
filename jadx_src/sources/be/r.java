package be;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.max.hbcustomview.HBLineHeightTextView;
import com.max.hbwallet.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: HbwalletItemStackCouponBinding.java */
/* JADX INFO: loaded from: classes2.dex */
public final class r implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @n0
    private final ConstraintLayout f35393a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @n0
    public final HBLineHeightTextView f35394b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @n0
    public final HBLineHeightTextView f35395c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @n0
    public final TextView f35396d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @n0
    public final HBLineHeightTextView f35397e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @n0
    public final HBLineHeightTextView f35398f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @n0
    public final HBLineHeightTextView f35399g;

    private r(@n0 ConstraintLayout constraintLayout, @n0 HBLineHeightTextView hBLineHeightTextView, @n0 HBLineHeightTextView hBLineHeightTextView2, @n0 TextView textView, @n0 HBLineHeightTextView hBLineHeightTextView3, @n0 HBLineHeightTextView hBLineHeightTextView4, @n0 HBLineHeightTextView hBLineHeightTextView5) {
        this.f35393a = constraintLayout;
        this.f35394b = hBLineHeightTextView;
        this.f35395c = hBLineHeightTextView2;
        this.f35396d = textView;
        this.f35397e = hBLineHeightTextView3;
        this.f35398f = hBLineHeightTextView4;
        this.f35399g = hBLineHeightTextView5;
    }

    @n0
    public static r a(@n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, bb.c.l.f34536x5, new Class[]{View.class}, r.class);
        if (patchProxyResultProxy.isSupported) {
            return (r) patchProxyResultProxy.result;
        }
        int i10 = R.id.tv_coin;
        HBLineHeightTextView hBLineHeightTextView = (HBLineHeightTextView) l3.d.a(view, i10);
        if (hBLineHeightTextView != null) {
            i10 = R.id.tv_coin_unit;
            HBLineHeightTextView hBLineHeightTextView2 = (HBLineHeightTextView) l3.d.a(view, i10);
            if (hBLineHeightTextView2 != null) {
                i10 = R.id.tv_desc;
                TextView textView = (TextView) l3.d.a(view, i10);
                if (textView != null) {
                    i10 = R.id.tv_num;
                    HBLineHeightTextView hBLineHeightTextView3 = (HBLineHeightTextView) l3.d.a(view, i10);
                    if (hBLineHeightTextView3 != null) {
                        i10 = R.id.tv_num_unit;
                        HBLineHeightTextView hBLineHeightTextView4 = (HBLineHeightTextView) l3.d.a(view, i10);
                        if (hBLineHeightTextView4 != null) {
                            i10 = R.id.tv_x;
                            HBLineHeightTextView hBLineHeightTextView5 = (HBLineHeightTextView) l3.d.a(view, i10);
                            if (hBLineHeightTextView5 != null) {
                                return new r((ConstraintLayout) view, hBLineHeightTextView, hBLineHeightTextView2, textView, hBLineHeightTextView3, hBLineHeightTextView4, hBLineHeightTextView5);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @n0
    public static r c(@n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, bb.c.l.f34492v5, new Class[]{LayoutInflater.class}, r.class);
        return patchProxyResultProxy.isSupported ? (r) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @n0
    public static r d(@n0 LayoutInflater layoutInflater, @p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, bb.c.l.f34514w5, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, r.class);
        if (patchProxyResultProxy.isSupported) {
            return (r) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.hbwallet_item_stack_coupon, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @n0
    public ConstraintLayout b() {
        return this.f35393a;
    }

    @Override // l3.c
    @n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.l.f34558y5, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
