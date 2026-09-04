package androidx.p001datastore.core;

import androidx.exifinterface.media.a;
import com.umeng.analytics.pro.ak;
import dl.d;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.coroutines.c;
import kotlin.coroutines.intrinsics.b;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;
import kotlin.t0;
import yh.l;
import yh.p;

/* JADX INFO: compiled from: DataMigrationInitializer.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0000\u0018\u0000 \u0005*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\u0006B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Landroidx/datastore/core/DataMigrationInitializer;", a.f23244d5, "", "<init>", "()V", ak.av, "Companion", "datastore-core"}, k = 1, mv = {1, 5, 1})
public final class DataMigrationInitializer<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @d
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: compiled from: DataMigrationInitializer.kt */
    @Metadata(bv = {}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0011\u0010\u0012J;\u0010\t\u001a\u00020\b\"\u0004\b\u0001\u0010\u00022\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00040\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\u0006H\u0082@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ[\u0010\u000f\u001a3\b\u0001\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00028\u00010\u0006¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000b\"\u0004\b\u0001\u0010\u00022\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00040\u0003ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0013"}, d2 = {"Landroidx/datastore/core/DataMigrationInitializer$Companion;", "", a.f23244d5, "", "Landroidx/datastore/core/c;", "migrations", "Landroidx/datastore/core/g;", "api", "Lkotlin/b2;", ak.aF, "(Ljava/util/List;Landroidx/datastore/core/g;Lkotlin/coroutines/c;)Ljava/lang/Object;", "Lkotlin/Function2;", "Lkotlin/m0;", "name", "Lkotlin/coroutines/c;", "b", "(Ljava/util/List;)Lyh/p;", "<init>", "()V", "datastore-core"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(u uVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Code duplicated, block: B:27:0x006f  */
        /* JADX WARN: Code duplicated, block: B:37:0x009a  */
        /* JADX WARN: Code duplicated, block: B:39:0x009d  */
        /* JADX WARN: Code duplicated, block: B:43:0x0081 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:45:? A[LOOP:0: B:25:0x0069->B:45:?, LOOP_END, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Type inference failed for: r9v3, types: [T, java.lang.Throwable] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x0086 -> B:25:0x0069). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x0089 -> B:25:0x0069). Please report as a decompilation issue!!! */
        public final <T> Object c(List<? extends c<T>> list, g<T> gVar, c<? super b2> cVar) throws Throwable {
            DataMigrationInitializer$Companion$runMigrations$1 dataMigrationInitializer$Companion$runMigrations$1;
            List list2;
            Ref.ObjectRef objectRef;
            Iterator<T> it;
            Throwable th2;
            l lVar;
            if (cVar instanceof DataMigrationInitializer$Companion$runMigrations$1) {
                dataMigrationInitializer$Companion$runMigrations$1 = (DataMigrationInitializer$Companion$runMigrations$1) cVar;
                int i10 = dataMigrationInitializer$Companion$runMigrations$1.f22054f;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    dataMigrationInitializer$Companion$runMigrations$1.f22054f = i10 - Integer.MIN_VALUE;
                } else {
                    dataMigrationInitializer$Companion$runMigrations$1 = new DataMigrationInitializer$Companion$runMigrations$1(this, cVar);
                }
            } else {
                dataMigrationInitializer$Companion$runMigrations$1 = new DataMigrationInitializer$Companion$runMigrations$1(this, cVar);
            }
            Object obj = dataMigrationInitializer$Companion$runMigrations$1.f22052d;
            Object objH = b.h();
            int i11 = dataMigrationInitializer$Companion$runMigrations$1.f22054f;
            if (i11 != 0) {
                if (i11 == 1) {
                    list2 = (List) dataMigrationInitializer$Companion$runMigrations$1.f22050b;
                    t0.n(obj);
                } else {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    it = (Iterator) dataMigrationInitializer$Companion$runMigrations$1.f22051c;
                    objectRef = (Ref.ObjectRef) dataMigrationInitializer$Companion$runMigrations$1.f22050b;
                    try {
                        t0.n(obj);
                    } catch (Throwable 
                    /*  JADX ERROR: Method code generation error
                        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getCodeVar()" because "ssaVar" is null
                        	at jadx.core.codegen.RegionGen.makeCatchBlock(RegionGen.java:372)
                        	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:335)
                        	at jadx.core.dex.regions.TryCatchRegion.generate(TryCatchRegion.java:85)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:140)
                        	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                        	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:291)
                        	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:270)
                        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
                        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                        */
                    /*
                        this = this;
                        boolean r0 = r9 instanceof androidx.p001datastore.core.DataMigrationInitializer$Companion$runMigrations$1
                        if (r0 == 0) goto L13
                        r0 = r9
                        androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$1 r0 = (androidx.p001datastore.core.DataMigrationInitializer$Companion$runMigrations$1) r0
                        int r1 = r0.f22054f
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f22054f = r1
                        goto L18
                    L13:
                        androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$1 r0 = new androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$1
                        r0.<init>(r6, r9)
                    L18:
                        java.lang.Object r9 = r0.f22052d
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.b.h()
                        int r2 = r0.f22054f
                        r3 = 2
                        r4 = 1
                        if (r2 == 0) goto L46
                        if (r2 == r4) goto L3e
                        if (r2 != r3) goto L36
                        java.lang.Object r7 = r0.f22051c
                        java.util.Iterator r7 = (java.util.Iterator) r7
                        java.lang.Object r8 = r0.f22050b
                        kotlin.jvm.internal.Ref$ObjectRef r8 = (kotlin.jvm.internal.Ref.ObjectRef) r8
                        kotlin.t0.n(r9)     // Catch: java.lang.Throwable -> L34
                        goto L69
                    L34:
                        r9 = move-exception
                        goto L82
                    L36:
                        java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                        java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                        r7.<init>(r8)
                        throw r7
                    L3e:
                        java.lang.Object r7 = r0.f22050b
                        java.util.List r7 = (java.util.List) r7
                        kotlin.t0.n(r9)
                        goto L60
                    L46:
                        kotlin.t0.n(r9)
                        java.util.ArrayList r9 = new java.util.ArrayList
                        r9.<init>()
                        androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$2 r2 = new androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$2
                        r5 = 0
                        r2.<init>(r7, r9, r5)
                        r0.f22050b = r9
                        r0.f22054f = r4
                        java.lang.Object r7 = r8.a(r2, r0)
                        if (r7 != r1) goto L5f
                        return r1
                    L5f:
                        r7 = r9
                    L60:
                        kotlin.jvm.internal.Ref$ObjectRef r8 = new kotlin.jvm.internal.Ref$ObjectRef
                        r8.<init>()
                        java.util.Iterator r7 = r7.iterator()
                    L69:
                        boolean r9 = r7.hasNext()
                        if (r9 == 0) goto L94
                        java.lang.Object r9 = r7.next()
                        yh.l r9 = (yh.l) r9
                        r0.f22050b = r8     // Catch: java.lang.Throwable -> L34
                        r0.f22051c = r7     // Catch: java.lang.Throwable -> L34
                        r0.f22054f = r3     // Catch: java.lang.Throwable -> L34
                        java.lang.Object r9 = r9.invoke(r0)     // Catch: java.lang.Throwable -> L34
                        if (r9 != r1) goto L69
                        return r1
                    L82:
                        T r2 = r8.f124891b
                        if (r2 != 0) goto L89
                        r8.f124891b = r9
                        goto L69
                    L89:
                        kotlin.jvm.internal.f0.m(r2)
                        T r2 = r8.f124891b
                        java.lang.Throwable r2 = (java.lang.Throwable) r2
                        kotlin.o.a(r2, r9)
                        goto L69
                    L94:
                        T r7 = r8.f124891b
                        java.lang.Throwable r7 = (java.lang.Throwable) r7
                        if (r7 != 0) goto L9d
                        kotlin.b2 r7 = kotlin.b2.f124493a
                        return r7
                    L9d:
                        throw r7
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.p001datastore.core.DataMigrationInitializer.Companion.c(java.util.List, androidx.datastore.core.g, kotlin.coroutines.c):java.lang.Object");
                }

                @d
                public final <T> p<g<T>, c<? super b2>, Object> b(@d List<? extends c<T>> migrations) {
                    f0.p(migrations, "migrations");
                    return new DataMigrationInitializer$Companion$getInitializer$1(migrations, null);
                }
            }
        }
