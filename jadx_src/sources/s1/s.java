package s1;

import androidx.compose.runtime.j2;
import com.max.hbuikit.bean.param.UiKitSpanObj;
import com.umeng.analytics.pro.ak;
import io.flutter.embedding.android.KeyboardMap;
import kotlin.Metadata;

/* JADX INFO: compiled from: IntSize.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000(\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\"\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\"\u0010\u0007\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0003H\u0087\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u0019\u0010\n\u001a\u00020\t*\u00020\u0003H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a\u0019\u0010\r\u001a\u00020\f*\u00020\u0003H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\"!\u0010\u0013\u001a\u00020\u000f*\u00020\u00038FX\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0010\u0010\u000e\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u0014"}, d2 = {"", "width", "height", "Ls1/r;", ak.av, "(II)J", UiKitSpanObj.TYPE_SIZE, "d", "(IJ)J", "Ls1/p;", "e", "(J)Ls1/p;", "Lb1/m;", "f", "(J)J", "Ls1/n;", "b", "getCenter-ozmzZPI$annotations", "(J)V", com.google.android.exoplayer2.text.ttml.d.f49794m0, "ui-unit_release"}, k = 2, mv = {1, 7, 1})
public final class s {
    @j2
    public static final long a(int i10, int i11) {
        return r.e((((long) i11) & KeyboardMap.kValueMask) | (((long) i10) << 32));
    }

    public static final long b(long j10) {
        return o.a(r.m(j10) / 2, r.j(j10) / 2);
    }

    @j2
    public static /* synthetic */ void c(long j10) {
    }

    @j2
    public static final long d(int i10, long j10) {
        return r.o(j10, i10);
    }

    @j2
    @dl.d
    public static final p e(long j10) {
        return q.b(n.f139237b.a(), j10);
    }

    @j2
    public static final long f(long j10) {
        return b1.n.a(r.m(j10), r.j(j10));
    }
}
