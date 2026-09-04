package nh;

import com.meituan.robust.Constants;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: ListBuilder.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class b {
    @dl.d
    public static final <E> E[] d(int i10) {
        if (i10 >= 0) {
            return (E[]) new Object[i10];
        }
        throw new IllegalArgumentException("capacity must be non-negative.".toString());
    }

    @dl.d
    public static final <T> T[] e(@dl.d T[] tArr, int i10) {
        f0.p(tArr, "<this>");
        T[] tArr2 = (T[]) Arrays.copyOf(tArr, i10);
        f0.o(tArr2, "copyOf(this, newSize)");
        return tArr2;
    }

    public static final <E> void f(@dl.d E[] eArr, int i10) {
        f0.p(eArr, "<this>");
        eArr[i10] = null;
    }

    public static final <E> void g(@dl.d E[] eArr, int i10, int i11) {
        f0.p(eArr, "<this>");
        while (i10 < i11) {
            f(eArr, i10);
            i10++;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> boolean h(T[] tArr, int i10, int i11, List<?> list) {
        if (i11 != list.size()) {
            return false;
        }
        for (int i12 = 0; i12 < i11; i12++) {
            if (!f0.g(tArr[i10 + i12], list.get(i12))) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> int i(T[] tArr, int i10, int i11) {
        int iHashCode = 1;
        for (int i12 = 0; i12 < i11; i12++) {
            T t10 = tArr[i10 + i12];
            iHashCode = (iHashCode * 31) + (t10 != null ? t10.hashCode() : 0);
        }
        return iHashCode;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> String j(T[] tArr, int i10, int i11) {
        StringBuilder sb2 = new StringBuilder((i11 * 3) + 2);
        sb2.append(Constants.ARRAY_TYPE);
        for (int i12 = 0; i12 < i11; i12++) {
            if (i12 > 0) {
                sb2.append(", ");
            }
            sb2.append(tArr[i10 + i12]);
        }
        sb2.append("]");
        String string = sb2.toString();
        f0.o(string, "sb.toString()");
        return string;
    }
}
