package kotlin.reflect.jvm.internal.impl.load.java;

import kotlin.jvm.internal.f0;
import kotlin.reflect.jvm.internal.impl.resolve.deprecation.DeprecationLevelValue;

/* JADX INFO: compiled from: utils.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class e extends kotlin.reflect.jvm.internal.impl.resolve.deprecation.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final kotlin.reflect.jvm.internal.impl.descriptors.k f126052b;

    public e(@dl.d kotlin.reflect.jvm.internal.impl.descriptors.k target) {
        f0.p(target, "target");
        this.f126052b = target;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.deprecation.a
    @dl.d
    public DeprecationLevelValue b() {
        return DeprecationLevelValue.ERROR;
    }
}
