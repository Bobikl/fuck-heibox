package com.google.android.gms.tasks;

/* JADX INFO: compiled from: com.google.android.gms:play-services-tasks@@18.0.2 */
/* JADX INFO: loaded from: classes7.dex */
public final class o implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ h f52781a;

    o(v vVar, h hVar) {
        this.f52781a = hVar;
    }

    @Override // com.google.android.gms.tasks.g
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        this.f52781a.onCanceled();
    }
}
