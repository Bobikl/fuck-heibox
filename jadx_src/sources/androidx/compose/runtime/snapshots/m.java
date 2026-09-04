package androidx.compose.runtime.snapshots;

import com.umeng.analytics.pro.ak;
import io.flutter.embedding.android.KeyboardMap;
import kotlin.Metadata;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: compiled from: SnapshotIdSet.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0003\u001a\u0010\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0002\u001a\u0014\u0010\u0006\u001a\u00020\u0002*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0002H\u0000¨\u0006\u0007"}, d2 = {"", "bits", "", ak.aF, "", "value", "b", "runtime_release"}, k = 2, mv = {1, 7, 1})
public final class m {
    public static final int b(@dl.d int[] iArr, int i10) {
        kotlin.jvm.internal.f0.p(iArr, "<this>");
        int length = iArr.length - 1;
        int i11 = 0;
        while (i11 <= length) {
            int i12 = (i11 + length) >>> 1;
            int i13 = iArr[i12];
            if (i10 > i13) {
                i11 = i12 + 1;
            } else {
                if (i10 >= i13) {
                    return i12;
                }
                length = i12 - 1;
            }
        }
        return -(i11 + 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int c(long j10) {
        int i10 = 32;
        if ((KeyboardMap.kValueMask & j10) == 0) {
            j10 >>= 32;
        } else {
            i10 = 0;
        }
        if ((WebSocketProtocol.PAYLOAD_SHORT_MAX & j10) == 0) {
            i10 += 16;
            j10 >>= 16;
        }
        if ((255 & j10) == 0) {
            i10 += 8;
            j10 >>= 8;
        }
        if ((15 & j10) == 0) {
            i10 += 4;
            j10 >>= 4;
        }
        if ((1 & j10) != 0) {
            return i10;
        }
        if ((2 & j10) != 0) {
            return i10 + 1;
        }
        if ((4 & j10) != 0) {
            return i10 + 2;
        }
        if ((j10 & 8) != 0) {
            return i10 + 3;
        }
        return -1;
    }
}
