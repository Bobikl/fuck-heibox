package com.max.xiaoheihe.view.uikit;

import android.animation.Animator;
import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.compose.runtime.internal.o;
import androidx.fragment.app.FragmentActivity;
import com.airbnb.lottie.LottieAnimationView;
import com.airbnb.lottie.RenderMode;
import com.airbnb.lottie.g;
import com.airbnb.lottie.h;
import com.airbnb.lottie.l;
import com.airbnb.lottie.n;
import com.max.hbcommon.utils.c;
import com.max.hbuikit.bean.LottieMarkerObj;
import com.max.hbuikit.bean.UiKitImageObj;
import com.max.hbuikit.bean.UiKitLottieObj;
import com.max.hbuikit.bean.UiKitMarkerLottieObj;
import com.max.hbuikit.bean.UiKitTextObj;
import com.max.hbuikit.bean.UiKitViewObj;
import com.max.hbuikit.bean.param.UiKitLottieListObj;
import com.max.hbuikit.component.BaseUiKitView;
import com.max.hbuikit.utils.UiKitUtil;
import com.max.hbutils.core.BaseApplication;
import com.max.hbutils.utils.u;
import com.max.xiaoheihe.accelworld.AccelWorldLottieKt;
import com.max.xiaoheihe.bean.uikit.UiKitFeedsFeedbackObj;
import com.max.xiaoheihe.bean.uikit.UiKitRichTextObj;
import com.max.xiaoheihe.bean.uikit.UiKitUserLevelObj;
import com.max.xiaoheihe.bean.uikit.UiKitUserMedalObj;
import com.max.xiaoheihe.module.account.component.UserLevelView;
import com.max.xiaoheihe.module.bbs.component.BBSUserSectionView;
import com.max.xiaoheihe.module.expression.widget.ExpressionTextView;
import com.max.xiaoheihe.utils.r;
import com.max.xiaoheihe.view.richtext.RichStackModelView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.b2;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;

/* JADX INFO: compiled from: HBUiKitView.kt */
/* JADX INFO: loaded from: classes13.dex */
@t0({"SMAP\nHBUiKitView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HBUiKitView.kt\ncom/max/xiaoheihe/view/uikit/HBUiKitView\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,368:1\n1603#2,9:369\n1855#2:378\n1856#2:380\n1612#2:381\n1#3:379\n*S KotlinDebug\n*F\n+ 1 HBUiKitView.kt\ncom/max/xiaoheihe/view/uikit/HBUiKitView\n*L\n209#1:369,9\n209#1:378\n209#1:380\n209#1:381\n209#1:379\n*E\n"})
@o(parameters = 0)
public final class HBUiKitView extends BaseUiKitView {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f96154i = 8;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @dl.e
    private com.max.xiaoheihe.view.uikit.b f96155h;

    /* JADX INFO: compiled from: HBUiKitView.kt */
    public static final class a<T> implements l {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Ref.ObjectRef<g> f96156a;

        a(Ref.ObjectRef<g> objectRef) {
            this.f96156a = objectRef;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void a(g gVar) {
            this.f96156a.f124891b = gVar;
        }

        @Override // com.airbnb.lottie.l
        public /* bridge */ /* synthetic */ void onResult(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 49720, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            a((g) obj);
        }
    }

    /* JADX INFO: compiled from: HBUiKitView.kt */
    public static final class b<T> implements l {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ WeakReference<LottieAnimationView> f96157a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f96158b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ UiKitLottieListObj f96159c;

        b(WeakReference<LottieAnimationView> weakReference, boolean z10, UiKitLottieListObj uiKitLottieListObj) {
            this.f96157a = weakReference;
            this.f96158b = z10;
            this.f96159c = uiKitLottieListObj;
        }

        public final void a(g gVar) {
            LottieAnimationView lottieAnimationView;
            int i10 = 0;
            if (PatchProxy.proxy(new Object[]{gVar}, this, changeQuickRedirect, false, 49723, new Class[]{g.class}, Void.TYPE).isSupported || (lottieAnimationView = this.f96157a.get()) == null) {
                return;
            }
            boolean z10 = this.f96158b;
            UiKitLottieListObj uiKitLottieListObj = this.f96159c;
            lottieAnimationView.setComposition(gVar);
            if (z10 && com.max.hbcommon.utils.c.A(uiKitLottieListObj.getLast_infinite())) {
                i10 = -1;
            }
            lottieAnimationView.setRepeatCount(i10);
            lottieAnimationView.E();
        }

        @Override // com.airbnb.lottie.l
        public /* bridge */ /* synthetic */ void onResult(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 49724, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            a((g) obj);
        }
    }

    /* JADX INFO: compiled from: HBUiKitView.kt */
    public static final class c implements Animator.AnimatorListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Ref.IntRef f96160b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ List<UiKitLottieObj> f96161c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Context f96162d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Ref.ObjectRef<g> f96163e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f96164f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ WeakReference<LottieAnimationView> f96165g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ LottieAnimationView f96166h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ UiKitLottieListObj f96167i;

        c(Ref.IntRef intRef, List<UiKitLottieObj> list, Context context, Ref.ObjectRef<g> objectRef, boolean z10, WeakReference<LottieAnimationView> weakReference, LottieAnimationView lottieAnimationView, UiKitLottieListObj uiKitLottieListObj) {
            this.f96160b = intRef;
            this.f96161c = list;
            this.f96162d = context;
            this.f96163e = objectRef;
            this.f96164f = z10;
            this.f96165g = weakReference;
            this.f96166h = lottieAnimationView;
            this.f96167i = uiKitLottieListObj;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(@dl.d Animator animation) {
            if (PatchProxy.proxy(new Object[]{animation}, this, changeQuickRedirect, false, 49727, new Class[]{Animator.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(animation, "animation");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(@dl.d Animator animation) {
            if (PatchProxy.proxy(new Object[]{animation}, this, changeQuickRedirect, false, 49726, new Class[]{Animator.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(animation, "animation");
            if (this.f96164f) {
                return;
            }
            Ref.IntRef intRef = this.f96160b;
            intRef.f124889b++;
            Ref.ObjectRef<g> objectRef = this.f96163e;
            g gVar = objectRef.f124891b;
            if (gVar != null) {
                WeakReference<LottieAnimationView> weakReference = this.f96165g;
                List<UiKitLottieObj> list = this.f96161c;
                Context context = this.f96162d;
                LottieAnimationView lottieAnimationView = this.f96166h;
                UiKitLottieListObj uiKitLottieListObj = this.f96167i;
                LottieAnimationView lottieAnimationView2 = weakReference.get();
                if (lottieAnimationView2 != null) {
                    lottieAnimationView2.setComposition(gVar);
                    lottieAnimationView2.E();
                    HBUiKitView.k(intRef, list, context, lottieAnimationView, weakReference, uiKitLottieListObj, objectRef);
                }
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(@dl.d Animator animation) {
            if (PatchProxy.proxy(new Object[]{animation}, this, changeQuickRedirect, false, 49728, new Class[]{Animator.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(animation, "animation");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(@dl.d Animator animation) {
            if (PatchProxy.proxy(new Object[]{animation}, this, changeQuickRedirect, false, 49725, new Class[]{Animator.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(animation, "animation");
            HBUiKitView.j(this.f96160b, this.f96161c, this.f96162d, this.f96163e);
        }
    }

    /* JADX INFO: compiled from: HBUiKitView.kt */
    public static final class d implements n {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ LottieAnimationView f96169b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ List<String> f96170c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f96171d;

        d(LottieAnimationView lottieAnimationView, List<String> list, boolean z10) {
            this.f96169b = lottieAnimationView;
            this.f96170c = list;
            this.f96171d = z10;
        }

        @Override // com.airbnb.lottie.n
        public void a(@dl.e g gVar) {
            if (PatchProxy.proxy(new Object[]{gVar}, this, changeQuickRedirect, false, 49729, new Class[]{g.class}, Void.TYPE).isSupported) {
                return;
            }
            HBUiKitView.l(HBUiKitView.this, this.f96169b, this.f96170c, 0, this.f96171d);
            this.f96169b.K(this);
        }
    }

    /* JADX INFO: compiled from: HBUiKitView.kt */
    public static final class e implements Animator.AnimatorListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ WeakReference<LottieAnimationView> f96172b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ HBUiKitView f96173c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ List<String> f96174d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f96175e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f96176f;

        e(WeakReference<LottieAnimationView> weakReference, HBUiKitView hBUiKitView, List<String> list, int i10, boolean z10) {
            this.f96172b = weakReference;
            this.f96173c = hBUiKitView;
            this.f96174d = list;
            this.f96175e = i10;
            this.f96176f = z10;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(@dl.d Animator animation) {
            if (PatchProxy.proxy(new Object[]{animation}, this, changeQuickRedirect, false, 49732, new Class[]{Animator.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(animation, "animation");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(@dl.d Animator animation) {
            if (PatchProxy.proxy(new Object[]{animation}, this, changeQuickRedirect, false, 49731, new Class[]{Animator.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(animation, "animation");
            LottieAnimationView lottieAnimationView = this.f96172b.get();
            if (lottieAnimationView != null) {
                HBUiKitView.l(this.f96173c, lottieAnimationView, this.f96174d, this.f96175e + 1, this.f96176f);
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(@dl.d Animator animation) {
            if (PatchProxy.proxy(new Object[]{animation}, this, changeQuickRedirect, false, 49733, new Class[]{Animator.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(animation, "animation");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(@dl.d Animator animation) {
            if (PatchProxy.proxy(new Object[]{animation}, this, changeQuickRedirect, false, 49730, new Class[]{Animator.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(animation, "animation");
        }
    }

    /* JADX INFO: compiled from: HBUiKitView.kt */
    public static final class f implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ UiKitViewObj f96178c;

        /* JADX INFO: compiled from: HBUiKitView.kt */
        public static final class a implements com.max.xiaoheihe.module.news.g.e {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ UiKitViewObj f96179a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ HBUiKitView f96180b;

            a(UiKitViewObj uiKitViewObj, HBUiKitView hBUiKitView) {
                this.f96179a = uiKitViewObj;
                this.f96180b = hBUiKitView;
            }

            @Override // com.max.xiaoheihe.module.news.g.e
            public final void a() {
                String linkid;
                HBUiKitView hBUiKitView;
                com.max.xiaoheihe.view.uikit.b iUiKit;
                if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 49735, new Class[0], Void.TYPE).isSupported || (linkid = ((UiKitFeedsFeedbackObj) this.f96179a).getLinkid()) == null || (iUiKit = (hBUiKitView = this.f96180b).getIUiKit()) == null) {
                    return;
                }
                UiKitViewObj rootViewObj = hBUiKitView.getRootViewObj();
                iUiKit.a(linkid, rootViewObj != null ? rootViewObj.getTemplate_id() : null);
            }
        }

        f(UiKitViewObj uiKitViewObj) {
            this.f96178c = uiKitViewObj;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 49734, new Class[]{View.class}, Void.TYPE).isSupported || !(HBUiKitView.this.getContext() instanceof FragmentActivity) || com.max.hbcommon.utils.c.w(((UiKitFeedsFeedbackObj) this.f96178c).getFeedback())) {
                return;
            }
            Context context = HBUiKitView.this.getContext();
            f0.n(context, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            com.max.xiaoheihe.module.news.g gVarC4 = com.max.xiaoheihe.module.news.g.c4(((UiKitFeedsFeedbackObj) this.f96178c).getLinkid(), ((UiKitFeedsFeedbackObj) this.f96178c).getFeedback(), ((UiKitFeedsFeedbackObj) this.f96178c).getH_src(), "2");
            gVarC4.g4(new a(this.f96178c, HBUiKitView.this));
            gVarC4.show(((FragmentActivity) context).getSupportFragmentManager(), "NegativeFeedback");
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HBUiKitView(@dl.d Context context) {
        this(context, null);
        f0.p(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HBUiKitView(@dl.d Context context, @dl.e AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        f0.p(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HBUiKitView(@dl.d Context context, @dl.e AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        f0.p(context, "context");
    }

    public static final /* synthetic */ void j(Ref.IntRef intRef, List list, Context context, Ref.ObjectRef objectRef) {
        if (PatchProxy.proxy(new Object[]{intRef, list, context, objectRef}, null, changeQuickRedirect, true, 49716, new Class[]{Ref.IntRef.class, List.class, Context.class, Ref.ObjectRef.class}, Void.TYPE).isSupported) {
            return;
        }
        n(intRef, list, context, objectRef);
    }

    public static final /* synthetic */ void k(Ref.IntRef intRef, List list, Context context, LottieAnimationView lottieAnimationView, WeakReference weakReference, UiKitLottieListObj uiKitLottieListObj, Ref.ObjectRef objectRef) {
        if (PatchProxy.proxy(new Object[]{intRef, list, context, lottieAnimationView, weakReference, uiKitLottieListObj, objectRef}, null, changeQuickRedirect, true, 49717, new Class[]{Ref.IntRef.class, List.class, Context.class, LottieAnimationView.class, WeakReference.class, UiKitLottieListObj.class, Ref.ObjectRef.class}, Void.TYPE).isSupported) {
            return;
        }
        o(intRef, list, context, lottieAnimationView, weakReference, uiKitLottieListObj, objectRef);
    }

    public static final /* synthetic */ void l(HBUiKitView hBUiKitView, LottieAnimationView lottieAnimationView, List list, int i10, boolean z10) {
        if (PatchProxy.proxy(new Object[]{hBUiKitView, lottieAnimationView, list, new Integer(i10), new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 49715, new Class[]{HBUiKitView.class, LottieAnimationView.class, List.class, Integer.TYPE, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        hBUiKitView.q(lottieAnimationView, list, i10, z10);
    }

    private final void m(Context context, LottieAnimationView lottieAnimationView, UiKitLottieListObj uiKitLottieListObj) {
        if (PatchProxy.proxy(new Object[]{context, lottieAnimationView, uiKitLottieListObj}, this, changeQuickRedirect, false, 49712, new Class[]{Context.class, LottieAnimationView.class, UiKitLottieListObj.class}, Void.TYPE).isSupported) {
            return;
        }
        List<UiKitLottieObj> list = uiKitLottieListObj.getList();
        f0.m(list);
        if (list.isEmpty()) {
            return;
        }
        o(new Ref.IntRef(), list, context, lottieAnimationView, new WeakReference(lottieAnimationView), uiKitLottieListObj, new Ref.ObjectRef());
    }

    private static final void n(Ref.IntRef intRef, List<UiKitLottieObj> list, Context context, final Ref.ObjectRef<g> objectRef) {
        if (!PatchProxy.proxy(new Object[]{intRef, list, context, objectRef}, null, changeQuickRedirect, true, 49713, new Class[]{Ref.IntRef.class, List.class, Context.class, Ref.ObjectRef.class}, Void.TYPE).isSupported && intRef.f124889b + 1 < list.size()) {
            UiKitLottieObj uiKitLottieObj = list.get(intRef.f124889b + 1);
            if (new File(r.r(uiKitLottieObj.getKey())).exists()) {
                AccelWorldLottieKt.h(uiKitLottieObj.getKey(), null, new yh.l<g, b2>() { // from class: com.max.xiaoheihe.view.uikit.HBUiKitView$playAnimationsSequentially$loadNextAnimation$1
                    public static ChangeQuickRedirect changeQuickRedirect;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    public final void a(@d g composition) {
                        if (PatchProxy.proxy(new Object[]{composition}, this, changeQuickRedirect, false, 49718, new Class[]{g.class}, Void.TYPE).isSupported) {
                            return;
                        }
                        f0.p(composition, "composition");
                        objectRef.f124891b = composition;
                    }

                    /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, kotlin.b2] */
                    @Override // yh.l
                    public /* bridge */ /* synthetic */ b2 invoke(g gVar) {
                        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{gVar}, this, changeQuickRedirect, false, 49719, new Class[]{Object.class}, Object.class);
                        if (patchProxyResultProxy.isSupported) {
                            return patchProxyResultProxy.result;
                        }
                        a(gVar);
                        return b2.f124493a;
                    }
                }, 2, null);
            } else {
                h.x(context, uiKitLottieObj.getUrl(), uiKitLottieObj.getKey()).f(new a(objectRef));
            }
        }
    }

    private static final void o(Ref.IntRef intRef, List<UiKitLottieObj> list, Context context, LottieAnimationView lottieAnimationView, final WeakReference<LottieAnimationView> weakReference, final UiKitLottieListObj uiKitLottieListObj, Ref.ObjectRef<g> objectRef) {
        if (!PatchProxy.proxy(new Object[]{intRef, list, context, lottieAnimationView, weakReference, uiKitLottieListObj, objectRef}, null, changeQuickRedirect, true, 49714, new Class[]{Ref.IntRef.class, List.class, Context.class, LottieAnimationView.class, WeakReference.class, UiKitLottieListObj.class, Ref.ObjectRef.class}, Void.TYPE).isSupported && intRef.f124889b < list.size()) {
            UiKitLottieObj uiKitLottieObj = list.get(intRef.f124889b);
            final boolean z10 = intRef.f124889b == list.size() - 1;
            if (new File(r.r(uiKitLottieObj.getKey())).exists()) {
                AccelWorldLottieKt.h(uiKitLottieObj.getKey(), null, new yh.l<g, b2>() { // from class: com.max.xiaoheihe.view.uikit.HBUiKitView$playAnimationsSequentially$playNextAnimation$1
                    public static ChangeQuickRedirect changeQuickRedirect;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    public final void a(@d g composition) {
                        int i10 = 0;
                        if (PatchProxy.proxy(new Object[]{composition}, this, changeQuickRedirect, false, 49721, new Class[]{g.class}, Void.TYPE).isSupported) {
                            return;
                        }
                        f0.p(composition, "composition");
                        LottieAnimationView lottieAnimationView2 = weakReference.get();
                        if (lottieAnimationView2 != null) {
                            boolean z11 = z10;
                            UiKitLottieListObj uiKitLottieListObj2 = uiKitLottieListObj;
                            lottieAnimationView2.setComposition(composition);
                            if (z11 && c.A(uiKitLottieListObj2.getLast_infinite())) {
                                i10 = -1;
                            }
                            lottieAnimationView2.setRepeatCount(i10);
                            lottieAnimationView2.E();
                        }
                    }

                    /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, kotlin.b2] */
                    @Override // yh.l
                    public /* bridge */ /* synthetic */ b2 invoke(g gVar) {
                        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{gVar}, this, changeQuickRedirect, false, 49722, new Class[]{Object.class}, Object.class);
                        if (patchProxyResultProxy.isSupported) {
                            return patchProxyResultProxy.result;
                        }
                        a(gVar);
                        return b2.f124493a;
                    }
                }, 2, null);
            } else {
                h.x(context, uiKitLottieObj.getUrl(), uiKitLottieObj.getKey()).f(new b(weakReference, z10, uiKitLottieListObj));
            }
            lottieAnimationView.j(new c(intRef, list, context, objectRef, z10, weakReference, lottieAnimationView, uiKitLottieListObj));
        }
    }

    private final void p(LottieAnimationView lottieAnimationView, UiKitMarkerLottieObj uiKitMarkerLottieObj, String str, String str2) {
        if (PatchProxy.proxy(new Object[]{lottieAnimationView, uiKitMarkerLottieObj, str, str2}, this, changeQuickRedirect, false, 49709, new Class[]{LottieAnimationView.class, UiKitMarkerLottieObj.class, String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        List<LottieMarkerObj> markers = uiKitMarkerLottieObj.getMarkers();
        if (!(!(markers == null || markers.isEmpty()))) {
            markers = null;
        }
        if (markers == null) {
            return;
        }
        boolean zA = com.max.hbcommon.utils.c.A(uiKitMarkerLottieObj.getLast_marker_infinite());
        boolean zB = u.b(BaseApplication.a());
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = markers.iterator();
        while (it.hasNext()) {
            String targetMarker = ((LottieMarkerObj) it.next()).getTargetMarker(zB);
            if (targetMarker != null) {
                arrayList.add(targetMarker);
            }
        }
        r(lottieAnimationView, str, str2);
        lottieAnimationView.m(new d(lottieAnimationView, arrayList, zA));
    }

    private final void q(LottieAnimationView lottieAnimationView, List<String> list, int i10, boolean z10) {
        com.airbnb.lottie.model.g gVarL;
        if (PatchProxy.proxy(new Object[]{lottieAnimationView, list, new Integer(i10), new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 49710, new Class[]{LottieAnimationView.class, List.class, Integer.TYPE, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        lottieAnimationView.F();
        String str = (String) CollectionsKt___CollectionsKt.R2(list, i10);
        if (str == null) {
            lottieAnimationView.p();
            return;
        }
        Log.d("HBUiKitView-dbg", "[playTargetMarkerAnim]\nmarkerName: " + str + "\nplayMarkerIndex: " + i10 + ", listSize: " + list.size() + "\nisLastMarkerInfinite: " + z10);
        g composition = lottieAnimationView.getComposition();
        if (composition == null || (gVarL = composition.l(str)) == null) {
            com.max.heybox.hblog.g.f74531b.v("[playTargetMarkerAnim] Cannot find marker with name " + str);
            return;
        }
        Pair pair = new Pair(Integer.valueOf((int) gVarL.f37585b), Integer.valueOf((int) gVarL.f37586c));
        int iIntValue = ((Number) pair.a()).intValue();
        int iIntValue2 = (((Number) pair.b()).intValue() + iIntValue) - 1;
        lottieAnimationView.setMinAndMaxFrame(iIntValue, iIntValue2);
        Log.d("HBUiKitView-dbg", "[playTargetMarkerAnim] setMinAndMaxFrame: (" + iIntValue + ", " + iIntValue2 + ')');
        if (i10 < list.size() - 1) {
            lottieAnimationView.setRepeatCount(1);
            lottieAnimationView.E();
            lottieAnimationView.j(new e(new WeakReference(lottieAnimationView), this, list, i10, z10));
        } else if (!z10) {
            lottieAnimationView.setRepeatCount(1);
            lottieAnimationView.E();
        } else {
            lottieAnimationView.setRepeatMode(1);
            lottieAnimationView.setRepeatCount(-1);
            lottieAnimationView.E();
        }
    }

    private final void r(LottieAnimationView lottieAnimationView, String str, String str2) {
        if (PatchProxy.proxy(new Object[]{lottieAnimationView, str, str2}, this, changeQuickRedirect, false, 49711, new Class[]{LottieAnimationView.class, String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        if (new File(r.r(str2)).exists()) {
            AccelWorldLottieKt.a(lottieAnimationView, str2);
        } else {
            lottieAnimationView.setAnimationFromUrl(str, str2);
        }
    }

    private final LottieAnimationView s(Context context, LottieAnimationView lottieAnimationView, UiKitLottieObj uiKitLottieObj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, lottieAnimationView, uiKitLottieObj}, this, changeQuickRedirect, false, 49708, new Class[]{Context.class, LottieAnimationView.class, UiKitLottieObj.class}, LottieAnimationView.class);
        if (patchProxyResultProxy.isSupported) {
            return (LottieAnimationView) patchProxyResultProxy.result;
        }
        if (lottieAnimationView != null && uiKitLottieObj != null) {
            UiKitUtil.v(context, lottieAnimationView, uiKitLottieObj);
            lottieAnimationView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            if (Build.VERSION.SDK_INT > 26) {
                lottieAnimationView.setRenderMode(RenderMode.HARDWARE);
            }
            UiKitMarkerLottieObj marker_lottie = uiKitLottieObj.getMarker_lottie();
            List[] listArr = new List[1];
            UiKitLottieListObj lottie_list = uiKitLottieObj.getLottie_list();
            listArr[0] = lottie_list != null ? lottie_list.getList() : null;
            if (!com.max.hbcommon.utils.c.w(listArr)) {
                UiKitLottieListObj lottie_list2 = uiKitLottieObj.getLottie_list();
                f0.m(lottie_list2);
                m(context, lottieAnimationView, lottie_list2);
            } else if (marker_lottie != null) {
                p(lottieAnimationView, marker_lottie, uiKitLottieObj.getUrl(), uiKitLottieObj.getKey());
            } else {
                r(lottieAnimationView, uiKitLottieObj.getUrl(), uiKitLottieObj.getKey());
                lottieAnimationView.setRepeatMode(1);
                lottieAnimationView.setRepeatCount(-1);
                lottieAnimationView.E();
            }
        }
        return lottieAnimationView;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.max.hbuikit.component.BaseUiKitView
    @dl.d
    public View c(@dl.d UiKitViewObj viewObj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{viewObj}, this, changeQuickRedirect, false, 49706, new Class[]{UiKitViewObj.class}, View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        f0.p(viewObj, "viewObj");
        String type = viewObj.getType();
        if (type != null) {
            switch (type.hashCode()) {
                case -1096937569:
                    if (type.equals(sd.b.f139389g)) {
                        return new LottieAnimationView(getContext());
                    }
                    break;
                case -842613072:
                    if (type.equals(com.max.xiaoheihe.view.uikit.a.f96190b)) {
                        return new RichStackModelView(getContext());
                    }
                    break;
                case 705981641:
                    if (type.equals(com.max.xiaoheihe.view.uikit.a.f96194f)) {
                        return new ImageView(getContext());
                    }
                    break;
                case 1927915024:
                    if (type.equals(com.max.xiaoheihe.view.uikit.a.f96192d)) {
                        return new UserLevelView(getContext());
                    }
                    break;
                case 1928821123:
                    if (type.equals(com.max.xiaoheihe.view.uikit.a.f96193e)) {
                        return new RelativeLayout(getContext());
                    }
                    break;
                case 2084653684:
                    if (type.equals(com.max.xiaoheihe.view.uikit.a.f96191c)) {
                        return new ExpressionTextView(getContext());
                    }
                    break;
            }
        }
        return super.c(viewObj);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.max.hbuikit.component.BaseUiKitView
    public void g(@dl.e View view, @dl.e UiKitViewObj uiKitViewObj) {
        if (PatchProxy.proxy(new Object[]{view, uiKitViewObj}, this, changeQuickRedirect, false, 49707, new Class[]{View.class, UiKitViewObj.class}, Void.TYPE).isSupported || view == null || uiKitViewObj == null) {
            return;
        }
        String type = uiKitViewObj.getType();
        if (type != null) {
            switch (type.hashCode()) {
                case -1096937569:
                    if (type.equals(sd.b.f139389g)) {
                        Context context = getContext();
                        f0.o(context, "context");
                        f0.m(s(context, (LottieAnimationView) view, (UiKitLottieObj) uiKitViewObj));
                        return;
                    }
                    break;
                case -842613072:
                    if (type.equals(com.max.xiaoheihe.view.uikit.a.f96190b)) {
                        RichStackModelView richStackModelView = (RichStackModelView) view;
                        richStackModelView.setRichStackData(((UiKitRichTextObj) uiKitViewObj).getRich_text_stack_model());
                        Context context2 = getContext();
                        f0.o(context2, "context");
                        richStackModelView.setLayoutParams(UiKitUtil.o(context2, uiKitViewObj));
                        return;
                    }
                    break;
                case 705981641:
                    if (type.equals(com.max.xiaoheihe.view.uikit.a.f96194f)) {
                        Context context3 = getContext();
                        f0.o(context3, "context");
                        ImageView imageViewX = UiKitUtil.x(context3, (ImageView) view, (UiKitImageObj) uiKitViewObj);
                        f0.m(imageViewX);
                        imageViewX.setOnClickListener(new f(uiKitViewObj));
                        return;
                    }
                    break;
                case 1927915024:
                    if (type.equals(com.max.xiaoheihe.view.uikit.a.f96192d)) {
                        UserLevelView userLevelView = (UserLevelView) view;
                        userLevelView.setLevel(com.max.hbutils.utils.n.q(((UiKitUserLevelObj) uiKitViewObj).getLevel()));
                        Context context4 = getContext();
                        f0.o(context4, "context");
                        userLevelView.setLayoutParams(UiKitUtil.o(context4, uiKitViewObj));
                        return;
                    }
                    break;
                case 1928821123:
                    if (type.equals(com.max.xiaoheihe.view.uikit.a.f96193e)) {
                        RelativeLayout relativeLayout = (RelativeLayout) view;
                        UiKitUserMedalObj uiKitUserMedalObj = (UiKitUserMedalObj) uiKitViewObj;
                        BBSUserSectionView.a aVar = BBSUserSectionView.f80844v;
                        Context context5 = getContext();
                        f0.o(context5, "context");
                        aVar.a(relativeLayout, context5, uiKitUserMedalObj.getPreview_medal_list(), uiKitUserMedalObj.getAll_medal_list(), uiKitUserMedalObj.getUser_id(), false);
                        Context context6 = getContext();
                        f0.o(context6, "context");
                        relativeLayout.setLayoutParams(UiKitUtil.o(context6, uiKitViewObj));
                        return;
                    }
                    break;
                case 2084653684:
                    if (type.equals(com.max.xiaoheihe.view.uikit.a.f96191c)) {
                        Context context7 = getContext();
                        f0.o(context7, "context");
                        f0.m(UiKitUtil.B(context7, (ExpressionTextView) view, (UiKitTextObj) uiKitViewObj));
                        return;
                    }
                    break;
            }
        }
        super.g(view, uiKitViewObj);
        b2 b2Var = b2.f124493a;
    }

    @dl.e
    public final com.max.xiaoheihe.view.uikit.b getIUiKit() {
        return this.f96155h;
    }

    public final void setIUiKit(@dl.e com.max.xiaoheihe.view.uikit.b bVar) {
        this.f96155h = bVar;
    }
}
