package com.huawei.secure.android.common.util;

import android.text.TextUtils;
import android.util.Log;
import java.io.UnsupportedEncodingException;
import java.util.Locale;

/* JADX INFO: loaded from: classes7.dex */
public final class HexUtil {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f63071a = "";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f63072b = "HexUtil";

    private HexUtil() {
    }

    public static String byteArray2HexStr(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            return byteArray2HexStr(str.getBytes("UTF-8"));
        } catch (UnsupportedEncodingException e10) {
            Log.e(f63072b, "byte array 2 hex string UnsupportedEncodingException : " + e10.getMessage());
            return "";
        } catch (Exception e11) {
            Log.e(f63072b, "byte array 2 hex string exception : " + e11.getMessage());
            return "";
        }
    }

    public static String byteArray2HexStr(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        for (byte b10 : bArr) {
            String hexString = Integer.toHexString(b10 & 255);
            if (hexString.length() == 1) {
                sb2.append('0');
            }
            sb2.append(hexString);
        }
        return sb2.toString();
    }

    public static byte[] hexStr2ByteArray(String str) {
        if (TextUtils.isEmpty(str)) {
            return new byte[0];
        }
        String upperCase = str.toUpperCase(Locale.ENGLISH);
        int length = upperCase.length() / 2;
        byte[] bArr = new byte[length];
        try {
            byte[] bytes = upperCase.getBytes("UTF-8");
            for (int i10 = 0; i10 < length; i10++) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("0x");
                int i11 = i10 * 2;
                sb2.append(new String(new byte[]{bytes[i11]}, "UTF-8"));
                bArr[i10] = (byte) (((byte) (Byte.decode(sb2.toString()).byteValue() << 4)) ^ Byte.decode("0x" + new String(new byte[]{bytes[i11 + 1]}, "UTF-8")).byteValue());
            }
        } catch (UnsupportedEncodingException e10) {
            e = e10;
            Log.e(f63072b, "hex string 2 byte UnsupportedEncodingException or NumberFormatException : " + e.getMessage());
        } catch (NumberFormatException e11) {
            e = e11;
            Log.e(f63072b, "hex string 2 byte UnsupportedEncodingException or NumberFormatException : " + e.getMessage());
        } catch (Exception e12) {
            Log.e(f63072b, "byte array 2 hex string exception : " + e12.getMessage());
        }
        return bArr;
    }
}
