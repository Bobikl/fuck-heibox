package com.xiaomi.push;

import android.content.Context;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public class ih extends ak.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Context f107367a;

    ih(Context context) {
        this.f107367a = context;
    }

    @Override // com.xiaomi.push.ak.b
    public void b() {
        ArrayList arrayList;
        synchronized (ig.f573a) {
            arrayList = new ArrayList(ig.f575a);
            ig.f575a.clear();
        }
        ig.b(this.f107367a, arrayList);
    }
}
