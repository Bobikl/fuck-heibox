package androidx.compose.ui.graphics.drawscope;

import androidx.compose.ui.graphics.j2;
import androidx.compose.ui.graphics.k2;
import androidx.compose.ui.graphics.m1;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;

/* JADX INFO: renamed from: androidx.compose.ui.graphics.drawscope.p, reason: from toString */
/* JADX INFO: compiled from: DrawScope.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u001d2\u00020\u0001:\u0001\u000bB>\u0012\b\b\u0002\u0010\u000f\u001a\u00020\n\u0012\b\b\u0002\u0010\u0012\u001a\u00020\n\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0018\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001bø\u0001\u0000¢\u0006\u0004\b \u0010!J\u0013\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\bH\u0016R\u0017\u0010\u000f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0012\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\f\u001a\u0004\b\u0011\u0010\u000eR \u0010\u0017\u001a\u00020\u00138\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R \u0010\u001a\u001a\u00020\u00188\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u0015\u001a\u0004\b\u0019\u0010\u0016R\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u001b8\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\""}, d2 = {"Landroidx/compose/ui/graphics/drawscope/p;", "Landroidx/compose/ui/graphics/drawscope/j;", "", "other", "", "equals", "", "hashCode", "", "toString", "", ak.av, "F", "g", "()F", "width", "b", "e", "miter", "Landroidx/compose/ui/graphics/j2;", ak.aF, "I", "()I", "cap", "Landroidx/compose/ui/graphics/k2;", "d", "join", "Landroidx/compose/ui/graphics/m1;", "Landroidx/compose/ui/graphics/m1;", "f", "()Landroidx/compose/ui/graphics/m1;", "pathEffect", "<init>", "(FFIILandroidx/compose/ui/graphics/m1;Lkotlin/jvm/internal/u;)V", "ui-graphics_release"}, k = 1, mv = {1, 7, 1})
public final class Stroke extends j {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final float f13828g = 0.0f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final float f13829h = 4.0f;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final float width;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final float miter;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final int cap;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final int join;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    @dl.e
    private final m1 pathEffect;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @dl.d
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f13830i = j2.INSTANCE.a();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int f13831j = k2.INSTANCE.b();

    /* JADX INFO: renamed from: androidx.compose.ui.graphics.drawscope.p$a, reason: from kotlin metadata */
    /* JADX INFO: compiled from: DrawScope.kt */
    @Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fR \u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R \u0010\b\u001a\u00020\u00078\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\f\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0010"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/p$a;", "", "Landroidx/compose/ui/graphics/j2;", "DefaultCap", "I", ak.av, "()I", "Landroidx/compose/ui/graphics/k2;", "DefaultJoin", "b", "", "DefaultMiter", "F", "HairlineWidth", "<init>", "()V", "ui-graphics_release"}, k = 1, mv = {1, 7, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(u uVar) {
            this();
        }

        public final int a() {
            return Stroke.f13830i;
        }

        public final int b() {
            return Stroke.f13831j;
        }
    }

    private Stroke(float f10, float f11, int i10, int i11, m1 m1Var) {
        super(null);
        this.width = f10;
        this.miter = f11;
        this.cap = i10;
        this.join = i11;
        this.pathEffect = m1Var;
    }

    public /* synthetic */ Stroke(float f10, float f11, int i10, int i11, m1 m1Var, int i12, u uVar) {
        this((i12 & 1) != 0 ? 0.0f : f10, (i12 & 2) != 0 ? 4.0f : f11, (i12 & 4) != 0 ? j2.INSTANCE.a() : i10, (i12 & 8) != 0 ? k2.INSTANCE.b() : i11, (i12 & 16) != 0 ? null : m1Var, null);
    }

    public /* synthetic */ Stroke(float f10, float f11, int i10, int i11, m1 m1Var, u uVar) {
        this(f10, f11, i10, i11, m1Var);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getCap() {
        return this.cap;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getJoin() {
        return this.join;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final float getMiter() {
        return this.miter;
    }

    public boolean equals(@dl.e Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Stroke)) {
            return false;
        }
        Stroke stroke = (Stroke) other;
        if (this.width == stroke.width) {
            return ((this.miter > stroke.miter ? 1 : (this.miter == stroke.miter ? 0 : -1)) == 0) && j2.g(this.cap, stroke.cap) && k2.g(this.join, stroke.join) && f0.g(this.pathEffect, stroke.pathEffect);
        }
        return false;
    }

    @dl.e
    /* JADX INFO: renamed from: f, reason: from getter */
    public final m1 getPathEffect() {
        return this.pathEffect;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final float getWidth() {
        return this.width;
    }

    public int hashCode() {
        int iFloatToIntBits = ((((((Float.floatToIntBits(this.width) * 31) + Float.floatToIntBits(this.miter)) * 31) + j2.h(this.cap)) * 31) + k2.h(this.join)) * 31;
        m1 m1Var = this.pathEffect;
        return iFloatToIntBits + (m1Var != null ? m1Var.hashCode() : 0);
    }

    @dl.d
    public String toString() {
        return "Stroke(width=" + this.width + ", miter=" + this.miter + ", cap=" + ((Object) j2.i(this.cap)) + ", join=" + ((Object) k2.i(this.join)) + ", pathEffect=" + this.pathEffect + ')';
    }
}
