package com.tencent.beacon.pack;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: JceOutputStream.java */
/* JADX INFO: loaded from: classes4.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f99256a = new byte[0];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final char[] f99257b = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected String f99258c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ByteBuffer f99259d;

    public b() {
        this(128);
    }

    public b(int i10) {
        this.f99258c = "GBK";
        this.f99259d = ByteBuffer.allocate(i10);
    }

    private void a(Object[] objArr, int i10) {
        a(8);
        b((byte) 9, i10);
        a(objArr.length, 0);
        for (Object obj : objArr) {
            a(obj, 0);
        }
    }

    public int a(String str) {
        this.f99258c = str;
        return 0;
    }

    public ByteBuffer a() {
        return this.f99259d;
    }

    public void a(byte b10, int i10) {
        a(3);
        if (b10 == 0) {
            b((byte) 12, i10);
        } else {
            b((byte) 0, i10);
            this.f99259d.put(b10);
        }
    }

    public void a(double d10, int i10) {
        a(10);
        b((byte) 5, i10);
        this.f99259d.putDouble(d10);
    }

    public void a(float f10, int i10) {
        a(6);
        b((byte) 4, i10);
        this.f99259d.putFloat(f10);
    }

    public void a(int i10) {
        if (this.f99259d.remaining() < i10) {
            try {
                ByteBuffer byteBufferAllocate = ByteBuffer.allocate((this.f99259d.capacity() + i10) * 2);
                byteBufferAllocate.put(this.f99259d.array(), 0, this.f99259d.position());
                this.f99259d = byteBufferAllocate;
            } catch (IllegalArgumentException e10) {
                throw e10;
            }
        }
    }

    public void a(int i10, int i11) {
        a(6);
        if (i10 >= -32768 && i10 <= 32767) {
            a((short) i10, i11);
        } else {
            b((byte) 2, i11);
            this.f99259d.putInt(i10);
        }
    }

    public void a(long j10, int i10) {
        a(10);
        if (j10 >= -2147483648L && j10 <= 2147483647L) {
            a((int) j10, i10);
        } else {
            b((byte) 3, i10);
            this.f99259d.putLong(j10);
        }
    }

    public void a(AbstractJceStruct abstractJceStruct, int i10) {
        a(2);
        b((byte) 10, i10);
        abstractJceStruct.writeTo(this);
        a(2);
        b((byte) 11, 0);
    }

    public void a(Object obj, int i10) {
        if (obj == null) {
            obj = "";
        }
        if (obj instanceof Byte) {
            a(((Byte) obj).byteValue(), i10);
            return;
        }
        if (obj instanceof Boolean) {
            a(((Boolean) obj).booleanValue(), i10);
            return;
        }
        if (obj instanceof Short) {
            a(((Short) obj).shortValue(), i10);
            return;
        }
        if (obj instanceof Integer) {
            a(((Integer) obj).intValue(), i10);
            return;
        }
        if (obj instanceof Long) {
            a(((Long) obj).longValue(), i10);
            return;
        }
        if (obj instanceof Float) {
            a(((Float) obj).floatValue(), i10);
            return;
        }
        if (obj instanceof Double) {
            a(((Double) obj).doubleValue(), i10);
            return;
        }
        if (obj instanceof String) {
            a((String) obj, i10);
            return;
        }
        if (obj instanceof Map) {
            a((Map) obj, i10);
            return;
        }
        if (obj instanceof List) {
            a((Collection) obj, i10);
            return;
        }
        if (obj instanceof AbstractJceStruct) {
            a((AbstractJceStruct) obj, i10);
            return;
        }
        if (obj instanceof byte[]) {
            a((byte[]) obj, i10);
            return;
        }
        if (obj instanceof boolean[]) {
            a((boolean[]) obj, i10);
            return;
        }
        if (obj instanceof short[]) {
            a((short[]) obj, i10);
            return;
        }
        if (obj instanceof int[]) {
            a((int[]) obj, i10);
            return;
        }
        if (obj instanceof long[]) {
            a((long[]) obj, i10);
            return;
        }
        if (obj instanceof float[]) {
            a((float[]) obj, i10);
            return;
        }
        if (obj instanceof double[]) {
            a((double[]) obj, i10);
            return;
        }
        if (obj.getClass().isArray()) {
            a((Object[]) obj, i10);
        } else {
            if (obj instanceof Collection) {
                a((Collection) obj, i10);
                return;
            }
            throw new RuntimeException("write object error: unsupport type. " + obj.getClass());
        }
    }

    public void a(String str, int i10) {
        byte[] bytes;
        try {
            bytes = str.getBytes(this.f99258c);
        } catch (UnsupportedEncodingException unused) {
            bytes = str.getBytes(Charset.forName("UTF-8"));
        }
        a(bytes.length + 10);
        if (bytes.length > 255) {
            b((byte) 7, i10);
            this.f99259d.putInt(bytes.length);
            this.f99259d.put(bytes);
        } else {
            b((byte) 6, i10);
            this.f99259d.put((byte) bytes.length);
            this.f99259d.put(bytes);
        }
    }

    public <T> void a(Collection<T> collection, int i10) {
        a(8);
        b((byte) 9, i10);
        a(collection == null ? 0 : collection.size(), 0);
        if (collection != null) {
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                a(it.next(), 0);
            }
        }
    }

    public <K, V> void a(Map<K, V> map, int i10) {
        a(8);
        b((byte) 8, i10);
        a(map == null ? 0 : map.size(), 0);
        if (map != null) {
            for (Map.Entry<K, V> entry : map.entrySet()) {
                a(entry.getKey(), 0);
                a(entry.getValue(), 1);
            }
        }
    }

    public void a(short s10, int i10) {
        a(4);
        if (s10 >= -128 && s10 <= 127) {
            a((byte) s10, i10);
        } else {
            b((byte) 1, i10);
            this.f99259d.putShort(s10);
        }
    }

    public void a(boolean z10, int i10) {
        a(z10 ? (byte) 1 : (byte) 0, i10);
    }

    public void a(byte[] bArr, int i10) {
        a(bArr.length + 8);
        b((byte) 13, i10);
        b((byte) 0, 0);
        a(bArr.length, 0);
        this.f99259d.put(bArr);
    }

    public void a(double[] dArr, int i10) {
        a(8);
        b((byte) 9, i10);
        a(dArr.length, 0);
        for (double d10 : dArr) {
            a(d10, 0);
        }
    }

    public void a(float[] fArr, int i10) {
        a(8);
        b((byte) 9, i10);
        a(fArr.length, 0);
        for (float f10 : fArr) {
            a(f10, 0);
        }
    }

    public void a(int[] iArr, int i10) {
        a(8);
        b((byte) 9, i10);
        a(iArr.length, 0);
        for (int i11 : iArr) {
            a(i11, 0);
        }
    }

    public void a(long[] jArr, int i10) {
        a(8);
        b((byte) 9, i10);
        a(jArr.length, 0);
        for (long j10 : jArr) {
            a(j10, 0);
        }
    }

    public void a(short[] sArr, int i10) {
        a(8);
        b((byte) 9, i10);
        a(sArr.length, 0);
        for (short s10 : sArr) {
            a(s10, 0);
        }
    }

    public void a(boolean[] zArr, int i10) {
        a(8);
        b((byte) 9, i10);
        a(zArr.length, 0);
        for (boolean z10 : zArr) {
            a(z10, 0);
        }
    }

    public void b(byte b10, int i10) {
        if (i10 < 15) {
            this.f99259d.put((byte) (b10 | (i10 << 4)));
        } else if (i10 < 256) {
            this.f99259d.put((byte) (b10 | 240));
            this.f99259d.put((byte) i10);
        } else {
            throw new RuntimeException("tag is too large: " + i10);
        }
    }

    public byte[] b() {
        byte[] bArr = new byte[this.f99259d.position()];
        System.arraycopy(this.f99259d.array(), 0, bArr, 0, this.f99259d.position());
        return bArr;
    }
}
