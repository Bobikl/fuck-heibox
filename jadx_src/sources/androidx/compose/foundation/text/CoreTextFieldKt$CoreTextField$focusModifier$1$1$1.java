package androidx.compose.foundation.text;

import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.input.TextFieldValue;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.t0;
import kotlinx.coroutines.q0;

/* JADX INFO: compiled from: CoreTextField.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
@kotlin.coroutines.jvm.internal.d(c = "androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$focusModifier$1$1$1", f = "CoreTextField.kt", i = {}, l = {302}, m = "invokeSuspend", n = {}, s = {})
public final class CoreTextFieldKt$CoreTextField$focusModifier$1$1$1 extends SuspendLambda implements yh.p<q0, kotlin.coroutines.c<? super b2>, Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f7775b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ androidx.compose.foundation.relocation.e f7776c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ TextFieldValue f7777d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ TextFieldState f7778e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ w f7779f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final /* synthetic */ androidx.compose.ui.text.input.x f7780g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CoreTextFieldKt$CoreTextField$focusModifier$1$1$1(androidx.compose.foundation.relocation.e eVar, TextFieldValue textFieldValue, TextFieldState textFieldState, w wVar, androidx.compose.ui.text.input.x xVar, kotlin.coroutines.c<? super CoreTextFieldKt$CoreTextField$focusModifier$1$1$1> cVar) {
        super(2, cVar);
        this.f7776c = eVar;
        this.f7777d = textFieldValue;
        this.f7778e = textFieldState;
        this.f7779f = wVar;
        this.f7780g = xVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        return new CoreTextFieldKt$CoreTextField$focusModifier$1$1$1(this.f7776c, this.f7777d, this.f7778e, this.f7779f, this.f7780g, cVar);
    }

    @Override // yh.p
    @dl.e
    public final Object invoke(@dl.d q0 q0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
        return ((CoreTextFieldKt$CoreTextField$focusModifier$1$1$1) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i10 = this.f7775b;
        if (i10 == 0) {
            t0.n(obj);
            androidx.compose.foundation.relocation.e eVar = this.f7776c;
            TextFieldValue textFieldValue = this.f7777d;
            p textDelegate = this.f7778e.getTextDelegate();
            TextLayoutResult value = this.f7779f.getValue();
            androidx.compose.ui.text.input.x xVar = this.f7780g;
            this.f7775b = 1;
            if (CoreTextFieldKt.j(eVar, textFieldValue, textDelegate, value, xVar, this) == objH) {
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
