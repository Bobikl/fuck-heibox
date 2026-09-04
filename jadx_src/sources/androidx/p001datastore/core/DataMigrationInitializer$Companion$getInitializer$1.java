package androidx.p001datastore.core;

import androidx.exifinterface.media.a;
import dl.e;
import java.util.List;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.coroutines.c;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.t0;
import yh.p;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: compiled from: DataMigrationInitializer.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001H\u008a@"}, d2 = {a.f23244d5, "Landroidx/datastore/core/g;", "api", "Lkotlin/b2;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
@d(c = "androidx.datastore.core.DataMigrationInitializer$Companion$getInitializer$1", f = "DataMigrationInitializer.kt", i = {}, l = {33}, m = "invokeSuspend", n = {}, s = {})
public final class DataMigrationInitializer$Companion$getInitializer$1<T> extends SuspendLambda implements p<g<T>, c<? super b2>, Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f22047b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    /* synthetic */ Object f22048c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ List<c<T>> f22049d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    DataMigrationInitializer$Companion$getInitializer$1(List<? extends c<T>> list, c<? super DataMigrationInitializer$Companion$getInitializer$1> cVar) {
        super(2, cVar);
        this.f22049d = list;
    }

    @Override // yh.p
    @e
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Object invoke(@dl.d g<T> gVar, @e c<? super b2> cVar) {
        return ((DataMigrationInitializer$Companion$getInitializer$1) create(gVar, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final c<b2> create(@e Object obj, @dl.d c<?> cVar) {
        DataMigrationInitializer$Companion$getInitializer$1 dataMigrationInitializer$Companion$getInitializer$1 = new DataMigrationInitializer$Companion$getInitializer$1(this.f22049d, cVar);
        dataMigrationInitializer$Companion$getInitializer$1.f22048c = obj;
        return dataMigrationInitializer$Companion$getInitializer$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        Object objH = b.h();
        int i10 = this.f22047b;
        if (i10 == 0) {
            t0.n(obj);
            g gVar = (g) this.f22048c;
            DataMigrationInitializer.Companion companion = DataMigrationInitializer.INSTANCE;
            List<c<T>> list = this.f22049d;
            this.f22047b = 1;
            if (companion.c(list, gVar, this) == objH) {
                return objH;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t0.n(obj);
        }
        return b2.f124493a;
    }
}
