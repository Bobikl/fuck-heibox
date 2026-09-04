package com.tencent.qimei.r;

import android.content.Context;
import android.content.SharedPreferences;
import com.tencent.qimei.upload.BuildConfig;

/* JADX INFO: compiled from: Bugly.java */
/* JADX INFO: loaded from: classes4.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static a f101345a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f101346b = false;

    public static a a() {
        if (f101345a == null) {
            synchronized (a.class) {
                if (f101345a == null) {
                    f101345a = new a();
                }
            }
        }
        return f101345a;
    }

    public synchronized void a(Context context) {
        if (!this.f101346b && context != null) {
            if (!com.tencent.qimei.d.a.g()) {
                this.f101346b = true;
                return;
            }
            SharedPreferences sharedPreferences = context.getSharedPreferences("BuglySdkInfos", 0);
            String string = sharedPreferences.getString("4ef223fde6", "");
            if (string == null || !string.equals(BuildConfig.SDK_VERSION)) {
                SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                editorEdit.putString("4ef223fde6", BuildConfig.SDK_VERSION);
                editorEdit.commit();
            }
            this.f101346b = true;
        }
    }
}
