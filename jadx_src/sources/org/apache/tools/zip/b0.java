package org.apache.tools.zip;

import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import java.util.zip.CRC32;

/* JADX INFO: compiled from: ZipUtil.java */
/* JADX INFO: loaded from: classes5.dex */
public abstract class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final byte[] f137391a = y.b(8448);

    public static long a(int i10) {
        return i10 < 0 ? ((long) i10) + 4294967296L : i10;
    }

    static boolean b(t tVar) {
        return i(tVar) && j(tVar);
    }

    static void c(t tVar) throws UnsupportedZipFeatureException {
        if (!i(tVar)) {
            throw new UnsupportedZipFeatureException(UnsupportedZipFeatureException.Feature.f137371c, tVar);
        }
        if (!j(tVar)) {
            throw new UnsupportedZipFeatureException(UnsupportedZipFeatureException.Feature.f137372d, tVar);
        }
    }

    static byte[] d(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
    }

    public static long e(long j10) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(1, ((int) ((j10 >> 25) & 127)) + bb.c.b.gz);
        calendar.set(2, ((int) ((j10 >> 21) & 15)) - 1);
        calendar.set(5, ((int) (j10 >> 16)) & 31);
        calendar.set(11, ((int) (j10 >> 11)) & 31);
        calendar.set(12, ((int) (j10 >> 5)) & 63);
        calendar.set(13, ((int) (j10 << 1)) & 62);
        calendar.set(14, 0);
        return calendar.getTime().getTime();
    }

    public static Date f(y yVar) {
        return new Date(e(yVar.c()));
    }

    private static String g(a aVar, byte[] bArr) {
        if (aVar != null) {
            CRC32 crc32 = new CRC32();
            crc32.update(bArr);
            if (crc32.getValue() == aVar.i()) {
                try {
                    return s.f137473e.decode(aVar.j());
                } catch (IOException unused) {
                }
            }
        }
        return null;
    }

    static void h(t tVar, byte[] bArr, byte[] bArr2) {
        String strG;
        k kVar = (k) tVar.i(k.f137420e);
        String name = tVar.getName();
        String strG2 = g(kVar, bArr);
        if (strG2 != null && !name.equals(strG2)) {
            tVar.J(strG2);
        }
        if (bArr2 == null || bArr2.length <= 0 || (strG = g((j) tVar.i(j.f137419e), bArr2)) == null) {
            return;
        }
        tVar.setComment(strG);
    }

    private static boolean i(t tVar) {
        return !tVar.l().i();
    }

    private static boolean j(t tVar) {
        return tVar.getMethod() == 0 || tVar.getMethod() == 8;
    }

    public static y k(Date date) {
        return new y(n(date.getTime()));
    }

    public static void l(long j10, byte[] bArr, int i10) {
        m(Calendar.getInstance(), j10, bArr, i10);
    }

    static void m(Calendar calendar, long j10, byte[] bArr, int i10) {
        calendar.setTimeInMillis(j10);
        int i11 = calendar.get(1);
        if (i11 < 1980) {
            byte[] bArr2 = f137391a;
            System.arraycopy(bArr2, 0, bArr, i10, bArr2.length);
        } else {
            y.f((calendar.get(13) >> 1) | ((i11 - bb.c.b.gz) << 25) | ((calendar.get(2) + 1) << 21) | (calendar.get(5) << 16) | (calendar.get(11) << 11) | (calendar.get(12) << 5), bArr, i10);
        }
    }

    public static byte[] n(long j10) {
        byte[] bArr = new byte[4];
        l(j10, bArr, 0);
        return bArr;
    }
}
