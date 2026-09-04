package androidx.activity.result;

import kotlin.b2;
import kotlin.jvm.internal.f0;
import yh.l;

/* JADX INFO: compiled from: ActivityResultCaller.kt */
/* JADX INFO: loaded from: classes.dex */
public final class e {
    @dl.d
    public static final <I, O> g<b2> c(@dl.d b bVar, @dl.d z.a<I, O> contract, I i10, @dl.d ActivityResultRegistry registry, @dl.d final l<? super O, b2> callback) {
        f0.p(bVar, "<this>");
        f0.p(contract, "contract");
        f0.p(registry, "registry");
        f0.p(callback, "callback");
        g<I> gVarRegisterForActivityResult = bVar.registerForActivityResult(contract, registry, new a() { // from class: androidx.activity.result.d
            @Override // androidx.activity.result.a
            public final void a(Object obj) {
                e.e(callback, obj);
            }
        });
        f0.o(gVarRegisterForActivityResult, "registerForActivityResul…egistry) { callback(it) }");
        return new ActivityResultCallerLauncher(gVarRegisterForActivityResult, contract, i10);
    }

    @dl.d
    public static final <I, O> g<b2> d(@dl.d b bVar, @dl.d z.a<I, O> contract, I i10, @dl.d final l<? super O, b2> callback) {
        f0.p(bVar, "<this>");
        f0.p(contract, "contract");
        f0.p(callback, "callback");
        g<I> gVarRegisterForActivityResult = bVar.registerForActivityResult(contract, new a() { // from class: androidx.activity.result.c
            @Override // androidx.activity.result.a
            public final void a(Object obj) {
                e.f(callback, obj);
            }
        });
        f0.o(gVarRegisterForActivityResult, "registerForActivityResul…ontract) { callback(it) }");
        return new ActivityResultCallerLauncher(gVarRegisterForActivityResult, contract, i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(l callback, Object obj) {
        f0.p(callback, "$callback");
        callback.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(l callback, Object obj) {
        f0.p(callback, "$callback");
        callback.invoke(obj);
    }
}
