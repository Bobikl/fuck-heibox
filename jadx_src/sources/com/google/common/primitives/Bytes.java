package com.google.common.primitives;

import com.google.common.base.w;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes7.dex */
@b
@o9.b
public final class Bytes {

    @o9.b
    public static class ByteArrayAsList extends AbstractList<Byte> implements RandomAccess, Serializable {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final byte[] f59010b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final int f59011c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final int f59012d;

        ByteArrayAsList(byte[] bArr) {
            this(bArr, 0, bArr.length);
        }

        ByteArrayAsList(byte[] bArr, int i10, int i11) {
            this.f59010b = bArr;
            this.f59011c = i10;
            this.f59012d = i11;
        }

        @Override // java.util.AbstractList, java.util.List
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Byte get(int i10) {
            w.C(i10, size());
            return Byte.valueOf(this.f59010b[this.f59011c + i10]);
        }

        @Override // java.util.AbstractList, java.util.List
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Byte set(int i10, Byte b10) {
            w.C(i10, size());
            byte[] bArr = this.f59010b;
            int i11 = this.f59011c;
            byte b11 = bArr[i11 + i10];
            bArr[i11 + i10] = ((Byte) w.E(b10)).byteValue();
            return Byte.valueOf(b11);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(@CheckForNull Object obj) {
            return (obj instanceof Byte) && Bytes.i(this.f59010b, ((Byte) obj).byteValue(), this.f59011c, this.f59012d) != -1;
        }

        byte[] e() {
            return Arrays.copyOfRange(this.f59010b, this.f59011c, this.f59012d);
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public boolean equals(@CheckForNull Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ByteArrayAsList)) {
                return super.equals(obj);
            }
            ByteArrayAsList byteArrayAsList = (ByteArrayAsList) obj;
            int size = size();
            if (byteArrayAsList.size() != size) {
                return false;
            }
            for (int i10 = 0; i10 < size; i10++) {
                if (this.f59010b[this.f59011c + i10] != byteArrayAsList.f59010b[byteArrayAsList.f59011c + i10]) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public int hashCode() {
            int iG = 1;
            for (int i10 = this.f59011c; i10 < this.f59012d; i10++) {
                iG = (iG * 31) + Bytes.g(this.f59010b[i10]);
            }
            return iG;
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(@CheckForNull Object obj) {
            int i10;
            if (!(obj instanceof Byte) || (i10 = Bytes.i(this.f59010b, ((Byte) obj).byteValue(), this.f59011c, this.f59012d)) < 0) {
                return -1;
            }
            return i10 - this.f59011c;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
            return false;
        }

        @Override // java.util.AbstractList, java.util.List
        public int lastIndexOf(@CheckForNull Object obj) {
            int iL;
            if (!(obj instanceof Byte) || (iL = Bytes.l(this.f59010b, ((Byte) obj).byteValue(), this.f59011c, this.f59012d)) < 0) {
                return -1;
            }
            return iL - this.f59011c;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f59012d - this.f59011c;
        }

        @Override // java.util.AbstractList, java.util.List
        public List<Byte> subList(int i10, int i11) {
            w.f0(i10, i11, size());
            if (i10 == i11) {
                return Collections.emptyList();
            }
            byte[] bArr = this.f59010b;
            int i12 = this.f59011c;
            return new ByteArrayAsList(bArr, i10 + i12, i12 + i11);
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            StringBuilder sb2 = new StringBuilder(size() * 5);
            sb2.append('[');
            sb2.append((int) this.f59010b[this.f59011c]);
            int i10 = this.f59011c;
            while (true) {
                i10++;
                if (i10 >= this.f59012d) {
                    sb2.append(']');
                    return sb2.toString();
                }
                sb2.append(", ");
                sb2.append((int) this.f59010b[i10]);
            }
        }
    }

    private Bytes() {
    }

    public static List<Byte> c(byte... bArr) {
        return bArr.length == 0 ? Collections.emptyList() : new ByteArrayAsList(bArr);
    }

    public static byte[] d(byte[]... bArr) {
        int length = 0;
        for (byte[] bArr2 : bArr) {
            length += bArr2.length;
        }
        byte[] bArr3 = new byte[length];
        int length2 = 0;
        for (byte[] bArr4 : bArr) {
            System.arraycopy(bArr4, 0, bArr3, length2, bArr4.length);
            length2 += bArr4.length;
        }
        return bArr3;
    }

    public static boolean e(byte[] bArr, byte b10) {
        for (byte b11 : bArr) {
            if (b11 == b10) {
                return true;
            }
        }
        return false;
    }

    public static byte[] f(byte[] bArr, int i10, int i11) {
        w.k(i10 >= 0, "Invalid minLength: %s", i10);
        w.k(i11 >= 0, "Invalid padding: %s", i11);
        return bArr.length < i10 ? Arrays.copyOf(bArr, i10 + i11) : bArr;
    }

    public static int g(byte b10) {
        return b10;
    }

    public static int h(byte[] bArr, byte b10) {
        return i(bArr, b10, 0, bArr.length);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int i(byte[] bArr, byte b10, int i10, int i11) {
        while (i10 < i11) {
            if (bArr[i10] == b10) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public static int j(byte[] bArr, byte[] bArr2) {
        w.F(bArr, "array");
        w.F(bArr2, "target");
        if (bArr2.length == 0) {
            return 0;
        }
        for (int i10 = 0; i10 < (bArr.length - bArr2.length) + 1; i10++) {
            for (int i11 = 0; i11 < bArr2.length; i11++) {
                if (bArr[i10 + i11] != bArr2[i11]) {
                }
            }
            return i10;
        }
        return -1;
    }

    public static int k(byte[] bArr, byte b10) {
        return l(bArr, b10, 0, bArr.length);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int l(byte[] bArr, byte b10, int i10, int i11) {
        for (int i12 = i11 - 1; i12 >= i10; i12--) {
            if (bArr[i12] == b10) {
                return i12;
            }
        }
        return -1;
    }

    public static void m(byte[] bArr) {
        w.E(bArr);
        n(bArr, 0, bArr.length);
    }

    public static void n(byte[] bArr, int i10, int i11) {
        w.E(bArr);
        w.f0(i10, i11, bArr.length);
        for (int i12 = i11 - 1; i10 < i12; i12--) {
            byte b10 = bArr[i10];
            bArr[i10] = bArr[i12];
            bArr[i12] = b10;
            i10++;
        }
    }

    public static byte[] o(Collection<? extends Number> collection) {
        if (collection instanceof ByteArrayAsList) {
            return ((ByteArrayAsList) collection).e();
        }
        Object[] array = collection.toArray();
        int length = array.length;
        byte[] bArr = new byte[length];
        for (int i10 = 0; i10 < length; i10++) {
            bArr[i10] = ((Number) w.E(array[i10])).byteValue();
        }
        return bArr;
    }
}
