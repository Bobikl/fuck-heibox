package com.igexin.sdk.a;

import android.content.Context;
import java.io.File;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f64088a;

    public b(Context context) {
        if (context == null) {
            return;
        }
        this.f64088a = context.getFilesDir().getPath() + "/push_sd.pid";
    }

    public void a() {
        if (c()) {
            try {
                new File(this.f64088a).delete();
            } catch (Exception unused) {
            }
        }
    }

    public void b() {
        try {
            new File(this.f64088a).createNewFile();
        } catch (IOException unused) {
        }
    }

    public boolean c() {
        return new File(this.f64088a).exists();
    }
}
