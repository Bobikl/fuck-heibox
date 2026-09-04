package be;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.n0;
import androidx.annotation.p0;
import com.max.hbwallet.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: HbwalletItemPriceInHcashBinding.java */
/* JADX INFO: loaded from: classes2.dex */
public final class q implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @n0
    private final RelativeLayout f35388a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @n0
    public final ImageView f35389b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @n0
    public final ImageView f35390c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @n0
    public final TextView f35391d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @n0
    public final RelativeLayout f35392e;

    private q(@n0 RelativeLayout relativeLayout, @n0 ImageView imageView, @n0 ImageView imageView2, @n0 TextView textView, @n0 RelativeLayout relativeLayout2) {
        this.f35388a = relativeLayout;
        this.f35389b = imageView;
        this.f35390c = imageView2;
        this.f35391d = textView;
        this.f35392e = relativeLayout2;
    }

    @n0
    public static q a(@n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, bb.c.l.f34448t5, new Class[]{View.class}, q.class);
        if (patchProxyResultProxy.isSupported) {
            return (q) patchProxyResultProxy.result;
        }
        int i10 = R.id.iv_checked;
        ImageView imageView = (ImageView) l3.d.a(view, i10);
        if (imageView != null) {
            i10 = R.id.iv_tag;
            ImageView imageView2 = (ImageView) l3.d.a(view, i10);
            if (imageView2 != null) {
                i10 = R.id.tv_title;
                TextView textView = (TextView) l3.d.a(view, i10);
                if (textView != null) {
                    RelativeLayout relativeLayout = (RelativeLayout) view;
                    return new q(relativeLayout, imageView, imageView2, textView, relativeLayout);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @n0
    public static q c(@n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, bb.c.l.f34404r5, new Class[]{LayoutInflater.class}, q.class);
        return patchProxyResultProxy.isSupported ? (q) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @n0
    public static q d(@n0 LayoutInflater layoutInflater, @p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, bb.c.l.f34426s5, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, q.class);
        if (patchProxyResultProxy.isSupported) {
            return (q) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.hbwallet_item_price_in_hcash, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @n0
    public RelativeLayout b() {
        return this.f35388a;
    }

    @Override // l3.c
    @n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.l.f34470u5, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
