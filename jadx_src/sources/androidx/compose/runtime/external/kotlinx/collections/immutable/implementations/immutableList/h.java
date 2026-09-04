package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList;

import com.max.hbuikit.bean.param.UiKitSpanObj;
import com.starlightc.ucropplus.ui.UCropPlusActivity;
import com.umeng.analytics.pro.ak;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.m;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;
import yh.l;

/* JADX INFO: compiled from: SmallPersistentVector.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010*\n\u0002\b\f\b\u0000\u0018\u0000 \u0016*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001)B\u0017\u0012\u000e\u0010$\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006¢\u0006\u0004\b'\u0010(J\u001f\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b2\u0006\u0010\n\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\f\u0010\rJ\u001c\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eH\u0016J\"\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00120\u0011H\u0016J$\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b2\u0006\u0010\u0015\u001a\u00020\u00042\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eH\u0016J%\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b2\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\n\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\f\u0010\u0017J\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b2\u0006\u0010\u0015\u001a\u00020\u0004H\u0016J\u000e\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u0019H\u0016J\u0017\u0010\u001b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\u00042\u0006\u0010\n\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u001d\u0010\u001cJ\u0016\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u001e2\u0006\u0010\u0015\u001a\u00020\u0004H\u0016J\u0018\u0010 \u001a\u00028\u00002\u0006\u0010\u0015\u001a\u00020\u0004H\u0096\u0002¢\u0006\u0004\b \u0010!J%\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b2\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\n\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\"\u0010\u0017R\u001c\u0010$\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010#R\u0014\u0010\u0005\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&¨\u0006*"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/h;", androidx.exifinterface.media.a.S4, "Lu0/d;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/AbstractPersistentList;", "", UiKitSpanObj.TYPE_SIZE, "", "", "b", "(I)[Ljava/lang/Object;", "element", "Lu0/h;", "add", "(Ljava/lang/Object;)Lu0/h;", "", "elements", "addAll", "Lkotlin/Function1;", "", "predicate", "f", UCropPlusActivity.ARG_INDEX, ak.aF, "(ILjava/lang/Object;)Lu0/h;", "K0", "Lu0/h$a;", "builder", "indexOf", "(Ljava/lang/Object;)I", "lastIndexOf", "", "listIterator", "get", "(I)Ljava/lang/Object;", "set", "[Ljava/lang/Object;", "buffer", "getSize", "()I", "<init>", "([Ljava/lang/Object;)V", ak.av, "runtime_release"}, k = 1, mv = {1, 7, 1})
public final class h<E> extends AbstractPersistentList<E> implements u0.d<E> {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @dl.d
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private static final h f12685d = new h(new Object[0]);

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final Object[] buffer;

    /* JADX INFO: renamed from: androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.h$a, reason: from kotlin metadata */
    /* JADX INFO: compiled from: SmallPersistentVector.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/h$a;", "", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/h;", "", "EMPTY", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/h;", ak.av, "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/h;", "<init>", "()V", "runtime_release"}, k = 1, mv = {1, 7, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(u uVar) {
            this();
        }

        @dl.d
        public final h a() {
            return h.f12685d;
        }
    }

    public h(@dl.d Object[] buffer) {
        f0.p(buffer, "buffer");
        this.buffer = buffer;
        y0.a.a(buffer.length <= 32);
    }

    private final Object[] b(int size) {
        return new Object[size];
    }

    @Override // u0.h
    @dl.d
    public u0.h<E> K0(int index) {
        y0.e.a(index, size());
        if (size() == 1) {
            return f12685d;
        }
        Object[] objArrCopyOf = Arrays.copyOf(this.buffer, size() - 1);
        f0.o(objArrCopyOf, "copyOf(this, newSize)");
        m.c1(this.buffer, objArrCopyOf, index, index + 1, size());
        return new h(objArrCopyOf);
    }

    @Override // java.util.List, u0.h
    @dl.d
    public u0.h<E> add(int index, E element) {
        y0.e.b(index, size());
        if (index == size()) {
            return add((Object) element);
        }
        if (size() < 32) {
            Object[] objArrB = b(size() + 1);
            m.l1(this.buffer, objArrB, 0, 0, index, 6, null);
            m.c1(this.buffer, objArrB, index + 1, index, size());
            objArrB[index] = element;
            return new h(objArrB);
        }
        Object[] objArr = this.buffer;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        f0.o(objArrCopyOf, "copyOf(this, size)");
        m.c1(this.buffer, objArrCopyOf, index + 1, index, size() - 1);
        objArrCopyOf[index] = element;
        return new d(objArrCopyOf, j.c(this.buffer[31]), size() + 1, 0);
    }

    @Override // java.util.Collection, java.util.List, u0.g
    @dl.d
    public u0.h<E> add(E element) {
        if (size() >= 32) {
            return new d(this.buffer, j.c(element), size() + 1, 0);
        }
        Object[] objArrCopyOf = Arrays.copyOf(this.buffer, size() + 1);
        f0.o(objArrCopyOf, "copyOf(this, newSize)");
        objArrCopyOf[size()] = element;
        return new h(objArrCopyOf);
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.AbstractPersistentList, java.util.List, u0.h
    @dl.d
    public u0.h<E> addAll(int index, @dl.d Collection<? extends E> c10) {
        f0.p(c10, "c");
        y0.e.b(index, size());
        if (size() + c10.size() > 32) {
            u0.h.a<E> aVarBuilder = builder();
            aVarBuilder.addAll(index, c10);
            return aVarBuilder.build();
        }
        Object[] objArrB = b(size() + c10.size());
        m.l1(this.buffer, objArrB, 0, 0, index, 6, null);
        m.c1(this.buffer, objArrB, c10.size() + index, index, size());
        Iterator<? extends E> it = c10.iterator();
        while (it.hasNext()) {
            objArrB[index] = it.next();
            index++;
        }
        return new h(objArrB);
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.AbstractPersistentList, java.util.Collection, java.util.List, u0.g
    @dl.d
    public u0.h<E> addAll(@dl.d Collection<? extends E> elements) {
        f0.p(elements, "elements");
        if (size() + elements.size() > 32) {
            u0.h.a<E> aVarBuilder = builder();
            aVarBuilder.addAll(elements);
            return aVarBuilder.build();
        }
        Object[] objArrCopyOf = Arrays.copyOf(this.buffer, size() + elements.size());
        f0.o(objArrCopyOf, "copyOf(this, newSize)");
        int size = size();
        Iterator<? extends E> it = elements.iterator();
        while (it.hasNext()) {
            objArrCopyOf[size] = it.next();
            size++;
        }
        return new h(objArrCopyOf);
    }

    @Override // u0.g
    @dl.d
    public u0.h.a<E> builder() {
        return new PersistentVectorBuilder(this, null, this.buffer, 0);
    }

    @Override // u0.g
    @dl.d
    public u0.h<E> f(@dl.d l<? super E, Boolean> predicate) {
        f0.p(predicate, "predicate");
        Object[] objArrCopyOf = this.buffer;
        int size = size();
        int size2 = size();
        boolean z10 = false;
        for (int i10 = 0; i10 < size2; i10++) {
            Object obj = this.buffer[i10];
            if (predicate.invoke(obj).booleanValue()) {
                if (!z10) {
                    Object[] objArr = this.buffer;
                    objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
                    f0.o(objArrCopyOf, "copyOf(this, size)");
                    z10 = true;
                    size = i10;
                }
            } else if (z10) {
                objArrCopyOf[size] = obj;
                size++;
            }
        }
        if (size == size()) {
            return this;
        }
        return size == 0 ? f12685d : new h(m.M1(objArrCopyOf, 0, size));
    }

    @Override // kotlin.collections.b, java.util.List
    public E get(int index) {
        y0.e.a(index, size());
        return (E) this.buffer[index];
    }

    @Override // kotlin.collections.b, kotlin.collections.AbstractCollection
    /* JADX INFO: renamed from: getSize */
    public int getCom.max.hbuikit.bean.param.UiKitSpanObj.TYPE_SIZE java.lang.String() {
        return this.buffer.length;
    }

    @Override // kotlin.collections.b, java.util.List
    public int indexOf(Object element) {
        return ArraysKt___ArraysKt.jg(this.buffer, element);
    }

    @Override // kotlin.collections.b, java.util.List
    public int lastIndexOf(Object element) {
        return ArraysKt___ArraysKt.ni(this.buffer, element);
    }

    @Override // kotlin.collections.b, java.util.List
    @dl.d
    public ListIterator<E> listIterator(int index) {
        y0.e.b(index, size());
        Object[] objArr = this.buffer;
        f0.n(objArr, "null cannot be cast to non-null type kotlin.Array<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.SmallPersistentVector>");
        return new b(objArr, index, size());
    }

    @Override // kotlin.collections.b, java.util.List, u0.h
    @dl.d
    public u0.h<E> set(int index, E element) {
        y0.e.a(index, size());
        Object[] objArr = this.buffer;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        f0.o(objArrCopyOf, "copyOf(this, size)");
        objArrCopyOf[index] = element;
        return new h(objArrCopyOf);
    }
}
