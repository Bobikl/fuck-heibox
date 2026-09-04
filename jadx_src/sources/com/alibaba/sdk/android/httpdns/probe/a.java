package com.alibaba.sdk.android.httpdns.probe;

import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes6.dex */
public class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private f f37992a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ConcurrentHashMap<String, Long> f37993b = new ConcurrentHashMap<>();
    private String host;
    private String[] ips;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f37994j;
    private int port;

    public a(long j10, String str, String[] strArr, int i10, f fVar) {
        this.f37994j = j10;
        this.host = str;
        this.ips = strArr;
        this.port = i10;
        this.f37992a = fVar;
    }

    private c a(String[] strArr) {
        String[] strArr2 = this.ips;
        if (strArr2 == null || strArr2.length == 0 || strArr == null || strArr.length == 0) {
            return null;
        }
        String str = strArr2[0];
        String str2 = strArr[0];
        return new c(this.host, strArr, str, str2, this.f37993b.containsKey(str) ? this.f37993b.get(str).longValue() : 2147483647L, this.f37993b.containsKey(str2) ? this.f37993b.get(str2).longValue() : 2147483647L);
    }

    private String[] a(ConcurrentHashMap<String, Long> concurrentHashMap) {
        if (concurrentHashMap == null) {
            return null;
        }
        int size = concurrentHashMap.size();
        String[] strArr = new String[size];
        Iterator<String> it = concurrentHashMap.keySet().iterator();
        int i10 = 0;
        while (it.hasNext()) {
            strArr[i10] = new String(it.next());
            i10++;
        }
        for (int i11 = 0; i11 < size - 1; i11++) {
            int i12 = 0;
            while (i12 < (size - i11) - 1) {
                int i13 = i12 + 1;
                if (concurrentHashMap.get(strArr[i12]).longValue() > concurrentHashMap.get(strArr[i13]).longValue()) {
                    String str = strArr[i12];
                    strArr[i12] = strArr[i13];
                    strArr[i13] = str;
                }
                i12 = i13;
            }
        }
        return strArr;
    }

    @Override // java.lang.Runnable
    public void run() {
        String[] strArrA;
        String[] strArr = this.ips;
        if (strArr == null || strArr.length == 0) {
            return;
        }
        CountDownLatch countDownLatch = new CountDownLatch(this.ips.length);
        for (int i10 = 0; i10 < this.ips.length; i10++) {
            com.alibaba.sdk.android.httpdns.c.a().execute(new g(this.ips[i10], this.port, countDownLatch, this.f37993b));
        }
        try {
            countDownLatch.await(10000L, TimeUnit.MILLISECONDS);
            if (this.f37992a == null || (strArrA = a(this.f37993b)) == null || strArrA.length == 0) {
                return;
            }
            this.f37992a.a(this.f37994j, a(strArrA));
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }
}
