package kotlinx.coroutines;

import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: renamed from: kotlinx.coroutines.p0, reason: from toString */
/* JADX INFO: compiled from: CoroutineName.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u0000 \u00132\u00020\u0001:\u0001\u0014B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\u0013\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tHÖ\u0003R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0015"}, d2 = {"Lkotlinx/coroutines/p0;", "Lkotlin/coroutines/a;", "", "toString", "O", "name", "R", "", "hashCode", "", "other", "", "equals", ak.aF, "Ljava/lang/String;", "c0", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;)V", "d", ak.av, "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public final /* data */ class CoroutineName extends kotlin.coroutines.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @dl.d
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final String name;

    /* JADX INFO: renamed from: kotlinx.coroutines.p0$a, reason: from kotlin metadata */
    /* JADX INFO: compiled from: CoroutineName.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lkotlinx/coroutines/p0$a;", "Lkotlin/coroutines/CoroutineContext$b;", "Lkotlinx/coroutines/p0;", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    public static final class Companion implements CoroutineContext.b<CoroutineName> {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.u uVar) {
            this();
        }
    }

    public CoroutineName(@dl.d String str) {
        super(INSTANCE);
        this.name = str;
    }

    public static /* synthetic */ CoroutineName V(CoroutineName coroutineName, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = coroutineName.name;
        }
        return coroutineName.R(str);
    }

    @dl.d
    /* JADX INFO: renamed from: O, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @dl.d
    public final CoroutineName R(@dl.d String name) {
        return new CoroutineName(name);
    }

    @dl.d
    public final String c0() {
        return this.name;
    }

    public boolean equals(@dl.e Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof CoroutineName) && kotlin.jvm.internal.f0.g(this.name, ((CoroutineName) other).name);
    }

    public int hashCode() {
        return this.name.hashCode();
    }

    @dl.d
    public String toString() {
        return "CoroutineName(" + this.name + ')';
    }
}
