package com.max.xiaoheihe.module.story.widget.ui.video.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import androidx.compose.runtime.internal.o;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.j0;
import com.max.hbstory.bean.StoryItemsObj;
import com.max.hbstory.bean.StoryLinkCardInfoObj;
import com.max.hbstory.g;
import com.max.hbstory.utils.StoryUtilsKt;
import com.max.video.player.info.PlaybackState;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import df.eb0;
import dl.d;
import dl.e;
import kotlin.b2;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;
import l3.c;
import xh.i;

/* JADX INFO: compiled from: StorySpeedWatchingWidget.kt */
/* JADX INFO: loaded from: classes12.dex */
@o(parameters = 0)
public final class StorySpeedWatchingWidget extends LinearLayout implements com.max.hbstory.viewpage2.video.a {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f92330f = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @d
    private final eb0 f92331b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @e
    private com.max.hbstory.d f92332c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f92333d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f92334e;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @i
    public StorySpeedWatchingWidget(@d Context context) {
        this(context, null, 0, 6, null);
        f0.p(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @i
    public StorySpeedWatchingWidget(@d Context context, @e AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        f0.p(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @i
    public StorySpeedWatchingWidget(@d Context context, @e AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        f0.p(context, "context");
        eb0 eb0VarB = eb0.b(LayoutInflater.from(context), this);
        f0.o(eb0VarB, "inflate(\n        LayoutI…ater.from(context), this)");
        this.f92331b = eb0VarB;
        this.f92333d = -1;
    }

    public /* synthetic */ StorySpeedWatchingWidget(Context context, AttributeSet attributeSet, int i10, int i11, u uVar) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    private final void d() {
        com.max.hbstory.d mStoryContext;
        Fragment fragmentB;
        com.max.hbstory.d mStoryContext2;
        final g gVarD;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44227, new Class[0], Void.TYPE).isSupported || (mStoryContext = getMStoryContext()) == null || (fragmentB = mStoryContext.b()) == null || (mStoryContext2 = getMStoryContext()) == null || (gVarD = mStoryContext2.d()) == null) {
            return;
        }
        gVarD.w().k(fragmentB, new j0<Boolean>() { // from class: com.max.xiaoheihe.module.story.widget.ui.video.widget.StorySpeedWatchingWidget$observePlayState$1$1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // androidx.lifecycle.j0
            public /* bridge */ /* synthetic */ void a(Boolean bool) {
                if (PatchProxy.proxy(new Object[]{bool}, this, changeQuickRedirect, false, 44234, new Class[]{Object.class}, Void.TYPE).isSupported) {
                    return;
                }
                b(bool);
            }

            public final void b(final Boolean bool) {
                if (PatchProxy.proxy(new Object[]{bool}, this, changeQuickRedirect, false, 44233, new Class[]{Boolean.class}, Void.TYPE).isSupported) {
                    return;
                }
                final StorySpeedWatchingWidget storySpeedWatchingWidget = this.f92335a;
                final g gVar = gVarD;
                StoryUtilsKt.f(storySpeedWatchingWidget, new yh.a<b2>() { // from class: com.max.xiaoheihe.module.story.widget.ui.video.widget.StorySpeedWatchingWidget$observePlayState$1$1$onChanged$1
                    public static ChangeQuickRedirect changeQuickRedirect;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.b2] */
                    @Override // yh.a
                    public /* bridge */ /* synthetic */ b2 invoke() {
                        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44236, new Class[0], Object.class);
                        if (patchProxyResultProxy.isSupported) {
                            return patchProxyResultProxy.result;
                        }
                        invoke2();
                        return b2.f124493a;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44235, new Class[0], Void.TYPE).isSupported) {
                            return;
                        }
                        if (storySpeedWatchingWidget.b()) {
                            if (gVar.x().f() == PlaybackState.STARTED) {
                                StorySpeedWatchingWidget storySpeedWatchingWidget2 = storySpeedWatchingWidget;
                                Boolean longPressing = bool;
                                f0.o(longPressing, "longPressing");
                                storySpeedWatchingWidget2.setVisibility(longPressing.booleanValue() ? 0 : 8);
                                return;
                            }
                            return;
                        }
                        if (storySpeedWatchingWidget.a()) {
                            StorySpeedWatchingWidget storySpeedWatchingWidget3 = storySpeedWatchingWidget;
                            Boolean longPressing2 = bool;
                            f0.o(longPressing2, "longPressing");
                            storySpeedWatchingWidget3.setVisibility(longPressing2.booleanValue() ? 0 : 8);
                        }
                    }
                });
            }
        });
    }

    public final boolean a() {
        StoryItemsObj storyItemsObjM;
        StoryLinkCardInfoObj link_card_info;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44229, new Class[0], Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        com.max.hbstory.d mStoryContext = getMStoryContext();
        return ((mStoryContext == null || (storyItemsObjM = StoryUtilsKt.m(mStoryContext, getMPosition())) == null || (link_card_info = storyItemsObjM.getLink_card_info()) == null) ? null : link_card_info.getImg_info()) != null;
    }

    public final boolean b() {
        StoryItemsObj storyItemsObjM;
        StoryLinkCardInfoObj link_card_info;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44228, new Class[0], Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        com.max.hbstory.d mStoryContext = getMStoryContext();
        return ((mStoryContext == null || (storyItemsObjM = StoryUtilsKt.m(mStoryContext, getMPosition())) == null || (link_card_info = storyItemsObjM.getLink_card_info()) == null) ? null : link_card_info.getVideo_info()) != null;
    }

    @Override // com.max.hbstory.viewpage2.video.a
    public void c(@d com.max.hbstory.d storyContext, int i10) {
        if (PatchProxy.proxy(new Object[]{storyContext, new Integer(i10)}, this, changeQuickRedirect, false, 44225, new Class[]{com.max.hbstory.d.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(storyContext, "storyContext");
    }

    @Override // com.max.hbstory.viewpage2.video.a
    public void e(@d com.max.hbstory.d storyContext, int i10) {
        if (PatchProxy.proxy(new Object[]{storyContext, new Integer(i10)}, this, changeQuickRedirect, false, 44226, new Class[]{com.max.hbstory.d.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(storyContext, "storyContext");
        setMStoryContext(storyContext);
        setMPosition(i10);
        if (this.f92334e) {
            return;
        }
        this.f92334e = true;
        d();
    }

    @Override // com.max.hbstory.viewpage2.video.a
    public void f() {
    }

    @Override // com.max.hbstory.viewpage2.video.a
    @d
    /* JADX INFO: renamed from: getCoreViewBinding */
    public eb0 mo41getCoreViewBinding() {
        return this.f92331b;
    }

    @Override // com.max.hbstory.viewpage2.video.a
    /* JADX INFO: renamed from: getCoreViewBinding */
    public /* bridge */ /* synthetic */ c mo41getCoreViewBinding() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44232, new Class[0], c.class);
        return patchProxyResultProxy.isSupported ? (c) patchProxyResultProxy.result : mo41getCoreViewBinding();
    }

    @Override // com.max.hbstory.viewpage2.video.a
    public int getMPosition() {
        return this.f92333d;
    }

    @Override // com.max.hbstory.viewpage2.video.a
    @e
    public com.max.hbstory.d getMStoryContext() {
        return this.f92332c;
    }

    @Override // com.max.hbstory.viewpage2.video.a
    public void hide() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44231, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        setVisibility(8);
    }

    @Override // com.max.hbstory.viewpage2.video.a
    public void setMPosition(int i10) {
        this.f92333d = i10;
    }

    @Override // com.max.hbstory.viewpage2.video.a
    public void setMStoryContext(@e com.max.hbstory.d dVar) {
        this.f92332c = dVar;
    }

    @Override // com.max.hbstory.viewpage2.video.a
    public void show() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44230, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        setVisibility(0);
    }
}
