package com.xiaomi.mipush.sdk;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class af {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile af f106747a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private Context f118a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private List<x> f119a = new ArrayList();

    private af(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f118a = applicationContext;
        if (applicationContext == null) {
            this.f118a = context;
        }
    }

    public static af a(Context context) {
        if (f106747a == null) {
            synchronized (af.class) {
                if (f106747a == null) {
                    f106747a = new af(context);
                }
            }
        }
        return f106747a;
    }

    public int a(String str) {
        synchronized (this.f119a) {
            x xVar = new x();
            xVar.f160a = str;
            if (this.f119a.contains(xVar)) {
                for (x xVar2 : this.f119a) {
                    if (xVar2.equals(xVar)) {
                        return xVar2.f106804a;
                    }
                }
            }
            return 0;
        }
    }

    public synchronized String a(au auVar) {
        return this.f118a.getSharedPreferences("mipush_extra", 0).getString(auVar.name(), "");
    }

    public synchronized void a(au auVar, String str) {
        SharedPreferences sharedPreferences = this.f118a.getSharedPreferences("mipush_extra", 0);
        sharedPreferences.edit().putString(auVar.name(), str).apply();
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public void m88a(String str) {
        synchronized (this.f119a) {
            x xVar = new x();
            xVar.f106804a = 0;
            xVar.f160a = str;
            if (this.f119a.contains(xVar)) {
                this.f119a.remove(xVar);
            }
            this.f119a.add(xVar);
        }
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public boolean m89a(String str) {
        synchronized (this.f119a) {
            x xVar = new x();
            xVar.f160a = str;
            return this.f119a.contains(xVar);
        }
    }

    public void b(String str) {
        synchronized (this.f119a) {
            x xVar = new x();
            xVar.f160a = str;
            if (this.f119a.contains(xVar)) {
                for (x xVar2 : this.f119a) {
                    if (xVar.equals(xVar2)) {
                        xVar = xVar2;
                        break;
                    }
                }
            }
            xVar.f106804a++;
            this.f119a.remove(xVar);
            this.f119a.add(xVar);
        }
    }

    public void c(String str) {
        synchronized (this.f119a) {
            x xVar = new x();
            xVar.f160a = str;
            if (this.f119a.contains(xVar)) {
                this.f119a.remove(xVar);
            }
        }
    }
}
