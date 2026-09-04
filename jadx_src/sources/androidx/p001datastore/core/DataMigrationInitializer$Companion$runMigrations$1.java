package androidx.p001datastore.core;

import dl.e;
import kotlin.Metadata;
import kotlin.coroutines.c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;

/* JADX INFO: compiled from: DataMigrationInitializer.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
@d(c = "androidx.datastore.core.DataMigrationInitializer$Companion", f = "DataMigrationInitializer.kt", i = {0, 1}, l = {42, 57}, m = "runMigrations", n = {"cleanUps", "cleanUpFailure"}, s = {"L$0", "L$0"})
public final class DataMigrationInitializer$Companion$runMigrations$1<T> extends ContinuationImpl {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Object f22050b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    Object f22051c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    /* synthetic */ Object f22052d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ DataMigrationInitializer.Companion f22053e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    int f22054f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DataMigrationInitializer$Companion$runMigrations$1(DataMigrationInitializer.Companion companion, c<? super DataMigrationInitializer$Companion$runMigrations$1> cVar) {
        super(cVar);
        this.f22053e = companion;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @e
    public final Object invokeSuspend(@dl.d Object obj) {
        this.f22052d = obj;
        this.f22054f |= Integer.MIN_VALUE;
        return this.f22053e.c(null, null, this);
    }
}
