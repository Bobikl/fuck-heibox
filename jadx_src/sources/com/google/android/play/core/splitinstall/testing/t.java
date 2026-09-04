package com.google.android.play.core.splitinstall.testing;

import com.google.android.play.core.splitinstall.t0;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.play:feature-delivery@@2.1.0 */
/* JADX INFO: loaded from: classes7.dex */
public final class t implements t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ List f56446a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ List f56447b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ long f56448c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ boolean f56449d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ List f56450e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ a f56451f;

    t(a aVar, List list, List list2, long j10, boolean z10, List list3) {
        this.f56451f = aVar;
        this.f56446a = list;
        this.f56447b = list2;
        this.f56448c = j10;
        this.f56449d = z10;
        this.f56450e = list3;
    }

    @Override // com.google.android.play.core.splitinstall.t0
    public final void a(int i10) {
        this.f56451f.I(6, i10, null, null, null, null, null);
    }

    @Override // com.google.android.play.core.splitinstall.t0
    public final void y() {
        if (this.f56449d) {
            return;
        }
        this.f56451f.F(this.f56450e, this.f56446a, this.f56447b, this.f56448c, true);
    }

    @Override // com.google.android.play.core.splitinstall.t0
    public final void zza() {
        this.f56451f.H(this.f56446a, this.f56447b, this.f56448c);
    }
}
