package com.huawei.hms.opendevice;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.huawei.android.hms.openid.R;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.IOUtils;
import com.huawei.secure.android.common.encrypt.utils.BaseKeyUtil;
import com.huawei.secure.android.common.encrypt.utils.EncryptUtil;
import com.huawei.secure.android.common.encrypt.utils.RootKeyUtil;
import com.huawei.secure.android.common.encrypt.utils.WorkKeyCryptUtil;
import com.huawei.secure.android.common.util.IOUtil;
import com.umeng.analytics.pro.ak;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: SecretUtil.java */
/* JADX INFO: loaded from: classes7.dex */
public abstract class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f61185a = "o";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Map<String, String> f61186b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f61187c = new Object();

    private static String a() {
        return "2A57086C86EF54970C1E6EB37BFC72B1";
    }

    private static String a(String str) {
        String str2 = f61186b.get(str);
        return TextUtils.isEmpty(str2) ? "" : str2;
    }

    private static void a(String str, Context context) throws Throwable {
        String strC = d.c(context.getApplicationContext());
        if (TextUtils.isEmpty(strC)) {
            return;
        }
        try {
            a(ak.aB, str, strC + "/files/s");
        } catch (IOException unused) {
            HMSLog.e(f61185a, "save keyS IOException.");
        }
    }

    private static void a(String str, String str2, String str3) throws Throwable {
        OutputStreamWriter outputStreamWriter;
        HMSLog.i(f61185a, "save local secret key.");
        BufferedWriter bufferedWriter = null;
        try {
            File file = new File(str3);
            p.a(file);
            outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), "UTF-8");
            try {
                BufferedWriter bufferedWriter2 = new BufferedWriter(outputStreamWriter);
                try {
                    bufferedWriter2.write(str2);
                    bufferedWriter2.flush();
                    f61186b.put(str, str2);
                    IOUtils.closeQuietly((Writer) outputStreamWriter);
                    IOUtils.closeQuietly((Writer) bufferedWriter2);
                } catch (Throwable th2) {
                    th = th2;
                    bufferedWriter = bufferedWriter2;
                    IOUtils.closeQuietly((Writer) outputStreamWriter);
                    IOUtils.closeQuietly((Writer) bufferedWriter);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Throwable th4) {
            th = th4;
            outputStreamWriter = null;
        }
    }

    private static void a(String str, String str2, String str3, String str4, String str5, Context context) throws Throwable {
        String strC = d.c(context.getApplicationContext());
        if (TextUtils.isEmpty(strC)) {
            return;
        }
        try {
            a("m", str, strC + "/files/math/m");
            a("p", str2, strC + "/files/panda/p");
            a("d", str3, strC + "/files/panda/d");
            a("t", str4, strC + "/files/math/t");
            a(ak.aB, str5, strC + "/files/s");
        } catch (IOException unused) {
            HMSLog.e(f61185a, "save key IOException.");
        }
    }

    public static byte[] a(Context context) {
        byte[] bArrA = c.a(context.getString(R.string.push_cat_head));
        byte[] bArrA2 = c.a(context.getString(R.string.push_cat_body));
        return a(a(a(bArrA, bArrA2), c.a(a())));
    }

    private static byte[] a(String str, String str2, String str3, String str4) {
        return Build.VERSION.SDK_INT >= 26 ? BaseKeyUtil.exportRootKey(str, str2, str3, str4, 32, true) : BaseKeyUtil.exportRootKey(str, str2, str3, str4, 32, false);
    }

    private static byte[] a(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return new byte[0];
        }
        for (int i10 = 0; i10 < bArr.length; i10++) {
            bArr[i10] = (byte) (bArr[i10] >> 2);
        }
        return bArr;
    }

    private static byte[] a(byte[] bArr, byte[] bArr2) {
        if (bArr == null || bArr2 == null || bArr.length == 0 || bArr2.length == 0) {
            return new byte[0];
        }
        int length = bArr.length;
        if (length != bArr2.length) {
            return new byte[0];
        }
        byte[] bArr3 = new byte[length];
        for (int i10 = 0; i10 < length; i10++) {
            bArr3[i10] = (byte) (bArr[i10] ^ bArr2[i10]);
        }
        return bArr3;
    }

    public static String b(Context context) {
        if (!i()) {
            HMSLog.i(f61185a, "work key is empty, execute init.");
            c(context);
        }
        String strDecryptWorkKey = WorkKeyCryptUtil.decryptWorkKey(f(), b());
        return q.a(strDecryptWorkKey) ? strDecryptWorkKey : e(context);
    }

    private static byte[] b() {
        return a(d(), e(), c(), g());
    }

    private static String c() {
        return a("d");
    }

    public static void c(Context context) {
        synchronized (f61187c) {
            d(context.getApplicationContext());
            if (i()) {
                HMSLog.i(f61185a, "The local secret is already in separate file mode.");
                return;
            }
            File file = new File(d.c(context.getApplicationContext()) + "/shared_prefs/LocalAvengers.xml");
            if (file.exists()) {
                IOUtil.deleteSecure(file);
                HMSLog.i(f61185a, "destroy C, delete file LocalAvengers.xml.");
            }
            byte[] bArrGenerateSecureRandom = EncryptUtil.generateSecureRandom(32);
            byte[] bArrGenerateSecureRandom2 = EncryptUtil.generateSecureRandom(32);
            byte[] bArrGenerateSecureRandom3 = EncryptUtil.generateSecureRandom(32);
            byte[] bArrGenerateSecureRandom4 = EncryptUtil.generateSecureRandom(32);
            String strA = c.a(bArrGenerateSecureRandom);
            String strA2 = c.a(bArrGenerateSecureRandom2);
            String strA3 = c.a(bArrGenerateSecureRandom3);
            String strA4 = c.a(bArrGenerateSecureRandom4);
            a(strA, strA2, strA3, strA4, WorkKeyCryptUtil.encryptWorkKey(c.a(EncryptUtil.generateSecureRandom(32)), a(strA, strA2, strA3, strA4)), context);
            HMSLog.i(f61185a, "generate D.");
        }
    }

    private static String d() {
        return a("m");
    }

    private static void d(Context context) throws Throwable {
        if (i()) {
            HMSLog.i(f61185a, "secretKeyCache not empty.");
            return;
        }
        f61186b.clear();
        String strC = d.c(context);
        if (TextUtils.isEmpty(strC)) {
            return;
        }
        String strA = p.a(strC + "/files/math/m");
        String strA2 = p.a(strC + "/files/panda/p");
        String strA3 = p.a(strC + "/files/panda/d");
        String strA4 = p.a(strC + "/files/math/t");
        String strA5 = p.a(strC + "/files/s");
        if (q.a(strA, strA2, strA3, strA4, strA5)) {
            f61186b.put("m", strA);
            f61186b.put("p", strA2);
            f61186b.put("d", strA3);
            f61186b.put("t", strA4);
            f61186b.put(ak.aB, strA5);
        }
    }

    private static String e() {
        return a("p");
    }

    private static synchronized String e(Context context) {
        String strDecryptWorkKey = WorkKeyCryptUtil.decryptWorkKey(f(), b());
        if (q.a(strDecryptWorkKey)) {
            HMSLog.i(f61185a, "keyS has been upgraded, no require operate again.");
            return strDecryptWorkKey;
        }
        String strDecryptWorkKey2 = WorkKeyCryptUtil.decryptWorkKey(f(), h());
        if (q.a(strDecryptWorkKey2)) {
            HMSLog.i(f61185a, "keyS is encrypt by RootKeyUtil, upgrade encrypt mode.");
            a(WorkKeyCryptUtil.encryptWorkKey(strDecryptWorkKey2, b()), context);
            return strDecryptWorkKey2;
        }
        String strDecryptWorkKey3 = WorkKeyCryptUtil.decryptWorkKey(f(), BaseKeyUtil.exportRootKey(d(), e(), c(), g(), 32, false));
        if (!q.a(strDecryptWorkKey3)) {
            HMSLog.e(f61185a, "all mode unable to decrypt root key.");
            return "";
        }
        HMSLog.i(f61185a, "keyS is encrypt by ExportRootKey with sha1, upgrade encrypt mode to sha256.");
        a(WorkKeyCryptUtil.encryptWorkKey(strDecryptWorkKey3, b()), context);
        return strDecryptWorkKey3;
    }

    private static String f() {
        return a(ak.aB);
    }

    private static String g() {
        return a("t");
    }

    private static RootKeyUtil h() {
        return RootKeyUtil.newInstance(d(), e(), c(), g());
    }

    private static boolean i() {
        return !TextUtils.isEmpty(f());
    }
}
