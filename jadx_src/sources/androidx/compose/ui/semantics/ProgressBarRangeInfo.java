package androidx.compose.ui.semantics;

import com.google.android.exoplayer2.source.rtsp.k0;
import com.umeng.analytics.pro.ak;
import fi.t;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;

/* JADX INFO: renamed from: androidx.compose.ui.semantics.f, reason: from toString */
/* JADX INFO: compiled from: SemanticsProperties.kt */
/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00112\u00020\u0001:\u0001\nB'\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\t0\u0014\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0005¢\u0006\u0004\b\u0018\u0010\u0019J\u0013\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016R\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0013\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\t0\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u000f\u0010\u0017¨\u0006\u001a"}, d2 = {"Landroidx/compose/ui/semantics/f;", "", "other", "", "equals", "", "hashCode", "", "toString", "", ak.av, "F", "b", "()F", org.apache.tools.ant.taskdefs.optional.vss.g.H2, ak.aF, "I", "d", "()I", "steps", "Lfi/f;", k0.f48802q, "Lfi/f;", "()Lfi/f;", "<init>", "(FLfi/f;I)V", "ui_release"}, k = 1, mv = {1, 7, 1})
public final class ProgressBarRangeInfo {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f16112e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final float current;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from toString */
    @dl.d
    private final fi.f<Float> range;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final int steps;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @dl.d
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.d
    private static final ProgressBarRangeInfo f16113f = new ProgressBarRangeInfo(0.0f, t.e(0.0f, 0.0f), 0, 4, null);

    /* JADX INFO: renamed from: androidx.compose.ui.semantics.f$a, reason: from kotlin metadata */
    /* JADX INFO: compiled from: SemanticsProperties.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Landroidx/compose/ui/semantics/f$a;", "", "Landroidx/compose/ui/semantics/f;", "Indeterminate", "Landroidx/compose/ui/semantics/f;", ak.av, "()Landroidx/compose/ui/semantics/f;", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 7, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(u uVar) {
            this();
        }

        @dl.d
        public final ProgressBarRangeInfo a() {
            return ProgressBarRangeInfo.f16113f;
        }
    }

    public ProgressBarRangeInfo(float f10, @dl.d fi.f<Float> range, int i10) {
        f0.p(range, "range");
        this.current = f10;
        this.range = range;
        this.steps = i10;
        if (!(!Float.isNaN(f10))) {
            throw new IllegalArgumentException("current must not be NaN".toString());
        }
    }

    public /* synthetic */ ProgressBarRangeInfo(float f10, fi.f fVar, int i10, int i11, u uVar) {
        this(f10, fVar, (i11 & 4) != 0 ? 0 : i10);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final float getCurrent() {
        return this.current;
    }

    @dl.d
    public final fi.f<Float> c() {
        return this.range;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getSteps() {
        return this.steps;
    }

    public boolean equals(@dl.e Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProgressBarRangeInfo)) {
            return false;
        }
        ProgressBarRangeInfo progressBarRangeInfo = (ProgressBarRangeInfo) other;
        return ((this.current > progressBarRangeInfo.current ? 1 : (this.current == progressBarRangeInfo.current ? 0 : -1)) == 0) && f0.g(this.range, progressBarRangeInfo.range) && this.steps == progressBarRangeInfo.steps;
    }

    public int hashCode() {
        return (((Float.floatToIntBits(this.current) * 31) + this.range.hashCode()) * 31) + this.steps;
    }

    @dl.d
    public String toString() {
        return "ProgressBarRangeInfo(current=" + this.current + ", range=" + this.range + ", steps=" + this.steps + ')';
    }
}
