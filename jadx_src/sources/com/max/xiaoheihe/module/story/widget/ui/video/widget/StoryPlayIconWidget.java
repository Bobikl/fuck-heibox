package com.max.xiaoheihe.module.story.widget.ui.video.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.compose.runtime.internal.o;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.j0;
import com.max.hbstory.bean.StoryItemsObj;
import com.max.hbstory.bean.StoryLinkCardInfoObj;
import com.max.hbstory.bean.StoryVideoInfoObj;
import com.max.hbstory.d;
import com.max.hbstory.g;
import com.max.hbstory.utils.StoryUtilsKt;
import com.max.video.player.info.PlaybackState;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.e;
import kotlin.b2;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;
import kotlin.jvm.internal.u;
import l3.c;
import xh.i;

/* JADX INFO: compiled from: StoryPlayIconWidget.kt */
/* JADX INFO: loaded from: classes12.dex */
@t0({"SMAP\nStoryPlayIconWidget.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StoryPlayIconWidget.kt\ncom/max/xiaoheihe/module/story/widget/ui/video/widget/StoryPlayIconWidget\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,95:1\n262#2,2:96\n*S KotlinDebug\n*F\n+ 1 StoryPlayIconWidget.kt\ncom/max/xiaoheihe/module/story/widget/ui/video/widget/StoryPlayIconWidget\n*L\n38#1:96,2\n*E\n"})
@o(parameters = 0)
public final class StoryPlayIconWidget extends AppCompatImageView implements com.max.hbstory.viewpage2.video.a {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f92320f = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @e
    private final c f92321b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @e
    private d f92322c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f92323d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f92324e;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @i
    public StoryPlayIconWidget(@dl.d Context context) {
        this(context, null, 0, 6, null);
        f0.p(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @i
    public StoryPlayIconWidget(@dl.d Context context, @e AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        f0.p(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @i
    public StoryPlayIconWidget(@dl.d Context context, @e AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        f0.p(context, "context");
        this.f92323d = -1;
    }

    public /* synthetic */ StoryPlayIconWidget(Context context, AttributeSet attributeSet, int i10, int i11, u uVar) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    private final int d(int i10, int i11) {
        Object[] objArr = {new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 44218, new Class[]{cls, cls}, cls);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        f0.o(displayMetrics, "resources.displayMetrics");
        int i12 = displayMetrics.widthPixels;
        int i13 = displayMetrics.heightPixels;
        int i14 = (int) (i12 / (i10 / i11));
        int dimension = (int) getContext().getResources().getDimension(R.dimen.bottom_bar_height);
        int dimension2 = (int) getContext().getResources().getDimension(R.dimen.play_icon_height);
        return i10 > i11 ? ((((i13 - i14) - dimension) - ((int) getContext().getResources().getDimension(R.dimen.fullscreen_icon_height_with_margin))) / 2) + ((i14 - dimension2) / 2) : ((i13 - dimension) - dimension2) / 2;
    }

    private final void g() {
        d mStoryContext;
        Fragment fragmentB;
        d mStoryContext2;
        g gVarD;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44217, new Class[0], Void.TYPE).isSupported || (mStoryContext = getMStoryContext()) == null || (fragmentB = mStoryContext.b()) == null || (mStoryContext2 = getMStoryContext()) == null || (gVarD = mStoryContext2.d()) == null) {
            return;
        }
        gVarD.x().k(fragmentB, new j0<PlaybackState>() { // from class: com.max.xiaoheihe.module.story.widget.ui.video.widget.StoryPlayIconWidget$observePlayState$1$1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // androidx.lifecycle.j0
            public /* bridge */ /* synthetic */ void a(PlaybackState playbackState) {
                if (PatchProxy.proxy(new Object[]{playbackState}, this, changeQuickRedirect, false, 44222, new Class[]{Object.class}, Void.TYPE).isSupported) {
                    return;
                }
                b(playbackState);
            }

            public final void b(final PlaybackState playbackState) {
                Fragment fragmentB2;
                FragmentActivity activity;
                if (PatchProxy.proxy(new Object[]{playbackState}, this, changeQuickRedirect, false, 44221, new Class[]{PlaybackState.class}, Void.TYPE).isSupported) {
                    return;
                }
                d mStoryContext3 = this.f92325a.getMStoryContext();
                final boolean z10 = (mStoryContext3 == null || (fragmentB2 = mStoryContext3.b()) == null || (activity = fragmentB2.getActivity()) == null || !activity.isFinishing()) ? false : true;
                Log.d("observePlayState", "state: " + playbackState + "  mPosition: " + this.f92325a.getMPosition() + ", isFinishing: " + z10);
                final StoryPlayIconWidget storyPlayIconWidget = this.f92325a;
                StoryUtilsKt.f(storyPlayIconWidget, new yh.a<b2>() { // from class: com.max.xiaoheihe.module.story.widget.ui.video.widget.StoryPlayIconWidget$observePlayState$1$1$onChanged$1
                    public static ChangeQuickRedirect changeQuickRedirect;

                    /* JADX INFO: compiled from: StoryPlayIconWidget.kt */
                    public final /* synthetic */ class a {

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public static final /* synthetic */ int[] f92329a;

                        static {
                            int[] iArr = new int[PlaybackState.valuesCustom().length];
                            try {
                                iArr[PlaybackState.PAUSED.ordinal()] = 1;
                            } catch (NoSuchFieldError unused) {
                            }
                            f92329a = iArr;
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.b2] */
                    @Override // yh.a
                    public /* bridge */ /* synthetic */ b2 invoke() {
                        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44224, new Class[0], Object.class);
                        if (patchProxyResultProxy.isSupported) {
                            return patchProxyResultProxy.result;
                        }
                        invoke2();
                        return b2.f124493a;
                    }

                    /* JADX WARN: Code duplicated, block: B:7:0x001f  */
                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        int i10;
                        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44223, new Class[0], Void.TYPE).isSupported) {
                            return;
                        }
                        StoryPlayIconWidget storyPlayIconWidget2 = storyPlayIconWidget;
                        if (!z10) {
                            PlaybackState playbackState2 = playbackState;
                            i10 = (playbackState2 == null ? -1 : a.f92329a[playbackState2.ordinal()]) != 1 ? 8 : 0;
                        }
                        storyPlayIconWidget2.setVisibility(i10);
                    }
                });
            }
        });
    }

    @Override // com.max.hbstory.viewpage2.video.a
    public void c(@dl.d d storyContext, int i10) {
        if (PatchProxy.proxy(new Object[]{storyContext, new Integer(i10)}, this, changeQuickRedirect, false, 44215, new Class[]{d.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(storyContext, "storyContext");
    }

    @Override // com.max.hbstory.viewpage2.video.a
    public void e(@dl.d d storyContext, int i10) {
        StoryLinkCardInfoObj link_card_info;
        StoryVideoInfoObj video_info;
        if (PatchProxy.proxy(new Object[]{storyContext, new Integer(i10)}, this, changeQuickRedirect, false, 44216, new Class[]{d.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(storyContext, "storyContext");
        setMStoryContext(storyContext);
        setMPosition(i10);
        setVisibility(8);
        StoryItemsObj storyItemsObjN = StoryUtilsKt.n(this, i10);
        if (storyItemsObjN != null && (link_card_info = storyItemsObjN.getLink_card_info()) != null && (video_info = link_card_info.getVideo_info()) != null) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            f0.n(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = d(video_info.getWidth(), video_info.getHeight());
            setLayoutParams(layoutParams);
        }
        if (this.f92324e) {
            return;
        }
        this.f92324e = true;
        g();
    }

    @Override // com.max.hbstory.viewpage2.video.a
    public void f() {
    }

    @Override // com.max.hbstory.viewpage2.video.a
    @e
    /* JADX INFO: renamed from: getCoreViewBinding */
    public c mo41getCoreViewBinding() {
        return this.f92321b;
    }

    @Override // com.max.hbstory.viewpage2.video.a
    public int getMPosition() {
        return this.f92323d;
    }

    @Override // com.max.hbstory.viewpage2.video.a
    @e
    public d getMStoryContext() {
        return this.f92322c;
    }

    @Override // com.max.hbstory.viewpage2.video.a
    public void hide() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44220, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        setVisibility(8);
    }

    @Override // com.max.hbstory.viewpage2.video.a
    public void setMPosition(int i10) {
        this.f92323d = i10;
    }

    @Override // com.max.hbstory.viewpage2.video.a
    public void setMStoryContext(@e d dVar) {
        this.f92322c = dVar;
    }

    @Override // com.max.hbstory.viewpage2.video.a
    public void show() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44219, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        setVisibility(0);
    }
}
