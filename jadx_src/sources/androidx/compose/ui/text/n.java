package androidx.compose.ui.text;

import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.l1;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import com.umeng.socialize.net.dplus.CommonNetImpl;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: Paragraph.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H&J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0002H&J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0002H&J\u0010\u0010\r\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0002H&J\u0010\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0002H&J\u0010\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0002H&J\u0010\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0002H&J\u0010\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0002H&J\u0010\u0010\u0012\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002H&J\u001a\u0010\u0015\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u0014\u001a\u00020\u0013H&J\u0010\u0010\u0016\u001a\u00020\u00132\u0006\u0010\n\u001a\u00020\u0002H&J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H&J\u0018\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0013H&J\u0010\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0007\u001a\u00020\u0002H&J\u0010\u0010\u001c\u001a\u00020\u001a2\u0006\u0010\u0007\u001a\u00020\u0002H&J\u0010\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u000bH&J\u001d\u0010!\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u001fH&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0002H&J \u0010%\u001a\u00020$2\u0006\u0010\u0007\u001a\u00020\u0002H&ø\u0001\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b%\u0010&J?\u00100\u001a\u00020/2\u0006\u0010(\u001a\u00020'2\b\b\u0002\u0010*\u001a\u00020)2\n\b\u0002\u0010,\u001a\u0004\u0018\u00010+2\n\b\u0002\u0010.\u001a\u0004\u0018\u00010-H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b0\u00101JK\u00104\u001a\u00020/2\u0006\u0010(\u001a\u00020'2\b\b\u0002\u0010*\u001a\u00020)2\n\b\u0002\u0010,\u001a\u0004\u0018\u00010+2\n\b\u0002\u0010.\u001a\u0004\u0018\u00010-2\n\b\u0002\u00103\u001a\u0004\u0018\u000102H'ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b4\u00105JF\u00109\u001a\u00020/2\u0006\u0010(\u001a\u00020'2\u0006\u00107\u001a\u0002062\b\b\u0002\u00108\u001a\u00020\u000b2\n\b\u0002\u0010,\u001a\u0004\u0018\u00010+2\n\b\u0002\u0010.\u001a\u0004\u0018\u00010-2\n\b\u0002\u00103\u001a\u0004\u0018\u000102H'R\u0014\u0010<\u001a\u00020\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b:\u0010;R\u0014\u0010>\u001a\u00020\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b=\u0010;R\u0014\u0010@\u001a\u00020\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b?\u0010;R\u0014\u0010B\u001a\u00020\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\bA\u0010;R\u0014\u0010D\u001a\u00020\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\bC\u0010;R\u0014\u0010F\u001a\u00020\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\bE\u0010;R\u0014\u0010I\u001a\u00020\u00138&X¦\u0004¢\u0006\u0006\u001a\u0004\bG\u0010HR\u0014\u0010L\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\bJ\u0010KR\u001c\u0010P\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0M8&X¦\u0004¢\u0006\u0006\u001a\u0004\bN\u0010O\u0082\u0001\u0001Qø\u0001\u0003\u0082\u0002\u0015\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!\n\u0004\b!0\u0001¨\u0006RÀ\u0006\u0001"}, d2 = {"Landroidx/compose/ui/text/n;", "", "", com.google.android.exoplayer2.text.ttml.d.f49798o0, com.google.android.exoplayer2.text.ttml.d.f49800p0, "Landroidx/compose/ui/graphics/l1;", ak.aG, androidx.constraintlayout.core.motion.utils.w.c.R, "Lb1/i;", "p", "lineIndex", "", "n", ak.aB, "f", "o", "l", "B", "j", "", "visibleEnd", "k", "q", "y", "usePrimaryDirection", "v", "Landroidx/compose/ui/text/style/ResolvedTextDirection;", "e", ak.aD, "vertical", "m", "Lb1/f;", CommonNetImpl.POSITION, "i", "(J)I", ak.aF, "Landroidx/compose/ui/text/o0;", "g", "(I)J", "Landroidx/compose/ui/graphics/d0;", "canvas", "Landroidx/compose/ui/graphics/l0;", "color", "Landroidx/compose/ui/graphics/e2;", "shadow", "Landroidx/compose/ui/text/style/i;", com.google.android.exoplayer2.text.ttml.d.P, "Lkotlin/b2;", "C", "(Landroidx/compose/ui/graphics/d0;JLandroidx/compose/ui/graphics/e2;Landroidx/compose/ui/text/style/i;)V", "Landroidx/compose/ui/graphics/drawscope/j;", "drawStyle", RXScreenCaptureService.KEY_WIDTH, "(Landroidx/compose/ui/graphics/d0;JLandroidx/compose/ui/graphics/e2;Landroidx/compose/ui/text/style/i;Landroidx/compose/ui/graphics/drawscope/j;)V", "Landroidx/compose/ui/graphics/a0;", "brush", "alpha", "d", "getWidth", "()F", "width", "getHeight", "height", ak.av, "minIntrinsicWidth", "b", "maxIntrinsicWidth", RXScreenCaptureService.KEY_HEIGHT, "firstBaseline", "x", "lastBaseline", "t", "()Z", "didExceedMaxLines", "r", "()I", "lineCount", "", androidx.exifinterface.media.a.W4, "()Ljava/util/List;", "placeholderRects", "Landroidx/compose/ui/text/AndroidParagraph;", "ui-text_release"}, k = 1, mv = {1, 7, 1})
public interface n {
    @dl.d
    List<b1.i> A();

    float B(int lineIndex);

    void C(@dl.d androidx.compose.ui.graphics.d0 canvas, long color, @dl.e Shadow shadow, @dl.e androidx.compose.ui.text.style.i textDecoration);

    float a();

    float b();

    @dl.d
    b1.i c(int offset);

    @g
    void d(@dl.d androidx.compose.ui.graphics.d0 d0Var, @dl.d androidx.compose.ui.graphics.a0 a0Var, float f10, @dl.e Shadow e2Var, @dl.e androidx.compose.ui.text.style.i iVar, @dl.e androidx.compose.ui.graphics.drawscope.j jVar);

    @dl.d
    ResolvedTextDirection e(int offset);

    float f(int lineIndex);

    long g(int offset);

    float getHeight();

    float getWidth();

    float h();

    int i(long position);

    int j(int lineIndex);

    int k(int lineIndex, boolean visibleEnd);

    float l(int lineIndex);

    int m(float vertical);

    float n(int lineIndex);

    float o(int lineIndex);

    @dl.d
    b1.i p(int offset);

    boolean q(int lineIndex);

    int r();

    float s(int lineIndex);

    boolean t();

    @dl.d
    l1 u(int start, int end);

    float v(int offset, boolean usePrimaryDirection);

    @g
    void w(@dl.d androidx.compose.ui.graphics.d0 canvas, long color, @dl.e Shadow shadow, @dl.e androidx.compose.ui.text.style.i textDecoration, @dl.e androidx.compose.ui.graphics.drawscope.j drawStyle);

    float x();

    int y(int offset);

    @dl.d
    ResolvedTextDirection z(int offset);
}
