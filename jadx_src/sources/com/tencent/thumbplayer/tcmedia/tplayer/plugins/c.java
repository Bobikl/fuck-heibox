package com.tencent.thumbplayer.tcmedia.tplayer.plugins;

import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes4.dex */
public class c implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private CopyOnWriteArrayList<a> f103069a = new CopyOnWriteArrayList<>();

    @Override // com.tencent.thumbplayer.tcmedia.tplayer.plugins.a
    public void a() {
    }

    @Override // com.tencent.thumbplayer.tcmedia.tplayer.plugins.a
    public void a(int i10, int i11, int i12, String str, Object obj) {
        CopyOnWriteArrayList<a> copyOnWriteArrayList = this.f103069a;
        if (copyOnWriteArrayList != null) {
            for (a aVar : copyOnWriteArrayList) {
                if (aVar != null) {
                    aVar.a(i10, i11, i12, str, obj);
                }
            }
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.tplayer.plugins.b
    public void a(a aVar) {
        CopyOnWriteArrayList<a> copyOnWriteArrayList = this.f103069a;
        if (copyOnWriteArrayList == null || copyOnWriteArrayList.contains(aVar)) {
            return;
        }
        aVar.a();
        this.f103069a.add(aVar);
    }

    @Override // com.tencent.thumbplayer.tcmedia.tplayer.plugins.a
    public void b() {
    }

    @Override // com.tencent.thumbplayer.tcmedia.tplayer.plugins.b
    public void c() {
        CopyOnWriteArrayList<a> copyOnWriteArrayList = this.f103069a;
        if (copyOnWriteArrayList != null) {
            for (a aVar : copyOnWriteArrayList) {
                if (aVar != null) {
                    aVar.b();
                }
            }
            this.f103069a.clear();
        }
        this.f103069a = null;
    }
}
