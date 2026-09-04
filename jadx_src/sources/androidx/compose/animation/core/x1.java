package androidx.compose.animation.core;

import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: compiled from: VisibilityThresholds.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000n\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0014\u0010\u0003\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002\"\u0014\u0010\u0005\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0004\u0010\u0002\".\u0010\f\u001a\u0016\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0007\u0012\u0004\u0012\u00020\u00000\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0018\u0010\u0011\u001a\u00020\u000e*\u00020\r8Fø\u0001\u0000¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010\"\u0018\u0010\u0011\u001a\u00020\u0013*\u00020\u00128Fø\u0001\u0000¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015\"\u0015\u0010\u0011\u001a\u00020\u0017*\u00020\u00168F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0018\"\u0018\u0010\u0011\u001a\u00020\u001a*\u00020\u00198Fø\u0001\u0000¢\u0006\u0006\u001a\u0004\b\u0001\u0010\u001b\"\u0018\u0010\u0011\u001a\u00020\u001d*\u00020\u001c8Fø\u0001\u0000¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f\"\u0018\u0010\u0011\u001a\u00020!*\u00020 8Fø\u0001\u0000¢\u0006\u0006\u001a\u0004\b\b\u0010\"\"\u0018\u0010\u0011\u001a\u00020$*\u00020#8Fø\u0001\u0000¢\u0006\u0006\u001a\u0004\b%\u0010&\"\u0015\u0010\u0011\u001a\u00020(*\u00020'8F¢\u0006\u0006\u001a\u0004\b)\u0010*\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006+"}, d2 = {"", ak.av, "F", "DpVisibilityThreshold", "b", "PxVisibilityThreshold", "", "Landroidx/compose/animation/core/f1;", "d", "Ljava/util/Map;", "i", "()Ljava/util/Map;", "visibilityThresholdMap", "Ls1/n$a;", "Ls1/n;", "f", "(Ls1/n$a;)J", "VisibilityThreshold", "Lb1/f$a;", "Lb1/f;", ak.aF, "(Lb1/f$a;)J", "Lkotlin/Int$Companion;", "", "(Lkotlin/jvm/internal/d0;)I", "Ls1/h$a;", "Ls1/h;", "(Ls1/h$a;)F", "Ls1/j$a;", "Ls1/j;", "e", "(Ls1/j$a;)J", "Lb1/m$a;", "Lb1/m;", "(Lb1/m$a;)J", "Ls1/r$a;", "Ls1/r;", "g", "(Ls1/r$a;)J", "Lb1/i$a;", "Lb1/i;", RXScreenCaptureService.KEY_HEIGHT, "(Lb1/i$a;)Lb1/i;", "animation-core_release"}, k = 2, mv = {1, 7, 1})
public final class x1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final float f4571a = 0.1f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final float f4572b = 0.5f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private static final b1.i f4573c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private static final Map<f1<?, ?>, Float> f4574d;

    static {
        Float fValueOf = Float.valueOf(0.5f);
        f4573c = new b1.i(0.5f, 0.5f, 0.5f, 0.5f);
        f1<Integer, l> f1VarF = VectorConvertersKt.f(kotlin.jvm.internal.d0.f124911a);
        Float fValueOf2 = Float.valueOf(1.0f);
        f1<s1.h, l> f1VarG = VectorConvertersKt.g(s1.h.f139219c);
        Float fValueOf3 = Float.valueOf(0.1f);
        f4574d = kotlin.collections.s0.W(kotlin.c1.a(f1VarF, fValueOf2), kotlin.c1.a(VectorConvertersKt.j(s1.r.f139246b), fValueOf2), kotlin.c1.a(VectorConvertersKt.i(s1.n.f139237b), fValueOf2), kotlin.c1.a(VectorConvertersKt.e(kotlin.jvm.internal.y.f124996a), Float.valueOf(0.01f)), kotlin.c1.a(VectorConvertersKt.c(b1.i.f30369e), fValueOf), kotlin.c1.a(VectorConvertersKt.d(b1.m.f30386b), fValueOf), kotlin.c1.a(VectorConvertersKt.b(b1.f.f30364b), fValueOf), kotlin.c1.a(f1VarG, fValueOf3), kotlin.c1.a(VectorConvertersKt.h(s1.j.f139224b), fValueOf3));
    }

    public static final float a(@dl.d s1.h.a aVar) {
        kotlin.jvm.internal.f0.p(aVar, "<this>");
        return s1.h.g(0.1f);
    }

    public static final int b(@dl.d kotlin.jvm.internal.d0 d0Var) {
        kotlin.jvm.internal.f0.p(d0Var, "<this>");
        return 1;
    }

    public static final long c(@dl.d b1.f.a aVar) {
        kotlin.jvm.internal.f0.p(aVar, "<this>");
        return b1.g.a(0.5f, 0.5f);
    }

    public static final long d(@dl.d b1.m.a aVar) {
        kotlin.jvm.internal.f0.p(aVar, "<this>");
        return b1.n.a(0.5f, 0.5f);
    }

    public static final long e(@dl.d s1.j.a aVar) {
        kotlin.jvm.internal.f0.p(aVar, "<this>");
        s1.h.a aVar2 = s1.h.f139219c;
        return s1.i.a(a(aVar2), a(aVar2));
    }

    public static final long f(@dl.d s1.n.a aVar) {
        kotlin.jvm.internal.f0.p(aVar, "<this>");
        return s1.o.a(1, 1);
    }

    public static final long g(@dl.d s1.r.a aVar) {
        kotlin.jvm.internal.f0.p(aVar, "<this>");
        return s1.s.a(1, 1);
    }

    @dl.d
    public static final b1.i h(@dl.d b1.i.a aVar) {
        kotlin.jvm.internal.f0.p(aVar, "<this>");
        return f4573c;
    }

    @dl.d
    public static final Map<f1<?, ?>, Float> i() {
        return f4574d;
    }
}
