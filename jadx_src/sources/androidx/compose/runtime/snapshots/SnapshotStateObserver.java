package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.d2;
import androidx.compose.runtime.e2;
import androidx.compose.runtime.m2;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import java.util.HashMap;
import java.util.Set;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.jvm.internal.w0;
import kotlin.s0;

/* JADX INFO: compiled from: SnapshotStateObserver.kt */
/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001:\u0001.B0\u0012'\u0010+\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00040\f¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(*\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b,\u0010-J\u001d\u0010\u0006\u001a\u00020\u00042\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0082\bJ&\u0010\t\u001a\u00020\u0003\"\b\b\u0000\u0010\u0007*\u00020\u00012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u0002H\u0002JA\u0010\r\u001a\u00020\u0004\"\b\b\u0000\u0010\u0007*\u00020\u00012\u0006\u0010\n\u001a\u00028\u00002\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\f¢\u0006\u0004\b\r\u0010\u000eJ\u0016\u0010\u000f\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\fH\u0007J\u000e\u0010\u0010\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0001J)\u0010\u0015\u001a\u00020\u00042!\u0010\u0014\u001a\u001d\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u00130\u0002J\u0006\u0010\u0016\u001a\u00020\u0004J\u0006\u0010\u0017\u001a\u00020\u0004J\u001c\u0010\u001c\u001a\u00020\u00042\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00010\u00182\u0006\u0010\u001b\u001a\u00020\u001aJ\u0006\u0010\u001d\u001a\u00020\u0004R\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00030\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0018\u0010%\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010'\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010&R\u0018\u0010)\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010(¨\u0006/"}, d2 = {"Landroidx/compose/runtime/snapshots/SnapshotStateObserver;", "", "Lkotlin/Function1;", "Landroidx/compose/runtime/snapshots/SnapshotStateObserver$ObservedScopeMap;", "Lkotlin/b2;", "block", "j", androidx.exifinterface.media.a.f23244d5, "onChanged", "i", "scope", "onValueChangedForScope", "Lkotlin/Function0;", "l", "(Ljava/lang/Object;Lyh/l;Lyh/a;)V", "o", "g", "Lkotlin/m0;", "name", "", "predicate", RXScreenCaptureService.KEY_HEIGHT, "m", "n", "", "changes", "Landroidx/compose/runtime/snapshots/f;", "snapshot", "k", "f", "Landroidx/compose/runtime/collection/e;", "d", "Landroidx/compose/runtime/collection/e;", "observedScopeMaps", "Landroidx/compose/runtime/snapshots/d;", "e", "Landroidx/compose/runtime/snapshots/d;", "applyUnsubscribe", "Z", "isPaused", "Landroidx/compose/runtime/snapshots/SnapshotStateObserver$ObservedScopeMap;", "currentMap", "callback", "onChangedExecutor", "<init>", "(Lyh/l;)V", "ObservedScopeMap", "runtime_release"}, k = 1, mv = {1, 7, 1})
public final class SnapshotStateObserver {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f13189h = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final yh.l<yh.a<b2>, b2> f13190a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final yh.p<Set<? extends Object>, f, b2> f13191b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private final yh.l<Object, b2> f13192c;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final androidx.compose.runtime.collection.e<ObservedScopeMap> observedScopeMaps;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private d applyUnsubscribe;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private boolean isPaused;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private ObservedScopeMap currentMap;

    /* JADX INFO: compiled from: SnapshotStateObserver.kt */
    @Metadata(bv = {}, d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u00106\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00030\f¢\u0006\u0004\b?\u0010@J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0001H\u0002J\u0018\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0002J\u000e\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0001J\"\u0010\n\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u00012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\bH\u0086\bø\u0001\u0000J\u000e\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0001J)\u0010\u0011\u001a\u00020\u00032!\u0010\u0010\u001a\u001d\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0002\u0012\u0004\u0012\u00020\u000f0\fJ\u0006\u0010\u0012\u001a\u00020\u0003J\u0014\u0010\u0015\u001a\u00020\u000f2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00010\u0013J\u0006\u0010\u0016\u001a\u00020\u0003R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010!\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00010\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R \u0010)\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u001a0&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u001a\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00010*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0016\u0010/\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010 R\u001e\u00101\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u0003000\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010$R<\u00105\u001a*\u0012\b\u0012\u0006\u0012\u0002\b\u000300\u0012\u0006\u0012\u0004\u0018\u00010\u000102j\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u000300\u0012\u0006\u0012\u0004\u0018\u00010\u0001`38\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u00104R#\u00106\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00030\f8\u0006¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R'\u0010;\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030:\u0012\u0004\u0012\u00020\u00030\f8\u0006¢\u0006\f\n\u0004\b;\u00107\u001a\u0004\b<\u00109R'\u0010=\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030:\u0012\u0004\u0012\u00020\u00030\f8\u0006¢\u0006\f\n\u0004\b=\u00107\u001a\u0004\b>\u00109\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006A"}, d2 = {"Landroidx/compose/runtime/snapshots/SnapshotStateObserver$ObservedScopeMap;", "", "scope", "Lkotlin/b2;", "l", "value", ak.aG, "t", "Lkotlin/Function0;", "block", "r", "m", "Lkotlin/Function1;", "Lkotlin/m0;", "name", "", "predicate", "v", "k", "", "changes", ak.aB, "q", "b", "Ljava/lang/Object;", "currentScope", "Landroidx/compose/runtime/collection/a;", ak.aF, "Landroidx/compose/runtime/collection/a;", "currentScopeReads", "", "d", "I", "currentToken", "Landroidx/compose/runtime/collection/d;", "e", "Landroidx/compose/runtime/collection/d;", "valueToScopes", "Landroidx/compose/runtime/collection/b;", "f", "Landroidx/compose/runtime/collection/b;", "scopeToValues", "Landroidx/compose/runtime/collection/c;", "g", "Landroidx/compose/runtime/collection/c;", "invalidated", "j", "deriveStateScopeCount", "Landroidx/compose/runtime/b0;", "dependencyToDerivedStates", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "Ljava/util/HashMap;", "recordedDerivedStateValues", "onChanged", "Lyh/l;", "p", "()Lyh/l;", "Landroidx/compose/runtime/m2;", "derivedStateEnterObserver", "n", "derivedStateExitObserver", "o", "<init>", "(Lyh/l;)V", "runtime_release"}, k = 1, mv = {1, 7, 1})
    public static final class ObservedScopeMap {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @dl.d
        private final yh.l<Object, b2> f13197a;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @dl.e
        private Object currentScope;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @dl.e
        private androidx.compose.runtime.collection.a currentScopeReads;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private int currentToken;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        @dl.d
        private final androidx.compose.runtime.collection.d<Object> valueToScopes;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        @dl.d
        private final androidx.compose.runtime.collection.b<Object, androidx.compose.runtime.collection.a> scopeToValues;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        @dl.d
        private final androidx.compose.runtime.collection.c<Object> invalidated;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @dl.d
        private final yh.l<m2<?>, b2> f13204h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @dl.d
        private final yh.l<m2<?>, b2> f13205i;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
        private int deriveStateScopeCount;

        /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
        @dl.d
        private final androidx.compose.runtime.collection.d<androidx.compose.runtime.b0<?>> dependencyToDerivedStates;

        /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
        @dl.d
        private final HashMap<androidx.compose.runtime.b0<?>, Object> recordedDerivedStateValues;

        public ObservedScopeMap(@dl.d yh.l<Object, b2> onChanged) {
            kotlin.jvm.internal.f0.p(onChanged, "onChanged");
            this.f13197a = onChanged;
            this.currentToken = -1;
            this.valueToScopes = new androidx.compose.runtime.collection.d<>();
            this.scopeToValues = new androidx.compose.runtime.collection.b<>(0, 1, null);
            this.invalidated = new androidx.compose.runtime.collection.c<>();
            this.f13204h = new yh.l<m2<?>, b2>() { // from class: androidx.compose.runtime.snapshots.SnapshotStateObserver$ObservedScopeMap$derivedStateEnterObserver$1
                {
                    super(1);
                }

                public final void a(@dl.d m2<?> it) {
                    kotlin.jvm.internal.f0.p(it, "it");
                    this.f13209b.deriveStateScopeCount++;
                }

                @Override // yh.l
                public /* bridge */ /* synthetic */ b2 invoke(m2<?> m2Var) {
                    a(m2Var);
                    return b2.f124493a;
                }
            };
            this.f13205i = new yh.l<m2<?>, b2>() { // from class: androidx.compose.runtime.snapshots.SnapshotStateObserver$ObservedScopeMap$derivedStateExitObserver$1
                {
                    super(1);
                }

                public final void a(@dl.d m2<?> it) {
                    kotlin.jvm.internal.f0.p(it, "it");
                    this.f13210b.deriveStateScopeCount--;
                }

                @Override // yh.l
                public /* bridge */ /* synthetic */ b2 invoke(m2<?> m2Var) {
                    a(m2Var);
                    return b2.f124493a;
                }
            };
            this.dependencyToDerivedStates = new androidx.compose.runtime.collection.d<>();
            this.recordedDerivedStateValues = new HashMap<>();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void l(Object obj) {
            androidx.compose.runtime.collection.a aVar = this.currentScopeReads;
            if (aVar != null) {
                int i10 = aVar.getSize();
                int i11 = 0;
                for (int i12 = 0; i12 < i10; i12++) {
                    Object obj2 = aVar.getCom.taobao.aranger.constant.Constants.PARAM_KEYS java.lang.String()[i12];
                    kotlin.jvm.internal.f0.n(obj2, "null cannot be cast to non-null type kotlin.Any");
                    int i13 = aVar.getValues()[i12];
                    boolean z10 = i13 != this.currentToken;
                    if (z10) {
                        u(obj, obj2);
                    }
                    if (!z10) {
                        if (i11 != i12) {
                            aVar.getCom.taobao.aranger.constant.Constants.PARAM_KEYS java.lang.String()[i11] = obj2;
                            aVar.getValues()[i11] = i13;
                        }
                        i11++;
                    }
                }
                int i14 = aVar.getSize();
                for (int i15 = i11; i15 < i14; i15++) {
                    aVar.getCom.taobao.aranger.constant.Constants.PARAM_KEYS java.lang.String()[i15] = null;
                }
                aVar.p(i11);
            }
        }

        private final void u(Object obj, Object obj2) {
            this.valueToScopes.r(obj2, obj);
            if (!(obj2 instanceof androidx.compose.runtime.b0) || this.valueToScopes.e(obj2)) {
                return;
            }
            this.dependencyToDerivedStates.s(obj2);
            this.recordedDerivedStateValues.remove(obj2);
        }

        public final void k() {
            this.valueToScopes.d();
            this.scopeToValues.a();
            this.dependencyToDerivedStates.d();
            this.recordedDerivedStateValues.clear();
        }

        public final void m(@dl.d Object scope) {
            kotlin.jvm.internal.f0.p(scope, "scope");
            androidx.compose.runtime.collection.a aVarF = this.scopeToValues.f(scope);
            if (aVarF == null) {
                return;
            }
            int i10 = aVarF.getSize();
            for (int i11 = 0; i11 < i10; i11++) {
                Object obj = aVarF.getCom.taobao.aranger.constant.Constants.PARAM_KEYS java.lang.String()[i11];
                kotlin.jvm.internal.f0.n(obj, "null cannot be cast to non-null type kotlin.Any");
                int i12 = aVarF.getValues()[i11];
                u(scope, obj);
            }
        }

        @dl.d
        public final yh.l<m2<?>, b2> n() {
            return this.f13204h;
        }

        @dl.d
        public final yh.l<m2<?>, b2> o() {
            return this.f13205i;
        }

        @dl.d
        public final yh.l<Object, b2> p() {
            return this.f13197a;
        }

        public final void q() {
            androidx.compose.runtime.collection.c<Object> cVar = this.invalidated;
            yh.l<Object, b2> lVar = this.f13197a;
            int size = cVar.size();
            for (int i10 = 0; i10 < size; i10++) {
                lVar.invoke(cVar.get(i10));
            }
            this.invalidated.clear();
        }

        public final void r(@dl.d Object scope, @dl.d yh.a<b2> block) {
            kotlin.jvm.internal.f0.p(scope, "scope");
            kotlin.jvm.internal.f0.p(block, "block");
            Object obj = this.currentScope;
            androidx.compose.runtime.collection.a aVar = this.currentScopeReads;
            int i10 = this.currentToken;
            this.currentScope = scope;
            this.currentScopeReads = (androidx.compose.runtime.collection.a) this.scopeToValues.f(scope);
            if (this.currentToken == -1) {
                this.currentToken = SnapshotKt.C().getId();
            }
            block.invoke();
            Object obj2 = this.currentScope;
            kotlin.jvm.internal.f0.m(obj2);
            l(obj2);
            this.currentScope = obj;
            this.currentScopeReads = aVar;
            this.currentToken = i10;
        }

        public final boolean s(@dl.d Set<? extends Object> changes) {
            androidx.compose.runtime.collection.d<androidx.compose.runtime.b0<?>> dVar;
            int iF;
            androidx.compose.runtime.collection.d<Object> dVar2;
            int iF2;
            kotlin.jvm.internal.f0.p(changes, "changes");
            boolean z10 = false;
            for (Object obj : changes) {
                if (this.dependencyToDerivedStates.e(obj) && (iF = (dVar = this.dependencyToDerivedStates).f(obj)) >= 0) {
                    androidx.compose.runtime.collection.c cVarV = dVar.v(iF);
                    int size = cVarV.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        androidx.compose.runtime.b0 b0Var = (androidx.compose.runtime.b0) cVarV.get(i10);
                        kotlin.jvm.internal.f0.n(b0Var, "null cannot be cast to non-null type androidx.compose.runtime.DerivedState<kotlin.Any?>");
                        Object obj2 = this.recordedDerivedStateValues.get(b0Var);
                        d2 d2VarA = b0Var.a();
                        if (d2VarA == null) {
                            d2VarA = e2.w();
                        }
                        if (!d2VarA.a(b0Var.d(), obj2) && (iF2 = (dVar2 = this.valueToScopes).f(b0Var)) >= 0) {
                            androidx.compose.runtime.collection.c cVarV2 = dVar2.v(iF2);
                            int size2 = cVarV2.size();
                            int i11 = 0;
                            while (i11 < size2) {
                                this.invalidated.add(cVarV2.get(i11));
                                i11++;
                                z10 = true;
                            }
                        }
                    }
                }
                androidx.compose.runtime.collection.d<Object> dVar3 = this.valueToScopes;
                int iF3 = dVar3.f(obj);
                if (iF3 >= 0) {
                    androidx.compose.runtime.collection.c cVarV3 = dVar3.v(iF3);
                    int size3 = cVarV3.size();
                    int i12 = 0;
                    while (i12 < size3) {
                        this.invalidated.add(cVarV3.get(i12));
                        i12++;
                        z10 = true;
                    }
                }
            }
            return z10;
        }

        public final void t(@dl.d Object value) {
            kotlin.jvm.internal.f0.p(value, "value");
            if (this.deriveStateScopeCount > 0) {
                return;
            }
            Object obj = this.currentScope;
            kotlin.jvm.internal.f0.m(obj);
            androidx.compose.runtime.collection.a aVar = this.currentScopeReads;
            if (aVar == null) {
                aVar = new androidx.compose.runtime.collection.a();
                this.currentScopeReads = aVar;
                this.scopeToValues.o(obj, aVar);
            }
            int iA = aVar.a(value, this.currentToken);
            if ((value instanceof androidx.compose.runtime.b0) && iA != this.currentToken) {
                androidx.compose.runtime.b0 b0Var = (androidx.compose.runtime.b0) value;
                for (Object obj2 : b0Var.k()) {
                    if (obj2 == null) {
                        break;
                    }
                    this.dependencyToDerivedStates.c(obj2, value);
                }
                this.recordedDerivedStateValues.put(value, b0Var.d());
            }
            if (iA == -1) {
                this.valueToScopes.c(value, obj);
            }
        }

        public final void v(@dl.d yh.l<Object, Boolean> predicate) {
            kotlin.jvm.internal.f0.p(predicate, "predicate");
            androidx.compose.runtime.collection.b<Object, androidx.compose.runtime.collection.a> bVar = this.scopeToValues;
            int iH = bVar.getSize();
            int i10 = 0;
            for (int i11 = 0; i11 < iH; i11++) {
                Object obj = bVar.getKeys()[i11];
                kotlin.jvm.internal.f0.n(obj, "null cannot be cast to non-null type Key of androidx.compose.runtime.collection.IdentityArrayMap");
                androidx.compose.runtime.collection.a aVar = (androidx.compose.runtime.collection.a) bVar.getValues()[i11];
                Boolean boolInvoke = predicate.invoke(obj);
                if (boolInvoke.booleanValue()) {
                    int i12 = aVar.getSize();
                    for (int i13 = 0; i13 < i12; i13++) {
                        Object obj2 = aVar.getCom.taobao.aranger.constant.Constants.PARAM_KEYS java.lang.String()[i13];
                        kotlin.jvm.internal.f0.n(obj2, "null cannot be cast to non-null type kotlin.Any");
                        int i14 = aVar.getValues()[i13];
                        u(obj, obj2);
                    }
                }
                if (!boolInvoke.booleanValue()) {
                    if (i10 != i11) {
                        bVar.getKeys()[i10] = obj;
                        bVar.getValues()[i10] = bVar.getValues()[i11];
                    }
                    i10++;
                }
            }
            if (bVar.getSize() > i10) {
                int iH2 = bVar.getSize();
                for (int i15 = i10; i15 < iH2; i15++) {
                    bVar.getKeys()[i15] = null;
                    bVar.getValues()[i15] = null;
                }
                bVar.q(i10);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SnapshotStateObserver(@dl.d yh.l<? super yh.a<b2>, b2> onChangedExecutor) {
        kotlin.jvm.internal.f0.p(onChangedExecutor, "onChangedExecutor");
        this.f13190a = onChangedExecutor;
        this.f13191b = new yh.p<Set<? extends Object>, f, b2>() { // from class: androidx.compose.runtime.snapshots.SnapshotStateObserver$applyObserver$1
            {
                super(2);
            }

            public final void a(@dl.d Set<? extends Object> applied, @dl.d f fVar) {
                boolean z10;
                kotlin.jvm.internal.f0.p(applied, "applied");
                kotlin.jvm.internal.f0.p(fVar, "<anonymous parameter 1>");
                SnapshotStateObserver snapshotStateObserver = this.f13211b;
                synchronized (snapshotStateObserver.observedScopeMaps) {
                    androidx.compose.runtime.collection.e eVar = snapshotStateObserver.observedScopeMaps;
                    int i10 = eVar.getCom.max.hbuikit.bean.param.UiKitSpanObj.TYPE_SIZE java.lang.String();
                    z10 = false;
                    if (i10 > 0) {
                        Object[] objArrG = eVar.G();
                        kotlin.jvm.internal.f0.n(objArrG, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
                        int i11 = 0;
                        boolean z11 = false;
                        do {
                            z11 = ((SnapshotStateObserver.ObservedScopeMap) objArrG[i11]).s(applied) || z11;
                            i11++;
                        } while (i11 < i10);
                        z10 = z11;
                    }
                    b2 b2Var = b2.f124493a;
                }
                if (z10) {
                    yh.l lVar = this.f13211b.f13190a;
                    final SnapshotStateObserver snapshotStateObserver2 = this.f13211b;
                    lVar.invoke(new yh.a<b2>() { // from class: androidx.compose.runtime.snapshots.SnapshotStateObserver$applyObserver$1.2
                        {
                            super(0);
                        }

                        @Override // yh.a
                        public /* bridge */ /* synthetic */ b2 invoke() {
                            invoke2();
                            return b2.f124493a;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            SnapshotStateObserver snapshotStateObserver3 = snapshotStateObserver2;
                            synchronized (snapshotStateObserver3.observedScopeMaps) {
                                androidx.compose.runtime.collection.e eVar2 = snapshotStateObserver3.observedScopeMaps;
                                int i12 = eVar2.getCom.max.hbuikit.bean.param.UiKitSpanObj.TYPE_SIZE java.lang.String();
                                if (i12 > 0) {
                                    int i13 = 0;
                                    Object[] objArrG2 = eVar2.G();
                                    kotlin.jvm.internal.f0.n(objArrG2, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
                                    do {
                                        ((SnapshotStateObserver.ObservedScopeMap) objArrG2[i13]).q();
                                        i13++;
                                    } while (i13 < i12);
                                }
                                b2 b2Var2 = b2.f124493a;
                            }
                        }
                    });
                }
            }

            @Override // yh.p
            public /* bridge */ /* synthetic */ b2 invoke(Set<? extends Object> set, f fVar) {
                a(set, fVar);
                return b2.f124493a;
            }
        };
        this.f13192c = new yh.l<Object, b2>() { // from class: androidx.compose.runtime.snapshots.SnapshotStateObserver$readObserver$1
            {
                super(1);
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(Object obj) {
                invoke2(obj);
                return b2.f124493a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@dl.d Object state) {
                kotlin.jvm.internal.f0.p(state, "state");
                if (this.f13215b.isPaused) {
                    return;
                }
                androidx.compose.runtime.collection.e eVar = this.f13215b.observedScopeMaps;
                SnapshotStateObserver snapshotStateObserver = this.f13215b;
                synchronized (eVar) {
                    SnapshotStateObserver.ObservedScopeMap observedScopeMap = snapshotStateObserver.currentMap;
                    kotlin.jvm.internal.f0.m(observedScopeMap);
                    observedScopeMap.t(state);
                    b2 b2Var = b2.f124493a;
                }
            }
        };
        this.observedScopeMaps = new androidx.compose.runtime.collection.e<>(new ObservedScopeMap[16], 0);
    }

    private final <T> ObservedScopeMap i(yh.l<? super T, b2> lVar) {
        ObservedScopeMap observedScopeMap;
        androidx.compose.runtime.collection.e<ObservedScopeMap> eVar = this.observedScopeMaps;
        int i10 = eVar.getCom.max.hbuikit.bean.param.UiKitSpanObj.TYPE_SIZE java.lang.String();
        if (i10 <= 0) {
            observedScopeMap = null;
            break;
        }
        ObservedScopeMap[] observedScopeMapArrG = eVar.G();
        kotlin.jvm.internal.f0.n(observedScopeMapArrG, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
        int i11 = 0;
        while (true) {
            observedScopeMap = observedScopeMapArrG[i11];
            if (observedScopeMap.p() == lVar) {
                break;
            }
            i11++;
            if (i11 >= i10) {
                observedScopeMap = null;
                break;
            }
        }
        ObservedScopeMap observedScopeMap2 = observedScopeMap;
        if (observedScopeMap2 != null) {
            return observedScopeMap2;
        }
        kotlin.jvm.internal.f0.n(lVar, "null cannot be cast to non-null type kotlin.Function1<kotlin.Any, kotlin.Unit>");
        ObservedScopeMap observedScopeMap3 = new ObservedScopeMap((yh.l) w0.q(lVar, 1));
        this.observedScopeMaps.b(observedScopeMap3);
        return observedScopeMap3;
    }

    private final void j(yh.l<? super ObservedScopeMap, b2> lVar) {
        synchronized (this.observedScopeMaps) {
            try {
                androidx.compose.runtime.collection.e eVar = this.observedScopeMaps;
                int i10 = eVar.getCom.max.hbuikit.bean.param.UiKitSpanObj.TYPE_SIZE java.lang.String();
                if (i10 > 0) {
                    int i11 = 0;
                    Object[] objArrG = eVar.G();
                    kotlin.jvm.internal.f0.n(objArrG, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
                    do {
                        lVar.invoke(objArrG[i11]);
                        i11++;
                    } while (i11 < i10);
                }
                b2 b2Var = b2.f124493a;
                kotlin.jvm.internal.c0.d(1);
            } finally {
                kotlin.jvm.internal.c0.d(1);
                kotlin.jvm.internal.c0.c(1);
            }
        }
    }

    public final void f() {
        synchronized (this.observedScopeMaps) {
            androidx.compose.runtime.collection.e eVar = this.observedScopeMaps;
            int i10 = eVar.getCom.max.hbuikit.bean.param.UiKitSpanObj.TYPE_SIZE java.lang.String();
            if (i10 > 0) {
                int i11 = 0;
                Object[] objArrG = eVar.G();
                kotlin.jvm.internal.f0.n(objArrG, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
                do {
                    ((ObservedScopeMap) objArrG[i11]).k();
                    i11++;
                } while (i11 < i10);
            }
            b2 b2Var = b2.f124493a;
        }
    }

    public final void g(@dl.d Object scope) {
        kotlin.jvm.internal.f0.p(scope, "scope");
        synchronized (this.observedScopeMaps) {
            androidx.compose.runtime.collection.e eVar = this.observedScopeMaps;
            int i10 = eVar.getCom.max.hbuikit.bean.param.UiKitSpanObj.TYPE_SIZE java.lang.String();
            if (i10 > 0) {
                int i11 = 0;
                Object[] objArrG = eVar.G();
                kotlin.jvm.internal.f0.n(objArrG, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
                do {
                    ((ObservedScopeMap) objArrG[i11]).m(scope);
                    i11++;
                } while (i11 < i10);
            }
            b2 b2Var = b2.f124493a;
        }
    }

    public final void h(@dl.d yh.l<Object, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        synchronized (this.observedScopeMaps) {
            androidx.compose.runtime.collection.e eVar = this.observedScopeMaps;
            int i10 = eVar.getCom.max.hbuikit.bean.param.UiKitSpanObj.TYPE_SIZE java.lang.String();
            if (i10 > 0) {
                int i11 = 0;
                Object[] objArrG = eVar.G();
                kotlin.jvm.internal.f0.n(objArrG, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
                do {
                    ((ObservedScopeMap) objArrG[i11]).v(predicate);
                    i11++;
                } while (i11 < i10);
            }
            b2 b2Var = b2.f124493a;
        }
    }

    public final void k(@dl.d Set<? extends Object> changes, @dl.d f snapshot) {
        kotlin.jvm.internal.f0.p(changes, "changes");
        kotlin.jvm.internal.f0.p(snapshot, "snapshot");
        this.f13191b.invoke(changes, snapshot);
    }

    public final <T> void l(@dl.d T scope, @dl.d yh.l<? super T, b2> onValueChangedForScope, @dl.d final yh.a<b2> block) {
        ObservedScopeMap observedScopeMapI;
        kotlin.jvm.internal.f0.p(scope, "scope");
        kotlin.jvm.internal.f0.p(onValueChangedForScope, "onValueChangedForScope");
        kotlin.jvm.internal.f0.p(block, "block");
        synchronized (this.observedScopeMaps) {
            observedScopeMapI = i(onValueChangedForScope);
        }
        boolean z10 = this.isPaused;
        ObservedScopeMap observedScopeMap = this.currentMap;
        try {
            this.isPaused = false;
            this.currentMap = observedScopeMapI;
            Object obj = observedScopeMapI.currentScope;
            androidx.compose.runtime.collection.a aVar = observedScopeMapI.currentScopeReads;
            int i10 = observedScopeMapI.currentToken;
            observedScopeMapI.currentScope = scope;
            observedScopeMapI.currentScopeReads = (androidx.compose.runtime.collection.a) observedScopeMapI.scopeToValues.f(scope);
            if (observedScopeMapI.currentToken == -1) {
                observedScopeMapI.currentToken = SnapshotKt.C().getId();
            }
            e2.m(observedScopeMapI.n(), observedScopeMapI.o(), new yh.a<b2>() { // from class: androidx.compose.runtime.snapshots.SnapshotStateObserver$observeReads$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // yh.a
                public /* bridge */ /* synthetic */ b2 invoke() {
                    invoke2();
                    return b2.f124493a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    f.INSTANCE.e(this.f13213b.f13192c, null, block);
                }
            });
            Object obj2 = observedScopeMapI.currentScope;
            kotlin.jvm.internal.f0.m(obj2);
            observedScopeMapI.l(obj2);
            observedScopeMapI.currentScope = obj;
            observedScopeMapI.currentScopeReads = aVar;
            observedScopeMapI.currentToken = i10;
        } finally {
            this.currentMap = observedScopeMap;
            this.isPaused = z10;
        }
    }

    public final void m() {
        this.applyUnsubscribe = f.INSTANCE.h(this.f13191b);
    }

    public final void n() {
        d dVar = this.applyUnsubscribe;
        if (dVar != null) {
            dVar.dispose();
        }
    }

    @kotlin.k(message = "Replace with Snapshot.withoutReadObservation()", replaceWith = @s0(expression = "Snapshot.withoutReadObservation(block)", imports = {"androidx.compose.runtime.snapshots.Snapshot"}))
    public final void o(@dl.d yh.a<b2> block) {
        kotlin.jvm.internal.f0.p(block, "block");
        boolean z10 = this.isPaused;
        this.isPaused = true;
        try {
            block.invoke();
        } finally {
            this.isPaused = z10;
        }
    }
}
