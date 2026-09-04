package com.alipay.face.download.impl;

import android.content.Context;
import android.util.Log;
import com.alipay.face.download.f;
import com.taobao.downloader.Downloader;
import com.taobao.downloader.request.DownloadListener;
import com.taobao.downloader.request.DownloadRequest;
import com.taobao.downloader.request.Item;
import com.taobao.downloader.request.Param;
import java.io.File;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: BioResDownloaderTaobaoImpl.java */
/* JADX INFO: loaded from: classes6.dex */
public class c implements f {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f38766g = "BioResDownloader";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final f.b f38767h = new a();

    /* JADX INFO: compiled from: BioResDownloaderTaobaoImpl.java */
    public static final class a implements f.b {
        a() {
        }

        @Override // com.alipay.face.download.f.b
        public void a(f.a aVar, int i10, String str) {
        }

        @Override // com.alipay.face.download.f.b
        public void b(f.a aVar) {
        }

        @Override // com.alipay.face.download.f.b
        public void c(f.a aVar, long j10, long j11) {
        }

        @Override // com.alipay.face.download.f.b
        public void d(f.a aVar) {
        }
    }

    /* JADX INFO: compiled from: BioResDownloaderTaobaoImpl.java */
    public static class b implements f.a, DownloadListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private com.alipay.face.download.b f38768a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private f.b f38769b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f38770c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private AtomicInteger f38771d = new AtomicInteger(0);

        b(com.alipay.face.download.b bVar, f.b bVar2) {
            this.f38768a = bVar;
            this.f38769b = bVar2 == null ? c.f38767h : bVar2;
        }

        @Override // com.alipay.face.download.f.a
        public int a() {
            return this.f38771d.get();
        }

        @Override // com.alipay.face.download.f.a
        public com.alipay.face.download.b b() {
            return this.f38768a;
        }

        public void c(int i10) {
            this.f38770c = i10;
        }

        @Override // com.alipay.face.download.f.a
        public void cancel() {
            Downloader.getInstance().cancel(this.f38770c);
        }

        @Override // com.taobao.downloader.request.DownloadListener
        public void onDownloadError(String str, int i10, String str2) {
            Log.d(c.f38766g, "onDownloadError() called with: url = [" + str + "], errorCode = [" + i10 + "], msg = [" + str2 + "]");
            this.f38771d.set(-1);
            this.f38769b.a(this, i10, str2);
        }

        @Override // com.taobao.downloader.request.DownloadListener
        public void onDownloadFinish(String str, String str2) {
            Log.d(c.f38766g, "onDownloadFinish() called with: url = [" + str + "], s1 = [" + str2 + "]");
        }

        @Override // com.taobao.downloader.request.DownloadListener
        public void onDownloadProgress(int i10) {
            Log.d(c.f38766g, "onDownloadProgress() called with: process = [" + i10 + "]");
            this.f38769b.c(this, 100L, (long) i10);
        }

        @Override // com.taobao.downloader.request.DownloadListener
        public void onDownloadStateChange(String str, boolean z10) {
            Log.d(c.f38766g, "onDownloadStateChange() called with: url = [" + str + "], downloading = [" + z10 + "]");
            if (z10) {
                this.f38771d.set(1);
                this.f38769b.d(this);
            }
        }

        @Override // com.taobao.downloader.request.DownloadListener
        public void onFinish(boolean z10) {
            Log.d(c.f38766g, "onFinish() called with: allSuccess = [" + z10 + "]");
            if (z10) {
                this.f38771d.set(2);
                this.f38769b.b(this);
                return;
            }
            int i10 = this.f38771d.get();
            if (i10 != 3) {
                this.f38771d.set(-1);
            } else if (i10 != -1) {
                this.f38769b.a(this, 10000, "unknown error");
            }
        }

        @Override // com.taobao.downloader.request.DownloadListener
        public void onNetworkLimit(int i10, Param param, DownloadListener.NetworkLimitCallback networkLimitCallback) {
        }
    }

    private b c(com.alipay.face.download.b bVar, f.b bVar2) {
        return new b(bVar, bVar2);
    }

    private static boolean d(com.alipay.face.download.b bVar) {
        File file = new File(bVar.b());
        return file.isDirectory() || file.mkdirs();
    }

    @Override // com.alipay.face.download.f
    public f.a a(Context context, com.alipay.face.download.b bVar, f.b bVar2) {
        if (!d(bVar)) {
            return null;
        }
        DownloadRequest downloadRequest = new DownloadRequest();
        Param param = downloadRequest.downloadParam;
        param.bizId = f38766g;
        param.network = 7;
        param.fileStorePath = bVar.b();
        downloadRequest.downloadParam.askIfNetLimit = false;
        Item item = new Item();
        item.md5 = bVar.a();
        item.url = bVar.getUrl();
        item.name = bVar.getFileName();
        downloadRequest.downloadList.add(item);
        b bVarC = c(bVar, bVar2);
        bVarC.c(Downloader.getInstance().download(downloadRequest, bVarC));
        return bVarC;
    }

    @Override // com.alipay.face.download.f
    public void destroy() {
    }

    @Override // com.alipay.face.download.f
    public void init(Context context) {
        Downloader.init(context);
    }
}
