package com.google.common.primitives;

import com.google.common.base.w;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.RandomAccess;
import javax.annotation.CheckForNull;
import kotlin.jvm.internal.p;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: loaded from: classes7.dex */
@b
@o9.b(emulated = true)
public final class Chars {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f59013a = 2;

    @o9.b
    public static class CharArrayAsList extends AbstractList<Character> implements RandomAccess, Serializable {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final char[] f59014b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final int f59015c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final int f59016d;

        CharArrayAsList(char[] cArr) {
            this(cArr, 0, cArr.length);
        }

        CharArrayAsList(char[] cArr, int i10, int i11) {
            this.f59014b = cArr;
            this.f59015c = i10;
            this.f59016d = i11;
        }

        @Override // java.util.AbstractList, java.util.List
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Character get(int i10) {
            w.C(i10, size());
            return Character.valueOf(this.f59014b[this.f59015c + i10]);
        }

        @Override // java.util.AbstractList, java.util.List
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Character set(int i10, Character ch2) {
            w.C(i10, size());
            char[] cArr = this.f59014b;
            int i11 = this.f59015c;
            char c10 = cArr[i11 + i10];
            cArr[i11 + i10] = ((Character) w.E(ch2)).charValue();
            return Character.valueOf(c10);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(@CheckForNull Object obj) {
            return (obj instanceof Character) && Chars.n(this.f59014b, ((Character) obj).charValue(), this.f59015c, this.f59016d) != -1;
        }

        char[] e() {
            return Arrays.copyOfRange(this.f59014b, this.f59015c, this.f59016d);
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public boolean equals(@CheckForNull Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof CharArrayAsList)) {
                return super.equals(obj);
            }
            CharArrayAsList charArrayAsList = (CharArrayAsList) obj;
            int size = size();
            if (charArrayAsList.size() != size) {
                return false;
            }
            for (int i10 = 0; i10 < size; i10++) {
                if (this.f59014b[this.f59015c + i10] != charArrayAsList.f59014b[charArrayAsList.f59015c + i10]) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public int hashCode() {
            int iL = 1;
            for (int i10 = this.f59015c; i10 < this.f59016d; i10++) {
                iL = (iL * 31) + Chars.l(this.f59014b[i10]);
            }
            return iL;
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(@CheckForNull Object obj) {
            int iN;
            if (!(obj instanceof Character) || (iN = Chars.n(this.f59014b, ((Character) obj).charValue(), this.f59015c, this.f59016d)) < 0) {
                return -1;
            }
            return iN - this.f59015c;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
            return false;
        }

        @Override // java.util.AbstractList, java.util.List
        public int lastIndexOf(@CheckForNull Object obj) {
            int iR;
            if (!(obj instanceof Character) || (iR = Chars.r(this.f59014b, ((Character) obj).charValue(), this.f59015c, this.f59016d)) < 0) {
                return -1;
            }
            return iR - this.f59015c;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f59016d - this.f59015c;
        }

        @Override // java.util.AbstractList, java.util.List
        public List<Character> subList(int i10, int i11) {
            w.f0(i10, i11, size());
            if (i10 == i11) {
                return Collections.emptyList();
            }
            char[] cArr = this.f59014b;
            int i12 = this.f59015c;
            return new CharArrayAsList(cArr, i10 + i12, i12 + i11);
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            StringBuilder sb2 = new StringBuilder(size() * 3);
            sb2.append('[');
            sb2.append(this.f59014b[this.f59015c]);
            int i10 = this.f59015c;
            while (true) {
                i10++;
                if (i10 >= this.f59016d) {
                    sb2.append(']');
                    return sb2.toString();
                }
                sb2.append(", ");
                sb2.append(this.f59014b[i10]);
            }
        }
    }

    public enum LexicographicalComparator implements Comparator<char[]> {
        INSTANCE;

        @Override // java.util.Comparator
        public int compare(char[] cArr, char[] cArr2) {
            int iMin = Math.min(cArr.length, cArr2.length);
            for (int i10 = 0; i10 < iMin; i10++) {
                int iE = Chars.e(cArr[i10], cArr2[i10]);
                if (iE != 0) {
                    return iE;
                }
            }
            return cArr.length - cArr2.length;
        }

        @Override // java.lang.Enum
        public String toString() {
            return "Chars.lexicographicalComparator()";
        }
    }

    private Chars() {
    }

    public static char[] A(Collection<Character> collection) {
        if (collection instanceof CharArrayAsList) {
            return ((CharArrayAsList) collection).e();
        }
        Object[] array = collection.toArray();
        int length = array.length;
        char[] cArr = new char[length];
        for (int i10 = 0; i10 < length; i10++) {
            cArr[i10] = ((Character) w.E(array[i10])).charValue();
        }
        return cArr;
    }

    @o9.c
    public static byte[] B(char c10) {
        return new byte[]{(byte) (c10 >> '\b'), (byte) c10};
    }

    public static List<Character> c(char... cArr) {
        return cArr.length == 0 ? Collections.emptyList() : new CharArrayAsList(cArr);
    }

    public static char d(long j10) {
        char c10 = (char) j10;
        w.p(((long) c10) == j10, "Out of range: %s", j10);
        return c10;
    }

    public static int e(char c10, char c11) {
        return c10 - c11;
    }

    public static char[] f(char[]... cArr) {
        int length = 0;
        for (char[] cArr2 : cArr) {
            length += cArr2.length;
        }
        char[] cArr3 = new char[length];
        int length2 = 0;
        for (char[] cArr4 : cArr) {
            System.arraycopy(cArr4, 0, cArr3, length2, cArr4.length);
            length2 += cArr4.length;
        }
        return cArr3;
    }

    @o9.a
    public static char g(char c10, char c11, char c12) {
        w.g(c11 <= c12, "min (%s) must be less than or equal to max (%s)", c11, c12);
        if (c10 < c11) {
            return c11;
        }
        return c10 < c12 ? c10 : c12;
    }

    public static boolean h(char[] cArr, char c10) {
        for (char c11 : cArr) {
            if (c11 == c10) {
                return true;
            }
        }
        return false;
    }

    public static char[] i(char[] cArr, int i10, int i11) {
        w.k(i10 >= 0, "Invalid minLength: %s", i10);
        w.k(i11 >= 0, "Invalid padding: %s", i11);
        return cArr.length < i10 ? Arrays.copyOf(cArr, i10 + i11) : cArr;
    }

    @o9.c
    public static char j(byte[] bArr) {
        w.m(bArr.length >= 2, "array too small: %s < %s", bArr.length, 2);
        return k(bArr[0], bArr[1]);
    }

    @o9.c
    public static char k(byte b10, byte b11) {
        return (char) ((b10 << 8) | (b11 & 255));
    }

    public static int l(char c10) {
        return c10;
    }

    public static int m(char[] cArr, char c10) {
        return n(cArr, c10, 0, cArr.length);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int n(char[] cArr, char c10, int i10, int i11) {
        while (i10 < i11) {
            if (cArr[i10] == c10) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public static int o(char[] cArr, char[] cArr2) {
        w.F(cArr, "array");
        w.F(cArr2, "target");
        if (cArr2.length == 0) {
            return 0;
        }
        for (int i10 = 0; i10 < (cArr.length - cArr2.length) + 1; i10++) {
            for (int i11 = 0; i11 < cArr2.length; i11++) {
                if (cArr[i10 + i11] != cArr2[i11]) {
                }
            }
            return i10;
        }
        return -1;
    }

    public static String p(String str, char... cArr) {
        w.E(str);
        int length = cArr.length;
        if (length == 0) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder((str.length() * (length - 1)) + length);
        sb2.append(cArr[0]);
        for (int i10 = 1; i10 < length; i10++) {
            sb2.append(str);
            sb2.append(cArr[i10]);
        }
        return sb2.toString();
    }

    public static int q(char[] cArr, char c10) {
        return r(cArr, c10, 0, cArr.length);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int r(char[] cArr, char c10, int i10, int i11) {
        for (int i12 = i11 - 1; i12 >= i10; i12--) {
            if (cArr[i12] == c10) {
                return i12;
            }
        }
        return -1;
    }

    public static Comparator<char[]> s() {
        return LexicographicalComparator.INSTANCE;
    }

    public static char t(char... cArr) {
        w.d(cArr.length > 0);
        char c10 = cArr[0];
        for (int i10 = 1; i10 < cArr.length; i10++) {
            char c11 = cArr[i10];
            if (c11 > c10) {
                c10 = c11;
            }
        }
        return c10;
    }

    public static char u(char... cArr) {
        w.d(cArr.length > 0);
        char c10 = cArr[0];
        for (int i10 = 1; i10 < cArr.length; i10++) {
            char c11 = cArr[i10];
            if (c11 < c10) {
                c10 = c11;
            }
        }
        return c10;
    }

    public static void v(char[] cArr) {
        w.E(cArr);
        w(cArr, 0, cArr.length);
    }

    public static void w(char[] cArr, int i10, int i11) {
        w.E(cArr);
        w.f0(i10, i11, cArr.length);
        for (int i12 = i11 - 1; i10 < i12; i12--) {
            char c10 = cArr[i10];
            cArr[i10] = cArr[i12];
            cArr[i12] = c10;
            i10++;
        }
    }

    public static char x(long j10) {
        if (j10 > WebSocketProtocol.PAYLOAD_SHORT_MAX) {
            return p.f124952c;
        }
        if (j10 < 0) {
            return (char) 0;
        }
        return (char) j10;
    }

    public static void y(char[] cArr) {
        w.E(cArr);
        z(cArr, 0, cArr.length);
    }

    public static void z(char[] cArr, int i10, int i11) {
        w.E(cArr);
        w.f0(i10, i11, cArr.length);
        Arrays.sort(cArr, i10, i11);
        w(cArr, i10, i11);
    }
}
