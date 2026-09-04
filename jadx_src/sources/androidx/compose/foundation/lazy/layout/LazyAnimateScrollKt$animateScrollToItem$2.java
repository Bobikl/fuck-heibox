package androidx.compose.foundation.lazy.layout;

import kotlin.Metadata;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: compiled from: LazyAnimateScroll.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Landroidx/compose/foundation/gestures/m;", "Lkotlin/b2;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
@kotlin.coroutines.jvm.internal.d(c = "androidx.compose.foundation.lazy.layout.LazyAnimateScrollKt$animateScrollToItem$2", f = "LazyAnimateScroll.kt", i = {0, 0, 0, 0, 0, 0, 0, 1}, l = {134, bb.c.b.f31007w1}, m = "invokeSuspend", n = {"$this$scroll", "loop", "anim", "loops", "targetDistancePx", "boundDistancePx", "forward", "$this$scroll"}, s = {"L$0", "L$1", "L$2", "L$3", "F$0", "F$1", "I$0", "L$0"})
public final class LazyAnimateScrollKt$animateScrollToItem$2 extends SuspendLambda implements yh.p<androidx.compose.foundation.gestures.m, kotlin.coroutines.c<? super b2>, Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Object f7024b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    Object f7025c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    Object f7026d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    float f7027e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    float f7028f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    int f7029g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    int f7030h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private /* synthetic */ Object f7031i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final /* synthetic */ int f7032j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    final /* synthetic */ e f7033k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    final /* synthetic */ int f7034l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LazyAnimateScrollKt$animateScrollToItem$2(int i10, e eVar, int i11, kotlin.coroutines.c<? super LazyAnimateScrollKt$animateScrollToItem$2> cVar) {
        super(2, cVar);
        this.f7032j = i10;
        this.f7033k = eVar;
        this.f7034l = i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean h(boolean z10, e eVar, int i10, int i11) {
        if (z10) {
            if (eVar.d() <= i10 && (eVar.d() != i10 || eVar.i() <= i11)) {
                return false;
            }
        } else if (eVar.d() >= i10 && (eVar.d() != i10 || eVar.i() >= i11)) {
            return false;
        }
        return true;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        LazyAnimateScrollKt$animateScrollToItem$2 lazyAnimateScrollKt$animateScrollToItem$2 = new LazyAnimateScrollKt$animateScrollToItem$2(this.f7032j, this.f7033k, this.f7034l, cVar);
        lazyAnimateScrollKt$animateScrollToItem$2.f7031i = obj;
        return lazyAnimateScrollKt$animateScrollToItem$2;
    }

    @Override // yh.p
    @dl.e
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final Object invoke(@dl.d androidx.compose.foundation.gestures.m mVar, @dl.e kotlin.coroutines.c<? super b2> cVar) {
        return ((LazyAnimateScrollKt$animateScrollToItem$2) create(mVar, cVar)).invokeSuspend(b2.f124493a);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00c5 A[Catch: ItemFoundInScroll -> 0x01ae, TryCatch #5 {ItemFoundInScroll -> 0x01ae, blocks: (B:27:0x00c1, B:29:0x00c5, B:31:0x00cd, B:37:0x00e5, B:44:0x012c, B:48:0x0139), top: B:92:0x00c1 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x00df  */
    /* JADX WARN: Code duplicated, block: B:34:0x00e0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:36:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:39:0x0122  */
    /* JADX WARN: Code duplicated, block: B:40:0x0124  */
    /* JADX WARN: Code duplicated, block: B:42:0x0127  */
    /* JADX WARN: Code duplicated, block: B:43:0x012a  */
    /* JADX WARN: Code duplicated, block: B:46:0x0134  */
    /* JADX WARN: Code duplicated, block: B:47:0x0137  */
    /* JADX WARN: Code duplicated, block: B:54:0x0190 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:55:0x0191  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v2, types: [T, androidx.compose.animation.core.j] */
    /* JADX WARN: Type inference failed for: r7v11, types: [T, androidx.compose.animation.core.j] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:55:0x0191 -> B:84:0x0198). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final java.lang.Object invokeSuspend(@dl.d java.lang.Object r37) {
        /*
            Method dump skipped, instruction units count: 594
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.layout.LazyAnimateScrollKt$animateScrollToItem$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
