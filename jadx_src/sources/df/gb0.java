package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.module.story.widget.ui.video.widget.StoryFullScreenWidget;
import com.max.xiaoheihe.module.story.widget.ui.video.widget.StorySpeedWatchingWidget;
import com.max.xiaoheihe.module.story.widget.ui.video.widget.StoryTextContentWidget;
import com.max.xiaoheihe.module.story.widget.ui.video.widget.StoryUserSectionWidget;
import com.max.xiaoheihe.module.story.widget.ui.video.widget.StoryVideoSeekbarWidget;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: LayoutStoryVideoUiBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class gb0 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final ConstraintLayout f110925a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f110926b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final StoryUserSectionWidget f110927c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final StoryFullScreenWidget f110928d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final StorySpeedWatchingWidget f110929e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final StoryTextContentWidget f110930f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final StoryVideoSeekbarWidget f110931g;

    private gb0(@androidx.annotation.n0 ConstraintLayout constraintLayout, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 StoryUserSectionWidget storyUserSectionWidget, @androidx.annotation.n0 StoryFullScreenWidget storyFullScreenWidget, @androidx.annotation.n0 StorySpeedWatchingWidget storySpeedWatchingWidget, @androidx.annotation.n0 StoryTextContentWidget storyTextContentWidget, @androidx.annotation.n0 StoryVideoSeekbarWidget storyVideoSeekbarWidget) {
        this.f110925a = constraintLayout;
        this.f110926b = textView;
        this.f110927c = storyUserSectionWidget;
        this.f110928d = storyFullScreenWidget;
        this.f110929e = storySpeedWatchingWidget;
        this.f110930f = storyTextContentWidget;
        this.f110931g = storyVideoSeekbarWidget;
    }

    @androidx.annotation.n0
    public static gb0 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 21233, new Class[]{View.class}, gb0.class);
        if (patchProxyResultProxy.isSupported) {
            return (gb0) patchProxyResultProxy.result;
        }
        int i10 = R.id.bottom_background;
        TextView textView = (TextView) l3.d.a(view, R.id.bottom_background);
        if (textView != null) {
            i10 = R.id.story_avatar_image_view;
            StoryUserSectionWidget storyUserSectionWidget = (StoryUserSectionWidget) l3.d.a(view, R.id.story_avatar_image_view);
            if (storyUserSectionWidget != null) {
                i10 = R.id.story_full_screen_bg;
                StoryFullScreenWidget storyFullScreenWidget = (StoryFullScreenWidget) l3.d.a(view, R.id.story_full_screen_bg);
                if (storyFullScreenWidget != null) {
                    i10 = R.id.story_speed_watching;
                    StorySpeedWatchingWidget storySpeedWatchingWidget = (StorySpeedWatchingWidget) l3.d.a(view, R.id.story_speed_watching);
                    if (storySpeedWatchingWidget != null) {
                        i10 = R.id.v_text_content;
                        StoryTextContentWidget storyTextContentWidget = (StoryTextContentWidget) l3.d.a(view, R.id.v_text_content);
                        if (storyTextContentWidget != null) {
                            i10 = R.id.v_video_seekbar;
                            StoryVideoSeekbarWidget storyVideoSeekbarWidget = (StoryVideoSeekbarWidget) l3.d.a(view, R.id.v_video_seekbar);
                            if (storyVideoSeekbarWidget != null) {
                                return new gb0((ConstraintLayout) view, textView, storyUserSectionWidget, storyFullScreenWidget, storySpeedWatchingWidget, storyTextContentWidget, storyVideoSeekbarWidget);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static gb0 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 21231, new Class[]{LayoutInflater.class}, gb0.class);
        return patchProxyResultProxy.isSupported ? (gb0) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static gb0 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 21232, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, gb0.class);
        if (patchProxyResultProxy.isSupported) {
            return (gb0) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.layout_story_video_ui, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public ConstraintLayout b() {
        return this.f110925a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 21234, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
