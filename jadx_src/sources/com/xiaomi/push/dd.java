package com.xiaomi.push;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.net.Uri;
import android.text.TextUtils;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.max.hblogistics.bean.address.AdminRegionObj;
import com.xiaomi.mipush.sdk.Constants;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import org.apache.tools.ant.v0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class dd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected static Context f106948a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static a f266a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static dd f267a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static String f106950c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static String f106951d;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private long f269a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private dc f270a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    protected b f271a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private String f272a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    protected final Map<String, da> f273a;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    private final long f274b;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    private String f275b;

    /* JADX INFO: renamed from: c, reason: collision with other field name */
    private long f276c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected static final Map<String, cz> f106949b = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    protected static boolean f268a = false;

    public interface a {
        dd a(Context context, dc dcVar, b bVar, String str);
    }

    public interface b {
        String a(String str);
    }

    protected dd(Context context, dc dcVar, b bVar, String str) {
        this(context, dcVar, bVar, str, null, null);
    }

    protected dd(Context context, dc dcVar, b bVar, String str, String str2, String str3) {
        this.f273a = new HashMap();
        this.f272a = "0";
        this.f269a = 0L;
        this.f274b = 15L;
        this.f276c = 0L;
        this.f275b = "isp_prov_city_country_ip";
        this.f271a = bVar;
        if (dcVar == null) {
            this.f270a = new de(this);
        } else {
            this.f270a = dcVar;
        }
        this.f272a = str;
        f106950c = str2 == null ? context.getPackageName() : str2;
        f106951d = str3 == null ? g() : str3;
    }

    public static synchronized dd a() {
        dd ddVar;
        ddVar = f267a;
        if (ddVar == null) {
            throw new IllegalStateException("the host manager is not initialized yet.");
        }
        return ddVar;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    static String m239a() {
        if (f106948a == null) {
            return "unknown";
        }
        try {
            bj bjVarM172a = bg.m172a();
            if (bjVarM172a == null) {
                return "unknown";
            }
            if (bjVarM172a.a() == 1) {
                return "WIFI-UNKNOWN";
            }
            return bjVarM172a.m182a() + Constants.ACCEPT_TIME_SEPARATOR_SERVER + bjVarM172a.m184b();
        } catch (Throwable unused) {
            return "unknown";
        }
    }

    static String a(String str) {
        try {
            int length = str.length();
            byte[] bytes = str.getBytes("UTF-8");
            for (int i10 = 0; i10 < bytes.length; i10++) {
                byte b10 = bytes[i10];
                int i11 = b10 & 240;
                if (i11 != 240) {
                    bytes[i10] = (byte) (((b10 & 15) ^ ((byte) (((b10 >> 4) + length) & 15))) | i11);
                }
            }
            return new String(bytes);
        } catch (UnsupportedEncodingException unused) {
            return str;
        }
    }

    private ArrayList<cz> a(ArrayList<String> arrayList) {
        JSONObject jSONObject;
        m250e();
        synchronized (this.f273a) {
            m245a();
            for (String str : this.f273a.keySet()) {
                if (!arrayList.contains(str)) {
                    arrayList.add(str);
                }
            }
        }
        Map<String, cz> map = f106949b;
        synchronized (map) {
            for (Object obj : map.values().toArray()) {
                cz czVar = (cz) obj;
                if (!czVar.b()) {
                    f106949b.remove(czVar.f263b);
                }
            }
        }
        if (!arrayList.contains(b())) {
            arrayList.add(b());
        }
        ArrayList<cz> arrayList2 = new ArrayList<>(arrayList.size());
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            arrayList2.add(null);
        }
        try {
            String str2 = bg.e(f106948a) ? "wifi" : "wap";
            String strA = a(arrayList, str2, this.f272a, true);
            if (!TextUtils.isEmpty(strA)) {
                JSONObject jSONObject2 = new JSONObject(strA);
                com.xiaomi.channel.commonutils.logger.b.b(strA);
                if ("OK".equalsIgnoreCase(jSONObject2.getString(androidx.exifinterface.media.a.R4))) {
                    JSONObject jSONObject3 = jSONObject2.getJSONObject("R");
                    String string = jSONObject3.getString(AdminRegionObj.TYPE_PROVINCE);
                    String string2 = jSONObject3.getString(AdminRegionObj.TYPE_CITY);
                    String string3 = jSONObject3.getString("isp");
                    String string4 = jSONObject3.getString("ip");
                    String string5 = jSONObject3.getString(com.umeng.analytics.pro.ak.O);
                    JSONObject jSONObject4 = jSONObject3.getJSONObject(str2);
                    com.xiaomi.channel.commonutils.logger.b.c("get bucket: net=" + string3 + ", hosts=" + jSONObject4.toString());
                    int i11 = 0;
                    while (i11 < arrayList.size()) {
                        String str3 = arrayList.get(i11);
                        JSONArray jSONArrayOptJSONArray = jSONObject4.optJSONArray(str3);
                        if (jSONArrayOptJSONArray == null) {
                            com.xiaomi.channel.commonutils.logger.b.m62a("no bucket found for " + str3);
                            jSONObject = jSONObject4;
                        } else {
                            cz czVar2 = new cz(str3);
                            int i12 = 0;
                            while (i12 < jSONArrayOptJSONArray.length()) {
                                String string6 = jSONArrayOptJSONArray.getString(i12);
                                if (!TextUtils.isEmpty(string6)) {
                                    czVar2.a(new di(string6, jSONArrayOptJSONArray.length() - i12));
                                }
                                i12++;
                                jSONObject4 = jSONObject4;
                            }
                            jSONObject = jSONObject4;
                            arrayList2.set(i11, czVar2);
                            czVar2.f106942g = string5;
                            czVar2.f106938c = string;
                            czVar2.f106940e = string3;
                            czVar2.f106941f = string4;
                            czVar2.f106939d = string2;
                            if (jSONObject3.has("stat-percent")) {
                                czVar2.a(jSONObject3.getDouble("stat-percent"));
                            }
                            if (jSONObject3.has("stat-domain")) {
                                czVar2.b(jSONObject3.getString("stat-domain"));
                            }
                            if (jSONObject3.has(RemoteMessageConst.TTL)) {
                                czVar2.a(((long) jSONObject3.getInt(RemoteMessageConst.TTL)) * 1000);
                            }
                            m244a(czVar2.a());
                        }
                        i11++;
                        jSONObject4 = jSONObject;
                    }
                    JSONObject jSONObjectOptJSONObject = jSONObject3.optJSONObject("reserved");
                    if (jSONObjectOptJSONObject != null) {
                        long j10 = jSONObject3.has("reserved-ttl") ? ((long) jSONObject3.getInt("reserved-ttl")) * 1000 : 604800000L;
                        Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
                        while (itKeys.hasNext()) {
                            String next = itKeys.next();
                            JSONArray jSONArrayOptJSONArray2 = jSONObjectOptJSONObject.optJSONArray(next);
                            if (jSONArrayOptJSONArray2 == null) {
                                com.xiaomi.channel.commonutils.logger.b.m62a("no bucket found for " + next);
                            } else {
                                cz czVar3 = new cz(next);
                                czVar3.a(j10);
                                for (int i13 = 0; i13 < jSONArrayOptJSONArray2.length(); i13++) {
                                    String string7 = jSONArrayOptJSONArray2.getString(i13);
                                    if (!TextUtils.isEmpty(string7)) {
                                        czVar3.a(new di(string7, jSONArrayOptJSONArray2.length() - i13));
                                    }
                                }
                                Map<String, cz> map2 = f106949b;
                                synchronized (map2) {
                                    if (this.f270a.a(next)) {
                                        map2.put(next, czVar3);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } catch (Exception e10) {
            com.xiaomi.channel.commonutils.logger.b.m62a("failed to get bucket " + e10.getMessage());
        }
        for (int i14 = 0; i14 < arrayList.size(); i14++) {
            cz czVar4 = arrayList2.get(i14);
            if (czVar4 != null) {
                a(arrayList.get(i14), czVar4);
            }
        }
        m248c();
        return arrayList2;
    }

    public static synchronized void a(Context context, dc dcVar, b bVar, String str, String str2, String str3) {
        Context applicationContext = context.getApplicationContext();
        f106948a = applicationContext;
        if (applicationContext == null) {
            f106948a = context;
        }
        if (f267a == null) {
            a aVar = f266a;
            if (aVar == null) {
                f267a = new dd(context, dcVar, bVar, str, str2, str3);
            } else {
                f267a = aVar.a(context, dcVar, bVar, str);
            }
        }
    }

    public static synchronized void a(a aVar) {
        f266a = aVar;
        f267a = null;
    }

    public static void a(String str, String str2) {
        Map<String, cz> map = f106949b;
        cz czVar = map.get(str);
        synchronized (map) {
            try {
                if (czVar == null) {
                    cz czVar2 = new cz(str);
                    czVar2.a(604800000L);
                    czVar2.m232a(str2);
                    map.put(str, czVar2);
                } else {
                    czVar.m232a(str2);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    private byte[] m240a() {
        return bo.m190a(f106948a.getPackageName() + "_key_salt");
    }

    private String f() {
        return "host_fallbacks";
    }

    private String g() {
        try {
            PackageInfo packageInfo = f106948a.getPackageManager().getPackageInfo(f106948a.getPackageName(), 16384);
            return packageInfo != null ? packageInfo.versionName : "0";
        } catch (Exception unused) {
            return "0";
        }
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public cz m241a(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("the url is empty");
        }
        return a(new URL(str).getHost(), true);
    }

    public cz a(String str, boolean z10) {
        cz czVarE;
        com.xiaomi.channel.commonutils.logger.b.b("HostManager", "-->getFallbacksByHost(): host=", str, ", fetchRemoteIfNeed=", Boolean.valueOf(z10));
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("the host is empty");
        }
        if (!this.f270a.a(str)) {
            return null;
        }
        cz czVarC = c(str);
        if (czVarC == null || !czVarC.b()) {
            return (z10 && bg.b(f106948a) && (czVarE = e(str)) != null) ? czVarE : new df(this, str, czVarC);
        }
        return czVarC;
    }

    protected String a(ArrayList<String> arrayList, String str, String str2, boolean z10) throws IOException {
        ArrayList<String> arrayList2 = new ArrayList<>();
        ArrayList<bf> arrayList3 = new ArrayList();
        arrayList3.add(new bd("type", str));
        if (str.equals("wap")) {
            arrayList3.add(new bd("conpt", a(bg.m175a(f106948a))));
        }
        if (z10) {
            arrayList3.add(new bd("reserved", "1"));
        }
        arrayList3.add(new bd("uuid", str2));
        arrayList3.add(new bd("list", bp.a(arrayList, Constants.ACCEPT_TIME_SEPARATOR_SP)));
        arrayList3.add(new bd("countrycode", com.xiaomi.push.service.a.a(f106948a).b()));
        arrayList3.add(new bd("push_sdk_vc", String.valueOf(BuildConfig.VERSION_CODE)));
        String strB = b();
        cz czVarC = c(strB);
        String str3 = String.format(Locale.US, "https://%1$s/gslb/?ver=5.0", strB);
        if (czVarC == null) {
            arrayList2.add(str3);
            Map<String, cz> map = f106949b;
            synchronized (map) {
                cz czVar = map.get(strB);
                if (czVar != null) {
                    Iterator<String> it = czVar.a(true).iterator();
                    while (it.hasNext()) {
                        arrayList2.add(String.format(Locale.US, "https://%1$s/gslb/?ver=5.0", it.next()));
                    }
                }
            }
        } else {
            arrayList2 = czVarC.a(str3);
        }
        Iterator<String> it2 = arrayList2.iterator();
        IOException e10 = null;
        while (it2.hasNext()) {
            Uri.Builder builderBuildUpon = Uri.parse(it2.next()).buildUpon();
            for (bf bfVar : arrayList3) {
                builderBuildUpon.appendQueryParameter(bfVar.a(), bfVar.b());
            }
            try {
                b bVar = this.f271a;
                return bVar == null ? bg.a(f106948a, new URL(builderBuildUpon.toString())) : bVar.a(builderBuildUpon.toString());
            } catch (IOException e11) {
                e10 = e11;
            }
        }
        if (e10 == null) {
            return null;
        }
        com.xiaomi.channel.commonutils.logger.b.m62a("network exception: " + e10.getMessage());
        throw e10;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    protected JSONObject m242a() {
        JSONObject jSONObject;
        synchronized (this.f273a) {
            jSONObject = new JSONObject();
            jSONObject.put("ver", 2);
            JSONArray jSONArray = new JSONArray();
            Iterator<da> it = this.f273a.values().iterator();
            while (it.hasNext()) {
                jSONArray.put(it.next().m236a());
            }
            jSONObject.put("data", jSONArray);
            JSONArray jSONArray2 = new JSONArray();
            Iterator<cz> it2 = f106949b.values().iterator();
            while (it2.hasNext()) {
                jSONArray2.put(it2.next().m231a());
            }
            jSONObject.put("reserved", jSONArray2);
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public void m243a() {
        synchronized (this.f273a) {
            this.f273a.clear();
        }
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public void m244a(String str) {
        this.f275b = str;
    }

    public void a(String str, cz czVar) {
        if (TextUtils.isEmpty(str) || czVar == null) {
            throw new IllegalArgumentException("the argument is invalid " + str + ", " + czVar);
        }
        if (this.f270a.a(str)) {
            synchronized (this.f273a) {
                m245a();
                if (this.f273a.containsKey(str)) {
                    this.f273a.get(str).a(czVar);
                } else {
                    da daVar = new da(str);
                    daVar.a(czVar);
                    this.f273a.put(str, daVar);
                }
            }
        }
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    protected boolean m245a() {
        synchronized (this.f273a) {
            if (f268a) {
                return true;
            }
            f268a = true;
            this.f273a.clear();
            try {
                String strD = d();
                if (!TextUtils.isEmpty(strD)) {
                    m247b(strD);
                    com.xiaomi.channel.commonutils.logger.b.b("loading the new hosts succeed");
                    return true;
                }
            } catch (Throwable th2) {
                com.xiaomi.channel.commonutils.logger.b.m62a("load bucket failure: " + th2.getMessage());
            }
            return false;
        }
    }

    public cz b(String str) {
        return a(str, true);
    }

    protected String b() {
        return "resolver.msg.xiaomi.net";
    }

    /* JADX INFO: renamed from: b, reason: collision with other method in class */
    public void m246b() {
        ArrayList<String> arrayList;
        synchronized (this.f273a) {
            m245a();
            arrayList = new ArrayList<>(this.f273a.keySet());
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                da daVar = this.f273a.get(arrayList.get(size));
                if (daVar != null && daVar.a() != null) {
                    arrayList.remove(size);
                }
            }
        }
        ArrayList<cz> arrayListA = a(arrayList);
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            if (arrayListA.get(i10) != null) {
                a(arrayList.get(i10), arrayListA.get(i10));
            }
        }
    }

    /* JADX INFO: renamed from: b, reason: collision with other method in class */
    protected void m247b(String str) {
        synchronized (this.f273a) {
            this.f273a.clear();
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.optInt("ver") != 2) {
                throw new JSONException("Bad version");
            }
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("data");
            if (jSONArrayOptJSONArray != null) {
                for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                    da daVarA = new da().a(jSONArrayOptJSONArray.getJSONObject(i10));
                    this.f273a.put(daVarA.m234a(), daVarA);
                }
            }
            JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("reserved");
            if (jSONArrayOptJSONArray2 != null) {
                for (int i11 = 0; i11 < jSONArrayOptJSONArray2.length(); i11++) {
                    JSONObject jSONObject2 = jSONArrayOptJSONArray2.getJSONObject(i11);
                    String strOptString = jSONObject2.optString("host");
                    if (!TextUtils.isEmpty(strOptString)) {
                        try {
                            cz czVarA = new cz(strOptString).a(jSONObject2);
                            f106949b.put(czVarA.f263b, czVarA);
                            com.xiaomi.channel.commonutils.logger.b.m62a("load local reserved host for " + czVarA.f263b);
                        } catch (JSONException unused) {
                            com.xiaomi.channel.commonutils.logger.b.m62a("parse reserved host fail.");
                        }
                    }
                }
            }
        }
    }

    protected cz c(String str) {
        da daVar;
        cz czVarA;
        synchronized (this.f273a) {
            m245a();
            daVar = this.f273a.get(str);
        }
        if (daVar == null || (czVarA = daVar.a()) == null) {
            return null;
        }
        return czVarA;
    }

    public String c() {
        StringBuilder sb2 = new StringBuilder();
        synchronized (this.f273a) {
            for (Map.Entry<String, da> entry : this.f273a.entrySet()) {
                sb2.append(entry.getKey());
                sb2.append(":\n");
                sb2.append(entry.getValue().toString());
                sb2.append("\n");
            }
        }
        return sb2.toString();
    }

    /* JADX INFO: renamed from: c, reason: collision with other method in class */
    public void m248c() {
        FileOutputStream fileOutputStreamOpenFileOutput;
        BufferedOutputStream bufferedOutputStream;
        Throwable th2;
        Exception e10;
        synchronized (this.f273a) {
            BufferedOutputStream bufferedOutputStream2 = null;
            try {
                try {
                    String string = m242a().toString();
                    com.xiaomi.channel.commonutils.logger.b.b("persist host fallbacks = " + string);
                    if (TextUtils.isEmpty(string)) {
                        fileOutputStreamOpenFileOutput = null;
                    } else {
                        fileOutputStreamOpenFileOutput = f106948a.openFileOutput(f(), 0);
                        try {
                            bufferedOutputStream = new BufferedOutputStream(fileOutputStreamOpenFileOutput);
                            try {
                                try {
                                    bufferedOutputStream.write(h.b(m240a(), string.getBytes(StandardCharsets.UTF_8)));
                                    bufferedOutputStream.flush();
                                    bufferedOutputStream2 = bufferedOutputStream;
                                } catch (Exception e11) {
                                    e10 = e11;
                                    com.xiaomi.channel.commonutils.logger.b.m62a("persist bucket failure: " + e10.getMessage());
                                    x.a(bufferedOutputStream);
                                }
                            } catch (Throwable th3) {
                                th2 = th3;
                                x.a(bufferedOutputStream);
                                x.a(fileOutputStreamOpenFileOutput);
                                throw th2;
                            }
                        } catch (Exception e12) {
                            e = e12;
                            bufferedOutputStream = null;
                            e10 = e;
                            com.xiaomi.channel.commonutils.logger.b.m62a("persist bucket failure: " + e10.getMessage());
                            x.a(bufferedOutputStream);
                            x.a(fileOutputStreamOpenFileOutput);
                        } catch (Throwable th4) {
                            th = th4;
                            bufferedOutputStream = null;
                            th2 = th;
                            x.a(bufferedOutputStream);
                            x.a(fileOutputStreamOpenFileOutput);
                            throw th2;
                        }
                    }
                    x.a(bufferedOutputStream2);
                } catch (Throwable th5) {
                    throw th5;
                }
            } catch (Exception e13) {
                e = e13;
                fileOutputStreamOpenFileOutput = null;
                bufferedOutputStream = null;
            } catch (Throwable th6) {
                th = th6;
                fileOutputStreamOpenFileOutput = null;
                bufferedOutputStream = null;
            }
            x.a(fileOutputStreamOpenFileOutput);
        }
    }

    public cz d(String str) {
        cz czVar;
        Map<String, cz> map = f106949b;
        synchronized (map) {
            czVar = map.get(str);
        }
        return czVar;
    }

    protected String d() {
        BufferedInputStream bufferedInputStream;
        FileInputStream fileInputStream;
        try {
            File file = new File(f106948a.getFilesDir(), f());
            try {
                if (!file.isFile()) {
                    x.a((Closeable) null);
                    x.a((Closeable) null);
                    return null;
                }
                fileInputStream = new FileInputStream(file);
                try {
                    bufferedInputStream = new BufferedInputStream(fileInputStream);
                    try {
                        String str = new String(h.a(m240a(), x.a((InputStream) bufferedInputStream)), StandardCharsets.UTF_8);
                        com.xiaomi.channel.commonutils.logger.b.b("load host fallbacks = " + str);
                        x.a((Closeable) bufferedInputStream);
                        x.a((Closeable) fileInputStream);
                        return str;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    bufferedInputStream = null;
                }
                com.xiaomi.channel.commonutils.logger.b.m62a("load host exception " + th.getMessage());
                return null;
            } finally {
                x.a((Closeable) bufferedInputStream);
                x.a((Closeable) fileInputStream);
            }
        } catch (Throwable th4) {
            th = th4;
            bufferedInputStream = null;
            fileInputStream = null;
        }
    }

    /* JADX INFO: renamed from: d, reason: collision with other method in class */
    public void m249d() {
        String strE = e();
        try {
            File file = new File(f106948a.getFilesDir(), strE);
            if (file.exists()) {
                boolean zDelete = file.delete();
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Delete old host fallbacks file ");
                sb2.append(strE);
                sb2.append(zDelete ? " successful." : " failed.");
                com.xiaomi.channel.commonutils.logger.b.m62a(sb2.toString());
            } else {
                com.xiaomi.channel.commonutils.logger.b.b("Old host fallbacks file " + strE + v0.I);
            }
        } catch (Exception e10) {
            com.xiaomi.channel.commonutils.logger.b.m62a("Delete old host fallbacks file " + strE + " error: " + e10.getMessage());
        }
    }

    protected cz e(String str) {
        if (System.currentTimeMillis() - this.f276c <= this.f269a * 60 * 1000) {
            return null;
        }
        this.f276c = System.currentTimeMillis();
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add(str);
        cz czVar = a(arrayList).get(0);
        if (czVar != null) {
            this.f269a = 0L;
            return czVar;
        }
        long j10 = this.f269a;
        if (j10 >= 15) {
            return null;
        }
        this.f269a = j10 + 1;
        return null;
    }

    protected String e() {
        if ("com.xiaomi.xmsf".equals(f106950c)) {
            return f106950c;
        }
        return f106950c + ":pushservice";
    }

    /* JADX INFO: renamed from: e, reason: collision with other method in class */
    public void m250e() {
        String next;
        synchronized (this.f273a) {
            Iterator<da> it = this.f273a.values().iterator();
            while (it.hasNext()) {
                it.next().a(true);
            }
            while (true) {
                boolean z10 = false;
                while (true) {
                    if (!z10) {
                        Iterator<String> it2 = this.f273a.keySet().iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                next = it2.next();
                                if (this.f273a.get(next).m235a().isEmpty()) {
                                    break;
                                }
                            } else {
                                z10 = true;
                            }
                        }
                    }
                }
                this.f273a.remove(next);
            }
        }
    }
}
