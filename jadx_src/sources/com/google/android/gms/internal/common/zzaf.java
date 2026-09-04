package com.google.android.gms.internal.common;

import com.starlightc.ucropplus.ui.UCropPlusActivity;
import java.util.List;
import javax.annotation.CheckForNull;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* JADX INFO: loaded from: classes7.dex */
public final class zzaf extends zzag {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final transient int f52734d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final transient int f52735e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ zzag f52736f;

    zzaf(zzag zzagVar, int i10, int i11) {
        this.f52736f = zzagVar;
        this.f52734d = i10;
        this.f52735e = i11;
    }

    @Override // com.google.android.gms.internal.common.zzac
    final int b() {
        return this.f52736f.e() + this.f52734d + this.f52735e;
    }

    @Override // com.google.android.gms.internal.common.zzac
    final int e() {
        return this.f52736f.e() + this.f52734d;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        z.a(i10, this.f52735e, UCropPlusActivity.ARG_INDEX);
        return this.f52736f.get(i10 + this.f52734d);
    }

    @Override // com.google.android.gms.internal.common.zzac
    final boolean i() {
        return true;
    }

    @Override // com.google.android.gms.internal.common.zzac
    @CheckForNull
    final Object[] j() {
        return this.f52736f.j();
    }

    @Override // com.google.android.gms.internal.common.zzag
    /* JADX INFO: renamed from: l */
    public final zzag subList(int i10, int i11) {
        z.c(i10, i11, this.f52735e);
        zzag zzagVar = this.f52736f;
        int i12 = this.f52734d;
        return zzagVar.subList(i10 + i12, i11 + i12);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f52735e;
    }

    @Override // com.google.android.gms.internal.common.zzag, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i10, int i11) {
        return subList(i10, i11);
    }
}
