package com.google.android.gms.internal.common;

import java.util.Iterator;
import java.util.NoSuchElementException;
import javax.annotation.CheckForNull;
import org.jspecify.nullness.NullMarked;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* JADX INFO: loaded from: classes7.dex */
@NullMarked
public abstract class q implements Iterator {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @CheckForNull
    private Object f52728b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f52729c = 2;

    protected q() {
    }

    @CheckForNull
    protected abstract Object a();

    @s9.a
    @CheckForNull
    protected final Object b() {
        this.f52729c = 3;
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i10 = this.f52729c;
        if (i10 == 4) {
            throw new IllegalStateException();
        }
        int i11 = i10 - 1;
        if (i10 == 0) {
            throw null;
        }
        if (i11 == 0) {
            return true;
        }
        if (i11 != 2) {
            this.f52729c = 4;
            this.f52728b = a();
            if (this.f52729c != 3) {
                this.f52729c = 1;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f52729c = 2;
        Object obj = this.f52728b;
        this.f52728b = null;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
