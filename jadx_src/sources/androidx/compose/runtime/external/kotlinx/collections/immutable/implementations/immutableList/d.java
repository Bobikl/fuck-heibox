package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList;

import com.max.hbuikit.bean.param.UiKitSpanObj;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.starlightc.ucropplus.ui.UCropPlusActivity;
import com.umeng.analytics.pro.ak;
import fi.u;
import java.util.Arrays;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.collections.m;
import kotlin.jvm.internal.f0;
import yh.l;

/* JADX INFO: compiled from: PersistentVector.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010*\n\u0002\b\u000f\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B7\u0012\u000e\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006\u0012\u000e\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006\u0012\u0006\u0010<\u001a\u00020\u0004\u0012\u0006\u0010=\u001a\u00020\u0004¢\u0006\u0004\b>\u0010?J\b\u0010\u0005\u001a\u00020\u0004H\u0002JE\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u000e\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u000e\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u000e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\fJA\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0010\u0010\b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00062\u0006\u0010\r\u001a\u00020\u00042\u000e\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J7\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u000e\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0006\u0010\u0011\u001a\u00020\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\u0013\u0010\u0014JI\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u000e\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J=\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u000e\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0006\u0010\u001a\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ5\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u000e\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0006\u0010\u001a\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJA\u0010 \u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00062\u000e\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u0016H\u0002¢\u0006\u0004\b \u0010!J?\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u000e\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\"\u0010!J\u001f\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0006\u0010\u0015\u001a\u00020\u0004H\u0002¢\u0006\u0004\b#\u0010$JA\u0010%\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u000e\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00042\b\u0010\u0018\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b%\u0010&J\u001d\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0012\u001a\u00028\u0000H\u0016¢\u0006\u0004\b'\u0010(J%\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00028\u0000H\u0016¢\u0006\u0004\b'\u0010)J\u0016\u0010*\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0015\u001a\u00020\u0004H\u0016J\"\u0010.\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0012\u0010-\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020,0+H\u0016J\u000e\u00100\u001a\b\u0012\u0004\u0012\u00028\u00000/H\u0016J\u0016\u00102\u001a\b\u0012\u0004\u0012\u00028\u0000012\u0006\u0010\u0015\u001a\u00020\u0004H\u0016J\u0018\u00103\u001a\u00028\u00002\u0006\u0010\u0015\u001a\u00020\u0004H\u0096\u0002¢\u0006\u0004\b3\u00104J%\u00105\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00028\u0000H\u0016¢\u0006\u0004\b5\u0010)R\u001c\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00106R\u001c\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00106R\u001a\u0010<\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R\u0014\u0010=\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u00109¨\u0006@"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/d;", androidx.exifinterface.media.a.S4, "Lu0/h;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/AbstractPersistentList;", "", ak.aG, "", "", "root", "filledTail", "newTail", "j", "([Ljava/lang/Object;[Ljava/lang/Object;[Ljava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/d;", "shift", "tail", "l", "([Ljava/lang/Object;I[Ljava/lang/Object;)[Ljava/lang/Object;", "tailIndex", "element", "g", "([Ljava/lang/Object;ILjava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/d;", UCropPlusActivity.ARG_INDEX, "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/c;", "elementCarry", "e", "([Ljava/lang/Object;IILjava/lang/Object;Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/c;)[Ljava/lang/Object;", "rootSize", ak.aB, "([Ljava/lang/Object;III)Lu0/h;", "i", "([Ljava/lang/Object;II)Lu0/h;", "tailCarry", RXScreenCaptureService.KEY_HEIGHT, "([Ljava/lang/Object;IILandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/c;)[Ljava/lang/Object;", "o", ak.av, "(I)[Ljava/lang/Object;", "v", "([Ljava/lang/Object;IILjava/lang/Object;)[Ljava/lang/Object;", "add", "(Ljava/lang/Object;)Lu0/h;", "(ILjava/lang/Object;)Lu0/h;", "K0", "Lkotlin/Function1;", "", "predicate", "f", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/PersistentVectorBuilder;", "b", "", "listIterator", "get", "(I)Ljava/lang/Object;", "set", "[Ljava/lang/Object;", ak.aF, "d", "I", "getSize", "()I", UiKitSpanObj.TYPE_SIZE, "rootShift", "<init>", "([Ljava/lang/Object;[Ljava/lang/Object;II)V", "runtime_release"}, k = 1, mv = {1, 7, 1})
public final class d<E> extends AbstractPersistentList<E> implements u0.h<E> {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final Object[] root;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final Object[] tail;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final int size;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final int rootShift;

    public d(@dl.d Object[] root, @dl.d Object[] tail, int i10, int i11) {
        f0.p(root, "root");
        f0.p(tail, "tail");
        this.root = root;
        this.tail = tail;
        this.size = i10;
        this.rootShift = i11;
        if (size() > 32) {
            y0.a.a(size() - j.d(size()) <= u.B(tail.length, 32));
            return;
        }
        throw new IllegalArgumentException(("Trie-based persistent vector should have at least 33 elements, got " + size()).toString());
    }

    private final Object[] a(int index) {
        if (u() <= index) {
            return this.tail;
        }
        Object[] objArr = this.root;
        for (int i10 = this.rootShift; i10 > 0; i10 -= 5) {
            Object[] objArr2 = objArr[j.a(index, i10)];
            f0.n(objArr2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArr = objArr2;
        }
        return objArr;
    }

    private final Object[] e(Object[] root, int shift, int index, Object element, c elementCarry) {
        Object[] objArrCopyOf;
        int iA = j.a(index, shift);
        if (shift == 0) {
            if (iA == 0) {
                objArrCopyOf = new Object[32];
            } else {
                objArrCopyOf = Arrays.copyOf(root, 32);
                f0.o(objArrCopyOf, "copyOf(this, newSize)");
            }
            m.c1(root, objArrCopyOf, iA + 1, iA, 31);
            elementCarry.b(root[31]);
            objArrCopyOf[iA] = element;
            return objArrCopyOf;
        }
        Object[] objArrCopyOf2 = Arrays.copyOf(root, 32);
        f0.o(objArrCopyOf2, "copyOf(this, newSize)");
        int i10 = shift - 5;
        Object obj = root[iA];
        String str = "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>";
        f0.n(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        objArrCopyOf2[iA] = e((Object[]) obj, i10, index, element, elementCarry);
        int i11 = iA + 1;
        while (i11 < 32 && objArrCopyOf2[i11] != null) {
            Object obj2 = root[i11];
            f0.n(obj2, str);
            Object[] objArr = objArrCopyOf2;
            objArr[i11] = e((Object[]) obj2, i10, 0, elementCarry.getValue(), elementCarry);
            i11++;
            objArrCopyOf2 = objArr;
            str = str;
        }
        return objArrCopyOf2;
    }

    private final d<E> g(Object[] root, int tailIndex, Object element) {
        int size = size() - u();
        Object[] objArrCopyOf = Arrays.copyOf(this.tail, 32);
        f0.o(objArrCopyOf, "copyOf(this, newSize)");
        if (size < 32) {
            m.c1(this.tail, objArrCopyOf, tailIndex + 1, tailIndex, size);
            objArrCopyOf[tailIndex] = element;
            return new d<>(root, objArrCopyOf, size() + 1, this.rootShift);
        }
        Object[] objArr = this.tail;
        Object obj = objArr[31];
        m.c1(objArr, objArrCopyOf, tailIndex + 1, tailIndex, size - 1);
        objArrCopyOf[tailIndex] = element;
        return j(root, objArrCopyOf, j.c(obj));
    }

    private final Object[] h(Object[] root, int shift, int index, c tailCarry) {
        Object[] objArrH;
        int iA = j.a(index, shift);
        if (shift == 5) {
            tailCarry.b(root[iA]);
            objArrH = null;
        } else {
            Object obj = root[iA];
            f0.n(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArrH = h((Object[]) obj, shift - 5, index, tailCarry);
        }
        if (objArrH == null && iA == 0) {
            return null;
        }
        Object[] objArrCopyOf = Arrays.copyOf(root, 32);
        f0.o(objArrCopyOf, "copyOf(this, newSize)");
        objArrCopyOf[iA] = objArrH;
        return objArrCopyOf;
    }

    private final u0.h<E> i(Object[] root, int rootSize, int shift) {
        if (shift == 0) {
            if (root.length == 33) {
                root = Arrays.copyOf(root, 32);
                f0.o(root, "copyOf(this, newSize)");
            }
            return new h(root);
        }
        c cVar = new c(null);
        Object[] objArrH = h(root, shift, rootSize - 1, cVar);
        f0.m(objArrH);
        Object value = cVar.getValue();
        f0.n(value, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr = (Object[]) value;
        if (objArrH[1] != null) {
            return new d(objArrH, objArr, rootSize, shift);
        }
        Object obj = objArrH[0];
        f0.n(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        return new d((Object[]) obj, objArr, rootSize, shift - 5);
    }

    private final d<E> j(Object[] root, Object[] filledTail, Object[] newTail) {
        int size = size() >> 5;
        int i10 = this.rootShift;
        if (size <= (1 << i10)) {
            return new d<>(l(root, i10, filledTail), newTail, size() + 1, this.rootShift);
        }
        Object[] objArrC = j.c(root);
        int i11 = this.rootShift + 5;
        return new d<>(l(objArrC, i11, filledTail), newTail, size() + 1, i11);
    }

    /* JADX WARN: Code duplicated, block: B:6:0x0019  */
    private final Object[] l(Object[] root, int shift, Object[] tail) {
        Object[] objArrCopyOf;
        int iA = j.a(size() - 1, shift);
        if (root != null) {
            objArrCopyOf = Arrays.copyOf(root, 32);
            f0.o(objArrCopyOf, "copyOf(this, newSize)");
            if (objArrCopyOf == null) {
                objArrCopyOf = new Object[32];
            }
        } else {
            objArrCopyOf = new Object[32];
        }
        if (shift == 5) {
            objArrCopyOf[iA] = tail;
        } else {
            objArrCopyOf[iA] = l((Object[]) objArrCopyOf[iA], shift - 5, tail);
        }
        return objArrCopyOf;
    }

    private final Object[] o(Object[] root, int shift, int index, c tailCarry) {
        Object[] objArrCopyOf;
        int iA = j.a(index, shift);
        if (shift == 0) {
            if (iA == 0) {
                objArrCopyOf = new Object[32];
            } else {
                objArrCopyOf = Arrays.copyOf(root, 32);
                f0.o(objArrCopyOf, "copyOf(this, newSize)");
            }
            m.c1(root, objArrCopyOf, iA, iA + 1, 32);
            objArrCopyOf[31] = tailCarry.getValue();
            tailCarry.b(root[iA]);
            return objArrCopyOf;
        }
        int iA2 = root[31] == null ? j.a(u() - 1, shift) : 31;
        Object[] objArrCopyOf2 = Arrays.copyOf(root, 32);
        f0.o(objArrCopyOf2, "copyOf(this, newSize)");
        int i10 = shift - 5;
        int i11 = iA + 1;
        if (i11 <= iA2) {
            while (true) {
                Object obj = objArrCopyOf2[iA2];
                f0.n(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                objArrCopyOf2[iA2] = o((Object[]) obj, i10, 0, tailCarry);
                if (iA2 == i11) {
                    break;
                }
                iA2--;
            }
        }
        Object obj2 = objArrCopyOf2[iA];
        f0.n(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        objArrCopyOf2[iA] = o((Object[]) obj2, i10, index, tailCarry);
        return objArrCopyOf2;
    }

    private final u0.h<E> s(Object[] root, int rootSize, int shift, int index) {
        int size = size() - rootSize;
        y0.a.a(index < size);
        if (size == 1) {
            return i(root, rootSize, shift);
        }
        Object[] objArrCopyOf = Arrays.copyOf(this.tail, 32);
        f0.o(objArrCopyOf, "copyOf(this, newSize)");
        int i10 = size - 1;
        if (index < i10) {
            m.c1(this.tail, objArrCopyOf, index, index + 1, size);
        }
        objArrCopyOf[i10] = null;
        return new d(root, objArrCopyOf, (rootSize + size) - 1, shift);
    }

    private final int u() {
        return j.d(size());
    }

    private final Object[] v(Object[] root, int shift, int index, Object e10) {
        int iA = j.a(index, shift);
        Object[] objArrCopyOf = Arrays.copyOf(root, 32);
        f0.o(objArrCopyOf, "copyOf(this, newSize)");
        if (shift == 0) {
            objArrCopyOf[iA] = e10;
        } else {
            Object obj = objArrCopyOf[iA];
            f0.n(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArrCopyOf[iA] = v((Object[]) obj, shift - 5, index, e10);
        }
        return objArrCopyOf;
    }

    @Override // u0.h
    @dl.d
    public u0.h<E> K0(int index) {
        y0.e.a(index, size());
        int iU = u();
        return index >= iU ? s(this.root, iU, this.rootShift, index - iU) : s(o(this.root, this.rootShift, index, new c(this.tail[0])), iU, this.rootShift, 0);
    }

    @Override // java.util.List, u0.h
    @dl.d
    public u0.h<E> add(int index, E element) {
        y0.e.b(index, size());
        if (index == size()) {
            return add((Object) element);
        }
        int iU = u();
        if (index >= iU) {
            return g(this.root, index - iU, element);
        }
        c cVar = new c(null);
        return g(e(this.root, this.rootShift, index, element, cVar), 0, cVar.getValue());
    }

    @Override // java.util.Collection, java.util.List, u0.g
    @dl.d
    public u0.h<E> add(E element) {
        int size = size() - u();
        if (size >= 32) {
            return j(this.root, this.tail, j.c(element));
        }
        Object[] objArrCopyOf = Arrays.copyOf(this.tail, 32);
        f0.o(objArrCopyOf, "copyOf(this, newSize)");
        objArrCopyOf[size] = element;
        return new d(this.root, objArrCopyOf, size() + 1, this.rootShift);
    }

    @Override // u0.h, u0.g
    @dl.d
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public PersistentVectorBuilder<E> builder() {
        return new PersistentVectorBuilder<>(this, this.root, this.tail, this.rootShift);
    }

    @Override // u0.g
    @dl.d
    public u0.h<E> f(@dl.d l<? super E, Boolean> predicate) {
        f0.p(predicate, "predicate");
        PersistentVectorBuilder<E> persistentVectorBuilderBuilder = builder();
        persistentVectorBuilderBuilder.T(predicate);
        return persistentVectorBuilderBuilder.build();
    }

    @Override // kotlin.collections.b, java.util.List
    public E get(int index) {
        y0.e.a(index, size());
        return (E) a(index)[index & 31];
    }

    @Override // kotlin.collections.b, kotlin.collections.AbstractCollection
    /* JADX INFO: renamed from: getSize, reason: from getter */
    public int getCom.max.hbuikit.bean.param.UiKitSpanObj.TYPE_SIZE java.lang.String() {
        return this.size;
    }

    @Override // kotlin.collections.b, java.util.List
    @dl.d
    public ListIterator<E> listIterator(int index) {
        y0.e.b(index, size());
        Object[] objArr = this.root;
        Object[] objArr2 = this.tail;
        f0.n(objArr2, "null cannot be cast to non-null type kotlin.Array<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.PersistentVector>");
        return new e(objArr, objArr2, index, size(), (this.rootShift / 5) + 1);
    }

    @Override // kotlin.collections.b, java.util.List, u0.h
    @dl.d
    public u0.h<E> set(int index, E element) {
        y0.e.a(index, size());
        if (u() > index) {
            return new d(v(this.root, this.rootShift, index, element), this.tail, size(), this.rootShift);
        }
        Object[] objArrCopyOf = Arrays.copyOf(this.tail, 32);
        f0.o(objArrCopyOf, "copyOf(this, newSize)");
        objArrCopyOf[index & 31] = element;
        return new d(this.root, objArrCopyOf, size(), this.rootShift);
    }
}
