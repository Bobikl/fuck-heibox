package z8;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import androidx.annotation.n0;
import androidx.annotation.p0;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* JADX INFO: loaded from: classes7.dex */
@com.google.android.gms.common.internal.t
@v8.a
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile int f141911a = -1;

    @v8.a
    @p0
    @Deprecated
    public static byte[] a(@n0 Context context, @n0 String str) throws PackageManager.NameNotFoundException {
        MessageDigest messageDigestB;
        PackageInfo packageInfoF = com.google.android.gms.common.wrappers.e.a(context).f(str, 64);
        Signature[] signatureArr = packageInfoF.signatures;
        if (signatureArr == null || signatureArr.length != 1 || (messageDigestB = b("SHA1")) == null) {
            return null;
        }
        return messageDigestB.digest(packageInfoF.signatures[0].toByteArray());
    }

    @p0
    public static MessageDigest b(@n0 String str) {
        for (int i10 = 0; i10 < 2; i10++) {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance(str);
                if (messageDigest != null) {
                    return messageDigest;
                }
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        return null;
    }
}
