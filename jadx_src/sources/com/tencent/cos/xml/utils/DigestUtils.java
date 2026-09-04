package com.tencent.cos.xml.utils;

import android.text.TextUtils;
import android.util.Base64;
import androidx.annotation.p0;
import com.google.common.primitives.Longs;
import com.tencent.cos.xml.common.ClientErrorCode;
import com.tencent.cos.xml.exception.CosXmlClientException;
import com.xiaomi.mipush.sdk.Constants;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import lg.a;

/* JADX INFO: loaded from: classes4.dex */
public class DigestUtils {
    public static String getBase64(String str) throws CosXmlClientException {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        try {
            return Base64.encodeToString(str.getBytes("utf-8"), 2);
        } catch (UnsupportedEncodingException e10) {
            throw new CosXmlClientException(ClientErrorCode.INTERNAL_ERROR.getCode(), e10);
        }
    }

    public static long getBigIntFromString(String str) {
        return new BigInteger(str).longValue();
    }

    public static String getBigIntToString(long j10) {
        BigInteger bigIntegerValueOf = BigInteger.valueOf((j10 >> 1) & Longs.f59056b);
        return bigIntegerValueOf.add(bigIntegerValueOf).add(BigInteger.valueOf(j10 & Long.MAX_VALUE)).toString();
    }

    @p0
    public static String getCOSMd5(InputStream inputStream, long j10, long j11) throws IOException {
        int i10;
        try {
            if (inputStream.skip(j10) != j10) {
                return "";
            }
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            byte[] bArr = new byte[8192];
            if (j11 < 0) {
                j11 = Long.MAX_VALUE;
            }
            int iMin = (int) Math.min(j11, 8192);
            while (j11 > 0 && (i10 = inputStream.read(bArr, 0, iMin)) != -1) {
                if (i10 < iMin) {
                    return "";
                }
                messageDigest.update(bArr, 0, i10);
                j11 -= (long) i10;
            }
            return "\"" + StringUtils.toHexString(messageDigest.digest()) + "\"";
        } catch (IOException e10) {
            throw e10;
        } catch (NoSuchAlgorithmException e11) {
            throw new IOException("unSupport Md5 algorithm", e11);
        }
    }

    public static long getCRC64(InputStream inputStream) {
        try {
            CRC64 crc64 = new CRC64();
            byte[] bArr = new byte[8192];
            while (true) {
                int i10 = inputStream.read(bArr);
                if (i10 == -1) {
                    return crc64.getValue();
                }
                crc64.update(bArr, i10);
            }
        } catch (IOException e10) {
            e10.printStackTrace();
            return -1L;
        }
    }

    public static long getCRC64(InputStream inputStream, long j10, long j11) {
        int i10;
        try {
            if (inputStream.skip(j10) != j10) {
                return -1L;
            }
            CRC64 crc64 = new CRC64();
            byte[] bArr = new byte[8192];
            if (j11 < 0) {
                j11 = Long.MAX_VALUE;
            }
            int iMin = (int) Math.min(j11, 8192);
            while (j11 > 0 && (i10 = inputStream.read(bArr, 0, iMin)) != -1) {
                crc64.update(bArr, i10);
                j11 -= (long) i10;
            }
            return crc64.getValue();
        } catch (IOException e10) {
            e10.printStackTrace();
            return -1L;
        }
    }

    public static String getCRC64String(File file) throws Throwable {
        FileInputStream fileInputStream = null;
        try {
            FileInputStream fileInputStream2 = new FileInputStream(file);
            try {
                String cRC64String = getCRC64String(fileInputStream2);
                try {
                    fileInputStream2.close();
                } catch (IOException e10) {
                    e10.printStackTrace();
                }
                return cRC64String;
            } catch (Exception unused) {
                fileInputStream = fileInputStream2;
                try {
                    fileInputStream.close();
                } catch (IOException e11) {
                    e11.printStackTrace();
                }
                return "";
            } catch (Throwable th2) {
                th = th2;
                fileInputStream = fileInputStream2;
                try {
                    fileInputStream.close();
                } catch (IOException e12) {
                    e12.printStackTrace();
                }
                throw th;
            }
        } catch (Exception unused2) {
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public static String getCRC64String(InputStream inputStream) {
        return getBigIntToString(getCRC64(inputStream));
    }

    public static String getHmacSha1(String str, String str2) throws CosXmlClientException {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(str2.getBytes(Charset.forName("UTF-8")), "HmacSHA1");
            Mac mac = Mac.getInstance("HmacSHA1");
            mac.init(secretKeySpec);
            return StringUtils.toHexString(mac.doFinal(str.getBytes(Charset.forName("UTF-8"))));
        } catch (InvalidKeyException e10) {
            throw new CosXmlClientException(ClientErrorCode.INTERNAL_ERROR.getCode(), e10);
        } catch (NoSuchAlgorithmException e11) {
            throw new CosXmlClientException(ClientErrorCode.INTERNAL_ERROR.getCode(), e11);
        }
    }

    public static String getMD5(String str) throws Throwable {
        Throwable th2;
        NoSuchAlgorithmException e10;
        IOException e11;
        FileNotFoundException e12;
        if (str == null) {
            throw new CosXmlClientException(ClientErrorCode.INVALID_ARGUMENT.getCode(), "file Path is null");
        }
        File file = new File(str);
        if (!file.exists()) {
            throw new CosXmlClientException(ClientErrorCode.INVALID_ARGUMENT.getCode(), "file Path is not exist");
        }
        try {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                FileInputStream fileInputStream = new FileInputStream(file);
                try {
                    byte[] bArr = new byte[32768];
                    while (true) {
                        int i10 = fileInputStream.read(bArr);
                        if (i10 == -1) {
                            String hexString = StringUtils.toHexString(messageDigest.digest());
                            CloseUtil.closeQuietly(fileInputStream);
                            return hexString;
                        }
                        messageDigest.update(bArr, 0, i10);
                    }
                } catch (FileNotFoundException e13) {
                    e12 = e13;
                    throw new CosXmlClientException(ClientErrorCode.INVALID_ARGUMENT.getCode(), e12);
                } catch (IOException e14) {
                    e11 = e14;
                    throw new CosXmlClientException(ClientErrorCode.IO_ERROR.getCode(), e11);
                } catch (NoSuchAlgorithmException e15) {
                    e10 = e15;
                    throw new CosXmlClientException(ClientErrorCode.INTERNAL_ERROR.getCode(), e10);
                }
            } catch (Throwable th3) {
                th2 = th3;
                CloseUtil.closeQuietly(null);
                throw th2;
            }
        } catch (FileNotFoundException e16) {
            e12 = e16;
        } catch (IOException e17) {
            e11 = e17;
        } catch (NoSuchAlgorithmException e18) {
            e10 = e18;
        } catch (Throwable th4) {
            th2 = th4;
            CloseUtil.closeQuietly(null);
            throw th2;
        }
    }

    public static String getSHA1FromBytes(byte[] bArr, int i10, int i11) throws CosXmlClientException {
        if (bArr == null || i11 <= 0 || i10 < 0) {
            throw new CosXmlClientException(ClientErrorCode.INVALID_ARGUMENT.getCode(), "data == null | len <= 0 |offset < 0 |offset >= len");
        }
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
            messageDigest.update(bArr, i10, i11);
            return StringUtils.toHexString(messageDigest.digest());
        } catch (OutOfMemoryError e10) {
            throw new CosXmlClientException(ClientErrorCode.INTERNAL_ERROR.getCode(), e10);
        } catch (NoSuchAlgorithmException e11) {
            throw new CosXmlClientException(ClientErrorCode.INTERNAL_ERROR.getCode(), e11);
        }
    }

    public static String getSHA1FromPath(String str) throws Throwable {
        FileInputStream fileInputStream = null;
        try {
            try {
                FileInputStream fileInputStream2 = new FileInputStream(str);
                try {
                    MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
                    byte[] bArr = new byte[65536];
                    while (true) {
                        int i10 = fileInputStream2.read(bArr, 0, 65536);
                        if (i10 == -1) {
                            String hexString = StringUtils.toHexString(messageDigest.digest());
                            CloseUtil.closeQuietly(fileInputStream2);
                            return hexString;
                        }
                        messageDigest.update(bArr, 0, i10);
                    }
                } catch (FileNotFoundException e10) {
                    e = e10;
                    throw new CosXmlClientException(ClientErrorCode.INVALID_ARGUMENT.getCode(), e);
                } catch (IOException e11) {
                    e = e11;
                    throw new CosXmlClientException(ClientErrorCode.IO_ERROR.getCode(), e);
                } catch (NoSuchAlgorithmException e12) {
                    e = e12;
                    throw new CosXmlClientException(ClientErrorCode.INTERNAL_ERROR.getCode(), e);
                } catch (Throwable th2) {
                    th = th2;
                    fileInputStream = fileInputStream2;
                    CloseUtil.closeQuietly(fileInputStream);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (FileNotFoundException e13) {
            e = e13;
        } catch (IOException e14) {
            e = e14;
        } catch (NoSuchAlgorithmException e15) {
            e = e15;
        }
    }

    public static String getSecurityBase64(String str) throws CosXmlClientException {
        String base64 = getBase64(str);
        return TextUtils.isEmpty(base64) ? base64 : base64.replace("+", Constants.ACCEPT_TIME_SEPARATOR_SERVER).replace("/", a.f131412e);
    }

    public static String getSha1(String str) throws CosXmlClientException {
        try {
            return StringUtils.toHexString(MessageDigest.getInstance("SHA-1").digest(str.getBytes(Charset.forName("UTF-8"))));
        } catch (NoSuchAlgorithmException e10) {
            throw new CosXmlClientException(ClientErrorCode.INTERNAL_ERROR.getCode(), e10);
        }
    }
}
