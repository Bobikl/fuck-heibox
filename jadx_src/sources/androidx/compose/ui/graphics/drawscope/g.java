package androidx.compose.ui.graphics.drawscope;

import androidx.compose.runtime.j2;
import androidx.compose.ui.graphics.a0;
import androidx.compose.ui.graphics.l1;
import androidx.compose.ui.graphics.m0;
import androidx.compose.ui.graphics.m1;
import androidx.compose.ui.graphics.r0;
import androidx.compose.ui.graphics.x;
import androidx.compose.ui.graphics.y0;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.constraintlayout.core.motion.utils.w;
import com.max.hbuikit.bean.param.UiKitSpanObj;
import com.max.xiaoheihe.okflutter.containers.FlutterActivityLaunchConfigs;
import com.umeng.analytics.pro.ak;
import java.util.List;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;
import kotlin.s0;
import s1.DpRect;

/* JADX INFO: compiled from: DrawScope.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000¨\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\bg\u0018\u0000 L2\u00020\u0001:\u0001eJm\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\r\u001a\u00020\u00072\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u0010H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0013\u0010\u0014Jm\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\r\u001a\u00020\u00072\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u0010H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0017\u0010\u0018J[\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0019\u001a\u00020\u00042\b\b\u0002\u0010\u001b\u001a\u00020\u001a2\b\b\u0002\u0010\r\u001a\u00020\u00072\b\b\u0002\u0010\u001d\u001a\u00020\u001c2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u0010H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ[\u0010 \u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u0019\u001a\u00020\u00042\b\b\u0002\u0010\u001b\u001a\u00020\u001a2\b\b\u0002\u0010\r\u001a\u00020\u00072\b\b\u0002\u0010\u001d\u001a\u00020\u001c2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u0010H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b \u0010!JQ\u0010$\u001a\u00020\u00122\u0006\u0010#\u001a\u00020\"2\b\b\u0002\u0010\u0019\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\u00072\b\b\u0002\u0010\u001d\u001a\u00020\u001c2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u0010H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b$\u0010%Jo\u0010,\u001a\u00020\u00122\u0006\u0010#\u001a\u00020\"2\b\b\u0002\u0010'\u001a\u00020&2\b\b\u0002\u0010)\u001a\u00020(2\b\b\u0002\u0010*\u001a\u00020&2\b\b\u0002\u0010+\u001a\u00020(2\b\b\u0002\u0010\r\u001a\u00020\u00072\b\b\u0002\u0010\u001d\u001a\u00020\u001c2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u0010H'ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b,\u0010-Jy\u00100\u001a\u00020\u00122\u0006\u0010#\u001a\u00020\"2\b\b\u0002\u0010'\u001a\u00020&2\b\b\u0002\u0010)\u001a\u00020(2\b\b\u0002\u0010*\u001a\u00020&2\b\b\u0002\u0010+\u001a\u00020(2\b\b\u0002\u0010\r\u001a\u00020\u00072\b\b\u0002\u0010\u001d\u001a\u00020\u001c2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010/\u001a\u00020.H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b0\u00101Je\u00104\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0019\u001a\u00020\u00042\b\b\u0002\u0010\u001b\u001a\u00020\u001a2\b\b\u0002\u00103\u001a\u0002022\b\b\u0002\u0010\r\u001a\u00020\u00072\b\b\u0002\u0010\u001d\u001a\u00020\u001c2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u0010H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b4\u00105Je\u00106\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u0019\u001a\u00020\u00042\b\b\u0002\u0010\u001b\u001a\u00020\u001a2\b\b\u0002\u00103\u001a\u0002022\b\b\u0002\u0010\u001d\u001a\u00020\u001c2\b\b\u0002\u0010\r\u001a\u00020\u00072\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u0010H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b6\u00107J[\u0010:\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u00108\u001a\u00020\u00072\b\b\u0002\u00109\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\u00072\b\b\u0002\u0010\u001d\u001a\u00020\u001c2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u0010H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b:\u0010;J[\u0010<\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u00108\u001a\u00020\u00072\b\b\u0002\u00109\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\u00072\b\b\u0002\u0010\u001d\u001a\u00020\u001c2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u0010H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b<\u0010=J[\u0010>\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0019\u001a\u00020\u00042\b\b\u0002\u0010\u001b\u001a\u00020\u001a2\b\b\u0002\u0010\r\u001a\u00020\u00072\b\b\u0002\u0010\u001d\u001a\u00020\u001c2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u0010H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b>\u0010\u001fJ[\u0010?\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u0019\u001a\u00020\u00042\b\b\u0002\u0010\u001b\u001a\u00020\u001a2\b\b\u0002\u0010\r\u001a\u00020\u00072\b\b\u0002\u0010\u001d\u001a\u00020\u001c2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u0010H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b?\u0010!Js\u0010D\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010@\u001a\u00020\u00072\u0006\u0010A\u001a\u00020\u00072\u0006\u0010C\u001a\u00020B2\b\b\u0002\u0010\u0019\u001a\u00020\u00042\b\b\u0002\u0010\u001b\u001a\u00020\u001a2\b\b\u0002\u0010\r\u001a\u00020\u00072\b\b\u0002\u0010\u001d\u001a\u00020\u001c2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u0010H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bD\u0010EJs\u0010F\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010@\u001a\u00020\u00072\u0006\u0010A\u001a\u00020\u00072\u0006\u0010C\u001a\u00020B2\b\b\u0002\u0010\u0019\u001a\u00020\u00042\b\b\u0002\u0010\u001b\u001a\u00020\u001a2\b\b\u0002\u0010\r\u001a\u00020\u00072\b\b\u0002\u0010\u001d\u001a\u00020\u001c2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u0010H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bF\u0010GJO\u0010J\u001a\u00020\u00122\u0006\u0010I\u001a\u00020H2\u0006\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\r\u001a\u00020\u00072\b\b\u0002\u0010\u001d\u001a\u00020\u001c2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u0010H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bJ\u0010KJO\u0010L\u001a\u00020\u00122\u0006\u0010I\u001a\u00020H2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00072\b\b\u0002\u0010\u001d\u001a\u00020\u001c2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u0010H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bL\u0010MJs\u0010R\u001a\u00020\u00122\f\u0010O\u001a\b\u0012\u0004\u0012\u00020\u00040N2\u0006\u0010Q\u001a\u00020P2\u0006\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\r\u001a\u00020\u00072\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u0010H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bR\u0010SJs\u0010T\u001a\u00020\u00122\f\u0010O\u001a\b\u0012\u0004\u0012\u00020\u00040N2\u0006\u0010Q\u001a\u00020P2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\r\u001a\u00020\u00072\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u0010H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bT\u0010UJ!\u0010Y\u001a\u00020\u001a*\u00020\u001a2\u0006\u0010V\u001a\u00020\u0004H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bW\u0010XR\u0014\u0010]\u001a\u00020Z8&X¦\u0004¢\u0006\u0006\u001a\u0004\b[\u0010\\R\u001d\u00109\u001a\u00020\u00048VX\u0096\u0004ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b^\u0010_R\u001d\u0010\u001b\u001a\u00020\u001a8VX\u0096\u0004ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b`\u0010_R\u0014\u0010d\u001a\u00020a8&X¦\u0004¢\u0006\u0006\u001a\u0004\bb\u0010cø\u0001\u0003\u0082\u0002\u0015\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!\n\u0004\b!0\u0001¨\u0006fÀ\u0006\u0003"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/g;", "Ls1/e;", "Landroidx/compose/ui/graphics/a0;", "brush", "Lb1/f;", com.google.android.exoplayer2.text.ttml.d.f49798o0, com.google.android.exoplayer2.text.ttml.d.f49800p0, "", "strokeWidth", "Landroidx/compose/ui/graphics/j2;", "cap", "Landroidx/compose/ui/graphics/m1;", "pathEffect", "alpha", "Landroidx/compose/ui/graphics/m0;", "colorFilter", "Landroidx/compose/ui/graphics/x;", "blendMode", "Lkotlin/b2;", "I1", "(Landroidx/compose/ui/graphics/a0;JJFILandroidx/compose/ui/graphics/m1;FLandroidx/compose/ui/graphics/m0;I)V", "Landroidx/compose/ui/graphics/l0;", "color", "x0", "(JJJFILandroidx/compose/ui/graphics/m1;FLandroidx/compose/ui/graphics/m0;I)V", "topLeft", "Lb1/m;", UiKitSpanObj.TYPE_SIZE, "Landroidx/compose/ui/graphics/drawscope/j;", "style", "w0", "(Landroidx/compose/ui/graphics/a0;JJFLandroidx/compose/ui/graphics/drawscope/j;Landroidx/compose/ui/graphics/m0;I)V", "u1", "(JJJFLandroidx/compose/ui/graphics/drawscope/j;Landroidx/compose/ui/graphics/m0;I)V", "Landroidx/compose/ui/graphics/y0;", "image", "t0", "(Landroidx/compose/ui/graphics/y0;JFLandroidx/compose/ui/graphics/drawscope/j;Landroidx/compose/ui/graphics/m0;I)V", "Ls1/n;", "srcOffset", "Ls1/r;", "srcSize", "dstOffset", "dstSize", "q1", "(Landroidx/compose/ui/graphics/y0;JJJJFLandroidx/compose/ui/graphics/drawscope/j;Landroidx/compose/ui/graphics/m0;I)V", "Landroidx/compose/ui/graphics/r0;", "filterQuality", "N1", "(Landroidx/compose/ui/graphics/y0;JJJJFLandroidx/compose/ui/graphics/drawscope/j;Landroidx/compose/ui/graphics/m0;II)V", "Lb1/a;", "cornerRadius", "B1", "(Landroidx/compose/ui/graphics/a0;JJJFLandroidx/compose/ui/graphics/drawscope/j;Landroidx/compose/ui/graphics/m0;I)V", "i1", "(JJJJLandroidx/compose/ui/graphics/drawscope/j;FLandroidx/compose/ui/graphics/m0;I)V", "radius", com.google.android.exoplayer2.text.ttml.d.f49794m0, "M1", "(Landroidx/compose/ui/graphics/a0;FJFLandroidx/compose/ui/graphics/drawscope/j;Landroidx/compose/ui/graphics/m0;I)V", "D0", "(JFJFLandroidx/compose/ui/graphics/drawscope/j;Landroidx/compose/ui/graphics/m0;I)V", "D1", "E0", "startAngle", "sweepAngle", "", "useCenter", "y0", "(Landroidx/compose/ui/graphics/a0;FFZJJFLandroidx/compose/ui/graphics/drawscope/j;Landroidx/compose/ui/graphics/m0;I)V", "G0", "(JFFZJJFLandroidx/compose/ui/graphics/drawscope/j;Landroidx/compose/ui/graphics/m0;I)V", "Landroidx/compose/ui/graphics/l1;", FlutterActivityLaunchConfigs.EXTRA_PATH, "z0", "(Landroidx/compose/ui/graphics/l1;JFLandroidx/compose/ui/graphics/drawscope/j;Landroidx/compose/ui/graphics/m0;I)V", "m0", "(Landroidx/compose/ui/graphics/l1;Landroidx/compose/ui/graphics/a0;FLandroidx/compose/ui/graphics/drawscope/j;Landroidx/compose/ui/graphics/m0;I)V", "", "points", "Landroidx/compose/ui/graphics/t1;", "pointMode", "G1", "(Ljava/util/List;IJFILandroidx/compose/ui/graphics/m1;FLandroidx/compose/ui/graphics/m0;I)V", "j0", "(Ljava/util/List;ILandroidx/compose/ui/graphics/a0;FILandroidx/compose/ui/graphics/m1;FLandroidx/compose/ui/graphics/m0;I)V", w.c.R, "offsetSize-PENXr5M", "(JJ)J", "offsetSize", "Landroidx/compose/ui/graphics/drawscope/e;", "M0", "()Landroidx/compose/ui/graphics/drawscope/e;", "drawContext", "I", "()J", ak.aF, "Landroidx/compose/ui/unit/LayoutDirection;", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", ak.av, "ui-graphics_release"}, k = 1, mv = {1, 7, 1})
@i
public interface g extends s1.e {

    /* JADX INFO: renamed from: m0, reason: collision with root package name and from kotlin metadata */
    @dl.d
    public static final Companion INSTANCE = Companion.f13823a;

    /* JADX INFO: renamed from: androidx.compose.ui.graphics.drawscope.g$a, reason: from kotlin metadata */
    /* JADX INFO: compiled from: DrawScope.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fR \u0010\u0007\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R \u0010\n\u001a\u00020\b8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\t\u0010\u0004\u001a\u0004\b\u0003\u0010\u0006\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\r"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/g$a;", "", "Landroidx/compose/ui/graphics/x;", "b", "I", ak.av, "()I", "DefaultBlendMode", "Landroidx/compose/ui/graphics/r0;", ak.aF, "DefaultFilterQuality", "<init>", "()V", "ui-graphics_release"}, k = 1, mv = {1, 7, 1})
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f13823a = new Companion();

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private static final int DefaultBlendMode = x.INSTANCE.B();

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private static final int DefaultFilterQuality = r0.INSTANCE.b();

        private Companion() {
        }

        public final int a() {
            return DefaultBlendMode;
        }

        public final int b() {
            return DefaultFilterQuality;
        }
    }

    /* JADX INFO: compiled from: DrawScope.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class b {
        @j2
        @Deprecated
        public static float A(@dl.d g gVar, int i10) {
            return s1.d.e(gVar, i10);
        }

        @j2
        @Deprecated
        public static long B(@dl.d g gVar, long j10) {
            return s1.d.f(gVar, j10);
        }

        @j2
        @Deprecated
        public static float C(@dl.d g gVar, long j10) {
            return s1.d.g(gVar, j10);
        }

        @j2
        @Deprecated
        public static float D(@dl.d g gVar, float f10) {
            return s1.d.h(gVar, f10);
        }

        @j2
        @dl.d
        @Deprecated
        public static b1.i E(@dl.d g gVar, @dl.d DpRect receiver) {
            f0.p(receiver, "$receiver");
            return s1.d.i(gVar, receiver);
        }

        @j2
        @Deprecated
        public static long F(@dl.d g gVar, long j10) {
            return s1.d.j(gVar, j10);
        }

        @j2
        @Deprecated
        public static long G(@dl.d g gVar, float f10) {
            return s1.d.k(gVar, f10);
        }

        @j2
        @Deprecated
        public static long H(@dl.d g gVar, float f10) {
            return s1.d.l(gVar, f10);
        }

        @j2
        @Deprecated
        public static long I(@dl.d g gVar, int i10) {
            return s1.d.m(gVar, i10);
        }

        @Deprecated
        public static void f(@dl.d g gVar, @dl.d y0 image, long j10, long j11, long j12, long j13, float f10, @dl.d j style, @dl.e m0 m0Var, int i10, int i11) {
            f0.p(image, "image");
            f0.p(style, "style");
            f.a(gVar, image, j10, j11, j12, j13, f10, style, m0Var, i10, i11);
        }

        @Deprecated
        public static long u(@dl.d g gVar) {
            return f.b(gVar);
        }

        @Deprecated
        public static long v(@dl.d g gVar) {
            return f.c(gVar);
        }

        @j2
        @Deprecated
        public static int w(@dl.d g gVar, long j10) {
            return s1.d.a(gVar, j10);
        }

        @j2
        @Deprecated
        public static int x(@dl.d g gVar, float f10) {
            return s1.d.b(gVar, f10);
        }

        @j2
        @Deprecated
        public static float y(@dl.d g gVar, long j10) {
            return s1.d.c(gVar, j10);
        }

        @j2
        @Deprecated
        public static float z(@dl.d g gVar, float f10) {
            return s1.d.d(gVar, f10);
        }
    }

    void B1(@dl.d a0 brush, long topLeft, long size, long cornerRadius, float alpha, @dl.d j style, @dl.e m0 colorFilter, int blendMode);

    void D0(long color, float radius, long center, float alpha, @dl.d j style, @dl.e m0 colorFilter, int blendMode);

    void D1(@dl.d a0 brush, long topLeft, long size, float alpha, @dl.d j style, @dl.e m0 colorFilter, int blendMode);

    void E0(long color, long topLeft, long size, float alpha, @dl.d j style, @dl.e m0 colorFilter, int blendMode);

    void G0(long color, float startAngle, float sweepAngle, boolean useCenter, long topLeft, long size, float alpha, @dl.d j style, @dl.e m0 colorFilter, int blendMode);

    void G1(@dl.d List<b1.f> points, int pointMode, long color, float strokeWidth, int cap, @dl.e m1 pathEffect, float alpha, @dl.e m0 colorFilter, int blendMode);

    long I();

    void I1(@dl.d a0 brush, long start, long end, float strokeWidth, int cap, @dl.e m1 pathEffect, float alpha, @dl.e m0 colorFilter, int blendMode);

    @dl.d
    e M0();

    void M1(@dl.d a0 brush, float radius, long center, float alpha, @dl.d j style, @dl.e m0 colorFilter, int blendMode);

    void N1(@dl.d y0 image, long srcOffset, long srcSize, long dstOffset, long dstSize, float alpha, @dl.d j style, @dl.e m0 colorFilter, int blendMode, int filterQuality);

    long c();

    @dl.d
    LayoutDirection getLayoutDirection();

    void i1(long color, long topLeft, long size, long cornerRadius, @dl.d j style, float alpha, @dl.e m0 colorFilter, int blendMode);

    void j0(@dl.d List<b1.f> points, int pointMode, @dl.d a0 brush, float strokeWidth, int cap, @dl.e m1 pathEffect, float alpha, @dl.e m0 colorFilter, int blendMode);

    void m0(@dl.d l1 path, @dl.d a0 brush, float alpha, @dl.d j style, @dl.e m0 colorFilter, int blendMode);

    @kotlin.k(level = DeprecationLevel.HIDDEN, message = "Prefer usage of drawImage that consumes an optional FilterQuality parameter", replaceWith = @s0(expression = "drawImage(image, srcOffset, srcSize, dstOffset, dstSize, alpha, style, colorFilter, blendMode, FilterQuality.Low)", imports = {"androidx.compose.ui.graphics.drawscope", "androidx.compose.ui.graphics.FilterQuality"}))
    /* synthetic */ void q1(y0 image, long srcOffset, long srcSize, long dstOffset, long dstSize, float alpha, j style, m0 colorFilter, int blendMode);

    void t0(@dl.d y0 image, long topLeft, float alpha, @dl.d j style, @dl.e m0 colorFilter, int blendMode);

    void u1(long color, long topLeft, long size, float alpha, @dl.d j style, @dl.e m0 colorFilter, int blendMode);

    void w0(@dl.d a0 brush, long topLeft, long size, float alpha, @dl.d j style, @dl.e m0 colorFilter, int blendMode);

    void x0(long color, long start, long end, float strokeWidth, int cap, @dl.e m1 pathEffect, float alpha, @dl.e m0 colorFilter, int blendMode);

    void y0(@dl.d a0 brush, float startAngle, float sweepAngle, boolean useCenter, long topLeft, long size, float alpha, @dl.d j style, @dl.e m0 colorFilter, int blendMode);

    void z0(@dl.d l1 path, long color, float alpha, @dl.d j style, @dl.e m0 colorFilter, int blendMode);
}
