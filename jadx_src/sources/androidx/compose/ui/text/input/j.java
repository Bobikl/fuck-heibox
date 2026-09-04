package androidx.compose.ui.text.input;

import androidx.compose.ui.text.o0;
import androidx.compose.ui.text.p0;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: EditingBuffer.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a%\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/text/o0;", "target", "deleted", ak.av, "(JJ)J", "ui-text_release"}, k = 2, mv = {1, 7, 1})
public final class j {
    public static final long a(long j10, long j11) {
        int iJ;
        int iL = o0.l(j10);
        int iK = o0.k(j10);
        if (o0.p(j11, j10)) {
            if (o0.d(j11, j10)) {
                iL = o0.l(j11);
                iK = iL;
            } else {
                if (o0.d(j10, j11)) {
                    iJ = o0.j(j11);
                } else if (o0.e(j11, iL)) {
                    iL = o0.l(j11);
                    iJ = o0.j(j11);
                } else {
                    iK = o0.l(j11);
                }
                iK -= iJ;
            }
        } else if (iK > o0.l(j11)) {
            iL -= o0.j(j11);
            iJ = o0.j(j11);
            iK -= iJ;
        }
        return p0.b(iL, iK);
    }
}
