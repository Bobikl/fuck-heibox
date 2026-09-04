package com.apm.lite.nativecrash;

import android.text.TextUtils;
import com.apm.lite.k.i;
import com.apm.lite.k.k;
import com.apm.lite.k.o;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes6.dex */
public class d {

    public static class a extends c {
        a(File file) {
            super(file);
            this.f40106b = "Total FD Count:";
            this.f40107c = ":";
            this.f40108d = -2;
        }
    }

    public static class b extends c {
        b(File file) {
            super(file);
            this.f40106b = "VmSize:";
            this.f40107c = "\\s+";
            this.f40108d = -1;
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        protected File f40105a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        protected String f40106b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        protected String f40107c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        protected int f40108d;

        public c(File file) {
            this.f40105a = file;
        }

        public int a() {
            int i10;
            Throwable th2;
            if (!this.f40105a.exists() || !this.f40105a.isFile()) {
                return -1;
            }
            BufferedReader bufferedReader = null;
            try {
                BufferedReader bufferedReader2 = new BufferedReader(new FileReader(this.f40105a));
                int iB = -1;
                do {
                    try {
                        String line = bufferedReader2.readLine();
                        if (line == null) {
                            break;
                        }
                        iB = b(line);
                    } catch (Throwable th3) {
                        th2 = th3;
                        i10 = iB;
                        bufferedReader = bufferedReader2;
                        try {
                            com.apm.lite.c.a();
                            com.apm.lite.c.b("NPTH_CATCH", th2);
                            return i10;
                        } finally {
                            if (bufferedReader != null) {
                                k.a(bufferedReader);
                            }
                        }
                    }
                } while (iB == -1);
                k.a(bufferedReader2);
                return iB;
            } catch (Throwable th4) {
                i10 = -1;
                th2 = th4;
            }
        }

        public int b(String str) {
            int i10 = this.f40108d;
            if (!str.startsWith(this.f40106b)) {
                return i10;
            }
            try {
                i10 = Integer.parseInt(str.split(this.f40107c)[1].trim());
            } catch (NumberFormatException e10) {
                com.apm.lite.c.a();
                com.apm.lite.c.b("NPTH_CATCH", e10);
            }
            if (i10 < 0) {
                return -2;
            }
            return i10;
        }
    }

    /* JADX INFO: renamed from: com.apm.lite.nativecrash.d$d, reason: collision with other inner class name */
    public static class C0313d extends c {
        C0313d(File file) {
            super(file);
        }

        public HashMap<String, List<String>> c() {
            HashMap<String, List<String>> map = new HashMap<>();
            try {
                JSONArray jSONArrayU = i.u(this.f40105a.getAbsolutePath());
                if (jSONArrayU == null) {
                    return map;
                }
                for (int i10 = 0; i10 < jSONArrayU.length(); i10++) {
                    String strOptString = jSONArrayU.optString(i10);
                    if (!TextUtils.isEmpty(strOptString) && strOptString.startsWith("[tid:0") && strOptString.endsWith("sigstack:0x0]")) {
                        int iIndexOf = strOptString.indexOf("[routine:0x");
                        int i11 = iIndexOf + 11;
                        String strSubstring = iIndexOf > 0 ? strOptString.substring(i11, strOptString.indexOf(93, i11)) : "unknown addr";
                        List<String> arrayList = map.get(strSubstring);
                        if (arrayList == null) {
                            arrayList = new ArrayList<>();
                            map.put(strSubstring, arrayList);
                        }
                        arrayList.add(strOptString);
                    }
                }
            } catch (IOException unused) {
            } catch (Throwable th2) {
                com.apm.lite.c.a();
                com.apm.lite.c.b("NPTH_CATCH", th2);
            }
            return map;
        }
    }

    public static class e extends c {
        e(File file) {
            super(file);
        }

        public JSONArray c(HashMap<String, List<String>> map) {
            int iIndexOf;
            List<String> list;
            JSONArray jSONArray = new JSONArray();
            if (map.isEmpty()) {
                return jSONArray;
            }
            try {
                JSONArray jSONArrayU = i.u(this.f40105a.getAbsolutePath());
                if (jSONArrayU == null) {
                    return jSONArray;
                }
                for (int i10 = 0; i10 < jSONArrayU.length(); i10++) {
                    String strOptString = jSONArrayU.optString(i10);
                    if (!TextUtils.isEmpty(strOptString) && (iIndexOf = strOptString.indexOf(":")) > 2) {
                        String strSubstring = strOptString.substring(2, iIndexOf);
                        if (map.containsKey(strSubstring) && (list = map.get(strSubstring)) != null) {
                            Iterator<String> it = list.iterator();
                            while (it.hasNext()) {
                                jSONArray.put(it.next() + " " + strOptString);
                            }
                            map.remove(strSubstring);
                        }
                    }
                }
                Iterator<List<String>> it2 = map.values().iterator();
                while (it2.hasNext()) {
                    Iterator<String> it3 = it2.next().iterator();
                    while (it3.hasNext()) {
                        jSONArray.put(it3.next() + "  0x000000:unknown");
                    }
                }
            } catch (IOException unused) {
            } catch (Throwable th2) {
                com.apm.lite.c.a();
                com.apm.lite.c.b("NPTH_CATCH", th2);
            }
            return jSONArray;
        }
    }

    public static class f extends c {
        f(File file) {
            super(file);
            this.f40106b = "Total Threads Count:";
            this.f40107c = ":";
            this.f40108d = -2;
        }
    }

    public static int a(String str) {
        return new a(o.f(str)).a();
    }

    public static JSONArray b(File file, File file2) {
        return new e(file2).c(new C0313d(file).c());
    }

    public static int c(String str) {
        return new f(o.j(str)).a();
    }

    public static int d(String str) {
        return new b(o.n(str)).a();
    }
}
