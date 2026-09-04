package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: Internal.java */
/* JADX INFO: loaded from: classes5.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f127353a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ByteBuffer f127354b;

    /* JADX INFO: compiled from: Internal.java */
    public interface a {
        int getNumber();
    }

    /* JADX INFO: compiled from: Internal.java */
    public interface b<T extends a> {
        T a(int i10);
    }

    static {
        byte[] bArr = new byte[0];
        f127353a = bArr;
        f127354b = ByteBuffer.wrap(bArr);
    }

    public static boolean a(byte[] bArr) {
        return u.e(bArr);
    }

    public static String b(byte[] bArr) {
        try {
            return new String(bArr, "UTF-8");
        } catch (UnsupportedEncodingException e10) {
            throw new RuntimeException("UTF-8 not supported?", e10);
        }
    }
}
