package com.umeng.ut.b.b;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.common.primitives.SignedBytes;
import com.taobao.accs.common.Constants;
import java.io.ByteArrayOutputStream;
import java.util.Random;
import java.util.regex.Pattern;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import org.android.agoo.common.Config;

/* JADX INFO: loaded from: classes4.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static d f106444a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private Context f78a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f106446c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f106447d = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Pattern f106445b = Pattern.compile("[^0-9a-zA-Z=/+]+");

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static final Object f77a = new Object();

    private d(Context context) {
        this.f78a = context.getApplicationContext();
        com.umeng.ut.a.a.a().a(this.f78a);
    }

    private SharedPreferences a(String str) {
        return this.f78a.getSharedPreferences(str, 0);
    }

    public static d a(Context context) {
        if (context != null && f106444a == null) {
            synchronized (f77a) {
                if (f106444a == null) {
                    f106444a = new d(context);
                }
            }
        }
        return f106444a;
    }

    private static String a(byte[] bArr) throws Exception {
        byte[] bArr2 = {69, 114, 116, -33, 125, -54, -31, 86, -11, 11, -78, -96, -17, -99, SignedBytes.f59068a, com.google.common.base.a.A, -95, -126, -82, -64, 113, 116, -16, -103, org.apache.tools.tar.c.G, -30, 9, -39, 33, -80, -68, -78, -117, org.apache.tools.tar.c.K, com.google.common.base.a.H, -122, SignedBytes.f59068a, -104, 74, -49, 106, 85, -38, -93};
        Mac mac = Mac.getInstance("HmacSHA1");
        mac.init(new SecretKeySpec(com.umeng.ut.a.c.d.b(bArr2), mac.getAlgorithm()));
        return com.umeng.ut.b.a.a.a.a(mac.doFinal(bArr), 2);
    }

    private void a(String str, boolean z10) {
        if (b(str)) {
            if (str.endsWith("\n")) {
                str = str.substring(0, str.length() - 1);
            }
            if (str.length() == 24) {
                b(str, z10);
            }
        }
    }

    private byte[] a() throws Exception {
        String strF;
        com.umeng.ut.a.c.e.m56a("UTUtdid", "generate UTDid");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int iCurrentTimeMillis = (int) (System.currentTimeMillis() / 1000);
        int iNextInt = new Random().nextInt();
        byte[] bytes = com.umeng.ut.b.a.a.b.getBytes(iCurrentTimeMillis);
        byte[] bytes2 = com.umeng.ut.b.a.a.b.getBytes(iNextInt);
        byteArrayOutputStream.write(bytes, 0, 4);
        byteArrayOutputStream.write(bytes2, 0, 4);
        byteArrayOutputStream.write(3);
        byteArrayOutputStream.write(0);
        try {
            strF = com.umeng.ut.b.a.a.c.f();
        } catch (Exception unused) {
            strF = "" + new Random().nextInt();
        }
        byteArrayOutputStream.write(com.umeng.ut.b.a.a.b.getBytes(com.umeng.ut.b.a.a.d.a(strF)), 0, 4);
        byteArrayOutputStream.write(com.umeng.ut.b.a.a.b.getBytes(com.umeng.ut.b.a.a.d.a(a(byteArrayOutputStream.toByteArray()))));
        return byteArrayOutputStream.toByteArray();
    }

    @SuppressLint({"ApplySharedPref"})
    private void b(String str, boolean z10) {
        try {
            a("um_push_ut").edit().putString("d_id", str).putBoolean("t_f", z10).commit();
        } catch (Throwable unused) {
        }
    }

    private boolean b(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (str.endsWith("\n")) {
            str = str.substring(0, str.length() - 1);
        }
        if (24 == str.length()) {
            return !f106445b.matcher(str).find();
        }
        return false;
    }

    private long c() {
        long j10;
        try {
            j10 = a("um_push_ut").getLong("v_i", 604800L);
        } catch (Throwable unused) {
            j10 = 0;
        }
        if (j10 < 600) {
            j10 = 600;
        } else if (j10 > 7776000) {
            j10 = 7776000;
        }
        return j10 * 1000;
    }

    /* JADX INFO: renamed from: c, reason: collision with other method in class */
    private boolean m59c() {
        try {
            return a("um_push_ut").getBoolean("v_r", true);
        } catch (Throwable unused) {
            return true;
        }
    }

    @SuppressLint({"ApplySharedPref"})
    private void e() {
        try {
            a("um_push_ut").edit().remove("v_r").commit();
        } catch (Throwable unused) {
        }
    }

    private synchronized String j() {
        boolean z10 = m59c() || !com.umeng.ut.a.c.a.a(this.f78a);
        if (z10) {
            String strL = l();
            this.f106446c = strL;
            if (!com.umeng.ut.b.a.a.d.isEmpty(strL) && b(this.f106446c)) {
                return this.f106446c;
            }
            String strK = k();
            this.f106446c = strK;
            if (!com.umeng.ut.b.a.a.d.isEmpty(strK) && b(this.f106446c)) {
                a(this.f106446c, false);
                return this.f106446c;
            }
        }
        try {
            byte[] bArrA = a();
            if (bArrA != null) {
                String strA = com.umeng.ut.b.a.a.a.a(bArrA, 2);
                this.f106446c = strA;
                a(strA, true);
                if (!z10) {
                    e();
                }
                return this.f106446c;
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        return null;
    }

    private String k() {
        try {
            SharedPreferences sharedPreferencesA = a(Config.PREFERENCES);
            String string = sharedPreferencesA.getString("deviceId", null);
            if (string == null || string.length() <= 0) {
                return null;
            }
            String string2 = sharedPreferencesA.getString("utdid", null);
            if (string2 != null) {
                try {
                    if (string2.length() == 0) {
                    }
                } catch (Throwable unused) {
                }
                return string2;
            }
            return a(Constants.SP_FILE_NAME).getString("utdid", null);
        } catch (Throwable unused2) {
            return null;
        }
    }

    private String l() {
        try {
            return a("um_push_ut").getString("d_id", null);
        } catch (Throwable unused) {
            return null;
        }
    }

    @SuppressLint({"ApplySharedPref"})
    void a(String str, long j10) {
        boolean z10;
        try {
            SharedPreferences.Editor editorEdit = a("um_push_ut").edit();
            boolean z11 = true;
            if (j10 > 0) {
                editorEdit.putLong("v_i", j10);
                editorEdit.putLong("v_ts", System.currentTimeMillis());
                z10 = true;
            } else {
                z10 = false;
            }
            if (str == null || "-1".equals(str) || str.length() < 2 || str.length() > 128) {
                z11 = z10;
            } else {
                editorEdit.putString("t_id", str);
                editorEdit.putBoolean("v_r", false);
            }
            if (z11) {
                editorEdit.commit();
            }
        } catch (Throwable unused) {
        }
    }

    @SuppressLint({"ApplySharedPref"})
    public boolean b() {
        try {
            SharedPreferences sharedPreferencesA = a("um_push_ut");
            if (this.f106447d == -1) {
                this.f106447d = sharedPreferencesA.getLong("v_ts", 0L);
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (Math.abs(jCurrentTimeMillis - this.f106447d) >= c()) {
                this.f106447d = jCurrentTimeMillis;
                sharedPreferencesA.edit().putLong("v_ts", jCurrentTimeMillis).commit();
                com.umeng.ut.a.c.e.m56a("UTUtdid", "req valid");
                return true;
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    boolean d() {
        try {
            return a("um_push_ut").getBoolean("t_f", false);
        } catch (Throwable unused) {
            return false;
        }
    }

    @SuppressLint({"ApplySharedPref"})
    void f() {
        try {
            a("um_push_ut").edit().remove("t_id").remove("t_f").commit();
        } catch (Throwable unused) {
        }
    }

    synchronized String getValue() {
        String str = this.f106446c;
        if (str != null) {
            return str;
        }
        return j();
    }

    String m() {
        String string;
        try {
            string = a("um_push_ut").getString("t_id", null);
        } catch (Throwable unused) {
            string = null;
        }
        if (string != null && !"-1".equals(string) && string.length() >= 2 && string.length() <= 128) {
            return string;
        }
        return null;
    }
}
