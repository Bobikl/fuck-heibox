package androidx.p001datastore.preferences.core;

import bb.c;
import dl.e;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.t0;
import yh.p;

/* JADX INFO: compiled from: Preferences.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Landroidx/datastore/preferences/core/a;", "it", "<anonymous>"}, k = 3, mv = {1, 5, 1})
@d(c = "androidx.datastore.preferences.core.PreferencesKt$edit$2", f = "Preferences.kt", i = {}, l = {c.b.f30899r3}, m = "invokeSuspend", n = {}, s = {})
public final class PreferencesKt$edit$2 extends SuspendLambda implements p<a, kotlin.coroutines.c<? super a>, Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f22227b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    /* synthetic */ Object f22228c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ p<MutablePreferences, kotlin.coroutines.c<? super b2>, Object> f22229d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    PreferencesKt$edit$2(p<? super MutablePreferences, ? super kotlin.coroutines.c<? super b2>, ? extends Object> pVar, kotlin.coroutines.c<? super PreferencesKt$edit$2> cVar) {
        super(2, cVar);
        this.f22229d = pVar;
    }

    @Override // yh.p
    @e
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Object invoke(@dl.d a aVar, @e kotlin.coroutines.c<? super a> cVar) {
        return ((PreferencesKt$edit$2) create(aVar, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        PreferencesKt$edit$2 preferencesKt$edit$2 = new PreferencesKt$edit$2(this.f22229d, cVar);
        preferencesKt$edit$2.f22228c = obj;
        return preferencesKt$edit$2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        Object objH = b.h();
        int i10 = this.f22227b;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            MutablePreferences mutablePreferences = (MutablePreferences) this.f22228c;
            t0.n(obj);
            return mutablePreferences;
        }
        t0.n(obj);
        MutablePreferences mutablePreferencesD = ((a) this.f22228c).d();
        p<MutablePreferences, kotlin.coroutines.c<? super b2>, Object> pVar = this.f22229d;
        this.f22228c = mutablePreferencesD;
        this.f22227b = 1;
        return pVar.invoke(mutablePreferencesD, this) == objH ? objH : mutablePreferencesD;
    }
}
