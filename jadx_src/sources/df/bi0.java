package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.module.story.widget.anim.StoryLikeFrameLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ViewStoryLikeAnimBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class bi0 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final StoryLikeFrameLayout f108973a;

    private bi0(@androidx.annotation.n0 StoryLikeFrameLayout storyLikeFrameLayout) {
        this.f108973a = storyLikeFrameLayout;
    }

    @androidx.annotation.n0
    public static bi0 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 21930, new Class[]{View.class}, bi0.class);
        if (patchProxyResultProxy.isSupported) {
            return (bi0) patchProxyResultProxy.result;
        }
        if (view != null) {
            return new bi0((StoryLikeFrameLayout) view);
        }
        throw new NullPointerException("rootView");
    }

    @androidx.annotation.n0
    public static bi0 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 21928, new Class[]{LayoutInflater.class}, bi0.class);
        return patchProxyResultProxy.isSupported ? (bi0) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static bi0 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 21929, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, bi0.class);
        if (patchProxyResultProxy.isSupported) {
            return (bi0) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.view_story_like_anim, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public StoryLikeFrameLayout b() {
        return this.f108973a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 21931, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
