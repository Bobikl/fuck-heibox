package kotlin.reflect.jvm.internal.impl.storage;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: locks.kt */
/* JADX INFO: loaded from: classes5.dex */
public class d implements j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final Lock f127952b;

    /* JADX WARN: Multi-variable type inference failed */
    public d() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public d(@dl.d Lock lock) {
        f0.p(lock, "lock");
        this.f127952b = lock;
    }

    public /* synthetic */ d(Lock lock, int i10, u uVar) {
        this((i10 & 1) != 0 ? new ReentrantLock() : lock);
    }

    @dl.d
    protected final Lock a() {
        return this.f127952b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.storage.j
    public void lock() {
        this.f127952b.lock();
    }

    @Override // kotlin.reflect.jvm.internal.impl.storage.j
    public void unlock() {
        this.f127952b.unlock();
    }
}
