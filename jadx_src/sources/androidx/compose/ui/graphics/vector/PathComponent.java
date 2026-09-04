package androidx.compose.ui.graphics.vector;

import androidx.compose.ui.graphics.a0;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.graphics.k1;
import androidx.compose.ui.graphics.l1;
import androidx.compose.ui.graphics.p1;
import com.max.xiaoheihe.okflutter.containers.FlutterActivityLaunchConfigs;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.b0;
import kotlin.jvm.internal.f0;
import kotlin.z;

/* JADX INFO: compiled from: Vector.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b^\u0010_J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\f\u0010\u0006\u001a\u00020\u0002*\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016R*\u0010\u0010\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00078\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR.\u0010\u0018\u001a\u0004\u0018\u00010\u00112\b\u0010\t\u001a\u0004\u0018\u00010\u00118\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R*\u0010\u001f\u001a\u00020\u00192\u0006\u0010\t\u001a\u00020\u00198\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR6\u0010'\u001a\b\u0012\u0004\u0012\u00020!0 2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020!0 8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R3\u0010-\u001a\u00020(2\u0006\u0010\t\u001a\u00020(8\u0006@FX\u0086\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b\f\u0010\u0004\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R*\u00100\u001a\u00020\u00192\u0006\u0010\t\u001a\u00020\u00198\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010\u001a\u001a\u0004\b.\u0010\u001c\"\u0004\b/\u0010\u001eR*\u00103\u001a\u00020\u00192\u0006\u0010\t\u001a\u00020\u00198\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010\u001a\u001a\u0004\b1\u0010\u001c\"\u0004\b2\u0010\u001eR.\u00107\u001a\u0004\u0018\u00010\u00112\b\u0010\t\u001a\u0004\u0018\u00010\u00118\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b4\u0010\u0013\u001a\u0004\b5\u0010\u0015\"\u0004\b6\u0010\u0017R3\u0010;\u001a\u0002082\u0006\u0010\t\u001a\u0002088\u0006@FX\u0086\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b5\u0010\u0004\u001a\u0004\b9\u0010*\"\u0004\b:\u0010,R3\u0010?\u001a\u00020<2\u0006\u0010\t\u001a\u00020<8\u0006@FX\u0086\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b.\u0010\u0004\u001a\u0004\b=\u0010*\"\u0004\b>\u0010,R*\u0010B\u001a\u00020\u00192\u0006\u0010\t\u001a\u00020\u00198\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b9\u0010\u001a\u001a\u0004\b@\u0010\u001c\"\u0004\bA\u0010\u001eR*\u0010E\u001a\u00020\u00192\u0006\u0010\t\u001a\u00020\u00198\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b=\u0010\u001a\u001a\u0004\bC\u0010\u001c\"\u0004\bD\u0010\u001eR*\u0010H\u001a\u00020\u00192\u0006\u0010\t\u001a\u00020\u00198\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b@\u0010\u001a\u001a\u0004\bF\u0010\u001c\"\u0004\bG\u0010\u001eR*\u0010J\u001a\u00020\u00192\u0006\u0010\t\u001a\u00020\u00198\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b1\u0010\u001a\u001a\u0004\bI\u0010\u001c\"\u0004\b\u001a\u0010\u001eR\u0016\u0010M\u001a\u00020K8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010LR\u0016\u0010N\u001a\u00020K8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010LR\u0016\u0010O\u001a\u00020K8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010LR\u0018\u0010R\u001a\u0004\u0018\u00010P8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010QR\u0014\u0010U\u001a\u00020S8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010TR\u0014\u0010V\u001a\u00020S8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010TR\u001b\u0010Z\u001a\u00020W8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b%\u0010X\u001a\u0004\b4\u0010YR\u0014\u0010]\u001a\u00020[8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010\\\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006`"}, d2 = {"Landroidx/compose/ui/graphics/vector/PathComponent;", "Landroidx/compose/ui/graphics/vector/j;", "Lkotlin/b2;", "H", "I", "Landroidx/compose/ui/graphics/drawscope/g;", ak.av, "", "toString", "value", ak.aF, "Ljava/lang/String;", "g", "()Ljava/lang/String;", "v", "(Ljava/lang/String;)V", "name", "Landroidx/compose/ui/graphics/a0;", "d", "Landroidx/compose/ui/graphics/a0;", "e", "()Landroidx/compose/ui/graphics/a0;", "t", "(Landroidx/compose/ui/graphics/a0;)V", "fill", "", "F", "f", "()F", ak.aG, "(F)V", "fillAlpha", "", "Landroidx/compose/ui/graphics/vector/f;", "Ljava/util/List;", RXScreenCaptureService.KEY_HEIGHT, "()Ljava/util/List;", RXScreenCaptureService.KEY_WIDTH, "(Ljava/util/List;)V", "pathData", "Landroidx/compose/ui/graphics/n1;", "i", "()I", "x", "(I)V", "pathFillType", "l", ak.aD, "strokeAlpha", "p", "D", "strokeLineWidth", "j", "k", "y", "stroke", "Landroidx/compose/ui/graphics/j2;", "m", androidx.exifinterface.media.a.W4, "strokeLineCap", "Landroidx/compose/ui/graphics/k2;", "n", "B", "strokeLineJoin", "o", "C", "strokeLineMiter", ak.aB, "G", "trimPathStart", "q", androidx.exifinterface.media.a.S4, "trimPathEnd", "r", "trimPathOffset", "", "Z", "isPathDirty", "isStrokeDirty", "isTrimPathDirty", "Landroidx/compose/ui/graphics/drawscope/p;", "Landroidx/compose/ui/graphics/drawscope/p;", "strokeStyle", "Landroidx/compose/ui/graphics/l1;", "Landroidx/compose/ui/graphics/l1;", FlutterActivityLaunchConfigs.EXTRA_PATH, "renderPath", "Landroidx/compose/ui/graphics/p1;", "Lkotlin/z;", "()Landroidx/compose/ui/graphics/p1;", "pathMeasure", "Landroidx/compose/ui/graphics/vector/h;", "Landroidx/compose/ui/graphics/vector/h;", "parser", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 7, 1})
public final class PathComponent extends j {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private String name;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private a0 fill;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private float fillAlpha;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private List<? extends f> pathData;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private int pathFillType;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private float strokeAlpha;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private float strokeLineWidth;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private a0 stroke;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private int strokeLineCap;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private int strokeLineJoin;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private float strokeLineMiter;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private float trimPathStart;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private float trimPathEnd;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private float trimPathOffset;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private boolean isPathDirty;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private boolean isStrokeDirty;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private boolean isTrimPathDirty;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private Stroke strokeStyle;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final l1 path;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final l1 renderPath;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final z pathMeasure;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final h parser;

    public PathComponent() {
        super(null);
        this.name = "";
        this.fillAlpha = 1.0f;
        this.pathData = p.h();
        this.pathFillType = p.c();
        this.strokeAlpha = 1.0f;
        this.strokeLineCap = p.d();
        this.strokeLineJoin = p.e();
        this.strokeLineMiter = 4.0f;
        this.trimPathEnd = 1.0f;
        this.isPathDirty = true;
        this.isStrokeDirty = true;
        this.isTrimPathDirty = true;
        this.path = androidx.compose.ui.graphics.o.a();
        this.renderPath = androidx.compose.ui.graphics.o.a();
        this.pathMeasure = b0.b(LazyThreadSafetyMode.NONE, new yh.a<p1>() { // from class: androidx.compose.ui.graphics.vector.PathComponent$pathMeasure$2
            @Override // yh.a
            @dl.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final p1 invoke() {
                return androidx.compose.ui.graphics.n.a();
            }
        });
        this.parser = new h();
    }

    private final void H() {
        this.parser.e();
        this.path.reset();
        this.parser.b(this.pathData).D(this.path);
        I();
    }

    private final void I() {
        this.renderPath.reset();
        if (this.trimPathStart == 0.0f) {
            if (this.trimPathEnd == 1.0f) {
                k1.c(this.renderPath, this.path, 0L, 2, null);
                return;
            }
        }
        j().b(this.path, false);
        float length = j().getLength();
        float f10 = this.trimPathStart;
        float f11 = this.trimPathOffset;
        float f12 = ((f10 + f11) % 1.0f) * length;
        float f13 = ((this.trimPathEnd + f11) % 1.0f) * length;
        if (f12 <= f13) {
            j().a(f12, f13, this.renderPath, true);
        } else {
            j().a(f12, length, this.renderPath, true);
            j().a(0.0f, f13, this.renderPath, true);
        }
    }

    private final p1 j() {
        return (p1) this.pathMeasure.getValue();
    }

    public final void A(int i10) {
        this.strokeLineCap = i10;
        this.isStrokeDirty = true;
        c();
    }

    public final void B(int i10) {
        this.strokeLineJoin = i10;
        this.isStrokeDirty = true;
        c();
    }

    public final void C(float f10) {
        this.strokeLineMiter = f10;
        this.isStrokeDirty = true;
        c();
    }

    public final void D(float f10) {
        this.strokeLineWidth = f10;
        c();
    }

    public final void E(float f10) {
        if (this.trimPathEnd == f10) {
            return;
        }
        this.trimPathEnd = f10;
        this.isTrimPathDirty = true;
        c();
    }

    public final void F(float f10) {
        if (this.trimPathOffset == f10) {
            return;
        }
        this.trimPathOffset = f10;
        this.isTrimPathDirty = true;
        c();
    }

    public final void G(float f10) {
        if (this.trimPathStart == f10) {
            return;
        }
        this.trimPathStart = f10;
        this.isTrimPathDirty = true;
        c();
    }

    @Override // androidx.compose.ui.graphics.vector.j
    public void a(@dl.d androidx.compose.ui.graphics.drawscope.g gVar) {
        f0.p(gVar, "<this>");
        if (this.isPathDirty) {
            H();
        } else if (this.isTrimPathDirty) {
            I();
        }
        this.isPathDirty = false;
        this.isTrimPathDirty = false;
        a0 a0Var = this.fill;
        if (a0Var != null) {
            androidx.compose.ui.graphics.drawscope.f.F(gVar, this.renderPath, a0Var, this.fillAlpha, null, null, 0, 56, null);
        }
        a0 a0Var2 = this.stroke;
        if (a0Var2 != null) {
            Stroke stroke = this.strokeStyle;
            if (this.isStrokeDirty || stroke == null) {
                stroke = new Stroke(this.strokeLineWidth, this.strokeLineMiter, this.strokeLineCap, this.strokeLineJoin, null, 16, null);
                this.strokeStyle = stroke;
                this.isStrokeDirty = false;
            }
            androidx.compose.ui.graphics.drawscope.f.F(gVar, this.renderPath, a0Var2, this.strokeAlpha, stroke, null, 0, 48, null);
        }
    }

    @dl.e
    /* JADX INFO: renamed from: e, reason: from getter */
    public final a0 getFill() {
        return this.fill;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final float getFillAlpha() {
        return this.fillAlpha;
    }

    @dl.d
    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @dl.d
    public final List<f> h() {
        return this.pathData;
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final int getPathFillType() {
        return this.pathFillType;
    }

    @dl.e
    /* JADX INFO: renamed from: k, reason: from getter */
    public final a0 getStroke() {
        return this.stroke;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final float getStrokeAlpha() {
        return this.strokeAlpha;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final int getStrokeLineCap() {
        return this.strokeLineCap;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final int getStrokeLineJoin() {
        return this.strokeLineJoin;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final float getStrokeLineMiter() {
        return this.strokeLineMiter;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final float getStrokeLineWidth() {
        return this.strokeLineWidth;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final float getTrimPathEnd() {
        return this.trimPathEnd;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final float getTrimPathOffset() {
        return this.trimPathOffset;
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final float getTrimPathStart() {
        return this.trimPathStart;
    }

    public final void t(@dl.e a0 a0Var) {
        this.fill = a0Var;
        c();
    }

    @dl.d
    public String toString() {
        return this.path.toString();
    }

    public final void u(float f10) {
        this.fillAlpha = f10;
        c();
    }

    public final void v(@dl.d String value) {
        f0.p(value, "value");
        this.name = value;
        c();
    }

    public final void w(@dl.d List<? extends f> value) {
        f0.p(value, "value");
        this.pathData = value;
        this.isPathDirty = true;
        c();
    }

    public final void x(int i10) {
        this.pathFillType = i10;
        this.renderPath.n(i10);
        c();
    }

    public final void y(@dl.e a0 a0Var) {
        this.stroke = a0Var;
        c();
    }

    public final void z(float f10) {
        this.strokeAlpha = f10;
        c();
    }
}
