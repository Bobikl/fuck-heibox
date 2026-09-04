package com.tencent.thumbplayer.tcmedia.g.c;

import android.graphics.SurfaceTexture;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends SurfaceTexture {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private a f102733a;

    public interface a {
        void a();
    }

    public b(int i10) {
        super(i10);
    }

    public final void a(a aVar) {
        this.f102733a = aVar;
    }

    @Override // android.graphics.SurfaceTexture
    public final void release() {
        super.release();
        a aVar = this.f102733a;
        if (aVar != null) {
            aVar.a();
        }
    }
}
