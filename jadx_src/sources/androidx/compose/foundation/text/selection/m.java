package androidx.compose.foundation.text.selection;

import androidx.compose.ui.semantics.SemanticsPropertyKey;
import com.umeng.analytics.pro.ak;
import com.umeng.socialize.net.dplus.CommonNetImpl;
import kotlin.Metadata;

/* JADX INFO: compiled from: SelectionHandles.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u001d\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0002\u0010\u0003\"\u001d\u0010\b\u001a\u00020\u00048\u0000X\u0080\u0004ø\u0001\u0001¢\u0006\f\n\u0004\b\u0002\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u001d\u0010\n\u001a\u00020\u00048\u0000X\u0080\u0004ø\u0001\u0001¢\u0006\f\n\u0004\b\t\u0010\u0005\u001a\u0004\b\t\u0010\u0007\" \u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010\r\u001a\u0004\b\u000e\u0010\u000f\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0011"}, d2 = {"Lb1/f;", CommonNetImpl.POSITION, ak.av, "(J)J", "Ls1/h;", "F", ak.aF, "()F", "HandleWidth", "b", "HandleHeight", "Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "Landroidx/compose/foundation/text/selection/l;", "Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "d", "()Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "SelectionHandleInfoKey", "foundation_release"}, k = 2, mv = {1, 7, 1})
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final float f8371a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final float f8372b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private static final SemanticsPropertyKey<SelectionHandleInfo> f8373c = new SemanticsPropertyKey<>("SelectionHandleInfo", null, 2, null);

    static {
        float f10 = 25;
        f8371a = s1.h.g(f10);
        f8372b = s1.h.g(f10);
    }

    public static final long a(long j10) {
        return b1.g.a(b1.f.p(j10), b1.f.r(j10) - 1.0f);
    }

    public static final float b() {
        return f8372b;
    }

    public static final float c() {
        return f8371a;
    }

    @dl.d
    public static final SemanticsPropertyKey<SelectionHandleInfo> d() {
        return f8373c;
    }
}
