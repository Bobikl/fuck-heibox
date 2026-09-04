package com.igexin.push.c;

import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public class l implements Callable<j> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ k f63386a;

    l(k kVar) {
        this.f63386a = kVar;
    }

    @Override // java.util.concurrent.Callable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public j call() throws Throwable {
        Socket socket;
        Exception e10;
        if (!Thread.currentThread().isInterrupted()) {
            Socket socket2 = null;
            try {
                try {
                    if (Thread.currentThread().isInterrupted()) {
                        return null;
                    }
                    synchronized (r.class) {
                        if (this.f63386a.f63384e != null) {
                            this.f63386a.f63384e.a(this.f63386a.f63383d);
                        }
                    }
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    String[] strArrA = com.igexin.a.a.b.e.a(this.f63386a.f63383d.a());
                    socket = new Socket();
                    try {
                        socket.connect(new InetSocketAddress(strArrA[1], this.f63386a.f63383d.d()), 2500);
                        long jCurrentTimeMillis2 = System.currentTimeMillis();
                        String strA = k.a(socket.getInetAddress());
                        this.f63386a.f63383d.a("socket://" + strA + ":" + this.f63386a.f63383d.d(), jCurrentTimeMillis2 - jCurrentTimeMillis, jCurrentTimeMillis2);
                        com.igexin.a.a.c.b.a(k.f63380a + "|detect " + this.f63386a.h() + "|time = " + this.f63386a.f63383d.e(), new Object[0]);
                        synchronized (r.class) {
                            if (this.f63386a.f63384e != null && !Thread.currentThread().isInterrupted()) {
                                this.f63386a.f63384e.a(g.SUCCESS, this.f63386a.f63383d);
                            }
                            if (!socket.isClosed()) {
                                try {
                                    socket.close();
                                } catch (Exception unused) {
                                }
                            }
                        }
                    } catch (Exception e11) {
                        e10 = e11;
                        com.igexin.a.a.c.b.a(k.f63380a + "|detect " + this.f63386a.h() + "thread -->" + e10.toString(), new Object[0]);
                        synchronized (r.class) {
                            if (this.f63386a.f63384e != null) {
                                this.f63386a.f63383d.b();
                                this.f63386a.f63384e.a(g.EXCEPTION, this.f63386a.f63383d);
                            }
                            if (socket != null && !socket.isClosed()) {
                            }
                            return this.f63386a.f63383d;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    socket2 = socket;
                    if (socket2 != null && !socket2.isClosed()) {
                        try {
                            socket2.close();
                        } catch (Exception unused2) {
                        }
                    }
                    throw th;
                }
            } catch (Exception e12) {
                socket = null;
                e10 = e12;
            } catch (Throwable th3) {
                th = th3;
                if (socket2 != null) {
                    socket2.close();
                }
                throw th;
            }
        }
        return this.f63386a.f63383d;
    }
}
