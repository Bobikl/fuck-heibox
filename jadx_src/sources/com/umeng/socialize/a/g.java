package com.umeng.socialize.a;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.google.common.primitives.SignedBytes;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.taobao.accs.common.Constants;
import com.umeng.analytics.pro.ak;
import com.umeng.commonsdk.statistics.common.DeviceConfig;
import com.umeng.commonsdk.utils.UMUtils;
import com.umeng.socialize.UMShareAPI;
import com.umeng.socialize.net.utils.SocializeProtocolConstants;
import com.umeng.socialize.utils.ContextUtil;
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

/* JADX INFO: compiled from: UMAppScanTask.java */
/* JADX INFO: loaded from: classes4.dex */
public final class g implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f106092a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f106093b = 2;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f106094c = "AZX";

    g() {
    }

    @Override // java.lang.Runnable
    public void run() {
        if (UMShareAPI.getSmartEnableFlag()) {
            e eVarA = e.a(ContextUtil.getContext());
            eVarA.e();
            int iC = eVarA.c();
            long jD = eVarA.d();
            if (jD < iC) {
                if (a.f106070c) {
                    m.a(f106094c, "launch times skipped. times:", Long.valueOf(jD), " config:", Integer.valueOf(iC));
                    return;
                }
                return;
            }
            if (!eVarA.b()) {
                if (a.f106070c) {
                    m.a(f106094c, "interval skipped.");
                    return;
                }
                return;
            }
            try {
                final Context context = ContextUtil.getContext();
                final String appkey = UMUtils.getAppkey(context);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(ak.f104429al, UMUtils.getZid(context));
                try {
                    jSONObject.put("imei", DeviceConfig.getImeiNew(context));
                    jSONObject.put("oaid", DeviceConfig.getOaid(context));
                } catch (Throwable unused) {
                }
                try {
                    jSONObject.put("idfa", DeviceConfig.getIdfa(context));
                } catch (Throwable unused2) {
                }
                jSONObject.put("umid", UMUtils.getUMId(context));
                jSONObject.put(SocializeProtocolConstants.PROTOCOL_KEY_ANDROID_ID, DeviceConfig.getAndroidId(context));
                jSONObject.put("sdk_v", "7.3.2");
                jSONObject.put("os_v", Build.VERSION.RELEASE);
                jSONObject.put("lvl", Build.VERSION.SDK_INT);
                String[] networkAccessMode = UMUtils.getNetworkAccessMode(context);
                if (TextUtils.isEmpty(networkAccessMode[0])) {
                    networkAccessMode[0] = "Unknown";
                }
                jSONObject.put(h5.b.f119111k, networkAccessMode[0]);
                jSONObject.put("brand", c.a());
                long jA = eVarA.a();
                if (jA > 0) {
                    jSONObject.put("last", jA);
                }
                JSONObject jSONObjectA = null;
                try {
                    jSONObjectA = d.a(jSONObject, a.f106068a, appkey, a.f106070c);
                } catch (Exception e10) {
                    if (a.f106070c) {
                        m.d(f106094c, "request failed. ", e10.getMessage());
                    }
                }
                if (jSONObjectA == null) {
                    if (a.f106070c) {
                        m.a(f106094c, "response == null");
                    }
                    eVarA.a(7200L);
                    return;
                }
                JSONObject jSONObjectOptJSONObject = jSONObjectA.optJSONObject("data");
                if (jSONObjectOptJSONObject == null) {
                    if (a.f106070c) {
                        m.a(f106094c, "data empty skipped.");
                    }
                    eVarA.a(7200L);
                    return;
                }
                JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("aa");
                if (jSONObjectOptJSONObject2 == null) {
                    jSONObjectOptJSONObject2 = new JSONObject();
                }
                int iOptInt = jSONObjectOptJSONObject2.optInt("launch", 5);
                eVarA.a(iOptInt);
                if (eVarA.d() < iOptInt) {
                    if (a.f106070c) {
                        m.a(f106094c, "launch times skipped. config:", Integer.valueOf(iOptInt));
                        return;
                    }
                    return;
                }
                eVarA.a(jSONObjectOptJSONObject.optLong(RemoteMessageConst.TTL, 86400L));
                final long jOptLong = jSONObjectOptJSONObject.optLong("id", -1L);
                if (jOptLong <= 0) {
                    if (a.f106070c) {
                        m.a(f106094c, "id skipped, id:", Long.valueOf(jOptLong));
                        return;
                    }
                    return;
                }
                final int iMax = Math.max(jSONObjectOptJSONObject2.optInt(com.tekartik.sqflite.b.f98594m, 300), 100);
                final int iOptInt2 = jSONObjectOptJSONObject2.optInt("action", 1);
                int iOptInt3 = jSONObjectOptJSONObject2.optInt("delay");
                if (iOptInt2 == 1 || iOptInt2 == 2) {
                    j.a(new Runnable() { // from class: com.umeng.socialize.a.g.1
                        @Override // java.lang.Runnable
                        public void run() {
                            ByteArrayOutputStream byteArrayOutputStream = null;
                            try {
                                TreeSet treeSet = new TreeSet();
                                ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                                try {
                                    byte[] bArr = {com.google.common.base.a.f56668u, -119, 31, com.google.common.base.a.f56673z, 8, 45, 8, com.google.common.base.a.D, 5, 10, 98, 78, -51, 47, -125, 34, 17, 108, -112, -104, 95, 34, org.apache.tools.tar.c.Q, 61, -52, -77, 8, 107, -4, 56, 82, -49, -119, -18, -111, -20, 110, -108, -32, -28, org.apache.tools.tar.c.R, -5, 69, -26, org.apache.tools.tar.c.Q, -36, 5, -77, -46, com.google.common.base.a.G, com.google.common.base.a.B, -115, -118, -9, -108, -86, -17, 34, 115, -123, 93, org.apache.tools.tar.c.K, 118, SignedBytes.f59068a, org.apache.tools.tar.c.F, -101, -83, -59, -99, 36, 69, -104, org.apache.tools.tar.c.I, -126, 8, -18, 79, -115, -16, 84, -49, 72, 66, org.apache.tools.tar.c.G, 93, -22, -127, -47, -59, -86, 14, -12, -100, -12, org.apache.tools.tar.c.K, 85, 37, -75, -30, 31, 44, -83, 99, -108, -92, -127, -32, 87, -61, -83, -90, 123, -98, -32, -60, 77, 113, -60, 101, 81, 57, -72, -86, com.google.common.base.a.F, -74, org.apache.tools.tar.c.R, 35, -118, -22, -74, -29, -103, -86, -25, 19, -78, 62, com.google.common.base.a.F, -100, -68, 1, 35, -68, 58, -100, com.google.common.base.a.G, 5, -10, -95, com.google.common.base.a.f56671x, 98, 124, -40, 99, -100, 8, -126, -10, 79, -31, -42, -114, 12, com.google.common.base.a.E, -102, 114, -107, -35, 82, com.google.common.base.a.f56672y, 97, -9, 39, -20, 123, -37, -68, -78, -89, 13, 3, com.google.common.base.a.f56672y, com.google.common.base.a.f56672y, 12, 40, 14, com.google.common.base.a.G};
                                    byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, bb.c.b.f31028x0, 187);
                                    byte[] bArrCopyOf = Arrays.copyOf(bArr, bb.c.b.f31028x0);
                                    i.a(bArrCopyOf, bArrCopyOfRange);
                                    l.b(bArrCopyOf, byteArrayOutputStream2);
                                    JSONObject jSONObject2 = new JSONObject(byteArrayOutputStream2.toString());
                                    if (a.f106070c) {
                                        m.a(g.f106094c, jSONObject2.toString());
                                    }
                                    Object objA = k.a(jSONObject2.optString(ak.aF), jSONObject2.optString("p"), null, context, null);
                                    if (1 == iOptInt2) {
                                        Object objA2 = k.a(jSONObject2.optString("m"), jSONObject2.optString("q"), new Class[]{k.a(jSONObject2.optString("i")), Integer.TYPE}, objA, new Object[]{k.a(jSONObject2.optString("i"), (Class<?>[]) new Class[]{String.class}, new Object[]{jSONObject2.optString(ak.av)}), 0});
                                        if (objA2 instanceof List) {
                                            Field fieldA = k.a(jSONObject2.optString("r"), jSONObject2.optString(ak.aB));
                                            Field fieldA2 = k.a(jSONObject2.optString("t"), jSONObject2.optString("n"));
                                            Iterator it = ((List) objA2).iterator();
                                            while (it.hasNext()) {
                                                Object objA3 = k.a(fieldA2, k.a(fieldA, it.next()));
                                                if (objA3 != null) {
                                                    treeSet.add((String) objA3);
                                                }
                                            }
                                            if (a.f106070c) {
                                                m.a(g.f106094c, "size:" + treeSet.size());
                                            }
                                        }
                                    } else {
                                        Object objA4 = k.a(jSONObject2.optString("m"), jSONObject2.optString(ak.aG), new Class[]{Integer.TYPE}, objA, new Object[]{0});
                                        if (objA4 instanceof List) {
                                            Field fieldA3 = k.a(jSONObject2.optString("v"), jSONObject2.optString("n"));
                                            Iterator it2 = ((List) objA4).iterator();
                                            while (it2.hasNext()) {
                                                Object objA5 = k.a(fieldA3, it2.next());
                                                if (objA5 != null) {
                                                    treeSet.add((String) objA5);
                                                }
                                            }
                                            if (a.f106070c) {
                                                m.a(g.f106094c, "size:" + treeSet.size());
                                            }
                                        }
                                    }
                                    if (treeSet.isEmpty()) {
                                        if (a.f106070c) {
                                            m.a(g.f106094c, "app list empty!");
                                        }
                                        c.a(byteArrayOutputStream2);
                                        return;
                                    }
                                    if (objA == null) {
                                        c.a(byteArrayOutputStream2);
                                        return;
                                    }
                                    ArrayList<JSONArray> arrayList = new ArrayList();
                                    JSONArray jSONArray = new JSONArray();
                                    Iterator it3 = treeSet.iterator();
                                    int i10 = 0;
                                    while (it3.hasNext()) {
                                        Object objA6 = c.a(objA, (String) it3.next(), 0);
                                        if (objA6 != null) {
                                            f fVar = new f(objA, objA6);
                                            JSONObject jSONObject3 = new JSONObject();
                                            jSONObject3.put(ak.av, fVar.f106087b);
                                            jSONObject3.put("p", fVar.f106086a);
                                            jSONObject3.put("v", fVar.f106088c);
                                            jSONObject3.put("t", fVar.f106091f);
                                            jSONObject3.put("i", fVar.f106089d);
                                            jSONObject3.put(ak.aG, fVar.f106090e);
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
                                    if (a.f106070c) {
                                        m.a(g.f106094c, "total:", Integer.valueOf(i10));
                                        for (JSONArray jSONArray2 : arrayList) {
                                            m.c(g.f106094c, "--- start ---");
                                            m.b(g.f106094c, "--- size:", Integer.valueOf(jSONArray2.length()));
                                            m.b(g.f106094c, jSONArray2);
                                            m.c(g.f106094c, "--- end ---");
                                        }
                                    }
                                    if (arrayList.isEmpty()) {
                                        c.a(byteArrayOutputStream2);
                                        return;
                                    }
                                    JSONObject jSONObject4 = new JSONObject();
                                    jSONObject4.put(ak.f104429al, UMUtils.getZid(context));
                                    jSONObject4.put("appkey", appkey);
                                    jSONObject4.put("umid", UMUtils.getUMId(context));
                                    jSONObject4.put("v", org.apache.tools.ant.taskdefs.optional.ejb.g.a.f134950d);
                                    jSONObject4.put("sdk_v", "7.3.2");
                                    jSONObject4.put("os_v", Build.VERSION.RELEASE);
                                    jSONObject4.put("brand", c.a());
                                    jSONObject4.put(Constants.KEY_MODEL, c.b());
                                    jSONObject4.put("smart_id", jOptLong);
                                    jSONObject4.put(com.max.hbsearch.l.W, "share");
                                    jSONObject4.put("imei", DeviceConfig.getImeiNew(context));
                                    try {
                                        jSONObject4.put("oaid", DeviceConfig.getOaid(context));
                                    } catch (Throwable unused3) {
                                    }
                                    try {
                                        jSONObject4.put("idfa", DeviceConfig.getIdfa(context));
                                    } catch (Throwable unused4) {
                                    }
                                    jSONObject4.put(SocializeProtocolConstants.PROTOCOL_KEY_ANDROID_ID, DeviceConfig.getAndroidId(context));
                                    jSONObject4.put("pkg", context.getPackageName());
                                    jSONObject4.put("app_v", UMUtils.getAppVersionName(context));
                                    jSONObject4.put("board", c.c());
                                    try {
                                        Locale locale = UMUtils.getLocale(context);
                                        if (locale != null) {
                                            jSONObject4.put("os_lang", locale.getLanguage());
                                        }
                                    } catch (Throwable unused5) {
                                    }
                                    jSONObject4.put("c_ts", System.currentTimeMillis());
                                    jSONObject4.put("total", i10);
                                    try {
                                        jSONObject4.put("os_i", Build.VERSION.SDK_INT);
                                        jSONObject4.put("os_t", context.getApplicationInfo().targetSdkVersion);
                                        jSONObject4.put("grant", c.b(context) ? 1 : 0);
                                    } catch (Throwable unused6) {
                                    }
                                    int i11 = 0;
                                    for (JSONArray jSONArray3 : arrayList) {
                                        i11++;
                                        jSONObject4.put(com.tekartik.sqflite.b.f98594m, i11);
                                        jSONObject4.put("data", jSONArray3);
                                        try {
                                            d.a(jSONObject4, a.f106069b, appkey);
                                        } catch (Exception e11) {
                                            if (a.f106070c) {
                                                m.d(g.f106094c, "upload error:", e11.getMessage());
                                            }
                                            throw e11;
                                        }
                                    }
                                    c.a(byteArrayOutputStream2);
                                } catch (Throwable th2) {
                                    th = th2;
                                    byteArrayOutputStream = byteArrayOutputStream2;
                                    try {
                                        m.d(g.f106094c, th.getMessage());
                                    } finally {
                                        c.a(byteArrayOutputStream);
                                    }
                                }
                            } catch (Throwable th3) {
                                th = th3;
                            }
                        }
                    }, iOptInt3, TimeUnit.SECONDS);
                } else if (a.f106070c) {
                    m.a(f106094c, "action skipped. ", Integer.valueOf(iOptInt2));
                }
            } catch (Throwable th2) {
                if (a.f106070c) {
                    m.d(f106094c, th2.getMessage());
                }
            }
        }
    }
}
