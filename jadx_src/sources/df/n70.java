package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: LayoutLimmittedVistorBottomBtnBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class n70 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final LinearLayout f113723a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f113724b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f113725c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f113726d;

    private n70(@androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 LinearLayout linearLayout2) {
        this.f113723a = linearLayout;
        this.f113724b = imageView;
        this.f113725c = textView;
        this.f113726d = linearLayout2;
    }

    @androidx.annotation.n0
    public static n70 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 20852, new Class[]{View.class}, n70.class);
        if (patchProxyResultProxy.isSupported) {
            return (n70) patchProxyResultProxy.result;
        }
        int i10 = R.id.iv_bottom_logo;
        ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_bottom_logo);
        if (imageView != null) {
            i10 = R.id.tv_bottom_desc;
            TextView textView = (TextView) l3.d.a(view, R.id.tv_bottom_desc);
            if (textView != null) {
                LinearLayout linearLayout = (LinearLayout) view;
                return new n70(linearLayout, imageView, textView, linearLayout);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static n70 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 20850, new Class[]{LayoutInflater.class}, n70.class);
        return patchProxyResultProxy.isSupported ? (n70) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static n70 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 20851, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, n70.class);
        if (patchProxyResultProxy.isSupported) {
            return (n70) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.layout_limmitted_vistor_bottom_btn, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public LinearLayout b() {
        return this.f113723a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 20853, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
