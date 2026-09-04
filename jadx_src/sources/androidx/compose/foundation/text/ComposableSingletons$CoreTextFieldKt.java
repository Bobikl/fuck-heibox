package androidx.compose.foundation.text;

import androidx.compose.runtime.ComposerKt;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: CoreTextField.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
public final class ComposableSingletons$CoreTextFieldKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final ComposableSingletons$CoreTextFieldKt f7680a = new ComposableSingletons$CoreTextFieldKt();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    public static yh.q<yh.p<? super androidx.compose.runtime.p, ? super Integer, b2>, androidx.compose.runtime.p, Integer, b2> f7681b = androidx.compose.runtime.internal.b.c(1894572096, false, new yh.q<yh.p<? super androidx.compose.runtime.p, ? super Integer, ? extends b2>, androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.foundation.text.ComposableSingletons$CoreTextFieldKt$lambda-1$1
        @androidx.compose.runtime.i(scheme = "[0[0]]")
        @androidx.compose.runtime.h
        public final void a(@dl.d yh.p<? super androidx.compose.runtime.p, ? super Integer, b2> innerTextField, @dl.e androidx.compose.runtime.p pVar, int i10) {
            f0.p(innerTextField, "innerTextField");
            if ((i10 & 14) == 0) {
                i10 |= pVar.s(innerTextField) ? 4 : 2;
            }
            if ((i10 & 91) == 18 && pVar.b()) {
                pVar.l();
                return;
            }
            if (ComposerKt.g0()) {
                ComposerKt.w0(1894572096, i10, -1, "androidx.compose.foundation.text.ComposableSingletons$CoreTextFieldKt.lambda-1.<anonymous> (CoreTextField.kt:192)");
            }
            innerTextField.invoke(pVar, Integer.valueOf(i10 & 14));
            if (ComposerKt.g0()) {
                ComposerKt.v0();
            }
        }

        @Override // yh.q
        public /* bridge */ /* synthetic */ b2 invoke(yh.p<? super androidx.compose.runtime.p, ? super Integer, ? extends b2> pVar, androidx.compose.runtime.p pVar2, Integer num) {
            a(pVar, pVar2, num.intValue());
            return b2.f124493a;
        }
    });

    @dl.d
    public final yh.q<yh.p<? super androidx.compose.runtime.p, ? super Integer, b2>, androidx.compose.runtime.p, Integer, b2> a() {
        return f7681b;
    }
}
