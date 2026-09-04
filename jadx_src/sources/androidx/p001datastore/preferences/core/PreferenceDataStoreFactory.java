package androidx.p001datastore.preferences.core;

import androidx.p001datastore.core.c;
import com.umeng.analytics.pro.ak;
import d2.b;
import dl.d;
import dl.e;
import java.io.File;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.io.FilesKt__UtilsKt;
import kotlin.jvm.internal.f0;
import kotlinx.coroutines.e1;
import kotlinx.coroutines.f3;
import kotlinx.coroutines.q0;
import kotlinx.coroutines.r0;
import xh.i;
import yh.a;

/* JADX INFO: compiled from: PreferenceDataStoreFactory.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010JN\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\r2\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00060\u00052\b\b\u0002\u0010\t\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0007¨\u0006\u0011"}, d2 = {"Landroidx/datastore/preferences/core/PreferenceDataStoreFactory;", "", "Ld2/b;", "Landroidx/datastore/preferences/core/a;", "corruptionHandler", "", "Landroidx/datastore/core/c;", "migrations", "Lkotlinx/coroutines/q0;", "scope", "Lkotlin/Function0;", "Ljava/io/File;", "produceFile", "Landroidx/datastore/core/d;", ak.av, "<init>", "()V", "datastore-preferences-core"}, k = 1, mv = {1, 5, 1})
public final class PreferenceDataStoreFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @d
    public static final PreferenceDataStoreFactory f22225a = new PreferenceDataStoreFactory();

    private PreferenceDataStoreFactory() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ androidx.p001datastore.core.d e(PreferenceDataStoreFactory preferenceDataStoreFactory, b bVar, List list, q0 q0Var, a aVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            bVar = null;
        }
        if ((i10 & 2) != 0) {
            list = CollectionsKt__CollectionsKt.E();
        }
        if ((i10 & 4) != 0) {
            e1 e1Var = e1.f129185a;
            q0Var = r0.a(e1.c().I(f3.c(null, 1, null)));
        }
        return preferenceDataStoreFactory.a(bVar, list, q0Var, aVar);
    }

    @d
    @i
    public final androidx.p001datastore.core.d<a> a(@e b<a> bVar, @d List<? extends c<a>> migrations, @d q0 scope, @d final a<? extends File> produceFile) {
        f0.p(migrations, "migrations");
        f0.p(scope, "scope");
        f0.p(produceFile, "produceFile");
        return new PreferenceDataStore(androidx.p001datastore.core.e.f22176a.a(d.f22233a, bVar, migrations, scope, new a<File>() { // from class: androidx.datastore.preferences.core.PreferenceDataStoreFactory$create$delegate$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
            }

            @Override // yh.a
            @d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final File invoke() {
                File fileInvoke = produceFile.invoke();
                String strY = FilesKt__UtilsKt.Y(fileInvoke);
                d dVar = d.f22233a;
                if (f0.g(strY, dVar.c())) {
                    return fileInvoke;
                }
                throw new IllegalStateException(("File extension for file: " + fileInvoke + " does not match required extension for Preferences file: " + dVar.c()).toString());
            }
        }));
    }

    @d
    @i
    public final androidx.p001datastore.core.d<a> b(@e b<a> bVar, @d List<? extends c<a>> migrations, @d a<? extends File> produceFile) {
        f0.p(migrations, "migrations");
        f0.p(produceFile, "produceFile");
        return e(this, bVar, migrations, null, produceFile, 4, null);
    }

    @d
    @i
    public final androidx.p001datastore.core.d<a> c(@e b<a> bVar, @d a<? extends File> produceFile) {
        f0.p(produceFile, "produceFile");
        return e(this, bVar, null, null, produceFile, 6, null);
    }

    @d
    @i
    public final androidx.p001datastore.core.d<a> d(@d a<? extends File> produceFile) {
        f0.p(produceFile, "produceFile");
        return e(this, null, null, null, produceFile, 7, null);
    }
}
