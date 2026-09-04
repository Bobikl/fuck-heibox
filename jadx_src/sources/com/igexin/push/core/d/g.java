package com.igexin.push.core.d;

import android.content.Context;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
public class g implements c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected static boolean f63712c = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static String f63713e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected String f63714a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected String f63715b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected boolean f63716d = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String[] f63717f;

    public g(String str, String str2) {
        this.f63714a = str;
        this.f63715b = str2;
    }

    protected void a(String[] strArr) {
        this.f63717f = strArr;
    }

    @Override // com.igexin.push.core.d.c
    public boolean a(Context context) {
        if (this.f63716d) {
            return f63712c;
        }
        if (context == null) {
            return false;
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            f63712c = (packageManager == null || packageManager.resolveContentProvider(this.f63714a, 0) == null) ? false : true;
        } catch (Throwable unused) {
            f63712c = false;
        }
        this.f63716d = true;
        return f63712c;
    }

    @Override // com.igexin.push.core.d.c
    public String b(Context context) {
        if (TextUtils.isEmpty(f63713e)) {
            try {
                Cursor cursorQuery = context.getContentResolver().query(Uri.parse("content://" + this.f63714a + "/" + this.f63715b), null, null, this.f63717f, null);
                if (cursorQuery != null) {
                    cursorQuery.moveToFirst();
                    f63713e = cursorQuery.getString(cursorQuery.getColumnIndex("value"));
                }
            } catch (Throwable unused) {
                f63713e = null;
            }
        }
        return f63713e;
    }

    @Override // com.igexin.push.core.d.c
    public boolean c(Context context) {
        return true;
    }
}
