package com.igexin.sdk.a;

import android.content.Context;
import java.io.File;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f64090a;

    public d(Context context) {
        if (context == null) {
            return;
        }
        this.f64090a = context.getFilesDir().getPath() + "/push.pid";
    }

    public void a() {
        if (c()) {
            return;
        }
        try {
            new File(this.f64090a).createNewFile();
        } catch (IOException unused) {
        }
    }

    public void b() {
        if (c()) {
            new File(this.f64090a).delete();
        }
    }

    public boolean c() {
        return new File(this.f64090a).exists();
    }
}
