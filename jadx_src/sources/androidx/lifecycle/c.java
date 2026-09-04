package androidx.lifecycle;

import java.time.Duration;

/* JADX INFO: compiled from: CoroutineLiveData.kt */
/* JADX INFO: loaded from: classes6.dex */
@androidx.annotation.w0(26)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final c f24180a = new c();

    private c() {
    }

    public final long a(@dl.d Duration timeout) {
        kotlin.jvm.internal.f0.p(timeout, "timeout");
        return timeout.toMillis();
    }
}
