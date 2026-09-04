package androidx.compose.foundation.text.selection;

import androidx.compose.ui.input.pointer.i0;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.t0;

/* JADX INFO: compiled from: TextSelectionMouseDetector.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Landroidx/compose/ui/input/pointer/i0;", "Lkotlin/b2;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
@kotlin.coroutines.jvm.internal.d(c = "androidx.compose.foundation.text.selection.TextSelectionMouseDetectorKt$mouseSelectionDetector$2", f = "TextSelectionMouseDetector.kt", i = {}, l = {87}, m = "invokeSuspend", n = {}, s = {})
public final class TextSelectionMouseDetectorKt$mouseSelectionDetector$2 extends SuspendLambda implements yh.p<i0, kotlin.coroutines.c<? super b2>, Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f8331b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private /* synthetic */ Object f8332c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ e f8333d;

    /* JADX INFO: renamed from: androidx.compose.foundation.text.selection.TextSelectionMouseDetectorKt$mouseSelectionDetector$2$1, reason: invalid class name */
    /* JADX INFO: compiled from: TextSelectionMouseDetector.kt */
    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Landroidx/compose/ui/input/pointer/d;", "Lkotlin/b2;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @kotlin.coroutines.jvm.internal.d(c = "androidx.compose.foundation.text.selection.TextSelectionMouseDetectorKt$mouseSelectionDetector$2$1", f = "TextSelectionMouseDetector.kt", i = {0, 0, 1, 1, 2, 2}, l = {90, 97, 112}, m = "invokeSuspend", n = {"$this$awaitPointerEventScope", "clicksCounter", "$this$awaitPointerEventScope", "clicksCounter", "$this$awaitPointerEventScope", "clicksCounter"}, s = {"L$0", "L$1", "L$0", "L$1", "L$0", "L$1"})
    public static final class AnonymousClass1 extends RestrictedSuspendLambda implements yh.p<androidx.compose.ui.input.pointer.d, kotlin.coroutines.c<? super b2>, Object> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f8334c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f8335d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f8336e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ e f8337f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(e eVar, kotlin.coroutines.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.f8337f = eVar;
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
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f8337f, cVar);
            anonymousClass1.f8336e = obj;
            return anonymousClass1;
        }

        /* JADX WARN: Code duplicated, block: B:16:0x0051 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:17:0x0052  */
        /* JADX WARN: Code duplicated, block: B:20:0x006c  */
        /* JADX WARN: Code duplicated, block: B:22:0x0078  */
        /* JADX WARN: Code duplicated, block: B:24:0x0092 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:25:0x0093  */
        /* JADX WARN: Code duplicated, block: B:27:0x0099 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:28:0x009b  */
        /* JADX WARN: Code duplicated, block: B:29:0x00a2  */
        /* JADX WARN: Code duplicated, block: B:30:0x00a9  */
        /* JADX WARN: Code duplicated, block: B:33:0x00bb  */
        /* JADX WARN: Code duplicated, block: B:35:0x00d5 A[RETURN] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x00d6 -> B:14:0x0045). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:24:0x0092
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.e
        public final java.lang.Object invokeSuspend(@dl.d java.lang.Object r13) {
            /*
                Method dump skipped, instruction units count: 218
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.TextSelectionMouseDetectorKt$mouseSelectionDetector$2.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TextSelectionMouseDetectorKt$mouseSelectionDetector$2(e eVar, kotlin.coroutines.c<? super TextSelectionMouseDetectorKt$mouseSelectionDetector$2> cVar) {
        super(2, cVar);
        this.f8333d = eVar;
    }

    @Override // yh.p
    @dl.e
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Object invoke(@dl.d i0 i0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
        return ((TextSelectionMouseDetectorKt$mouseSelectionDetector$2) create(i0Var, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        TextSelectionMouseDetectorKt$mouseSelectionDetector$2 textSelectionMouseDetectorKt$mouseSelectionDetector$2 = new TextSelectionMouseDetectorKt$mouseSelectionDetector$2(this.f8333d, cVar);
        textSelectionMouseDetectorKt$mouseSelectionDetector$2.f8332c = obj;
        return textSelectionMouseDetectorKt$mouseSelectionDetector$2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i10 = this.f8331b;
        if (i10 == 0) {
            t0.n(obj);
            i0 i0Var = (i0) this.f8332c;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f8333d, null);
            this.f8331b = 1;
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
