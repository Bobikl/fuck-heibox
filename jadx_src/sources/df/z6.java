package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: DiscountSaleBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class z6 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final LinearLayout f118222a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f118223b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f118224c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f118225d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f118226e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f118227f;

    private z6(@androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 TextView textView4, @androidx.annotation.n0 LinearLayout linearLayout2) {
        this.f118222a = linearLayout;
        this.f118223b = textView;
        this.f118224c = textView2;
        this.f118225d = textView3;
        this.f118226e = textView4;
        this.f118227f = linearLayout2;
    }

    @androidx.annotation.n0
    public static z6 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 17068, new Class[]{View.class}, z6.class);
        if (patchProxyResultProxy.isSupported) {
            return (z6) patchProxyResultProxy.result;
        }
        int i10 = R.id.tv_current_price;
        TextView textView = (TextView) l3.d.a(view, R.id.tv_current_price);
        if (textView != null) {
            i10 = R.id.tv_discount;
            TextView textView2 = (TextView) l3.d.a(view, R.id.tv_discount);
            if (textView2 != null) {
                i10 = R.id.tv_lowest_price;
                TextView textView3 = (TextView) l3.d.a(view, R.id.tv_lowest_price);
                if (textView3 != null) {
                    i10 = R.id.tv_original_price;
                    TextView textView4 = (TextView) l3.d.a(view, R.id.tv_original_price);
                    if (textView4 != null) {
                        LinearLayout linearLayout = (LinearLayout) view;
                        return new z6(linearLayout, textView, textView2, textView3, textView4, linearLayout);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static z6 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 17066, new Class[]{LayoutInflater.class}, z6.class);
        return patchProxyResultProxy.isSupported ? (z6) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static z6 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 17067, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, z6.class);
        if (patchProxyResultProxy.isSupported) {
            return (z6) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.discount_sale, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public LinearLayout b() {
        return this.f118222a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 17069, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
