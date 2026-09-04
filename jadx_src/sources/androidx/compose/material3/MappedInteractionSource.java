package androidx.compose.material3;

import com.umeng.analytics.pro.ak;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: MappedInteractionSource.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u001a\u0012\u0006\u0010\u0013\u001a\u00020\u0001\u0012\u0006\u0010\b\u001a\u00020\u0005ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002R\u001d\u0010\b\u001a\u00020\u00058\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R \u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0016"}, d2 = {"Landroidx/compose/material3/MappedInteractionSource;", "Landroidx/compose/foundation/interaction/e;", "Landroidx/compose/foundation/interaction/i$b;", "press", "f", "Lb1/f;", ak.av, "J", "delta", "", "b", "Ljava/util/Map;", "mappedPresses", "Lkotlinx/coroutines/flow/e;", "Landroidx/compose/foundation/interaction/d;", ak.aF, "Lkotlinx/coroutines/flow/e;", "()Lkotlinx/coroutines/flow/e;", "interactions", "underlyingInteractionSource", "<init>", "(Landroidx/compose/foundation/interaction/e;JLkotlin/jvm/internal/u;)V", "material3_release"}, k = 1, mv = {1, 7, 1})
public final class MappedInteractionSource implements androidx.compose.foundation.interaction.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final long delta;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final Map<androidx.compose.foundation.interaction.i.b, androidx.compose.foundation.interaction.i.b> mappedPresses;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final kotlinx.coroutines.flow.e<androidx.compose.foundation.interaction.d> interactions;

    private MappedInteractionSource(androidx.compose.foundation.interaction.e eVar, long j10) {
        this.delta = j10;
        this.mappedPresses = new LinkedHashMap();
        final kotlinx.coroutines.flow.e<androidx.compose.foundation.interaction.d> eVarC = eVar.c();
        this.interactions = new kotlinx.coroutines.flow.e<androidx.compose.foundation.interaction.d>() { // from class: androidx.compose.material3.MappedInteractionSource$special$$inlined$map$1

            /* JADX INFO: renamed from: androidx.compose.material3.MappedInteractionSource$special$$inlined$map$1$2, reason: invalid class name */
            /* JADX INFO: compiled from: Emitters.kt */
            @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {androidx.exifinterface.media.a.f23244d5, "R", "value", "Lkotlin/b2;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/c;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2", "<anonymous>"}, k = 3, mv = {1, 7, 1})
            public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.f {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ kotlinx.coroutines.flow.f f9752b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ MappedInteractionSource f9753c;

                /* JADX INFO: renamed from: androidx.compose.material3.MappedInteractionSource$special$$inlined$map$1$2$1, reason: invalid class name */
                /* JADX INFO: compiled from: Emitters.kt */
                @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
                @kotlin.coroutines.jvm.internal.d(c = "androidx.compose.material3.MappedInteractionSource$special$$inlined$map$1$2", f = "MappedInteractionSource.kt", i = {}, l = {224}, m = "emit", n = {}, s = {})
                public static final class AnonymousClass1 extends ContinuationImpl {

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    /* synthetic */ Object f9754b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    int f9755c;

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    Object f9756d;

                    public AnonymousClass1(kotlin.coroutines.c cVar) {
                        super(cVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @dl.e
                    public final Object invokeSuspend(@dl.d Object obj) {
                        this.f9754b = obj;
                        this.f9755c |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(kotlinx.coroutines.flow.f fVar, MappedInteractionSource mappedInteractionSource) {
                    this.f9752b = fVar;
                    this.f9753c = mappedInteractionSource;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference fix 'apply assigned field type' failed
                java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                 */
                @Override // kotlinx.coroutines.flow.f
                @dl.e
                public final Object emit(Object obj, @dl.d kotlin.coroutines.c cVar) throws Throwable {
                    AnonymousClass1 anonymousClass1;
                    androidx.compose.foundation.interaction.i.c cVar2;
                    androidx.compose.foundation.interaction.i.a aVar;
                    Object cVar3;
                    if (cVar instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) cVar;
                        int i10 = anonymousClass1.f9755c;
                        if ((i10 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.f9755c = i10 - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(cVar);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(cVar);
                    }
                    Object obj2 = anonymousClass1.f9754b;
                    Object objH = kotlin.coroutines.intrinsics.b.h();
                    int i11 = anonymousClass1.f9755c;
                    if (i11 == 0) {
                        kotlin.t0.n(obj2);
                        kotlinx.coroutines.flow.f fVar = this.f9752b;
                        androidx.compose.foundation.interaction.d dVar = (androidx.compose.foundation.interaction.d) obj;
                        if (dVar instanceof androidx.compose.foundation.interaction.i.b) {
                            androidx.compose.foundation.interaction.i.b bVarF = this.f9753c.f((androidx.compose.foundation.interaction.i.b) dVar);
                            this.f9753c.mappedPresses.put(dVar, bVarF);
                            cVar3 = bVarF;
                        } else if (dVar instanceof androidx.compose.foundation.interaction.i.a) {
                            aVar = (androidx.compose.foundation.interaction.i.a) dVar;
                            androidx.compose.foundation.interaction.i.b bVar = (androidx.compose.foundation.interaction.i.b) this.f9753c.mappedPresses.remove(aVar.getPress());
                            if (bVar != null) {
                                cVar3 = aVar;
                                cVar3 = new androidx.compose.foundation.interaction.i.a(bVar);
                            }
                        } else if (dVar instanceof androidx.compose.foundation.interaction.i.c) {
                            cVar2 = (androidx.compose.foundation.interaction.i.c) dVar;
                            androidx.compose.foundation.interaction.i.b bVar2 = (androidx.compose.foundation.interaction.i.b) this.f9753c.mappedPresses.remove(cVar2.getPress());
                            if (bVar2 != null) {
                                cVar3 = dVar;
                                cVar3 = cVar2;
                                cVar3 = new androidx.compose.foundation.interaction.i.c(bVar2);
                            }
                        }
                        cVar3 = dVar;
                        cVar3 = cVar2;
                        cVar3 = dVar;
                        cVar3 = aVar;
                        anonymousClass1.f9755c = 1;
                        if (fVar.emit(cVar3, anonymousClass1) == objH) {
                            return objH;
                        }
                    } else {
                        if (i11 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.t0.n(obj2);
                    }
                    return kotlin.b2.f124493a;
                }
            }

            @Override // kotlinx.coroutines.flow.e
            @dl.e
            public Object a(@dl.d kotlinx.coroutines.flow.f<? super androidx.compose.foundation.interaction.d> fVar, @dl.d kotlin.coroutines.c cVar) {
                Object objA = eVarC.a(new AnonymousClass2(fVar, this), cVar);
                return objA == kotlin.coroutines.intrinsics.b.h() ? objA : kotlin.b2.f124493a;
            }
        };
    }

    public /* synthetic */ MappedInteractionSource(androidx.compose.foundation.interaction.e eVar, long j10, kotlin.jvm.internal.u uVar) {
        this(eVar, j10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final androidx.compose.foundation.interaction.i.b f(androidx.compose.foundation.interaction.i.b press) {
        return new androidx.compose.foundation.interaction.i.b(b1.f.u(press.getPressPosition(), this.delta), null);
    }

    @Override // androidx.compose.foundation.interaction.e
    @dl.d
    public kotlinx.coroutines.flow.e<androidx.compose.foundation.interaction.d> c() {
        return this.interactions;
    }
}
