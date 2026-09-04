package androidx.compose.foundation.text.selection;

import androidx.compose.ui.text.o0;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: compiled from: SelectionAdjustment.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
public final /* synthetic */ class SelectionAdjustment$Companion$Paragraph$1$adjust$boundaryFun$1 extends FunctionReferenceImpl implements yh.l<Integer, o0> {
    SelectionAdjustment$Companion$Paragraph$1$adjust$boundaryFun$1(Object obj) {
        super(1, obj, androidx.compose.foundation.text.m.class, "getParagraphBoundary", "getParagraphBoundary(Ljava/lang/CharSequence;I)J", 1);
    }

    public final long i(int i10) {
        return androidx.compose.foundation.text.m.c((CharSequence) this.receiver, i10);
    }

    @Override // yh.l
    public /* bridge */ /* synthetic */ o0 invoke(Integer num) {
        return o0.b(i(num.intValue()));
    }
}
