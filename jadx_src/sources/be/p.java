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

/* JADX INFO: compiled from: HbwalletItemHbWalletBinding.java */
/* JADX INFO: loaded from: classes2.dex */
public final class p implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @n0
    private final RelativeLayout f35384a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @n0
    public final ImageView f35385b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @n0
    public final TextView f35386c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @n0
    public final TextView f35387d;

    private p(@n0 RelativeLayout relativeLayout, @n0 ImageView imageView, @n0 TextView textView, @n0 TextView textView2) {
        this.f35384a = relativeLayout;
        this.f35385b = imageView;
        this.f35386c = textView;
        this.f35387d = textView2;
    }

    @n0
    public static p a(@n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, bb.c.l.f34359p5, new Class[]{View.class}, p.class);
        if (patchProxyResultProxy.isSupported) {
            return (p) patchProxyResultProxy.result;
        }
        int i10 = R.id.iv_tag;
        ImageView imageView = (ImageView) l3.d.a(view, i10);
        if (imageView != null) {
            i10 = R.id.tv_title;
            TextView textView = (TextView) l3.d.a(view, i10);
            if (textView != null) {
                i10 = R.id.tv_value;
                TextView textView2 = (TextView) l3.d.a(view, i10);
                if (textView2 != null) {
                    return new p((RelativeLayout) view, imageView, textView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @n0
    public static p c(@n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, bb.c.l.f34313n5, new Class[]{LayoutInflater.class}, p.class);
        return patchProxyResultProxy.isSupported ? (p) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @n0
    public static p d(@n0 LayoutInflater layoutInflater, @p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, bb.c.l.f34336o5, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, p.class);
        if (patchProxyResultProxy.isSupported) {
            return (p) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.hbwallet_item_hb_wallet, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @n0
    public RelativeLayout b() {
        return this.f35384a;
    }

    @Override // l3.c
    @n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.l.f34382q5, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
