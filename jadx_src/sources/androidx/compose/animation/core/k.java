package androidx.compose.animation.core;

import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: AnimationState.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\u001am\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00028\u00002\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00018\u00012\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\f\u001aT\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\u0003*\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\u00032\b\b\u0002\u0010\u0004\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\r2\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\t\u001aB\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\u00032\u0006\u0010\u0011\u001a\u00020\r2\b\b\u0002\u0010\u0012\u001a\u00020\r2\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\t\u001ak\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u00012\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00142\u0006\u0010\u0011\u001a\u00028\u00002\u0006\u0010\u0012\u001a\u00028\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0016\u0010\u0017\u001a5\u0010\u0018\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00142\u0006\u0010\u0004\u001a\u00028\u0000¢\u0006\u0004\b\u0018\u0010\u0019\"\u001d\u0010\u001c\u001a\u00020\t*\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00038F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {androidx.exifinterface.media.a.f23244d5, "Landroidx/compose/animation/core/p;", androidx.exifinterface.media.a.X4, "Landroidx/compose/animation/core/j;", "value", "velocityVector", "", "lastFrameTimeNanos", "finishedTimeNanos", "", "isRunning", "f", "(Landroidx/compose/animation/core/j;Ljava/lang/Object;Landroidx/compose/animation/core/p;JJZ)Landroidx/compose/animation/core/j;", "", "Landroidx/compose/animation/core/l;", "velocity", "e", "initialValue", "initialVelocity", ak.av, "Landroidx/compose/animation/core/f1;", "typeConverter", "b", "(Landroidx/compose/animation/core/f1;Ljava/lang/Object;Ljava/lang/Object;JJZ)Landroidx/compose/animation/core/j;", "i", "(Landroidx/compose/animation/core/f1;Ljava/lang/Object;)Landroidx/compose/animation/core/p;", "j", "(Landroidx/compose/animation/core/j;)Z", "isFinished", "animation-core_release"}, k = 2, mv = {1, 7, 1})
public final class k {
    @dl.d
    public static final AnimationState<Float, l> a(float f10, float f11, long j10, long j11, boolean z10) {
        return new AnimationState<>(VectorConvertersKt.e(kotlin.jvm.internal.y.f124996a), Float.valueOf(f10), q.a(f11), j10, j11, z10);
    }

    @dl.d
    public static final <T, V extends p> AnimationState<T, V> b(@dl.d f1<T, V> typeConverter, T t10, T t11, long j10, long j11, boolean z10) {
        kotlin.jvm.internal.f0.p(typeConverter, "typeConverter");
        return new AnimationState<>(typeConverter, t10, typeConverter.a().invoke(t11), j10, j11, z10);
    }

    public static /* synthetic */ AnimationState c(float f10, float f11, long j10, long j11, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            f11 = 0.0f;
        }
        long j12 = (i10 & 4) != 0 ? Long.MIN_VALUE : j10;
        long j13 = (i10 & 8) == 0 ? j11 : Long.MIN_VALUE;
        if ((i10 & 16) != 0) {
            z10 = false;
        }
        return a(f10, f11, j12, j13, z10);
    }

    @dl.d
    public static final AnimationState<Float, l> e(@dl.d AnimationState<Float, l> jVar, float f10, float f11, long j10, long j11, boolean z10) {
        kotlin.jvm.internal.f0.p(jVar, "<this>");
        return new AnimationState<>(jVar.g(), Float.valueOf(f10), q.a(f11), j10, j11, z10);
    }

    @dl.d
    public static final <T, V extends p> AnimationState<T, V> f(@dl.d AnimationState<T, V> jVar, T t10, @dl.e V v10, long j10, long j11, boolean z10) {
        kotlin.jvm.internal.f0.p(jVar, "<this>");
        return new AnimationState<>(jVar.g(), t10, v10, j10, j11, z10);
    }

    public static /* synthetic */ AnimationState g(AnimationState jVar, float f10, float f11, long j10, long j11, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = ((Number) jVar.getValue()).floatValue();
        }
        if ((i10 & 2) != 0) {
            f11 = ((l) jVar.i()).getValue();
        }
        float f12 = f11;
        if ((i10 & 4) != 0) {
            j10 = jVar.getLastFrameTimeNanos();
        }
        long j12 = j10;
        if ((i10 & 8) != 0) {
            j11 = jVar.getFinishedTimeNanos();
        }
        long j13 = j11;
        if ((i10 & 16) != 0) {
            z10 = jVar.getIsRunning();
        }
        return e(jVar, f10, f12, j12, j13, z10);
    }

    public static /* synthetic */ AnimationState h(AnimationState jVar, Object obj, p pVar, long j10, long j11, boolean z10, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            obj = jVar.getValue();
        }
        if ((i10 & 2) != 0) {
            pVar = q.e(jVar.i());
        }
        p pVar2 = pVar;
        if ((i10 & 4) != 0) {
            j10 = jVar.getLastFrameTimeNanos();
        }
        long j12 = j10;
        if ((i10 & 8) != 0) {
            j11 = jVar.getFinishedTimeNanos();
        }
        long j13 = j11;
        if ((i10 & 16) != 0) {
            z10 = jVar.getIsRunning();
        }
        return f(jVar, obj, pVar2, j12, j13, z10);
    }

    @dl.d
    public static final <T, V extends p> V i(@dl.d f1<T, V> f1Var, T t10) {
        kotlin.jvm.internal.f0.p(f1Var, "<this>");
        return (V) q.g(f1Var.a().invoke(t10));
    }

    public static final boolean j(@dl.d AnimationState<?, ?> jVar) {
        kotlin.jvm.internal.f0.p(jVar, "<this>");
        return jVar.getFinishedTimeNanos() != Long.MIN_VALUE;
    }
}
