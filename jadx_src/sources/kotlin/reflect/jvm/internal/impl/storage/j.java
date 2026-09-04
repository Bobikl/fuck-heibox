package kotlin.reflect.jvm.internal.impl.storage;

import kotlin.b2;

/* JADX INFO: compiled from: locks.kt */
/* JADX INFO: loaded from: classes5.dex */
public interface j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final a f127954a = a.f127955a;

    /* JADX INFO: compiled from: locks.kt */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f127955a = new a();

        private a() {
        }

        @dl.d
        public final d a(@dl.e Runnable runnable, @dl.e yh.l<? super InterruptedException, b2> lVar) {
            return (runnable == null || lVar == null) ? new d(null, 1, null) : new c(runnable, lVar);
        }
    }

    void lock();

    void unlock();
}
