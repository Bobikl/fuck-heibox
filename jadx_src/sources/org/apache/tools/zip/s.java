package org.apache.tools.zip;

import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.UnsupportedCharsetException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: ZipEncodingHelper.java */
/* JADX INFO: loaded from: classes5.dex */
public abstract class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Map<String, a> f137469a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final byte[] f137470b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final String f137471c = "UTF8";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f137472d = "utf-8";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final r f137473e;

    /* JADX INFO: compiled from: ZipEncodingHelper.java */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final char[] f137474a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private i f137475b;

        a(char[] cArr) {
            this.f137474a = cArr;
        }

        public synchronized i a() {
            if (this.f137475b == null) {
                this.f137475b = new i(this.f137474a);
            }
            return this.f137475b;
        }
    }

    static {
        HashMap map = new HashMap();
        a aVar = new a(new char[]{199, 252, 233, 226, 228, 224, 229, 231, 234, 235, 232, 239, 238, 236, 196, 197, 201, 230, 198, 244, 246, 242, 251, 249, 255, 214, 220, kotlin.text.y.f128600i, kotlin.text.y.f128601j, 165, 8359, 402, 225, 237, 243, 250, 241, 209, 170, 186, 191, 8976, 172, kotlin.text.y.f128611t, 188, 161, 171, 187, 9617, 9618, 9619, 9474, 9508, 9569, 9570, 9558, 9557, 9571, 9553, 9559, 9565, 9564, 9563, 9488, 9492, 9524, 9516, 9500, 9472, 9532, 9566, 9567, 9562, 9556, 9577, 9574, 9568, 9552, 9580, 9575, 9576, 9572, 9573, 9561, 9560, 9554, 9555, 9579, 9578, 9496, 9484, 9608, 9604, 9612, 9616, 9600, 945, 223, 915, 960, 931, 963, 181, 964, 934, 920, 937, 948, 8734, 966, 949, 8745, 8801, kotlin.text.y.f128608q, kotlin.text.y.N, kotlin.text.y.M, 8992, 8993, 247, kotlin.text.y.K, kotlin.text.y.f128607p, 8729, kotlin.text.y.f128610s, 8730, 8319, 178, 9632, kotlin.text.y.f128598g});
        map.put("CP437", aVar);
        map.put("Cp437", aVar);
        map.put("cp437", aVar);
        map.put("IBM437", aVar);
        map.put("ibm437", aVar);
        a aVar2 = new a(new char[]{199, 252, 233, 226, 228, 224, 229, 231, 234, 235, 232, 239, 238, 236, 196, 197, 201, 230, 198, 244, 246, 242, 251, 249, 255, 214, 220, 248, kotlin.text.y.f128601j, 216, kotlin.text.y.f128599h, 402, 225, 237, 243, 250, 241, 209, 170, 186, 191, kotlin.text.y.f128606o, 172, kotlin.text.y.f128611t, 188, 161, 171, 187, 9617, 9618, 9619, 9474, 9508, 193, 194, 192, kotlin.text.y.f128603l, 9571, 9553, 9559, 9565, kotlin.text.y.f128600i, 165, 9488, 9492, 9524, 9516, 9500, 9472, 9532, 227, 195, 9562, 9556, 9577, 9574, 9568, 9552, 9580, 164, 240, 208, 202, 203, 200, 305, 205, 206, 207, 9496, 9484, 9608, 9604, 166, 204, 9600, 211, 223, 212, 210, 245, 213, 181, 254, 222, 218, 219, 217, 253, 221, 175, 180, 173, kotlin.text.y.f128608q, 8215, 190, kotlin.text.y.f128609r, kotlin.text.y.f128602k, 247, 184, kotlin.text.y.f128607p, 168, kotlin.text.y.f128610s, 185, 179, 178, 9632, kotlin.text.y.f128598g});
        map.put("CP850", aVar2);
        map.put("Cp850", aVar2);
        map.put("cp850", aVar2);
        map.put("IBM850", aVar2);
        map.put("ibm850", aVar2);
        f137469a = Collections.unmodifiableMap(map);
        f137470b = new byte[]{org.apache.tools.tar.c.F, org.apache.tools.tar.c.G, org.apache.tools.tar.c.H, org.apache.tools.tar.c.I, org.apache.tools.tar.c.J, org.apache.tools.tar.c.K, org.apache.tools.tar.c.L, org.apache.tools.tar.c.M, 56, 57, 65, 66, 67, 68, 69, 70};
        f137473e = new e(f137471c);
    }

    static void a(ByteBuffer byteBuffer, char c10) {
        byteBuffer.put((byte) 37);
        byteBuffer.put((byte) 85);
        byte[] bArr = f137470b;
        byteBuffer.put(bArr[(c10 >> '\f') & 15]);
        byteBuffer.put(bArr[(c10 >> '\b') & 15]);
        byteBuffer.put(bArr[(c10 >> 4) & 15]);
        byteBuffer.put(bArr[c10 & 15]);
    }

    public static r b(String str) {
        if (d(str)) {
            return f137473e;
        }
        if (str == null) {
            return new e();
        }
        a aVar = f137469a.get(str);
        if (aVar != null) {
            return aVar.a();
        }
        try {
            return new h(Charset.forName(str));
        } catch (UnsupportedCharsetException unused) {
            return new e(str);
        }
    }

    static ByteBuffer c(ByteBuffer byteBuffer, int i10) {
        e(byteBuffer);
        int iCapacity = byteBuffer.capacity() * 2;
        if (iCapacity >= i10) {
            i10 = iCapacity;
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(i10);
        byteBufferAllocate.put(byteBuffer);
        return byteBufferAllocate;
    }

    static boolean d(String str) {
        if (str == null) {
            str = System.getProperty("file.encoding");
        }
        return f137471c.equalsIgnoreCase(str) || f137472d.equalsIgnoreCase(str);
    }

    static void e(Buffer buffer) {
        buffer.limit(buffer.position());
        buffer.rewind();
    }
}
