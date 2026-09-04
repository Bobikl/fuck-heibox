package com.apm.lite.runtime;

import android.content.Context;
import android.text.TextUtils;
import com.xiaomi.mipush.sdk.Constants;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class p {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static p f40207f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private File f40208a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private File f40209b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private File f40210c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Context f40211d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private b f40212e = null;

    public class a implements FilenameFilter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f40213a;

        a(String str) {
            this.f40213a = str;
        }

        @Override // java.io.FilenameFilter
        public boolean accept(File file, String str) {
            return str.endsWith(this.f40213a) && Pattern.compile("^\\d{1,13}-\\d{1,13}.*").matcher(str).matches();
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f40215a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f40216b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private File f40217c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private JSONObject f40218d;

        private b(File file) {
            long j10;
            this.f40218d = null;
            this.f40217c = file;
            String[] strArrSplit = file.getName().split("-|\\.");
            if (strArrSplit.length >= 2) {
                this.f40215a = Long.parseLong(strArrSplit[0]);
                j10 = Long.parseLong(strArrSplit[1]);
            } else {
                String name = file.getName();
                if (TextUtils.isEmpty(name) || name.length() < 13) {
                    return;
                }
                String strSubstring = name.substring(0, 13);
                if (!TextUtils.isDigitsOnly(strSubstring)) {
                    return;
                }
                j10 = Long.parseLong(strSubstring);
                this.f40215a = j10;
            }
            this.f40216b = j10;
        }

        /* synthetic */ b(File file, a aVar) {
            this(file);
        }

        private String a() {
            return this.f40215a + Constants.ACCEPT_TIME_SEPARATOR_SERVER + this.f40216b + ".ctx";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void c(long j10) {
            this.f40216b = j10;
            this.f40217c.renameTo(new File(this.f40217c.getParent(), a()));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public JSONObject f() {
            if (this.f40218d == null) {
                try {
                    this.f40218d = new JSONObject(com.apm.lite.k.i.z(this.f40217c.getAbsolutePath()));
                } catch (Throwable unused) {
                }
                if (this.f40218d == null) {
                    this.f40218d = new JSONObject();
                }
            }
            return this.f40218d;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean g(long j10) {
            long j11 = this.f40215a;
            if (j11 > j10 && j11 - j10 > 604800000) {
                return true;
            }
            long j12 = this.f40216b;
            if (j12 >= j10 || j10 - j12 <= 604800000) {
                return this.f40217c.lastModified() < j10 && j10 - this.f40217c.lastModified() > 604800000;
            }
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void j() {
            this.f40217c.delete();
        }
    }

    private p(Context context) {
        File fileL = com.apm.lite.k.o.l(context);
        if (!fileL.exists() || (!fileL.isDirectory() && fileL.delete())) {
            fileL.mkdirs();
            com.apm.lite.runtime.a.b.i();
        }
        this.f40208a = fileL;
        this.f40209b = new File(fileL, "did");
        this.f40210c = new File(fileL, "device_uuid");
        this.f40211d = context;
    }

    public static int a(JSONObject jSONObject, JSONObject jSONObject2) {
        if (com.apm.lite.d.c.p(jSONObject)) {
            return 2;
        }
        if (com.apm.lite.d.c.p(jSONObject2)) {
            return 0;
        }
        return (String.valueOf(jSONObject2.opt("update_version_code")).equals(String.valueOf(jSONObject.opt("update_version_code"))) && com.apm.lite.d.c.r(jSONObject)) ? 1 : 2;
    }

    public static p b() {
        if (f40207f == null) {
            f40207f = new p(com.apm.lite.e.m());
        }
        return f40207f;
    }

    private void e(long j10, long j11, JSONObject jSONObject, JSONArray jSONArray) {
        File file = new File(this.f40208a, "" + j10 + Constants.ACCEPT_TIME_SEPARATOR_SERVER + j11 + ".ctx");
        File file2 = new File(this.f40208a, "" + j10 + Constants.ACCEPT_TIME_SEPARATOR_SERVER + j11 + ".allData");
        try {
            com.apm.lite.k.i.m(file, jSONObject, false);
            com.apm.lite.k.i.l(file2, jSONArray, false);
            this.f40212e = new b(file, null);
        } catch (IOException e10) {
            com.apm.lite.c.a();
            com.apm.lite.c.b("NPTH_CATCH", e10);
        }
    }

    private b j() {
        if (this.f40212e == null) {
            n(".ctx");
        }
        return this.f40212e;
    }

    private void k(long j10) {
        try {
            ArrayList<b> arrayListN = n("");
            if (arrayListN.size() <= 6) {
                return;
            }
            for (b bVar : arrayListN) {
                if (bVar.g(j10)) {
                    bVar.j();
                }
            }
        } catch (Throwable th2) {
            com.apm.lite.c.a();
            com.apm.lite.c.b("NPTH_CATCH", th2);
        }
    }

    private File m(long j10) {
        for (b bVar : n(".ctx")) {
            if (j10 >= bVar.f40215a && j10 <= bVar.f40216b) {
                return bVar.f40217c;
            }
        }
        return null;
    }

    private ArrayList<b> n(String str) {
        File[] fileArrListFiles = this.f40208a.listFiles(new a(str));
        ArrayList<b> arrayList = new ArrayList<>();
        if (fileArrListFiles == null) {
            return arrayList;
        }
        com.apm.lite.k.q.a("foundRuntimeContextFiles " + fileArrListFiles.length);
        a aVar = null;
        b bVar = null;
        for (File file : fileArrListFiles) {
            try {
                b bVar2 = new b(file, aVar);
                arrayList.add(bVar2);
                if (this.f40212e == null && ".ctx".equals(str) && (bVar == null || bVar2.f40216b >= bVar.f40216b)) {
                    bVar = bVar2;
                }
            } catch (Throwable th2) {
                com.apm.lite.c.a();
                com.apm.lite.c.b("NPTH_CATCH", th2);
            }
        }
        if (this.f40212e == null && bVar != null) {
            this.f40212e = bVar;
        }
        return arrayList;
    }

    private File o(long j10) {
        for (b bVar : n(".allData")) {
            if (j10 >= bVar.f40215a && j10 <= bVar.f40216b) {
                return bVar.f40217c;
            }
        }
        return null;
    }

    private File p(long j10) {
        b bVar = null;
        for (b bVar2 : n(".ctx")) {
            if (bVar == null || Math.abs(bVar.f40216b - j10) > Math.abs(bVar2.f40216b - j10)) {
                bVar = bVar2;
            }
        }
        if (bVar == null) {
            return null;
        }
        return bVar.f40217c;
    }

    private File q(long j10) {
        b bVar = null;
        for (b bVar2 : n(".allData")) {
            if (bVar == null || Math.abs(bVar.f40216b - j10) > Math.abs(bVar2.f40216b - j10)) {
                bVar = bVar2;
            }
        }
        if (bVar == null) {
            return null;
        }
        return bVar.f40217c;
    }

    public String c(String str) {
        try {
            return com.apm.lite.k.i.z(this.f40210c.getAbsolutePath());
        } catch (Throwable unused) {
            return str;
        }
    }

    public JSONObject d(long j10) {
        boolean z10;
        String strZ;
        File fileM = m(j10);
        if (fileM == null) {
            fileM = p(j10);
            z10 = true;
        } else {
            z10 = false;
        }
        JSONObject jSONObject = null;
        if (fileM != null) {
            try {
                strZ = com.apm.lite.k.i.z(fileM.getAbsolutePath());
                try {
                    jSONObject = new JSONObject(strZ);
                } catch (Throwable th2) {
                    th = th2;
                    com.apm.lite.c.a();
                    com.apm.lite.c.b("NPTH_CATCH", new IOException("content :" + strZ, th));
                }
            } catch (Throwable th3) {
                th = th3;
                strZ = null;
            }
        }
        if (jSONObject != null && z10) {
            try {
                jSONObject.put("unauthentic_version", 1);
            } catch (JSONException e10) {
                com.apm.lite.c.a();
                com.apm.lite.c.b("NPTH_CATCH", e10);
            }
        }
        return jSONObject;
    }

    public void f(Map<String, Object> map, JSONArray jSONArray) {
        JSONObject jSONObjectD = com.apm.lite.d.c.a(this.f40211d).d(map);
        if (com.apm.lite.d.c.p(jSONObjectD)) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        b bVarJ = j();
        if (bVarJ == null) {
            e(jCurrentTimeMillis, jCurrentTimeMillis, jSONObjectD, jSONArray);
            return;
        }
        int iA = a(bVarJ.f(), jSONObjectD);
        if (iA == 1) {
            e(bVarJ.f40215a, jCurrentTimeMillis, jSONObjectD, jSONArray);
            com.apm.lite.k.i.r(bVarJ.f40217c);
        } else if (iA == 2) {
            e(jCurrentTimeMillis, jCurrentTimeMillis, jSONObjectD, jSONArray);
        } else if (iA == 3) {
            bVarJ.c(jCurrentTimeMillis);
        }
        k(jCurrentTimeMillis);
    }

    protected String g() {
        try {
            return com.apm.lite.k.i.z(this.f40209b.getAbsolutePath());
        } catch (Throwable unused) {
            return "0";
        }
    }

    public JSONArray h(long j10) {
        String strZ;
        File fileO = o(j10);
        if (fileO == null) {
            fileO = q(j10);
        }
        if (fileO == null) {
            return null;
        }
        try {
            strZ = com.apm.lite.k.i.z(fileO.getAbsolutePath());
            try {
                return new JSONArray(strZ);
            } catch (Throwable th2) {
                th = th2;
                com.apm.lite.c.a();
                com.apm.lite.c.b("NPTH_CATCH", new IOException("content :" + strZ, th));
                return null;
            }
        } catch (Throwable th3) {
            th = th3;
            strZ = null;
        }
    }

    protected void i(String str) {
        try {
            com.apm.lite.k.i.j(this.f40209b, str, false);
        } catch (Throwable unused) {
        }
    }

    public void l(String str) {
        try {
            com.apm.lite.k.i.j(this.f40210c, str, false);
        } catch (Throwable unused) {
        }
    }
}
