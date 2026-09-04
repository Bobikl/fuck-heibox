package androidx.compose.runtime;

import androidx.compose.runtime.snapshots.SnapshotKt;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.Pair;

/* JADX INFO: renamed from: androidx.compose.runtime.DerivedSnapshotState, reason: from toString */
/* JADX INFO: compiled from: DerivedState.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\n\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001\u0017B%\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n\u0012\u000e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0015¢\u0006\u0004\b,\u0010-J:\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\nH\u0002J\b\u0010\u000e\u001a\u00020\rH\u0002J\u000e\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u0006J\u0010\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u000fH\u0016J\b\u0010\u0014\u001a\u00020\rH\u0016R\"\u0010\u0019\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00158\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001f\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0011\u001a\u00028\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b \u0010!R\u0014\u0010\"\u001a\u00028\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010!R\u001c\u0010'\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010$0#8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0019\u0010+\u001a\u0004\u0018\u00018\u00008G¢\u0006\f\u0012\u0004\b)\u0010*\u001a\u0004\b(\u0010!¨\u0006."}, d2 = {"Landroidx/compose/runtime/DerivedSnapshotState;", androidx.exifinterface.media.a.f23244d5, "Landroidx/compose/runtime/snapshots/b0;", "Landroidx/compose/runtime/b0;", "Landroidx/compose/runtime/DerivedSnapshotState$a;", "readable", "Landroidx/compose/runtime/snapshots/f;", "snapshot", "", "forceDependencyReads", "Lkotlin/Function0;", "calculation", "e", "", "g", "Landroidx/compose/runtime/snapshots/c0;", ak.aF, "value", "Lkotlin/b2;", RXScreenCaptureService.KEY_HEIGHT, "toString", "Landroidx/compose/runtime/d2;", "Landroidx/compose/runtime/d2;", ak.av, "()Landroidx/compose/runtime/d2;", ak.bo, "d", "Landroidx/compose/runtime/DerivedSnapshotState$a;", "first", "l", "()Landroidx/compose/runtime/snapshots/c0;", "firstStateRecord", "getValue", "()Ljava/lang/Object;", "currentValue", "", "", "k", "()[Ljava/lang/Object;", "dependencies", "i", "getDebuggerDisplayValue$annotations", "()V", "debuggerDisplayValue", "<init>", "(Lyh/a;Landroidx/compose/runtime/d2;)V", "runtime_release"}, k = 1, mv = {1, 7, 1})
public final class DerivedState<T> implements androidx.compose.runtime.snapshots.b0, b0<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final yh.a<T> f12361b;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private final d2<T> policy;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private a<T> first;

    /* JADX INFO: renamed from: androidx.compose.runtime.DerivedSnapshotState$a */
    /* JADX INFO: compiled from: DerivedState.kt */
    @Metadata(bv = {}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0012\b\u0007\u0018\u0000 )*\u0004\b\u0001\u0010\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b'\u0010(J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0002H\u0016J\u001a\u0010\f\u001a\u00020\u000b2\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u00072\u0006\u0010\n\u001a\u00020\tJ\u001a\u0010\u000e\u001a\u00020\r2\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u00072\u0006\u0010\n\u001a\u00020\tR0\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\r\u0018\u00010\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R$\u0010\u001f\u001a\u0004\u0018\u00010\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\"\u0010&\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%¨\u0006*"}, d2 = {"Landroidx/compose/runtime/DerivedSnapshotState$a;", androidx.exifinterface.media.a.f23244d5, "Landroidx/compose/runtime/snapshots/c0;", "value", "Lkotlin/b2;", ak.av, "b", "Landroidx/compose/runtime/b0;", "derivedState", "Landroidx/compose/runtime/snapshots/f;", "snapshot", "", "k", "", "l", "Landroidx/compose/runtime/collection/b;", "Landroidx/compose/runtime/snapshots/b0;", "d", "Landroidx/compose/runtime/collection/b;", RXScreenCaptureService.KEY_HEIGHT, "()Landroidx/compose/runtime/collection/b;", "m", "(Landroidx/compose/runtime/collection/b;)V", "dependencies", "", "e", "Ljava/lang/Object;", "i", "()Ljava/lang/Object;", "n", "(Ljava/lang/Object;)V", "result", "f", "I", "j", "()I", "o", "(I)V", "resultHash", "<init>", "()V", "g", "runtime_release"}, k = 1, mv = {1, 7, 1})
    @androidx.compose.runtime.internal.o(parameters = 0)
    public static final class a<T> extends androidx.compose.runtime.snapshots.c0 {

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        @dl.d
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final int f12365h = 8;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @dl.d
        private static final Object f12366i = new Object();

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        @dl.e
        private androidx.compose.runtime.collection.b<androidx.compose.runtime.snapshots.b0, Integer> dependencies;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        @dl.e
        private Object result = f12366i;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        private int resultHash;

        /* JADX INFO: renamed from: androidx.compose.runtime.DerivedSnapshotState$a$a, reason: collision with other inner class name and from kotlin metadata */
        /* JADX INFO: compiled from: DerivedState.kt */
        @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0002\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Landroidx/compose/runtime/DerivedSnapshotState$a$a;", "", "Unset", "Ljava/lang/Object;", ak.av, "()Ljava/lang/Object;", "<init>", "()V", "runtime_release"}, k = 1, mv = {1, 7, 1})
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.u uVar) {
                this();
            }

            @dl.d
            public final Object a() {
                return a.f12366i;
            }
        }

        @Override // androidx.compose.runtime.snapshots.c0
        public void a(@dl.d androidx.compose.runtime.snapshots.c0 value) {
            kotlin.jvm.internal.f0.p(value, "value");
            a aVar = (a) value;
            this.dependencies = aVar.dependencies;
            this.result = aVar.result;
            this.resultHash = aVar.resultHash;
        }

        @Override // androidx.compose.runtime.snapshots.c0
        @dl.d
        public androidx.compose.runtime.snapshots.c0 b() {
            return new a();
        }

        @dl.e
        public final androidx.compose.runtime.collection.b<androidx.compose.runtime.snapshots.b0, Integer> h() {
            return this.dependencies;
        }

        @dl.e
        /* JADX INFO: renamed from: i, reason: from getter */
        public final Object getResult() {
            return this.result;
        }

        /* JADX INFO: renamed from: j, reason: from getter */
        public final int getResultHash() {
            return this.resultHash;
        }

        public final boolean k(@dl.d b0<?> derivedState, @dl.d androidx.compose.runtime.snapshots.f snapshot) {
            kotlin.jvm.internal.f0.p(derivedState, "derivedState");
            kotlin.jvm.internal.f0.p(snapshot, "snapshot");
            return this.result != f12366i && this.resultHash == l(derivedState, snapshot);
        }

        public final int l(@dl.d b0<?> derivedState, @dl.d androidx.compose.runtime.snapshots.f snapshot) {
            androidx.compose.runtime.collection.b<androidx.compose.runtime.snapshots.b0, Integer> bVar;
            kotlin.jvm.internal.f0.p(derivedState, "derivedState");
            kotlin.jvm.internal.f0.p(snapshot, "snapshot");
            synchronized (SnapshotKt.D()) {
                bVar = this.dependencies;
            }
            int iB = 7;
            if (bVar != null) {
                androidx.compose.runtime.collection.e eVar = (androidx.compose.runtime.collection.e) f2.f12773b.a();
                int i10 = 0;
                if (eVar == null) {
                    eVar = new androidx.compose.runtime.collection.e(new Pair[0], 0);
                }
                int i11 = eVar.getCom.max.hbuikit.bean.param.UiKitSpanObj.TYPE_SIZE java.lang.String();
                if (i11 > 0) {
                    Object[] objArrG = eVar.G();
                    kotlin.jvm.internal.f0.n(objArrG, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
                    int i12 = 0;
                    do {
                        ((yh.l) ((Pair) objArrG[i12]).a()).invoke(derivedState);
                        i12++;
                    } while (i12 < i11);
                }
                try {
                    int size = bVar.getSize();
                    for (int i13 = 0; i13 < size; i13++) {
                        Object obj = bVar.getKeys()[i13];
                        kotlin.jvm.internal.f0.n(obj, "null cannot be cast to non-null type Key of androidx.compose.runtime.collection.IdentityArrayMap");
                        androidx.compose.runtime.snapshots.b0 b0Var = (androidx.compose.runtime.snapshots.b0) obj;
                        if (((Number) bVar.getValues()[i13]).intValue() == 1) {
                            androidx.compose.runtime.snapshots.c0 c0VarC = b0Var instanceof DerivedState ? ((DerivedState) b0Var).c(snapshot) : SnapshotKt.B(b0Var.getFirstStateRecord(), snapshot);
                            iB = (((iB * 31) + b.b(c0VarC)) * 31) + c0VarC.getSnapshotId();
                        }
                    }
                    kotlin.b2 b2Var = kotlin.b2.f124493a;
                    int i14 = eVar.getCom.max.hbuikit.bean.param.UiKitSpanObj.TYPE_SIZE java.lang.String();
                    if (i14 > 0) {
                        Object[] objArrG2 = eVar.G();
                        kotlin.jvm.internal.f0.n(objArrG2, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
                        do {
                            ((yh.l) ((Pair) objArrG2[i10]).b()).invoke(derivedState);
                            i10++;
                        } while (i10 < i14);
                    }
                } catch (Throwable th2) {
                    int i15 = eVar.getCom.max.hbuikit.bean.param.UiKitSpanObj.TYPE_SIZE java.lang.String();
                    if (i15 > 0) {
                        Object[] objArrG3 = eVar.G();
                        kotlin.jvm.internal.f0.n(objArrG3, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
                        do {
                            ((yh.l) ((Pair) objArrG3[i10]).b()).invoke(derivedState);
                            i10++;
                        } while (i10 < i15);
                    }
                    throw th2;
                }
            }
            return iB;
        }

        public final void m(@dl.e androidx.compose.runtime.collection.b<androidx.compose.runtime.snapshots.b0, Integer> bVar) {
            this.dependencies = bVar;
        }

        public final void n(@dl.e Object obj) {
            this.result = obj;
        }

        public final void o(int i10) {
            this.resultHash = i10;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DerivedState(@dl.d yh.a<? extends T> calculation, @dl.e d2<T> d2Var) {
        kotlin.jvm.internal.f0.p(calculation, "calculation");
        this.f12361b = calculation;
        this.policy = d2Var;
        this.first = new a<>();
    }

    /* JADX WARN: Code duplicated, block: B:70:0x01a1 A[Catch: all -> 0x01bd, TRY_LEAVE, TryCatch #2 {, blocks: (B:60:0x0170, B:62:0x0182, B:64:0x0188, B:69:0x0196, B:70:0x01a1), top: B:90:0x0170 }] */
    /* JADX WARN: Multi-variable type inference failed */
    private final a<T> e(a<T> aVar, androidx.compose.runtime.snapshots.f fVar, boolean z10, yh.a<? extends T> aVar2) {
        androidx.compose.runtime.snapshots.f.Companion companion;
        boolean z11 = true;
        int i10 = 0;
        if (aVar.k(this, fVar)) {
            if (z10) {
                androidx.compose.runtime.collection.e eVar = (androidx.compose.runtime.collection.e) f2.f12773b.a();
                if (eVar == null) {
                    eVar = new androidx.compose.runtime.collection.e(new Pair[0], 0);
                }
                int i11 = eVar.getCom.max.hbuikit.bean.param.UiKitSpanObj.TYPE_SIZE java.lang.String();
                if (i11 > 0) {
                    Object[] objArrG = eVar.G();
                    kotlin.jvm.internal.f0.n(objArrG, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
                    int i12 = 0;
                    do {
                        ((yh.l) ((Pair) objArrG[i12]).a()).invoke(this);
                        i12++;
                    } while (i12 < i11);
                }
                try {
                    androidx.compose.runtime.collection.b<androidx.compose.runtime.snapshots.b0, Integer> bVarH = aVar.h();
                    Integer num = (Integer) f2.f12772a.a();
                    int iIntValue = num != null ? num.intValue() : 0;
                    if (bVarH != null) {
                        int size = bVarH.getSize();
                        for (int i13 = 0; i13 < size; i13++) {
                            Object obj = bVarH.getKeys()[i13];
                            kotlin.jvm.internal.f0.n(obj, "null cannot be cast to non-null type Key of androidx.compose.runtime.collection.IdentityArrayMap");
                            androidx.compose.runtime.snapshots.b0 b0Var = (androidx.compose.runtime.snapshots.b0) obj;
                            f2.f12772a.b(Integer.valueOf(((Number) bVarH.getValues()[i13]).intValue() + iIntValue));
                            yh.l<Object, kotlin.b2> lVarJ = fVar.j();
                            if (lVarJ != null) {
                                lVarJ.invoke(b0Var);
                            }
                        }
                    }
                    f2.f12772a.b(Integer.valueOf(iIntValue));
                    kotlin.b2 b2Var = kotlin.b2.f124493a;
                    int i14 = eVar.getCom.max.hbuikit.bean.param.UiKitSpanObj.TYPE_SIZE java.lang.String();
                    if (i14 > 0) {
                        Object[] objArrG2 = eVar.G();
                        kotlin.jvm.internal.f0.n(objArrG2, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
                        do {
                            ((yh.l) ((Pair) objArrG2[i10]).b()).invoke(this);
                            i10++;
                        } while (i10 < i14);
                    }
                } catch (Throwable th2) {
                    int i15 = eVar.getCom.max.hbuikit.bean.param.UiKitSpanObj.TYPE_SIZE java.lang.String();
                    if (i15 > 0) {
                        Object[] objArrG3 = eVar.G();
                        kotlin.jvm.internal.f0.n(objArrG3, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
                        do {
                            ((yh.l) ((Pair) objArrG3[i10]).b()).invoke(this);
                            i10++;
                        } while (i10 < i15);
                    }
                    throw th2;
                }
            }
            return aVar;
        }
        Integer num2 = (Integer) f2.f12772a.a();
        final int iIntValue2 = num2 != null ? num2.intValue() : 0;
        final androidx.compose.runtime.collection.b<androidx.compose.runtime.snapshots.b0, Integer> bVar = new androidx.compose.runtime.collection.b<>(0, 1, null);
        androidx.compose.runtime.collection.e eVar2 = (androidx.compose.runtime.collection.e) f2.f12773b.a();
        if (eVar2 == null) {
            eVar2 = new androidx.compose.runtime.collection.e(new Pair[0], 0);
        }
        int i16 = eVar2.getCom.max.hbuikit.bean.param.UiKitSpanObj.TYPE_SIZE java.lang.String();
        if (i16 > 0) {
            Object[] objArrG4 = eVar2.G();
            kotlin.jvm.internal.f0.n(objArrG4, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
            int i17 = 0;
            do {
                ((yh.l) ((Pair) objArrG4[i17]).a()).invoke(this);
                i17++;
            } while (i17 < i16);
        }
        try {
            f2.f12772a.b(Integer.valueOf(iIntValue2 + 1));
            Object objE = androidx.compose.runtime.snapshots.f.INSTANCE.e(new yh.l<Object, kotlin.b2>(this) { // from class: androidx.compose.runtime.DerivedSnapshotState$currentRecord$result$1$result$1

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ DerivedState<T> f12370b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                    this.f12370b = this;
                }

                @Override // yh.l
                public /* bridge */ /* synthetic */ kotlin.b2 invoke(Object obj2) {
                    invoke2(obj2);
                    return kotlin.b2.f124493a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@dl.d Object it) {
                    kotlin.jvm.internal.f0.p(it, "it");
                    if (it == this.f12370b) {
                        throw new IllegalStateException("A derived state calculation cannot read itself".toString());
                    }
                    if (it instanceof androidx.compose.runtime.snapshots.b0) {
                        Object objA = f2.f12772a.a();
                        kotlin.jvm.internal.f0.m(objA);
                        int iIntValue3 = ((Number) objA).intValue();
                        androidx.compose.runtime.collection.b<androidx.compose.runtime.snapshots.b0, Integer> bVar2 = bVar;
                        int i18 = iIntValue3 - iIntValue2;
                        Integer numF = bVar2.f(it);
                        bVar2.o(it, Integer.valueOf(Math.min(i18, numF != null ? numF.intValue() : Integer.MAX_VALUE)));
                    }
                }
            }, null, aVar2);
            f2.f12772a.b(Integer.valueOf(iIntValue2));
            int i18 = eVar2.getCom.max.hbuikit.bean.param.UiKitSpanObj.TYPE_SIZE java.lang.String();
            if (i18 > 0) {
                Object[] objArrG5 = eVar2.G();
                kotlin.jvm.internal.f0.n(objArrG5, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
                int i19 = 0;
                do {
                    ((yh.l) ((Pair) objArrG5[i19]).b()).invoke(this);
                    i19++;
                } while (i19 < i18);
            }
            synchronized (SnapshotKt.D()) {
                companion = androidx.compose.runtime.snapshots.f.INSTANCE;
                androidx.compose.runtime.snapshots.f fVarB = companion.b();
                if (aVar.getResult() == a.INSTANCE.a()) {
                    aVar = (a) SnapshotKt.L(this.first, this, fVarB);
                    aVar.m(bVar);
                    aVar.o(aVar.l(this, fVarB));
                    aVar.n(objE);
                } else {
                    d2<T> d2VarA = a();
                    if (d2VarA == 0 || !d2VarA.a(objE, aVar.getResult())) {
                        z11 = false;
                    }
                    if (z11) {
                        aVar.m(bVar);
                        aVar.o(aVar.l(this, fVarB));
                    } else {
                        aVar = (a) SnapshotKt.L(this.first, this, fVarB);
                        aVar.m(bVar);
                        aVar.o(aVar.l(this, fVarB));
                        aVar.n(objE);
                    }
                }
            }
            if (iIntValue2 == 0) {
                companion.d();
            }
            return aVar;
        } catch (Throwable th3) {
            int i20 = eVar2.getCom.max.hbuikit.bean.param.UiKitSpanObj.TYPE_SIZE java.lang.String();
            if (i20 > 0) {
                Object[] objArrG6 = eVar2.G();
                kotlin.jvm.internal.f0.n(objArrG6, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
                do {
                    ((yh.l) ((Pair) objArrG6[i10]).b()).invoke(this);
                    i10++;
                } while (i10 < i20);
            }
            throw th3;
        }
    }

    private final String g() {
        a aVar = (a) SnapshotKt.A(this.first);
        return aVar.k(this, androidx.compose.runtime.snapshots.f.INSTANCE.b()) ? String.valueOf(aVar.getResult()) : "<Not calculated>";
    }

    public static /* synthetic */ void m() {
    }

    @Override // androidx.compose.runtime.b0
    @dl.e
    public d2<T> a() {
        return this.policy;
    }

    @dl.d
    public final androidx.compose.runtime.snapshots.c0 c(@dl.d androidx.compose.runtime.snapshots.f snapshot) {
        kotlin.jvm.internal.f0.p(snapshot, "snapshot");
        return e((a) SnapshotKt.B(this.first, snapshot), snapshot, false, this.f12361b);
    }

    @Override // androidx.compose.runtime.b0
    public T d() {
        return (T) e((a) SnapshotKt.A(this.first), androidx.compose.runtime.snapshots.f.INSTANCE.b(), false, this.f12361b).getResult();
    }

    @Override // androidx.compose.runtime.m2
    public T getValue() {
        androidx.compose.runtime.snapshots.f.Companion companion = androidx.compose.runtime.snapshots.f.INSTANCE;
        yh.l<Object, kotlin.b2> lVarJ = companion.b().j();
        if (lVarJ != null) {
            lVarJ.invoke(this);
        }
        return (T) e((a) SnapshotKt.A(this.first), companion.b(), true, this.f12361b).getResult();
    }

    @Override // androidx.compose.runtime.snapshots.b0
    public void h(@dl.d androidx.compose.runtime.snapshots.c0 value) {
        kotlin.jvm.internal.f0.p(value, "value");
        this.first = (a) value;
    }

    @xh.h(name = "getDebuggerDisplayValue")
    @dl.e
    public final T i() {
        a aVar = (a) SnapshotKt.A(this.first);
        if (aVar.k(this, androidx.compose.runtime.snapshots.f.INSTANCE.b())) {
            return (T) aVar.getResult();
        }
        return null;
    }

    @Override // androidx.compose.runtime.snapshots.b0
    public /* synthetic */ androidx.compose.runtime.snapshots.c0 j(androidx.compose.runtime.snapshots.c0 c0Var, androidx.compose.runtime.snapshots.c0 c0Var2, androidx.compose.runtime.snapshots.c0 c0Var3) {
        return androidx.compose.runtime.snapshots.a0.a(this, c0Var, c0Var2, c0Var3);
    }

    @Override // androidx.compose.runtime.b0
    @dl.d
    public Object[] k() {
        Object[] keys;
        androidx.compose.runtime.collection.b<androidx.compose.runtime.snapshots.b0, Integer> bVarH = e((a) SnapshotKt.A(this.first), androidx.compose.runtime.snapshots.f.INSTANCE.b(), false, this.f12361b).h();
        return (bVarH == null || (keys = bVarH.getKeys()) == null) ? new Object[0] : keys;
    }

    @Override // androidx.compose.runtime.snapshots.b0
    @dl.d
    /* JADX INFO: renamed from: l */
    public androidx.compose.runtime.snapshots.c0 getFirstStateRecord() {
        return this.first;
    }

    @dl.d
    public String toString() {
        return "DerivedState(value=" + g() + ")@" + hashCode();
    }
}
