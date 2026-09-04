package com.tencent.qmsp.sdk.c;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final byte[] f101847a = {96, 110, -109, 82, 109, 2, 36, -77, 108, 59, -80, 10, 112, 122, 56, -67};

    public String a(byte[] bArr) {
        return com.tencent.qmsp.sdk.f.h.a(bArr);
    }

    /* JADX WARN: Code duplicated, block: B:43:0x004b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public boolean a(String str, byte[] bArr, String str2, int i10) throws Throwable {
        DataOutputStream dataOutputStream = null;
        try {
            if (str2 == null) {
                try {
                    str2 = a(f101847a);
                } catch (IOException e10) {
                    e = e10;
                    e.printStackTrace();
                    if (dataOutputStream != null) {
                        try {
                            dataOutputStream.close();
                        } catch (IOException e11) {
                            e11.printStackTrace();
                        }
                    }
                    return false;
                }
            }
            byte[] bArrA = new com.tencent.qmsp.sdk.f.b().a(bArr, str2.getBytes());
            if (bArrA == null) {
                return false;
            }
            DataOutputStream dataOutputStream2 = new DataOutputStream(new FileOutputStream(str));
            try {
                dataOutputStream2.writeInt(305419896);
                dataOutputStream2.writeInt(i10);
                dataOutputStream2.writeInt(1);
                dataOutputStream2.write(bArrA);
                try {
                    dataOutputStream2.close();
                } catch (IOException e12) {
                    e12.printStackTrace();
                }
                return true;
            } catch (IOException e13) {
                e = e13;
                dataOutputStream = dataOutputStream2;
                e.printStackTrace();
                if (dataOutputStream != null) {
                    dataOutputStream.close();
                }
                return false;
            } catch (Throwable th2) {
                th = th2;
                dataOutputStream = dataOutputStream2;
                if (dataOutputStream != null) {
                    try {
                        dataOutputStream.close();
                    } catch (IOException e14) {
                        e14.printStackTrace();
                    }
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r6v1, types: [boolean] */
    public byte[] a(String str, String str2, int i10) throws Throwable {
        Throwable th2;
        IOException e10;
        DataInputStream dataInputStream;
        File file = new File(str);
        ?? Exists = file.exists();
        ?? r10 = 0;
        try {
            if (Exists == 0) {
                return null;
            }
            try {
                dataInputStream = new DataInputStream(new FileInputStream(file));
                try {
                    int iAvailable = dataInputStream.available();
                    if (iAvailable > 12 && iAvailable <= 102400) {
                        if (dataInputStream.readInt() != 305419896) {
                            try {
                                dataInputStream.close();
                            } catch (IOException e11) {
                                e11.printStackTrace();
                            }
                            return null;
                        }
                        int i11 = dataInputStream.readInt();
                        if (i11 > 0 && i11 <= i10) {
                            if (dataInputStream.readInt() != 1) {
                                try {
                                    dataInputStream.close();
                                } catch (IOException e12) {
                                    e12.printStackTrace();
                                }
                                return null;
                            }
                            int i12 = iAvailable - 12;
                            byte[] bArr = new byte[i12];
                            if (i12 != dataInputStream.read(bArr)) {
                                try {
                                    dataInputStream.close();
                                } catch (IOException e13) {
                                    e13.printStackTrace();
                                }
                                return null;
                            }
                            if (str2 == null) {
                                str2 = a(f101847a);
                            }
                            byte[] bArrA = new com.tencent.qmsp.sdk.f.b().a(bArr, 0, i12, str2.getBytes());
                            if (bArrA == null) {
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
                            return bArrA;
                        }
                        try {
                            dataInputStream.close();
                        } catch (IOException e16) {
                            e16.printStackTrace();
                        }
                        return null;
                    }
                    try {
                        dataInputStream.close();
                    } catch (IOException e17) {
                        e17.printStackTrace();
                    }
                    return null;
                } catch (IOException e18) {
                    e10 = e18;
                    e10.printStackTrace();
                    if (dataInputStream != null) {
                        try {
                            dataInputStream.close();
                        } catch (IOException e19) {
                            e19.printStackTrace();
                        }
                    }
                    return null;
                }
            } catch (IOException e20) {
                e10 = e20;
                dataInputStream = null;
            } catch (Throwable th3) {
                th2 = th3;
                if (r10 != 0) {
                    try {
                        r10.close();
                    } catch (IOException e21) {
                        e21.printStackTrace();
                    }
                }
                throw th2;
            }
        } catch (Throwable th4) {
            r10 = Exists;
            th2 = th4;
        }
    }
}
