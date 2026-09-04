package f3;

import com.umeng.analytics.pro.ak;
import j3.g;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.jvm.internal.f0;
import yh.l;

/* JADX INFO: compiled from: Migration.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u0006¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\u0010"}, d2 = {"Lf3/d;", "Lf3/c;", "Lj3/g;", "database", "Lkotlin/b2;", ak.av, "Lkotlin/Function1;", "migrateCallback", "Lyh/l;", "b", "()Lyh/l;", "", "startVersion", "endVersion", "<init>", "(IILyh/l;)V", "room-ktx_release"}, k = 1, mv = {1, 7, 1})
public final class d extends c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private final l<g, b2> f118740c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public d(int i10, int i11, @dl.d l<? super g, b2> migrateCallback) {
        super(i10, i11);
        f0.p(migrateCallback, "migrateCallback");
        this.f118740c = migrateCallback;
    }

    @Override // f3.c
    public void a(@dl.d g database) {
        f0.p(database, "database");
        this.f118740c.invoke(database);
    }

    @dl.d
    public final l<g, b2> b() {
        return this.f118740c;
    }
}
