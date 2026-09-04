package t0;

import androidx.compose.ui.text.font.FontWeight;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: TypeScaleTokens.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000!\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0003\b\u0092\u0001\bÀ\u0002\u0018\u00002\u00020\u0001B\u000b\b\u0002¢\u0006\u0006\b \u0001\u0010¡\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R \u0010\b\u001a\u00020\u00078\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR \u0010\f\u001a\u00020\u00078\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\f\u0010\t\u001a\u0004\b\r\u0010\u000bR \u0010\u000e\u001a\u00020\u00078\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u000e\u0010\t\u001a\u0004\b\u000f\u0010\u000bR\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0015\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0004\u001a\u0004\b\u0016\u0010\u0006R \u0010\u0017\u001a\u00020\u00078\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0017\u0010\t\u001a\u0004\b\u0018\u0010\u000bR \u0010\u0019\u001a\u00020\u00078\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0019\u0010\t\u001a\u0004\b\u001a\u0010\u000bR \u0010\u001b\u001a\u00020\u00078\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u001b\u0010\t\u001a\u0004\b\u001c\u0010\u000bR\u0017\u0010\u001d\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0012\u001a\u0004\b\u001e\u0010\u0014R\u0017\u0010\u001f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0004\u001a\u0004\b \u0010\u0006R \u0010!\u001a\u00020\u00078\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b!\u0010\t\u001a\u0004\b\"\u0010\u000bR \u0010#\u001a\u00020\u00078\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b#\u0010\t\u001a\u0004\b$\u0010\u000bR \u0010%\u001a\u00020\u00078\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b%\u0010\t\u001a\u0004\b&\u0010\u000bR\u0017\u0010'\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b'\u0010\u0012\u001a\u0004\b(\u0010\u0014R\u0017\u0010)\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b)\u0010\u0004\u001a\u0004\b*\u0010\u0006R \u0010+\u001a\u00020\u00078\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b+\u0010\t\u001a\u0004\b,\u0010\u000bR \u0010-\u001a\u00020\u00078\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b-\u0010\t\u001a\u0004\b.\u0010\u000bR \u0010/\u001a\u00020\u00078\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b/\u0010\t\u001a\u0004\b0\u0010\u000bR\u0017\u00101\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b1\u0010\u0012\u001a\u0004\b2\u0010\u0014R\u0017\u00103\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b3\u0010\u0004\u001a\u0004\b4\u0010\u0006R \u00105\u001a\u00020\u00078\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b5\u0010\t\u001a\u0004\b6\u0010\u000bR \u00107\u001a\u00020\u00078\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b7\u0010\t\u001a\u0004\b8\u0010\u000bR \u00109\u001a\u00020\u00078\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b9\u0010\t\u001a\u0004\b:\u0010\u000bR\u0017\u0010;\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b;\u0010\u0012\u001a\u0004\b<\u0010\u0014R\u0017\u0010=\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b=\u0010\u0004\u001a\u0004\b>\u0010\u0006R \u0010?\u001a\u00020\u00078\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b?\u0010\t\u001a\u0004\b@\u0010\u000bR \u0010A\u001a\u00020\u00078\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bA\u0010\t\u001a\u0004\bB\u0010\u000bR \u0010C\u001a\u00020\u00078\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bC\u0010\t\u001a\u0004\bD\u0010\u000bR\u0017\u0010E\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\bE\u0010\u0012\u001a\u0004\bF\u0010\u0014R\u0017\u0010G\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bG\u0010\u0004\u001a\u0004\bH\u0010\u0006R \u0010I\u001a\u00020\u00078\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bI\u0010\t\u001a\u0004\bJ\u0010\u000bR \u0010K\u001a\u00020\u00078\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bK\u0010\t\u001a\u0004\bL\u0010\u000bR \u0010M\u001a\u00020\u00078\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bM\u0010\t\u001a\u0004\bN\u0010\u000bR\u0017\u0010O\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\bO\u0010\u0012\u001a\u0004\bP\u0010\u0014R\u0017\u0010Q\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bQ\u0010\u0004\u001a\u0004\b\t\u0010\u0006R \u0010R\u001a\u00020\u00078\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bR\u0010\t\u001a\u0004\bS\u0010\u000bR \u0010T\u001a\u00020\u00078\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bT\u0010\t\u001a\u0004\bU\u0010\u000bR \u0010V\u001a\u00020\u00078\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bV\u0010\t\u001a\u0004\bW\u0010\u000bR\u0017\u0010X\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\bX\u0010\u0012\u001a\u0004\bY\u0010\u0014R\u0017\u0010Z\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bZ\u0010\u0004\u001a\u0004\b[\u0010\u0006R \u0010\\\u001a\u00020\u00078\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\\\u0010\t\u001a\u0004\b]\u0010\u000bR \u0010^\u001a\u00020\u00078\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b^\u0010\t\u001a\u0004\b_\u0010\u000bR \u0010`\u001a\u00020\u00078\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b`\u0010\t\u001a\u0004\ba\u0010\u000bR\u0017\u0010b\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\bb\u0010\u0012\u001a\u0004\bc\u0010\u0014R\u0017\u0010d\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bd\u0010\u0004\u001a\u0004\be\u0010\u0006R \u0010f\u001a\u00020\u00078\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bf\u0010\t\u001a\u0004\bg\u0010\u000bR \u0010h\u001a\u00020\u00078\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bh\u0010\t\u001a\u0004\bi\u0010\u000bR \u0010j\u001a\u00020\u00078\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bj\u0010\t\u001a\u0004\bk\u0010\u000bR\u0017\u0010l\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\bl\u0010\u0012\u001a\u0004\bm\u0010\u0014R\u0017\u0010n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bn\u0010\u0004\u001a\u0004\bo\u0010\u0006R \u0010p\u001a\u00020\u00078\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bp\u0010\t\u001a\u0004\bq\u0010\u000bR \u0010r\u001a\u00020\u00078\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\br\u0010\t\u001a\u0004\bs\u0010\u000bR \u0010t\u001a\u00020\u00078\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bt\u0010\t\u001a\u0004\bu\u0010\u000bR\u0017\u0010v\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\bv\u0010\u0012\u001a\u0004\bw\u0010\u0014R\u0017\u0010x\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bx\u0010\u0004\u001a\u0004\by\u0010\u0006R \u0010z\u001a\u00020\u00078\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bz\u0010\t\u001a\u0004\b{\u0010\u000bR \u0010|\u001a\u00020\u00078\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b|\u0010\t\u001a\u0004\b}\u0010\u000bR \u0010~\u001a\u00020\u00078\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b~\u0010\t\u001a\u0004\b\u007f\u0010\u000bR\u001a\u0010\u0080\u0001\u001a\u00020\u00108\u0006¢\u0006\u000e\n\u0005\b\u0080\u0001\u0010\u0012\u001a\u0005\b\u0081\u0001\u0010\u0014R\u001a\u0010\u0082\u0001\u001a\u00020\u00028\u0006¢\u0006\u000e\n\u0005\b\u0082\u0001\u0010\u0004\u001a\u0005\b\u0083\u0001\u0010\u0006R#\u0010\u0084\u0001\u001a\u00020\u00078\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\b\u0084\u0001\u0010\t\u001a\u0005\b\u0085\u0001\u0010\u000bR#\u0010\u0086\u0001\u001a\u00020\u00078\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\b\u0086\u0001\u0010\t\u001a\u0005\b\u0087\u0001\u0010\u000bR#\u0010\u0088\u0001\u001a\u00020\u00078\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\b\u0088\u0001\u0010\t\u001a\u0005\b\u0089\u0001\u0010\u000bR\u001a\u0010\u008a\u0001\u001a\u00020\u00108\u0006¢\u0006\u000e\n\u0005\b\u008a\u0001\u0010\u0012\u001a\u0005\b\u008b\u0001\u0010\u0014R\u001a\u0010\u008c\u0001\u001a\u00020\u00028\u0006¢\u0006\u000e\n\u0005\b\u008c\u0001\u0010\u0004\u001a\u0005\b\u008d\u0001\u0010\u0006R#\u0010\u008e\u0001\u001a\u00020\u00078\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\b\u008e\u0001\u0010\t\u001a\u0005\b\u008f\u0001\u0010\u000bR#\u0010\u0090\u0001\u001a\u00020\u00078\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\b\u0090\u0001\u0010\t\u001a\u0005\b\u0091\u0001\u0010\u000bR#\u0010\u0092\u0001\u001a\u00020\u00078\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\b\u0092\u0001\u0010\t\u001a\u0005\b\u0093\u0001\u0010\u000bR\u001a\u0010\u0094\u0001\u001a\u00020\u00108\u0006¢\u0006\u000e\n\u0005\b\u0094\u0001\u0010\u0012\u001a\u0005\b\u0095\u0001\u0010\u0014R\u001a\u0010\u0096\u0001\u001a\u00020\u00028\u0006¢\u0006\u000e\n\u0005\b\u0096\u0001\u0010\u0004\u001a\u0005\b\u0097\u0001\u0010\u0006R#\u0010\u0098\u0001\u001a\u00020\u00078\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\b\u0098\u0001\u0010\t\u001a\u0005\b\u0099\u0001\u0010\u000bR#\u0010\u009a\u0001\u001a\u00020\u00078\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\b\u009a\u0001\u0010\t\u001a\u0005\b\u009b\u0001\u0010\u000bR#\u0010\u009c\u0001\u001a\u00020\u00078\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\b\u009c\u0001\u0010\t\u001a\u0005\b\u009d\u0001\u0010\u000bR\u001a\u0010\u009e\u0001\u001a\u00020\u00108\u0006¢\u0006\u000e\n\u0005\b\u009e\u0001\u0010\u0012\u001a\u0005\b\u009f\u0001\u0010\u0014\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006¢\u0001"}, d2 = {"Lt0/c1;", "", "Landroidx/compose/ui/text/font/m0;", "BodyLargeFont", "Landroidx/compose/ui/text/font/m0;", ak.av, "()Landroidx/compose/ui/text/font/m0;", "Ls1/u;", "BodyLargeLineHeight", "J", "b", "()J", "BodyLargeSize", ak.aF, "BodyLargeTracking", "d", "Landroidx/compose/ui/text/font/k0;", "BodyLargeWeight", "Landroidx/compose/ui/text/font/k0;", "e", "()Landroidx/compose/ui/text/font/k0;", "BodyMediumFont", "f", "BodyMediumLineHeight", "g", "BodyMediumSize", RXScreenCaptureService.KEY_HEIGHT, "BodyMediumTracking", "i", "BodyMediumWeight", "j", "BodySmallFont", "k", "BodySmallLineHeight", "l", "BodySmallSize", "m", "BodySmallTracking", "n", "BodySmallWeight", "o", "DisplayLargeFont", "p", "DisplayLargeLineHeight", "q", "DisplayLargeSize", "r", "DisplayLargeTracking", ak.aB, "DisplayLargeWeight", "t", "DisplayMediumFont", ak.aG, "DisplayMediumLineHeight", "v", "DisplayMediumSize", RXScreenCaptureService.KEY_WIDTH, "DisplayMediumTracking", "x", "DisplayMediumWeight", "y", "DisplaySmallFont", ak.aD, "DisplaySmallLineHeight", androidx.exifinterface.media.a.W4, "DisplaySmallSize", "B", "DisplaySmallTracking", "C", "DisplaySmallWeight", "D", "HeadlineLargeFont", androidx.exifinterface.media.a.S4, "HeadlineLargeLineHeight", "F", "HeadlineLargeSize", "G", "HeadlineLargeTracking", "H", "HeadlineLargeWeight", "I", "HeadlineMediumFont", "HeadlineMediumLineHeight", "K", "HeadlineMediumSize", "L", "HeadlineMediumTracking", "M", "HeadlineMediumWeight", "N", "HeadlineSmallFont", "O", "HeadlineSmallLineHeight", "P", "HeadlineSmallSize", "Q", "HeadlineSmallTracking", "R", "HeadlineSmallWeight", androidx.exifinterface.media.a.R4, "LabelLargeFont", androidx.exifinterface.media.a.f23244d5, "LabelLargeLineHeight", "U", "LabelLargeSize", androidx.exifinterface.media.a.X4, "LabelLargeTracking", androidx.exifinterface.media.a.T4, "LabelLargeWeight", "X", "LabelMediumFont", "Y", "LabelMediumLineHeight", "Z", "LabelMediumSize", "a0", "LabelMediumTracking", "b0", "LabelMediumWeight", "c0", "LabelSmallFont", "d0", "LabelSmallLineHeight", "e0", "LabelSmallSize", "f0", "LabelSmallTracking", "g0", "LabelSmallWeight", "h0", "TitleLargeFont", "i0", "TitleLargeLineHeight", "j0", "TitleLargeSize", "k0", "TitleLargeTracking", "l0", "TitleLargeWeight", "m0", "TitleMediumFont", "n0", "TitleMediumLineHeight", "o0", "TitleMediumSize", "p0", "TitleMediumTracking", "q0", "TitleMediumWeight", "r0", "TitleSmallFont", "s0", "TitleSmallLineHeight", "t0", "TitleSmallSize", "u0", "TitleSmallTracking", "v0", "TitleSmallWeight", "w0", "<init>", "()V", "material3_release"}, k = 1, mv = {1, 7, 1})
public final class c1 {

    @dl.d
    private static final androidx.compose.ui.text.font.m0 A;
    private static final long B;
    private static final long C;
    private static final long D;

    @dl.d
    private static final FontWeight E;

    @dl.d
    private static final androidx.compose.ui.text.font.m0 F;
    private static final long G;
    private static final long H;
    private static final long I;

    @dl.d
    private static final FontWeight J;

    @dl.d
    private static final androidx.compose.ui.text.font.m0 K;
    private static final long L;
    private static final long M;
    private static final long N;

    @dl.d
    private static final FontWeight O;

    @dl.d
    private static final androidx.compose.ui.text.font.m0 P;
    private static final long Q;
    private static final long R;
    private static final long S;

    @dl.d
    private static final FontWeight T;

    @dl.d
    private static final androidx.compose.ui.text.font.m0 U;
    private static final long V;
    private static final long W;
    private static final long X;

    @dl.d
    private static final FontWeight Y;

    @dl.d
    private static final androidx.compose.ui.text.font.m0 Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final c1 f139541a = new c1();

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private static final long f139542a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private static final androidx.compose.ui.text.font.m0 f139543b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private static final long f139544b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final long f139545c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private static final long f139546c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final long f139547d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    @dl.d
    private static final FontWeight f139548d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final long f139549e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    @dl.d
    private static final androidx.compose.ui.text.font.m0 f139550e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.d
    private static final FontWeight f139551f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    private static final long f139552f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @dl.d
    private static final androidx.compose.ui.text.font.m0 f139553g;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    private static final long f139554g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final long f139555h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private static final long f139556h0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final long f139557i;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    @dl.d
    private static final FontWeight f139558i0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final long f139559j;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    @dl.d
    private static final androidx.compose.ui.text.font.m0 f139560j0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @dl.d
    private static final FontWeight f139561k;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    private static final long f139562k0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @dl.d
    private static final androidx.compose.ui.text.font.m0 f139563l;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    private static final long f139564l0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final long f139565m;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    private static final long f139566m0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final long f139567n;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    @dl.d
    private static final FontWeight f139568n0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final long f139569o;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    @dl.d
    private static final androidx.compose.ui.text.font.m0 f139570o0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @dl.d
    private static final FontWeight f139571p;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private static final long f139572p0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @dl.d
    private static final androidx.compose.ui.text.font.m0 f139573q;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    private static final long f139574q0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final long f139575r;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    private static final long f139576r0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final long f139577s;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    @dl.d
    private static final FontWeight f139578s0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final long f139579t;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    @dl.d
    private static final androidx.compose.ui.text.font.m0 f139580t0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @dl.d
    private static final FontWeight f139581u;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    private static final long f139582u0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @dl.d
    private static final androidx.compose.ui.text.font.m0 f139583v;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    private static final long f139584v0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final long f139585w;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    private static final long f139586w0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final long f139587x;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    @dl.d
    private static final FontWeight f139588x0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final long f139589y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @dl.d
    private static final FontWeight f139590z;

    static {
        d1 d1Var = d1.f139643a;
        f139543b = d1Var.b();
        f139545c = s1.v.k(24.0d);
        f139547d = s1.v.m(16);
        f139549e = s1.v.k(0.5d);
        f139551f = d1Var.e();
        f139553g = d1Var.b();
        f139555h = s1.v.k(20.0d);
        f139557i = s1.v.m(14);
        f139559j = s1.v.k(0.2d);
        f139561k = d1Var.e();
        f139563l = d1Var.b();
        f139565m = s1.v.k(16.0d);
        f139567n = s1.v.m(12);
        f139569o = s1.v.k(0.4d);
        f139571p = d1Var.e();
        f139573q = d1Var.a();
        f139575r = s1.v.k(64.0d);
        f139577s = s1.v.m(57);
        long jK = s1.v.k(0.2d);
        s1.v.b(jK);
        f139579t = s1.v.v(s1.u.l(jK), -s1.u.n(jK));
        f139581u = d1Var.e();
        f139583v = d1Var.a();
        f139585w = s1.v.k(52.0d);
        f139587x = s1.v.m(45);
        f139589y = s1.v.k(0.0d);
        f139590z = d1Var.e();
        A = d1Var.a();
        B = s1.v.k(44.0d);
        C = s1.v.m(36);
        D = s1.v.k(0.0d);
        E = d1Var.e();
        F = d1Var.a();
        G = s1.v.k(40.0d);
        H = s1.v.m(32);
        I = s1.v.k(0.0d);
        J = d1Var.e();
        K = d1Var.a();
        L = s1.v.k(36.0d);
        M = s1.v.m(28);
        N = s1.v.k(0.0d);
        O = d1Var.e();
        P = d1Var.a();
        Q = s1.v.k(32.0d);
        R = s1.v.m(24);
        S = s1.v.k(0.0d);
        T = d1Var.e();
        U = d1Var.b();
        V = s1.v.k(20.0d);
        W = s1.v.m(14);
        X = s1.v.k(0.1d);
        Y = d1Var.d();
        Z = d1Var.b();
        f139542a0 = s1.v.k(16.0d);
        f139544b0 = s1.v.m(12);
        f139546c0 = s1.v.k(0.5d);
        f139548d0 = d1Var.d();
        f139550e0 = d1Var.b();
        f139552f0 = s1.v.k(16.0d);
        f139554g0 = s1.v.m(11);
        f139556h0 = s1.v.k(0.5d);
        f139558i0 = d1Var.d();
        f139560j0 = d1Var.a();
        f139562k0 = s1.v.k(28.0d);
        f139564l0 = s1.v.m(22);
        f139566m0 = s1.v.k(0.0d);
        f139568n0 = d1Var.e();
        f139570o0 = d1Var.b();
        f139572p0 = s1.v.k(24.0d);
        f139574q0 = s1.v.m(16);
        f139576r0 = s1.v.k(0.2d);
        f139578s0 = d1Var.d();
        f139580t0 = d1Var.b();
        f139582u0 = s1.v.k(20.0d);
        f139584v0 = s1.v.m(14);
        f139586w0 = s1.v.k(0.1d);
        f139588x0 = d1Var.d();
    }

    private c1() {
    }

    public final long A() {
        return B;
    }

    public final long B() {
        return C;
    }

    public final long C() {
        return D;
    }

    @dl.d
    public final FontWeight D() {
        return E;
    }

    @dl.d
    public final androidx.compose.ui.text.font.m0 E() {
        return F;
    }

    public final long F() {
        return G;
    }

    public final long G() {
        return H;
    }

    public final long H() {
        return I;
    }

    @dl.d
    public final FontWeight I() {
        return J;
    }

    @dl.d
    public final androidx.compose.ui.text.font.m0 J() {
        return K;
    }

    public final long K() {
        return L;
    }

    public final long L() {
        return M;
    }

    public final long M() {
        return N;
    }

    @dl.d
    public final FontWeight N() {
        return O;
    }

    @dl.d
    public final androidx.compose.ui.text.font.m0 O() {
        return P;
    }

    public final long P() {
        return Q;
    }

    public final long Q() {
        return R;
    }

    public final long R() {
        return S;
    }

    @dl.d
    public final FontWeight S() {
        return T;
    }

    @dl.d
    public final androidx.compose.ui.text.font.m0 T() {
        return U;
    }

    public final long U() {
        return V;
    }

    public final long V() {
        return W;
    }

    public final long W() {
        return X;
    }

    @dl.d
    public final FontWeight X() {
        return Y;
    }

    @dl.d
    public final androidx.compose.ui.text.font.m0 Y() {
        return Z;
    }

    public final long Z() {
        return f139542a0;
    }

    @dl.d
    public final androidx.compose.ui.text.font.m0 a() {
        return f139543b;
    }

    public final long a0() {
        return f139544b0;
    }

    public final long b() {
        return f139545c;
    }

    public final long b0() {
        return f139546c0;
    }

    public final long c() {
        return f139547d;
    }

    @dl.d
    public final FontWeight c0() {
        return f139548d0;
    }

    public final long d() {
        return f139549e;
    }

    @dl.d
    public final androidx.compose.ui.text.font.m0 d0() {
        return f139550e0;
    }

    @dl.d
    public final FontWeight e() {
        return f139551f;
    }

    public final long e0() {
        return f139552f0;
    }

    @dl.d
    public final androidx.compose.ui.text.font.m0 f() {
        return f139553g;
    }

    public final long f0() {
        return f139554g0;
    }

    public final long g() {
        return f139555h;
    }

    public final long g0() {
        return f139556h0;
    }

    public final long h() {
        return f139557i;
    }

    @dl.d
    public final FontWeight h0() {
        return f139558i0;
    }

    public final long i() {
        return f139559j;
    }

    @dl.d
    public final androidx.compose.ui.text.font.m0 i0() {
        return f139560j0;
    }

    @dl.d
    public final FontWeight j() {
        return f139561k;
    }

    public final long j0() {
        return f139562k0;
    }

    @dl.d
    public final androidx.compose.ui.text.font.m0 k() {
        return f139563l;
    }

    public final long k0() {
        return f139564l0;
    }

    public final long l() {
        return f139565m;
    }

    public final long l0() {
        return f139566m0;
    }

    public final long m() {
        return f139567n;
    }

    @dl.d
    public final FontWeight m0() {
        return f139568n0;
    }

    public final long n() {
        return f139569o;
    }

    @dl.d
    public final androidx.compose.ui.text.font.m0 n0() {
        return f139570o0;
    }

    @dl.d
    public final FontWeight o() {
        return f139571p;
    }

    public final long o0() {
        return f139572p0;
    }

    @dl.d
    public final androidx.compose.ui.text.font.m0 p() {
        return f139573q;
    }

    public final long p0() {
        return f139574q0;
    }

    public final long q() {
        return f139575r;
    }

    public final long q0() {
        return f139576r0;
    }

    public final long r() {
        return f139577s;
    }

    @dl.d
    public final FontWeight r0() {
        return f139578s0;
    }

    public final long s() {
        return f139579t;
    }

    @dl.d
    public final androidx.compose.ui.text.font.m0 s0() {
        return f139580t0;
    }

    @dl.d
    public final FontWeight t() {
        return f139581u;
    }

    public final long t0() {
        return f139582u0;
    }

    @dl.d
    public final androidx.compose.ui.text.font.m0 u() {
        return f139583v;
    }

    public final long u0() {
        return f139584v0;
    }

    public final long v() {
        return f139585w;
    }

    public final long v0() {
        return f139586w0;
    }

    public final long w() {
        return f139587x;
    }

    @dl.d
    public final FontWeight w0() {
        return f139588x0;
    }

    public final long x() {
        return f139589y;
    }

    @dl.d
    public final FontWeight y() {
        return f139590z;
    }

    @dl.d
    public final androidx.compose.ui.text.font.m0 z() {
        return A;
    }
}
