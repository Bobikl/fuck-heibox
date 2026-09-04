package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.module.story.widget.ui.video.widget.StoryFollowWidget;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ViewStoryFollowWidgetBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class ai0 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final StoryFollowWidget f108577a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final StoryFollowWidget f108578b;

    private ai0(@androidx.annotation.n0 StoryFollowWidget storyFollowWidget, @androidx.annotation.n0 StoryFollowWidget storyFollowWidget2) {
        this.f108577a = storyFollowWidget;
        this.f108578b = storyFollowWidget2;
    }

    @androidx.annotation.n0
    public static ai0 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 21926, new Class[]{View.class}, ai0.class);
        if (patchProxyResultProxy.isSupported) {
            return (ai0) patchProxyResultProxy.result;
        }
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        StoryFollowWidget storyFollowWidget = (StoryFollowWidget) view;
        return new ai0(storyFollowWidget, storyFollowWidget);
    }

    @androidx.annotation.n0
    public static ai0 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 21924, new Class[]{LayoutInflater.class}, ai0.class);
        return patchProxyResultProxy.isSupported ? (ai0) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static ai0 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 21925, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, ai0.class);
        if (patchProxyResultProxy.isSupported) {
            return (ai0) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.view_story_follow_widget, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public StoryFollowWidget b() {
        return this.f108577a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 21927, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
