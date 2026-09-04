package com.google.android.exoplayer2.extractor.mp4;

import androidx.annotation.p0;
import com.google.android.exoplayer2.util.e0;
import com.google.android.exoplayer2.util.u;
import java.nio.ByteBuffer;
import java.util.UUID;

/* JADX INFO: compiled from: PsshAtomUtil.java */
/* JADX INFO: loaded from: classes7.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f45520a = "PsshAtomUtil";

    /* JADX INFO: compiled from: PsshAtomUtil.java */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final UUID f45521a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f45522b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final byte[] f45523c;

        public a(UUID uuid, int i10, byte[] bArr) {
            this.f45521a = uuid;
            this.f45522b = i10;
            this.f45523c = bArr;
        }
    }

    private l() {
    }

    public static byte[] a(UUID uuid, @p0 byte[] bArr) {
        return b(uuid, null, bArr);
    }

    public static byte[] b(UUID uuid, @p0 UUID[] uuidArr, @p0 byte[] bArr) {
        int length = (bArr != null ? bArr.length : 0) + 32;
        if (uuidArr != null) {
            length += (uuidArr.length * 16) + 4;
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length);
        byteBufferAllocate.putInt(length);
        byteBufferAllocate.putInt(com.google.android.exoplayer2.extractor.mp4.a.f45369x0);
        byteBufferAllocate.putInt(uuidArr != null ? 16777216 : 0);
        byteBufferAllocate.putLong(uuid.getMostSignificantBits());
        byteBufferAllocate.putLong(uuid.getLeastSignificantBits());
        if (uuidArr != null) {
            byteBufferAllocate.putInt(uuidArr.length);
            for (UUID uuid2 : uuidArr) {
                byteBufferAllocate.putLong(uuid2.getMostSignificantBits());
                byteBufferAllocate.putLong(uuid2.getLeastSignificantBits());
            }
        }
        if (bArr != null && bArr.length != 0) {
            byteBufferAllocate.putInt(bArr.length);
            byteBufferAllocate.put(bArr);
        }
        return byteBufferAllocate.array();
    }

    public static boolean c(byte[] bArr) {
        return d(bArr) != null;
    }

    @p0
    private static a d(byte[] bArr) {
        e0 e0Var = new e0(bArr);
        if (e0Var.f() < 32) {
            return null;
        }
        e0Var.S(0);
        if (e0Var.o() != e0Var.a() + 4 || e0Var.o() != 1886614376) {
            return null;
        }
        int iC = com.google.android.exoplayer2.extractor.mp4.a.c(e0Var.o());
        if (iC > 1) {
            StringBuilder sb2 = new StringBuilder(37);
            sb2.append("Unsupported pssh version: ");
            sb2.append(iC);
            u.m(f45520a, sb2.toString());
            return null;
        }
        UUID uuid = new UUID(e0Var.z(), e0Var.z());
        if (iC == 1) {
            e0Var.T(e0Var.K() * 16);
        }
        int iK = e0Var.K();
        if (iK != e0Var.a()) {
            return null;
        }
        byte[] bArr2 = new byte[iK];
        e0Var.k(bArr2, 0, iK);
        return new a(uuid, iC, bArr2);
    }

    @p0
    public static byte[] e(byte[] bArr, UUID uuid) {
        a aVarD = d(bArr);
        if (aVarD == null) {
            return null;
        }
        if (uuid.equals(aVarD.f45521a)) {
            return aVarD.f45523c;
        }
        String strValueOf = String.valueOf(uuid);
        String strValueOf2 = String.valueOf(aVarD.f45521a);
        StringBuilder sb2 = new StringBuilder(strValueOf.length() + 33 + strValueOf2.length());
        sb2.append("UUID mismatch. Expected: ");
        sb2.append(strValueOf);
        sb2.append(", got: ");
        sb2.append(strValueOf2);
        sb2.append(".");
        u.m(f45520a, sb2.toString());
        return null;
    }

    @p0
    public static UUID f(byte[] bArr) {
        a aVarD = d(bArr);
        if (aVarD == null) {
            return null;
        }
        return aVarD.f45521a;
    }

    public static int g(byte[] bArr) {
        a aVarD = d(bArr);
        if (aVarD == null) {
            return -1;
        }
        return aVarD.f45522b;
    }
}
