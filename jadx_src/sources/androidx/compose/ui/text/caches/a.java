package androidx.compose.ui.text.caches;

import com.max.hbuikit.bean.param.UiKitSpanObj;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;
import xh.e;

/* JADX INFO: compiled from: ContainerHelpers.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0010\u0015\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0004\u001a\u001c\u0010\u0004\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\u0000\"\u0014\u0010\u0006\u001a\u00020\u00008\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005\"\u001c\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00078\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"", "", UiKitSpanObj.TYPE_SIZE, "value", ak.av, "[I", "EMPTY_INTS", "", "", "b", "[Ljava/lang/Object;", "EMPTY_OBJECTS", "ui-text_release"}, k = 2, mv = {1, 7, 1})
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    @e
    public static final int[] f16366a = new int[0];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    @e
    public static final Object[] f16367b = new Object[0];

    public static final int a(@dl.d int[] iArr, int i10, int i11) {
        f0.p(iArr, "<this>");
        int i12 = i10 - 1;
        int i13 = 0;
        while (i13 <= i12) {
            int i14 = (i13 + i12) >>> 1;
            int i15 = iArr[i14];
            if (i15 < i11) {
                i13 = i14 + 1;
            } else {
                if (i15 <= i11) {
                    return i14;
                }
                i12 = i14 - 1;
            }
        }
        return ~i13;
    }
}
