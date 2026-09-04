package com.tencent.beacon.base.net.c;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.annotation.z0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: NetworkStateReceiver.java */
/* JADX INFO: loaded from: classes4.dex */
public final class e extends BroadcastReceiver implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final List<a> f98925a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile boolean f98926b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f98927c = true;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile boolean f98928d = false;

    /* JADX INFO: compiled from: NetworkStateReceiver.java */
    public interface a {
        void a();

        void b();
    }

    private void a() {
        List<a> list = f98925a;
        synchronized (list) {
            Iterator<a> it = list.iterator();
            while (it.hasNext()) {
                it.next().a();
            }
        }
    }

    public static void a(Context context, a aVar) {
        if (context == null) {
            com.tencent.beacon.base.util.c.b("[net] context == null!", new Object[0]);
            return;
        }
        List<a> list = f98925a;
        synchronized (list) {
            if (!list.contains(aVar)) {
                list.add(aVar);
            }
        }
        if (f98926b) {
            return;
        }
        context.registerReceiver(new e(), new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        f98926b = true;
    }

    private void b() {
        List<a> list = f98925a;
        synchronized (list) {
            Iterator<a> it = list.iterator();
            while (it.hasNext()) {
                it.next().b();
            }
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (this.f98927c) {
            this.f98927c = false;
        } else {
            if (this.f98928d) {
                return;
            }
            com.tencent.beacon.a.b.a.a().a(this);
        }
    }

    @Override // java.lang.Runnable
    @z0("android.permission.ACCESS_NETWORK_STATE")
    public void run() {
        this.f98928d = true;
        if (d.d()) {
            com.tencent.beacon.base.util.c.d("[net] current network available!", new Object[0]);
            a();
        } else {
            com.tencent.beacon.base.util.c.d("[net] current network unavailable!", new Object[0]);
            b();
        }
        this.f98928d = false;
    }
}
