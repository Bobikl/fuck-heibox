package cn.fly.verify;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import com.xiaomi.mipush.sdk.Constants;
import java.io.File;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class gk {

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f36772a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f36773b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private SQLiteDatabase f36774c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private LinkedHashMap<String, String> f36775d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private HashMap<String, Boolean> f36776e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private String f36777f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private boolean f36778g;

        private a(String str, String str2) {
            this.f36772a = str;
            this.f36773b = str2;
            this.f36775d = new LinkedHashMap<>();
            this.f36776e = new HashMap<>();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a() throws Throwable {
            if (TextUtils.isEmpty(this.f36772a)) {
                throw new Throwable("path is null");
            }
            File file = new File(this.f36772a);
            Cursor cursorQuery = null;
            if (this.f36774c != null && !file.exists()) {
                this.f36774c.close();
                try {
                    File parentFile = file.getParentFile();
                    if (parentFile != null && (!parentFile.exists() || !parentFile.isDirectory())) {
                        parentFile.delete();
                        parentFile.mkdirs();
                    }
                } catch (Throwable unused) {
                }
                this.f36774c = null;
            }
            if (this.f36774c == null) {
                if (!file.exists()) {
                    try {
                        File parentFile2 = file.getParentFile();
                        if (parentFile2 != null && (!parentFile2.exists() || !parentFile2.isDirectory())) {
                            parentFile2.delete();
                            parentFile2.mkdirs();
                            file.createNewFile();
                        }
                    } catch (Throwable unused2) {
                    }
                }
                SQLiteDatabase sQLiteDatabaseOpenOrCreateDatabase = SQLiteDatabase.openOrCreateDatabase(file, (SQLiteDatabase.CursorFactory) null);
                this.f36774c = sQLiteDatabaseOpenOrCreateDatabase;
                try {
                    cursorQuery = sQLiteDatabaseOpenOrCreateDatabase.query(ec.a("013CdgbcQe^bg%gdWbfbd>b7dgHgdDbh"), null, ec.a("017g6caOhd<gggfgdWbc9bagdScb]bdZd@gggf"), new String[]{ec.a("005gbXdd!ed"), this.f36773b}, null, null, null);
                    boolean z10 = cursorQuery == null || cursorQuery.getCount() <= 0;
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    if (z10) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("create table  ");
                        sb2.append(this.f36773b);
                        sb2.append("(");
                        for (Map.Entry<String, String> entry : this.f36775d.entrySet()) {
                            String key = entry.getKey();
                            String value = entry.getValue();
                            boolean zBooleanValue = this.f36776e.get(key).booleanValue();
                            boolean zEquals = key.equals(this.f36777f);
                            boolean z11 = zEquals ? this.f36778g : false;
                            sb2.append(key);
                            sb2.append(" ");
                            sb2.append(value);
                            sb2.append(zBooleanValue ? " not null" : "");
                            sb2.append(zEquals ? " primary key" : "");
                            sb2.append(z11 ? " autoincrement," : Constants.ACCEPT_TIME_SEPARATOR_SP);
                        }
                        sb2.replace(sb2.length() - 1, sb2.length(), ");");
                        try {
                            SQLiteDatabase.class.getMethod(ec.a("007dCcgKdaKcjhhdc"), String.class).invoke(this.f36774c, sb2.toString());
                        } catch (Throwable th2) {
                            es.a().a(th2);
                        }
                    }
                } catch (Throwable th3) {
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    throw th3;
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public String b() {
            return this.f36773b;
        }

        public void a(String str, String str2, boolean z10) {
            if (this.f36774c == null) {
                this.f36775d.put(str, str2);
                this.f36776e.put(str, Boolean.valueOf(z10));
            }
        }
    }

    public static int a(a aVar, String str, String[] strArr) throws Throwable {
        aVar.a();
        return aVar.f36774c.delete(aVar.b(), str, strArr);
    }

    public static long a(a aVar, ContentValues contentValues) throws Throwable {
        aVar.a();
        return aVar.f36774c.replace(aVar.b(), null, contentValues);
    }

    public static Cursor a(a aVar, String[] strArr, String str, String[] strArr2, String str2) throws Throwable {
        aVar.a();
        return aVar.f36774c.query(aVar.b(), strArr, str, strArr2, null, null, str2);
    }

    public static a a(String str, String str2) {
        return new a(str, str2);
    }
}
