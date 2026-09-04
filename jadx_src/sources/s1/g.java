package s1;

import androidx.compose.runtime.j2;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: Density.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001a\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0000H\u0007¨\u0006\u0005"}, d2 = {"", "density", "fontScale", "Ls1/e;", ak.av, "ui-unit_release"}, k = 2, mv = {1, 7, 1})
public final class g {
    @j2
    @dl.d
    public static final e a(float f10, float f11) {
        return new DensityImpl(f10, f11);
    }

    public static /* synthetic */ e b(float f10, float f11, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            f11 = 1.0f;
        }
        return a(f10, f11);
    }
}
