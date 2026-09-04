package androidx.compose.ui.text;

import androidx.compose.runtime.j2;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextGeometricTransform;
import com.max.hbuikit.bean.param.UiKitSpanObj;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import p1.LocaleList;

/* JADX INFO: renamed from: androidx.compose.ui.text.d0, reason: from toString */
/* JADX INFO: compiled from: SpanStyle.kt */
/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.m0
@Metadata(bv = {}, d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b=\b\u0007\u0018\u00002\u00020\u0001B¶\u0001\b\u0000\u0012\u0006\u0010:\u001a\u000206\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\b\b\u0002\u0010\u001e\u001a\u00020\t\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001f\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u0002ø\u0001\u0001¢\u0006\u0004\bn\u0010oB¬\u0001\b\u0016\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\b\b\u0002\u0010\u001e\u001a\u00020\t\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001f\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!ø\u0001\u0001¢\u0006\u0004\bn\u0010pB¸\u0001\b\u0016\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\b\b\u0002\u0010\u001e\u001a\u00020\t\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001f\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u0002ø\u0001\u0001¢\u0006\u0004\bn\u0010qBÂ\u0001\b\u0017\u0012\b\u0010)\u001a\u0004\u0018\u00010(\u0012\b\b\u0002\u0010+\u001a\u00020*\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\b\b\u0002\u0010\u001e\u001a\u00020\t\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001f\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u0002ø\u0001\u0001¢\u0006\u0004\bn\u0010rJ\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0000H\u0002J\u0014\u0010\u0007\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\u0007J\u0011\u0010\b\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0000H\u0087\u0002J³\u0001\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0017\u001a\u00020\u000b2\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\b\b\u0002\u0010\u001e\u001a\u00020\t2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001f2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b#\u0010$J¿\u0001\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0017\u001a\u00020\u000b2\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\b\b\u0002\u0010\u001e\u001a\u00020\t2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001f2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b&\u0010'JË\u0001\u0010,\u001a\u00020\u00002\b\u0010)\u001a\u0004\u0018\u00010(2\b\b\u0002\u0010+\u001a\u00020*2\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0017\u001a\u00020\u000b2\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\b\b\u0002\u0010\u001e\u001a\u00020\t2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001f2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u0002H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b,\u0010-J\u0013\u0010.\u001a\u00020\u00052\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\u0017\u0010/\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0000H\u0000¢\u0006\u0004\b/\u00100J\b\u00102\u001a\u000201H\u0016J\u000f\u00103\u001a\u000201H\u0000¢\u0006\u0004\b3\u00104J\b\u00105\u001a\u00020\u0015H\u0016R\u001a\u0010:\u001a\u0002068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b&\u00107\u001a\u0004\b8\u00109R \u0010\f\u001a\u00020\u000b8\u0006ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b#\u0010?\u001a\u0004\b@\u0010AR\"\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010ER\"\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\n\u0004\b,\u0010F\u001a\u0004\bG\u0010HR\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\bI\u0010J\u001a\u0004\bK\u0010LR\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\bM\u0010N\u001a\u0004\bO\u0010PR \u0010\u0017\u001a\u00020\u000b8\u0006ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\n\u0004\bQ\u0010<\u001a\u0004\bR\u0010>R\"\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\n\u0004\bS\u0010T\u001a\u0004\bU\u0010VR\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0006¢\u0006\f\n\u0004\bU\u0010W\u001a\u0004\bX\u0010YR \u0010\u001e\u001a\u00020\t8\u0006ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\n\u0004\bZ\u0010<\u001a\u0004\bS\u0010>R\u0019\u0010 \u001a\u0004\u0018\u00010\u001f8\u0006¢\u0006\f\n\u0004\b[\u0010\\\u001a\u0004\b]\u0010^R\u0019\u0010\"\u001a\u0004\u0018\u00010!8\u0006¢\u0006\f\n\u0004\bK\u0010_\u001a\u0004\b`\u0010aR\u0019\u0010%\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bO\u0010b\u001a\u0004\bc\u0010dR\u0019\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0006¢\u0006\f\n\u0004\b\u001d\u0010e\u001a\u0004\bf\u0010gR\u001a\u0010\n\u001a\u00020\t8Fø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b[\u0010>R\u001c\u0010)\u001a\u0004\u0018\u00010(8GX\u0087\u0004¢\u0006\f\u0012\u0004\bj\u0010k\u001a\u0004\bh\u0010iR\u001a\u0010+\u001a\u00020*8GX\u0087\u0004¢\u0006\f\u0012\u0004\bm\u0010k\u001a\u0004\bM\u0010l\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006s"}, d2 = {"Landroidx/compose/ui/text/d0;", "", "Landroidx/compose/ui/text/z;", "other", "F", "", "B", "D", "G", "Landroidx/compose/ui/graphics/l0;", "color", "Ls1/u;", com.google.android.exoplayer2.text.ttml.d.J, "Landroidx/compose/ui/text/font/k0;", com.google.android.exoplayer2.text.ttml.d.L, "Landroidx/compose/ui/text/font/g0;", com.google.android.exoplayer2.text.ttml.d.I, "Landroidx/compose/ui/text/font/h0;", "fontSynthesis", "Landroidx/compose/ui/text/font/v;", com.google.android.exoplayer2.text.ttml.d.K, "", "fontFeatureSettings", "letterSpacing", "Landroidx/compose/ui/text/style/a;", "baselineShift", "Landroidx/compose/ui/text/style/m;", "textGeometricTransform", "Lp1/f;", "localeList", UiKitSpanObj.TYPE_BACKGROUND, "Landroidx/compose/ui/text/style/i;", com.google.android.exoplayer2.text.ttml.d.P, "Landroidx/compose/ui/graphics/e2;", "shadow", ak.aF, "(JJLandroidx/compose/ui/text/font/k0;Landroidx/compose/ui/text/font/g0;Landroidx/compose/ui/text/font/h0;Landroidx/compose/ui/text/font/v;Ljava/lang/String;JLandroidx/compose/ui/text/style/a;Landroidx/compose/ui/text/style/m;Lp1/f;JLandroidx/compose/ui/text/style/i;Landroidx/compose/ui/graphics/e2;)Landroidx/compose/ui/text/d0;", "platformStyle", ak.av, "(JJLandroidx/compose/ui/text/font/k0;Landroidx/compose/ui/text/font/g0;Landroidx/compose/ui/text/font/h0;Landroidx/compose/ui/text/font/v;Ljava/lang/String;JLandroidx/compose/ui/text/style/a;Landroidx/compose/ui/text/style/m;Lp1/f;JLandroidx/compose/ui/text/style/i;Landroidx/compose/ui/graphics/e2;Landroidx/compose/ui/text/z;)Landroidx/compose/ui/text/d0;", "Landroidx/compose/ui/graphics/a0;", "brush", "", "alpha", "e", "(Landroidx/compose/ui/graphics/a0;FJLandroidx/compose/ui/text/font/k0;Landroidx/compose/ui/text/font/g0;Landroidx/compose/ui/text/font/h0;Landroidx/compose/ui/text/font/v;Ljava/lang/String;JLandroidx/compose/ui/text/style/a;Landroidx/compose/ui/text/style/m;Lp1/f;JLandroidx/compose/ui/text/style/i;Landroidx/compose/ui/graphics/e2;Landroidx/compose/ui/text/z;)Landroidx/compose/ui/text/d0;", "equals", androidx.exifinterface.media.a.W4, "(Landroidx/compose/ui/text/d0;)Z", "", "hashCode", "C", "()I", "toString", "Landroidx/compose/ui/text/style/l;", "Landroidx/compose/ui/text/style/l;", "y", "()Landroidx/compose/ui/text/style/l;", "textForegroundStyle", "b", "J", "p", "()J", "Landroidx/compose/ui/text/font/k0;", ak.aB, "()Landroidx/compose/ui/text/font/k0;", "d", "Landroidx/compose/ui/text/font/g0;", "q", "()Landroidx/compose/ui/text/font/g0;", "Landroidx/compose/ui/text/font/h0;", "r", "()Landroidx/compose/ui/text/font/h0;", "f", "Landroidx/compose/ui/text/font/v;", "n", "()Landroidx/compose/ui/text/font/v;", "g", "Ljava/lang/String;", "o", "()Ljava/lang/String;", RXScreenCaptureService.KEY_HEIGHT, "t", "i", "Landroidx/compose/ui/text/style/a;", "j", "()Landroidx/compose/ui/text/style/a;", "Landroidx/compose/ui/text/style/m;", ak.aD, "()Landroidx/compose/ui/text/style/m;", "l", "m", "Landroidx/compose/ui/text/style/i;", "x", "()Landroidx/compose/ui/text/style/i;", "Landroidx/compose/ui/graphics/e2;", RXScreenCaptureService.KEY_WIDTH, "()Landroidx/compose/ui/graphics/e2;", "Landroidx/compose/ui/text/z;", "v", "()Landroidx/compose/ui/text/z;", "Lp1/f;", ak.aG, "()Lp1/f;", "k", "()Landroidx/compose/ui/graphics/a0;", "getBrush$annotations", "()V", "()F", "getAlpha$annotations", "<init>", "(Landroidx/compose/ui/text/style/l;JLandroidx/compose/ui/text/font/k0;Landroidx/compose/ui/text/font/g0;Landroidx/compose/ui/text/font/h0;Landroidx/compose/ui/text/font/v;Ljava/lang/String;JLandroidx/compose/ui/text/style/a;Landroidx/compose/ui/text/style/m;Lp1/f;JLandroidx/compose/ui/text/style/i;Landroidx/compose/ui/graphics/e2;Landroidx/compose/ui/text/z;Lkotlin/jvm/internal/u;)V", "(JJLandroidx/compose/ui/text/font/k0;Landroidx/compose/ui/text/font/g0;Landroidx/compose/ui/text/font/h0;Landroidx/compose/ui/text/font/v;Ljava/lang/String;JLandroidx/compose/ui/text/style/a;Landroidx/compose/ui/text/style/m;Lp1/f;JLandroidx/compose/ui/text/style/i;Landroidx/compose/ui/graphics/e2;Lkotlin/jvm/internal/u;)V", "(JJLandroidx/compose/ui/text/font/k0;Landroidx/compose/ui/text/font/g0;Landroidx/compose/ui/text/font/h0;Landroidx/compose/ui/text/font/v;Ljava/lang/String;JLandroidx/compose/ui/text/style/a;Landroidx/compose/ui/text/style/m;Lp1/f;JLandroidx/compose/ui/text/style/i;Landroidx/compose/ui/graphics/e2;Landroidx/compose/ui/text/z;Lkotlin/jvm/internal/u;)V", "(Landroidx/compose/ui/graphics/a0;FJLandroidx/compose/ui/text/font/k0;Landroidx/compose/ui/text/font/g0;Landroidx/compose/ui/text/font/h0;Landroidx/compose/ui/text/font/v;Ljava/lang/String;JLandroidx/compose/ui/text/style/a;Landroidx/compose/ui/text/style/m;Lp1/f;JLandroidx/compose/ui/text/style/i;Landroidx/compose/ui/graphics/e2;Landroidx/compose/ui/text/z;Lkotlin/jvm/internal/u;)V", "ui-text_release"}, k = 1, mv = {1, 7, 1})
public final class SpanStyle {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final androidx.compose.ui.text.style.l textForegroundStyle;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final long fontSize;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @dl.e
    private final FontWeight fontWeight;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    @dl.e
    private final androidx.compose.ui.text.font.g0 fontStyle;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    @dl.e
    private final androidx.compose.ui.text.font.h0 fontSynthesis;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    @dl.e
    private final androidx.compose.ui.text.font.v fontFamily;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    @dl.e
    private final String fontFeatureSettings;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final long letterSpacing;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    @dl.e
    private final androidx.compose.ui.text.style.a baselineShift;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    @dl.e
    private final TextGeometricTransform textGeometricTransform;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from toString */
    @dl.e
    private final LocaleList localeList;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
    private final long background;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
    @dl.e
    private final androidx.compose.ui.text.style.i textDecoration;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
    @dl.e
    private final Shadow shadow;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata and from toString */
    @dl.e
    private final z platformStyle;

    private SpanStyle(long j10, long j11, FontWeight fontWeight, androidx.compose.ui.text.font.g0 g0Var, androidx.compose.ui.text.font.h0 h0Var, androidx.compose.ui.text.font.v vVar, String str, long j12, androidx.compose.ui.text.style.a aVar, TextGeometricTransform textGeometricTransform, LocaleList fVar, long j13, androidx.compose.ui.text.style.i iVar, Shadow e2Var) {
        this(androidx.compose.ui.text.style.l.INSTANCE.b(j10), j11, fontWeight, g0Var, h0Var, vVar, str, j12, aVar, textGeometricTransform, fVar, j13, iVar, e2Var, (z) null, (kotlin.jvm.internal.u) null);
    }

    public /* synthetic */ SpanStyle(long j10, long j11, FontWeight fontWeight, androidx.compose.ui.text.font.g0 g0Var, androidx.compose.ui.text.font.h0 h0Var, androidx.compose.ui.text.font.v vVar, String str, long j12, androidx.compose.ui.text.style.a aVar, TextGeometricTransform textGeometricTransform, LocaleList fVar, long j13, androidx.compose.ui.text.style.i iVar, Shadow e2Var, int i10, kotlin.jvm.internal.u uVar) {
        this((i10 & 1) != 0 ? androidx.compose.ui.graphics.l0.INSTANCE.u() : j10, (i10 & 2) != 0 ? s1.u.f139249b.b() : j11, (i10 & 4) != 0 ? null : fontWeight, (i10 & 8) != 0 ? null : g0Var, (i10 & 16) != 0 ? null : h0Var, (i10 & 32) != 0 ? null : vVar, (i10 & 64) != 0 ? null : str, (i10 & 128) != 0 ? s1.u.f139249b.b() : j12, (i10 & 256) != 0 ? null : aVar, (i10 & 512) != 0 ? null : textGeometricTransform, (i10 & 1024) != 0 ? null : fVar, (i10 & 2048) != 0 ? androidx.compose.ui.graphics.l0.INSTANCE.u() : j13, (i10 & 4096) != 0 ? null : iVar, (i10 & 8192) != 0 ? null : e2Var, (kotlin.jvm.internal.u) null);
    }

    private SpanStyle(long j10, long j11, FontWeight fontWeight, androidx.compose.ui.text.font.g0 g0Var, androidx.compose.ui.text.font.h0 h0Var, androidx.compose.ui.text.font.v vVar, String str, long j12, androidx.compose.ui.text.style.a aVar, TextGeometricTransform textGeometricTransform, LocaleList fVar, long j13, androidx.compose.ui.text.style.i iVar, Shadow e2Var, z zVar) {
        this(androidx.compose.ui.text.style.l.INSTANCE.b(j10), j11, fontWeight, g0Var, h0Var, vVar, str, j12, aVar, textGeometricTransform, fVar, j13, iVar, e2Var, zVar, (kotlin.jvm.internal.u) null);
    }

    public /* synthetic */ SpanStyle(long j10, long j11, FontWeight fontWeight, androidx.compose.ui.text.font.g0 g0Var, androidx.compose.ui.text.font.h0 h0Var, androidx.compose.ui.text.font.v vVar, String str, long j12, androidx.compose.ui.text.style.a aVar, TextGeometricTransform textGeometricTransform, LocaleList fVar, long j13, androidx.compose.ui.text.style.i iVar, Shadow e2Var, z zVar, int i10, kotlin.jvm.internal.u uVar) {
        this((i10 & 1) != 0 ? androidx.compose.ui.graphics.l0.INSTANCE.u() : j10, (i10 & 2) != 0 ? s1.u.f139249b.b() : j11, (i10 & 4) != 0 ? null : fontWeight, (i10 & 8) != 0 ? null : g0Var, (i10 & 16) != 0 ? null : h0Var, (i10 & 32) != 0 ? null : vVar, (i10 & 64) != 0 ? null : str, (i10 & 128) != 0 ? s1.u.f139249b.b() : j12, (i10 & 256) != 0 ? null : aVar, (i10 & 512) != 0 ? null : textGeometricTransform, (i10 & 1024) != 0 ? null : fVar, (i10 & 2048) != 0 ? androidx.compose.ui.graphics.l0.INSTANCE.u() : j13, (i10 & 4096) != 0 ? null : iVar, (i10 & 8192) != 0 ? null : e2Var, (i10 & 16384) != 0 ? null : zVar, (kotlin.jvm.internal.u) null);
    }

    public /* synthetic */ SpanStyle(long j10, long j11, FontWeight fontWeight, androidx.compose.ui.text.font.g0 g0Var, androidx.compose.ui.text.font.h0 h0Var, androidx.compose.ui.text.font.v vVar, String str, long j12, androidx.compose.ui.text.style.a aVar, TextGeometricTransform textGeometricTransform, LocaleList fVar, long j13, androidx.compose.ui.text.style.i iVar, Shadow e2Var, z zVar, kotlin.jvm.internal.u uVar) {
        this(j10, j11, fontWeight, g0Var, h0Var, vVar, str, j12, aVar, textGeometricTransform, fVar, j13, iVar, e2Var, zVar);
    }

    public /* synthetic */ SpanStyle(long j10, long j11, FontWeight fontWeight, androidx.compose.ui.text.font.g0 g0Var, androidx.compose.ui.text.font.h0 h0Var, androidx.compose.ui.text.font.v vVar, String str, long j12, androidx.compose.ui.text.style.a aVar, TextGeometricTransform textGeometricTransform, LocaleList fVar, long j13, androidx.compose.ui.text.style.i iVar, Shadow e2Var, kotlin.jvm.internal.u uVar) {
        this(j10, j11, fontWeight, g0Var, h0Var, vVar, str, j12, aVar, textGeometricTransform, fVar, j13, iVar, e2Var);
    }

    private SpanStyle(androidx.compose.ui.graphics.a0 a0Var, float f10, long j10, FontWeight fontWeight, androidx.compose.ui.text.font.g0 g0Var, androidx.compose.ui.text.font.h0 h0Var, androidx.compose.ui.text.font.v vVar, String str, long j11, androidx.compose.ui.text.style.a aVar, TextGeometricTransform textGeometricTransform, LocaleList fVar, long j12, androidx.compose.ui.text.style.i iVar, Shadow e2Var, z zVar) {
        this(androidx.compose.ui.text.style.l.INSTANCE.a(a0Var, f10), j10, fontWeight, g0Var, h0Var, vVar, str, j11, aVar, textGeometricTransform, fVar, j12, iVar, e2Var, zVar, (kotlin.jvm.internal.u) null);
    }

    public /* synthetic */ SpanStyle(androidx.compose.ui.graphics.a0 a0Var, float f10, long j10, FontWeight fontWeight, androidx.compose.ui.text.font.g0 g0Var, androidx.compose.ui.text.font.h0 h0Var, androidx.compose.ui.text.font.v vVar, String str, long j11, androidx.compose.ui.text.style.a aVar, TextGeometricTransform textGeometricTransform, LocaleList fVar, long j12, androidx.compose.ui.text.style.i iVar, Shadow e2Var, z zVar, int i10, kotlin.jvm.internal.u uVar) {
        this(a0Var, (i10 & 2) != 0 ? Float.NaN : f10, (i10 & 4) != 0 ? s1.u.f139249b.b() : j10, (i10 & 8) != 0 ? null : fontWeight, (i10 & 16) != 0 ? null : g0Var, (i10 & 32) != 0 ? null : h0Var, (i10 & 64) != 0 ? null : vVar, (i10 & 128) != 0 ? null : str, (i10 & 256) != 0 ? s1.u.f139249b.b() : j11, (i10 & 512) != 0 ? null : aVar, (i10 & 1024) != 0 ? null : textGeometricTransform, (i10 & 2048) != 0 ? null : fVar, (i10 & 4096) != 0 ? androidx.compose.ui.graphics.l0.INSTANCE.u() : j12, (i10 & 8192) != 0 ? null : iVar, (i10 & 16384) != 0 ? null : e2Var, (i10 & 32768) != 0 ? null : zVar, (kotlin.jvm.internal.u) null);
    }

    @g
    public /* synthetic */ SpanStyle(androidx.compose.ui.graphics.a0 a0Var, float f10, long j10, FontWeight fontWeight, androidx.compose.ui.text.font.g0 g0Var, androidx.compose.ui.text.font.h0 h0Var, androidx.compose.ui.text.font.v vVar, String str, long j11, androidx.compose.ui.text.style.a aVar, TextGeometricTransform textGeometricTransform, LocaleList fVar, long j12, androidx.compose.ui.text.style.i iVar, Shadow e2Var, z zVar, kotlin.jvm.internal.u uVar) {
        this(a0Var, f10, j10, fontWeight, g0Var, h0Var, vVar, str, j11, aVar, textGeometricTransform, fVar, j12, iVar, e2Var, zVar);
    }

    private SpanStyle(androidx.compose.ui.text.style.l lVar, long j10, FontWeight fontWeight, androidx.compose.ui.text.font.g0 g0Var, androidx.compose.ui.text.font.h0 h0Var, androidx.compose.ui.text.font.v vVar, String str, long j11, androidx.compose.ui.text.style.a aVar, TextGeometricTransform textGeometricTransform, LocaleList fVar, long j12, androidx.compose.ui.text.style.i iVar, Shadow e2Var, z zVar) {
        this.textForegroundStyle = lVar;
        this.fontSize = j10;
        this.fontWeight = fontWeight;
        this.fontStyle = g0Var;
        this.fontSynthesis = h0Var;
        this.fontFamily = vVar;
        this.fontFeatureSettings = str;
        this.letterSpacing = j11;
        this.baselineShift = aVar;
        this.textGeometricTransform = textGeometricTransform;
        this.localeList = fVar;
        this.background = j12;
        this.textDecoration = iVar;
        this.shadow = e2Var;
        this.platformStyle = zVar;
    }

    public /* synthetic */ SpanStyle(androidx.compose.ui.text.style.l lVar, long j10, FontWeight fontWeight, androidx.compose.ui.text.font.g0 g0Var, androidx.compose.ui.text.font.h0 h0Var, androidx.compose.ui.text.font.v vVar, String str, long j11, androidx.compose.ui.text.style.a aVar, TextGeometricTransform textGeometricTransform, LocaleList fVar, long j12, androidx.compose.ui.text.style.i iVar, Shadow e2Var, z zVar, int i10, kotlin.jvm.internal.u uVar) {
        this(lVar, (i10 & 2) != 0 ? s1.u.f139249b.b() : j10, (i10 & 4) != 0 ? null : fontWeight, (i10 & 8) != 0 ? null : g0Var, (i10 & 16) != 0 ? null : h0Var, (i10 & 32) != 0 ? null : vVar, (i10 & 64) != 0 ? null : str, (i10 & 128) != 0 ? s1.u.f139249b.b() : j11, (i10 & 256) != 0 ? null : aVar, (i10 & 512) != 0 ? null : textGeometricTransform, (i10 & 1024) != 0 ? null : fVar, (i10 & 2048) != 0 ? androidx.compose.ui.graphics.l0.INSTANCE.u() : j12, (i10 & 4096) != 0 ? null : iVar, (i10 & 8192) != 0 ? null : e2Var, (i10 & 16384) != 0 ? null : zVar, (kotlin.jvm.internal.u) null);
    }

    public /* synthetic */ SpanStyle(androidx.compose.ui.text.style.l lVar, long j10, FontWeight fontWeight, androidx.compose.ui.text.font.g0 g0Var, androidx.compose.ui.text.font.h0 h0Var, androidx.compose.ui.text.font.v vVar, String str, long j11, androidx.compose.ui.text.style.a aVar, TextGeometricTransform textGeometricTransform, LocaleList fVar, long j12, androidx.compose.ui.text.style.i iVar, Shadow e2Var, z zVar, kotlin.jvm.internal.u uVar) {
        this(lVar, j10, fontWeight, g0Var, h0Var, vVar, str, j11, aVar, textGeometricTransform, fVar, j12, iVar, e2Var, zVar);
    }

    private final boolean B(SpanStyle other) {
        return kotlin.jvm.internal.f0.g(this.textForegroundStyle, other.textForegroundStyle) && kotlin.jvm.internal.f0.g(this.textDecoration, other.textDecoration) && kotlin.jvm.internal.f0.g(this.shadow, other.shadow);
    }

    public static /* synthetic */ SpanStyle E(SpanStyle spanStyle, SpanStyle spanStyle2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            spanStyle2 = null;
        }
        return spanStyle.D(spanStyle2);
    }

    private final z F(z other) {
        z zVar = this.platformStyle;
        if (zVar == null) {
            return other;
        }
        return other == null ? zVar : zVar.b(other);
    }

    @g
    public static /* synthetic */ void h() {
    }

    @g
    public static /* synthetic */ void l() {
    }

    public final boolean A(@dl.d SpanStyle other) {
        kotlin.jvm.internal.f0.p(other, "other");
        if (this == other) {
            return true;
        }
        return s1.u.j(this.fontSize, other.fontSize) && kotlin.jvm.internal.f0.g(this.fontWeight, other.fontWeight) && kotlin.jvm.internal.f0.g(this.fontStyle, other.fontStyle) && kotlin.jvm.internal.f0.g(this.fontSynthesis, other.fontSynthesis) && kotlin.jvm.internal.f0.g(this.fontFamily, other.fontFamily) && kotlin.jvm.internal.f0.g(this.fontFeatureSettings, other.fontFeatureSettings) && s1.u.j(this.letterSpacing, other.letterSpacing) && kotlin.jvm.internal.f0.g(this.baselineShift, other.baselineShift) && kotlin.jvm.internal.f0.g(this.textGeometricTransform, other.textGeometricTransform) && kotlin.jvm.internal.f0.g(this.localeList, other.localeList) && androidx.compose.ui.graphics.l0.y(this.background, other.background) && kotlin.jvm.internal.f0.g(this.platformStyle, other.platformStyle);
    }

    public final int C() {
        int iO = s1.u.o(this.fontSize) * 31;
        FontWeight fontWeight = this.fontWeight;
        int weight = (iO + (fontWeight != null ? fontWeight.getWeight() : 0)) * 31;
        androidx.compose.ui.text.font.g0 g0Var = this.fontStyle;
        int iH = (weight + (g0Var != null ? androidx.compose.ui.text.font.g0.h(g0Var.j()) : 0)) * 31;
        androidx.compose.ui.text.font.h0 h0Var = this.fontSynthesis;
        int i10 = (iH + (h0Var != null ? androidx.compose.ui.text.font.h0.i(h0Var.getValue()) : 0)) * 31;
        androidx.compose.ui.text.font.v vVar = this.fontFamily;
        int iHashCode = (i10 + (vVar != null ? vVar.hashCode() : 0)) * 31;
        String str = this.fontFeatureSettings;
        int iHashCode2 = (((iHashCode + (str != null ? str.hashCode() : 0)) * 31) + s1.u.o(this.letterSpacing)) * 31;
        androidx.compose.ui.text.style.a aVar = this.baselineShift;
        int i11 = (iHashCode2 + (aVar != null ? androidx.compose.ui.text.style.a.i(aVar.k()) : 0)) * 31;
        TextGeometricTransform textGeometricTransform = this.textGeometricTransform;
        int iHashCode3 = (i11 + (textGeometricTransform != null ? textGeometricTransform.hashCode() : 0)) * 31;
        LocaleList fVar = this.localeList;
        int iHashCode4 = (((iHashCode3 + (fVar != null ? fVar.hashCode() : 0)) * 31) + androidx.compose.ui.graphics.l0.K(this.background)) * 31;
        z zVar = this.platformStyle;
        return iHashCode4 + (zVar != null ? zVar.hashCode() : 0);
    }

    @j2
    @dl.d
    public final SpanStyle D(@dl.e SpanStyle other) {
        if (other == null) {
            return this;
        }
        androidx.compose.ui.text.style.l lVarC = this.textForegroundStyle.c(other.textForegroundStyle);
        androidx.compose.ui.text.font.v vVar = other.fontFamily;
        if (vVar == null) {
            vVar = this.fontFamily;
        }
        androidx.compose.ui.text.font.v vVar2 = vVar;
        long j10 = !s1.v.s(other.fontSize) ? other.fontSize : this.fontSize;
        FontWeight fontWeight = other.fontWeight;
        if (fontWeight == null) {
            fontWeight = this.fontWeight;
        }
        FontWeight fontWeight2 = fontWeight;
        androidx.compose.ui.text.font.g0 g0Var = other.fontStyle;
        if (g0Var == null) {
            g0Var = this.fontStyle;
        }
        androidx.compose.ui.text.font.g0 g0Var2 = g0Var;
        androidx.compose.ui.text.font.h0 h0Var = other.fontSynthesis;
        if (h0Var == null) {
            h0Var = this.fontSynthesis;
        }
        androidx.compose.ui.text.font.h0 h0Var2 = h0Var;
        String str = other.fontFeatureSettings;
        if (str == null) {
            str = this.fontFeatureSettings;
        }
        String str2 = str;
        long j11 = !s1.v.s(other.letterSpacing) ? other.letterSpacing : this.letterSpacing;
        androidx.compose.ui.text.style.a aVar = other.baselineShift;
        if (aVar == null) {
            aVar = this.baselineShift;
        }
        androidx.compose.ui.text.style.a aVar2 = aVar;
        TextGeometricTransform textGeometricTransform = other.textGeometricTransform;
        if (textGeometricTransform == null) {
            textGeometricTransform = this.textGeometricTransform;
        }
        TextGeometricTransform textGeometricTransform2 = textGeometricTransform;
        LocaleList fVar = other.localeList;
        if (fVar == null) {
            fVar = this.localeList;
        }
        LocaleList fVar2 = fVar;
        long j12 = other.background;
        if (!(j12 != androidx.compose.ui.graphics.l0.INSTANCE.u())) {
            j12 = this.background;
        }
        long j13 = j12;
        androidx.compose.ui.text.style.i iVar = other.textDecoration;
        if (iVar == null) {
            iVar = this.textDecoration;
        }
        androidx.compose.ui.text.style.i iVar2 = iVar;
        Shadow e2Var = other.shadow;
        if (e2Var == null) {
            e2Var = this.shadow;
        }
        return new SpanStyle(lVarC, j10, fontWeight2, g0Var2, h0Var2, vVar2, str2, j11, aVar2, textGeometricTransform2, fVar2, j13, iVar2, e2Var, F(other.platformStyle), (kotlin.jvm.internal.u) null);
    }

    @j2
    @dl.d
    public final SpanStyle G(@dl.d SpanStyle other) {
        kotlin.jvm.internal.f0.p(other, "other");
        return D(other);
    }

    @dl.d
    public final SpanStyle a(long color, long fontSize, @dl.e FontWeight fontWeight, @dl.e androidx.compose.ui.text.font.g0 fontStyle, @dl.e androidx.compose.ui.text.font.h0 fontSynthesis, @dl.e androidx.compose.ui.text.font.v fontFamily, @dl.e String fontFeatureSettings, long letterSpacing, @dl.e androidx.compose.ui.text.style.a baselineShift, @dl.e TextGeometricTransform textGeometricTransform, @dl.e LocaleList localeList, long background, @dl.e androidx.compose.ui.text.style.i textDecoration, @dl.e Shadow shadow, @dl.e z platformStyle) {
        return new SpanStyle(androidx.compose.ui.graphics.l0.y(color, m()) ? this.textForegroundStyle : androidx.compose.ui.text.style.l.INSTANCE.b(color), fontSize, fontWeight, fontStyle, fontSynthesis, fontFamily, fontFeatureSettings, letterSpacing, baselineShift, textGeometricTransform, localeList, background, textDecoration, shadow, platformStyle, (kotlin.jvm.internal.u) null);
    }

    @dl.d
    public final SpanStyle c(long color, long fontSize, @dl.e FontWeight fontWeight, @dl.e androidx.compose.ui.text.font.g0 fontStyle, @dl.e androidx.compose.ui.text.font.h0 fontSynthesis, @dl.e androidx.compose.ui.text.font.v fontFamily, @dl.e String fontFeatureSettings, long letterSpacing, @dl.e androidx.compose.ui.text.style.a baselineShift, @dl.e TextGeometricTransform textGeometricTransform, @dl.e LocaleList localeList, long background, @dl.e androidx.compose.ui.text.style.i textDecoration, @dl.e Shadow shadow) {
        return new SpanStyle(androidx.compose.ui.graphics.l0.y(color, m()) ? this.textForegroundStyle : androidx.compose.ui.text.style.l.INSTANCE.b(color), fontSize, fontWeight, fontStyle, fontSynthesis, fontFamily, fontFeatureSettings, letterSpacing, baselineShift, textGeometricTransform, localeList, background, textDecoration, shadow, this.platformStyle, (kotlin.jvm.internal.u) null);
    }

    @dl.d
    @g
    public final SpanStyle e(@dl.e androidx.compose.ui.graphics.a0 brush, float alpha, long fontSize, @dl.e FontWeight fontWeight, @dl.e androidx.compose.ui.text.font.g0 fontStyle, @dl.e androidx.compose.ui.text.font.h0 fontSynthesis, @dl.e androidx.compose.ui.text.font.v fontFamily, @dl.e String fontFeatureSettings, long letterSpacing, @dl.e androidx.compose.ui.text.style.a baselineShift, @dl.e TextGeometricTransform textGeometricTransform, @dl.e LocaleList localeList, long background, @dl.e androidx.compose.ui.text.style.i textDecoration, @dl.e Shadow shadow, @dl.e z platformStyle) {
        return new SpanStyle(androidx.compose.ui.text.style.l.INSTANCE.a(brush, alpha), fontSize, fontWeight, fontStyle, fontSynthesis, fontFamily, fontFeatureSettings, letterSpacing, baselineShift, textGeometricTransform, localeList, background, textDecoration, shadow, platformStyle, (kotlin.jvm.internal.u) null);
    }

    public boolean equals(@dl.e Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SpanStyle)) {
            return false;
        }
        SpanStyle spanStyle = (SpanStyle) other;
        return A(spanStyle) && B(spanStyle);
    }

    @g
    public final float g() {
        return this.textForegroundStyle.getAlpha();
    }

    public int hashCode() {
        int iK = androidx.compose.ui.graphics.l0.K(m()) * 31;
        androidx.compose.ui.graphics.a0 a0VarK = k();
        int iHashCode = (((((iK + (a0VarK != null ? a0VarK.hashCode() : 0)) * 31) + Float.floatToIntBits(g())) * 31) + s1.u.o(this.fontSize)) * 31;
        FontWeight fontWeight = this.fontWeight;
        int weight = (iHashCode + (fontWeight != null ? fontWeight.getWeight() : 0)) * 31;
        androidx.compose.ui.text.font.g0 g0Var = this.fontStyle;
        int iH = (weight + (g0Var != null ? androidx.compose.ui.text.font.g0.h(g0Var.j()) : 0)) * 31;
        androidx.compose.ui.text.font.h0 h0Var = this.fontSynthesis;
        int i10 = (iH + (h0Var != null ? androidx.compose.ui.text.font.h0.i(h0Var.getValue()) : 0)) * 31;
        androidx.compose.ui.text.font.v vVar = this.fontFamily;
        int iHashCode2 = (i10 + (vVar != null ? vVar.hashCode() : 0)) * 31;
        String str = this.fontFeatureSettings;
        int iHashCode3 = (((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31) + s1.u.o(this.letterSpacing)) * 31;
        androidx.compose.ui.text.style.a aVar = this.baselineShift;
        int i11 = (iHashCode3 + (aVar != null ? androidx.compose.ui.text.style.a.i(aVar.k()) : 0)) * 31;
        TextGeometricTransform textGeometricTransform = this.textGeometricTransform;
        int iHashCode4 = (i11 + (textGeometricTransform != null ? textGeometricTransform.hashCode() : 0)) * 31;
        LocaleList fVar = this.localeList;
        int iHashCode5 = (((iHashCode4 + (fVar != null ? fVar.hashCode() : 0)) * 31) + androidx.compose.ui.graphics.l0.K(this.background)) * 31;
        androidx.compose.ui.text.style.i iVar = this.textDecoration;
        int iHashCode6 = (iHashCode5 + (iVar != null ? iVar.hashCode() : 0)) * 31;
        Shadow e2Var = this.shadow;
        int iHashCode7 = (iHashCode6 + (e2Var != null ? e2Var.hashCode() : 0)) * 31;
        z zVar = this.platformStyle;
        return iHashCode7 + (zVar != null ? zVar.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final long getBackground() {
        return this.background;
    }

    @dl.e
    /* JADX INFO: renamed from: j, reason: from getter */
    public final androidx.compose.ui.text.style.a getBaselineShift() {
        return this.baselineShift;
    }

    @dl.e
    @g
    public final androidx.compose.ui.graphics.a0 k() {
        return this.textForegroundStyle.e();
    }

    public final long m() {
        return this.textForegroundStyle.getValue();
    }

    @dl.e
    /* JADX INFO: renamed from: n, reason: from getter */
    public final androidx.compose.ui.text.font.v getFontFamily() {
        return this.fontFamily;
    }

    @dl.e
    /* JADX INFO: renamed from: o, reason: from getter */
    public final String getFontFeatureSettings() {
        return this.fontFeatureSettings;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final long getFontSize() {
        return this.fontSize;
    }

    @dl.e
    /* JADX INFO: renamed from: q, reason: from getter */
    public final androidx.compose.ui.text.font.g0 getFontStyle() {
        return this.fontStyle;
    }

    @dl.e
    /* JADX INFO: renamed from: r, reason: from getter */
    public final androidx.compose.ui.text.font.h0 getFontSynthesis() {
        return this.fontSynthesis;
    }

    @dl.e
    /* JADX INFO: renamed from: s, reason: from getter */
    public final FontWeight getFontWeight() {
        return this.fontWeight;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final long getLetterSpacing() {
        return this.letterSpacing;
    }

    @dl.d
    public String toString() {
        return "SpanStyle(color=" + ((Object) androidx.compose.ui.graphics.l0.L(m())) + ", brush=" + k() + ", alpha=" + g() + ", fontSize=" + ((Object) s1.u.u(this.fontSize)) + ", fontWeight=" + this.fontWeight + ", fontStyle=" + this.fontStyle + ", fontSynthesis=" + this.fontSynthesis + ", fontFamily=" + this.fontFamily + ", fontFeatureSettings=" + this.fontFeatureSettings + ", letterSpacing=" + ((Object) s1.u.u(this.letterSpacing)) + ", baselineShift=" + this.baselineShift + ", textGeometricTransform=" + this.textGeometricTransform + ", localeList=" + this.localeList + ", background=" + ((Object) androidx.compose.ui.graphics.l0.L(this.background)) + ", textDecoration=" + this.textDecoration + ", shadow=" + this.shadow + ", platformStyle=" + this.platformStyle + ')';
    }

    @dl.e
    /* JADX INFO: renamed from: u, reason: from getter */
    public final LocaleList getLocaleList() {
        return this.localeList;
    }

    @dl.e
    /* JADX INFO: renamed from: v, reason: from getter */
    public final z getPlatformStyle() {
        return this.platformStyle;
    }

    @dl.e
    /* JADX INFO: renamed from: w, reason: from getter */
    public final Shadow getShadow() {
        return this.shadow;
    }

    @dl.e
    /* JADX INFO: renamed from: x, reason: from getter */
    public final androidx.compose.ui.text.style.i getTextDecoration() {
        return this.textDecoration;
    }

    @dl.d
    /* JADX INFO: renamed from: y, reason: from getter */
    public final androidx.compose.ui.text.style.l getTextForegroundStyle() {
        return this.textForegroundStyle;
    }

    @dl.e
    /* JADX INFO: renamed from: z, reason: from getter */
    public final TextGeometricTransform getTextGeometricTransform() {
        return this.textGeometricTransform;
    }
}
