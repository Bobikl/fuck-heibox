package io.reactivex.observers;

import io.reactivex.exceptions.CompositeException;
import io.reactivex.internal.functions.Functions;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.internal.util.VolatileSizeArrayList;
import io.reactivex.observers.BaseTestConsumer;
import io.reactivex.y;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import kh.r;

/* JADX INFO: loaded from: classes5.dex */
public abstract class BaseTestConsumer<T, U extends BaseTestConsumer<T, U>> implements io.reactivex.disposables.b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected long f123891e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected Thread f123892f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected boolean f123893g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected int f123894h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected int f123895i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected CharSequence f123896j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    protected boolean f123897k;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final List<T> f123889c = new VolatileSizeArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected final List<Throwable> f123890d = new VolatileSizeArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final CountDownLatch f123888b = new CountDownLatch(1);

    public enum TestWaitStrategy implements Runnable {
        SPIN { // from class: io.reactivex.observers.BaseTestConsumer.TestWaitStrategy.1
            @Override // io.reactivex.observers.BaseTestConsumer.TestWaitStrategy, java.lang.Runnable
            public void run() {
            }
        },
        YIELD { // from class: io.reactivex.observers.BaseTestConsumer.TestWaitStrategy.2
            @Override // io.reactivex.observers.BaseTestConsumer.TestWaitStrategy, java.lang.Runnable
            public void run() {
                Thread.yield();
            }
        },
        SLEEP_1MS { // from class: io.reactivex.observers.BaseTestConsumer.TestWaitStrategy.3
            @Override // io.reactivex.observers.BaseTestConsumer.TestWaitStrategy, java.lang.Runnable
            public void run() {
                TestWaitStrategy.sleep(1);
            }
        },
        SLEEP_10MS { // from class: io.reactivex.observers.BaseTestConsumer.TestWaitStrategy.4
            @Override // io.reactivex.observers.BaseTestConsumer.TestWaitStrategy, java.lang.Runnable
            public void run() {
                TestWaitStrategy.sleep(10);
            }
        },
        SLEEP_100MS { // from class: io.reactivex.observers.BaseTestConsumer.TestWaitStrategy.5
            @Override // io.reactivex.observers.BaseTestConsumer.TestWaitStrategy, java.lang.Runnable
            public void run() {
                TestWaitStrategy.sleep(100);
            }
        },
        SLEEP_1000MS { // from class: io.reactivex.observers.BaseTestConsumer.TestWaitStrategy.6
            @Override // io.reactivex.observers.BaseTestConsumer.TestWaitStrategy, java.lang.Runnable
            public void run() {
                TestWaitStrategy.sleep(1000);
            }
        };

        static void sleep(int i10) {
            try {
                Thread.sleep(i10);
            } catch (InterruptedException e10) {
                throw new RuntimeException(e10);
            }
        }

        @Override // java.lang.Runnable
        public abstract void run();
    }

    public static String a0(Object obj) {
        if (obj == null) {
            return "null";
        }
        return obj + " (class: " + obj.getClass().getSimpleName() + ")";
    }

    public final U A(int i10, T t10) {
        int size = this.f123889c.size();
        if (size == 0) {
            throw V("No values");
        }
        if (i10 >= size) {
            throw V("Invalid index: " + i10);
        }
        T t11 = this.f123889c.get(i10);
        if (io.reactivex.internal.functions.a.c(t10, t11)) {
            return this;
        }
        throw V("expected: " + a0(t10) + " but was: " + a0(t11));
    }

    public final U B(int i10, r<T> rVar) {
        if (this.f123889c.size() == 0) {
            throw V("No values");
        }
        if (i10 >= this.f123889c.size()) {
            throw V("Invalid index: " + i10);
        }
        try {
            if (rVar.test(this.f123889c.get(i10))) {
                return this;
            }
            throw V("Value not present");
        } catch (Exception e10) {
            throw ExceptionHelper.f(e10);
        }
    }

    public final U C(int i10) {
        int size = this.f123889c.size();
        if (size == i10) {
            return this;
        }
        throw V("Value counts differ; expected: " + i10 + " but was: " + size);
    }

    public final U D(Iterable<? extends T> iterable) {
        boolean zHasNext;
        boolean zHasNext2;
        Iterator<T> it = this.f123889c.iterator();
        Iterator<? extends T> it2 = iterable.iterator();
        int i10 = 0;
        while (true) {
            zHasNext = it2.hasNext();
            zHasNext2 = it.hasNext();
            if (!zHasNext2 || !zHasNext) {
                break;
            }
            T next = it2.next();
            T next2 = it.next();
            if (!io.reactivex.internal.functions.a.c(next, next2)) {
                throw V("Values at position " + i10 + " differ; expected: " + a0(next) + " but was: " + a0(next2));
            }
            i10++;
        }
        if (zHasNext2) {
            throw V("More values received than expected (" + i10 + ")");
        }
        if (!zHasNext) {
            return this;
        }
        throw V("Fewer values received than expected (" + i10 + ")");
    }

    public final U E(Iterable<? extends T> iterable) {
        return (U) v().D(iterable).o().r();
    }

    public final U F(Collection<? extends T> collection) {
        if (collection.isEmpty()) {
            q();
            return this;
        }
        for (T t10 : this.f123889c) {
            if (!collection.contains(t10)) {
                throw V("Value not in the expected collection: " + a0(t10));
            }
        }
        return this;
    }

    public final U G(Collection<? extends T> collection) {
        return (U) v().F(collection).o().r();
    }

    public final U H(T... tArr) {
        int size = this.f123889c.size();
        if (size != tArr.length) {
            throw V("Value count differs; expected: " + tArr.length + " " + Arrays.toString(tArr) + " but was: " + size + " " + this.f123889c);
        }
        for (int i10 = 0; i10 < size; i10++) {
            T t10 = this.f123889c.get(i10);
            T t11 = tArr[i10];
            if (!io.reactivex.internal.functions.a.c(t11, t10)) {
                throw V("Values at position " + i10 + " differ; expected: " + a0(t11) + " but was: " + a0(t10));
            }
        }
        return this;
    }

    public final U I(T... tArr) {
        return (U) v().H(tArr).o().r();
    }

    public final U J() throws InterruptedException {
        if (this.f123888b.getCount() == 0) {
            return this;
        }
        this.f123888b.await();
        return this;
    }

    public final boolean K(long j10, TimeUnit timeUnit) throws InterruptedException {
        boolean z10 = this.f123888b.getCount() == 0 || this.f123888b.await(j10, timeUnit);
        this.f123897k = !z10;
        return z10;
    }

    public final U L(int i10) {
        return (U) N(i10, TestWaitStrategy.SLEEP_10MS, 5000L);
    }

    public final U M(int i10, Runnable runnable) {
        return (U) N(i10, runnable, 5000L);
    }

    public final U N(int i10, Runnable runnable, long j10) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        while (true) {
            if (j10 > 0 && System.currentTimeMillis() - jCurrentTimeMillis >= j10) {
                this.f123897k = true;
                break;
            }
            if (this.f123888b.getCount() == 0 || this.f123889c.size() >= i10) {
                break;
            }
            runnable.run();
        }
        return this;
    }

    public final U O(long j10, TimeUnit timeUnit) {
        try {
            if (!this.f123888b.await(j10, timeUnit)) {
                this.f123897k = true;
                dispose();
            }
            return this;
        } catch (InterruptedException e10) {
            dispose();
            throw ExceptionHelper.f(e10);
        }
    }

    public final boolean P() {
        try {
            J();
            return true;
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            return false;
        }
    }

    public final boolean Q(long j10, TimeUnit timeUnit) {
        try {
            return K(j10, timeUnit);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            return false;
        }
    }

    public final U R() {
        this.f123897k = false;
        return this;
    }

    public final long S() {
        return this.f123891e;
    }

    public final int T() {
        return this.f123890d.size();
    }

    public final List<Throwable> U() {
        return this.f123890d;
    }

    protected final AssertionError V(String str) {
        StringBuilder sb2 = new StringBuilder(str.length() + 64);
        sb2.append(str);
        sb2.append(" (");
        sb2.append("latch = ");
        sb2.append(this.f123888b.getCount());
        sb2.append(", ");
        sb2.append("values = ");
        sb2.append(this.f123889c.size());
        sb2.append(", ");
        sb2.append("errors = ");
        sb2.append(this.f123890d.size());
        sb2.append(", ");
        sb2.append("completions = ");
        sb2.append(this.f123891e);
        if (this.f123897k) {
            sb2.append(", timeout!");
        }
        if (isDisposed()) {
            sb2.append(", disposed!");
        }
        CharSequence charSequence = this.f123896j;
        if (charSequence != null) {
            sb2.append(", tag = ");
            sb2.append(charSequence);
        }
        sb2.append(')');
        AssertionError assertionError = new AssertionError(sb2.toString());
        if (!this.f123890d.isEmpty()) {
            if (this.f123890d.size() == 1) {
                assertionError.initCause(this.f123890d.get(0));
            } else {
                assertionError.initCause(new CompositeException(this.f123890d));
            }
        }
        return assertionError;
    }

    public final List<List<Object>> W() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(c0());
        arrayList.add(U());
        ArrayList arrayList2 = new ArrayList();
        for (long j10 = 0; j10 < this.f123891e; j10++) {
            arrayList2.add(y.a());
        }
        arrayList.add(arrayList2);
        return arrayList;
    }

    public final boolean X() {
        return this.f123888b.getCount() == 0;
    }

    public final boolean Y() {
        return this.f123897k;
    }

    public final Thread Z() {
        return this.f123892f;
    }

    public final U a() {
        long j10 = this.f123891e;
        if (j10 == 0) {
            throw V("Not completed");
        }
        if (j10 <= 1) {
            return this;
        }
        throw V("Multiple completions: " + j10);
    }

    public final U b() {
        return (U) v().q().o().r();
    }

    public final int b0() {
        return this.f123889c.size();
    }

    public final U c(Class<? extends Throwable> cls) {
        return (U) f(Functions.l(cls));
    }

    public final List<T> c0() {
        return this.f123889c;
    }

    public final U d(Throwable th2) {
        return (U) f(Functions.i(th2));
    }

    public final U d0(CharSequence charSequence) {
        this.f123896j = charSequence;
        return this;
    }

    public final U f(r<Throwable> rVar) {
        int size = this.f123890d.size();
        if (size == 0) {
            throw V("No errors");
        }
        boolean z10 = false;
        Iterator<Throwable> it = this.f123890d.iterator();
        while (it.hasNext()) {
            try {
                if (rVar.test(it.next())) {
                    z10 = true;
                    break;
                }
            } catch (Exception e10) {
                throw ExceptionHelper.f(e10);
            }
        }
        if (!z10) {
            throw V("Error not present");
        }
        if (size == 1) {
            return this;
        }
        throw V("Error present but other errors as well");
    }

    public final U g(String str) {
        int size = this.f123890d.size();
        if (size == 0) {
            throw V("No errors");
        }
        if (size != 1) {
            throw V("Multiple errors");
        }
        String message = this.f123890d.get(0).getMessage();
        if (io.reactivex.internal.functions.a.c(str, message)) {
            return this;
        }
        throw V("Error message differs; exptected: " + str + " but was: " + message);
    }

    public final U h(Class<? extends Throwable> cls, T... tArr) {
        return (U) v().H(tArr).c(cls).r();
    }

    public final U j(r<Throwable> rVar, T... tArr) {
        return (U) v().H(tArr).f(rVar).r();
    }

    public final U k(Class<? extends Throwable> cls, String str, T... tArr) {
        return (U) v().H(tArr).c(cls).g(str).r();
    }

    public final U l(T t10) {
        int size = this.f123889c.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (io.reactivex.internal.functions.a.c(this.f123889c.get(i10), t10)) {
                throw V("Value at position " + i10 + " is equal to " + a0(t10) + "; Expected them to be different");
            }
        }
        return this;
    }

    public final U n(r<? super T> rVar) {
        int size = this.f123889c.size();
        for (int i10 = 0; i10 < size; i10++) {
            try {
                if (rVar.test(this.f123889c.get(i10))) {
                    throw V("Value at position " + i10 + " matches predicate " + rVar.toString() + ", which was not expected.");
                }
            } catch (Exception e10) {
                throw ExceptionHelper.f(e10);
            }
        }
        return this;
    }

    public final U o() {
        if (this.f123890d.size() == 0) {
            return this;
        }
        throw V("Error(s) present: " + this.f123890d);
    }

    public final U p() {
        if (this.f123897k) {
            throw V("Timeout?!");
        }
        return this;
    }

    public final U q() {
        return (U) C(0);
    }

    public final U r() {
        long j10 = this.f123891e;
        if (j10 == 1) {
            throw V("Completed!");
        }
        if (j10 <= 1) {
            return this;
        }
        throw V("Multiple completions: " + j10);
    }

    public abstract U s();

    public final U t() {
        if (this.f123888b.getCount() != 0) {
            return this;
        }
        throw V("Subscriber terminated!");
    }

    public final U u(T... tArr) {
        return (U) v().H(tArr).o().a();
    }

    public abstract U v();

    public final U w() {
        if (this.f123888b.getCount() != 0) {
            throw V("Subscriber still running!");
        }
        long j10 = this.f123891e;
        if (j10 > 1) {
            throw V("Terminated with multiple completions: " + j10);
        }
        int size = this.f123890d.size();
        if (size > 1) {
            throw V("Terminated with multiple errors: " + size);
        }
        if (j10 == 0 || size == 0) {
            return this;
        }
        throw V("Terminated with multiple completions and errors: " + j10);
    }

    public final U x() {
        if (this.f123897k) {
            return this;
        }
        throw V("No timeout?!");
    }

    public final U y(T t10) {
        if (this.f123889c.size() != 1) {
            throw V("expected: " + a0(t10) + " but was: " + this.f123889c);
        }
        T t11 = this.f123889c.get(0);
        if (io.reactivex.internal.functions.a.c(t10, t11)) {
            return this;
        }
        throw V("expected: " + a0(t10) + " but was: " + a0(t11));
    }

    public final U z(r<T> rVar) {
        B(0, rVar);
        if (this.f123889c.size() <= 1) {
            return this;
        }
        throw V("Value present but other values as well");
    }
}
