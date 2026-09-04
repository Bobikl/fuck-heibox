package androidx.paging;

import kotlin.Metadata;

/* JADX INFO: compiled from: LegacyPagingSource.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 2})
public final class s implements DataSource.c, kotlin.jvm.internal.a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ yh.a f26623a;

    s(yh.a aVar) {
        this.f26623a = aVar;
    }

    @Override // androidx.paging.DataSource.c
    @androidx.annotation.d
    public final /* synthetic */ void a() {
        kotlin.jvm.internal.f0.o(this.f26623a.invoke(), "invoke(...)");
    }

    @Override // kotlin.jvm.internal.a0
    public kotlin.u b() {
        return this.f26623a;
    }

    public boolean equals(Object obj) {
        return (obj instanceof DataSource.c) && (obj instanceof kotlin.jvm.internal.a0) && kotlin.jvm.internal.f0.g(this.f26623a, ((kotlin.jvm.internal.a0) obj).b());
    }

    public int hashCode() {
        return this.f26623a.hashCode();
    }
}
