package kotlin.collections;

import java.lang.reflect.Array;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collection;

/* JADX INFO: compiled from: ArraysJVM.kt */
/* JADX INFO: loaded from: classes5.dex */
public class k {
    @dl.d
    public static final <T> T[] a(@dl.d T[] reference, int i10) {
        kotlin.jvm.internal.f0.p(reference, "reference");
        Object objNewInstance = Array.newInstance(reference.getClass().getComponentType(), i10);
        kotlin.jvm.internal.f0.n(objNewInstance, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>");
        return (T[]) ((Object[]) objNewInstance);
    }

    @kotlin.u0(version = "1.3")
    @kotlin.r0
    @xh.h(name = "contentDeepHashCode")
    public static final <T> int b(@dl.e T[] tArr) {
        return Arrays.deepHashCode(tArr);
    }

    @kotlin.u0(version = "1.3")
    public static final void c(int i10, int i11) {
        if (i10 <= i11) {
            return;
        }
        throw new IndexOutOfBoundsException("toIndex (" + i10 + ") is greater than size (" + i11 + ").");
    }

    public static final /* synthetic */ <T> T[] d(T[] tArr) {
        if (tArr != null) {
            return tArr;
        }
        kotlin.jvm.internal.f0.y(0, "T?");
        return (T[]) new Object[0];
    }

    @sh.f
    private static final String e(byte[] bArr, Charset charset) {
        kotlin.jvm.internal.f0.p(bArr, "<this>");
        kotlin.jvm.internal.f0.p(charset, "charset");
        return new String(bArr, charset);
    }

    public static final /* synthetic */ <T> T[] f(Collection<? extends T> collection) {
        kotlin.jvm.internal.f0.p(collection, "<this>");
        kotlin.jvm.internal.f0.y(0, "T?");
        return (T[]) collection.toArray(new Object[0]);
    }
}
