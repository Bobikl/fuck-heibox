package cn.fly.verify;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes6.dex */
public abstract class gv extends Thread {
    public gv(String str) {
        if (TextUtils.isEmpty("M-")) {
            return;
        }
        setName("M-" + str);
    }

    protected abstract void a() throws Throwable;

    protected void a(Throwable th2) {
        es.a().a(th2);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        try {
            a();
        } catch (Throwable th2) {
            a(th2);
        }
    }
}
