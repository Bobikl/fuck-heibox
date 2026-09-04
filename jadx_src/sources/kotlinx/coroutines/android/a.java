package kotlinx.coroutines.android;

import android.os.Looper;
import com.umeng.analytics.pro.ak;
import java.util.List;
import kotlin.Metadata;
import kotlinx.coroutines.internal.b0;
import kotlinx.coroutines.internal.z;
import kotlinx.coroutines.n2;

/* JADX INFO: compiled from: HandlerDispatcher.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\f\u0010\rJ\u0016\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0002H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016R\u0014\u0010\u000b\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\u000e"}, d2 = {"Lkotlinx/coroutines/android/a;", "Lkotlinx/coroutines/internal/b0;", "", "allFactories", "Lkotlinx/coroutines/n2;", ak.aF, "", "b", "", ak.av, "()I", "loadPriority", "<init>", "()V", "kotlinx-coroutines-android"}, k = 1, mv = {1, 6, 0})
public final class a implements b0 {
    @Override // kotlinx.coroutines.internal.b0
    public int a() {
        return z.f130219j;
    }

    @Override // kotlinx.coroutines.internal.b0
    @dl.d
    public String b() {
        return "For tests Dispatchers.setMain from kotlinx-coroutines-test module can be used";
    }

    @Override // kotlinx.coroutines.internal.b0
    @dl.d
    public n2 c(@dl.d List<? extends b0> allFactories) {
        Looper mainLooper = Looper.getMainLooper();
        if (mainLooper != null) {
            return new HandlerContext(f.d(mainLooper, true), null, 2, null);
        }
        throw new IllegalStateException("The main looper is not available");
    }
}
