package com.igexin.a.a.b;

import anet.channel.util.HttpConstant;
import com.tencent.qcloud.core.util.IOUtils;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/* JADX INFO: loaded from: classes7.dex */
public final class e {
    public static int a(int i10, byte[] bArr, int i11) {
        bArr[i11] = (byte) ((i10 >> 24) & 255);
        bArr[i11 + 1] = (byte) ((i10 >> 16) & 255);
        bArr[i11 + 2] = (byte) ((i10 >> 8) & 255);
        bArr[i11 + 3] = (byte) (i10 & 255);
        return 4;
    }

    public static int a(long j10, byte[] bArr, int i10) {
        bArr[i10] = (byte) ((j10 >> 56) & 255);
        bArr[i10 + 1] = (byte) ((j10 >> 48) & 255);
        bArr[i10 + 2] = (byte) ((j10 >> 40) & 255);
        bArr[i10 + 3] = (byte) ((j10 >> 32) & 255);
        bArr[i10 + 4] = (byte) ((j10 >> 24) & 255);
        bArr[i10 + 5] = (byte) ((j10 >> 16) & 255);
        bArr[i10 + 6] = (byte) ((j10 >> 8) & 255);
        bArr[i10 + 7] = (byte) (j10 & 255);
        return 8;
    }

    public static int a(byte[] bArr, int i10) {
        return bArr[i10] & 255;
    }

    public static int a(byte[] bArr, int i10, byte[] bArr2, int i11, int i12) {
        System.arraycopy(bArr, i10, bArr2, i11, i12);
        return i12;
    }

    public static String a(String[] strArr) {
        StringBuilder sb2 = new StringBuilder();
        if (!strArr[0].equals("")) {
            sb2.append(strArr[0]);
            sb2.append(HttpConstant.SCHEME_SPLIT);
        }
        if (!strArr[1].equals("")) {
            sb2.append(strArr[1]);
        }
        if (!strArr[2].equals("")) {
            sb2.append(':');
            sb2.append(strArr[2]);
        }
        if (!strArr[3].equals("")) {
            sb2.append(strArr[3]);
            if (!strArr[3].equals("/")) {
                sb2.append(IOUtils.DIR_SEPARATOR_UNIX);
            }
        }
        if (!strArr[4].equals("")) {
            sb2.append(strArr[4]);
        }
        if (!strArr[5].equals("")) {
            sb2.append('?');
            sb2.append(strArr[5]);
        }
        return sb2.toString();
    }

    private static void a(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[1024];
        while (true) {
            int i10 = inputStream.read(bArr);
            if (i10 == -1) {
                return;
            } else {
                outputStream.write(bArr, 0, i10);
            }
        }
    }

    public static void a(InputStream inputStream, OutputStream outputStream, int i10) throws IOException {
        a aVar = new a(outputStream, i10);
        a(inputStream, aVar);
        aVar.a();
    }

    public static byte[] a(int i10) {
        int i11;
        int i12 = 0;
        int i13 = 0;
        do {
            i11 = 24;
            i12 |= (i10 & 127) << 24;
            i10 >>>= 7;
            i13++;
            if (i10 > 0) {
                i12 = (i12 >>> 8) | Integer.MIN_VALUE;
            }
        } while (i10 > 0);
        byte[] bArr = new byte[i13];
        for (int i14 = 0; i14 < i13; i14++) {
            bArr[i14] = (byte) (i12 >>> i11);
            i11 -= 8;
        }
        return bArr;
    }

    public static byte[] a(byte[] bArr) {
        return c(bArr);
    }

    public static String[] a(String str) {
        StringBuilder sb2 = new StringBuilder(str.toLowerCase());
        String[] strArr = new String[6];
        for (int i10 = 0; i10 < 6; i10++) {
            strArr[i10] = "";
        }
        int iIndexOf = str.indexOf(":");
        if (iIndexOf > 0) {
            strArr[0] = str.substring(0, iIndexOf);
            sb2.delete(0, iIndexOf + 1);
        } else if (iIndexOf == 0) {
            throw new IllegalArgumentException("url format error - protocol");
        }
        if (sb2.length() >= 2 && sb2.charAt(0) == '/' && sb2.charAt(1) == '/') {
            sb2.delete(0, 2);
            int iIndexOf2 = sb2.toString().indexOf(47);
            if (iIndexOf2 < 0) {
                iIndexOf2 = sb2.length();
            }
            if (iIndexOf2 != 0) {
                int iLastIndexOf = sb2.toString().lastIndexOf(58);
                if (iLastIndexOf < 0) {
                    iLastIndexOf = iIndexOf2;
                } else {
                    if (iLastIndexOf > iIndexOf2) {
                        throw new IllegalArgumentException("url format error - port");
                    }
                    strArr[2] = sb2.toString().substring(iLastIndexOf + 1, iIndexOf2);
                }
                strArr[1] = sb2.toString().substring(0, iLastIndexOf);
                sb2.delete(0, iIndexOf2);
            }
        }
        if (sb2.length() > 0) {
            String string = sb2.toString();
            int iLastIndexOf2 = string.lastIndexOf(47);
            if (iLastIndexOf2 > 0) {
                strArr[3] = string.substring(0, iLastIndexOf2);
            } else if (iLastIndexOf2 == 0) {
                if (string.indexOf(63) > 0) {
                    throw new IllegalArgumentException("url format error - path");
                }
                strArr[3] = string;
                return strArr;
            }
            if (iLastIndexOf2 < string.length() - 1) {
                String strSubstring = string.substring(iLastIndexOf2 + 1, string.length());
                int iIndexOf3 = strSubstring.indexOf(63);
                if (iIndexOf3 >= 0) {
                    strArr[4] = strSubstring.substring(0, iIndexOf3);
                    strArr[5] = strSubstring.substring(iIndexOf3 + 1);
                } else {
                    strArr[4] = strSubstring;
                }
            }
        } else {
            strArr[3] = "/";
        }
        return strArr;
    }

    public static int b(int i10, byte[] bArr, int i11) {
        bArr[i11] = (byte) ((i10 >> 8) & 255);
        bArr[i11 + 1] = (byte) (i10 & 255);
        return 2;
    }

    public static short b(byte[] bArr, int i10) {
        return (short) ((bArr[i10 + 1] & 255) | ((bArr[i10] & 255) << 8));
    }

    public static byte[] b(int i10) {
        return new byte[]{(byte) ((i10 >> 24) & 255), (byte) ((i10 >> 16) & 255), (byte) ((i10 >> 8) & 255), (byte) (i10 & 255)};
    }

    public static byte[] b(byte[] bArr) {
        return d(bArr);
    }

    public static int c(int i10, byte[] bArr, int i11) {
        bArr[i11] = (byte) i10;
        return 1;
    }

    public static int c(byte[] bArr, int i10) {
        return (bArr[i10 + 1] & 255) | ((bArr[i10] & 255) << 8);
    }

    public static byte[] c(byte[] bArr) {
        GZIPOutputStream gZIPOutputStream;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] byteArray = null;
        try {
            try {
                try {
                    gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                    try {
                        gZIPOutputStream.write(bArr);
                        gZIPOutputStream.finish();
                        byteArray = byteArrayOutputStream.toByteArray();
                    } catch (Throwable unused) {
                        if (gZIPOutputStream != null) {
                        }
                        byteArrayOutputStream.close();
                        return byteArray;
                    }
                } catch (Throwable unused2) {
                    gZIPOutputStream = null;
                }
                gZIPOutputStream.close();
            } catch (Exception unused3) {
            }
            byteArrayOutputStream.close();
        } catch (Exception unused4) {
        }
        return byteArray;
    }

    public static int d(byte[] bArr, int i10) {
        return (bArr[i10 + 3] & 255) | ((bArr[i10] & 255) << 24) | ((bArr[i10 + 1] & 255) << 16) | ((bArr[i10 + 2] & 255) << 8);
    }

    public static byte[] d(byte[] bArr) {
        GZIPInputStream gZIPInputStream;
        ByteArrayOutputStream byteArrayOutputStream;
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        byte[] byteArray = null;
        try {
            gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
                while (true) {
                    try {
                        int i10 = gZIPInputStream.read();
                        if (i10 == -1) {
                            break;
                        }
                        byteArrayOutputStream.write(i10);
                    } catch (Throwable unused) {
                        if (byteArrayOutputStream != null) {
                            try {
                                byteArrayOutputStream.close();
                            } catch (Exception unused2) {
                            }
                        }
                        if (gZIPInputStream != null) {
                        }
                        byteArrayInputStream.close();
                        return byteArray;
                    }
                }
                byteArray = byteArrayOutputStream.toByteArray();
                try {
                    byteArrayOutputStream.close();
                } catch (Exception unused3) {
                }
            } catch (Throwable unused4) {
                byteArrayOutputStream = null;
            }
        } catch (Throwable unused5) {
            gZIPInputStream = null;
            byteArrayOutputStream = null;
        }
        try {
            gZIPInputStream.close();
        } catch (Exception unused6) {
        }
        try {
            byteArrayInputStream.close();
        } catch (Exception unused7) {
        }
        return byteArray;
    }

    public static long e(byte[] bArr, int i10) {
        return (((long) bArr[i10 + 7]) & 255) | ((((long) bArr[i10]) & 255) << 56) | ((((long) bArr[i10 + 1]) & 255) << 48) | ((((long) bArr[i10 + 2]) & 255) << 40) | ((((long) bArr[i10 + 3]) & 255) << 32) | ((((long) bArr[i10 + 4]) & 255) << 24) | ((((long) bArr[i10 + 5]) & 255) << 16) | ((((long) bArr[i10 + 6]) & 255) << 8);
    }

    public static byte[] f(byte[] bArr, int i10) throws RuntimeException {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            a(byteArrayInputStream, byteArrayOutputStream, i10);
            try {
                byteArrayInputStream.close();
            } catch (Throwable unused) {
            }
            try {
                byteArrayOutputStream.close();
            } catch (Throwable unused2) {
            }
            return byteArrayOutputStream.toByteArray();
        } catch (Throwable th2) {
            try {
                throw new RuntimeException("Unexpected I/O error", th2);
            } catch (Throwable th3) {
                try {
                    byteArrayInputStream.close();
                } catch (Throwable unused3) {
                }
                try {
                    byteArrayOutputStream.close();
                    throw th3;
                } catch (Throwable unused4) {
                    throw th3;
                }
            }
        }
    }
}
