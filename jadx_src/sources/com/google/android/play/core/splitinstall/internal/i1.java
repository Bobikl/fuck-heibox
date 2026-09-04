package com.google.android.play.core.splitinstall.internal;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.play:feature-delivery@@2.1.0 */
/* JADX INFO: loaded from: classes7.dex */
public final class i1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f56289a = new ArrayList();

    public final List a() {
        ArrayList arrayList = new ArrayList();
        for (k1 k1Var : this.f56289a) {
            Bundle bundle = new Bundle();
            bundle.putInt("event_type", k1Var.a());
            bundle.putLong("event_timestamp", k1Var.b());
            arrayList.add(bundle);
        }
        return arrayList;
    }

    public final void b(int i10) {
        this.f56289a.add(k1.c(i10, System.currentTimeMillis()));
    }
}
