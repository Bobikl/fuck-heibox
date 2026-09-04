package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.max.hbcustomview.video.VideoViewX;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ActivityVideoBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class d3 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f109596a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final VideoViewX f109597b;

    private d3(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 VideoViewX videoViewX) {
        this.f109596a = relativeLayout;
        this.f109597b = videoViewX;
    }

    @androidx.annotation.n0
    public static d3 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 16668, new Class[]{View.class}, d3.class);
        if (patchProxyResultProxy.isSupported) {
            return (d3) patchProxyResultProxy.result;
        }
        VideoViewX videoViewX = (VideoViewX) l3.d.a(view, R.id.video_view);
        if (videoViewX != null) {
            return new d3((RelativeLayout) view, videoViewX);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.video_view)));
    }

    @androidx.annotation.n0
    public static d3 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 16666, new Class[]{LayoutInflater.class}, d3.class);
        return patchProxyResultProxy.isSupported ? (d3) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static d3 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 16667, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, d3.class);
        if (patchProxyResultProxy.isSupported) {
            return (d3) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.activity_video, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f109596a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 16669, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
