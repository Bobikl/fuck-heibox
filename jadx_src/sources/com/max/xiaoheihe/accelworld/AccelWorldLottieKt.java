package com.max.xiaoheihe.accelworld;

import android.content.Context;
import android.util.Log;
import androidx.annotation.u0;
import com.airbnb.lottie.LottieAnimationView;
import com.max.hbutils.core.BaseApplication;
import com.max.xiaoheihe.bean.AnimationResultObj;
import com.max.xiaoheihe.loader.dynamic_so.DynamicSoManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.io.File;
import java.io.FileInputStream;
import java.lang.reflect.Method;
import java.util.zip.ZipInputStream;
import kotlin.Pair;
import kotlin.Result;
import kotlin.b2;
import kotlin.jvm.internal.f0;
import kotlin.t0;
import kotlinx.coroutines.e1;

/* JADX INFO: compiled from: AccelWorldLottie.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class AccelWorldLottieKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final String f76443a = "light";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    public static final String f76444b = "dark";
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: compiled from: AccelWorldLottie.kt */
    public static final class a<T> implements com.airbnb.lottie.l {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ LottieAnimationView f76445a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ yh.l<LottieAnimationView, b2> f76446b;

        /* JADX WARN: Multi-variable type inference failed */
        a(LottieAnimationView lottieAnimationView, yh.l<? super LottieAnimationView, b2> lVar) {
            this.f76445a = lottieAnimationView;
            this.f76446b = lVar;
        }

        public final void a(com.airbnb.lottie.g gVar) {
            if (PatchProxy.proxy(new Object[]{gVar}, this, changeQuickRedirect, false, bb.c.m.Qw, new Class[]{com.airbnb.lottie.g.class}, Void.TYPE).isSupported) {
                return;
            }
            this.f76445a.setComposition(gVar);
            yh.l<LottieAnimationView, b2> lVar = this.f76446b;
            if (lVar != null) {
                lVar.invoke(this.f76445a);
            }
        }

        @Override // com.airbnb.lottie.l
        public /* bridge */ /* synthetic */ void onResult(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, bb.c.m.Rw, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            a((com.airbnb.lottie.g) obj);
        }
    }

    /* JADX INFO: compiled from: AccelWorldLottie.kt */
    public static final class b<T> implements com.airbnb.lottie.l {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ yh.l<com.airbnb.lottie.g, b2> f76447a;

        /* JADX WARN: Multi-variable type inference failed */
        b(yh.l<? super com.airbnb.lottie.g, b2> lVar) {
            this.f76447a = lVar;
        }

        public final void a(com.airbnb.lottie.g composition) {
            if (PatchProxy.proxy(new Object[]{composition}, this, changeQuickRedirect, false, bb.c.m.ax, new Class[]{com.airbnb.lottie.g.class}, Void.TYPE).isSupported) {
                return;
            }
            yh.l<com.airbnb.lottie.g, b2> lVar = this.f76447a;
            f0.o(composition, "composition");
            lVar.invoke(composition);
        }

        @Override // com.airbnb.lottie.l
        public /* bridge */ /* synthetic */ void onResult(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, bb.c.m.bx, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            a((com.airbnb.lottie.g) obj);
        }
    }

    /* JADX INFO: compiled from: AccelWorldLottie.kt */
    public static final class c<T> implements com.airbnb.lottie.l {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ yh.l<com.airbnb.lottie.j, b2> f76448a;

        /* JADX WARN: Multi-variable type inference failed */
        c(yh.l<? super com.airbnb.lottie.j, b2> lVar) {
            this.f76448a = lVar;
        }

        public final void a(com.airbnb.lottie.g gVar) {
            if (PatchProxy.proxy(new Object[]{gVar}, this, changeQuickRedirect, false, bb.c.m.cx, new Class[]{com.airbnb.lottie.g.class}, Void.TYPE).isSupported) {
                return;
            }
            com.airbnb.lottie.j jVar = new com.airbnb.lottie.j();
            jVar.h0(gVar);
            this.f76448a.invoke(jVar);
        }

        @Override // com.airbnb.lottie.l
        public /* bridge */ /* synthetic */ void onResult(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, bb.c.m.dx, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            a((com.airbnb.lottie.g) obj);
        }
    }

    public static final void a(@dl.e LottieAnimationView lottieAnimationView, @dl.e String str) {
        Object objB;
        com.airbnb.lottie.q<com.airbnb.lottie.g> qVarJ;
        if (PatchProxy.proxy(new Object[]{lottieAnimationView, str}, null, changeQuickRedirect, true, bb.c.m.Hw, new Class[]{LottieAnimationView.class, String.class}, Void.TYPE).isSupported || lottieAnimationView == null || str == null) {
            return;
        }
        try {
            Result.a aVar = Result.f124476c;
            String strR = com.max.xiaoheihe.utils.r.r(str);
            f0.o(strR, "getLottieCacheFilePathV2(cacheKey)");
            FileInputStream fileInputStream = new FileInputStream(new File(strR));
            if (j(strR)) {
                qVarJ = com.airbnb.lottie.h.A(new ZipInputStream(fileInputStream), str);
                f0.o(qVarJ, "{\n            LottieComp…eam), cacheKey)\n        }");
            } else {
                qVarJ = com.airbnb.lottie.h.j(fileInputStream, str);
                f0.o(qVarJ, "{\n            LottieComp…ream, cacheKey)\n        }");
            }
            Method declaredMethod = lottieAnimationView.getClass().getDeclaredMethod("setCompositionTask", com.airbnb.lottie.q.class);
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(lottieAnimationView, qVarJ);
            objB = Result.b(Integer.valueOf(Log.d("AccelWorldLottie-dbg", "[fastSetAnimation] set anim for " + str + " success")));
        } catch (Throwable th2) {
            Result.a aVar2 = Result.f124476c;
            objB = Result.b(t0.a(th2));
        }
        Throwable thE = Result.e(objB);
        if (thE != null) {
            com.max.heybox.hblog.g.f74531b.v("[fastSetAnimation] fail, cacheKey: " + str + ", cause:\n" + kotlin.o.i(thE));
        }
    }

    public static final void b(@dl.e LottieAnimationView lottieAnimationView, @dl.e String str, @dl.e yh.a<b2> aVar, @dl.e yh.l<? super LottieAnimationView, b2> lVar) {
        Object objB;
        if (PatchProxy.proxy(new Object[]{lottieAnimationView, str, aVar, lVar}, null, changeQuickRedirect, true, bb.c.m.Iw, new Class[]{LottieAnimationView.class, String.class, yh.a.class, yh.l.class}, Void.TYPE).isSupported || lottieAnimationView == null) {
            return;
        }
        try {
            Result.a aVar2 = Result.f124476c;
            String strR = com.max.xiaoheihe.utils.r.r(str);
            f0.o(strR, "getLottieCacheFilePathV2(cachedLottieKey)");
            File file = new File(strR);
            if (!file.exists()) {
                if (aVar != null) {
                    aVar.invoke();
                    return;
                }
                return;
            }
            FileInputStream fileInputStream = new FileInputStream(file);
            objB = Result.b((j(strR) ? com.airbnb.lottie.h.A(new ZipInputStream(fileInputStream), str) : com.airbnb.lottie.h.j(fileInputStream, str)).f(new a(lottieAnimationView, lVar)));
            Throwable thE = Result.e(objB);
            if (thE != null) {
                com.max.heybox.hblog.g.f74531b.v("[fastSetAnimation] fail, cachedLottieKey: " + str + ", cause:\n" + kotlin.o.i(thE));
                if (aVar != null) {
                    aVar.invoke();
                }
            }
        } catch (Throwable th2) {
            Result.a aVar3 = Result.f124476c;
            objB = Result.b(t0.a(th2));
        }
    }

    public static /* synthetic */ void c(LottieAnimationView lottieAnimationView, String str, yh.a aVar, yh.l lVar, int i10, Object obj) {
        if (PatchProxy.proxy(new Object[]{lottieAnimationView, str, aVar, lVar, new Integer(i10), obj}, null, changeQuickRedirect, true, bb.c.m.Jw, new Class[]{LottieAnimationView.class, String.class, yh.a.class, yh.l.class, Integer.TYPE, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        if ((i10 & 2) != 0) {
            aVar = null;
        }
        if ((i10 & 4) != 0) {
            lVar = null;
        }
        b(lottieAnimationView, str, aVar, lVar);
    }

    public static final void d(@dl.e com.airbnb.lottie.j jVar) {
        com.airbnb.lottie.g gVarX;
        com.airbnb.lottie.model.g gVarL;
        if (PatchProxy.proxy(new Object[]{jVar}, null, changeQuickRedirect, true, bb.c.m.Pw, new Class[]{com.airbnb.lottie.j.class}, Void.TYPE).isSupported) {
            return;
        }
        String str = com.max.hbutils.utils.u.b(BaseApplication.a()) ? "dark" : f76443a;
        if (jVar == null || (gVarX = jVar.x()) == null || (gVarL = gVarX.l(str)) == null) {
            return;
        }
        jVar.j0((((int) gVarL.f37585b) + ((int) gVarL.f37586c)) - 1);
    }

    public static final void e(@dl.e com.airbnb.lottie.j jVar, int i10) {
        com.airbnb.lottie.model.g gVarL;
        if (PatchProxy.proxy(new Object[]{jVar, new Integer(i10)}, null, changeQuickRedirect, true, bb.c.m.Ow, new Class[]{com.airbnb.lottie.j.class, Integer.TYPE}, Void.TYPE).isSupported || jVar == null) {
            return;
        }
        String str = com.max.hbutils.utils.u.b(BaseApplication.a()) ? "dark" : f76443a;
        com.airbnb.lottie.g gVarX = jVar.x();
        if (gVarX == null || (gVarL = gVarX.l(str)) == null) {
            com.max.heybox.hblog.g.f74531b.v("[fastStartWithLightOrDarkMarker] Cannot find marker with name " + str);
            return;
        }
        Pair pair = new Pair(Integer.valueOf((int) gVarL.f37585b), Integer.valueOf((int) gVarL.f37586c));
        int iIntValue = ((Number) pair.a()).intValue();
        jVar.q0(iIntValue, (((Number) pair.b()).intValue() + iIntValue) - 1);
        jVar.A0(i10);
        jVar.X();
    }

    @dl.e
    public static final Object f(@dl.e String str, @dl.d kotlin.coroutines.c<? super com.airbnb.lottie.g> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, cVar}, null, changeQuickRedirect, true, bb.c.m.Kw, new Class[]{String.class, kotlin.coroutines.c.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : kotlinx.coroutines.i.h(e1.c(), new AccelWorldLottieKt$getCachedLottieComposition$2(str, null), cVar);
    }

    public static final void g(@dl.e String str, @dl.e yh.l<? super Throwable, b2> lVar, @dl.d yh.l<? super com.airbnb.lottie.g, b2> onGetFinish) {
        Object objB;
        com.airbnb.lottie.q<com.airbnb.lottie.g> qVarJ;
        if (PatchProxy.proxy(new Object[]{str, lVar, onGetFinish}, null, changeQuickRedirect, true, bb.c.m.Lw, new Class[]{String.class, yh.l.class, yh.l.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(onGetFinish, "onGetFinish");
        try {
            Result.a aVar = Result.f124476c;
            String strR = com.max.xiaoheihe.utils.r.r(str);
            f0.o(strR, "getLottieCacheFilePathV2(cachedLottieKey)");
            File file = new File(strR);
            if (j(strR)) {
                qVarJ = com.airbnb.lottie.h.A(new ZipInputStream(new FileInputStream(file)), str + AnimationResultObj.SOURCE_TYPE_DOT_LOTTIE);
            } else {
                qVarJ = com.airbnb.lottie.h.j(new FileInputStream(file), str + AnimationResultObj.SOURCE_TYPE_DOT_JSON);
            }
            objB = Result.b(qVarJ.f(new b(onGetFinish)));
        } catch (Throwable th2) {
            Result.a aVar2 = Result.f124476c;
            objB = Result.b(t0.a(th2));
        }
        Throwable thE = Result.e(objB);
        if (thE != null) {
            com.max.heybox.hblog.g.f74531b.v("[getCachedLottieComposition] fail, cause:\n" + kotlin.o.i(thE));
            if (lVar != null) {
                lVar.invoke(thE);
            }
        }
    }

    public static /* synthetic */ void h(String str, yh.l lVar, yh.l lVar2, int i10, Object obj) {
        if (PatchProxy.proxy(new Object[]{str, lVar, lVar2, new Integer(i10), obj}, null, changeQuickRedirect, true, bb.c.m.Mw, new Class[]{String.class, yh.l.class, yh.l.class, Integer.TYPE, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        if ((i10 & 2) != 0) {
            lVar = null;
        }
        g(str, lVar, lVar2);
    }

    public static final void i(@dl.d Context context, @u0 int i10, @dl.d yh.l<? super com.airbnb.lottie.j, b2> onGetDrawable) {
        if (PatchProxy.proxy(new Object[]{context, new Integer(i10), onGetDrawable}, null, changeQuickRedirect, true, bb.c.m.Nw, new Class[]{Context.class, Integer.TYPE, yh.l.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(context, "context");
        f0.p(onGetDrawable, "onGetDrawable");
        try {
            Result.a aVar = Result.f124476c;
            Result.b(com.airbnb.lottie.h.s(context, i10).f(new c(onGetDrawable)));
        } catch (Throwable th2) {
            Result.a aVar2 = Result.f124476c;
            Result.b(t0.a(th2));
        }
    }

    public static final boolean j(@dl.e String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, bb.c.m.Gw, new Class[]{String.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        return str != null && (kotlin.text.u.K1(str, DynamicSoManager.f77249d, false, 2, null) || kotlin.text.u.K1(str, ".lottie", false, 2, null));
    }
}
