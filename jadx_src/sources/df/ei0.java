package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.module.story.widget.ui.video.StoryVideoUIFrameLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ViewStoryUiWidgetBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class ei0 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final StoryVideoUIFrameLayout f110212a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final StoryVideoUIFrameLayout f110213b;

    private ei0(@androidx.annotation.n0 StoryVideoUIFrameLayout storyVideoUIFrameLayout, @androidx.annotation.n0 StoryVideoUIFrameLayout storyVideoUIFrameLayout2) {
        this.f110212a = storyVideoUIFrameLayout;
        this.f110213b = storyVideoUIFrameLayout2;
    }

    @androidx.annotation.n0
    public static ei0 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 21942, new Class[]{View.class}, ei0.class);
        if (patchProxyResultProxy.isSupported) {
            return (ei0) patchProxyResultProxy.result;
        }
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        StoryVideoUIFrameLayout storyVideoUIFrameLayout = (StoryVideoUIFrameLayout) view;
        return new ei0(storyVideoUIFrameLayout, storyVideoUIFrameLayout);
    }

    @androidx.annotation.n0
    public static ei0 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 21940, new Class[]{LayoutInflater.class}, ei0.class);
        return patchProxyResultProxy.isSupported ? (ei0) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static ei0 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 21941, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, ei0.class);
        if (patchProxyResultProxy.isSupported) {
            return (ei0) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.view_story_ui_widget, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public StoryVideoUIFrameLayout b() {
        return this.f110212a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 21943, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
