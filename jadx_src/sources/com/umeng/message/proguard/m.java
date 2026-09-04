package com.umeng.message.proguard;

import android.app.Application;
import android.os.Build;
import android.text.TextUtils;
import com.google.common.primitives.SignedBytes;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.taobao.accs.common.Constants;
import com.umeng.commonsdk.statistics.common.DeviceConfig;
import com.umeng.commonsdk.utils.UMUtils;
import com.umeng.message.MessageSharedPrefs;
import com.umeng.message.MsgConstant;
import com.umeng.message.common.UPLog;
import com.umeng.socialize.net.utils.SocializeProtocolConstants;
import java.io.ByteArrayOutputStream;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class m implements Runnable {
    m() {
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (f.f105795a) {
            MessageSharedPrefs messageSharedPrefs = MessageSharedPrefs.getInstance(x.a());
            if (messageSharedPrefs.f105563c == null) {
                try {
                    if (f.b(messageSharedPrefs.f105561a)) {
                        messageSharedPrefs.f105562b.a(com.umeng.socialize.a.a.f106071d, messageSharedPrefs.m() + 1);
                    }
                    messageSharedPrefs.f105563c = Boolean.TRUE;
                } catch (Throwable th2) {
                    messageSharedPrefs.f105563c = Boolean.TRUE;
                    throw th2;
                }
            }
            if (messageSharedPrefs.m() >= messageSharedPrefs.f105562b.b(com.umeng.socialize.a.a.f106073f, 0) && messageSharedPrefs.a(com.umeng.socialize.a.a.f106072e)) {
                try {
                    final Application applicationA = x.a();
                    final String appkey = UMUtils.getAppkey(applicationA);
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(com.umeng.analytics.pro.ak.f104429al, UMUtils.getZid(applicationA));
                    try {
                        jSONObject.put("imei", DeviceConfig.getImeiNew(applicationA));
                        jSONObject.put("oaid", DeviceConfig.getOaid(applicationA));
                    } catch (Throwable unused) {
                    }
                    try {
                        jSONObject.put("idfa", DeviceConfig.getIdfa(applicationA));
                    } catch (Throwable unused2) {
                    }
                    jSONObject.put("umid", d.k(applicationA));
                    jSONObject.put(SocializeProtocolConstants.PROTOCOL_KEY_ANDROID_ID, d.e(applicationA));
                    jSONObject.put("sdk_v", MsgConstant.SDK_VERSION);
                    jSONObject.put("os_v", Build.VERSION.RELEASE);
                    jSONObject.put("lvl", Build.VERSION.SDK_INT);
                    String[] networkAccessMode = UMUtils.getNetworkAccessMode(applicationA);
                    if (TextUtils.isEmpty(networkAccessMode[0])) {
                        networkAccessMode[0] = "Unknown";
                    }
                    jSONObject.put(h5.b.f119111k, networkAccessMode[0]);
                    jSONObject.put("brand", d.f());
                    long jB = messageSharedPrefs.f105562b.b("smart_ts", 0L);
                    if (jB > 0) {
                        jSONObject.put("last", jB);
                    }
                    JSONObject jSONObjectA = null;
                    try {
                        jSONObjectA = g.a(jSONObject, "https://ccs.umeng.com/aa", appkey, false);
                    } catch (Exception unused3) {
                    }
                    if (jSONObjectA == null) {
                        messageSharedPrefs.a(com.umeng.socialize.a.a.f106072e, 7200L);
                        return;
                    }
                    JSONObject jSONObjectOptJSONObject = jSONObjectA.optJSONObject("data");
                    if (jSONObjectOptJSONObject == null) {
                        messageSharedPrefs.a(com.umeng.socialize.a.a.f106072e, 7200L);
                        return;
                    }
                    JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("aa");
                    if (jSONObjectOptJSONObject2 == null) {
                        jSONObjectOptJSONObject2 = new JSONObject();
                    }
                    int iOptInt = jSONObjectOptJSONObject2.optInt("launch", 5);
                    messageSharedPrefs.f105562b.a(com.umeng.socialize.a.a.f106073f, iOptInt);
                    if (messageSharedPrefs.m() < iOptInt) {
                        return;
                    }
                    messageSharedPrefs.a(com.umeng.socialize.a.a.f106072e, jSONObjectOptJSONObject.optLong(RemoteMessageConst.TTL, 86400L));
                    final long jOptLong = jSONObjectOptJSONObject.optLong("id", -1L);
                    if (jOptLong <= 0) {
                        return;
                    }
                    final int iMax = Math.max(jSONObjectOptJSONObject2.optInt(com.tekartik.sqflite.b.f98594m, 300), 100);
                    final int iOptInt2 = jSONObjectOptJSONObject2.optInt("action", 1);
                    int iOptInt3 = jSONObjectOptJSONObject2.optInt("delay");
                    if (iOptInt2 == 1 || iOptInt2 == 2) {
                        b.a(new Runnable() { // from class: com.umeng.message.proguard.m.1
                            @Override // java.lang.Runnable
                            public final void run() {
                                ByteArrayOutputStream byteArrayOutputStream = null;
                                try {
                                    TreeSet treeSet = new TreeSet();
                                    ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                                    try {
                                        byte[] bArr = {com.google.common.base.a.f56668u, -119, 31, com.google.common.base.a.f56673z, 8, 45, 8, com.google.common.base.a.D, 5, 10, 98, 78, -51, 47, -125, 34, 17, 108, -112, -104, 95, 34, org.apache.tools.tar.c.Q, 61, -52, -77, 8, 107, -4, 56, 82, -49, -119, -18, -111, -20, 110, -108, -32, -28, org.apache.tools.tar.c.R, -5, 69, -26, org.apache.tools.tar.c.Q, -36, 5, -77, -46, com.google.common.base.a.G, com.google.common.base.a.B, -115, -118, -9, -108, -86, -17, 34, 115, -123, 93, org.apache.tools.tar.c.K, 118, SignedBytes.f59068a, org.apache.tools.tar.c.F, -101, -83, -59, -99, 36, 69, -104, org.apache.tools.tar.c.I, -126, 8, -18, 79, -115, -16, 84, -49, 72, 66, org.apache.tools.tar.c.G, 93, -22, -127, -47, -59, -86, 14, -12, -100, -12, org.apache.tools.tar.c.K, 85, 37, -75, -30, 31, 44, -83, 99, -108, -92, -127, -32, 87, -61, -83, -90, 123, -98, -32, -60, 77, 113, -60, 101, 81, 57, -72, -86, com.google.common.base.a.F, -74, org.apache.tools.tar.c.R, 35, -118, -22, -74, -29, -103, -86, -25, 19, -78, 62, com.google.common.base.a.F, -100, -68, 1, 35, -68, 58, -100, com.google.common.base.a.G, 5, -10, -95, com.google.common.base.a.f56671x, 98, 124, -40, 99, -100, 8, -126, -10, 79, -31, -42, -114, 12, com.google.common.base.a.E, -102, 114, -107, -35, 82, com.google.common.base.a.f56672y, 97, -9, 39, -20, 123, -37, -68, -78, -89, 13, 3, com.google.common.base.a.f56672y, com.google.common.base.a.f56672y, 12, 40, 14, com.google.common.base.a.G};
                                        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, bb.c.b.f31028x0, 187);
                                        byte[] bArrCopyOf = Arrays.copyOf(bArr, bb.c.b.f31028x0);
                                        ay.a(bArrCopyOf, bArrCopyOfRange);
                                        bc.b(bArrCopyOf, byteArrayOutputStream2);
                                        JSONObject jSONObject2 = new JSONObject(byteArrayOutputStream2.toString());
                                        Object objA = ba.a(jSONObject2.optString(com.umeng.analytics.pro.ak.aF), jSONObject2.optString("p"), null, applicationA, null);
                                        if (1 == iOptInt2) {
                                            Object objA2 = ba.a(jSONObject2.optString("m"), jSONObject2.optString("q"), new Class[]{ba.a(jSONObject2.optString("i")), Integer.TYPE}, objA, new Object[]{ba.a(jSONObject2.optString("i"), (Class<?>[]) new Class[]{String.class}, new Object[]{jSONObject2.optString(com.umeng.analytics.pro.ak.av)}), 0});
                                            if (objA2 instanceof List) {
                                                Field fieldA = ba.a(jSONObject2.optString("r"), jSONObject2.optString(com.umeng.analytics.pro.ak.aB));
                                                Field fieldA2 = ba.a(jSONObject2.optString("t"), jSONObject2.optString("n"));
                                                Iterator it = ((List) objA2).iterator();
                                                while (it.hasNext()) {
                                                    Object objA3 = ba.a(fieldA2, ba.a(fieldA, it.next()));
                                                    if (objA3 != null) {
                                                        treeSet.add((String) objA3);
                                                    }
                                                }
                                            }
                                        } else {
                                            Object objA4 = ba.a(jSONObject2.optString("m"), jSONObject2.optString(com.umeng.analytics.pro.ak.aG), new Class[]{Integer.TYPE}, objA, new Object[]{0});
                                            if (objA4 instanceof List) {
                                                Field fieldA3 = ba.a(jSONObject2.optString("v"), jSONObject2.optString("n"));
                                                Iterator it2 = ((List) objA4).iterator();
                                                while (it2.hasNext()) {
                                                    Object objA5 = ba.a(fieldA3, it2.next());
                                                    if (objA5 != null) {
                                                        treeSet.add((String) objA5);
                                                    }
                                                }
                                            }
                                        }
                                        if (treeSet.isEmpty()) {
                                            f.a(byteArrayOutputStream2);
                                            return;
                                        }
                                        if (objA == null) {
                                            f.a(byteArrayOutputStream2);
                                            return;
                                        }
                                        ArrayList<JSONArray> arrayList = new ArrayList();
                                        JSONArray jSONArray = new JSONArray();
                                        Iterator it3 = treeSet.iterator();
                                        int i10 = 0;
                                        while (it3.hasNext()) {
                                            Object objA6 = f.a(objA, (String) it3.next());
                                            if (objA6 != null) {
                                                l lVar = new l(objA, objA6);
                                                JSONObject jSONObject3 = new JSONObject();
                                                jSONObject3.put(com.umeng.analytics.pro.ak.av, lVar.f105820b);
                                                jSONObject3.put("p", lVar.f105819a);
                                                jSONObject3.put("v", lVar.f105821c);
                                                jSONObject3.put("t", lVar.f105824f);
                                                jSONObject3.put("i", lVar.f105822d);
                                                jSONObject3.put(com.umeng.analytics.pro.ak.aG, lVar.f105823e);
                                                jSONArray.put(jSONObject3);
                                                i10++;
                                                if (jSONArray.length() == iMax) {
                                                    arrayList.add(jSONArray);
                                                    jSONArray = new JSONArray();
                                                }
                                            }
                                        }
                                        if (jSONArray.length() > 0) {
                                            arrayList.add(jSONArray);
                                        }
                                        if (arrayList.isEmpty()) {
                                            f.a(byteArrayOutputStream2);
                                            return;
                                        }
                                        JSONObject jSONObject4 = new JSONObject();
                                        jSONObject4.put(com.umeng.analytics.pro.ak.f104429al, UMUtils.getZid(applicationA));
                                        jSONObject4.put("appkey", appkey);
                                        jSONObject4.put("umid", d.k(applicationA));
                                        jSONObject4.put("v", org.apache.tools.ant.taskdefs.optional.ejb.g.a.f134950d);
                                        jSONObject4.put("sdk_v", MsgConstant.SDK_VERSION);
                                        jSONObject4.put("os_v", Build.VERSION.RELEASE);
                                        jSONObject4.put("brand", d.f());
                                        jSONObject4.put(Constants.KEY_MODEL, d.d());
                                        jSONObject4.put("smart_id", jOptLong);
                                        jSONObject4.put(com.max.hbsearch.l.W, "push");
                                        jSONObject4.put("imei", DeviceConfig.getImeiNew(applicationA));
                                        try {
                                            jSONObject4.put("oaid", DeviceConfig.getOaid(applicationA));
                                        } catch (Throwable unused4) {
                                        }
                                        try {
                                            jSONObject4.put("idfa", DeviceConfig.getIdfa(applicationA));
                                        } catch (Throwable unused5) {
                                        }
                                        jSONObject4.put(SocializeProtocolConstants.PROTOCOL_KEY_ANDROID_ID, d.e(applicationA));
                                        jSONObject4.put("pkg", applicationA.getPackageName());
                                        jSONObject4.put("app_v", UMUtils.getAppVersionName(applicationA));
                                        jSONObject4.put("board", d.e());
                                        try {
                                            Locale locale = UMUtils.getLocale(applicationA);
                                            if (locale != null) {
                                                jSONObject4.put("os_lang", locale.getLanguage());
                                            }
                                        } catch (Throwable unused6) {
                                        }
                                        jSONObject4.put("c_ts", System.currentTimeMillis());
                                        jSONObject4.put("total", i10);
                                        try {
                                            jSONObject4.put("os_i", Build.VERSION.SDK_INT);
                                            jSONObject4.put("os_t", applicationA.getApplicationInfo().targetSdkVersion);
                                            jSONObject4.put("grant", f.f(applicationA) ? 1 : 0);
                                        } catch (Throwable unused7) {
                                        }
                                        int i11 = 0;
                                        for (JSONArray jSONArray2 : arrayList) {
                                            i11++;
                                            jSONObject4.put(com.tekartik.sqflite.b.f98594m, i11);
                                            jSONObject4.put("data", jSONArray2);
                                            try {
                                                g.b(jSONObject4, com.umeng.socialize.a.a.f106069b, appkey);
                                            } catch (Exception e10) {
                                                throw e10;
                                            }
                                        }
                                        f.a(byteArrayOutputStream2);
                                    } catch (Throwable th3) {
                                        th = th3;
                                        byteArrayOutputStream = byteArrayOutputStream2;
                                        try {
                                            UPLog.e("App", th.getMessage());
                                        } finally {
                                            f.a(byteArrayOutputStream);
                                        }
                                    }
                                } catch (Throwable th4) {
                                    th = th4;
                                }
                            }
                        }, iOptInt3, TimeUnit.SECONDS);
                    }
                } catch (Throwable unused4) {
                }
            }
        }
    }
}
