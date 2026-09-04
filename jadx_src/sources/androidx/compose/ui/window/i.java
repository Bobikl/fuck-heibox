package androidx.compose.ui.window;

import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: SecureFlagPolicy.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u0014\u0010\u0003\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/window/SecureFlagPolicy;", "", "isSecureFlagSetOnParent", ak.av, "ui_release"}, k = 2, mv = {1, 7, 1})
public final class i {

    /* JADX INFO: compiled from: SecureFlagPolicy.android.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f17220a;

        static {
            int[] iArr = new int[SecureFlagPolicy.values().length];
            iArr[SecureFlagPolicy.SecureOff.ordinal()] = 1;
            iArr[SecureFlagPolicy.SecureOn.ordinal()] = 2;
            iArr[SecureFlagPolicy.Inherit.ordinal()] = 3;
            f17220a = iArr;
        }
    }

    public static final boolean a(@dl.d SecureFlagPolicy secureFlagPolicy, boolean z10) {
        f0.p(secureFlagPolicy, "<this>");
        int i10 = a.f17220a[secureFlagPolicy.ordinal()];
        if (i10 == 1) {
            return false;
        }
        if (i10 == 2) {
            return true;
        }
        if (i10 == 3) {
            return z10;
        }
        throw new NoWhenBranchMatchedException();
    }
}
