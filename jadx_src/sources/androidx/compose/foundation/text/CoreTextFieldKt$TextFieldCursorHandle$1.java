package androidx.compose.foundation.text;

import androidx.compose.ui.input.pointer.i0;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.t0;

/* JADX INFO: compiled from: CoreTextField.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
@kotlin.coroutines.jvm.internal.d(c = "androidx.compose.foundation.text.CoreTextFieldKt$TextFieldCursorHandle$1", f = "CoreTextField.kt", i = {}, l = {1012}, m = "invokeSuspend", n = {}, s = {})
public final class CoreTextFieldKt$TextFieldCursorHandle$1 extends SuspendLambda implements yh.p<i0, kotlin.coroutines.c<? super b2>, Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f7821b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private /* synthetic */ Object f7822c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ r f7823d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CoreTextFieldKt$TextFieldCursorHandle$1(r rVar, kotlin.coroutines.c<? super CoreTextFieldKt$TextFieldCursorHandle$1> cVar) {
        super(2, cVar);
        this.f7823d = rVar;
    }

    @Override // yh.p
    @dl.e
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Object invoke(@dl.d i0 i0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
        return ((CoreTextFieldKt$TextFieldCursorHandle$1) create(i0Var, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        CoreTextFieldKt$TextFieldCursorHandle$1 coreTextFieldKt$TextFieldCursorHandle$1 = new CoreTextFieldKt$TextFieldCursorHandle$1(this.f7823d, cVar);
        coreTextFieldKt$TextFieldCursorHandle$1.f7822c = obj;
        return coreTextFieldKt$TextFieldCursorHandle$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i10 = this.f7821b;
        if (i10 == 0) {
            t0.n(obj);
            i0 i0Var = (i0) this.f7822c;
            r rVar = this.f7823d;
            this.f7821b = 1;
            if (LongPressTextDragObserverKt.c(i0Var, rVar, this) == objH) {
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
