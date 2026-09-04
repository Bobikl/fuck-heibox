package androidx.compose.ui.graphics.vector;

import androidx.compose.ui.graphics.c1;
import androidx.compose.ui.graphics.l1;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.starlightc.ucropplus.ui.UCropPlusActivity;
import com.umeng.analytics.pro.ak;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: Vector.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\bW\u0010XJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\u0016\u0010\b\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0001J\u001e\u0010\f\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0005J\u0016\u0010\r\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0005J\f\u0010\u000f\u001a\u00020\u0002*\u00020\u000eH\u0016J\b\u0010\u0011\u001a\u00020\u0010H\u0016R!\u0010\u0015\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00010\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R6\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u0018\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u0016\u0010%\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0018\u0010)\u001a\u0004\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u0018\u0010-\u001a\u0004\u0018\u00010*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R*\u00103\u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00020\u00108\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b#\u00100\"\u0004\b1\u00102R*\u0010:\u001a\u0002042\u0006\u0010\u001c\u001a\u0002048\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b.\u00107\"\u0004\b8\u00109R*\u0010=\u001a\u0002042\u0006\u0010\u001c\u001a\u0002048\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b;\u00106\u001a\u0004\b+\u00107\"\u0004\b<\u00109R*\u0010A\u001a\u0002042\u0006\u0010\u001c\u001a\u0002048\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b>\u00106\u001a\u0004\b?\u00107\"\u0004\b@\u00109R*\u0010D\u001a\u0002042\u0006\u0010\u001c\u001a\u0002048\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bB\u00106\u001a\u0004\b5\u00107\"\u0004\bC\u00109R*\u0010G\u001a\u0002042\u0006\u0010\u001c\u001a\u0002048\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bE\u00106\u001a\u0004\b;\u00107\"\u0004\bF\u00109R*\u0010I\u001a\u0002042\u0006\u0010\u001c\u001a\u0002048\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u00106\u001a\u0004\b>\u00107\"\u0004\bH\u00109R*\u0010K\u001a\u0002042\u0006\u0010\u001c\u001a\u0002048\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u00106\u001a\u0004\bB\u00107\"\u0004\bJ\u00109R\u0016\u0010L\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010$R\u0014\u0010N\u001a\u00020\"8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bE\u0010MR:\u0010P\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010O2\u000e\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010O8\u0010@PX\u0090\u000e¢\u0006\u0012\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010S\"\u0004\b\u0017\u0010TR\u0011\u0010V\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b'\u0010U\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006Y"}, d2 = {"Landroidx/compose/ui/graphics/vector/b;", "Landroidx/compose/ui/graphics/vector/j;", "Lkotlin/b2;", "B", "C", "", UCropPlusActivity.ARG_INDEX, "instance", "p", "from", "to", "count", "q", "r", "Landroidx/compose/ui/graphics/drawscope/g;", ak.av, "", "toString", "Landroidx/compose/ui/graphics/c1;", ak.aF, "[F", "groupMatrix", "", "d", "Ljava/util/List;", "children", "", "Landroidx/compose/ui/graphics/vector/f;", "value", "e", "()Ljava/util/List;", ak.aB, "(Ljava/util/List;)V", "clipPathData", "", "f", "Z", "isClipPathDirty", "Landroidx/compose/ui/graphics/l1;", "g", "Landroidx/compose/ui/graphics/l1;", "clipPath", "Landroidx/compose/ui/graphics/vector/h;", RXScreenCaptureService.KEY_HEIGHT, "Landroidx/compose/ui/graphics/vector/h;", "parser", "j", "Ljava/lang/String;", "()Ljava/lang/String;", "t", "(Ljava/lang/String;)V", "name", "", "k", "F", "()F", RXScreenCaptureService.KEY_WIDTH, "(F)V", androidx.constraintlayout.motion.widget.f.f18721i, "l", ak.aG, "pivotX", "m", "i", "v", "pivotY", "n", "x", "scaleX", "o", "y", "scaleY", ak.aD, "translationX", androidx.exifinterface.media.a.W4, "translationY", "isMatrixDirty", "()Z", "willClipPath", "Lkotlin/Function0;", "invalidateListener", "Lyh/a;", "b", "()Lyh/a;", "(Lyh/a;)V", "()I", "numChildren", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 7, 1})
public final class b extends j {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private float[] groupMatrix;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final List<j> children;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private List<? extends f> clipPathData;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private boolean isClipPathDirty;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private l1 clipPath;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private h parser;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @dl.e
    private yh.a<b2> f14145i;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private String name;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private float rotation;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private float pivotX;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private float pivotY;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private float scaleX;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private float scaleY;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private float translationX;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private float translationY;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private boolean isMatrixDirty;

    public b() {
        super(null);
        this.children = new ArrayList();
        this.clipPathData = p.h();
        this.isClipPathDirty = true;
        this.name = "";
        this.scaleX = 1.0f;
        this.scaleY = 1.0f;
        this.isMatrixDirty = true;
    }

    private final void B() {
        if (o()) {
            h hVar = this.parser;
            if (hVar == null) {
                hVar = new h();
                this.parser = hVar;
            } else {
                hVar.e();
            }
            l1 l1VarA = this.clipPath;
            if (l1VarA == null) {
                l1VarA = androidx.compose.ui.graphics.o.a();
                this.clipPath = l1VarA;
            } else {
                l1VarA.reset();
            }
            hVar.b(this.clipPathData).D(l1VarA);
        }
    }

    private final void C() {
        float[] fArrC = this.groupMatrix;
        if (fArrC == null) {
            fArrC = c1.c(null, 1, null);
            this.groupMatrix = fArrC;
        } else {
            c1.m(fArrC);
        }
        c1.x(fArrC, this.pivotX + this.translationX, this.pivotY + this.translationY, 0.0f, 4, null);
        c1.p(fArrC, this.rotation);
        c1.q(fArrC, this.scaleX, this.scaleY, 1.0f);
        c1.x(fArrC, -this.pivotX, -this.pivotY, 0.0f, 4, null);
    }

    private final boolean o() {
        return !this.clipPathData.isEmpty();
    }

    public final void A(float f10) {
        this.translationY = f10;
        this.isMatrixDirty = true;
        c();
    }

    @Override // androidx.compose.ui.graphics.vector.j
    public void a(@dl.d androidx.compose.ui.graphics.drawscope.g gVar) {
        f0.p(gVar, "<this>");
        if (this.isMatrixDirty) {
            C();
            this.isMatrixDirty = false;
        }
        if (this.isClipPathDirty) {
            B();
            this.isClipPathDirty = false;
        }
        androidx.compose.ui.graphics.drawscope.e eVarM0 = gVar.M0();
        long jC = eVarM0.c();
        eVarM0.a().f();
        androidx.compose.ui.graphics.drawscope.l lVarD = eVarM0.d();
        float[] fArr = this.groupMatrix;
        if (fArr != null) {
            lVarD.d(c1.a(fArr).y());
        }
        l1 l1Var = this.clipPath;
        if (o() && l1Var != null) {
            androidx.compose.ui.graphics.drawscope.k.c(lVarD, l1Var, 0, 2, null);
        }
        List<j> list = this.children;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            list.get(i10).a(gVar);
        }
        eVarM0.a().u();
        eVarM0.b(jC);
    }

    @Override // androidx.compose.ui.graphics.vector.j
    @dl.e
    public yh.a<b2> b() {
        return this.f14145i;
    }

    @Override // androidx.compose.ui.graphics.vector.j
    public void d(@dl.e yh.a<b2> aVar) {
        this.f14145i = aVar;
        List<j> list = this.children;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            list.get(i10).d(aVar);
        }
    }

    @dl.d
    public final List<f> e() {
        return this.clipPathData;
    }

    @dl.d
    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getName() {
        return this.name;
    }

    public final int g() {
        return this.children.size();
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final float getPivotX() {
        return this.pivotX;
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final float getPivotY() {
        return this.pivotY;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final float getRotation() {
        return this.rotation;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final float getScaleX() {
        return this.scaleX;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final float getScaleY() {
        return this.scaleY;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final float getTranslationX() {
        return this.translationX;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final float getTranslationY() {
        return this.translationY;
    }

    public final void p(int i10, @dl.d j instance) {
        f0.p(instance, "instance");
        if (i10 < g()) {
            this.children.set(i10, instance);
        } else {
            this.children.add(instance);
        }
        instance.d(b());
        c();
    }

    public final void q(int i10, int i11, int i12) {
        int i13 = 0;
        if (i10 > i11) {
            while (i13 < i12) {
                j jVar = this.children.get(i10);
                this.children.remove(i10);
                this.children.add(i11, jVar);
                i11++;
                i13++;
            }
        } else {
            while (i13 < i12) {
                j jVar2 = this.children.get(i10);
                this.children.remove(i10);
                this.children.add(i11 - 1, jVar2);
                i13++;
            }
        }
        c();
    }

    public final void r(int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            if (i10 < this.children.size()) {
                this.children.get(i10).d(null);
                this.children.remove(i10);
            }
        }
        c();
    }

    public final void s(@dl.d List<? extends f> value) {
        f0.p(value, "value");
        this.clipPathData = value;
        this.isClipPathDirty = true;
        c();
    }

    public final void t(@dl.d String value) {
        f0.p(value, "value");
        this.name = value;
        c();
    }

    @dl.d
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("VGroup: ");
        sb2.append(this.name);
        List<j> list = this.children;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            j jVar = list.get(i10);
            sb2.append("\t");
            sb2.append(jVar.toString());
            sb2.append("\n");
        }
        String string = sb2.toString();
        f0.o(string, "sb.toString()");
        return string;
    }

    public final void u(float f10) {
        this.pivotX = f10;
        this.isMatrixDirty = true;
        c();
    }

    public final void v(float f10) {
        this.pivotY = f10;
        this.isMatrixDirty = true;
        c();
    }

    public final void w(float f10) {
        this.rotation = f10;
        this.isMatrixDirty = true;
        c();
    }

    public final void x(float f10) {
        this.scaleX = f10;
        this.isMatrixDirty = true;
        c();
    }

    public final void y(float f10) {
        this.scaleY = f10;
        this.isMatrixDirty = true;
        c();
    }

    public final void z(float f10) {
        this.translationX = f10;
        this.isMatrixDirty = true;
        c();
    }
}
