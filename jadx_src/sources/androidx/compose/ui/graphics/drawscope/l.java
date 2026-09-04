package androidx.compose.ui.graphics.drawscope;

import androidx.compose.ui.graphics.l1;
import com.max.hbuikit.bean.param.UiKitSpanObj;
import com.max.xiaoheihe.okflutter.containers.FlutterActivityLaunchConfigs;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: DrawTransform.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\bg\u0018\u00002\u00020\u0001J(\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H&JG\u0010\u000b\u001a\u00020\u00072\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\tH&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\n\u001a\u00020\tH&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001c\u0010\u0011\u001a\u00020\u00072\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002H&J'\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u00022\b\b\u0002\u0010\u0014\u001a\u00020\u0013H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0015\u0010\u0016J/\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00022\b\b\u0002\u0010\u0014\u001a\u00020\u0013H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001d\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u001bH&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001d\u0010\u001eR\u001d\u0010\"\u001a\u00020\u001f8&X¦\u0004ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b \u0010!R\u001d\u0010$\u001a\u00020\u00138VX\u0096\u0004ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b#\u0010!ø\u0001\u0003\u0082\u0002\u0015\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!\n\u0004\b!0\u0001¨\u0006%À\u0006\u0003"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/l;", "", "", com.google.android.exoplayer2.text.ttml.d.f49793l0, "top", com.google.android.exoplayer2.text.ttml.d.f49796n0, "bottom", "Lkotlin/b2;", RXScreenCaptureService.KEY_HEIGHT, "Landroidx/compose/ui/graphics/k0;", "clipOp", ak.av, "(FFFFI)V", "Landroidx/compose/ui/graphics/l1;", FlutterActivityLaunchConfigs.EXTRA_PATH, "e", "(Landroidx/compose/ui/graphics/l1;I)V", "b", "degrees", "Lb1/f;", "pivot", "g", "(FJ)V", "scaleX", "scaleY", "f", "(FFJ)V", "Landroidx/compose/ui/graphics/c1;", "matrix", "d", "([F)V", "Lb1/m;", ak.aF, "()J", UiKitSpanObj.TYPE_SIZE, "I", com.google.android.exoplayer2.text.ttml.d.f49794m0, "ui-graphics_release"}, k = 1, mv = {1, 7, 1})
@i
public interface l {

    /* JADX INFO: compiled from: DrawTransform.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class a {
        @Deprecated
        public static long c(@dl.d l lVar) {
            return k.a(lVar);
        }
    }

    long I();

    void a(float left, float top, float right, float bottom, int clipOp);

    void b(float f10, float f11);

    long c();

    void d(@dl.d float[] matrix);

    void e(@dl.d l1 path, int clipOp);

    void f(float scaleX, float scaleY, long pivot);

    void g(float degrees, long pivot);

    void h(float f10, float f11, float f12, float f13);
}
