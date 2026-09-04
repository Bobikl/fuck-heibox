package com.google.android.gms.internal.common;

import com.starlightc.ucropplus.ui.UCropPlusActivity;
import org.jspecify.nullness.NullMarked;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* JADX INFO: loaded from: classes7.dex */
@NullMarked
public final class zzai extends zzag {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final zzag f52738f = new zzai(new Object[0], 0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final transient Object[] f52739d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final transient int f52740e;

    zzai(Object[] objArr, int i10) {
        this.f52739d = objArr;
        this.f52740e = i10;
    }

    @Override // com.google.android.gms.internal.common.zzag, com.google.android.gms.internal.common.zzac
    final int a(Object[] objArr, int i10) {
        System.arraycopy(this.f52739d, 0, objArr, 0, this.f52740e);
        return this.f52740e;
    }

    @Override // com.google.android.gms.internal.common.zzac
    final int b() {
        return this.f52740e;
    }

    @Override // com.google.android.gms.internal.common.zzac
    final int e() {
        return 0;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        z.a(i10, this.f52740e, UCropPlusActivity.ARG_INDEX);
        Object obj = this.f52739d[i10];
        obj.getClass();
        return obj;
    }

    @Override // com.google.android.gms.internal.common.zzac
    final boolean i() {
        return false;
    }

    @Override // com.google.android.gms.internal.common.zzac
    final Object[] j() {
        return this.f52739d;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f52740e;
    }
}
