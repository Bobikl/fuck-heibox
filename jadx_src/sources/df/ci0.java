package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.module.story.widget.ui.picture.StoryPictureUIFrameLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ViewStoryPictureUiWidgetBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class ci0 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final StoryPictureUIFrameLayout f109440a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final StoryPictureUIFrameLayout f109441b;

    private ci0(@androidx.annotation.n0 StoryPictureUIFrameLayout storyPictureUIFrameLayout, @androidx.annotation.n0 StoryPictureUIFrameLayout storyPictureUIFrameLayout2) {
        this.f109440a = storyPictureUIFrameLayout;
        this.f109441b = storyPictureUIFrameLayout2;
    }

    @androidx.annotation.n0
    public static ci0 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 21934, new Class[]{View.class}, ci0.class);
        if (patchProxyResultProxy.isSupported) {
            return (ci0) patchProxyResultProxy.result;
        }
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        StoryPictureUIFrameLayout storyPictureUIFrameLayout = (StoryPictureUIFrameLayout) view;
        return new ci0(storyPictureUIFrameLayout, storyPictureUIFrameLayout);
    }

    @androidx.annotation.n0
    public static ci0 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 21932, new Class[]{LayoutInflater.class}, ci0.class);
        return patchProxyResultProxy.isSupported ? (ci0) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static ci0 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 21933, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, ci0.class);
        if (patchProxyResultProxy.isSupported) {
            return (ci0) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.view_story_picture_ui_widget, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public StoryPictureUIFrameLayout b() {
        return this.f109440a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 21935, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
