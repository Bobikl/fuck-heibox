package com.tencent.connect.auth;

import android.annotation.TargetApi;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Base64;
import com.tencent.connect.common.Constants;
import com.tencent.open.log.SLog;
import com.tencent.open.utils.g;
import com.tencent.open.utils.k;
import com.tencent.open.utils.m;
import com.tencent.open.web.security.JniInterface;
import org.json.JSONObject;

/* JADX INFO: compiled from: ProGuard */
/* JADX INFO: loaded from: classes4.dex */
public class QQToken {
    public static final int AUTH_QQ = 2;
    public static final int AUTH_QZONE = 3;
    public static final int AUTH_WEB = 1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static SharedPreferences f99306g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f99307a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f99308b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f99309c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f99310d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f99311e = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private com.tencent.open.utils.a f99312f;

    public QQToken(String str) {
        this.f99307a = str;
    }

    @TargetApi(11)
    private static synchronized SharedPreferences a() {
        if (f99306g == null) {
            f99306g = g.a().getSharedPreferences("token_info_file", 0);
        }
        return f99306g;
    }

    private static String a(String str) {
        return Base64.encodeToString(m.j(str), 2) + "_aes_google";
    }

    private static synchronized JSONObject a(String str, com.tencent.open.utils.a aVar) {
        String strB;
        if (g.a() == null) {
            SLog.i("QQToken", "loadJsonPreference context null");
            return null;
        }
        if (str == null) {
            SLog.i("QQToken", "loadJsonPreference prefKey is null");
            return null;
        }
        String string = a().getString(a(str), "");
        if (TextUtils.isEmpty(string)) {
            if (!JniInterface.isJniOk) {
                k.a(AuthAgent.SECURE_LIB_FILE_NAME, AuthAgent.SECURE_LIB_NAME, 5);
                JniInterface.loadSo();
            }
            if (!JniInterface.isJniOk) {
                SLog.i("QQToken", "loadJsonPreference jni load fail SECURE_LIB_VERSION=5");
                return null;
            }
            String strC = c(str);
            String string2 = a().getString(strC, "");
            try {
                if (TextUtils.isEmpty(string2)) {
                    String strB2 = b(str);
                    String string3 = a().getString(strB2, "");
                    try {
                        if (TextUtils.isEmpty(string3)) {
                            SLog.i("QQToken", "loadJsonPreference oldDesValue null");
                            return null;
                        }
                        try {
                            strB = JniInterface.d1(string3);
                            if (TextUtils.isEmpty(strB)) {
                                SLog.i("QQToken", "loadJsonPreference decodeResult d1 empty");
                                a().edit().remove(strB2).apply();
                                return null;
                            }
                            a(str, new JSONObject(strB), aVar);
                            a().edit().remove(strB2).apply();
                        } catch (Exception e10) {
                            SLog.e("QQToken", "Catch Exception", e10);
                            a().edit().remove(strB2).apply();
                            return null;
                        }
                    } catch (Throwable th2) {
                        a().edit().remove(strB2).apply();
                        throw th2;
                    }
                } else {
                    try {
                        strB = JniInterface.d2(string2);
                        a(str, new JSONObject(strB), aVar);
                        a().edit().remove(strC).apply();
                    } catch (Exception e11) {
                        SLog.e("QQToken", "Catch Exception", e11);
                        a().edit().remove(strC).apply();
                        return null;
                    }
                }
            } catch (Throwable th3) {
                a().edit().remove(strC).apply();
                throw th3;
            }
            throw th;
        }
        strB = aVar.b(string);
        try {
            JSONObject jSONObject = new JSONObject(strB);
            SLog.i("QQToken", "loadJsonPreference sucess");
            return jSONObject;
        } catch (Exception e12) {
            SLog.i("QQToken", "loadJsonPreference decode " + e12.toString());
            return null;
        }
    }

    private static synchronized boolean a(String str, JSONObject jSONObject, com.tencent.open.utils.a aVar) {
        if (g.a() == null) {
            SLog.i("QQToken", "saveJsonPreference context null");
            return false;
        }
        if (str == null || jSONObject == null) {
            SLog.i("QQToken", "saveJsonPreference prefKey or jsonObject null");
            return false;
        }
        try {
            String string = jSONObject.getString("expires_in");
            if (TextUtils.isEmpty(string)) {
                SLog.i("QQToken", "expires is null");
                return false;
            }
            jSONObject.put(Constants.PARAM_EXPIRES_TIME, System.currentTimeMillis() + (Long.parseLong(string) * 1000));
            String strA = a(str);
            String strA2 = aVar.a(jSONObject.toString());
            if (strA.length() > 6 && strA2 != null) {
                a().edit().putString(strA, strA2).commit();
                SLog.i("QQToken", "saveJsonPreference sucess");
                return true;
            }
            SLog.i("QQToken", "saveJsonPreference keyEncode or josnEncode null");
            return false;
        } catch (Exception e10) {
            SLog.e("QQToken", "saveJsonPreference exception:" + e10.toString());
            return false;
        }
    }

    @Deprecated
    private static String b(String str) {
        return Base64.encodeToString(m.j(str), 2);
    }

    @Deprecated
    private static String c(String str) {
        return Base64.encodeToString(m.j(str), 2) + "_spkey";
    }

    public String getAccessToken() {
        return this.f99308b;
    }

    public String getAppId() {
        return this.f99307a;
    }

    public int getAuthSource() {
        return this.f99310d;
    }

    public long getExpireTimeInSecond() {
        return this.f99311e;
    }

    public String getOpenId() {
        return this.f99309c;
    }

    public String getOpenIdWithCache() {
        String openId = getOpenId();
        try {
            if (TextUtils.isEmpty(openId)) {
                JSONObject jSONObjectLoadSession = loadSession(this.f99307a);
                if (jSONObjectLoadSession != null) {
                    openId = jSONObjectLoadSession.getString("openid");
                    if (!TextUtils.isEmpty(openId)) {
                        setOpenId(openId);
                    }
                }
                SLog.i("QQToken", "getOpenId from Session openId = " + openId + " appId = " + this.f99307a);
            } else {
                SLog.i("QQToken", "getOpenId from field openId = " + openId + " appId = " + this.f99307a);
            }
        } catch (Exception e10) {
            SLog.i("QQToken", "getLocalOpenIdByAppId " + e10.toString());
        }
        return openId;
    }

    public boolean isSessionValid() {
        return this.f99308b != null && System.currentTimeMillis() < this.f99311e;
    }

    public JSONObject loadSession(String str) {
        try {
            if (this.f99312f == null) {
                this.f99312f = new com.tencent.open.utils.a(g.a());
            }
            return a(str, this.f99312f);
        } catch (Exception e10) {
            SLog.i("QQToken", "login loadSession" + e10.toString());
            return null;
        }
    }

    public void removeSession(String str) {
        SharedPreferences.Editor editorEdit = a().edit();
        editorEdit.remove(c(str));
        editorEdit.remove(c(str));
        editorEdit.remove(a(str));
        editorEdit.apply();
        SLog.i("QQToken", "removeSession sucess");
    }

    public boolean saveSession(JSONObject jSONObject) {
        try {
            if (this.f99312f == null) {
                this.f99312f = new com.tencent.open.utils.a(g.a());
            }
            return a(this.f99307a, jSONObject, this.f99312f);
        } catch (Exception e10) {
            SLog.i("QQToken", "login saveSession" + e10.toString());
            return false;
        }
    }

    public void setAccessToken(String str, String str2) throws NumberFormatException {
        this.f99308b = str;
        this.f99311e = 0L;
        if (str2 != null) {
            this.f99311e = System.currentTimeMillis() + (Long.parseLong(str2) * 1000);
        }
    }

    public void setAppId(String str) {
        this.f99307a = str;
    }

    public void setAuthSource(int i10) {
        this.f99310d = i10;
    }

    public void setOpenId(String str) {
        this.f99309c = str;
        com.tencent.open.b.b.a().a(str);
    }
}
