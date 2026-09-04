package com.alipay.face.ui;

import android.app.Activity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: ZimActivityLifeCircle.java */
/* JADX INFO: loaded from: classes6.dex */
public class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static b f39010b = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<Activity> f39011a = new ArrayList();

    private b() {
    }

    public static b b() {
        return f39010b;
    }

    public void a() {
        if (this.f39011a.size() > 0) {
            Iterator<Activity> it = this.f39011a.iterator();
            while (it.hasNext()) {
                it.next().finish();
            }
        }
    }

    public boolean c() {
        return this.f39011a.size() > 0;
    }

    public void d(Activity activity) {
        this.f39011a.add(activity);
    }

    public void e(Activity activity) {
        if (this.f39011a.contains(activity)) {
            this.f39011a.remove(activity);
        }
    }

    public void f(Activity activity) {
        if (this.f39011a.contains(activity)) {
            return;
        }
        this.f39011a.add(activity);
    }
}
