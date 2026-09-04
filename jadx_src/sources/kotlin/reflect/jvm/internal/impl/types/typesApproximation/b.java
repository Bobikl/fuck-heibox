package kotlin.reflect.jvm.internal.impl.types.typesApproximation;

import dl.d;
import kotlin.jvm.internal.f0;
import kotlin.reflect.jvm.internal.impl.descriptors.y0;
import kotlin.reflect.jvm.internal.impl.types.checker.e;
import kotlin.reflect.jvm.internal.impl.types.d0;

/* JADX INFO: compiled from: CapturedTypeApproximation.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @d
    private final y0 f128187a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @d
    private final d0 f128188b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @d
    private final d0 f128189c;

    public b(@d y0 typeParameter, @d d0 inProjection, @d d0 outProjection) {
        f0.p(typeParameter, "typeParameter");
        f0.p(inProjection, "inProjection");
        f0.p(outProjection, "outProjection");
        this.f128187a = typeParameter;
        this.f128188b = inProjection;
        this.f128189c = outProjection;
    }

    @d
    public final d0 a() {
        return this.f128188b;
    }

    @d
    public final d0 b() {
        return this.f128189c;
    }

    @d
    public final y0 c() {
        return this.f128187a;
    }

    public final boolean d() {
        return e.f128071a.d(this.f128188b, this.f128189c);
    }
}
