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

/* JADX INFO: compiled from: ItemVideoBigScreenBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class f10 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f110371a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f110372b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f110373c;

    private f10(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 ImageView imageView2) {
        this.f110371a = relativeLayout;
        this.f110372b = imageView;
        this.f110373c = imageView2;
    }

    @androidx.annotation.n0
    public static f10 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 20200, new Class[]{View.class}, f10.class);
        if (patchProxyResultProxy.isSupported) {
            return (f10) patchProxyResultProxy.result;
        }
        int i10 = R.id.iv_video_play;
        ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_video_play);
        if (imageView != null) {
            i10 = R.id.iv_video_thumb;
            ImageView imageView2 = (ImageView) l3.d.a(view, R.id.iv_video_thumb);
            if (imageView2 != null) {
                return new f10((RelativeLayout) view, imageView, imageView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static f10 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 20198, new Class[]{LayoutInflater.class}, f10.class);
        return patchProxyResultProxy.isSupported ? (f10) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static f10 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 20199, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, f10.class);
        if (patchProxyResultProxy.isSupported) {
            return (f10) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_video_big_screen, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f110371a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 20201, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
