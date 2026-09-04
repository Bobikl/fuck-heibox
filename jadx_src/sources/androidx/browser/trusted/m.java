package androidx.browser.trusted;

import android.content.pm.PackageManager;
import android.util.Log;
import androidx.annotation.n0;
import androidx.annotation.p0;
import java.io.IOException;
import java.util.List;

/* JADX INFO: compiled from: Token.java */
/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f3289b = "Token";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @n0
    private final o f3290a;

    private m(@n0 o oVar) {
        this.f3290a = oVar;
    }

    @p0
    public static m a(@n0 String str, @n0 PackageManager packageManager) {
        List<byte[]> listB = k.b(str, packageManager);
        if (listB == null) {
            return null;
        }
        try {
            return new m(o.c(str, listB));
        } catch (IOException e10) {
            Log.e(f3289b, "Exception when creating token.", e10);
            return null;
        }
    }

    @n0
    public static m b(@n0 byte[] bArr) {
        return new m(o.e(bArr));
    }

    public boolean c(@n0 String str, @n0 PackageManager packageManager) {
        return k.d(str, packageManager, this.f3290a);
    }

    @n0
    public byte[] d() {
        return this.f3290a.j();
    }
}
