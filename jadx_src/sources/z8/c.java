package z8;

import android.util.Base64;
import androidx.annotation.n0;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* JADX INFO: loaded from: classes7.dex */
@v8.a
public final class c {
    @n0
    @v8.a
    public static byte[] a(@n0 String str) {
        if (str == null) {
            return null;
        }
        return Base64.decode(str, 0);
    }

    @n0
    @v8.a
    public static byte[] b(@n0 String str) {
        if (str == null) {
            return null;
        }
        return Base64.decode(str, 10);
    }

    @n0
    @v8.a
    public static byte[] c(@n0 String str) {
        if (str == null) {
            return null;
        }
        return Base64.decode(str, 11);
    }

    @n0
    @v8.a
    public static String d(@n0 byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return Base64.encodeToString(bArr, 0);
    }

    @n0
    @v8.a
    public static String e(@n0 byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return Base64.encodeToString(bArr, 10);
    }

    @n0
    @v8.a
    public static String f(@n0 byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return Base64.encodeToString(bArr, 11);
    }
}
