package com.umeng.commonsdk.statistics.common;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.umeng.commonsdk.framework.UMFrUtils;
import com.umeng.commonsdk.statistics.internal.PreferenceWrapper;
import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: compiled from: StoreHelper.java */
/* JADX INFO: loaded from: classes4.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static d f105312a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Context f105313b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static String f105314c = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f105315e = "mobclick_agent_user_";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f105316f = "mobclick_agent_header_";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f105317g = "mobclick_agent_cached_";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private a f105318d;

    /* JADX INFO: compiled from: StoreHelper.java */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f105319a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private File f105320b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private FilenameFilter f105321c;

        public a(Context context) {
            this(context, ".um");
        }

        public a(Context context, String str) {
            this.f105319a = 10;
            this.f105321c = new FilenameFilter() { // from class: com.umeng.commonsdk.statistics.common.d.a.1
                @Override // java.io.FilenameFilter
                public boolean accept(File file, String str2) {
                    return str2.startsWith("um");
                }
            };
            File file = new File(context.getFilesDir(), str);
            this.f105320b = file;
            if (file.exists() && this.f105320b.isDirectory()) {
                return;
            }
            this.f105320b.mkdir();
        }

        public void a(b bVar) {
            File file;
            File[] fileArrListFiles = this.f105320b.listFiles(this.f105321c);
            if (fileArrListFiles != null && fileArrListFiles.length >= 10) {
                Arrays.sort(fileArrListFiles);
                int length = fileArrListFiles.length - 10;
                for (int i10 = 0; i10 < length; i10++) {
                    fileArrListFiles[i10].delete();
                }
            }
            if (fileArrListFiles == null || fileArrListFiles.length <= 0) {
                return;
            }
            bVar.a(this.f105320b);
            int length2 = fileArrListFiles.length;
            for (int i11 = 0; i11 < length2; i11++) {
                try {
                    if (bVar.b(fileArrListFiles[i11])) {
                        file = fileArrListFiles[i11];
                        file.delete();
                    }
                } catch (Throwable unused) {
                    file = fileArrListFiles[i11];
                }
            }
            bVar.c(this.f105320b);
        }

        public void a(byte[] bArr) {
            if (bArr == null || bArr.length == 0) {
                return;
            }
            try {
                HelperUtils.writeFile(new File(this.f105320b, String.format(Locale.US, "um_cache_%d.env", Long.valueOf(System.currentTimeMillis()))), bArr);
            } catch (Exception unused) {
            }
        }

        public boolean a() {
            File[] fileArrListFiles = this.f105320b.listFiles();
            return fileArrListFiles != null && fileArrListFiles.length > 0;
        }

        public void b() {
            File[] fileArrListFiles = this.f105320b.listFiles(this.f105321c);
            if (fileArrListFiles == null || fileArrListFiles.length <= 0) {
                return;
            }
            for (File file : fileArrListFiles) {
                file.delete();
            }
        }

        public int c() {
            File[] fileArrListFiles = this.f105320b.listFiles(this.f105321c);
            if (fileArrListFiles == null || fileArrListFiles.length <= 0) {
                return 0;
            }
            return fileArrListFiles.length;
        }
    }

    /* JADX INFO: compiled from: StoreHelper.java */
    public interface b {
        void a(File file);

        boolean b(File file);

        void c(File file);
    }

    public d(Context context) {
        this.f105318d = new a(context);
    }

    public static synchronized d a(Context context) {
        f105313b = context.getApplicationContext();
        f105314c = context.getPackageName();
        if (f105312a == null) {
            f105312a = new d(context);
        }
        return f105312a;
    }

    private SharedPreferences f() {
        return f105313b.getSharedPreferences(f105315e + f105314c, 0);
    }

    public int a() {
        SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(f105313b);
        if (sharedPreferences != null) {
            return sharedPreferences.getInt("vt", 0);
        }
        return 0;
    }

    public void a(int i10) {
        SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(f105313b);
        if (sharedPreferences != null) {
            sharedPreferences.edit().putInt("vt", i10).commit();
        }
    }

    public void a(String str) {
        SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(f105313b);
        if (sharedPreferences != null) {
            sharedPreferences.edit().putString("st", str).commit();
        }
    }

    public void a(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        SharedPreferences.Editor editorEdit = f().edit();
        editorEdit.putString("au_p", str);
        editorEdit.putString("au_u", str2);
        editorEdit.commit();
    }

    public String b() {
        SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(f105313b);
        if (sharedPreferences != null) {
            return sharedPreferences.getString("st", null);
        }
        return null;
    }

    public boolean c() {
        return UMFrUtils.envelopeFileNumber(f105313b) > 0;
    }

    public String[] d() {
        try {
            SharedPreferences sharedPreferencesF = f();
            String string = sharedPreferencesF.getString("au_p", null);
            String string2 = sharedPreferencesF.getString("au_u", null);
            if (string != null && string2 != null) {
                return new String[]{string, string2};
            }
        } catch (Exception unused) {
        }
        return null;
    }

    public void e() {
        f().edit().remove("au_p").remove("au_u").commit();
    }
}
