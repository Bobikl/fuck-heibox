package kotlin.reflect.jvm.internal;

import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: KotlinReflectionInternalError.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class KotlinReflectionInternalError extends Error {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KotlinReflectionInternalError(@dl.d String message) {
        super(message);
        f0.p(message, "message");
    }
}
