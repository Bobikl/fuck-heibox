package com.max.xiaoheihe.module.story.widget.ui.video.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.transition.Slide;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.compose.runtime.internal.o;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.j0;
import androidx.lifecycle.z;
import com.google.gson.JsonObject;
import com.max.hbcommon.component.bubble.BubbleTipPopup;
import com.max.hbstory.bean.StoryBBSUserInfoObj;
import com.max.hbstory.bean.StoryCardIdInfoObj;
import com.max.hbstory.bean.StoryItemsObj;
import com.max.hbstory.bean.StoryLinkCardInfoObj;
import com.max.hbstory.bean.StoryStatInfoObj;
import com.max.hbstory.c;
import com.max.hbstory.utils.StoryUtilsKt;
import com.max.hbutils.bean.Result;
import com.max.hbutils.utils.q;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.bbs.BBSCommentsObj;
import com.max.xiaoheihe.bean.bbs.CollectionFolder;
import com.max.xiaoheihe.bean.bbs.CollectionFolders;
import com.max.xiaoheihe.module.bbs.component.bottomeditorbar.BottomEditorBarPostPageImpl;
import com.max.xiaoheihe.module.bbs.utils.BBSKtUtils;
import com.max.xiaoheihe.module.story.comment.StoryCommentBottomSheetDialog;
import com.max.xiaoheihe.utils.i0;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.starlightc.ucropplus.ui.UCropPlusActivity;
import dl.d;
import dl.e;
import io.reactivex.schedulers.b;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.b2;
import kotlin.c1;
import kotlin.collections.s0;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.e1;
import kotlinx.coroutines.k;
import mb.y;
import xh.i;
import yh.l;
import yh.p;

/* JADX INFO: compiled from: StoryBottomEditorBarWidget.kt */
/* JADX INFO: loaded from: classes12.dex */
@t0({"SMAP\nStoryBottomEditorBarWidget.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StoryBottomEditorBarWidget.kt\ncom/max/xiaoheihe/module/story/widget/ui/video/widget/StoryBottomEditorBarWidget\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,900:1\n1#2:901\n*E\n"})
@o(parameters = 0)
public final class StoryBottomEditorBarWidget extends BottomEditorBarPostPageImpl implements com.max.hbstory.viewpage2.video.a {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: j4, reason: collision with root package name */
    public static final int f92183j4 = 8;

    /* JADX INFO: renamed from: a4, reason: collision with root package name */
    @dl.e
    private final Void f92184a4;

    /* JADX INFO: renamed from: b4, reason: collision with root package name */
    @dl.e
    private com.max.hbstory.d f92185b4;

    /* JADX INFO: renamed from: c4, reason: collision with root package name */
    private int f92186c4;

    /* JADX INFO: renamed from: d4, reason: collision with root package name */
    @dl.d
    private final com.max.xiaoheihe.module.story.widget.ui.video.widget.a f92187d4;

    /* JADX INFO: renamed from: e4, reason: collision with root package name */
    @dl.d
    private final View.OnClickListener f92188e4;

    /* JADX INFO: renamed from: f4, reason: collision with root package name */
    @dl.d
    private final View.OnClickListener f92189f4;

    /* JADX INFO: renamed from: g4, reason: collision with root package name */
    @dl.e
    private Runnable f92190g4;

    /* JADX INFO: renamed from: h4, reason: collision with root package name */
    private boolean f92191h4;

    /* JADX INFO: renamed from: i4, reason: collision with root package name */
    @dl.d
    private final g f92192i4;

    /* JADX INFO: compiled from: StoryBottomEditorBarWidget.kt */
    @o(parameters = 0)
    public static final class ComboRunnable implements Runnable {
        public static ChangeQuickRedirect changeQuickRedirect = null;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final int f92193g = 8;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f92194b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final boolean f92195c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @dl.d
        private final yh.a<b2> f92196d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @dl.d
        private final WeakReference<BottomEditorBarPostPageImpl> f92197e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @dl.e
        private final WeakReference<com.max.hbstory.d> f92198f;

        public ComboRunnable(@dl.d BottomEditorBarPostPageImpl impl, @dl.e com.max.hbstory.d dVar, int i10, boolean z10, @dl.d yh.a<b2> onSuccess) {
            f0.p(impl, "impl");
            f0.p(onSuccess, "onSuccess");
            this.f92194b = i10;
            this.f92195c = z10;
            this.f92196d = onSuccess;
            this.f92197e = new WeakReference<>(impl);
            this.f92198f = dVar == null ? null : new WeakReference<>(dVar);
        }

        private final void b(Context context) {
            BottomEditorBarPostPageImpl bottomEditorBarPostPageImpl;
            WeakReference<com.max.hbstory.d> weakReference;
            com.max.hbstory.d dVar;
            com.max.hbstory.c cVarC;
            StoryCardIdInfoObj card_id_info;
            com.max.hbstory.d dVar2;
            if (PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, 44038, new Class[]{Context.class}, Void.TYPE).isSupported || !i0.e(context) || (bottomEditorBarPostPageImpl = this.f92197e.get()) == null) {
                return;
            }
            bottomEditorBarPostPageImpl.setLikeBtnCheckState(true, true);
            bottomEditorBarPostPageImpl.setLikeBtnText(String.valueOf(Integer.parseInt(bottomEditorBarPostPageImpl.getLikeText().toString()) + 1));
            bottomEditorBarPostPageImpl.setLikeBtnCheckState(true, false);
            if (!bottomEditorBarPostPageImpl.G0()) {
                bottomEditorBarPostPageImpl.setCollectBtnCheckState(true, true);
            }
            if (bottomEditorBarPostPageImpl.E0() && !this.f92195c) {
                BottomEditorBarPostPageImpl.setChargeBtnState$default(bottomEditorBarPostPageImpl, true, false, 2, null);
                String string = bottomEditorBarPostPageImpl.getChargeText().toString();
                bottomEditorBarPostPageImpl.setChargeBtnText((f0.g("", string) ? "0" : Integer.valueOf(Integer.parseInt(string) + 1)).toString());
            }
            WeakReference<com.max.hbstory.d> weakReference2 = this.f92198f;
            StoryItemsObj storyItemsObjM = (weakReference2 == null || (dVar2 = weakReference2.get()) == null) ? null : StoryUtilsKt.m(dVar2, this.f92194b);
            String item_id = (storyItemsObjM == null || (card_id_info = storyItemsObjM.getCard_id_info()) == null) ? null : card_id_info.getItem_id();
            String h_src = storyItemsObjM != null ? storyItemsObjM.getH_src() : null;
            if (item_id == null || h_src == null || (weakReference = this.f92198f) == null || (dVar = weakReference.get()) == null || (cVarC = dVar.c()) == null) {
                return;
            }
            cVarC.c(item_id, h_src, new yh.a<b2>() { // from class: com.max.xiaoheihe.module.story.widget.ui.video.widget.StoryBottomEditorBarWidget$ComboRunnable$combo$1
                public static ChangeQuickRedirect changeQuickRedirect;

                {
                    super(0);
                }

                /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.b2] */
                @Override // yh.a
                public /* bridge */ /* synthetic */ b2 invoke() {
                    PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44040, new Class[0], Object.class);
                    if (patchProxyResultProxy.isSupported) {
                        return patchProxyResultProxy.result;
                    }
                    invoke2();
                    return b2.f124493a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44039, new Class[0], Void.TYPE).isSupported) {
                        return;
                    }
                    this.f92199b.f92196d.invoke();
                }
            }, new l<Throwable, b2>() { // from class: com.max.xiaoheihe.module.story.widget.ui.video.widget.StoryBottomEditorBarWidget$ComboRunnable$combo$2
                public static ChangeQuickRedirect changeQuickRedirect;

                /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, kotlin.b2] */
                @Override // yh.l
                public /* bridge */ /* synthetic */ b2 invoke(Throwable th2) {
                    PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 44042, new Class[]{Object.class}, Object.class);
                    if (patchProxyResultProxy.isSupported) {
                        return patchProxyResultProxy.result;
                    }
                    invoke2(th2);
                    return b2.f124493a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@d Throwable it) {
                    if (PatchProxy.proxy(new Object[]{it}, this, changeQuickRedirect, false, 44041, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                        return;
                    }
                    f0.p(it, "it");
                }
            });
        }

        @Override // java.lang.Runnable
        public void run() {
            BottomEditorBarPostPageImpl bottomEditorBarPostPageImpl;
            Context context;
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44037, new Class[0], Void.TYPE).isSupported || (bottomEditorBarPostPageImpl = this.f92197e.get()) == null || (context = bottomEditorBarPostPageImpl.getContext()) == null) {
                return;
            }
            b(context);
            BottomEditorBarPostPageImpl bottomEditorBarPostPageImpl2 = this.f92197e.get();
            if (bottomEditorBarPostPageImpl2 != null) {
                bottomEditorBarPostPageImpl2.R0();
            }
        }
    }

    /* JADX INFO: compiled from: StoryBottomEditorBarWidget.kt */
    public static final class a implements Runnable {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f92202c;

        a(boolean z10) {
            this.f92202c = z10;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44043, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            StoryBottomEditorBarWidget storyBottomEditorBarWidget = StoryBottomEditorBarWidget.this;
            storyBottomEditorBarWidget.setLikeBtnText(String.valueOf(StoryBottomEditorBarWidget.f1(storyBottomEditorBarWidget)));
            StoryBottomEditorBarWidget.this.setLikeBtnCheckState(true, this.f92202c);
        }
    }

    /* JADX INFO: compiled from: StoryBottomEditorBarWidget.kt */
    public static final class b implements Runnable {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f92204c;

        b(boolean z10) {
            this.f92204c = z10;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44044, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            StoryBottomEditorBarWidget.this.setCollectBtnCheckState(true, this.f92204c);
        }
    }

    /* JADX INFO: compiled from: StoryBottomEditorBarWidget.kt */
    public static final class c implements Runnable {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44045, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            StoryBottomEditorBarWidget storyBottomEditorBarWidget = StoryBottomEditorBarWidget.this;
            storyBottomEditorBarWidget.setLikeBtnText(String.valueOf(StoryBottomEditorBarWidget.f1(storyBottomEditorBarWidget)));
            StoryBottomEditorBarWidget.this.setLikeBtnCheckState(false, false);
        }
    }

    /* JADX INFO: compiled from: StoryBottomEditorBarWidget.kt */
    public static final class d implements Runnable {
        public static ChangeQuickRedirect changeQuickRedirect;

        d() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44046, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            StoryBottomEditorBarWidget.this.setCollectBtnCheckState(false, false);
        }
    }

    /* JADX INFO: compiled from: StoryBottomEditorBarWidget.kt */
    public static final class e implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        e() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 44067, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            StoryBottomEditorBarWidget.w1(StoryBottomEditorBarWidget.this);
        }
    }

    /* JADX INFO: compiled from: StoryBottomEditorBarWidget.kt */
    public static final class f implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        f() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 44068, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            if (StoryBottomEditorBarWidget.this.G0()) {
                StoryBottomEditorBarWidget.x1(StoryBottomEditorBarWidget.this);
            } else {
                StoryBottomEditorBarWidget.v1(StoryBottomEditorBarWidget.this);
            }
        }
    }

    /* JADX INFO: compiled from: StoryBottomEditorBarWidget.kt */
    public static final class g implements View.OnTouchListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private float f92227b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private float f92228c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f92229d = 200;

        g() {
        }

        public final void a() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44078, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            StoryBottomEditorBarWidget.this.J1();
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(@dl.e View view, @dl.e MotionEvent motionEvent) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view, motionEvent}, this, changeQuickRedirect, false, 44077, new Class[]{View.class, MotionEvent.class}, Boolean.TYPE);
            if (patchProxyResultProxy.isSupported) {
                return ((Boolean) patchProxyResultProxy.result).booleanValue();
            }
            if (motionEvent == null) {
                return false;
            }
            int action = motionEvent.getAction();
            if (action == 0) {
                this.f92227b = motionEvent.getX();
                this.f92228c = motionEvent.getY();
                return true;
            }
            if (action != 1) {
                return false;
            }
            float x10 = motionEvent.getX();
            float y10 = motionEvent.getY();
            if (com.max.hbcommon.component.ezcalendarview.utils.a.a(x10 - this.f92227b) < this.f92229d && com.max.hbcommon.component.ezcalendarview.utils.a.a(y10 - this.f92228c) < this.f92229d) {
                a();
            }
            return true;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @i
    public StoryBottomEditorBarWidget(@dl.d Context context) {
        this(context, null, 0, 6, null);
        f0.p(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @i
    public StoryBottomEditorBarWidget(@dl.d Context context, @dl.e AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        f0.p(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @i
    public StoryBottomEditorBarWidget(@dl.d Context context, @dl.e AttributeSet attributeSet, int i10) {
        super(context, null, 0, 6, null);
        f0.p(context, "context");
        setDarkStyleContentBgColorId(R.color.black);
        setDarkStyleEditBgDrawable(q.i(context, R.color.white_alpha10, R.color.white_alpha20, 0.5f, 5.0f));
        setBarDarkStyle();
        setNeedBoldNumTextAfterLiked(true);
        this.f92186c4 = -1;
        this.f92187d4 = new com.max.xiaoheihe.module.story.widget.ui.video.widget.a(this, new StoryBottomEditorBarWidget$mOnLikeTouchListener$1(this), new StoryBottomEditorBarWidget$mOnLikeTouchListener$2(this), new StoryBottomEditorBarWidget$mOnLikeTouchListener$3(this), new StoryBottomEditorBarWidget$mOnLikeTouchListener$4(this));
        this.f92188e4 = new f();
        this.f92189f4 = new e();
        this.f92192i4 = new g();
    }

    public /* synthetic */ StoryBottomEditorBarWidget(Context context, AttributeSet attributeSet, int i10, int i11, u uVar) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    static /* synthetic */ void A1(StoryBottomEditorBarWidget storyBottomEditorBarWidget, boolean z10, int i10, Object obj) {
        if (PatchProxy.proxy(new Object[]{storyBottomEditorBarWidget, new Byte(z10 ? (byte) 1 : (byte) 0), new Integer(i10), obj}, null, changeQuickRedirect, true, 43984, new Class[]{StoryBottomEditorBarWidget.class, Boolean.TYPE, Integer.TYPE, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        storyBottomEditorBarWidget.z1(z10);
    }

    private final void B1() {
        StoryItemsObj storyItemsObjN;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43963, new Class[0], Void.TYPE).isSupported || (storyItemsObjN = StoryUtilsKt.n(this, getMPosition())) == null) {
            return;
        }
        StoryLinkCardInfoObj link_card_info = storyItemsObjN.getLink_card_info();
        StoryStatInfoObj stat_info = link_card_info != null ? link_card_info.getStat_info() : null;
        if (stat_info != null) {
            stat_info.set_favour_link(true);
        }
        X1();
    }

    private final void C1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43969, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        setLikeCount(getLikeCount() + 1);
        setLikeSate(true);
        Y1();
    }

    private final void D1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43978, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        setLikeCount(Math.max(getLikeCount() - 1, 0));
        setLikeSate(false);
        W1();
    }

    private final void E1(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 43964, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        post(new b(z10));
    }

    static /* synthetic */ void F1(StoryBottomEditorBarWidget storyBottomEditorBarWidget, boolean z10, int i10, Object obj) {
        if (PatchProxy.proxy(new Object[]{storyBottomEditorBarWidget, new Byte(z10 ? (byte) 1 : (byte) 0), new Integer(i10), obj}, null, changeQuickRedirect, true, 43965, new Class[]{StoryBottomEditorBarWidget.class, Boolean.TYPE, Integer.TYPE, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        storyBottomEditorBarWidget.E1(z10);
    }

    private final void G1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43985, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        post(new c());
    }

    private final void H1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43967, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        post(new d());
    }

    private final void I1(String str, Map<String, String> map, l<? super Boolean, b2> lVar) {
        com.max.hbstory.d mStoryContext;
        Fragment fragmentB;
        LifecycleCoroutineScope lifecycleCoroutineScopeA;
        if (PatchProxy.proxy(new Object[]{str, map, lVar}, this, changeQuickRedirect, false, 43961, new Class[]{String.class, Map.class, l.class}, Void.TYPE).isSupported || (mStoryContext = getMStoryContext()) == null || (fragmentB = mStoryContext.b()) == null || (lifecycleCoroutineScopeA = z.a(fragmentB)) == null) {
            return;
        }
        k.f(lifecycleCoroutineScopeA, e1.c(), null, new StoryBottomEditorBarWidget$collectionLinkV2$1(str, map, lVar, this, lifecycleCoroutineScopeA, null), 2, null);
    }

    private final int K1() {
        StoryLinkCardInfoObj link_card_info;
        StoryStatInfoObj stat_info;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44005, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        StoryItemsObj storyItemsObjN = StoryUtilsKt.n(this, getMPosition());
        if (storyItemsObjN == null || (link_card_info = storyItemsObjN.getLink_card_info()) == null || (stat_info = link_card_info.getStat_info()) == null) {
            return 0;
        }
        return stat_info.getComment_count();
    }

    private final boolean L1() {
        StoryLinkCardInfoObj link_card_info;
        StoryStatInfoObj stat_info;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44002, new Class[0], Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        StoryItemsObj storyItemsObjN = StoryUtilsKt.n(this, getMPosition());
        if (storyItemsObjN == null || (link_card_info = storyItemsObjN.getLink_card_info()) == null || (stat_info = link_card_info.getStat_info()) == null) {
            return false;
        }
        return stat_info.is_favour_link();
    }

    private final boolean M1() {
        StoryLinkCardInfoObj link_card_info;
        StoryStatInfoObj stat_info;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44003, new Class[0], Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        StoryItemsObj storyItemsObjN = StoryUtilsKt.n(this, getMPosition());
        if (storyItemsObjN == null || (link_card_info = storyItemsObjN.getLink_card_info()) == null || (stat_info = link_card_info.getStat_info()) == null) {
            return false;
        }
        return stat_info.is_award_link();
    }

    private final int N1() {
        StoryLinkCardInfoObj link_card_info;
        StoryStatInfoObj stat_info;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44004, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        StoryItemsObj storyItemsObjN = StoryUtilsKt.n(this, getMPosition());
        if (storyItemsObjN == null || (link_card_info = storyItemsObjN.getLink_card_info()) == null || (stat_info = link_card_info.getStat_info()) == null) {
            return 0;
        }
        return stat_info.getLink_award_num();
    }

    private final String O1() {
        StoryItemsObj storyItemsObjM;
        StoryLinkCardInfoObj link_card_info;
        StoryBBSUserInfoObj user_info;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44006, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        com.max.hbstory.d mStoryContext = getMStoryContext();
        if (mStoryContext == null || (storyItemsObjM = StoryUtilsKt.m(mStoryContext, getMPosition())) == null || (link_card_info = storyItemsObjM.getLink_card_info()) == null || (user_info = link_card_info.getUser_info()) == null) {
            return null;
        }
        return user_info.getUserid();
    }

    private final void P1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43997, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        int iK1 = K1();
        if (iK1 == 0) {
            setCommentBtnText("评论");
        } else {
            setCommentBtnText(String.valueOf(iK1));
        }
    }

    private final void Q1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43995, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        if (L1()) {
            com.max.hbstory.d mStoryContext = getMStoryContext();
            if (mStoryContext != null) {
                StoryUtilsKt.e(mStoryContext, getMPosition(), new yh.a<b2>() { // from class: com.max.xiaoheihe.module.story.widget.ui.video.widget.StoryBottomEditorBarWidget$fetchFavourUI$1
                    public static ChangeQuickRedirect changeQuickRedirect;

                    {
                        super(0);
                    }

                    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.b2] */
                    @Override // yh.a
                    public /* bridge */ /* synthetic */ b2 invoke() {
                        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44056, new Class[0], Object.class);
                        if (patchProxyResultProxy.isSupported) {
                            return patchProxyResultProxy.result;
                        }
                        invoke2();
                        return b2.f124493a;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44055, new Class[0], Void.TYPE).isSupported) {
                            return;
                        }
                        StoryBottomEditorBarWidget.j1(this.f92223b);
                    }
                });
            }
            E1(false);
            return;
        }
        com.max.hbstory.d mStoryContext2 = getMStoryContext();
        if (mStoryContext2 != null) {
            StoryUtilsKt.e(mStoryContext2, getMPosition(), new yh.a<b2>() { // from class: com.max.xiaoheihe.module.story.widget.ui.video.widget.StoryBottomEditorBarWidget$fetchFavourUI$2
                public static ChangeQuickRedirect changeQuickRedirect;

                {
                    super(0);
                }

                /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.b2] */
                @Override // yh.a
                public /* bridge */ /* synthetic */ b2 invoke() {
                    PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44058, new Class[0], Object.class);
                    if (patchProxyResultProxy.isSupported) {
                        return patchProxyResultProxy.result;
                    }
                    invoke2();
                    return b2.f124493a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44057, new Class[0], Void.TYPE).isSupported) {
                        return;
                    }
                    StoryBottomEditorBarWidget.l1(this.f92224b);
                }
            });
        }
        H1();
    }

    private final void R1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43996, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        if (M1()) {
            com.max.hbstory.d mStoryContext = getMStoryContext();
            if (mStoryContext != null) {
                StoryUtilsKt.e(mStoryContext, getMPosition(), new yh.a<b2>() { // from class: com.max.xiaoheihe.module.story.widget.ui.video.widget.StoryBottomEditorBarWidget$fetchLikeUI$1
                    public static ChangeQuickRedirect changeQuickRedirect;

                    {
                        super(0);
                    }

                    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.b2] */
                    @Override // yh.a
                    public /* bridge */ /* synthetic */ b2 invoke() {
                        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44060, new Class[0], Object.class);
                        if (patchProxyResultProxy.isSupported) {
                            return patchProxyResultProxy.result;
                        }
                        invoke2();
                        return b2.f124493a;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44059, new Class[0], Void.TYPE).isSupported) {
                            return;
                        }
                        StoryBottomEditorBarWidget.k1(this.f92225b);
                    }
                });
            }
            z1(false);
            return;
        }
        com.max.hbstory.d mStoryContext2 = getMStoryContext();
        if (mStoryContext2 != null) {
            StoryUtilsKt.e(mStoryContext2, getMPosition(), new yh.a<b2>() { // from class: com.max.xiaoheihe.module.story.widget.ui.video.widget.StoryBottomEditorBarWidget$fetchLikeUI$2
                public static ChangeQuickRedirect changeQuickRedirect;

                {
                    super(0);
                }

                /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.b2] */
                @Override // yh.a
                public /* bridge */ /* synthetic */ b2 invoke() {
                    PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44062, new Class[0], Object.class);
                    if (patchProxyResultProxy.isSupported) {
                        return patchProxyResultProxy.result;
                    }
                    invoke2();
                    return b2.f124493a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44061, new Class[0], Void.TYPE).isSupported) {
                        return;
                    }
                    StoryBottomEditorBarWidget.i1(this.f92226b);
                }
            });
        }
        G1();
    }

    private final void S1() {
        com.max.hbstory.d mStoryContext;
        Fragment fragmentB;
        com.max.hbstory.d mStoryContext2;
        com.max.hbstory.g gVarD;
        LiveData<Integer> liveDataN;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43956, new Class[0], Void.TYPE).isSupported || (mStoryContext = getMStoryContext()) == null || (fragmentB = mStoryContext.b()) == null || (mStoryContext2 = getMStoryContext()) == null || (gVarD = mStoryContext2.d()) == null || (liveDataN = gVarD.n()) == null) {
            return;
        }
        liveDataN.k(fragmentB, new j0<Integer>() { // from class: com.max.xiaoheihe.module.story.widget.ui.video.widget.StoryBottomEditorBarWidget$initSyncViewModelData$1$1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // androidx.lifecycle.j0
            public /* bridge */ /* synthetic */ void a(Integer num) {
                if (PatchProxy.proxy(new Object[]{num}, this, changeQuickRedirect, false, 44064, new Class[]{Object.class}, Void.TYPE).isSupported) {
                    return;
                }
                b(num);
            }

            public final void b(Integer num) {
                com.max.hbstory.d mStoryContext3;
                if (PatchProxy.proxy(new Object[]{num}, this, changeQuickRedirect, false, 44063, new Class[]{Integer.class}, Void.TYPE).isSupported || (mStoryContext3 = this.f92231a.getMStoryContext()) == null) {
                    return;
                }
                int mPosition = this.f92231a.getMPosition();
                final StoryBottomEditorBarWidget storyBottomEditorBarWidget = this.f92231a;
                StoryUtilsKt.e(mStoryContext3, mPosition, new yh.a<b2>() { // from class: com.max.xiaoheihe.module.story.widget.ui.video.widget.StoryBottomEditorBarWidget$initSyncViewModelData$1$1$onChanged$1
                    public static ChangeQuickRedirect changeQuickRedirect;

                    {
                        super(0);
                    }

                    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.b2] */
                    @Override // yh.a
                    public /* bridge */ /* synthetic */ b2 invoke() {
                        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44066, new Class[0], Object.class);
                        if (patchProxyResultProxy.isSupported) {
                            return patchProxyResultProxy.result;
                        }
                        invoke2();
                        return b2.f124493a;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44065, new Class[0], Void.TYPE).isSupported) {
                            return;
                        }
                        if (StoryBottomEditorBarWidget.e1(storyBottomEditorBarWidget)) {
                            StoryBottomEditorBarWidget.k1(storyBottomEditorBarWidget);
                        } else {
                            StoryBottomEditorBarWidget.i1(storyBottomEditorBarWidget);
                        }
                        if (StoryBottomEditorBarWidget.d1(storyBottomEditorBarWidget)) {
                            StoryBottomEditorBarWidget.j1(storyBottomEditorBarWidget);
                        } else {
                            StoryBottomEditorBarWidget.l1(storyBottomEditorBarWidget);
                        }
                        StoryBottomEditorBarWidget.g1(storyBottomEditorBarWidget);
                        StoryBottomEditorBarWidget.h1(storyBottomEditorBarWidget);
                    }
                });
            }
        });
    }

    private final boolean T1() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44001, new Class[0], Boolean.TYPE);
        return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : f0.g(O1(), i0.j());
    }

    private final void U1() {
        com.max.hbstory.d mStoryContext;
        com.max.hbstory.g gVarD;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43974, new Class[0], Void.TYPE).isSupported || (mStoryContext = getMStoryContext()) == null || (gVarD = mStoryContext.d()) == null) {
            return;
        }
        gVarD.U(K1());
    }

    public static final /* synthetic */ void V0(StoryBottomEditorBarWidget storyBottomEditorBarWidget, boolean z10) {
        if (PatchProxy.proxy(new Object[]{storyBottomEditorBarWidget, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 44009, new Class[]{StoryBottomEditorBarWidget.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        storyBottomEditorBarWidget.z1(z10);
    }

    private final void V1() {
        com.max.hbstory.d mStoryContext;
        com.max.hbstory.g gVarD;
        StoryLinkCardInfoObj link_card_info;
        StoryBBSUserInfoObj user_info;
        StoryLinkCardInfoObj link_card_info2;
        StoryStatInfoObj stat_info;
        boolean z10 = false;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43975, new Class[0], Void.TYPE).isSupported || (mStoryContext = getMStoryContext()) == null || (gVarD = mStoryContext.d()) == null) {
            return;
        }
        StoryItemsObj storyItemsObjN = StoryUtilsKt.n(this, getMPosition());
        if (storyItemsObjN != null && (link_card_info2 = storyItemsObjN.getLink_card_info()) != null && (stat_info = link_card_info2.getStat_info()) != null && stat_info.getFollow_status() == 0) {
            z10 = true;
        }
        boolean z11 = !z10;
        StoryItemsObj storyItemsObjN2 = StoryUtilsKt.n(this, getMPosition());
        String userid = (storyItemsObjN2 == null || (link_card_info = storyItemsObjN2.getLink_card_info()) == null || (user_info = link_card_info.getUser_info()) == null) ? null : user_info.getUserid();
        if (userid == null) {
            userid = "";
        }
        gVarD.a0(new com.max.hbstory.g.b(z11, userid));
    }

    public static final /* synthetic */ void W0(StoryBottomEditorBarWidget storyBottomEditorBarWidget) {
        if (PatchProxy.proxy(new Object[]{storyBottomEditorBarWidget}, null, changeQuickRedirect, true, 44015, new Class[]{StoryBottomEditorBarWidget.class}, Void.TYPE).isSupported) {
            return;
        }
        storyBottomEditorBarWidget.B1();
    }

    private final void W1() {
        com.max.hbstory.d mStoryContext;
        com.max.hbstory.g gVarD;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43971, new Class[0], Void.TYPE).isSupported || (mStoryContext = getMStoryContext()) == null || (gVarD = mStoryContext.d()) == null) {
            return;
        }
        gVarD.e0(false);
    }

    public static final /* synthetic */ void X0(StoryBottomEditorBarWidget storyBottomEditorBarWidget) {
        if (PatchProxy.proxy(new Object[]{storyBottomEditorBarWidget}, null, changeQuickRedirect, true, 44019, new Class[]{StoryBottomEditorBarWidget.class}, Void.TYPE).isSupported) {
            return;
        }
        storyBottomEditorBarWidget.C1();
    }

    private final void X1() {
        com.max.hbstory.d mStoryContext;
        com.max.hbstory.g gVarD;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43972, new Class[0], Void.TYPE).isSupported || (mStoryContext = getMStoryContext()) == null || (gVarD = mStoryContext.d()) == null) {
            return;
        }
        gVarD.Z(true);
    }

    public static final /* synthetic */ void Y0(StoryBottomEditorBarWidget storyBottomEditorBarWidget) {
        if (PatchProxy.proxy(new Object[]{storyBottomEditorBarWidget}, null, changeQuickRedirect, true, 44020, new Class[]{StoryBottomEditorBarWidget.class}, Void.TYPE).isSupported) {
            return;
        }
        storyBottomEditorBarWidget.D1();
    }

    private final void Y1() {
        com.max.hbstory.d mStoryContext;
        com.max.hbstory.g gVarD;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43970, new Class[0], Void.TYPE).isSupported || (mStoryContext = getMStoryContext()) == null || (gVarD = mStoryContext.d()) == null) {
            return;
        }
        gVarD.e0(true);
    }

    public static final /* synthetic */ void Z0(StoryBottomEditorBarWidget storyBottomEditorBarWidget, boolean z10) {
        if (PatchProxy.proxy(new Object[]{storyBottomEditorBarWidget, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 44012, new Class[]{StoryBottomEditorBarWidget.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        storyBottomEditorBarWidget.E1(z10);
    }

    private final void Z1() {
        com.max.hbstory.d mStoryContext;
        com.max.hbstory.g gVarD;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43973, new Class[0], Void.TYPE).isSupported || (mStoryContext = getMStoryContext()) == null || (gVarD = mStoryContext.d()) == null) {
            return;
        }
        gVarD.Z(false);
    }

    public static final /* synthetic */ void a1(StoryBottomEditorBarWidget storyBottomEditorBarWidget) {
        if (PatchProxy.proxy(new Object[]{storyBottomEditorBarWidget}, null, changeQuickRedirect, true, 44010, new Class[]{StoryBottomEditorBarWidget.class}, Void.TYPE).isSupported) {
            return;
        }
        storyBottomEditorBarWidget.G1();
    }

    private final void a2() {
        com.max.hbstory.d mStoryContext;
        Fragment fragmentB;
        com.max.hbstory.d mStoryContext2;
        com.max.hbstory.g gVarD;
        LiveData<Boolean> liveDataK;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43958, new Class[0], Void.TYPE).isSupported || (mStoryContext = getMStoryContext()) == null || (fragmentB = mStoryContext.b()) == null || (mStoryContext2 = getMStoryContext()) == null || (gVarD = mStoryContext2.d()) == null || (liveDataK = gVarD.K()) == null) {
            return;
        }
        liveDataK.k(fragmentB, new j0<Boolean>() { // from class: com.max.xiaoheihe.module.story.widget.ui.video.widget.StoryBottomEditorBarWidget$observeFavourState$1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // androidx.lifecycle.j0
            public /* bridge */ /* synthetic */ void a(Boolean bool) {
                if (PatchProxy.proxy(new Object[]{bool}, this, changeQuickRedirect, false, 44080, new Class[]{Object.class}, Void.TYPE).isSupported) {
                    return;
                }
                b(bool);
            }

            public final void b(final Boolean bool) {
                com.max.hbstory.d mStoryContext3;
                if (PatchProxy.proxy(new Object[]{bool}, this, changeQuickRedirect, false, 44079, new Class[]{Boolean.class}, Void.TYPE).isSupported || (mStoryContext3 = this.f92233a.getMStoryContext()) == null) {
                    return;
                }
                int mPosition = this.f92233a.getMPosition();
                final StoryBottomEditorBarWidget storyBottomEditorBarWidget = this.f92233a;
                StoryUtilsKt.e(mStoryContext3, mPosition, new yh.a<b2>() { // from class: com.max.xiaoheihe.module.story.widget.ui.video.widget.StoryBottomEditorBarWidget$observeFavourState$1$onChanged$1
                    public static ChangeQuickRedirect changeQuickRedirect;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.b2] */
                    @Override // yh.a
                    public /* bridge */ /* synthetic */ b2 invoke() {
                        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44082, new Class[0], Object.class);
                        if (patchProxyResultProxy.isSupported) {
                            return patchProxyResultProxy.result;
                        }
                        invoke2();
                        return b2.f124493a;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44081, new Class[0], Void.TYPE).isSupported) {
                            return;
                        }
                        StoryBottomEditorBarWidget storyBottomEditorBarWidget2 = storyBottomEditorBarWidget;
                        Boolean isFavorited = bool;
                        f0.o(isFavorited, "isFavorited");
                        StoryBottomEditorBarWidget.s1(storyBottomEditorBarWidget2, isFavorited.booleanValue());
                        Boolean isFavorited2 = bool;
                        f0.o(isFavorited2, "isFavorited");
                        if (isFavorited2.booleanValue()) {
                            StoryBottomEditorBarWidget.Z0(storyBottomEditorBarWidget, false);
                        } else {
                            StoryBottomEditorBarWidget.b1(storyBottomEditorBarWidget);
                        }
                    }
                });
            }
        });
    }

    public static final /* synthetic */ void b1(StoryBottomEditorBarWidget storyBottomEditorBarWidget) {
        if (PatchProxy.proxy(new Object[]{storyBottomEditorBarWidget}, null, changeQuickRedirect, true, 44013, new Class[]{StoryBottomEditorBarWidget.class}, Void.TYPE).isSupported) {
            return;
        }
        storyBottomEditorBarWidget.H1();
    }

    private final void b2() {
        com.max.hbstory.d mStoryContext;
        Fragment fragmentB;
        com.max.hbstory.d mStoryContext2;
        com.max.hbstory.g gVarD;
        LiveData<Boolean> liveDataN;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43957, new Class[0], Void.TYPE).isSupported || (mStoryContext = getMStoryContext()) == null || (fragmentB = mStoryContext.b()) == null || (mStoryContext2 = getMStoryContext()) == null || (gVarD = mStoryContext2.d()) == null || (liveDataN = gVarD.N()) == null) {
            return;
        }
        liveDataN.k(fragmentB, new j0<Boolean>() { // from class: com.max.xiaoheihe.module.story.widget.ui.video.widget.StoryBottomEditorBarWidget$observeLikeState$1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // androidx.lifecycle.j0
            public /* bridge */ /* synthetic */ void a(Boolean bool) {
                if (PatchProxy.proxy(new Object[]{bool}, this, changeQuickRedirect, false, 44084, new Class[]{Object.class}, Void.TYPE).isSupported) {
                    return;
                }
                b(bool);
            }

            public final void b(final Boolean bool) {
                com.max.hbstory.d mStoryContext3;
                if (PatchProxy.proxy(new Object[]{bool}, this, changeQuickRedirect, false, 44083, new Class[]{Boolean.class}, Void.TYPE).isSupported || (mStoryContext3 = this.f92236a.getMStoryContext()) == null) {
                    return;
                }
                int mPosition = this.f92236a.getMPosition();
                final StoryBottomEditorBarWidget storyBottomEditorBarWidget = this.f92236a;
                StoryUtilsKt.e(mStoryContext3, mPosition, new yh.a<b2>() { // from class: com.max.xiaoheihe.module.story.widget.ui.video.widget.StoryBottomEditorBarWidget$observeLikeState$1$onChanged$1
                    public static ChangeQuickRedirect changeQuickRedirect;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.b2] */
                    @Override // yh.a
                    public /* bridge */ /* synthetic */ b2 invoke() {
                        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44086, new Class[0], Object.class);
                        if (patchProxyResultProxy.isSupported) {
                            return patchProxyResultProxy.result;
                        }
                        invoke2();
                        return b2.f124493a;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44085, new Class[0], Void.TYPE).isSupported) {
                            return;
                        }
                        StoryBottomEditorBarWidget storyBottomEditorBarWidget2 = storyBottomEditorBarWidget;
                        Boolean isLike = bool;
                        f0.o(isLike, "isLike");
                        StoryBottomEditorBarWidget.t1(storyBottomEditorBarWidget2, isLike.booleanValue());
                        Boolean isLike2 = bool;
                        f0.o(isLike2, "isLike");
                        if (isLike2.booleanValue()) {
                            StoryBottomEditorBarWidget.V0(storyBottomEditorBarWidget, false);
                        } else {
                            StoryBottomEditorBarWidget.a1(storyBottomEditorBarWidget);
                        }
                    }
                });
            }
        });
    }

    public static final /* synthetic */ void c1(StoryBottomEditorBarWidget storyBottomEditorBarWidget, String str, Map map, l lVar) {
        if (PatchProxy.proxy(new Object[]{storyBottomEditorBarWidget, str, map, lVar}, null, changeQuickRedirect, true, 44014, new Class[]{StoryBottomEditorBarWidget.class, String.class, Map.class, l.class}, Void.TYPE).isSupported) {
            return;
        }
        storyBottomEditorBarWidget.I1(str, map, lVar);
    }

    private final void c2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43992, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        setEnableCollect(true);
        setCollectBtnVisible(true);
        setCollectOnClickListener(this.f92188e4);
    }

    public static final /* synthetic */ boolean d1(StoryBottomEditorBarWidget storyBottomEditorBarWidget) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{storyBottomEditorBarWidget}, null, changeQuickRedirect, true, 44027, new Class[]{StoryBottomEditorBarWidget.class}, Boolean.TYPE);
        return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : storyBottomEditorBarWidget.L1();
    }

    private final void d2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43993, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        setEnableComment(true);
        setCommentOnClickListener(this.f92189f4);
        setCommentBtnVisible(true);
        P1();
    }

    public static final /* synthetic */ boolean e1(StoryBottomEditorBarWidget storyBottomEditorBarWidget) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{storyBottomEditorBarWidget}, null, changeQuickRedirect, true, 44026, new Class[]{StoryBottomEditorBarWidget.class}, Boolean.TYPE);
        return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : storyBottomEditorBarWidget.M1();
    }

    private final void e2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43994, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        Q1();
    }

    public static final /* synthetic */ int f1(StoryBottomEditorBarWidget storyBottomEditorBarWidget) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{storyBottomEditorBarWidget}, null, changeQuickRedirect, true, 44021, new Class[]{StoryBottomEditorBarWidget.class}, Integer.TYPE);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : storyBottomEditorBarWidget.getLikeCount();
    }

    private final void f2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43991, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        setEnablelike(true);
        setLikeBtnVisible(true);
        com.max.xiaoheihe.module.story.widget.ui.video.widget.a aVar = this.f92187d4;
        aVar.a(O1());
        setLikeTouchListener(aVar);
        R1();
        setLikeBtnText(String.valueOf(N1()));
    }

    public static final /* synthetic */ void g1(StoryBottomEditorBarWidget storyBottomEditorBarWidget) {
        if (PatchProxy.proxy(new Object[]{storyBottomEditorBarWidget}, null, changeQuickRedirect, true, 44028, new Class[]{StoryBottomEditorBarWidget.class}, Void.TYPE).isSupported) {
            return;
        }
        storyBottomEditorBarWidget.U1();
    }

    private final void g2() {
        StoryLinkCardInfoObj link_card_info;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43990, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("onBindInitWhichButtonShouldBeUsed  ");
        StoryItemsObj storyItemsObjN = StoryUtilsKt.n(this, getMPosition());
        sb2.append(com.max.hbutils.utils.k.p((storyItemsObjN == null || (link_card_info = storyItemsObjN.getLink_card_info()) == null) ? null : link_card_info.getStat_info()));
        Log.d("StoryBottomBar", sb2.toString());
        f2();
        d2();
        c2();
        e2();
    }

    private final int getLikeCount() {
        StoryLinkCardInfoObj link_card_info;
        StoryStatInfoObj stat_info;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43979, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        StoryItemsObj storyItemsObjN = StoryUtilsKt.n(this, getMPosition());
        if (storyItemsObjN == null || (link_card_info = storyItemsObjN.getLink_card_info()) == null || (stat_info = link_card_info.getStat_info()) == null) {
            return 0;
        }
        return stat_info.getLink_award_num();
    }

    public static final /* synthetic */ void h1(StoryBottomEditorBarWidget storyBottomEditorBarWidget) {
        if (PatchProxy.proxy(new Object[]{storyBottomEditorBarWidget}, null, changeQuickRedirect, true, 44029, new Class[]{StoryBottomEditorBarWidget.class}, Void.TYPE).isSupported) {
            return;
        }
        storyBottomEditorBarWidget.V1();
    }

    private final void h2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43989, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        setEnableShare(false);
        setEnableCharge(false);
        setChargeBtnVisible(false);
        setShareBtnVisible(false);
    }

    public static final /* synthetic */ void i1(StoryBottomEditorBarWidget storyBottomEditorBarWidget) {
        if (PatchProxy.proxy(new Object[]{storyBottomEditorBarWidget}, null, changeQuickRedirect, true, 44025, new Class[]{StoryBottomEditorBarWidget.class}, Void.TYPE).isSupported) {
            return;
        }
        storyBottomEditorBarWidget.W1();
    }

    private final void i2() {
        Runnable runnable;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43986, new Class[0], Void.TYPE).isSupported || (runnable = this.f92190g4) == null) {
            return;
        }
        removeCallbacks(runnable);
    }

    public static final /* synthetic */ void j1(StoryBottomEditorBarWidget storyBottomEditorBarWidget) {
        if (PatchProxy.proxy(new Object[]{storyBottomEditorBarWidget}, null, changeQuickRedirect, true, 44023, new Class[]{StoryBottomEditorBarWidget.class}, Void.TYPE).isSupported) {
            return;
        }
        storyBottomEditorBarWidget.X1();
    }

    private final void j2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43988, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        ComboRunnable comboRunnable = new ComboRunnable(this, getMStoryContext(), getMPosition(), T1(), new yh.a<b2>() { // from class: com.max.xiaoheihe.module.story.widget.ui.video.widget.StoryBottomEditorBarWidget$onCombo$runnable$1
            public static ChangeQuickRedirect changeQuickRedirect;

            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.b2] */
            @Override // yh.a
            public /* bridge */ /* synthetic */ b2 invoke() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44088, new Class[0], Object.class);
                if (patchProxyResultProxy.isSupported) {
                    return patchProxyResultProxy.result;
                }
                invoke2();
                return b2.f124493a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44087, new Class[0], Void.TYPE).isSupported) {
                    return;
                }
                StoryBottomEditorBarWidget.o1(this.f92239b);
            }
        });
        this.f92190g4 = comboRunnable;
        postDelayed(comboRunnable, 2000L);
    }

    public static final /* synthetic */ void k1(StoryBottomEditorBarWidget storyBottomEditorBarWidget) {
        if (PatchProxy.proxy(new Object[]{storyBottomEditorBarWidget}, null, changeQuickRedirect, true, 44024, new Class[]{StoryBottomEditorBarWidget.class}, Void.TYPE).isSupported) {
            return;
        }
        storyBottomEditorBarWidget.Y1();
    }

    private final void k2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43987, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        C1();
        B1();
    }

    public static final /* synthetic */ void l1(StoryBottomEditorBarWidget storyBottomEditorBarWidget) {
        if (PatchProxy.proxy(new Object[]{storyBottomEditorBarWidget}, null, changeQuickRedirect, true, 44017, new Class[]{StoryBottomEditorBarWidget.class}, Void.TYPE).isSupported) {
            return;
        }
        storyBottomEditorBarWidget.Z1();
    }

    private final void l2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43976, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        StoryUtilsKt.p(this, getMPosition(), new l<StoryItemsObj, b2>() { // from class: com.max.xiaoheihe.module.story.widget.ui.video.widget.StoryBottomEditorBarWidget$onDislike$1
            public static ChangeQuickRedirect changeQuickRedirect;

            {
                super(1);
            }

            public final void a(@e StoryItemsObj storyItemsObj) {
                final StoryBottomEditorBarWidget storyBottomEditorBarWidget;
                com.max.hbstory.d mStoryContext;
                c cVarC;
                if (PatchProxy.proxy(new Object[]{storyItemsObj}, this, changeQuickRedirect, false, 44089, new Class[]{StoryItemsObj.class}, Void.TYPE).isSupported || storyItemsObj == null || (mStoryContext = (storyBottomEditorBarWidget = this.f92240b).getMStoryContext()) == null || (cVarC = mStoryContext.c()) == null) {
                    return;
                }
                StoryCardIdInfoObj card_id_info = storyItemsObj.getCard_id_info();
                cVarC.f(card_id_info != null ? card_id_info.getItem_id() : null, storyItemsObj.getH_src(), "0", new HashMap(), new yh.a<b2>() { // from class: com.max.xiaoheihe.module.story.widget.ui.video.widget.StoryBottomEditorBarWidget$onDislike$1$1$1
                    public static ChangeQuickRedirect changeQuickRedirect;

                    {
                        super(0);
                    }

                    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.b2] */
                    @Override // yh.a
                    public /* bridge */ /* synthetic */ b2 invoke() {
                        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44092, new Class[0], Object.class);
                        if (patchProxyResultProxy.isSupported) {
                            return patchProxyResultProxy.result;
                        }
                        invoke2();
                        return b2.f124493a;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44091, new Class[0], Void.TYPE).isSupported) {
                            return;
                        }
                        StoryBottomEditorBarWidget.Y0(storyBottomEditorBarWidget);
                        StoryBottomEditorBarWidget.a1(storyBottomEditorBarWidget);
                    }
                }, new l<Throwable, b2>() { // from class: com.max.xiaoheihe.module.story.widget.ui.video.widget.StoryBottomEditorBarWidget$onDislike$1$1$2
                    public static ChangeQuickRedirect changeQuickRedirect;

                    /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, kotlin.b2] */
                    @Override // yh.l
                    public /* bridge */ /* synthetic */ b2 invoke(Throwable th2) {
                        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 44094, new Class[]{Object.class}, Object.class);
                        if (patchProxyResultProxy.isSupported) {
                            return patchProxyResultProxy.result;
                        }
                        invoke2(th2);
                        return b2.f124493a;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@d Throwable it) {
                        if (PatchProxy.proxy(new Object[]{it}, this, changeQuickRedirect, false, 44093, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                            return;
                        }
                        f0.p(it, "it");
                    }
                });
            }

            /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, kotlin.b2] */
            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(StoryItemsObj storyItemsObj) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{storyItemsObj}, this, changeQuickRedirect, false, 44090, new Class[]{Object.class}, Object.class);
                if (patchProxyResultProxy.isSupported) {
                    return patchProxyResultProxy.result;
                }
                a(storyItemsObj);
                return b2.f124493a;
            }
        });
    }

    public static final /* synthetic */ void m1(StoryBottomEditorBarWidget storyBottomEditorBarWidget) {
        if (PatchProxy.proxy(new Object[]{storyBottomEditorBarWidget}, null, changeQuickRedirect, true, 44033, new Class[]{StoryBottomEditorBarWidget.class}, Void.TYPE).isSupported) {
            return;
        }
        storyBottomEditorBarWidget.i2();
    }

    private final void m2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43968, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        StoryUtilsKt.p(this, getMPosition(), new l<StoryItemsObj, b2>() { // from class: com.max.xiaoheihe.module.story.widget.ui.video.widget.StoryBottomEditorBarWidget$onLike$1
            public static ChangeQuickRedirect changeQuickRedirect;

            {
                super(1);
            }

            public final void a(@e StoryItemsObj storyItemsObj) {
                c cVarC;
                if (PatchProxy.proxy(new Object[]{storyItemsObj}, this, changeQuickRedirect, false, 44095, new Class[]{StoryItemsObj.class}, Void.TYPE).isSupported || storyItemsObj == null) {
                    return;
                }
                final StoryBottomEditorBarWidget storyBottomEditorBarWidget = this.f92243b;
                StoryBottomEditorBarWidget.r1(storyBottomEditorBarWidget);
                StoryBottomEditorBarWidget.V0(storyBottomEditorBarWidget, true);
                com.max.hbstory.d mStoryContext = storyBottomEditorBarWidget.getMStoryContext();
                if (mStoryContext == null || (cVarC = mStoryContext.c()) == null) {
                    return;
                }
                StoryCardIdInfoObj card_id_info = storyItemsObj.getCard_id_info();
                cVarC.f(card_id_info != null ? card_id_info.getItem_id() : null, storyItemsObj.getH_src(), "1", new HashMap(), new yh.a<b2>() { // from class: com.max.xiaoheihe.module.story.widget.ui.video.widget.StoryBottomEditorBarWidget$onLike$1$1$1
                    public static ChangeQuickRedirect changeQuickRedirect;

                    {
                        super(0);
                    }

                    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.b2] */
                    @Override // yh.a
                    public /* bridge */ /* synthetic */ b2 invoke() {
                        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44098, new Class[0], Object.class);
                        if (patchProxyResultProxy.isSupported) {
                            return patchProxyResultProxy.result;
                        }
                        invoke2();
                        return b2.f124493a;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, com.google.android.exoplayer2.audio.c.f44103b, new Class[0], Void.TYPE).isSupported) {
                            return;
                        }
                        StoryBottomEditorBarWidget.X0(storyBottomEditorBarWidget);
                    }
                }, new l<Throwable, b2>() { // from class: com.max.xiaoheihe.module.story.widget.ui.video.widget.StoryBottomEditorBarWidget$onLike$1$1$2
                    public static ChangeQuickRedirect changeQuickRedirect;

                    {
                        super(1);
                    }

                    /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, kotlin.b2] */
                    @Override // yh.l
                    public /* bridge */ /* synthetic */ b2 invoke(Throwable th2) {
                        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 44100, new Class[]{Object.class}, Object.class);
                        if (patchProxyResultProxy.isSupported) {
                            return patchProxyResultProxy.result;
                        }
                        invoke2(th2);
                        return b2.f124493a;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@d Throwable it) {
                        if (PatchProxy.proxy(new Object[]{it}, this, changeQuickRedirect, false, 44099, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                            return;
                        }
                        f0.p(it, "it");
                        StoryBottomEditorBarWidget.a1(storyBottomEditorBarWidget);
                    }
                });
            }

            /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, kotlin.b2] */
            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(StoryItemsObj storyItemsObj) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{storyItemsObj}, this, changeQuickRedirect, false, com.google.android.exoplayer2.audio.c.f44102a, new Class[]{Object.class}, Object.class);
                if (patchProxyResultProxy.isSupported) {
                    return patchProxyResultProxy.result;
                }
                a(storyItemsObj);
                return b2.f124493a;
            }
        });
    }

    public static final /* synthetic */ void n1(StoryBottomEditorBarWidget storyBottomEditorBarWidget) {
        if (PatchProxy.proxy(new Object[]{storyBottomEditorBarWidget}, null, changeQuickRedirect, true, 44032, new Class[]{StoryBottomEditorBarWidget.class}, Void.TYPE).isSupported) {
            return;
        }
        storyBottomEditorBarWidget.j2();
    }

    private final void n2() {
        com.max.hbstory.d mStoryContext;
        StoryItemsObj storyItemsObjM;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43977, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        JsonObject jsonObject = new JsonObject();
        com.max.hbstory.d mStoryContext2 = getMStoryContext();
        if (mStoryContext2 != null && mStoryContext2.d() != null && (mStoryContext = getMStoryContext()) != null && (storyItemsObjM = StoryUtilsKt.m(mStoryContext, getMPosition())) != null) {
            StoryCardIdInfoObj card_id_info = storyItemsObjM.getCard_id_info();
            jsonObject.addProperty("id", card_id_info != null ? card_id_info.getItem_id() : null);
            jsonObject.addProperty(UCropPlusActivity.ARG_INDEX, Integer.valueOf(getMPosition()));
            jsonObject.addProperty("h_src", storyItemsObjM.getH_src());
            jsonObject.addProperty("from", "single_tap");
        }
        b2 b2Var = b2.f124493a;
        com.max.hbcommon.analytics.d.d("4", lb.d.f131289y0, null, jsonObject);
    }

    public static final /* synthetic */ void o1(StoryBottomEditorBarWidget storyBottomEditorBarWidget) {
        if (PatchProxy.proxy(new Object[]{storyBottomEditorBarWidget}, null, changeQuickRedirect, true, 44022, new Class[]{StoryBottomEditorBarWidget.class}, Void.TYPE).isSupported) {
            return;
        }
        storyBottomEditorBarWidget.k2();
    }

    @SuppressLint({"ClickableViewAccessibility"})
    private final void o2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43959, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        getEditor().setInputType(0);
        getMBinding().f108761d.setOnTouchListener(this.f92192i4);
    }

    public static final /* synthetic */ void p1(StoryBottomEditorBarWidget storyBottomEditorBarWidget) {
        if (PatchProxy.proxy(new Object[]{storyBottomEditorBarWidget}, null, changeQuickRedirect, true, 44031, new Class[]{StoryBottomEditorBarWidget.class}, Void.TYPE).isSupported) {
            return;
        }
        storyBottomEditorBarWidget.l2();
    }

    private final void p2(final String str, final Map<String, String> map, final LifecycleCoroutineScope lifecycleCoroutineScope) {
        if (PatchProxy.proxy(new Object[]{str, map, lifecycleCoroutineScope}, this, changeQuickRedirect, false, 43962, new Class[]{String.class, Map.class, LifecycleCoroutineScope.class}, Void.TYPE).isSupported) {
            return;
        }
        final JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("link_id", str);
        y yVarC = y.c(LayoutInflater.from(getContext()));
        f0.o(yVarC, "inflate(LayoutInflater.from(context))");
        TextView textView = yVarC.f131831c;
        textView.setText("收藏成功");
        textView.setTypeface(com.max.hbresource.a.f71893a.a(com.max.hbresource.a.f71895c));
        yVarC.f131830b.setText("加入收藏夹");
        Context context = getContext();
        f0.o(context, "context");
        final BubbleTipPopup bubbleTipPopupR = new BubbleTipPopup.a(context).c(getBottomBar()).u(yVarC.b(), -1).b(-1).a(-2).i0(48).n1(false).d(false).p0(0.0f).t0(0.0f).y(true).x(false).n(true).o(3000L).r();
        yVarC.b().setOnClickListener(new View.OnClickListener() { // from class: com.max.xiaoheihe.module.story.widget.ui.video.widget.StoryBottomEditorBarWidget$showAddCollectFolderTip$onActionListener$1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 44101, new Class[]{View.class}, Void.TYPE).isSupported) {
                    return;
                }
                com.max.hbcommon.analytics.d.d("4", lb.d.f131261u0, null, jsonObject);
                io.reactivex.z<Result<CollectionFolders>> zVarA4 = com.max.xiaoheihe.network.i.a().v(1).I5(b.d()).a4(io.reactivex.android.schedulers.a.c());
                final BubbleTipPopup bubbleTipPopup = bubbleTipPopupR;
                final StoryBottomEditorBarWidget storyBottomEditorBarWidget = this;
                final LifecycleCoroutineScope lifecycleCoroutineScope2 = lifecycleCoroutineScope;
                final String str2 = str;
                final Map<String, String> map2 = map;
                zVarA4.g(new com.max.hbcommon.network.d<Result<CollectionFolders>>() { // from class: com.max.xiaoheihe.module.story.widget.ui.video.widget.StoryBottomEditorBarWidget$showAddCollectFolderTip$onActionListener$1.1
                    public static ChangeQuickRedirect changeQuickRedirect;

                    @Override // com.max.hbcommon.network.d, io.reactivex.g0
                    public void onError(@d Throwable e10) {
                        Fragment fragmentB;
                        if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 44102, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                            return;
                        }
                        f0.p(e10, "e");
                        bubbleTipPopup.G();
                        com.max.hbstory.d mStoryContext = storyBottomEditorBarWidget.getMStoryContext();
                        if ((mStoryContext == null || (fragmentB = mStoryContext.b()) == null || !fragmentB.isAdded()) ? false : true) {
                            super.onError(e10);
                        }
                    }

                    public void onNext(@d Result<CollectionFolders> result) {
                        Fragment fragmentB;
                        boolean z10 = true;
                        if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 44103, new Class[]{Result.class}, Void.TYPE).isSupported) {
                            return;
                        }
                        f0.p(result, "result");
                        bubbleTipPopup.G();
                        com.max.hbstory.d mStoryContext = storyBottomEditorBarWidget.getMStoryContext();
                        if ((mStoryContext == null || (fragmentB = mStoryContext.b()) == null || !fragmentB.isAdded()) ? false : true) {
                            CollectionFolders result2 = result.getResult();
                            List<CollectionFolder> folders = result2 != null ? result2.getFolders() : null;
                            if (folders != null && !folders.isEmpty()) {
                                z10 = false;
                            }
                            if (z10) {
                                BBSKtUtils.Companion companion = BBSKtUtils.f83254a;
                                Context context2 = storyBottomEditorBarWidget.getContext();
                                f0.o(context2, "context");
                                LifecycleCoroutineScope lifecycleCoroutineScope3 = lifecycleCoroutineScope2;
                                final StoryBottomEditorBarWidget storyBottomEditorBarWidget2 = storyBottomEditorBarWidget;
                                BBSKtUtils.Companion.j(companion, context2, lifecycleCoroutineScope3, new yh.a<Boolean>() { // from class: com.max.xiaoheihe.module.story.widget.ui.video.widget.StoryBottomEditorBarWidget$showAddCollectFolderTip$onActionListener$1$1$onNext$1
                                    public static ChangeQuickRedirect changeQuickRedirect;

                                    {
                                        super(0);
                                    }

                                    @d
                                    public final Boolean a() {
                                        Fragment fragmentB2;
                                        boolean z11 = false;
                                        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44105, new Class[0], Boolean.class);
                                        if (patchProxyResultProxy.isSupported) {
                                            return (Boolean) patchProxyResultProxy.result;
                                        }
                                        com.max.hbstory.d mStoryContext2 = storyBottomEditorBarWidget2.getMStoryContext();
                                        if (mStoryContext2 != null && (fragmentB2 = mStoryContext2.b()) != null && fragmentB2.isAdded()) {
                                            z11 = true;
                                        }
                                        return Boolean.valueOf(z11);
                                    }

                                    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Boolean, java.lang.Object] */
                                    @Override // yh.a
                                    public /* bridge */ /* synthetic */ Boolean invoke() {
                                        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44106, new Class[0], Object.class);
                                        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a();
                                    }
                                }, str2, map2, null, 32, null);
                                return;
                            }
                            BBSKtUtils.Companion companion2 = BBSKtUtils.f83254a;
                            Context context3 = storyBottomEditorBarWidget.getContext();
                            f0.o(context3, "context");
                            LayoutInflater layoutInflaterFrom = LayoutInflater.from(storyBottomEditorBarWidget.getContext());
                            f0.o(layoutInflaterFrom, "from(context)");
                            String str3 = str2;
                            Map<String, String> map3 = map2;
                            LifecycleCoroutineScope lifecycleCoroutineScope4 = lifecycleCoroutineScope2;
                            final StoryBottomEditorBarWidget storyBottomEditorBarWidget3 = storyBottomEditorBarWidget;
                            BBSKtUtils.Companion.r(companion2, context3, layoutInflaterFrom, str3, map3, folders, null, lifecycleCoroutineScope4, new yh.a<Boolean>() { // from class: com.max.xiaoheihe.module.story.widget.ui.video.widget.StoryBottomEditorBarWidget$showAddCollectFolderTip$onActionListener$1$1$onNext$2
                                public static ChangeQuickRedirect changeQuickRedirect;

                                {
                                    super(0);
                                }

                                @d
                                public final Boolean a() {
                                    Fragment fragmentB2;
                                    boolean z11 = false;
                                    PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44107, new Class[0], Boolean.class);
                                    if (patchProxyResultProxy.isSupported) {
                                        return (Boolean) patchProxyResultProxy.result;
                                    }
                                    com.max.hbstory.d mStoryContext2 = storyBottomEditorBarWidget3.getMStoryContext();
                                    if (mStoryContext2 != null && (fragmentB2 = mStoryContext2.b()) != null && fragmentB2.isAdded()) {
                                        z11 = true;
                                    }
                                    return Boolean.valueOf(z11);
                                }

                                /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Boolean, java.lang.Object] */
                                @Override // yh.a
                                public /* bridge */ /* synthetic */ Boolean invoke() {
                                    PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44108, new Class[0], Object.class);
                                    return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a();
                                }
                            }, null, bb.c.b.C2, null);
                        }
                    }

                    @Override // com.max.hbcommon.network.d, io.reactivex.g0
                    public /* bridge */ /* synthetic */ void onNext(Object obj) {
                        if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 44104, new Class[]{Object.class}, Void.TYPE).isSupported) {
                            return;
                        }
                        onNext((Result<CollectionFolders>) obj);
                    }
                });
            }
        });
        PopupWindow popupWindowK = bubbleTipPopupR.K();
        popupWindowK.setAnimationStyle(0);
        Slide slide = new Slide();
        slide.setSlideEdge(80);
        popupWindowK.setEnterTransition(slide);
        Slide slide2 = new Slide();
        slide2.setSlideEdge(80);
        popupWindowK.setExitTransition(slide2);
        bubbleTipPopupR.O();
        com.max.hbcommon.analytics.d.d("3", lb.d.f131261u0, null, jsonObject);
    }

    public static final /* synthetic */ void q1(StoryBottomEditorBarWidget storyBottomEditorBarWidget) {
        if (PatchProxy.proxy(new Object[]{storyBottomEditorBarWidget}, null, changeQuickRedirect, true, 44030, new Class[]{StoryBottomEditorBarWidget.class}, Void.TYPE).isSupported) {
            return;
        }
        storyBottomEditorBarWidget.m2();
    }

    private final void q2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43960, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        StoryUtilsKt.p(this, getMPosition(), new l<StoryItemsObj, b2>() { // from class: com.max.xiaoheihe.module.story.widget.ui.video.widget.StoryBottomEditorBarWidget$showCollectionFoldersVertical$1
            public static ChangeQuickRedirect changeQuickRedirect;

            {
                super(1);
            }

            public final void a(@e StoryItemsObj storyItemsObj) {
                c cVarC;
                String item_id;
                if (PatchProxy.proxy(new Object[]{storyItemsObj}, this, changeQuickRedirect, false, 44109, new Class[]{StoryItemsObj.class}, Void.TYPE).isSupported || storyItemsObj == null) {
                    return;
                }
                final StoryBottomEditorBarWidget storyBottomEditorBarWidget = this.f92259b;
                if (ad.a.a(ad.a.E, false)) {
                    StoryCardIdInfoObj card_id_info = storyItemsObj.getCard_id_info();
                    if (card_id_info == null || (item_id = card_id_info.getItem_id()) == null) {
                        item_id = "";
                    }
                    StoryBottomEditorBarWidget.c1(storyBottomEditorBarWidget, item_id, s0.j0(c1.a("h_src", storyItemsObj.getH_src())), new l<Boolean, b2>() { // from class: com.max.xiaoheihe.module.story.widget.ui.video.widget.StoryBottomEditorBarWidget$showCollectionFoldersVertical$1$1$1
                        public static ChangeQuickRedirect changeQuickRedirect;

                        {
                            super(1);
                        }

                        public final void a(boolean z10) {
                            if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 44111, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
                                return;
                            }
                            StoryBottomEditorBarWidget.Z0(storyBottomEditorBarWidget, true);
                            StoryBottomEditorBarWidget.W0(storyBottomEditorBarWidget);
                        }

                        /* JADX WARN: Type inference failed for: r9v4, types: [java.lang.Object, kotlin.b2] */
                        @Override // yh.l
                        public /* bridge */ /* synthetic */ b2 invoke(Boolean bool) {
                            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{bool}, this, changeQuickRedirect, false, 44112, new Class[]{Object.class}, Object.class);
                            if (patchProxyResultProxy.isSupported) {
                                return patchProxyResultProxy.result;
                            }
                            a(bool.booleanValue());
                            return b2.f124493a;
                        }
                    });
                    return;
                }
                com.max.hbstory.d mStoryContext = storyBottomEditorBarWidget.getMStoryContext();
                if (mStoryContext == null || (cVarC = mStoryContext.c()) == null) {
                    return;
                }
                Context context = storyBottomEditorBarWidget.getContext();
                f0.o(context, "context");
                String h_src = storyItemsObj.getH_src();
                StoryCardIdInfoObj card_id_info2 = storyItemsObj.getCard_id_info();
                cVarC.j(context, h_src, card_id_info2 != null ? card_id_info2.getItem_id() : null, new yh.a<b2>() { // from class: com.max.xiaoheihe.module.story.widget.ui.video.widget.StoryBottomEditorBarWidget$showCollectionFoldersVertical$1$1$2
                    public static ChangeQuickRedirect changeQuickRedirect;

                    {
                        super(0);
                    }

                    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.b2] */
                    @Override // yh.a
                    public /* bridge */ /* synthetic */ b2 invoke() {
                        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44114, new Class[0], Object.class);
                        if (patchProxyResultProxy.isSupported) {
                            return patchProxyResultProxy.result;
                        }
                        invoke2();
                        return b2.f124493a;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44113, new Class[0], Void.TYPE).isSupported) {
                            return;
                        }
                        StoryBottomEditorBarWidget.Z0(storyBottomEditorBarWidget, true);
                        StoryBottomEditorBarWidget.W0(storyBottomEditorBarWidget);
                    }
                }, new l<Throwable, b2>() { // from class: com.max.xiaoheihe.module.story.widget.ui.video.widget.StoryBottomEditorBarWidget$showCollectionFoldersVertical$1$1$3
                    public static ChangeQuickRedirect changeQuickRedirect;

                    /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, kotlin.b2] */
                    @Override // yh.l
                    public /* bridge */ /* synthetic */ b2 invoke(Throwable th2) {
                        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 44116, new Class[]{Object.class}, Object.class);
                        if (patchProxyResultProxy.isSupported) {
                            return patchProxyResultProxy.result;
                        }
                        invoke2(th2);
                        return b2.f124493a;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@d Throwable it) {
                        if (PatchProxy.proxy(new Object[]{it}, this, changeQuickRedirect, false, 44115, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                            return;
                        }
                        f0.p(it, "it");
                    }
                });
            }

            /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, kotlin.b2] */
            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(StoryItemsObj storyItemsObj) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{storyItemsObj}, this, changeQuickRedirect, false, 44110, new Class[]{Object.class}, Object.class);
                if (patchProxyResultProxy.isSupported) {
                    return patchProxyResultProxy.result;
                }
                a(storyItemsObj);
                return b2.f124493a;
            }
        });
    }

    public static final /* synthetic */ void r1(StoryBottomEditorBarWidget storyBottomEditorBarWidget) {
        if (PatchProxy.proxy(new Object[]{storyBottomEditorBarWidget}, null, changeQuickRedirect, true, 44018, new Class[]{StoryBottomEditorBarWidget.class}, Void.TYPE).isSupported) {
            return;
        }
        storyBottomEditorBarWidget.n2();
    }

    private final void r2() {
        final com.max.hbstory.d mStoryContext;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43950, new Class[0], Void.TYPE).isSupported || (mStoryContext = getMStoryContext()) == null) {
            return;
        }
        StoryUtilsKt.p(this, getMPosition(), new l<StoryItemsObj, b2>() { // from class: com.max.xiaoheihe.module.story.widget.ui.video.widget.StoryBottomEditorBarWidget$showCommentDialog$1$1
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void a(@e StoryItemsObj storyItemsObj) {
                FragmentManager supportFragmentManager;
                Fragment fragmentB;
                if (PatchProxy.proxy(new Object[]{storyItemsObj}, this, changeQuickRedirect, false, 44117, new Class[]{StoryItemsObj.class}, Void.TYPE).isSupported) {
                    return;
                }
                StoryCommentBottomSheetDialog storyCommentBottomSheetDialog = new StoryCommentBottomSheetDialog(mStoryContext, this.getMPosition(), false, 4, null);
                com.max.hbstory.d mStoryContext2 = this.getMStoryContext();
                FragmentActivity activity = (mStoryContext2 == null || (fragmentB = mStoryContext2.b()) == null) ? null : fragmentB.getActivity();
                if (activity == null || (supportFragmentManager = activity.getSupportFragmentManager()) == null) {
                    return;
                }
                storyCommentBottomSheetDialog.M3(supportFragmentManager, "bottomDialogTag");
            }

            /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, kotlin.b2] */
            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(StoryItemsObj storyItemsObj) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{storyItemsObj}, this, changeQuickRedirect, false, 44118, new Class[]{Object.class}, Object.class);
                if (patchProxyResultProxy.isSupported) {
                    return patchProxyResultProxy.result;
                }
                a(storyItemsObj);
                return b2.f124493a;
            }
        });
    }

    public static final /* synthetic */ void s1(StoryBottomEditorBarWidget storyBottomEditorBarWidget, boolean z10) {
        if (PatchProxy.proxy(new Object[]{storyBottomEditorBarWidget, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 44011, new Class[]{StoryBottomEditorBarWidget.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        storyBottomEditorBarWidget.setFavourSate(z10);
    }

    private final void s2() {
        final com.max.hbstory.d mStoryContext;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43951, new Class[0], Void.TYPE).isSupported || (mStoryContext = getMStoryContext()) == null) {
            return;
        }
        StoryUtilsKt.p(this, getMPosition(), new l<StoryItemsObj, b2>() { // from class: com.max.xiaoheihe.module.story.widget.ui.video.widget.StoryBottomEditorBarWidget$showInputEditor$1$1
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void a(@e StoryItemsObj storyItemsObj) {
                FragmentManager supportFragmentManager;
                Fragment fragmentB;
                if (PatchProxy.proxy(new Object[]{storyItemsObj}, this, changeQuickRedirect, false, 44119, new Class[]{StoryItemsObj.class}, Void.TYPE).isSupported) {
                    return;
                }
                com.max.xiaoheihe.module.story.comment.b bVar = new com.max.xiaoheihe.module.story.comment.b(mStoryContext, this.getMPosition(), new l<BBSCommentsObj, b2>() { // from class: com.max.xiaoheihe.module.story.widget.ui.video.widget.StoryBottomEditorBarWidget$showInputEditor$1$1$dialog$1
                    public static ChangeQuickRedirect changeQuickRedirect;

                    public final void a(@e BBSCommentsObj bBSCommentsObj) {
                    }

                    /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, kotlin.b2] */
                    @Override // yh.l
                    public /* bridge */ /* synthetic */ b2 invoke(BBSCommentsObj bBSCommentsObj) {
                        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{bBSCommentsObj}, this, changeQuickRedirect, false, 44121, new Class[]{Object.class}, Object.class);
                        if (patchProxyResultProxy.isSupported) {
                            return patchProxyResultProxy.result;
                        }
                        a(bBSCommentsObj);
                        return b2.f124493a;
                    }
                }, new p<String, BBSCommentsObj, b2>() { // from class: com.max.xiaoheihe.module.story.widget.ui.video.widget.StoryBottomEditorBarWidget$showInputEditor$1$1$dialog$2
                    public static ChangeQuickRedirect changeQuickRedirect;

                    public final void a(@e String str, @e BBSCommentsObj bBSCommentsObj) {
                    }

                    /* JADX WARN: Type inference failed for: r10v3, types: [java.lang.Object, kotlin.b2] */
                    @Override // yh.p
                    public /* bridge */ /* synthetic */ b2 invoke(String str, BBSCommentsObj bBSCommentsObj) {
                        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, bBSCommentsObj}, this, changeQuickRedirect, false, 44122, new Class[]{Object.class, Object.class}, Object.class);
                        if (patchProxyResultProxy.isSupported) {
                            return patchProxyResultProxy.result;
                        }
                        a(str, bBSCommentsObj);
                        return b2.f124493a;
                    }
                });
                com.max.hbstory.d mStoryContext2 = this.getMStoryContext();
                FragmentActivity activity = (mStoryContext2 == null || (fragmentB = mStoryContext2.b()) == null) ? null : fragmentB.getActivity();
                if (activity == null || (supportFragmentManager = activity.getSupportFragmentManager()) == null) {
                    return;
                }
                bVar.M3(supportFragmentManager, "bottomDialogTag");
            }

            /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, kotlin.b2] */
            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(StoryItemsObj storyItemsObj) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{storyItemsObj}, this, changeQuickRedirect, false, 44120, new Class[]{Object.class}, Object.class);
                if (patchProxyResultProxy.isSupported) {
                    return patchProxyResultProxy.result;
                }
                a(storyItemsObj);
                return b2.f124493a;
            }
        });
    }

    private final void setFavourSate(boolean z10) {
        StoryLinkCardInfoObj link_card_info;
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 43982, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        StoryItemsObj storyItemsObjN = StoryUtilsKt.n(this, getMPosition());
        StoryStatInfoObj stat_info = (storyItemsObjN == null || (link_card_info = storyItemsObjN.getLink_card_info()) == null) ? null : link_card_info.getStat_info();
        if (stat_info == null) {
            return;
        }
        stat_info.set_favour_link(z10);
    }

    private final void setLikeCount(int i10) {
        StoryLinkCardInfoObj link_card_info;
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 43980, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        StoryItemsObj storyItemsObjN = StoryUtilsKt.n(this, getMPosition());
        StoryStatInfoObj stat_info = (storyItemsObjN == null || (link_card_info = storyItemsObjN.getLink_card_info()) == null) ? null : link_card_info.getStat_info();
        if (stat_info == null) {
            return;
        }
        stat_info.setLink_award_num(i10);
    }

    private final void setLikeSate(boolean z10) {
        StoryLinkCardInfoObj link_card_info;
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 43981, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        StoryItemsObj storyItemsObjN = StoryUtilsKt.n(this, getMPosition());
        StoryStatInfoObj stat_info = (storyItemsObjN == null || (link_card_info = storyItemsObjN.getLink_card_info()) == null) ? null : link_card_info.getStat_info();
        if (stat_info == null) {
            return;
        }
        stat_info.set_award_link(z10);
    }

    public static final /* synthetic */ void t1(StoryBottomEditorBarWidget storyBottomEditorBarWidget, boolean z10) {
        if (PatchProxy.proxy(new Object[]{storyBottomEditorBarWidget, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 44008, new Class[]{StoryBottomEditorBarWidget.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        storyBottomEditorBarWidget.setLikeSate(z10);
    }

    private final void t2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43966, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        StoryUtilsKt.p(this, getMPosition(), new l<StoryItemsObj, b2>() { // from class: com.max.xiaoheihe.module.story.widget.ui.video.widget.StoryBottomEditorBarWidget$unFavorite$1
            public static ChangeQuickRedirect changeQuickRedirect;

            {
                super(1);
            }

            public final void a(@e final StoryItemsObj storyItemsObj) {
                final StoryBottomEditorBarWidget storyBottomEditorBarWidget;
                com.max.hbstory.d mStoryContext;
                c cVarC;
                if (PatchProxy.proxy(new Object[]{storyItemsObj}, this, changeQuickRedirect, false, 44123, new Class[]{StoryItemsObj.class}, Void.TYPE).isSupported || storyItemsObj == null || (mStoryContext = (storyBottomEditorBarWidget = this.f92269b).getMStoryContext()) == null || (cVarC = mStoryContext.c()) == null) {
                    return;
                }
                Context context = storyBottomEditorBarWidget.getContext();
                f0.o(context, "context");
                String h_src = storyItemsObj.getH_src();
                StoryCardIdInfoObj card_id_info = storyItemsObj.getCard_id_info();
                cVarC.b(context, h_src, card_id_info != null ? card_id_info.getItem_id() : null, new yh.a<b2>() { // from class: com.max.xiaoheihe.module.story.widget.ui.video.widget.StoryBottomEditorBarWidget$unFavorite$1$1$1
                    public static ChangeQuickRedirect changeQuickRedirect;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.b2] */
                    @Override // yh.a
                    public /* bridge */ /* synthetic */ b2 invoke() {
                        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44126, new Class[0], Object.class);
                        if (patchProxyResultProxy.isSupported) {
                            return patchProxyResultProxy.result;
                        }
                        invoke2();
                        return b2.f124493a;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44125, new Class[0], Void.TYPE).isSupported) {
                            return;
                        }
                        StoryBottomEditorBarWidget.b1(storyBottomEditorBarWidget);
                        StoryLinkCardInfoObj link_card_info = storyItemsObj.getLink_card_info();
                        StoryStatInfoObj stat_info = link_card_info != null ? link_card_info.getStat_info() : null;
                        if (stat_info != null) {
                            stat_info.set_favour_link(false);
                        }
                        StoryBottomEditorBarWidget.l1(storyBottomEditorBarWidget);
                    }
                }, new l<Throwable, b2>() { // from class: com.max.xiaoheihe.module.story.widget.ui.video.widget.StoryBottomEditorBarWidget$unFavorite$1$1$2
                    public static ChangeQuickRedirect changeQuickRedirect;

                    /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, kotlin.b2] */
                    @Override // yh.l
                    public /* bridge */ /* synthetic */ b2 invoke(Throwable th2) {
                        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 44128, new Class[]{Object.class}, Object.class);
                        if (patchProxyResultProxy.isSupported) {
                            return patchProxyResultProxy.result;
                        }
                        invoke2(th2);
                        return b2.f124493a;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@d Throwable it) {
                        if (PatchProxy.proxy(new Object[]{it}, this, changeQuickRedirect, false, 44127, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                            return;
                        }
                        f0.p(it, "it");
                    }
                });
            }

            /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, kotlin.b2] */
            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(StoryItemsObj storyItemsObj) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{storyItemsObj}, this, changeQuickRedirect, false, 44124, new Class[]{Object.class}, Object.class);
                if (patchProxyResultProxy.isSupported) {
                    return patchProxyResultProxy.result;
                }
                a(storyItemsObj);
                return b2.f124493a;
            }
        });
    }

    public static final /* synthetic */ void u1(StoryBottomEditorBarWidget storyBottomEditorBarWidget, String str, Map map, LifecycleCoroutineScope lifecycleCoroutineScope) {
        if (PatchProxy.proxy(new Object[]{storyBottomEditorBarWidget, str, map, lifecycleCoroutineScope}, null, changeQuickRedirect, true, 44016, new Class[]{StoryBottomEditorBarWidget.class, String.class, Map.class, LifecycleCoroutineScope.class}, Void.TYPE).isSupported) {
            return;
        }
        storyBottomEditorBarWidget.p2(str, map, lifecycleCoroutineScope);
    }

    public static final /* synthetic */ void v1(StoryBottomEditorBarWidget storyBottomEditorBarWidget) {
        if (PatchProxy.proxy(new Object[]{storyBottomEditorBarWidget}, null, changeQuickRedirect, true, 44035, new Class[]{StoryBottomEditorBarWidget.class}, Void.TYPE).isSupported) {
            return;
        }
        storyBottomEditorBarWidget.q2();
    }

    public static final /* synthetic */ void w1(StoryBottomEditorBarWidget storyBottomEditorBarWidget) {
        if (PatchProxy.proxy(new Object[]{storyBottomEditorBarWidget}, null, changeQuickRedirect, true, 44036, new Class[]{StoryBottomEditorBarWidget.class}, Void.TYPE).isSupported) {
            return;
        }
        storyBottomEditorBarWidget.r2();
    }

    public static final /* synthetic */ void x1(StoryBottomEditorBarWidget storyBottomEditorBarWidget) {
        if (PatchProxy.proxy(new Object[]{storyBottomEditorBarWidget}, null, changeQuickRedirect, true, 44034, new Class[]{StoryBottomEditorBarWidget.class}, Void.TYPE).isSupported) {
            return;
        }
        storyBottomEditorBarWidget.t2();
    }

    private final void y1(int i10) {
        StoryLinkCardInfoObj link_card_info;
        StoryStatInfoObj stat_info;
        StoryItemsObj storyItemsObjM;
        String post_comment_tips;
        int comment_count = 0;
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 43955, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        com.max.hbstory.d mStoryContext = getMStoryContext();
        b2 b2Var = null;
        if (mStoryContext != null && (storyItemsObjM = StoryUtilsKt.m(mStoryContext, i10)) != null && (post_comment_tips = storyItemsObjM.getPost_comment_tips()) != null) {
            if (!(true ^ kotlin.text.u.V1(post_comment_tips))) {
                post_comment_tips = null;
            }
            if (post_comment_tips != null) {
                setDefaultEditTextHint(post_comment_tips);
                getEditor().setHint(post_comment_tips);
                b2Var = b2.f124493a;
            }
        }
        if (b2Var == null) {
            StoryItemsObj storyItemsObjN = StoryUtilsKt.n(this, getMPosition());
            if (storyItemsObjN != null && (link_card_info = storyItemsObjN.getLink_card_info()) != null && (stat_info = link_card_info.getStat_info()) != null) {
                comment_count = stat_info.getComment_count();
            }
            x(comment_count);
        }
    }

    private final void z1(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 43983, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        post(new a(z10));
    }

    public final void J1() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43953, new Class[0], Void.TYPE).isSupported && i0.e(getContext())) {
            if (I0()) {
                setComboTipVisible(false);
            }
            s2();
        }
    }

    @Override // com.max.xiaoheihe.module.bbs.component.bottomeditorbar.BaseBottomEditorBar
    public void L() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43949, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        setLockContentMinHeight(true);
        super.L();
    }

    @Override // com.max.hbstory.viewpage2.video.a
    public void c(@dl.d com.max.hbstory.d storyContext, int i10) {
        if (PatchProxy.proxy(new Object[]{storyContext, new Integer(i10)}, this, changeQuickRedirect, false, 43952, new Class[]{com.max.hbstory.d.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(storyContext, "storyContext");
    }

    @Override // com.max.hbstory.viewpage2.video.a
    public void e(@dl.d com.max.hbstory.d storyContext, int i10) {
        if (PatchProxy.proxy(new Object[]{storyContext, new Integer(i10)}, this, changeQuickRedirect, false, 43954, new Class[]{com.max.hbstory.d.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(storyContext, "storyContext");
        setMStoryContext(storyContext);
        setMPosition(i10);
        setMaskColor(-1);
        A0();
        B0();
        g2();
        h2();
        setBarDarkStyle();
        o2();
        if (!this.f92191h4) {
            this.f92191h4 = true;
            b2();
            a2();
            S1();
        }
        y1(i10);
        A(true, i0.s());
    }

    @Override // com.max.hbstory.viewpage2.video.a
    public void f() {
    }

    @dl.e
    public Void getCoreViewBinding() {
        return this.f92184a4;
    }

    @Override // com.max.hbstory.viewpage2.video.a
    /* JADX INFO: renamed from: getCoreViewBinding, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ l3.c mo41getCoreViewBinding() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44007, new Class[0], l3.c.class);
        return patchProxyResultProxy.isSupported ? (l3.c) patchProxyResultProxy.result : (l3.c) getCoreViewBinding();
    }

    @Override // com.max.hbstory.viewpage2.video.a
    public int getMPosition() {
        return this.f92186c4;
    }

    @Override // com.max.hbstory.viewpage2.video.a
    @dl.e
    public com.max.hbstory.d getMStoryContext() {
        return this.f92185b4;
    }

    @Override // com.max.hbstory.viewpage2.video.a
    public void hide() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44000, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        setVisibility(8);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43998, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        setOnClickListener(null);
        super.onDetachedFromWindow();
    }

    @Override // com.max.hbstory.viewpage2.video.a
    public void setMPosition(int i10) {
        this.f92186c4 = i10;
    }

    @Override // com.max.hbstory.viewpage2.video.a
    public void setMStoryContext(@dl.e com.max.hbstory.d dVar) {
        this.f92185b4 = dVar;
    }

    @Override // com.max.hbstory.viewpage2.video.a
    public void show() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43999, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        setVisibility(0);
    }

    @Override // com.max.xiaoheihe.module.bbs.component.bottomeditorbar.BottomEditorBarPostPageImpl
    public int z0(boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 43948, new Class[]{Boolean.TYPE}, Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        if (getDarkStyle()) {
            return z10 ? getContext().getColor(R.color.white) : getContext().getColor(R.color.ps_color_4d);
        }
        return super.z0(z10);
    }
}
