package androidx.compose.runtime.snapshots;

import com.starlightc.ucropplus.ui.UCropPlusActivity;
import com.umeng.analytics.pro.ak;
import java.util.ConcurrentModificationException;
import java.util.ListIterator;
import kotlin.Metadata;

/* JADX INFO: compiled from: SnapshotStateList.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010+\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\r\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001d\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013\u0012\u0006\u0010\u001d\u001a\u00020\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ\b\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J\u000f\u0010\t\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000b\u001a\u00020\u0007H\u0016J\u0017\u0010\r\u001a\u00020\u00032\u0006\u0010\f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u000f\u001a\u00020\u0005H\u0096\u0002J\u0010\u0010\u0010\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0010\u0010\nJ\b\u0010\u0011\u001a\u00020\u0003H\u0016J\u0017\u0010\u0012\u001a\u00020\u00032\u0006\u0010\f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0012\u0010\u000eR\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u00138\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u001a\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001c\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019¨\u0006 "}, d2 = {"Landroidx/compose/runtime/snapshots/v;", androidx.exifinterface.media.a.f23244d5, "", "Lkotlin/b2;", "b", "", "hasPrevious", "", "nextIndex", "previous", "()Ljava/lang/Object;", "previousIndex", "element", "add", "(Ljava/lang/Object;)V", "hasNext", "next", "remove", "set", "Landroidx/compose/runtime/snapshots/SnapshotStateList;", "Landroidx/compose/runtime/snapshots/SnapshotStateList;", ak.av, "()Landroidx/compose/runtime/snapshots/SnapshotStateList;", "list", ak.aF, "I", UCropPlusActivity.ARG_INDEX, "d", "modification", androidx.constraintlayout.core.motion.utils.w.c.R, "<init>", "(Landroidx/compose/runtime/snapshots/SnapshotStateList;I)V", "runtime_release"}, k = 1, mv = {1, 7, 1})
public final class v<T> implements ListIterator<T>, zh.f {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final SnapshotStateList<T> list;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private int index;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private int modification;

    public v(@dl.d SnapshotStateList<T> list, int i10) {
        kotlin.jvm.internal.f0.p(list, "list");
        this.list = list;
        this.index = i10 - 1;
        this.modification = list.g();
    }

    private final void b() {
        if (this.list.g() != this.modification) {
            throw new ConcurrentModificationException();
        }
    }

    @dl.d
    public final SnapshotStateList<T> a() {
        return this.list;
    }

    @Override // java.util.ListIterator
    public void add(T element) {
        b();
        this.list.add(this.index + 1, element);
        this.index++;
        this.modification = this.list.g();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public boolean hasNext() {
        return this.index < this.list.size() - 1;
    }

    @Override // java.util.ListIterator
    public boolean hasPrevious() {
        return this.index >= 0;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public T next() {
        b();
        int i10 = this.index + 1;
        s.e(i10, this.list.size());
        T t10 = this.list.get(i10);
        this.index = i10;
        return t10;
    }

    @Override // java.util.ListIterator
    public int nextIndex() {
        return this.index + 1;
    }

    @Override // java.util.ListIterator
    public T previous() {
        b();
        s.e(this.index, this.list.size());
        T t10 = this.list.get(this.index);
        this.index--;
        return t10;
    }

    @Override // java.util.ListIterator
    public int previousIndex() {
        return this.index;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public void remove() {
        b();
        this.list.remove(this.index);
        this.index--;
        this.modification = this.list.g();
    }

    @Override // java.util.ListIterator
    public void set(T element) {
        b();
        this.list.set(this.index, element);
        this.modification = this.list.g();
    }
}
