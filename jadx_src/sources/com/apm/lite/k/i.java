package com.apm.lite.k;

import android.text.TextUtils;
import androidx.room.FtsOptions;
import com.apm.lite.CrashType;
import com.apm.lite.nativecrash.NativeImpl;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import com.taobao.aranger.constant.Constants;
import com.umeng.socialize.net.dplus.CommonNetImpl;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class i {
    public static void A(String str, String str2) throws Throwable {
        o(str2, new File(str));
    }

    public static com.apm.lite.d.a B(File file) {
        com.apm.lite.d.a aVarA = a(new File(file, "logEventStack"), file.getName().contains("oom"));
        boolean z10 = false;
        for (int i10 = 0; i10 < com.apm.lite.e.d.b(); i10++) {
            File fileE = o.e(file, "." + i10);
            if (fileE.exists()) {
                try {
                    aVarA.y(new JSONObject(z(fileE.getAbsolutePath())));
                    z10 = true;
                } catch (Throwable unused) {
                }
            }
        }
        aVarA.e(CrashHianalyticsData.CRASH_TYPE, z10 ? "step" : FtsOptions.TOKENIZER_SIMPLE);
        JSONObject jSONObjectOptJSONObject = aVarA.G().optJSONObject("header");
        JSONObject jSONObjectS = com.apm.lite.d.c.b(com.apm.lite.e.m(), aVarA.G().optLong("crash_time", 0L)).s();
        if (jSONObjectOptJSONObject == null) {
            aVarA.i(jSONObjectS);
        } else {
            l.e(jSONObjectOptJSONObject, jSONObjectS);
        }
        return aVarA;
    }

    public static com.apm.lite.d.d C(String str) {
        try {
            String strZ = z(str);
            if (strZ == null) {
                return null;
            }
            JSONObject jSONObject = new JSONObject(strZ);
            com.apm.lite.d.d dVar = new com.apm.lite.d.d();
            dVar.b(jSONObject.optString("url"));
            dVar.d(jSONObject.optJSONObject("body"));
            dVar.g(jSONObject.optString("dump_file"));
            dVar.e(jSONObject.optBoolean("encrypt", false));
            return dVar;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static com.apm.lite.d.d D(String str) {
        try {
            JSONObject jSONObject = new JSONObject(z(str));
            com.apm.lite.d.d dVar = new com.apm.lite.d.d();
            dVar.k(jSONObject.optString(CommonNetImpl.AID));
            dVar.i(jSONObject.optString("did"));
            dVar.m(jSONObject.optString(Constants.PARAM_PROCESS_NAME));
            ArrayList arrayList = new ArrayList();
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("alogFiles");
            if (jSONArrayOptJSONArray != null) {
                for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                    arrayList.add(jSONArrayOptJSONArray.getString(i10));
                }
                dVar.c(arrayList);
            }
            return dVar;
        } catch (IOException | JSONException e10) {
            e10.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Not initialized variable reg: 2, insn: 0x0041: MOVE (r0 I:??[OBJECT, ARRAY]) = (r2 I:??[OBJECT, ARRAY]), block:B:21:0x0041 */
    public static Map<String, String> E(File file) throws Throwable {
        FileInputStream fileInputStream;
        Closeable closeable;
        Closeable closeable2 = null;
        try {
            try {
                Properties properties = new Properties();
                fileInputStream = new FileInputStream(file);
                try {
                    properties.load(fileInputStream);
                    Set<String> setStringPropertyNames = properties.stringPropertyNames();
                    HashMap map = new HashMap();
                    for (String str : setStringPropertyNames) {
                        map.put(str, properties.getProperty(str));
                    }
                    k.a(fileInputStream);
                    return map;
                } catch (IOException e10) {
                    e = e10;
                    q.g(e);
                    k.a(fileInputStream);
                    return null;
                }
            } catch (Throwable th2) {
                th = th2;
                closeable2 = closeable;
                k.a(closeable2);
                throw th;
            }
        } catch (IOException e11) {
            e = e11;
            fileInputStream = null;
        } catch (Throwable th3) {
            th = th3;
            k.a(closeable2);
            throw th;
        }
    }

    public static void F(File file) {
        File file2 = new File(file, "lock");
        try {
            file2.createNewFile();
            NativeImpl.doLock(file2.getAbsolutePath());
        } catch (Throwable th2) {
            com.apm.lite.c.a();
            com.apm.lite.c.b("NPTH_CATCH", th2);
        }
    }

    public static boolean G(File file) {
        if (!file.isFile()) {
            file = new File(file, "lock");
        }
        if (!file.exists()) {
            return false;
        }
        try {
            int iDoLock = NativeImpl.doLock(file.getAbsolutePath());
            if (iDoLock > 0) {
                NativeImpl.unLock(iDoLock);
                return false;
            }
            if (iDoLock < 0) {
                return true;
            }
        } catch (Throwable th2) {
            com.apm.lite.c.a();
            com.apm.lite.c.b("NPTH_CATCH", th2);
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:73:0x011a  */
    public static com.apm.lite.d.a a(File file, boolean z10) {
        String strG;
        String string;
        String str;
        String str2;
        com.apm.lite.d.a aVar = new com.apm.lite.d.a();
        String str3 = "InvalidStack.NoStackAvailable: OOM.\n";
        if (file.exists()) {
            try {
                strG = g(file.getAbsolutePath(), "\n");
            } catch (IOException unused) {
                strG = null;
            }
            if (TextUtils.isEmpty(strG)) {
                if (!z10) {
                    str3 = "InvalidStack.NoStackAvailable: not OOM.\n";
                }
                str2 = null;
                str = null;
            } else {
                String[] strArrSplit = strG.split("\n");
                ArrayList arrayList = new ArrayList();
                StringBuilder sb2 = new StringBuilder();
                StringBuilder sb3 = new StringBuilder();
                boolean z11 = false;
                boolean z12 = false;
                for (String str4 : strArrSplit) {
                    if (!z11 && str4.startsWith("stack:")) {
                        z11 = true;
                    } else if (!z12 && str4.startsWith("err:")) {
                        z12 = true;
                    } else if (z12) {
                        sb3.append(str4);
                        sb3.append("\n");
                    } else if (z11) {
                        sb2.append(str4);
                        sb2.append("\n");
                    } else {
                        arrayList.add(str4);
                    }
                }
                String str5 = arrayList.size() >= 1 ? (String) arrayList.get(0) : null;
                String str6 = arrayList.size() >= 2 ? (String) arrayList.get(1) : null;
                String str7 = arrayList.size() >= 3 ? (String) arrayList.get(2) : null;
                String str8 = arrayList.size() >= 4 ? (String) arrayList.get(3) : null;
                if (z11 && sb2.length() > 0) {
                    string = sb2.toString();
                } else if (str7 != null) {
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append(str7);
                    sb4.append("\nCaused by: ");
                    sb4.append(z10 ? "InvalidStack.NoStackAvailable: OOM.\n" : "InvalidStack.NoStackAvailable: not OOM.\n");
                    string = sb4.toString();
                } else if (str6 != null) {
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append(str6);
                    sb5.append("\nCaused by: ");
                    sb5.append(z10 ? "InvalidStack.NoStackAvailable: OOM.\n" : "InvalidStack.NoStackAvailable: not OOM.\n");
                    string = sb5.toString();
                } else {
                    string = z10 ? "InvalidStack.NoStackAvailable: OOM.\n" : "InvalidStack.NoStackAvailable: not OOM.\n";
                }
                if (z12 && sb3.length() > 0) {
                    string = string + "\nCaused by: InvalidStack.CrashWhenWriteStack: Npth ERROR:\n" + ((Object) sb3);
                }
                str3 = string;
                str = str5;
                str2 = str8;
            }
        } else {
            if (!z10) {
                str3 = "InvalidStack.NoStackAvailable: not OOM.\n";
            }
            str2 = null;
            str = null;
        }
        aVar.j("data", str3);
        aVar.j("process_name", str);
        aVar.j("crash_thread_name", str2);
        aVar.j("isOOM", Boolean.valueOf(z10));
        return aVar;
    }

    public static com.apm.lite.d.d b(File file, CrashType crashType) {
        com.apm.lite.d.a aVarB = B(file);
        String name = file.getName();
        String strSubstring = name.substring(name.lastIndexOf(95) + 1);
        JSONObject jSONObjectOptJSONObject = aVarB.G().optJSONObject("header");
        if (jSONObjectOptJSONObject.optString("unique_key", null) == null) {
            try {
                jSONObjectOptJSONObject.put("unique_key", "android_" + com.apm.lite.e.h().a() + lg.a.f131412e + strSubstring + lg.a.f131412e + CrashType.LAUNCH);
            } catch (Throwable th2) {
                th2.printStackTrace();
            }
        }
        com.apm.lite.d.d dVar = new com.apm.lite.d.d();
        dVar.b(crashType == CrashType.LAUNCH ? com.apm.lite.j.e.v() : com.apm.lite.j.e.t());
        dVar.d(aVarB.G());
        dVar.e(com.apm.lite.j.e.i());
        return dVar;
    }

    public static String c(File file, String str) {
        return d(file, str, -1L);
    }

    public static String d(File file, String str, long j10) throws Throwable {
        StringBuilder sb2 = new StringBuilder();
        BufferedReader bufferedReader = null;
        try {
            BufferedReader bufferedReader2 = new BufferedReader(new FileReader(file));
            if (j10 > 0) {
                try {
                    bufferedReader2.skip(j10);
                    bufferedReader2.readLine();
                } catch (Throwable th2) {
                    th = th2;
                    bufferedReader = bufferedReader2;
                    k.a(bufferedReader);
                    throw th;
                }
            }
            while (true) {
                String line = bufferedReader2.readLine();
                if (line == null) {
                    k.a(bufferedReader2);
                    return sb2.toString();
                }
                if (sb2.length() != 0 && str != null) {
                    sb2.append(str);
                }
                sb2.append(line);
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public static String e(File file, String str, String str2, JSONObject jSONObject, String str3, boolean z10) {
        if (!file.exists()) {
            file.mkdirs();
        }
        File file2 = new File(file, str);
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("url", str2);
            jSONObject2.put("body", jSONObject);
            if (str3 == null) {
                str3 = "";
            }
            jSONObject2.put("dump_file", str3);
            jSONObject2.put("encrypt", z10);
            m(file2, jSONObject2, false);
        } catch (IOException | JSONException e10) {
            e10.printStackTrace();
        }
        return file2.getAbsolutePath();
    }

    public static String f(File file, String str, String str2, JSONObject jSONObject, boolean z10) {
        return e(file, str, str2, jSONObject, null, z10);
    }

    public static String g(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return c(new File(str), str2);
    }

    public static JSONArray h(File file, long j10) throws Throwable {
        JSONArray jSONArray = new JSONArray();
        BufferedReader bufferedReader = null;
        try {
            BufferedReader bufferedReader2 = new BufferedReader(new FileReader(file));
            if (j10 > 0) {
                try {
                    bufferedReader2.skip(j10);
                    bufferedReader2.readLine();
                } catch (Throwable th2) {
                    th = th2;
                    bufferedReader = bufferedReader2;
                    k.a(bufferedReader);
                    throw th;
                }
            }
            while (true) {
                String line = bufferedReader2.readLine();
                if (line == null) {
                    k.a(bufferedReader2);
                    return jSONArray;
                }
                jSONArray.put(line);
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public static void i(File file, File file2) throws Throwable {
        FileOutputStream fileOutputStream;
        if (file == null || file2 == null) {
            return;
        }
        FileInputStream fileInputStream = null;
        try {
            file2.getParentFile().mkdirs();
            FileInputStream fileInputStream2 = new FileInputStream(file);
            try {
                fileOutputStream = new FileOutputStream(file2);
                try {
                    byte[] bArr = new byte[8192];
                    while (true) {
                        int i10 = fileInputStream2.read(bArr);
                        if (i10 <= 0) {
                            break;
                        } else {
                            fileOutputStream.write(bArr, 0, i10);
                        }
                    }
                    k.a(fileInputStream2);
                } catch (Exception e10) {
                    e = e10;
                    fileInputStream = fileInputStream2;
                    try {
                        e.printStackTrace();
                        k.a(fileInputStream);
                    } catch (Throwable th2) {
                        th = th2;
                        k.a(fileInputStream);
                        k.a(fileOutputStream);
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    fileInputStream = fileInputStream2;
                    k.a(fileInputStream);
                    k.a(fileOutputStream);
                    throw th;
                }
            } catch (Exception e11) {
                e = e11;
                fileOutputStream = null;
            } catch (Throwable th4) {
                th = th4;
                fileOutputStream = null;
            }
        } catch (Exception e12) {
            e = e12;
            fileOutputStream = null;
        } catch (Throwable th5) {
            th = th5;
            fileOutputStream = null;
        }
        k.a(fileOutputStream);
    }

    public static void j(File file, String str, boolean z10) throws Throwable {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        file.getParentFile().mkdirs();
        FileOutputStream fileOutputStream = null;
        try {
            FileOutputStream fileOutputStream2 = new FileOutputStream(file, z10);
            try {
                fileOutputStream2.write(str.getBytes());
                fileOutputStream2.flush();
                k.a(fileOutputStream2);
            } catch (Throwable th2) {
                th = th2;
                fileOutputStream = fileOutputStream2;
                k.a(fileOutputStream);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public static void k(File file, Map<String, String> map) throws Throwable {
        if (map == null || map.isEmpty()) {
            return;
        }
        FileOutputStream fileOutputStream = null;
        try {
            try {
                Properties properties = new Properties();
                FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                try {
                    for (Map.Entry<String, String> entry : map.entrySet()) {
                        properties.setProperty(entry.getKey(), entry.getValue());
                    }
                    properties.store(fileOutputStream2, "no");
                    k.a(fileOutputStream2);
                } catch (IOException e10) {
                    e = e10;
                    fileOutputStream = fileOutputStream2;
                    q.g(e);
                    k.a(fileOutputStream);
                } catch (Throwable th2) {
                    th = th2;
                    fileOutputStream = fileOutputStream2;
                    k.a(fileOutputStream);
                    throw th;
                }
            } catch (IOException e11) {
                e = e11;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public static void l(File file, JSONArray jSONArray, boolean z10) {
        if (jSONArray == null) {
            return;
        }
        file.getParentFile().mkdirs();
        BufferedWriter bufferedWriter = null;
        try {
            BufferedWriter bufferedWriter2 = new BufferedWriter(new FileWriter(file));
            try {
                m.h(jSONArray, bufferedWriter2);
                k.a(bufferedWriter2);
            } catch (Throwable unused) {
                bufferedWriter = bufferedWriter2;
                k.a(bufferedWriter);
            }
        } catch (Throwable unused2) {
        }
    }

    public static void m(File file, JSONObject jSONObject, boolean z10) {
        if (jSONObject == null) {
            return;
        }
        file.getParentFile().mkdirs();
        BufferedWriter bufferedWriter = null;
        try {
            BufferedWriter bufferedWriter2 = new BufferedWriter(new FileWriter(file));
            try {
                m.j(jSONObject, bufferedWriter2);
                k.a(bufferedWriter2);
            } catch (Throwable unused) {
                bufferedWriter = bufferedWriter2;
                k.a(bufferedWriter);
            }
        } catch (Throwable unused2) {
        }
    }

    public static void n(OutputStream outputStream, File... fileArr) throws Throwable {
        ZipOutputStream zipOutputStream = null;
        try {
            ZipOutputStream zipOutputStream2 = new ZipOutputStream(outputStream);
            try {
                zipOutputStream2.putNextEntry(new ZipEntry("/"));
                for (File file : fileArr) {
                    p(zipOutputStream2, file);
                }
                k.a(zipOutputStream2);
            } catch (Throwable th2) {
                th = th2;
                zipOutputStream = zipOutputStream2;
                k.a(zipOutputStream);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    private static void o(String str, File file) throws Throwable {
        ZipOutputStream zipOutputStream = null;
        try {
            new File(str).getParentFile().mkdirs();
            ZipOutputStream zipOutputStream2 = new ZipOutputStream(new FileOutputStream(str));
            try {
                q(zipOutputStream2, file, "");
                k.a(zipOutputStream2);
            } catch (Throwable th2) {
                th = th2;
                zipOutputStream = zipOutputStream2;
                k.a(zipOutputStream);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    private static void p(ZipOutputStream zipOutputStream, File file) throws Throwable {
        if (file == null || !file.exists()) {
            return;
        }
        File[] fileArrListFiles = file.isDirectory() ? file.listFiles() : new File[]{file};
        if (fileArrListFiles == null) {
            return;
        }
        for (File file2 : fileArrListFiles) {
            q(zipOutputStream, file2, file2.getName());
        }
    }

    private static void q(ZipOutputStream zipOutputStream, File file, String str) throws Throwable {
        if (file == null || !file.exists()) {
            return;
        }
        if (file.isDirectory()) {
            File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles == null) {
                return;
            }
            zipOutputStream.putNextEntry(new ZipEntry(str + "/"));
            String str2 = str.length() == 0 ? "" : str + "/";
            for (int i10 = 0; i10 < fileArrListFiles.length; i10++) {
                q(zipOutputStream, fileArrListFiles[i10], str2 + fileArrListFiles[i10].getName());
            }
            return;
        }
        zipOutputStream.putNextEntry(new ZipEntry(str));
        FileInputStream fileInputStream = null;
        try {
            FileInputStream fileInputStream2 = new FileInputStream(file);
            try {
                byte[] bArr = new byte[4096];
                while (true) {
                    int i11 = fileInputStream2.read(bArr);
                    if (-1 == i11) {
                        k.a(fileInputStream2);
                        return;
                    }
                    zipOutputStream.write(bArr, 0, i11);
                }
            } catch (Throwable th2) {
                th = th2;
                fileInputStream = fileInputStream2;
                k.a(fileInputStream);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public static boolean r(File file) {
        boolean zR;
        boolean z10 = true;
        if (!file.exists()) {
            return true;
        }
        if (!file.canWrite()) {
            return false;
        }
        if (file.isFile()) {
            return file.delete();
        }
        if (!file.isDirectory()) {
            return true;
        }
        File[] fileArrListFiles = file.listFiles();
        for (int i10 = 0; fileArrListFiles != null && i10 < fileArrListFiles.length; i10++) {
            if (fileArrListFiles[i10].isFile()) {
                if (fileArrListFiles[i10].canWrite()) {
                    zR = fileArrListFiles[i10].delete();
                } else {
                    z10 = false;
                }
            } else {
                zR = r(fileArrListFiles[i10]);
            }
            z10 &= zR;
        }
        return z10 & file.delete();
    }

    public static boolean s(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return r(new File(str));
    }

    public static boolean t(JSONArray jSONArray) {
        return jSONArray == null || jSONArray.length() == 0;
    }

    public static JSONArray u(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return h(new File(str), -1L);
    }

    public static JSONArray v(String str, String str2) {
        JSONArray jSONArray = new JSONArray();
        if (str != null && str2 != null) {
            for (String str3 : str.split(str2)) {
                jSONArray.put(str3);
            }
        }
        return jSONArray;
    }

    public static void w(File file, JSONObject jSONObject, boolean z10) {
        if (jSONObject == null) {
            return;
        }
        file.getParentFile().mkdirs();
        BufferedWriter bufferedWriter = null;
        try {
            BufferedWriter bufferedWriter2 = new BufferedWriter(new FileWriter(file));
            try {
                m.j(jSONObject, bufferedWriter2);
                k.a(bufferedWriter2);
            } catch (Throwable th2) {
                th = th2;
                bufferedWriter = bufferedWriter2;
                try {
                    try {
                        jSONObject.put("err_write", th.toString());
                        com.apm.lite.d.a.k(jSONObject, "filters", "err_write", th.getLocalizedMessage());
                    } finally {
                        k.a(bufferedWriter);
                    }
                } catch (JSONException unused) {
                }
                com.apm.lite.c.a();
                com.apm.lite.c.b("NPTH_CATCH", th);
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public static boolean x(File file) {
        String[] list = file.list();
        return list == null || list.length == 0;
    }

    public static String y(File file) {
        return c(file, "\n");
    }

    public static String z(String str) {
        return g(str, "\n");
    }
}
