package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: DialogAvatarTypeBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class m4 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final LinearLayout f113282a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f113283b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f113284c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f113285d;

    private m4(@androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 LinearLayout linearLayout2, @androidx.annotation.n0 LinearLayout linearLayout3) {
        this.f113282a = linearLayout;
        this.f113283b = imageView;
        this.f113284c = linearLayout2;
        this.f113285d = linearLayout3;
    }

    @androidx.annotation.n0
    public static m4 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 16808, new Class[]{View.class}, m4.class);
        if (patchProxyResultProxy.isSupported) {
            return (m4) patchProxyResultProxy.result;
        }
        int i10 = R.id.iv_icon_weixin;
        ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_icon_weixin);
        if (imageView != null) {
            i10 = R.id.vg_pick;
            LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.vg_pick);
            if (linearLayout != null) {
                i10 = R.id.vg_upload;
                LinearLayout linearLayout2 = (LinearLayout) l3.d.a(view, R.id.vg_upload);
                if (linearLayout2 != null) {
                    return new m4((LinearLayout) view, imageView, linearLayout, linearLayout2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static m4 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 16806, new Class[]{LayoutInflater.class}, m4.class);
        return patchProxyResultProxy.isSupported ? (m4) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static m4 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 16807, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, m4.class);
        if (patchProxyResultProxy.isSupported) {
            return (m4) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.dialog_avatar_type, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public LinearLayout b() {
        return this.f113282a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 16809, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
