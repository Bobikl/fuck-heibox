package kotlin.reflect.jvm.internal.impl.types.checker;

import kotlin.jvm.internal.f0;
import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil;
import kotlin.reflect.jvm.internal.impl.types.AbstractTypeChecker;
import kotlin.reflect.jvm.internal.impl.types.TypeCheckerState;
import kotlin.reflect.jvm.internal.impl.types.d0;
import kotlin.reflect.jvm.internal.impl.types.l1;

/* JADX INFO: compiled from: NewKotlinTypeChecker.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class k implements j {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private final f f128083c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private final KotlinTypePreparator f128084d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    private final OverridingUtil f128085e;

    public k(@dl.d f kotlinTypeRefiner, @dl.d KotlinTypePreparator kotlinTypePreparator) {
        f0.p(kotlinTypeRefiner, "kotlinTypeRefiner");
        f0.p(kotlinTypePreparator, "kotlinTypePreparator");
        this.f128083c = kotlinTypeRefiner;
        this.f128084d = kotlinTypePreparator;
        OverridingUtil overridingUtilM = OverridingUtil.m(c());
        f0.o(overridingUtilM, "createWithTypeRefiner(kotlinTypeRefiner)");
        this.f128085e = overridingUtilM;
    }

    public /* synthetic */ k(f fVar, KotlinTypePreparator kotlinTypePreparator, int i10, kotlin.jvm.internal.u uVar) {
        this(fVar, (i10 & 2) != 0 ? KotlinTypePreparator.a.f128056a : kotlinTypePreparator);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.checker.e
    public boolean a(@dl.d d0 a10, @dl.d d0 b10) {
        f0.p(a10, "a");
        f0.p(b10, "b");
        return e(a.b(false, false, null, f(), c(), 6, null), a10.R0(), b10.R0());
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.checker.j
    @dl.d
    public OverridingUtil b() {
        return this.f128085e;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.checker.j
    @dl.d
    public f c() {
        return this.f128083c;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.checker.e
    public boolean d(@dl.d d0 subtype, @dl.d d0 supertype) {
        f0.p(subtype, "subtype");
        f0.p(supertype, "supertype");
        return g(a.b(true, false, null, f(), c(), 6, null), subtype.R0(), supertype.R0());
    }

    public final boolean e(@dl.d TypeCheckerState typeCheckerState, @dl.d l1 a10, @dl.d l1 b10) {
        f0.p(typeCheckerState, "<this>");
        f0.p(a10, "a");
        f0.p(b10, "b");
        return AbstractTypeChecker.f127958a.k(typeCheckerState, a10, b10);
    }

    @dl.d
    public KotlinTypePreparator f() {
        return this.f128084d;
    }

    public final boolean g(@dl.d TypeCheckerState typeCheckerState, @dl.d l1 subType, @dl.d l1 superType) {
        f0.p(typeCheckerState, "<this>");
        f0.p(subType, "subType");
        f0.p(superType, "superType");
        return AbstractTypeChecker.t(AbstractTypeChecker.f127958a, typeCheckerState, subType, superType, false, 8, null);
    }
}
