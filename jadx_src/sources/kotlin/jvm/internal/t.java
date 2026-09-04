package kotlin.jvm.internal;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: compiled from: CollectionToArray.kt */
/* JADX INFO: loaded from: classes5.dex */
@xh.h(name = "CollectionToArray")
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private static final Object[] f124975a = new Object[0];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f124976b = 2147483645;

    @dl.d
    @xh.h(name = "toArray")
    public static final Object[] a(@dl.d Collection<?> collection) {
        f0.p(collection, "collection");
        int size = collection.size();
        if (size != 0) {
            Iterator<?> it = collection.iterator();
            if (it.hasNext()) {
                Object[] objArrCopyOf = new Object[size];
                int i10 = 0;
                while (true) {
                    int i11 = i10 + 1;
                    objArrCopyOf[i10] = it.next();
                    if (i11 >= objArrCopyOf.length) {
                        if (!it.hasNext()) {
                            return objArrCopyOf;
                        }
                        int i12 = ((i11 * 3) + 1) >>> 1;
                        if (i12 <= i11) {
                            if (i11 >= f124976b) {
                                throw new OutOfMemoryError();
                            }
                            i12 = f124976b;
                        }
                        objArrCopyOf = Arrays.copyOf(objArrCopyOf, i12);
                        f0.o(objArrCopyOf, "copyOf(result, newSize)");
                    } else if (!it.hasNext()) {
                        Object[] objArrCopyOf2 = Arrays.copyOf(objArrCopyOf, i11);
                        f0.o(objArrCopyOf2, "copyOf(result, size)");
                        return objArrCopyOf2;
                    }
                    i10 = i11;
                }
            }
        }
        return f124975a;
    }

    @dl.d
    @xh.h(name = "toArray")
    public static final Object[] b(@dl.d Collection<?> collection, @dl.e Object[] objArr) {
        Object[] objArrCopyOf;
        f0.p(collection, "collection");
        objArr.getClass();
        int size = collection.size();
        int i10 = 0;
        if (size == 0) {
            if (objArr.length <= 0) {
                return objArr;
            }
            objArr[0] = null;
            return objArr;
        }
        Iterator<?> it = collection.iterator();
        if (!it.hasNext()) {
            if (objArr.length <= 0) {
                return objArr;
            }
            objArr[0] = null;
            return objArr;
        }
        if (size <= objArr.length) {
            objArrCopyOf = objArr;
        } else {
            Object objNewInstance = Array.newInstance(objArr.getClass().getComponentType(), size);
            f0.n(objNewInstance, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArrCopyOf = (Object[]) objNewInstance;
        }
        while (true) {
            int i11 = i10 + 1;
            objArrCopyOf[i10] = it.next();
            if (i11 >= objArrCopyOf.length) {
                if (!it.hasNext()) {
                    return objArrCopyOf;
                }
                int i12 = ((i11 * 3) + 1) >>> 1;
                if (i12 <= i11) {
                    if (i11 >= f124976b) {
                        throw new OutOfMemoryError();
                    }
                    i12 = f124976b;
                }
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, i12);
                f0.o(objArrCopyOf, "copyOf(result, newSize)");
            } else if (!it.hasNext()) {
                if (objArrCopyOf == objArr) {
                    objArr[i11] = null;
                    return objArr;
                }
                Object[] objArrCopyOf2 = Arrays.copyOf(objArrCopyOf, i11);
                f0.o(objArrCopyOf2, "copyOf(result, size)");
                return objArrCopyOf2;
            }
            i10 = i11;
        }
    }

    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Object, java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    private static final Object[] c(Collection<?> collection, yh.a<Object[]> aVar, yh.l<? super Integer, Object[]> lVar, yh.p<? super Object[], ? super Integer, Object[]> pVar) {
        int size = collection.size();
        if (size == 0) {
            return aVar.invoke();
        }
        Iterator<?> it = collection.iterator();
        if (!it.hasNext()) {
            return aVar.invoke();
        }
        Object[] objArrInvoke = lVar.invoke(Integer.valueOf(size));
        int i10 = 0;
        ?? CopyOf = objArrInvoke;
        while (true) {
            int i11 = i10 + 1;
            CopyOf[i10] = it.next();
            if (i11 >= CopyOf.length) {
                if (!it.hasNext()) {
                    return CopyOf;
                }
                int i12 = ((i11 * 3) + 1) >>> 1;
                if (i12 <= i11) {
                    if (i11 >= f124976b) {
                        throw new OutOfMemoryError();
                    }
                    i12 = f124976b;
                }
                CopyOf = Arrays.copyOf((Object[]) CopyOf, i12);
                f0.o(CopyOf, "copyOf(result, newSize)");
            } else if (!it.hasNext()) {
                return pVar.invoke(CopyOf, Integer.valueOf(i11));
            }
            i10 = i11;
            CopyOf = CopyOf;
        }
    }
}
