package androidx.core.os;

import android.os.OutcomeReceiver;
import androidx.annotation.w0;

/* JADX INFO: compiled from: OutcomeReceiver.kt */
/* JADX INFO: loaded from: classes.dex */
@w0(31)
public final class t {
    @dl.d
    @w0(31)
    public static final <R, E extends Throwable> OutcomeReceiver a(@dl.d kotlin.coroutines.c<? super R> cVar) {
        kotlin.jvm.internal.f0.p(cVar, "<this>");
        return new ContinuationOutcomeReceiver(cVar);
    }
}
