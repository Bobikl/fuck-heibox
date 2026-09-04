package androidx.compose.ui.graphics.vector;

import androidx.compose.runtime.m0;
import androidx.compose.ui.graphics.a0;
import androidx.compose.ui.graphics.j2;
import androidx.compose.ui.graphics.k2;
import androidx.compose.ui.graphics.n1;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: ImageVector.kt */
/* JADX INFO: loaded from: classes.dex */
@m0
@Metadata(bv = {}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0007\u0018\u00002\u00020\u0001B\u009e\u0001\b\u0000\u0012\b\b\u0002\u0010\r\u001a\u00020\b\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\u0006\u0010\u0019\u001a\u00020\u0015\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001a\u0012\b\b\u0002\u0010$\u001a\u00020 \u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u001a\u0012\b\b\u0002\u0010(\u001a\u00020 \u0012\b\b\u0002\u0010*\u001a\u00020 \u0012\b\b\u0002\u0010.\u001a\u00020+\u0012\b\b\u0002\u00101\u001a\u00020/\u0012\b\b\u0002\u00104\u001a\u00020 \u0012\b\b\u0002\u00107\u001a\u00020 \u0012\b\b\u0002\u00109\u001a\u00020 \u0012\b\b\u0002\u0010<\u001a\u00020 ø\u0001\u0000¢\u0006\u0004\b=\u0010>J\u0013\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016R\u0017\u0010\r\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R \u0010\u0019\u001a\u00020\u00158\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u000b\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u001a8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010$\u001a\u00020 8\u0006¢\u0006\f\n\u0004\b\u0012\u0010!\u001a\u0004\b\"\u0010#R\u0019\u0010&\u001a\u0004\u0018\u00010\u001a8\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001c\u001a\u0004\b%\u0010\u001eR\u0017\u0010(\u001a\u00020 8\u0006¢\u0006\f\n\u0004\b%\u0010!\u001a\u0004\b'\u0010#R\u0017\u0010*\u001a\u00020 8\u0006¢\u0006\f\n\u0004\b'\u0010!\u001a\u0004\b)\u0010#R \u0010.\u001a\u00020+8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b,\u0010\u0016\u001a\u0004\b-\u0010\u0018R \u00101\u001a\u00020/8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b-\u0010\u0016\u001a\u0004\b0\u0010\u0018R\u0017\u00104\u001a\u00020 8\u0006¢\u0006\f\n\u0004\b2\u0010!\u001a\u0004\b3\u0010#R\u0017\u00107\u001a\u00020 8\u0006¢\u0006\f\n\u0004\b5\u0010!\u001a\u0004\b6\u0010#R\u0017\u00109\u001a\u00020 8\u0006¢\u0006\f\n\u0004\b0\u0010!\u001a\u0004\b8\u0010#R\u0017\u0010<\u001a\u00020 8\u0006¢\u0006\f\n\u0004\b:\u0010!\u001a\u0004\b;\u0010#\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006?"}, d2 = {"Landroidx/compose/ui/graphics/vector/r;", "Landroidx/compose/ui/graphics/vector/q;", "", "other", "", "equals", "", "hashCode", "", ak.aF, "Ljava/lang/String;", "e", "()Ljava/lang/String;", "name", "", "Landroidx/compose/ui/graphics/vector/f;", "d", "Ljava/util/List;", "g", "()Ljava/util/List;", "pathData", "Landroidx/compose/ui/graphics/n1;", "I", RXScreenCaptureService.KEY_HEIGHT, "()I", "pathFillType", "Landroidx/compose/ui/graphics/a0;", "f", "Landroidx/compose/ui/graphics/a0;", ak.av, "()Landroidx/compose/ui/graphics/a0;", "fill", "", "F", "b", "()F", "fillAlpha", "i", "stroke", "j", "strokeAlpha", ak.aG, "strokeLineWidth", "Landroidx/compose/ui/graphics/j2;", "k", "l", "strokeLineCap", "Landroidx/compose/ui/graphics/k2;", "o", "strokeLineJoin", "m", ak.aB, "strokeLineMiter", "n", "x", "trimPathStart", "v", "trimPathEnd", "p", RXScreenCaptureService.KEY_WIDTH, "trimPathOffset", "<init>", "(Ljava/lang/String;Ljava/util/List;ILandroidx/compose/ui/graphics/a0;FLandroidx/compose/ui/graphics/a0;FFIIFFFFLkotlin/jvm/internal/u;)V", "ui_release"}, k = 1, mv = {1, 7, 1})
public final class r extends q {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final String name;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final List<f> pathData;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final int pathFillType;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private final a0 fill;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final float fillAlpha;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private final a0 stroke;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final float strokeAlpha;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final float strokeLineWidth;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final int strokeLineCap;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final int strokeLineJoin;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final float strokeLineMiter;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final float trimPathStart;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final float trimPathEnd;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final float trimPathOffset;

    /* JADX WARN: Multi-variable type inference failed */
    private r(String str, List<? extends f> list, int i10, a0 a0Var, float f10, a0 a0Var2, float f11, float f12, int i11, int i12, float f13, float f14, float f15, float f16) {
        super(null);
        this.name = str;
        this.pathData = list;
        this.pathFillType = i10;
        this.fill = a0Var;
        this.fillAlpha = f10;
        this.stroke = a0Var2;
        this.strokeAlpha = f11;
        this.strokeLineWidth = f12;
        this.strokeLineCap = i11;
        this.strokeLineJoin = i12;
        this.strokeLineMiter = f13;
        this.trimPathStart = f14;
        this.trimPathEnd = f15;
        this.trimPathOffset = f16;
    }

    public /* synthetic */ r(String str, List list, int i10, a0 a0Var, float f10, a0 a0Var2, float f11, float f12, int i11, int i12, float f13, float f14, float f15, float f16, int i13, u uVar) {
        this((i13 & 1) != 0 ? "" : str, list, i10, (i13 & 8) != 0 ? null : a0Var, (i13 & 16) != 0 ? 1.0f : f10, (i13 & 32) != 0 ? null : a0Var2, (i13 & 64) != 0 ? 1.0f : f11, (i13 & 128) != 0 ? 0.0f : f12, (i13 & 256) != 0 ? p.d() : i11, (i13 & 512) != 0 ? p.e() : i12, (i13 & 1024) != 0 ? 4.0f : f13, (i13 & 2048) != 0 ? 0.0f : f14, (i13 & 4096) != 0 ? 1.0f : f15, (i13 & 8192) != 0 ? 0.0f : f16, null);
    }

    public /* synthetic */ r(String str, List list, int i10, a0 a0Var, float f10, a0 a0Var2, float f11, float f12, int i11, int i12, float f13, float f14, float f15, float f16, u uVar) {
        this(str, list, i10, a0Var, f10, a0Var2, f11, f12, i11, i12, f13, f14, f15, f16);
    }

    @dl.e
    /* JADX INFO: renamed from: a, reason: from getter */
    public final a0 getFill() {
        return this.fill;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final float getFillAlpha() {
        return this.fillAlpha;
    }

    @dl.d
    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getName() {
        return this.name;
    }

    public boolean equals(@dl.e Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || !f0.g(n0.d(r.class), n0.d(other.getClass()))) {
            return false;
        }
        r rVar = (r) other;
        if (!f0.g(this.name, rVar.name) || !f0.g(this.fill, rVar.fill)) {
            return false;
        }
        if (!(this.fillAlpha == rVar.fillAlpha) || !f0.g(this.stroke, rVar.stroke)) {
            return false;
        }
        if (!(this.strokeAlpha == rVar.strokeAlpha)) {
            return false;
        }
        if (!(this.strokeLineWidth == rVar.strokeLineWidth) || !j2.g(this.strokeLineCap, rVar.strokeLineCap) || !k2.g(this.strokeLineJoin, rVar.strokeLineJoin)) {
            return false;
        }
        if (!(this.strokeLineMiter == rVar.strokeLineMiter)) {
            return false;
        }
        if (!(this.trimPathStart == rVar.trimPathStart)) {
            return false;
        }
        if (this.trimPathEnd == rVar.trimPathEnd) {
            return ((this.trimPathOffset > rVar.trimPathOffset ? 1 : (this.trimPathOffset == rVar.trimPathOffset ? 0 : -1)) == 0) && n1.f(this.pathFillType, rVar.pathFillType) && f0.g(this.pathData, rVar.pathData);
        }
        return false;
    }

    @dl.d
    public final List<f> g() {
        return this.pathData;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final int getPathFillType() {
        return this.pathFillType;
    }

    public int hashCode() {
        int iHashCode = ((this.name.hashCode() * 31) + this.pathData.hashCode()) * 31;
        a0 a0Var = this.fill;
        int iHashCode2 = (((iHashCode + (a0Var != null ? a0Var.hashCode() : 0)) * 31) + Float.floatToIntBits(this.fillAlpha)) * 31;
        a0 a0Var2 = this.stroke;
        return ((((((((((((((((((iHashCode2 + (a0Var2 != null ? a0Var2.hashCode() : 0)) * 31) + Float.floatToIntBits(this.strokeAlpha)) * 31) + Float.floatToIntBits(this.strokeLineWidth)) * 31) + j2.h(this.strokeLineCap)) * 31) + k2.h(this.strokeLineJoin)) * 31) + Float.floatToIntBits(this.strokeLineMiter)) * 31) + Float.floatToIntBits(this.trimPathStart)) * 31) + Float.floatToIntBits(this.trimPathEnd)) * 31) + Float.floatToIntBits(this.trimPathOffset)) * 31) + n1.g(this.pathFillType);
    }

    @dl.e
    /* JADX INFO: renamed from: i, reason: from getter */
    public final a0 getStroke() {
        return this.stroke;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final float getStrokeAlpha() {
        return this.strokeAlpha;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final int getStrokeLineCap() {
        return this.strokeLineCap;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final int getStrokeLineJoin() {
        return this.strokeLineJoin;
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final float getStrokeLineMiter() {
        return this.strokeLineMiter;
    }

    /* JADX INFO: renamed from: u, reason: from getter */
    public final float getStrokeLineWidth() {
        return this.strokeLineWidth;
    }

    /* JADX INFO: renamed from: v, reason: from getter */
    public final float getTrimPathEnd() {
        return this.trimPathEnd;
    }

    /* JADX INFO: renamed from: w, reason: from getter */
    public final float getTrimPathOffset() {
        return this.trimPathOffset;
    }

    /* JADX INFO: renamed from: x, reason: from getter */
    public final float getTrimPathStart() {
        return this.trimPathStart;
    }
}
