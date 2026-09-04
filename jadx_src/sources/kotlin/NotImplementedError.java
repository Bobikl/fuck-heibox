package kotlin;

/* JADX INFO: compiled from: Standard.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class NotImplementedError extends Error {
    /* JADX WARN: Multi-variable type inference failed */
    public NotImplementedError() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotImplementedError(@dl.d String message) {
        super(message);
        kotlin.jvm.internal.f0.p(message, "message");
    }

    public /* synthetic */ NotImplementedError(String str, int i10, kotlin.jvm.internal.u uVar) {
        this((i10 & 1) != 0 ? "An operation is not implemented." : str);
    }
}
