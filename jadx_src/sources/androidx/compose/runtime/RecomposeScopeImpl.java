package androidx.compose.runtime;

import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.taobao.accs.common.Constants;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: RecomposeScopeImpl.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u001f\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\bT\u0010UJ\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003J\u0010\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007J\u0006\u0010\u000b\u001a\u00020\u0005J\u000e\u0010\u000e\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\fJ\b\u0010\u000f\u001a\u00020\u0005H\u0016J\"\u0010\u0013\u001a\u00020\u00052\u0018\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00050\u0010H\u0016J\u000e\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0011J\u0006\u0010\u0016\u001a\u00020\u0005J\u000e\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u0007J\u0016\u0010\u001c\u001a\u00020\u001b2\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0019J\u0006\u0010\u001d\u001a\u00020\u0005J\u001c\u0010 \u001a\u0010\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u001e2\u0006\u0010\u0014\u001a\u00020\u0011R\u0016\u0010\"\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010!R(\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010#\u001a\u0004\u0018\u00010\f8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R$\u0010/\u001a\u0004\u0018\u00010(8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u0016\u00101\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u0010!R\u0018\u00105\u001a\u0004\u0018\u0001028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R*\u00109\u001a\u0016\u0012\b\u0012\u0006\u0012\u0002\b\u000307\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u0001068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u00108R$\u0010>\u001a\u00020\u001b2\u0006\u0010\b\u001a\u00020\u001b8B@BX\u0082\u000e¢\u0006\f\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R$\u0010A\u001a\u00020\u001b2\u0006\u0010\b\u001a\u00020\u001b8@@BX\u0080\u000e¢\u0006\f\u001a\u0004\b?\u0010;\"\u0004\b@\u0010=R\u0011\u0010C\u001a\u00020\u001b8F¢\u0006\u0006\u001a\u0004\bB\u0010;R\u0011\u0010E\u001a\u00020\u001b8F¢\u0006\u0006\u001a\u0004\bD\u0010;R$\u0010H\u001a\u00020\u001b2\u0006\u0010\b\u001a\u00020\u001b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bF\u0010;\"\u0004\bG\u0010=R$\u0010K\u001a\u00020\u001b2\u0006\u0010\b\u001a\u00020\u001b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bI\u0010;\"\u0004\bJ\u0010=R$\u0010N\u001a\u00020\u001b2\u0006\u0010\b\u001a\u00020\u001b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bL\u0010;\"\u0004\bM\u0010=R$\u0010Q\u001a\u00020\u001b2\u0006\u0010\b\u001a\u00020\u001b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bO\u0010;\"\u0004\bP\u0010=R\u0011\u0010S\u001a\u00020\u001b8F¢\u0006\u0006\u001a\u0004\bR\u0010;¨\u0006V"}, d2 = {"Landroidx/compose/runtime/RecomposeScopeImpl;", "Landroidx/compose/runtime/u1;", "Landroidx/compose/runtime/n1;", "Landroidx/compose/runtime/p;", "composer", "Lkotlin/b2;", RXScreenCaptureService.KEY_HEIGHT, "", "value", "Landroidx/compose/runtime/InvalidationResult;", "t", "x", "Landroidx/compose/runtime/t;", "composition", "g", "invalidate", "Lkotlin/Function2;", "", "block", ak.av, "token", "H", ak.aD, "instance", RXScreenCaptureService.KEY_WIDTH, "Landroidx/compose/runtime/collection/c;", "instances", "", "v", "y", "Lkotlin/Function1;", "Landroidx/compose/runtime/q;", "i", "I", Constants.KEY_FLAGS, "<set-?>", "b", "Landroidx/compose/runtime/t;", "l", "()Landroidx/compose/runtime/t;", "Landroidx/compose/runtime/c;", ak.aF, "Landroidx/compose/runtime/c;", "j", "()Landroidx/compose/runtime/c;", androidx.exifinterface.media.a.W4, "(Landroidx/compose/runtime/c;)V", "anchor", "e", "currentToken", "Landroidx/compose/runtime/collection/a;", "f", "Landroidx/compose/runtime/collection/a;", "trackedInstances", "Landroidx/compose/runtime/collection/b;", "Landroidx/compose/runtime/b0;", "Landroidx/compose/runtime/collection/b;", "trackedDependencies", "p", "()Z", androidx.exifinterface.media.a.S4, "(Z)V", "rereading", "q", "F", "skipped", ak.aB, "valid", "k", "canRecompose", "r", "G", "used", "m", "B", "defaultsInScope", "n", "C", "defaultsInvalid", "o", "D", "requiresRecompose", ak.aG, "isConditional", "<init>", "(Landroidx/compose/runtime/t;)V", "runtime_release"}, k = 1, mv = {1, 7, 1})
public final class RecomposeScopeImpl implements u1, n1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private int flags;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private t composition;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private c anchor;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.e
    private yh.p<? super p, ? super Integer, kotlin.b2> f12433d;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private int currentToken;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private androidx.compose.runtime.collection.a trackedInstances;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private androidx.compose.runtime.collection.b<b0<?>, Object> trackedDependencies;

    public RecomposeScopeImpl(@dl.e t tVar) {
        this.composition = tVar;
    }

    private final void E(boolean z10) {
        if (z10) {
            this.flags |= 32;
        } else {
            this.flags &= -33;
        }
    }

    private final void F(boolean z10) {
        if (z10) {
            this.flags |= 16;
        } else {
            this.flags &= -17;
        }
    }

    private final boolean p() {
        return (this.flags & 32) != 0;
    }

    public final void A(@dl.e c cVar) {
        this.anchor = cVar;
    }

    public final void B(boolean z10) {
        if (z10) {
            this.flags |= 2;
        } else {
            this.flags &= -3;
        }
    }

    public final void C(boolean z10) {
        if (z10) {
            this.flags |= 4;
        } else {
            this.flags &= -5;
        }
    }

    public final void D(boolean z10) {
        if (z10) {
            this.flags |= 8;
        } else {
            this.flags &= -9;
        }
    }

    public final void G(boolean z10) {
        if (z10) {
            this.flags |= 1;
        } else {
            this.flags &= -2;
        }
    }

    public final void H(int i10) {
        this.currentToken = i10;
        F(false);
    }

    @Override // androidx.compose.runtime.u1
    public void a(@dl.d yh.p<? super p, ? super Integer, kotlin.b2> block) {
        kotlin.jvm.internal.f0.p(block, "block");
        this.f12433d = block;
    }

    public final void g(@dl.d t composition) {
        kotlin.jvm.internal.f0.p(composition, "composition");
        this.composition = composition;
    }

    public final void h(@dl.d p composer) {
        kotlin.b2 b2Var;
        kotlin.jvm.internal.f0.p(composer, "composer");
        yh.p<? super p, ? super Integer, kotlin.b2> pVar = this.f12433d;
        if (pVar != null) {
            pVar.invoke(composer, 1);
            b2Var = kotlin.b2.f124493a;
        } else {
            b2Var = null;
        }
        if (b2Var == null) {
            throw new IllegalStateException("Invalid restart scope".toString());
        }
    }

    @dl.e
    public final yh.l<q, kotlin.b2> i(final int i10) {
        final androidx.compose.runtime.collection.a aVar = this.trackedInstances;
        if (aVar == null || q()) {
            return null;
        }
        int size = aVar.getSize();
        boolean z10 = false;
        for (int i11 = 0; i11 < size; i11++) {
            kotlin.jvm.internal.f0.n(aVar.getKeys()[i11], "null cannot be cast to non-null type kotlin.Any");
            if (aVar.getValues()[i11] != i10) {
                z10 = true;
                break;
            }
        }
        if (z10) {
            return new yh.l<q, kotlin.b2>() { // from class: androidx.compose.runtime.RecomposeScopeImpl$end$1$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                public final void a(@dl.d q composition) {
                    kotlin.jvm.internal.f0.p(composition, "composition");
                    if (this.f12437b.currentToken == i10 && kotlin.jvm.internal.f0.g(aVar, this.f12437b.trackedInstances) && (composition instanceof t)) {
                        androidx.compose.runtime.collection.a aVar2 = aVar;
                        int i12 = i10;
                        RecomposeScopeImpl recomposeScopeImpl = this.f12437b;
                        int size2 = aVar2.getSize();
                        int i13 = 0;
                        for (int i14 = 0; i14 < size2; i14++) {
                            Object obj = aVar2.getKeys()[i14];
                            kotlin.jvm.internal.f0.n(obj, "null cannot be cast to non-null type kotlin.Any");
                            int i15 = aVar2.getValues()[i14];
                            boolean z11 = i15 != i12;
                            if (z11) {
                                t tVar = (t) composition;
                                tVar.Q(obj, recomposeScopeImpl);
                                b0<?> b0Var = obj instanceof b0 ? (b0) obj : null;
                                if (b0Var != null) {
                                    tVar.P(b0Var);
                                    androidx.compose.runtime.collection.b bVar = recomposeScopeImpl.trackedDependencies;
                                    if (bVar != null) {
                                        bVar.l(b0Var);
                                        if (bVar.getSize() == 0) {
                                            recomposeScopeImpl.trackedDependencies = null;
                                        }
                                    }
                                }
                            }
                            if (!z11) {
                                if (i13 != i14) {
                                    aVar2.getKeys()[i13] = obj;
                                    aVar2.getValues()[i13] = i15;
                                }
                                i13++;
                            }
                        }
                        int size3 = aVar2.getSize();
                        for (int i16 = i13; i16 < size3; i16++) {
                            aVar2.getKeys()[i16] = null;
                        }
                        aVar2.p(i13);
                        if (aVar.getSize() == 0) {
                            this.f12437b.trackedInstances = null;
                        }
                    }
                }

                @Override // yh.l
                public /* bridge */ /* synthetic */ kotlin.b2 invoke(q qVar) {
                    a(qVar);
                    return kotlin.b2.f124493a;
                }
            };
        }
        return null;
    }

    @Override // androidx.compose.runtime.n1
    public void invalidate() {
        t tVar = this.composition;
        if (tVar != null) {
            tVar.t(this, null);
        }
    }

    @dl.e
    /* JADX INFO: renamed from: j, reason: from getter */
    public final c getAnchor() {
        return this.anchor;
    }

    public final boolean k() {
        return this.f12433d != null;
    }

    @dl.e
    /* JADX INFO: renamed from: l, reason: from getter */
    public final t getComposition() {
        return this.composition;
    }

    public final boolean m() {
        return (this.flags & 2) != 0;
    }

    public final boolean n() {
        return (this.flags & 4) != 0;
    }

    public final boolean o() {
        return (this.flags & 8) != 0;
    }

    public final boolean q() {
        return (this.flags & 16) != 0;
    }

    public final boolean r() {
        return (this.flags & 1) != 0;
    }

    public final boolean s() {
        if (this.composition == null) {
            return false;
        }
        c cVar = this.anchor;
        return cVar != null ? cVar.b() : false;
    }

    @dl.d
    public final InvalidationResult t(@dl.e Object value) {
        InvalidationResult invalidationResultT;
        t tVar = this.composition;
        return (tVar == null || (invalidationResultT = tVar.t(this, value)) == null) ? InvalidationResult.IGNORED : invalidationResultT;
    }

    public final boolean u() {
        return this.trackedDependencies != null;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0046  */
    public final boolean v(@dl.e androidx.compose.runtime.collection.c<Object> instances) {
        androidx.compose.runtime.collection.b<b0<?>, Object> bVar;
        boolean z10;
        boolean z11;
        if (instances != null && (bVar = this.trackedDependencies) != null && instances.j()) {
            if (instances.isEmpty()) {
                z11 = true;
            } else {
                for (Object obj : instances) {
                    if (obj instanceof b0) {
                        b0<?> b0Var = (b0) obj;
                        d2<?> d2VarA = b0Var.a();
                        if (d2VarA == null) {
                            d2VarA = e2.w();
                        }
                        if (d2VarA.a(b0Var.d(), bVar.f(b0Var))) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                    } else {
                        z10 = false;
                    }
                    if (!z10) {
                        z11 = false;
                    }
                }
                z11 = true;
            }
            if (z11) {
                return false;
            }
        }
        return true;
    }

    public final void w(@dl.d Object instance) {
        kotlin.jvm.internal.f0.p(instance, "instance");
        if (p()) {
            return;
        }
        androidx.compose.runtime.collection.a aVar = this.trackedInstances;
        if (aVar == null) {
            aVar = new androidx.compose.runtime.collection.a();
            this.trackedInstances = aVar;
        }
        aVar.a(instance, this.currentToken);
        if (instance instanceof b0) {
            androidx.compose.runtime.collection.b<b0<?>, Object> bVar = this.trackedDependencies;
            if (bVar == null) {
                bVar = new androidx.compose.runtime.collection.b<>(0, 1, null);
                this.trackedDependencies = bVar;
            }
            bVar.o(instance, ((b0) instance).d());
        }
    }

    public final void x() {
        this.composition = null;
        this.trackedInstances = null;
        this.trackedDependencies = null;
    }

    public final void y() {
        androidx.compose.runtime.collection.a aVar;
        t tVar = this.composition;
        if (tVar == null || (aVar = this.trackedInstances) == null) {
            return;
        }
        E(true);
        try {
            int size = aVar.getSize();
            for (int i10 = 0; i10 < size; i10++) {
                Object obj = aVar.getKeys()[i10];
                kotlin.jvm.internal.f0.n(obj, "null cannot be cast to non-null type kotlin.Any");
                int i11 = aVar.getValues()[i10];
                tVar.H(obj);
            }
            E(false);
        } catch (Throwable th2) {
            E(false);
            throw th2;
        }
    }

    public final void z() {
        F(true);
    }
}
