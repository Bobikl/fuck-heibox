package kotlinx.coroutines.selects;

import com.huawei.hms.push.constant.RemoteMessageConst;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.r0;
import yh.l;
import yh.p;

/* JADX INFO: compiled from: SelectUnbiased.kt */
/* JADX INFO: loaded from: classes5.dex */
@r0
@Metadata(bv = {}, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0015\u0012\f\u0010)\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b¢\u0006\u0004\b*\u0010+J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0001J\n\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0001J5\u0010\r\u001a\u00020\u0005*\u00020\t2\u001c\u0010\f\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00070\nH\u0096\u0002ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJG\u0010\u0012\u001a\u00020\u0005\"\u0004\b\u0001\u0010\u000f*\b\u0012\u0004\u0012\u00028\u00010\u00102\"\u0010\f\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0011H\u0096\u0002ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J[\u0010\u0017\u001a\u00020\u0005\"\u0004\b\u0001\u0010\u0014\"\u0004\b\u0002\u0010\u000f*\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00152\u0006\u0010\u0016\u001a\u00028\u00012\"\u0010\f\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0011H\u0096\u0002ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J8\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u00192\u001c\u0010\f\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00070\nH\u0016ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cR\u001d\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000\u001d8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001e\u0010 R3\u0010(\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050#0\"j\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050#`$8\u0006¢\u0006\f\n\u0004\b\u0006\u0010%\u001a\u0004\b&\u0010'\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006,"}, d2 = {"Lkotlinx/coroutines/selects/UnbiasedSelectBuilderImpl;", "R", "Lkotlinx/coroutines/selects/a;", "", "e", "Lkotlin/b2;", ak.aF, "", "d", "Lkotlinx/coroutines/selects/c;", "Lkotlin/Function1;", "Lkotlin/coroutines/c;", "block", "f", "(Lkotlinx/coroutines/selects/c;Lyh/l;)V", "Q", "Lkotlinx/coroutines/selects/d;", "Lkotlin/Function2;", RXScreenCaptureService.KEY_HEIGHT, "(Lkotlinx/coroutines/selects/d;Lyh/p;)V", "P", "Lkotlinx/coroutines/selects/e;", RemoteMessageConst.MessageBody.PARAM, "l", "(Lkotlinx/coroutines/selects/e;Ljava/lang/Object;Lyh/p;)V", "", "timeMillis", "t", "(JLyh/l;)V", "Lkotlinx/coroutines/selects/b;", "b", "Lkotlinx/coroutines/selects/b;", "()Lkotlinx/coroutines/selects/b;", "instance", "Ljava/util/ArrayList;", "Lkotlin/Function0;", "Lkotlin/collections/ArrayList;", "Ljava/util/ArrayList;", ak.av, "()Ljava/util/ArrayList;", "clauses", "uCont", "<init>", "(Lkotlin/coroutines/c;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public final class UnbiasedSelectBuilderImpl<R> implements a<R> {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final SelectInstance<R> instance;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final ArrayList<yh.a<b2>> clauses = new ArrayList<>();

    public UnbiasedSelectBuilderImpl(@dl.d kotlin.coroutines.c<? super R> cVar) {
        this.instance = new SelectInstance<>(cVar);
    }

    @dl.d
    public final ArrayList<yh.a<b2>> a() {
        return this.clauses;
    }

    @dl.d
    public final SelectInstance<R> b() {
        return this.instance;
    }

    @r0
    public final void c(@dl.d Throwable th2) throws Throwable {
        this.instance.x0(th2);
    }

    @r0
    @dl.e
    public final Object d() throws Throwable {
        if (!this.instance.o()) {
            try {
                Collections.shuffle(this.clauses);
                Iterator<T> it = this.clauses.iterator();
                while (it.hasNext()) {
                    ((yh.a) it.next()).invoke();
                }
            } catch (Throwable th2) {
                this.instance.x0(th2);
            }
        }
        return this.instance.w0();
    }

    @Override // kotlinx.coroutines.selects.a
    public void f(@dl.d final c cVar, @dl.d final l<? super kotlin.coroutines.c<? super R>, ? extends Object> lVar) {
        this.clauses.add(new yh.a<b2>() { // from class: kotlinx.coroutines.selects.UnbiasedSelectBuilderImpl$invoke$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
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
                cVar.w(this.b(), lVar);
            }
        });
    }

    @Override // kotlinx.coroutines.selects.a
    public <Q> void h(@dl.d final d<? extends Q> dVar, @dl.d final p<? super Q, ? super kotlin.coroutines.c<? super R>, ? extends Object> pVar) {
        this.clauses.add(new yh.a<b2>() { // from class: kotlinx.coroutines.selects.UnbiasedSelectBuilderImpl$invoke$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
            }

            @Override // yh.a
            public /* bridge */ /* synthetic */ b2 invoke() {
                invoke2();
                return b2.f124493a;
            }

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
            /*  JADX ERROR: JadxRuntimeException in pass: FinishTypeInference
                jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r1v2 boolean
                	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
                	at jadx.core.dex.visitors.typeinference.FinishTypeInference.lambda$visit$0(FinishTypeInference.java:27)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                	at jadx.core.dex.visitors.typeinference.FinishTypeInference.visit(FinishTypeInference.java:22)
                */
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                /*
                    r3 = this;
                    kotlinx.coroutines.selects.d<Q> r0 = r1
                    kotlinx.coroutines.selects.UnbiasedSelectBuilderImpl<R> r1 = r2
                    kotlinx.coroutines.selects.b r1 = r1.b()
                    yh.p<Q, kotlin.coroutines.c<? super R>, java.lang.Object> r2 = r3
                    r0.F(r1, r2)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.selects.UnbiasedSelectBuilderImpl$invoke$2.invoke2():void");
            }
        });
    }

    @Override // kotlinx.coroutines.selects.a
    public <P, Q> void k(@dl.d e<? super P, ? extends Q> eVar, @dl.d p<? super Q, ? super kotlin.coroutines.c<? super R>, ? extends Object> pVar) {
        a.C1192a.a(this, eVar, pVar);
    }

    @Override // kotlinx.coroutines.selects.a
    public <P, Q> void l(@dl.d final e<? super P, ? extends Q> eVar, final P p10, @dl.d final p<? super Q, ? super kotlin.coroutines.c<? super R>, ? extends Object> pVar) {
        this.clauses.add(new yh.a<b2>() { // from class: kotlinx.coroutines.selects.UnbiasedSelectBuilderImpl$invoke$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
            }

            @Override // yh.a
            public /* bridge */ /* synthetic */ b2 invoke() {
                invoke2();
                return b2.f124493a;
            }

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
            /*  JADX ERROR: JadxRuntimeException in pass: FinishTypeInference
                jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r1v2 boolean
                	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
                	at jadx.core.dex.visitors.typeinference.FinishTypeInference.lambda$visit$0(FinishTypeInference.java:27)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                	at jadx.core.dex.visitors.typeinference.FinishTypeInference.visit(FinishTypeInference.java:22)
                */
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                /*
                    r4 = this;
                    kotlinx.coroutines.selects.e<P, Q> r0 = r1
                    kotlinx.coroutines.selects.UnbiasedSelectBuilderImpl<R> r1 = r2
                    kotlinx.coroutines.selects.b r1 = r1.b()
                    P r2 = r3
                    yh.p<Q, kotlin.coroutines.c<? super R>, java.lang.Object> r3 = r4
                    r0.N(r1, r2, r3)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.selects.UnbiasedSelectBuilderImpl$invoke$3.invoke2():void");
            }
        });
    }

    @Override // kotlinx.coroutines.selects.a
    public void t(final long timeMillis, @dl.d final l<? super kotlin.coroutines.c<? super R>, ? extends Object> block) {
        this.clauses.add(new yh.a<b2>(this) { // from class: kotlinx.coroutines.selects.UnbiasedSelectBuilderImpl$onTimeout$1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ UnbiasedSelectBuilderImpl<R> f130413b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
                this.f130413b = this;
            }

            @Override // yh.a
            public /* bridge */ /* synthetic */ b2 invoke() {
                invoke2();
                return b2.f124493a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.f130413b.b().t(timeMillis, block);
            }
        });
    }
}
