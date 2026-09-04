package pd;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.n0;
import androidx.annotation.p0;
import com.max.hbstory.R;
import com.max.hbstory.widget.StoryVideoFrameLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: StoryVideoPageBinding.java */
/* JADX INFO: loaded from: classes13.dex */
public final class e implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @n0
    private final FrameLayout f138277a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @n0
    public final StoryVideoFrameLayout f138278b;

    private e(@n0 FrameLayout frameLayout, @n0 StoryVideoFrameLayout storyVideoFrameLayout) {
        this.f138277a = frameLayout;
        this.f138278b = storyVideoFrameLayout;
    }

    @n0
    public static e a(@n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, bb.c.k.f33690lf, new Class[]{View.class}, e.class);
        if (patchProxyResultProxy.isSupported) {
            return (e) patchProxyResultProxy.result;
        }
        int i10 = R.id.story_video_frameLayout;
        StoryVideoFrameLayout storyVideoFrameLayout = (StoryVideoFrameLayout) l3.d.a(view, i10);
        if (storyVideoFrameLayout != null) {
            return new e((FrameLayout) view, storyVideoFrameLayout);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @n0
    public static e c(@n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, bb.c.k.f33644jf, new Class[]{LayoutInflater.class}, e.class);
        return patchProxyResultProxy.isSupported ? (e) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @n0
    public static e d(@n0 LayoutInflater layoutInflater, @p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, bb.c.k.f33667kf, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, e.class);
        if (patchProxyResultProxy.isSupported) {
            return (e) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.story_video_page, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @n0
    public FrameLayout b() {
        return this.f138277a;
    }

    @Override // l3.c
    @n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.k.f33713mf, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
