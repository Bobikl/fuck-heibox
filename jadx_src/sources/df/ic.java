package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: GridViewItemUploadImgBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class ic implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f111752a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f111753b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f111754c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f111755d;

    private ic(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 ImageView imageView2, @androidx.annotation.n0 ImageView imageView3) {
        this.f111752a = relativeLayout;
        this.f111753b = imageView;
        this.f111754c = imageView2;
        this.f111755d = imageView3;
    }

    @androidx.annotation.n0
    public static ic a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 17624, new Class[]{View.class}, ic.class);
        if (patchProxyResultProxy.isSupported) {
            return (ic) patchProxyResultProxy.result;
        }
        int i10 = R.id.iv_del;
        ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_del);
        if (imageView != null) {
            i10 = R.id.iv_img;
            ImageView imageView2 = (ImageView) l3.d.a(view, R.id.iv_img);
            if (imageView2 != null) {
                i10 = R.id.iv_video;
                ImageView imageView3 = (ImageView) l3.d.a(view, R.id.iv_video);
                if (imageView3 != null) {
                    return new ic((RelativeLayout) view, imageView, imageView2, imageView3);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static ic c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 17622, new Class[]{LayoutInflater.class}, ic.class);
        return patchProxyResultProxy.isSupported ? (ic) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static ic d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 17623, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, ic.class);
        if (patchProxyResultProxy.isSupported) {
            return (ic) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.grid_view_item_upload_img, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f111752a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 17625, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
