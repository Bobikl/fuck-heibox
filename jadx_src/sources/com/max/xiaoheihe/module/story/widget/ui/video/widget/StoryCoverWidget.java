package com.max.xiaoheihe.module.story.widget.ui.video.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.compose.runtime.internal.o;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.j0;
import com.max.hbimage.b;
import com.max.hbstory.bean.StoryCardIdInfoObj;
import com.max.hbstory.bean.StoryItemsObj;
import com.max.hbstory.bean.StoryLinkCardInfoObj;
import com.max.hbstory.bean.StoryVideoInfoObj;
import com.max.hbstory.d;
import com.max.hbstory.g;
import com.max.hbstory.utils.StoryUtilsKt;
import com.max.video.player.info.PlaybackState;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.e;
import java.util.List;
import kotlin.b2;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;
import kotlin.jvm.internal.u;
import xh.i;
import yh.l;

/* JADX INFO: compiled from: StoryCoverWidget.kt */
/* JADX INFO: loaded from: classes12.dex */
@t0({"SMAP\nStoryCoverWidget.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StoryCoverWidget.kt\ncom/max/xiaoheihe/module/story/widget/ui/video/widget/StoryCoverWidget\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,142:1\n262#2,2:143\n*S KotlinDebug\n*F\n+ 1 StoryCoverWidget.kt\ncom/max/xiaoheihe/module/story/widget/ui/video/widget/StoryCoverWidget\n*L\n41#1:143,2\n*E\n"})
@o(parameters = 0)
public final class StoryCoverWidget extends AppCompatImageView implements com.max.hbstory.viewpage2.video.a {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f92273f = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @e
    private final l3.c f92274b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @e
    private d f92275c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f92276d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f92277e;

    /* JADX INFO: compiled from: StoryCoverWidget.kt */
    public static final class a implements j0<Integer> {
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        @Override // androidx.lifecycle.j0
        public /* bridge */ /* synthetic */ void a(Integer num) {
            if (PatchProxy.proxy(new Object[]{num}, this, changeQuickRedirect, false, 44145, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            b(num);
        }

        public final void b(Integer position) {
            if (PatchProxy.proxy(new Object[]{position}, this, changeQuickRedirect, false, 44144, new Class[]{Integer.class}, Void.TYPE).isSupported) {
                return;
            }
            StoryCoverWidget storyCoverWidget = StoryCoverWidget.this;
            f0.o(position, "position");
            StoryCoverWidget.k(storyCoverWidget, position.intValue());
        }
    }

    /* JADX INFO: compiled from: StoryCoverWidget.kt */
    public static final class b implements Runnable {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44153, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            StoryCoverWidget.this.setVisibility(0);
        }
    }

    /* JADX INFO: compiled from: StoryCoverWidget.kt */
    public static final class c implements Runnable {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44154, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            StoryCoverWidget.this.setVisibility(0);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @i
    public StoryCoverWidget(@dl.d Context context) {
        this(context, null, 0, 6, null);
        f0.p(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @i
    public StoryCoverWidget(@dl.d Context context, @e AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        f0.p(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @i
    public StoryCoverWidget(@dl.d Context context, @e AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        f0.p(context, "context");
        this.f92276d = -1;
    }

    public /* synthetic */ StoryCoverWidget(Context context, AttributeSet attributeSet, int i10, int i11, u uVar) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    public static final /* synthetic */ int d(StoryCoverWidget storyCoverWidget, int i10, int i11, int i12) {
        Object[] objArr = {storyCoverWidget, new Integer(i10), new Integer(i11), new Integer(i12)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, 44140, new Class[]{StoryCoverWidget.class, cls, cls, cls}, cls);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : storyCoverWidget.l(i10, i11, i12);
    }

    public static final /* synthetic */ void h(StoryCoverWidget storyCoverWidget) {
        if (PatchProxy.proxy(new Object[]{storyCoverWidget}, null, changeQuickRedirect, true, 44141, new Class[]{StoryCoverWidget.class}, Void.TYPE).isSupported) {
            return;
        }
        storyCoverWidget.p();
    }

    public static final /* synthetic */ void i(StoryCoverWidget storyCoverWidget) {
        if (PatchProxy.proxy(new Object[]{storyCoverWidget}, null, changeQuickRedirect, true, 44142, new Class[]{StoryCoverWidget.class}, Void.TYPE).isSupported) {
            return;
        }
        storyCoverWidget.q();
    }

    public static final /* synthetic */ void k(StoryCoverWidget storyCoverWidget, int i10) {
        if (PatchProxy.proxy(new Object[]{storyCoverWidget, new Integer(i10)}, null, changeQuickRedirect, true, 44143, new Class[]{StoryCoverWidget.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        storyCoverWidget.r(i10);
    }

    private final int l(int i10, int i11, int i12) {
        return (int) (i10 / (i11 / i12));
    }

    private final void m(int i10, l<? super StoryVideoInfoObj, b2> lVar) {
        d mStoryContext;
        g gVarD;
        LiveData<List<StoryItemsObj>> liveDataF;
        List<StoryItemsObj> listF;
        StoryLinkCardInfoObj link_card_info;
        StoryVideoInfoObj video_info;
        boolean z10 = false;
        if (PatchProxy.proxy(new Object[]{new Integer(i10), lVar}, this, changeQuickRedirect, false, 44135, new Class[]{Integer.TYPE, l.class}, Void.TYPE).isSupported || (mStoryContext = getMStoryContext()) == null || (gVarD = mStoryContext.d()) == null || (liveDataF = gVarD.F()) == null || (listF = liveDataF.f()) == null) {
            return;
        }
        int iG = CollectionsKt__CollectionsKt.G(listF);
        if (i10 >= 0 && i10 <= iG) {
            StoryCardIdInfoObj card_id_info = listF.get(i10).getCard_id_info();
            if (card_id_info != null && card_id_info.getCard_type() == 1) {
                z10 = true;
            }
            if (!z10 || (link_card_info = listF.get(i10).getLink_card_info()) == null || (video_info = link_card_info.getVideo_info()) == null) {
                return;
            }
            lVar.invoke(video_info);
        }
    }

    private final boolean n(int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 44136, new Class[]{Integer.TYPE}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        return getMPosition() == i10 - 1;
    }

    private final boolean o(int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 44137, new Class[]{Integer.TYPE}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        return getMPosition() == i10 + 1;
    }

    private final void p() {
        d mStoryContext;
        Fragment fragmentB;
        d mStoryContext2;
        g gVarD;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44133, new Class[0], Void.TYPE).isSupported || (mStoryContext = getMStoryContext()) == null || (fragmentB = mStoryContext.b()) == null || (mStoryContext2 = getMStoryContext()) == null || (gVarD = mStoryContext2.d()) == null) {
            return;
        }
        gVarD.n().k(fragmentB, new a());
    }

    private final void q() {
        d mStoryContext;
        Fragment fragmentB;
        d mStoryContext2;
        g gVarD;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44132, new Class[0], Void.TYPE).isSupported || (mStoryContext = getMStoryContext()) == null || (fragmentB = mStoryContext.b()) == null || (mStoryContext2 = getMStoryContext()) == null || (gVarD = mStoryContext2.d()) == null) {
            return;
        }
        gVarD.x().k(fragmentB, new j0<PlaybackState>() { // from class: com.max.xiaoheihe.module.story.widget.ui.video.widget.StoryCoverWidget$observePlayState$1$1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // androidx.lifecycle.j0
            public /* bridge */ /* synthetic */ void a(PlaybackState playbackState) {
                if (PatchProxy.proxy(new Object[]{playbackState}, this, changeQuickRedirect, false, 44147, new Class[]{Object.class}, Void.TYPE).isSupported) {
                    return;
                }
                b(playbackState);
            }

            public final void b(final PlaybackState playbackState) {
                if (PatchProxy.proxy(new Object[]{playbackState}, this, changeQuickRedirect, false, 44146, new Class[]{PlaybackState.class}, Void.TYPE).isSupported) {
                    return;
                }
                final StoryCoverWidget storyCoverWidget = this.f92281a;
                StoryUtilsKt.f(storyCoverWidget, new yh.a<b2>() { // from class: com.max.xiaoheihe.module.story.widget.ui.video.widget.StoryCoverWidget$observePlayState$1$1$onChanged$1
                    public static ChangeQuickRedirect changeQuickRedirect;

                    /* JADX INFO: compiled from: StoryCoverWidget.kt */
                    public static final class a implements Runnable {
                        public static ChangeQuickRedirect changeQuickRedirect;

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        final /* synthetic */ StoryCoverWidget f92284b;

                        a(StoryCoverWidget storyCoverWidget) {
                            this.f92284b = storyCoverWidget;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44150, new Class[0], Void.TYPE).isSupported) {
                                return;
                            }
                            this.f92284b.setVisibility(8);
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.b2] */
                    @Override // yh.a
                    public /* bridge */ /* synthetic */ b2 invoke() {
                        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44149, new Class[0], Object.class);
                        if (patchProxyResultProxy.isSupported) {
                            return patchProxyResultProxy.result;
                        }
                        invoke2();
                        return b2.f124493a;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44148, new Class[0], Void.TYPE).isSupported && playbackState == PlaybackState.STARTED) {
                            StoryCoverWidget storyCoverWidget2 = storyCoverWidget;
                            storyCoverWidget2.postDelayed(new a(storyCoverWidget2), 100L);
                        }
                    }
                });
            }
        });
    }

    private final void r(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 44134, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        if (n(i10)) {
            post(new b());
        }
        if (o(i10)) {
            post(new c());
        }
    }

    @Override // com.max.hbstory.viewpage2.video.a
    public void c(@dl.d d storyContext, int i10) {
        if (PatchProxy.proxy(new Object[]{storyContext, new Integer(i10)}, this, changeQuickRedirect, false, 44129, new Class[]{d.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(storyContext, "storyContext");
    }

    @Override // com.max.hbstory.viewpage2.video.a
    public void e(@dl.d d storyContext, int i10) {
        if (PatchProxy.proxy(new Object[]{storyContext, new Integer(i10)}, this, changeQuickRedirect, false, 44131, new Class[]{d.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(storyContext, "storyContext");
        setVisibility(8);
        setMStoryContext(storyContext);
        setMPosition(i10);
        m(getMPosition(), new l<StoryVideoInfoObj, b2>() { // from class: com.max.xiaoheihe.module.story.widget.ui.video.widget.StoryCoverWidget$onBindViewHolder$1
            public static ChangeQuickRedirect changeQuickRedirect;

            {
                super(1);
            }

            public final void a(@dl.d StoryVideoInfoObj videoInfoObj) {
                if (PatchProxy.proxy(new Object[]{videoInfoObj}, this, changeQuickRedirect, false, 44151, new Class[]{StoryVideoInfoObj.class}, Void.TYPE).isSupported) {
                    return;
                }
                f0.p(videoInfoObj, "videoInfoObj");
                this.f92285b.setVisibility(0);
                String cover = videoInfoObj.getCover();
                int width = videoInfoObj.getWidth();
                int height = videoInfoObj.getHeight();
                DisplayMetrics displayMetrics = this.f92285b.getContext().getResources().getDisplayMetrics();
                f0.o(displayMetrics, "resources.displayMetrics");
                int i11 = displayMetrics.widthPixels;
                int iD = StoryCoverWidget.d(this.f92285b, i11, width, height);
                ViewGroup.LayoutParams layoutParams = this.f92285b.getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.width = i11;
                    layoutParams.height = iD;
                }
                this.f92285b.setLayoutParams(layoutParams);
                b.R(cover, this.f92285b, width, height, 1, -1);
                if (this.f92285b.f92277e) {
                    return;
                }
                this.f92285b.f92277e = true;
                StoryCoverWidget.h(this.f92285b);
                StoryCoverWidget.i(this.f92285b);
            }

            /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, kotlin.b2] */
            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(StoryVideoInfoObj storyVideoInfoObj) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{storyVideoInfoObj}, this, changeQuickRedirect, false, 44152, new Class[]{Object.class}, Object.class);
                if (patchProxyResultProxy.isSupported) {
                    return patchProxyResultProxy.result;
                }
                a(storyVideoInfoObj);
                return b2.f124493a;
            }
        });
    }

    @Override // com.max.hbstory.viewpage2.video.a
    public void f() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44130, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        com.max.hbimage.b.c(this);
    }

    @Override // com.max.hbstory.viewpage2.video.a
    @e
    /* JADX INFO: renamed from: getCoreViewBinding */
    public l3.c mo41getCoreViewBinding() {
        return this.f92274b;
    }

    @Override // com.max.hbstory.viewpage2.video.a
    public int getMPosition() {
        return this.f92276d;
    }

    @Override // com.max.hbstory.viewpage2.video.a
    @e
    public d getMStoryContext() {
        return this.f92275c;
    }

    @Override // com.max.hbstory.viewpage2.video.a
    public void hide() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44139, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        setVisibility(8);
    }

    @Override // com.max.hbstory.viewpage2.video.a
    public void setMPosition(int i10) {
        this.f92276d = i10;
    }

    @Override // com.max.hbstory.viewpage2.video.a
    public void setMStoryContext(@e d dVar) {
        this.f92275c = dVar;
    }

    @Override // com.max.hbstory.viewpage2.video.a
    public void show() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44138, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        setVisibility(0);
    }
}
