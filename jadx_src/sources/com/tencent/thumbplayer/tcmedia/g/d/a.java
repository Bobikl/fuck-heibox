package com.tencent.thumbplayer.tcmedia.g.d;

import com.tencent.thumbplayer.tcmedia.g.b.e;
import com.tencent.thumbplayer.tcmedia.g.b.f;
import com.tencent.thumbplayer.tcmedia.g.h.d;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f102734a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b f102735b;

    public a() {
        b bVar = new b(2, "keep");
        this.f102734a = bVar;
        this.f102735b = new b(Integer.MAX_VALUE, "running");
        bVar.a(new c() { // from class: com.tencent.thumbplayer.tcmedia.g.d.a.2
            @Override // com.tencent.thumbplayer.tcmedia.g.d.c
            public void a(f fVar) {
                if (com.tencent.thumbplayer.tcmedia.g.h.b.a()) {
                    com.tencent.thumbplayer.tcmedia.g.h.b.b("CodecWrapperManager", "onErase codecWrapper:".concat(String.valueOf(fVar)));
                }
                fVar.i();
            }
        });
    }

    public final f a(e eVar) {
        f fVarA = this.f102734a.a(eVar);
        if (com.tencent.thumbplayer.tcmedia.g.h.b.a()) {
            com.tencent.thumbplayer.tcmedia.g.h.b.b("CodecWrapperManager", "obtainCodecWrapper codecWrapper:".concat(String.valueOf(fVarA)));
        }
        return fVarA;
    }

    public final String a() {
        return "runningPool:" + this.f102735b + " keepPool:" + this.f102734a;
    }

    public final void a(final f fVar) {
        if (com.tencent.thumbplayer.tcmedia.g.h.b.a()) {
            com.tencent.thumbplayer.tcmedia.g.h.b.b("CodecWrapperManager", "transToRunning codecWrapper:".concat(String.valueOf(fVar)));
        }
        this.f102734a.b(fVar);
        this.f102735b.a(fVar);
        d.b(new Runnable() { // from class: com.tencent.thumbplayer.tcmedia.g.d.a.1
            @Override // java.lang.Runnable
            public void run() {
                com.tencent.thumbplayer.tcmedia.g.a.a aVarH = fVar.h();
                if (aVarH != null) {
                    aVarH.onTransToRunningPool();
                }
            }
        });
    }

    public final void b(f fVar) {
        if (com.tencent.thumbplayer.tcmedia.g.h.b.a()) {
            com.tencent.thumbplayer.tcmedia.g.h.b.b("CodecWrapperManager", "removeFromRunning codecWrapper:".concat(String.valueOf(fVar)));
        }
        this.f102735b.b(fVar);
    }

    public final void c(f fVar) {
        if (com.tencent.thumbplayer.tcmedia.g.h.b.a()) {
            com.tencent.thumbplayer.tcmedia.g.h.b.b("CodecWrapperManager", "transTokeep codecWrapper:".concat(String.valueOf(fVar)));
        }
        this.f102735b.b(fVar);
        this.f102734a.a(fVar);
        com.tencent.thumbplayer.tcmedia.g.a.a aVarH = fVar.h();
        if (aVarH != null) {
            aVarH.onTransToKeepPool();
        }
    }
}
