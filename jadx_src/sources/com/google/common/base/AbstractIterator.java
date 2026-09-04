package com.google.common.base;

import java.util.Iterator;
import java.util.NoSuchElementException;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes7.dex */
@o9.b
@g
public abstract class AbstractIterator<T> implements Iterator<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private State f56582b = State.NOT_READY;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @CheckForNull
    private T f56583c;

    public enum State {
        READY,
        NOT_READY,
        DONE,
        FAILED
    }

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f56584a;

        static {
            int[] iArr = new int[State.values().length];
            f56584a = iArr;
            try {
                iArr[State.DONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f56584a[State.READY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    protected AbstractIterator() {
    }

    private boolean c() {
        this.f56582b = State.FAILED;
        this.f56583c = a();
        if (this.f56582b == State.DONE) {
            return false;
        }
        this.f56582b = State.READY;
        return true;
    }

    @CheckForNull
    protected abstract T a();

    @s9.a
    @CheckForNull
    protected final T b() {
        this.f56582b = State.DONE;
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        w.g0(this.f56582b != State.FAILED);
        int i10 = a.f56584a[this.f56582b.ordinal()];
        if (i10 == 1) {
            return false;
        }
        if (i10 != 2) {
            return c();
        }
        return true;
    }

    @Override // java.util.Iterator
    @t
    public final T next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f56582b = State.NOT_READY;
        T t10 = (T) r.a(this.f56583c);
        this.f56583c = null;
        return t10;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
