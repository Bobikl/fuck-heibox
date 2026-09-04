package androidx.p001datastore.preferences;

import androidx.p001datastore.preferences.core.a;
import dl.e;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.collections.t;
import kotlin.coroutines.c;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.t0;
import yh.p;

/* JADX INFO: compiled from: SharedPreferencesMigration.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Landroidx/datastore/preferences/core/a;", "prefs", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
@d(c = "androidx.datastore.preferences.SharedPreferencesMigrationKt$getShouldRunMigration$1", f = "SharedPreferencesMigration.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class SharedPreferencesMigrationKt$getShouldRunMigration$1 extends SuspendLambda implements p<a, c<? super Boolean>, Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f22214b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    /* synthetic */ Object f22215c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ Set<String> f22216d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SharedPreferencesMigrationKt$getShouldRunMigration$1(Set<String> set, c<? super SharedPreferencesMigrationKt$getShouldRunMigration$1> cVar) {
        super(2, cVar);
        this.f22216d = set;
    }

    @Override // yh.p
    @e
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Object invoke(@dl.d a aVar, @e c<? super Boolean> cVar) {
        return ((SharedPreferencesMigrationKt$getShouldRunMigration$1) create(aVar, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final c<b2> create(@e Object obj, @dl.d c<?> cVar) {
        SharedPreferencesMigrationKt$getShouldRunMigration$1 sharedPreferencesMigrationKt$getShouldRunMigration$1 = new SharedPreferencesMigrationKt$getShouldRunMigration$1(this.f22216d, cVar);
        sharedPreferencesMigrationKt$getShouldRunMigration$1.f22215c = obj;
        return sharedPreferencesMigrationKt$getShouldRunMigration$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        b.h();
        if (this.f22214b != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        t0.n(obj);
        Set<a.C0158a<?>> setKeySet = ((a) this.f22215c).a().keySet();
        ArrayList arrayList = new ArrayList(t.Y(setKeySet, 10));
        Iterator<T> it = setKeySet.iterator();
        while (it.hasNext()) {
            arrayList.add(((a.C0158a) it.next()).getName());
        }
        boolean z10 = false;
        if (this.f22216d == SharedPreferencesMigrationKt.g()) {
            z10 = true;
            break;
        }
        Set<String> set = this.f22216d;
        if (!(set instanceof Collection) || !set.isEmpty()) {
            Iterator<T> it2 = set.iterator();
            while (it2.hasNext()) {
                if (kotlin.coroutines.jvm.internal.a.a(!arrayList.contains((String) it2.next())).booleanValue()) {
                    z10 = true;
                    break;
                }
            }
        }
        return kotlin.coroutines.jvm.internal.a.a(z10);
    }
}
