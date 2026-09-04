package r5;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.util.Locale;
import z5.l;

/* JADX INFO: loaded from: classes6.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f138799a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f138800b = l.g(24);

    public c(boolean z10) {
        this.f138799a = z10;
    }

    public static int a(String str) {
        return Integer.parseInt(str);
    }

    public static String b(int i10) {
        return String.format(Locale.getDefault(), "%05d", Integer.valueOf(i10));
    }

    public static byte[] e(String str, String str2) {
        return n5.d.a(str, str2);
    }

    public static byte[] f(String str, byte[] bArr, String str2) {
        return n5.e.b(str, bArr, str2);
    }

    /* JADX WARN: Code duplicated, block: B:45:0x005b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:50:0x0056 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:63:? A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.io.ByteArrayOutputStream] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.io.ByteArrayOutputStream] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.io.ByteArrayOutputStream, java.io.OutputStream] */
    public static byte[] g(byte[]... bArr) throws Throwable {
        DataOutputStream dataOutputStream;
        ?? r10 = 0;
        bArr = null;
        byte[] bArr2 = null;
        if (bArr != null) {
            ?? length = bArr.length;
            try {
                if (length != 0) {
                    try {
                        length = new ByteArrayOutputStream();
                        try {
                            dataOutputStream = new DataOutputStream(length);
                            try {
                                for (byte[] bArr3 : bArr) {
                                    dataOutputStream.write(b(bArr3.length).getBytes());
                                    dataOutputStream.write(bArr3);
                                }
                                dataOutputStream.flush();
                                byte[] byteArray = length.toByteArray();
                                try {
                                    length.close();
                                } catch (Exception unused) {
                                }
                                bArr2 = byteArray;
                            } catch (Exception e10) {
                                e = e10;
                                z5.e.d(e);
                                if (length != 0) {
                                    try {
                                        length.close();
                                    } catch (Exception unused2) {
                                    }
                                }
                                if (dataOutputStream != null) {
                                }
                                return bArr2;
                            }
                        } catch (Exception e11) {
                            e = e11;
                            dataOutputStream = null;
                        } catch (Throwable th2) {
                            th = th2;
                            r10 = length;
                            if (r10 != 0) {
                                try {
                                    r10.close();
                                } catch (Exception unused3) {
                                }
                            }
                            if (r10 != 0) {
                                throw th;
                            }
                            try {
                                r10.close();
                                throw th;
                            } catch (Exception unused4) {
                                throw th;
                            }
                        }
                    } catch (Exception e12) {
                        e = e12;
                        length = 0;
                        dataOutputStream = null;
                    } catch (Throwable th3) {
                        th = th3;
                        if (r10 != 0) {
                            r10.close();
                        }
                        if (r10 != 0) {
                            throw th;
                        }
                        r10.close();
                        throw th;
                    }
                    try {
                        dataOutputStream.close();
                    } catch (Exception unused5) {
                    }
                    return bArr2;
                }
            } catch (Throwable th4) {
                th = th4;
            }
        }
        return null;
    }

    public static byte[] h(String str, byte[] bArr, String str2) {
        return n5.e.d(str, bArr, str2);
    }

    /* JADX WARN: Code duplicated, block: B:44:0x0079 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Not initialized variable reg: 1, insn: 0x0076: MOVE (r0 I:??[OBJECT, ARRAY]) = (r1 I:??[OBJECT, ARRAY]), block:B:37:0x0076 */
    public b c(d dVar, String str) {
        ByteArrayInputStream byteArrayInputStream;
        String str2;
        ByteArrayInputStream byteArrayInputStream2;
        String str3;
        ByteArrayInputStream byteArrayInputStream3 = null;
        try {
            try {
                byteArrayInputStream = new ByteArrayInputStream(dVar.a());
                try {
                    byte[] bArr = new byte[5];
                    byteArrayInputStream.read(bArr);
                    byte[] bArr2 = new byte[a(new String(bArr))];
                    byteArrayInputStream.read(bArr2);
                    str2 = new String(bArr2);
                    try {
                        byte[] bArr3 = new byte[5];
                        byteArrayInputStream.read(bArr3);
                        int iA = a(new String(bArr3));
                        if (iA > 0) {
                            byte[] bArrB = new byte[iA];
                            byteArrayInputStream.read(bArrB);
                            if (this.f138799a) {
                                bArrB = f(this.f138800b, bArrB, str);
                            }
                            if (dVar.b()) {
                                bArrB = n5.b.b(bArrB);
                            }
                            str3 = new String(bArrB);
                        } else {
                            str3 = null;
                        }
                        try {
                            byteArrayInputStream.close();
                        } catch (Exception unused) {
                        }
                    } catch (Exception e10) {
                        e = e10;
                        z5.e.d(e);
                        if (byteArrayInputStream != null) {
                            try {
                                byteArrayInputStream.close();
                            } catch (Exception unused2) {
                            }
                        }
                        str3 = null;
                    }
                } catch (Exception e11) {
                    e = e11;
                    str2 = null;
                }
            } catch (Throwable th2) {
                th = th2;
                byteArrayInputStream3 = byteArrayInputStream2;
                if (byteArrayInputStream3 != null) {
                    try {
                        byteArrayInputStream3.close();
                    } catch (Exception unused3) {
                    }
                }
                throw th;
            }
        } catch (Exception e12) {
            e = e12;
            byteArrayInputStream = null;
            str2 = null;
        } catch (Throwable th3) {
            th = th3;
            if (byteArrayInputStream3 != null) {
                byteArrayInputStream3.close();
            }
            throw th;
        }
        if (str2 == null && str3 == null) {
            return null;
        }
        return new b(str2, str3);
    }

    public d d(b bVar, boolean z10, String str) {
        if (bVar == null) {
            return null;
        }
        byte[] bytes = bVar.b().getBytes();
        byte[] bytes2 = bVar.a().getBytes();
        if (z10) {
            try {
                bytes2 = n5.b.a(bytes2);
            } catch (Exception unused) {
                z10 = false;
            }
        }
        return new d(z10, this.f138799a ? g(bytes, e(this.f138800b, j5.a.f124254e), h(this.f138800b, bytes2, str)) : g(bytes, bytes2));
    }
}
