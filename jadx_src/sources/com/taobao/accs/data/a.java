package com.taobao.accs.data;

import android.text.TextUtils;
import anet.channel.appmonitor.AppMonitor;
import com.google.android.exoplayer2.source.rtsp.k0;
import com.starlightc.ucropplus.ui.UCropPlusActivity;
import com.taobao.accs.common.Constants;
import com.taobao.accs.common.ThreadPoolExecutorFactory;
import com.taobao.accs.ut.monitor.AssembleMonitor;
import com.taobao.accs.utl.ALog;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes4.dex */
public class a {
    public static final int SPLITTED_DATA_INDEX = 17;
    public static final int SPLITTED_DATA_MD5 = 18;
    public static final int SPLITTED_DATA_NUMS = 16;
    public static final int SPLITTED_TIME_OUT = 15;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final char[] f98233a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f98234b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f98235c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f98236d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f98237e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private ScheduledFuture<?> f98239g;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private volatile int f98238f = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Map<Integer, byte[]> f98240h = new TreeMap(new b(this));

    public a(String str, int i10, String str2) {
        this.f98234b = str;
        this.f98235c = i10;
        this.f98236d = str2;
    }

    private static char[] a(byte[] bArr) {
        char[] cArr = new char[bArr.length << 1];
        int i10 = 0;
        for (byte b10 : bArr) {
            int i11 = i10 + 1;
            char[] cArr2 = f98233a;
            cArr[i10] = cArr2[(b10 & 240) >>> 4];
            i10 = i11 + 1;
            cArr[i11] = cArr2[b10 & 15];
        }
        return cArr;
    }

    public void a(long j10) {
        if (j10 <= 0) {
            j10 = 30000;
        }
        this.f98239g = ThreadPoolExecutorFactory.getScheduledExecutor().schedule(new c(this), j10, TimeUnit.MILLISECONDS);
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00ea  */
    public byte[] a(int i10, int i11, byte[] bArr) {
        long jCurrentTimeMillis;
        if (ALog.isPrintLog(ALog.Level.D)) {
            ALog.d("AssembleMessage", "putBurst", Constants.KEY_DATA_ID, this.f98234b, UCropPlusActivity.ARG_INDEX, Integer.valueOf(i10));
        }
        byte[] bArr2 = null;
        if (i11 != this.f98235c) {
            ALog.e("AssembleMessage", "putBurst fail as burstNums not match", new Object[0]);
            return null;
        }
        if (i10 < 0 || i10 >= i11) {
            ALog.e("AssembleMessage", "putBurst fail as burstIndex invalid", new Object[0]);
            return null;
        }
        synchronized (this) {
            if (this.f98238f != 0) {
                ALog.e("AssembleMessage", "putBurst fail", "status", Integer.valueOf(this.f98238f));
            } else {
                if (this.f98240h.get(Integer.valueOf(i10)) != null) {
                    ALog.e("AssembleMessage", "putBurst fail as exist old", new Object[0]);
                    return null;
                }
                if (this.f98240h.isEmpty()) {
                    this.f98237e = System.currentTimeMillis();
                }
                this.f98240h.put(Integer.valueOf(i10), bArr);
                if (this.f98240h.size() == this.f98235c) {
                    byte[] bArr3 = null;
                    for (byte[] bArr4 : this.f98240h.values()) {
                        if (bArr3 == null) {
                            bArr3 = bArr4;
                        } else {
                            byte[] bArr5 = new byte[bArr3.length + bArr4.length];
                            System.arraycopy(bArr3, 0, bArr5, 0, bArr3.length);
                            System.arraycopy(bArr4, 0, bArr5, bArr3.length, bArr4.length);
                            bArr3 = bArr5;
                        }
                    }
                    if (TextUtils.isEmpty(this.f98236d)) {
                        bArr2 = bArr3;
                    } else {
                        String str = new String(a(org.android.agoo.common.a.a(bArr3)));
                        if (this.f98236d.equals(str)) {
                            bArr2 = bArr3;
                        } else {
                            ALog.w("AssembleMessage", "putBurst fail", Constants.KEY_DATA_ID, this.f98234b, "dataMd5", this.f98236d, "finalDataMd5", str);
                            this.f98238f = 3;
                        }
                    }
                    long length = 0;
                    if (bArr2 != null) {
                        length = bArr2.length;
                        jCurrentTimeMillis = System.currentTimeMillis() - this.f98237e;
                        this.f98238f = 2;
                        ALog.i("AssembleMessage", "putBurst completed", Constants.KEY_DATA_ID, this.f98234b, k0.f48801p, Long.valueOf(length), "cost", Long.valueOf(jCurrentTimeMillis));
                    } else {
                        jCurrentTimeMillis = 0;
                    }
                    AssembleMonitor assembleMonitor = new AssembleMonitor(this.f98234b, String.valueOf(this.f98238f));
                    assembleMonitor.assembleLength = length;
                    assembleMonitor.assembleTimes = jCurrentTimeMillis;
                    AppMonitor.getInstance().commitStat(assembleMonitor);
                    this.f98240h.clear();
                    ScheduledFuture<?> scheduledFuture = this.f98239g;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                    }
                    return bArr2;
                }
            }
            return null;
        }
    }
}
