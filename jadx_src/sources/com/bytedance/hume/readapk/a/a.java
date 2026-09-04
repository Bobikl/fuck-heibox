package com.bytedance.hume.readapk.a;

import java.io.DataInput;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes6.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final byte[] f42173a = {108, 116, 108, 111, 118, 101, 122, 104};

    public static String a(File file) throws Throwable {
        RandomAccessFile randomAccessFile;
        RandomAccessFile randomAccessFile2 = null;
        str = null;
        str = null;
        str = null;
        str = null;
        str = null;
        String str = null;
        try {
            try {
                try {
                    randomAccessFile = new RandomAccessFile(file, "r");
                    try {
                        long length = randomAccessFile.length();
                        byte[] bArr = f42173a;
                        byte[] bArr2 = new byte[bArr.length];
                        long length2 = length - ((long) bArr.length);
                        randomAccessFile.seek(length2);
                        randomAccessFile.readFully(bArr2);
                        if (!c(bArr2)) {
                            try {
                                randomAccessFile.close();
                            } catch (IOException e10) {
                                e10.printStackTrace();
                            }
                            return "";
                        }
                        long j10 = length2 - 2;
                        randomAccessFile.seek(j10);
                        int iB = b(randomAccessFile);
                        if (iB <= 0) {
                            try {
                                randomAccessFile.close();
                            } catch (IOException e11) {
                                e11.printStackTrace();
                            }
                            return "";
                        }
                        randomAccessFile.seek(j10 - ((long) iB));
                        byte[] bArr3 = new byte[iB];
                        randomAccessFile.readFully(bArr3);
                        String str2 = new String(bArr3, "UTF-8");
                        try {
                            randomAccessFile.close();
                        } catch (IOException e12) {
                            e12.printStackTrace();
                        }
                        str = str2;
                    } catch (FileNotFoundException e13) {
                        e = e13;
                        e.printStackTrace();
                        if (randomAccessFile != null) {
                            randomAccessFile.close();
                        }
                    } catch (UnsupportedEncodingException e14) {
                        e = e14;
                        e.printStackTrace();
                        if (randomAccessFile != null) {
                            randomAccessFile.close();
                        }
                    } catch (IOException e15) {
                        e = e15;
                        e.printStackTrace();
                        if (randomAccessFile != null) {
                            randomAccessFile.close();
                        }
                    } catch (Exception e16) {
                        e = e16;
                        e.printStackTrace();
                        if (randomAccessFile != null) {
                            randomAccessFile.close();
                        }
                    }
                } catch (IOException e17) {
                    e17.printStackTrace();
                }
            } catch (FileNotFoundException e18) {
                e = e18;
                randomAccessFile = null;
            } catch (UnsupportedEncodingException e19) {
                e = e19;
                randomAccessFile = null;
            } catch (IOException e20) {
                e = e20;
                randomAccessFile = null;
            } catch (Exception e21) {
                e = e21;
                randomAccessFile = null;
            } catch (Throwable th2) {
                th = th2;
                if (randomAccessFile2 != null) {
                    try {
                        randomAccessFile2.close();
                    } catch (IOException e22) {
                        e22.printStackTrace();
                    }
                }
                throw th;
            }
            return str;
        } catch (Throwable th3) {
            th = th3;
            randomAccessFile2 = randomAccessFile;
        }
    }

    private static short b(DataInput dataInput) throws IOException {
        byte[] bArr = new byte[2];
        dataInput.readFully(bArr);
        return ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN).getShort(0);
    }

    private static boolean c(byte[] bArr) {
        if (bArr.length != f42173a.length) {
            return false;
        }
        int i10 = 0;
        while (true) {
            byte[] bArr2 = f42173a;
            if (i10 >= bArr2.length) {
                return true;
            }
            if (bArr[i10] != bArr2[i10]) {
                return false;
            }
            i10++;
        }
    }
}
