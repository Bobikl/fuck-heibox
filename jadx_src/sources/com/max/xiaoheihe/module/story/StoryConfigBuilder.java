package com.max.xiaoheihe.module.story;

import android.content.Context;
import android.view.LayoutInflater;
import androidx.compose.runtime.internal.o;
import com.max.hbstory.config.StoryRootViewBuilder;
import com.max.xiaoheihe.module.story.service.StoryNormalService;
import com.max.xiaoheihe.module.story.widget.anim.StoryAnimWidget;
import com.max.xiaoheihe.module.story.widget.control.StoryControlWidget;
import com.max.xiaoheihe.module.story.widget.control.StoryLandscapeControlWidget;
import com.max.xiaoheihe.module.story.widget.ui.picture.StoryPictureUIFrameLayout;
import com.max.xiaoheihe.module.story.widget.ui.root.StoryOverlayTipsWidget;
import com.max.xiaoheihe.module.story.widget.ui.root.StoryTitleBarTopRootWidget;
import com.max.xiaoheihe.module.story.widget.ui.video.StoryVideoUIFrameLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import df.ci0;
import df.di0;
import df.ei0;
import df.xh0;
import df.yh0;
import kotlin.b2;
import kotlin.jvm.internal.f0;
import od.e;
import od.g;
import yh.l;

/* JADX INFO: compiled from: StoryConfigBuilder.kt */
/* JADX INFO: loaded from: classes12.dex */
@o(parameters = 0)
public final class StoryConfigBuilder {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f91929b = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final Context f91930a;

    public StoryConfigBuilder(@dl.d Context context) {
        f0.p(context, "context");
        this.f91930a = context;
    }

    public static final /* synthetic */ yh.a a(StoryConfigBuilder storyConfigBuilder) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{storyConfigBuilder}, null, changeQuickRedirect, true, 43489, new Class[]{StoryConfigBuilder.class}, yh.a.class);
        return patchProxyResultProxy.isSupported ? (yh.a) patchProxyResultProxy.result : storyConfigBuilder.k();
    }

    public static final /* synthetic */ yh.a b(StoryConfigBuilder storyConfigBuilder) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{storyConfigBuilder}, null, changeQuickRedirect, true, 43490, new Class[]{StoryConfigBuilder.class}, yh.a.class);
        return patchProxyResultProxy.isSupported ? (yh.a) patchProxyResultProxy.result : storyConfigBuilder.l();
    }

    public static final /* synthetic */ yh.a c(StoryConfigBuilder storyConfigBuilder) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{storyConfigBuilder}, null, changeQuickRedirect, true, 43491, new Class[]{StoryConfigBuilder.class}, yh.a.class);
        return patchProxyResultProxy.isSupported ? (yh.a) patchProxyResultProxy.result : storyConfigBuilder.m();
    }

    public static final /* synthetic */ yh.a d(StoryConfigBuilder storyConfigBuilder) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{storyConfigBuilder}, null, changeQuickRedirect, true, 43492, new Class[]{StoryConfigBuilder.class}, yh.a.class);
        return patchProxyResultProxy.isSupported ? (yh.a) patchProxyResultProxy.result : storyConfigBuilder.n();
    }

    public static final /* synthetic */ yh.a e(StoryConfigBuilder storyConfigBuilder) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{storyConfigBuilder}, null, changeQuickRedirect, true, 43488, new Class[]{StoryConfigBuilder.class}, yh.a.class);
        return patchProxyResultProxy.isSupported ? (yh.a) patchProxyResultProxy.result : storyConfigBuilder.o();
    }

    public static final /* synthetic */ l f(StoryConfigBuilder storyConfigBuilder) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{storyConfigBuilder}, null, changeQuickRedirect, true, 43494, new Class[]{StoryConfigBuilder.class}, l.class);
        return patchProxyResultProxy.isSupported ? (l) patchProxyResultProxy.result : storyConfigBuilder.p();
    }

    public static final /* synthetic */ yh.a g(StoryConfigBuilder storyConfigBuilder) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{storyConfigBuilder}, null, changeQuickRedirect, true, 43493, new Class[]{StoryConfigBuilder.class}, yh.a.class);
        return patchProxyResultProxy.isSupported ? (yh.a) patchProxyResultProxy.result : storyConfigBuilder.q();
    }

    public static final /* synthetic */ yh.a h(StoryConfigBuilder storyConfigBuilder) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{storyConfigBuilder}, null, changeQuickRedirect, true, 43495, new Class[]{StoryConfigBuilder.class}, yh.a.class);
        return patchProxyResultProxy.isSupported ? (yh.a) patchProxyResultProxy.result : storyConfigBuilder.r();
    }

    private final yh.a<StoryAnimWidget> k() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43483, new Class[0], yh.a.class);
        return patchProxyResultProxy.isSupported ? (yh.a) patchProxyResultProxy.result : new yh.a<StoryAnimWidget>() { // from class: com.max.xiaoheihe.module.story.StoryConfigBuilder$createNormalAnimWidgetBuilder$1
            public static ChangeQuickRedirect changeQuickRedirect;

            {
                super(0);
            }

            @dl.d
            public final StoryAnimWidget a() {
                PatchProxyResult patchProxyResultProxy2 = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43508, new Class[0], StoryAnimWidget.class);
                if (patchProxyResultProxy2.isSupported) {
                    return (StoryAnimWidget) patchProxyResultProxy2.result;
                }
                StoryAnimWidget storyAnimWidgetB = xh0.c(LayoutInflater.from(this.f91938b.f91930a)).b();
                f0.o(storyAnimWidgetB, "inflate(\n            Lay…m(context)\n        ).root");
                return storyAnimWidgetB;
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [com.max.xiaoheihe.module.story.widget.anim.StoryAnimWidget, java.lang.Object] */
            @Override // yh.a
            public /* bridge */ /* synthetic */ StoryAnimWidget invoke() {
                PatchProxyResult patchProxyResultProxy2 = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43509, new Class[0], Object.class);
                return patchProxyResultProxy2.isSupported ? patchProxyResultProxy2.result : a();
            }
        };
    }

    private final yh.a<StoryControlWidget> l() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43481, new Class[0], yh.a.class);
        return patchProxyResultProxy.isSupported ? (yh.a) patchProxyResultProxy.result : new yh.a<StoryControlWidget>() { // from class: com.max.xiaoheihe.module.story.StoryConfigBuilder$createNormalControlWidgetBuilder$1
            public static ChangeQuickRedirect changeQuickRedirect;

            {
                super(0);
            }

            @dl.d
            public final StoryControlWidget a() {
                PatchProxyResult patchProxyResultProxy2 = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43510, new Class[0], StoryControlWidget.class);
                if (patchProxyResultProxy2.isSupported) {
                    return (StoryControlWidget) patchProxyResultProxy2.result;
                }
                StoryControlWidget storyControlWidgetB = yh0.c(LayoutInflater.from(this.f91939b.f91930a)).b();
                f0.o(storyControlWidgetB, "inflate(\n            Lay…m(context)\n        ).root");
                return storyControlWidgetB;
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [com.max.xiaoheihe.module.story.widget.control.StoryControlWidget, java.lang.Object] */
            @Override // yh.a
            public /* bridge */ /* synthetic */ StoryControlWidget invoke() {
                PatchProxyResult patchProxyResultProxy2 = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43511, new Class[0], Object.class);
                return patchProxyResultProxy2.isSupported ? patchProxyResultProxy2.result : a();
            }
        };
    }

    private final yh.a<StoryPictureUIFrameLayout> m() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43485, new Class[0], yh.a.class);
        return patchProxyResultProxy.isSupported ? (yh.a) patchProxyResultProxy.result : new yh.a<StoryPictureUIFrameLayout>() { // from class: com.max.xiaoheihe.module.story.StoryConfigBuilder$createNormalPictureUiWidgetBuilder$1
            public static ChangeQuickRedirect changeQuickRedirect;

            {
                super(0);
            }

            @dl.d
            public final StoryPictureUIFrameLayout a() {
                PatchProxyResult patchProxyResultProxy2 = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43512, new Class[0], StoryPictureUIFrameLayout.class);
                if (patchProxyResultProxy2.isSupported) {
                    return (StoryPictureUIFrameLayout) patchProxyResultProxy2.result;
                }
                StoryPictureUIFrameLayout storyPictureUIFrameLayoutB = ci0.c(LayoutInflater.from(this.f91940b.f91930a)).b();
                f0.o(storyPictureUIFrameLayoutB, "inflate(\n            Lay…m(context)\n        ).root");
                return storyPictureUIFrameLayoutB;
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [com.max.xiaoheihe.module.story.widget.ui.picture.StoryPictureUIFrameLayout, java.lang.Object] */
            @Override // yh.a
            public /* bridge */ /* synthetic */ StoryPictureUIFrameLayout invoke() {
                PatchProxyResult patchProxyResultProxy2 = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43513, new Class[0], Object.class);
                return patchProxyResultProxy2.isSupported ? patchProxyResultProxy2.result : a();
            }
        };
    }

    private final yh.a<StoryLandscapeControlWidget> n() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43482, new Class[0], yh.a.class);
        return patchProxyResultProxy.isSupported ? (yh.a) patchProxyResultProxy.result : new yh.a<StoryLandscapeControlWidget>() { // from class: com.max.xiaoheihe.module.story.StoryConfigBuilder$createNormalStoryLandscapeControlWidgetBuilder$1
            public static ChangeQuickRedirect changeQuickRedirect;

            {
                super(0);
            }

            @dl.d
            public final StoryLandscapeControlWidget a() {
                PatchProxyResult patchProxyResultProxy2 = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43514, new Class[0], StoryLandscapeControlWidget.class);
                return patchProxyResultProxy2.isSupported ? (StoryLandscapeControlWidget) patchProxyResultProxy2.result : new StoryLandscapeControlWidget(this.f91941b.f91930a, null, 0, 6, null);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [com.max.xiaoheihe.module.story.widget.control.StoryLandscapeControlWidget, java.lang.Object] */
            @Override // yh.a
            public /* bridge */ /* synthetic */ StoryLandscapeControlWidget invoke() {
                PatchProxyResult patchProxyResultProxy2 = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43515, new Class[0], Object.class);
                return patchProxyResultProxy2.isSupported ? patchProxyResultProxy2.result : a();
            }
        };
    }

    private final yh.a<StoryVideoUIFrameLayout> o() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43484, new Class[0], yh.a.class);
        return patchProxyResultProxy.isSupported ? (yh.a) patchProxyResultProxy.result : new yh.a<StoryVideoUIFrameLayout>() { // from class: com.max.xiaoheihe.module.story.StoryConfigBuilder$createNormalUiWidgetBuilder$1
            public static ChangeQuickRedirect changeQuickRedirect;

            {
                super(0);
            }

            @dl.d
            public final StoryVideoUIFrameLayout a() {
                PatchProxyResult patchProxyResultProxy2 = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43516, new Class[0], StoryVideoUIFrameLayout.class);
                if (patchProxyResultProxy2.isSupported) {
                    return (StoryVideoUIFrameLayout) patchProxyResultProxy2.result;
                }
                StoryVideoUIFrameLayout storyVideoUIFrameLayoutB = ei0.c(LayoutInflater.from(this.f91942b.f91930a)).b();
                f0.o(storyVideoUIFrameLayoutB, "inflate(\n            Lay…m(context)\n        ).root");
                return storyVideoUIFrameLayoutB;
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [com.max.xiaoheihe.module.story.widget.ui.video.StoryVideoUIFrameLayout, java.lang.Object] */
            @Override // yh.a
            public /* bridge */ /* synthetic */ StoryVideoUIFrameLayout invoke() {
                PatchProxyResult patchProxyResultProxy2 = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43517, new Class[0], Object.class);
                return patchProxyResultProxy2.isSupported ? patchProxyResultProxy2.result : a();
            }
        };
    }

    private final l<StoryRootViewBuilder.OverlayTipsType, StoryOverlayTipsWidget> p() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43487, new Class[0], l.class);
        return patchProxyResultProxy.isSupported ? (l) patchProxyResultProxy.result : new l<StoryRootViewBuilder.OverlayTipsType, StoryOverlayTipsWidget>() { // from class: com.max.xiaoheihe.module.story.StoryConfigBuilder$createRootOverlayTipsBuilder$1
            public static ChangeQuickRedirect changeQuickRedirect;

            {
                super(1);
            }

            @dl.d
            public final StoryOverlayTipsWidget a(@dl.d StoryRootViewBuilder.OverlayTipsType it) {
                PatchProxyResult patchProxyResultProxy2 = PatchProxy.proxy(new Object[]{it}, this, changeQuickRedirect, false, 43518, new Class[]{StoryRootViewBuilder.OverlayTipsType.class}, StoryOverlayTipsWidget.class);
                if (patchProxyResultProxy2.isSupported) {
                    return (StoryOverlayTipsWidget) patchProxyResultProxy2.result;
                }
                f0.p(it, "it");
                StoryOverlayTipsWidget storyOverlayTipsWidget = new StoryOverlayTipsWidget(this.f91943b.f91930a, null, 0, 6, null);
                storyOverlayTipsWidget.setOverlayTipsType(it);
                return storyOverlayTipsWidget;
            }

            /* JADX WARN: Type inference failed for: r9v3, types: [com.max.xiaoheihe.module.story.widget.ui.root.StoryOverlayTipsWidget, java.lang.Object] */
            @Override // yh.l
            public /* bridge */ /* synthetic */ StoryOverlayTipsWidget invoke(StoryRootViewBuilder.OverlayTipsType overlayTipsType) {
                PatchProxyResult patchProxyResultProxy2 = PatchProxy.proxy(new Object[]{overlayTipsType}, this, changeQuickRedirect, false, 43519, new Class[]{Object.class}, Object.class);
                return patchProxyResultProxy2.isSupported ? patchProxyResultProxy2.result : a(overlayTipsType);
            }
        };
    }

    private final yh.a<StoryTitleBarTopRootWidget> q() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43486, new Class[0], yh.a.class);
        return patchProxyResultProxy.isSupported ? (yh.a) patchProxyResultProxy.result : new yh.a<StoryTitleBarTopRootWidget>() { // from class: com.max.xiaoheihe.module.story.StoryConfigBuilder$createRootTitleBarBuilderbar$1
            public static ChangeQuickRedirect changeQuickRedirect;

            {
                super(0);
            }

            @dl.d
            public final StoryTitleBarTopRootWidget a() {
                PatchProxyResult patchProxyResultProxy2 = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43520, new Class[0], StoryTitleBarTopRootWidget.class);
                if (patchProxyResultProxy2.isSupported) {
                    return (StoryTitleBarTopRootWidget) patchProxyResultProxy2.result;
                }
                StoryTitleBarTopRootWidget storyTitleBarTopRootWidgetB = di0.c(LayoutInflater.from(this.f91944b.f91930a)).b();
                f0.o(storyTitleBarTopRootWidgetB, "inflate(\n            Lay…m(context)\n        ).root");
                return storyTitleBarTopRootWidgetB;
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [com.max.xiaoheihe.module.story.widget.ui.root.StoryTitleBarTopRootWidget, java.lang.Object] */
            @Override // yh.a
            public /* bridge */ /* synthetic */ StoryTitleBarTopRootWidget invoke() {
                PatchProxyResult patchProxyResultProxy2 = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43521, new Class[0], Object.class);
                return patchProxyResultProxy2.isSupported ? patchProxyResultProxy2.result : a();
            }
        };
    }

    private final yh.a<com.max.xiaoheihe.module.story.widget.ui.root.a> r() {
        return new yh.a<com.max.xiaoheihe.module.story.widget.ui.root.a>() { // from class: com.max.xiaoheihe.module.story.StoryConfigBuilder$createStoryGestureUserHomeBuilder$1
            public static ChangeQuickRedirect changeQuickRedirect;

            @dl.d
            public final com.max.xiaoheihe.module.story.widget.ui.root.a a() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43522, new Class[0], com.max.xiaoheihe.module.story.widget.ui.root.a.class);
                return patchProxyResultProxy.isSupported ? (com.max.xiaoheihe.module.story.widget.ui.root.a) patchProxyResultProxy.result : new com.max.xiaoheihe.module.story.widget.ui.root.a();
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [com.max.xiaoheihe.module.story.widget.ui.root.a, java.lang.Object] */
            @Override // yh.a
            public /* bridge */ /* synthetic */ com.max.xiaoheihe.module.story.widget.ui.root.a invoke() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43523, new Class[0], Object.class);
                return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a();
            }
        };
    }

    @dl.d
    public final od.a j() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43480, new Class[0], od.a.class);
        return patchProxyResultProxy.isSupported ? (od.a) patchProxyResultProxy.result : od.b.a(new l<od.a, b2>() { // from class: com.max.xiaoheihe.module.story.StoryConfigBuilder$buildNormalStoryConfig$1
            public static ChangeQuickRedirect changeQuickRedirect;

            {
                super(1);
            }

            public final void a(@dl.d od.a storyConfig) {
                if (PatchProxy.proxy(new Object[]{storyConfig}, this, changeQuickRedirect, false, 43496, new Class[]{od.a.class}, Void.TYPE).isSupported) {
                    return;
                }
                f0.p(storyConfig, "$this$storyConfig");
                final StoryConfigBuilder storyConfigBuilder = this.f91931b;
                storyConfig.f(od.b.f(new l<g, b2>() { // from class: com.max.xiaoheihe.module.story.StoryConfigBuilder$buildNormalStoryConfig$1.1
                    public static ChangeQuickRedirect changeQuickRedirect;

                    {
                        super(1);
                    }

                    public final void a(@dl.d final g storyWidgetConfig) {
                        if (PatchProxy.proxy(new Object[]{storyWidgetConfig}, this, changeQuickRedirect, false, 43498, new Class[]{g.class}, Void.TYPE).isSupported) {
                            return;
                        }
                        f0.p(storyWidgetConfig, "$this$storyWidgetConfig");
                        final StoryConfigBuilder storyConfigBuilder2 = storyConfigBuilder;
                        storyWidgetConfig.h(od.b.d(new l<od.d, b2>() { // from class: com.max.xiaoheihe.module.story.StoryConfigBuilder.buildNormalStoryConfig.1.1.1
                            public static ChangeQuickRedirect changeQuickRedirect;

                            {
                                super(1);
                            }

                            public final void a(@dl.d od.d storyCustomVideoViewBuilder) {
                                if (PatchProxy.proxy(new Object[]{storyCustomVideoViewBuilder}, this, changeQuickRedirect, false, 43500, new Class[]{od.d.class}, Void.TYPE).isSupported) {
                                    return;
                                }
                                f0.p(storyCustomVideoViewBuilder, "$this$storyCustomVideoViewBuilder");
                                storyCustomVideoViewBuilder.f(StoryConfigBuilder.e(storyConfigBuilder2));
                                storyCustomVideoViewBuilder.d(StoryConfigBuilder.a(storyConfigBuilder2));
                                storyCustomVideoViewBuilder.e(StoryConfigBuilder.b(storyConfigBuilder2));
                            }

                            /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, kotlin.b2] */
                            @Override // yh.l
                            public /* bridge */ /* synthetic */ b2 invoke(od.d dVar) {
                                PatchProxyResult patchProxyResultProxy2 = PatchProxy.proxy(new Object[]{dVar}, this, changeQuickRedirect, false, 43501, new Class[]{Object.class}, Object.class);
                                if (patchProxyResultProxy2.isSupported) {
                                    return patchProxyResultProxy2.result;
                                }
                                a(dVar);
                                return b2.f124493a;
                            }
                        }));
                        final StoryConfigBuilder storyConfigBuilder3 = storyConfigBuilder;
                        storyWidgetConfig.f(od.b.b(new l<od.c, b2>() { // from class: com.max.xiaoheihe.module.story.StoryConfigBuilder.buildNormalStoryConfig.1.1.2
                            public static ChangeQuickRedirect changeQuickRedirect;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            public final void a(@dl.d od.c storyCustomPictureViewBuilder) {
                                if (PatchProxy.proxy(new Object[]{storyCustomPictureViewBuilder}, this, changeQuickRedirect, false, 43502, new Class[]{od.c.class}, Void.TYPE).isSupported) {
                                    return;
                                }
                                f0.p(storyCustomPictureViewBuilder, "$this$storyCustomPictureViewBuilder");
                                storyCustomPictureViewBuilder.d(StoryConfigBuilder.c(storyConfigBuilder3));
                                storyCustomPictureViewBuilder.c(StoryConfigBuilder.a(storyConfigBuilder3));
                                storyWidgetConfig.e(StoryConfigBuilder.d(storyConfigBuilder3));
                            }

                            /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, kotlin.b2] */
                            @Override // yh.l
                            public /* bridge */ /* synthetic */ b2 invoke(od.c cVar) {
                                PatchProxyResult patchProxyResultProxy2 = PatchProxy.proxy(new Object[]{cVar}, this, changeQuickRedirect, false, 43503, new Class[]{Object.class}, Object.class);
                                if (patchProxyResultProxy2.isSupported) {
                                    return patchProxyResultProxy2.result;
                                }
                                a(cVar);
                                return b2.f124493a;
                            }
                        }));
                        final StoryConfigBuilder storyConfigBuilder4 = storyConfigBuilder;
                        storyWidgetConfig.g(od.b.c(new l<StoryRootViewBuilder, b2>() { // from class: com.max.xiaoheihe.module.story.StoryConfigBuilder.buildNormalStoryConfig.1.1.3
                            public static ChangeQuickRedirect changeQuickRedirect;

                            {
                                super(1);
                            }

                            public final void a(@dl.d StoryRootViewBuilder storyCustomRootViewBuilder) {
                                if (PatchProxy.proxy(new Object[]{storyCustomRootViewBuilder}, this, changeQuickRedirect, false, 43504, new Class[]{StoryRootViewBuilder.class}, Void.TYPE).isSupported) {
                                    return;
                                }
                                f0.p(storyCustomRootViewBuilder, "$this$storyCustomRootViewBuilder");
                                storyCustomRootViewBuilder.f(StoryConfigBuilder.g(storyConfigBuilder4));
                                storyCustomRootViewBuilder.e(StoryConfigBuilder.f(storyConfigBuilder4));
                                storyCustomRootViewBuilder.d(StoryConfigBuilder.h(storyConfigBuilder4));
                            }

                            /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, kotlin.b2] */
                            @Override // yh.l
                            public /* bridge */ /* synthetic */ b2 invoke(StoryRootViewBuilder storyRootViewBuilder) {
                                PatchProxyResult patchProxyResultProxy2 = PatchProxy.proxy(new Object[]{storyRootViewBuilder}, this, changeQuickRedirect, false, 43505, new Class[]{Object.class}, Object.class);
                                if (patchProxyResultProxy2.isSupported) {
                                    return patchProxyResultProxy2.result;
                                }
                                a(storyRootViewBuilder);
                                return b2.f124493a;
                            }
                        }));
                    }

                    /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, kotlin.b2] */
                    @Override // yh.l
                    public /* bridge */ /* synthetic */ b2 invoke(g gVar) {
                        PatchProxyResult patchProxyResultProxy2 = PatchProxy.proxy(new Object[]{gVar}, this, changeQuickRedirect, false, 43499, new Class[]{Object.class}, Object.class);
                        if (patchProxyResultProxy2.isSupported) {
                            return patchProxyResultProxy2.result;
                        }
                        a(gVar);
                        return b2.f124493a;
                    }
                }));
                storyConfig.d(od.b.e(new l<e, b2>() { // from class: com.max.xiaoheihe.module.story.StoryConfigBuilder$buildNormalStoryConfig$1.2
                    public static ChangeQuickRedirect changeQuickRedirect;

                    public final void a(@dl.d e storyDataConfig) {
                        if (PatchProxy.proxy(new Object[]{storyDataConfig}, this, changeQuickRedirect, false, 43506, new Class[]{e.class}, Void.TYPE).isSupported) {
                            return;
                        }
                        f0.p(storyDataConfig, "$this$storyDataConfig");
                        storyDataConfig.b(new b());
                    }

                    /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, kotlin.b2] */
                    @Override // yh.l
                    public /* bridge */ /* synthetic */ b2 invoke(e eVar) {
                        PatchProxyResult patchProxyResultProxy2 = PatchProxy.proxy(new Object[]{eVar}, this, changeQuickRedirect, false, 43507, new Class[]{Object.class}, Object.class);
                        if (patchProxyResultProxy2.isSupported) {
                            return patchProxyResultProxy2.result;
                        }
                        a(eVar);
                        return b2.f124493a;
                    }
                }));
                storyConfig.e(new StoryNormalService());
            }

            /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, kotlin.b2] */
            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(od.a aVar) {
                PatchProxyResult patchProxyResultProxy2 = PatchProxy.proxy(new Object[]{aVar}, this, changeQuickRedirect, false, 43497, new Class[]{Object.class}, Object.class);
                if (patchProxyResultProxy2.isSupported) {
                    return patchProxyResultProxy2.result;
                }
                a(aVar);
                return b2.f124493a;
            }
        });
    }
}
