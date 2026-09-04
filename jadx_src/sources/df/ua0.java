package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import com.max.hbcommon.component.QRCodeShareView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: LayoutShareWebBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class ua0 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final ScrollView f116353a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f116354b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final QRCodeShareView f116355c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f116356d;

    private ua0(@androidx.annotation.n0 ScrollView scrollView, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 QRCodeShareView qRCodeShareView, @androidx.annotation.n0 LinearLayout linearLayout) {
        this.f116353a = scrollView;
        this.f116354b = imageView;
        this.f116355c = qRCodeShareView;
        this.f116356d = linearLayout;
    }

    @androidx.annotation.n0
    public static ua0 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 21190, new Class[]{View.class}, ua0.class);
        if (patchProxyResultProxy.isSupported) {
            return (ua0) patchProxyResultProxy.result;
        }
        int i10 = R.id.iv_share_image;
        ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_share_image);
        if (imageView != null) {
            i10 = R.id.v_qr_code;
            QRCodeShareView qRCodeShareView = (QRCodeShareView) l3.d.a(view, R.id.v_qr_code);
            if (qRCodeShareView != null) {
                i10 = R.id.vg_content;
                LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.vg_content);
                if (linearLayout != null) {
                    return new ua0((ScrollView) view, imageView, qRCodeShareView, linearLayout);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static ua0 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 21188, new Class[]{LayoutInflater.class}, ua0.class);
        return patchProxyResultProxy.isSupported ? (ua0) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static ua0 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 21189, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, ua0.class);
        if (patchProxyResultProxy.isSupported) {
            return (ua0) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.layout_share_web, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public ScrollView b() {
        return this.f116353a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 21191, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
