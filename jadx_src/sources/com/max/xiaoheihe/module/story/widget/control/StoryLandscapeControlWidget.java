package com.max.xiaoheihe.module.story.widget.control;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import androidx.compose.runtime.internal.o;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.j0;
import com.google.gson.Gson;
import com.max.hbcustomview.video.VideoViewX;
import com.max.hbstory.bean.StoryBBSUserInfoObj;
import com.max.hbstory.bean.StoryCardIdInfoObj;
import com.max.hbstory.bean.StoryItemsObj;
import com.max.hbstory.bean.StoryLinkCardInfoObj;
import com.max.hbstory.bean.StoryStatInfoObj;
import com.max.hbstory.c;
import com.max.hbstory.g;
import com.max.hbstory.utils.StoryUtilsKt;
import com.max.hbstory.widget.IStoryLandscapeControlWidget;
import com.max.video.player.VideoPlayerManager;
import com.max.video.ui.widget.BasicCenterPanel;
import com.max.video.ui.widget.VerticalBottomPanel;
import com.max.video.ui.widget.f;
import com.max.xiaoheihe.bean.bbs.BBSUserInfoObj;
import com.max.xiaoheihe.module.video.VideoPostTopPanel;
import com.max.xiaoheihe.module.video.action.VideoCollectAction;
import com.max.xiaoheihe.module.video.action.VideoFollowAction;
import com.max.xiaoheihe.module.video.action.VideoLikeAction;
import com.max.xiaoheihe.module.video.action.VideoMoreAction;
import com.max.xiaoheihe.module.video.action.VideoShareAction;
import com.max.xiaoheihe.utils.i0;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import io.reactivex.disposables.b;
import java.util.HashMap;
import kotlin.b2;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;
import kotlin.jvm.internal.u;
import xh.i;
import yh.a;
import yh.l;

/* JADX INFO: compiled from: StoryLandscapeControlWidget.kt */
/* JADX INFO: loaded from: classes12.dex */
@t0({"SMAP\nStoryLandscapeControlWidget.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StoryLandscapeControlWidget.kt\ncom/max/xiaoheihe/module/story/widget/control/StoryLandscapeControlWidget\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,510:1\n13579#2,2:511\n*S KotlinDebug\n*F\n+ 1 StoryLandscapeControlWidget.kt\ncom/max/xiaoheihe/module/story/widget/control/StoryLandscapeControlWidget\n*L\n274#1:511,2\n*E\n"})
@o(parameters = 0)
public final class StoryLandscapeControlWidget extends IStoryLandscapeControlWidget {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    public static final int f92096x2 = 8;

    @dl.e
    private VideoViewX S;

    @dl.e
    private com.max.hbstory.d T;
    private int U;

    @dl.d
    private final VideoLikeAction V;

    @dl.d
    private final VideoShareAction W;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    @dl.d
    private final VideoFollowAction f92097a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    @dl.d
    private final VideoCollectAction f92098b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    @dl.d
    private final VideoMoreAction f92099c0;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    @dl.d
    private final VideoPostTopPanel f92100p1;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    private boolean f92101p2;

    /* JADX INFO: renamed from: x1, reason: collision with root package name */
    @dl.d
    private final BasicCenterPanel f92102x1;

    /* JADX INFO: renamed from: y1, reason: collision with root package name */
    @dl.d
    private final VerticalBottomPanel f92103y1;

    /* JADX INFO: compiled from: StoryLandscapeControlWidget.kt */
    public static final class a implements Runnable {
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43817, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            StoryLandscapeControlWidget.this.V.j(true);
            StoryLandscapeControlWidget.this.V.l(String.valueOf(StoryLandscapeControlWidget.j0(StoryLandscapeControlWidget.this)));
        }
    }

    /* JADX INFO: compiled from: StoryLandscapeControlWidget.kt */
    public static final class b implements Runnable {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43818, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            StoryLandscapeControlWidget.this.V.j(false);
            StoryLandscapeControlWidget.this.V.l(String.valueOf(StoryLandscapeControlWidget.j0(StoryLandscapeControlWidget.this)));
        }
    }

    /* JADX INFO: compiled from: StoryLandscapeControlWidget.kt */
    public static final class c implements com.max.video.device.c.a {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // com.max.video.device.c.a
        public int a(int i10) {
            Object[] objArr = {new Integer(i10)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 43828, new Class[]{cls}, cls);
            return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : com.max.video.device.c.a.C0617a.c(this, i10);
        }

        @Override // com.max.video.device.c.a
        public int b(int i10) {
            return 1;
        }

        @Override // com.max.video.device.c.a
        public int c(int i10) {
            return 9;
        }

        @Override // com.max.video.device.c.a
        public int d(int i10) {
            Object[] objArr = {new Integer(i10)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 43827, new Class[]{cls}, cls);
            return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : com.max.video.device.c.a.C0617a.a(this, i10);
        }
    }

    /* JADX INFO: compiled from: StoryLandscapeControlWidget.kt */
    public static final class d implements ze.e {
        public static ChangeQuickRedirect changeQuickRedirect;

        d() {
        }

        @Override // ze.e
        public void invoke() {
            com.max.hbstory.d dVar;
            g gVarD;
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43829, new Class[0], Void.TYPE).isSupported || (dVar = StoryLandscapeControlWidget.this.T) == null || (gVarD = dVar.d()) == null) {
                return;
            }
            gVarD.r0(false);
        }
    }

    /* JADX INFO: compiled from: StoryLandscapeControlWidget.kt */
    public static final class e implements j0<Boolean> {
        public static ChangeQuickRedirect changeQuickRedirect;

        e() {
        }

        @Override // androidx.lifecycle.j0
        public /* bridge */ /* synthetic */ void a(Boolean bool) {
            if (PatchProxy.proxy(new Object[]{bool}, this, changeQuickRedirect, false, 43839, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            b(bool);
        }

        public final void b(Boolean bool) {
            if (PatchProxy.proxy(new Object[]{bool}, this, changeQuickRedirect, false, 43838, new Class[]{Boolean.class}, Void.TYPE).isSupported) {
                return;
            }
            StoryLandscapeControlWidget.this.setSimpleView(!bool.booleanValue());
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @i
    public StoryLandscapeControlWidget(@dl.d Context context) {
        this(context, null, 0, 6, null);
        f0.p(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @i
    public StoryLandscapeControlWidget(@dl.d Context context, @dl.e AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        f0.p(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @i
    public StoryLandscapeControlWidget(@dl.d Context context, @dl.e AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        f0.p(context, "context");
        this.U = -1;
        this.V = new VideoLikeAction();
        this.W = new VideoShareAction();
        this.f92097a0 = new VideoFollowAction();
        this.f92098b0 = new VideoCollectAction();
        this.f92099c0 = new VideoMoreAction();
        this.f92100p1 = new VideoPostTopPanel(context);
        this.f92102x1 = new BasicCenterPanel(context);
        this.f92103y1 = new VerticalBottomPanel(context);
        K0();
        L0();
        J0();
        I0();
        H0();
        g();
    }

    public /* synthetic */ StoryLandscapeControlWidget(Context context, AttributeSet attributeSet, int i10, int i11, u uVar) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    private final void A0() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43794, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f92098b0.x(false);
    }

    private final String B0() {
        StoryItemsObj storyItemsObjM;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43764, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        com.max.hbstory.d dVar = this.T;
        if (dVar == null || (storyItemsObjM = StoryUtilsKt.m(dVar, this.U)) == null) {
            return null;
        }
        return storyItemsObjM.getH_src();
    }

    private final void C0(String str) {
        com.max.hbstory.c cVarC;
        if (!PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 43790, new Class[]{String.class}, Void.TYPE).isSupported && i0.e(getContext())) {
            String hSrc = getHSrc();
            String itemId = getItemId();
            com.max.hbstory.d dVar = this.T;
            if (dVar == null || (cVarC = dVar.c()) == null) {
                return;
            }
            Context context = getContext();
            f0.o(context, "context");
            cVarC.e(context, hSrc == null ? "" : hSrc, itemId == null ? "" : itemId, str, new yh.a<b2>() { // from class: com.max.xiaoheihe.module.story.widget.control.StoryLandscapeControlWidget$favorite$1
                public static ChangeQuickRedirect changeQuickRedirect;

                {
                    super(0);
                }

                /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.b2] */
                @Override // yh.a
                public /* bridge */ /* synthetic */ b2 invoke() {
                    PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43820, new Class[0], Object.class);
                    if (patchProxyResultProxy.isSupported) {
                        return patchProxyResultProxy.result;
                    }
                    invoke2();
                    return b2.f124493a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43819, new Class[0], Void.TYPE).isSupported) {
                        return;
                    }
                    StoryLandscapeControlWidget.Y(this.f92108b);
                    StoryLandscapeControlWidget.c0(this.f92108b);
                    StoryLandscapeControlWidget.p0(this.f92108b, true);
                }
            }, new l<Throwable, b2>() { // from class: com.max.xiaoheihe.module.story.widget.control.StoryLandscapeControlWidget$favorite$2
                public static ChangeQuickRedirect changeQuickRedirect;

                /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, kotlin.b2] */
                @Override // yh.l
                public /* bridge */ /* synthetic */ b2 invoke(Throwable th2) {
                    PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 43822, new Class[]{Object.class}, Object.class);
                    if (patchProxyResultProxy.isSupported) {
                        return patchProxyResultProxy.result;
                    }
                    invoke2(th2);
                    return b2.f124493a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@d Throwable it) {
                    if (PatchProxy.proxy(new Object[]{it}, this, changeQuickRedirect, false, 43821, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                        return;
                    }
                    f0.p(it, "it");
                }
            });
        }
    }

    private final void D0() {
        com.max.hbstory.d dVar;
        com.max.hbstory.c cVarC;
        StoryItemsObj storyItemsObjM;
        StoryItemsObj storyItemsObjM2;
        StoryLinkCardInfoObj link_card_info;
        StoryBBSUserInfoObj user_info;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43787, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        com.max.hbstory.d dVar2 = this.T;
        String h_src = null;
        final String userid = (dVar2 == null || (storyItemsObjM2 = StoryUtilsKt.m(dVar2, this.U)) == null || (link_card_info = storyItemsObjM2.getLink_card_info()) == null || (user_info = link_card_info.getUser_info()) == null) ? null : user_info.getUserid();
        if (userid == null || (dVar = this.T) == null || (cVarC = dVar.c()) == null) {
            return;
        }
        com.max.hbstory.d dVar3 = this.T;
        if (dVar3 != null && (storyItemsObjM = StoryUtilsKt.m(dVar3, this.U)) != null) {
            h_src = storyItemsObjM.getH_src();
        }
        cVarC.g(userid, h_src, new yh.a<b2>() { // from class: com.max.xiaoheihe.module.story.widget.control.StoryLandscapeControlWidget$follow$1
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.b2] */
            @Override // yh.a
            public /* bridge */ /* synthetic */ b2 invoke() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43824, new Class[0], Object.class);
                if (patchProxyResultProxy.isSupported) {
                    return patchProxyResultProxy.result;
                }
                invoke2();
                return b2.f124493a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                StoryItemsObj storyItemsObjM3;
                StoryLinkCardInfoObj link_card_info2;
                if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43823, new Class[0], Void.TYPE).isSupported) {
                    return;
                }
                com.max.hbstory.d dVar4 = this.f92110b.T;
                StoryBBSUserInfoObj user_info2 = (dVar4 == null || (storyItemsObjM3 = StoryUtilsKt.m(dVar4, this.f92110b.U)) == null || (link_card_info2 = storyItemsObjM3.getLink_card_info()) == null) ? null : link_card_info2.getUser_info();
                if (user_info2 != null) {
                    user_info2.setFollow_status("1");
                }
                StoryLandscapeControlWidget.q0(this.f92110b, true, userid);
            }
        }, new l<Throwable, b2>() { // from class: com.max.xiaoheihe.module.story.widget.control.StoryLandscapeControlWidget$follow$2
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, kotlin.b2] */
            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(Throwable th2) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 43826, new Class[]{Object.class}, Object.class);
                if (patchProxyResultProxy.isSupported) {
                    return patchProxyResultProxy.result;
                }
                invoke2(th2);
                return b2.f124493a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@d Throwable it) {
                if (PatchProxy.proxy(new Object[]{it}, this, changeQuickRedirect, false, 43825, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                    return;
                }
                f0.p(it, "it");
            }
        });
    }

    private final StoryItemsObj E0(com.max.hbstory.d dVar, int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{dVar, new Integer(i10)}, this, changeQuickRedirect, false, 43798, new Class[]{com.max.hbstory.d.class, Integer.TYPE}, StoryItemsObj.class);
        return patchProxyResultProxy.isSupported ? (StoryItemsObj) patchProxyResultProxy.result : StoryUtilsKt.m(dVar, this.U);
    }

    private final String F0(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 43774, new Class[]{String.class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        if (!f0.g("0", str)) {
            if (f0.g("1", str)) {
                return "0";
            }
            if (f0.g("2", str)) {
                return "3";
            }
            if (f0.g("3", str)) {
                return "2";
            }
        }
        return "1";
    }

    private final void G0(f... fVarArr) {
        if (PatchProxy.proxy(new Object[]{fVarArr}, this, changeQuickRedirect, false, 43782, new Class[]{f[].class}, Void.TYPE).isSupported) {
            return;
        }
        for (f fVar : fVarArr) {
            Context context = getContext();
            f0.o(context, "context");
            fVar.a(context);
            this.f92100p1.b(fVar);
        }
    }

    private final void H0() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43762, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        VideoFollowAction videoFollowAction = this.f92097a0;
        Context context = getContext();
        f0.o(context, "context");
        videoFollowAction.a(context);
        this.f92100p1.l(this.f92097a0);
    }

    private final void I0() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43778, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        setOrientationChangeListener(new c());
    }

    private final void J0() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43780, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        m(this.f92100p1).k(this.f92102x1).q(this.f92103y1);
    }

    private final void K0() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43779, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f92100p1.setBackwardAction(new d());
    }

    private final void L0() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43781, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        G0(this.V, this.f92099c0);
    }

    private final void M0(boolean z10) {
        com.max.hbstory.d dVar;
        g gVarD;
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 43789, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported || (dVar = this.T) == null || (gVarD = dVar.d()) == null) {
            return;
        }
        gVarD.Z(z10);
    }

    private final void N0(boolean z10, String str) {
        com.max.hbstory.d dVar;
        g gVarD;
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0), str}, this, changeQuickRedirect, false, 43788, new Class[]{Boolean.TYPE, String.class}, Void.TYPE).isSupported || (dVar = this.T) == null || (gVarD = dVar.d()) == null) {
            return;
        }
        gVarD.a0(new g.b(z10, str));
    }

    private final void O0() {
        final com.max.hbstory.d dVar;
        Fragment fragmentB;
        g gVarD;
        LiveData<Boolean> liveDataK;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43768, new Class[0], Void.TYPE).isSupported || (dVar = this.T) == null || (fragmentB = dVar.b()) == null || (gVarD = dVar.d()) == null || (liveDataK = gVarD.K()) == null) {
            return;
        }
        liveDataK.k(fragmentB, new j0<Boolean>() { // from class: com.max.xiaoheihe.module.story.widget.control.StoryLandscapeControlWidget$observeFavourState$1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // androidx.lifecycle.j0
            public /* bridge */ /* synthetic */ void a(Boolean bool) {
                if (PatchProxy.proxy(new Object[]{bool}, this, changeQuickRedirect, false, 43831, new Class[]{Object.class}, Void.TYPE).isSupported) {
                    return;
                }
                b(bool);
            }

            public final void b(final Boolean bool) {
                if (PatchProxy.proxy(new Object[]{bool}, this, changeQuickRedirect, false, 43830, new Class[]{Boolean.class}, Void.TYPE).isSupported) {
                    return;
                }
                com.max.hbstory.d dVar2 = dVar;
                int i10 = this.U;
                final StoryLandscapeControlWidget storyLandscapeControlWidget = this;
                StoryUtilsKt.e(dVar2, i10, new a<b2>() { // from class: com.max.xiaoheihe.module.story.widget.control.StoryLandscapeControlWidget$observeFavourState$1$onChanged$1
                    public static ChangeQuickRedirect changeQuickRedirect;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.b2] */
                    @Override // yh.a
                    public /* bridge */ /* synthetic */ b2 invoke() {
                        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43833, new Class[0], Object.class);
                        if (patchProxyResultProxy.isSupported) {
                            return patchProxyResultProxy.result;
                        }
                        invoke2();
                        return b2.f124493a;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43832, new Class[0], Void.TYPE).isSupported || f0.g(storyLandscapeControlWidget.f92098b0.h().getValue(), bool)) {
                            return;
                        }
                        Boolean isFavorited = bool;
                        f0.o(isFavorited, "isFavorited");
                        if (isFavorited.booleanValue()) {
                            StoryLandscapeControlWidget.c0(storyLandscapeControlWidget);
                        } else {
                            StoryLandscapeControlWidget.e0(storyLandscapeControlWidget);
                        }
                    }
                });
            }
        });
    }

    private final void P0() {
        final com.max.hbstory.d dVar;
        Fragment fragmentB;
        g gVarD;
        LiveData<g.b> liveDataL;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43767, new Class[0], Void.TYPE).isSupported || (dVar = this.T) == null || (fragmentB = dVar.b()) == null || (gVarD = dVar.d()) == null || (liveDataL = gVarD.L()) == null) {
            return;
        }
        liveDataL.k(fragmentB, new j0<g.b>() { // from class: com.max.xiaoheihe.module.story.widget.control.StoryLandscapeControlWidget$observeFollowState$1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // androidx.lifecycle.j0
            public /* bridge */ /* synthetic */ void a(g.b bVar) {
                if (PatchProxy.proxy(new Object[]{bVar}, this, changeQuickRedirect, false, 43835, new Class[]{Object.class}, Void.TYPE).isSupported) {
                    return;
                }
                b(bVar);
            }

            public final void b(final g.b bVar) {
                if (PatchProxy.proxy(new Object[]{bVar}, this, changeQuickRedirect, false, 43834, new Class[]{g.b.class}, Void.TYPE).isSupported) {
                    return;
                }
                com.max.hbstory.d dVar2 = dVar;
                int i10 = this.U;
                final StoryLandscapeControlWidget storyLandscapeControlWidget = this;
                StoryUtilsKt.e(dVar2, i10, new a<b2>() { // from class: com.max.xiaoheihe.module.story.widget.control.StoryLandscapeControlWidget$observeFollowState$1$onChanged$1
                    public static ChangeQuickRedirect changeQuickRedirect;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.b2] */
                    @Override // yh.a
                    public /* bridge */ /* synthetic */ b2 invoke() {
                        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43837, new Class[0], Object.class);
                        if (patchProxyResultProxy.isSupported) {
                            return patchProxyResultProxy.result;
                        }
                        invoke2();
                        return b2.f124493a;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43836, new Class[0], Void.TYPE).isSupported || storyLandscapeControlWidget.f92097a0.j().getValue().booleanValue() == bVar.f()) {
                            return;
                        }
                        storyLandscapeControlWidget.f92097a0.p(bVar.f());
                    }
                });
            }
        });
    }

    private final void Q0() {
        com.max.hbstory.d dVar;
        Fragment fragmentB;
        com.max.hbstory.d dVar2;
        g gVarD;
        LiveData<Boolean> liveDataO;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43785, new Class[0], Void.TYPE).isSupported || (dVar = this.T) == null || (fragmentB = dVar.b()) == null || (dVar2 = this.T) == null || (gVarD = dVar2.d()) == null || (liveDataO = gVarD.O()) == null) {
            return;
        }
        liveDataO.k(fragmentB, new e());
    }

    private final void R0() {
        final com.max.hbstory.d dVar;
        Fragment fragmentB;
        g gVarD;
        LiveData<Boolean> liveDataN;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43766, new Class[0], Void.TYPE).isSupported || (dVar = this.T) == null || (fragmentB = dVar.b()) == null || (gVarD = dVar.d()) == null || (liveDataN = gVarD.N()) == null) {
            return;
        }
        liveDataN.k(fragmentB, new j0<Boolean>() { // from class: com.max.xiaoheihe.module.story.widget.control.StoryLandscapeControlWidget$observeLikeState$1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // androidx.lifecycle.j0
            public /* bridge */ /* synthetic */ void a(Boolean bool) {
                if (PatchProxy.proxy(new Object[]{bool}, this, changeQuickRedirect, false, 43841, new Class[]{Object.class}, Void.TYPE).isSupported) {
                    return;
                }
                b(bool);
            }

            public final void b(final Boolean bool) {
                if (PatchProxy.proxy(new Object[]{bool}, this, changeQuickRedirect, false, 43840, new Class[]{Boolean.class}, Void.TYPE).isSupported) {
                    return;
                }
                com.max.hbstory.d dVar2 = dVar;
                int i10 = this.U;
                final StoryLandscapeControlWidget storyLandscapeControlWidget = this;
                StoryUtilsKt.e(dVar2, i10, new a<b2>() { // from class: com.max.xiaoheihe.module.story.widget.control.StoryLandscapeControlWidget$observeLikeState$1$onChanged$1
                    public static ChangeQuickRedirect changeQuickRedirect;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.b2] */
                    @Override // yh.a
                    public /* bridge */ /* synthetic */ b2 invoke() {
                        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43843, new Class[0], Object.class);
                        if (patchProxyResultProxy.isSupported) {
                            return patchProxyResultProxy.result;
                        }
                        invoke2();
                        return b2.f124493a;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43842, new Class[0], Void.TYPE).isSupported || f0.g(bool, Boolean.valueOf(storyLandscapeControlWidget.V.i()))) {
                            return;
                        }
                        Boolean isLike = bool;
                        f0.o(isLike, "isLike");
                        if (isLike.booleanValue()) {
                            StoryLandscapeControlWidget.X(storyLandscapeControlWidget);
                        } else {
                            StoryLandscapeControlWidget.d0(storyLandscapeControlWidget);
                        }
                    }
                });
            }
        });
    }

    private final void S0() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43783, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        com.max.hbstory.d dVar = this.T;
        Context contextA = dVar != null ? dVar.a() : null;
        Activity activity = contextA instanceof Activity ? (Activity) contextA : null;
        if (activity != null) {
            VideoPlayerManager.f76079a.e(activity);
        }
    }

    private final void T0() {
        com.max.hbstory.d dVar;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43770, new Class[0], Void.TYPE).isSupported || (dVar = this.T) == null) {
            return;
        }
        StoryUtilsKt.o(dVar, this.U, new l<StoryItemsObj, b2>() { // from class: com.max.xiaoheihe.module.story.widget.control.StoryLandscapeControlWidget$onDislike$1
            public static ChangeQuickRedirect changeQuickRedirect;

            {
                super(1);
            }

            public final void a(@e StoryItemsObj storyItemsObj) {
                c cVarC;
                if (PatchProxy.proxy(new Object[]{storyItemsObj}, this, changeQuickRedirect, false, 43844, new Class[]{StoryItemsObj.class}, Void.TYPE).isSupported || storyItemsObj == null) {
                    return;
                }
                final StoryLandscapeControlWidget storyLandscapeControlWidget = this.f92125b;
                com.max.hbstory.d dVar2 = storyLandscapeControlWidget.T;
                if (dVar2 == null || (cVarC = dVar2.c()) == null) {
                    return;
                }
                StoryCardIdInfoObj card_id_info = storyItemsObj.getCard_id_info();
                cVarC.f(card_id_info != null ? card_id_info.getItem_id() : null, storyItemsObj.getH_src(), "0", new HashMap(), new a<b2>() { // from class: com.max.xiaoheihe.module.story.widget.control.StoryLandscapeControlWidget$onDislike$1$1$1
                    public static ChangeQuickRedirect changeQuickRedirect;

                    {
                        super(0);
                    }

                    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.b2] */
                    @Override // yh.a
                    public /* bridge */ /* synthetic */ b2 invoke() {
                        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43847, new Class[0], Object.class);
                        if (patchProxyResultProxy.isSupported) {
                            return patchProxyResultProxy.result;
                        }
                        invoke2();
                        return b2.f124493a;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43846, new Class[0], Void.TYPE).isSupported) {
                            return;
                        }
                        StoryLandscapeControlWidget.b0(storyLandscapeControlWidget);
                        StoryLandscapeControlWidget.d0(storyLandscapeControlWidget);
                    }
                }, new l<Throwable, b2>() { // from class: com.max.xiaoheihe.module.story.widget.control.StoryLandscapeControlWidget$onDislike$1$1$2
                    public static ChangeQuickRedirect changeQuickRedirect;

                    /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, kotlin.b2] */
                    @Override // yh.l
                    public /* bridge */ /* synthetic */ b2 invoke(Throwable th2) {
                        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 43849, new Class[]{Object.class}, Object.class);
                        if (patchProxyResultProxy.isSupported) {
                            return patchProxyResultProxy.result;
                        }
                        invoke2(th2);
                        return b2.f124493a;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@d Throwable it) {
                        if (PatchProxy.proxy(new Object[]{it}, this, changeQuickRedirect, false, 43848, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                            return;
                        }
                        f0.p(it, "it");
                    }
                });
            }

            /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, kotlin.b2] */
            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(StoryItemsObj storyItemsObj) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{storyItemsObj}, this, changeQuickRedirect, false, 43845, new Class[]{Object.class}, Object.class);
                if (patchProxyResultProxy.isSupported) {
                    return patchProxyResultProxy.result;
                }
                a(storyItemsObj);
                return b2.f124493a;
            }
        });
    }

    private final void U0() {
        com.max.hbstory.d dVar;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43769, new Class[0], Void.TYPE).isSupported || (dVar = this.T) == null) {
            return;
        }
        StoryUtilsKt.o(dVar, this.U, new l<StoryItemsObj, b2>() { // from class: com.max.xiaoheihe.module.story.widget.control.StoryLandscapeControlWidget$onLike$1
            public static ChangeQuickRedirect changeQuickRedirect;

            {
                super(1);
            }

            public final void a(@e StoryItemsObj storyItemsObj) {
                c cVarC;
                if (PatchProxy.proxy(new Object[]{storyItemsObj}, this, changeQuickRedirect, false, 43850, new Class[]{StoryItemsObj.class}, Void.TYPE).isSupported || storyItemsObj == null) {
                    return;
                }
                final StoryLandscapeControlWidget storyLandscapeControlWidget = this.f92128b;
                com.max.hbstory.d dVar2 = storyLandscapeControlWidget.T;
                if (dVar2 == null || (cVarC = dVar2.c()) == null) {
                    return;
                }
                StoryCardIdInfoObj card_id_info = storyItemsObj.getCard_id_info();
                cVarC.f(card_id_info != null ? card_id_info.getItem_id() : null, storyItemsObj.getH_src(), "1", new HashMap(), new a<b2>() { // from class: com.max.xiaoheihe.module.story.widget.control.StoryLandscapeControlWidget$onLike$1$1$1
                    public static ChangeQuickRedirect changeQuickRedirect;

                    {
                        super(0);
                    }

                    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.b2] */
                    @Override // yh.a
                    public /* bridge */ /* synthetic */ b2 invoke() {
                        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43853, new Class[0], Object.class);
                        if (patchProxyResultProxy.isSupported) {
                            return patchProxyResultProxy.result;
                        }
                        invoke2();
                        return b2.f124493a;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43852, new Class[0], Void.TYPE).isSupported) {
                            return;
                        }
                        StoryLandscapeControlWidget.Z(storyLandscapeControlWidget);
                        StoryLandscapeControlWidget.X(storyLandscapeControlWidget);
                    }
                }, new l<Throwable, b2>() { // from class: com.max.xiaoheihe.module.story.widget.control.StoryLandscapeControlWidget$onLike$1$1$2
                    public static ChangeQuickRedirect changeQuickRedirect;

                    /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, kotlin.b2] */
                    @Override // yh.l
                    public /* bridge */ /* synthetic */ b2 invoke(Throwable th2) {
                        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 43855, new Class[]{Object.class}, Object.class);
                        if (patchProxyResultProxy.isSupported) {
                            return patchProxyResultProxy.result;
                        }
                        invoke2(th2);
                        return b2.f124493a;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@d Throwable it) {
                        if (PatchProxy.proxy(new Object[]{it}, this, changeQuickRedirect, false, 43854, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                            return;
                        }
                        f0.p(it, "it");
                    }
                });
            }

            /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, kotlin.b2] */
            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(StoryItemsObj storyItemsObj) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{storyItemsObj}, this, changeQuickRedirect, false, 43851, new Class[]{Object.class}, Object.class);
                if (patchProxyResultProxy.isSupported) {
                    return patchProxyResultProxy.result;
                }
                a(storyItemsObj);
                return b2.f124493a;
            }
        });
    }

    private final void V0() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43791, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f92098b0.q(new l<String, b2>() { // from class: com.max.xiaoheihe.module.story.widget.control.StoryLandscapeControlWidget$updateCollection$1
            public static ChangeQuickRedirect changeQuickRedirect;

            {
                super(1);
            }

            /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, kotlin.b2] */
            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(String str) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 43857, new Class[]{Object.class}, Object.class);
                if (patchProxyResultProxy.isSupported) {
                    return patchProxyResultProxy.result;
                }
                invoke2(str);
                return b2.f124493a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@e String str) {
                if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 43856, new Class[]{String.class}, Void.TYPE).isSupported) {
                    return;
                }
                StoryLandscapeControlWidget.f0(this.f92131b, str);
            }
        });
        this.f92098b0.t(new yh.a<b2>() { // from class: com.max.xiaoheihe.module.story.widget.control.StoryLandscapeControlWidget$updateCollection$2
            public static ChangeQuickRedirect changeQuickRedirect;

            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.b2] */
            @Override // yh.a
            public /* bridge */ /* synthetic */ b2 invoke() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43859, new Class[0], Object.class);
                if (patchProxyResultProxy.isSupported) {
                    return patchProxyResultProxy.result;
                }
                invoke2();
                return b2.f124493a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                c cVarC;
                if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43858, new Class[0], Void.TYPE).isSupported && i0.e(this.f92132b.getContext())) {
                    String strH0 = StoryLandscapeControlWidget.h0(this.f92132b);
                    String strI0 = StoryLandscapeControlWidget.i0(this.f92132b);
                    com.max.hbstory.d dVar = this.f92132b.T;
                    if (dVar == null || (cVarC = dVar.c()) == null) {
                        return;
                    }
                    Context context = this.f92132b.getContext();
                    f0.o(context, "context");
                    String str = strH0 == null ? "" : strH0;
                    String str2 = strI0 == null ? "" : strI0;
                    final StoryLandscapeControlWidget storyLandscapeControlWidget = this.f92132b;
                    cVarC.b(context, str, str2, new a<b2>() { // from class: com.max.xiaoheihe.module.story.widget.control.StoryLandscapeControlWidget$updateCollection$2.1
                        public static ChangeQuickRedirect changeQuickRedirect;

                        {
                            super(0);
                        }

                        /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.b2] */
                        @Override // yh.a
                        public /* bridge */ /* synthetic */ b2 invoke() {
                            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43861, new Class[0], Object.class);
                            if (patchProxyResultProxy.isSupported) {
                                return patchProxyResultProxy.result;
                            }
                            invoke2();
                            return b2.f124493a;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43860, new Class[0], Void.TYPE).isSupported) {
                                return;
                            }
                            StoryLandscapeControlWidget.a0(storyLandscapeControlWidget);
                            StoryLandscapeControlWidget.e0(storyLandscapeControlWidget);
                            StoryLandscapeControlWidget.p0(storyLandscapeControlWidget, false);
                        }
                    }, new l<Throwable, b2>() { // from class: com.max.xiaoheihe.module.story.widget.control.StoryLandscapeControlWidget$updateCollection$2.2
                        public static ChangeQuickRedirect changeQuickRedirect;

                        /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, kotlin.b2] */
                        @Override // yh.l
                        public /* bridge */ /* synthetic */ b2 invoke(Throwable th2) {
                            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 43863, new Class[]{Object.class}, Object.class);
                            if (patchProxyResultProxy.isSupported) {
                                return patchProxyResultProxy.result;
                            }
                            invoke2(th2);
                            return b2.f124493a;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@d Throwable it) {
                            if (PatchProxy.proxy(new Object[]{it}, this, changeQuickRedirect, false, 43862, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                                return;
                            }
                            f0.p(it, "it");
                        }
                    });
                }
            }
        });
        this.f92098b0.p(new yh.a<b2>() { // from class: com.max.xiaoheihe.module.story.widget.control.StoryLandscapeControlWidget$updateCollection$3
            public static ChangeQuickRedirect changeQuickRedirect;

            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.b2] */
            @Override // yh.a
            public /* bridge */ /* synthetic */ b2 invoke() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43865, new Class[0], Object.class);
                if (patchProxyResultProxy.isSupported) {
                    return patchProxyResultProxy.result;
                }
                invoke2();
                return b2.f124493a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43864, new Class[0], Void.TYPE).isSupported || !i0.e(this.f92135b.getContext()) || this.f92135b.f92098b0.h().getValue().booleanValue()) {
                    return;
                }
                VideoCollectAction videoCollectAction = this.f92135b.f92098b0;
                Context context = this.f92135b.getContext();
                f0.o(context, "context");
                videoCollectAction.j(context, this.f92135b, false);
            }
        });
    }

    private final void W0() {
        com.max.hbstory.d dVar;
        StoryItemsObj storyItemsObjM;
        StoryLinkCardInfoObj link_card_info;
        StoryBBSUserInfoObj user_info;
        StoryItemsObj storyItemsObjM2;
        StoryLinkCardInfoObj link_card_info2;
        StoryBBSUserInfoObj user_info2;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43786, new Class[0], Void.TYPE).isSupported || (dVar = this.T) == null || (storyItemsObjM = StoryUtilsKt.m(dVar, this.U)) == null || (link_card_info = storyItemsObjM.getLink_card_info()) == null || (user_info = link_card_info.getUser_info()) == null) {
            return;
        }
        Gson gson = new Gson();
        BBSUserInfoObj bBSUserInfoObj = (BBSUserInfoObj) gson.fromJson(gson.toJson(user_info), BBSUserInfoObj.class);
        VideoFollowAction videoFollowAction = this.f92097a0;
        Context context = getContext();
        f0.o(context, "context");
        videoFollowAction.o(context, bBSUserInfoObj);
        com.max.hbstory.d dVar2 = this.T;
        String follow_status = (dVar2 == null || (storyItemsObjM2 = StoryUtilsKt.m(dVar2, this.U)) == null || (link_card_info2 = storyItemsObjM2.getLink_card_info()) == null || (user_info2 = link_card_info2.getUser_info()) == null) ? null : user_info2.getFollow_status();
        if (follow_status == null) {
            follow_status = "0";
        }
        if (f0.g(follow_status, "1") || f0.g(follow_status, "3")) {
            this.f92097a0.p(true);
        } else {
            this.f92097a0.p(false);
        }
        this.f92097a0.m(new yh.a<b2>() { // from class: com.max.xiaoheihe.module.story.widget.control.StoryLandscapeControlWidget$updateFollow$1
            public static ChangeQuickRedirect changeQuickRedirect;

            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.b2] */
            @Override // yh.a
            public /* bridge */ /* synthetic */ b2 invoke() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43867, new Class[0], Object.class);
                if (patchProxyResultProxy.isSupported) {
                    return patchProxyResultProxy.result;
                }
                invoke2();
                return b2.f124493a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43866, new Class[0], Void.TYPE).isSupported) {
                    return;
                }
                StoryLandscapeControlWidget.g0(this.f92136b);
            }
        });
    }

    public static final /* synthetic */ void X(StoryLandscapeControlWidget storyLandscapeControlWidget) {
        if (PatchProxy.proxy(new Object[]{storyLandscapeControlWidget}, null, changeQuickRedirect, true, 43800, new Class[]{StoryLandscapeControlWidget.class}, Void.TYPE).isSupported) {
            return;
        }
        storyLandscapeControlWidget.t0();
    }

    private final void X0(final boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 43763, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        final VideoMoreAction videoMoreAction = this.f92099c0;
        Context context = getContext();
        f0.o(context, "context");
        videoMoreAction.a(context);
        videoMoreAction.z(new l<io.reactivex.disposables.b, b2>() { // from class: com.max.xiaoheihe.module.story.widget.control.StoryLandscapeControlWidget$updateTopMoreAction$1$1
            public static ChangeQuickRedirect changeQuickRedirect;

            public final void a(@e b bVar) {
            }

            /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, kotlin.b2] */
            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(b bVar) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{bVar}, this, changeQuickRedirect, false, 43868, new Class[]{Object.class}, Object.class);
                if (patchProxyResultProxy.isSupported) {
                    return patchProxyResultProxy.result;
                }
                a(bVar);
                return b2.f124493a;
            }
        });
        videoMoreAction.w(new l<Boolean, b2>() { // from class: com.max.xiaoheihe.module.story.widget.control.StoryLandscapeControlWidget$updateTopMoreAction$1$2
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void a(boolean z11) {
                if (PatchProxy.proxy(new Object[]{new Byte(z11 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 43869, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
                    return;
                }
                if (!z11) {
                    this.r();
                    return;
                }
                if (z10) {
                    StoryLandscapeControlWidget storyLandscapeControlWidget = this;
                    LinearLayout linearLayoutB = videoMoreAction.p().b();
                    f0.o(linearLayoutB, "menuVerticalBinding.root");
                    storyLandscapeControlWidget.h(linearLayoutB);
                    return;
                }
                StoryLandscapeControlWidget storyLandscapeControlWidget2 = this;
                LinearLayout linearLayoutB2 = videoMoreAction.o().b();
                f0.o(linearLayoutB2, "menuBinding.root");
                storyLandscapeControlWidget2.c(linearLayoutB2);
            }

            /* JADX WARN: Type inference failed for: r9v4, types: [java.lang.Object, kotlin.b2] */
            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(Boolean bool) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{bool}, this, changeQuickRedirect, false, 43870, new Class[]{Object.class}, Object.class);
                if (patchProxyResultProxy.isSupported) {
                    return patchProxyResultProxy.result;
                }
                a(bool.booleanValue());
                return b2.f124493a;
            }
        });
        String itemId = getItemId();
        Context context2 = getContext();
        f0.o(context2, "context");
        videoMoreAction.l(itemId, context2, B0());
        VideoViewX videoViewX = this.S;
        if (videoViewX != null) {
            Context context3 = getContext();
            f0.o(context3, "context");
            videoMoreAction.m(context3, videoViewX);
        }
        Context context4 = getContext();
        f0.o(context4, "context");
        videoMoreAction.k(context4, this.f92098b0);
    }

    public static final /* synthetic */ void Y(StoryLandscapeControlWidget storyLandscapeControlWidget) {
        if (PatchProxy.proxy(new Object[]{storyLandscapeControlWidget}, null, changeQuickRedirect, true, 43809, new Class[]{StoryLandscapeControlWidget.class}, Void.TYPE).isSupported) {
            return;
        }
        storyLandscapeControlWidget.u0();
    }

    private final void Y0() {
        String title;
        StoryItemsObj storyItemsObjM;
        StoryLinkCardInfoObj link_card_info;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43797, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        com.max.hbstory.d dVar = this.T;
        if (dVar == null || (storyItemsObjM = StoryUtilsKt.m(dVar, this.U)) == null || (link_card_info = storyItemsObjM.getLink_card_info()) == null || (title = link_card_info.getTitle()) == null) {
            title = "";
        }
        this.f92100p1.setTitle(title);
    }

    public static final /* synthetic */ void Z(StoryLandscapeControlWidget storyLandscapeControlWidget) {
        if (PatchProxy.proxy(new Object[]{storyLandscapeControlWidget}, null, changeQuickRedirect, true, 43804, new Class[]{StoryLandscapeControlWidget.class}, Void.TYPE).isSupported) {
            return;
        }
        storyLandscapeControlWidget.v0();
    }

    private final void Z0(com.max.hbstory.d dVar, int i10) {
        StoryItemsObj storyItemsObjE0;
        StoryLinkCardInfoObj link_card_info;
        StoryStatInfoObj stat_info;
        StoryStatInfoObj stat_info2;
        int link_award_num = 0;
        if (PatchProxy.proxy(new Object[]{dVar, new Integer(i10)}, this, changeQuickRedirect, false, 43799, new Class[]{com.max.hbstory.d.class, Integer.TYPE}, Void.TYPE).isSupported || (storyItemsObjE0 = E0(dVar, i10)) == null || (link_card_info = storyItemsObjE0.getLink_card_info()) == null || (stat_info = link_card_info.getStat_info()) == null) {
            return;
        }
        boolean zIs_award_link = stat_info.is_award_link();
        StoryLinkCardInfoObj link_card_info2 = storyItemsObjE0.getLink_card_info();
        if (link_card_info2 != null && (stat_info2 = link_card_info2.getStat_info()) != null) {
            link_award_num = stat_info2.getLink_award_num();
        }
        this.V.j(zIs_award_link);
        this.V.l(String.valueOf(link_award_num));
        this.V.k(new yh.a<b2>() { // from class: com.max.xiaoheihe.module.story.widget.control.StoryLandscapeControlWidget$updateVideoLike$1
            public static ChangeQuickRedirect changeQuickRedirect;

            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.b2] */
            @Override // yh.a
            public /* bridge */ /* synthetic */ b2 invoke() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43872, new Class[0], Object.class);
                if (patchProxyResultProxy.isSupported) {
                    return patchProxyResultProxy.result;
                }
                invoke2();
                return b2.f124493a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43871, new Class[0], Void.TYPE).isSupported) {
                    return;
                }
                if (this.f92141b.V.i()) {
                    StoryLandscapeControlWidget.s0(this.f92141b);
                } else {
                    StoryLandscapeControlWidget.r0(this.f92141b);
                }
            }
        });
    }

    public static final /* synthetic */ void a0(StoryLandscapeControlWidget storyLandscapeControlWidget) {
        if (PatchProxy.proxy(new Object[]{storyLandscapeControlWidget}, null, changeQuickRedirect, true, 43814, new Class[]{StoryLandscapeControlWidget.class}, Void.TYPE).isSupported) {
            return;
        }
        storyLandscapeControlWidget.w0();
    }

    public static final /* synthetic */ void b0(StoryLandscapeControlWidget storyLandscapeControlWidget) {
        if (PatchProxy.proxy(new Object[]{storyLandscapeControlWidget}, null, changeQuickRedirect, true, 43805, new Class[]{StoryLandscapeControlWidget.class}, Void.TYPE).isSupported) {
            return;
        }
        storyLandscapeControlWidget.x0();
    }

    public static final /* synthetic */ void c0(StoryLandscapeControlWidget storyLandscapeControlWidget) {
        if (PatchProxy.proxy(new Object[]{storyLandscapeControlWidget}, null, changeQuickRedirect, true, 43802, new Class[]{StoryLandscapeControlWidget.class}, Void.TYPE).isSupported) {
            return;
        }
        storyLandscapeControlWidget.y0();
    }

    public static final /* synthetic */ void d0(StoryLandscapeControlWidget storyLandscapeControlWidget) {
        if (PatchProxy.proxy(new Object[]{storyLandscapeControlWidget}, null, changeQuickRedirect, true, 43801, new Class[]{StoryLandscapeControlWidget.class}, Void.TYPE).isSupported) {
            return;
        }
        storyLandscapeControlWidget.z0();
    }

    public static final /* synthetic */ void e0(StoryLandscapeControlWidget storyLandscapeControlWidget) {
        if (PatchProxy.proxy(new Object[]{storyLandscapeControlWidget}, null, changeQuickRedirect, true, 43803, new Class[]{StoryLandscapeControlWidget.class}, Void.TYPE).isSupported) {
            return;
        }
        storyLandscapeControlWidget.A0();
    }

    public static final /* synthetic */ void f0(StoryLandscapeControlWidget storyLandscapeControlWidget, String str) {
        if (PatchProxy.proxy(new Object[]{storyLandscapeControlWidget, str}, null, changeQuickRedirect, true, 43811, new Class[]{StoryLandscapeControlWidget.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        storyLandscapeControlWidget.C0(str);
    }

    public static final /* synthetic */ void g0(StoryLandscapeControlWidget storyLandscapeControlWidget) {
        if (PatchProxy.proxy(new Object[]{storyLandscapeControlWidget}, null, changeQuickRedirect, true, 43807, new Class[]{StoryLandscapeControlWidget.class}, Void.TYPE).isSupported) {
            return;
        }
        storyLandscapeControlWidget.D0();
    }

    private final String getHSrc() {
        StoryItemsObj storyItemsObjM;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43796, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        com.max.hbstory.d dVar = this.T;
        if (dVar == null || (storyItemsObjM = StoryUtilsKt.m(dVar, this.U)) == null) {
            return null;
        }
        return storyItemsObjM.getH_src();
    }

    private final String getItemId() {
        StoryItemsObj storyItemsObjM;
        StoryCardIdInfoObj card_id_info;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43765, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        com.max.hbstory.d dVar = this.T;
        if (dVar == null || (storyItemsObjM = StoryUtilsKt.m(dVar, this.U)) == null || (card_id_info = storyItemsObjM.getCard_id_info()) == null) {
            return null;
        }
        return card_id_info.getItem_id();
    }

    private final int getLikeCount() {
        StoryItemsObj storyItemsObjM;
        StoryLinkCardInfoObj link_card_info;
        StoryStatInfoObj stat_info;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43775, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        com.max.hbstory.d dVar = this.T;
        if (dVar == null || (storyItemsObjM = StoryUtilsKt.m(dVar, this.U)) == null || (link_card_info = storyItemsObjM.getLink_card_info()) == null || (stat_info = link_card_info.getStat_info()) == null) {
            return 0;
        }
        return stat_info.getLink_award_num();
    }

    public static final /* synthetic */ String h0(StoryLandscapeControlWidget storyLandscapeControlWidget) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{storyLandscapeControlWidget}, null, changeQuickRedirect, true, 43812, new Class[]{StoryLandscapeControlWidget.class}, String.class);
        return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : storyLandscapeControlWidget.getHSrc();
    }

    public static final /* synthetic */ String i0(StoryLandscapeControlWidget storyLandscapeControlWidget) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{storyLandscapeControlWidget}, null, changeQuickRedirect, true, 43813, new Class[]{StoryLandscapeControlWidget.class}, String.class);
        return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : storyLandscapeControlWidget.getItemId();
    }

    public static final /* synthetic */ int j0(StoryLandscapeControlWidget storyLandscapeControlWidget) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{storyLandscapeControlWidget}, null, changeQuickRedirect, true, 43806, new Class[]{StoryLandscapeControlWidget.class}, Integer.TYPE);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : storyLandscapeControlWidget.getLikeCount();
    }

    public static final /* synthetic */ void p0(StoryLandscapeControlWidget storyLandscapeControlWidget, boolean z10) {
        if (PatchProxy.proxy(new Object[]{storyLandscapeControlWidget, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 43810, new Class[]{StoryLandscapeControlWidget.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        storyLandscapeControlWidget.M0(z10);
    }

    public static final /* synthetic */ void q0(StoryLandscapeControlWidget storyLandscapeControlWidget, boolean z10, String str) {
        if (PatchProxy.proxy(new Object[]{storyLandscapeControlWidget, new Byte(z10 ? (byte) 1 : (byte) 0), str}, null, changeQuickRedirect, true, 43808, new Class[]{StoryLandscapeControlWidget.class, Boolean.TYPE, String.class}, Void.TYPE).isSupported) {
            return;
        }
        storyLandscapeControlWidget.N0(z10, str);
    }

    public static final /* synthetic */ void r0(StoryLandscapeControlWidget storyLandscapeControlWidget) {
        if (PatchProxy.proxy(new Object[]{storyLandscapeControlWidget}, null, changeQuickRedirect, true, 43816, new Class[]{StoryLandscapeControlWidget.class}, Void.TYPE).isSupported) {
            return;
        }
        storyLandscapeControlWidget.T0();
    }

    public static final /* synthetic */ void s0(StoryLandscapeControlWidget storyLandscapeControlWidget) {
        if (PatchProxy.proxy(new Object[]{storyLandscapeControlWidget}, null, changeQuickRedirect, true, 43815, new Class[]{StoryLandscapeControlWidget.class}, Void.TYPE).isSupported) {
            return;
        }
        storyLandscapeControlWidget.U0();
    }

    private final void setLikeCount(int i10) {
        StoryItemsObj storyItemsObjM;
        StoryLinkCardInfoObj link_card_info;
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 43776, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        com.max.hbstory.d dVar = this.T;
        StoryStatInfoObj stat_info = (dVar == null || (storyItemsObjM = StoryUtilsKt.m(dVar, this.U)) == null || (link_card_info = storyItemsObjM.getLink_card_info()) == null) ? null : link_card_info.getStat_info();
        if (stat_info == null) {
            return;
        }
        stat_info.setLink_award_num(i10);
    }

    private final void t0() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43777, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        post(new a());
    }

    private final void u0() {
        StoryItemsObj storyItemsObjM;
        StoryLinkCardInfoObj link_card_info;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43793, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        com.max.hbstory.d dVar = this.T;
        StoryStatInfoObj stat_info = (dVar == null || (storyItemsObjM = StoryUtilsKt.m(dVar, this.U)) == null || (link_card_info = storyItemsObjM.getLink_card_info()) == null) ? null : link_card_info.getStat_info();
        if (stat_info == null) {
            return;
        }
        stat_info.set_favour_link(true);
    }

    private final void v0() {
        g gVarD;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43773, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        com.max.hbstory.d dVar = this.T;
        if (dVar != null && (gVarD = dVar.d()) != null) {
            gVarD.e0(true);
        }
        setLikeCount(getLikeCount() + 1);
    }

    private final void w0() {
        StoryItemsObj storyItemsObjM;
        StoryLinkCardInfoObj link_card_info;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43792, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        com.max.hbstory.d dVar = this.T;
        StoryStatInfoObj stat_info = (dVar == null || (storyItemsObjM = StoryUtilsKt.m(dVar, this.U)) == null || (link_card_info = storyItemsObjM.getLink_card_info()) == null) ? null : link_card_info.getStat_info();
        if (stat_info == null) {
            return;
        }
        stat_info.set_favour_link(true);
    }

    private final void x0() {
        g gVarD;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43771, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        com.max.hbstory.d dVar = this.T;
        if (dVar != null && (gVarD = dVar.d()) != null) {
            gVarD.e0(false);
        }
        setLikeCount(getLikeCount() - 1);
    }

    private final void y0() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43795, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f92098b0.c(false);
    }

    private final void z0() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43772, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        post(new b());
    }

    @Override // com.max.hbstory.widget.IStoryLandscapeControlWidget
    public void W(@dl.d VideoViewX videoView, @dl.d com.max.hbstory.d storyContext, int i10) {
        if (PatchProxy.proxy(new Object[]{videoView, storyContext, new Integer(i10)}, this, changeQuickRedirect, false, 43784, new Class[]{VideoViewX.class, com.max.hbstory.d.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(videoView, "videoView");
        f0.p(storyContext, "storyContext");
        this.S = videoView;
        this.T = storyContext;
        this.U = i10;
        if (!this.f92101p2) {
            R0();
            P0();
            O0();
            Q0();
            this.f92101p2 = !this.f92101p2;
        }
        Z0(storyContext, i10);
        X0(false);
        Y0();
        V0();
        W0();
        setSimpleView(true);
    }
}
