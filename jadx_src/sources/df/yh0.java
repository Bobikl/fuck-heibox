package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.module.story.widget.control.StoryControlWidget;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ViewStoryControlWidgetBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class yh0 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final StoryControlWidget f117976a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final StoryControlWidget f117977b;

    private yh0(@androidx.annotation.n0 StoryControlWidget storyControlWidget, @androidx.annotation.n0 StoryControlWidget storyControlWidget2) {
        this.f117976a = storyControlWidget;
        this.f117977b = storyControlWidget2;
    }

    @androidx.annotation.n0
    public static yh0 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 21920, new Class[]{View.class}, yh0.class);
        if (patchProxyResultProxy.isSupported) {
            return (yh0) patchProxyResultProxy.result;
        }
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        StoryControlWidget storyControlWidget = (StoryControlWidget) view;
        return new yh0(storyControlWidget, storyControlWidget);
    }

    @androidx.annotation.n0
    public static yh0 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 21918, new Class[]{LayoutInflater.class}, yh0.class);
        return patchProxyResultProxy.isSupported ? (yh0) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static yh0 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 21919, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, yh0.class);
        if (patchProxyResultProxy.isSupported) {
            return (yh0) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.view_story_control_widget, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public StoryControlWidget b() {
        return this.f117976a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 21921, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
