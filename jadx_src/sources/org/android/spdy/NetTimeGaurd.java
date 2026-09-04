package org.android.spdy;

import android.util.Log;

/* JADX INFO: loaded from: classes5.dex */
public class NetTimeGaurd {
    public static final int CREATE = 0;
    public static final int ERROR = 2;
    public static final int PING = 1;
    public static final int STREAM = 3;
    private static final long calltime = 10;
    private static final long total = 50;
    private static long[] totaltime = new long[4];

    static long begin() {
        if (SpdyAgent.enableTimeGaurd) {
            return System.currentTimeMillis();
        }
        return 0L;
    }

    static void end(String str, int i10, long j10) {
        if (SpdyAgent.enableTimeGaurd) {
            long jCurrentTimeMillis = System.currentTimeMillis() - j10;
            long[] jArr = totaltime;
            jArr[i10] = jArr[i10] + jCurrentTimeMillis;
            Log.i("NetTimeGaurd", "NetTimeGaurd[end]" + str + " time=" + jCurrentTimeMillis + " total=" + totaltime[i10]);
            if (jCurrentTimeMillis <= calltime) {
                return;
            }
            throw new SpdyErrorException("CallBack:" + str + " timeconsuming:" + jCurrentTimeMillis + "  mustlessthan:" + calltime, -1);
        }
    }

    static void finish(int i10) {
        if (SpdyAgent.enableTimeGaurd) {
            Log.i("NetTimeGaurd", "NetTimeGaurd[finish]:time=" + totaltime[i10]);
            if (totaltime[i10] <= total) {
                return;
            }
            throw new SpdyErrorException("CallBack totaltimeconsuming:" + totaltime[i10] + "  mustlessthan:" + total, -1);
        }
    }

    static void start(int i10) {
        if (SpdyAgent.enableTimeGaurd) {
            totaltime[i10] = 0;
        }
    }
}
