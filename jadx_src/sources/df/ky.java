package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemSellerOrderBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class ky implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final ConstraintLayout f112759a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f112760b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f112761c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f112762d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f112763e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f112764f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f112765g;

    private ky(@androidx.annotation.n0 ConstraintLayout constraintLayout, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 TextView textView4, @androidx.annotation.n0 TextView textView5, @androidx.annotation.n0 LinearLayout linearLayout) {
        this.f112759a = constraintLayout;
        this.f112760b = textView;
        this.f112761c = textView2;
        this.f112762d = textView3;
        this.f112763e = textView4;
        this.f112764f = textView5;
        this.f112765g = linearLayout;
    }

    @androidx.annotation.n0
    public static ky a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 19908, new Class[]{View.class}, ky.class);
        if (patchProxyResultProxy.isSupported) {
            return (ky) patchProxyResultProxy.result;
        }
        int i10 = R.id.tv_discount;
        TextView textView = (TextView) l3.d.a(view, R.id.tv_discount);
        if (textView != null) {
            i10 = R.id.tv_price;
            TextView textView2 = (TextView) l3.d.a(view, R.id.tv_price);
            if (textView2 != null) {
                i10 = R.id.tv_profit;
                TextView textView3 = (TextView) l3.d.a(view, R.id.tv_profit);
                if (textView3 != null) {
                    i10 = R.id.tv_state;
                    TextView textView4 = (TextView) l3.d.a(view, R.id.tv_state);
                    if (textView4 != null) {
                        i10 = R.id.tv_time;
                        TextView textView5 = (TextView) l3.d.a(view, R.id.tv_time);
                        if (textView5 != null) {
                            i10 = R.id.vg_state;
                            LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.vg_state);
                            if (linearLayout != null) {
                                return new ky((ConstraintLayout) view, textView, textView2, textView3, textView4, textView5, linearLayout);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static ky c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 19906, new Class[]{LayoutInflater.class}, ky.class);
        return patchProxyResultProxy.isSupported ? (ky) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static ky d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 19907, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, ky.class);
        if (patchProxyResultProxy.isSupported) {
            return (ky) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_seller_order, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public ConstraintLayout b() {
        return this.f112759a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 19909, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
