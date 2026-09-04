package kotlin.reflect.jvm.internal.impl.types.checker;

import kotlin.jvm.internal.f0;
import kotlin.reflect.jvm.internal.impl.types.d0;

/* JADX INFO: compiled from: utils.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final d0 f128090a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.e
    private final q f128091b;

    public q(@dl.d d0 type, @dl.e q qVar) {
        f0.p(type, "type");
        this.f128090a = type;
        this.f128091b = qVar;
    }

    @dl.e
    public final q a() {
        return this.f128091b;
    }

    @dl.d
    public final d0 b() {
        return this.f128090a;
    }
}
