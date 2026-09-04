package b1;

import androidx.compose.runtime.j2;
import com.lzy.okgo.model.Progress;
import com.umeng.analytics.pro.ak;
import io.flutter.embedding.android.KeyboardMap;
import kotlin.Metadata;

/* JADX INFO: compiled from: CornerRadius.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u001a$\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0000H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a-\u0010\t\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0000H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u000b"}, d2 = {"", "x", "y", "Lb1/a;", ak.av, "(FF)J", com.google.android.exoplayer2.text.ttml.d.f49798o0, "stop", Progress.G, ak.aF, "(JJF)J", "ui-geometry_release"}, k = 2, mv = {1, 7, 1})
public final class b {
    @j2
    public static final long a(float f10, float f11) {
        return a.e((((long) Float.floatToIntBits(f11)) & KeyboardMap.kValueMask) | (Float.floatToIntBits(f10) << 32));
    }

    public static /* synthetic */ long b(float f10, float f11, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            f11 = f10;
        }
        return a(f10, f11);
    }

    @j2
    public static final long c(long j10, long j11, float f10) {
        return a(u1.d.a(a.m(j10), a.m(j11), f10), u1.d.a(a.o(j10), a.o(j11), f10));
    }
}
