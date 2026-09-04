package androidx.compose.foundation.gestures;

import androidx.compose.runtime.m2;
import androidx.compose.ui.input.pointer.i0;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref;
import kotlin.t0;

/* JADX INFO: compiled from: Transformable.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Landroidx/compose/foundation/gestures/r;", "Lkotlin/b2;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
@kotlin.coroutines.jvm.internal.d(c = "androidx.compose.foundation.gestures.TransformableKt$detectZoom$3", f = "Transformable.kt", i = {}, l = {103}, m = "invokeSuspend", n = {}, s = {})
public final class TransformableKt$detectZoom$3 extends SuspendLambda implements yh.p<r, kotlin.coroutines.c<? super b2>, Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f5710b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private /* synthetic */ Object f5711c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ i0 f5712d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ Ref.BooleanRef f5713e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ Ref.FloatRef f5714f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final /* synthetic */ Ref.FloatRef f5715g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final /* synthetic */ Ref.LongRef f5716h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final /* synthetic */ float f5717i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final /* synthetic */ Ref.BooleanRef f5718j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    final /* synthetic */ m2<Boolean> f5719k;

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.TransformableKt$detectZoom$3$1, reason: invalid class name */
    /* JADX INFO: compiled from: Transformable.kt */
    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Landroidx/compose/ui/input/pointer/d;", "Lkotlin/b2;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @kotlin.coroutines.jvm.internal.d(c = "androidx.compose.foundation.gestures.TransformableKt$detectZoom$3$1", f = "Transformable.kt", i = {0}, l = {105}, m = "invokeSuspend", n = {"$this$awaitPointerEventScope"}, s = {"L$0"})
    public static final class AnonymousClass1 extends RestrictedSuspendLambda implements yh.p<androidx.compose.ui.input.pointer.d, kotlin.coroutines.c<? super b2>, Object> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f5720c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private /* synthetic */ Object f5721d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Ref.BooleanRef f5722e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ Ref.FloatRef f5723f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ Ref.FloatRef f5724g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ Ref.LongRef f5725h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ float f5726i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ Ref.BooleanRef f5727j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ m2<Boolean> f5728k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final /* synthetic */ r f5729l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Ref.BooleanRef booleanRef, Ref.FloatRef floatRef, Ref.FloatRef floatRef2, Ref.LongRef longRef, float f10, Ref.BooleanRef booleanRef2, m2<Boolean> m2Var, r rVar, kotlin.coroutines.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.f5722e = booleanRef;
            this.f5723f = floatRef;
            this.f5724g = floatRef2;
            this.f5725h = longRef;
            this.f5726i = f10;
            this.f5727j = booleanRef2;
            this.f5728k = m2Var;
            this.f5729l = rVar;
        }

        @Override // yh.p
        @dl.e
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@dl.d androidx.compose.ui.input.pointer.d dVar, @dl.e kotlin.coroutines.c<? super b2> cVar) {
            return ((AnonymousClass1) create(dVar, cVar)).invokeSuspend(b2.f124493a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.d
        public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f5722e, this.f5723f, this.f5724g, this.f5725h, this.f5726i, this.f5727j, this.f5728k, this.f5729l, cVar);
            anonymousClass1.f5721d = obj;
            return anonymousClass1;
        }

        /* JADX WARN: Code duplicated, block: B:14:0x0042  */
        /* JADX WARN: Code duplicated, block: B:17:0x0050 A[LOOP:0: B:13:0x0040->B:17:0x0050, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:69:0x0053 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:70:0x004e A[SYNTHETIC] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0031 -> B:12:0x0034). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.e
        public final java.lang.Object invokeSuspend(@dl.d java.lang.Object r17) {
            /*
                Method dump skipped, instruction units count: 327
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TransformableKt$detectZoom$3.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TransformableKt$detectZoom$3(i0 i0Var, Ref.BooleanRef booleanRef, Ref.FloatRef floatRef, Ref.FloatRef floatRef2, Ref.LongRef longRef, float f10, Ref.BooleanRef booleanRef2, m2<Boolean> m2Var, kotlin.coroutines.c<? super TransformableKt$detectZoom$3> cVar) {
        super(2, cVar);
        this.f5712d = i0Var;
        this.f5713e = booleanRef;
        this.f5714f = floatRef;
        this.f5715g = floatRef2;
        this.f5716h = longRef;
        this.f5717i = f10;
        this.f5718j = booleanRef2;
        this.f5719k = m2Var;
    }

    @Override // yh.p
    @dl.e
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Object invoke(@dl.d r rVar, @dl.e kotlin.coroutines.c<? super b2> cVar) {
        return ((TransformableKt$detectZoom$3) create(rVar, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        TransformableKt$detectZoom$3 transformableKt$detectZoom$3 = new TransformableKt$detectZoom$3(this.f5712d, this.f5713e, this.f5714f, this.f5715g, this.f5716h, this.f5717i, this.f5718j, this.f5719k, cVar);
        transformableKt$detectZoom$3.f5711c = obj;
        return transformableKt$detectZoom$3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i10 = this.f5710b;
        if (i10 == 0) {
            t0.n(obj);
            r rVar = (r) this.f5711c;
            i0 i0Var = this.f5712d;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f5713e, this.f5714f, this.f5715g, this.f5716h, this.f5717i, this.f5718j, this.f5719k, rVar, null);
            this.f5710b = 1;
            if (i0Var.n1(anonymousClass1, this) == objH) {
                return objH;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t0.n(obj);
        }
        return b2.f124493a;
    }
}
