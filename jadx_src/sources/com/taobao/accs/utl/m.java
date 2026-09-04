package com.taobao.accs.utl;

import android.app.Application;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes4.dex */
public class m implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ l f98515a;

    m(l lVar) {
        this.f98515a = lVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        for (l.b bVar : l.f98505d) {
            if (bVar != null) {
                Application unused = l.f98506e;
                bVar.a();
            }
        }
    }
}
