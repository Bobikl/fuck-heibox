package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.module.story.widget.anim.StoryAnimWidget;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ViewStoryAnimWidgetBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class xh0 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final StoryAnimWidget f117575a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final StoryAnimWidget f117576b;

    private xh0(@androidx.annotation.n0 StoryAnimWidget storyAnimWidget, @androidx.annotation.n0 StoryAnimWidget storyAnimWidget2) {
        this.f117575a = storyAnimWidget;
        this.f117576b = storyAnimWidget2;
    }

    @androidx.annotation.n0
    public static xh0 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 21916, new Class[]{View.class}, xh0.class);
        if (patchProxyResultProxy.isSupported) {
            return (xh0) patchProxyResultProxy.result;
        }
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        StoryAnimWidget storyAnimWidget = (StoryAnimWidget) view;
        return new xh0(storyAnimWidget, storyAnimWidget);
    }

    @androidx.annotation.n0
    public static xh0 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 21914, new Class[]{LayoutInflater.class}, xh0.class);
        return patchProxyResultProxy.isSupported ? (xh0) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static xh0 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 21915, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, xh0.class);
        if (patchProxyResultProxy.isSupported) {
            return (xh0) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.view_story_anim_widget, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public StoryAnimWidget b() {
        return this.f117575a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 21917, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
