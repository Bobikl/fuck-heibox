package androidx.p001datastore.core;

import androidx.exifinterface.media.a;
import dl.e;
import java.util.List;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.coroutines.c;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import yh.l;
import yh.p;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: compiled from: DataMigrationInitializer.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0004\n\u0002\b\u0003\u0010\u0002\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0001H\u008a@"}, d2 = {a.f23244d5, "startingData", "<anonymous>"}, k = 3, mv = {1, 5, 1})
@d(c = "androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$2", f = "DataMigrationInitializer.kt", i = {0, 0}, l = {44, 46}, m = "invokeSuspend", n = {"migration", "data"}, s = {"L$2", "L$3"})
public final class DataMigrationInitializer$Companion$runMigrations$2<T> extends SuspendLambda implements p<T, c<? super T>, Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Object f22055b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    Object f22056c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    Object f22057d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int f22058e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    /* synthetic */ Object f22059f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final /* synthetic */ List<c<T>> f22060g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final /* synthetic */ List<l<c<? super b2>, Object>> f22061h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    DataMigrationInitializer$Companion$runMigrations$2(List<? extends c<T>> list, List<l<c<? super b2>, Object>> list2, c<? super DataMigrationInitializer$Companion$runMigrations$2> cVar) {
        super(2, cVar);
        this.f22060g = list;
        this.f22061h = list2;
    }

    @Override // yh.p
    @e
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Object invoke(T t10, @e c<? super T> cVar) {
        return ((DataMigrationInitializer$Companion$runMigrations$2) create(t10, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final c<b2> create(@e Object obj, @dl.d c<?> cVar) {
        DataMigrationInitializer$Companion$runMigrations$2 dataMigrationInitializer$Companion$runMigrations$2 = new DataMigrationInitializer$Companion$runMigrations$2(this.f22060g, this.f22061h, cVar);
        dataMigrationInitializer$Companion$runMigrations$2.f22059f = obj;
        return dataMigrationInitializer$Companion$runMigrations$2;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x004e  */
    /* JADX WARN: Code duplicated, block: B:15:0x0064 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:16:0x0065  */
    /* JADX WARN: Code duplicated, block: B:19:0x0072  */
    /* JADX WARN: Code duplicated, block: B:21:0x008b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:23:0x008e  */
    /* JADX WARN: Code duplicated, block: B:24:0x008f  */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final java.lang.Object invokeSuspend(@dl.d java.lang.Object r11) {
        /*
            r10 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.b.h()
            int r1 = r10.f22058e
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L3a
            if (r1 == r3) goto L24
            if (r1 != r2) goto L1c
            java.lang.Object r1 = r10.f22055b
            java.util.Iterator r1 = (java.util.Iterator) r1
            java.lang.Object r4 = r10.f22059f
            java.util.List r4 = (java.util.List) r4
            kotlin.t0.n(r11)
            r7 = r10
            goto L8c
        L1c:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L24:
            java.lang.Object r1 = r10.f22057d
            java.lang.Object r4 = r10.f22056c
            androidx.datastore.core.c r4 = (androidx.p001datastore.core.c) r4
            java.lang.Object r5 = r10.f22055b
            java.util.Iterator r5 = (java.util.Iterator) r5
            java.lang.Object r6 = r10.f22059f
            java.util.List r6 = (java.util.List) r6
            kotlin.t0.n(r11)
            r7 = r10
            r9 = r6
            r6 = r4
            r4 = r9
            goto L6a
        L3a:
            kotlin.t0.n(r11)
            java.lang.Object r11 = r10.f22059f
            java.util.List<androidx.datastore.core.c<T>> r1 = r10.f22060g
            java.util.List<yh.l<kotlin.coroutines.c<? super kotlin.b2>, java.lang.Object>> r4 = r10.f22061h
            java.util.Iterator r1 = r1.iterator()
            r5 = r10
        L48:
            boolean r6 = r1.hasNext()
            if (r6 == 0) goto L91
            java.lang.Object r6 = r1.next()
            androidx.datastore.core.c r6 = (androidx.p001datastore.core.c) r6
            r5.f22059f = r4
            r5.f22055b = r1
            r5.f22056c = r6
            r5.f22057d = r11
            r5.f22058e = r3
            java.lang.Object r7 = r6.a(r11, r5)
            if (r7 != r0) goto L65
            return r0
        L65:
            r9 = r1
            r1 = r11
            r11 = r7
            r7 = r5
            r5 = r9
        L6a:
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            if (r11 == 0) goto L8e
            androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$2$1$1 r11 = new androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$2$1$1
            r8 = 0
            r11.<init>(r6, r8)
            r4.add(r11)
            r7.f22059f = r4
            r7.f22055b = r5
            r7.f22056c = r8
            r7.f22057d = r8
            r7.f22058e = r2
            java.lang.Object r11 = r6.c(r1, r7)
            if (r11 != r0) goto L8f
            return r0
        L8c:
            r5 = r7
            goto L48
        L8e:
            r11 = r1
        L8f:
            r1 = r5
            goto L8c
        L91:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.p001datastore.core.DataMigrationInitializer$Companion$runMigrations$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
