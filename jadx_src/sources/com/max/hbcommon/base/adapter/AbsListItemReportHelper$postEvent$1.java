package com.max.hbcommon.base.adapter;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.List;
import java.util.Set;
import kotlin.Triple;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.t0;
import kotlinx.coroutines.q0;

/* JADX INFO: compiled from: AbsListItemReportHelper.kt */
/* JADX INFO: loaded from: classes9.dex */
@t0({"SMAP\nAbsListItemReportHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbsListItemReportHelper.kt\ncom/max/hbcommon/base/adapter/AbsListItemReportHelper$postEvent$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,201:1\n1855#2,2:202\n*S KotlinDebug\n*F\n+ 1 AbsListItemReportHelper.kt\ncom/max/hbcommon/base/adapter/AbsListItemReportHelper$postEvent$1\n*L\n105#1:202,2\n*E\n"})
@kotlin.coroutines.jvm.internal.d(c = "com.max.hbcommon.base.adapter.AbsListItemReportHelper$postEvent$1", f = "AbsListItemReportHelper.kt", i = {0, 0}, l = {108, 114}, m = "invokeSuspend", n = {"tripleList", "it"}, s = {"L$0", "L$3"})
public final class AbsListItemReportHelper$postEvent$1 extends SuspendLambda implements yh.p<q0, kotlin.coroutines.c<? super b2>, Object> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Object f66649b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    Object f66650c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    Object f66651d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    Object f66652e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    int f66653f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final /* synthetic */ Set<Triple<R, Event, Integer>> f66654g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final /* synthetic */ AbsListItemReportHelper<L, T, R> f66655h;

    /* JADX INFO: renamed from: com.max.hbcommon.base.adapter.AbsListItemReportHelper$postEvent$1$2, reason: invalid class name */
    /* JADX INFO: compiled from: AbsListItemReportHelper.kt */
    @kotlin.coroutines.jvm.internal.d(c = "com.max.hbcommon.base.adapter.AbsListItemReportHelper$postEvent$1$2", f = "AbsListItemReportHelper.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass2 extends SuspendLambda implements yh.p<q0, kotlin.coroutines.c<? super b2>, Object> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f66660b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ AbsListItemReportHelper<L, T, R> f66661c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ List<Triple<R, Event, Integer>> f66662d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(AbsListItemReportHelper<L, T, R> absListItemReportHelper, List<Triple<R, Event, Integer>> list, kotlin.coroutines.c<? super AnonymousClass2> cVar) {
            super(2, cVar);
            this.f66661c = absListItemReportHelper;
            this.f66662d = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.d
        public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, bb.c.b.bx, new Class[]{Object.class, kotlin.coroutines.c.class}, kotlin.coroutines.c.class);
            return patchProxyResultProxy.isSupported ? (kotlin.coroutines.c) patchProxyResultProxy.result : new AnonymousClass2(this.f66661c, this.f66662d, cVar);
        }

        @Override // yh.p
        public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, kotlin.coroutines.c<? super b2> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, bb.c.b.dx, new Class[]{Object.class, Object.class}, Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
        }

        @dl.e
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(@dl.d q0 q0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, bb.c.b.cx, new Class[]{q0.class, kotlin.coroutines.c.class}, Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((AnonymousClass2) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
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
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.e
        public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, bb.c.b.ax, new Class[]{Object.class}, Object.class);
            if (patchProxyResultProxy.isSupported) {
                return patchProxyResultProxy.result;
            }
            kotlin.coroutines.intrinsics.b.h();
            if (this.f66660b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.t0.n(obj);
            this.f66661c.l(this.f66662d);
            return b2.f124493a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    AbsListItemReportHelper$postEvent$1(Set<? extends Triple<? extends R, ? extends Event, Integer>> set, AbsListItemReportHelper<L, T, R> absListItemReportHelper, kotlin.coroutines.c<? super AbsListItemReportHelper$postEvent$1> cVar) {
        super(2, cVar);
        this.f66654g = set;
        this.f66655h = absListItemReportHelper;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, bb.c.b.Tw, new Class[]{Object.class, kotlin.coroutines.c.class}, kotlin.coroutines.c.class);
        return patchProxyResultProxy.isSupported ? (kotlin.coroutines.c) patchProxyResultProxy.result : new AbsListItemReportHelper$postEvent$1(this.f66654g, this.f66655h, cVar);
    }

    @Override // yh.p
    public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, kotlin.coroutines.c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, bb.c.b.Vw, new Class[]{Object.class, Object.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
    }

    @dl.e
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(@dl.d q0 q0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, bb.c.b.Uw, new Class[]{q0.class, kotlin.coroutines.c.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((AbsListItemReportHelper$postEvent$1) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x006a  */
    /* JADX WARN: Code duplicated, block: B:19:0x008d A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x008b -> B:20:0x008e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final java.lang.Object invokeSuspend(@dl.d java.lang.Object r12) {
        /*
            r11 = this;
            r0 = 1
            java.lang.Object[] r1 = new java.lang.Object[r0]
            r2 = 0
            r1[r2] = r12
            com.meituan.robust.ChangeQuickRedirect r3 = com.max.hbcommon.base.adapter.AbsListItemReportHelper$postEvent$1.changeQuickRedirect
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class<java.lang.Object> r4 = java.lang.Object.class
            r6[r2] = r4
            java.lang.Class<java.lang.Object> r7 = java.lang.Object.class
            r4 = 0
            r5 = 1863(0x747, float:2.61E-42)
            r2 = r11
            com.meituan.robust.PatchProxyResult r1 = com.meituan.robust.PatchProxy.proxy(r1, r2, r3, r4, r5, r6, r7)
            boolean r2 = r1.isSupported
            if (r2 == 0) goto L1f
            java.lang.Object r12 = r1.result
            return r12
        L1f:
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.h()
            int r2 = r11.f66653f
            r3 = 2
            if (r2 == 0) goto L4f
            if (r2 == r0) goto L3a
            if (r2 != r3) goto L32
            kotlin.t0.n(r12)
            r12 = r11
            goto Lae
        L32:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L3a:
            java.lang.Object r2 = r11.f66652e
            kotlin.Triple r2 = (kotlin.Triple) r2
            java.lang.Object r4 = r11.f66651d
            java.util.Iterator r4 = (java.util.Iterator) r4
            java.lang.Object r5 = r11.f66650c
            com.max.hbcommon.base.adapter.AbsListItemReportHelper r5 = (com.max.hbcommon.base.adapter.AbsListItemReportHelper) r5
            java.lang.Object r6 = r11.f66649b
            java.util.List r6 = (java.util.List) r6
            kotlin.t0.n(r12)
            r12 = r11
            goto L8e
        L4f:
            kotlin.t0.n(r12)
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            java.util.Set<kotlin.Triple<R, com.max.hbcommon.base.adapter.Event, java.lang.Integer>> r2 = r11.f66654g
            com.max.hbcommon.base.adapter.AbsListItemReportHelper<L, T, R> r4 = r11.f66655h
            java.util.Iterator r2 = r2.iterator()
            r6 = r12
            r5 = r4
            r12 = r11
            r4 = r2
        L63:
            boolean r2 = r4.hasNext()
            r7 = 0
            if (r2 == 0) goto L92
            java.lang.Object r2 = r4.next()
            kotlin.Triple r2 = (kotlin.Triple) r2
            java.lang.Object r8 = r2.f()
            kotlinx.coroutines.n2 r9 = kotlinx.coroutines.e1.e()
            com.max.hbcommon.base.adapter.AbsListItemReportHelper$postEvent$1$1$1 r10 = new com.max.hbcommon.base.adapter.AbsListItemReportHelper$postEvent$1$1$1
            r10.<init>(r5, r8, r2, r7)
            r12.f66649b = r6
            r12.f66650c = r5
            r12.f66651d = r4
            r12.f66652e = r2
            r12.f66653f = r0
            java.lang.Object r7 = kotlinx.coroutines.i.h(r9, r10, r12)
            if (r7 != r1) goto L8e
            return r1
        L8e:
            r6.add(r2)
            goto L63
        L92:
            kotlinx.coroutines.n2 r0 = kotlinx.coroutines.e1.e()
            com.max.hbcommon.base.adapter.AbsListItemReportHelper$postEvent$1$2 r2 = new com.max.hbcommon.base.adapter.AbsListItemReportHelper$postEvent$1$2
            com.max.hbcommon.base.adapter.AbsListItemReportHelper<L, T, R> r4 = r12.f66655h
            r2.<init>(r4, r6, r7)
            r12.f66649b = r7
            r12.f66650c = r7
            r12.f66651d = r7
            r12.f66652e = r7
            r12.f66653f = r3
            java.lang.Object r0 = kotlinx.coroutines.i.h(r0, r2, r12)
            if (r0 != r1) goto Lae
            return r1
        Lae:
            boolean r0 = com.max.hbcommon.base.adapter.b.a()
            if (r0 == 0) goto Lb9
            com.max.hbcommon.base.adapter.AbsListItemReportHelper<L, T, R> r12 = r12.f66655h
            r12.e()
        Lb9:
            kotlin.b2 r12 = kotlin.b2.f124493a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.max.hbcommon.base.adapter.AbsListItemReportHelper$postEvent$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
