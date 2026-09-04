package androidx.compose.ui.graphics.drawscope;

import androidx.compose.ui.graphics.a0;
import androidx.compose.ui.graphics.d0;
import androidx.compose.ui.graphics.h1;
import androidx.compose.ui.graphics.j1;
import androidx.compose.ui.graphics.j2;
import androidx.compose.ui.graphics.k2;
import androidx.compose.ui.graphics.l0;
import androidx.compose.ui.graphics.l1;
import androidx.compose.ui.graphics.m0;
import androidx.compose.ui.graphics.m1;
import androidx.compose.ui.graphics.x;
import androidx.compose.ui.graphics.y0;
import androidx.compose.ui.unit.LayoutDirection;
import com.max.hbuikit.bean.param.UiKitSpanObj;
import com.max.xiaoheihe.okflutter.containers.FlutterActivityLaunchConfigs;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import java.util.List;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.b2;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;
import kotlin.r0;
import kotlin.s0;
import s1.DpRect;

/* JADX INFO: compiled from: CanvasDrawScope.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000Ø\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0013\u0018\u00002\u00020\u0001:\u0002\u008c\u0001B\b¢\u0006\u0005\b\u008b\u0001\u0010xJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0002JK\u0010\u0013\u001a\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u0011H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0013\u0010\u0014JI\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u0011H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0017\u0010\u0018Jk\u0010!\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001d2\b\u0010 \u001a\u0004\u0018\u00010\u001f2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u0011H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b!\u0010\"Jm\u0010#\u001a\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001d2\b\u0010 \u001a\u0004\u0018\u00010\u001f2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u0011H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b#\u0010$J!\u0010%\u001a\u00020\u0015*\u00020\u00152\u0006\u0010\f\u001a\u00020\u000bH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b%\u0010&Ja\u0010+\u001a\u00020*2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010(\u001a\u00020'2\u0006\u0010)\u001a\u00020'2\u0006\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u001b2\b\u0010 \u001a\u0004\u0018\u00010\u001f2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b+\u0010,Ja\u0010-\u001a\u00020*2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010(\u001a\u00020'2\u0006\u0010)\u001a\u00020'2\u0006\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u001b2\b\u0010 \u001a\u0004\u0018\u00010\u001f2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b-\u0010.JO\u00102\u001a\u00020*2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010/\u001a\u00020'2\u0006\u00101\u001a\u0002002\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b2\u00103JO\u00104\u001a\u00020*2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010/\u001a\u00020'2\u0006\u00101\u001a\u0002002\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b4\u00105JG\u00108\u001a\u00020*2\u0006\u00107\u001a\u0002062\u0006\u0010/\u001a\u00020'2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b8\u00109J_\u0010@\u001a\u00020*2\u0006\u00107\u001a\u0002062\u0006\u0010;\u001a\u00020:2\u0006\u0010=\u001a\u00020<2\u0006\u0010>\u001a\u00020:2\u0006\u0010?\u001a\u00020<2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0017ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b@\u0010AJg\u0010B\u001a\u00020*2\u0006\u00107\u001a\u0002062\u0006\u0010;\u001a\u00020:2\u0006\u0010=\u001a\u00020<2\u0006\u0010>\u001a\u00020:2\u0006\u0010?\u001a\u00020<2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bB\u0010CJW\u0010F\u001a\u00020*2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010/\u001a\u00020'2\u0006\u00101\u001a\u0002002\u0006\u0010E\u001a\u00020D2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bF\u0010GJW\u0010H\u001a\u00020*2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010/\u001a\u00020'2\u0006\u00101\u001a\u0002002\u0006\u0010E\u001a\u00020D2\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bH\u0010IJO\u0010L\u001a\u00020*2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010J\u001a\u00020\u000b2\u0006\u0010K\u001a\u00020'2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bL\u0010MJO\u0010N\u001a\u00020*2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010J\u001a\u00020\u000b2\u0006\u0010K\u001a\u00020'2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bN\u0010OJO\u0010P\u001a\u00020*2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010/\u001a\u00020'2\u0006\u00101\u001a\u0002002\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bP\u00103JO\u0010Q\u001a\u00020*2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010/\u001a\u00020'2\u0006\u00101\u001a\u0002002\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bQ\u00105Jg\u0010V\u001a\u00020*2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010R\u001a\u00020\u000b2\u0006\u0010S\u001a\u00020\u000b2\u0006\u0010U\u001a\u00020T2\u0006\u0010/\u001a\u00020'2\u0006\u00101\u001a\u0002002\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bV\u0010WJg\u0010X\u001a\u00020*2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010R\u001a\u00020\u000b2\u0006\u0010S\u001a\u00020\u000b2\u0006\u0010U\u001a\u00020T2\u0006\u0010/\u001a\u00020'2\u0006\u00101\u001a\u0002002\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bX\u0010YJG\u0010\\\u001a\u00020*2\u0006\u0010[\u001a\u00020Z2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\\\u0010]JG\u0010^\u001a\u00020*2\u0006\u0010[\u001a\u00020Z2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b^\u0010_Jg\u0010d\u001a\u00020*2\f\u0010a\u001a\b\u0012\u0004\u0012\u00020'0`2\u0006\u0010c\u001a\u00020b2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u001b2\b\u0010 \u001a\u0004\u0018\u00010\u001f2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bd\u0010eJg\u0010f\u001a\u00020*2\f\u0010a\u001a\b\u0012\u0004\u0012\u00020'0`2\u0006\u0010c\u001a\u00020b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u001b2\b\u0010 \u001a\u0004\u0018\u00010\u001f2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bf\u0010gJR\u0010q\u001a\u00020*2\u0006\u0010i\u001a\u00020h2\u0006\u0010k\u001a\u00020j2\u0006\u0010m\u001a\u00020l2\u0006\u00101\u001a\u0002002\u0017\u0010p\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020*0n¢\u0006\u0002\boH\u0086\bø\u0001\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bq\u0010rR \u0010y\u001a\u00020s8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u0017\u0010t\u0012\u0004\bw\u0010x\u001a\u0004\bu\u0010vR\u001a\u0010\u007f\u001a\u00020z8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b{\u0010|\u001a\u0004\b}\u0010~R\u001b\u0010\u0082\u0001\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0080\u0001\u0010\u0081\u0001R\u001b\u0010\u0084\u0001\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0083\u0001\u0010\u0081\u0001R\u0016\u0010k\u001a\u00020j8VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0085\u0001\u0010\u0086\u0001R\u0016\u0010i\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0087\u0001\u0010\u0088\u0001R\u0017\u0010\u008a\u0001\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0089\u0001\u0010\u0088\u0001\u0082\u0002\u0012\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0005\b\u009920\u0001¨\u0006\u008d\u0001"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/a;", "Landroidx/compose/ui/graphics/drawscope/g;", "Landroidx/compose/ui/graphics/h1;", "B", "D", "Landroidx/compose/ui/graphics/drawscope/j;", "drawStyle", "K", "Landroidx/compose/ui/graphics/a0;", "brush", "style", "", "alpha", "Landroidx/compose/ui/graphics/m0;", "colorFilter", "Landroidx/compose/ui/graphics/x;", "blendMode", "Landroidx/compose/ui/graphics/r0;", "filterQuality", RXScreenCaptureService.KEY_HEIGHT, "(Landroidx/compose/ui/graphics/a0;Landroidx/compose/ui/graphics/drawscope/j;FLandroidx/compose/ui/graphics/m0;II)Landroidx/compose/ui/graphics/h1;", "Landroidx/compose/ui/graphics/l0;", "color", "b", "(JLandroidx/compose/ui/graphics/drawscope/j;FLandroidx/compose/ui/graphics/m0;II)Landroidx/compose/ui/graphics/h1;", "strokeWidth", "miter", "Landroidx/compose/ui/graphics/j2;", "cap", "Landroidx/compose/ui/graphics/k2;", "join", "Landroidx/compose/ui/graphics/m1;", "pathEffect", "j", "(JFFIILandroidx/compose/ui/graphics/m1;FLandroidx/compose/ui/graphics/m0;II)Landroidx/compose/ui/graphics/h1;", "l", "(Landroidx/compose/ui/graphics/a0;FFIILandroidx/compose/ui/graphics/m1;FLandroidx/compose/ui/graphics/m0;II)Landroidx/compose/ui/graphics/h1;", "x", "(JF)J", "Lb1/f;", com.google.android.exoplayer2.text.ttml.d.f49798o0, com.google.android.exoplayer2.text.ttml.d.f49800p0, "Lkotlin/b2;", "I1", "(Landroidx/compose/ui/graphics/a0;JJFILandroidx/compose/ui/graphics/m1;FLandroidx/compose/ui/graphics/m0;I)V", "x0", "(JJJFILandroidx/compose/ui/graphics/m1;FLandroidx/compose/ui/graphics/m0;I)V", "topLeft", "Lb1/m;", UiKitSpanObj.TYPE_SIZE, "w0", "(Landroidx/compose/ui/graphics/a0;JJFLandroidx/compose/ui/graphics/drawscope/j;Landroidx/compose/ui/graphics/m0;I)V", "u1", "(JJJFLandroidx/compose/ui/graphics/drawscope/j;Landroidx/compose/ui/graphics/m0;I)V", "Landroidx/compose/ui/graphics/y0;", "image", "t0", "(Landroidx/compose/ui/graphics/y0;JFLandroidx/compose/ui/graphics/drawscope/j;Landroidx/compose/ui/graphics/m0;I)V", "Ls1/n;", "srcOffset", "Ls1/r;", "srcSize", "dstOffset", "dstSize", "q1", "(Landroidx/compose/ui/graphics/y0;JJJJFLandroidx/compose/ui/graphics/drawscope/j;Landroidx/compose/ui/graphics/m0;I)V", "N1", "(Landroidx/compose/ui/graphics/y0;JJJJFLandroidx/compose/ui/graphics/drawscope/j;Landroidx/compose/ui/graphics/m0;II)V", "Lb1/a;", "cornerRadius", "B1", "(Landroidx/compose/ui/graphics/a0;JJJFLandroidx/compose/ui/graphics/drawscope/j;Landroidx/compose/ui/graphics/m0;I)V", "i1", "(JJJJLandroidx/compose/ui/graphics/drawscope/j;FLandroidx/compose/ui/graphics/m0;I)V", "radius", com.google.android.exoplayer2.text.ttml.d.f49794m0, "M1", "(Landroidx/compose/ui/graphics/a0;FJFLandroidx/compose/ui/graphics/drawscope/j;Landroidx/compose/ui/graphics/m0;I)V", "D0", "(JFJFLandroidx/compose/ui/graphics/drawscope/j;Landroidx/compose/ui/graphics/m0;I)V", "D1", "E0", "startAngle", "sweepAngle", "", "useCenter", "y0", "(Landroidx/compose/ui/graphics/a0;FFZJJFLandroidx/compose/ui/graphics/drawscope/j;Landroidx/compose/ui/graphics/m0;I)V", "G0", "(JFFZJJFLandroidx/compose/ui/graphics/drawscope/j;Landroidx/compose/ui/graphics/m0;I)V", "Landroidx/compose/ui/graphics/l1;", FlutterActivityLaunchConfigs.EXTRA_PATH, "z0", "(Landroidx/compose/ui/graphics/l1;JFLandroidx/compose/ui/graphics/drawscope/j;Landroidx/compose/ui/graphics/m0;I)V", "m0", "(Landroidx/compose/ui/graphics/l1;Landroidx/compose/ui/graphics/a0;FLandroidx/compose/ui/graphics/drawscope/j;Landroidx/compose/ui/graphics/m0;I)V", "", "points", "Landroidx/compose/ui/graphics/t1;", "pointMode", "G1", "(Ljava/util/List;IJFILandroidx/compose/ui/graphics/m1;FLandroidx/compose/ui/graphics/m0;I)V", "j0", "(Ljava/util/List;ILandroidx/compose/ui/graphics/a0;FILandroidx/compose/ui/graphics/m1;FLandroidx/compose/ui/graphics/m0;I)V", "Ls1/e;", "density", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Landroidx/compose/ui/graphics/d0;", "canvas", "Lkotlin/Function1;", "Lkotlin/t;", "block", "t", "(Ls1/e;Landroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/graphics/d0;JLyh/l;)V", "Landroidx/compose/ui/graphics/drawscope/a$a;", "Landroidx/compose/ui/graphics/drawscope/a$a;", "v", "()Landroidx/compose/ui/graphics/drawscope/a$a;", "getDrawParams$annotations", "()V", "drawParams", "Landroidx/compose/ui/graphics/drawscope/e;", ak.aF, "Landroidx/compose/ui/graphics/drawscope/e;", "M0", "()Landroidx/compose/ui/graphics/drawscope/e;", "drawContext", "d", "Landroidx/compose/ui/graphics/h1;", "fillPaint", "e", "strokePaint", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "getDensity", "()F", "C1", "fontScale", "<init>", ak.av, "ui-graphics_release"}, k = 1, mv = {1, 7, 1})
public final class a implements g {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final DrawParams drawParams = new DrawParams(null, null, null, 0, 15, null);

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final e drawContext = new b();

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private h1 fillPaint;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private h1 strokePaint;

    /* JADX INFO: renamed from: androidx.compose.ui.graphics.drawscope.a$a, reason: collision with other inner class name and from toString */
    /* JADX INFO: compiled from: CanvasDrawScope.kt */
    @r0
    @Metadata(bv = {}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0017\b\u0081\b\u0018\u00002\u00020\u0001B2\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\f\u001a\u00020\u0004\u0012\b\b\u0002\u0010\r\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u000e\u001a\u00020\bø\u0001\u0002¢\u0006\u0004\b+\u0010,J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J\u0019\u0010\t\u001a\u00020\bHÆ\u0003ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\t\u0010\nJ>\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\u00062\b\b\u0002\u0010\u000e\u001a\u00020\bHÆ\u0001ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u0012\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0013HÖ\u0001J\u0013\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\f\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\"\u0010\r\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R+\u0010\u000e\u001a\u00020\b8\u0006@\u0006X\u0086\u000eø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0012\n\u0004\b\t\u0010\"\u001a\u0004\b#\u0010\n\"\u0004\b$\u0010%R\"\u0010\u000b\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006-"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/a$a;", "", "Ls1/e;", ak.av, "Landroidx/compose/ui/unit/LayoutDirection;", "b", "Landroidx/compose/ui/graphics/d0;", ak.aF, "Lb1/m;", "d", "()J", "density", "layoutDirection", "canvas", UiKitSpanObj.TYPE_SIZE, "e", "(Ls1/e;Landroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/graphics/d0;J)Landroidx/compose/ui/graphics/drawscope/a$a;", "", "toString", "", "hashCode", "other", "", "equals", "Landroidx/compose/ui/unit/LayoutDirection;", "i", "()Landroidx/compose/ui/unit/LayoutDirection;", "m", "(Landroidx/compose/ui/unit/LayoutDirection;)V", "Landroidx/compose/ui/graphics/d0;", "g", "()Landroidx/compose/ui/graphics/d0;", "k", "(Landroidx/compose/ui/graphics/d0;)V", "J", "j", "n", "(J)V", "Ls1/e;", RXScreenCaptureService.KEY_HEIGHT, "()Ls1/e;", "l", "(Ls1/e;)V", "<init>", "(Ls1/e;Landroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/graphics/d0;JLkotlin/jvm/internal/u;)V", "ui-graphics_release"}, k = 1, mv = {1, 7, 1})
    public static final /* data */ class DrawParams {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from toString */
        @dl.d
        private s1.e density;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        @dl.d
        private LayoutDirection layoutDirection;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        @dl.d
        private d0 canvas;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private long size;

        private DrawParams(s1.e eVar, LayoutDirection layoutDirection, d0 d0Var, long j10) {
            this.density = eVar;
            this.layoutDirection = layoutDirection;
            this.canvas = d0Var;
            this.size = j10;
        }

        public /* synthetic */ DrawParams(s1.e eVar, LayoutDirection layoutDirection, d0 d0Var, long j10, int i10, u uVar) {
            this((i10 & 1) != 0 ? androidx.compose.ui.graphics.drawscope.b.f13820a : eVar, (i10 & 2) != 0 ? LayoutDirection.Ltr : layoutDirection, (i10 & 4) != 0 ? new n() : d0Var, (i10 & 8) != 0 ? b1.m.f30386b.c() : j10, null);
        }

        public /* synthetic */ DrawParams(s1.e eVar, LayoutDirection layoutDirection, d0 d0Var, long j10, u uVar) {
            this(eVar, layoutDirection, d0Var, j10);
        }

        public static /* synthetic */ DrawParams f(DrawParams drawParams, s1.e eVar, LayoutDirection layoutDirection, d0 d0Var, long j10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                eVar = drawParams.density;
            }
            if ((i10 & 2) != 0) {
                layoutDirection = drawParams.layoutDirection;
            }
            LayoutDirection layoutDirection2 = layoutDirection;
            if ((i10 & 4) != 0) {
                d0Var = drawParams.canvas;
            }
            d0 d0Var2 = d0Var;
            if ((i10 & 8) != 0) {
                j10 = drawParams.size;
            }
            return drawParams.e(eVar, layoutDirection2, d0Var2, j10);
        }

        @dl.d
        /* JADX INFO: renamed from: a, reason: from getter */
        public final s1.e getDensity() {
            return this.density;
        }

        @dl.d
        /* JADX INFO: renamed from: b, reason: from getter */
        public final LayoutDirection getLayoutDirection() {
            return this.layoutDirection;
        }

        @dl.d
        /* JADX INFO: renamed from: c, reason: from getter */
        public final d0 getCanvas() {
            return this.canvas;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final long getSize() {
            return this.size;
        }

        @dl.d
        public final DrawParams e(@dl.d s1.e density, @dl.d LayoutDirection layoutDirection, @dl.d d0 canvas, long size) {
            f0.p(density, "density");
            f0.p(layoutDirection, "layoutDirection");
            f0.p(canvas, "canvas");
            return new DrawParams(density, layoutDirection, canvas, size, null);
        }

        public boolean equals(@dl.e Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DrawParams)) {
                return false;
            }
            DrawParams drawParams = (DrawParams) other;
            return f0.g(this.density, drawParams.density) && this.layoutDirection == drawParams.layoutDirection && f0.g(this.canvas, drawParams.canvas) && b1.m.k(this.size, drawParams.size);
        }

        @dl.d
        public final d0 g() {
            return this.canvas;
        }

        @dl.d
        public final s1.e h() {
            return this.density;
        }

        public int hashCode() {
            return (((((this.density.hashCode() * 31) + this.layoutDirection.hashCode()) * 31) + this.canvas.hashCode()) * 31) + b1.m.u(this.size);
        }

        @dl.d
        public final LayoutDirection i() {
            return this.layoutDirection;
        }

        public final long j() {
            return this.size;
        }

        public final void k(@dl.d d0 d0Var) {
            f0.p(d0Var, "<set-?>");
            this.canvas = d0Var;
        }

        public final void l(@dl.d s1.e eVar) {
            f0.p(eVar, "<set-?>");
            this.density = eVar;
        }

        public final void m(@dl.d LayoutDirection layoutDirection) {
            f0.p(layoutDirection, "<set-?>");
            this.layoutDirection = layoutDirection;
        }

        public final void n(long j10) {
            this.size = j10;
        }

        @dl.d
        public String toString() {
            return "DrawParams(density=" + this.density + ", layoutDirection=" + this.layoutDirection + ", canvas=" + this.canvas + ", size=" + ((Object) b1.m.x(this.size)) + ')';
        }
    }

    /* JADX INFO: compiled from: CanvasDrawScope.kt */
    @Metadata(bv = {}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\n\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\tR-\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b8V@VX\u0096\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0012"}, d2 = {"androidx/compose/ui/graphics/drawscope/a$b", "Landroidx/compose/ui/graphics/drawscope/e;", "Landroidx/compose/ui/graphics/drawscope/l;", ak.av, "Landroidx/compose/ui/graphics/drawscope/l;", "d", "()Landroidx/compose/ui/graphics/drawscope/l;", "transform", "Landroidx/compose/ui/graphics/d0;", "()Landroidx/compose/ui/graphics/d0;", "canvas", "Lb1/m;", "value", ak.aF, "()J", "b", "(J)V", UiKitSpanObj.TYPE_SIZE, "ui-graphics_release"}, k = 1, mv = {1, 7, 1})
    public static final class b implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @dl.d
        private final l transform = androidx.compose.ui.graphics.drawscope.b.c(this);

        b() {
        }

        @Override // androidx.compose.ui.graphics.drawscope.e
        @dl.d
        public d0 a() {
            return a.this.getDrawParams().g();
        }

        @Override // androidx.compose.ui.graphics.drawscope.e
        public void b(long j10) {
            a.this.getDrawParams().n(j10);
        }

        @Override // androidx.compose.ui.graphics.drawscope.e
        public long c() {
            return a.this.getDrawParams().j();
        }

        @Override // androidx.compose.ui.graphics.drawscope.e
        @dl.d
        /* JADX INFO: renamed from: d, reason: from getter */
        public l getTransform() {
            return this.transform;
        }
    }

    private final h1 B() {
        h1 h1Var = this.fillPaint;
        if (h1Var != null) {
            return h1Var;
        }
        h1 h1VarA = androidx.compose.ui.graphics.i.a();
        h1VarA.p(j1.INSTANCE.a());
        this.fillPaint = h1VarA;
        return h1VarA;
    }

    private final h1 D() {
        h1 h1Var = this.strokePaint;
        if (h1Var != null) {
            return h1Var;
        }
        h1 h1VarA = androidx.compose.ui.graphics.i.a();
        h1VarA.p(j1.INSTANCE.b());
        this.strokePaint = h1VarA;
        return h1VarA;
    }

    private final h1 K(j drawStyle) {
        if (f0.g(drawStyle, o.f13826a)) {
            return B();
        }
        if (!(drawStyle instanceof Stroke)) {
            throw new NoWhenBranchMatchedException();
        }
        h1 h1VarD = D();
        Stroke stroke = (Stroke) drawStyle;
        if (!(h1VarD.r() == stroke.getWidth())) {
            h1VarD.q(stroke.getWidth());
        }
        if (!j2.g(h1VarD.g(), stroke.getCap())) {
            h1VarD.c(stroke.getCap());
        }
        if (!(h1VarD.k() == stroke.getMiter())) {
            h1VarD.n(stroke.getMiter());
        }
        if (!k2.g(h1VarD.j(), stroke.getJoin())) {
            h1VarD.h(stroke.getJoin());
        }
        if (!f0.g(h1VarD.getPathEffect(), stroke.getPathEffect())) {
            h1VarD.v(stroke.getPathEffect());
        }
        return h1VarD;
    }

    private final h1 b(long color, j style, float alpha, m0 colorFilter, int blendMode, int filterQuality) {
        h1 h1VarK = K(style);
        long jX = x(color, alpha);
        if (!l0.y(h1VarK.a(), jX)) {
            h1VarK.i(jX);
        }
        if (h1VarK.getInternalShader() != null) {
            h1VarK.y(null);
        }
        if (!f0.g(h1VarK.getInternalColorFilter(), colorFilter)) {
            h1VarK.z(colorFilter);
        }
        if (!x.G(h1VarK.get_blendMode(), blendMode)) {
            h1VarK.t(blendMode);
        }
        if (!androidx.compose.ui.graphics.r0.h(h1VarK.A(), filterQuality)) {
            h1VarK.e(filterQuality);
        }
        return h1VarK;
    }

    static /* synthetic */ h1 g(a aVar, long j10, j jVar, float f10, m0 m0Var, int i10, int i11, int i12, Object obj) {
        return aVar.b(j10, jVar, f10, m0Var, i10, (i12 & 32) != 0 ? g.INSTANCE.b() : i11);
    }

    private final h1 h(a0 brush, j style, float alpha, m0 colorFilter, int blendMode, int filterQuality) {
        h1 h1VarK = K(style);
        if (brush != null) {
            brush.a(c(), h1VarK, alpha);
        } else {
            if (!(h1VarK.d() == alpha)) {
                h1VarK.f(alpha);
            }
        }
        if (!f0.g(h1VarK.getInternalColorFilter(), colorFilter)) {
            h1VarK.z(colorFilter);
        }
        if (!x.G(h1VarK.get_blendMode(), blendMode)) {
            h1VarK.t(blendMode);
        }
        if (!androidx.compose.ui.graphics.r0.h(h1VarK.A(), filterQuality)) {
            h1VarK.e(filterQuality);
        }
        return h1VarK;
    }

    static /* synthetic */ h1 i(a aVar, a0 a0Var, j jVar, float f10, m0 m0Var, int i10, int i11, int i12, Object obj) {
        if ((i12 & 32) != 0) {
            i11 = g.INSTANCE.b();
        }
        return aVar.h(a0Var, jVar, f10, m0Var, i10, i11);
    }

    private final h1 j(long color, float strokeWidth, float miter, int cap, int join, m1 pathEffect, float alpha, m0 colorFilter, int blendMode, int filterQuality) {
        h1 h1VarD = D();
        long jX = x(color, alpha);
        if (!l0.y(h1VarD.a(), jX)) {
            h1VarD.i(jX);
        }
        if (h1VarD.getInternalShader() != null) {
            h1VarD.y(null);
        }
        if (!f0.g(h1VarD.getInternalColorFilter(), colorFilter)) {
            h1VarD.z(colorFilter);
        }
        if (!x.G(h1VarD.get_blendMode(), blendMode)) {
            h1VarD.t(blendMode);
        }
        if (!(h1VarD.r() == strokeWidth)) {
            h1VarD.q(strokeWidth);
        }
        if (!(h1VarD.k() == miter)) {
            h1VarD.n(miter);
        }
        if (!j2.g(h1VarD.g(), cap)) {
            h1VarD.c(cap);
        }
        if (!k2.g(h1VarD.j(), join)) {
            h1VarD.h(join);
        }
        if (!f0.g(h1VarD.getPathEffect(), pathEffect)) {
            h1VarD.v(pathEffect);
        }
        if (!androidx.compose.ui.graphics.r0.h(h1VarD.A(), filterQuality)) {
            h1VarD.e(filterQuality);
        }
        return h1VarD;
    }

    static /* synthetic */ h1 k(a aVar, long j10, float f10, float f11, int i10, int i11, m1 m1Var, float f12, m0 m0Var, int i12, int i13, int i14, Object obj) {
        return aVar.j(j10, f10, f11, i10, i11, m1Var, f12, m0Var, i12, (i14 & 512) != 0 ? g.INSTANCE.b() : i13);
    }

    private final h1 l(a0 brush, float strokeWidth, float miter, int cap, int join, m1 pathEffect, float alpha, m0 colorFilter, int blendMode, int filterQuality) {
        h1 h1VarD = D();
        if (brush != null) {
            brush.a(c(), h1VarD, alpha);
        } else {
            if (!(h1VarD.d() == alpha)) {
                h1VarD.f(alpha);
            }
        }
        if (!f0.g(h1VarD.getInternalColorFilter(), colorFilter)) {
            h1VarD.z(colorFilter);
        }
        if (!x.G(h1VarD.get_blendMode(), blendMode)) {
            h1VarD.t(blendMode);
        }
        if (!(h1VarD.r() == strokeWidth)) {
            h1VarD.q(strokeWidth);
        }
        if (!(h1VarD.k() == miter)) {
            h1VarD.n(miter);
        }
        if (!j2.g(h1VarD.g(), cap)) {
            h1VarD.c(cap);
        }
        if (!k2.g(h1VarD.j(), join)) {
            h1VarD.h(join);
        }
        if (!f0.g(h1VarD.getPathEffect(), pathEffect)) {
            h1VarD.v(pathEffect);
        }
        if (!androidx.compose.ui.graphics.r0.h(h1VarD.A(), filterQuality)) {
            h1VarD.e(filterQuality);
        }
        return h1VarD;
    }

    static /* synthetic */ h1 p(a aVar, a0 a0Var, float f10, float f11, int i10, int i11, m1 m1Var, float f12, m0 m0Var, int i12, int i13, int i14, Object obj) {
        return aVar.l(a0Var, f10, f11, i10, i11, m1Var, f12, m0Var, i12, (i14 & 512) != 0 ? g.INSTANCE.b() : i13);
    }

    @r0
    public static /* synthetic */ void w() {
    }

    private final long x(long j10, float f10) {
        return !((f10 > 1.0f ? 1 : (f10 == 1.0f ? 0 : -1)) == 0) ? l0.w(j10, l0.A(j10) * f10, 0.0f, 0.0f, 0.0f, 14, null) : j10;
    }

    @Override // androidx.compose.ui.graphics.drawscope.g
    public void B1(@dl.d a0 brush, long topLeft, long size, long cornerRadius, float alpha, @dl.d j style, @dl.e m0 colorFilter, int blendMode) {
        f0.p(brush, "brush");
        f0.p(style, "style");
        this.drawParams.g().F(b1.f.p(topLeft), b1.f.r(topLeft), b1.f.p(topLeft) + b1.m.t(size), b1.f.r(topLeft) + b1.m.m(size), b1.a.m(cornerRadius), b1.a.o(cornerRadius), i(this, brush, style, alpha, colorFilter, blendMode, 0, 32, null));
    }

    @Override // s1.e
    /* JADX INFO: renamed from: C1 */
    public float getF139218c() {
        return this.drawParams.h().getF139218c();
    }

    @Override // androidx.compose.ui.graphics.drawscope.g
    public void D0(long color, float radius, long center, float alpha, @dl.d j style, @dl.e m0 colorFilter, int blendMode) {
        f0.p(style, "style");
        this.drawParams.g().E(center, radius, g(this, color, style, alpha, colorFilter, blendMode, 0, 32, null));
    }

    @Override // androidx.compose.ui.graphics.drawscope.g
    public void D1(@dl.d a0 brush, long topLeft, long size, float alpha, @dl.d j style, @dl.e m0 colorFilter, int blendMode) {
        f0.p(brush, "brush");
        f0.p(style, "style");
        this.drawParams.g().s(b1.f.p(topLeft), b1.f.r(topLeft), b1.f.p(topLeft) + b1.m.t(size), b1.f.r(topLeft) + b1.m.m(size), i(this, brush, style, alpha, colorFilter, blendMode, 0, 32, null));
    }

    @Override // s1.e
    public /* synthetic */ float E(int i10) {
        return s1.d.e(this, i10);
    }

    @Override // androidx.compose.ui.graphics.drawscope.g
    public void E0(long color, long topLeft, long size, float alpha, @dl.d j style, @dl.e m0 colorFilter, int blendMode) {
        f0.p(style, "style");
        this.drawParams.g().s(b1.f.p(topLeft), b1.f.r(topLeft), b1.f.p(topLeft) + b1.m.t(size), b1.f.r(topLeft) + b1.m.m(size), g(this, color, style, alpha, colorFilter, blendMode, 0, 32, null));
    }

    @Override // s1.e
    public /* synthetic */ float E1(float f10) {
        return s1.d.h(this, f10);
    }

    @Override // s1.e
    public /* synthetic */ float F(float f10) {
        return s1.d.d(this, f10);
    }

    @Override // androidx.compose.ui.graphics.drawscope.g
    public void G0(long color, float startAngle, float sweepAngle, boolean useCenter, long topLeft, long size, float alpha, @dl.d j style, @dl.e m0 colorFilter, int blendMode) {
        f0.p(style, "style");
        this.drawParams.g().m(b1.f.p(topLeft), b1.f.r(topLeft), b1.f.p(topLeft) + b1.m.t(size), b1.f.r(topLeft) + b1.m.m(size), startAngle, sweepAngle, useCenter, g(this, color, style, alpha, colorFilter, blendMode, 0, 32, null));
    }

    @Override // androidx.compose.ui.graphics.drawscope.g
    public void G1(@dl.d List<b1.f> points, int pointMode, long color, float strokeWidth, int cap, @dl.e m1 pathEffect, float alpha, @dl.e m0 colorFilter, int blendMode) {
        f0.p(points, "points");
        this.drawParams.g().h(pointMode, points, k(this, color, strokeWidth, 4.0f, cap, k2.INSTANCE.b(), pathEffect, alpha, colorFilter, blendMode, 0, 512, null));
    }

    @Override // androidx.compose.ui.graphics.drawscope.g
    public /* synthetic */ long I() {
        return f.b(this);
    }

    @Override // androidx.compose.ui.graphics.drawscope.g
    public void I1(@dl.d a0 brush, long start, long end, float strokeWidth, int cap, @dl.e m1 pathEffect, float alpha, @dl.e m0 colorFilter, int blendMode) {
        f0.p(brush, "brush");
        this.drawParams.g().x(start, end, p(this, brush, strokeWidth, 4.0f, cap, k2.INSTANCE.b(), pathEffect, alpha, colorFilter, blendMode, 0, 512, null));
    }

    @Override // s1.e
    public /* synthetic */ long J(long j10) {
        return s1.d.j(this, j10);
    }

    @Override // s1.e
    public /* synthetic */ int J1(long j10) {
        return s1.d.a(this, j10);
    }

    @Override // s1.e
    public /* synthetic */ long M(float f10) {
        return s1.d.k(this, f10);
    }

    @Override // androidx.compose.ui.graphics.drawscope.g
    @dl.d
    /* JADX INFO: renamed from: M0, reason: from getter */
    public e getDrawContext() {
        return this.drawContext;
    }

    @Override // androidx.compose.ui.graphics.drawscope.g
    public void M1(@dl.d a0 brush, float radius, long center, float alpha, @dl.d j style, @dl.e m0 colorFilter, int blendMode) {
        f0.p(brush, "brush");
        f0.p(style, "style");
        this.drawParams.g().E(center, radius, i(this, brush, style, alpha, colorFilter, blendMode, 0, 32, null));
    }

    @Override // androidx.compose.ui.graphics.drawscope.g
    public void N1(@dl.d y0 image, long srcOffset, long srcSize, long dstOffset, long dstSize, float alpha, @dl.d j style, @dl.e m0 colorFilter, int blendMode, int filterQuality) {
        f0.p(image, "image");
        f0.p(style, "style");
        this.drawParams.g().i(image, srcOffset, srcSize, dstOffset, dstSize, h(null, style, alpha, colorFilter, blendMode, filterQuality));
    }

    @Override // androidx.compose.ui.graphics.drawscope.g
    public /* synthetic */ long c() {
        return f.c(this);
    }

    @Override // s1.e
    public /* synthetic */ int e1(float f10) {
        return s1.d.b(this, f10);
    }

    @Override // s1.e
    /* JADX INFO: renamed from: getDensity */
    public float getF139217b() {
        return this.drawParams.h().getF139217b();
    }

    @Override // androidx.compose.ui.graphics.drawscope.g
    @dl.d
    public LayoutDirection getLayoutDirection() {
        return this.drawParams.i();
    }

    @Override // s1.e
    public /* synthetic */ b1.i h0(DpRect dpRect) {
        return s1.d.i(this, dpRect);
    }

    @Override // androidx.compose.ui.graphics.drawscope.g
    public void i1(long color, long topLeft, long size, long cornerRadius, @dl.d j style, float alpha, @dl.e m0 colorFilter, int blendMode) {
        f0.p(style, "style");
        this.drawParams.g().F(b1.f.p(topLeft), b1.f.r(topLeft), b1.f.p(topLeft) + b1.m.t(size), b1.f.r(topLeft) + b1.m.m(size), b1.a.m(cornerRadius), b1.a.o(cornerRadius), g(this, color, style, alpha, colorFilter, blendMode, 0, 32, null));
    }

    @Override // androidx.compose.ui.graphics.drawscope.g
    public void j0(@dl.d List<b1.f> points, int pointMode, @dl.d a0 brush, float strokeWidth, int cap, @dl.e m1 pathEffect, float alpha, @dl.e m0 colorFilter, int blendMode) {
        f0.p(points, "points");
        f0.p(brush, "brush");
        this.drawParams.g().h(pointMode, points, p(this, brush, strokeWidth, 4.0f, cap, k2.INSTANCE.b(), pathEffect, alpha, colorFilter, blendMode, 0, 512, null));
    }

    @Override // s1.e
    public /* synthetic */ float k1(long j10) {
        return s1.d.g(this, j10);
    }

    @Override // androidx.compose.ui.graphics.drawscope.g
    public void m0(@dl.d l1 path, @dl.d a0 brush, float alpha, @dl.d j style, @dl.e m0 colorFilter, int blendMode) {
        f0.p(path, "path");
        f0.p(brush, "brush");
        f0.p(style, "style");
        this.drawParams.g().D(path, i(this, brush, style, alpha, colorFilter, blendMode, 0, 32, null));
    }

    @Override // s1.e
    public /* synthetic */ long n(long j10) {
        return s1.d.f(this, j10);
    }

    @Override // s1.e
    public /* synthetic */ float q(long j10) {
        return s1.d.c(this, j10);
    }

    @Override // androidx.compose.ui.graphics.drawscope.g
    @kotlin.k(level = DeprecationLevel.HIDDEN, message = "Prefer usage of drawImage that consumes an optional FilterQuality parameter", replaceWith = @s0(expression = "drawImage(image, srcOffset, srcSize, dstOffset, dstSize, alpha, style, colorFilter, blendMode, FilterQuality.Low)", imports = {"androidx.compose.ui.graphics.drawscope", "androidx.compose.ui.graphics.FilterQuality"}))
    public /* synthetic */ void q1(y0 image, long srcOffset, long srcSize, long dstOffset, long dstSize, float alpha, j style, m0 colorFilter, int blendMode) {
        f0.p(image, "image");
        f0.p(style, "style");
        this.drawParams.g().i(image, srcOffset, srcSize, dstOffset, dstSize, i(this, null, style, alpha, colorFilter, blendMode, 0, 32, null));
    }

    @Override // s1.e
    public /* synthetic */ long r(int i10) {
        return s1.d.m(this, i10);
    }

    @Override // s1.e
    public /* synthetic */ long s(float f10) {
        return s1.d.l(this, f10);
    }

    public final void t(@dl.d s1.e density, @dl.d LayoutDirection layoutDirection, @dl.d d0 canvas, long size, @dl.d yh.l<? super g, b2> block) {
        f0.p(density, "density");
        f0.p(layoutDirection, "layoutDirection");
        f0.p(canvas, "canvas");
        f0.p(block, "block");
        DrawParams drawParams = getDrawParams();
        s1.e density2 = drawParams.getDensity();
        LayoutDirection layoutDirection2 = drawParams.getLayoutDirection();
        d0 canvas2 = drawParams.getCanvas();
        long size2 = drawParams.getSize();
        DrawParams drawParams2 = getDrawParams();
        drawParams2.l(density);
        drawParams2.m(layoutDirection);
        drawParams2.k(canvas);
        drawParams2.n(size);
        canvas.f();
        block.invoke(this);
        canvas.u();
        DrawParams drawParams3 = getDrawParams();
        drawParams3.l(density2);
        drawParams3.m(layoutDirection2);
        drawParams3.k(canvas2);
        drawParams3.n(size2);
    }

    @Override // androidx.compose.ui.graphics.drawscope.g
    public void t0(@dl.d y0 image, long topLeft, float alpha, @dl.d j style, @dl.e m0 colorFilter, int blendMode) {
        f0.p(image, "image");
        f0.p(style, "style");
        this.drawParams.g().t(image, topLeft, i(this, null, style, alpha, colorFilter, blendMode, 0, 32, null));
    }

    @Override // androidx.compose.ui.graphics.drawscope.g
    public void u1(long color, long topLeft, long size, float alpha, @dl.d j style, @dl.e m0 colorFilter, int blendMode) {
        f0.p(style, "style");
        this.drawParams.g().r(b1.f.p(topLeft), b1.f.r(topLeft), b1.f.p(topLeft) + b1.m.t(size), b1.f.r(topLeft) + b1.m.m(size), g(this, color, style, alpha, colorFilter, blendMode, 0, 32, null));
    }

    @dl.d
    /* JADX INFO: renamed from: v, reason: from getter */
    public final DrawParams getDrawParams() {
        return this.drawParams;
    }

    @Override // androidx.compose.ui.graphics.drawscope.g
    public void w0(@dl.d a0 brush, long topLeft, long size, float alpha, @dl.d j style, @dl.e m0 colorFilter, int blendMode) {
        f0.p(brush, "brush");
        f0.p(style, "style");
        this.drawParams.g().r(b1.f.p(topLeft), b1.f.r(topLeft), b1.f.p(topLeft) + b1.m.t(size), b1.f.r(topLeft) + b1.m.m(size), i(this, brush, style, alpha, colorFilter, blendMode, 0, 32, null));
    }

    @Override // androidx.compose.ui.graphics.drawscope.g
    public void x0(long color, long start, long end, float strokeWidth, int cap, @dl.e m1 pathEffect, float alpha, @dl.e m0 colorFilter, int blendMode) {
        this.drawParams.g().x(start, end, k(this, color, strokeWidth, 4.0f, cap, k2.INSTANCE.b(), pathEffect, alpha, colorFilter, blendMode, 0, 512, null));
    }

    @Override // androidx.compose.ui.graphics.drawscope.g
    public void y0(@dl.d a0 brush, float startAngle, float sweepAngle, boolean useCenter, long topLeft, long size, float alpha, @dl.d j style, @dl.e m0 colorFilter, int blendMode) {
        f0.p(brush, "brush");
        f0.p(style, "style");
        this.drawParams.g().m(b1.f.p(topLeft), b1.f.r(topLeft), b1.f.p(topLeft) + b1.m.t(size), b1.f.r(topLeft) + b1.m.m(size), startAngle, sweepAngle, useCenter, i(this, brush, style, alpha, colorFilter, blendMode, 0, 32, null));
    }

    @Override // androidx.compose.ui.graphics.drawscope.g
    public void z0(@dl.d l1 path, long color, float alpha, @dl.d j style, @dl.e m0 colorFilter, int blendMode) {
        f0.p(path, "path");
        f0.p(style, "style");
        this.drawParams.g().D(path, g(this, color, style, alpha, colorFilter, blendMode, 0, 32, null));
    }
}
