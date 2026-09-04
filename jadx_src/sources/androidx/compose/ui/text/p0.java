package androidx.compose.ui.text;

import com.starlightc.ucropplus.ui.UCropPlusActivity;
import com.umeng.analytics.pro.ak;
import io.flutter.embedding.android.KeyboardMap;
import kotlin.Metadata;

/* JADX INFO: compiled from: TextRange.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\"\n\u0002\u0010\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\b\u0002\u001a\u001f\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a \u0010\t\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006ø\u0001\u0001¢\u0006\u0004\b\t\u0010\n\u001a\u0018\u0010\f\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u0006ø\u0001\u0001¢\u0006\u0004\b\f\u0010\r\u001a)\u0010\u0010\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0006H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0018\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0014"}, d2 = {"", "Landroidx/compose/ui/text/o0;", com.google.android.exoplayer2.source.rtsp.k0.f48802q, "", "e", "(Ljava/lang/CharSequence;J)Ljava/lang/String;", "", com.google.android.exoplayer2.text.ttml.d.f49798o0, com.google.android.exoplayer2.text.ttml.d.f49800p0, "b", "(II)J", UCropPlusActivity.ARG_INDEX, ak.av, "(I)J", "minimumValue", "maximumValue", ak.aF, "(JII)J", "", "d", "ui-text_release"}, k = 2, mv = {1, 7, 1})
public final class p0 {
    public static final long a(int i10) {
        return b(i10, i10);
    }

    public static final long b(int i10, int i11) {
        return o0.c(d(i10, i11));
    }

    public static final long c(long j10, int i10, int i11) {
        int I = fi.u.I(o0.n(j10), i10, i11);
        int I2 = fi.u.I(o0.i(j10), i10, i11);
        return (I == o0.n(j10) && I2 == o0.i(j10)) ? j10 : b(I, I2);
    }

    private static final long d(int i10, int i11) {
        if (!(i10 >= 0)) {
            throw new IllegalArgumentException(("start cannot be negative. [start: " + i10 + ", end: " + i11 + ']').toString());
        }
        if (i11 >= 0) {
            return (((long) i11) & KeyboardMap.kValueMask) | (((long) i10) << 32);
        }
        throw new IllegalArgumentException(("end cannot be negative. [start: " + i10 + ", end: " + i11 + ']').toString());
    }

    @dl.d
    public static final String e(@dl.d CharSequence substring, long j10) {
        kotlin.jvm.internal.f0.p(substring, "$this$substring");
        return substring.subSequence(o0.l(j10), o0.k(j10)).toString();
    }
}
