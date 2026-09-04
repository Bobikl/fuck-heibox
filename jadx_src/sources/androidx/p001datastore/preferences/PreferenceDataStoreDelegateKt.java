package androidx.p001datastore.preferences;

import android.content.Context;
import androidx.p001datastore.core.c;
import androidx.p001datastore.preferences.core.a;
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

/* JADX INFO: compiled from: PreferenceDataStoreDelegate.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u00004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a^\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\r0\f2\u0006\u0010\u0001\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022 \b\u0002\u0010\t\u001a\u001a\u0012\u0004\u0012\u00020\u0006\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\b0\u00070\u00052\b\b\u0002\u0010\u000b\u001a\u00020\n¨\u0006\u000f"}, d2 = {"", "name", "Ld2/b;", "Landroidx/datastore/preferences/core/a;", "corruptionHandler", "Lkotlin/Function1;", "Landroid/content/Context;", "", "Landroidx/datastore/core/c;", "produceMigrations", "Lkotlinx/coroutines/q0;", "scope", "Lkotlin/properties/e;", "Landroidx/datastore/core/d;", ak.av, "datastore-preferences_release"}, k = 2, mv = {1, 5, 1})
public final class PreferenceDataStoreDelegateKt {
    @d
    public static final e<Context, androidx.p001datastore.core.d<a>> a(@d String name, @dl.e b<a> bVar, @d l<? super Context, ? extends List<? extends c<a>>> produceMigrations, @d q0 scope) {
        f0.p(name, "name");
        f0.p(produceMigrations, "produceMigrations");
        f0.p(scope, "scope");
        return new PreferenceDataStoreSingletonDelegate(name, bVar, produceMigrations, scope);
    }

    public static /* synthetic */ e b(String str, b bVar, l lVar, q0 q0Var, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            bVar = null;
        }
        if ((i10 & 4) != 0) {
            lVar = new l<Context, List<? extends c<a>>>() { // from class: androidx.datastore.preferences.PreferenceDataStoreDelegateKt$preferencesDataStore$1
                @Override // yh.l
                @d
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final List<c<a>> invoke(@d Context it) {
                    f0.p(it, "it");
                    return CollectionsKt__CollectionsKt.E();
                }
            };
        }
        if ((i10 & 8) != 0) {
            e1 e1Var = e1.f129185a;
            q0Var = r0.a(e1.c().I(f3.c(null, 1, null)));
        }
        return a(str, bVar, lVar, q0Var);
    }
}
