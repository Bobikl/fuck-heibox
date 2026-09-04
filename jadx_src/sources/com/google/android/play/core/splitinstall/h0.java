package com.google.android.play.core.splitinstall;

import android.os.Bundle;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.play:feature-delivery@@2.1.0 */
/* JADX INFO: loaded from: classes7.dex */
public final class h0 extends k0 {
    h0(l0 l0Var, com.google.android.gms.tasks.l lVar) {
        super(l0Var, lVar);
    }

    @Override // com.google.android.play.core.splitinstall.k0, com.google.android.play.core.splitinstall.internal.p0
    public final void s0(List list) throws RemoteException {
        super.s0(list);
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(f.n((Bundle) it.next()));
        }
        this.f56346b.e(arrayList);
    }
}
