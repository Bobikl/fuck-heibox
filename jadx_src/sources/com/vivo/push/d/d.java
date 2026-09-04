package com.vivo.push.d;

import android.text.TextUtils;

/* JADX INFO: compiled from: OnBindAppReceiveTask.java */
/* JADX INFO: loaded from: classes4.dex */
public final class d extends z {
    d(com.vivo.push.o oVar) {
        super(oVar);
    }

    @Override // com.vivo.push.l
    protected final void a(com.vivo.push.o oVar) {
        com.vivo.push.b.i iVar = (com.vivo.push.b.i) oVar;
        String strE = iVar.e();
        com.vivo.push.e.a().a(iVar.g(), iVar.h(), strE);
        if (TextUtils.isEmpty(iVar.g()) && !TextUtils.isEmpty(strE)) {
            com.vivo.push.e.a().a(strE);
        }
        com.vivo.push.m.b(new e(this, strE, iVar));
    }
}
