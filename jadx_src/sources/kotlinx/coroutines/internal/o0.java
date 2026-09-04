package kotlinx.coroutines.internal;

import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: Symbol.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J \u0010\u0006\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0001H\u0086\b¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\b¨\u0006\f"}, d2 = {"Lkotlinx/coroutines/internal/o0;", "", "", "toString", androidx.exifinterface.media.a.f23244d5, "value", ak.av, "(Ljava/lang/Object;)Ljava/lang/Object;", "Ljava/lang/String;", "symbol", "<init>", "(Ljava/lang/String;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public final class o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.d
    @xh.e
    public final String symbol;

    public o0(@dl.d String str) {
        this.symbol = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T> T a(@dl.e Object value) {
        if (value == this) {
            return null;
        }
        return value;
    }

    @dl.d
    public String toString() {
        return kotlin.text.y.f128596e + this.symbol + kotlin.text.y.f128597f;
    }
}
