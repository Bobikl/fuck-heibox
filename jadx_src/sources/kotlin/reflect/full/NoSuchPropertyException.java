package kotlin.reflect.full;

import kotlin.jvm.internal.u;
import kotlin.u0;

/* JADX INFO: compiled from: exceptions.kt */
/* JADX INFO: loaded from: classes5.dex */
@u0(version = "1.1")
public final class NoSuchPropertyException extends Exception {
    /* JADX WARN: Multi-variable type inference failed */
    public NoSuchPropertyException() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public NoSuchPropertyException(@dl.e Exception exc) {
        super(exc);
    }

    public /* synthetic */ NoSuchPropertyException(Exception exc, int i10, u uVar) {
        this((i10 & 1) != 0 ? null : exc);
    }
}
