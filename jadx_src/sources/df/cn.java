package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.max.hbcustomview.QMUIRadiusImageView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemGameScreenshotsBannerBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class cn implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f109462a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f109463b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final QMUIRadiusImageView f109464c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final FrameLayout f109465d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f109466e;

    private cn(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 QMUIRadiusImageView qMUIRadiusImageView, @androidx.annotation.n0 FrameLayout frameLayout, @androidx.annotation.n0 RelativeLayout relativeLayout2) {
        this.f109462a = relativeLayout;
        this.f109463b = imageView;
        this.f109464c = qMUIRadiusImageView;
        this.f109465d = frameLayout;
        this.f109466e = relativeLayout2;
    }

    @androidx.annotation.n0
    public static cn a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 18740, new Class[]{View.class}, cn.class);
        if (patchProxyResultProxy.isSupported) {
            return (cn) patchProxyResultProxy.result;
        }
        int i10 = R.id.iv_video_play;
        ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_video_play);
        if (imageView != null) {
            i10 = R.id.iv_video_thumb;
            QMUIRadiusImageView qMUIRadiusImageView = (QMUIRadiusImageView) l3.d.a(view, R.id.iv_video_thumb);
            if (qMUIRadiusImageView != null) {
                i10 = R.id.vg_frame;
                FrameLayout frameLayout = (FrameLayout) l3.d.a(view, R.id.vg_frame);
                if (frameLayout != null) {
                    i10 = R.id.vg_video_play;
                    RelativeLayout relativeLayout = (RelativeLayout) l3.d.a(view, R.id.vg_video_play);
                    if (relativeLayout != null) {
                        return new cn((RelativeLayout) view, imageView, qMUIRadiusImageView, frameLayout, relativeLayout);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static cn c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 18738, new Class[]{LayoutInflater.class}, cn.class);
        return patchProxyResultProxy.isSupported ? (cn) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static cn d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 18739, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, cn.class);
        if (patchProxyResultProxy.isSupported) {
            return (cn) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_game_screenshots_banner, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f109462a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 18741, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
