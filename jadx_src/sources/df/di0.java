package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.module.story.widget.ui.root.StoryTitleBarTopRootWidget;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ViewStoryTitleBarWidgetBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class di0 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final StoryTitleBarTopRootWidget f109813a;

    private di0(@androidx.annotation.n0 StoryTitleBarTopRootWidget storyTitleBarTopRootWidget) {
        this.f109813a = storyTitleBarTopRootWidget;
    }

    @androidx.annotation.n0
    public static di0 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 21938, new Class[]{View.class}, di0.class);
        if (patchProxyResultProxy.isSupported) {
            return (di0) patchProxyResultProxy.result;
        }
        if (view != null) {
            return new di0((StoryTitleBarTopRootWidget) view);
        }
        throw new NullPointerException("rootView");
    }

    @androidx.annotation.n0
    public static di0 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 21936, new Class[]{LayoutInflater.class}, di0.class);
        return patchProxyResultProxy.isSupported ? (di0) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static di0 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 21937, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, di0.class);
        if (patchProxyResultProxy.isSupported) {
            return (di0) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.view_story_title_bar_widget, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public StoryTitleBarTopRootWidget b() {
        return this.f109813a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 21939, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
