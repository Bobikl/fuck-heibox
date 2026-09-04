package kotlinx.coroutines.flow;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.collections.h0;
import kotlin.coroutines.CoroutineContext;
import kotlin.l0;
import kotlin.r0;
import kotlin.s0;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.ReceiveChannel;
import kotlinx.coroutines.d2;
import kotlinx.coroutines.q0;
import kotlinx.coroutines.t1;
import kotlinx.coroutines.u1;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"kotlinx/coroutines/flow/FlowKt__BuildersKt", "kotlinx/coroutines/flow/FlowKt__ChannelsKt", "kotlinx/coroutines/flow/FlowKt__CollectKt", "kotlinx/coroutines/flow/FlowKt__CollectionKt", "kotlinx/coroutines/flow/h", "kotlinx/coroutines/flow/FlowKt__CountKt", "kotlinx/coroutines/flow/FlowKt__DelayKt", "kotlinx/coroutines/flow/FlowKt__DistinctKt", "kotlinx/coroutines/flow/FlowKt__EmittersKt", "kotlinx/coroutines/flow/FlowKt__ErrorsKt", "kotlinx/coroutines/flow/FlowKt__LimitKt", "kotlinx/coroutines/flow/FlowKt__MergeKt", "kotlinx/coroutines/flow/FlowKt__MigrationKt", "kotlinx/coroutines/flow/FlowKt__ReduceKt", "kotlinx/coroutines/flow/FlowKt__ShareKt", "kotlinx/coroutines/flow/FlowKt__TransformKt", "kotlinx/coroutines/flow/FlowKt__ZipKt"}, d2 = {}, k = 4, mv = {1, 6, 0})
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final String f129935a = "kotlinx.coroutines.flow.defaultConcurrency";

    @dl.e
    public static final <T> Object A(@dl.d e<? extends T> eVar, @dl.d yh.p<? super T, ? super kotlin.coroutines.c<? super b2>, ? extends Object> pVar, @dl.d kotlin.coroutines.c<? super b2> cVar) {
        return FlowKt__CollectKt.f(eVar, pVar, cVar);
    }

    @dl.d
    @u1
    public static final <T, R> e<R> A0(@dl.d e<? extends T> eVar, @dl.d yh.p<? super T, ? super kotlin.coroutines.c<? super e<? extends R>>, ? extends Object> pVar) {
        return FlowKt__MergeKt.a(eVar, pVar);
    }

    @dl.d
    @u1
    public static final <T> e<T> A1(@dl.d e<? extends T> eVar, long j10) {
        return FlowKt__DelayKt.h(eVar, j10);
    }

    @dl.e
    public static final <T> Object B(@dl.d e<? extends T> eVar, @dl.d yh.p<? super T, ? super kotlin.coroutines.c<? super Boolean>, ? extends Object> pVar, @dl.d kotlin.coroutines.c<? super b2> cVar) {
        return FlowKt__LimitKt.b(eVar, pVar, cVar);
    }

    @dl.d
    @t1
    public static final <T, R> e<R> B0(@dl.d e<? extends T> eVar, @kotlin.b @dl.d yh.p<? super T, ? super kotlin.coroutines.c<? super e<? extends R>>, ? extends Object> pVar) {
        return FlowKt__MergeKt.b(eVar, pVar);
    }

    @dl.d
    @u1
    public static final <T> e<T> B1(@dl.d e<? extends T> eVar, long j10) {
        return FlowKt__DelayKt.i(eVar, j10);
    }

    @dl.d
    @u1
    public static final <T, R> e<R> C0(@dl.d e<? extends T> eVar, int i10, @dl.d yh.p<? super T, ? super kotlin.coroutines.c<? super e<? extends R>>, ? extends Object> pVar) {
        return FlowKt__MergeKt.c(eVar, i10, pVar);
    }

    @dl.d
    public static final <T, R> e<R> C1(@dl.d e<? extends T> eVar, R r10, @kotlin.b @dl.d yh.q<? super R, ? super T, ? super kotlin.coroutines.c<? super R>, ? extends Object> qVar) {
        return FlowKt__TransformKt.j(eVar, r10, qVar);
    }

    @dl.d
    public static final <T1, T2, T3, T4, T5, R> e<R> D(@dl.d e<? extends T1> eVar, @dl.d e<? extends T2> eVar2, @dl.d e<? extends T3> eVar3, @dl.d e<? extends T4> eVar4, @dl.d e<? extends T5> eVar5, @dl.d yh.t<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super kotlin.coroutines.c<? super R>, ? extends Object> tVar) {
        return FlowKt__ZipKt.c(eVar, eVar2, eVar3, eVar4, eVar5, tVar);
    }

    @dl.d
    @kotlin.k(level = DeprecationLevel.ERROR, message = "Flow has less verbose 'scan' shortcut", replaceWith = @s0(expression = "scan(initial, operation)", imports = {}))
    public static final <T, R> e<R> D1(@dl.d e<? extends T> eVar, R r10, @kotlin.b @dl.d yh.q<? super R, ? super T, ? super kotlin.coroutines.c<? super R>, ? extends Object> qVar) {
        return FlowKt__MigrationKt.B(eVar, r10, qVar);
    }

    @dl.d
    public static final <T1, T2, T3, T4, R> e<R> E(@dl.d e<? extends T1> eVar, @dl.d e<? extends T2> eVar2, @dl.d e<? extends T3> eVar3, @dl.d e<? extends T4> eVar4, @dl.d yh.s<? super T1, ? super T2, ? super T3, ? super T4, ? super kotlin.coroutines.c<? super R>, ? extends Object> sVar) {
        return FlowKt__ZipKt.d(eVar, eVar2, eVar3, eVar4, sVar);
    }

    @dl.d
    @kotlin.k(level = DeprecationLevel.ERROR, message = "Flow analogue of 'flatten' is 'flattenConcat'", replaceWith = @s0(expression = "flattenConcat()", imports = {}))
    public static final <T> e<T> E0(@dl.d e<? extends e<? extends T>> eVar) {
        return FlowKt__MigrationKt.m(eVar);
    }

    @dl.d
    @kotlin.k(level = DeprecationLevel.ERROR, message = "'scanReduce' was renamed to 'runningReduce' to be consistent with Kotlin standard library", replaceWith = @s0(expression = "runningReduce(operation)", imports = {}))
    public static final <T> e<T> E1(@dl.d e<? extends T> eVar, @dl.d yh.q<? super T, ? super T, ? super kotlin.coroutines.c<? super T>, ? extends Object> qVar) {
        return FlowKt__MigrationKt.C(eVar, qVar);
    }

    @dl.d
    public static final <T1, T2, T3, R> e<R> F(@dl.d e<? extends T1> eVar, @dl.d e<? extends T2> eVar2, @dl.d e<? extends T3> eVar3, @kotlin.b @dl.d yh.r<? super T1, ? super T2, ? super T3, ? super kotlin.coroutines.c<? super R>, ? extends Object> rVar) {
        return FlowKt__ZipKt.e(eVar, eVar2, eVar3, rVar);
    }

    @dl.d
    @u1
    public static final <T> e<T> F0(@dl.d e<? extends e<? extends T>> eVar) {
        return FlowKt__MergeKt.e(eVar);
    }

    @dl.d
    public static final <T> n<T> F1(@dl.d e<? extends T> eVar, @dl.d q0 q0Var, @dl.d r rVar, int i10) {
        return FlowKt__ShareKt.g(eVar, q0Var, rVar, i10);
    }

    @dl.d
    public static final <T1, T2, R> e<R> G(@dl.d e<? extends T1> eVar, @dl.d e<? extends T2> eVar2, @dl.d yh.q<? super T1, ? super T2, ? super kotlin.coroutines.c<? super R>, ? extends Object> qVar) {
        return FlowKt__ZipKt.f(eVar, eVar2, qVar);
    }

    @dl.d
    @u1
    public static final <T> e<T> G0(@dl.d e<? extends e<? extends T>> eVar, int i10) {
        return FlowKt__MergeKt.f(eVar, i10);
    }

    @dl.e
    public static final <T> Object H1(@dl.d e<? extends T> eVar, @dl.d kotlin.coroutines.c<? super T> cVar) {
        return FlowKt__ReduceKt.j(eVar, cVar);
    }

    @dl.d
    @kotlin.k(level = DeprecationLevel.ERROR, message = "Flow analogue of 'combineLatest' is 'combine'", replaceWith = @s0(expression = "combine(this, other, other2, other3, transform)", imports = {}))
    public static final <T1, T2, T3, T4, T5, R> e<R> I(@dl.d e<? extends T1> eVar, @dl.d e<? extends T2> eVar2, @dl.d e<? extends T3> eVar3, @dl.d e<? extends T4> eVar4, @dl.d e<? extends T5> eVar5, @dl.d yh.t<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super kotlin.coroutines.c<? super R>, ? extends Object> tVar) {
        return FlowKt__MigrationKt.b(eVar, eVar2, eVar3, eVar4, eVar5, tVar);
    }

    @dl.d
    public static final <T> e<T> I0(@kotlin.b @dl.d yh.p<? super f<? super T>, ? super kotlin.coroutines.c<? super b2>, ? extends Object> pVar) {
        return FlowKt__BuildersKt.n(pVar);
    }

    @dl.e
    public static final <T> Object I1(@dl.d e<? extends T> eVar, @dl.d kotlin.coroutines.c<? super T> cVar) {
        return FlowKt__ReduceKt.k(eVar, cVar);
    }

    @dl.d
    @kotlin.k(level = DeprecationLevel.ERROR, message = "Flow analogue of 'combineLatest' is 'combine'", replaceWith = @s0(expression = "combine(this, other, other2, other3, transform)", imports = {}))
    public static final <T1, T2, T3, T4, R> e<R> J(@dl.d e<? extends T1> eVar, @dl.d e<? extends T2> eVar2, @dl.d e<? extends T3> eVar3, @dl.d e<? extends T4> eVar4, @dl.d yh.s<? super T1, ? super T2, ? super T3, ? super T4, ? super kotlin.coroutines.c<? super R>, ? extends Object> sVar) {
        return FlowKt__MigrationKt.c(eVar, eVar2, eVar3, eVar4, sVar);
    }

    @dl.d
    @xh.h(name = "flowCombine")
    public static final <T1, T2, R> e<R> J0(@dl.d e<? extends T1> eVar, @dl.d e<? extends T2> eVar2, @dl.d yh.q<? super T1, ? super T2, ? super kotlin.coroutines.c<? super R>, ? extends Object> qVar) {
        return FlowKt__ZipKt.p(eVar, eVar2, qVar);
    }

    @dl.d
    @kotlin.k(level = DeprecationLevel.ERROR, message = "Flow analogue of 'skip' is 'drop'", replaceWith = @s0(expression = "drop(count)", imports = {}))
    public static final <T> e<T> J1(@dl.d e<? extends T> eVar, int i10) {
        return FlowKt__MigrationKt.D(eVar, i10);
    }

    @dl.d
    @kotlin.k(level = DeprecationLevel.ERROR, message = "Flow analogue of 'combineLatest' is 'combine'", replaceWith = @s0(expression = "combine(this, other, other2, transform)", imports = {}))
    public static final <T1, T2, T3, R> e<R> K(@dl.d e<? extends T1> eVar, @dl.d e<? extends T2> eVar2, @dl.d e<? extends T3> eVar3, @dl.d yh.r<? super T1, ? super T2, ? super T3, ? super kotlin.coroutines.c<? super R>, ? extends Object> rVar) {
        return FlowKt__MigrationKt.d(eVar, eVar2, eVar3, rVar);
    }

    @dl.d
    @xh.h(name = "flowCombineTransform")
    public static final <T1, T2, R> e<R> K0(@dl.d e<? extends T1> eVar, @dl.d e<? extends T2> eVar2, @kotlin.b @dl.d yh.r<? super f<? super R>, ? super T1, ? super T2, ? super kotlin.coroutines.c<? super b2>, ? extends Object> rVar) {
        return FlowKt__ZipKt.q(eVar, eVar2, rVar);
    }

    @dl.d
    @kotlin.k(level = DeprecationLevel.ERROR, message = "Flow analogue of 'startWith' is 'onStart'. Use 'onStart { emit(value) }'", replaceWith = @s0(expression = "onStart { emit(value) }", imports = {}))
    public static final <T> e<T> K1(@dl.d e<? extends T> eVar, T t10) {
        return FlowKt__MigrationKt.E(eVar, t10);
    }

    @dl.d
    @kotlin.k(level = DeprecationLevel.ERROR, message = "Flow analogue of 'combineLatest' is 'combine'", replaceWith = @s0(expression = "this.combine(other, transform)", imports = {}))
    public static final <T1, T2, R> e<R> L(@dl.d e<? extends T1> eVar, @dl.d e<? extends T2> eVar2, @dl.d yh.q<? super T1, ? super T2, ? super kotlin.coroutines.c<? super R>, ? extends Object> qVar) {
        return FlowKt__MigrationKt.e(eVar, eVar2, qVar);
    }

    @dl.d
    public static final <T> e<T> L0(T t10) {
        return FlowKt__BuildersKt.o(t10);
    }

    @dl.d
    @kotlin.k(level = DeprecationLevel.ERROR, message = "Flow analogue of 'startWith' is 'onStart'. Use 'onStart { emitAll(other) }'", replaceWith = @s0(expression = "onStart { emitAll(other) }", imports = {}))
    public static final <T> e<T> L1(@dl.d e<? extends T> eVar, @dl.d e<? extends T> eVar2) {
        return FlowKt__MigrationKt.F(eVar, eVar2);
    }

    @dl.d
    public static final <T> e<T> M0(@dl.d T... tArr) {
        return FlowKt__BuildersKt.p(tArr);
    }

    @dl.e
    public static final <T> Object M1(@dl.d e<? extends T> eVar, @dl.d q0 q0Var, @dl.d kotlin.coroutines.c<? super u<? extends T>> cVar) {
        return FlowKt__ShareKt.i(eVar, q0Var, cVar);
    }

    @dl.d
    public static final <T1, T2, T3, T4, T5, R> e<R> N(@dl.d e<? extends T1> eVar, @dl.d e<? extends T2> eVar2, @dl.d e<? extends T3> eVar3, @dl.d e<? extends T4> eVar4, @dl.d e<? extends T5> eVar5, @kotlin.b @dl.d yh.u<? super f<? super R>, ? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super kotlin.coroutines.c<? super b2>, ? extends Object> uVar) {
        return FlowKt__ZipKt.i(eVar, eVar2, eVar3, eVar4, eVar5, uVar);
    }

    @dl.d
    public static final <T> e<T> N0(@dl.d e<? extends T> eVar, @dl.d CoroutineContext coroutineContext) {
        return h.h(eVar, coroutineContext);
    }

    @dl.d
    public static final <T> u<T> N1(@dl.d e<? extends T> eVar, @dl.d q0 q0Var, @dl.d r rVar, T t10) {
        return FlowKt__ShareKt.j(eVar, q0Var, rVar, t10);
    }

    @dl.d
    public static final <T1, T2, T3, T4, R> e<R> O(@dl.d e<? extends T1> eVar, @dl.d e<? extends T2> eVar2, @dl.d e<? extends T3> eVar3, @dl.d e<? extends T4> eVar4, @kotlin.b @dl.d yh.t<? super f<? super R>, ? super T1, ? super T2, ? super T3, ? super T4, ? super kotlin.coroutines.c<? super b2>, ? extends Object> tVar) {
        return FlowKt__ZipKt.j(eVar, eVar2, eVar3, eVar4, tVar);
    }

    @dl.e
    public static final <T, R> Object O0(@dl.d e<? extends T> eVar, R r10, @dl.d yh.q<? super R, ? super T, ? super kotlin.coroutines.c<? super R>, ? extends Object> qVar, @dl.d kotlin.coroutines.c<? super R> cVar) {
        return FlowKt__ReduceKt.e(eVar, r10, qVar, cVar);
    }

    @kotlin.k(level = DeprecationLevel.ERROR, message = "Use 'launchIn' with 'onEach', 'onCompletion' and 'catch' instead")
    public static final <T> void O1(@dl.d e<? extends T> eVar) {
        FlowKt__MigrationKt.G(eVar);
    }

    @dl.d
    public static final <T1, T2, T3, R> e<R> P(@dl.d e<? extends T1> eVar, @dl.d e<? extends T2> eVar2, @dl.d e<? extends T3> eVar3, @kotlin.b @dl.d yh.s<? super f<? super R>, ? super T1, ? super T2, ? super T3, ? super kotlin.coroutines.c<? super b2>, ? extends Object> sVar) {
        return FlowKt__ZipKt.k(eVar, eVar2, eVar3, sVar);
    }

    @kotlin.k(level = DeprecationLevel.ERROR, message = "Flow analogue of 'forEach' is 'collect'", replaceWith = @s0(expression = "collect(action)", imports = {}))
    public static final <T> void P0(@dl.d e<? extends T> eVar, @dl.d yh.p<? super T, ? super kotlin.coroutines.c<? super b2>, ? extends Object> pVar) {
        FlowKt__MigrationKt.n(eVar, pVar);
    }

    @kotlin.k(level = DeprecationLevel.ERROR, message = "Use 'launchIn' with 'onEach', 'onCompletion' and 'catch' instead")
    public static final <T> void P1(@dl.d e<? extends T> eVar, @dl.d yh.p<? super T, ? super kotlin.coroutines.c<? super b2>, ? extends Object> pVar) {
        FlowKt__MigrationKt.H(eVar, pVar);
    }

    @dl.d
    public static final <T1, T2, R> e<R> Q(@dl.d e<? extends T1> eVar, @dl.d e<? extends T2> eVar2, @kotlin.b @dl.d yh.r<? super f<? super R>, ? super T1, ? super T2, ? super kotlin.coroutines.c<? super b2>, ? extends Object> rVar) {
        return FlowKt__ZipKt.l(eVar, eVar2, rVar);
    }

    public static final int Q0() {
        return FlowKt__MergeKt.h();
    }

    @kotlin.k(level = DeprecationLevel.ERROR, message = "Use 'launchIn' with 'onEach', 'onCompletion' and 'catch' instead")
    public static final <T> void Q1(@dl.d e<? extends T> eVar, @dl.d yh.p<? super T, ? super kotlin.coroutines.c<? super b2>, ? extends Object> pVar, @dl.d yh.p<? super Throwable, ? super kotlin.coroutines.c<? super b2>, ? extends Object> pVar2) {
        FlowKt__MigrationKt.I(eVar, pVar, pVar2);
    }

    @dl.d
    @kotlin.k(level = DeprecationLevel.ERROR, message = "Use 'flowOn' instead")
    public static final <T> e<T> R1(@dl.d e<? extends T> eVar, @dl.d CoroutineContext coroutineContext) {
        return FlowKt__MigrationKt.J(eVar, coroutineContext);
    }

    @dl.d
    @kotlin.k(level = DeprecationLevel.ERROR, message = "Flow analogue of 'compose' is 'let'", replaceWith = @s0(expression = "let(transformer)", imports = {}))
    public static final <T, R> e<R> S(@dl.d e<? extends T> eVar, @dl.d yh.l<? super e<? extends T>, ? extends e<? extends R>> lVar) {
        return FlowKt__MigrationKt.f(eVar, lVar);
    }

    @dl.e
    public static final <T> Object S0(@dl.d e<? extends T> eVar, @dl.d kotlin.coroutines.c<? super T> cVar) {
        return FlowKt__ReduceKt.g(eVar, cVar);
    }

    @dl.d
    @kotlin.k(level = DeprecationLevel.ERROR, message = "Flow analogues of 'switchMap' are 'transformLatest', 'flatMapLatest' and 'mapLatest'", replaceWith = @s0(expression = "this.flatMapLatest(transform)", imports = {}))
    public static final <T, R> e<R> S1(@dl.d e<? extends T> eVar, @dl.d yh.p<? super T, ? super kotlin.coroutines.c<? super e<? extends R>>, ? extends Object> pVar) {
        return FlowKt__MigrationKt.K(eVar, pVar);
    }

    @dl.d
    @kotlin.k(level = DeprecationLevel.ERROR, message = "Flow analogue of 'concatMap' is 'flatMapConcat'", replaceWith = @s0(expression = "flatMapConcat(mapper)", imports = {}))
    public static final <T, R> e<R> T(@dl.d e<? extends T> eVar, @dl.d yh.l<? super T, ? extends e<? extends R>> lVar) {
        return FlowKt__MigrationKt.g(eVar, lVar);
    }

    @dl.e
    public static final <T> Object T0(@dl.d e<? extends T> eVar, @dl.d kotlin.coroutines.c<? super T> cVar) {
        return FlowKt__ReduceKt.h(eVar, cVar);
    }

    @dl.d
    public static final <T> e<T> T1(@dl.d e<? extends T> eVar, int i10) {
        return FlowKt__LimitKt.g(eVar, i10);
    }

    @dl.d
    @kotlin.k(level = DeprecationLevel.ERROR, message = "Flow analogue of 'concatWith' is 'onCompletion'. Use 'onCompletion { emit(value) }'", replaceWith = @s0(expression = "onCompletion { emit(value) }", imports = {}))
    public static final <T> e<T> U(@dl.d e<? extends T> eVar, T t10) {
        return FlowKt__MigrationKt.h(eVar, t10);
    }

    @dl.d
    public static final <T> d2 U0(@dl.d e<? extends T> eVar, @dl.d q0 q0Var) {
        return FlowKt__CollectKt.h(eVar, q0Var);
    }

    @dl.d
    public static final <T> e<T> U1(@dl.d e<? extends T> eVar, @dl.d yh.p<? super T, ? super kotlin.coroutines.c<? super Boolean>, ? extends Object> pVar) {
        return FlowKt__LimitKt.h(eVar, pVar);
    }

    @dl.d
    @kotlin.k(level = DeprecationLevel.ERROR, message = "Flow analogue of 'concatWith' is 'onCompletion'. Use 'onCompletion { if (it == null) emitAll(other) }'", replaceWith = @s0(expression = "onCompletion { if (it == null) emitAll(other) }", imports = {}))
    public static final <T> e<T> V(@dl.d e<? extends T> eVar, @dl.d e<? extends T> eVar2) {
        return FlowKt__MigrationKt.i(eVar, eVar2);
    }

    @dl.d
    public static final <T, R> e<R> V0(@dl.d e<? extends T> eVar, @dl.d yh.p<? super T, ? super kotlin.coroutines.c<? super R>, ? extends Object> pVar) {
        return FlowKt__TransformKt.e(eVar, pVar);
    }

    @dl.e
    public static final <T, C extends Collection<? super T>> Object V1(@dl.d e<? extends T> eVar, @dl.d C c10, @dl.d kotlin.coroutines.c<? super C> cVar) {
        return FlowKt__CollectionKt.a(eVar, c10, cVar);
    }

    @dl.d
    public static final <T> e<T> W(@dl.d e<? extends T> eVar) {
        return h.g(eVar);
    }

    @dl.d
    @t1
    public static final <T, R> e<R> W0(@dl.d e<? extends T> eVar, @kotlin.b @dl.d yh.p<? super T, ? super kotlin.coroutines.c<? super R>, ? extends Object> pVar) {
        return FlowKt__MergeKt.k(eVar, pVar);
    }

    @dl.e
    public static final <T> Object W1(@dl.d e<? extends T> eVar, @dl.d List<T> list, @dl.d kotlin.coroutines.c<? super List<? extends T>> cVar) {
        return FlowKt__CollectionKt.b(eVar, list, cVar);
    }

    @dl.d
    public static final <T> e<T> X(@dl.d ReceiveChannel<? extends T> receiveChannel) {
        return FlowKt__ChannelsKt.c(receiveChannel);
    }

    @dl.d
    public static final <T, R> e<R> X0(@dl.d e<? extends T> eVar, @dl.d yh.p<? super T, ? super kotlin.coroutines.c<? super R>, ? extends Object> pVar) {
        return FlowKt__TransformKt.f(eVar, pVar);
    }

    @dl.e
    public static final <T> Object Y(@dl.d e<? extends T> eVar, @dl.d kotlin.coroutines.c<? super Integer> cVar) {
        return FlowKt__CountKt.a(eVar, cVar);
    }

    @dl.d
    public static final <T> e<T> Y0(@dl.d Iterable<? extends e<? extends T>> iterable) {
        return FlowKt__MergeKt.l(iterable);
    }

    @dl.e
    public static final <T> Object Y1(@dl.d e<? extends T> eVar, @dl.d Set<T> set, @dl.d kotlin.coroutines.c<? super Set<? extends T>> cVar) {
        return FlowKt__CollectionKt.d(eVar, set, cVar);
    }

    @dl.e
    public static final <T> Object Z(@dl.d e<? extends T> eVar, @dl.d yh.p<? super T, ? super kotlin.coroutines.c<? super Boolean>, ? extends Object> pVar, @dl.d kotlin.coroutines.c<? super Integer> cVar) {
        return FlowKt__CountKt.b(eVar, pVar, cVar);
    }

    @dl.d
    @kotlin.k(level = DeprecationLevel.ERROR, message = "Flow analogue of 'merge' is 'flattenConcat'", replaceWith = @s0(expression = "flattenConcat()", imports = {}))
    public static final <T> e<T> Z0(@dl.d e<? extends e<? extends T>> eVar) {
        return FlowKt__MigrationKt.o(eVar);
    }

    @dl.d
    public static final e<Integer> a(@dl.d fi.l lVar) {
        return FlowKt__BuildersKt.a(lVar);
    }

    @dl.d
    @u1
    public static final <T> e<T> a0(@dl.d e<? extends T> eVar, long j10) {
        return FlowKt__DelayKt.a(eVar, j10);
    }

    @dl.d
    public static final <T> e<T> a1(@dl.d e<? extends T>... eVarArr) {
        return FlowKt__MergeKt.m(eVarArr);
    }

    @dl.d
    public static final <T, R> e<R> a2(@dl.d e<? extends T> eVar, @kotlin.b @dl.d yh.q<? super f<? super R>, ? super T, ? super kotlin.coroutines.c<? super b2>, ? extends Object> qVar) {
        return FlowKt__EmittersKt.g(eVar, qVar);
    }

    @dl.d
    public static final e<Long> b(@dl.d fi.o oVar) {
        return FlowKt__BuildersKt.b(oVar);
    }

    @dl.d
    @u1
    @l0
    public static final <T> e<T> b0(@dl.d e<? extends T> eVar, @dl.d yh.l<? super T, Long> lVar) {
        return FlowKt__DelayKt.b(eVar, lVar);
    }

    @dl.d
    public static final Void b1() {
        return FlowKt__MigrationKt.p();
    }

    @dl.d
    @t1
    public static final <T, R> e<R> b2(@dl.d e<? extends T> eVar, @kotlin.b @dl.d yh.q<? super f<? super R>, ? super T, ? super kotlin.coroutines.c<? super b2>, ? extends Object> qVar) {
        return FlowKt__MergeKt.n(eVar, qVar);
    }

    @dl.d
    public static final <T> e<T> c(@dl.d Iterable<? extends T> iterable) {
        return FlowKt__BuildersKt.c(iterable);
    }

    @dl.d
    @u1
    public static final <T> e<T> c0(@dl.d e<? extends T> eVar, long j10) {
        return FlowKt__DelayKt.c(eVar, j10);
    }

    @dl.d
    @kotlin.k(level = DeprecationLevel.ERROR, message = "Collect flow in the desired context instead")
    public static final <T> e<T> c1(@dl.d e<? extends T> eVar, @dl.d CoroutineContext coroutineContext) {
        return FlowKt__MigrationKt.q(eVar, coroutineContext);
    }

    @dl.d
    public static final <T, R> e<R> c2(@dl.d e<? extends T> eVar, @kotlin.b @dl.d yh.q<? super f<? super R>, ? super T, ? super kotlin.coroutines.c<? super Boolean>, ? extends Object> qVar) {
        return FlowKt__LimitKt.i(eVar, qVar);
    }

    @dl.d
    public static final <T> e<T> d(@dl.d Iterator<? extends T> it) {
        return FlowKt__BuildersKt.d(it);
    }

    @dl.d
    @u1
    @l0
    @xh.h(name = "debounceDuration")
    public static final <T> e<T> d0(@dl.d e<? extends T> eVar, @dl.d yh.l<? super T, kotlin.time.e> lVar) {
        return FlowKt__DelayKt.d(eVar, lVar);
    }

    @dl.d
    public static final <T> e<T> d1(@dl.d e<? extends T> eVar, @dl.d yh.q<? super f<? super T>, ? super Throwable, ? super kotlin.coroutines.c<? super b2>, ? extends Object> qVar) {
        return FlowKt__EmittersKt.d(eVar, qVar);
    }

    @dl.d
    @r0
    public static final <T, R> e<R> d2(@dl.d e<? extends T> eVar, @kotlin.b @dl.d yh.q<? super f<? super R>, ? super T, ? super kotlin.coroutines.c<? super b2>, ? extends Object> qVar) {
        return FlowKt__EmittersKt.h(eVar, qVar);
    }

    @dl.d
    public static final <T> e<T> e(@dl.d kotlin.sequences.m<? extends T> mVar) {
        return FlowKt__BuildersKt.e(mVar);
    }

    @dl.d
    @kotlin.k(level = DeprecationLevel.ERROR, message = "Use 'onEach { delay(timeMillis) }'", replaceWith = @s0(expression = "onEach { delay(timeMillis) }", imports = {}))
    public static final <T> e<T> e0(@dl.d e<? extends T> eVar, long j10) {
        return FlowKt__MigrationKt.j(eVar, j10);
    }

    @dl.d
    public static final <T> e<T> e1(@dl.d e<? extends T> eVar, @dl.d yh.p<? super T, ? super kotlin.coroutines.c<? super b2>, ? extends Object> pVar) {
        return FlowKt__TransformKt.g(eVar, pVar);
    }

    @dl.d
    public static final <T> e<h0<T>> e2(@dl.d e<? extends T> eVar) {
        return FlowKt__TransformKt.k(eVar);
    }

    @dl.d
    @kotlin.k(level = DeprecationLevel.WARNING, message = "'BroadcastChannel' is obsolete and all corresponding operators are deprecated in the favour of StateFlow and SharedFlow")
    public static final <T> e<T> f(@dl.d kotlinx.coroutines.channels.h<T> hVar) {
        return FlowKt__ChannelsKt.b(hVar);
    }

    @dl.d
    @kotlin.k(level = DeprecationLevel.ERROR, message = "Use 'onStart { delay(timeMillis) }'", replaceWith = @s0(expression = "onStart { delay(timeMillis) }", imports = {}))
    public static final <T> e<T> f0(@dl.d e<? extends T> eVar, long j10) {
        return FlowKt__MigrationKt.k(eVar, j10);
    }

    @dl.d
    public static final <T> e<T> f1(@dl.d e<? extends T> eVar, @dl.d yh.p<? super f<? super T>, ? super kotlin.coroutines.c<? super b2>, ? extends Object> pVar) {
        return FlowKt__EmittersKt.e(eVar, pVar);
    }

    @dl.d
    public static final <T1, T2, R> e<R> f2(@dl.d e<? extends T1> eVar, @dl.d e<? extends T2> eVar2, @dl.d yh.q<? super T1, ? super T2, ? super kotlin.coroutines.c<? super R>, ? extends Object> qVar) {
        return FlowKt__ZipKt.s(eVar, eVar2, qVar);
    }

    @dl.d
    @u1
    public static final <T> e<T> g(@dl.d yh.a<? extends T> aVar) {
        return FlowKt__BuildersKt.f(aVar);
    }

    @dl.d
    public static final <T> e<T> g0(@dl.d e<? extends T> eVar) {
        return FlowKt__DistinctKt.a(eVar);
    }

    @dl.d
    @kotlin.k(level = DeprecationLevel.ERROR, message = "Flow analogue of 'onErrorXxx' is 'catch'. Use 'catch { emitAll(fallback) }'", replaceWith = @s0(expression = "catch { emitAll(fallback) }", imports = {}))
    public static final <T> e<T> g1(@dl.d e<? extends T> eVar, @dl.d e<? extends T> eVar2) {
        return FlowKt__MigrationKt.r(eVar, eVar2);
    }

    @dl.d
    @u1
    public static final <T> e<T> h(@dl.d yh.l<? super kotlin.coroutines.c<? super T>, ? extends Object> lVar) {
        return FlowKt__BuildersKt.g(lVar);
    }

    @dl.d
    public static final <T> e<T> h0(@dl.d e<? extends T> eVar, @dl.d yh.p<? super T, ? super T, Boolean> pVar) {
        return FlowKt__DistinctKt.b(eVar, pVar);
    }

    @dl.d
    @kotlin.k(level = DeprecationLevel.ERROR, message = "Flow analogue of 'onErrorXxx' is 'catch'. Use 'catch { emitAll(fallback) }'", replaceWith = @s0(expression = "catch { emitAll(fallback) }", imports = {}))
    public static final <T> e<T> h1(@dl.d e<? extends T> eVar, @dl.d e<? extends T> eVar2) {
        return FlowKt__MigrationKt.s(eVar, eVar2);
    }

    @dl.d
    public static final e<Integer> i(@dl.d int[] iArr) {
        return FlowKt__BuildersKt.h(iArr);
    }

    @dl.d
    public static final <T, K> e<T> i0(@dl.d e<? extends T> eVar, @dl.d yh.l<? super T, ? extends K> lVar) {
        return FlowKt__DistinctKt.c(eVar, lVar);
    }

    @dl.d
    @kotlin.k(level = DeprecationLevel.ERROR, message = "Flow analogue of 'onErrorXxx' is 'catch'. Use 'catch { emit(fallback) }'", replaceWith = @s0(expression = "catch { emit(fallback) }", imports = {}))
    public static final <T> e<T> i1(@dl.d e<? extends T> eVar, T t10) {
        return FlowKt__MigrationKt.t(eVar, t10);
    }

    @dl.d
    public static final e<Long> j(@dl.d long[] jArr) {
        return FlowKt__BuildersKt.i(jArr);
    }

    @dl.d
    public static final <T> e<T> j0(@dl.d e<? extends T> eVar, int i10) {
        return FlowKt__LimitKt.d(eVar, i10);
    }

    @dl.d
    @kotlin.k(level = DeprecationLevel.ERROR, message = "Flow analogue of 'onErrorXxx' is 'catch'. Use 'catch { e -> if (predicate(e)) emit(fallback) else throw e }'", replaceWith = @s0(expression = "catch { e -> if (predicate(e)) emit(fallback) else throw e }", imports = {}))
    public static final <T> e<T> j1(@dl.d e<? extends T> eVar, T t10, @dl.d yh.l<? super Throwable, Boolean> lVar) {
        return FlowKt__MigrationKt.u(eVar, t10, lVar);
    }

    @dl.d
    public static final <T> e<T> k(@dl.d T[] tArr) {
        return FlowKt__BuildersKt.j(tArr);
    }

    @dl.d
    public static final <T> e<T> k0(@dl.d e<? extends T> eVar, @dl.d yh.p<? super T, ? super kotlin.coroutines.c<? super Boolean>, ? extends Object> pVar) {
        return FlowKt__LimitKt.e(eVar, pVar);
    }

    @dl.d
    public static final <T> n<T> l(@dl.d i<T> iVar) {
        return FlowKt__ShareKt.a(iVar);
    }

    @dl.e
    public static final <T> Object l0(@dl.d f<? super T> fVar, @dl.d ReceiveChannel<? extends T> receiveChannel, @dl.d kotlin.coroutines.c<? super b2> cVar) {
        return FlowKt__ChannelsKt.d(fVar, receiveChannel, cVar);
    }

    @dl.d
    public static final <T> e<T> l1(@dl.d e<? extends T> eVar, @dl.d yh.p<? super f<? super T>, ? super kotlin.coroutines.c<? super b2>, ? extends Object> pVar) {
        return FlowKt__EmittersKt.f(eVar, pVar);
    }

    @dl.d
    public static final <T> u<T> m(@dl.d j<T> jVar) {
        return FlowKt__ShareKt.b(jVar);
    }

    @dl.e
    public static final <T> Object m0(@dl.d f<? super T> fVar, @dl.d e<? extends T> eVar, @dl.d kotlin.coroutines.c<? super b2> cVar) {
        return FlowKt__CollectKt.g(fVar, eVar, cVar);
    }

    @dl.d
    public static final <T> n<T> m1(@dl.d n<? extends T> nVar, @dl.d yh.p<? super f<? super T>, ? super kotlin.coroutines.c<? super b2>, ? extends Object> pVar) {
        return FlowKt__ShareKt.f(nVar, pVar);
    }

    @dl.d
    public static final <T> e<T> n0() {
        return FlowKt__BuildersKt.m();
    }

    @dl.d
    @u1
    public static final <T> ReceiveChannel<T> n1(@dl.d e<? extends T> eVar, @dl.d q0 q0Var) {
        return FlowKt__ChannelsKt.f(eVar, q0Var);
    }

    @dl.d
    public static final <T> e<T> o(@dl.d e<? extends T> eVar, int i10, @dl.d BufferOverflow bufferOverflow) {
        return h.b(eVar, i10, bufferOverflow);
    }

    public static final void o0(@dl.d f<?> fVar) {
        FlowKt__EmittersKt.b(fVar);
    }

    @dl.d
    @kotlin.k(level = DeprecationLevel.ERROR, message = "Flow analogue of 'publish()' is 'shareIn'. \npublish().connect() is the default strategy (no extra call is needed), \npublish().autoConnect() translates to 'started = SharingStared.Lazily' argument, \npublish().refCount() translates to 'started = SharingStared.WhileSubscribed()' argument.", replaceWith = @s0(expression = "this.shareIn(scope, 0)", imports = {}))
    public static final <T> e<T> o1(@dl.d e<? extends T> eVar) {
        return FlowKt__MigrationKt.w(eVar);
    }

    @dl.d
    public static final <T> e<T> p0(@dl.d e<? extends T> eVar, @dl.d yh.p<? super T, ? super kotlin.coroutines.c<? super Boolean>, ? extends Object> pVar) {
        return FlowKt__TransformKt.a(eVar, pVar);
    }

    @dl.d
    @kotlin.k(level = DeprecationLevel.ERROR, message = "Flow analogue of 'publish(bufferSize)' is 'buffer' followed by 'shareIn'. \npublish().connect() is the default strategy (no extra call is needed), \npublish().autoConnect() translates to 'started = SharingStared.Lazily' argument, \npublish().refCount() translates to 'started = SharingStared.WhileSubscribed()' argument.", replaceWith = @s0(expression = "this.buffer(bufferSize).shareIn(scope, 0)", imports = {}))
    public static final <T> e<T> p1(@dl.d e<? extends T> eVar, int i10) {
        return FlowKt__MigrationKt.x(eVar, i10);
    }

    @dl.d
    @kotlin.k(level = DeprecationLevel.ERROR, message = "Collect flow in the desired context instead")
    public static final <T> e<T> q1(@dl.d e<? extends T> eVar, @dl.d CoroutineContext coroutineContext) {
        return FlowKt__MigrationKt.y(eVar, coroutineContext);
    }

    @dl.d
    @kotlin.k(level = DeprecationLevel.ERROR, message = "Flow analogue of 'cache()' is 'shareIn' with unlimited replay and 'started = SharingStared.Lazily' argument'", replaceWith = @s0(expression = "this.shareIn(scope, Int.MAX_VALUE, started = SharingStared.Lazily)", imports = {}))
    public static final <T> e<T> r(@dl.d e<? extends T> eVar) {
        return FlowKt__MigrationKt.a(eVar);
    }

    @dl.d
    public static final <T> e<T> r0(@dl.d e<? extends T> eVar, @dl.d yh.p<? super T, ? super kotlin.coroutines.c<? super Boolean>, ? extends Object> pVar) {
        return FlowKt__TransformKt.c(eVar, pVar);
    }

    @dl.d
    public static final <T> e<T> r1(@dl.d ReceiveChannel<? extends T> receiveChannel) {
        return FlowKt__ChannelsKt.g(receiveChannel);
    }

    @dl.d
    public static final <T> e<T> s(@kotlin.b @dl.d yh.p<? super kotlinx.coroutines.channels.w<? super T>, ? super kotlin.coroutines.c<? super b2>, ? extends Object> pVar) {
        return FlowKt__BuildersKt.k(pVar);
    }

    @dl.d
    public static final <T> e<T> s0(@dl.d e<? extends T> eVar) {
        return FlowKt__TransformKt.d(eVar);
    }

    @dl.e
    public static final <S, T extends S> Object s1(@dl.d e<? extends T> eVar, @dl.d yh.q<? super S, ? super T, ? super kotlin.coroutines.c<? super S>, ? extends Object> qVar, @dl.d kotlin.coroutines.c<? super S> cVar) {
        return FlowKt__ReduceKt.i(eVar, qVar, cVar);
    }

    @dl.d
    public static final <T> e<T> t(@dl.d e<? extends T> eVar) {
        return h.e(eVar);
    }

    @dl.e
    public static final <T> Object t0(@dl.d e<? extends T> eVar, @dl.d kotlin.coroutines.c<? super T> cVar) {
        return FlowKt__ReduceKt.a(eVar, cVar);
    }

    @dl.d
    @kotlin.k(level = DeprecationLevel.ERROR, message = "Flow analogue of 'replay()' is 'shareIn' with unlimited replay. \nreplay().connect() is the default strategy (no extra call is needed), \nreplay().autoConnect() translates to 'started = SharingStared.Lazily' argument, \nreplay().refCount() translates to 'started = SharingStared.WhileSubscribed()' argument.", replaceWith = @s0(expression = "this.shareIn(scope, Int.MAX_VALUE)", imports = {}))
    public static final <T> e<T> t1(@dl.d e<? extends T> eVar) {
        return FlowKt__MigrationKt.z(eVar);
    }

    @dl.d
    public static final <T> e<T> u(@dl.d e<? extends T> eVar, @dl.d yh.q<? super f<? super T>, ? super Throwable, ? super kotlin.coroutines.c<? super b2>, ? extends Object> qVar) {
        return FlowKt__ErrorsKt.a(eVar, qVar);
    }

    @dl.e
    public static final <T> Object u0(@dl.d e<? extends T> eVar, @dl.d yh.p<? super T, ? super kotlin.coroutines.c<? super Boolean>, ? extends Object> pVar, @dl.d kotlin.coroutines.c<? super T> cVar) {
        return FlowKt__ReduceKt.b(eVar, pVar, cVar);
    }

    @dl.d
    @kotlin.k(level = DeprecationLevel.ERROR, message = "Flow analogue of 'replay(bufferSize)' is 'shareIn' with the specified replay parameter. \nreplay().connect() is the default strategy (no extra call is needed), \nreplay().autoConnect() translates to 'started = SharingStared.Lazily' argument, \nreplay().refCount() translates to 'started = SharingStared.WhileSubscribed()' argument.", replaceWith = @s0(expression = "this.shareIn(scope, bufferSize)", imports = {}))
    public static final <T> e<T> u1(@dl.d e<? extends T> eVar, int i10) {
        return FlowKt__MigrationKt.A(eVar, i10);
    }

    @dl.e
    public static final <T> Object v(@dl.d e<? extends T> eVar, @dl.d f<? super T> fVar, @dl.d kotlin.coroutines.c<? super Throwable> cVar) {
        return FlowKt__ErrorsKt.b(eVar, fVar, cVar);
    }

    @dl.e
    public static final <T> Object v0(@dl.d e<? extends T> eVar, @dl.d kotlin.coroutines.c<? super T> cVar) {
        return FlowKt__ReduceKt.c(eVar, cVar);
    }

    @dl.d
    public static final <T> e<T> v1(@dl.d e<? extends T> eVar, long j10, @dl.d yh.p<? super Throwable, ? super kotlin.coroutines.c<? super Boolean>, ? extends Object> pVar) {
        return FlowKt__ErrorsKt.e(eVar, j10, pVar);
    }

    @dl.d
    public static final <T> e<T> w(@kotlin.b @dl.d yh.p<? super kotlinx.coroutines.channels.w<? super T>, ? super kotlin.coroutines.c<? super b2>, ? extends Object> pVar) {
        return FlowKt__BuildersKt.l(pVar);
    }

    @dl.e
    public static final <T> Object w0(@dl.d e<? extends T> eVar, @dl.d yh.p<? super T, ? super kotlin.coroutines.c<? super Boolean>, ? extends Object> pVar, @dl.d kotlin.coroutines.c<? super T> cVar) {
        return FlowKt__ReduceKt.d(eVar, pVar, cVar);
    }

    @dl.e
    public static final Object x(@dl.d e<?> eVar, @dl.d kotlin.coroutines.c<? super b2> cVar) {
        return FlowKt__CollectKt.a(eVar, cVar);
    }

    @dl.d
    public static final ReceiveChannel<b2> x0(@dl.d q0 q0Var, long j10, long j11) {
        return FlowKt__DelayKt.f(q0Var, j10, j11);
    }

    @dl.d
    public static final <T> e<T> x1(@dl.d e<? extends T> eVar, @dl.d yh.r<? super f<? super T>, ? super Throwable, ? super Long, ? super kotlin.coroutines.c<? super Boolean>, ? extends Object> rVar) {
        return FlowKt__ErrorsKt.g(eVar, rVar);
    }

    @dl.d
    public static final <T, R> e<R> y1(@dl.d e<? extends T> eVar, R r10, @kotlin.b @dl.d yh.q<? super R, ? super T, ? super kotlin.coroutines.c<? super R>, ? extends Object> qVar) {
        return FlowKt__TransformKt.h(eVar, r10, qVar);
    }

    @dl.e
    public static final <T> Object z(@dl.d e<? extends T> eVar, @dl.d yh.q<? super Integer, ? super T, ? super kotlin.coroutines.c<? super b2>, ? extends Object> qVar, @dl.d kotlin.coroutines.c<? super b2> cVar) {
        return FlowKt__CollectKt.d(eVar, qVar, cVar);
    }

    @dl.d
    @kotlin.k(level = DeprecationLevel.ERROR, message = "Flow analogue is 'flatMapConcat'", replaceWith = @s0(expression = "flatMapConcat(mapper)", imports = {}))
    public static final <T, R> e<R> z0(@dl.d e<? extends T> eVar, @dl.d yh.p<? super T, ? super kotlin.coroutines.c<? super e<? extends R>>, ? extends Object> pVar) {
        return FlowKt__MigrationKt.l(eVar, pVar);
    }

    @dl.d
    public static final <T> e<T> z1(@dl.d e<? extends T> eVar, @dl.d yh.q<? super T, ? super T, ? super kotlin.coroutines.c<? super T>, ? extends Object> qVar) {
        return FlowKt__TransformKt.i(eVar, qVar);
    }
}
