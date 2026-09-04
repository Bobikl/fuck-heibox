package com.tencent.thumbplayer.tcmedia.c.a;

import android.os.Looper;
import com.tencent.thumbplayer.tcmedia.api.resourceloader.ITPAssetResourceLoadingRequest;
import com.tencent.thumbplayer.tcmedia.api.resourceloader.TPAssetResourceLoadingContentInformationRequest;

/* JADX INFO: loaded from: classes4.dex */
public class d implements ITPAssetResourceLoadingRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f102491a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private c f102492b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private TPAssetResourceLoadingContentInformationRequest f102493c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f102494d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f102495e = false;

    public d(long j10, long j11, int i10, boolean z10) {
        this.f102491a = i10;
        c cVar = new c(j10, j11, z10);
        this.f102492b = cVar;
        cVar.a(i10);
    }

    public int a(long j10) {
        return this.f102492b.a(j10);
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.resourceloader.ITPAssetResourceLoadingRequest
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public c getLoadingDataRequest() {
        return this.f102492b;
    }

    public void a(Looper looper) {
        this.f102492b.a(looper);
    }

    public void a(TPAssetResourceLoadingContentInformationRequest tPAssetResourceLoadingContentInformationRequest) {
        this.f102493c = tPAssetResourceLoadingContentInformationRequest;
    }

    public void a(String str) {
        this.f102492b.a(str);
    }

    public synchronized void b() {
        this.f102494d = true;
        this.f102492b.b();
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.resourceloader.ITPAssetResourceLoadingRequest
    public synchronized void finishLoading() {
        this.f102495e = true;
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.resourceloader.ITPAssetResourceLoadingRequest
    public TPAssetResourceLoadingContentInformationRequest getContentInformation() {
        return this.f102493c;
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.resourceloader.ITPAssetResourceLoadingRequest
    public synchronized boolean isCancelled() {
        return this.f102494d;
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.resourceloader.ITPAssetResourceLoadingRequest
    public synchronized boolean isFinished() {
        return this.f102495e;
    }
}
