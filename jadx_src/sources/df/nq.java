package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemMenuBatteryChargeBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class nq implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f113935a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f113936b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f113937c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f113938d;

    private nq(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2) {
        this.f113935a = relativeLayout;
        this.f113936b = imageView;
        this.f113937c = textView;
        this.f113938d = textView2;
    }

    @androidx.annotation.n0
    public static nq a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 19096, new Class[]{View.class}, nq.class);
        if (patchProxyResultProxy.isSupported) {
            return (nq) patchProxyResultProxy.result;
        }
        int i10 = R.id.iv_img;
        ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_img);
        if (imageView != null) {
            i10 = R.id.tv_heybox_battery;
            TextView textView = (TextView) l3.d.a(view, R.id.tv_heybox_battery);
            if (textView != null) {
                i10 = R.id.tv_heybox_battery_cnt;
                TextView textView2 = (TextView) l3.d.a(view, R.id.tv_heybox_battery_cnt);
                if (textView2 != null) {
                    return new nq((RelativeLayout) view, imageView, textView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static nq c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 19094, new Class[]{LayoutInflater.class}, nq.class);
        return patchProxyResultProxy.isSupported ? (nq) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static nq d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 19095, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, nq.class);
        if (patchProxyResultProxy.isSupported) {
            return (nq) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_menu_battery_charge, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f113935a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 19097, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
