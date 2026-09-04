package androidx.compose.ui.graphics;

import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: renamed from: androidx.compose.ui.graphics.e2, reason: from toString */
/* JADX INFO: compiled from: Shadow.kt */
/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.m0
@Metadata(bv = {}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0013\b\u0007\u0018\u0000 \u001b2\u00020\u0001:\u0001\u0011B(\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\rø\u0001\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0013\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J1\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\rø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000f\u0010\u0010R)\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u0012\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0014R)\u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0012\n\u0004\b\u000f\u0010\u0012\u0012\u0004\b\u0018\u0010\u0016\u001a\u0004\b\u0017\u0010\u0014R \u0010\u000e\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u0012\u0004\b\u001d\u0010\u0016\u001a\u0004\b\u001b\u0010\u001c\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006 "}, d2 = {"Landroidx/compose/ui/graphics/e2;", "", "other", "", "equals", "", "hashCode", "", "toString", "Landroidx/compose/ui/graphics/l0;", "color", "Lb1/f;", androidx.constraintlayout.core.motion.utils.w.c.R, "", "blurRadius", "b", "(JJF)Landroidx/compose/ui/graphics/e2;", ak.av, "J", "f", "()J", "getColor-0d7_KjU$annotations", "()V", RXScreenCaptureService.KEY_HEIGHT, "getOffset-F1C5BW0$annotations", ak.aF, "F", "d", "()F", "getBlurRadius$annotations", "<init>", "(JJFLkotlin/jvm/internal/u;)V", "ui-graphics_release"}, k = 1, mv = {1, 7, 1})
public final class Shadow {

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @dl.d
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    private static final Shadow f13842e = new Shadow(0, 0, 0.0f, 7, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final long color;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final long offset;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final float blurRadius;

    /* JADX INFO: renamed from: androidx.compose.ui.graphics.e2$a, reason: from kotlin metadata */
    /* JADX INFO: compiled from: Shadow.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\bR \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u0012\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Landroidx/compose/ui/graphics/e2$a;", "", "Landroidx/compose/ui/graphics/e2;", d4.d.f108133a, "Landroidx/compose/ui/graphics/e2;", ak.av, "()Landroidx/compose/ui/graphics/e2;", "getNone$annotations", "()V", "<init>", "ui-graphics_release"}, k = 1, mv = {1, 7, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.u uVar) {
            this();
        }

        @androidx.compose.runtime.j2
        public static /* synthetic */ void b() {
        }

        @dl.d
        public final Shadow a() {
            return Shadow.f13842e;
        }
    }

    private Shadow(long j10, long j11, float f10) {
        this.color = j10;
        this.offset = j11;
        this.blurRadius = f10;
    }

    public /* synthetic */ Shadow(long j10, long j11, float f10, int i10, kotlin.jvm.internal.u uVar) {
        this((i10 & 1) != 0 ? n0.d(4278190080L) : j10, (i10 & 2) != 0 ? b1.f.f30364b.e() : j11, (i10 & 4) != 0 ? 0.0f : f10, null);
    }

    public /* synthetic */ Shadow(long j10, long j11, float f10, kotlin.jvm.internal.u uVar) {
        this(j10, j11, f10);
    }

    public static /* synthetic */ Shadow c(Shadow shadow, long j10, long j11, float f10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = shadow.color;
        }
        long j12 = j10;
        if ((i10 & 2) != 0) {
            j11 = shadow.offset;
        }
        long j13 = j11;
        if ((i10 & 4) != 0) {
            f10 = shadow.blurRadius;
        }
        return shadow.b(j12, j13, f10);
    }

    @androidx.compose.runtime.j2
    public static /* synthetic */ void e() {
    }

    @androidx.compose.runtime.j2
    public static /* synthetic */ void g() {
    }

    @androidx.compose.runtime.j2
    public static /* synthetic */ void i() {
    }

    @dl.d
    public final Shadow b(long color, long offset, float blurRadius) {
        return new Shadow(color, offset, blurRadius, null);
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final float getBlurRadius() {
        return this.blurRadius;
    }

    public boolean equals(@dl.e Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Shadow)) {
            return false;
        }
        Shadow shadow = (Shadow) other;
        if (l0.y(this.color, shadow.color) && b1.f.l(this.offset, shadow.offset)) {
            return (this.blurRadius > shadow.blurRadius ? 1 : (this.blurRadius == shadow.blurRadius ? 0 : -1)) == 0;
        }
        return false;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final long getColor() {
        return this.color;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final long getOffset() {
        return this.offset;
    }

    public int hashCode() {
        return (((l0.K(this.color) * 31) + b1.f.s(this.offset)) * 31) + Float.floatToIntBits(this.blurRadius);
    }

    @dl.d
    public String toString() {
        return "Shadow(color=" + ((Object) l0.L(this.color)) + ", offset=" + ((Object) b1.f.y(this.offset)) + ", blurRadius=" + this.blurRadius + ')';
    }
}
