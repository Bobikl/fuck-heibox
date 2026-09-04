package androidx.p001datastore.preferences.core;

import dl.e;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.coroutines.c;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.t0;
import yh.p;

/* JADX INFO: compiled from: PreferenceDataStoreFactory.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Landroidx/datastore/preferences/core/a;", "it", "<anonymous>"}, k = 3, mv = {1, 5, 1})
@d(c = "androidx.datastore.preferences.core.PreferenceDataStore$updateData$2", f = "PreferenceDataStoreFactory.kt", i = {}, l = {85}, m = "invokeSuspend", n = {}, s = {})
public final class PreferenceDataStore$updateData$2 extends SuspendLambda implements p<a, c<? super a>, Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f22222b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    /* synthetic */ Object f22223c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ p<a, c<? super a>, Object> f22224d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    PreferenceDataStore$updateData$2(p<? super a, ? super c<? super a>, ? extends Object> pVar, c<? super PreferenceDataStore$updateData$2> cVar) {
        super(2, cVar);
        this.f22224d = pVar;
    }

    @Override // yh.p
    @e
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Object invoke(@dl.d a aVar, @e c<? super a> cVar) {
        return ((PreferenceDataStore$updateData$2) create(aVar, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final c<b2> create(@e Object obj, @dl.d c<?> cVar) {
        PreferenceDataStore$updateData$2 preferenceDataStore$updateData$2 = new PreferenceDataStore$updateData$2(this.f22224d, cVar);
        preferenceDataStore$updateData$2.f22223c = obj;
        return preferenceDataStore$updateData$2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        Object objH = b.h();
        int i10 = this.f22222b;
        if (i10 == 0) {
            t0.n(obj);
            a aVar = (a) this.f22223c;
            p<a, c<? super a>, Object> pVar = this.f22224d;
            this.f22222b = 1;
            obj = pVar.invoke(aVar, this);
            if (obj == objH) {
                return objH;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t0.n(obj);
        }
        a aVar2 = (a) obj;
        ((MutablePreferences) aVar2).h();
        return aVar2;
    }
}
