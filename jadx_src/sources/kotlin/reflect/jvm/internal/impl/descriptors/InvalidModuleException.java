package kotlin.reflect.jvm.internal.impl.descriptors;

/* JADX INFO: compiled from: InvalidModuleException.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class InvalidModuleException extends IllegalStateException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvalidModuleException(@dl.d String message) {
        super(message);
        kotlin.jvm.internal.f0.p(message, "message");
    }
}
