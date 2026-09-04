package androidx.compose.animation.core;

import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: Animation.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000F\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a5\u0010\u0006\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007\u001aE\u0010\r\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000\f\"\b\b\u0000\u0010\u0002*\u00020\u0001*\b\u0012\u0004\u0012\u00028\u00000\b2\u0006\u0010\t\u001a\u00028\u00002\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00028\u0000¢\u0006\u0004\b\r\u0010\u000e\u001ac\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\f\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u00012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00112\u0006\u0010\t\u001a\u00028\u00002\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00028\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a,\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010\u0010\u001a\u00020\u00152\u0006\u0010\t\u001a\u00020\u00162\b\b\u0002\u0010\u000b\u001a\u00020\u0016\"\u0014\u0010\u001b\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a\" \u0010\u001e\u001a\u00020\u0004*\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00038@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, d2 = {androidx.exifinterface.media.a.f23244d5, "Landroidx/compose/animation/core/p;", androidx.exifinterface.media.a.X4, "Landroidx/compose/animation/core/d;", "", "playTimeNanos", "f", "(Landroidx/compose/animation/core/d;J)Ljava/lang/Object;", "Landroidx/compose/animation/core/i1;", "initialValue", "targetValue", "initialVelocity", "Landroidx/compose/animation/core/c1;", "d", "(Landroidx/compose/animation/core/i1;Landroidx/compose/animation/core/p;Landroidx/compose/animation/core/p;Landroidx/compose/animation/core/p;)Landroidx/compose/animation/core/c1;", "Landroidx/compose/animation/core/h;", "animationSpec", "Landroidx/compose/animation/core/f1;", "typeConverter", ak.aF, "(Landroidx/compose/animation/core/h;Landroidx/compose/animation/core/f1;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Landroidx/compose/animation/core/c1;", "Landroidx/compose/animation/core/i0;", "", "Landroidx/compose/animation/core/w;", "Landroidx/compose/animation/core/l;", ak.av, "J", "MillisToNanos", "e", "(Landroidx/compose/animation/core/d;)J", "durationMillis", "animation-core_release"}, k = 2, mv = {1, 7, 1})
public final class AnimationKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long f4153a = 1000000;

    @dl.d
    public static final w<Float, l> a(@dl.d i0 animationSpec, float f10, float f11) {
        kotlin.jvm.internal.f0.p(animationSpec, "animationSpec");
        return new w<>((x<Float>) z.e(animationSpec), VectorConvertersKt.e(kotlin.jvm.internal.y.f124996a), Float.valueOf(f10), q.a(f11));
    }

    public static /* synthetic */ w b(i0 i0Var, float f10, float f11, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            f11 = 0.0f;
        }
        return a(i0Var, f10, f11);
    }

    @dl.d
    public static final <T, V extends p> c1<T, V> c(@dl.d h<T> animationSpec, @dl.d f1<T, V> typeConverter, T t10, T t11, T t12) {
        kotlin.jvm.internal.f0.p(animationSpec, "animationSpec");
        kotlin.jvm.internal.f0.p(typeConverter, "typeConverter");
        return new c1<>(animationSpec, typeConverter, t10, t11, typeConverter.a().invoke(t12));
    }

    @dl.d
    public static final <V extends p> c1<V, V> d(@dl.d i1<V> i1Var, @dl.d V initialValue, @dl.d V targetValue, @dl.d V initialVelocity) {
        kotlin.jvm.internal.f0.p(i1Var, "<this>");
        kotlin.jvm.internal.f0.p(initialValue, "initialValue");
        kotlin.jvm.internal.f0.p(targetValue, "targetValue");
        kotlin.jvm.internal.f0.p(initialVelocity, "initialVelocity");
        return new c1<>(i1Var, (f1<V, V>) VectorConvertersKt.a(new yh.l<V, V>() { // from class: androidx.compose.animation.core.AnimationKt$createAnimation$1
            /* JADX WARN: Incorrect return type in method signature: (TV;)TV; */
            @Override // yh.l
            @dl.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final p invoke(@dl.d p it) {
                kotlin.jvm.internal.f0.p(it, "it");
                return it;
            }
        }, new yh.l<V, V>() { // from class: androidx.compose.animation.core.AnimationKt$createAnimation$2
            /* JADX WARN: Incorrect return type in method signature: (TV;)TV; */
            @Override // yh.l
            @dl.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final p invoke(@dl.d p it) {
                kotlin.jvm.internal.f0.p(it, "it");
                return it;
            }
        }), initialValue, targetValue, initialVelocity);
    }

    public static final long e(@dl.d d<?, ?> dVar) {
        kotlin.jvm.internal.f0.p(dVar, "<this>");
        return dVar.getDurationNanos() / 1000000;
    }

    public static final <T, V extends p> T f(@dl.d d<T, V> dVar, long j10) {
        kotlin.jvm.internal.f0.p(dVar, "<this>");
        return (T) dVar.d().b().invoke(dVar.g(j10));
    }
}
