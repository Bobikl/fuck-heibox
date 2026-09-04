package org.android.spdy;

import java.util.Random;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes5.dex */
public class SpdyBytePool {
    private static volatile SpdyBytePool gInstance;
    private static Object lock = new Object();
    private static Random rand = new Random();
    private TreeSet<SpdyByteArray> pool;
    private SpdyByteArray std = new SpdyByteArray();
    private long reused = 0;

    private SpdyBytePool() {
        this.pool = null;
        this.pool = new TreeSet<>();
    }

    public static SpdyBytePool getInstance() {
        if (gInstance == null) {
            synchronized (lock) {
                if (gInstance == null) {
                    gInstance = new SpdyBytePool();
                }
            }
        }
        return gInstance;
    }

    SpdyByteArray getSpdyByteArray(int i10) {
        SpdyByteArray spdyByteArrayCeiling;
        synchronized (lock) {
            SpdyByteArray spdyByteArray = this.std;
            spdyByteArray.length = i10;
            spdyByteArrayCeiling = this.pool.ceiling(spdyByteArray);
            if (spdyByteArrayCeiling == null) {
                spdyByteArrayCeiling = new SpdyByteArray(i10);
            } else {
                this.pool.remove(spdyByteArrayCeiling);
                this.reused += (long) i10;
            }
        }
        spduLog.Logi("libeasy", "getSpdyByteArray: " + spdyByteArrayCeiling);
        spduLog.Logi("libeasy", "reused: " + this.reused);
        return spdyByteArrayCeiling;
    }

    void recycle(SpdyByteArray spdyByteArray) {
        synchronized (lock) {
            this.pool.add(spdyByteArray);
            while (this.pool.size() > 100) {
                if (rand.nextBoolean()) {
                    this.pool.pollFirst();
                } else {
                    this.pool.pollLast();
                }
            }
        }
    }
}
