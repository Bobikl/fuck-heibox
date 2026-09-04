package androidx.compose.runtime;

import kotlin.Metadata;

/* JADX INFO: compiled from: Composer.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\b\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000b"}, d2 = {"Landroidx/compose/runtime/ComposeRuntimeError;", "Ljava/lang/IllegalStateException;", "Lkotlin/IllegalStateException;", "", "b", "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", "message", "<init>", "(Ljava/lang/String;)V", "runtime_release"}, k = 1, mv = {1, 7, 1})
public final class ComposeRuntimeError extends IllegalStateException {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final String message;

    public ComposeRuntimeError(@dl.d String message) {
        kotlin.jvm.internal.f0.p(message, "message");
        this.message = message;
    }

    @Override // java.lang.Throwable
    @dl.d
    public String getMessage() {
        return this.message;
    }
}
