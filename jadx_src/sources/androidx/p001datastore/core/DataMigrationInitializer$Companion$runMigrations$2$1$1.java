package androidx.p001datastore.core;

import androidx.exifinterface.media.a;
import dl.e;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.coroutines.c;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import yh.l;

/* JADX INFO: compiled from: DataMigrationInitializer.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0000H\u008a@"}, d2 = {a.f23244d5, "Lkotlin/b2;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
@d(c = "androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$2$1$1", f = "DataMigrationInitializer.kt", i = {}, l = {45}, m = "invokeSuspend", n = {}, s = {})
public final class DataMigrationInitializer$Companion$runMigrations$2$1$1 extends SuspendLambda implements l<c<? super b2>, Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f22062b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ c<T> f22063c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DataMigrationInitializer$Companion$runMigrations$2$1$1(c<T> cVar, c<? super DataMigrationInitializer$Companion$runMigrations$2$1$1> cVar2) {
        super(1, cVar2);
        this.f22063c = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final c<b2> create(@dl.d c<?> cVar) {
        return new DataMigrationInitializer$Companion$runMigrations$2$1$1(this.f22063c, cVar);
    }

    @Override // yh.l
    @e
    public final Object invoke(@e c<? super b2> cVar) {
        return ((DataMigrationInitializer$Companion$runMigrations$2$1$1) create(cVar)).invokeSuspend(b2.f124493a);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type kotlin.coroutines.c to androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$2$1$1 for r3v1 'this'  kotlin.coroutines.c
        	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
        	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
        	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
        	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final java.lang.Object invokeSuspend(@dl.d java.lang.Object r4) {
        /*
            r3 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.b.h()
            int r1 = r3.f22062b
            r2 = 1
            if (r1 == 0) goto L17
            if (r1 != r2) goto Lf
            kotlin.t0.n(r4)
            goto L25
        Lf:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r0)
            throw r4
        L17:
            kotlin.t0.n(r4)
            androidx.datastore.core.c<T> r4 = r3.f22063c
            r3.f22062b = r2
            java.lang.Object r4 = r4.b(r3)
            if (r4 != r0) goto L25
            return r0
        L25:
            kotlin.b2 r4 = kotlin.b2.f124493a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.p001datastore.core.DataMigrationInitializer$Companion$runMigrations$2$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
