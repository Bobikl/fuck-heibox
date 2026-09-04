package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList;

import com.starlightc.ucropplus.ui.UCropPlusActivity;
import com.umeng.analytics.pro.ak;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;
import yh.l;

/* JADX INFO: compiled from: AbstractPersistentList.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010(\n\u0000\n\u0002\u0010*\n\u0002\b\u0004\b \u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u001e\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016J\u001c\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\tH\u0016J$\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\f\u001a\u00020\u00042\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\tH\u0016J\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u000e\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001c\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\tH\u0016J\u001c\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\tH\u0016J\u000e\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0016J\u0018\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000e\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0016\u0010\u0017\u001a\u00020\u00142\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\tH\u0016J\u000f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018H\u0096\u0002J\u000e\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u001aH\u0016¨\u0006\u001e"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/AbstractPersistentList;", androidx.exifinterface.media.a.S4, "Lu0/h;", "Lkotlin/collections/b;", "", "fromIndex", "toIndex", "Lu0/d;", "subList", "", "elements", "addAll", UCropPlusActivity.ARG_INDEX, ak.aF, "element", "remove", "(Ljava/lang/Object;)Lu0/h;", "removeAll", "retainAll", "clear", "", "contains", "(Ljava/lang/Object;)Z", "containsAll", "", "iterator", "", "listIterator", "<init>", "()V", "runtime_release"}, k = 1, mv = {1, 7, 1})
public abstract class AbstractPersistentList<E> extends kotlin.collections.b<E> implements u0.h<E> {
    @Override // java.util.List, u0.h
    @dl.d
    public u0.h<E> addAll(int index, @dl.d Collection<? extends E> c10) {
        f0.p(c10, "c");
        u0.h.a<E> aVarBuilder = builder();
        aVarBuilder.addAll(index, c10);
        return aVarBuilder.build();
    }

    @Override // java.util.Collection, java.util.List, u0.g
    @dl.d
    public u0.h<E> addAll(@dl.d Collection<? extends E> elements) {
        f0.p(elements, "elements");
        u0.h.a<E> aVarBuilder = builder();
        aVarBuilder.addAll(elements);
        return aVarBuilder.build();
    }

    @Override // java.util.Collection, java.util.List, u0.g
    @dl.d
    public u0.h<E> clear() {
        return j.b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object element) {
        return indexOf(element) != -1;
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.List
    public boolean containsAll(@dl.d Collection<? extends Object> elements) {
        f0.p(elements, "elements");
        if (elements.isEmpty()) {
            return true;
        }
        Iterator<T> it = elements.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // kotlin.collections.b, kotlin.collections.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    @dl.d
    public Iterator<E> iterator() {
        return listIterator();
    }

    @Override // kotlin.collections.b, java.util.List
    @dl.d
    public ListIterator<E> listIterator() {
        return listIterator(0);
    }

    @Override // java.util.Collection, java.util.List, u0.g
    @dl.d
    public u0.h<E> remove(E element) {
        int iIndexOf = indexOf(element);
        return iIndexOf != -1 ? K0(iIndexOf) : this;
    }

    @Override // java.util.Collection, java.util.List, u0.g
    @dl.d
    public u0.h<E> removeAll(@dl.d final Collection<? extends E> elements) {
        f0.p(elements, "elements");
        return f((l) new l<E, Boolean>() { // from class: androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.AbstractPersistentList.removeAll.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // yh.l
            @dl.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(E e10) {
                return Boolean.valueOf(elements.contains(e10));
            }
        });
    }

    @Override // java.util.Collection, java.util.List, u0.g
    @dl.d
    public u0.h<E> retainAll(@dl.d final Collection<? extends E> elements) {
        f0.p(elements, "elements");
        return f((l) new l<E, Boolean>() { // from class: androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.AbstractPersistentList.retainAll.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // yh.l
            @dl.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(E e10) {
                return Boolean.valueOf(!elements.contains(e10));
            }
        });
    }

    @Override // kotlin.collections.b, java.util.List, u0.d
    @dl.d
    public u0.d<E> subList(int fromIndex, int toIndex) {
        return u0.c.b(this, fromIndex, toIndex);
    }
}
