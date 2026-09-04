package cn.fly.verify;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import com.huawei.hms.framework.common.ContainerUtils;
import com.tencent.cos.xml.crypto.JceEncryptionConstants;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.X509EncodedKeySpec;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class ag {
    public static String a() {
        StringBuilder sb2;
        int i10;
        String string = "";
        for (int i11 = 0; i11 < 32; i11++) {
            int iNextInt = new Random(100L).nextInt() % 62;
            if (iNextInt < 26) {
                string = string + (iNextInt + 97);
            } else {
                if (iNextInt < 52) {
                    sb2 = new StringBuilder();
                    sb2.append(string);
                    i10 = iNextInt + 65;
                } else {
                    sb2 = new StringBuilder();
                    sb2.append(string);
                    i10 = (iNextInt + 48) - 26;
                }
                sb2.append(i10 - 26);
                string = sb2.toString();
            }
        }
        return string;
    }

    public static String a(Context context) {
        try {
            String strA = al.a();
            if (TextUtils.isEmpty(strA)) {
                return null;
            }
            int length = strA.length() / 2;
            StringBuilder sb2 = new StringBuilder();
            int i10 = 0;
            while (i10 < length) {
                int i11 = i10 + 1;
                sb2.append(strA.substring(i10 * 2, i11 * 2));
                if (i10 < length - 1) {
                    sb2.append(":");
                }
                i10 = i11;
            }
            return sb2.toString();
        } catch (Throwable unused) {
            return null;
        }
    }

    public static String a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            String strB = b(jSONObject.optString("aesKey"), str2);
            return b(jSONObject.optString("data"), strB.substring(0, 16), strB.substring(16));
        } catch (Throwable unused) {
            return null;
        }
    }

    public static String a(String str, String str2, String str3) {
        if (str != null) {
            try {
                if (str.length() == 0 || str.trim().length() == 0 || str2 == null || str2.length() != 16 || str3.length() != 16) {
                    return null;
                }
                Cipher cipher = Cipher.getInstance(JceEncryptionConstants.SYMMETRIC_CIPHER_METHOD);
                cipher.init(1, new SecretKeySpec(str2.getBytes("utf-8"), JceEncryptionConstants.SYMMETRIC_KEY_ALGORITHM), new IvParameterSpec(str3.getBytes("utf-8")));
                return Base64.encodeToString(cipher.doFinal(str.getBytes("utf-8")), 0).replace("\n", "");
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    public static String a(HashMap<String, Object> map) {
        StringBuilder sb2;
        if (map != null) {
            try {
                sb2 = new StringBuilder();
                for (Map.Entry<String, Object> entry : map.entrySet()) {
                    String key = entry.getKey();
                    Object value = entry.getValue();
                    if (value != null && !TextUtils.isEmpty(key)) {
                        String strEncode = URLEncoder.encode(value.toString(), "UTF-8");
                        sb2.append(key);
                        sb2.append(ContainerUtils.KEY_VALUE_DELIMITER);
                        sb2.append(strEncode);
                        sb2.append("&");
                    }
                }
                sb2.deleteCharAt(sb2.length() - 1);
            } catch (Exception unused) {
                sb2 = null;
            }
        } else {
            sb2 = null;
        }
        if (sb2 == null) {
            return null;
        }
        return sb2.toString();
    }

    public static PublicKey a(String str) {
        try {
            return KeyFactory.getInstance(n5.d.f132016a).generatePublic(new X509EncodedKeySpec(Base64.decode(str.getBytes(), 0)));
        } catch (Exception unused) {
            return null;
        }
    }

    private static byte[] a(RSAPublicKey rSAPublicKey, byte[] bArr) throws Exception {
        if (rSAPublicKey == null) {
            throw new Exception("public key is null");
        }
        try {
            Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
            cipher.init(2, rSAPublicKey);
            return cipher.doFinal(bArr);
        } catch (InvalidKeyException unused) {
            throw new InvalidKeyException("InvalidKey");
        } catch (NoSuchAlgorithmException unused2) {
            throw new NoSuchAlgorithmException("NoSuchAlgorithm");
        } catch (BadPaddingException unused3) {
            throw new BadPaddingException("BadPadding");
        } catch (IllegalBlockSizeException unused4) {
            throw new IllegalBlockSizeException("IllegalBlockSize");
        } catch (NoSuchPaddingException unused5) {
            throw new NoSuchPaddingException("NoSuchPadding or not support this padding");
        }
    }

    public static String b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(str.getBytes(Charset.defaultCharset()));
            byte[] bArrDigest = messageDigest.digest();
            StringBuilder sb2 = new StringBuilder();
            for (byte b10 : bArrDigest) {
                String hexString = Integer.toHexString(b10 & 255);
                if (hexString.length() == 1) {
                    sb2.append("0");
                }
                sb2.append(hexString);
            }
            return sb2.toString();
        } catch (Throwable unused) {
            return null;
        }
    }

    public static String b(String str, String str2) throws Exception {
        RSAPublicKey rSAPublicKey = (RSAPublicKey) a(str2);
        if (TextUtils.isEmpty(str)) {
            throw new Exception("rsaAes key is null");
        }
        return new String(a(rSAPublicKey, Base64.decode(str, 0)), Charset.defaultCharset()).trim();
    }

    public static String b(String str, String str2, String str3) {
        if (str == null) {
            return null;
        }
        try {
            if (str.length() == 0 || str.trim().length() == 0) {
                return null;
            }
            if (str2 == null) {
                throw new Exception("decrypt key is null");
            }
            if (str2.length() != 16) {
                throw new Exception("decrypt key length error");
            }
            if (str3.length() != 16) {
                throw new Exception(" iv decrypt key length error");
            }
            byte[] bArrDecode = Base64.decode(str, 0);
            Cipher cipher = Cipher.getInstance(JceEncryptionConstants.SYMMETRIC_CIPHER_METHOD);
            cipher.init(2, new SecretKeySpec(str2.getBytes("utf-8"), JceEncryptionConstants.SYMMETRIC_KEY_ALGORITHM), new IvParameterSpec(str3.getBytes("utf-8")));
            return new String(cipher.doFinal(bArrDecode), "utf-8");
        } catch (Exception unused) {
            return null;
        }
    }

    public static String c(String str, String str2) {
        try {
            PublicKey publicKeyA = a(str);
            Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
            cipher.init(1, publicKeyA);
            return Base64.encodeToString(cipher.doFinal(str2.getBytes(Charset.defaultCharset())), 0).replace("\n", "");
        } catch (Throwable unused) {
            return null;
        }
    }

    public static HashMap<String, Object> d(String str, String str2) {
        String strA = a();
        String strSubstring = strA.substring(0, 16);
        String strSubstring2 = strA.substring(16, 32);
        String strA2 = a("{app:{\"c\":" + fz.d.m() + ",\"md5\":\"" + a(ax.g()) + "\", \"n\":\"" + al.i() + "\",\"pk\":\"" + fz.d.c() + "\",\"v\":\"" + fz.d.f() + "\"},sdk: {\"c\":47,\"cm\":\"CUCC\",\"n\":\"SDKFactory\",\"v\":\"安卓4.0.3开放版Z21041415\"},device:{\"imei\":[],\"os\":\"Android\"},sim:[],data:{\"r\":" + System.currentTimeMillis() + ",\"serviceType\":0,\"privateIp\":\"\",\"compatible\":\"2\",\"newVersion\":\"10\"}}", strSubstring.trim(), strSubstring2.trim());
        StringBuilder sb2 = new StringBuilder();
        sb2.append(strSubstring);
        sb2.append(strSubstring2);
        String strC = c(str2, sb2.toString());
        StringBuilder sb3 = new StringBuilder();
        sb3.append(str);
        sb3.append("/dro/netm/v1.0/qc?apiKey=");
        sb3.append(str);
        sb3.append("&params=");
        sb3.append(strA2);
        sb3.append("&paramsKey=");
        sb3.append(strC);
        String strB = b(sb3.toString());
        HashMap map = new HashMap();
        map.put("apiKey", str);
        map.put("params", strA2);
        map.put("paramsKey", strC);
        HashMap map2 = new HashMap(16);
        if (!TextUtils.isEmpty(strB)) {
            map.put("sign", strB);
            map.put("sign_Type", "B");
            map2.put("sign", strB);
            map2.put("api-protocol", "1.1");
        }
        HashMap<String, Object> map3 = new HashMap<>();
        map3.put("params", map);
        map3.put("sign", map2);
        return map3;
    }
}
