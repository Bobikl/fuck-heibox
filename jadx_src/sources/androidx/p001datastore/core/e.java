package androidx.p001datastore.core;

import androidx.exifinterface.media.a;
import com.umeng.analytics.pro.ak;
import d2.b;
import dl.d;
import java.io.File;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.s;
import kotlin.jvm.internal.f0;
import kotlinx.coroutines.e1;
import kotlinx.coroutines.f3;
import kotlinx.coroutines.q0;
import kotlinx.coroutines.r0;
import xh.i;

/* JADX INFO: compiled from: DataStoreFactory.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0011\u0010\u0012Jb\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f\"\u0004\b\u0000\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00052\u0014\b\u0002\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\b0\u00072\b\b\u0002\u0010\u000b\u001a\u00020\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0007¨\u0006\u0013"}, d2 = {"Landroidx/datastore/core/e;", "", a.f23244d5, "Landroidx/datastore/core/i;", "serializer", "Ld2/b;", "corruptionHandler", "", "Landroidx/datastore/core/c;", "migrations", "Lkotlinx/coroutines/q0;", "scope", "Lkotlin/Function0;", "Ljava/io/File;", "produceFile", "Landroidx/datastore/core/d;", ak.av, "<init>", "()V", "datastore-core"}, k = 1, mv = {1, 5, 1})
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @d
    public static final e f22176a = new e();

    private e() {
    }

    public static /* synthetic */ d e(e eVar, i iVar, b bVar, List list, q0 q0Var, yh.a aVar, int i10, Object obj) {
        b bVar2 = (i10 & 2) != 0 ? null : bVar;
        if ((i10 & 4) != 0) {
            list = CollectionsKt__CollectionsKt.E();
        }
        List list2 = list;
        if ((i10 & 8) != 0) {
            e1 e1Var = e1.f129185a;
            q0Var = r0.a(e1.c().I(f3.c(null, 1, null)));
        }
        return eVar.a(iVar, bVar2, list2, q0Var, aVar);
    }

    @d
    @i
    public final <T> d<T> a(@d i<T> serializer, @dl.e b<T> bVar, @d List<? extends c<T>> migrations, @d q0 scope, @d yh.a<? extends File> produceFile) {
        f0.p(serializer, "serializer");
        f0.p(migrations, "migrations");
        f0.p(scope, "scope");
        f0.p(produceFile, "produceFile");
        if (bVar == null) {
            bVar = (b<T>) new d2.a();
        }
        return new SingleProcessDataStore(produceFile, serializer, s.k(DataMigrationInitializer.INSTANCE.b(migrations)), bVar, scope);
    }

    @d
    @i
    public final <T> d<T> b(@d i<T> serializer, @dl.e b<T> bVar, @d List<? extends c<T>> migrations, @d yh.a<? extends File> produceFile) {
        f0.p(serializer, "serializer");
        f0.p(migrations, "migrations");
        f0.p(produceFile, "produceFile");
        return e(this, serializer, bVar, migrations, null, produceFile, 8, null);
    }

    @d
    @i
    public final <T> d<T> c(@d i<T> serializer, @dl.e b<T> bVar, @d yh.a<? extends File> produceFile) {
        f0.p(serializer, "serializer");
        f0.p(produceFile, "produceFile");
        return e(this, serializer, bVar, null, null, produceFile, 12, null);
    }

    @d
    @i
    public final <T> d<T> d(@d i<T> serializer, @d yh.a<? extends File> produceFile) {
        f0.p(serializer, "serializer");
        f0.p(produceFile, "produceFile");
        return e(this, serializer, null, null, null, produceFile, 14, null);
    }
}
