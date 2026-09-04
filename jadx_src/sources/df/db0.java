package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.max.hbcustomview.roundedview.HBRoundedCornerImageView;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.module.story.widget.ui.video.widget.StoryIndicatorLinearLayout;
import com.max.xiaoheihe.module.story.widget.ui.video.widget.StorySpeedWatchingWidget;
import com.max.xiaoheihe.module.story.widget.ui.video.widget.StoryTextContentWidget;
import com.max.xiaoheihe.module.story.widget.ui.video.widget.StoryUserSectionWidget;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: LayoutStoryPictureUiBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class db0 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final ConstraintLayout f109714a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final View f109715b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final StoryUserSectionWidget f109716c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final HBRoundedCornerImageView f109717d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final StoryIndicatorLinearLayout f109718e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final StorySpeedWatchingWidget f109719f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final StoryTextContentWidget f109720g;

    private db0(@androidx.annotation.n0 ConstraintLayout constraintLayout, @androidx.annotation.n0 View view, @androidx.annotation.n0 StoryUserSectionWidget storyUserSectionWidget, @androidx.annotation.n0 HBRoundedCornerImageView hBRoundedCornerImageView, @androidx.annotation.n0 StoryIndicatorLinearLayout storyIndicatorLinearLayout, @androidx.annotation.n0 StorySpeedWatchingWidget storySpeedWatchingWidget, @androidx.annotation.n0 StoryTextContentWidget storyTextContentWidget) {
        this.f109714a = constraintLayout;
        this.f109715b = view;
        this.f109716c = storyUserSectionWidget;
        this.f109717d = hBRoundedCornerImageView;
        this.f109718e = storyIndicatorLinearLayout;
        this.f109719f = storySpeedWatchingWidget;
        this.f109720g = storyTextContentWidget;
    }

    @androidx.annotation.n0
    public static db0 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 21225, new Class[]{View.class}, db0.class);
        if (patchProxyResultProxy.isSupported) {
            return (db0) patchProxyResultProxy.result;
        }
        int i10 = R.id.bottom_background;
        View viewA = l3.d.a(view, R.id.bottom_background);
        if (viewA != null) {
            i10 = R.id.story_avatar_image_view;
            StoryUserSectionWidget storyUserSectionWidget = (StoryUserSectionWidget) l3.d.a(view, R.id.story_avatar_image_view);
            if (storyUserSectionWidget != null) {
                i10 = R.id.story_full_screen_bg;
                HBRoundedCornerImageView hBRoundedCornerImageView = (HBRoundedCornerImageView) l3.d.a(view, R.id.story_full_screen_bg);
                if (hBRoundedCornerImageView != null) {
                    i10 = R.id.story_picture_indicator;
                    StoryIndicatorLinearLayout storyIndicatorLinearLayout = (StoryIndicatorLinearLayout) l3.d.a(view, R.id.story_picture_indicator);
                    if (storyIndicatorLinearLayout != null) {
                        i10 = R.id.story_speed_watching;
                        StorySpeedWatchingWidget storySpeedWatchingWidget = (StorySpeedWatchingWidget) l3.d.a(view, R.id.story_speed_watching);
                        if (storySpeedWatchingWidget != null) {
                            i10 = R.id.v_text_content;
                            StoryTextContentWidget storyTextContentWidget = (StoryTextContentWidget) l3.d.a(view, R.id.v_text_content);
                            if (storyTextContentWidget != null) {
                                return new db0((ConstraintLayout) view, viewA, storyUserSectionWidget, hBRoundedCornerImageView, storyIndicatorLinearLayout, storySpeedWatchingWidget, storyTextContentWidget);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static db0 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 21223, new Class[]{LayoutInflater.class}, db0.class);
        return patchProxyResultProxy.isSupported ? (db0) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static db0 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 21224, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, db0.class);
        if (patchProxyResultProxy.isSupported) {
            return (db0) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.layout_story_picture_ui, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public ConstraintLayout b() {
        return this.f109714a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 21226, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
