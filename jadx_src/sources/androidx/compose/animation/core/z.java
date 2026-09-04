package androidx.compose.animation.core;

import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: DecayAnimationSpec.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aK\u0010\b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00032\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00042\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00028\u0000¢\u0006\u0004\b\b\u0010\t\u001a \u0010\u000b\u001a\u00020\n*\b\u0012\u0004\u0012\u00020\n0\u00032\u0006\u0010\u0006\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\n\u001a&\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u00002\b\b\u0002\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\n\u001a\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u0000*\u00020\u000f¨\u0006\u0011"}, d2 = {androidx.exifinterface.media.a.f23244d5, "Landroidx/compose/animation/core/p;", androidx.exifinterface.media.a.X4, "Landroidx/compose/animation/core/x;", "Landroidx/compose/animation/core/f1;", "typeConverter", "initialValue", "initialVelocity", "b", "(Landroidx/compose/animation/core/x;Landroidx/compose/animation/core/f1;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "", ak.av, "frictionMultiplier", "absVelocityThreshold", ak.aF, "Landroidx/compose/animation/core/i0;", "e", "animation-core_release"}, k = 2, mv = {1, 7, 1})
public final class z {
    public static final float a(@dl.d x<Float> xVar, float f10, float f11) {
        kotlin.jvm.internal.f0.p(xVar, "<this>");
        return ((l) xVar.a(VectorConvertersKt.e(kotlin.jvm.internal.y.f124996a)).d(q.a(f10), q.a(f11))).getValue();
    }

    public static final <T, V extends p> T b(@dl.d x<T> xVar, @dl.d f1<T, V> typeConverter, T t10, T t11) {
        kotlin.jvm.internal.f0.p(xVar, "<this>");
        kotlin.jvm.internal.f0.p(typeConverter, "typeConverter");
        return (T) typeConverter.b().invoke(xVar.a(typeConverter).d(typeConverter.a().invoke(t10), typeConverter.a().invoke(t11)));
    }

    @dl.d
    public static final <T> x<T> c(float f10, float f11) {
        return e(new k0(f10, f11));
    }

    public static /* synthetic */ x d(float f10, float f11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = 1.0f;
        }
        if ((i10 & 2) != 0) {
            f11 = 0.1f;
        }
        return c(f10, f11);
    }

    @dl.d
    public static final <T> x<T> e(@dl.d i0 i0Var) {
        kotlin.jvm.internal.f0.p(i0Var, "<this>");
        return new y(i0Var);
    }
}
