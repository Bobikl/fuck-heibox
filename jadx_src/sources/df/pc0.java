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

/* JADX INFO: compiled from: MarkerViewPriceTrendBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class pc0 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final LinearLayout f114510a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f114511b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f114512c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f114513d;

    private pc0(@androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3) {
        this.f114510a = linearLayout;
        this.f114511b = textView;
        this.f114512c = textView2;
        this.f114513d = textView3;
    }

    @androidx.annotation.n0
    public static pc0 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 21373, new Class[]{View.class}, pc0.class);
        if (patchProxyResultProxy.isSupported) {
            return (pc0) patchProxyResultProxy.result;
        }
        int i10 = R.id.tv_date;
        TextView textView = (TextView) l3.d.a(view, R.id.tv_date);
        if (textView != null) {
            i10 = R.id.tv_desc;
            TextView textView2 = (TextView) l3.d.a(view, R.id.tv_desc);
            if (textView2 != null) {
                i10 = R.id.tv_price;
                TextView textView3 = (TextView) l3.d.a(view, R.id.tv_price);
                if (textView3 != null) {
                    return new pc0((LinearLayout) view, textView, textView2, textView3);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static pc0 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 21371, new Class[]{LayoutInflater.class}, pc0.class);
        return patchProxyResultProxy.isSupported ? (pc0) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static pc0 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 21372, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, pc0.class);
        if (patchProxyResultProxy.isSupported) {
            return (pc0) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.marker_view_price_trend, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public LinearLayout b() {
        return this.f114510a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 21374, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
