package com.taobao.downloader.util;

import android.text.TextUtils;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes4.dex */
public class Md5Util {
    private static final char[] hexDigits = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    private static final String byteToHexString(byte[] bArr) {
        char[] cArr = new char[32];
        int i10 = 0;
        for (int i11 = 0; i11 < 16; i11++) {
            byte b10 = bArr[i11];
            int i12 = i10 + 1;
            char[] cArr2 = hexDigits;
            cArr[i10] = cArr2[(b10 >>> 4) & 15];
            i10 = i12 + 1;
            cArr[i12] = cArr2[b10 & 15];
        }
        return new String(cArr);
    }

    public static String getTextMd5(String str) {
        try {
            return byteToHexString(MessageDigest.getInstance("MD5").digest(str.getBytes()));
        } catch (Throwable unused) {
            return "";
        }
    }

    /* JADX WARN: Code duplicated, block: B:59:0x0083 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:65:0x008d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:76:? A[SYNTHETIC] */
    public static boolean isMd5Same(String str, String str2) throws Throwable {
        FileChannel fileChannel;
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        String lowerCase = str.toLowerCase();
        if (str2 == null) {
            return false;
        }
        FileInputStream fileInputStream = null;
        channel = null;
        FileChannel channel = null;
        fileInputStream = null;
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            FileInputStream fileInputStream2 = new FileInputStream(str2);
            try {
                channel = fileInputStream2.getChannel();
                ByteBuffer byteBufferAllocate = ByteBuffer.allocate(102400);
                while (true) {
                    int i10 = channel.read(byteBufferAllocate);
                    if (i10 == -1) {
                        break;
                    }
                    messageDigest.update(byteBufferAllocate.array(), 0, i10);
                    byteBufferAllocate.position(0);
                    Thread.sleep(1L);
                }
                boolean zEquals = byteToHexString(messageDigest.digest()).equals(lowerCase);
                try {
                    fileInputStream2.close();
                } catch (IOException e10) {
                    e10.printStackTrace();
                }
                try {
                    channel.close();
                } catch (IOException e11) {
                    e11.printStackTrace();
                }
                return zEquals;
            } catch (Exception e12) {
                e = e12;
                fileChannel = channel;
                fileInputStream = fileInputStream2;
                try {
                    e.printStackTrace();
                    if (fileInputStream != null) {
                        try {
                            fileInputStream.close();
                        } catch (IOException e13) {
                            e13.printStackTrace();
                        }
                    }
                    if (fileChannel != null) {
                        try {
                            fileChannel.close();
                        } catch (IOException e14) {
                            e14.printStackTrace();
                        }
                    }
                    return false;
                } catch (Throwable th2) {
                    th = th2;
                    if (fileInputStream != null) {
                        try {
                            fileInputStream.close();
                        } catch (IOException e15) {
                            e15.printStackTrace();
                        }
                    }
                    if (fileChannel != null) {
                        throw th;
                    }
                    try {
                        fileChannel.close();
                        throw th;
                    } catch (IOException e16) {
                        e16.printStackTrace();
                        throw th;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                fileChannel = channel;
                fileInputStream = fileInputStream2;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                if (fileChannel != null) {
                    throw th;
                }
                fileChannel.close();
                throw th;
            }
        } catch (Exception e17) {
            e = e17;
            fileChannel = null;
        } catch (Throwable th4) {
            th = th4;
            fileChannel = null;
        }
    }
}
