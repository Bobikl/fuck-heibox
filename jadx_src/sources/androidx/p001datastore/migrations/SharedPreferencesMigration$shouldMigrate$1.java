package androidx.p001datastore.migrations;

import kotlin.Metadata;
import kotlin.coroutines.c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;

/* JADX INFO: compiled from: SharedPreferencesMigration.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
@d(c = "androidx.datastore.migrations.SharedPreferencesMigration", f = "SharedPreferencesMigration.kt", i = {0}, l = {147}, m = "shouldMigrate", n = {"this"}, s = {"L$0"})
public final class SharedPreferencesMigration$shouldMigrate$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Object f22192b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    /* synthetic */ Object f22193c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ SharedPreferencesMigration<T> f22194d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int f22195e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SharedPreferencesMigration$shouldMigrate$1(SharedPreferencesMigration<T> sharedPreferencesMigration, c<? super SharedPreferencesMigration$shouldMigrate$1> cVar) {
        super(cVar);
        this.f22194d = sharedPreferencesMigration;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type kotlin.coroutines.c to androidx.datastore.migrations.SharedPreferencesMigration$shouldMigrate$1 for r1v1 'this'  kotlin.coroutines.c
        	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
        	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
        	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
        	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final java.lang.Object invokeSuspend(@dl.d java.lang.Object r2) {
        /*
            r1 = this;
            r1.f22193c = r2
            int r2 = r1.f22195e
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r2 | r0
            r1.f22195e = r2
            androidx.datastore.migrations.SharedPreferencesMigration<T> r2 = r1.f22194d
            r0 = 0
            java.lang.Object r2 = r2.a(r0, r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.p001datastore.migrations.SharedPreferencesMigration$shouldMigrate$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
