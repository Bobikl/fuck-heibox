package com.tencent.thumbplayer.tcmedia.c;

import com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPDownloadProxy;

/* JADX INFO: loaded from: classes4.dex */
public class j implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ITPDownloadProxy f102555a;

    public j(ITPDownloadProxy iTPDownloadProxy) {
        this.f102555a = iTPDownloadProxy;
    }

    @Override // com.tencent.thumbplayer.tcmedia.c.b
    public ITPDownloadProxy a() {
        return this.f102555a;
    }

    @Override // com.tencent.thumbplayer.tcmedia.c.b
    public void a(int i10) {
        this.f102555a.pushEvent(i10);
    }
}
