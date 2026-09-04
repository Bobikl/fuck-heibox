package androidx.compose.ui.graphics.drawscope;

import androidx.compose.ui.graphics.d0;
import androidx.compose.ui.graphics.l1;
import com.max.hbuikit.bean.param.UiKitSpanObj;
import com.max.xiaoheihe.okflutter.containers.FlutterActivityLaunchConfigs;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: CanvasDrawScope.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\f\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/e;", "Landroidx/compose/ui/graphics/drawscope/l;", ak.aF, "ui-graphics_release"}, k = 2, mv = {1, 7, 1})
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private static final s1.e f13820a = s1.g.a(1.0f, 1.0f);

    /* JADX INFO: compiled from: CanvasDrawScope.kt */
    @Metadata(bv = {}, d1 = {"\u0000?\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J(\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016J=\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\fJ%\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\tH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J%\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0013H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0015\u0010\u0016J-\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0013H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001d\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u001bH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001d\u0010\u001eR\u001d\u0010\"\u001a\u00020\u001f8VX\u0096\u0004ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b \u0010!R\u001d\u0010$\u001a\u00020\u00138VX\u0096\u0004ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b#\u0010!\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006%"}, d2 = {"androidx/compose/ui/graphics/drawscope/b$a", "Landroidx/compose/ui/graphics/drawscope/l;", "", com.google.android.exoplayer2.text.ttml.d.f49793l0, "top", com.google.android.exoplayer2.text.ttml.d.f49796n0, "bottom", "Lkotlin/b2;", RXScreenCaptureService.KEY_HEIGHT, "Landroidx/compose/ui/graphics/k0;", "clipOp", ak.av, "(FFFFI)V", "Landroidx/compose/ui/graphics/l1;", FlutterActivityLaunchConfigs.EXTRA_PATH, "e", "(Landroidx/compose/ui/graphics/l1;I)V", "b", "degrees", "Lb1/f;", "pivot", "g", "(FJ)V", "scaleX", "scaleY", "f", "(FFJ)V", "Landroidx/compose/ui/graphics/c1;", "matrix", "d", "([F)V", "Lb1/m;", ak.aF, "()J", UiKitSpanObj.TYPE_SIZE, "I", com.google.android.exoplayer2.text.ttml.d.f49794m0, "ui-graphics_release"}, k = 1, mv = {1, 7, 1})
    public static final class a implements l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ e f13821a;

        a(e eVar) {
            this.f13821a = eVar;
        }

        @Override // androidx.compose.ui.graphics.drawscope.l
        public long I() {
            return b1.n.b(c());
        }

        @Override // androidx.compose.ui.graphics.drawscope.l
        public void a(float left, float top, float right, float bottom, int clipOp) {
            this.f13821a.a().a(left, top, right, bottom, clipOp);
        }

        @Override // androidx.compose.ui.graphics.drawscope.l
        public void b(float f10, float f11) {
            this.f13821a.a().b(f10, f11);
        }

        @Override // androidx.compose.ui.graphics.drawscope.l
        public long c() {
            return this.f13821a.c();
        }

        @Override // androidx.compose.ui.graphics.drawscope.l
        public void d(@dl.d float[] matrix) {
            f0.p(matrix, "matrix");
            this.f13821a.a().C(matrix);
        }

        @Override // androidx.compose.ui.graphics.drawscope.l
        public void e(@dl.d l1 path, int clipOp) {
            f0.p(path, "path");
            this.f13821a.a().e(path, clipOp);
        }

        @Override // androidx.compose.ui.graphics.drawscope.l
        public void f(float scaleX, float scaleY, long pivot) {
            d0 d0VarA = this.f13821a.a();
            d0VarA.b(b1.f.p(pivot), b1.f.r(pivot));
            d0VarA.q(scaleX, scaleY);
            d0VarA.b(-b1.f.p(pivot), -b1.f.r(pivot));
        }

        @Override // androidx.compose.ui.graphics.drawscope.l
        public void g(float degrees, long pivot) {
            d0 d0VarA = this.f13821a.a();
            d0VarA.b(b1.f.p(pivot), b1.f.r(pivot));
            d0VarA.z(degrees);
            d0VarA.b(-b1.f.p(pivot), -b1.f.r(pivot));
        }

        @Override // androidx.compose.ui.graphics.drawscope.l
        public void h(float f10, float f11, float f12, float f13) {
            d0 d0VarA = this.f13821a.a();
            e eVar = this.f13821a;
            long jA = b1.n.a(b1.m.t(c()) - (f12 + f10), b1.m.m(c()) - (f13 + f11));
            if (!(b1.m.t(jA) >= 0.0f && b1.m.m(jA) >= 0.0f)) {
                throw new IllegalArgumentException("Width and height must be greater than or equal to zero".toString());
            }
            eVar.b(jA);
            d0VarA.b(f10, f11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final l c(e eVar) {
        return new a(eVar);
    }
}
