package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: MallComponentOrderAddAddressBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class lc0 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final ConstraintLayout f113000a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f113001b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f113002c;

    private lc0(@androidx.annotation.n0 ConstraintLayout constraintLayout, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 TextView textView) {
        this.f113000a = constraintLayout;
        this.f113001b = imageView;
        this.f113002c = textView;
    }

    @androidx.annotation.n0
    public static lc0 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 21357, new Class[]{View.class}, lc0.class);
        if (patchProxyResultProxy.isSupported) {
            return (lc0) patchProxyResultProxy.result;
        }
        int i10 = R.id.iv_icon;
        ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_icon);
        if (imageView != null) {
            i10 = R.id.tv_title;
            TextView textView = (TextView) l3.d.a(view, R.id.tv_title);
            if (textView != null) {
                return new lc0((ConstraintLayout) view, imageView, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static lc0 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 21355, new Class[]{LayoutInflater.class}, lc0.class);
        return patchProxyResultProxy.isSupported ? (lc0) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static lc0 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 21356, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, lc0.class);
        if (patchProxyResultProxy.isSupported) {
            return (lc0) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.mall_component_order_add_address, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public ConstraintLayout b() {
        return this.f113000a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 21358, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
