package com.google.common.collect;

import java.util.NoSuchElementException;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes7.dex */
@o9.b
@u
public abstract class AbstractIterator<T> extends b3<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private State f57028b = State.NOT_READY;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @CheckForNull
    private T f57029c;

    public enum State {
        READY,
        NOT_READY,
        DONE,
        FAILED
    }

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f57030a;

        static {
            int[] iArr = new int[State.values().length];
            f57030a = iArr;
            try {
                iArr[State.DONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f57030a[State.READY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    protected AbstractIterator() {
    }

    private boolean c() {
        this.f57028b = State.FAILED;
        this.f57029c = a();
        if (this.f57028b == State.DONE) {
            return false;
        }
        this.f57028b = State.READY;
        return true;
    }

    @CheckForNull
    protected abstract T a();

    @s9.a
    @CheckForNull
    protected final T b() {
        this.f57028b = State.DONE;
        return null;
    }

    @Override // java.util.Iterator
    @s9.a
    public final boolean hasNext() {
        com.google.common.base.w.g0(this.f57028b != State.FAILED);
        int i10 = a.f57030a[this.f57028b.ordinal()];
        if (i10 == 1) {
            return false;
        }
        if (i10 != 2) {
            return c();
        }
        return true;
    }

    @Override // java.util.Iterator
    @x1
    @s9.a
    public final T next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f57028b = State.NOT_READY;
        T t10 = (T) t1.a(this.f57029c);
        this.f57029c = null;
        return t10;
    }

    @x1
    public final T peek() {
        if (hasNext()) {
            return (T) t1.a(this.f57029c);
        }
        throw new NoSuchElementException();
    }
}
