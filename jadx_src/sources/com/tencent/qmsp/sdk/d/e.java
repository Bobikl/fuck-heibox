package com.tencent.qmsp.sdk.d;

import android.util.Base64;
import com.tencent.qmsp.sdk.f.h;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.Signature;
import java.security.spec.X509EncodedKeySpec;
import okio.Utf8;

/* JADX INFO: loaded from: classes4.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final byte[] f101914a = {8, 89, -108, 70, 3, com.google.common.base.a.D, 39, -38, 6, 67, -94, org.apache.tools.tar.c.S, com.google.common.base.a.G, com.google.common.base.a.f56668u, 117, -82, 1, 65, -106, 98, 15, 10, 66, -36, 4, 36, -108, 110, 15, 31, 84, -33, 44, 65, -104, 98, 41, 10, org.apache.tools.tar.c.P, -48, Utf8.REPLACEMENT_BYTE, 32, -108, 73, 5, 42, 66, -52, 43, 96, -67, org.apache.tools.tar.c.P, 13, org.apache.tools.tar.c.I, 34, -18, org.apache.tools.tar.c.J, 73, -65, 118, 10, org.apache.tools.tar.c.L, 92, -12, 116, 105, -71, 105, 13, com.google.common.base.a.f56672y, 124, -10, 3, 114, -87, 97, 43, 15, 118, -54, 35, Utf8.REPLACEMENT_BYTE, -93, 101, 0, org.apache.tools.tar.c.F, 66, -55, 17, 33, -22, 108, 11, 99, 81, -54, 43, 36, -21, 99, org.apache.tools.tar.c.Q, 104, 66, -46, 6, org.apache.tools.tar.c.R, -126, 85, com.google.common.base.a.E, 61, 33, -86, org.apache.tools.tar.c.J, 105, -76, 99, 8, 14, 86, -19, com.google.common.base.a.f56668u, 37, -8, com.google.common.base.a.f56668u, 126, 12, org.apache.tools.tar.c.P, -88, com.google.common.base.a.f56673z, 113, -80, 98, 40, Utf8.REPLACEMENT_BYTE, 109, -16, org.apache.tools.tar.c.F, 118, -68, 72, 45, com.google.common.base.a.B, 86, -25, 35, org.apache.tools.tar.c.R, -28, 106, 123, 33, 114, -45, 117, 81, -94, 111, 3, 60, org.apache.tools.tar.c.Q, -86, 110, 123, -28, 105, 101, org.apache.tools.tar.c.J, 94, -19, 31, 97, -67, 104, 3, 41, 117, -84, org.apache.tools.tar.c.I, 82, -65, 86, 6, 57, 60, -86, 124, 115, -89, com.google.common.base.a.A, com.google.common.base.a.H, 11, 60, -39, org.apache.tools.tar.c.J, 67, -125, 66, 36, 41, 60, -7, com.google.common.base.a.f56671x, 69, -80, 111, org.apache.tools.tar.c.Q, 41, 89, -10, 47, org.apache.tools.tar.c.S, -102, 100, 15, 10, 86, -33};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final byte[] f101915b = {8, 84, -26, 87, 39, 47, 127, -49, com.google.common.base.a.f56673z, 81};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final byte[] f101916c = {com.google.common.base.a.A, 67, -110};

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f101917a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f101918b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f101919c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public byte[] f101920d;

        private b() {
        }
    }

    public static b a(DataInputStream dataInputStream) {
        b bVar = new b();
        try {
            bVar.f101917a = dataInputStream.readInt();
            bVar.f101918b = dataInputStream.readInt();
            int i10 = dataInputStream.readInt();
            bVar.f101919c = i10;
            if (i10 > 0 && i10 <= 256) {
                byte[] bArr = new byte[i10];
                bVar.f101920d = bArr;
                dataInputStream.read(bArr);
                return bVar;
            }
            return null;
        } catch (IOException e10) {
            e10.printStackTrace();
            return null;
        }
    }

    private static PublicKey a(String str) {
        if (str == null) {
            str = h.a(f101914a);
        }
        try {
            return KeyFactory.getInstance(h.a(f101916c)).generatePublic(new X509EncodedKeySpec(Base64.decode(str, 0)));
        } catch (Exception e10) {
            e10.printStackTrace();
            return null;
        }
    }

    private static boolean a(DataInputStream dataInputStream, int i10, byte[] bArr, PublicKey publicKey) {
        try {
            Signature signature = Signature.getInstance(h.a(f101915b));
            signature.initVerify(publicKey);
            byte[] bArr2 = new byte[8192];
            while (true) {
                int i11 = i10 < 8192 ? dataInputStream.read(bArr2, 0, i10) : dataInputStream.read(bArr2);
                if (i11 == 0 || i11 == -1) {
                    break;
                    break;
                }
                signature.update(bArr2, 0, i11);
                i10 -= i11;
            }
            return signature.verify(bArr);
        } catch (Exception e10) {
            e10.printStackTrace();
            return false;
        }
    }

    private static boolean a(byte[] bArr, byte[] bArr2, PublicKey publicKey) {
        try {
            Signature signature = Signature.getInstance(h.a(f101915b));
            signature.initVerify(publicKey);
            signature.update(bArr);
            return signature.verify(bArr2);
        } catch (Exception e10) {
            e10.printStackTrace();
            return false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:79:0x0092 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public static byte[] a(File file, String str) throws Throwable {
        DataInputStream dataInputStream;
        int i10;
        DataInputStream dataInputStream2 = null;
        if (!file.exists()) {
            return null;
        }
        try {
            dataInputStream = new DataInputStream(new FileInputStream(file));
            try {
                try {
                    int iAvailable = dataInputStream.available();
                    if (iAvailable >= 8 && iAvailable <= 5242880) {
                        if (dataInputStream.readInt() != 1364419939) {
                            try {
                                dataInputStream.close();
                            } catch (IOException e10) {
                                e10.printStackTrace();
                            }
                            return null;
                        }
                        int i11 = dataInputStream.readInt();
                        if (i11 > 0 && i11 <= 256 && i11 < (i10 = iAvailable - 8)) {
                            PublicKey publicKeyA = a(str);
                            if (publicKeyA == null) {
                                try {
                                    dataInputStream.close();
                                } catch (IOException e11) {
                                    e11.printStackTrace();
                                }
                                return null;
                            }
                            byte[] bArr = new byte[i11];
                            byte[] bArr2 = new byte[i10 - i11];
                            dataInputStream.read(bArr);
                            dataInputStream.read(bArr2);
                            if (a(bArr2, bArr, publicKeyA)) {
                                try {
                                    dataInputStream.close();
                                } catch (IOException e12) {
                                    e12.printStackTrace();
                                }
                                return bArr2;
                            }
                        }
                        try {
                            dataInputStream.close();
                        } catch (IOException e13) {
                            e13.printStackTrace();
                        }
                        return null;
                        try {
                            dataInputStream.close();
                        } catch (IOException e14) {
                            e14.printStackTrace();
                        }
                        return null;
                    }
                    try {
                        dataInputStream.close();
                    } catch (IOException e15) {
                        e15.printStackTrace();
                    }
                    return null;
                } catch (IOException e16) {
                    e = e16;
                    e.printStackTrace();
                    if (dataInputStream != null) {
                    }
                    return null;
                }
            } catch (Throwable th2) {
                th = th2;
                dataInputStream2 = dataInputStream;
                if (dataInputStream2 != null) {
                    try {
                        dataInputStream2.close();
                    } catch (IOException e17) {
                        e17.printStackTrace();
                    }
                }
                throw th;
            }
        } catch (IOException e18) {
            e = e18;
            dataInputStream = null;
        } catch (Throwable th3) {
            th = th3;
            if (dataInputStream2 != null) {
                dataInputStream2.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:111:0x00ce A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:117:0x00c4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:137:? A[SYNTHETIC] */
    public static boolean b(File file, String str) throws Throwable {
        DataInputStream dataInputStream;
        DataInputStream dataInputStream2;
        DataInputStream dataInputStream3;
        if (!file.exists()) {
            return false;
        }
        DataInputStream dataInputStream4 = null;
        try {
            dataInputStream3 = new DataInputStream(new FileInputStream(file));
            try {
                int iAvailable = dataInputStream3.available();
                if (iAvailable <= 140) {
                    try {
                        dataInputStream3.close();
                    } catch (IOException e10) {
                        e10.printStackTrace();
                    }
                    return false;
                }
                int i10 = iAvailable - 140;
                dataInputStream3.skipBytes(i10);
                b bVarA = a(dataInputStream3);
                if (bVarA == null) {
                    try {
                        dataInputStream3.close();
                    } catch (IOException e11) {
                        e11.printStackTrace();
                    }
                    return false;
                }
                if (bVarA.f101917a != 1364419939) {
                    try {
                        dataInputStream3.close();
                    } catch (IOException e12) {
                        e12.printStackTrace();
                    }
                    return false;
                }
                int i11 = bVarA.f101918b;
                if (i11 <= 0 || i11 > 5242880) {
                    try {
                        dataInputStream3.close();
                    } catch (IOException e13) {
                        e13.printStackTrace();
                    }
                    return false;
                }
                if (i10 != i11) {
                    try {
                        dataInputStream3.close();
                    } catch (IOException e14) {
                        e14.printStackTrace();
                    }
                    return false;
                }
                PublicKey publicKeyA = a(str);
                if (publicKeyA == null) {
                    try {
                        dataInputStream3.close();
                    } catch (IOException e15) {
                        e15.printStackTrace();
                    }
                    return false;
                }
                dataInputStream2 = new DataInputStream(new FileInputStream(file));
                try {
                    boolean zA = a(dataInputStream2, bVarA.f101918b, bVarA.f101920d, publicKeyA);
                    try {
                        dataInputStream3.close();
                    } catch (IOException e16) {
                        e16.printStackTrace();
                    }
                    try {
                        dataInputStream2.close();
                    } catch (IOException e17) {
                        e17.printStackTrace();
                    }
                    return zA;
                } catch (IOException e18) {
                    e = e18;
                } catch (Throwable th2) {
                    th = th2;
                    dataInputStream4 = dataInputStream2;
                    dataInputStream = dataInputStream4;
                    dataInputStream4 = dataInputStream3;
                    if (dataInputStream4 != null) {
                        try {
                            dataInputStream4.close();
                        } catch (IOException e19) {
                            e19.printStackTrace();
                        }
                    }
                    if (dataInputStream != null) {
                        throw th;
                    }
                    try {
                        dataInputStream.close();
                        throw th;
                    } catch (IOException e20) {
                        e20.printStackTrace();
                        throw th;
                    }
                }
            } catch (IOException e21) {
                e = e21;
                dataInputStream2 = null;
            } catch (Throwable th3) {
                th = th3;
                dataInputStream = dataInputStream4;
                dataInputStream4 = dataInputStream3;
                if (dataInputStream4 != null) {
                    dataInputStream4.close();
                }
                if (dataInputStream != null) {
                    throw th;
                }
                dataInputStream.close();
                throw th;
            }
            dataInputStream4 = dataInputStream3;
        } catch (IOException e22) {
            e = e22;
            dataInputStream2 = null;
        } catch (Throwable th4) {
            th = th4;
            dataInputStream = null;
            if (dataInputStream4 != null) {
                dataInputStream4.close();
            }
            if (dataInputStream != null) {
                throw th;
            }
            dataInputStream.close();
            throw th;
        }
        try {
            e.printStackTrace();
            if (dataInputStream4 != null) {
                try {
                    dataInputStream4.close();
                } catch (IOException e23) {
                    e23.printStackTrace();
                }
            }
            if (dataInputStream2 != null) {
                try {
                    dataInputStream2.close();
                } catch (IOException e24) {
                    e24.printStackTrace();
                }
            }
            return false;
        } catch (Throwable th5) {
            th = th5;
            dataInputStream3 = dataInputStream4;
            dataInputStream4 = dataInputStream2;
            dataInputStream = dataInputStream4;
            dataInputStream4 = dataInputStream3;
            if (dataInputStream4 != null) {
                dataInputStream4.close();
            }
            if (dataInputStream != null) {
                throw th;
            }
            dataInputStream.close();
            throw th;
        }
    }
}
