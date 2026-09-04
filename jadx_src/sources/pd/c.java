package pd;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.n0;
import androidx.annotation.p0;
import com.max.hbstory.R;
import com.max.hbstory.widget.StoryGestureFrameLayout;
import com.max.hbstory.widget.StoryViewPager2Container;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: StoryPicturePageBinding.java */
/* JADX INFO: loaded from: classes13.dex */
public final class c implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @n0
    private final FrameLayout f138269a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @n0
    public final StoryGestureFrameLayout f138270b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @n0
    public final FrameLayout f138271c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @n0
    public final StoryViewPager2Container f138272d;

    private c(@n0 FrameLayout frameLayout, @n0 StoryGestureFrameLayout storyGestureFrameLayout, @n0 FrameLayout frameLayout2, @n0 StoryViewPager2Container storyViewPager2Container) {
        this.f138269a = frameLayout;
        this.f138270b = storyGestureFrameLayout;
        this.f138271c = frameLayout2;
        this.f138272d = storyViewPager2Container;
    }

    @n0
    public static c a(@n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, bb.c.k.f33506df, new Class[]{View.class}, c.class);
        if (patchProxyResultProxy.isSupported) {
            return (c) patchProxyResultProxy.result;
        }
        int i10 = R.id.story_gesture_layout;
        StoryGestureFrameLayout storyGestureFrameLayout = (StoryGestureFrameLayout) l3.d.a(view, i10);
        if (storyGestureFrameLayout != null) {
            i10 = R.id.story_picture_frame_layout;
            FrameLayout frameLayout = (FrameLayout) l3.d.a(view, i10);
            if (frameLayout != null) {
                i10 = R.id.vp2_container;
                StoryViewPager2Container storyViewPager2Container = (StoryViewPager2Container) l3.d.a(view, i10);
                if (storyViewPager2Container != null) {
                    return new c((FrameLayout) view, storyGestureFrameLayout, frameLayout, storyViewPager2Container);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @n0
    public static c c(@n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, bb.c.k.f33459bf, new Class[]{LayoutInflater.class}, c.class);
        return patchProxyResultProxy.isSupported ? (c) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @n0
    public static c d(@n0 LayoutInflater layoutInflater, @p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, bb.c.k.f33482cf, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, c.class);
        if (patchProxyResultProxy.isSupported) {
            return (c) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.story_picture_page, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @n0
    public FrameLayout b() {
        return this.f138269a;
    }

    @Override // l3.c
    @n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.k.f33529ef, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
