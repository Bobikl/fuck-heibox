package com.huawei.hms.framework.common;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.libcore.io.ExternalStorageFile;
import com.huawei.libcore.io.ExternalStorageFileInputStream;
import com.huawei.libcore.io.ExternalStorageFileOutputStream;
import com.huawei.libcore.io.ExternalStorageRandomAccessFile;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: loaded from: classes7.dex */
public class CreateFileUtil {
    private static final String EXTERNAL_FILE_NAME = "com.huawei.libcore.io.ExternalStorageFile";
    private static final String EXTERNAL_INPUTSTREAM_NAME = "com.huawei.libcore.io.ExternalStorageFileInputStream";
    private static final String EXTERNAL_OUTPUTSTREAM_NAME = "com.huawei.libcore.io.ExternalStorageFileOutputStream";
    private static final char[] HEX_DIGITS = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    private static final String RANDOM_ACCESS_FILE_NAME = "com.huawei.libcore.io.ExternalStorageRandomAccessFile";
    private static final String TAG = "CreateFileUtil";

    public static String byteArrayToHex(byte[] bArr) {
        char[] cArr = new char[bArr.length * 2];
        int i10 = 0;
        for (byte b10 : bArr) {
            int i11 = i10 + 1;
            char[] cArr2 = HEX_DIGITS;
            cArr[i10] = cArr2[(b10 >>> 4) & 15];
            i10 = i11 + 1;
            cArr[i11] = cArr2[b10 & 15];
        }
        return new String(cArr);
    }

    public static void deleteSecure(File file) {
        if (file == null || !file.exists() || file.delete()) {
            return;
        }
        Logger.w(TAG, "deleteSecure exception");
    }

    public static void deleteSecure(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        deleteSecure(newFile(str));
    }

    public static String getCacheDirPath(Context context) {
        return context == null ? "" : ContextCompat.getProtectedStorageContext(context).getCacheDir().getPath();
    }

    public static String getCanonicalPath(String str) {
        try {
            return newFile(str).getCanonicalPath();
        } catch (IOException e10) {
            Logger.w(TAG, "the canonicalPath has IOException", e10);
            return str;
        } catch (SecurityException e11) {
            Logger.w(TAG, "the canonicalPath has securityException", e11);
            return str;
        } catch (Exception e12) {
            Logger.w(TAG, "the canonicalPath has other Exception", e12);
            return str;
        }
    }

    /* JADX WARN: Code duplicated, block: B:63:0x007a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.io.FileInputStream] */
    /* JADX WARN: Type inference failed for: r2v2 */
    public static String getFileHashData(String str, String str2) throws Throwable {
        FileInputStream fileInputStreamNewSafeFileInputStream;
        ?? r10 = 0;
        strByteArrayToHex = null;
        strByteArrayToHex = null;
        strByteArrayToHex = null;
        strByteArrayToHex = null;
        strByteArrayToHex = null;
        strByteArrayToHex = null;
        strByteArrayToHex = null;
        strByteArrayToHex = null;
        strByteArrayToHex = null;
        strByteArrayToHex = null;
        String strByteArrayToHex = null;
        try {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance(str2);
                fileInputStreamNewSafeFileInputStream = newSafeFileInputStream(str);
                try {
                    byte[] bArr = new byte[1024];
                    long j10 = 0;
                    while (true) {
                        int i10 = fileInputStreamNewSafeFileInputStream.read(bArr);
                        if (i10 == -1) {
                            break;
                        }
                        messageDigest.update(bArr, 0, i10);
                        j10 += (long) i10;
                    }
                    if (j10 > 0) {
                        strByteArrayToHex = byteArrayToHex(messageDigest.digest());
                    }
                } catch (FileNotFoundException e10) {
                    e = e10;
                    Logger.e(TAG, "getFileHashData FileNotFoundException", e);
                    if (fileInputStreamNewSafeFileInputStream != null) {
                    }
                    return strByteArrayToHex;
                } catch (IOException e11) {
                    e = e11;
                    Logger.e(TAG, "getFileHashData IOException", e);
                    if (fileInputStreamNewSafeFileInputStream != null) {
                    }
                    return strByteArrayToHex;
                } catch (IllegalArgumentException e12) {
                    e = e12;
                    Logger.e(TAG, "getFileHashData IllegalArgumentException", e);
                    if (fileInputStreamNewSafeFileInputStream != null) {
                    }
                    return strByteArrayToHex;
                } catch (IndexOutOfBoundsException e13) {
                    e = e13;
                    Logger.e(TAG, "getFileHashData IndexOutOfBoundsException", e);
                    if (fileInputStreamNewSafeFileInputStream != null) {
                    }
                    return strByteArrayToHex;
                } catch (NoSuchAlgorithmException e14) {
                    e = e14;
                    Logger.e(TAG, "getFileHashData NoSuchAlgorithmException", e);
                    if (fileInputStreamNewSafeFileInputStream != null) {
                    }
                    return strByteArrayToHex;
                }
            } catch (Throwable th2) {
                th = th2;
                r10 = str;
                if (r10 != 0) {
                    try {
                        r10.close();
                    } catch (IOException unused) {
                        Logger.e(TAG, "Close FileInputStream failed!");
                    }
                }
                throw th;
            }
        } catch (FileNotFoundException e15) {
            e = e15;
            fileInputStreamNewSafeFileInputStream = null;
        } catch (IOException e16) {
            e = e16;
            fileInputStreamNewSafeFileInputStream = null;
        } catch (IllegalArgumentException e17) {
            e = e17;
            fileInputStreamNewSafeFileInputStream = null;
        } catch (IndexOutOfBoundsException e18) {
            e = e18;
            fileInputStreamNewSafeFileInputStream = null;
        } catch (NoSuchAlgorithmException e19) {
            e = e19;
            fileInputStreamNewSafeFileInputStream = null;
        } catch (Throwable th3) {
            th = th3;
            if (r10 != 0) {
                r10.close();
            }
            throw th;
        }
        try {
            fileInputStreamNewSafeFileInputStream.close();
        } catch (IOException unused2) {
            Logger.e(TAG, "Close FileInputStream failed!");
        }
        return strByteArrayToHex;
    }

    @Deprecated
    public static boolean isPVersion() {
        return EmuiUtil.isUpPVersion();
    }

    public static File newFile(String str) {
        if (str == null) {
            return null;
        }
        return (EmuiUtil.isUpPVersion() && ReflectionUtils.checkCompatible(EXTERNAL_FILE_NAME)) ? new ExternalStorageFile(str) : new File(str);
    }

    public static FileInputStream newFileInputStream(String str) throws FileNotFoundException {
        if (str != null) {
            return (EmuiUtil.isUpPVersion() && ReflectionUtils.checkCompatible(EXTERNAL_INPUTSTREAM_NAME)) ? new ExternalStorageFileInputStream(str) : new FileInputStream(str);
        }
        Logger.w(TAG, "newFileInputStream  file is null");
        throw new FileNotFoundException("file is null");
    }

    public static FileOutputStream newFileOutputStream(File file) throws FileNotFoundException {
        if (file != null) {
            return (EmuiUtil.isUpPVersion() && ReflectionUtils.checkCompatible(EXTERNAL_OUTPUTSTREAM_NAME)) ? new ExternalStorageFileOutputStream(file) : new FileOutputStream(file);
        }
        Logger.e(TAG, "newFileOutputStream  file is null");
        throw new FileNotFoundException("file is null");
    }

    public static RandomAccessFile newRandomAccessFile(String str, String str2) throws FileNotFoundException {
        if (str != null) {
            return (EmuiUtil.isUpPVersion() && ReflectionUtils.checkCompatible(RANDOM_ACCESS_FILE_NAME)) ? new ExternalStorageRandomAccessFile(str, str2) : new RandomAccessFile(str, str2);
        }
        Logger.w(TAG, "newFileOutputStream  file is null");
        throw new FileNotFoundException("file is null");
    }

    public static File newSafeFile(String str) {
        if (str == null) {
            return null;
        }
        try {
            File fileNewFile = newFile(str);
            return !fileNewFile.exists() ? new File(str) : fileNewFile;
        } catch (RuntimeException unused) {
            Logger.w(TAG, "newFile is runtimeException");
            return new File(str);
        } catch (Throwable unused2) {
            Logger.w(TAG, "newFile is Throwable");
            return new File(str);
        }
    }

    public static FileInputStream newSafeFileInputStream(String str) throws FileNotFoundException {
        try {
            return newFileInputStream(str);
        } catch (FileNotFoundException unused) {
            Logger.w(TAG, "newFileInputStream is fileNotFoundException");
            return new FileInputStream(str);
        } catch (RuntimeException unused2) {
            Logger.w(TAG, "newFileInputStream is runtimeException");
            return new FileInputStream(str);
        } catch (Throwable unused3) {
            Logger.w(TAG, "newFileInputStream is Throwable");
            return new FileInputStream(str);
        }
    }

    public static FileOutputStream newSafeFileOutputStream(File file) throws FileNotFoundException {
        try {
            return newFileOutputStream(file);
        } catch (FileNotFoundException unused) {
            Logger.w(TAG, "newFileOutputStream is fileNotFoundException");
            return new FileOutputStream(file);
        } catch (RuntimeException unused2) {
            Logger.w(TAG, "newFileOutputStream is runtimeException");
            return new FileOutputStream(file);
        } catch (Throwable unused3) {
            Logger.w(TAG, "newFileOutputStream is Throwable");
            return new FileOutputStream(file);
        }
    }

    public static RandomAccessFile newSafeRandomAccessFile(String str, String str2) throws FileNotFoundException {
        if (str == null) {
            Logger.w(TAG, "newRandomAccessFile  file is null");
            throw new FileNotFoundException("file is null");
        }
        try {
            return newRandomAccessFile(str, str2);
        } catch (FileNotFoundException unused) {
            Logger.w(TAG, "newRandomAccessFile is fileNotFoundException");
            return new RandomAccessFile(str, str2);
        } catch (RuntimeException unused2) {
            Logger.w(TAG, "newRandomAccessFile is runtimeException");
            return new RandomAccessFile(str, str2);
        } catch (Throwable unused3) {
            Logger.w(TAG, "newRandomAccessFile is Throwable");
            return new RandomAccessFile(str, str2);
        }
    }
}
