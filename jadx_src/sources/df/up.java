package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemMallCartGroupBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class up implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final ConstraintLayout f116498a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f116499b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f116500c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final FrameLayout f116501d;

    private up(@androidx.annotation.n0 ConstraintLayout constraintLayout, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 FrameLayout frameLayout) {
        this.f116498a = constraintLayout;
        this.f116499b = imageView;
        this.f116500c = textView;
        this.f116501d = frameLayout;
    }

    @androidx.annotation.n0
    public static up a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 19020, new Class[]{View.class}, up.class);
        if (patchProxyResultProxy.isSupported) {
            return (up) patchProxyResultProxy.result;
        }
        int i10 = R.id.iv_checkbox;
        ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_checkbox);
        if (imageView != null) {
            i10 = R.id.tv_group_name;
            TextView textView = (TextView) l3.d.a(view, R.id.tv_group_name);
            if (textView != null) {
                i10 = R.id.vg_check;
                FrameLayout frameLayout = (FrameLayout) l3.d.a(view, R.id.vg_check);
                if (frameLayout != null) {
                    return new up((ConstraintLayout) view, imageView, textView, frameLayout);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static up c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 19018, new Class[]{LayoutInflater.class}, up.class);
        return patchProxyResultProxy.isSupported ? (up) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static up d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 19019, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, up.class);
        if (patchProxyResultProxy.isSupported) {
            return (up) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_mall_cart_group, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public ConstraintLayout b() {
        return this.f116498a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 19021, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
