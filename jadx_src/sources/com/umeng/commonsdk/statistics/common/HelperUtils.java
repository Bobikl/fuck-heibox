package com.umeng.commonsdk.statistics.common;

import android.text.TextUtils;
import androidx.core.view.o;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.StringWriter;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: loaded from: classes4.dex */
public class HelperUtils {
    public static final String LINE_SEPARATOR = System.getProperty("line.separator");
    private static final String TAG = "helper";

    public static String MD5(String str) {
        if (str == null) {
            return null;
        }
        try {
            byte[] bytes = str.getBytes();
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.reset();
            messageDigest.update(bytes);
            byte[] bArrDigest = messageDigest.digest();
            StringBuffer stringBuffer = new StringBuffer();
            for (byte b10 : bArrDigest) {
                stringBuffer.append(String.format("%02X", Byte.valueOf(b10)));
            }
            return stringBuffer.toString();
        } catch (Exception unused) {
            return str.replaceAll("[^[a-z][A-Z][0-9][.][_]]", "");
        }
    }

    public static boolean checkStrLen(String str, int i10) {
        try {
            return !TextUtils.isEmpty(str) && str.length() <= i10;
        } catch (Exception unused) {
            return false;
        }
    }

    public static String getFileMD5(File file) {
        byte[] bArr = new byte[1024];
        try {
            if (!file.isFile()) {
                return "";
            }
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            FileInputStream fileInputStream = new FileInputStream(file);
            while (true) {
                int i10 = fileInputStream.read(bArr, 0, 1024);
                if (i10 == -1) {
                    fileInputStream.close();
                    return String.format("%1$032x", new BigInteger(1, messageDigest.digest()));
                }
                messageDigest.update(bArr, 0, i10);
            }
        } catch (Exception unused) {
            return null;
        }
    }

    public static String getMD5(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(str.getBytes());
            byte[] bArrDigest = messageDigest.digest();
            StringBuffer stringBuffer = new StringBuffer();
            for (byte b10 : bArrDigest) {
                stringBuffer.append(Integer.toHexString((b10 & 255) | o.f21773u).substring(6));
            }
            return stringBuffer.toString();
        } catch (NoSuchAlgorithmException e10) {
            MLog.i(TAG, "getMD5 error", e10);
            return "";
        }
    }

    public static String getUmengMD5(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(str.getBytes());
            byte[] bArrDigest = messageDigest.digest();
            StringBuffer stringBuffer = new StringBuffer();
            for (byte b10 : bArrDigest) {
                stringBuffer.append(Integer.toHexString(b10 & 255));
            }
            return stringBuffer.toString();
        } catch (Throwable th2) {
            MLog.i(TAG, "getMD5 error", th2);
            return "";
        }
    }

    public static String readFile(File file) {
        FileInputStream fileInputStream;
        try {
            if (!file.exists()) {
                safeClose((InputStream) null);
                return null;
            }
            fileInputStream = new FileInputStream(file);
            try {
                byte[] bArr = new byte[fileInputStream.available()];
                fileInputStream.read(bArr);
                String str = new String(bArr);
                safeClose(fileInputStream);
                return str;
            } catch (Throwable unused) {
            }
        } catch (Throwable unused2) {
            fileInputStream = null;
        }
        safeClose(fileInputStream);
        return null;
    }

    public static byte[] readStreamToByteArray(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[1024];
        while (true) {
            int i10 = inputStream.read(bArr);
            if (-1 == i10) {
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr, 0, i10);
        }
    }

    public static String readStreamToString(InputStream inputStream) throws IOException {
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
        char[] cArr = new char[1024];
        StringWriter stringWriter = new StringWriter();
        while (true) {
            int i10 = inputStreamReader.read(cArr);
            if (-1 == i10) {
                return stringWriter.toString();
            }
            stringWriter.write(cArr, 0, i10);
        }
    }

    public static void safeClose(InputStream inputStream) {
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (Exception unused) {
            }
        }
    }

    public static void safeClose(OutputStream outputStream) {
        if (outputStream != null) {
            try {
                outputStream.close();
            } catch (Exception unused) {
            }
        }
    }

    public static String subStr(String str, int i10) {
        String strSubstring = "";
        try {
            if (!TextUtils.isEmpty(str)) {
                strSubstring = str.substring(0, str.length() < i10 ? str.length() : i10);
                int length = strSubstring.getBytes("UTF-8").length;
                int i11 = i10;
                while (length > i10) {
                    i11--;
                    strSubstring = str.substring(0, i11 > str.length() ? str.length() : i11);
                    length = strSubstring.getBytes("UTF-8").length;
                }
                return strSubstring;
            }
        } catch (Exception e10) {
            MLog.e(e10);
        }
        return strSubstring;
    }

    public static void writeFile(File file, String str) throws IOException {
        writeFile(file, str.getBytes());
    }

    public static void writeFile(File file, byte[] bArr) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            fileOutputStream.write(bArr);
            fileOutputStream.flush();
        } finally {
            safeClose(fileOutputStream);
        }
    }
}
