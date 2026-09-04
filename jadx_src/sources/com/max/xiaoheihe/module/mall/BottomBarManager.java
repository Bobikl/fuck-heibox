package com.max.xiaoheihe.module.mall;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewPropertyAnimator;
import com.google.gson.JsonObject;
import com.max.hbcustomview.CubicBezierInterpolators;
import com.max.hbuikit.bean.UiKitViewObj;
import com.max.xiaoheihe.bean.WebProtocolObj;
import com.max.xiaoheihe.utils.viewprioritymanager.ViewPriority;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.tencent.mmkv.MMKV;
import java.lang.ref.WeakReference;
import kotlin.b2;
import kotlin.jvm.internal.f0;
import kotlinx.coroutines.e1;
import kotlinx.coroutines.r0;

/* JADX INFO: compiled from: BottomBarManager.kt */
/* JADX INFO: loaded from: classes11.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
public final class BottomBarManager {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.e
    private static WeakReference<View> f89398b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.e
    private static WeakReference<View> f89399c;
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.e
    private static WeakReference<View> f89400d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final BottomBarManager f89397a = new BottomBarManager();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f89401e = 8;

    /* JADX INFO: compiled from: BottomBarManager.kt */
    public final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f89402a;

        static {
            int[] iArr = new int[NotificationType.valuesCustom().length];
            try {
                iArr[NotificationType.MALL_HEADER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[NotificationType.GAME_ALL_RECOMMEND.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[NotificationType.GAME_GET_GAME_LIST_V3.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f89402a = iArr;
        }
    }

    /* JADX INFO: compiled from: BottomBarManager.kt */
    public static final class b implements Runnable {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f89403b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ yh.a<b2> f89404c;

        b(View view, yh.a<b2> aVar) {
            this.f89403b = view;
            this.f89404c = aVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 39801, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            ViewParent parent = this.f89403b.getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(this.f89403b);
            }
            this.f89404c.invoke();
        }
    }

    /* JADX INFO: compiled from: BottomBarManager.kt */
    public static final class c implements ValueAnimator.AnimatorUpdateListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f89405b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f89406c;

        c(View view, int i10) {
            this.f89405b = view;
            this.f89406c = i10;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(@dl.d ValueAnimator it) {
            if (PatchProxy.proxy(new Object[]{it}, this, changeQuickRedirect, false, 39808, new Class[]{ValueAnimator.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(it, "it");
            Object animatedValue = it.getAnimatedValue();
            f0.n(animatedValue, "null cannot be cast to non-null type kotlin.Int");
            int iIntValue = ((Integer) animatedValue).intValue();
            this.f89405b.setAlpha((iIntValue * 1.0f) / this.f89406c);
            this.f89405b.scrollTo(0, iIntValue - this.f89406c);
        }
    }

    /* JADX INFO: compiled from: BottomBarManager.kt */
    public static final class d extends AnimatorListenerAdapter {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f89407b;

        d(View view) {
            this.f89407b = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(@dl.d Animator animation) {
            if (PatchProxy.proxy(new Object[]{animation}, this, changeQuickRedirect, false, 39810, new Class[]{Animator.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(animation, "animation");
            this.f89407b.setAlpha(1.0f);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(@dl.d Animator animation) {
            if (PatchProxy.proxy(new Object[]{animation}, this, changeQuickRedirect, false, 39809, new Class[]{Animator.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(animation, "animation");
            this.f89407b.setAlpha(0.25f);
            this.f89407b.setVisibility(0);
        }
    }

    private BottomBarManager() {
    }

    public static final /* synthetic */ void a(BottomBarManager bottomBarManager, NotificationType notificationType) {
        if (PatchProxy.proxy(new Object[]{bottomBarManager, notificationType}, null, changeQuickRedirect, true, 39794, new Class[]{BottomBarManager.class, NotificationType.class}, Void.TYPE).isSupported) {
            return;
        }
        bottomBarManager.i(notificationType);
    }

    public static final /* synthetic */ void b(BottomBarManager bottomBarManager, View view) {
        if (PatchProxy.proxy(new Object[]{bottomBarManager, view}, null, changeQuickRedirect, true, 39795, new Class[]{BottomBarManager.class, View.class}, Void.TYPE).isSupported) {
            return;
        }
        bottomBarManager.m(view);
    }

    private final void d(View view, yh.a<b2> aVar) {
        if (PatchProxy.proxy(new Object[]{view, aVar}, this, changeQuickRedirect, false, 39790, new Class[]{View.class, yh.a.class}, Void.TYPE).isSupported) {
            return;
        }
        Context context = view.getContext();
        f0.o(context, "context");
        float fA = com.max.accelworld.c.a(120.0f, context);
        ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
        viewPropertyAnimatorAnimate.setDuration(600L);
        viewPropertyAnimatorAnimate.translationY(fA);
        viewPropertyAnimatorAnimate.alpha(0.0f);
        viewPropertyAnimatorAnimate.setInterpolator(CubicBezierInterpolators.a(CubicBezierInterpolators.Type.EASE_OUT));
        viewPropertyAnimatorAnimate.withEndAction(new b(view, aVar));
        viewPropertyAnimatorAnimate.start();
    }

    private final void i(NotificationType notificationType) {
        View view;
        View view2;
        View view3;
        if (PatchProxy.proxy(new Object[]{notificationType}, this, changeQuickRedirect, false, 39789, new Class[]{NotificationType.class}, Void.TYPE).isSupported) {
            return;
        }
        int i10 = a.f89402a[notificationType.ordinal()];
        if (i10 == 1) {
            WeakReference<View> weakReference = f89398b;
            if (weakReference != null && (view = weakReference.get()) != null) {
                ViewParent parent = view.getParent();
                ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                if (viewGroup != null) {
                    viewGroup.removeView(view);
                }
                com.max.xiaoheihe.utils.viewprioritymanager.a.f95777a.b(ViewPriority.LOW.getValue());
            }
            f89398b = null;
            return;
        }
        if (i10 == 2) {
            WeakReference<View> weakReference2 = f89399c;
            if (weakReference2 != null && (view2 = weakReference2.get()) != null) {
                ViewParent parent2 = view2.getParent();
                ViewGroup viewGroup2 = parent2 instanceof ViewGroup ? (ViewGroup) parent2 : null;
                if (viewGroup2 != null) {
                    viewGroup2.removeView(view2);
                }
                com.max.xiaoheihe.utils.viewprioritymanager.a.f95777a.b(ViewPriority.LOW.getValue());
            }
            f89399c = null;
            return;
        }
        if (i10 != 3) {
            return;
        }
        WeakReference<View> weakReference3 = f89400d;
        if (weakReference3 != null && (view3 = weakReference3.get()) != null) {
            ViewParent parent3 = view3.getParent();
            ViewGroup viewGroup3 = parent3 instanceof ViewGroup ? (ViewGroup) parent3 : null;
            if (viewGroup3 != null) {
                viewGroup3.removeView(view3);
            }
            com.max.xiaoheihe.utils.viewprioritymanager.a.f95777a.b(ViewPriority.LOW.getValue());
        }
        f89400d = null;
    }

    private final void m(View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 39793, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        Context context = view.getContext();
        f0.o(context, "context");
        int iC = com.max.accelworld.c.c(120, context);
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, iC);
        valueAnimatorOfInt.setDuration(600L);
        valueAnimatorOfInt.setInterpolator(CubicBezierInterpolators.a(CubicBezierInterpolators.Type.EASE_OUT));
        valueAnimatorOfInt.addUpdateListener(new c(view, iC));
        valueAnimatorOfInt.addListener(new d(view));
        valueAnimatorOfInt.start();
    }

    public final void c(@dl.e View view, @dl.d WebProtocolObj webProtocolObj, @dl.d Context context, int i10, @dl.d NotificationType type) {
        if (PatchProxy.proxy(new Object[]{view, webProtocolObj, context, new Integer(i10), type}, this, changeQuickRedirect, false, 39792, new Class[]{View.class, WebProtocolObj.class, Context.class, Integer.TYPE, NotificationType.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(webProtocolObj, "webProtocolObj");
        f0.p(context, "context");
        f0.p(type, "type");
        try {
            UiKitViewObj uiKitViewObj = (UiKitViewObj) com.max.hbutils.utils.k.a(webProtocolObj.valueOf("attr_text"), UiKitViewObj.class);
            String strValueOf = webProtocolObj.valueOf("source");
            String strValueOf2 = webProtocolObj.valueOf("idea_id");
            MMKV mmkvMmkvWithID = MMKV.mmkvWithID(ad.b.f1220a);
            if (strValueOf2 == null || !mmkvMmkvWithID.containsKey(strValueOf2)) {
                JsonObject jsonObject = new JsonObject();
                jsonObject.addProperty("source", strValueOf);
                com.max.accelworld.g.c(lb.d.f131280w5, jsonObject, null);
                kotlinx.coroutines.k.f(r0.a(e1.e()), null, null, new BottomBarManager$doShowBottomADBar$2(context, view, type, uiKitViewObj, strValueOf2, i10, null), 3, null);
            }
        } catch (Exception unused) {
        }
    }

    @dl.e
    public final WeakReference<View> e() {
        return f89400d;
    }

    @dl.e
    public final WeakReference<View> f() {
        return f89399c;
    }

    @dl.e
    public final WeakReference<View> g() {
        return f89398b;
    }

    public final void h(@dl.d String id2) {
        View view;
        View view2;
        View view3;
        if (PatchProxy.proxy(new Object[]{id2}, this, changeQuickRedirect, false, 39791, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(id2, "id");
        WeakReference<View> weakReference = f89398b;
        if (weakReference != null && (view3 = weakReference.get()) != null) {
            Object tag = view3.getTag();
            String str = tag instanceof String ? (String) tag : null;
            if (str != null && f0.g(str, id2)) {
                f89397a.d(view3, new yh.a<b2>() { // from class: com.max.xiaoheihe.module.mall.BottomBarManager$hideById$1$1$1
                    public static ChangeQuickRedirect changeQuickRedirect;

                    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.b2] */
                    @Override // yh.a
                    public /* bridge */ /* synthetic */ b2 invoke() {
                        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 39803, new Class[0], Object.class);
                        if (patchProxyResultProxy.isSupported) {
                            return patchProxyResultProxy.result;
                        }
                        invoke2();
                        return b2.f124493a;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 39802, new Class[0], Void.TYPE).isSupported) {
                            return;
                        }
                        com.max.xiaoheihe.utils.viewprioritymanager.a.f95777a.b(ViewPriority.LOW.getValue());
                    }
                });
            }
        }
        WeakReference<View> weakReference2 = f89399c;
        if (weakReference2 != null && (view2 = weakReference2.get()) != null) {
            Object tag2 = view2.getTag();
            String str2 = tag2 instanceof String ? (String) tag2 : null;
            if (str2 != null && f0.g(str2, id2)) {
                f89397a.d(view2, new yh.a<b2>() { // from class: com.max.xiaoheihe.module.mall.BottomBarManager$hideById$2$1$1
                    public static ChangeQuickRedirect changeQuickRedirect;

                    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.b2] */
                    @Override // yh.a
                    public /* bridge */ /* synthetic */ b2 invoke() {
                        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 39805, new Class[0], Object.class);
                        if (patchProxyResultProxy.isSupported) {
                            return patchProxyResultProxy.result;
                        }
                        invoke2();
                        return b2.f124493a;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 39804, new Class[0], Void.TYPE).isSupported) {
                            return;
                        }
                        com.max.xiaoheihe.utils.viewprioritymanager.a.f95777a.b(ViewPriority.LOW.getValue());
                    }
                });
            }
        }
        WeakReference<View> weakReference3 = f89400d;
        if (weakReference3 == null || (view = weakReference3.get()) == null) {
            return;
        }
        Object tag3 = view.getTag();
        String str3 = tag3 instanceof String ? (String) tag3 : null;
        if (str3 == null || !f0.g(str3, id2)) {
            return;
        }
        f89397a.d(view, new yh.a<b2>() { // from class: com.max.xiaoheihe.module.mall.BottomBarManager$hideById$3$1$1
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.b2] */
            @Override // yh.a
            public /* bridge */ /* synthetic */ b2 invoke() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 39807, new Class[0], Object.class);
                if (patchProxyResultProxy.isSupported) {
                    return patchProxyResultProxy.result;
                }
                invoke2();
                return b2.f124493a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 39806, new Class[0], Void.TYPE).isSupported) {
                    return;
                }
                com.max.xiaoheihe.utils.viewprioritymanager.a.f95777a.b(ViewPriority.LOW.getValue());
            }
        });
    }

    public final void j(@dl.e WeakReference<View> weakReference) {
        f89400d = weakReference;
    }

    public final void k(@dl.e WeakReference<View> weakReference) {
        f89399c = weakReference;
    }

    public final void l(@dl.e WeakReference<View> weakReference) {
        f89398b = weakReference;
    }
}
