package com.google.android.gms.internal.common;

import com.starlightc.ucropplus.ui.UCropPlusActivity;
import java.util.NoSuchElementException;
import org.jspecify.nullness.NullMarked;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* JADX INFO: loaded from: classes7.dex */
@NullMarked
public abstract class g0 extends h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f52722b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f52723c;

    protected g0(int i10, int i11) {
        z.b(i11, i10, UCropPlusActivity.ARG_INDEX);
        this.f52722b = i10;
        this.f52723c = i11;
    }

    protected abstract Object a(int i10);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f52723c < this.f52722b;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f52723c > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f52723c;
        this.f52723c = i10 + 1;
        return a(i10);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f52723c;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f52723c - 1;
        this.f52723c = i10;
        return a(i10);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f52723c - 1;
    }
}
