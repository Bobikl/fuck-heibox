package androidx.core.util;

import androidx.annotation.w0;
import java.util.function.Consumer;

/* JADX INFO: compiled from: Consumer.kt */
/* JADX INFO: loaded from: classes.dex */
@w0(24)
public final class e {
    @dl.d
    @w0(24)
    public static final <T> Consumer<T> a(@dl.d kotlin.coroutines.c<? super T> cVar) {
        kotlin.jvm.internal.f0.p(cVar, "<this>");
        return new ContinuationConsumer(cVar);
    }
}
