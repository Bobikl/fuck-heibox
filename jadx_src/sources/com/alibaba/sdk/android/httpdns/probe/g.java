package com.alibaba.sdk.android.httpdns.probe;

import com.alibaba.sdk.android.httpdns.i;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: loaded from: classes6.dex */
public class g implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private CountDownLatch f38004a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ConcurrentHashMap<String, Long> f38005b;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private String f38006o;
    private int port;

    public g(String str, int i10, CountDownLatch countDownLatch, ConcurrentHashMap<String, Long> concurrentHashMap) {
        this.f38006o = str;
        this.port = i10;
        this.f38004a = countDownLatch;
        this.f38005b = concurrentHashMap;
    }

    private long a(String str, int i10) throws Throwable {
        long jCurrentTimeMillis;
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        Socket socket = null;
        try {
            try {
                Socket socket2 = new Socket();
                try {
                    socket2.connect(new InetSocketAddress(str, i10), 5000);
                    jCurrentTimeMillis = System.currentTimeMillis();
                    try {
                        socket2.close();
                    } catch (IOException e10) {
                        i.f("socket close failed:" + e10.toString());
                    }
                } catch (IOException e11) {
                    e = e11;
                    socket = socket2;
                    i.f("connect failed:" + e.toString());
                    if (socket != null) {
                        try {
                            socket.close();
                        } catch (IOException e12) {
                            i.f("socket close failed:" + e12.toString());
                        }
                    }
                    jCurrentTimeMillis = 2147483647L;
                } catch (Throwable th2) {
                    th = th2;
                    socket = socket2;
                    if (socket != null) {
                        try {
                            socket.close();
                        } catch (IOException e13) {
                            i.f("socket close failed:" + e13.toString());
                        }
                    }
                    throw th;
                }
            } catch (IOException e14) {
                e = e14;
            }
            if (jCurrentTimeMillis == 2147483647L) {
                return 2147483647L;
            }
            return jCurrentTimeMillis - jCurrentTimeMillis2;
        } catch (Throwable th3) {
            th = th3;
        }
    }

    private boolean a(int i10) {
        return i10 >= 1 && i10 <= 65535;
    }

    @Override // java.lang.Runnable
    public void run() throws Throwable {
        try {
            if (this.f38006o == null || !a(this.port)) {
                i.f("invalid params, give up");
            } else {
                long jA = a(this.f38006o, this.port);
                i.d("connect cost for ip:" + this.f38006o + " is " + jA);
                ConcurrentHashMap<String, Long> concurrentHashMap = this.f38005b;
                if (concurrentHashMap != null) {
                    concurrentHashMap.put(this.f38006o, Long.valueOf(jA));
                }
            }
            CountDownLatch countDownLatch = this.f38004a;
            if (countDownLatch != null) {
                countDownLatch.countDown();
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }
}
