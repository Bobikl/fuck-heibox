package com.umeng.analytics.pro;

import java.nio.ByteBuffer;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

/* JADX INFO: compiled from: TBaseHelper.java */
/* JADX INFO: loaded from: classes4.dex */
public final class au {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Comparator f104547a = new a();

    /* JADX INFO: compiled from: TBaseHelper.java */
    public static class a implements Comparator {
        private a() {
        }

        @Override // java.util.Comparator
        public int compare(Object obj, Object obj2) {
            if (obj == null && obj2 == null) {
                return 0;
            }
            if (obj == null) {
                return -1;
            }
            if (obj2 == null) {
                return 1;
            }
            if (obj instanceof List) {
                return au.a((List) obj, (List) obj2);
            }
            if (obj instanceof Set) {
                return au.a((Set) obj, (Set) obj2);
            }
            if (obj instanceof Map) {
                return au.a((Map) obj, (Map) obj2);
            }
            return obj instanceof byte[] ? au.a((byte[]) obj, (byte[]) obj2) : au.a((Comparable) obj, (Comparable) obj2);
        }
    }

    private au() {
    }

    public static int a(byte b10, byte b11) {
        if (b10 < b11) {
            return -1;
        }
        return b11 < b10 ? 1 : 0;
    }

    public static int a(double d10, double d11) {
        if (d10 < d11) {
            return -1;
        }
        return d11 < d10 ? 1 : 0;
    }

    public static int a(int i10, int i11) {
        if (i10 < i11) {
            return -1;
        }
        return i11 < i10 ? 1 : 0;
    }

    public static int a(long j10, long j11) {
        if (j10 < j11) {
            return -1;
        }
        return j11 < j10 ? 1 : 0;
    }

    public static int a(Comparable comparable, Comparable comparable2) {
        return comparable.compareTo(comparable2);
    }

    public static int a(Object obj, Object obj2) {
        if (obj instanceof Comparable) {
            return a((Comparable) obj, (Comparable) obj2);
        }
        if (obj instanceof List) {
            return a((List) obj, (List) obj2);
        }
        if (obj instanceof Set) {
            return a((Set) obj, (Set) obj2);
        }
        if (obj instanceof Map) {
            return a((Map) obj, (Map) obj2);
        }
        if (obj instanceof byte[]) {
            return a((byte[]) obj, (byte[]) obj2);
        }
        throw new IllegalArgumentException("Cannot compare objects of type " + obj.getClass());
    }

    public static int a(String str, String str2) {
        return str.compareTo(str2);
    }

    public static int a(ByteBuffer byteBuffer, byte[] bArr, int i10) {
        int iRemaining = byteBuffer.remaining();
        System.arraycopy(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), bArr, i10, iRemaining);
        return iRemaining;
    }

    public static int a(List list, List list2) {
        int iA = a(list.size(), list2.size());
        if (iA != 0) {
            return iA;
        }
        for (int i10 = 0; i10 < list.size(); i10++) {
            int iCompare = f104547a.compare(list.get(i10), list2.get(i10));
            if (iCompare != 0) {
                return iCompare;
            }
        }
        return 0;
    }

    public static int a(Map map, Map map2) {
        int iA = a(map.size(), map2.size());
        if (iA != 0) {
            return iA;
        }
        Comparator comparator = f104547a;
        TreeMap treeMap = new TreeMap(comparator);
        treeMap.putAll(map);
        Iterator it = treeMap.entrySet().iterator();
        TreeMap treeMap2 = new TreeMap(comparator);
        treeMap2.putAll(map2);
        Iterator it2 = treeMap2.entrySet().iterator();
        while (it.hasNext() && it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Map.Entry entry2 = (Map.Entry) it2.next();
            Comparator comparator2 = f104547a;
            int iCompare = comparator2.compare(entry.getKey(), entry2.getKey());
            if (iCompare != 0) {
                return iCompare;
            }
            int iCompare2 = comparator2.compare(entry.getValue(), entry2.getValue());
            if (iCompare2 != 0) {
                return iCompare2;
            }
        }
        return 0;
    }

    public static int a(Set set, Set set2) {
        int iA = a(set.size(), set2.size());
        if (iA != 0) {
            return iA;
        }
        Comparator comparator = f104547a;
        TreeSet treeSet = new TreeSet(comparator);
        treeSet.addAll(set);
        TreeSet treeSet2 = new TreeSet(comparator);
        treeSet2.addAll(set2);
        Iterator it = treeSet.iterator();
        Iterator it2 = treeSet2.iterator();
        while (it.hasNext() && it2.hasNext()) {
            int iCompare = f104547a.compare(it.next(), it2.next());
            if (iCompare != 0) {
                return iCompare;
            }
        }
        return 0;
    }

    public static int a(short s10, short s11) {
        if (s10 < s11) {
            return -1;
        }
        return s11 < s10 ? 1 : 0;
    }

    public static int a(boolean z10, boolean z11) {
        return Boolean.valueOf(z10).compareTo(Boolean.valueOf(z11));
    }

    public static int a(byte[] bArr, byte[] bArr2) {
        int iA = a(bArr.length, bArr2.length);
        if (iA != 0) {
            return iA;
        }
        for (int i10 = 0; i10 < bArr.length; i10++) {
            int iA2 = a(bArr[i10], bArr2[i10]);
            if (iA2 != 0) {
                return iA2;
            }
        }
        return 0;
    }

    public static String a(byte b10) {
        return Integer.toHexString((b10 | 256) & 511).toUpperCase().substring(1);
    }

    public static void a(ByteBuffer byteBuffer, StringBuilder sb2) {
        byte[] bArrArray = byteBuffer.array();
        int iArrayOffset = byteBuffer.arrayOffset();
        int iPosition = byteBuffer.position() + iArrayOffset;
        int iLimit = iArrayOffset + byteBuffer.limit();
        int i10 = iLimit - iPosition > 128 ? iPosition + 128 : iLimit;
        for (int i11 = iPosition; i11 < i10; i11++) {
            if (i11 > iPosition) {
                sb2.append(" ");
            }
            sb2.append(a(bArrArray[i11]));
        }
        if (iLimit != i10) {
            sb2.append("...");
        }
    }

    public static byte[] a(ByteBuffer byteBuffer) {
        if (b(byteBuffer)) {
            return byteBuffer.array();
        }
        byte[] bArr = new byte[byteBuffer.remaining()];
        a(byteBuffer, bArr, 0);
        return bArr;
    }

    public static byte[] a(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    public static boolean b(ByteBuffer byteBuffer) {
        return byteBuffer.hasArray() && byteBuffer.position() == 0 && byteBuffer.arrayOffset() == 0 && byteBuffer.remaining() == byteBuffer.capacity();
    }

    public static ByteBuffer c(ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            return null;
        }
        return b(byteBuffer) ? byteBuffer : ByteBuffer.wrap(a(byteBuffer));
    }

    public static ByteBuffer d(ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            return null;
        }
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[byteBuffer.remaining()]);
        if (byteBuffer.hasArray()) {
            System.arraycopy(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBufferWrap.array(), 0, byteBuffer.remaining());
        } else {
            byteBuffer.slice().get(byteBufferWrap.array());
        }
        return byteBufferWrap;
    }
}
