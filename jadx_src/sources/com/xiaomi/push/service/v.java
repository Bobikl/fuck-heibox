package com.xiaomi.push.service;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.text.TextUtils;
import com.taobao.accs.common.Constants;
import com.xiaomi.push.BuildConfig;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static u f108043a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static a f1115a;

    public interface a {
        void a();
    }

    private static int a(Context context) {
        return context.getSharedPreferences("mipush_account", 0).getInt("enc_req_fail_count", 0);
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public static synchronized u m773a(Context context) {
        u uVar = f108043a;
        if (uVar != null) {
            return uVar;
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences("mipush_account", 0);
        String string = sharedPreferences.getString("uuid", null);
        String string2 = sharedPreferences.getString("token", null);
        String string3 = sharedPreferences.getString("security", null);
        String string4 = sharedPreferences.getString("app_id", null);
        String string5 = sharedPreferences.getString("app_token", null);
        String string6 = sharedPreferences.getString("package_name", null);
        String string7 = sharedPreferences.getString("device_id", null);
        int i10 = sharedPreferences.getInt("env_type", 1);
        if (!TextUtils.isEmpty(string7) && com.xiaomi.push.i.a(string7)) {
            string7 = com.xiaomi.push.i.g(context);
            sharedPreferences.edit().putString("device_id", string7).commit();
        }
        if (TextUtils.isEmpty(string) || TextUtils.isEmpty(string2) || TextUtils.isEmpty(string3)) {
            return null;
        }
        String strG = com.xiaomi.push.i.g(context);
        if (!"com.xiaomi.xmsf".equals(context.getPackageName()) && !TextUtils.isEmpty(strG) && !TextUtils.isEmpty(string7) && !string7.equals(strG)) {
            com.xiaomi.channel.commonutils.logger.b.m62a("read_phone_state permission changes.");
        }
        u uVar2 = new u(string, string2, string3, string4, string5, string6, i10);
        f108043a = uVar2;
        return uVar2;
    }

    /* JADX WARN: Code duplicated, block: B:103:0x031f  */
    /* JADX WARN: Code duplicated, block: B:11:0x0044  */
    public static synchronized u a(Context context, String str, String str2, String str3) {
        String strSubstring;
        PackageInfo packageInfo;
        boolean z10;
        com.xiaomi.push.be beVarA;
        TreeMap treeMap = new TreeMap();
        treeMap.put("devid", com.xiaomi.push.i.a(context, false));
        u uVar = f108043a;
        if (uVar == null || TextUtils.isEmpty(uVar.f1114a)) {
            strSubstring = null;
        } else {
            treeMap.put("uuid", f108043a.f1114a);
            int iLastIndexOf = f108043a.f1114a.lastIndexOf("/");
            if (iLastIndexOf != -1) {
                strSubstring = f108043a.f1114a.substring(iLastIndexOf + 1);
            } else {
                strSubstring = null;
            }
        }
        com.xiaomi.push.ax.a(context).a(treeMap);
        String str4 = m776a(context) ? "1000271" : str2;
        String str5 = m776a(context) ? "420100086271" : str3;
        String str6 = m776a(context) ? "com.xiaomi.xmsf" : str;
        treeMap.put("appid", str4);
        treeMap.put("apptoken", str5);
        try {
            packageInfo = context.getPackageManager().getPackageInfo(str6, 16384);
        } catch (Exception e10) {
            com.xiaomi.channel.commonutils.logger.b.a(e10);
            packageInfo = null;
        }
        treeMap.put("appversion", packageInfo != null ? String.valueOf(packageInfo.versionCode) : "0");
        treeMap.put("sdkversion", Integer.toString(BuildConfig.VERSION_CODE));
        treeMap.put("packagename", str6);
        treeMap.put(Constants.KEY_MODEL, Build.MODEL);
        treeMap.put("board", Build.BOARD);
        if (!com.xiaomi.push.j.m526d()) {
            String strC = com.xiaomi.push.i.c(context);
            String str7 = TextUtils.isEmpty(strC) ? "" : "" + com.xiaomi.push.bp.a(strC);
            String strE = com.xiaomi.push.i.e(context);
            if (!TextUtils.isEmpty(str7) && !TextUtils.isEmpty(strE)) {
                str7 = str7 + com.xiaomi.mipush.sdk.Constants.ACCEPT_TIME_SEPARATOR_SP + strE;
            }
            if (!TextUtils.isEmpty(str7)) {
                treeMap.put(com.xiaomi.mipush.sdk.Constants.EXTRA_KEY_IMEI_MD5, str7);
            }
        }
        treeMap.put("os", Build.VERSION.RELEASE + com.xiaomi.mipush.sdk.Constants.ACCEPT_TIME_SEPARATOR_SERVER + Build.VERSION.INCREMENTAL);
        int iA = com.xiaomi.push.i.a();
        if (iA >= 0) {
            treeMap.put("space_id", Integer.toString(iA));
        }
        treeMap.put("brand", Build.BRAND + "");
        treeMap.put("ram", com.xiaomi.push.i.m465a());
        treeMap.put("rom", com.xiaomi.push.i.m470b());
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry entry : treeMap.entrySet()) {
            try {
                jSONObject.put((String) entry.getKey(), entry.getValue());
            } catch (JSONException e11) {
                com.xiaomi.channel.commonutils.logger.b.d("failed to add data in json format: k=" + ((String) entry.getKey()) + ",v=" + ((String) entry.getValue()) + ". " + e11);
            }
        }
        String strA = bt.a(jSONObject.toString());
        TreeMap treeMap2 = new TreeMap();
        treeMap2.put("requestData", strA);
        treeMap2.put("keyPairVer", "1");
        if (a(context) >= 2 || TextUtils.isEmpty(strA)) {
            z10 = false;
        } else {
            com.xiaomi.channel.commonutils.logger.b.m62a("r.data = " + strA);
            z10 = true;
        }
        String strA2 = a(context, z10);
        if (TextUtils.isEmpty(strA2)) {
            return null;
        }
        if (z10) {
            treeMap = treeMap2;
        }
        try {
            beVarA = com.xiaomi.push.bg.a(context, strA2, treeMap);
        } catch (IOException e12) {
            com.xiaomi.channel.commonutils.logger.b.d("device registration request failed. " + e12);
            beVarA = null;
        }
        if (beVarA != null && beVarA.f106866a == 200) {
            String strA3 = beVarA.a();
            if (!TextUtils.isEmpty(strA3)) {
                try {
                    JSONObject jSONObject2 = new JSONObject(strA3);
                    try {
                        if (jSONObject2.getInt("code") == 0) {
                            JSONObject jSONObject3 = jSONObject2.getJSONObject("data");
                            String string = jSONObject3.getString("ssecurity");
                            String string2 = jSONObject3.getString("token");
                            String string3 = jSONObject3.getString("userId");
                            if (TextUtils.isEmpty(strSubstring)) {
                                strSubstring = x5.a.f141076u + com.xiaomi.push.bp.a(6);
                            }
                            u uVar2 = new u(string3 + "@xiaomi.com/" + strSubstring, string2, string, str4, str5, str6, com.xiaomi.push.aa.a());
                            a(context, uVar2);
                            f108043a = uVar2;
                            a(context, 0);
                            com.xiaomi.channel.commonutils.logger.b.m62a("device registration is successful. " + string3);
                            return uVar2;
                        }
                        y.a(context, jSONObject2.getInt("code"), jSONObject2.optString("description"));
                        com.xiaomi.channel.commonutils.logger.b.m62a("device registration resp: " + strA3);
                    } catch (JSONException e13) {
                        e = e13;
                        com.xiaomi.channel.commonutils.logger.b.d("failed to parse respone json data. " + e);
                    } catch (Throwable th2) {
                        th = th2;
                        com.xiaomi.channel.commonutils.logger.b.d("unknow throwable. " + th);
                    }
                } catch (JSONException e14) {
                    e = e14;
                } catch (Throwable th3) {
                    th = th3;
                }
                com.xiaomi.channel.commonutils.logger.b.d("failed to parse respone json data. " + e);
            }
        }
        if (z10 && com.xiaomi.push.bg.c(context)) {
            a(context, a(context) + 1);
        }
        com.xiaomi.channel.commonutils.logger.b.m62a("fail to register push account. meet error.");
        return null;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public static String m774a(Context context) {
        u uVarM773a = m773a(context);
        if (uVarM773a != null && !TextUtils.isEmpty(uVarM773a.f1114a)) {
            String[] strArrSplit = uVarM773a.f1114a.split("@");
            if (strArrSplit.length > 0) {
                return strArrSplit[0];
            }
        }
        return null;
    }

    private static String a(Context context, boolean z10) {
        String strA = com.xiaomi.push.service.a.a(context).a();
        String str = z10 ? "/pass/v2/register/encrypt" : "/pass/v2/register";
        if (com.xiaomi.push.aa.b()) {
            return "http://10.38.162.35:9085" + str;
        }
        if (!com.xiaomi.push.m.China.name().equals(strA)) {
            return null;
        }
        return "https://cn.register.xmpush.xiaomi.com" + str;
    }

    public static void a() {
        a aVar = f1115a;
        if (aVar != null) {
            aVar.a();
        }
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public static void m775a(Context context) {
        context.getSharedPreferences("mipush_account", 0).edit().clear().commit();
        f108043a = null;
        a();
    }

    private static void a(Context context, int i10) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("mipush_account", 0).edit();
        editorEdit.putInt("enc_req_fail_count", i10);
        editorEdit.commit();
    }

    public static void a(Context context, u uVar) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("mipush_account", 0).edit();
        editorEdit.putString("uuid", uVar.f1114a);
        editorEdit.putString("security", uVar.f108039c);
        editorEdit.putString("token", uVar.f108038b);
        editorEdit.putString("app_id", uVar.f108040d);
        editorEdit.putString("package_name", uVar.f108042f);
        editorEdit.putString("app_token", uVar.f108041e);
        editorEdit.putString("device_id", com.xiaomi.push.i.g(context));
        editorEdit.putInt("env_type", uVar.f108037a);
        editorEdit.commit();
        a();
    }

    public static void a(a aVar) {
        f1115a = aVar;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    private static boolean m776a(Context context) {
        return context.getPackageName().equals("com.xiaomi.xmsf");
    }
}
