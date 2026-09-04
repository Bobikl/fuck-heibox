package androidx.p001datastore;

import android.content.Context;
import androidx.exifinterface.media.a;
import androidx.p001datastore.core.c;
import androidx.p001datastore.core.i;
import com.lzy.okgo.model.Progress;
import com.umeng.analytics.pro.ak;
import d2.b;
import dl.d;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.f0;
import kotlin.properties.e;
import kotlinx.coroutines.e1;
import kotlinx.coroutines.f3;
import kotlinx.coroutines.q0;
import kotlinx.coroutines.r0;
import yh.l;

/* JADX INFO: compiled from: DataStoreDelegate.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u00008\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001ar\u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000f0\u000e\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00052 \b\u0002\u0010\u000b\u001a\u001a\u0012\u0004\u0012\u00020\b\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n0\t0\u00072\b\b\u0002\u0010\r\u001a\u00020\f¨\u0006\u0011"}, d2 = {a.f23244d5, "", Progress.F, "Landroidx/datastore/core/i;", "serializer", "Ld2/b;", "corruptionHandler", "Lkotlin/Function1;", "Landroid/content/Context;", "", "Landroidx/datastore/core/c;", "produceMigrations", "Lkotlinx/coroutines/q0;", "scope", "Lkotlin/properties/e;", "Landroidx/datastore/core/d;", ak.av, "datastore_release"}, k = 2, mv = {1, 5, 1})
public final class DataStoreDelegateKt {
    @d
    public static final <T> e<Context, androidx.p001datastore.core.d<T>> a(@d String fileName, @d i<T> serializer, @dl.e b<T> bVar, @d l<? super Context, ? extends List<? extends c<T>>> produceMigrations, @d q0 scope) {
        f0.p(fileName, "fileName");
        f0.p(serializer, "serializer");
        f0.p(produceMigrations, "produceMigrations");
        f0.p(scope, "scope");
        return new DataStoreSingletonDelegate(fileName, serializer, bVar, produceMigrations, scope);
    }

    public static /* synthetic */ e b(String str, i iVar, b bVar, l lVar, q0 q0Var, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            bVar = null;
        }
        if ((i10 & 8) != 0) {
            lVar = new l<Context, List<? extends c<Object>>>() { // from class: androidx.datastore.DataStoreDelegateKt$dataStore$1
                @Override // yh.l
                @d
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final List<c<Object>> invoke(@d Context it) {
                    f0.p(it, "it");
                    return CollectionsKt__CollectionsKt.E();
                }
            };
        }
        if ((i10 & 16) != 0) {
            e1 e1Var = e1.f129185a;
            q0Var = r0.a(e1.c().I(f3.c(null, 1, null)));
        }
        return a(str, iVar, bVar, lVar, q0Var);
    }
}
