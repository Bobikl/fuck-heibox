package com.google.android.play.core.splitinstall;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.play:feature-delivery@@2.1.0 */
/* JADX INFO: loaded from: classes7.dex */
public final class l1 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ e f56357b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ i f56358c;

    l1(i iVar, e eVar) {
        this.f56358c = iVar;
        this.f56357b = eVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        k1 k1Var = this.f56358c.f56252b;
        List<String> listB = this.f56357b.b();
        List listT = i.t(this.f56357b.a());
        Bundle bundle = new Bundle();
        bundle.putInt("session_id", 0);
        bundle.putInt("status", 5);
        bundle.putInt("error_code", 0);
        if (!listB.isEmpty()) {
            bundle.putStringArrayList("module_names", new ArrayList<>(listB));
        }
        if (!listT.isEmpty()) {
            bundle.putStringArrayList("languages", new ArrayList<>(listT));
        }
        bundle.putLong("total_bytes_to_download", 0L);
        bundle.putLong("bytes_downloaded", 0L);
        k1Var.l(f.n(bundle));
    }
}
