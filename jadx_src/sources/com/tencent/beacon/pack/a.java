package com.tencent.beacon.pack;

import java.io.UnsupportedEncodingException;
import java.lang.reflect.Array;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: JceInputStream.java */
/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected String f99252a = "GBK";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ByteBuffer f99253b;

    /* JADX INFO: renamed from: com.tencent.beacon.pack.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: JceInputStream.java */
    public static class C0953a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public byte f99254a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f99255b;
    }

    public a() {
    }

    public a(byte[] bArr) {
        this.f99253b = ByteBuffer.wrap(bArr);
    }

    public a(byte[] bArr, int i10) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        this.f99253b = byteBufferWrap;
        byteBufferWrap.position(i10);
    }

    public static int a(C0953a c0953a, ByteBuffer byteBuffer) {
        byte b10 = byteBuffer.get();
        c0953a.f99254a = (byte) (b10 & 15);
        int i10 = (b10 & 240) >> 4;
        c0953a.f99255b = i10;
        if (i10 != 15) {
            return 1;
        }
        c0953a.f99255b = byteBuffer.get() & 255;
        return 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private <K, V> Map<K, V> a(Map<K, V> map, Map<K, V> map2, int i10, boolean z10) {
        if (map2 == null || map2.isEmpty()) {
            return new HashMap();
        }
        Map.Entry<K, V> next = map2.entrySet().iterator().next();
        K key = next.getKey();
        V value = next.getValue();
        if (a(i10)) {
            C0953a c0953a = new C0953a();
            a(c0953a);
            if (c0953a.f99254a != 8) {
                throw new RuntimeException("type mismatch.");
            }
            int iA = a(0, 0, true);
            if (iA < 0) {
                throw new RuntimeException("size invalid: " + iA);
            }
            for (int i11 = 0; i11 < iA; i11++) {
                map.put(a(key, 0, true), a(value, 1, true));
            }
        } else if (z10) {
            throw new RuntimeException("require field not exist.");
        }
        return map;
    }

    private void a(byte b10) {
        int i10 = 0;
        switch (b10) {
            case 0:
                b(1);
                return;
            case 1:
                b(2);
                return;
            case 2:
                b(4);
                return;
            case 3:
                b(8);
                return;
            case 4:
                b(4);
                return;
            case 5:
                b(8);
                return;
            case 6:
                int i11 = this.f99253b.get();
                if (i11 < 0) {
                    i11 += 256;
                }
                b(i11);
                return;
            case 7:
                b(this.f99253b.getInt());
                return;
            case 8:
                int iA = a(0, 0, true);
                while (i10 < iA * 2) {
                    b();
                    i10++;
                }
                return;
            case 9:
                int iA2 = a(0, 0, true);
                while (i10 < iA2) {
                    b();
                    i10++;
                }
                return;
            case 10:
                a();
                return;
            case 11:
            case 12:
                return;
            case 13:
                C0953a c0953a = new C0953a();
                a(c0953a);
                if (c0953a.f99254a == 0) {
                    b(a(0, 0, true));
                    return;
                }
                throw new RuntimeException("skipField with invalid type, type value: " + ((int) b10) + ", " + ((int) c0953a.f99254a));
            default:
                throw new RuntimeException("invalid type.");
        }
    }

    private int b(C0953a c0953a) {
        return a(c0953a, this.f99253b.duplicate());
    }

    private void b() {
        C0953a c0953a = new C0953a();
        a(c0953a);
        a(c0953a.f99254a);
    }

    private void b(int i10) {
        ByteBuffer byteBuffer = this.f99253b;
        byteBuffer.position(byteBuffer.position() + i10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private <T> T[] b(T t10, int i10, boolean z10) {
        if (!a(i10)) {
            if (z10) {
                throw new RuntimeException("require field not exist.");
            }
            return null;
        }
        C0953a c0953a = new C0953a();
        a(c0953a);
        if (c0953a.f99254a != 9) {
            throw new RuntimeException("type mismatch.");
        }
        int iA = a(0, 0, true);
        if (iA < 0) {
            throw new RuntimeException("size invalid: " + iA);
        }
        T[] tArr = (T[]) ((Object[]) Array.newInstance(t10.getClass(), iA));
        for (int i11 = 0; i11 < iA; i11++) {
            tArr[i11] = a((Object) t10, 0, true);
        }
        return tArr;
    }

    public byte a(byte b10, int i10, boolean z10) {
        if (!a(i10)) {
            if (z10) {
                throw new RuntimeException("require field not exist.");
            }
            return b10;
        }
        C0953a c0953a = new C0953a();
        a(c0953a);
        byte b11 = c0953a.f99254a;
        if (b11 == 0) {
            return this.f99253b.get();
        }
        if (b11 == 12) {
            return (byte) 0;
        }
        throw new RuntimeException("type mismatch.");
    }

    public double a(double d10, int i10, boolean z10) {
        if (!a(i10)) {
            if (z10) {
                throw new RuntimeException("require field not exist.");
            }
            return d10;
        }
        C0953a c0953a = new C0953a();
        a(c0953a);
        byte b10 = c0953a.f99254a;
        if (b10 == 4) {
            return this.f99253b.getFloat();
        }
        if (b10 == 5) {
            return this.f99253b.getDouble();
        }
        if (b10 == 12) {
            return 0.0d;
        }
        throw new RuntimeException("type mismatch.");
    }

    public float a(float f10, int i10, boolean z10) {
        if (!a(i10)) {
            if (z10) {
                throw new RuntimeException("require field not exist.");
            }
            return f10;
        }
        C0953a c0953a = new C0953a();
        a(c0953a);
        byte b10 = c0953a.f99254a;
        if (b10 == 4) {
            return this.f99253b.getFloat();
        }
        if (b10 == 12) {
            return 0.0f;
        }
        throw new RuntimeException("type mismatch.");
    }

    public int a(int i10, int i11, boolean z10) {
        if (!a(i11)) {
            if (z10) {
                throw new RuntimeException("require field not exist.");
            }
            return i10;
        }
        C0953a c0953a = new C0953a();
        a(c0953a);
        byte b10 = c0953a.f99254a;
        if (b10 == 0) {
            return this.f99253b.get();
        }
        if (b10 == 1) {
            return this.f99253b.getShort();
        }
        if (b10 == 2) {
            return this.f99253b.getInt();
        }
        if (b10 == 12) {
            return 0;
        }
        throw new RuntimeException("type mismatch.");
    }

    public int a(String str) {
        this.f99252a = str;
        return 0;
    }

    public long a(long j10, int i10, boolean z10) {
        int i11;
        if (!a(i10)) {
            if (z10) {
                throw new RuntimeException("require field not exist.");
            }
            return j10;
        }
        C0953a c0953a = new C0953a();
        a(c0953a);
        byte b10 = c0953a.f99254a;
        if (b10 == 12) {
            return 0L;
        }
        if (b10 == 0) {
            i11 = this.f99253b.get();
        } else if (b10 == 1) {
            i11 = this.f99253b.getShort();
        } else {
            if (b10 != 2) {
                if (b10 == 3) {
                    return this.f99253b.getLong();
                }
                throw new RuntimeException("type mismatch.");
            }
            i11 = this.f99253b.getInt();
        }
        return i11;
    }

    public AbstractJceStruct a(AbstractJceStruct abstractJceStruct, int i10, boolean z10) {
        if (!a(i10)) {
            if (z10) {
                throw new RuntimeException("require field not exist.");
            }
            return null;
        }
        try {
            AbstractJceStruct abstractJceStruct2 = (AbstractJceStruct) abstractJceStruct.getClass().newInstance();
            C0953a c0953a = new C0953a();
            a(c0953a);
            if (c0953a.f99254a != 10) {
                throw new RuntimeException("type mismatch.");
            }
            abstractJceStruct2.readFrom(this);
            a();
            return abstractJceStruct2;
        } catch (Exception e10) {
            throw new RuntimeException(e10.getMessage());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T> Object a(T t10, int i10, boolean z10) {
        if (t10 instanceof Byte) {
            return Byte.valueOf(a((byte) 0, i10, z10));
        }
        if (t10 instanceof Boolean) {
            return Boolean.valueOf(a(false, i10, z10));
        }
        if (t10 instanceof Short) {
            return Short.valueOf(a((short) 0, i10, z10));
        }
        if (t10 instanceof Integer) {
            return Integer.valueOf(a(0, i10, z10));
        }
        if (t10 instanceof Long) {
            return Long.valueOf(a(0L, i10, z10));
        }
        if (t10 instanceof Float) {
            return Float.valueOf(a(0.0f, i10, z10));
        }
        if (t10 instanceof Double) {
            return Double.valueOf(a(0.0d, i10, z10));
        }
        if (t10 instanceof String) {
            return a(i10, z10);
        }
        if (t10 instanceof Map) {
            return a((Map) t10, i10, z10);
        }
        if (t10 instanceof List) {
            return a((List) t10, i10, z10);
        }
        if (t10 instanceof AbstractJceStruct) {
            return a((AbstractJceStruct) t10, i10, z10);
        }
        if (!t10.getClass().isArray()) {
            throw new RuntimeException("read object error: unsupport type.");
        }
        if ((t10 instanceof byte[]) || (t10 instanceof Byte[])) {
            return a((byte[]) null, i10, z10);
        }
        if (t10 instanceof boolean[]) {
            return a((boolean[]) null, i10, z10);
        }
        if (t10 instanceof short[]) {
            return a((short[]) null, i10, z10);
        }
        if (t10 instanceof int[]) {
            return a((int[]) null, i10, z10);
        }
        if (t10 instanceof long[]) {
            return a((long[]) null, i10, z10);
        }
        if (t10 instanceof float[]) {
            return a((float[]) null, i10, z10);
        }
        return t10 instanceof double[] ? a((double[]) null, i10, z10) : a((Object[]) t10, i10, z10);
    }

    public String a(int i10, boolean z10) {
        if (!a(i10)) {
            if (z10) {
                throw new RuntimeException("require field not exist.");
            }
            return null;
        }
        C0953a c0953a = new C0953a();
        a(c0953a);
        byte b10 = c0953a.f99254a;
        if (b10 == 6) {
            int i11 = this.f99253b.get();
            if (i11 < 0) {
                i11 += 256;
            }
            byte[] bArr = new byte[i11];
            this.f99253b.get(bArr);
            try {
                return new String(bArr, this.f99252a);
            } catch (UnsupportedEncodingException unused) {
                return new String(bArr, Charset.forName("UTF-8"));
            }
        }
        if (b10 != 7) {
            throw new RuntimeException("type mismatch.");
        }
        int i12 = this.f99253b.getInt();
        if (i12 > 104857600 || i12 < 0 || i12 > this.f99253b.capacity()) {
            throw new RuntimeException("String too long: " + i12);
        }
        byte[] bArr2 = new byte[i12];
        this.f99253b.get(bArr2);
        try {
            return new String(bArr2, this.f99252a);
        } catch (UnsupportedEncodingException unused2) {
            return new String(bArr2, Charset.forName("UTF-8"));
        }
    }

    public <K, V> HashMap<K, V> a(Map<K, V> map, int i10, boolean z10) {
        return (HashMap) a(new HashMap(), map, i10, z10);
    }

    public <T> List<T> a(List<T> list, int i10, boolean z10) {
        if (list == null || list.isEmpty()) {
            return new ArrayList();
        }
        Object[] objArrB = b(list.get(0), i10, z10);
        if (objArrB == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : objArrB) {
            arrayList.add(obj);
        }
        return arrayList;
    }

    public short a(short s10, int i10, boolean z10) {
        if (!a(i10)) {
            if (z10) {
                throw new RuntimeException("require field not exist.");
            }
            return s10;
        }
        C0953a c0953a = new C0953a();
        a(c0953a);
        byte b10 = c0953a.f99254a;
        if (b10 == 0) {
            return this.f99253b.get();
        }
        if (b10 == 1) {
            return this.f99253b.getShort();
        }
        if (b10 == 12) {
            return (short) 0;
        }
        throw new RuntimeException("type mismatch.");
    }

    public void a() {
        C0953a c0953a = new C0953a();
        do {
            a(c0953a);
            a(c0953a.f99254a);
        } while (c0953a.f99254a != 11);
    }

    public void a(C0953a c0953a) {
        a(c0953a, this.f99253b);
    }

    public void a(byte[] bArr) {
        this.f99253b = ByteBuffer.wrap(bArr);
    }

    public boolean a(int i10) {
        try {
            C0953a c0953a = new C0953a();
            while (true) {
                int iB = b(c0953a);
                if (c0953a.f99254a == 11) {
                    return false;
                }
                int i11 = c0953a.f99255b;
                if (i10 <= i11) {
                    return i10 == i11;
                }
                b(iB);
                a(c0953a.f99254a);
            }
        } catch (BufferUnderflowException e10) {
            com.tencent.beacon.base.util.c.a(e10);
            return false;
        } catch (RuntimeException e11) {
            com.tencent.beacon.base.util.c.a(e11);
            return false;
        }
    }

    public boolean a(boolean z10, int i10, boolean z11) {
        return a((byte) 0, i10, z11) != 0;
    }

    public byte[] a(byte[] bArr, int i10, boolean z10) {
        if (!a(i10)) {
            if (z10) {
                throw new RuntimeException("require field not exist.");
            }
            return null;
        }
        C0953a c0953a = new C0953a();
        a(c0953a);
        byte b10 = c0953a.f99254a;
        if (b10 == 9) {
            int iA = a(0, 0, true);
            if (iA < 0 || iA > this.f99253b.capacity()) {
                throw new RuntimeException("size invalid: " + iA);
            }
            byte[] bArr2 = new byte[iA];
            for (int i11 = 0; i11 < iA; i11++) {
                bArr2[i11] = a(bArr2[0], 0, true);
            }
            return bArr2;
        }
        if (b10 != 13) {
            throw new RuntimeException("type mismatch.");
        }
        C0953a c0953a2 = new C0953a();
        a(c0953a2);
        if (c0953a2.f99254a != 0) {
            throw new RuntimeException("type mismatch, tag: " + i10 + ", type: " + ((int) c0953a.f99254a) + ", " + ((int) c0953a2.f99254a));
        }
        int iA2 = a(0, 0, true);
        if (iA2 >= 0 && iA2 <= this.f99253b.capacity()) {
            byte[] bArr3 = new byte[iA2];
            this.f99253b.get(bArr3);
            return bArr3;
        }
        throw new RuntimeException("invalid size, tag: " + i10 + ", type: " + ((int) c0953a.f99254a) + ", " + ((int) c0953a2.f99254a) + ", size: " + iA2);
    }

    public double[] a(double[] dArr, int i10, boolean z10) {
        if (!a(i10)) {
            if (z10) {
                throw new RuntimeException("require field not exist.");
            }
            return null;
        }
        C0953a c0953a = new C0953a();
        a(c0953a);
        if (c0953a.f99254a != 9) {
            throw new RuntimeException("type mismatch.");
        }
        int iA = a(0, 0, true);
        if (iA < 0) {
            throw new RuntimeException("size invalid: " + iA);
        }
        double[] dArr2 = new double[iA];
        for (int i11 = 0; i11 < iA; i11++) {
            dArr2[i11] = a(dArr2[0], 0, true);
        }
        return dArr2;
    }

    public float[] a(float[] fArr, int i10, boolean z10) {
        if (!a(i10)) {
            if (z10) {
                throw new RuntimeException("require field not exist.");
            }
            return null;
        }
        C0953a c0953a = new C0953a();
        a(c0953a);
        if (c0953a.f99254a != 9) {
            throw new RuntimeException("type mismatch.");
        }
        int iA = a(0, 0, true);
        if (iA < 0) {
            throw new RuntimeException("size invalid: " + iA);
        }
        float[] fArr2 = new float[iA];
        for (int i11 = 0; i11 < iA; i11++) {
            fArr2[i11] = a(fArr2[0], 0, true);
        }
        return fArr2;
    }

    public int[] a(int[] iArr, int i10, boolean z10) {
        if (!a(i10)) {
            if (z10) {
                throw new RuntimeException("require field not exist.");
            }
            return null;
        }
        C0953a c0953a = new C0953a();
        a(c0953a);
        if (c0953a.f99254a != 9) {
            throw new RuntimeException("type mismatch.");
        }
        int iA = a(0, 0, true);
        if (iA < 0) {
            throw new RuntimeException("size invalid: " + iA);
        }
        int[] iArr2 = new int[iA];
        for (int i11 = 0; i11 < iA; i11++) {
            iArr2[i11] = a(iArr2[0], 0, true);
        }
        return iArr2;
    }

    public long[] a(long[] jArr, int i10, boolean z10) {
        if (!a(i10)) {
            if (z10) {
                throw new RuntimeException("require field not exist.");
            }
            return null;
        }
        C0953a c0953a = new C0953a();
        a(c0953a);
        if (c0953a.f99254a != 9) {
            throw new RuntimeException("type mismatch.");
        }
        int iA = a(0, 0, true);
        if (iA < 0) {
            throw new RuntimeException("size invalid: " + iA);
        }
        long[] jArr2 = new long[iA];
        for (int i11 = 0; i11 < iA; i11++) {
            jArr2[i11] = a(jArr2[0], 0, true);
        }
        return jArr2;
    }

    public <T> T[] a(T[] tArr, int i10, boolean z10) {
        if (tArr == null || tArr.length == 0) {
            throw new RuntimeException("unable to get type of key and value.");
        }
        return (T[]) b(tArr[0], i10, z10);
    }

    public short[] a(short[] sArr, int i10, boolean z10) {
        if (!a(i10)) {
            if (z10) {
                throw new RuntimeException("require field not exist.");
            }
            return null;
        }
        C0953a c0953a = new C0953a();
        a(c0953a);
        if (c0953a.f99254a != 9) {
            throw new RuntimeException("type mismatch.");
        }
        int iA = a(0, 0, true);
        if (iA < 0) {
            throw new RuntimeException("size invalid: " + iA);
        }
        short[] sArr2 = new short[iA];
        for (int i11 = 0; i11 < iA; i11++) {
            sArr2[i11] = a(sArr2[0], 0, true);
        }
        return sArr2;
    }

    public boolean[] a(boolean[] zArr, int i10, boolean z10) {
        if (!a(i10)) {
            if (z10) {
                throw new RuntimeException("require field not exist.");
            }
            return null;
        }
        C0953a c0953a = new C0953a();
        a(c0953a);
        if (c0953a.f99254a != 9) {
            throw new RuntimeException("type mismatch.");
        }
        int iA = a(0, 0, true);
        if (iA < 0) {
            throw new RuntimeException("size invalid: " + iA);
        }
        boolean[] zArr2 = new boolean[iA];
        for (int i11 = 0; i11 < iA; i11++) {
            zArr2[i11] = a(zArr2[0], 0, true);
        }
        return zArr2;
    }
}
