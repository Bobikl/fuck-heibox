package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.module.game.component.PriceLowestTagView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ViewPriceDiscountBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class xg0 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final LinearLayout f117566a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f117567b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final PriceLowestTagView f117568c;

    private xg0(@androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 PriceLowestTagView priceLowestTagView) {
        this.f117566a = linearLayout;
        this.f117567b = textView;
        this.f117568c = priceLowestTagView;
    }

    @androidx.annotation.n0
    public static xg0 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 21814, new Class[]{View.class}, xg0.class);
        if (patchProxyResultProxy.isSupported) {
            return (xg0) patchProxyResultProxy.result;
        }
        int i10 = R.id.tv_discount;
        TextView textView = (TextView) l3.d.a(view, R.id.tv_discount);
        if (textView != null) {
            i10 = R.id.v_price_tag;
            PriceLowestTagView priceLowestTagView = (PriceLowestTagView) l3.d.a(view, R.id.v_price_tag);
            if (priceLowestTagView != null) {
                return new xg0((LinearLayout) view, textView, priceLowestTagView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static xg0 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 21812, new Class[]{LayoutInflater.class}, xg0.class);
        return patchProxyResultProxy.isSupported ? (xg0) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static xg0 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 21813, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, xg0.class);
        if (patchProxyResultProxy.isSupported) {
            return (xg0) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.view_price_discount, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public LinearLayout b() {
        return this.f117566a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 21815, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
