package androidx.p001datastore.core;

import dl.d;
import dl.e;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: Serializer.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/datastore/core/CorruptionException;", "Ljava/io/IOException;", "message", "", "cause", "", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "datastore-core"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class CorruptionException extends IOException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CorruptionException(@d String message, @e Throwable th2) {
        super(message, th2);
        f0.p(message, "message");
    }

    public /* synthetic */ CorruptionException(String str, Throwable th2, int i10, u uVar) {
        this(str, (i10 & 2) != 0 ? null : th2);
    }
}
