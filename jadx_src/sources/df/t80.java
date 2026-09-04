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

/* JADX INFO: compiled from: LayoutPlatformPriceBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class t80 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final LinearLayout f115885a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f115886b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f115887c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f115888d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f115889e;

    private t80(@androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 TextView textView4) {
        this.f115885a = linearLayout;
        this.f115886b = textView;
        this.f115887c = textView2;
        this.f115888d = textView3;
        this.f115889e = textView4;
    }

    @androidx.annotation.n0
    public static t80 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 20978, new Class[]{View.class}, t80.class);
        if (patchProxyResultProxy.isSupported) {
            return (t80) patchProxyResultProxy.result;
        }
        int i10 = R.id.tv_cc_value;
        TextView textView = (TextView) l3.d.a(view, R.id.tv_cc_value);
        if (textView != null) {
            i10 = R.id.tv_discount;
            TextView textView2 = (TextView) l3.d.a(view, R.id.tv_discount);
            if (textView2 != null) {
                i10 = R.id.tv_discount_desc;
                TextView textView3 = (TextView) l3.d.a(view, R.id.tv_discount_desc);
                if (textView3 != null) {
                    i10 = R.id.tv_rmb;
                    TextView textView4 = (TextView) l3.d.a(view, R.id.tv_rmb);
                    if (textView4 != null) {
                        return new t80((LinearLayout) view, textView, textView2, textView3, textView4);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static t80 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 20976, new Class[]{LayoutInflater.class}, t80.class);
        return patchProxyResultProxy.isSupported ? (t80) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static t80 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 20977, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, t80.class);
        if (patchProxyResultProxy.isSupported) {
            return (t80) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.layout_platform_price, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public LinearLayout b() {
        return this.f115885a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 20979, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
