package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.module.bbs.component.BBSLinkImageContentViewV2;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemNewsLinkV23ContentBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class lr implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final FrameLayout f113129a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f113130b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f113131c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final BBSLinkImageContentViewV2 f113132d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f113133e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f113134f;

    private lr(@androidx.annotation.n0 FrameLayout frameLayout, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 ImageView imageView2, @androidx.annotation.n0 BBSLinkImageContentViewV2 bBSLinkImageContentViewV2, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 RelativeLayout relativeLayout) {
        this.f113129a = frameLayout;
        this.f113130b = imageView;
        this.f113131c = imageView2;
        this.f113132d = bBSLinkImageContentViewV2;
        this.f113133e = textView;
        this.f113134f = relativeLayout;
    }

    @androidx.annotation.n0
    public static lr a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 19192, new Class[]{View.class}, lr.class);
        if (patchProxyResultProxy.isSupported) {
            return (lr) patchProxyResultProxy.result;
        }
        int i10 = R.id.iv_thumb;
        ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_thumb);
        if (imageView != null) {
            i10 = R.id.iv_video_play;
            ImageView imageView2 = (ImageView) l3.d.a(view, R.id.iv_video_play);
            if (imageView2 != null) {
                i10 = R.id.ll_img_v2;
                BBSLinkImageContentViewV2 bBSLinkImageContentViewV2 = (BBSLinkImageContentViewV2) l3.d.a(view, R.id.ll_img_v2);
                if (bBSLinkImageContentViewV2 != null) {
                    i10 = R.id.tv_video_duration;
                    TextView textView = (TextView) l3.d.a(view, R.id.tv_video_duration);
                    if (textView != null) {
                        i10 = R.id.vg_thumb;
                        RelativeLayout relativeLayout = (RelativeLayout) l3.d.a(view, R.id.vg_thumb);
                        if (relativeLayout != null) {
                            return new lr((FrameLayout) view, imageView, imageView2, bBSLinkImageContentViewV2, textView, relativeLayout);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static lr c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 19190, new Class[]{LayoutInflater.class}, lr.class);
        return patchProxyResultProxy.isSupported ? (lr) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static lr d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 19191, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, lr.class);
        if (patchProxyResultProxy.isSupported) {
            return (lr) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_news_link_v2_3_content, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public FrameLayout b() {
        return this.f113129a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 19193, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
