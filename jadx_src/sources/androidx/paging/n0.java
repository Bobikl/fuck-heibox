package androidx.paging;

import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: PagingConfig.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\r\u0018\u0000 \u00142\u00020\u0001:\u0001\u0003BC\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b\u0012\b\b\u0003\u0010\r\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u000f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u000b\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0004R\u0014\u0010\u000f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0004R\u0014\u0010\u0011\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0004¨\u0006\u0015"}, d2 = {"Landroidx/paging/n0;", "", "", ak.av, "I", "pageSize", "b", "prefetchDistance", "", ak.aF, "Z", "enablePlaceholders", "d", "initialLoadSize", "e", "maxSize", "f", "jumpThreshold", "<init>", "(IIZIII)V", "i", "paging-common"}, k = 1, mv = {1, 4, 2})
public final class n0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f26573g = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f26574h = 3;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @dl.d
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @xh.e
    public final int pageSize;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @xh.e
    public final int prefetchDistance;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @xh.e
    public final boolean enablePlaceholders;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @xh.e
    public final int initialLoadSize;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @xh.e
    public final int maxSize;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @xh.e
    public final int jumpThreshold;

    /* JADX INFO: renamed from: androidx.paging.n0$a, reason: from kotlin metadata */
    /* JADX INFO: compiled from: PagingConfig.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\u0007R\u0014\u0010\u0003\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\f\n\u0004\b\u0005\u0010\u0004\u0012\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Landroidx/paging/n0$a;", "", "", "DEFAULT_INITIAL_PAGE_MULTIPLIER", "I", "MAX_SIZE_UNBOUNDED", "getMAX_SIZE_UNBOUNDED$annotations", "()V", "<init>", "paging-common"}, k = 1, mv = {1, 4, 2})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.u uVar) {
            this();
        }

        public static /* synthetic */ void a() {
        }
    }

    @xh.i
    public n0(int i10) {
        this(i10, 0, false, 0, 0, 0, 62, null);
    }

    @xh.i
    public n0(int i10, @androidx.annotation.f0(from = 0) int i11) {
        this(i10, i11, false, 0, 0, 0, 60, null);
    }

    @xh.i
    public n0(int i10, @androidx.annotation.f0(from = 0) int i11, boolean z10) {
        this(i10, i11, z10, 0, 0, 0, 56, null);
    }

    @xh.i
    public n0(int i10, @androidx.annotation.f0(from = 0) int i11, boolean z10, @androidx.annotation.f0(from = 1) int i12) {
        this(i10, i11, z10, i12, 0, 0, 48, null);
    }

    @xh.i
    public n0(int i10, @androidx.annotation.f0(from = 0) int i11, boolean z10, @androidx.annotation.f0(from = 1) int i12, @androidx.annotation.f0(from = 2) int i13) {
        this(i10, i11, z10, i12, i13, 0, 32, null);
    }

    @xh.i
    public n0(int i10, @androidx.annotation.f0(from = 0) int i11, boolean z10, @androidx.annotation.f0(from = 1) int i12, @androidx.annotation.f0(from = 2) int i13, int i14) {
        this.pageSize = i10;
        this.prefetchDistance = i11;
        this.enablePlaceholders = z10;
        this.initialLoadSize = i12;
        this.maxSize = i13;
        this.jumpThreshold = i14;
        if (!z10 && i11 == 0) {
            throw new IllegalArgumentException("Placeholders and prefetch are the only ways to trigger loading of more data in PagingData, so either placeholders must be enabled, or prefetch distance must be > 0.");
        }
        if (i13 == Integer.MAX_VALUE || i13 >= (i11 * 2) + i10) {
            if (!(i14 == Integer.MIN_VALUE || i14 > 0)) {
                throw new IllegalArgumentException("jumpThreshold must be positive to enable jumps or COUNT_UNDEFINED to disable jumping.".toString());
            }
            return;
        }
        throw new IllegalArgumentException("Maximum size must be at least pageSize + 2*prefetchDist, pageSize=" + i10 + ", prefetchDist=" + i11 + ", maxSize=" + i13);
    }

    public /* synthetic */ n0(int i10, int i11, boolean z10, int i12, int i13, int i14, int i15, kotlin.jvm.internal.u uVar) {
        this(i10, (i15 & 2) != 0 ? i10 : i11, (i15 & 4) != 0 ? true : z10, (i15 & 8) != 0 ? i10 * 3 : i12, (i15 & 16) != 0 ? Integer.MAX_VALUE : i13, (i15 & 32) != 0 ? Integer.MIN_VALUE : i14);
    }
}
