package kotlinx.coroutines;

import com.umeng.analytics.pro.ak;
import kotlin.DeprecationLevel;
import kotlin.Metadata;

/* JADX INFO: compiled from: Job.kt */
/* JADX INFO: loaded from: classes5.dex */
@kotlin.k(level = DeprecationLevel.ERROR, message = "This is internal API and may be removed in the future releases")
@z1
@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00068&X§\u0004¢\u0006\f\u0012\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"Lkotlinx/coroutines/v;", "Lkotlinx/coroutines/h1;", "", "cause", "", ak.aF, "Lkotlinx/coroutines/d2;", "getParent", "()Lkotlinx/coroutines/d2;", "getParent$annotations", "()V", "parent", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public interface v extends h1 {

    /* JADX INFO: compiled from: Job.kt */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    public static final class a {
        @z1
        public static /* synthetic */ void a() {
        }
    }

    @z1
    boolean c(@dl.d Throwable cause);

    @dl.e
    d2 getParent();
}
