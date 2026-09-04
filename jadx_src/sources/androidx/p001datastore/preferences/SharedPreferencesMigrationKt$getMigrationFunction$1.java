package androidx.p001datastore.preferences;

import androidx.p001datastore.migrations.c;
import androidx.p001datastore.preferences.core.MutablePreferences;
import androidx.p001datastore.preferences.core.a;
import dl.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.collections.t;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.t0;
import yh.q;

/* JADX INFO: compiled from: SharedPreferencesMigration.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@"}, d2 = {"Landroidx/datastore/migrations/c;", "sharedPrefs", "Landroidx/datastore/preferences/core/a;", "currentData", "<anonymous>"}, k = 3, mv = {1, 5, 1})
@d(c = "androidx.datastore.preferences.SharedPreferencesMigrationKt$getMigrationFunction$1", f = "SharedPreferencesMigration.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class SharedPreferencesMigrationKt$getMigrationFunction$1 extends SuspendLambda implements q<c, a, kotlin.coroutines.c<? super a>, Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f22211b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    /* synthetic */ Object f22212c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    /* synthetic */ Object f22213d;

    SharedPreferencesMigrationKt$getMigrationFunction$1(kotlin.coroutines.c<? super SharedPreferencesMigrationKt$getMigrationFunction$1> cVar) {
        super(3, cVar);
    }

    @Override // yh.q
    @e
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Object invoke(@dl.d c cVar, @dl.d a aVar, @e kotlin.coroutines.c<? super a> cVar2) {
        SharedPreferencesMigrationKt$getMigrationFunction$1 sharedPreferencesMigrationKt$getMigrationFunction$1 = new SharedPreferencesMigrationKt$getMigrationFunction$1(cVar2);
        sharedPreferencesMigrationKt$getMigrationFunction$1.f22212c = cVar;
        sharedPreferencesMigrationKt$getMigrationFunction$1.f22213d = aVar;
        return sharedPreferencesMigrationKt$getMigrationFunction$1.invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        b.h();
        if (this.f22211b != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        t0.n(obj);
        c cVar = (c) this.f22212c;
        a aVar = (a) this.f22213d;
        Set<a.C0158a<?>> setKeySet = aVar.a().keySet();
        ArrayList arrayList = new ArrayList(t.Y(setKeySet, 10));
        Iterator<T> it = setKeySet.iterator();
        while (it.hasNext()) {
            arrayList.add(((a.C0158a) it.next()).getName());
        }
        Map<String, Object> mapC = cVar.c();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, Object> entry : mapC.entrySet()) {
            if (kotlin.coroutines.jvm.internal.a.a(!arrayList.contains(entry.getKey())).booleanValue()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        MutablePreferences mutablePreferencesD = aVar.d();
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            String str = (String) entry2.getKey();
            Object value = entry2.getValue();
            if (value instanceof Boolean) {
                mutablePreferencesD.o(androidx.p001datastore.preferences.core.c.a(str), value);
            } else if (value instanceof Float) {
                mutablePreferencesD.o(androidx.p001datastore.preferences.core.c.c(str), value);
            } else if (value instanceof Integer) {
                mutablePreferencesD.o(androidx.p001datastore.preferences.core.c.d(str), value);
            } else if (value instanceof Long) {
                mutablePreferencesD.o(androidx.p001datastore.preferences.core.c.e(str), value);
            } else if (value instanceof String) {
                mutablePreferencesD.o(androidx.p001datastore.preferences.core.c.f(str), value);
            } else if (value instanceof Set) {
                a.C0158a<Set<String>> c0158aG = androidx.p001datastore.preferences.core.c.g(str);
                if (value == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.Set<kotlin.String>");
                }
                mutablePreferencesD.o(c0158aG, (Set) value);
            } else {
                continue;
            }
        }
        return mutablePreferencesD.e();
    }
}
