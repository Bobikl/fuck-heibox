package androidx.compose.animation.core;

import androidx.compose.runtime.j2;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.b2;

/* JADX INFO: compiled from: AnimationSpec.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000x\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a;\u0010\u0005\u001a\u0004\u0018\u00018\u0001\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00018\u0000H\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a2\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f\"\u0004\b\u0000\u0010\u00002\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0007\u001a;\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012\"\u0004\b\u0000\u0010\u00002\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00018\u0000H\u0007¢\u0006\u0004\b\u0013\u0010\u0014\u001a3\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u001a\"\u0004\b\u0000\u0010\u00002\u001d\u0010\u0019\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0016\u0012\u0004\u0012\u00020\u00170\u0015¢\u0006\u0002\b\u0018H\u0007\u001aK\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00000#\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u001c\u001a\u00020\u00072\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u001d2\b\b\u0002\u0010 \u001a\u00020\u001f2\b\b\u0002\u0010\"\u001a\u00020!H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b$\u0010%\u001a4\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000#\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u001c\u001a\u00020\u00072\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u001d2\b\b\u0002\u0010 \u001a\u00020\u001fH\u0007\u001aC\u0010(\u001a\b\u0012\u0004\u0012\u00028\u00000'\"\u0004\b\u0000\u0010\u00002\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u001d2\b\b\u0002\u0010 \u001a\u00020\u001f2\b\b\u0002\u0010\"\u001a\u00020!H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b(\u0010)\u001a,\u0010*\u001a\b\u0012\u0004\u0012\u00028\u00000'\"\u0004\b\u0000\u0010\u00002\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u001d2\b\b\u0002\u0010 \u001a\u00020\u001fH\u0007\u001a\u001e\u0010,\u001a\b\u0012\u0004\u0012\u00028\u00000+\"\u0004\b\u0000\u0010\u00002\b\b\u0002\u0010\t\u001a\u00020\u0007H\u0007\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006-"}, d2 = {androidx.exifinterface.media.a.f23244d5, "Landroidx/compose/animation/core/p;", androidx.exifinterface.media.a.X4, "Landroidx/compose/animation/core/f1;", "data", "b", "(Landroidx/compose/animation/core/f1;Ljava/lang/Object;)Landroidx/compose/animation/core/p;", "", "durationMillis", "delayMillis", "Landroidx/compose/animation/core/b0;", "easing", "Landroidx/compose/animation/core/e1;", "p", "", "dampingRatio", "stiffness", "visibilityThreshold", "Landroidx/compose/animation/core/z0;", "n", "(FFLjava/lang/Object;)Landroidx/compose/animation/core/z0;", "Lkotlin/Function1;", "Landroidx/compose/animation/core/p0$b;", "Lkotlin/b2;", "Lkotlin/t;", lg.a.f131415h, "Landroidx/compose/animation/core/p0;", "g", "iterations", "Landroidx/compose/animation/core/a0;", "animation", "Landroidx/compose/animation/core/RepeatMode;", "repeatMode", "Landroidx/compose/animation/core/a1;", "initialStartOffset", "Landroidx/compose/animation/core/u0;", "j", "(ILandroidx/compose/animation/core/a0;Landroidx/compose/animation/core/RepeatMode;J)Landroidx/compose/animation/core/u0;", RXScreenCaptureService.KEY_HEIGHT, "Landroidx/compose/animation/core/n0;", "e", "(Landroidx/compose/animation/core/a0;Landroidx/compose/animation/core/RepeatMode;J)Landroidx/compose/animation/core/n0;", ak.aF, "Landroidx/compose/animation/core/v0;", "l", "animation-core_release"}, k = 2, mv = {1, 7, 1})
public final class i {
    /* JADX INFO: Access modifiers changed from: private */
    public static final <T, V extends p> V b(f1<T, V> f1Var, T t10) {
        if (t10 == null) {
            return null;
        }
        return f1Var.a().invoke(t10);
    }

    @j2
    @kotlin.k(level = DeprecationLevel.HIDDEN, message = "This method has been deprecated in favor of the infinite repeatable function that accepts start offset.")
    public static final /* synthetic */ n0 c(a0 animation, RepeatMode repeatMode) {
        kotlin.jvm.internal.f0.p(animation, "animation");
        kotlin.jvm.internal.f0.p(repeatMode, "repeatMode");
        return new n0(animation, repeatMode, a1.d(0, 0, 2, null), (kotlin.jvm.internal.u) null);
    }

    public static /* synthetic */ n0 d(a0 a0Var, RepeatMode repeatMode, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            repeatMode = RepeatMode.Restart;
        }
        return c(a0Var, repeatMode);
    }

    @j2
    @dl.d
    public static final <T> n0<T> e(@dl.d a0<T> animation, @dl.d RepeatMode repeatMode, long j10) {
        kotlin.jvm.internal.f0.p(animation, "animation");
        kotlin.jvm.internal.f0.p(repeatMode, "repeatMode");
        return new n0<>(animation, repeatMode, j10, (kotlin.jvm.internal.u) null);
    }

    public static /* synthetic */ n0 f(a0 a0Var, RepeatMode repeatMode, long j10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            repeatMode = RepeatMode.Restart;
        }
        if ((i10 & 4) != 0) {
            j10 = a1.d(0, 0, 2, null);
        }
        return e(a0Var, repeatMode, j10);
    }

    @j2
    @dl.d
    public static final <T> p0<T> g(@dl.d yh.l<? super p0.b<T>, b2> init) {
        kotlin.jvm.internal.f0.p(init, "init");
        p0.b bVar = new p0.b();
        init.invoke(bVar);
        return new p0<>(bVar);
    }

    @j2
    @kotlin.k(level = DeprecationLevel.HIDDEN, message = "This method has been deprecated in favor of the repeatable function that accepts start offset.")
    public static final /* synthetic */ u0 h(int i10, a0 animation, RepeatMode repeatMode) {
        kotlin.jvm.internal.f0.p(animation, "animation");
        kotlin.jvm.internal.f0.p(repeatMode, "repeatMode");
        return new u0(i10, animation, repeatMode, a1.d(0, 0, 2, null), (kotlin.jvm.internal.u) null);
    }

    public static /* synthetic */ u0 i(int i10, a0 a0Var, RepeatMode repeatMode, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            repeatMode = RepeatMode.Restart;
        }
        return h(i10, a0Var, repeatMode);
    }

    @j2
    @dl.d
    public static final <T> u0<T> j(int i10, @dl.d a0<T> animation, @dl.d RepeatMode repeatMode, long j10) {
        kotlin.jvm.internal.f0.p(animation, "animation");
        kotlin.jvm.internal.f0.p(repeatMode, "repeatMode");
        return new u0<>(i10, animation, repeatMode, j10, (kotlin.jvm.internal.u) null);
    }

    public static /* synthetic */ u0 k(int i10, a0 a0Var, RepeatMode repeatMode, long j10, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            repeatMode = RepeatMode.Restart;
        }
        if ((i11 & 8) != 0) {
            j10 = a1.d(0, 0, 2, null);
        }
        return j(i10, a0Var, repeatMode, j10);
    }

    @j2
    @dl.d
    public static final <T> v0<T> l(int i10) {
        return new v0<>(i10);
    }

    public static /* synthetic */ v0 m(int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 0;
        }
        return l(i10);
    }

    @j2
    @dl.d
    public static final <T> z0<T> n(float f10, float f11, @dl.e T t10) {
        return new z0<>(f10, f11, t10);
    }

    public static /* synthetic */ z0 o(float f10, float f11, Object obj, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            f10 = 1.0f;
        }
        if ((i10 & 2) != 0) {
            f11 = 1500.0f;
        }
        if ((i10 & 4) != 0) {
            obj = null;
        }
        return n(f10, f11, obj);
    }

    @j2
    @dl.d
    public static final <T> e1<T> p(int i10, int i11, @dl.d b0 easing) {
        kotlin.jvm.internal.f0.p(easing, "easing");
        return new e1<>(i10, i11, easing);
    }

    public static /* synthetic */ e1 q(int i10, int i11, b0 b0Var, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 300;
        }
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        if ((i12 & 4) != 0) {
            b0Var = d0.b();
        }
        return p(i10, i11, b0Var);
    }
}
