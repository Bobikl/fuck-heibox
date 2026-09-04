package kotlinx.coroutines.internal;

import com.umeng.analytics.pro.ak;
import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.Metadata;

/* JADX INFO: compiled from: ExceptionsConstructor.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011J*\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0005j\u0002`\u00062\u000e\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002H\u0016R\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR:\u0010\u000f\u001a(\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0005j\u0002`\u00060\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0012"}, d2 = {"Lkotlinx/coroutines/internal/z0;", "Lkotlinx/coroutines/internal/k;", "Ljava/lang/Class;", "", "key", "Lkotlin/Function1;", "Lkotlinx/coroutines/internal/Ctor;", ak.av, "Ljava/util/concurrent/locks/ReentrantReadWriteLock;", "b", "Ljava/util/concurrent/locks/ReentrantReadWriteLock;", "cacheLock", "Ljava/util/WeakHashMap;", ak.aF, "Ljava/util/WeakHashMap;", "exceptionCtors", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public final class z0 extends k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final z0 f130238a = new z0();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private static final ReentrantReadWriteLock cacheLock = new ReentrantReadWriteLock();

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private static final WeakHashMap<Class<? extends Throwable>, yh.l<Throwable, Throwable>> exceptionCtors = new WeakHashMap<>();

    private z0() {
    }

    @Override // kotlinx.coroutines.internal.k
    @dl.d
    public yh.l<Throwable, Throwable> a(@dl.d Class<? extends Throwable> cls) {
        ReentrantReadWriteLock reentrantReadWriteLock = cacheLock;
        ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
        lock.lock();
        try {
            yh.l<Throwable, Throwable> lVar = exceptionCtors.get(cls);
            lock.unlock();
            if (lVar != null) {
                return lVar;
            }
            ReentrantReadWriteLock.ReadLock lock2 = reentrantReadWriteLock.readLock();
            int i10 = 0;
            int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
            for (int i11 = 0; i11 < readHoldCount; i11++) {
                lock2.unlock();
            }
            ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
            writeLock.lock();
            try {
                WeakHashMap<Class<? extends Throwable>, yh.l<Throwable, Throwable>> weakHashMap = exceptionCtors;
                yh.l<Throwable, Throwable> lVar2 = weakHashMap.get(cls);
                if (lVar2 != null) {
                    while (i10 < readHoldCount) {
                        lock2.lock();
                        i10++;
                    }
                    writeLock.unlock();
                    return lVar2;
                }
                yh.l<Throwable, Throwable> lVarB = ExceptionsConstructorKt.b(cls);
                weakHashMap.put(cls, lVarB);
                while (i10 < readHoldCount) {
                    lock2.lock();
                    i10++;
                }
                writeLock.unlock();
                return lVarB;
            } catch (Throwable th2) {
                while (i10 < readHoldCount) {
                    lock2.lock();
                    i10++;
                }
                writeLock.unlock();
                throw th2;
            }
        } catch (Throwable th3) {
            lock.unlock();
            throw th3;
        }
    }
}
