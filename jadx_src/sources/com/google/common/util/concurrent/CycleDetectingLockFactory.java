package com.google.common.util.concurrent;

import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import com.google.common.collect.MapMaker;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes7.dex */
@s9.a
@u
@o9.a
@o9.c
public class CycleDetectingLockFactory {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final ConcurrentMap<Class<? extends Enum<?>>, Map<? extends Enum<?>, c>> f59280b = new MapMaker().l().i();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Logger f59281c = Logger.getLogger(CycleDetectingLockFactory.class.getName());

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final ThreadLocal<ArrayList<c>> f59282d = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final d f59283a;

    public final class CycleDetectingReentrantLock extends ReentrantLock implements b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final c f59284b;

        private CycleDetectingReentrantLock(c cVar, boolean z10) {
            super(z10);
            this.f59284b = (c) com.google.common.base.w.E(cVar);
        }

        /* synthetic */ CycleDetectingReentrantLock(CycleDetectingLockFactory cycleDetectingLockFactory, c cVar, boolean z10, a aVar) {
            this(cVar, z10);
        }

        @Override // com.google.common.util.concurrent.CycleDetectingLockFactory.b
        public c a() {
            return this.f59284b;
        }

        @Override // com.google.common.util.concurrent.CycleDetectingLockFactory.b
        public boolean b() {
            return isHeldByCurrentThread();
        }

        @Override // java.util.concurrent.locks.ReentrantLock, java.util.concurrent.locks.Lock
        public void lock() {
            CycleDetectingLockFactory.this.a(this);
            try {
                super.lock();
            } finally {
                CycleDetectingLockFactory.h(this);
            }
        }

        @Override // java.util.concurrent.locks.ReentrantLock, java.util.concurrent.locks.Lock
        public void lockInterruptibly() throws InterruptedException {
            CycleDetectingLockFactory.this.a(this);
            try {
                super.lockInterruptibly();
            } finally {
                CycleDetectingLockFactory.h(this);
            }
        }

        @Override // java.util.concurrent.locks.ReentrantLock, java.util.concurrent.locks.Lock
        public boolean tryLock() {
            CycleDetectingLockFactory.this.a(this);
            try {
                return super.tryLock();
            } finally {
                CycleDetectingLockFactory.h(this);
            }
        }

        @Override // java.util.concurrent.locks.ReentrantLock, java.util.concurrent.locks.Lock
        public boolean tryLock(long j10, TimeUnit timeUnit) throws InterruptedException {
            CycleDetectingLockFactory.this.a(this);
            try {
                return super.tryLock(j10, timeUnit);
            } finally {
                CycleDetectingLockFactory.h(this);
            }
        }

        @Override // java.util.concurrent.locks.ReentrantLock, java.util.concurrent.locks.Lock
        public void unlock() {
            try {
                super.unlock();
            } finally {
                CycleDetectingLockFactory.h(this);
            }
        }
    }

    public class CycleDetectingReentrantReadLock extends ReentrantReadWriteLock.ReadLock {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @u9.g
        final CycleDetectingReentrantReadWriteLock f59286b;

        CycleDetectingReentrantReadLock(CycleDetectingReentrantReadWriteLock cycleDetectingReentrantReadWriteLock) {
            super(cycleDetectingReentrantReadWriteLock);
            this.f59286b = cycleDetectingReentrantReadWriteLock;
        }

        @Override // java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock, java.util.concurrent.locks.Lock
        public void lock() {
            CycleDetectingLockFactory.this.a(this.f59286b);
            try {
                super.lock();
            } finally {
                CycleDetectingLockFactory.h(this.f59286b);
            }
        }

        @Override // java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock, java.util.concurrent.locks.Lock
        public void lockInterruptibly() throws InterruptedException {
            CycleDetectingLockFactory.this.a(this.f59286b);
            try {
                super.lockInterruptibly();
            } finally {
                CycleDetectingLockFactory.h(this.f59286b);
            }
        }

        @Override // java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock, java.util.concurrent.locks.Lock
        public boolean tryLock() {
            CycleDetectingLockFactory.this.a(this.f59286b);
            try {
                return super.tryLock();
            } finally {
                CycleDetectingLockFactory.h(this.f59286b);
            }
        }

        @Override // java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock, java.util.concurrent.locks.Lock
        public boolean tryLock(long j10, TimeUnit timeUnit) throws InterruptedException {
            CycleDetectingLockFactory.this.a(this.f59286b);
            try {
                return super.tryLock(j10, timeUnit);
            } finally {
                CycleDetectingLockFactory.h(this.f59286b);
            }
        }

        @Override // java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock, java.util.concurrent.locks.Lock
        public void unlock() {
            try {
                super.unlock();
            } finally {
                CycleDetectingLockFactory.h(this.f59286b);
            }
        }
    }

    public final class CycleDetectingReentrantReadWriteLock extends ReentrantReadWriteLock implements b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final CycleDetectingReentrantReadLock f59288b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final CycleDetectingReentrantWriteLock f59289c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final c f59290d;

        private CycleDetectingReentrantReadWriteLock(CycleDetectingLockFactory cycleDetectingLockFactory, c cVar, boolean z10) {
            super(z10);
            this.f59288b = cycleDetectingLockFactory.new CycleDetectingReentrantReadLock(this);
            this.f59289c = cycleDetectingLockFactory.new CycleDetectingReentrantWriteLock(this);
            this.f59290d = (c) com.google.common.base.w.E(cVar);
        }

        /* synthetic */ CycleDetectingReentrantReadWriteLock(CycleDetectingLockFactory cycleDetectingLockFactory, c cVar, boolean z10, a aVar) {
            this(cycleDetectingLockFactory, cVar, z10);
        }

        @Override // com.google.common.util.concurrent.CycleDetectingLockFactory.b
        public c a() {
            return this.f59290d;
        }

        @Override // com.google.common.util.concurrent.CycleDetectingLockFactory.b
        public boolean b() {
            return isWriteLockedByCurrentThread() || getReadHoldCount() > 0;
        }

        @Override // java.util.concurrent.locks.ReentrantReadWriteLock, java.util.concurrent.locks.ReadWriteLock
        public ReentrantReadWriteLock.ReadLock readLock() {
            return this.f59288b;
        }

        @Override // java.util.concurrent.locks.ReentrantReadWriteLock, java.util.concurrent.locks.ReadWriteLock
        public ReentrantReadWriteLock.WriteLock writeLock() {
            return this.f59289c;
        }
    }

    public class CycleDetectingReentrantWriteLock extends ReentrantReadWriteLock.WriteLock {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @u9.g
        final CycleDetectingReentrantReadWriteLock f59291b;

        CycleDetectingReentrantWriteLock(CycleDetectingReentrantReadWriteLock cycleDetectingReentrantReadWriteLock) {
            super(cycleDetectingReentrantReadWriteLock);
            this.f59291b = cycleDetectingReentrantReadWriteLock;
        }

        @Override // java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock, java.util.concurrent.locks.Lock
        public void lock() {
            CycleDetectingLockFactory.this.a(this.f59291b);
            try {
                super.lock();
            } finally {
                CycleDetectingLockFactory.h(this.f59291b);
            }
        }

        @Override // java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock, java.util.concurrent.locks.Lock
        public void lockInterruptibly() throws InterruptedException {
            CycleDetectingLockFactory.this.a(this.f59291b);
            try {
                super.lockInterruptibly();
            } finally {
                CycleDetectingLockFactory.h(this.f59291b);
            }
        }

        @Override // java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock, java.util.concurrent.locks.Lock
        public boolean tryLock() {
            CycleDetectingLockFactory.this.a(this.f59291b);
            try {
                return super.tryLock();
            } finally {
                CycleDetectingLockFactory.h(this.f59291b);
            }
        }

        @Override // java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock, java.util.concurrent.locks.Lock
        public boolean tryLock(long j10, TimeUnit timeUnit) throws InterruptedException {
            CycleDetectingLockFactory.this.a(this.f59291b);
            try {
                return super.tryLock(j10, timeUnit);
            } finally {
                CycleDetectingLockFactory.h(this.f59291b);
            }
        }

        @Override // java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock, java.util.concurrent.locks.Lock
        public void unlock() {
            try {
                super.unlock();
            } finally {
                CycleDetectingLockFactory.h(this.f59291b);
            }
        }
    }

    public static class ExampleStackTrace extends IllegalStateException {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final StackTraceElement[] f59293b = new StackTraceElement[0];

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final ImmutableSet<String> f59294c = ImmutableSet.G(CycleDetectingLockFactory.class.getName(), ExampleStackTrace.class.getName(), c.class.getName());

        ExampleStackTrace(c cVar, c cVar2) {
            String strD = cVar.d();
            String strD2 = cVar2.d();
            StringBuilder sb2 = new StringBuilder(String.valueOf(strD).length() + 4 + String.valueOf(strD2).length());
            sb2.append(strD);
            sb2.append(" -> ");
            sb2.append(strD2);
            super(sb2.toString());
            StackTraceElement[] stackTrace = getStackTrace();
            int length = stackTrace.length;
            for (int i10 = 0; i10 < length; i10++) {
                if (e.class.getName().equals(stackTrace[i10].getClassName())) {
                    setStackTrace(f59293b);
                    return;
                } else {
                    if (!f59294c.contains(stackTrace[i10].getClassName())) {
                        setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i10, length));
                        return;
                    }
                }
            }
        }
    }

    @o9.a
    public enum Policies implements d {
        THROW { // from class: com.google.common.util.concurrent.CycleDetectingLockFactory.Policies.1
            @Override // com.google.common.util.concurrent.CycleDetectingLockFactory.d
            public void handlePotentialDeadlock(PotentialDeadlockException potentialDeadlockException) {
                throw potentialDeadlockException;
            }
        },
        WARN { // from class: com.google.common.util.concurrent.CycleDetectingLockFactory.Policies.2
            @Override // com.google.common.util.concurrent.CycleDetectingLockFactory.d
            public void handlePotentialDeadlock(PotentialDeadlockException potentialDeadlockException) {
                CycleDetectingLockFactory.f59281c.log(Level.SEVERE, "Detected potential deadlock", (Throwable) potentialDeadlockException);
            }
        },
        DISABLED { // from class: com.google.common.util.concurrent.CycleDetectingLockFactory.Policies.3
            @Override // com.google.common.util.concurrent.CycleDetectingLockFactory.d
            public void handlePotentialDeadlock(PotentialDeadlockException potentialDeadlockException) {
            }
        };

        /* synthetic */ Policies(a aVar) {
            this();
        }
    }

    @o9.a
    public static final class PotentialDeadlockException extends ExampleStackTrace {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final ExampleStackTrace f59295d;

        private PotentialDeadlockException(c cVar, c cVar2, ExampleStackTrace exampleStackTrace) {
            super(cVar, cVar2);
            this.f59295d = exampleStackTrace;
            initCause(exampleStackTrace);
        }

        /* synthetic */ PotentialDeadlockException(c cVar, c cVar2, ExampleStackTrace exampleStackTrace, a aVar) {
            this(cVar, cVar2, exampleStackTrace);
        }

        public ExampleStackTrace a() {
            return this.f59295d;
        }

        @Override // java.lang.Throwable
        public String getMessage() {
            String message = super.getMessage();
            Objects.requireNonNull(message);
            StringBuilder sb2 = new StringBuilder(message);
            for (Throwable cause = this.f59295d; cause != null; cause = cause.getCause()) {
                sb2.append(", ");
                sb2.append(cause.getMessage());
            }
            return sb2.toString();
        }
    }

    public class a extends ThreadLocal<ArrayList<c>> {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ArrayList<c> initialValue() {
            return Lists.u(3);
        }
    }

    public interface b {
        c a();

        boolean b();
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Map<c, ExampleStackTrace> f59296a = new MapMaker().l().i();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Map<c, PotentialDeadlockException> f59297b = new MapMaker().l().i();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final String f59298c;

        c(String str) {
            this.f59298c = (String) com.google.common.base.w.E(str);
        }

        @CheckForNull
        private ExampleStackTrace c(c cVar, Set<c> set) {
            if (!set.add(this)) {
                return null;
            }
            ExampleStackTrace exampleStackTrace = this.f59296a.get(cVar);
            if (exampleStackTrace != null) {
                return exampleStackTrace;
            }
            for (Map.Entry<c, ExampleStackTrace> entry : this.f59296a.entrySet()) {
                c key = entry.getKey();
                ExampleStackTrace exampleStackTraceC = key.c(cVar, set);
                if (exampleStackTraceC != null) {
                    ExampleStackTrace exampleStackTrace2 = new ExampleStackTrace(key, this);
                    exampleStackTrace2.setStackTrace(entry.getValue().getStackTrace());
                    exampleStackTrace2.initCause(exampleStackTraceC);
                    return exampleStackTrace2;
                }
            }
            return null;
        }

        void a(d dVar, c cVar) {
            com.google.common.base.w.x0(this != cVar, "Attempted to acquire multiple locks with the same rank %s", cVar.d());
            if (this.f59296a.containsKey(cVar)) {
                return;
            }
            PotentialDeadlockException potentialDeadlockException = this.f59297b.get(cVar);
            a aVar = null;
            if (potentialDeadlockException != null) {
                dVar.handlePotentialDeadlock(new PotentialDeadlockException(cVar, this, potentialDeadlockException.a(), aVar));
                return;
            }
            ExampleStackTrace exampleStackTraceC = cVar.c(this, Sets.z());
            if (exampleStackTraceC == null) {
                this.f59296a.put(cVar, new ExampleStackTrace(cVar, this));
                return;
            }
            PotentialDeadlockException potentialDeadlockException2 = new PotentialDeadlockException(cVar, this, exampleStackTraceC, aVar);
            this.f59297b.put(cVar, potentialDeadlockException2);
            dVar.handlePotentialDeadlock(potentialDeadlockException2);
        }

        void b(d dVar, List<c> list) {
            Iterator<c> it = list.iterator();
            while (it.hasNext()) {
                a(dVar, it.next());
            }
        }

        String d() {
            return this.f59298c;
        }
    }

    @o9.a
    public interface d {
        void handlePotentialDeadlock(PotentialDeadlockException potentialDeadlockException);
    }

    @o9.a
    public static final class e<E extends Enum<E>> extends CycleDetectingLockFactory {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final Map<E, c> f59299e;

        @o9.d
        e(d dVar, Map<E, c> map) {
            super(dVar, null);
            this.f59299e = map;
        }

        public ReentrantLock o(E e10) {
            return p(e10, false);
        }

        public ReentrantLock p(E e10, boolean z10) {
            if (this.f59283a == Policies.DISABLED) {
                return new ReentrantLock(z10);
            }
            c cVar = this.f59299e.get(e10);
            Objects.requireNonNull(cVar);
            return new CycleDetectingReentrantLock(this, cVar, z10, null);
        }

        public ReentrantReadWriteLock q(E e10) {
            return r(e10, false);
        }

        public ReentrantReadWriteLock r(E e10, boolean z10) {
            if (this.f59283a == Policies.DISABLED) {
                return new ReentrantReadWriteLock(z10);
            }
            c cVar = this.f59299e.get(e10);
            Objects.requireNonNull(cVar);
            return new CycleDetectingReentrantReadWriteLock(this, cVar, z10, null);
        }
    }

    private CycleDetectingLockFactory(d dVar) {
        this.f59283a = (d) com.google.common.base.w.E(dVar);
    }

    /* synthetic */ CycleDetectingLockFactory(d dVar, a aVar) {
        this(dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(b bVar) {
        if (bVar.b()) {
            return;
        }
        ArrayList<c> arrayList = f59282d.get();
        c cVarA = bVar.a();
        cVarA.b(this.f59283a, arrayList);
        arrayList.add(cVarA);
    }

    @o9.d
    static <E extends Enum<E>> Map<E, c> e(Class<E> cls) {
        EnumMap enumMapW = Maps.W(cls);
        E[] enumConstants = cls.getEnumConstants();
        int length = enumConstants.length;
        ArrayList arrayListU = Lists.u(length);
        int i10 = 0;
        for (E e10 : enumConstants) {
            c cVar = new c(f(e10));
            arrayListU.add(cVar);
            enumMapW.put(e10, cVar);
        }
        for (int i11 = 1; i11 < length; i11++) {
            ((c) arrayListU.get(i11)).b(Policies.THROW, arrayListU.subList(0, i11));
        }
        while (i10 < length - 1) {
            i10++;
            ((c) arrayListU.get(i10)).b(Policies.DISABLED, arrayListU.subList(i10, length));
        }
        return Collections.unmodifiableMap(enumMapW);
    }

    private static String f(Enum<?> r10) {
        String simpleName = r10.getDeclaringClass().getSimpleName();
        String strName = r10.name();
        StringBuilder sb2 = new StringBuilder(simpleName.length() + 1 + String.valueOf(strName).length());
        sb2.append(simpleName);
        sb2.append(".");
        sb2.append(strName);
        return sb2.toString();
    }

    private static <E extends Enum<E>> Map<? extends E, c> g(Class<E> cls) {
        ConcurrentMap<Class<? extends Enum<?>>, Map<? extends Enum<?>, c>> concurrentMap = f59280b;
        Map<? extends E, c> map = (Map) concurrentMap.get(cls);
        if (map != null) {
            return map;
        }
        Map<? extends Enum<?>, c> mapE = e(cls);
        return (Map) com.google.common.base.q.a(concurrentMap.putIfAbsent(cls, mapE), mapE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void h(b bVar) {
        if (bVar.b()) {
            return;
        }
        ArrayList<c> arrayList = f59282d.get();
        c cVarA = bVar.a();
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size) == cVarA) {
                arrayList.remove(size);
                return;
            }
        }
    }

    public static CycleDetectingLockFactory i(d dVar) {
        return new CycleDetectingLockFactory(dVar);
    }

    public static <E extends Enum<E>> e<E> j(Class<E> cls, d dVar) {
        com.google.common.base.w.E(cls);
        com.google.common.base.w.E(dVar);
        return new e<>(dVar, g(cls));
    }

    public ReentrantLock k(String str) {
        return l(str, false);
    }

    public ReentrantLock l(String str, boolean z10) {
        return this.f59283a == Policies.DISABLED ? new ReentrantLock(z10) : new CycleDetectingReentrantLock(this, new c(str), z10, null);
    }

    public ReentrantReadWriteLock m(String str) {
        return n(str, false);
    }

    public ReentrantReadWriteLock n(String str, boolean z10) {
        return this.f59283a == Policies.DISABLED ? new ReentrantReadWriteLock(z10) : new CycleDetectingReentrantReadWriteLock(this, new c(str), z10, null);
    }
}
