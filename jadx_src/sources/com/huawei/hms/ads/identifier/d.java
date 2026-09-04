package com.huawei.hms.ads.identifier;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import com.bun.miitmdid.R;
import com.tencent.cos.xml.crypto.JceEncryptionConstants;
import java.io.UnsupportedEncodingException;
import java.lang.ref.SoftReference;
import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidKeySpecException;
import java.util.Locale;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes7.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final byte[] f60354a = new byte[0];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final byte[] f60355b = new byte[0];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static SoftReference<byte[]> f60356c;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final Long f60359a = 120000L;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final byte[] f60360h = new byte[0];

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static volatile a f60361i;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private SharedPreferences f60362b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private SharedPreferences f60363c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private SharedPreferences f60364d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final byte[] f60365e = new byte[0];

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final byte[] f60366f = new byte[0];

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final byte[] f60367g = new byte[0];

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private Context f60368j;

        private a(Context context) {
            this.f60362b = null;
            this.f60363c = null;
            this.f60364d = null;
            try {
                this.f60368j = context.getApplicationContext();
                Context contextA = e.a(context);
                this.f60362b = contextA.getSharedPreferences("identifier_sp_story_book_file", 4);
                this.f60363c = contextA.getSharedPreferences("identifier_hiad_sp_bed_rock_file", 4);
                this.f60364d = contextA.getSharedPreferences("identifier_hiad_sp_red_stone_file", 4);
            } catch (Throwable th2) {
                Log.w("Aes128", "get SharedPreference error: " + th2.getClass().getSimpleName());
            }
        }

        public static a a(Context context) {
            a aVar;
            if (f60361i != null) {
                return f60361i;
            }
            synchronized (f60360h) {
                if (f60361i == null) {
                    f60361i = new a(context);
                }
                aVar = f60361i;
            }
            return aVar;
        }

        public String a() {
            synchronized (this.f60366f) {
                SharedPreferences sharedPreferences = this.f60364d;
                if (sharedPreferences == null) {
                    return "";
                }
                String string = sharedPreferences.getString("read_first_chapter", "");
                if (TextUtils.isEmpty(string)) {
                    return string;
                }
                return d.a(string, d.a(this.f60368j));
            }
        }

        public void a(String str) {
            synchronized (this.f60366f) {
                if (this.f60364d == null) {
                    return;
                }
                byte[] bArrA = d.a(this.f60368j);
                this.f60364d.edit().putString("read_first_chapter", d.b(str, bArrA)).apply();
            }
        }

        public void b() {
            synchronized (this.f60367g) {
                SharedPreferences sharedPreferences = this.f60362b;
                if (sharedPreferences == null) {
                    return;
                }
                sharedPreferences.edit().putLong("read_first_chapter_time", System.currentTimeMillis()).apply();
            }
        }

        public void b(String str) {
            synchronized (this.f60365e) {
                SharedPreferences sharedPreferences = this.f60363c;
                if (sharedPreferences == null) {
                    return;
                }
                sharedPreferences.edit().putString("get_a_book", str).commit();
            }
        }

        public void c(String str) {
            synchronized (this.f60367g) {
                SharedPreferences sharedPreferences = this.f60362b;
                if (sharedPreferences == null) {
                    return;
                }
                sharedPreferences.edit().putString("catch_a_cat", str).commit();
            }
        }

        public boolean c() {
            synchronized (this.f60367g) {
                SharedPreferences sharedPreferences = this.f60362b;
                if (sharedPreferences == null) {
                    return false;
                }
                long j10 = sharedPreferences.getLong("read_first_chapter_time", -1L);
                if (j10 < 0) {
                    return false;
                }
                return j10 + f60359a.longValue() > System.currentTimeMillis();
            }
        }

        public void d() {
            synchronized (this.f60367g) {
                SharedPreferences sharedPreferences = this.f60362b;
                if (sharedPreferences == null) {
                    return;
                }
                sharedPreferences.edit().putBoolean("has_read_first_chapter", true).apply();
            }
        }

        public void d(String str) {
            synchronized (this.f60367g) {
                this.f60362b.edit().putString("read_second_chapter", str).apply();
            }
        }

        public boolean e() {
            synchronized (this.f60367g) {
                SharedPreferences sharedPreferences = this.f60362b;
                if (sharedPreferences == null) {
                    return false;
                }
                return sharedPreferences.getBoolean("has_read_first_chapter", false);
            }
        }

        public String f() {
            synchronized (this.f60365e) {
                SharedPreferences sharedPreferences = this.f60363c;
                if (sharedPreferences == null) {
                    return null;
                }
                return sharedPreferences.getString("get_a_book", null);
            }
        }

        public String g() {
            synchronized (this.f60367g) {
                SharedPreferences sharedPreferences = this.f60362b;
                if (sharedPreferences == null) {
                    return null;
                }
                String string = sharedPreferences.getString("catch_a_cat", null);
                if (string == null) {
                    string = d.a(d.a());
                    c(string);
                }
                return string;
            }
        }

        public String h() {
            String string;
            synchronized (this.f60367g) {
                string = this.f60362b.getString("read_second_chapter", "");
            }
            return string;
        }
    }

    private static String a(Context context, a aVar) {
        String strA = a(b());
        aVar.b(b(strA, d(context)));
        return strA;
    }

    public static String a(String str, String str2) {
        String strA;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return null;
        }
        synchronized (f60354a) {
            try {
                strA = a(str, b(str2));
            } catch (Throwable th2) {
                Log.w("Aes128", "decrypt oaid ex: " + th2.getClass().getSimpleName());
                return null;
            }
        }
        return strA;
    }

    public static String a(String str, byte[] bArr) {
        if (!TextUtils.isEmpty(str) && str.length() >= 32 && bArr != null && bArr.length != 0) {
            try {
                if (d()) {
                    return d(str, bArr);
                }
            } catch (Throwable th2) {
                Log.w("Aes128", "fail to decrypt: " + th2.getClass().getSimpleName());
            }
        }
        return "";
    }

    public static String a(byte[] bArr) {
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

    public static byte[] a() {
        return a(16);
    }

    public static byte[] a(int i10) {
        byte[] bArr = new byte[i10];
        c().nextBytes(bArr);
        return bArr;
    }

    public static byte[] a(Context context) {
        byte[] bArr;
        byte[] bArrC;
        synchronized (f60355b) {
            SoftReference<byte[]> softReference = f60356c;
            bArr = softReference != null ? softReference.get() : null;
            if (bArr == null) {
                try {
                    try {
                        bArrC = b(b(context));
                    } catch (UnsupportedEncodingException unused) {
                        Log.w("Aes128", "getWorkKeyBytes UnsupportedEncodingException");
                        bArrC = c(context);
                    }
                } catch (Throwable th2) {
                    Log.w("Aes128", "getWorkKeyBytes " + th2.getClass().getSimpleName());
                    bArrC = c(context);
                }
                bArr = bArrC;
                f60356c = new SoftReference<>(bArr);
            }
        }
        return bArr;
    }

    private static byte[] a(Context context, String str) {
        return a(str, context.getString(R.string.identifier_hiad_str_2), context.getString(R.string.identifier_hiad_str_3));
    }

    public static byte[] a(String str) {
        byte[] bArr = new byte[0];
        try {
            return b(str);
        } catch (Throwable th2) {
            Log.e("Aes128", "hex string 2 byte: " + th2.getClass().getSimpleName());
            return bArr;
        }
    }

    private static byte[] a(String str, String str2, String str3) {
        byte[] bArrA = a(str);
        byte[] bArrA2 = a(str2);
        return a(a(bArrA, bArrA2), a(str3));
    }

    private static byte[] a(String str, byte[] bArr, byte[] bArr2) {
        if (!TextUtils.isEmpty(str) && c(bArr) && b(bArr2) && d()) {
            try {
                return a(str.getBytes("UTF-8"), bArr, bArr2);
            } catch (UnsupportedEncodingException e10) {
                Log.e("Aes128", "GCM encrypt data error" + e10.getMessage());
            }
        } else {
            Log.i("Aes128", "gcm encrypt param is not right");
        }
        return new byte[0];
    }

    private static byte[] a(byte[] bArr, byte[] bArr2) {
        if (bArr.length <= bArr2.length) {
            bArr2 = bArr;
            bArr = bArr2;
        }
        int length = bArr.length;
        int length2 = bArr2.length;
        byte[] bArr3 = new byte[length];
        int i10 = 0;
        while (i10 < length2) {
            bArr3[i10] = (byte) (bArr2[i10] ^ bArr[i10]);
            i10++;
        }
        while (i10 < bArr.length) {
            bArr3[i10] = bArr[i10];
            i10++;
        }
        return bArr3;
    }

    public static byte[] a(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        String str;
        if (bArr == null || bArr.length == 0) {
            str = "encrypt, contentBytes invalid.";
        } else if (bArr2 == null || bArr2.length < 16) {
            str = "encrypt, keyBytes invalid.";
        } else if (!d()) {
            str = "encrypt, osVersion too low.";
        } else if (bArr3 == null || bArr3.length < 12) {
            str = "encrypt, random invalid.";
        } else {
            try {
                SecretKeySpec secretKeySpec = new SecretKeySpec(bArr2, JceEncryptionConstants.SYMMETRIC_KEY_ALGORITHM);
                Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
                cipher.init(1, secretKeySpec, d(bArr3));
                return cipher.doFinal(bArr);
            } catch (GeneralSecurityException e10) {
                Log.e("Aes128", "GCM encrypt data error" + e10.getMessage());
            }
        }
        Log.i("Aes128", str);
        return new byte[0];
    }

    public static byte[] a(char[] cArr, byte[] bArr) {
        return SecretKeyFactory.getInstance(Build.VERSION.SDK_INT > 26 ? "PBKDF2WithHmacSHA256" : "PBKDF2WithHmacSHA1").generateSecret(new PBEKeySpec(cArr, bArr, 10000, 256)).getEncoded();
    }

    private static String b(int i10) {
        try {
            SecureRandom secureRandomC = c();
            StringBuilder sb2 = new StringBuilder();
            for (int i11 = 0; i11 < i10; i11++) {
                sb2.append(Integer.toHexString(secureRandomC.nextInt(16)));
            }
            return sb2.toString();
        } catch (Throwable th2) {
            Log.w("Aes128", "generate aes key1 err:" + th2.getClass().getSimpleName());
            return "";
        }
    }

    private static String b(Context context) {
        String strA;
        if (context == null) {
            return "";
        }
        synchronized (f60355b) {
            a aVarA = a.a(context);
            String strF = aVarA.f();
            if (strF != null) {
                String strA2 = a(strF, d(context));
                strA = TextUtils.isEmpty(strA2) ? a(context, aVarA) : strA2;
            }
        }
        return strA;
    }

    public static String b(String str, byte[] bArr) {
        StringBuilder sb2;
        if (!TextUtils.isEmpty(str) && bArr != null && bArr.length != 0) {
            try {
                if (d()) {
                    return c(str, bArr);
                }
            } catch (Exception e10) {
                e = e10;
                sb2 = new StringBuilder();
                sb2.append("fail to cipher: ");
                sb2.append(e.getClass().getSimpleName());
                Log.w("Aes128", sb2.toString());
            } catch (Throwable th2) {
                e = th2;
                sb2 = new StringBuilder();
                sb2.append("fail to cipher: ");
                sb2.append(e.getClass().getSimpleName());
                Log.w("Aes128", sb2.toString());
            }
        }
        return "";
    }

    private static boolean b(byte[] bArr) {
        return bArr != null && bArr.length >= 12;
    }

    public static byte[] b() {
        return a(16);
    }

    public static byte[] b(String str) throws UnsupportedEncodingException {
        if (TextUtils.isEmpty(str)) {
            return new byte[0];
        }
        String upperCase = str.toUpperCase(Locale.ENGLISH);
        int length = upperCase.length() / 2;
        byte[] bArr = new byte[length];
        byte[] bytes = upperCase.getBytes("UTF-8");
        for (int i10 = 0; i10 < length; i10++) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("0x");
            int i11 = i10 * 2;
            sb2.append(new String(new byte[]{bytes[i11]}, "UTF-8"));
            bArr[i10] = (byte) (((byte) (Byte.decode(sb2.toString()).byteValue() << 4)) ^ Byte.decode("0x" + new String(new byte[]{bytes[i11 + 1]}, "UTF-8")).byteValue());
        }
        return bArr;
    }

    private static String c(String str) {
        if (!TextUtils.isEmpty(str) && str.length() >= 24) {
            return str.substring(0, 24);
        }
        Log.i("Aes128", "IV is invalid.");
        return "";
    }

    private static String c(String str, byte[] bArr) {
        byte[] bArrA;
        byte[] bArrA2;
        if (TextUtils.isEmpty(str) || bArr == null || bArr.length < 16 || !d() || (bArrA2 = a(str, bArr, (bArrA = a(12)))) == null || bArrA2.length == 0) {
            return "";
        }
        return a(bArrA) + a(bArrA2);
    }

    private static SecureRandom c() {
        SecureRandom instanceStrong;
        try {
            instanceStrong = Build.VERSION.SDK_INT >= 26 ? SecureRandom.getInstanceStrong() : SecureRandom.getInstance("SHA1PRNG");
        } catch (Exception e10) {
            Log.w("Aes128", "getInstanceStrong, exception: " + e10.getClass().getSimpleName());
            instanceStrong = null;
        }
        return instanceStrong == null ? new SecureRandom() : instanceStrong;
    }

    private static boolean c(byte[] bArr) {
        return bArr != null && bArr.length >= 16;
    }

    private static byte[] c(Context context) {
        Log.i("Aes128", "regenerateWorkKey");
        a.a(context).b("");
        return a(b(context));
    }

    private static String d(String str) {
        return (TextUtils.isEmpty(str) || str.length() < 24) ? "" : str.substring(24);
    }

    private static String d(String str, byte[] bArr) {
        if (!TextUtils.isEmpty(str) && bArr != null && bArr.length >= 16 && d()) {
            try {
                SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, JceEncryptionConstants.SYMMETRIC_KEY_ALGORITHM);
                Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
                String strC = c(str);
                String strD = d(str);
                if (TextUtils.isEmpty(strC) || TextUtils.isEmpty(strD)) {
                    Log.i("Aes128", "ivParameter or encrypedWord is null");
                    return "";
                }
                cipher.init(2, secretKeySpec, d(a(strC)));
                return new String(cipher.doFinal(a(strD)), "UTF-8");
            } catch (UnsupportedEncodingException | GeneralSecurityException e10) {
                Log.e("Aes128", "GCM decrypt data exception: " + e10.getMessage());
            }
        }
        return "";
    }

    private static AlgorithmParameterSpec d(byte[] bArr) {
        return new GCMParameterSpec(128, bArr);
    }

    private static boolean d() {
        return true;
    }

    private static byte[] d(Context context) {
        String str;
        if (context == null) {
            return new byte[0];
        }
        a aVarA = a.a(context);
        try {
            return a(a(e(context)).toCharArray(), a(aVarA.g()));
        } catch (NoSuchAlgorithmException unused) {
            str = "get userRootKey NoSuchAlgorithmException";
            Log.w("Aes128", str);
            return null;
        } catch (InvalidKeySpecException unused2) {
            str = "get userRootKey InvalidKeySpecException";
            Log.w("Aes128", str);
            return null;
        }
    }

    private static byte[] e(Context context) {
        return a(context, f(context));
    }

    private static String f(Context context) {
        final a aVarA = a.a(context);
        String strH = aVarA.h();
        if (!TextUtils.isEmpty(strH)) {
            return strH;
        }
        final String strB = b(64);
        e.f60369a.execute(new Runnable() { // from class: com.huawei.hms.ads.identifier.d.1
            @Override // java.lang.Runnable
            public void run() {
                aVarA.d(strB);
            }
        });
        return strB;
    }
}
