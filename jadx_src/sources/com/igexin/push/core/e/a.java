package com.igexin.push.core.e;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.umeng.analytics.pro.ak;
import java.io.File;
import org.apache.tools.ant.taskdefs.optional.vss.g;

/* JADX INFO: loaded from: classes.dex */
public class a implements c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f63731c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f63732d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f63730b = "gt" + Build.MODEL;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final byte[] f63729a = {47, 115, 100, 99, 97, 114, 100, 47, 65, 110, 100, 114, 111, 105, 100, 47, 109, 101, 100, 105, 97, 47};

    protected a() {
        try {
            if (e(com.igexin.push.core.d.f63671e)) {
                this.f63731c = new String(f63729a) + "." + Integer.toHexString(f63730b.hashCode()).toUpperCase() + "/";
                StringBuilder sb2 = new StringBuilder();
                sb2.append("AndroidQSDStorage|dir = ");
                sb2.append(this.f63731c);
                com.igexin.a.a.c.b.a(sb2.toString(), new Object[0]);
                File file = new File(this.f63731c);
                if (file.exists()) {
                    return;
                }
                file.mkdirs();
            }
        } catch (Throwable th2) {
            com.igexin.a.a.c.b.a("AndroidQSDStorage|e = " + th2, new Object[0]);
        }
    }

    private String a(String str) {
        return com.igexin.a.a.c.a.a(com.igexin.a.a.a.a.d(str.getBytes(), f63730b)).toUpperCase();
    }

    private String b(String str) {
        return new String(com.igexin.a.a.a.a.c(com.igexin.a.a.c.a.a(str), f63730b));
    }

    private void d(Context context) {
        if (TextUtils.isEmpty(this.f63732d)) {
            this.f63732d = this.f63731c + com.igexin.a.a.c.a.a(com.igexin.a.a.a.a.d(context.getPackageName().getBytes(), f63730b)).toUpperCase() + "/";
        }
    }

    private boolean e(Context context) {
        return new com.igexin.sdk.a.b(context).c();
    }

    @Override // com.igexin.push.core.e.c
    public String a(Context context) {
        if (!e(context)) {
            return null;
        }
        File file = new File(this.f63731c + "di/");
        if (!file.exists()) {
            return null;
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null || fileArrListFiles.length == 0) {
            com.igexin.a.a.c.b.a("AndroidQSDStorage|getDeviceId() childs = NULL", new Object[0]);
            return null;
        }
        File file2 = fileArrListFiles[0];
        try {
            return b(file2.getName());
        } catch (Throwable unused) {
            file2.delete();
            return null;
        }
    }

    @Override // com.igexin.push.core.e.c
    public void a(Context context, long j10) {
        if (e(context)) {
            d(context);
            File file = new File(this.f63732d + g.f135467q2);
            if (j10 == 0) {
                com.igexin.push.util.d.a(file, new String[0]);
                return;
            }
            String strA = a(String.valueOf(j10));
            File file2 = new File(file.getAbsolutePath() + "/" + strA);
            if (file2.exists()) {
                return;
            }
            boolean zMkdirs = file2.mkdirs();
            if (zMkdirs) {
                com.igexin.push.util.d.a(file, strA);
            }
            com.igexin.a.a.c.b.a("AndroidQSDStorage|saveSession() isCreated = " + zMkdirs, new Object[0]);
        }
    }

    @Override // com.igexin.push.core.e.c
    public void a(Context context, String str) {
        if (e(context) && !TextUtils.isEmpty(str)) {
            String strA = a(str);
            File file = new File(this.f63731c + "di");
            File file2 = new File(file.getAbsolutePath() + "/" + strA);
            if (file2.exists()) {
                return;
            }
            boolean zMkdirs = file2.mkdirs();
            if (zMkdirs) {
                com.igexin.push.util.d.a(file, strA);
            }
            com.igexin.a.a.c.b.a("AndroidQSDStorage|saveDeviceId() isCreated = " + zMkdirs, new Object[0]);
        }
    }

    @Override // com.igexin.push.core.e.c
    public String b(Context context) {
        if (!e(context)) {
            return null;
        }
        d(context);
        File file = new File(this.f63732d + ak.aF);
        if (!file.exists()) {
            return null;
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null || fileArrListFiles.length == 0) {
            com.igexin.a.a.c.b.a("AndroidQSDStorage|getCid() childs = NULL", new Object[0]);
            return null;
        }
        File file2 = fileArrListFiles[0];
        try {
            return b(file2.getName());
        } catch (Throwable unused) {
            file2.delete();
            return null;
        }
    }

    @Override // com.igexin.push.core.e.c
    public void b(Context context, String str) {
        if (e(context)) {
            d(context);
            File file = new File(this.f63732d + ak.aF);
            if (TextUtils.isEmpty(str)) {
                com.igexin.push.util.d.a(file, new String[0]);
                return;
            }
            String strA = a(str);
            File file2 = new File(file.getAbsolutePath() + "/" + strA);
            if (file2.exists()) {
                return;
            }
            boolean zMkdirs = file2.mkdirs();
            if (zMkdirs) {
                com.igexin.push.util.d.a(file, strA);
            }
            com.igexin.a.a.c.b.a("AndroidQSDStorage|saveCid() isCreated = " + zMkdirs, new Object[0]);
        }
    }

    @Override // com.igexin.push.core.e.c
    public long c(Context context) {
        if (!e(context)) {
            return 0L;
        }
        d(context);
        File file = new File(this.f63732d + g.f135467q2);
        if (!file.exists()) {
            return 0L;
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null || fileArrListFiles.length == 0) {
            com.igexin.a.a.c.b.a("AndroidQSDStorage|getSession() childs = NULL", new Object[0]);
            return 0L;
        }
        File file2 = fileArrListFiles[0];
        try {
            return Long.parseLong(b(file2.getName()));
        } catch (Throwable unused) {
            file2.delete();
            return 0L;
        }
    }
}
