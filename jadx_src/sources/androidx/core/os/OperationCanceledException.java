package androidx.core.os;

import androidx.annotation.p0;

/* JADX INFO: loaded from: classes.dex */
public class OperationCanceledException extends RuntimeException {
    public OperationCanceledException() {
        this(null);
    }

    public OperationCanceledException(@p0 String str) {
        super(androidx.core.util.j.f(str, "The operation has been canceled."));
    }
}
