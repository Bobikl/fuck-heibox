package com.google.android.gms.common;

import android.os.RemoteException;
import android.util.Log;
import androidx.annotation.p0;
import com.google.android.gms.common.internal.e1;
import com.google.android.gms.common.internal.f1;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* JADX INFO: loaded from: classes7.dex */
public abstract class b0 extends e1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f52399b;

    protected b0(byte[] bArr) {
        com.google.android.gms.common.internal.p.a(bArr.length == 25);
        this.f52399b = Arrays.hashCode(bArr);
    }

    protected static byte[] r0(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e10) {
            throw new AssertionError(e10);
        }
    }

    @Override // com.google.android.gms.common.internal.f1
    public final com.google.android.gms.dynamic.c E() {
        return com.google.android.gms.dynamic.e.f1(f1());
    }

    public final boolean equals(@p0 Object obj) {
        com.google.android.gms.dynamic.c cVarE;
        if (obj != null && (obj instanceof f1)) {
            try {
                f1 f1Var = (f1) obj;
                if (f1Var.y() == this.f52399b && (cVarE = f1Var.E()) != null) {
                    return Arrays.equals(f1(), (byte[]) com.google.android.gms.dynamic.e.r0(cVarE));
                }
                return false;
            } catch (RemoteException e10) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e10);
            }
        }
        return false;
    }

    abstract byte[] f1();

    public final int hashCode() {
        return this.f52399b;
    }

    @Override // com.google.android.gms.common.internal.f1
    public final int y() {
        return this.f52399b;
    }
}
