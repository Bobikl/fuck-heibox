package com.xiaomi.push;

import android.content.Context;
import java.io.File;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public abstract class u implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f108052a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private File f1125a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private Runnable f1126a;

    private u(Context context, File file) {
        this.f108052a = context;
        this.f1125a = file;
    }

    /* synthetic */ u(Context context, File file, v vVar) {
        this(context, file);
    }

    public static void a(Context context, File file, Runnable runnable) {
        new v(context, file, runnable).run();
    }

    protected abstract void a(Context context);

    @Override // java.lang.Runnable
    public final void run() {
        t tVarA = null;
        try {
            if (this.f1125a == null) {
                this.f1125a = new File(this.f108052a.getFilesDir(), "default_locker");
            }
            tVarA = t.a(this.f108052a, this.f1125a);
            Runnable runnable = this.f1126a;
            if (runnable != null) {
                runnable.run();
            }
            a(this.f108052a);
        } catch (IOException e10) {
            e10.printStackTrace();
        } finally {
            if (tVarA != null) {
                tVarA.a();
            }
        }
    }
}
