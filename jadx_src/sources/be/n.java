package be;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.n0;
import androidx.annotation.p0;
import com.max.hbwallet.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: HbwalletItemCouponHistoryBinding.java */
/* JADX INFO: loaded from: classes2.dex */
public final class n implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @n0
    private final RelativeLayout f35369a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @n0
    public final TextView f35370b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @n0
    public final TextView f35371c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @n0
    public final TextView f35372d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @n0
    public final TextView f35373e;

    private n(@n0 RelativeLayout relativeLayout, @n0 TextView textView, @n0 TextView textView2, @n0 TextView textView3, @n0 TextView textView4) {
        this.f35369a = relativeLayout;
        this.f35370b = textView;
        this.f35371c = textView2;
        this.f35372d = textView3;
        this.f35373e = textView4;
    }

    @n0
    public static n a(@n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, bb.c.l.f34176h5, new Class[]{View.class}, n.class);
        if (patchProxyResultProxy.isSupported) {
            return (n) patchProxyResultProxy.result;
        }
        int i10 = R.id.tv_desc;
        TextView textView = (TextView) l3.d.a(view, i10);
        if (textView != null) {
            i10 = R.id.tv_name;
            TextView textView2 = (TextView) l3.d.a(view, i10);
            if (textView2 != null) {
                i10 = R.id.tv_status;
                TextView textView3 = (TextView) l3.d.a(view, i10);
                if (textView3 != null) {
                    i10 = R.id.tv_time;
                    TextView textView4 = (TextView) l3.d.a(view, i10);
                    if (textView4 != null) {
                        return new n((RelativeLayout) view, textView, textView2, textView3, textView4);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @n0
    public static n c(@n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, bb.c.l.f34130f5, new Class[]{LayoutInflater.class}, n.class);
        return patchProxyResultProxy.isSupported ? (n) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @n0
    public static n d(@n0 LayoutInflater layoutInflater, @p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, bb.c.l.f34153g5, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, n.class);
        if (patchProxyResultProxy.isSupported) {
            return (n) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.hbwallet_item_coupon_history, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @n0
    public RelativeLayout b() {
        return this.f35369a;
    }

    @Override // l3.c
    @n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.l.f34199i5, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
