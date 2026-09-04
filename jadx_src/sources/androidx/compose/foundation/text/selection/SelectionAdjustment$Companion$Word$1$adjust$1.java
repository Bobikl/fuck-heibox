package androidx.compose.foundation.text.selection;

import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.o0;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: compiled from: SelectionAdjustment.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
public final /* synthetic */ class SelectionAdjustment$Companion$Word$1$adjust$1 extends FunctionReferenceImpl implements yh.l<Integer, o0> {
    SelectionAdjustment$Companion$Word$1$adjust$1(Object obj) {
        super(1, obj, TextLayoutResult.class, "getWordBoundary", "getWordBoundary--jx7JFs(I)J", 0);
    }

    public final long i(int i10) {
        return ((TextLayoutResult) this.receiver).C(i10);
    }

    @Override // yh.l
    public /* bridge */ /* synthetic */ o0 invoke(Integer num) {
        return o0.b(i(num.intValue()));
    }
}
