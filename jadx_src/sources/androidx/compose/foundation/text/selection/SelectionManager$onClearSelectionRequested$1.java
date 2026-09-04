package androidx.compose.foundation.text.selection;

import androidx.compose.ui.input.pointer.i0;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.t0;

/* JADX INFO: compiled from: SelectionManager.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Landroidx/compose/ui/input/pointer/i0;", "Lkotlin/b2;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
@kotlin.coroutines.jvm.internal.d(c = "androidx.compose.foundation.text.selection.SelectionManager$onClearSelectionRequested$1", f = "SelectionManager.kt", i = {}, l = {bb.c.b.f30653g9}, m = "invokeSuspend", n = {}, s = {})
public final class SelectionManager$onClearSelectionRequested$1 extends SuspendLambda implements yh.p<i0, kotlin.coroutines.c<? super b2>, Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f8255b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private /* synthetic */ Object f8256c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ SelectionManager f8257d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ yh.a<b2> f8258e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SelectionManager$onClearSelectionRequested$1(SelectionManager selectionManager, yh.a<b2> aVar, kotlin.coroutines.c<? super SelectionManager$onClearSelectionRequested$1> cVar) {
        super(2, cVar);
        this.f8257d = selectionManager;
        this.f8258e = aVar;
    }

    @Override // yh.p
    @dl.e
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Object invoke(@dl.d i0 i0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
        return ((SelectionManager$onClearSelectionRequested$1) create(i0Var, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        SelectionManager$onClearSelectionRequested$1 selectionManager$onClearSelectionRequested$1 = new SelectionManager$onClearSelectionRequested$1(this.f8257d, this.f8258e, cVar);
        selectionManager$onClearSelectionRequested$1.f8256c = obj;
        return selectionManager$onClearSelectionRequested$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i10 = this.f8255b;
        if (i10 == 0) {
            t0.n(obj);
            i0 i0Var = (i0) this.f8256c;
            SelectionManager selectionManager = this.f8257d;
            final yh.a<b2> aVar = this.f8258e;
            yh.l<b1.f, b2> lVar = new yh.l<b1.f, b2>() { // from class: androidx.compose.foundation.text.selection.SelectionManager$onClearSelectionRequested$1.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                public final void a(long j10) {
                    aVar.invoke();
                }

                @Override // yh.l
                public /* bridge */ /* synthetic */ b2 invoke(b1.f fVar) {
                    a(fVar.getF30368a());
                    return b2.f124493a;
                }
            };
            this.f8255b = 1;
            if (selectionManager.p(i0Var, lVar, this) == objH) {
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
