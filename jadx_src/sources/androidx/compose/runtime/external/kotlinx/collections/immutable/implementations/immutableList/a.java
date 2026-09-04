package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList;

import com.max.hbuikit.bean.param.UiKitSpanObj;
import com.starlightc.ucropplus.ui.UCropPlusActivity;
import com.umeng.analytics.pro.ak;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;

/* JADX INFO: compiled from: AbstractListIterator.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010*\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b \u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0017\u0012\u0006\u0010\u0012\u001a\u00020\u0006\u0012\u0006\u0010\u0015\u001a\u00020\u0006¢\u0006\u0004\b\u0016\u0010\u0017J\t\u0010\u0004\u001a\u00020\u0003H\u0096\u0002J\b\u0010\u0005\u001a\u00020\u0003H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\b\u001a\u00020\u0006H\u0016J\u000f\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0000¢\u0006\u0004\b\f\u0010\u000bR\"\u0010\u0012\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\"\u0010\u0015\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\r\u001a\u0004\b\u0013\u0010\u000f\"\u0004\b\u0014\u0010\u0011¨\u0006\u0018"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/a;", androidx.exifinterface.media.a.S4, "", "", "hasNext", "hasPrevious", "", "nextIndex", "previousIndex", "Lkotlin/b2;", ak.av, "()V", "b", "I", ak.aF, "()I", "e", "(I)V", UCropPlusActivity.ARG_INDEX, "d", "g", UiKitSpanObj.TYPE_SIZE, "<init>", "(II)V", "runtime_release"}, k = 1, mv = {1, 7, 1})
public abstract class a<E> implements ListIterator<E>, zh.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private int index;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private int size;

    public a(int i10, int i11) {
        this.index = i10;
        this.size = i11;
    }

    public final void a() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
    }

    @Override // java.util.ListIterator
    public void add(E e10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void b() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getIndex() {
        return this.index;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getSize() {
        return this.size;
    }

    public final void e(int i10) {
        this.index = i10;
    }

    public final void g(int i10) {
        this.size = i10;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public boolean hasNext() {
        return this.index < this.size;
    }

    @Override // java.util.ListIterator
    public boolean hasPrevious() {
        return this.index > 0;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public E next() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public int nextIndex() {
        return this.index;
    }

    @Override // java.util.ListIterator
    public int previousIndex() {
        return this.index - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public void set(E e10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
