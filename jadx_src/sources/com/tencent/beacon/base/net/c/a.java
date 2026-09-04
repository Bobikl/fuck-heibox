package com.tencent.beacon.base.net.c;

import com.tencent.beacon.a.b.g;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

/* JADX INFO: compiled from: CompressUtil.java */
/* JADX INFO: loaded from: classes4.dex */
public final class a {
    public static byte[] a(int i10, byte[] bArr) throws Exception {
        if (i10 == 1) {
            return d(bArr);
        }
        if (i10 == 2) {
            return a(bArr);
        }
        return null;
    }

    private static byte[] a(byte[] bArr) throws Exception {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
        gZIPOutputStream.write(bArr);
        gZIPOutputStream.finish();
        gZIPOutputStream.close();
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        byteArrayOutputStream.close();
        return byteArray;
    }

    public static byte[] b(int i10, byte[] bArr) throws Exception {
        if (i10 == 1) {
            return c(bArr);
        }
        if (i10 == 2) {
            return b(bArr);
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x008f  */
    /* JADX WARN: Code duplicated, block: B:39:0x0094  */
    /* JADX WARN: Code duplicated, block: B:41:0x0099  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v9 */
    private static byte[] b(byte[] bArr) throws Exception {
        ByteArrayInputStream byteArrayInputStream;
        GZIPInputStream gZIPInputStream;
        Exception exc;
        Exception exc2;
        ?? r10;
        ByteArrayOutputStream byteArrayOutputStream = null;
        byte[] byteArray = null;
        byteArrayOutputStream = null;
        byteArrayOutputStream = null;
        byteArrayOutputStream = null;
        byteArrayOutputStream = null;
        try {
            byteArrayInputStream = new ByteArrayInputStream(bArr);
            try {
                gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
                try {
                    try {
                        byte[] bArr2 = new byte[1024];
                        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                        while (true) {
                            try {
                                int i10 = gZIPInputStream.read(bArr2, 0, 1024);
                                if (i10 == -1) {
                                    byteArray = byteArrayOutputStream2.toByteArray();
                                    byteArrayOutputStream2.flush();
                                    byteArrayOutputStream2.close();
                                    gZIPInputStream.close();
                                    byteArrayInputStream.close();
                                    return byteArray;
                                }
                                byteArrayOutputStream2.write(bArr2, 0, i10);
                            } catch (Exception e10) {
                                exc2 = e10;
                                r10 = byteArray;
                                byteArrayOutputStream = byteArrayOutputStream2;
                                g gVarE = g.e();
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append("unzipData length: ");
                                sb2.append(bArr.length);
                                gVarE.a("509", sb2.toString(), exc2);
                                com.tencent.beacon.base.util.c.a(exc2);
                                StringBuilder sb3 = new StringBuilder();
                                sb3.append("unGzip error ");
                                sb3.append(exc2.toString());
                                com.tencent.beacon.base.util.c.b(sb3.toString(), new Object[0]);
                                if (byteArrayOutputStream != null) {
                                    byteArrayOutputStream.close();
                                }
                                if (gZIPInputStream != null) {
                                    gZIPInputStream.close();
                                }
                                if (byteArrayInputStream != null) {
                                    byteArrayInputStream.close();
                                }
                                return r10;
                            } catch (Throwable th2) {
                                th = th2;
                                byteArrayOutputStream = byteArrayOutputStream2;
                                if (byteArrayOutputStream != null) {
                                    byteArrayOutputStream.close();
                                }
                                if (gZIPInputStream != null) {
                                    gZIPInputStream.close();
                                }
                                if (byteArrayInputStream != null) {
                                    byteArrayInputStream.close();
                                }
                                throw th;
                            }
                        }
                    } catch (Exception e11) {
                        exc2 = e11;
                        r10 = 0;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            } catch (Exception e12) {
                exc = e12;
                gZIPInputStream = null;
                exc2 = exc;
                r10 = gZIPInputStream;
                g gVarE2 = g.e();
                StringBuilder sb4 = new StringBuilder();
                sb4.append("unzipData length: ");
                sb4.append(bArr.length);
                gVarE2.a("509", sb4.toString(), exc2);
                com.tencent.beacon.base.util.c.a(exc2);
                StringBuilder sb5 = new StringBuilder();
                sb5.append("unGzip error ");
                sb5.append(exc2.toString());
                com.tencent.beacon.base.util.c.b(sb5.toString(), new Object[0]);
                if (byteArrayOutputStream != null) {
                    byteArrayOutputStream.close();
                }
                if (gZIPInputStream != null) {
                    gZIPInputStream.close();
                }
                if (byteArrayInputStream != null) {
                    byteArrayInputStream.close();
                }
                return r10;
            } catch (Throwable th4) {
                th = th4;
                gZIPInputStream = null;
            }
        } catch (Exception e13) {
            exc = e13;
            byteArrayInputStream = null;
            gZIPInputStream = null;
        } catch (Throwable th5) {
            th = th5;
            byteArrayInputStream = null;
            gZIPInputStream = null;
        }
    }

    private static byte[] c(byte[] bArr) throws Exception {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        ZipInputStream zipInputStream = new ZipInputStream(byteArrayInputStream);
        byte[] byteArray = null;
        while (zipInputStream.getNextEntry() != null) {
            byte[] bArr2 = new byte[1024];
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            while (true) {
                int i10 = zipInputStream.read(bArr2, 0, 1024);
                if (i10 != -1) {
                    byteArrayOutputStream.write(bArr2, 0, i10);
                }
            }
            byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.flush();
            byteArrayOutputStream.close();
        }
        zipInputStream.close();
        byteArrayInputStream.close();
        return byteArray;
    }

    private static byte[] d(byte[] bArr) throws Exception {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ZipOutputStream zipOutputStream = new ZipOutputStream(byteArrayOutputStream);
        ZipEntry zipEntry = new ZipEntry("zip");
        zipEntry.setSize(bArr.length);
        zipOutputStream.putNextEntry(zipEntry);
        zipOutputStream.write(bArr);
        zipOutputStream.closeEntry();
        zipOutputStream.close();
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        byteArrayOutputStream.close();
        return byteArray;
    }
}
