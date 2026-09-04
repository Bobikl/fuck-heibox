package com.tencent.thumbplayer.tcmedia.c.a;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.tencent.thumbplayer.tcmedia.api.resourceloader.ITPAssetResourceLoadingDataRequest;
import com.tencent.thumbplayer.tcmedia.utils.TPLogUtil;
import com.tencent.thumbplayer.tcmedia.utils.m;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/* JADX INFO: loaded from: classes4.dex */
public class c implements ITPAssetResourceLoadingDataRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static String f102476a = "TPAssetResourceLoadingDataRequest";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f102477b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f102478c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f102479d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f102480e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f102481f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f102482g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f102483h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private b f102484i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private m f102485j = new m();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f102486k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private RandomAccessFile f102487l;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        long f102488a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        byte[] f102489b;

        private a() {
        }
    }

    public class b extends Handler {
        b(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what != 256) {
                return;
            }
            a aVar = (a) message.obj;
            long j10 = aVar.f102488a;
            byte[] bArr = aVar.f102489b;
            int i10 = message.arg1;
            c cVar = c.this;
            if (!cVar.a(j10, bArr, cVar.f102486k)) {
                TPLogUtil.e(c.f102476a, "write data failed");
                return;
            }
            c.this.f102485j.writeLock().lock();
            c.this.f102480e = ((long) i10) + j10;
            c.this.f102485j.writeLock().unlock();
            TPLogUtil.i(c.f102476a, "write data from " + j10 + " , with dataLength" + i10);
        }
    }

    public c(long j10, long j11, boolean z10) {
        this.f102477b = j10;
        this.f102481f = j10;
        this.f102480e = j10;
        this.f102478c = j11;
        this.f102479d = z10;
    }

    private void a(int i10, int i11, int i12, Object obj) {
        b bVar = this.f102484i;
        if (bVar != null) {
            Message messageObtainMessage = bVar.obtainMessage();
            messageObtainMessage.what = i10;
            messageObtainMessage.arg1 = i11;
            messageObtainMessage.arg2 = i12;
            messageObtainMessage.obj = obj;
            this.f102484i.sendMessage(messageObtainMessage);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:32:0x003c A[EXC_TOP_SPLITTER, PHI: r4
  0x003c: PHI (r4v3 java.io.RandomAccessFile) = (r4v2 java.io.RandomAccessFile), (r4v7 java.io.RandomAccessFile) binds: [B:13:0x002e, B:17:0x003a] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    public boolean a(long j10, byte[] bArr, String str) {
        RandomAccessFile randomAccessFile;
        try {
            try {
                RandomAccessFile randomAccessFile2 = new RandomAccessFile(str, "rw");
                this.f102487l = randomAccessFile2;
                randomAccessFile2.seek(j10);
                this.f102487l.write(bArr);
                RandomAccessFile randomAccessFile3 = this.f102487l;
                if (randomAccessFile3 == null) {
                    return true;
                }
                try {
                    randomAccessFile3.close();
                    return true;
                } catch (IOException unused) {
                    TPLogUtil.e(f102476a, "fail to close mRandomAccessFile");
                    return true;
                }
            } catch (Throwable th2) {
                RandomAccessFile randomAccessFile4 = this.f102487l;
                if (randomAccessFile4 != null) {
                    try {
                        randomAccessFile4.close();
                    } catch (IOException unused2) {
                        TPLogUtil.e(f102476a, "fail to close mRandomAccessFile");
                    }
                }
                throw th2;
            }
        } catch (FileNotFoundException unused3) {
            TPLogUtil.e(f102476a, "file not found");
            randomAccessFile = this.f102487l;
            if (randomAccessFile != null) {
                try {
                    randomAccessFile.close();
                } catch (IOException unused4) {
                    TPLogUtil.e(f102476a, "fail to close mRandomAccessFile");
                }
            }
            return false;
        } catch (IOException unused5) {
            TPLogUtil.e(f102476a, "fail to write data");
            randomAccessFile = this.f102487l;
            if (randomAccessFile != null) {
                randomAccessFile.close();
            }
            return false;
        }
    }

    public int a() {
        return this.f102483h;
    }

    public int a(long j10) {
        this.f102485j.readLock().lock();
        long j11 = this.f102480e;
        this.f102485j.readLock().unlock();
        if (j10 >= j11) {
            return -1;
        }
        if (j10 >= this.f102477b) {
            return (int) (j11 - j10);
        }
        TPLogUtil.e(f102476a, "Offset less than mRequestedOffset");
        return -1;
    }

    public void a(int i10) {
        this.f102483h = i10;
    }

    public void a(Looper looper) {
        this.f102484i = new b(looper);
    }

    public void a(String str) {
        this.f102486k = str;
    }

    public void b() {
        b bVar = this.f102484i;
        if (bVar != null) {
            bVar.removeCallbacksAndMessages(null);
            this.f102484i = null;
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.resourceloader.ITPAssetResourceLoadingDataRequest
    public long getCurrentOffset() {
        this.f102485j.readLock().lock();
        long j10 = this.f102481f;
        this.f102485j.readLock().unlock();
        return j10;
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.resourceloader.ITPAssetResourceLoadingDataRequest
    public long getRequestedLength() {
        return this.f102478c;
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.resourceloader.ITPAssetResourceLoadingDataRequest
    public long getRequestedOffset() {
        return this.f102477b;
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.resourceloader.ITPAssetResourceLoadingDataRequest
    public void notifyDataReady(long j10, long j11) {
        long j12 = j11 + j10;
        long j13 = this.f102477b;
        if (j12 > this.f102478c + j13) {
            TPLogUtil.e(f102476a, "data exceed the max request offset");
            return;
        }
        if (j10 < j13) {
            TPLogUtil.w(f102476a, "the notify data offset is less than request offset");
        }
        if (j12 < this.f102481f) {
            TPLogUtil.e(f102476a, "data not reach current offset");
            return;
        }
        this.f102485j.writeLock().lock();
        this.f102481f = j12;
        this.f102480e = j12;
        this.f102485j.writeLock().unlock();
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.resourceloader.ITPAssetResourceLoadingDataRequest
    public void respondWithData(byte[] bArr) {
        if (this.f102482g > this.f102478c) {
            TPLogUtil.i(f102476a, "respond full data");
            return;
        }
        int length = bArr.length;
        a aVar = new a();
        aVar.f102488a = this.f102481f;
        aVar.f102489b = bArr;
        a(256, length, 0, aVar);
        TPLogUtil.i(f102476a, "respond data from:" + this.f102481f + ", dataLength:" + length);
        this.f102485j.writeLock().lock();
        long j10 = (long) length;
        this.f102481f = this.f102481f + j10;
        this.f102482g = this.f102482g + j10;
        this.f102485j.writeLock().unlock();
    }
}
