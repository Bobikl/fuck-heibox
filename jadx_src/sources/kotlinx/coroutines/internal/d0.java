package kotlinx.coroutines.internal;

import com.umeng.analytics.pro.ak;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlinx.coroutines.n2;
import kotlinx.coroutines.z1;

/* JADX INFO: compiled from: MainDispatchers.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\t\u001a\u001a\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00000\u0001H\u0007\u001a\f\u0010\u0006\u001a\u00020\u0005*\u00020\u0003H\u0007\u001a \u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tH\u0002\u001a\b\u0010\u000e\u001a\u00020\rH\u0000\"\u0014\u0010\u0010\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u000f\"\u001a\u0010\u0015\u001a\u00020\u00058\u0002X\u0082D¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u0012\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lkotlinx/coroutines/internal/b0;", "", "factories", "Lkotlinx/coroutines/n2;", "f", "", "d", "", "cause", "", "errorHint", "Lkotlinx/coroutines/internal/e0;", ak.av, "", "e", "Ljava/lang/String;", "FAST_SERVICE_LOADER_PROPERTY_NAME", "b", "Z", "getSUPPORT_MISSING$annotations", "()V", "SUPPORT_MISSING", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
public final class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private static final String f130158a = "kotlinx.coroutines.fast.service.loader";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final boolean f130159b = true;

    private static final e0 a(Throwable th2, String str) throws Throwable {
        if (f130159b) {
            return new e0(th2, str);
        }
        if (th2 != null) {
            throw th2;
        }
        e();
        throw new KotlinNothingValueException();
    }

    static /* synthetic */ e0 b(Throwable th2, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            th2 = null;
        }
        if ((i10 & 2) != 0) {
            str = null;
        }
        return a(th2, str);
    }

    private static /* synthetic */ void c() {
    }

    @z1
    public static final boolean d(@dl.d n2 n2Var) {
        return n2Var.p0() instanceof e0;
    }

    @dl.d
    public static final Void e() {
        throw new IllegalStateException("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
    }

    @dl.d
    @z1
    public static final n2 f(@dl.d b0 b0Var, @dl.d List<? extends b0> list) {
        try {
            return b0Var.c(list);
        } catch (Throwable th2) {
            return a(th2, b0Var.b());
        }
    }
}
