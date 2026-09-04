package com.google.android.gms.internal.common;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* JADX INFO: loaded from: classes7.dex */
public final class e extends g0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final zzag f52718d;

    e(zzag zzagVar, int i10) {
        super(zzagVar.size(), i10);
        this.f52718d = zzagVar;
    }

    @Override // com.google.android.gms.internal.common.g0
    protected final Object a(int i10) {
        return this.f52718d.get(i10);
    }
}
