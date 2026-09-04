package com.tencent.qimei.h;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: NetworkStateReceiver.java */
/* JADX INFO: loaded from: classes4.dex */
public final class a extends BroadcastReceiver implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final List<b> f101253a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile boolean f101254b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f101255c = true;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile boolean f101256d = false;

    public static void a(Context context, b bVar) {
        if (context == null) {
            com.tencent.qimei.n.a.b("[net] context == null!", new Object[0]);
            return;
        }
        List<b> list = f101253a;
        synchronized (list) {
            list.add(bVar);
        }
        if (f101254b) {
            return;
        }
        try {
            context.registerReceiver(new a(), new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            f101254b = true;
        } catch (Exception e10) {
            com.tencent.qimei.n.a.a(e10);
        }
    }

    public final void a() {
        List<b> list = f101253a;
        synchronized (list) {
            Iterator<b> it = list.iterator();
            while (it.hasNext()) {
                it.next().a();
            }
        }
    }

    public final void b() {
        List<b> list = f101253a;
        synchronized (list) {
            Iterator<b> it = list.iterator();
            while (it.hasNext()) {
                it.next().b();
            }
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (this.f101255c) {
            this.f101255c = false;
        } else {
            if (this.f101256d) {
                return;
            }
            com.tencent.qimei.c.a.a().a(this);
        }
    }

    @Override // java.lang.Runnable
    @SuppressLint({"MissingPermission"})
    public void run() {
        this.f101256d = true;
        if (com.tencent.qimei.j.a.b()) {
            com.tencent.qimei.n.a.d("[net] current network available!", new Object[0]);
            a();
        } else {
            com.tencent.qimei.n.a.d("[net] current network unavailable!", new Object[0]);
            b();
        }
        this.f101256d = false;
    }
}
