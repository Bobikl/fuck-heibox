package androidx.compose.material3;

import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.FocusableKt;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.ProgressSemanticsKt;
import androidx.compose.foundation.gestures.DraggableKt;
import androidx.compose.foundation.gestures.DraggableKt$draggable$1;
import androidx.compose.foundation.gestures.DraggableKt$draggable$2;
import androidx.compose.foundation.gestures.GestureCancellationException;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.BoxWithConstraintsKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.h2;
import androidx.compose.runtime.m2;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.graphics.j2;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.r;
import androidx.compose.ui.unit.LayoutDirection;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: Slider.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000®\u0001\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0014\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u007f\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00000\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u0098\u0001\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00000\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\u0017\u0010\u0017\u001a\u0013\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u0016H\u0007¢\u0006\u0004\b\u0018\u0010\u0019\u001a³\u0001\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u00022\u0017\u0010\u001a\u001a\u0013\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u00162\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00000\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\u0019\b\u0002\u0010\u0017\u001a\u0013\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u0016H\u0007¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u0081\u0001\u0010\u001d\u001a\u00020\u00032\f\u0010\u0001\u001a\b\u0012\u0004\u0012\u00020\u00000\t2\u0018\u0010\u0004\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00000\t\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00000\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u001d\u0010\u001e\u001ag\u0010(\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u00002\u0006\u0010 \u001a\u00020\u00002\u0006\u0010\"\u001a\u00020!2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010#\u001a\u00020\u00002\u0006\u0010$\u001a\u00020\u00112\u0006\u0010%\u001a\u00020\u00112\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010&\u001a\u00020\u00052\u0006\u0010'\u001a\u00020\u0005H\u0003¢\u0006\u0004\b(\u0010)\u001a\u009b\u0001\u0010*\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u00112\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u00022\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\r2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00000\t2\u0017\u0010\u0017\u001a\u0013\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u00162\u0017\u0010\u001a\u001a\u0013\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u0016H\u0003¢\u0006\u0004\b*\u0010+\u001a?\u00101\u001a\u00020\u0003*\u00020,2\u0006\u0010.\u001a\u00020-2\u001c\u00100\u001a\u0018\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u0016¢\u0006\u0002\b/H\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b1\u00102\u001aU\u00105\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u00002\u0006\u0010 \u001a\u00020\u00002\u0006\u0010\"\u001a\u00020!2\u0006\u00103\u001a\u00020-2\u0006\u00104\u001a\u00020\u0000H\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b5\u00106\u001a(\u0010:\u001a\u00020\u00002\u0006\u00107\u001a\u00020\u00002\u0006\u0010\"\u001a\u00020!2\u0006\u00108\u001a\u00020\u00002\u0006\u00109\u001a\u00020\u0000H\u0002\u001a;\u0010B\u001a\u0010\u0012\u0004\u0012\u00020A\u0012\u0004\u0012\u00020\u0000\u0018\u00010@*\u00020;2\u0006\u0010=\u001a\u00020<2\u0006\u0010?\u001a\u00020>H\u0082@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0001¢\u0006\u0004\bB\u0010C\u001a\u0010\u0010D\u001a\u00020!2\u0006\u0010\f\u001a\u00020\u000bH\u0002\u001a0\u0010J\u001a\u00020\u00002\u0006\u0010E\u001a\u00020\u00002\u0006\u0010F\u001a\u00020\u00002\u0006\u0010G\u001a\u00020\u00002\u0006\u0010H\u001a\u00020\u00002\u0006\u0010I\u001a\u00020\u0000H\u0002\u001a<\u0010L\u001a\b\u0012\u0004\u0012\u00020\u00000\t2\u0006\u0010E\u001a\u00020\u00002\u0006\u0010F\u001a\u00020\u00002\f\u0010K\u001a\b\u0012\u0004\u0012\u00020\u00000\t2\u0006\u0010H\u001a\u00020\u00002\u0006\u0010I\u001a\u00020\u0000H\u0002\u001a \u0010N\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u00002\u0006\u0010(\u001a\u00020\u00002\u0006\u0010M\u001a\u00020\u0000H\u0002\u001a\\\u0010O\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00072\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u00022\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\r2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00000\t2\b\b\u0002\u0010\f\u001a\u00020\u000bH\u0002\u001ad\u0010X\u001a\u00020\u0005*\u00020\u00052\u0006\u0010Q\u001a\u00020P2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u00109\u001a\u00020\u000b2\u0006\u0010R\u001a\u00020\u00072\f\u0010T\u001a\b\u0012\u0004\u0012\u00020\u00000S2\u0012\u0010U\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\r0S2\f\u0010W\u001a\b\u0012\u0004\u0012\u00020\u00000V2\u0006\u0010\b\u001a\u00020\u0007H\u0002\u001a3\u0010[\u001a\u00020\u00032\u0006\u0010Q\u001a\u00020P2\u0006\u00107\u001a\u00020\u00002\u0006\u0010Y\u001a\u00020\u00002\u0006\u0010Z\u001a\u00020\u0000H\u0082@ø\u0001\u0001¢\u0006\u0004\b[\u0010\\\u001a\u0098\u0001\u0010a\u001a\u00020\u0005*\u00020\u00052\u0006\u0010$\u001a\u00020\u00112\u0006\u0010%\u001a\u00020\u00112\f\u0010]\u001a\b\u0012\u0004\u0012\u00020\u00000S2\f\u0010^\u001a\b\u0012\u0004\u0012\u00020\u00000S2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010R\u001a\u00020\u00072\u0006\u00109\u001a\u00020\u00002\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00000\t2\u0018\u0010U\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00030\u00020S2\u001e\u0010`\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030_0SH\u0002\"\u001d\u0010d\u001a\u00020-8\u0000X\u0080\u0004ø\u0001\u0001¢\u0006\f\n\u0004\b\u001d\u0010B\u001a\u0004\bb\u0010c\"\u0017\u0010e\u001a\u00020-8\u0002X\u0082\u0004ø\u0001\u0001¢\u0006\u0006\n\u0004\b(\u0010B\"\u0017\u0010g\u001a\u00020f8\u0002X\u0082\u0004ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0013\u0010a\"\u0017\u0010h\u001a\u00020-8\u0002X\u0082\u0004ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0018\u0010B\"\u0017\u0010i\u001a\u00020-8\u0002X\u0082\u0004ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u001b\u0010B\"\u0017\u0010j\u001a\u00020-8\u0002X\u0082\u0004ø\u0001\u0001¢\u0006\u0006\n\u0004\b*\u0010B\"\u001d\u0010m\u001a\u00020-8\u0000X\u0080\u0004ø\u0001\u0001¢\u0006\f\n\u0004\bk\u0010B\u001a\u0004\bl\u0010c\"\u0017\u0010o\u001a\u00020-8\u0002X\u0082\u0004ø\u0001\u0001¢\u0006\u0006\n\u0004\bn\u0010B\"\u0017\u0010p\u001a\u00020-8\u0002X\u0082\u0004ø\u0001\u0001¢\u0006\u0006\n\u0004\b1\u0010B\"\u0014\u0010r\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u0010q\"\u001a\u0010v\u001a\b\u0012\u0004\u0012\u00020\u00000s8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bt\u0010u\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006w"}, d2 = {"", "value", "Lkotlin/Function1;", "Lkotlin/b2;", "onValueChange", "Landroidx/compose/ui/n;", "modifier", "", "enabled", "Lfi/f;", "valueRange", "", "steps", "Lkotlin/Function0;", "onValueChangeFinished", "Landroidx/compose/material3/j1;", "colors", "Landroidx/compose/foundation/interaction/g;", "interactionSource", ak.aF, "(FLyh/l;Landroidx/compose/ui/n;ZLfi/f;ILyh/a;Landroidx/compose/material3/j1;Landroidx/compose/foundation/interaction/g;Landroidx/compose/runtime/p;II)V", "Landroidx/compose/material3/k1;", "Landroidx/compose/runtime/h;", "thumb", "d", "(FLyh/l;Landroidx/compose/ui/n;ZLfi/f;ILyh/a;Landroidx/compose/material3/j1;Landroidx/compose/foundation/interaction/g;Lyh/q;Landroidx/compose/runtime/p;II)V", "track", "e", "(FLyh/l;Lyh/q;Landroidx/compose/ui/n;ZLfi/f;ILyh/a;Landroidx/compose/material3/j1;Landroidx/compose/foundation/interaction/g;Lyh/q;Landroidx/compose/runtime/p;III)V", ak.av, "(Lfi/f;Lyh/l;Landroidx/compose/ui/n;ZLfi/f;ILyh/a;Landroidx/compose/material3/j1;Landroidx/compose/runtime/p;II)V", "positionFractionStart", "positionFractionEnd", "", "tickFractions", "width", "startInteractionSource", "endInteractionSource", "startThumbSemantics", "endThumbSemantics", "b", "(ZFF[FLandroidx/compose/material3/j1;FLandroidx/compose/foundation/interaction/g;Landroidx/compose/foundation/interaction/g;Landroidx/compose/ui/n;Landroidx/compose/ui/n;Landroidx/compose/ui/n;Landroidx/compose/runtime/p;II)V", "f", "(Landroidx/compose/ui/n;ZLandroidx/compose/foundation/interaction/g;Lyh/l;Lyh/a;IFLfi/f;Lyh/q;Lyh/q;Landroidx/compose/runtime/p;I)V", "Landroidx/compose/foundation/layout/k;", "Ls1/h;", androidx.constraintlayout.core.motion.utils.w.c.R, "Lkotlin/t;", "content", "i", "(Landroidx/compose/foundation/layout/k;FLyh/q;Landroidx/compose/runtime/p;I)V", "thumbWidth", "trackStrokeWidth", "j", "(Landroidx/compose/ui/n;Landroidx/compose/material3/j1;ZFF[FFFLandroidx/compose/runtime/p;I)V", org.apache.tools.ant.taskdefs.optional.vss.g.H2, "minPx", "maxPx", "P", "Landroidx/compose/ui/input/pointer/d;", "Landroidx/compose/ui/input/pointer/x;", "id", "Landroidx/compose/ui/input/pointer/m0;", "type", "Lkotlin/Pair;", "Landroidx/compose/ui/input/pointer/y;", "F", "(Landroidx/compose/ui/input/pointer/d;JILkotlin/coroutines/c;)Ljava/lang/Object;", "Q", "a1", "b1", "x1", "a2", "b2", "K", "x", "L", "pos", "G", "M", "Landroidx/compose/foundation/gestures/f;", "draggableState", "isRtl", "Landroidx/compose/runtime/m2;", "rawOffset", "gestureEndAction", "Landroidx/compose/runtime/a1;", "pressOffset", "O", "target", "velocity", androidx.exifinterface.media.a.S4, "(Landroidx/compose/foundation/gestures/f;FFFLkotlin/coroutines/c;)Ljava/lang/Object;", "rawOffsetStart", "rawOffsetEnd", "Lkotlin/Function2;", "onDrag", "J", "H", "()F", "ThumbWidth", "ThumbHeight", "Ls1/l;", "ThumbSize", "ThumbDefaultElevation", "ThumbPressedElevation", "TickSize", "g", "I", "TrackHeight", RXScreenCaptureService.KEY_HEIGHT, "SliderHeight", "SliderMinWidth", "Landroidx/compose/ui/n;", "DefaultSliderConstraints", "Landroidx/compose/animation/core/e1;", "k", "Landroidx/compose/animation/core/e1;", "SliderToTickAnimation", "material3_release"}, k = 2, mv = {1, 7, 1})
public final class SliderKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final float f10523a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final float f10524b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final long f10525c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final float f10526d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final float f10527e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final float f10528f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final float f10529g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final float f10530h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final float f10531i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @dl.d
    private static final androidx.compose.ui.n f10532j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @dl.d
    private static final androidx.compose.animation.core.e1<Float> f10533k;

    static {
        t0.s0 s0Var = t0.s0.f140323a;
        float fM = s0Var.m();
        f10523a = fM;
        float fK = s0Var.k();
        f10524b = fK;
        f10525c = s1.i.b(fM, fK);
        f10526d = s1.h.g(1);
        f10527e = s1.h.g(6);
        f10528f = s0Var.C();
        f10529g = s0Var.p();
        float fG = s1.h.g(48);
        f10530h = fG;
        float fG2 = s1.h.g(144);
        f10531i = fG2;
        f10532j = SizeKt.q(SizeKt.J(androidx.compose.ui.n.INSTANCE, fG2, 0.0f, 2, null), 0.0f, fG, 1, null);
        f10533k = new androidx.compose.animation.core.e1<>(100, 0, null, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object E(androidx.compose.foundation.gestures.f fVar, float f10, float f11, float f12, kotlin.coroutines.c<? super kotlin.b2> cVar) {
        Object objA = androidx.compose.foundation.gestures.e.a(fVar, null, new SliderKt$animateToTarget$2(f10, f11, f12, null), cVar, 1, null);
        return objA == kotlin.coroutines.intrinsics.b.h() ? objA : kotlin.b2.f124493a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object F(androidx.compose.ui.input.pointer.d dVar, long j10, int i10, kotlin.coroutines.c<? super Pair<PointerInputChange, Float>> cVar) throws Throwable {
        SliderKt$awaitSlop$1 sliderKt$awaitSlop$1;
        Ref.FloatRef floatRef;
        if (cVar instanceof SliderKt$awaitSlop$1) {
            sliderKt$awaitSlop$1 = (SliderKt$awaitSlop$1) cVar;
            int i11 = sliderKt$awaitSlop$1.f10713d;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                sliderKt$awaitSlop$1.f10713d = i11 - Integer.MIN_VALUE;
            } else {
                sliderKt$awaitSlop$1 = new SliderKt$awaitSlop$1(cVar);
            }
        } else {
            sliderKt$awaitSlop$1 = new SliderKt$awaitSlop$1(cVar);
        }
        SliderKt$awaitSlop$1 sliderKt$awaitSlop$2 = sliderKt$awaitSlop$1;
        Object obj = sliderKt$awaitSlop$2.f10712c;
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i12 = sliderKt$awaitSlop$2.f10713d;
        if (i12 == 0) {
            kotlin.t0.n(obj);
            final Ref.FloatRef floatRef2 = new Ref.FloatRef();
            yh.p<PointerInputChange, Float, kotlin.b2> pVar = new yh.p<PointerInputChange, Float, kotlin.b2>() { // from class: androidx.compose.material3.SliderKt$awaitSlop$postPointerSlop$1
                {
                    super(2);
                }

                public final void a(@dl.d PointerInputChange pointerInput, float f10) {
                    kotlin.jvm.internal.f0.p(pointerInput, "pointerInput");
                    pointerInput.a();
                    floatRef2.f124888b = f10;
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ kotlin.b2 invoke(PointerInputChange pointerInputChange, Float f10) {
                    a(pointerInputChange, f10.floatValue());
                    return kotlin.b2.f124493a;
                }
            };
            sliderKt$awaitSlop$2.f10711b = floatRef2;
            sliderKt$awaitSlop$2.f10713d = 1;
            Object objA = DragGestureDetectorCopyKt.a(dVar, j10, i10, pVar, sliderKt$awaitSlop$2);
            if (objA == objH) {
                return objH;
            }
            obj = objA;
            floatRef = floatRef2;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            floatRef = (Ref.FloatRef) sliderKt$awaitSlop$2.f10711b;
            kotlin.t0.n(obj);
        }
        PointerInputChange pointerInputChange = (PointerInputChange) obj;
        if (pointerInputChange != null) {
            return kotlin.c1.a(pointerInputChange, kotlin.coroutines.jvm.internal.a.e(floatRef.f124888b));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float G(float f10, float f11, float f12) {
        float f13 = f11 - f10;
        return fi.u.H((f13 > 0.0f ? 1 : (f13 == 0.0f ? 0 : -1)) == 0 ? 0.0f : (f12 - f10) / f13, 0.0f, 1.0f);
    }

    public static final float H() {
        return f10523a;
    }

    public static final float I() {
        return f10529g;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.ui.n J(androidx.compose.ui.n nVar, androidx.compose.foundation.interaction.g gVar, androidx.compose.foundation.interaction.g gVar2, m2<Float> m2Var, m2<Float> m2Var2, boolean z10, boolean z11, float f10, fi.f<Float> fVar, m2<? extends yh.l<? super Boolean, kotlin.b2>> m2Var3, m2<? extends yh.p<? super Boolean, ? super Float, kotlin.b2>> m2Var4) {
        return z10 ? SuspendingPointerInputFilterKt.e(nVar, new Object[]{gVar, gVar2, Float.valueOf(f10), Boolean.valueOf(z11), fVar}, new SliderKt$rangeSliderPressDragModifier$1(gVar, gVar2, m2Var, m2Var2, m2Var4, z11, f10, m2Var3, null)) : nVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float K(float f10, float f11, float f12, float f13, float f14) {
        return u1.d.a(f13, f14, G(f10, f11, f12));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final fi.f<Float> L(float f10, float f11, fi.f<Float> fVar, float f12, float f13) {
        return fi.t.e(K(f10, f11, fVar.D().floatValue(), f12, f13), K(f10, f11, fVar.e().floatValue(), f12, f13));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.ui.n M(androidx.compose.ui.n nVar, float f10, final boolean z10, final yh.l<? super Float, kotlin.b2> lVar, final yh.a<kotlin.b2> aVar, final fi.f<Float> fVar, final int i10) {
        final float fH = fi.u.H(f10, fVar.D().floatValue(), fVar.e().floatValue());
        return ProgressSemanticsKt.b(SemanticsModifierKt.c(nVar, false, new yh.l<r, kotlin.b2>() { // from class: androidx.compose.material3.SliderKt$sliderSemantics$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            public final void a(@dl.d r semantics) {
                kotlin.jvm.internal.f0.p(semantics, "$this$semantics");
                if (!z10) {
                    SemanticsPropertiesKt.j(semantics);
                }
                final fi.f<Float> fVar2 = fVar;
                final int i11 = i10;
                final float f11 = fH;
                final yh.l<Float, kotlin.b2> lVar2 = lVar;
                final yh.a<kotlin.b2> aVar2 = aVar;
                SemanticsPropertiesKt.n0(semantics, null, new yh.l<Float, Boolean>() { // from class: androidx.compose.material3.SliderKt$sliderSemantics$1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    @dl.d
                    public final Boolean a(float f12) {
                        int i12;
                        float fH2 = fi.u.H(f12, fVar2.D().floatValue(), fVar2.e().floatValue());
                        int i13 = i11;
                        boolean z11 = false;
                        if (i13 > 0 && (i12 = i13 + 1) >= 0) {
                            float fAbs = fH2;
                            float f13 = fAbs;
                            int i14 = 0;
                            while (true) {
                                float fA = u1.d.a(fVar2.D().floatValue(), fVar2.e().floatValue(), i14 / (i11 + 1));
                                float f14 = fA - fH2;
                                if (Math.abs(f14) <= fAbs) {
                                    fAbs = Math.abs(f14);
                                    f13 = fA;
                                }
                                if (i14 == i12) {
                                    break;
                                }
                                i14++;
                            }
                            fH2 = f13;
                        }
                        if (!(fH2 == f11)) {
                            lVar2.invoke(Float.valueOf(fH2));
                            yh.a<kotlin.b2> aVar3 = aVar2;
                            if (aVar3 != null) {
                                aVar3.invoke();
                            }
                            z11 = true;
                        }
                        return Boolean.valueOf(z11);
                    }

                    @Override // yh.l
                    public /* bridge */ /* synthetic */ Boolean invoke(Float f12) {
                        return a(f12.floatValue());
                    }
                }, 1, null);
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ kotlin.b2 invoke(r rVar) {
                a(rVar);
                return kotlin.b2.f124493a;
            }
        }, 1, null), f10, fVar, i10);
    }

    static /* synthetic */ androidx.compose.ui.n N(androidx.compose.ui.n nVar, float f10, boolean z10, yh.l lVar, yh.a aVar, fi.f fVar, int i10, int i11, Object obj) {
        if ((i11 & 8) != 0) {
            aVar = null;
        }
        yh.a aVar2 = aVar;
        if ((i11 & 16) != 0) {
            fVar = fi.t.e(0.0f, 1.0f);
        }
        fi.f fVar2 = fVar;
        if ((i11 & 32) != 0) {
            i10 = 0;
        }
        return M(nVar, f10, z10, lVar, aVar2, fVar2, i10);
    }

    private static final androidx.compose.ui.n O(androidx.compose.ui.n nVar, final androidx.compose.foundation.gestures.f fVar, final androidx.compose.foundation.interaction.g gVar, final int i10, final boolean z10, final m2<Float> m2Var, final m2<? extends yh.a<kotlin.b2>> m2Var2, final androidx.compose.runtime.a1<Float> a1Var, final boolean z11) {
        return ComposedModifierKt.g(nVar, InspectableValueKt.e() ? new yh.l<androidx.compose.ui.platform.x0, kotlin.b2>() { // from class: androidx.compose.material3.SliderKt$sliderTapModifier$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void a(@dl.d androidx.compose.ui.platform.x0 x0Var) {
                kotlin.jvm.internal.f0.p(x0Var, "$this$null");
                x0Var.d("sliderTapModifier");
                x0Var.getProperties().c("draggableState", fVar);
                x0Var.getProperties().c("interactionSource", gVar);
                x0Var.getProperties().c("maxPx", Integer.valueOf(i10));
                x0Var.getProperties().c("isRtl", Boolean.valueOf(z10));
                x0Var.getProperties().c("rawOffset", m2Var);
                x0Var.getProperties().c("gestureEndAction", m2Var2);
                x0Var.getProperties().c("pressOffset", a1Var);
                x0Var.getProperties().c("enabled", Boolean.valueOf(z11));
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.ui.platform.x0 x0Var) {
                a(x0Var);
                return kotlin.b2.f124493a;
            }
        } : InspectableValueKt.b(), new yh.q<androidx.compose.ui.n, androidx.compose.runtime.p, Integer, androidx.compose.ui.n>() { // from class: androidx.compose.material3.SliderKt$sliderTapModifier$2

            /* JADX INFO: renamed from: androidx.compose.material3.SliderKt$sliderTapModifier$2$1, reason: invalid class name */
            /* JADX INFO: compiled from: Slider.kt */
            @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
            @kotlin.coroutines.jvm.internal.d(c = "androidx.compose.material3.SliderKt$sliderTapModifier$2$1", f = "Slider.kt", i = {}, l = {bb.c.b.Li}, m = "invokeSuspend", n = {}, s = {})
            public static final class AnonymousClass1 extends SuspendLambda implements yh.p<androidx.compose.ui.input.pointer.i0, kotlin.coroutines.c<? super kotlin.b2>, Object> {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                int f10793b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                private /* synthetic */ Object f10794c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                final /* synthetic */ boolean f10795d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                final /* synthetic */ int f10796e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                final /* synthetic */ androidx.compose.runtime.a1<Float> f10797f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                final /* synthetic */ m2<Float> f10798g;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                final /* synthetic */ kotlinx.coroutines.q0 f10799h;

                /* JADX INFO: renamed from: i, reason: collision with root package name */
                final /* synthetic */ androidx.compose.foundation.gestures.f f10800i;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                final /* synthetic */ m2<yh.a<kotlin.b2>> f10801j;

                /* JADX INFO: renamed from: androidx.compose.material3.SliderKt$sliderTapModifier$2$1$1, reason: invalid class name and collision with other inner class name */
                /* JADX INFO: compiled from: Slider.kt */
                @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
                @kotlin.coroutines.jvm.internal.d(c = "androidx.compose.material3.SliderKt$sliderTapModifier$2$1$1", f = "Slider.kt", i = {}, l = {bb.c.b.Qi}, m = "invokeSuspend", n = {}, s = {})
                public static final class C00711 extends SuspendLambda implements yh.q<androidx.compose.foundation.gestures.k, b1.f, kotlin.coroutines.c<? super kotlin.b2>, Object> {

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    int f10802b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    private /* synthetic */ Object f10803c;

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    /* synthetic */ long f10804d;

                    /* JADX INFO: renamed from: e, reason: collision with root package name */
                    final /* synthetic */ boolean f10805e;

                    /* JADX INFO: renamed from: f, reason: collision with root package name */
                    final /* synthetic */ int f10806f;

                    /* JADX INFO: renamed from: g, reason: collision with root package name */
                    final /* synthetic */ androidx.compose.runtime.a1<Float> f10807g;

                    /* JADX INFO: renamed from: h, reason: collision with root package name */
                    final /* synthetic */ m2<Float> f10808h;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C00711(boolean z10, int i10, androidx.compose.runtime.a1<Float> a1Var, m2<Float> m2Var, kotlin.coroutines.c<? super C00711> cVar) {
                        super(3, cVar);
                        this.f10805e = z10;
                        this.f10806f = i10;
                        this.f10807g = a1Var;
                        this.f10808h = m2Var;
                    }

                    @dl.e
                    public final Object a(@dl.d androidx.compose.foundation.gestures.k kVar, long j10, @dl.e kotlin.coroutines.c<? super kotlin.b2> cVar) {
                        C00711 c00711 = new C00711(this.f10805e, this.f10806f, this.f10807g, this.f10808h, cVar);
                        c00711.f10803c = kVar;
                        c00711.f10804d = j10;
                        return c00711.invokeSuspend(kotlin.b2.f124493a);
                    }

                    @Override // yh.q
                    public /* bridge */ /* synthetic */ Object invoke(androidx.compose.foundation.gestures.k kVar, b1.f fVar, kotlin.coroutines.c<? super kotlin.b2> cVar) {
                        return a(kVar, fVar.getF30368a(), cVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @dl.e
                    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
                        Object objH = kotlin.coroutines.intrinsics.b.h();
                        int i10 = this.f10802b;
                        try {
                            if (i10 == 0) {
                                kotlin.t0.n(obj);
                                androidx.compose.foundation.gestures.k kVar = (androidx.compose.foundation.gestures.k) this.f10803c;
                                long j10 = this.f10804d;
                                this.f10807g.setValue(kotlin.coroutines.jvm.internal.a.e((this.f10805e ? this.f10806f - b1.f.p(j10) : b1.f.p(j10)) - this.f10808h.getValue().floatValue()));
                                this.f10802b = 1;
                                if (kVar.x1(this) == objH) {
                                    return objH;
                                }
                            } else {
                                if (i10 != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                kotlin.t0.n(obj);
                            }
                        } catch (GestureCancellationException unused) {
                            this.f10807g.setValue(kotlin.coroutines.jvm.internal.a.e(0.0f));
                        }
                        return kotlin.b2.f124493a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                AnonymousClass1(boolean z10, int i10, androidx.compose.runtime.a1<Float> a1Var, m2<Float> m2Var, kotlinx.coroutines.q0 q0Var, androidx.compose.foundation.gestures.f fVar, m2<? extends yh.a<kotlin.b2>> m2Var2, kotlin.coroutines.c<? super AnonymousClass1> cVar) {
                    super(2, cVar);
                    this.f10795d = z10;
                    this.f10796e = i10;
                    this.f10797f = a1Var;
                    this.f10798g = m2Var;
                    this.f10799h = q0Var;
                    this.f10800i = fVar;
                    this.f10801j = m2Var2;
                }

                @Override // yh.p
                @dl.e
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object invoke(@dl.d androidx.compose.ui.input.pointer.i0 i0Var, @dl.e kotlin.coroutines.c<? super kotlin.b2> cVar) {
                    return ((AnonymousClass1) create(i0Var, cVar)).invokeSuspend(kotlin.b2.f124493a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @dl.d
                public final kotlin.coroutines.c<kotlin.b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f10795d, this.f10796e, this.f10797f, this.f10798g, this.f10799h, this.f10800i, this.f10801j, cVar);
                    anonymousClass1.f10794c = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @dl.e
                public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
                    Object objH = kotlin.coroutines.intrinsics.b.h();
                    int i10 = this.f10793b;
                    if (i10 == 0) {
                        kotlin.t0.n(obj);
                        androidx.compose.ui.input.pointer.i0 i0Var = (androidx.compose.ui.input.pointer.i0) this.f10794c;
                        C00711 c00711 = new C00711(this.f10795d, this.f10796e, this.f10797f, this.f10798g, null);
                        final kotlinx.coroutines.q0 q0Var = this.f10799h;
                        final androidx.compose.foundation.gestures.f fVar = this.f10800i;
                        final m2<yh.a<kotlin.b2>> m2Var = this.f10801j;
                        yh.l<b1.f, kotlin.b2> lVar = new yh.l<b1.f, kotlin.b2>() { // from class: androidx.compose.material3.SliderKt.sliderTapModifier.2.1.2

                            /* JADX INFO: renamed from: androidx.compose.material3.SliderKt$sliderTapModifier$2$1$2$1, reason: invalid class name and collision with other inner class name */
                            /* JADX INFO: compiled from: Slider.kt */
                            @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
                            @kotlin.coroutines.jvm.internal.d(c = "androidx.compose.material3.SliderKt$sliderTapModifier$2$1$2$1", f = "Slider.kt", i = {}, l = {bb.c.b.Xi}, m = "invokeSuspend", n = {}, s = {})
                            public static final class C00721 extends SuspendLambda implements yh.p<kotlinx.coroutines.q0, kotlin.coroutines.c<? super kotlin.b2>, Object> {

                                /* JADX INFO: renamed from: b, reason: collision with root package name */
                                int f10812b;

                                /* JADX INFO: renamed from: c, reason: collision with root package name */
                                final /* synthetic */ androidx.compose.foundation.gestures.f f10813c;

                                /* JADX INFO: renamed from: d, reason: collision with root package name */
                                final /* synthetic */ m2<yh.a<kotlin.b2>> f10814d;

                                /* JADX INFO: renamed from: androidx.compose.material3.SliderKt$sliderTapModifier$2$1$2$1$1, reason: invalid class name and collision with other inner class name */
                                /* JADX INFO: compiled from: Slider.kt */
                                @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
                                @kotlin.coroutines.jvm.internal.d(c = "androidx.compose.material3.SliderKt$sliderTapModifier$2$1$2$1$1", f = "Slider.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
                                public static final class C00731 extends SuspendLambda implements yh.p<androidx.compose.foundation.gestures.d, kotlin.coroutines.c<? super kotlin.b2>, Object> {

                                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                                    int f10815b;

                                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                                    private /* synthetic */ Object f10816c;

                                    C00731(kotlin.coroutines.c<? super C00731> cVar) {
                                        super(2, cVar);
                                    }

                                    @Override // yh.p
                                    @dl.e
                                    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                                    public final Object invoke(@dl.d androidx.compose.foundation.gestures.d dVar, @dl.e kotlin.coroutines.c<? super kotlin.b2> cVar) {
                                        return ((C00731) create(dVar, cVar)).invokeSuspend(kotlin.b2.f124493a);
                                    }

                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                    @dl.d
                                    public final kotlin.coroutines.c<kotlin.b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
                                        C00731 c00731 = new C00731(cVar);
                                        c00731.f10816c = obj;
                                        return c00731;
                                    }

                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                    @dl.e
                                    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
                                        kotlin.coroutines.intrinsics.b.h();
                                        if (this.f10815b != 0) {
                                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                        }
                                        kotlin.t0.n(obj);
                                        ((androidx.compose.foundation.gestures.d) this.f10816c).c(0.0f);
                                        return kotlin.b2.f124493a;
                                    }
                                }

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                C00721(androidx.compose.foundation.gestures.f fVar, m2<? extends yh.a<kotlin.b2>> m2Var, kotlin.coroutines.c<? super C00721> cVar) {
                                    super(2, cVar);
                                    this.f10813c = fVar;
                                    this.f10814d = m2Var;
                                }

                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                @dl.d
                                public final kotlin.coroutines.c<kotlin.b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
                                    return new C00721(this.f10813c, this.f10814d, cVar);
                                }

                                @Override // yh.p
                                @dl.e
                                public final Object invoke(@dl.d kotlinx.coroutines.q0 q0Var, @dl.e kotlin.coroutines.c<? super kotlin.b2> cVar) {
                                    return ((C00721) create(q0Var, cVar)).invokeSuspend(kotlin.b2.f124493a);
                                }

                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                @dl.e
                                public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
                                    Object objH = kotlin.coroutines.intrinsics.b.h();
                                    int i10 = this.f10812b;
                                    if (i10 == 0) {
                                        kotlin.t0.n(obj);
                                        androidx.compose.foundation.gestures.f fVar = this.f10813c;
                                        MutatePriority mutatePriority = MutatePriority.UserInput;
                                        C00731 c00731 = new C00731(null);
                                        this.f10812b = 1;
                                        if (fVar.b(mutatePriority, c00731, this) == objH) {
                                            return objH;
                                        }
                                    } else {
                                        if (i10 != 1) {
                                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                        }
                                        kotlin.t0.n(obj);
                                    }
                                    this.f10814d.getValue().invoke();
                                    return kotlin.b2.f124493a;
                                }
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }

                            public final void a(long j10) {
                                kotlinx.coroutines.k.f(q0Var, null, null, new C00721(fVar, m2Var, null), 3, null);
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(b1.f fVar2) {
                                a(fVar2.getF30368a());
                                return kotlin.b2.f124493a;
                            }
                        };
                        this.f10793b = 1;
                        if (TapGestureDetectorKt.l(i0Var, null, null, c00711, lVar, this, 3, null) == objH) {
                            return objH;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.t0.n(obj);
                    }
                    return kotlin.b2.f124493a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(3);
            }

            @dl.d
            @androidx.compose.runtime.h
            public final androidx.compose.ui.n a(@dl.d androidx.compose.ui.n composed, @dl.e androidx.compose.runtime.p pVar, int i11) {
                kotlin.jvm.internal.f0.p(composed, "$this$composed");
                pVar.T(2040469710);
                if (ComposerKt.g0()) {
                    ComposerKt.w0(2040469710, i11, -1, "androidx.compose.material3.sliderTapModifier.<anonymous> (Slider.kt:1124)");
                }
                if (z11) {
                    pVar.T(773894976);
                    pVar.T(-492369756);
                    Object objU = pVar.U();
                    if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                        androidx.compose.runtime.x xVar = new androidx.compose.runtime.x(EffectsKt.m(EmptyCoroutineContext.f124694b, pVar));
                        pVar.N(xVar);
                        objU = xVar;
                    }
                    pVar.c0();
                    kotlinx.coroutines.q0 coroutineScope = ((androidx.compose.runtime.x) objU).getCoroutineScope();
                    pVar.c0();
                    composed = SuspendingPointerInputFilterKt.e(composed, new Object[]{fVar, gVar, Integer.valueOf(i10), Boolean.valueOf(z10)}, new AnonymousClass1(z10, i10, a1Var, m2Var, coroutineScope, fVar, m2Var2, null));
                }
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                pVar.c0();
                return composed;
            }

            @Override // yh.q
            public /* bridge */ /* synthetic */ androidx.compose.ui.n invoke(androidx.compose.ui.n nVar2, androidx.compose.runtime.p pVar, Integer num) {
                return a(nVar2, pVar, num.intValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float P(float f10, float[] fArr, float f11, float f12) {
        Float fValueOf;
        if (fArr.length == 0) {
            fValueOf = null;
        } else {
            float f13 = fArr[0];
            int iUe = ArraysKt___ArraysKt.Ue(fArr);
            if (iUe == 0) {
                fValueOf = Float.valueOf(f13);
            } else {
                float fAbs = Math.abs(u1.d.a(f11, f12, f13) - f10);
                kotlin.collections.k0 it = new fi.l(1, iUe).iterator();
                while (it.hasNext()) {
                    float f14 = fArr[it.nextInt()];
                    float fAbs2 = Math.abs(u1.d.a(f11, f12, f14) - f10);
                    if (Float.compare(fAbs, fAbs2) > 0) {
                        f13 = f14;
                        fAbs = fAbs2;
                    }
                }
                fValueOf = Float.valueOf(f13);
            }
        }
        return fValueOf != null ? u1.d.a(f11, f12, fValueOf.floatValue()) : f10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float[] Q(int i10) {
        if (i10 == 0) {
            return new float[0];
        }
        int i11 = i10 + 2;
        float[] fArr = new float[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            fArr[i12] = i12 / (i10 + 1);
        }
        return fArr;
    }

    /* JADX WARN: Code duplicated, block: B:107:0x0151 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:108:0x0153  */
    /* JADX WARN: Code duplicated, block: B:109:0x0156  */
    /* JADX WARN: Code duplicated, block: B:111:0x0159  */
    /* JADX WARN: Code duplicated, block: B:114:0x015e  */
    /* JADX WARN: Code duplicated, block: B:116:0x016a  */
    /* JADX WARN: Code duplicated, block: B:118:0x016d  */
    /* JADX WARN: Code duplicated, block: B:119:0x016f  */
    /* JADX WARN: Code duplicated, block: B:122:0x0175  */
    /* JADX WARN: Code duplicated, block: B:123:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:127:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:130:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:133:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:136:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:137:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:139:0x0201  */
    /* JADX WARN: Code duplicated, block: B:141:0x0216  */
    /* JADX WARN: Code duplicated, block: B:143:0x021c  */
    /* JADX WARN: Code duplicated, block: B:146:0x0240  */
    /* JADX WARN: Code duplicated, block: B:148:0x0246  */
    /* JADX WARN: Code duplicated, block: B:151:0x02b4  */
    /* JADX WARN: Code duplicated, block: B:156:0x02ca  */
    /* JADX WARN: Code duplicated, block: B:158:0x02dc  */
    /* JADX WARN: Code duplicated, block: B:160:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x0069  */
    /* JADX WARN: Code duplicated, block: B:37:0x006c  */
    /* JADX WARN: Code duplicated, block: B:39:0x0070  */
    /* JADX WARN: Code duplicated, block: B:41:0x0078  */
    /* JADX WARN: Code duplicated, block: B:42:0x007b  */
    /* JADX WARN: Code duplicated, block: B:47:0x0087  */
    /* JADX WARN: Code duplicated, block: B:49:0x008b  */
    /* JADX WARN: Code duplicated, block: B:51:0x0093  */
    /* JADX WARN: Code duplicated, block: B:52:0x0096  */
    /* JADX WARN: Code duplicated, block: B:55:0x009c  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:61:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:72:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:79:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:81:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:84:0x00f1 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:87:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:90:0x0104  */
    /* JADX WARN: Code duplicated, block: B:94:0x0119  */
    /* JADX WARN: Code duplicated, block: B:96:0x0124  */
    @w
    @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.h
    public static final void a(@dl.d final fi.f<Float> value, @dl.d final yh.l<? super fi.f<Float>, kotlin.b2> onValueChange, @dl.e androidx.compose.ui.n nVar, boolean z10, @dl.e fi.f<Float> fVar, int i10, @dl.e yh.a<kotlin.b2> aVar, @dl.e j1 j1Var, @dl.e androidx.compose.runtime.p pVar, final int i11, final int i12) {
        int i13;
        androidx.compose.ui.n nVar2;
        int i14;
        boolean z11;
        int i15;
        fi.f<Float> fVarE;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        androidx.compose.ui.n nVar3;
        boolean z12;
        fi.f<Float> fVar2;
        int i21;
        int i22;
        Object objU;
        androidx.compose.runtime.p.Companion companion;
        androidx.compose.foundation.interaction.g gVar;
        Object objU2;
        androidx.compose.foundation.interaction.g gVar2;
        boolean z13;
        boolean zS;
        Object objU3;
        boolean zS2;
        Object objU4;
        androidx.compose.runtime.p pVar2;
        final androidx.compose.ui.n nVar4;
        final boolean z14;
        final fi.f<Float> fVar3;
        final int i23;
        final yh.a<kotlin.b2> aVar2;
        final j1 j1Var2;
        androidx.compose.runtime.u1 u1VarH;
        kotlin.jvm.internal.f0.p(value, "value");
        kotlin.jvm.internal.f0.p(onValueChange, "onValueChange");
        androidx.compose.runtime.p pVarF = pVar.F(-743091416);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 14) == 0) {
            i13 = (pVarF.s(value) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i12 & 2) != 0) {
            i13 |= 48;
        } else if ((i11 & 112) == 0) {
            i13 |= pVarF.s(onValueChange) ? 32 : 16;
        }
        int i24 = i12 & 4;
        if (i24 == 0) {
            if ((i11 & bb.c.b.f30796me) == 0) {
                nVar2 = nVar;
                i13 |= pVarF.s(nVar2) ? 256 : 128;
            }
            i14 = i12 & 8;
            if (i14 != 0) {
                if ((i11 & bb.c.g.f32954lc) == 0) {
                    z11 = z10;
                    if (pVarF.u(z11)) {
                        i15 = 2048;
                    } else {
                        i15 = 1024;
                    }
                    i13 |= i15;
                }
                if ((57344 & i11) == 0) {
                    if ((i12 & 16) == 0) {
                        fVarE = fVar;
                        int i25 = pVarF.s(fVarE) ? 16384 : 8192;
                        i13 |= i25;
                    } else {
                        fVarE = fVar;
                    }
                    i13 |= i25;
                } else {
                    fVarE = fVar;
                }
                i16 = i12 & 32;
                if (i16 != 0) {
                    if ((458752 & i11) == 0) {
                        i17 = i10;
                        if (pVarF.y(i17)) {
                            i18 = 131072;
                        } else {
                            i18 = 65536;
                        }
                        i13 |= i18;
                    }
                    i19 = i12 & 64;
                    if (i19 != 0) {
                        i13 |= 1572864;
                    } else if ((i11 & 3670016) == 0) {
                        if (pVarF.s(aVar)) {
                            i20 = 1048576;
                        } else {
                            i20 = 524288;
                        }
                        i13 |= i20;
                    }
                    if ((i11 & 29360128) != 0) {
                        i13 |= ((i12 & 128) == 0 || !pVarF.s(j1Var)) ? 4194304 : 8388608;
                    }
                    if ((i13 & 23967451) == 4793490 || !pVarF.b()) {
                        pVarF.W();
                        if ((i11 & 1) != 0 || pVarF.o()) {
                            if (i24 != 0) {
                                nVar3 = androidx.compose.ui.n.INSTANCE;
                            } else {
                                nVar3 = nVar2;
                            }
                            if (i14 != 0) {
                                z11 = true;
                            }
                            if ((i12 & 16) != 0) {
                                i13 &= -57345;
                                fVarE = fi.t.e(0.0f, 1.0f);
                            }
                            if (i16 != 0) {
                                i17 = 0;
                            }
                            if (i19 != 0) {
                                aVar = null;
                            } else {
                                aVar = aVar;
                            }
                            if ((i12 & 128) != 0) {
                                i13 &= -29360129;
                                j1Var = SliderDefaults.f10488a.c(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, pVarF, 0, 6, 1023);
                            } else {
                                j1Var = j1Var;
                            }
                            z12 = z11;
                            fVar2 = fVarE;
                            i21 = i17;
                            i22 = i13;
                        } else {
                            pVarF.l();
                            if ((i12 & 16) != 0) {
                                i13 &= -57345;
                            }
                            i22 = (i12 & 128) != 0 ? (-29360129) & i13 : i13;
                            nVar3 = nVar2;
                            z12 = z11;
                            fVar2 = fVarE;
                            i21 = i17;
                        }
                        pVarF.O();
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(-743091416, i22, -1, "androidx.compose.material3.RangeSlider (Slider.kt:384)");
                        }
                        pVarF.T(-492369756);
                        objU = pVarF.U();
                        companion = androidx.compose.runtime.p.INSTANCE;
                        if (objU == companion.a()) {
                            objU = androidx.compose.foundation.interaction.f.a();
                            pVarF.N(objU);
                        }
                        pVarF.c0();
                        gVar = (androidx.compose.foundation.interaction.g) objU;
                        pVarF.T(-492369756);
                        objU2 = pVarF.U();
                        if (objU2 == companion.a()) {
                            objU2 = androidx.compose.foundation.interaction.f.a();
                            pVarF.N(objU2);
                        }
                        pVarF.c0();
                        gVar2 = (androidx.compose.foundation.interaction.g) objU2;
                        if (i21 >= 0) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if (!z13) {
                            throw new IllegalArgumentException("steps should be >= 0".toString());
                        }
                        pVarF.T(511388516);
                        zS = pVarF.s(value) | pVarF.s(onValueChange);
                        objU3 = pVarF.U();
                        if (zS || objU3 == companion.a()) {
                            objU3 = new yh.l<fi.f<Float>, kotlin.b2>() { // from class: androidx.compose.material3.SliderKt$RangeSlider$onValueChangeState$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(1);
                                }

                                public final void a(@dl.d fi.f<Float> it) {
                                    kotlin.jvm.internal.f0.p(it, "it");
                                    if (kotlin.jvm.internal.f0.g(it, value)) {
                                        return;
                                    }
                                    onValueChange.invoke(it);
                                }

                                @Override // yh.l
                                public /* bridge */ /* synthetic */ kotlin.b2 invoke(fi.f<Float> fVar4) {
                                    a(fVar4);
                                    return kotlin.b2.f124493a;
                                }
                            };
                            pVarF.N(objU3);
                        }
                        pVarF.c0();
                        m2 m2VarT = androidx.compose.runtime.e2.t(objU3, pVarF, 0);
                        Integer numValueOf = Integer.valueOf(i21);
                        pVarF.T(1157296644);
                        zS2 = pVarF.s(numValueOf);
                        objU4 = pVarF.U();
                        if (zS2 || objU4 == companion.a()) {
                            objU4 = Q(i21);
                            pVarF.N(objU4);
                        }
                        pVarF.c0();
                        float[] fArr = (float[]) objU4;
                        float f10 = 2;
                        pVar2 = pVarF;
                        BoxWithConstraintsKt.a(SizeKt.y(TouchTargetKt.c(nVar3), s1.h.g(f10523a * f10), s1.h.g(f10524b * f10), 0.0f, 0.0f, 12, null), null, false, androidx.compose.runtime.internal.b.b(pVar2, -990606702, true, new SliderKt$RangeSlider$2(aVar, i22, gVar, gVar2, z12, fVar2, value, i21, m2VarT, fArr, j1Var)), pVar2, bb.c.d.f31193dj, 6);
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                        nVar4 = nVar3;
                        z14 = z12;
                        fVar3 = fVar2;
                        i23 = i21;
                        aVar2 = aVar;
                        j1Var2 = j1Var;
                    } else {
                        pVarF.l();
                        j1Var2 = j1Var;
                        nVar4 = nVar2;
                        z14 = z11;
                        fVar3 = fVarE;
                        i23 = i17;
                        pVar2 = pVarF;
                        aVar2 = aVar;
                    }
                    u1VarH = pVar2.H();
                    if (u1VarH == null) {
                        return;
                    }
                    u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.SliderKt$RangeSlider$3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        public final void a(@dl.e androidx.compose.runtime.p pVar3, int i26) {
                            SliderKt.a(value, onValueChange, nVar4, z14, fVar3, i23, aVar2, j1Var2, pVar3, i11 | 1, i12);
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar3, Integer num) {
                            a(pVar3, num.intValue());
                            return kotlin.b2.f124493a;
                        }
                    });
                }
                i13 |= androidx.profileinstaller.o.c.f26824k;
                i17 = i10;
                i19 = i12 & 64;
                if (i19 != 0) {
                    i13 |= 1572864;
                } else if ((i11 & 3670016) == 0) {
                    if (pVarF.s(aVar)) {
                        i20 = 1048576;
                    } else {
                        i20 = 524288;
                    }
                    i13 |= i20;
                }
                if ((i11 & 29360128) != 0) {
                    i13 |= ((i12 & 128) == 0 || !pVarF.s(j1Var)) ? 4194304 : 8388608;
                }
                if ((i13 & 23967451) == 4793490) {
                    pVarF.W();
                    if ((i11 & 1) != 0) {
                        if (i24 != 0) {
                            nVar3 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar3 = nVar2;
                        }
                        if (i14 != 0) {
                            z11 = true;
                        }
                        if ((i12 & 16) != 0) {
                            i13 &= -57345;
                            fVarE = fi.t.e(0.0f, 1.0f);
                        }
                        if (i16 != 0) {
                            i17 = 0;
                        }
                        if (i19 != 0) {
                            aVar = null;
                        } else {
                            aVar = aVar;
                        }
                        if ((i12 & 128) != 0) {
                            i13 &= -29360129;
                            j1Var = SliderDefaults.f10488a.c(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, pVarF, 0, 6, 1023);
                        } else {
                            j1Var = j1Var;
                        }
                        z12 = z11;
                        fVar2 = fVarE;
                        i21 = i17;
                        i22 = i13;
                    } else {
                        if (i24 != 0) {
                            nVar3 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar3 = nVar2;
                        }
                        if (i14 != 0) {
                            z11 = true;
                        }
                        if ((i12 & 16) != 0) {
                            i13 &= -57345;
                            fVarE = fi.t.e(0.0f, 1.0f);
                        }
                        if (i16 != 0) {
                            i17 = 0;
                        }
                        if (i19 != 0) {
                            aVar = null;
                        } else {
                            aVar = aVar;
                        }
                        if ((i12 & 128) != 0) {
                            i13 &= -29360129;
                            j1Var = SliderDefaults.f10488a.c(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, pVarF, 0, 6, 1023);
                        } else {
                            j1Var = j1Var;
                        }
                        z12 = z11;
                        fVar2 = fVarE;
                        i21 = i17;
                        i22 = i13;
                    }
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(-743091416, i22, -1, "androidx.compose.material3.RangeSlider (Slider.kt:384)");
                    }
                    pVarF.T(-492369756);
                    objU = pVarF.U();
                    companion = androidx.compose.runtime.p.INSTANCE;
                    if (objU == companion.a()) {
                        objU = androidx.compose.foundation.interaction.f.a();
                        pVarF.N(objU);
                    }
                    pVarF.c0();
                    gVar = (androidx.compose.foundation.interaction.g) objU;
                    pVarF.T(-492369756);
                    objU2 = pVarF.U();
                    if (objU2 == companion.a()) {
                        objU2 = androidx.compose.foundation.interaction.f.a();
                        pVarF.N(objU2);
                    }
                    pVarF.c0();
                    gVar2 = (androidx.compose.foundation.interaction.g) objU2;
                    if (i21 >= 0) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (!z13) {
                        throw new IllegalArgumentException("steps should be >= 0".toString());
                    }
                    pVarF.T(511388516);
                    zS = pVarF.s(value) | pVarF.s(onValueChange);
                    objU3 = pVarF.U();
                    if (zS) {
                        objU3 = new yh.l<fi.f<Float>, kotlin.b2>() { // from class: androidx.compose.material3.SliderKt$RangeSlider$onValueChangeState$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }

                            public final void a(@dl.d fi.f<Float> it) {
                                kotlin.jvm.internal.f0.p(it, "it");
                                if (kotlin.jvm.internal.f0.g(it, value)) {
                                    return;
                                }
                                onValueChange.invoke(it);
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(fi.f<Float> fVar4) {
                                a(fVar4);
                                return kotlin.b2.f124493a;
                            }
                        };
                        pVarF.N(objU3);
                    } else {
                        objU3 = new yh.l<fi.f<Float>, kotlin.b2>() { // from class: androidx.compose.material3.SliderKt$RangeSlider$onValueChangeState$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }

                            public final void a(@dl.d fi.f<Float> it) {
                                kotlin.jvm.internal.f0.p(it, "it");
                                if (kotlin.jvm.internal.f0.g(it, value)) {
                                    return;
                                }
                                onValueChange.invoke(it);
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(fi.f<Float> fVar4) {
                                a(fVar4);
                                return kotlin.b2.f124493a;
                            }
                        };
                        pVarF.N(objU3);
                    }
                    pVarF.c0();
                    m2 m2VarT2 = androidx.compose.runtime.e2.t(objU3, pVarF, 0);
                    Integer numValueOf2 = Integer.valueOf(i21);
                    pVarF.T(1157296644);
                    zS2 = pVarF.s(numValueOf2);
                    objU4 = pVarF.U();
                    if (zS2) {
                        objU4 = Q(i21);
                        pVarF.N(objU4);
                    } else {
                        objU4 = Q(i21);
                        pVarF.N(objU4);
                    }
                    pVarF.c0();
                    float[] fArr2 = (float[]) objU4;
                    float f11 = 2;
                    pVar2 = pVarF;
                    BoxWithConstraintsKt.a(SizeKt.y(TouchTargetKt.c(nVar3), s1.h.g(f10523a * f11), s1.h.g(f10524b * f11), 0.0f, 0.0f, 12, null), null, false, androidx.compose.runtime.internal.b.b(pVar2, -990606702, true, new SliderKt$RangeSlider$2(aVar, i22, gVar, gVar2, z12, fVar2, value, i21, m2VarT2, fArr2, j1Var)), pVar2, bb.c.d.f31193dj, 6);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    nVar4 = nVar3;
                    z14 = z12;
                    fVar3 = fVar2;
                    i23 = i21;
                    aVar2 = aVar;
                    j1Var2 = j1Var;
                } else {
                    pVarF.W();
                    if ((i11 & 1) != 0) {
                        if (i24 != 0) {
                            nVar3 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar3 = nVar2;
                        }
                        if (i14 != 0) {
                            z11 = true;
                        }
                        if ((i12 & 16) != 0) {
                            i13 &= -57345;
                            fVarE = fi.t.e(0.0f, 1.0f);
                        }
                        if (i16 != 0) {
                            i17 = 0;
                        }
                        if (i19 != 0) {
                            aVar = null;
                        } else {
                            aVar = aVar;
                        }
                        if ((i12 & 128) != 0) {
                            i13 &= -29360129;
                            j1Var = SliderDefaults.f10488a.c(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, pVarF, 0, 6, 1023);
                        } else {
                            j1Var = j1Var;
                        }
                        z12 = z11;
                        fVar2 = fVarE;
                        i21 = i17;
                        i22 = i13;
                    } else {
                        if (i24 != 0) {
                            nVar3 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar3 = nVar2;
                        }
                        if (i14 != 0) {
                            z11 = true;
                        }
                        if ((i12 & 16) != 0) {
                            i13 &= -57345;
                            fVarE = fi.t.e(0.0f, 1.0f);
                        }
                        if (i16 != 0) {
                            i17 = 0;
                        }
                        if (i19 != 0) {
                            aVar = null;
                        } else {
                            aVar = aVar;
                        }
                        if ((i12 & 128) != 0) {
                            i13 &= -29360129;
                            j1Var = SliderDefaults.f10488a.c(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, pVarF, 0, 6, 1023);
                        } else {
                            j1Var = j1Var;
                        }
                        z12 = z11;
                        fVar2 = fVarE;
                        i21 = i17;
                        i22 = i13;
                    }
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(-743091416, i22, -1, "androidx.compose.material3.RangeSlider (Slider.kt:384)");
                    }
                    pVarF.T(-492369756);
                    objU = pVarF.U();
                    companion = androidx.compose.runtime.p.INSTANCE;
                    if (objU == companion.a()) {
                        objU = androidx.compose.foundation.interaction.f.a();
                        pVarF.N(objU);
                    }
                    pVarF.c0();
                    gVar = (androidx.compose.foundation.interaction.g) objU;
                    pVarF.T(-492369756);
                    objU2 = pVarF.U();
                    if (objU2 == companion.a()) {
                        objU2 = androidx.compose.foundation.interaction.f.a();
                        pVarF.N(objU2);
                    }
                    pVarF.c0();
                    gVar2 = (androidx.compose.foundation.interaction.g) objU2;
                    if (i21 >= 0) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (!z13) {
                        throw new IllegalArgumentException("steps should be >= 0".toString());
                    }
                    pVarF.T(511388516);
                    zS = pVarF.s(value) | pVarF.s(onValueChange);
                    objU3 = pVarF.U();
                    if (zS) {
                        objU3 = new yh.l<fi.f<Float>, kotlin.b2>() { // from class: androidx.compose.material3.SliderKt$RangeSlider$onValueChangeState$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }

                            public final void a(@dl.d fi.f<Float> it) {
                                kotlin.jvm.internal.f0.p(it, "it");
                                if (kotlin.jvm.internal.f0.g(it, value)) {
                                    return;
                                }
                                onValueChange.invoke(it);
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(fi.f<Float> fVar4) {
                                a(fVar4);
                                return kotlin.b2.f124493a;
                            }
                        };
                        pVarF.N(objU3);
                    } else {
                        objU3 = new yh.l<fi.f<Float>, kotlin.b2>() { // from class: androidx.compose.material3.SliderKt$RangeSlider$onValueChangeState$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }

                            public final void a(@dl.d fi.f<Float> it) {
                                kotlin.jvm.internal.f0.p(it, "it");
                                if (kotlin.jvm.internal.f0.g(it, value)) {
                                    return;
                                }
                                onValueChange.invoke(it);
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(fi.f<Float> fVar4) {
                                a(fVar4);
                                return kotlin.b2.f124493a;
                            }
                        };
                        pVarF.N(objU3);
                    }
                    pVarF.c0();
                    m2 m2VarT3 = androidx.compose.runtime.e2.t(objU3, pVarF, 0);
                    Integer numValueOf3 = Integer.valueOf(i21);
                    pVarF.T(1157296644);
                    zS2 = pVarF.s(numValueOf3);
                    objU4 = pVarF.U();
                    if (zS2) {
                        objU4 = Q(i21);
                        pVarF.N(objU4);
                    } else {
                        objU4 = Q(i21);
                        pVarF.N(objU4);
                    }
                    pVarF.c0();
                    float[] fArr3 = (float[]) objU4;
                    float f12 = 2;
                    pVar2 = pVarF;
                    BoxWithConstraintsKt.a(SizeKt.y(TouchTargetKt.c(nVar3), s1.h.g(f10523a * f12), s1.h.g(f10524b * f12), 0.0f, 0.0f, 12, null), null, false, androidx.compose.runtime.internal.b.b(pVar2, -990606702, true, new SliderKt$RangeSlider$2(aVar, i22, gVar, gVar2, z12, fVar2, value, i21, m2VarT3, fArr3, j1Var)), pVar2, bb.c.d.f31193dj, 6);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    nVar4 = nVar3;
                    z14 = z12;
                    fVar3 = fVar2;
                    i23 = i21;
                    aVar2 = aVar;
                    j1Var2 = j1Var;
                }
                u1VarH = pVar2.H();
                if (u1VarH == null) {
                    return;
                }
                u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.SliderKt$RangeSlider$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public final void a(@dl.e androidx.compose.runtime.p pVar3, int i26) {
                        SliderKt.a(value, onValueChange, nVar4, z14, fVar3, i23, aVar2, j1Var2, pVar3, i11 | 1, i12);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar3, Integer num) {
                        a(pVar3, num.intValue());
                        return kotlin.b2.f124493a;
                    }
                });
            }
            i13 |= bb.c.d.f31193dj;
            z11 = z10;
            if ((57344 & i11) == 0) {
                if ((i12 & 16) == 0) {
                    fVarE = fVar;
                    if (pVarF.s(fVarE)) {
                    }
                    i13 |= i25;
                } else {
                    fVarE = fVar;
                }
                i13 |= i25;
            } else {
                fVarE = fVar;
            }
            i16 = i12 & 32;
            if (i16 != 0) {
                if ((458752 & i11) == 0) {
                    i17 = i10;
                    if (pVarF.y(i17)) {
                        i18 = 131072;
                    } else {
                        i18 = 65536;
                    }
                    i13 |= i18;
                }
                i19 = i12 & 64;
                if (i19 != 0) {
                    i13 |= 1572864;
                } else if ((i11 & 3670016) == 0) {
                    if (pVarF.s(aVar)) {
                        i20 = 1048576;
                    } else {
                        i20 = 524288;
                    }
                    i13 |= i20;
                }
                if ((i11 & 29360128) != 0) {
                    i13 |= ((i12 & 128) == 0 || !pVarF.s(j1Var)) ? 4194304 : 8388608;
                }
                if ((i13 & 23967451) == 4793490) {
                    pVarF.W();
                    if ((i11 & 1) != 0) {
                        if (i24 != 0) {
                            nVar3 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar3 = nVar2;
                        }
                        if (i14 != 0) {
                            z11 = true;
                        }
                        if ((i12 & 16) != 0) {
                            i13 &= -57345;
                            fVarE = fi.t.e(0.0f, 1.0f);
                        }
                        if (i16 != 0) {
                            i17 = 0;
                        }
                        if (i19 != 0) {
                            aVar = null;
                        } else {
                            aVar = aVar;
                        }
                        if ((i12 & 128) != 0) {
                            i13 &= -29360129;
                            j1Var = SliderDefaults.f10488a.c(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, pVarF, 0, 6, 1023);
                        } else {
                            j1Var = j1Var;
                        }
                        z12 = z11;
                        fVar2 = fVarE;
                        i21 = i17;
                        i22 = i13;
                    } else {
                        if (i24 != 0) {
                            nVar3 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar3 = nVar2;
                        }
                        if (i14 != 0) {
                            z11 = true;
                        }
                        if ((i12 & 16) != 0) {
                            i13 &= -57345;
                            fVarE = fi.t.e(0.0f, 1.0f);
                        }
                        if (i16 != 0) {
                            i17 = 0;
                        }
                        if (i19 != 0) {
                            aVar = null;
                        } else {
                            aVar = aVar;
                        }
                        if ((i12 & 128) != 0) {
                            i13 &= -29360129;
                            j1Var = SliderDefaults.f10488a.c(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, pVarF, 0, 6, 1023);
                        } else {
                            j1Var = j1Var;
                        }
                        z12 = z11;
                        fVar2 = fVarE;
                        i21 = i17;
                        i22 = i13;
                    }
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(-743091416, i22, -1, "androidx.compose.material3.RangeSlider (Slider.kt:384)");
                    }
                    pVarF.T(-492369756);
                    objU = pVarF.U();
                    companion = androidx.compose.runtime.p.INSTANCE;
                    if (objU == companion.a()) {
                        objU = androidx.compose.foundation.interaction.f.a();
                        pVarF.N(objU);
                    }
                    pVarF.c0();
                    gVar = (androidx.compose.foundation.interaction.g) objU;
                    pVarF.T(-492369756);
                    objU2 = pVarF.U();
                    if (objU2 == companion.a()) {
                        objU2 = androidx.compose.foundation.interaction.f.a();
                        pVarF.N(objU2);
                    }
                    pVarF.c0();
                    gVar2 = (androidx.compose.foundation.interaction.g) objU2;
                    if (i21 >= 0) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (!z13) {
                        throw new IllegalArgumentException("steps should be >= 0".toString());
                    }
                    pVarF.T(511388516);
                    zS = pVarF.s(value) | pVarF.s(onValueChange);
                    objU3 = pVarF.U();
                    if (zS) {
                        objU3 = new yh.l<fi.f<Float>, kotlin.b2>() { // from class: androidx.compose.material3.SliderKt$RangeSlider$onValueChangeState$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }

                            public final void a(@dl.d fi.f<Float> it) {
                                kotlin.jvm.internal.f0.p(it, "it");
                                if (kotlin.jvm.internal.f0.g(it, value)) {
                                    return;
                                }
                                onValueChange.invoke(it);
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(fi.f<Float> fVar4) {
                                a(fVar4);
                                return kotlin.b2.f124493a;
                            }
                        };
                        pVarF.N(objU3);
                    } else {
                        objU3 = new yh.l<fi.f<Float>, kotlin.b2>() { // from class: androidx.compose.material3.SliderKt$RangeSlider$onValueChangeState$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }

                            public final void a(@dl.d fi.f<Float> it) {
                                kotlin.jvm.internal.f0.p(it, "it");
                                if (kotlin.jvm.internal.f0.g(it, value)) {
                                    return;
                                }
                                onValueChange.invoke(it);
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(fi.f<Float> fVar4) {
                                a(fVar4);
                                return kotlin.b2.f124493a;
                            }
                        };
                        pVarF.N(objU3);
                    }
                    pVarF.c0();
                    m2 m2VarT4 = androidx.compose.runtime.e2.t(objU3, pVarF, 0);
                    Integer numValueOf4 = Integer.valueOf(i21);
                    pVarF.T(1157296644);
                    zS2 = pVarF.s(numValueOf4);
                    objU4 = pVarF.U();
                    if (zS2) {
                        objU4 = Q(i21);
                        pVarF.N(objU4);
                    } else {
                        objU4 = Q(i21);
                        pVarF.N(objU4);
                    }
                    pVarF.c0();
                    float[] fArr4 = (float[]) objU4;
                    float f13 = 2;
                    pVar2 = pVarF;
                    BoxWithConstraintsKt.a(SizeKt.y(TouchTargetKt.c(nVar3), s1.h.g(f10523a * f13), s1.h.g(f10524b * f13), 0.0f, 0.0f, 12, null), null, false, androidx.compose.runtime.internal.b.b(pVar2, -990606702, true, new SliderKt$RangeSlider$2(aVar, i22, gVar, gVar2, z12, fVar2, value, i21, m2VarT4, fArr4, j1Var)), pVar2, bb.c.d.f31193dj, 6);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    nVar4 = nVar3;
                    z14 = z12;
                    fVar3 = fVar2;
                    i23 = i21;
                    aVar2 = aVar;
                    j1Var2 = j1Var;
                } else {
                    pVarF.W();
                    if ((i11 & 1) != 0) {
                        if (i24 != 0) {
                            nVar3 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar3 = nVar2;
                        }
                        if (i14 != 0) {
                            z11 = true;
                        }
                        if ((i12 & 16) != 0) {
                            i13 &= -57345;
                            fVarE = fi.t.e(0.0f, 1.0f);
                        }
                        if (i16 != 0) {
                            i17 = 0;
                        }
                        if (i19 != 0) {
                            aVar = null;
                        } else {
                            aVar = aVar;
                        }
                        if ((i12 & 128) != 0) {
                            i13 &= -29360129;
                            j1Var = SliderDefaults.f10488a.c(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, pVarF, 0, 6, 1023);
                        } else {
                            j1Var = j1Var;
                        }
                        z12 = z11;
                        fVar2 = fVarE;
                        i21 = i17;
                        i22 = i13;
                    } else {
                        if (i24 != 0) {
                            nVar3 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar3 = nVar2;
                        }
                        if (i14 != 0) {
                            z11 = true;
                        }
                        if ((i12 & 16) != 0) {
                            i13 &= -57345;
                            fVarE = fi.t.e(0.0f, 1.0f);
                        }
                        if (i16 != 0) {
                            i17 = 0;
                        }
                        if (i19 != 0) {
                            aVar = null;
                        } else {
                            aVar = aVar;
                        }
                        if ((i12 & 128) != 0) {
                            i13 &= -29360129;
                            j1Var = SliderDefaults.f10488a.c(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, pVarF, 0, 6, 1023);
                        } else {
                            j1Var = j1Var;
                        }
                        z12 = z11;
                        fVar2 = fVarE;
                        i21 = i17;
                        i22 = i13;
                    }
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(-743091416, i22, -1, "androidx.compose.material3.RangeSlider (Slider.kt:384)");
                    }
                    pVarF.T(-492369756);
                    objU = pVarF.U();
                    companion = androidx.compose.runtime.p.INSTANCE;
                    if (objU == companion.a()) {
                        objU = androidx.compose.foundation.interaction.f.a();
                        pVarF.N(objU);
                    }
                    pVarF.c0();
                    gVar = (androidx.compose.foundation.interaction.g) objU;
                    pVarF.T(-492369756);
                    objU2 = pVarF.U();
                    if (objU2 == companion.a()) {
                        objU2 = androidx.compose.foundation.interaction.f.a();
                        pVarF.N(objU2);
                    }
                    pVarF.c0();
                    gVar2 = (androidx.compose.foundation.interaction.g) objU2;
                    if (i21 >= 0) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (!z13) {
                        throw new IllegalArgumentException("steps should be >= 0".toString());
                    }
                    pVarF.T(511388516);
                    zS = pVarF.s(value) | pVarF.s(onValueChange);
                    objU3 = pVarF.U();
                    if (zS) {
                        objU3 = new yh.l<fi.f<Float>, kotlin.b2>() { // from class: androidx.compose.material3.SliderKt$RangeSlider$onValueChangeState$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }

                            public final void a(@dl.d fi.f<Float> it) {
                                kotlin.jvm.internal.f0.p(it, "it");
                                if (kotlin.jvm.internal.f0.g(it, value)) {
                                    return;
                                }
                                onValueChange.invoke(it);
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(fi.f<Float> fVar4) {
                                a(fVar4);
                                return kotlin.b2.f124493a;
                            }
                        };
                        pVarF.N(objU3);
                    } else {
                        objU3 = new yh.l<fi.f<Float>, kotlin.b2>() { // from class: androidx.compose.material3.SliderKt$RangeSlider$onValueChangeState$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }

                            public final void a(@dl.d fi.f<Float> it) {
                                kotlin.jvm.internal.f0.p(it, "it");
                                if (kotlin.jvm.internal.f0.g(it, value)) {
                                    return;
                                }
                                onValueChange.invoke(it);
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(fi.f<Float> fVar4) {
                                a(fVar4);
                                return kotlin.b2.f124493a;
                            }
                        };
                        pVarF.N(objU3);
                    }
                    pVarF.c0();
                    m2 m2VarT5 = androidx.compose.runtime.e2.t(objU3, pVarF, 0);
                    Integer numValueOf5 = Integer.valueOf(i21);
                    pVarF.T(1157296644);
                    zS2 = pVarF.s(numValueOf5);
                    objU4 = pVarF.U();
                    if (zS2) {
                        objU4 = Q(i21);
                        pVarF.N(objU4);
                    } else {
                        objU4 = Q(i21);
                        pVarF.N(objU4);
                    }
                    pVarF.c0();
                    float[] fArr5 = (float[]) objU4;
                    float f14 = 2;
                    pVar2 = pVarF;
                    BoxWithConstraintsKt.a(SizeKt.y(TouchTargetKt.c(nVar3), s1.h.g(f10523a * f14), s1.h.g(f10524b * f14), 0.0f, 0.0f, 12, null), null, false, androidx.compose.runtime.internal.b.b(pVar2, -990606702, true, new SliderKt$RangeSlider$2(aVar, i22, gVar, gVar2, z12, fVar2, value, i21, m2VarT5, fArr5, j1Var)), pVar2, bb.c.d.f31193dj, 6);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    nVar4 = nVar3;
                    z14 = z12;
                    fVar3 = fVar2;
                    i23 = i21;
                    aVar2 = aVar;
                    j1Var2 = j1Var;
                }
                u1VarH = pVar2.H();
                if (u1VarH == null) {
                    return;
                }
                u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.SliderKt$RangeSlider$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public final void a(@dl.e androidx.compose.runtime.p pVar3, int i26) {
                        SliderKt.a(value, onValueChange, nVar4, z14, fVar3, i23, aVar2, j1Var2, pVar3, i11 | 1, i12);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar3, Integer num) {
                        a(pVar3, num.intValue());
                        return kotlin.b2.f124493a;
                    }
                });
            }
            i13 |= androidx.profileinstaller.o.c.f26824k;
            i17 = i10;
            i19 = i12 & 64;
            if (i19 != 0) {
                i13 |= 1572864;
            } else if ((i11 & 3670016) == 0) {
                if (pVarF.s(aVar)) {
                    i20 = 1048576;
                } else {
                    i20 = 524288;
                }
                i13 |= i20;
            }
            if ((i11 & 29360128) != 0) {
                i13 |= ((i12 & 128) == 0 || !pVarF.s(j1Var)) ? 4194304 : 8388608;
            }
            if ((i13 & 23967451) == 4793490) {
                pVarF.W();
                if ((i11 & 1) != 0) {
                    if (i24 != 0) {
                        nVar3 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar3 = nVar2;
                    }
                    if (i14 != 0) {
                        z11 = true;
                    }
                    if ((i12 & 16) != 0) {
                        i13 &= -57345;
                        fVarE = fi.t.e(0.0f, 1.0f);
                    }
                    if (i16 != 0) {
                        i17 = 0;
                    }
                    if (i19 != 0) {
                        aVar = null;
                    } else {
                        aVar = aVar;
                    }
                    if ((i12 & 128) != 0) {
                        i13 &= -29360129;
                        j1Var = SliderDefaults.f10488a.c(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, pVarF, 0, 6, 1023);
                    } else {
                        j1Var = j1Var;
                    }
                    z12 = z11;
                    fVar2 = fVarE;
                    i21 = i17;
                    i22 = i13;
                } else {
                    if (i24 != 0) {
                        nVar3 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar3 = nVar2;
                    }
                    if (i14 != 0) {
                        z11 = true;
                    }
                    if ((i12 & 16) != 0) {
                        i13 &= -57345;
                        fVarE = fi.t.e(0.0f, 1.0f);
                    }
                    if (i16 != 0) {
                        i17 = 0;
                    }
                    if (i19 != 0) {
                        aVar = null;
                    } else {
                        aVar = aVar;
                    }
                    if ((i12 & 128) != 0) {
                        i13 &= -29360129;
                        j1Var = SliderDefaults.f10488a.c(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, pVarF, 0, 6, 1023);
                    } else {
                        j1Var = j1Var;
                    }
                    z12 = z11;
                    fVar2 = fVarE;
                    i21 = i17;
                    i22 = i13;
                }
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(-743091416, i22, -1, "androidx.compose.material3.RangeSlider (Slider.kt:384)");
                }
                pVarF.T(-492369756);
                objU = pVarF.U();
                companion = androidx.compose.runtime.p.INSTANCE;
                if (objU == companion.a()) {
                    objU = androidx.compose.foundation.interaction.f.a();
                    pVarF.N(objU);
                }
                pVarF.c0();
                gVar = (androidx.compose.foundation.interaction.g) objU;
                pVarF.T(-492369756);
                objU2 = pVarF.U();
                if (objU2 == companion.a()) {
                    objU2 = androidx.compose.foundation.interaction.f.a();
                    pVarF.N(objU2);
                }
                pVarF.c0();
                gVar2 = (androidx.compose.foundation.interaction.g) objU2;
                if (i21 >= 0) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (!z13) {
                    throw new IllegalArgumentException("steps should be >= 0".toString());
                }
                pVarF.T(511388516);
                zS = pVarF.s(value) | pVarF.s(onValueChange);
                objU3 = pVarF.U();
                if (zS) {
                    objU3 = new yh.l<fi.f<Float>, kotlin.b2>() { // from class: androidx.compose.material3.SliderKt$RangeSlider$onValueChangeState$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(1);
                        }

                        public final void a(@dl.d fi.f<Float> it) {
                            kotlin.jvm.internal.f0.p(it, "it");
                            if (kotlin.jvm.internal.f0.g(it, value)) {
                                return;
                            }
                            onValueChange.invoke(it);
                        }

                        @Override // yh.l
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(fi.f<Float> fVar4) {
                            a(fVar4);
                            return kotlin.b2.f124493a;
                        }
                    };
                    pVarF.N(objU3);
                } else {
                    objU3 = new yh.l<fi.f<Float>, kotlin.b2>() { // from class: androidx.compose.material3.SliderKt$RangeSlider$onValueChangeState$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(1);
                        }

                        public final void a(@dl.d fi.f<Float> it) {
                            kotlin.jvm.internal.f0.p(it, "it");
                            if (kotlin.jvm.internal.f0.g(it, value)) {
                                return;
                            }
                            onValueChange.invoke(it);
                        }

                        @Override // yh.l
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(fi.f<Float> fVar4) {
                            a(fVar4);
                            return kotlin.b2.f124493a;
                        }
                    };
                    pVarF.N(objU3);
                }
                pVarF.c0();
                m2 m2VarT6 = androidx.compose.runtime.e2.t(objU3, pVarF, 0);
                Integer numValueOf6 = Integer.valueOf(i21);
                pVarF.T(1157296644);
                zS2 = pVarF.s(numValueOf6);
                objU4 = pVarF.U();
                if (zS2) {
                    objU4 = Q(i21);
                    pVarF.N(objU4);
                } else {
                    objU4 = Q(i21);
                    pVarF.N(objU4);
                }
                pVarF.c0();
                float[] fArr6 = (float[]) objU4;
                float f15 = 2;
                pVar2 = pVarF;
                BoxWithConstraintsKt.a(SizeKt.y(TouchTargetKt.c(nVar3), s1.h.g(f10523a * f15), s1.h.g(f10524b * f15), 0.0f, 0.0f, 12, null), null, false, androidx.compose.runtime.internal.b.b(pVar2, -990606702, true, new SliderKt$RangeSlider$2(aVar, i22, gVar, gVar2, z12, fVar2, value, i21, m2VarT6, fArr6, j1Var)), pVar2, bb.c.d.f31193dj, 6);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                nVar4 = nVar3;
                z14 = z12;
                fVar3 = fVar2;
                i23 = i21;
                aVar2 = aVar;
                j1Var2 = j1Var;
            } else {
                pVarF.W();
                if ((i11 & 1) != 0) {
                    if (i24 != 0) {
                        nVar3 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar3 = nVar2;
                    }
                    if (i14 != 0) {
                        z11 = true;
                    }
                    if ((i12 & 16) != 0) {
                        i13 &= -57345;
                        fVarE = fi.t.e(0.0f, 1.0f);
                    }
                    if (i16 != 0) {
                        i17 = 0;
                    }
                    if (i19 != 0) {
                        aVar = null;
                    } else {
                        aVar = aVar;
                    }
                    if ((i12 & 128) != 0) {
                        i13 &= -29360129;
                        j1Var = SliderDefaults.f10488a.c(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, pVarF, 0, 6, 1023);
                    } else {
                        j1Var = j1Var;
                    }
                    z12 = z11;
                    fVar2 = fVarE;
                    i21 = i17;
                    i22 = i13;
                } else {
                    if (i24 != 0) {
                        nVar3 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar3 = nVar2;
                    }
                    if (i14 != 0) {
                        z11 = true;
                    }
                    if ((i12 & 16) != 0) {
                        i13 &= -57345;
                        fVarE = fi.t.e(0.0f, 1.0f);
                    }
                    if (i16 != 0) {
                        i17 = 0;
                    }
                    if (i19 != 0) {
                        aVar = null;
                    } else {
                        aVar = aVar;
                    }
                    if ((i12 & 128) != 0) {
                        i13 &= -29360129;
                        j1Var = SliderDefaults.f10488a.c(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, pVarF, 0, 6, 1023);
                    } else {
                        j1Var = j1Var;
                    }
                    z12 = z11;
                    fVar2 = fVarE;
                    i21 = i17;
                    i22 = i13;
                }
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(-743091416, i22, -1, "androidx.compose.material3.RangeSlider (Slider.kt:384)");
                }
                pVarF.T(-492369756);
                objU = pVarF.U();
                companion = androidx.compose.runtime.p.INSTANCE;
                if (objU == companion.a()) {
                    objU = androidx.compose.foundation.interaction.f.a();
                    pVarF.N(objU);
                }
                pVarF.c0();
                gVar = (androidx.compose.foundation.interaction.g) objU;
                pVarF.T(-492369756);
                objU2 = pVarF.U();
                if (objU2 == companion.a()) {
                    objU2 = androidx.compose.foundation.interaction.f.a();
                    pVarF.N(objU2);
                }
                pVarF.c0();
                gVar2 = (androidx.compose.foundation.interaction.g) objU2;
                if (i21 >= 0) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (!z13) {
                    throw new IllegalArgumentException("steps should be >= 0".toString());
                }
                pVarF.T(511388516);
                zS = pVarF.s(value) | pVarF.s(onValueChange);
                objU3 = pVarF.U();
                if (zS) {
                    objU3 = new yh.l<fi.f<Float>, kotlin.b2>() { // from class: androidx.compose.material3.SliderKt$RangeSlider$onValueChangeState$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(1);
                        }

                        public final void a(@dl.d fi.f<Float> it) {
                            kotlin.jvm.internal.f0.p(it, "it");
                            if (kotlin.jvm.internal.f0.g(it, value)) {
                                return;
                            }
                            onValueChange.invoke(it);
                        }

                        @Override // yh.l
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(fi.f<Float> fVar4) {
                            a(fVar4);
                            return kotlin.b2.f124493a;
                        }
                    };
                    pVarF.N(objU3);
                } else {
                    objU3 = new yh.l<fi.f<Float>, kotlin.b2>() { // from class: androidx.compose.material3.SliderKt$RangeSlider$onValueChangeState$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(1);
                        }

                        public final void a(@dl.d fi.f<Float> it) {
                            kotlin.jvm.internal.f0.p(it, "it");
                            if (kotlin.jvm.internal.f0.g(it, value)) {
                                return;
                            }
                            onValueChange.invoke(it);
                        }

                        @Override // yh.l
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(fi.f<Float> fVar4) {
                            a(fVar4);
                            return kotlin.b2.f124493a;
                        }
                    };
                    pVarF.N(objU3);
                }
                pVarF.c0();
                m2 m2VarT7 = androidx.compose.runtime.e2.t(objU3, pVarF, 0);
                Integer numValueOf7 = Integer.valueOf(i21);
                pVarF.T(1157296644);
                zS2 = pVarF.s(numValueOf7);
                objU4 = pVarF.U();
                if (zS2) {
                    objU4 = Q(i21);
                    pVarF.N(objU4);
                } else {
                    objU4 = Q(i21);
                    pVarF.N(objU4);
                }
                pVarF.c0();
                float[] fArr7 = (float[]) objU4;
                float f16 = 2;
                pVar2 = pVarF;
                BoxWithConstraintsKt.a(SizeKt.y(TouchTargetKt.c(nVar3), s1.h.g(f10523a * f16), s1.h.g(f10524b * f16), 0.0f, 0.0f, 12, null), null, false, androidx.compose.runtime.internal.b.b(pVar2, -990606702, true, new SliderKt$RangeSlider$2(aVar, i22, gVar, gVar2, z12, fVar2, value, i21, m2VarT7, fArr7, j1Var)), pVar2, bb.c.d.f31193dj, 6);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                nVar4 = nVar3;
                z14 = z12;
                fVar3 = fVar2;
                i23 = i21;
                aVar2 = aVar;
                j1Var2 = j1Var;
            }
            u1VarH = pVar2.H();
            if (u1VarH == null) {
                return;
            }
            u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.SliderKt$RangeSlider$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void a(@dl.e androidx.compose.runtime.p pVar3, int i26) {
                    SliderKt.a(value, onValueChange, nVar4, z14, fVar3, i23, aVar2, j1Var2, pVar3, i11 | 1, i12);
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar3, Integer num) {
                    a(pVar3, num.intValue());
                    return kotlin.b2.f124493a;
                }
            });
        }
        i13 |= bb.c.b.f30966u4;
        nVar2 = nVar;
        i14 = i12 & 8;
        if (i14 != 0) {
            if ((i11 & bb.c.g.f32954lc) == 0) {
                z11 = z10;
                if (pVarF.u(z11)) {
                    i15 = 2048;
                } else {
                    i15 = 1024;
                }
                i13 |= i15;
            }
            if ((57344 & i11) == 0) {
                if ((i12 & 16) == 0) {
                    fVarE = fVar;
                    if (pVarF.s(fVarE)) {
                    }
                    i13 |= i25;
                } else {
                    fVarE = fVar;
                }
                i13 |= i25;
            } else {
                fVarE = fVar;
            }
            i16 = i12 & 32;
            if (i16 != 0) {
                if ((458752 & i11) == 0) {
                    i17 = i10;
                    if (pVarF.y(i17)) {
                        i18 = 131072;
                    } else {
                        i18 = 65536;
                    }
                    i13 |= i18;
                }
                i19 = i12 & 64;
                if (i19 != 0) {
                    i13 |= 1572864;
                } else if ((i11 & 3670016) == 0) {
                    if (pVarF.s(aVar)) {
                        i20 = 1048576;
                    } else {
                        i20 = 524288;
                    }
                    i13 |= i20;
                }
                if ((i11 & 29360128) != 0) {
                    i13 |= ((i12 & 128) == 0 || !pVarF.s(j1Var)) ? 4194304 : 8388608;
                }
                if ((i13 & 23967451) == 4793490) {
                    pVarF.W();
                    if ((i11 & 1) != 0) {
                        if (i24 != 0) {
                            nVar3 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar3 = nVar2;
                        }
                        if (i14 != 0) {
                            z11 = true;
                        }
                        if ((i12 & 16) != 0) {
                            i13 &= -57345;
                            fVarE = fi.t.e(0.0f, 1.0f);
                        }
                        if (i16 != 0) {
                            i17 = 0;
                        }
                        if (i19 != 0) {
                            aVar = null;
                        } else {
                            aVar = aVar;
                        }
                        if ((i12 & 128) != 0) {
                            i13 &= -29360129;
                            j1Var = SliderDefaults.f10488a.c(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, pVarF, 0, 6, 1023);
                        } else {
                            j1Var = j1Var;
                        }
                        z12 = z11;
                        fVar2 = fVarE;
                        i21 = i17;
                        i22 = i13;
                    } else {
                        if (i24 != 0) {
                            nVar3 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar3 = nVar2;
                        }
                        if (i14 != 0) {
                            z11 = true;
                        }
                        if ((i12 & 16) != 0) {
                            i13 &= -57345;
                            fVarE = fi.t.e(0.0f, 1.0f);
                        }
                        if (i16 != 0) {
                            i17 = 0;
                        }
                        if (i19 != 0) {
                            aVar = null;
                        } else {
                            aVar = aVar;
                        }
                        if ((i12 & 128) != 0) {
                            i13 &= -29360129;
                            j1Var = SliderDefaults.f10488a.c(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, pVarF, 0, 6, 1023);
                        } else {
                            j1Var = j1Var;
                        }
                        z12 = z11;
                        fVar2 = fVarE;
                        i21 = i17;
                        i22 = i13;
                    }
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(-743091416, i22, -1, "androidx.compose.material3.RangeSlider (Slider.kt:384)");
                    }
                    pVarF.T(-492369756);
                    objU = pVarF.U();
                    companion = androidx.compose.runtime.p.INSTANCE;
                    if (objU == companion.a()) {
                        objU = androidx.compose.foundation.interaction.f.a();
                        pVarF.N(objU);
                    }
                    pVarF.c0();
                    gVar = (androidx.compose.foundation.interaction.g) objU;
                    pVarF.T(-492369756);
                    objU2 = pVarF.U();
                    if (objU2 == companion.a()) {
                        objU2 = androidx.compose.foundation.interaction.f.a();
                        pVarF.N(objU2);
                    }
                    pVarF.c0();
                    gVar2 = (androidx.compose.foundation.interaction.g) objU2;
                    if (i21 >= 0) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (!z13) {
                        throw new IllegalArgumentException("steps should be >= 0".toString());
                    }
                    pVarF.T(511388516);
                    zS = pVarF.s(value) | pVarF.s(onValueChange);
                    objU3 = pVarF.U();
                    if (zS) {
                        objU3 = new yh.l<fi.f<Float>, kotlin.b2>() { // from class: androidx.compose.material3.SliderKt$RangeSlider$onValueChangeState$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }

                            public final void a(@dl.d fi.f<Float> it) {
                                kotlin.jvm.internal.f0.p(it, "it");
                                if (kotlin.jvm.internal.f0.g(it, value)) {
                                    return;
                                }
                                onValueChange.invoke(it);
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(fi.f<Float> fVar4) {
                                a(fVar4);
                                return kotlin.b2.f124493a;
                            }
                        };
                        pVarF.N(objU3);
                    } else {
                        objU3 = new yh.l<fi.f<Float>, kotlin.b2>() { // from class: androidx.compose.material3.SliderKt$RangeSlider$onValueChangeState$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }

                            public final void a(@dl.d fi.f<Float> it) {
                                kotlin.jvm.internal.f0.p(it, "it");
                                if (kotlin.jvm.internal.f0.g(it, value)) {
                                    return;
                                }
                                onValueChange.invoke(it);
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(fi.f<Float> fVar4) {
                                a(fVar4);
                                return kotlin.b2.f124493a;
                            }
                        };
                        pVarF.N(objU3);
                    }
                    pVarF.c0();
                    m2 m2VarT8 = androidx.compose.runtime.e2.t(objU3, pVarF, 0);
                    Integer numValueOf8 = Integer.valueOf(i21);
                    pVarF.T(1157296644);
                    zS2 = pVarF.s(numValueOf8);
                    objU4 = pVarF.U();
                    if (zS2) {
                        objU4 = Q(i21);
                        pVarF.N(objU4);
                    } else {
                        objU4 = Q(i21);
                        pVarF.N(objU4);
                    }
                    pVarF.c0();
                    float[] fArr8 = (float[]) objU4;
                    float f17 = 2;
                    pVar2 = pVarF;
                    BoxWithConstraintsKt.a(SizeKt.y(TouchTargetKt.c(nVar3), s1.h.g(f10523a * f17), s1.h.g(f10524b * f17), 0.0f, 0.0f, 12, null), null, false, androidx.compose.runtime.internal.b.b(pVar2, -990606702, true, new SliderKt$RangeSlider$2(aVar, i22, gVar, gVar2, z12, fVar2, value, i21, m2VarT8, fArr8, j1Var)), pVar2, bb.c.d.f31193dj, 6);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    nVar4 = nVar3;
                    z14 = z12;
                    fVar3 = fVar2;
                    i23 = i21;
                    aVar2 = aVar;
                    j1Var2 = j1Var;
                } else {
                    pVarF.W();
                    if ((i11 & 1) != 0) {
                        if (i24 != 0) {
                            nVar3 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar3 = nVar2;
                        }
                        if (i14 != 0) {
                            z11 = true;
                        }
                        if ((i12 & 16) != 0) {
                            i13 &= -57345;
                            fVarE = fi.t.e(0.0f, 1.0f);
                        }
                        if (i16 != 0) {
                            i17 = 0;
                        }
                        if (i19 != 0) {
                            aVar = null;
                        } else {
                            aVar = aVar;
                        }
                        if ((i12 & 128) != 0) {
                            i13 &= -29360129;
                            j1Var = SliderDefaults.f10488a.c(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, pVarF, 0, 6, 1023);
                        } else {
                            j1Var = j1Var;
                        }
                        z12 = z11;
                        fVar2 = fVarE;
                        i21 = i17;
                        i22 = i13;
                    } else {
                        if (i24 != 0) {
                            nVar3 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar3 = nVar2;
                        }
                        if (i14 != 0) {
                            z11 = true;
                        }
                        if ((i12 & 16) != 0) {
                            i13 &= -57345;
                            fVarE = fi.t.e(0.0f, 1.0f);
                        }
                        if (i16 != 0) {
                            i17 = 0;
                        }
                        if (i19 != 0) {
                            aVar = null;
                        } else {
                            aVar = aVar;
                        }
                        if ((i12 & 128) != 0) {
                            i13 &= -29360129;
                            j1Var = SliderDefaults.f10488a.c(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, pVarF, 0, 6, 1023);
                        } else {
                            j1Var = j1Var;
                        }
                        z12 = z11;
                        fVar2 = fVarE;
                        i21 = i17;
                        i22 = i13;
                    }
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(-743091416, i22, -1, "androidx.compose.material3.RangeSlider (Slider.kt:384)");
                    }
                    pVarF.T(-492369756);
                    objU = pVarF.U();
                    companion = androidx.compose.runtime.p.INSTANCE;
                    if (objU == companion.a()) {
                        objU = androidx.compose.foundation.interaction.f.a();
                        pVarF.N(objU);
                    }
                    pVarF.c0();
                    gVar = (androidx.compose.foundation.interaction.g) objU;
                    pVarF.T(-492369756);
                    objU2 = pVarF.U();
                    if (objU2 == companion.a()) {
                        objU2 = androidx.compose.foundation.interaction.f.a();
                        pVarF.N(objU2);
                    }
                    pVarF.c0();
                    gVar2 = (androidx.compose.foundation.interaction.g) objU2;
                    if (i21 >= 0) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (!z13) {
                        throw new IllegalArgumentException("steps should be >= 0".toString());
                    }
                    pVarF.T(511388516);
                    zS = pVarF.s(value) | pVarF.s(onValueChange);
                    objU3 = pVarF.U();
                    if (zS) {
                        objU3 = new yh.l<fi.f<Float>, kotlin.b2>() { // from class: androidx.compose.material3.SliderKt$RangeSlider$onValueChangeState$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }

                            public final void a(@dl.d fi.f<Float> it) {
                                kotlin.jvm.internal.f0.p(it, "it");
                                if (kotlin.jvm.internal.f0.g(it, value)) {
                                    return;
                                }
                                onValueChange.invoke(it);
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(fi.f<Float> fVar4) {
                                a(fVar4);
                                return kotlin.b2.f124493a;
                            }
                        };
                        pVarF.N(objU3);
                    } else {
                        objU3 = new yh.l<fi.f<Float>, kotlin.b2>() { // from class: androidx.compose.material3.SliderKt$RangeSlider$onValueChangeState$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }

                            public final void a(@dl.d fi.f<Float> it) {
                                kotlin.jvm.internal.f0.p(it, "it");
                                if (kotlin.jvm.internal.f0.g(it, value)) {
                                    return;
                                }
                                onValueChange.invoke(it);
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(fi.f<Float> fVar4) {
                                a(fVar4);
                                return kotlin.b2.f124493a;
                            }
                        };
                        pVarF.N(objU3);
                    }
                    pVarF.c0();
                    m2 m2VarT9 = androidx.compose.runtime.e2.t(objU3, pVarF, 0);
                    Integer numValueOf9 = Integer.valueOf(i21);
                    pVarF.T(1157296644);
                    zS2 = pVarF.s(numValueOf9);
                    objU4 = pVarF.U();
                    if (zS2) {
                        objU4 = Q(i21);
                        pVarF.N(objU4);
                    } else {
                        objU4 = Q(i21);
                        pVarF.N(objU4);
                    }
                    pVarF.c0();
                    float[] fArr9 = (float[]) objU4;
                    float f18 = 2;
                    pVar2 = pVarF;
                    BoxWithConstraintsKt.a(SizeKt.y(TouchTargetKt.c(nVar3), s1.h.g(f10523a * f18), s1.h.g(f10524b * f18), 0.0f, 0.0f, 12, null), null, false, androidx.compose.runtime.internal.b.b(pVar2, -990606702, true, new SliderKt$RangeSlider$2(aVar, i22, gVar, gVar2, z12, fVar2, value, i21, m2VarT9, fArr9, j1Var)), pVar2, bb.c.d.f31193dj, 6);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    nVar4 = nVar3;
                    z14 = z12;
                    fVar3 = fVar2;
                    i23 = i21;
                    aVar2 = aVar;
                    j1Var2 = j1Var;
                }
                u1VarH = pVar2.H();
                if (u1VarH == null) {
                    return;
                }
                u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.SliderKt$RangeSlider$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public final void a(@dl.e androidx.compose.runtime.p pVar3, int i26) {
                        SliderKt.a(value, onValueChange, nVar4, z14, fVar3, i23, aVar2, j1Var2, pVar3, i11 | 1, i12);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar3, Integer num) {
                        a(pVar3, num.intValue());
                        return kotlin.b2.f124493a;
                    }
                });
            }
            i13 |= androidx.profileinstaller.o.c.f26824k;
            i17 = i10;
            i19 = i12 & 64;
            if (i19 != 0) {
                i13 |= 1572864;
            } else if ((i11 & 3670016) == 0) {
                if (pVarF.s(aVar)) {
                    i20 = 1048576;
                } else {
                    i20 = 524288;
                }
                i13 |= i20;
            }
            if ((i11 & 29360128) != 0) {
                i13 |= ((i12 & 128) == 0 || !pVarF.s(j1Var)) ? 4194304 : 8388608;
            }
            if ((i13 & 23967451) == 4793490) {
                pVarF.W();
                if ((i11 & 1) != 0) {
                    if (i24 != 0) {
                        nVar3 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar3 = nVar2;
                    }
                    if (i14 != 0) {
                        z11 = true;
                    }
                    if ((i12 & 16) != 0) {
                        i13 &= -57345;
                        fVarE = fi.t.e(0.0f, 1.0f);
                    }
                    if (i16 != 0) {
                        i17 = 0;
                    }
                    if (i19 != 0) {
                        aVar = null;
                    } else {
                        aVar = aVar;
                    }
                    if ((i12 & 128) != 0) {
                        i13 &= -29360129;
                        j1Var = SliderDefaults.f10488a.c(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, pVarF, 0, 6, 1023);
                    } else {
                        j1Var = j1Var;
                    }
                    z12 = z11;
                    fVar2 = fVarE;
                    i21 = i17;
                    i22 = i13;
                } else {
                    if (i24 != 0) {
                        nVar3 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar3 = nVar2;
                    }
                    if (i14 != 0) {
                        z11 = true;
                    }
                    if ((i12 & 16) != 0) {
                        i13 &= -57345;
                        fVarE = fi.t.e(0.0f, 1.0f);
                    }
                    if (i16 != 0) {
                        i17 = 0;
                    }
                    if (i19 != 0) {
                        aVar = null;
                    } else {
                        aVar = aVar;
                    }
                    if ((i12 & 128) != 0) {
                        i13 &= -29360129;
                        j1Var = SliderDefaults.f10488a.c(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, pVarF, 0, 6, 1023);
                    } else {
                        j1Var = j1Var;
                    }
                    z12 = z11;
                    fVar2 = fVarE;
                    i21 = i17;
                    i22 = i13;
                }
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(-743091416, i22, -1, "androidx.compose.material3.RangeSlider (Slider.kt:384)");
                }
                pVarF.T(-492369756);
                objU = pVarF.U();
                companion = androidx.compose.runtime.p.INSTANCE;
                if (objU == companion.a()) {
                    objU = androidx.compose.foundation.interaction.f.a();
                    pVarF.N(objU);
                }
                pVarF.c0();
                gVar = (androidx.compose.foundation.interaction.g) objU;
                pVarF.T(-492369756);
                objU2 = pVarF.U();
                if (objU2 == companion.a()) {
                    objU2 = androidx.compose.foundation.interaction.f.a();
                    pVarF.N(objU2);
                }
                pVarF.c0();
                gVar2 = (androidx.compose.foundation.interaction.g) objU2;
                if (i21 >= 0) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (!z13) {
                    throw new IllegalArgumentException("steps should be >= 0".toString());
                }
                pVarF.T(511388516);
                zS = pVarF.s(value) | pVarF.s(onValueChange);
                objU3 = pVarF.U();
                if (zS) {
                    objU3 = new yh.l<fi.f<Float>, kotlin.b2>() { // from class: androidx.compose.material3.SliderKt$RangeSlider$onValueChangeState$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(1);
                        }

                        public final void a(@dl.d fi.f<Float> it) {
                            kotlin.jvm.internal.f0.p(it, "it");
                            if (kotlin.jvm.internal.f0.g(it, value)) {
                                return;
                            }
                            onValueChange.invoke(it);
                        }

                        @Override // yh.l
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(fi.f<Float> fVar4) {
                            a(fVar4);
                            return kotlin.b2.f124493a;
                        }
                    };
                    pVarF.N(objU3);
                } else {
                    objU3 = new yh.l<fi.f<Float>, kotlin.b2>() { // from class: androidx.compose.material3.SliderKt$RangeSlider$onValueChangeState$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(1);
                        }

                        public final void a(@dl.d fi.f<Float> it) {
                            kotlin.jvm.internal.f0.p(it, "it");
                            if (kotlin.jvm.internal.f0.g(it, value)) {
                                return;
                            }
                            onValueChange.invoke(it);
                        }

                        @Override // yh.l
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(fi.f<Float> fVar4) {
                            a(fVar4);
                            return kotlin.b2.f124493a;
                        }
                    };
                    pVarF.N(objU3);
                }
                pVarF.c0();
                m2 m2VarT10 = androidx.compose.runtime.e2.t(objU3, pVarF, 0);
                Integer numValueOf10 = Integer.valueOf(i21);
                pVarF.T(1157296644);
                zS2 = pVarF.s(numValueOf10);
                objU4 = pVarF.U();
                if (zS2) {
                    objU4 = Q(i21);
                    pVarF.N(objU4);
                } else {
                    objU4 = Q(i21);
                    pVarF.N(objU4);
                }
                pVarF.c0();
                float[] fArr10 = (float[]) objU4;
                float f19 = 2;
                pVar2 = pVarF;
                BoxWithConstraintsKt.a(SizeKt.y(TouchTargetKt.c(nVar3), s1.h.g(f10523a * f19), s1.h.g(f10524b * f19), 0.0f, 0.0f, 12, null), null, false, androidx.compose.runtime.internal.b.b(pVar2, -990606702, true, new SliderKt$RangeSlider$2(aVar, i22, gVar, gVar2, z12, fVar2, value, i21, m2VarT10, fArr10, j1Var)), pVar2, bb.c.d.f31193dj, 6);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                nVar4 = nVar3;
                z14 = z12;
                fVar3 = fVar2;
                i23 = i21;
                aVar2 = aVar;
                j1Var2 = j1Var;
            } else {
                pVarF.W();
                if ((i11 & 1) != 0) {
                    if (i24 != 0) {
                        nVar3 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar3 = nVar2;
                    }
                    if (i14 != 0) {
                        z11 = true;
                    }
                    if ((i12 & 16) != 0) {
                        i13 &= -57345;
                        fVarE = fi.t.e(0.0f, 1.0f);
                    }
                    if (i16 != 0) {
                        i17 = 0;
                    }
                    if (i19 != 0) {
                        aVar = null;
                    } else {
                        aVar = aVar;
                    }
                    if ((i12 & 128) != 0) {
                        i13 &= -29360129;
                        j1Var = SliderDefaults.f10488a.c(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, pVarF, 0, 6, 1023);
                    } else {
                        j1Var = j1Var;
                    }
                    z12 = z11;
                    fVar2 = fVarE;
                    i21 = i17;
                    i22 = i13;
                } else {
                    if (i24 != 0) {
                        nVar3 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar3 = nVar2;
                    }
                    if (i14 != 0) {
                        z11 = true;
                    }
                    if ((i12 & 16) != 0) {
                        i13 &= -57345;
                        fVarE = fi.t.e(0.0f, 1.0f);
                    }
                    if (i16 != 0) {
                        i17 = 0;
                    }
                    if (i19 != 0) {
                        aVar = null;
                    } else {
                        aVar = aVar;
                    }
                    if ((i12 & 128) != 0) {
                        i13 &= -29360129;
                        j1Var = SliderDefaults.f10488a.c(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, pVarF, 0, 6, 1023);
                    } else {
                        j1Var = j1Var;
                    }
                    z12 = z11;
                    fVar2 = fVarE;
                    i21 = i17;
                    i22 = i13;
                }
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(-743091416, i22, -1, "androidx.compose.material3.RangeSlider (Slider.kt:384)");
                }
                pVarF.T(-492369756);
                objU = pVarF.U();
                companion = androidx.compose.runtime.p.INSTANCE;
                if (objU == companion.a()) {
                    objU = androidx.compose.foundation.interaction.f.a();
                    pVarF.N(objU);
                }
                pVarF.c0();
                gVar = (androidx.compose.foundation.interaction.g) objU;
                pVarF.T(-492369756);
                objU2 = pVarF.U();
                if (objU2 == companion.a()) {
                    objU2 = androidx.compose.foundation.interaction.f.a();
                    pVarF.N(objU2);
                }
                pVarF.c0();
                gVar2 = (androidx.compose.foundation.interaction.g) objU2;
                if (i21 >= 0) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (!z13) {
                    throw new IllegalArgumentException("steps should be >= 0".toString());
                }
                pVarF.T(511388516);
                zS = pVarF.s(value) | pVarF.s(onValueChange);
                objU3 = pVarF.U();
                if (zS) {
                    objU3 = new yh.l<fi.f<Float>, kotlin.b2>() { // from class: androidx.compose.material3.SliderKt$RangeSlider$onValueChangeState$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(1);
                        }

                        public final void a(@dl.d fi.f<Float> it) {
                            kotlin.jvm.internal.f0.p(it, "it");
                            if (kotlin.jvm.internal.f0.g(it, value)) {
                                return;
                            }
                            onValueChange.invoke(it);
                        }

                        @Override // yh.l
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(fi.f<Float> fVar4) {
                            a(fVar4);
                            return kotlin.b2.f124493a;
                        }
                    };
                    pVarF.N(objU3);
                } else {
                    objU3 = new yh.l<fi.f<Float>, kotlin.b2>() { // from class: androidx.compose.material3.SliderKt$RangeSlider$onValueChangeState$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(1);
                        }

                        public final void a(@dl.d fi.f<Float> it) {
                            kotlin.jvm.internal.f0.p(it, "it");
                            if (kotlin.jvm.internal.f0.g(it, value)) {
                                return;
                            }
                            onValueChange.invoke(it);
                        }

                        @Override // yh.l
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(fi.f<Float> fVar4) {
                            a(fVar4);
                            return kotlin.b2.f124493a;
                        }
                    };
                    pVarF.N(objU3);
                }
                pVarF.c0();
                m2 m2VarT11 = androidx.compose.runtime.e2.t(objU3, pVarF, 0);
                Integer numValueOf11 = Integer.valueOf(i21);
                pVarF.T(1157296644);
                zS2 = pVarF.s(numValueOf11);
                objU4 = pVarF.U();
                if (zS2) {
                    objU4 = Q(i21);
                    pVarF.N(objU4);
                } else {
                    objU4 = Q(i21);
                    pVarF.N(objU4);
                }
                pVarF.c0();
                float[] fArr11 = (float[]) objU4;
                float f110 = 2;
                pVar2 = pVarF;
                BoxWithConstraintsKt.a(SizeKt.y(TouchTargetKt.c(nVar3), s1.h.g(f10523a * f110), s1.h.g(f10524b * f110), 0.0f, 0.0f, 12, null), null, false, androidx.compose.runtime.internal.b.b(pVar2, -990606702, true, new SliderKt$RangeSlider$2(aVar, i22, gVar, gVar2, z12, fVar2, value, i21, m2VarT11, fArr11, j1Var)), pVar2, bb.c.d.f31193dj, 6);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                nVar4 = nVar3;
                z14 = z12;
                fVar3 = fVar2;
                i23 = i21;
                aVar2 = aVar;
                j1Var2 = j1Var;
            }
            u1VarH = pVar2.H();
            if (u1VarH == null) {
                return;
            }
            u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.SliderKt$RangeSlider$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void a(@dl.e androidx.compose.runtime.p pVar3, int i26) {
                    SliderKt.a(value, onValueChange, nVar4, z14, fVar3, i23, aVar2, j1Var2, pVar3, i11 | 1, i12);
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar3, Integer num) {
                    a(pVar3, num.intValue());
                    return kotlin.b2.f124493a;
                }
            });
        }
        i13 |= bb.c.d.f31193dj;
        z11 = z10;
        if ((57344 & i11) == 0) {
            if ((i12 & 16) == 0) {
                fVarE = fVar;
                if (pVarF.s(fVarE)) {
                }
                i13 |= i25;
            } else {
                fVarE = fVar;
            }
            i13 |= i25;
        } else {
            fVarE = fVar;
        }
        i16 = i12 & 32;
        if (i16 != 0) {
            if ((458752 & i11) == 0) {
                i17 = i10;
                if (pVarF.y(i17)) {
                    i18 = 131072;
                } else {
                    i18 = 65536;
                }
                i13 |= i18;
            }
            i19 = i12 & 64;
            if (i19 != 0) {
                i13 |= 1572864;
            } else if ((i11 & 3670016) == 0) {
                if (pVarF.s(aVar)) {
                    i20 = 1048576;
                } else {
                    i20 = 524288;
                }
                i13 |= i20;
            }
            if ((i11 & 29360128) != 0) {
                i13 |= ((i12 & 128) == 0 || !pVarF.s(j1Var)) ? 4194304 : 8388608;
            }
            if ((i13 & 23967451) == 4793490) {
                pVarF.W();
                if ((i11 & 1) != 0) {
                    if (i24 != 0) {
                        nVar3 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar3 = nVar2;
                    }
                    if (i14 != 0) {
                        z11 = true;
                    }
                    if ((i12 & 16) != 0) {
                        i13 &= -57345;
                        fVarE = fi.t.e(0.0f, 1.0f);
                    }
                    if (i16 != 0) {
                        i17 = 0;
                    }
                    if (i19 != 0) {
                        aVar = null;
                    } else {
                        aVar = aVar;
                    }
                    if ((i12 & 128) != 0) {
                        i13 &= -29360129;
                        j1Var = SliderDefaults.f10488a.c(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, pVarF, 0, 6, 1023);
                    } else {
                        j1Var = j1Var;
                    }
                    z12 = z11;
                    fVar2 = fVarE;
                    i21 = i17;
                    i22 = i13;
                } else {
                    if (i24 != 0) {
                        nVar3 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar3 = nVar2;
                    }
                    if (i14 != 0) {
                        z11 = true;
                    }
                    if ((i12 & 16) != 0) {
                        i13 &= -57345;
                        fVarE = fi.t.e(0.0f, 1.0f);
                    }
                    if (i16 != 0) {
                        i17 = 0;
                    }
                    if (i19 != 0) {
                        aVar = null;
                    } else {
                        aVar = aVar;
                    }
                    if ((i12 & 128) != 0) {
                        i13 &= -29360129;
                        j1Var = SliderDefaults.f10488a.c(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, pVarF, 0, 6, 1023);
                    } else {
                        j1Var = j1Var;
                    }
                    z12 = z11;
                    fVar2 = fVarE;
                    i21 = i17;
                    i22 = i13;
                }
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(-743091416, i22, -1, "androidx.compose.material3.RangeSlider (Slider.kt:384)");
                }
                pVarF.T(-492369756);
                objU = pVarF.U();
                companion = androidx.compose.runtime.p.INSTANCE;
                if (objU == companion.a()) {
                    objU = androidx.compose.foundation.interaction.f.a();
                    pVarF.N(objU);
                }
                pVarF.c0();
                gVar = (androidx.compose.foundation.interaction.g) objU;
                pVarF.T(-492369756);
                objU2 = pVarF.U();
                if (objU2 == companion.a()) {
                    objU2 = androidx.compose.foundation.interaction.f.a();
                    pVarF.N(objU2);
                }
                pVarF.c0();
                gVar2 = (androidx.compose.foundation.interaction.g) objU2;
                if (i21 >= 0) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (!z13) {
                    throw new IllegalArgumentException("steps should be >= 0".toString());
                }
                pVarF.T(511388516);
                zS = pVarF.s(value) | pVarF.s(onValueChange);
                objU3 = pVarF.U();
                if (zS) {
                    objU3 = new yh.l<fi.f<Float>, kotlin.b2>() { // from class: androidx.compose.material3.SliderKt$RangeSlider$onValueChangeState$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(1);
                        }

                        public final void a(@dl.d fi.f<Float> it) {
                            kotlin.jvm.internal.f0.p(it, "it");
                            if (kotlin.jvm.internal.f0.g(it, value)) {
                                return;
                            }
                            onValueChange.invoke(it);
                        }

                        @Override // yh.l
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(fi.f<Float> fVar4) {
                            a(fVar4);
                            return kotlin.b2.f124493a;
                        }
                    };
                    pVarF.N(objU3);
                } else {
                    objU3 = new yh.l<fi.f<Float>, kotlin.b2>() { // from class: androidx.compose.material3.SliderKt$RangeSlider$onValueChangeState$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(1);
                        }

                        public final void a(@dl.d fi.f<Float> it) {
                            kotlin.jvm.internal.f0.p(it, "it");
                            if (kotlin.jvm.internal.f0.g(it, value)) {
                                return;
                            }
                            onValueChange.invoke(it);
                        }

                        @Override // yh.l
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(fi.f<Float> fVar4) {
                            a(fVar4);
                            return kotlin.b2.f124493a;
                        }
                    };
                    pVarF.N(objU3);
                }
                pVarF.c0();
                m2 m2VarT12 = androidx.compose.runtime.e2.t(objU3, pVarF, 0);
                Integer numValueOf12 = Integer.valueOf(i21);
                pVarF.T(1157296644);
                zS2 = pVarF.s(numValueOf12);
                objU4 = pVarF.U();
                if (zS2) {
                    objU4 = Q(i21);
                    pVarF.N(objU4);
                } else {
                    objU4 = Q(i21);
                    pVarF.N(objU4);
                }
                pVarF.c0();
                float[] fArr12 = (float[]) objU4;
                float f111 = 2;
                pVar2 = pVarF;
                BoxWithConstraintsKt.a(SizeKt.y(TouchTargetKt.c(nVar3), s1.h.g(f10523a * f111), s1.h.g(f10524b * f111), 0.0f, 0.0f, 12, null), null, false, androidx.compose.runtime.internal.b.b(pVar2, -990606702, true, new SliderKt$RangeSlider$2(aVar, i22, gVar, gVar2, z12, fVar2, value, i21, m2VarT12, fArr12, j1Var)), pVar2, bb.c.d.f31193dj, 6);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                nVar4 = nVar3;
                z14 = z12;
                fVar3 = fVar2;
                i23 = i21;
                aVar2 = aVar;
                j1Var2 = j1Var;
            } else {
                pVarF.W();
                if ((i11 & 1) != 0) {
                    if (i24 != 0) {
                        nVar3 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar3 = nVar2;
                    }
                    if (i14 != 0) {
                        z11 = true;
                    }
                    if ((i12 & 16) != 0) {
                        i13 &= -57345;
                        fVarE = fi.t.e(0.0f, 1.0f);
                    }
                    if (i16 != 0) {
                        i17 = 0;
                    }
                    if (i19 != 0) {
                        aVar = null;
                    } else {
                        aVar = aVar;
                    }
                    if ((i12 & 128) != 0) {
                        i13 &= -29360129;
                        j1Var = SliderDefaults.f10488a.c(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, pVarF, 0, 6, 1023);
                    } else {
                        j1Var = j1Var;
                    }
                    z12 = z11;
                    fVar2 = fVarE;
                    i21 = i17;
                    i22 = i13;
                } else {
                    if (i24 != 0) {
                        nVar3 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar3 = nVar2;
                    }
                    if (i14 != 0) {
                        z11 = true;
                    }
                    if ((i12 & 16) != 0) {
                        i13 &= -57345;
                        fVarE = fi.t.e(0.0f, 1.0f);
                    }
                    if (i16 != 0) {
                        i17 = 0;
                    }
                    if (i19 != 0) {
                        aVar = null;
                    } else {
                        aVar = aVar;
                    }
                    if ((i12 & 128) != 0) {
                        i13 &= -29360129;
                        j1Var = SliderDefaults.f10488a.c(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, pVarF, 0, 6, 1023);
                    } else {
                        j1Var = j1Var;
                    }
                    z12 = z11;
                    fVar2 = fVarE;
                    i21 = i17;
                    i22 = i13;
                }
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(-743091416, i22, -1, "androidx.compose.material3.RangeSlider (Slider.kt:384)");
                }
                pVarF.T(-492369756);
                objU = pVarF.U();
                companion = androidx.compose.runtime.p.INSTANCE;
                if (objU == companion.a()) {
                    objU = androidx.compose.foundation.interaction.f.a();
                    pVarF.N(objU);
                }
                pVarF.c0();
                gVar = (androidx.compose.foundation.interaction.g) objU;
                pVarF.T(-492369756);
                objU2 = pVarF.U();
                if (objU2 == companion.a()) {
                    objU2 = androidx.compose.foundation.interaction.f.a();
                    pVarF.N(objU2);
                }
                pVarF.c0();
                gVar2 = (androidx.compose.foundation.interaction.g) objU2;
                if (i21 >= 0) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (!z13) {
                    throw new IllegalArgumentException("steps should be >= 0".toString());
                }
                pVarF.T(511388516);
                zS = pVarF.s(value) | pVarF.s(onValueChange);
                objU3 = pVarF.U();
                if (zS) {
                    objU3 = new yh.l<fi.f<Float>, kotlin.b2>() { // from class: androidx.compose.material3.SliderKt$RangeSlider$onValueChangeState$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(1);
                        }

                        public final void a(@dl.d fi.f<Float> it) {
                            kotlin.jvm.internal.f0.p(it, "it");
                            if (kotlin.jvm.internal.f0.g(it, value)) {
                                return;
                            }
                            onValueChange.invoke(it);
                        }

                        @Override // yh.l
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(fi.f<Float> fVar4) {
                            a(fVar4);
                            return kotlin.b2.f124493a;
                        }
                    };
                    pVarF.N(objU3);
                } else {
                    objU3 = new yh.l<fi.f<Float>, kotlin.b2>() { // from class: androidx.compose.material3.SliderKt$RangeSlider$onValueChangeState$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(1);
                        }

                        public final void a(@dl.d fi.f<Float> it) {
                            kotlin.jvm.internal.f0.p(it, "it");
                            if (kotlin.jvm.internal.f0.g(it, value)) {
                                return;
                            }
                            onValueChange.invoke(it);
                        }

                        @Override // yh.l
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(fi.f<Float> fVar4) {
                            a(fVar4);
                            return kotlin.b2.f124493a;
                        }
                    };
                    pVarF.N(objU3);
                }
                pVarF.c0();
                m2 m2VarT13 = androidx.compose.runtime.e2.t(objU3, pVarF, 0);
                Integer numValueOf13 = Integer.valueOf(i21);
                pVarF.T(1157296644);
                zS2 = pVarF.s(numValueOf13);
                objU4 = pVarF.U();
                if (zS2) {
                    objU4 = Q(i21);
                    pVarF.N(objU4);
                } else {
                    objU4 = Q(i21);
                    pVarF.N(objU4);
                }
                pVarF.c0();
                float[] fArr13 = (float[]) objU4;
                float f112 = 2;
                pVar2 = pVarF;
                BoxWithConstraintsKt.a(SizeKt.y(TouchTargetKt.c(nVar3), s1.h.g(f10523a * f112), s1.h.g(f10524b * f112), 0.0f, 0.0f, 12, null), null, false, androidx.compose.runtime.internal.b.b(pVar2, -990606702, true, new SliderKt$RangeSlider$2(aVar, i22, gVar, gVar2, z12, fVar2, value, i21, m2VarT13, fArr13, j1Var)), pVar2, bb.c.d.f31193dj, 6);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                nVar4 = nVar3;
                z14 = z12;
                fVar3 = fVar2;
                i23 = i21;
                aVar2 = aVar;
                j1Var2 = j1Var;
            }
            u1VarH = pVar2.H();
            if (u1VarH == null) {
                return;
            }
            u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.SliderKt$RangeSlider$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void a(@dl.e androidx.compose.runtime.p pVar3, int i26) {
                    SliderKt.a(value, onValueChange, nVar4, z14, fVar3, i23, aVar2, j1Var2, pVar3, i11 | 1, i12);
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar3, Integer num) {
                    a(pVar3, num.intValue());
                    return kotlin.b2.f124493a;
                }
            });
        }
        i13 |= androidx.profileinstaller.o.c.f26824k;
        i17 = i10;
        i19 = i12 & 64;
        if (i19 != 0) {
            i13 |= 1572864;
        } else if ((i11 & 3670016) == 0) {
            if (pVarF.s(aVar)) {
                i20 = 1048576;
            } else {
                i20 = 524288;
            }
            i13 |= i20;
        }
        if ((i11 & 29360128) != 0) {
            i13 |= ((i12 & 128) == 0 || !pVarF.s(j1Var)) ? 4194304 : 8388608;
        }
        if ((i13 & 23967451) == 4793490) {
            pVarF.W();
            if ((i11 & 1) != 0) {
                if (i24 != 0) {
                    nVar3 = androidx.compose.ui.n.INSTANCE;
                } else {
                    nVar3 = nVar2;
                }
                if (i14 != 0) {
                    z11 = true;
                }
                if ((i12 & 16) != 0) {
                    i13 &= -57345;
                    fVarE = fi.t.e(0.0f, 1.0f);
                }
                if (i16 != 0) {
                    i17 = 0;
                }
                if (i19 != 0) {
                    aVar = null;
                } else {
                    aVar = aVar;
                }
                if ((i12 & 128) != 0) {
                    i13 &= -29360129;
                    j1Var = SliderDefaults.f10488a.c(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, pVarF, 0, 6, 1023);
                } else {
                    j1Var = j1Var;
                }
                z12 = z11;
                fVar2 = fVarE;
                i21 = i17;
                i22 = i13;
            } else {
                if (i24 != 0) {
                    nVar3 = androidx.compose.ui.n.INSTANCE;
                } else {
                    nVar3 = nVar2;
                }
                if (i14 != 0) {
                    z11 = true;
                }
                if ((i12 & 16) != 0) {
                    i13 &= -57345;
                    fVarE = fi.t.e(0.0f, 1.0f);
                }
                if (i16 != 0) {
                    i17 = 0;
                }
                if (i19 != 0) {
                    aVar = null;
                } else {
                    aVar = aVar;
                }
                if ((i12 & 128) != 0) {
                    i13 &= -29360129;
                    j1Var = SliderDefaults.f10488a.c(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, pVarF, 0, 6, 1023);
                } else {
                    j1Var = j1Var;
                }
                z12 = z11;
                fVar2 = fVarE;
                i21 = i17;
                i22 = i13;
            }
            pVarF.O();
            if (ComposerKt.g0()) {
                ComposerKt.w0(-743091416, i22, -1, "androidx.compose.material3.RangeSlider (Slider.kt:384)");
            }
            pVarF.T(-492369756);
            objU = pVarF.U();
            companion = androidx.compose.runtime.p.INSTANCE;
            if (objU == companion.a()) {
                objU = androidx.compose.foundation.interaction.f.a();
                pVarF.N(objU);
            }
            pVarF.c0();
            gVar = (androidx.compose.foundation.interaction.g) objU;
            pVarF.T(-492369756);
            objU2 = pVarF.U();
            if (objU2 == companion.a()) {
                objU2 = androidx.compose.foundation.interaction.f.a();
                pVarF.N(objU2);
            }
            pVarF.c0();
            gVar2 = (androidx.compose.foundation.interaction.g) objU2;
            if (i21 >= 0) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (!z13) {
                throw new IllegalArgumentException("steps should be >= 0".toString());
            }
            pVarF.T(511388516);
            zS = pVarF.s(value) | pVarF.s(onValueChange);
            objU3 = pVarF.U();
            if (zS) {
                objU3 = new yh.l<fi.f<Float>, kotlin.b2>() { // from class: androidx.compose.material3.SliderKt$RangeSlider$onValueChangeState$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    public final void a(@dl.d fi.f<Float> it) {
                        kotlin.jvm.internal.f0.p(it, "it");
                        if (kotlin.jvm.internal.f0.g(it, value)) {
                            return;
                        }
                        onValueChange.invoke(it);
                    }

                    @Override // yh.l
                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(fi.f<Float> fVar4) {
                        a(fVar4);
                        return kotlin.b2.f124493a;
                    }
                };
                pVarF.N(objU3);
            } else {
                objU3 = new yh.l<fi.f<Float>, kotlin.b2>() { // from class: androidx.compose.material3.SliderKt$RangeSlider$onValueChangeState$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    public final void a(@dl.d fi.f<Float> it) {
                        kotlin.jvm.internal.f0.p(it, "it");
                        if (kotlin.jvm.internal.f0.g(it, value)) {
                            return;
                        }
                        onValueChange.invoke(it);
                    }

                    @Override // yh.l
                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(fi.f<Float> fVar4) {
                        a(fVar4);
                        return kotlin.b2.f124493a;
                    }
                };
                pVarF.N(objU3);
            }
            pVarF.c0();
            m2 m2VarT14 = androidx.compose.runtime.e2.t(objU3, pVarF, 0);
            Integer numValueOf14 = Integer.valueOf(i21);
            pVarF.T(1157296644);
            zS2 = pVarF.s(numValueOf14);
            objU4 = pVarF.U();
            if (zS2) {
                objU4 = Q(i21);
                pVarF.N(objU4);
            } else {
                objU4 = Q(i21);
                pVarF.N(objU4);
            }
            pVarF.c0();
            float[] fArr14 = (float[]) objU4;
            float f113 = 2;
            pVar2 = pVarF;
            BoxWithConstraintsKt.a(SizeKt.y(TouchTargetKt.c(nVar3), s1.h.g(f10523a * f113), s1.h.g(f10524b * f113), 0.0f, 0.0f, 12, null), null, false, androidx.compose.runtime.internal.b.b(pVar2, -990606702, true, new SliderKt$RangeSlider$2(aVar, i22, gVar, gVar2, z12, fVar2, value, i21, m2VarT14, fArr14, j1Var)), pVar2, bb.c.d.f31193dj, 6);
            if (ComposerKt.g0()) {
                ComposerKt.v0();
            }
            nVar4 = nVar3;
            z14 = z12;
            fVar3 = fVar2;
            i23 = i21;
            aVar2 = aVar;
            j1Var2 = j1Var;
        } else {
            pVarF.W();
            if ((i11 & 1) != 0) {
                if (i24 != 0) {
                    nVar3 = androidx.compose.ui.n.INSTANCE;
                } else {
                    nVar3 = nVar2;
                }
                if (i14 != 0) {
                    z11 = true;
                }
                if ((i12 & 16) != 0) {
                    i13 &= -57345;
                    fVarE = fi.t.e(0.0f, 1.0f);
                }
                if (i16 != 0) {
                    i17 = 0;
                }
                if (i19 != 0) {
                    aVar = null;
                } else {
                    aVar = aVar;
                }
                if ((i12 & 128) != 0) {
                    i13 &= -29360129;
                    j1Var = SliderDefaults.f10488a.c(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, pVarF, 0, 6, 1023);
                } else {
                    j1Var = j1Var;
                }
                z12 = z11;
                fVar2 = fVarE;
                i21 = i17;
                i22 = i13;
            } else {
                if (i24 != 0) {
                    nVar3 = androidx.compose.ui.n.INSTANCE;
                } else {
                    nVar3 = nVar2;
                }
                if (i14 != 0) {
                    z11 = true;
                }
                if ((i12 & 16) != 0) {
                    i13 &= -57345;
                    fVarE = fi.t.e(0.0f, 1.0f);
                }
                if (i16 != 0) {
                    i17 = 0;
                }
                if (i19 != 0) {
                    aVar = null;
                } else {
                    aVar = aVar;
                }
                if ((i12 & 128) != 0) {
                    i13 &= -29360129;
                    j1Var = SliderDefaults.f10488a.c(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, pVarF, 0, 6, 1023);
                } else {
                    j1Var = j1Var;
                }
                z12 = z11;
                fVar2 = fVarE;
                i21 = i17;
                i22 = i13;
            }
            pVarF.O();
            if (ComposerKt.g0()) {
                ComposerKt.w0(-743091416, i22, -1, "androidx.compose.material3.RangeSlider (Slider.kt:384)");
            }
            pVarF.T(-492369756);
            objU = pVarF.U();
            companion = androidx.compose.runtime.p.INSTANCE;
            if (objU == companion.a()) {
                objU = androidx.compose.foundation.interaction.f.a();
                pVarF.N(objU);
            }
            pVarF.c0();
            gVar = (androidx.compose.foundation.interaction.g) objU;
            pVarF.T(-492369756);
            objU2 = pVarF.U();
            if (objU2 == companion.a()) {
                objU2 = androidx.compose.foundation.interaction.f.a();
                pVarF.N(objU2);
            }
            pVarF.c0();
            gVar2 = (androidx.compose.foundation.interaction.g) objU2;
            if (i21 >= 0) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (!z13) {
                throw new IllegalArgumentException("steps should be >= 0".toString());
            }
            pVarF.T(511388516);
            zS = pVarF.s(value) | pVarF.s(onValueChange);
            objU3 = pVarF.U();
            if (zS) {
                objU3 = new yh.l<fi.f<Float>, kotlin.b2>() { // from class: androidx.compose.material3.SliderKt$RangeSlider$onValueChangeState$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    public final void a(@dl.d fi.f<Float> it) {
                        kotlin.jvm.internal.f0.p(it, "it");
                        if (kotlin.jvm.internal.f0.g(it, value)) {
                            return;
                        }
                        onValueChange.invoke(it);
                    }

                    @Override // yh.l
                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(fi.f<Float> fVar4) {
                        a(fVar4);
                        return kotlin.b2.f124493a;
                    }
                };
                pVarF.N(objU3);
            } else {
                objU3 = new yh.l<fi.f<Float>, kotlin.b2>() { // from class: androidx.compose.material3.SliderKt$RangeSlider$onValueChangeState$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    public final void a(@dl.d fi.f<Float> it) {
                        kotlin.jvm.internal.f0.p(it, "it");
                        if (kotlin.jvm.internal.f0.g(it, value)) {
                            return;
                        }
                        onValueChange.invoke(it);
                    }

                    @Override // yh.l
                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(fi.f<Float> fVar4) {
                        a(fVar4);
                        return kotlin.b2.f124493a;
                    }
                };
                pVarF.N(objU3);
            }
            pVarF.c0();
            m2 m2VarT15 = androidx.compose.runtime.e2.t(objU3, pVarF, 0);
            Integer numValueOf15 = Integer.valueOf(i21);
            pVarF.T(1157296644);
            zS2 = pVarF.s(numValueOf15);
            objU4 = pVarF.U();
            if (zS2) {
                objU4 = Q(i21);
                pVarF.N(objU4);
            } else {
                objU4 = Q(i21);
                pVarF.N(objU4);
            }
            pVarF.c0();
            float[] fArr15 = (float[]) objU4;
            float f114 = 2;
            pVar2 = pVarF;
            BoxWithConstraintsKt.a(SizeKt.y(TouchTargetKt.c(nVar3), s1.h.g(f10523a * f114), s1.h.g(f10524b * f114), 0.0f, 0.0f, 12, null), null, false, androidx.compose.runtime.internal.b.b(pVar2, -990606702, true, new SliderKt$RangeSlider$2(aVar, i22, gVar, gVar2, z12, fVar2, value, i21, m2VarT15, fArr15, j1Var)), pVar2, bb.c.d.f31193dj, 6);
            if (ComposerKt.g0()) {
                ComposerKt.v0();
            }
            nVar4 = nVar3;
            z14 = z12;
            fVar3 = fVar2;
            i23 = i21;
            aVar2 = aVar;
            j1Var2 = j1Var;
        }
        u1VarH = pVar2.H();
        if (u1VarH == null) {
            return;
        }
        u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.SliderKt$RangeSlider$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            public final void a(@dl.e androidx.compose.runtime.p pVar3, int i26) {
                SliderKt.a(value, onValueChange, nVar4, z14, fVar3, i23, aVar2, j1Var2, pVar3, i11 | 1, i12);
            }

            @Override // yh.p
            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar3, Integer num) {
                a(pVar3, num.intValue());
                return kotlin.b2.f124493a;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.h
    public static final void b(final boolean z10, final float f10, final float f11, final float[] fArr, final j1 j1Var, final float f12, final androidx.compose.foundation.interaction.g gVar, final androidx.compose.foundation.interaction.g gVar2, final androidx.compose.ui.n nVar, final androidx.compose.ui.n nVar2, final androidx.compose.ui.n nVar3, androidx.compose.runtime.p pVar, final int i10, final int i11) {
        androidx.compose.runtime.p pVarF = pVar.F(-597471305);
        if (ComposerKt.g0()) {
            ComposerKt.w0(-597471305, i10, i11, "androidx.compose.material3.RangeSliderImpl (Slider.kt:511)");
        }
        o1.Companion companion = o1.INSTANCE;
        final String strA = p1.a(companion.j(), pVarF, 6);
        final String strA2 = p1.a(companion.i(), pVarF, 6);
        androidx.compose.ui.n nVarS0 = nVar.s0(f10532j);
        pVarF.T(733328855);
        androidx.compose.ui.c.Companion companion2 = androidx.compose.ui.c.INSTANCE;
        androidx.compose.ui.layout.i0 i0VarK = BoxKt.k(companion2.C(), false, pVarF, 0);
        pVarF.T(-1323940314);
        s1.e eVar = (s1.e) pVarF.K(CompositionLocalsKt.i());
        LayoutDirection layoutDirection = (LayoutDirection) pVarF.K(CompositionLocalsKt.p());
        androidx.compose.ui.platform.d2 d2Var = (androidx.compose.ui.platform.d2) pVarF.K(CompositionLocalsKt.u());
        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
        yh.a<ComposeUiNode> aVarA = companion3.a();
        yh.q<androidx.compose.runtime.v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, kotlin.b2> qVarF = LayoutKt.f(nVarS0);
        if (!(pVarF.G() instanceof androidx.compose.runtime.e)) {
            ComposablesKt.n();
        }
        pVarF.h();
        if (pVarF.D()) {
            pVarF.L(aVarA);
        } else {
            pVarF.d();
        }
        pVarF.Y();
        androidx.compose.runtime.p pVarB = Updater.b(pVarF);
        Updater.j(pVarB, i0VarK, companion3.d());
        Updater.j(pVarB, eVar, companion3.b());
        Updater.j(pVarB, layoutDirection, companion3.c());
        Updater.j(pVarB, d2Var, companion3.f());
        pVarF.x();
        qVarF.invoke(androidx.compose.runtime.v1.a(androidx.compose.runtime.v1.b(pVarF)), pVarF, 0);
        pVarF.T(2058660585);
        pVarF.T(-2137368960);
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.f5954a;
        pVarF.T(1755032509);
        s1.e eVar2 = (s1.e) pVarF.K(CompositionLocalsKt.i());
        float fE1 = eVar2.E1(f10529g);
        float F = eVar2.F(f12);
        float fG = s1.h.g(F * f10);
        float fG2 = s1.h.g(F * f11);
        int i12 = i10 << 6;
        j(SizeKt.l(boxScopeInstance.b(androidx.compose.ui.n.INSTANCE, companion2.o()), 0.0f, 1, null), j1Var, z10, f10, f11, fArr, f10523a, fE1, pVarF, 1835008 | ((i10 >> 9) & 112) | (i12 & bb.c.b.f30796me) | (i12 & bb.c.g.f32954lc) | (i12 & 57344));
        i(boxScopeInstance, fG, androidx.compose.runtime.internal.b.b(pVarF, -1592025586, true, new yh.q<androidx.compose.foundation.layout.k, androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.SliderKt$RangeSliderImpl$1$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
            @androidx.compose.runtime.h
            public final void a(@dl.d androidx.compose.foundation.layout.k TempRangeSliderThumb, @dl.e androidx.compose.runtime.p pVar2, int i13) {
                kotlin.jvm.internal.f0.p(TempRangeSliderThumb, "$this$TempRangeSliderThumb");
                if ((i13 & 81) == 16 && pVar2.b()) {
                    pVar2.l();
                    return;
                }
                if (ComposerKt.g0()) {
                    ComposerKt.w0(-1592025586, i13, -1, "androidx.compose.material3.RangeSliderImpl.<anonymous>.<anonymous> (Slider.kt:552)");
                }
                SliderDefaults sliderDefaults = SliderDefaults.f10488a;
                androidx.compose.ui.n.Companion companion4 = androidx.compose.ui.n.INSTANCE;
                final String str = strA;
                pVar2.T(1157296644);
                boolean zS = pVar2.s(str);
                Object objU = pVar2.U();
                if (zS || objU == androidx.compose.runtime.p.INSTANCE.a()) {
                    objU = new yh.l<r, kotlin.b2>() { // from class: androidx.compose.material3.SliderKt$RangeSliderImpl$1$2$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        public final void a(@dl.d r semantics) {
                            kotlin.jvm.internal.f0.p(semantics, "$this$semantics");
                            SemanticsPropertiesKt.e0(semantics, str);
                        }

                        @Override // yh.l
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(r rVar) {
                            a(rVar);
                            return kotlin.b2.f124493a;
                        }
                    };
                    pVar2.N(objU);
                }
                pVar2.c0();
                androidx.compose.ui.n nVarS1 = FocusableKt.c(SemanticsModifierKt.b(companion4, true, (yh.l) objU), true, gVar).s0(nVar2);
                androidx.compose.foundation.interaction.g gVar3 = gVar;
                j1 j1Var2 = j1Var;
                boolean z11 = z10;
                int i14 = i10;
                sliderDefaults.a(gVar3, nVarS1, j1Var2, z11, 0L, pVar2, 196608 | ((i14 >> 18) & 14) | ((i14 >> 6) & bb.c.b.f30796me) | ((i14 << 9) & bb.c.g.f32954lc), 16);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
            }

            @Override // yh.q
            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.foundation.layout.k kVar, androidx.compose.runtime.p pVar2, Integer num) {
                a(kVar, pVar2, num.intValue());
                return kotlin.b2.f124493a;
            }
        }), pVarF, bb.c.b.A4);
        i(boxScopeInstance, fG2, androidx.compose.runtime.internal.b.b(pVarF, -1141545019, true, new yh.q<androidx.compose.foundation.layout.k, androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.SliderKt$RangeSliderImpl$1$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
            @androidx.compose.runtime.h
            public final void a(@dl.d androidx.compose.foundation.layout.k TempRangeSliderThumb, @dl.e androidx.compose.runtime.p pVar2, int i13) {
                kotlin.jvm.internal.f0.p(TempRangeSliderThumb, "$this$TempRangeSliderThumb");
                if ((i13 & 81) == 16 && pVar2.b()) {
                    pVar2.l();
                    return;
                }
                if (ComposerKt.g0()) {
                    ComposerKt.w0(-1141545019, i13, -1, "androidx.compose.material3.RangeSliderImpl.<anonymous>.<anonymous> (Slider.kt:568)");
                }
                SliderDefaults sliderDefaults = SliderDefaults.f10488a;
                androidx.compose.ui.n.Companion companion4 = androidx.compose.ui.n.INSTANCE;
                final String str = strA2;
                pVar2.T(1157296644);
                boolean zS = pVar2.s(str);
                Object objU = pVar2.U();
                if (zS || objU == androidx.compose.runtime.p.INSTANCE.a()) {
                    objU = new yh.l<r, kotlin.b2>() { // from class: androidx.compose.material3.SliderKt$RangeSliderImpl$1$3$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        public final void a(@dl.d r semantics) {
                            kotlin.jvm.internal.f0.p(semantics, "$this$semantics");
                            SemanticsPropertiesKt.e0(semantics, str);
                        }

                        @Override // yh.l
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(r rVar) {
                            a(rVar);
                            return kotlin.b2.f124493a;
                        }
                    };
                    pVar2.N(objU);
                }
                pVar2.c0();
                androidx.compose.ui.n nVarS1 = FocusableKt.c(SemanticsModifierKt.b(companion4, true, (yh.l) objU), true, gVar2).s0(nVar3);
                androidx.compose.foundation.interaction.g gVar3 = gVar2;
                j1 j1Var2 = j1Var;
                boolean z11 = z10;
                int i14 = i10;
                sliderDefaults.a(gVar3, nVarS1, j1Var2, z11, 0L, pVar2, 196608 | ((i14 >> 21) & 14) | ((i14 >> 6) & bb.c.b.f30796me) | ((i14 << 9) & bb.c.g.f32954lc), 16);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
            }

            @Override // yh.q
            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.foundation.layout.k kVar, androidx.compose.runtime.p pVar2, Integer num) {
                a(kVar, pVar2, num.intValue());
                return kotlin.b2.f124493a;
            }
        }), pVarF, bb.c.b.A4);
        pVarF.c0();
        pVarF.c0();
        pVarF.c0();
        pVarF.f();
        pVarF.c0();
        pVarF.c0();
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        androidx.compose.runtime.u1 u1VarH = pVarF.H();
        if (u1VarH == null) {
            return;
        }
        u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.SliderKt$RangeSliderImpl$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            public final void a(@dl.e androidx.compose.runtime.p pVar2, int i13) {
                SliderKt.b(z10, f10, f11, fArr, j1Var, f12, gVar, gVar2, nVar, nVar2, nVar3, pVar2, i10 | 1, i11);
            }

            @Override // yh.p
            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                a(pVar2, num.intValue());
                return kotlin.b2.f124493a;
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0124  */
    /* JADX WARN: Code duplicated, block: B:104:0x013c  */
    /* JADX WARN: Code duplicated, block: B:106:0x0147  */
    /* JADX WARN: Code duplicated, block: B:116:0x016e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:117:0x0170  */
    /* JADX WARN: Code duplicated, block: B:118:0x0173  */
    /* JADX WARN: Code duplicated, block: B:120:0x0177  */
    /* JADX WARN: Code duplicated, block: B:121:0x0179  */
    /* JADX WARN: Code duplicated, block: B:124:0x017f  */
    /* JADX WARN: Code duplicated, block: B:125:0x0189  */
    /* JADX WARN: Code duplicated, block: B:127:0x018c  */
    /* JADX WARN: Code duplicated, block: B:128:0x018e  */
    /* JADX WARN: Code duplicated, block: B:130:0x0191  */
    /* JADX WARN: Code duplicated, block: B:131:0x0193  */
    /* JADX WARN: Code duplicated, block: B:134:0x0198  */
    /* JADX WARN: Code duplicated, block: B:136:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:138:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:140:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:143:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:146:0x0226  */
    /* JADX WARN: Code duplicated, block: B:148:0x022e  */
    /* JADX WARN: Code duplicated, block: B:151:0x025d  */
    /* JADX WARN: Code duplicated, block: B:153:0x0265  */
    /* JADX WARN: Code duplicated, block: B:156:0x02c8  */
    /* JADX WARN: Code duplicated, block: B:161:0x02e0  */
    /* JADX WARN: Code duplicated, block: B:163:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x0066  */
    /* JADX WARN: Code duplicated, block: B:37:0x0069  */
    /* JADX WARN: Code duplicated, block: B:39:0x006d  */
    /* JADX WARN: Code duplicated, block: B:41:0x0075  */
    /* JADX WARN: Code duplicated, block: B:42:0x0078  */
    /* JADX WARN: Code duplicated, block: B:47:0x0085  */
    /* JADX WARN: Code duplicated, block: B:49:0x0089  */
    /* JADX WARN: Code duplicated, block: B:51:0x0091  */
    /* JADX WARN: Code duplicated, block: B:52:0x0094  */
    /* JADX WARN: Code duplicated, block: B:55:0x009a  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:61:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:72:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:79:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:81:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:83:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:84:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:87:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:90:0x0100  */
    /* JADX WARN: Code duplicated, block: B:91:0x0107  */
    /* JADX WARN: Code duplicated, block: B:93:0x010d  */
    /* JADX WARN: Code duplicated, block: B:95:0x0113  */
    /* JADX WARN: Code duplicated, block: B:96:0x0116  */
    @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.h
    public static final void c(final float f10, @dl.d final yh.l<? super Float, kotlin.b2> onValueChange, @dl.e androidx.compose.ui.n nVar, boolean z10, @dl.e fi.f<Float> fVar, int i10, @dl.e yh.a<kotlin.b2> aVar, @dl.e j1 j1Var, @dl.e androidx.compose.foundation.interaction.g gVar, @dl.e androidx.compose.runtime.p pVar, final int i11, final int i12) {
        final int i13;
        int i14;
        int i15;
        fi.f<Float> fVar2;
        int i16;
        int i17;
        int i18;
        int i19;
        yh.a<kotlin.b2> aVar2;
        int i20;
        j1 j1VarC;
        int i21;
        int i22;
        androidx.compose.ui.n nVar2;
        boolean z11;
        fi.f<Float> fVarE;
        int i23;
        yh.a<kotlin.b2> aVar3;
        androidx.compose.ui.n nVar3;
        final boolean z12;
        fi.f<Float> fVar3;
        final j1 j1Var2;
        int i24;
        yh.a<kotlin.b2> aVar4;
        final androidx.compose.foundation.interaction.g gVar2;
        Object objU;
        boolean zS;
        Object objU2;
        boolean zS2;
        Object objU3;
        final androidx.compose.ui.n nVar4;
        final fi.f<Float> fVar4;
        final int i25;
        final yh.a<kotlin.b2> aVar5;
        final androidx.compose.foundation.interaction.g gVar3;
        final j1 j1Var3;
        final boolean z13;
        androidx.compose.runtime.u1 u1VarH;
        kotlin.jvm.internal.f0.p(onValueChange, "onValueChange");
        androidx.compose.runtime.p pVarF = pVar.F(-202044027);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 14) == 0) {
            i13 = (pVarF.w(f10) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i12 & 2) != 0) {
            i13 |= 48;
        } else if ((i11 & 112) == 0) {
            i13 |= pVarF.s(onValueChange) ? 32 : 16;
        }
        int i26 = i12 & 4;
        if (i26 == 0) {
            if ((i11 & bb.c.b.f30796me) == 0) {
                i13 |= pVarF.s(nVar) ? 256 : 128;
            }
            i14 = i12 & 8;
            if (i14 != 0) {
                if ((i11 & bb.c.g.f32954lc) == 0) {
                    if (pVarF.u(z10)) {
                        i15 = 2048;
                    } else {
                        i15 = 1024;
                    }
                    i13 |= i15;
                }
                if ((i11 & 57344) == 0) {
                    if ((i12 & 16) == 0) {
                        fVar2 = fVar;
                        int i27 = pVarF.s(fVar2) ? 16384 : 8192;
                        i13 |= i27;
                    } else {
                        fVar2 = fVar;
                    }
                    i13 |= i27;
                } else {
                    fVar2 = fVar;
                }
                i16 = i12 & 32;
                if (i16 != 0) {
                    if ((i11 & 458752) == 0) {
                        i17 = i10;
                        if (pVarF.y(i17)) {
                            i18 = 131072;
                        } else {
                            i18 = 65536;
                        }
                        i13 |= i18;
                    }
                    i19 = i12 & 64;
                    if (i19 != 0) {
                        i13 |= 1572864;
                        aVar2 = aVar;
                    } else {
                        aVar2 = aVar;
                        if ((i11 & 3670016) == 0) {
                            if (pVarF.s(aVar2)) {
                                i20 = 1048576;
                            } else {
                                i20 = 524288;
                            }
                            i13 |= i20;
                        }
                    }
                    if ((i11 & 29360128) == 0) {
                        if ((i12 & 128) == 0) {
                            j1VarC = j1Var;
                            int i28 = pVarF.s(j1VarC) ? 8388608 : 4194304;
                            i13 |= i28;
                        } else {
                            j1VarC = j1Var;
                        }
                        i13 |= i28;
                    } else {
                        j1VarC = j1Var;
                    }
                    i21 = i12 & 256;
                    if (i21 != 0) {
                        i13 |= 100663296;
                    } else if ((i11 & 234881024) == 0) {
                        if (pVarF.s(gVar)) {
                            i22 = 67108864;
                        } else {
                            i22 = 33554432;
                        }
                        i13 |= i22;
                    }
                    if ((i13 & 191739611) == 38347922 || !pVarF.b()) {
                        pVarF.W();
                        if ((i11 & 1) != 0 || pVarF.o()) {
                            if (i26 != 0) {
                                nVar2 = androidx.compose.ui.n.INSTANCE;
                            } else {
                                nVar2 = nVar;
                            }
                            if (i14 != 0) {
                                z11 = true;
                            } else {
                                z11 = z10;
                            }
                            if ((i12 & 16) != 0) {
                                fVarE = fi.t.e(0.0f, 1.0f);
                                i13 &= -57345;
                            } else {
                                fVarE = fVar2;
                            }
                            if (i16 != 0) {
                                i23 = 0;
                            } else {
                                i23 = i17;
                            }
                            if (i19 != 0) {
                                aVar3 = null;
                            } else {
                                aVar3 = aVar2;
                            }
                            if ((i12 & 128) != 0) {
                                j1VarC = SliderDefaults.f10488a.c(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, pVarF, 0, 6, 1023);
                                i13 &= -29360129;
                            }
                            if (i21 != 0) {
                                pVarF.T(-492369756);
                                objU = pVarF.U();
                                if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                                    objU = androidx.compose.foundation.interaction.f.a();
                                    pVarF.N(objU);
                                }
                                pVarF.c0();
                                nVar3 = nVar2;
                                z12 = z11;
                                fVar3 = fVarE;
                                j1Var2 = j1VarC;
                                i24 = i23;
                                aVar4 = aVar3;
                                gVar2 = (androidx.compose.foundation.interaction.g) objU;
                            } else {
                                nVar3 = nVar2;
                                z12 = z11;
                                fVar3 = fVarE;
                                j1Var2 = j1VarC;
                                i24 = i23;
                                aVar4 = aVar3;
                                gVar2 = gVar;
                            }
                        } else {
                            pVarF.l();
                            if ((i12 & 16) != 0) {
                                i13 &= -57345;
                            }
                            if ((i12 & 128) != 0) {
                                i13 &= -29360129;
                            }
                            nVar3 = nVar;
                            gVar2 = gVar;
                            fVar3 = fVar2;
                            aVar4 = aVar2;
                            i24 = i17;
                            z12 = z10;
                            j1Var2 = j1VarC;
                        }
                        pVarF.O();
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(-202044027, i13, -1, "androidx.compose.material3.Slider (Slider.kt:154)");
                        }
                        Boolean boolValueOf = Boolean.valueOf(z12);
                        pVarF.T(1618982084);
                        zS = pVarF.s(boolValueOf) | pVarF.s(gVar2) | pVarF.s(j1Var2);
                        objU2 = pVarF.U();
                        if (zS || objU2 == androidx.compose.runtime.p.INSTANCE.a()) {
                            objU2 = androidx.compose.runtime.internal.b.c(-1923353268, true, new yh.q<k1, androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.SliderKt$Slider$2$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(3);
                                }

                                @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                                @androidx.compose.runtime.h
                                public final void a(@dl.d k1 it, @dl.e androidx.compose.runtime.p pVar2, int i29) {
                                    kotlin.jvm.internal.f0.p(it, "it");
                                    if ((i29 & 81) == 16 && pVar2.b()) {
                                        pVar2.l();
                                        return;
                                    }
                                    if (ComposerKt.g0()) {
                                        ComposerKt.w0(-1923353268, i29, -1, "androidx.compose.material3.Slider.<anonymous>.<anonymous> (Slider.kt:176)");
                                    }
                                    SliderDefaults sliderDefaults = SliderDefaults.f10488a;
                                    androidx.compose.foundation.interaction.g gVar4 = gVar2;
                                    j1 j1Var4 = j1Var2;
                                    boolean z14 = z12;
                                    int i30 = i13;
                                    sliderDefaults.a(gVar4, null, j1Var4, z14, 0L, pVar2, 196608 | ((i30 >> 24) & 14) | ((i30 >> 15) & bb.c.b.f30796me) | (i30 & bb.c.g.f32954lc), 18);
                                    if (ComposerKt.g0()) {
                                        ComposerKt.v0();
                                    }
                                }

                                @Override // yh.q
                                public /* bridge */ /* synthetic */ kotlin.b2 invoke(k1 k1Var, androidx.compose.runtime.p pVar2, Integer num) {
                                    a(k1Var, pVar2, num.intValue());
                                    return kotlin.b2.f124493a;
                                }
                            });
                            pVarF.N(objU2);
                        }
                        pVarF.c0();
                        yh.q qVar = (yh.q) objU2;
                        Boolean boolValueOf2 = Boolean.valueOf(z12);
                        pVarF.T(511388516);
                        zS2 = pVarF.s(boolValueOf2) | pVarF.s(j1Var2);
                        objU3 = pVarF.U();
                        if (zS2 || objU3 == androidx.compose.runtime.p.INSTANCE.a()) {
                            objU3 = androidx.compose.runtime.internal.b.c(1022381539, true, new yh.q<k1, androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.SliderKt$Slider$3$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(3);
                                }

                                @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                                @androidx.compose.runtime.h
                                public final void a(@dl.d k1 sliderPositions, @dl.e androidx.compose.runtime.p pVar2, int i29) {
                                    kotlin.jvm.internal.f0.p(sliderPositions, "sliderPositions");
                                    if ((i29 & 14) == 0) {
                                        i29 |= pVar2.s(sliderPositions) ? 4 : 2;
                                    }
                                    if ((i29 & 91) == 18 && pVar2.b()) {
                                        pVar2.l();
                                        return;
                                    }
                                    if (ComposerKt.g0()) {
                                        ComposerKt.w0(1022381539, i29, -1, "androidx.compose.material3.Slider.<anonymous>.<anonymous> (Slider.kt:183)");
                                    }
                                    SliderDefaults sliderDefaults = SliderDefaults.f10488a;
                                    j1 j1Var4 = j1Var2;
                                    boolean z14 = z12;
                                    int i30 = i13;
                                    sliderDefaults.b(sliderPositions, null, j1Var4, z14, pVar2, (i29 & 14) | 24576 | ((i30 >> 15) & bb.c.b.f30796me) | (i30 & bb.c.g.f32954lc), 2);
                                    if (ComposerKt.g0()) {
                                        ComposerKt.v0();
                                    }
                                }

                                @Override // yh.q
                                public /* bridge */ /* synthetic */ kotlin.b2 invoke(k1 k1Var, androidx.compose.runtime.p pVar2, Integer num) {
                                    a(k1Var, pVar2, num.intValue());
                                    return kotlin.b2.f124493a;
                                }
                            });
                            pVarF.N(objU3);
                        }
                        pVarF.c0();
                        int i29 = (i13 & 14) | (i13 & 112);
                        int i30 = i13 << 3;
                        androidx.compose.foundation.interaction.g gVar4 = gVar2;
                        j1 j1Var4 = j1Var2;
                        boolean z14 = z12;
                        e(f10, onValueChange, (yh.q) objU3, nVar3, z12, fVar3, i24, aVar4, j1Var2, gVar4, qVar, pVarF, i29 | (i30 & bb.c.g.f32954lc) | (57344 & i30) | (458752 & i30) | (i30 & 3670016) | (i30 & 29360128) | (i30 & 234881024) | (i30 & 1879048192), 0, 0);
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                        nVar4 = nVar3;
                        fVar4 = fVar3;
                        i25 = i24;
                        aVar5 = aVar4;
                        gVar3 = gVar4;
                        j1Var3 = j1Var4;
                        z13 = z14;
                    } else {
                        pVarF.l();
                        nVar4 = nVar;
                        z13 = z10;
                        j1Var3 = j1VarC;
                        fVar4 = fVar2;
                        aVar5 = aVar2;
                        i25 = i17;
                        gVar3 = gVar;
                    }
                    u1VarH = pVarF.H();
                    if (u1VarH == null) {
                        return;
                    }
                    u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.SliderKt$Slider$4
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        public final void a(@dl.e androidx.compose.runtime.p pVar2, int i31) {
                            SliderKt.c(f10, onValueChange, nVar4, z13, fVar4, i25, aVar5, j1Var3, gVar3, pVar2, i11 | 1, i12);
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                            a(pVar2, num.intValue());
                            return kotlin.b2.f124493a;
                        }
                    });
                }
                i13 |= androidx.profileinstaller.o.c.f26824k;
                i17 = i10;
                i19 = i12 & 64;
                if (i19 != 0) {
                    i13 |= 1572864;
                    aVar2 = aVar;
                } else {
                    aVar2 = aVar;
                    if ((i11 & 3670016) == 0) {
                        if (pVarF.s(aVar2)) {
                            i20 = 1048576;
                        } else {
                            i20 = 524288;
                        }
                        i13 |= i20;
                    }
                }
                if ((i11 & 29360128) == 0) {
                    if ((i12 & 128) == 0) {
                        j1VarC = j1Var;
                        if (pVarF.s(j1VarC)) {
                        }
                        i13 |= i28;
                    } else {
                        j1VarC = j1Var;
                    }
                    i13 |= i28;
                } else {
                    j1VarC = j1Var;
                }
                i21 = i12 & 256;
                if (i21 != 0) {
                    i13 |= 100663296;
                } else if ((i11 & 234881024) == 0) {
                    if (pVarF.s(gVar)) {
                        i22 = 67108864;
                    } else {
                        i22 = 33554432;
                    }
                    i13 |= i22;
                }
                if ((i13 & 191739611) == 38347922) {
                    pVarF.W();
                    if ((i11 & 1) != 0) {
                        if (i26 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if (i14 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if ((i12 & 16) != 0) {
                            fVarE = fi.t.e(0.0f, 1.0f);
                            i13 &= -57345;
                        } else {
                            fVarE = fVar2;
                        }
                        if (i16 != 0) {
                            i23 = 0;
                        } else {
                            i23 = i17;
                        }
                        if (i19 != 0) {
                            aVar3 = null;
                        } else {
                            aVar3 = aVar2;
                        }
                        if ((i12 & 128) != 0) {
                            j1VarC = SliderDefaults.f10488a.c(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, pVarF, 0, 6, 1023);
                            i13 &= -29360129;
                        }
                        if (i21 != 0) {
                            pVarF.T(-492369756);
                            objU = pVarF.U();
                            if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                                objU = androidx.compose.foundation.interaction.f.a();
                                pVarF.N(objU);
                            }
                            pVarF.c0();
                            nVar3 = nVar2;
                            z12 = z11;
                            fVar3 = fVarE;
                            j1Var2 = j1VarC;
                            i24 = i23;
                            aVar4 = aVar3;
                            gVar2 = (androidx.compose.foundation.interaction.g) objU;
                        } else {
                            nVar3 = nVar2;
                            z12 = z11;
                            fVar3 = fVarE;
                            j1Var2 = j1VarC;
                            i24 = i23;
                            aVar4 = aVar3;
                            gVar2 = gVar;
                        }
                    } else {
                        if (i26 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if (i14 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if ((i12 & 16) != 0) {
                            fVarE = fi.t.e(0.0f, 1.0f);
                            i13 &= -57345;
                        } else {
                            fVarE = fVar2;
                        }
                        if (i16 != 0) {
                            i23 = 0;
                        } else {
                            i23 = i17;
                        }
                        if (i19 != 0) {
                            aVar3 = null;
                        } else {
                            aVar3 = aVar2;
                        }
                        if ((i12 & 128) != 0) {
                            j1VarC = SliderDefaults.f10488a.c(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, pVarF, 0, 6, 1023);
                            i13 &= -29360129;
                        }
                        if (i21 != 0) {
                            pVarF.T(-492369756);
                            objU = pVarF.U();
                            if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                                objU = androidx.compose.foundation.interaction.f.a();
                                pVarF.N(objU);
                            }
                            pVarF.c0();
                            nVar3 = nVar2;
                            z12 = z11;
                            fVar3 = fVarE;
                            j1Var2 = j1VarC;
                            i24 = i23;
                            aVar4 = aVar3;
                            gVar2 = (androidx.compose.foundation.interaction.g) objU;
                        } else {
                            nVar3 = nVar2;
                            z12 = z11;
                            fVar3 = fVarE;
                            j1Var2 = j1VarC;
                            i24 = i23;
                            aVar4 = aVar3;
                            gVar2 = gVar;
                        }
                    }
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(-202044027, i13, -1, "androidx.compose.material3.Slider (Slider.kt:154)");
                    }
                    Boolean boolValueOf3 = Boolean.valueOf(z12);
                    pVarF.T(1618982084);
                    zS = pVarF.s(boolValueOf3) | pVarF.s(gVar2) | pVarF.s(j1Var2);
                    objU2 = pVarF.U();
                    if (zS) {
                        objU2 = androidx.compose.runtime.internal.b.c(-1923353268, true, new yh.q<k1, androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.SliderKt$Slider$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(3);
                            }

                            @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                            @androidx.compose.runtime.h
                            public final void a(@dl.d k1 it, @dl.e androidx.compose.runtime.p pVar2, int i210) {
                                kotlin.jvm.internal.f0.p(it, "it");
                                if ((i210 & 81) == 16 && pVar2.b()) {
                                    pVar2.l();
                                    return;
                                }
                                if (ComposerKt.g0()) {
                                    ComposerKt.w0(-1923353268, i210, -1, "androidx.compose.material3.Slider.<anonymous>.<anonymous> (Slider.kt:176)");
                                }
                                SliderDefaults sliderDefaults = SliderDefaults.f10488a;
                                androidx.compose.foundation.interaction.g gVar5 = gVar2;
                                j1 j1Var5 = j1Var2;
                                boolean z15 = z12;
                                int i31 = i13;
                                sliderDefaults.a(gVar5, null, j1Var5, z15, 0L, pVar2, 196608 | ((i31 >> 24) & 14) | ((i31 >> 15) & bb.c.b.f30796me) | (i31 & bb.c.g.f32954lc), 18);
                                if (ComposerKt.g0()) {
                                    ComposerKt.v0();
                                }
                            }

                            @Override // yh.q
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(k1 k1Var, androidx.compose.runtime.p pVar2, Integer num) {
                                a(k1Var, pVar2, num.intValue());
                                return kotlin.b2.f124493a;
                            }
                        });
                        pVarF.N(objU2);
                    } else {
                        objU2 = androidx.compose.runtime.internal.b.c(-1923353268, true, new yh.q<k1, androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.SliderKt$Slider$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(3);
                            }

                            @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                            @androidx.compose.runtime.h
                            public final void a(@dl.d k1 it, @dl.e androidx.compose.runtime.p pVar2, int i210) {
                                kotlin.jvm.internal.f0.p(it, "it");
                                if ((i210 & 81) == 16 && pVar2.b()) {
                                    pVar2.l();
                                    return;
                                }
                                if (ComposerKt.g0()) {
                                    ComposerKt.w0(-1923353268, i210, -1, "androidx.compose.material3.Slider.<anonymous>.<anonymous> (Slider.kt:176)");
                                }
                                SliderDefaults sliderDefaults = SliderDefaults.f10488a;
                                androidx.compose.foundation.interaction.g gVar5 = gVar2;
                                j1 j1Var5 = j1Var2;
                                boolean z15 = z12;
                                int i31 = i13;
                                sliderDefaults.a(gVar5, null, j1Var5, z15, 0L, pVar2, 196608 | ((i31 >> 24) & 14) | ((i31 >> 15) & bb.c.b.f30796me) | (i31 & bb.c.g.f32954lc), 18);
                                if (ComposerKt.g0()) {
                                    ComposerKt.v0();
                                }
                            }

                            @Override // yh.q
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(k1 k1Var, androidx.compose.runtime.p pVar2, Integer num) {
                                a(k1Var, pVar2, num.intValue());
                                return kotlin.b2.f124493a;
                            }
                        });
                        pVarF.N(objU2);
                    }
                    pVarF.c0();
                    yh.q qVar2 = (yh.q) objU2;
                    Boolean boolValueOf4 = Boolean.valueOf(z12);
                    pVarF.T(511388516);
                    zS2 = pVarF.s(boolValueOf4) | pVarF.s(j1Var2);
                    objU3 = pVarF.U();
                    if (zS2) {
                        objU3 = androidx.compose.runtime.internal.b.c(1022381539, true, new yh.q<k1, androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.SliderKt$Slider$3$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(3);
                            }

                            @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                            @androidx.compose.runtime.h
                            public final void a(@dl.d k1 sliderPositions, @dl.e androidx.compose.runtime.p pVar2, int i210) {
                                kotlin.jvm.internal.f0.p(sliderPositions, "sliderPositions");
                                if ((i210 & 14) == 0) {
                                    i210 |= pVar2.s(sliderPositions) ? 4 : 2;
                                }
                                if ((i210 & 91) == 18 && pVar2.b()) {
                                    pVar2.l();
                                    return;
                                }
                                if (ComposerKt.g0()) {
                                    ComposerKt.w0(1022381539, i210, -1, "androidx.compose.material3.Slider.<anonymous>.<anonymous> (Slider.kt:183)");
                                }
                                SliderDefaults sliderDefaults = SliderDefaults.f10488a;
                                j1 j1Var5 = j1Var2;
                                boolean z15 = z12;
                                int i31 = i13;
                                sliderDefaults.b(sliderPositions, null, j1Var5, z15, pVar2, (i210 & 14) | 24576 | ((i31 >> 15) & bb.c.b.f30796me) | (i31 & bb.c.g.f32954lc), 2);
                                if (ComposerKt.g0()) {
                                    ComposerKt.v0();
                                }
                            }

                            @Override // yh.q
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(k1 k1Var, androidx.compose.runtime.p pVar2, Integer num) {
                                a(k1Var, pVar2, num.intValue());
                                return kotlin.b2.f124493a;
                            }
                        });
                        pVarF.N(objU3);
                    } else {
                        objU3 = androidx.compose.runtime.internal.b.c(1022381539, true, new yh.q<k1, androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.SliderKt$Slider$3$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(3);
                            }

                            @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                            @androidx.compose.runtime.h
                            public final void a(@dl.d k1 sliderPositions, @dl.e androidx.compose.runtime.p pVar2, int i210) {
                                kotlin.jvm.internal.f0.p(sliderPositions, "sliderPositions");
                                if ((i210 & 14) == 0) {
                                    i210 |= pVar2.s(sliderPositions) ? 4 : 2;
                                }
                                if ((i210 & 91) == 18 && pVar2.b()) {
                                    pVar2.l();
                                    return;
                                }
                                if (ComposerKt.g0()) {
                                    ComposerKt.w0(1022381539, i210, -1, "androidx.compose.material3.Slider.<anonymous>.<anonymous> (Slider.kt:183)");
                                }
                                SliderDefaults sliderDefaults = SliderDefaults.f10488a;
                                j1 j1Var5 = j1Var2;
                                boolean z15 = z12;
                                int i31 = i13;
                                sliderDefaults.b(sliderPositions, null, j1Var5, z15, pVar2, (i210 & 14) | 24576 | ((i31 >> 15) & bb.c.b.f30796me) | (i31 & bb.c.g.f32954lc), 2);
                                if (ComposerKt.g0()) {
                                    ComposerKt.v0();
                                }
                            }

                            @Override // yh.q
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(k1 k1Var, androidx.compose.runtime.p pVar2, Integer num) {
                                a(k1Var, pVar2, num.intValue());
                                return kotlin.b2.f124493a;
                            }
                        });
                        pVarF.N(objU3);
                    }
                    pVarF.c0();
                    int i210 = (i13 & 14) | (i13 & 112);
                    int i31 = i13 << 3;
                    androidx.compose.foundation.interaction.g gVar5 = gVar2;
                    j1 j1Var5 = j1Var2;
                    boolean z15 = z12;
                    e(f10, onValueChange, (yh.q) objU3, nVar3, z12, fVar3, i24, aVar4, j1Var2, gVar5, qVar2, pVarF, i210 | (i31 & bb.c.g.f32954lc) | (57344 & i31) | (458752 & i31) | (i31 & 3670016) | (i31 & 29360128) | (i31 & 234881024) | (i31 & 1879048192), 0, 0);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    nVar4 = nVar3;
                    fVar4 = fVar3;
                    i25 = i24;
                    aVar5 = aVar4;
                    gVar3 = gVar5;
                    j1Var3 = j1Var5;
                    z13 = z15;
                } else {
                    pVarF.W();
                    if ((i11 & 1) != 0) {
                        if (i26 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if (i14 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if ((i12 & 16) != 0) {
                            fVarE = fi.t.e(0.0f, 1.0f);
                            i13 &= -57345;
                        } else {
                            fVarE = fVar2;
                        }
                        if (i16 != 0) {
                            i23 = 0;
                        } else {
                            i23 = i17;
                        }
                        if (i19 != 0) {
                            aVar3 = null;
                        } else {
                            aVar3 = aVar2;
                        }
                        if ((i12 & 128) != 0) {
                            j1VarC = SliderDefaults.f10488a.c(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, pVarF, 0, 6, 1023);
                            i13 &= -29360129;
                        }
                        if (i21 != 0) {
                            pVarF.T(-492369756);
                            objU = pVarF.U();
                            if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                                objU = androidx.compose.foundation.interaction.f.a();
                                pVarF.N(objU);
                            }
                            pVarF.c0();
                            nVar3 = nVar2;
                            z12 = z11;
                            fVar3 = fVarE;
                            j1Var2 = j1VarC;
                            i24 = i23;
                            aVar4 = aVar3;
                            gVar2 = (androidx.compose.foundation.interaction.g) objU;
                        } else {
                            nVar3 = nVar2;
                            z12 = z11;
                            fVar3 = fVarE;
                            j1Var2 = j1VarC;
                            i24 = i23;
                            aVar4 = aVar3;
                            gVar2 = gVar;
                        }
                    } else {
                        if (i26 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if (i14 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if ((i12 & 16) != 0) {
                            fVarE = fi.t.e(0.0f, 1.0f);
                            i13 &= -57345;
                        } else {
                            fVarE = fVar2;
                        }
                        if (i16 != 0) {
                            i23 = 0;
                        } else {
                            i23 = i17;
                        }
                        if (i19 != 0) {
                            aVar3 = null;
                        } else {
                            aVar3 = aVar2;
                        }
                        if ((i12 & 128) != 0) {
                            j1VarC = SliderDefaults.f10488a.c(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, pVarF, 0, 6, 1023);
                            i13 &= -29360129;
                        }
                        if (i21 != 0) {
                            pVarF.T(-492369756);
                            objU = pVarF.U();
                            if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                                objU = androidx.compose.foundation.interaction.f.a();
                                pVarF.N(objU);
                            }
                            pVarF.c0();
                            nVar3 = nVar2;
                            z12 = z11;
                            fVar3 = fVarE;
                            j1Var2 = j1VarC;
                            i24 = i23;
                            aVar4 = aVar3;
                            gVar2 = (androidx.compose.foundation.interaction.g) objU;
                        } else {
                            nVar3 = nVar2;
                            z12 = z11;
                            fVar3 = fVarE;
                            j1Var2 = j1VarC;
                            i24 = i23;
                            aVar4 = aVar3;
                            gVar2 = gVar;
                        }
                    }
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(-202044027, i13, -1, "androidx.compose.material3.Slider (Slider.kt:154)");
                    }
                    Boolean boolValueOf5 = Boolean.valueOf(z12);
                    pVarF.T(1618982084);
                    zS = pVarF.s(boolValueOf5) | pVarF.s(gVar2) | pVarF.s(j1Var2);
                    objU2 = pVarF.U();
                    if (zS) {
                        objU2 = androidx.compose.runtime.internal.b.c(-1923353268, true, new yh.q<k1, androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.SliderKt$Slider$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(3);
                            }

                            @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                            @androidx.compose.runtime.h
                            public final void a(@dl.d k1 it, @dl.e androidx.compose.runtime.p pVar2, int i211) {
                                kotlin.jvm.internal.f0.p(it, "it");
                                if ((i211 & 81) == 16 && pVar2.b()) {
                                    pVar2.l();
                                    return;
                                }
                                if (ComposerKt.g0()) {
                                    ComposerKt.w0(-1923353268, i211, -1, "androidx.compose.material3.Slider.<anonymous>.<anonymous> (Slider.kt:176)");
                                }
                                SliderDefaults sliderDefaults = SliderDefaults.f10488a;
                                androidx.compose.foundation.interaction.g gVar6 = gVar2;
                                j1 j1Var6 = j1Var2;
                                boolean z16 = z12;
                                int i32 = i13;
                                sliderDefaults.a(gVar6, null, j1Var6, z16, 0L, pVar2, 196608 | ((i32 >> 24) & 14) | ((i32 >> 15) & bb.c.b.f30796me) | (i32 & bb.c.g.f32954lc), 18);
                                if (ComposerKt.g0()) {
                                    ComposerKt.v0();
                                }
                            }

                            @Override // yh.q
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(k1 k1Var, androidx.compose.runtime.p pVar2, Integer num) {
                                a(k1Var, pVar2, num.intValue());
                                return kotlin.b2.f124493a;
                            }
                        });
                        pVarF.N(objU2);
                    } else {
                        objU2 = androidx.compose.runtime.internal.b.c(-1923353268, true, new yh.q<k1, androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.SliderKt$Slider$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(3);
                            }

                            @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                            @androidx.compose.runtime.h
                            public final void a(@dl.d k1 it, @dl.e androidx.compose.runtime.p pVar2, int i211) {
                                kotlin.jvm.internal.f0.p(it, "it");
                                if ((i211 & 81) == 16 && pVar2.b()) {
                                    pVar2.l();
                                    return;
                                }
                                if (ComposerKt.g0()) {
                                    ComposerKt.w0(-1923353268, i211, -1, "androidx.compose.material3.Slider.<anonymous>.<anonymous> (Slider.kt:176)");
                                }
                                SliderDefaults sliderDefaults = SliderDefaults.f10488a;
                                androidx.compose.foundation.interaction.g gVar6 = gVar2;
                                j1 j1Var6 = j1Var2;
                                boolean z16 = z12;
                                int i32 = i13;
                                sliderDefaults.a(gVar6, null, j1Var6, z16, 0L, pVar2, 196608 | ((i32 >> 24) & 14) | ((i32 >> 15) & bb.c.b.f30796me) | (i32 & bb.c.g.f32954lc), 18);
                                if (ComposerKt.g0()) {
                                    ComposerKt.v0();
                                }
                            }

                            @Override // yh.q
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(k1 k1Var, androidx.compose.runtime.p pVar2, Integer num) {
                                a(k1Var, pVar2, num.intValue());
                                return kotlin.b2.f124493a;
                            }
                        });
                        pVarF.N(objU2);
                    }
                    pVarF.c0();
                    yh.q qVar3 = (yh.q) objU2;
                    Boolean boolValueOf6 = Boolean.valueOf(z12);
                    pVarF.T(511388516);
                    zS2 = pVarF.s(boolValueOf6) | pVarF.s(j1Var2);
                    objU3 = pVarF.U();
                    if (zS2) {
                        objU3 = androidx.compose.runtime.internal.b.c(1022381539, true, new yh.q<k1, androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.SliderKt$Slider$3$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(3);
                            }

                            @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                            @androidx.compose.runtime.h
                            public final void a(@dl.d k1 sliderPositions, @dl.e androidx.compose.runtime.p pVar2, int i211) {
                                kotlin.jvm.internal.f0.p(sliderPositions, "sliderPositions");
                                if ((i211 & 14) == 0) {
                                    i211 |= pVar2.s(sliderPositions) ? 4 : 2;
                                }
                                if ((i211 & 91) == 18 && pVar2.b()) {
                                    pVar2.l();
                                    return;
                                }
                                if (ComposerKt.g0()) {
                                    ComposerKt.w0(1022381539, i211, -1, "androidx.compose.material3.Slider.<anonymous>.<anonymous> (Slider.kt:183)");
                                }
                                SliderDefaults sliderDefaults = SliderDefaults.f10488a;
                                j1 j1Var6 = j1Var2;
                                boolean z16 = z12;
                                int i32 = i13;
                                sliderDefaults.b(sliderPositions, null, j1Var6, z16, pVar2, (i211 & 14) | 24576 | ((i32 >> 15) & bb.c.b.f30796me) | (i32 & bb.c.g.f32954lc), 2);
                                if (ComposerKt.g0()) {
                                    ComposerKt.v0();
                                }
                            }

                            @Override // yh.q
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(k1 k1Var, androidx.compose.runtime.p pVar2, Integer num) {
                                a(k1Var, pVar2, num.intValue());
                                return kotlin.b2.f124493a;
                            }
                        });
                        pVarF.N(objU3);
                    } else {
                        objU3 = androidx.compose.runtime.internal.b.c(1022381539, true, new yh.q<k1, androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.SliderKt$Slider$3$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(3);
                            }

                            @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                            @androidx.compose.runtime.h
                            public final void a(@dl.d k1 sliderPositions, @dl.e androidx.compose.runtime.p pVar2, int i211) {
                                kotlin.jvm.internal.f0.p(sliderPositions, "sliderPositions");
                                if ((i211 & 14) == 0) {
                                    i211 |= pVar2.s(sliderPositions) ? 4 : 2;
                                }
                                if ((i211 & 91) == 18 && pVar2.b()) {
                                    pVar2.l();
                                    return;
                                }
                                if (ComposerKt.g0()) {
                                    ComposerKt.w0(1022381539, i211, -1, "androidx.compose.material3.Slider.<anonymous>.<anonymous> (Slider.kt:183)");
                                }
                                SliderDefaults sliderDefaults = SliderDefaults.f10488a;
                                j1 j1Var6 = j1Var2;
                                boolean z16 = z12;
                                int i32 = i13;
                                sliderDefaults.b(sliderPositions, null, j1Var6, z16, pVar2, (i211 & 14) | 24576 | ((i32 >> 15) & bb.c.b.f30796me) | (i32 & bb.c.g.f32954lc), 2);
                                if (ComposerKt.g0()) {
                                    ComposerKt.v0();
                                }
                            }

                            @Override // yh.q
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(k1 k1Var, androidx.compose.runtime.p pVar2, Integer num) {
                                a(k1Var, pVar2, num.intValue());
                                return kotlin.b2.f124493a;
                            }
                        });
                        pVarF.N(objU3);
                    }
                    pVarF.c0();
                    int i211 = (i13 & 14) | (i13 & 112);
                    int i32 = i13 << 3;
                    androidx.compose.foundation.interaction.g gVar6 = gVar2;
                    j1 j1Var6 = j1Var2;
                    boolean z16 = z12;
                    e(f10, onValueChange, (yh.q) objU3, nVar3, z12, fVar3, i24, aVar4, j1Var2, gVar6, qVar3, pVarF, i211 | (i32 & bb.c.g.f32954lc) | (57344 & i32) | (458752 & i32) | (i32 & 3670016) | (i32 & 29360128) | (i32 & 234881024) | (i32 & 1879048192), 0, 0);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    nVar4 = nVar3;
                    fVar4 = fVar3;
                    i25 = i24;
                    aVar5 = aVar4;
                    gVar3 = gVar6;
                    j1Var3 = j1Var6;
                    z13 = z16;
                }
                u1VarH = pVarF.H();
                if (u1VarH == null) {
                    return;
                }
                u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.SliderKt$Slider$4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public final void a(@dl.e androidx.compose.runtime.p pVar2, int i33) {
                        SliderKt.c(f10, onValueChange, nVar4, z13, fVar4, i25, aVar5, j1Var3, gVar3, pVar2, i11 | 1, i12);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                        a(pVar2, num.intValue());
                        return kotlin.b2.f124493a;
                    }
                });
            }
            i13 |= bb.c.d.f31193dj;
            if ((i11 & 57344) == 0) {
                if ((i12 & 16) == 0) {
                    fVar2 = fVar;
                    if (pVarF.s(fVar2)) {
                    }
                    i13 |= i27;
                } else {
                    fVar2 = fVar;
                }
                i13 |= i27;
            } else {
                fVar2 = fVar;
            }
            i16 = i12 & 32;
            if (i16 != 0) {
                if ((i11 & 458752) == 0) {
                    i17 = i10;
                    if (pVarF.y(i17)) {
                        i18 = 131072;
                    } else {
                        i18 = 65536;
                    }
                    i13 |= i18;
                }
                i19 = i12 & 64;
                if (i19 != 0) {
                    i13 |= 1572864;
                    aVar2 = aVar;
                } else {
                    aVar2 = aVar;
                    if ((i11 & 3670016) == 0) {
                        if (pVarF.s(aVar2)) {
                            i20 = 1048576;
                        } else {
                            i20 = 524288;
                        }
                        i13 |= i20;
                    }
                }
                if ((i11 & 29360128) == 0) {
                    if ((i12 & 128) == 0) {
                        j1VarC = j1Var;
                        if (pVarF.s(j1VarC)) {
                        }
                        i13 |= i28;
                    } else {
                        j1VarC = j1Var;
                    }
                    i13 |= i28;
                } else {
                    j1VarC = j1Var;
                }
                i21 = i12 & 256;
                if (i21 != 0) {
                    i13 |= 100663296;
                } else if ((i11 & 234881024) == 0) {
                    if (pVarF.s(gVar)) {
                        i22 = 67108864;
                    } else {
                        i22 = 33554432;
                    }
                    i13 |= i22;
                }
                if ((i13 & 191739611) == 38347922) {
                    pVarF.W();
                    if ((i11 & 1) != 0) {
                        if (i26 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if (i14 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if ((i12 & 16) != 0) {
                            fVarE = fi.t.e(0.0f, 1.0f);
                            i13 &= -57345;
                        } else {
                            fVarE = fVar2;
                        }
                        if (i16 != 0) {
                            i23 = 0;
                        } else {
                            i23 = i17;
                        }
                        if (i19 != 0) {
                            aVar3 = null;
                        } else {
                            aVar3 = aVar2;
                        }
                        if ((i12 & 128) != 0) {
                            j1VarC = SliderDefaults.f10488a.c(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, pVarF, 0, 6, 1023);
                            i13 &= -29360129;
                        }
                        if (i21 != 0) {
                            pVarF.T(-492369756);
                            objU = pVarF.U();
                            if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                                objU = androidx.compose.foundation.interaction.f.a();
                                pVarF.N(objU);
                            }
                            pVarF.c0();
                            nVar3 = nVar2;
                            z12 = z11;
                            fVar3 = fVarE;
                            j1Var2 = j1VarC;
                            i24 = i23;
                            aVar4 = aVar3;
                            gVar2 = (androidx.compose.foundation.interaction.g) objU;
                        } else {
                            nVar3 = nVar2;
                            z12 = z11;
                            fVar3 = fVarE;
                            j1Var2 = j1VarC;
                            i24 = i23;
                            aVar4 = aVar3;
                            gVar2 = gVar;
                        }
                    } else {
                        if (i26 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if (i14 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if ((i12 & 16) != 0) {
                            fVarE = fi.t.e(0.0f, 1.0f);
                            i13 &= -57345;
                        } else {
                            fVarE = fVar2;
                        }
                        if (i16 != 0) {
                            i23 = 0;
                        } else {
                            i23 = i17;
                        }
                        if (i19 != 0) {
                            aVar3 = null;
                        } else {
                            aVar3 = aVar2;
                        }
                        if ((i12 & 128) != 0) {
                            j1VarC = SliderDefaults.f10488a.c(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, pVarF, 0, 6, 1023);
                            i13 &= -29360129;
                        }
                        if (i21 != 0) {
                            pVarF.T(-492369756);
                            objU = pVarF.U();
                            if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                                objU = androidx.compose.foundation.interaction.f.a();
                                pVarF.N(objU);
                            }
                            pVarF.c0();
                            nVar3 = nVar2;
                            z12 = z11;
                            fVar3 = fVarE;
                            j1Var2 = j1VarC;
                            i24 = i23;
                            aVar4 = aVar3;
                            gVar2 = (androidx.compose.foundation.interaction.g) objU;
                        } else {
                            nVar3 = nVar2;
                            z12 = z11;
                            fVar3 = fVarE;
                            j1Var2 = j1VarC;
                            i24 = i23;
                            aVar4 = aVar3;
                            gVar2 = gVar;
                        }
                    }
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(-202044027, i13, -1, "androidx.compose.material3.Slider (Slider.kt:154)");
                    }
                    Boolean boolValueOf7 = Boolean.valueOf(z12);
                    pVarF.T(1618982084);
                    zS = pVarF.s(boolValueOf7) | pVarF.s(gVar2) | pVarF.s(j1Var2);
                    objU2 = pVarF.U();
                    if (zS) {
                        objU2 = androidx.compose.runtime.internal.b.c(-1923353268, true, new yh.q<k1, androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.SliderKt$Slider$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(3);
                            }

                            @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                            @androidx.compose.runtime.h
                            public final void a(@dl.d k1 it, @dl.e androidx.compose.runtime.p pVar2, int i212) {
                                kotlin.jvm.internal.f0.p(it, "it");
                                if ((i212 & 81) == 16 && pVar2.b()) {
                                    pVar2.l();
                                    return;
                                }
                                if (ComposerKt.g0()) {
                                    ComposerKt.w0(-1923353268, i212, -1, "androidx.compose.material3.Slider.<anonymous>.<anonymous> (Slider.kt:176)");
                                }
                                SliderDefaults sliderDefaults = SliderDefaults.f10488a;
                                androidx.compose.foundation.interaction.g gVar7 = gVar2;
                                j1 j1Var7 = j1Var2;
                                boolean z17 = z12;
                                int i33 = i13;
                                sliderDefaults.a(gVar7, null, j1Var7, z17, 0L, pVar2, 196608 | ((i33 >> 24) & 14) | ((i33 >> 15) & bb.c.b.f30796me) | (i33 & bb.c.g.f32954lc), 18);
                                if (ComposerKt.g0()) {
                                    ComposerKt.v0();
                                }
                            }

                            @Override // yh.q
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(k1 k1Var, androidx.compose.runtime.p pVar2, Integer num) {
                                a(k1Var, pVar2, num.intValue());
                                return kotlin.b2.f124493a;
                            }
                        });
                        pVarF.N(objU2);
                    } else {
                        objU2 = androidx.compose.runtime.internal.b.c(-1923353268, true, new yh.q<k1, androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.SliderKt$Slider$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(3);
                            }

                            @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                            @androidx.compose.runtime.h
                            public final void a(@dl.d k1 it, @dl.e androidx.compose.runtime.p pVar2, int i212) {
                                kotlin.jvm.internal.f0.p(it, "it");
                                if ((i212 & 81) == 16 && pVar2.b()) {
                                    pVar2.l();
                                    return;
                                }
                                if (ComposerKt.g0()) {
                                    ComposerKt.w0(-1923353268, i212, -1, "androidx.compose.material3.Slider.<anonymous>.<anonymous> (Slider.kt:176)");
                                }
                                SliderDefaults sliderDefaults = SliderDefaults.f10488a;
                                androidx.compose.foundation.interaction.g gVar7 = gVar2;
                                j1 j1Var7 = j1Var2;
                                boolean z17 = z12;
                                int i33 = i13;
                                sliderDefaults.a(gVar7, null, j1Var7, z17, 0L, pVar2, 196608 | ((i33 >> 24) & 14) | ((i33 >> 15) & bb.c.b.f30796me) | (i33 & bb.c.g.f32954lc), 18);
                                if (ComposerKt.g0()) {
                                    ComposerKt.v0();
                                }
                            }

                            @Override // yh.q
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(k1 k1Var, androidx.compose.runtime.p pVar2, Integer num) {
                                a(k1Var, pVar2, num.intValue());
                                return kotlin.b2.f124493a;
                            }
                        });
                        pVarF.N(objU2);
                    }
                    pVarF.c0();
                    yh.q qVar4 = (yh.q) objU2;
                    Boolean boolValueOf8 = Boolean.valueOf(z12);
                    pVarF.T(511388516);
                    zS2 = pVarF.s(boolValueOf8) | pVarF.s(j1Var2);
                    objU3 = pVarF.U();
                    if (zS2) {
                        objU3 = androidx.compose.runtime.internal.b.c(1022381539, true, new yh.q<k1, androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.SliderKt$Slider$3$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(3);
                            }

                            @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                            @androidx.compose.runtime.h
                            public final void a(@dl.d k1 sliderPositions, @dl.e androidx.compose.runtime.p pVar2, int i212) {
                                kotlin.jvm.internal.f0.p(sliderPositions, "sliderPositions");
                                if ((i212 & 14) == 0) {
                                    i212 |= pVar2.s(sliderPositions) ? 4 : 2;
                                }
                                if ((i212 & 91) == 18 && pVar2.b()) {
                                    pVar2.l();
                                    return;
                                }
                                if (ComposerKt.g0()) {
                                    ComposerKt.w0(1022381539, i212, -1, "androidx.compose.material3.Slider.<anonymous>.<anonymous> (Slider.kt:183)");
                                }
                                SliderDefaults sliderDefaults = SliderDefaults.f10488a;
                                j1 j1Var7 = j1Var2;
                                boolean z17 = z12;
                                int i33 = i13;
                                sliderDefaults.b(sliderPositions, null, j1Var7, z17, pVar2, (i212 & 14) | 24576 | ((i33 >> 15) & bb.c.b.f30796me) | (i33 & bb.c.g.f32954lc), 2);
                                if (ComposerKt.g0()) {
                                    ComposerKt.v0();
                                }
                            }

                            @Override // yh.q
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(k1 k1Var, androidx.compose.runtime.p pVar2, Integer num) {
                                a(k1Var, pVar2, num.intValue());
                                return kotlin.b2.f124493a;
                            }
                        });
                        pVarF.N(objU3);
                    } else {
                        objU3 = androidx.compose.runtime.internal.b.c(1022381539, true, new yh.q<k1, androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.SliderKt$Slider$3$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(3);
                            }

                            @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                            @androidx.compose.runtime.h
                            public final void a(@dl.d k1 sliderPositions, @dl.e androidx.compose.runtime.p pVar2, int i212) {
                                kotlin.jvm.internal.f0.p(sliderPositions, "sliderPositions");
                                if ((i212 & 14) == 0) {
                                    i212 |= pVar2.s(sliderPositions) ? 4 : 2;
                                }
                                if ((i212 & 91) == 18 && pVar2.b()) {
                                    pVar2.l();
                                    return;
                                }
                                if (ComposerKt.g0()) {
                                    ComposerKt.w0(1022381539, i212, -1, "androidx.compose.material3.Slider.<anonymous>.<anonymous> (Slider.kt:183)");
                                }
                                SliderDefaults sliderDefaults = SliderDefaults.f10488a;
                                j1 j1Var7 = j1Var2;
                                boolean z17 = z12;
                                int i33 = i13;
                                sliderDefaults.b(sliderPositions, null, j1Var7, z17, pVar2, (i212 & 14) | 24576 | ((i33 >> 15) & bb.c.b.f30796me) | (i33 & bb.c.g.f32954lc), 2);
                                if (ComposerKt.g0()) {
                                    ComposerKt.v0();
                                }
                            }

                            @Override // yh.q
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(k1 k1Var, androidx.compose.runtime.p pVar2, Integer num) {
                                a(k1Var, pVar2, num.intValue());
                                return kotlin.b2.f124493a;
                            }
                        });
                        pVarF.N(objU3);
                    }
                    pVarF.c0();
                    int i212 = (i13 & 14) | (i13 & 112);
                    int i33 = i13 << 3;
                    androidx.compose.foundation.interaction.g gVar7 = gVar2;
                    j1 j1Var7 = j1Var2;
                    boolean z17 = z12;
                    e(f10, onValueChange, (yh.q) objU3, nVar3, z12, fVar3, i24, aVar4, j1Var2, gVar7, qVar4, pVarF, i212 | (i33 & bb.c.g.f32954lc) | (57344 & i33) | (458752 & i33) | (i33 & 3670016) | (i33 & 29360128) | (i33 & 234881024) | (i33 & 1879048192), 0, 0);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    nVar4 = nVar3;
                    fVar4 = fVar3;
                    i25 = i24;
                    aVar5 = aVar4;
                    gVar3 = gVar7;
                    j1Var3 = j1Var7;
                    z13 = z17;
                } else {
                    pVarF.W();
                    if ((i11 & 1) != 0) {
                        if (i26 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if (i14 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if ((i12 & 16) != 0) {
                            fVarE = fi.t.e(0.0f, 1.0f);
                            i13 &= -57345;
                        } else {
                            fVarE = fVar2;
                        }
                        if (i16 != 0) {
                            i23 = 0;
                        } else {
                            i23 = i17;
                        }
                        if (i19 != 0) {
                            aVar3 = null;
                        } else {
                            aVar3 = aVar2;
                        }
                        if ((i12 & 128) != 0) {
                            j1VarC = SliderDefaults.f10488a.c(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, pVarF, 0, 6, 1023);
                            i13 &= -29360129;
                        }
                        if (i21 != 0) {
                            pVarF.T(-492369756);
                            objU = pVarF.U();
                            if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                                objU = androidx.compose.foundation.interaction.f.a();
                                pVarF.N(objU);
                            }
                            pVarF.c0();
                            nVar3 = nVar2;
                            z12 = z11;
                            fVar3 = fVarE;
                            j1Var2 = j1VarC;
                            i24 = i23;
                            aVar4 = aVar3;
                            gVar2 = (androidx.compose.foundation.interaction.g) objU;
                        } else {
                            nVar3 = nVar2;
                            z12 = z11;
                            fVar3 = fVarE;
                            j1Var2 = j1VarC;
                            i24 = i23;
                            aVar4 = aVar3;
                            gVar2 = gVar;
                        }
                    } else {
                        if (i26 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if (i14 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if ((i12 & 16) != 0) {
                            fVarE = fi.t.e(0.0f, 1.0f);
                            i13 &= -57345;
                        } else {
                            fVarE = fVar2;
                        }
                        if (i16 != 0) {
                            i23 = 0;
                        } else {
                            i23 = i17;
                        }
                        if (i19 != 0) {
                            aVar3 = null;
                        } else {
                            aVar3 = aVar2;
                        }
                        if ((i12 & 128) != 0) {
                            j1VarC = SliderDefaults.f10488a.c(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, pVarF, 0, 6, 1023);
                            i13 &= -29360129;
                        }
                        if (i21 != 0) {
                            pVarF.T(-492369756);
                            objU = pVarF.U();
                            if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                                objU = androidx.compose.foundation.interaction.f.a();
                                pVarF.N(objU);
                            }
                            pVarF.c0();
                            nVar3 = nVar2;
                            z12 = z11;
                            fVar3 = fVarE;
                            j1Var2 = j1VarC;
                            i24 = i23;
                            aVar4 = aVar3;
                            gVar2 = (androidx.compose.foundation.interaction.g) objU;
                        } else {
                            nVar3 = nVar2;
                            z12 = z11;
                            fVar3 = fVarE;
                            j1Var2 = j1VarC;
                            i24 = i23;
                            aVar4 = aVar3;
                            gVar2 = gVar;
                        }
                    }
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(-202044027, i13, -1, "androidx.compose.material3.Slider (Slider.kt:154)");
                    }
                    Boolean boolValueOf9 = Boolean.valueOf(z12);
                    pVarF.T(1618982084);
                    zS = pVarF.s(boolValueOf9) | pVarF.s(gVar2) | pVarF.s(j1Var2);
                    objU2 = pVarF.U();
                    if (zS) {
                        objU2 = androidx.compose.runtime.internal.b.c(-1923353268, true, new yh.q<k1, androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.SliderKt$Slider$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(3);
                            }

                            @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                            @androidx.compose.runtime.h
                            public final void a(@dl.d k1 it, @dl.e androidx.compose.runtime.p pVar2, int i213) {
                                kotlin.jvm.internal.f0.p(it, "it");
                                if ((i213 & 81) == 16 && pVar2.b()) {
                                    pVar2.l();
                                    return;
                                }
                                if (ComposerKt.g0()) {
                                    ComposerKt.w0(-1923353268, i213, -1, "androidx.compose.material3.Slider.<anonymous>.<anonymous> (Slider.kt:176)");
                                }
                                SliderDefaults sliderDefaults = SliderDefaults.f10488a;
                                androidx.compose.foundation.interaction.g gVar8 = gVar2;
                                j1 j1Var8 = j1Var2;
                                boolean z18 = z12;
                                int i34 = i13;
                                sliderDefaults.a(gVar8, null, j1Var8, z18, 0L, pVar2, 196608 | ((i34 >> 24) & 14) | ((i34 >> 15) & bb.c.b.f30796me) | (i34 & bb.c.g.f32954lc), 18);
                                if (ComposerKt.g0()) {
                                    ComposerKt.v0();
                                }
                            }

                            @Override // yh.q
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(k1 k1Var, androidx.compose.runtime.p pVar2, Integer num) {
                                a(k1Var, pVar2, num.intValue());
                                return kotlin.b2.f124493a;
                            }
                        });
                        pVarF.N(objU2);
                    } else {
                        objU2 = androidx.compose.runtime.internal.b.c(-1923353268, true, new yh.q<k1, androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.SliderKt$Slider$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(3);
                            }

                            @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                            @androidx.compose.runtime.h
                            public final void a(@dl.d k1 it, @dl.e androidx.compose.runtime.p pVar2, int i213) {
                                kotlin.jvm.internal.f0.p(it, "it");
                                if ((i213 & 81) == 16 && pVar2.b()) {
                                    pVar2.l();
                                    return;
                                }
                                if (ComposerKt.g0()) {
                                    ComposerKt.w0(-1923353268, i213, -1, "androidx.compose.material3.Slider.<anonymous>.<anonymous> (Slider.kt:176)");
                                }
                                SliderDefaults sliderDefaults = SliderDefaults.f10488a;
                                androidx.compose.foundation.interaction.g gVar8 = gVar2;
                                j1 j1Var8 = j1Var2;
                                boolean z18 = z12;
                                int i34 = i13;
                                sliderDefaults.a(gVar8, null, j1Var8, z18, 0L, pVar2, 196608 | ((i34 >> 24) & 14) | ((i34 >> 15) & bb.c.b.f30796me) | (i34 & bb.c.g.f32954lc), 18);
                                if (ComposerKt.g0()) {
                                    ComposerKt.v0();
                                }
                            }

                            @Override // yh.q
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(k1 k1Var, androidx.compose.runtime.p pVar2, Integer num) {
                                a(k1Var, pVar2, num.intValue());
                                return kotlin.b2.f124493a;
                            }
                        });
                        pVarF.N(objU2);
                    }
                    pVarF.c0();
                    yh.q qVar5 = (yh.q) objU2;
                    Boolean boolValueOf10 = Boolean.valueOf(z12);
                    pVarF.T(511388516);
                    zS2 = pVarF.s(boolValueOf10) | pVarF.s(j1Var2);
                    objU3 = pVarF.U();
                    if (zS2) {
                        objU3 = androidx.compose.runtime.internal.b.c(1022381539, true, new yh.q<k1, androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.SliderKt$Slider$3$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(3);
                            }

                            @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                            @androidx.compose.runtime.h
                            public final void a(@dl.d k1 sliderPositions, @dl.e androidx.compose.runtime.p pVar2, int i213) {
                                kotlin.jvm.internal.f0.p(sliderPositions, "sliderPositions");
                                if ((i213 & 14) == 0) {
                                    i213 |= pVar2.s(sliderPositions) ? 4 : 2;
                                }
                                if ((i213 & 91) == 18 && pVar2.b()) {
                                    pVar2.l();
                                    return;
                                }
                                if (ComposerKt.g0()) {
                                    ComposerKt.w0(1022381539, i213, -1, "androidx.compose.material3.Slider.<anonymous>.<anonymous> (Slider.kt:183)");
                                }
                                SliderDefaults sliderDefaults = SliderDefaults.f10488a;
                                j1 j1Var8 = j1Var2;
                                boolean z18 = z12;
                                int i34 = i13;
                                sliderDefaults.b(sliderPositions, null, j1Var8, z18, pVar2, (i213 & 14) | 24576 | ((i34 >> 15) & bb.c.b.f30796me) | (i34 & bb.c.g.f32954lc), 2);
                                if (ComposerKt.g0()) {
                                    ComposerKt.v0();
                                }
                            }

                            @Override // yh.q
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(k1 k1Var, androidx.compose.runtime.p pVar2, Integer num) {
                                a(k1Var, pVar2, num.intValue());
                                return kotlin.b2.f124493a;
                            }
                        });
                        pVarF.N(objU3);
                    } else {
                        objU3 = androidx.compose.runtime.internal.b.c(1022381539, true, new yh.q<k1, androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.SliderKt$Slider$3$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(3);
                            }

                            @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                            @androidx.compose.runtime.h
                            public final void a(@dl.d k1 sliderPositions, @dl.e androidx.compose.runtime.p pVar2, int i213) {
                                kotlin.jvm.internal.f0.p(sliderPositions, "sliderPositions");
                                if ((i213 & 14) == 0) {
                                    i213 |= pVar2.s(sliderPositions) ? 4 : 2;
                                }
                                if ((i213 & 91) == 18 && pVar2.b()) {
                                    pVar2.l();
                                    return;
                                }
                                if (ComposerKt.g0()) {
                                    ComposerKt.w0(1022381539, i213, -1, "androidx.compose.material3.Slider.<anonymous>.<anonymous> (Slider.kt:183)");
                                }
                                SliderDefaults sliderDefaults = SliderDefaults.f10488a;
                                j1 j1Var8 = j1Var2;
                                boolean z18 = z12;
                                int i34 = i13;
                                sliderDefaults.b(sliderPositions, null, j1Var8, z18, pVar2, (i213 & 14) | 24576 | ((i34 >> 15) & bb.c.b.f30796me) | (i34 & bb.c.g.f32954lc), 2);
                                if (ComposerKt.g0()) {
                                    ComposerKt.v0();
                                }
                            }

                            @Override // yh.q
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(k1 k1Var, androidx.compose.runtime.p pVar2, Integer num) {
                                a(k1Var, pVar2, num.intValue());
                                return kotlin.b2.f124493a;
                            }
                        });
                        pVarF.N(objU3);
                    }
                    pVarF.c0();
                    int i213 = (i13 & 14) | (i13 & 112);
                    int i34 = i13 << 3;
                    androidx.compose.foundation.interaction.g gVar8 = gVar2;
                    j1 j1Var8 = j1Var2;
                    boolean z18 = z12;
                    e(f10, onValueChange, (yh.q) objU3, nVar3, z12, fVar3, i24, aVar4, j1Var2, gVar8, qVar5, pVarF, i213 | (i34 & bb.c.g.f32954lc) | (57344 & i34) | (458752 & i34) | (i34 & 3670016) | (i34 & 29360128) | (i34 & 234881024) | (i34 & 1879048192), 0, 0);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    nVar4 = nVar3;
                    fVar4 = fVar3;
                    i25 = i24;
                    aVar5 = aVar4;
                    gVar3 = gVar8;
                    j1Var3 = j1Var8;
                    z13 = z18;
                }
                u1VarH = pVarF.H();
                if (u1VarH == null) {
                    return;
                }
                u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.SliderKt$Slider$4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public final void a(@dl.e androidx.compose.runtime.p pVar2, int i35) {
                        SliderKt.c(f10, onValueChange, nVar4, z13, fVar4, i25, aVar5, j1Var3, gVar3, pVar2, i11 | 1, i12);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                        a(pVar2, num.intValue());
                        return kotlin.b2.f124493a;
                    }
                });
            }
            i13 |= androidx.profileinstaller.o.c.f26824k;
            i17 = i10;
            i19 = i12 & 64;
            if (i19 != 0) {
                i13 |= 1572864;
                aVar2 = aVar;
            } else {
                aVar2 = aVar;
                if ((i11 & 3670016) == 0) {
                    if (pVarF.s(aVar2)) {
                        i20 = 1048576;
                    } else {
                        i20 = 524288;
                    }
                    i13 |= i20;
                }
            }
            if ((i11 & 29360128) == 0) {
                if ((i12 & 128) == 0) {
                    j1VarC = j1Var;
                    if (pVarF.s(j1VarC)) {
                    }
                    i13 |= i28;
                } else {
                    j1VarC = j1Var;
                }
                i13 |= i28;
            } else {
                j1VarC = j1Var;
            }
            i21 = i12 & 256;
            if (i21 != 0) {
                i13 |= 100663296;
            } else if ((i11 & 234881024) == 0) {
                if (pVarF.s(gVar)) {
                    i22 = 67108864;
                } else {
                    i22 = 33554432;
                }
                i13 |= i22;
            }
            if ((i13 & 191739611) == 38347922) {
                pVarF.W();
                if ((i11 & 1) != 0) {
                    if (i26 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar2 = nVar;
                    }
                    if (i14 != 0) {
                        z11 = true;
                    } else {
                        z11 = z10;
                    }
                    if ((i12 & 16) != 0) {
                        fVarE = fi.t.e(0.0f, 1.0f);
                        i13 &= -57345;
                    } else {
                        fVarE = fVar2;
                    }
                    if (i16 != 0) {
                        i23 = 0;
                    } else {
                        i23 = i17;
                    }
                    if (i19 != 0) {
                        aVar3 = null;
                    } else {
                        aVar3 = aVar2;
                    }
                    if ((i12 & 128) != 0) {
                        j1VarC = SliderDefaults.f10488a.c(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, pVarF, 0, 6, 1023);
                        i13 &= -29360129;
                    }
                    if (i21 != 0) {
                        pVarF.T(-492369756);
                        objU = pVarF.U();
                        if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                            objU = androidx.compose.foundation.interaction.f.a();
                            pVarF.N(objU);
                        }
                        pVarF.c0();
                        nVar3 = nVar2;
                        z12 = z11;
                        fVar3 = fVarE;
                        j1Var2 = j1VarC;
                        i24 = i23;
                        aVar4 = aVar3;
                        gVar2 = (androidx.compose.foundation.interaction.g) objU;
                    } else {
                        nVar3 = nVar2;
                        z12 = z11;
                        fVar3 = fVarE;
                        j1Var2 = j1VarC;
                        i24 = i23;
                        aVar4 = aVar3;
                        gVar2 = gVar;
                    }
                } else {
                    if (i26 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar2 = nVar;
                    }
                    if (i14 != 0) {
                        z11 = true;
                    } else {
                        z11 = z10;
                    }
                    if ((i12 & 16) != 0) {
                        fVarE = fi.t.e(0.0f, 1.0f);
                        i13 &= -57345;
                    } else {
                        fVarE = fVar2;
                    }
                    if (i16 != 0) {
                        i23 = 0;
                    } else {
                        i23 = i17;
                    }
                    if (i19 != 0) {
                        aVar3 = null;
                    } else {
                        aVar3 = aVar2;
                    }
                    if ((i12 & 128) != 0) {
                        j1VarC = SliderDefaults.f10488a.c(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, pVarF, 0, 6, 1023);
                        i13 &= -29360129;
                    }
                    if (i21 != 0) {
                        pVarF.T(-492369756);
                        objU = pVarF.U();
                        if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                            objU = androidx.compose.foundation.interaction.f.a();
                            pVarF.N(objU);
                        }
                        pVarF.c0();
                        nVar3 = nVar2;
                        z12 = z11;
                        fVar3 = fVarE;
                        j1Var2 = j1VarC;
                        i24 = i23;
                        aVar4 = aVar3;
                        gVar2 = (androidx.compose.foundation.interaction.g) objU;
                    } else {
                        nVar3 = nVar2;
                        z12 = z11;
                        fVar3 = fVarE;
                        j1Var2 = j1VarC;
                        i24 = i23;
                        aVar4 = aVar3;
                        gVar2 = gVar;
                    }
                }
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(-202044027, i13, -1, "androidx.compose.material3.Slider (Slider.kt:154)");
                }
                Boolean boolValueOf11 = Boolean.valueOf(z12);
                pVarF.T(1618982084);
                zS = pVarF.s(boolValueOf11) | pVarF.s(gVar2) | pVarF.s(j1Var2);
                objU2 = pVarF.U();
                if (zS) {
                    objU2 = androidx.compose.runtime.internal.b.c(-1923353268, true, new yh.q<k1, androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.SliderKt$Slider$2$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(3);
                        }

                        @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                        @androidx.compose.runtime.h
                        public final void a(@dl.d k1 it, @dl.e androidx.compose.runtime.p pVar2, int i214) {
                            kotlin.jvm.internal.f0.p(it, "it");
                            if ((i214 & 81) == 16 && pVar2.b()) {
                                pVar2.l();
                                return;
                            }
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(-1923353268, i214, -1, "androidx.compose.material3.Slider.<anonymous>.<anonymous> (Slider.kt:176)");
                            }
                            SliderDefaults sliderDefaults = SliderDefaults.f10488a;
                            androidx.compose.foundation.interaction.g gVar9 = gVar2;
                            j1 j1Var9 = j1Var2;
                            boolean z19 = z12;
                            int i35 = i13;
                            sliderDefaults.a(gVar9, null, j1Var9, z19, 0L, pVar2, 196608 | ((i35 >> 24) & 14) | ((i35 >> 15) & bb.c.b.f30796me) | (i35 & bb.c.g.f32954lc), 18);
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                        }

                        @Override // yh.q
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(k1 k1Var, androidx.compose.runtime.p pVar2, Integer num) {
                            a(k1Var, pVar2, num.intValue());
                            return kotlin.b2.f124493a;
                        }
                    });
                    pVarF.N(objU2);
                } else {
                    objU2 = androidx.compose.runtime.internal.b.c(-1923353268, true, new yh.q<k1, androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.SliderKt$Slider$2$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(3);
                        }

                        @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                        @androidx.compose.runtime.h
                        public final void a(@dl.d k1 it, @dl.e androidx.compose.runtime.p pVar2, int i214) {
                            kotlin.jvm.internal.f0.p(it, "it");
                            if ((i214 & 81) == 16 && pVar2.b()) {
                                pVar2.l();
                                return;
                            }
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(-1923353268, i214, -1, "androidx.compose.material3.Slider.<anonymous>.<anonymous> (Slider.kt:176)");
                            }
                            SliderDefaults sliderDefaults = SliderDefaults.f10488a;
                            androidx.compose.foundation.interaction.g gVar9 = gVar2;
                            j1 j1Var9 = j1Var2;
                            boolean z19 = z12;
                            int i35 = i13;
                            sliderDefaults.a(gVar9, null, j1Var9, z19, 0L, pVar2, 196608 | ((i35 >> 24) & 14) | ((i35 >> 15) & bb.c.b.f30796me) | (i35 & bb.c.g.f32954lc), 18);
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                        }

                        @Override // yh.q
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(k1 k1Var, androidx.compose.runtime.p pVar2, Integer num) {
                            a(k1Var, pVar2, num.intValue());
                            return kotlin.b2.f124493a;
                        }
                    });
                    pVarF.N(objU2);
                }
                pVarF.c0();
                yh.q qVar6 = (yh.q) objU2;
                Boolean boolValueOf12 = Boolean.valueOf(z12);
                pVarF.T(511388516);
                zS2 = pVarF.s(boolValueOf12) | pVarF.s(j1Var2);
                objU3 = pVarF.U();
                if (zS2) {
                    objU3 = androidx.compose.runtime.internal.b.c(1022381539, true, new yh.q<k1, androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.SliderKt$Slider$3$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(3);
                        }

                        @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                        @androidx.compose.runtime.h
                        public final void a(@dl.d k1 sliderPositions, @dl.e androidx.compose.runtime.p pVar2, int i214) {
                            kotlin.jvm.internal.f0.p(sliderPositions, "sliderPositions");
                            if ((i214 & 14) == 0) {
                                i214 |= pVar2.s(sliderPositions) ? 4 : 2;
                            }
                            if ((i214 & 91) == 18 && pVar2.b()) {
                                pVar2.l();
                                return;
                            }
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(1022381539, i214, -1, "androidx.compose.material3.Slider.<anonymous>.<anonymous> (Slider.kt:183)");
                            }
                            SliderDefaults sliderDefaults = SliderDefaults.f10488a;
                            j1 j1Var9 = j1Var2;
                            boolean z19 = z12;
                            int i35 = i13;
                            sliderDefaults.b(sliderPositions, null, j1Var9, z19, pVar2, (i214 & 14) | 24576 | ((i35 >> 15) & bb.c.b.f30796me) | (i35 & bb.c.g.f32954lc), 2);
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                        }

                        @Override // yh.q
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(k1 k1Var, androidx.compose.runtime.p pVar2, Integer num) {
                            a(k1Var, pVar2, num.intValue());
                            return kotlin.b2.f124493a;
                        }
                    });
                    pVarF.N(objU3);
                } else {
                    objU3 = androidx.compose.runtime.internal.b.c(1022381539, true, new yh.q<k1, androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.SliderKt$Slider$3$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(3);
                        }

                        @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                        @androidx.compose.runtime.h
                        public final void a(@dl.d k1 sliderPositions, @dl.e androidx.compose.runtime.p pVar2, int i214) {
                            kotlin.jvm.internal.f0.p(sliderPositions, "sliderPositions");
                            if ((i214 & 14) == 0) {
                                i214 |= pVar2.s(sliderPositions) ? 4 : 2;
                            }
                            if ((i214 & 91) == 18 && pVar2.b()) {
                                pVar2.l();
                                return;
                            }
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(1022381539, i214, -1, "androidx.compose.material3.Slider.<anonymous>.<anonymous> (Slider.kt:183)");
                            }
                            SliderDefaults sliderDefaults = SliderDefaults.f10488a;
                            j1 j1Var9 = j1Var2;
                            boolean z19 = z12;
                            int i35 = i13;
                            sliderDefaults.b(sliderPositions, null, j1Var9, z19, pVar2, (i214 & 14) | 24576 | ((i35 >> 15) & bb.c.b.f30796me) | (i35 & bb.c.g.f32954lc), 2);
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                        }

                        @Override // yh.q
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(k1 k1Var, androidx.compose.runtime.p pVar2, Integer num) {
                            a(k1Var, pVar2, num.intValue());
                            return kotlin.b2.f124493a;
                        }
                    });
                    pVarF.N(objU3);
                }
                pVarF.c0();
                int i214 = (i13 & 14) | (i13 & 112);
                int i35 = i13 << 3;
                androidx.compose.foundation.interaction.g gVar9 = gVar2;
                j1 j1Var9 = j1Var2;
                boolean z19 = z12;
                e(f10, onValueChange, (yh.q) objU3, nVar3, z12, fVar3, i24, aVar4, j1Var2, gVar9, qVar6, pVarF, i214 | (i35 & bb.c.g.f32954lc) | (57344 & i35) | (458752 & i35) | (i35 & 3670016) | (i35 & 29360128) | (i35 & 234881024) | (i35 & 1879048192), 0, 0);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                nVar4 = nVar3;
                fVar4 = fVar3;
                i25 = i24;
                aVar5 = aVar4;
                gVar3 = gVar9;
                j1Var3 = j1Var9;
                z13 = z19;
            } else {
                pVarF.W();
                if ((i11 & 1) != 0) {
                    if (i26 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar2 = nVar;
                    }
                    if (i14 != 0) {
                        z11 = true;
                    } else {
                        z11 = z10;
                    }
                    if ((i12 & 16) != 0) {
                        fVarE = fi.t.e(0.0f, 1.0f);
                        i13 &= -57345;
                    } else {
                        fVarE = fVar2;
                    }
                    if (i16 != 0) {
                        i23 = 0;
                    } else {
                        i23 = i17;
                    }
                    if (i19 != 0) {
                        aVar3 = null;
                    } else {
                        aVar3 = aVar2;
                    }
                    if ((i12 & 128) != 0) {
                        j1VarC = SliderDefaults.f10488a.c(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, pVarF, 0, 6, 1023);
                        i13 &= -29360129;
                    }
                    if (i21 != 0) {
                        pVarF.T(-492369756);
                        objU = pVarF.U();
                        if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                            objU = androidx.compose.foundation.interaction.f.a();
                            pVarF.N(objU);
                        }
                        pVarF.c0();
                        nVar3 = nVar2;
                        z12 = z11;
                        fVar3 = fVarE;
                        j1Var2 = j1VarC;
                        i24 = i23;
                        aVar4 = aVar3;
                        gVar2 = (androidx.compose.foundation.interaction.g) objU;
                    } else {
                        nVar3 = nVar2;
                        z12 = z11;
                        fVar3 = fVarE;
                        j1Var2 = j1VarC;
                        i24 = i23;
                        aVar4 = aVar3;
                        gVar2 = gVar;
                    }
                } else {
                    if (i26 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar2 = nVar;
                    }
                    if (i14 != 0) {
                        z11 = true;
                    } else {
                        z11 = z10;
                    }
                    if ((i12 & 16) != 0) {
                        fVarE = fi.t.e(0.0f, 1.0f);
                        i13 &= -57345;
                    } else {
                        fVarE = fVar2;
                    }
                    if (i16 != 0) {
                        i23 = 0;
                    } else {
                        i23 = i17;
                    }
                    if (i19 != 0) {
                        aVar3 = null;
                    } else {
                        aVar3 = aVar2;
                    }
                    if ((i12 & 128) != 0) {
                        j1VarC = SliderDefaults.f10488a.c(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, pVarF, 0, 6, 1023);
                        i13 &= -29360129;
                    }
                    if (i21 != 0) {
                        pVarF.T(-492369756);
                        objU = pVarF.U();
                        if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                            objU = androidx.compose.foundation.interaction.f.a();
                            pVarF.N(objU);
                        }
                        pVarF.c0();
                        nVar3 = nVar2;
                        z12 = z11;
                        fVar3 = fVarE;
                        j1Var2 = j1VarC;
                        i24 = i23;
                        aVar4 = aVar3;
                        gVar2 = (androidx.compose.foundation.interaction.g) objU;
                    } else {
                        nVar3 = nVar2;
                        z12 = z11;
                        fVar3 = fVarE;
                        j1Var2 = j1VarC;
                        i24 = i23;
                        aVar4 = aVar3;
                        gVar2 = gVar;
                    }
                }
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(-202044027, i13, -1, "androidx.compose.material3.Slider (Slider.kt:154)");
                }
                Boolean boolValueOf13 = Boolean.valueOf(z12);
                pVarF.T(1618982084);
                zS = pVarF.s(boolValueOf13) | pVarF.s(gVar2) | pVarF.s(j1Var2);
                objU2 = pVarF.U();
                if (zS) {
                    objU2 = androidx.compose.runtime.internal.b.c(-1923353268, true, new yh.q<k1, androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.SliderKt$Slider$2$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(3);
                        }

                        @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                        @androidx.compose.runtime.h
                        public final void a(@dl.d k1 it, @dl.e androidx.compose.runtime.p pVar2, int i215) {
                            kotlin.jvm.internal.f0.p(it, "it");
                            if ((i215 & 81) == 16 && pVar2.b()) {
                                pVar2.l();
                                return;
                            }
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(-1923353268, i215, -1, "androidx.compose.material3.Slider.<anonymous>.<anonymous> (Slider.kt:176)");
                            }
                            SliderDefaults sliderDefaults = SliderDefaults.f10488a;
                            androidx.compose.foundation.interaction.g gVar10 = gVar2;
                            j1 j1Var10 = j1Var2;
                            boolean z110 = z12;
                            int i36 = i13;
                            sliderDefaults.a(gVar10, null, j1Var10, z110, 0L, pVar2, 196608 | ((i36 >> 24) & 14) | ((i36 >> 15) & bb.c.b.f30796me) | (i36 & bb.c.g.f32954lc), 18);
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                        }

                        @Override // yh.q
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(k1 k1Var, androidx.compose.runtime.p pVar2, Integer num) {
                            a(k1Var, pVar2, num.intValue());
                            return kotlin.b2.f124493a;
                        }
                    });
                    pVarF.N(objU2);
                } else {
                    objU2 = androidx.compose.runtime.internal.b.c(-1923353268, true, new yh.q<k1, androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.SliderKt$Slider$2$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(3);
                        }

                        @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                        @androidx.compose.runtime.h
                        public final void a(@dl.d k1 it, @dl.e androidx.compose.runtime.p pVar2, int i215) {
                            kotlin.jvm.internal.f0.p(it, "it");
                            if ((i215 & 81) == 16 && pVar2.b()) {
                                pVar2.l();
                                return;
                            }
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(-1923353268, i215, -1, "androidx.compose.material3.Slider.<anonymous>.<anonymous> (Slider.kt:176)");
                            }
                            SliderDefaults sliderDefaults = SliderDefaults.f10488a;
                            androidx.compose.foundation.interaction.g gVar10 = gVar2;
                            j1 j1Var10 = j1Var2;
                            boolean z110 = z12;
                            int i36 = i13;
                            sliderDefaults.a(gVar10, null, j1Var10, z110, 0L, pVar2, 196608 | ((i36 >> 24) & 14) | ((i36 >> 15) & bb.c.b.f30796me) | (i36 & bb.c.g.f32954lc), 18);
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                        }

                        @Override // yh.q
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(k1 k1Var, androidx.compose.runtime.p pVar2, Integer num) {
                            a(k1Var, pVar2, num.intValue());
                            return kotlin.b2.f124493a;
                        }
                    });
                    pVarF.N(objU2);
                }
                pVarF.c0();
                yh.q qVar7 = (yh.q) objU2;
                Boolean boolValueOf14 = Boolean.valueOf(z12);
                pVarF.T(511388516);
                zS2 = pVarF.s(boolValueOf14) | pVarF.s(j1Var2);
                objU3 = pVarF.U();
                if (zS2) {
                    objU3 = androidx.compose.runtime.internal.b.c(1022381539, true, new yh.q<k1, androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.SliderKt$Slider$3$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(3);
                        }

                        @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                        @androidx.compose.runtime.h
                        public final void a(@dl.d k1 sliderPositions, @dl.e androidx.compose.runtime.p pVar2, int i215) {
                            kotlin.jvm.internal.f0.p(sliderPositions, "sliderPositions");
                            if ((i215 & 14) == 0) {
                                i215 |= pVar2.s(sliderPositions) ? 4 : 2;
                            }
                            if ((i215 & 91) == 18 && pVar2.b()) {
                                pVar2.l();
                                return;
                            }
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(1022381539, i215, -1, "androidx.compose.material3.Slider.<anonymous>.<anonymous> (Slider.kt:183)");
                            }
                            SliderDefaults sliderDefaults = SliderDefaults.f10488a;
                            j1 j1Var10 = j1Var2;
                            boolean z110 = z12;
                            int i36 = i13;
                            sliderDefaults.b(sliderPositions, null, j1Var10, z110, pVar2, (i215 & 14) | 24576 | ((i36 >> 15) & bb.c.b.f30796me) | (i36 & bb.c.g.f32954lc), 2);
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                        }

                        @Override // yh.q
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(k1 k1Var, androidx.compose.runtime.p pVar2, Integer num) {
                            a(k1Var, pVar2, num.intValue());
                            return kotlin.b2.f124493a;
                        }
                    });
                    pVarF.N(objU3);
                } else {
                    objU3 = androidx.compose.runtime.internal.b.c(1022381539, true, new yh.q<k1, androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.SliderKt$Slider$3$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(3);
                        }

                        @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                        @androidx.compose.runtime.h
                        public final void a(@dl.d k1 sliderPositions, @dl.e androidx.compose.runtime.p pVar2, int i215) {
                            kotlin.jvm.internal.f0.p(sliderPositions, "sliderPositions");
                            if ((i215 & 14) == 0) {
                                i215 |= pVar2.s(sliderPositions) ? 4 : 2;
                            }
                            if ((i215 & 91) == 18 && pVar2.b()) {
                                pVar2.l();
                                return;
                            }
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(1022381539, i215, -1, "androidx.compose.material3.Slider.<anonymous>.<anonymous> (Slider.kt:183)");
                            }
                            SliderDefaults sliderDefaults = SliderDefaults.f10488a;
                            j1 j1Var10 = j1Var2;
                            boolean z110 = z12;
                            int i36 = i13;
                            sliderDefaults.b(sliderPositions, null, j1Var10, z110, pVar2, (i215 & 14) | 24576 | ((i36 >> 15) & bb.c.b.f30796me) | (i36 & bb.c.g.f32954lc), 2);
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                        }

                        @Override // yh.q
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(k1 k1Var, androidx.compose.runtime.p pVar2, Integer num) {
                            a(k1Var, pVar2, num.intValue());
                            return kotlin.b2.f124493a;
                        }
                    });
                    pVarF.N(objU3);
                }
                pVarF.c0();
                int i215 = (i13 & 14) | (i13 & 112);
                int i36 = i13 << 3;
                androidx.compose.foundation.interaction.g gVar10 = gVar2;
                j1 j1Var10 = j1Var2;
                boolean z110 = z12;
                e(f10, onValueChange, (yh.q) objU3, nVar3, z12, fVar3, i24, aVar4, j1Var2, gVar10, qVar7, pVarF, i215 | (i36 & bb.c.g.f32954lc) | (57344 & i36) | (458752 & i36) | (i36 & 3670016) | (i36 & 29360128) | (i36 & 234881024) | (i36 & 1879048192), 0, 0);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                nVar4 = nVar3;
                fVar4 = fVar3;
                i25 = i24;
                aVar5 = aVar4;
                gVar3 = gVar10;
                j1Var3 = j1Var10;
                z13 = z110;
            }
            u1VarH = pVarF.H();
            if (u1VarH == null) {
                return;
            }
            u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.SliderKt$Slider$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void a(@dl.e androidx.compose.runtime.p pVar2, int i37) {
                    SliderKt.c(f10, onValueChange, nVar4, z13, fVar4, i25, aVar5, j1Var3, gVar3, pVar2, i11 | 1, i12);
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                    a(pVar2, num.intValue());
                    return kotlin.b2.f124493a;
                }
            });
        }
        i13 |= bb.c.b.f30966u4;
        i14 = i12 & 8;
        if (i14 != 0) {
            if ((i11 & bb.c.g.f32954lc) == 0) {
                if (pVarF.u(z10)) {
                    i15 = 2048;
                } else {
                    i15 = 1024;
                }
                i13 |= i15;
            }
            if ((i11 & 57344) == 0) {
                if ((i12 & 16) == 0) {
                    fVar2 = fVar;
                    if (pVarF.s(fVar2)) {
                    }
                    i13 |= i27;
                } else {
                    fVar2 = fVar;
                }
                i13 |= i27;
            } else {
                fVar2 = fVar;
            }
            i16 = i12 & 32;
            if (i16 != 0) {
                if ((i11 & 458752) == 0) {
                    i17 = i10;
                    if (pVarF.y(i17)) {
                        i18 = 131072;
                    } else {
                        i18 = 65536;
                    }
                    i13 |= i18;
                }
                i19 = i12 & 64;
                if (i19 != 0) {
                    i13 |= 1572864;
                    aVar2 = aVar;
                } else {
                    aVar2 = aVar;
                    if ((i11 & 3670016) == 0) {
                        if (pVarF.s(aVar2)) {
                            i20 = 1048576;
                        } else {
                            i20 = 524288;
                        }
                        i13 |= i20;
                    }
                }
                if ((i11 & 29360128) == 0) {
                    if ((i12 & 128) == 0) {
                        j1VarC = j1Var;
                        if (pVarF.s(j1VarC)) {
                        }
                        i13 |= i28;
                    } else {
                        j1VarC = j1Var;
                    }
                    i13 |= i28;
                } else {
                    j1VarC = j1Var;
                }
                i21 = i12 & 256;
                if (i21 != 0) {
                    i13 |= 100663296;
                } else if ((i11 & 234881024) == 0) {
                    if (pVarF.s(gVar)) {
                        i22 = 67108864;
                    } else {
                        i22 = 33554432;
                    }
                    i13 |= i22;
                }
                if ((i13 & 191739611) == 38347922) {
                    pVarF.W();
                    if ((i11 & 1) != 0) {
                        if (i26 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if (i14 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if ((i12 & 16) != 0) {
                            fVarE = fi.t.e(0.0f, 1.0f);
                            i13 &= -57345;
                        } else {
                            fVarE = fVar2;
                        }
                        if (i16 != 0) {
                            i23 = 0;
                        } else {
                            i23 = i17;
                        }
                        if (i19 != 0) {
                            aVar3 = null;
                        } else {
                            aVar3 = aVar2;
                        }
                        if ((i12 & 128) != 0) {
                            j1VarC = SliderDefaults.f10488a.c(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, pVarF, 0, 6, 1023);
                            i13 &= -29360129;
                        }
                        if (i21 != 0) {
                            pVarF.T(-492369756);
                            objU = pVarF.U();
                            if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                                objU = androidx.compose.foundation.interaction.f.a();
                                pVarF.N(objU);
                            }
                            pVarF.c0();
                            nVar3 = nVar2;
                            z12 = z11;
                            fVar3 = fVarE;
                            j1Var2 = j1VarC;
                            i24 = i23;
                            aVar4 = aVar3;
                            gVar2 = (androidx.compose.foundation.interaction.g) objU;
                        } else {
                            nVar3 = nVar2;
                            z12 = z11;
                            fVar3 = fVarE;
                            j1Var2 = j1VarC;
                            i24 = i23;
                            aVar4 = aVar3;
                            gVar2 = gVar;
                        }
                    } else {
                        if (i26 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if (i14 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if ((i12 & 16) != 0) {
                            fVarE = fi.t.e(0.0f, 1.0f);
                            i13 &= -57345;
                        } else {
                            fVarE = fVar2;
                        }
                        if (i16 != 0) {
                            i23 = 0;
                        } else {
                            i23 = i17;
                        }
                        if (i19 != 0) {
                            aVar3 = null;
                        } else {
                            aVar3 = aVar2;
                        }
                        if ((i12 & 128) != 0) {
                            j1VarC = SliderDefaults.f10488a.c(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, pVarF, 0, 6, 1023);
                            i13 &= -29360129;
                        }
                        if (i21 != 0) {
                            pVarF.T(-492369756);
                            objU = pVarF.U();
                            if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                                objU = androidx.compose.foundation.interaction.f.a();
                                pVarF.N(objU);
                            }
                            pVarF.c0();
                            nVar3 = nVar2;
                            z12 = z11;
                            fVar3 = fVarE;
                            j1Var2 = j1VarC;
                            i24 = i23;
                            aVar4 = aVar3;
                            gVar2 = (androidx.compose.foundation.interaction.g) objU;
                        } else {
                            nVar3 = nVar2;
                            z12 = z11;
                            fVar3 = fVarE;
                            j1Var2 = j1VarC;
                            i24 = i23;
                            aVar4 = aVar3;
                            gVar2 = gVar;
                        }
                    }
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(-202044027, i13, -1, "androidx.compose.material3.Slider (Slider.kt:154)");
                    }
                    Boolean boolValueOf15 = Boolean.valueOf(z12);
                    pVarF.T(1618982084);
                    zS = pVarF.s(boolValueOf15) | pVarF.s(gVar2) | pVarF.s(j1Var2);
                    objU2 = pVarF.U();
                    if (zS) {
                        objU2 = androidx.compose.runtime.internal.b.c(-1923353268, true, new yh.q<k1, androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.SliderKt$Slider$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(3);
                            }

                            @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                            @androidx.compose.runtime.h
                            public final void a(@dl.d k1 it, @dl.e androidx.compose.runtime.p pVar2, int i216) {
                                kotlin.jvm.internal.f0.p(it, "it");
                                if ((i216 & 81) == 16 && pVar2.b()) {
                                    pVar2.l();
                                    return;
                                }
                                if (ComposerKt.g0()) {
                                    ComposerKt.w0(-1923353268, i216, -1, "androidx.compose.material3.Slider.<anonymous>.<anonymous> (Slider.kt:176)");
                                }
                                SliderDefaults sliderDefaults = SliderDefaults.f10488a;
                                androidx.compose.foundation.interaction.g gVar11 = gVar2;
                                j1 j1Var11 = j1Var2;
                                boolean z111 = z12;
                                int i37 = i13;
                                sliderDefaults.a(gVar11, null, j1Var11, z111, 0L, pVar2, 196608 | ((i37 >> 24) & 14) | ((i37 >> 15) & bb.c.b.f30796me) | (i37 & bb.c.g.f32954lc), 18);
                                if (ComposerKt.g0()) {
                                    ComposerKt.v0();
                                }
                            }

                            @Override // yh.q
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(k1 k1Var, androidx.compose.runtime.p pVar2, Integer num) {
                                a(k1Var, pVar2, num.intValue());
                                return kotlin.b2.f124493a;
                            }
                        });
                        pVarF.N(objU2);
                    } else {
                        objU2 = androidx.compose.runtime.internal.b.c(-1923353268, true, new yh.q<k1, androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.SliderKt$Slider$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(3);
                            }

                            @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                            @androidx.compose.runtime.h
                            public final void a(@dl.d k1 it, @dl.e androidx.compose.runtime.p pVar2, int i216) {
                                kotlin.jvm.internal.f0.p(it, "it");
                                if ((i216 & 81) == 16 && pVar2.b()) {
                                    pVar2.l();
                                    return;
                                }
                                if (ComposerKt.g0()) {
                                    ComposerKt.w0(-1923353268, i216, -1, "androidx.compose.material3.Slider.<anonymous>.<anonymous> (Slider.kt:176)");
                                }
                                SliderDefaults sliderDefaults = SliderDefaults.f10488a;
                                androidx.compose.foundation.interaction.g gVar11 = gVar2;
                                j1 j1Var11 = j1Var2;
                                boolean z111 = z12;
                                int i37 = i13;
                                sliderDefaults.a(gVar11, null, j1Var11, z111, 0L, pVar2, 196608 | ((i37 >> 24) & 14) | ((i37 >> 15) & bb.c.b.f30796me) | (i37 & bb.c.g.f32954lc), 18);
                                if (ComposerKt.g0()) {
                                    ComposerKt.v0();
                                }
                            }

                            @Override // yh.q
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(k1 k1Var, androidx.compose.runtime.p pVar2, Integer num) {
                                a(k1Var, pVar2, num.intValue());
                                return kotlin.b2.f124493a;
                            }
                        });
                        pVarF.N(objU2);
                    }
                    pVarF.c0();
                    yh.q qVar8 = (yh.q) objU2;
                    Boolean boolValueOf16 = Boolean.valueOf(z12);
                    pVarF.T(511388516);
                    zS2 = pVarF.s(boolValueOf16) | pVarF.s(j1Var2);
                    objU3 = pVarF.U();
                    if (zS2) {
                        objU3 = androidx.compose.runtime.internal.b.c(1022381539, true, new yh.q<k1, androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.SliderKt$Slider$3$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(3);
                            }

                            @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                            @androidx.compose.runtime.h
                            public final void a(@dl.d k1 sliderPositions, @dl.e androidx.compose.runtime.p pVar2, int i216) {
                                kotlin.jvm.internal.f0.p(sliderPositions, "sliderPositions");
                                if ((i216 & 14) == 0) {
                                    i216 |= pVar2.s(sliderPositions) ? 4 : 2;
                                }
                                if ((i216 & 91) == 18 && pVar2.b()) {
                                    pVar2.l();
                                    return;
                                }
                                if (ComposerKt.g0()) {
                                    ComposerKt.w0(1022381539, i216, -1, "androidx.compose.material3.Slider.<anonymous>.<anonymous> (Slider.kt:183)");
                                }
                                SliderDefaults sliderDefaults = SliderDefaults.f10488a;
                                j1 j1Var11 = j1Var2;
                                boolean z111 = z12;
                                int i37 = i13;
                                sliderDefaults.b(sliderPositions, null, j1Var11, z111, pVar2, (i216 & 14) | 24576 | ((i37 >> 15) & bb.c.b.f30796me) | (i37 & bb.c.g.f32954lc), 2);
                                if (ComposerKt.g0()) {
                                    ComposerKt.v0();
                                }
                            }

                            @Override // yh.q
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(k1 k1Var, androidx.compose.runtime.p pVar2, Integer num) {
                                a(k1Var, pVar2, num.intValue());
                                return kotlin.b2.f124493a;
                            }
                        });
                        pVarF.N(objU3);
                    } else {
                        objU3 = androidx.compose.runtime.internal.b.c(1022381539, true, new yh.q<k1, androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.SliderKt$Slider$3$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(3);
                            }

                            @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                            @androidx.compose.runtime.h
                            public final void a(@dl.d k1 sliderPositions, @dl.e androidx.compose.runtime.p pVar2, int i216) {
                                kotlin.jvm.internal.f0.p(sliderPositions, "sliderPositions");
                                if ((i216 & 14) == 0) {
                                    i216 |= pVar2.s(sliderPositions) ? 4 : 2;
                                }
                                if ((i216 & 91) == 18 && pVar2.b()) {
                                    pVar2.l();
                                    return;
                                }
                                if (ComposerKt.g0()) {
                                    ComposerKt.w0(1022381539, i216, -1, "androidx.compose.material3.Slider.<anonymous>.<anonymous> (Slider.kt:183)");
                                }
                                SliderDefaults sliderDefaults = SliderDefaults.f10488a;
                                j1 j1Var11 = j1Var2;
                                boolean z111 = z12;
                                int i37 = i13;
                                sliderDefaults.b(sliderPositions, null, j1Var11, z111, pVar2, (i216 & 14) | 24576 | ((i37 >> 15) & bb.c.b.f30796me) | (i37 & bb.c.g.f32954lc), 2);
                                if (ComposerKt.g0()) {
                                    ComposerKt.v0();
                                }
                            }

                            @Override // yh.q
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(k1 k1Var, androidx.compose.runtime.p pVar2, Integer num) {
                                a(k1Var, pVar2, num.intValue());
                                return kotlin.b2.f124493a;
                            }
                        });
                        pVarF.N(objU3);
                    }
                    pVarF.c0();
                    int i216 = (i13 & 14) | (i13 & 112);
                    int i37 = i13 << 3;
                    androidx.compose.foundation.interaction.g gVar11 = gVar2;
                    j1 j1Var11 = j1Var2;
                    boolean z111 = z12;
                    e(f10, onValueChange, (yh.q) objU3, nVar3, z12, fVar3, i24, aVar4, j1Var2, gVar11, qVar8, pVarF, i216 | (i37 & bb.c.g.f32954lc) | (57344 & i37) | (458752 & i37) | (i37 & 3670016) | (i37 & 29360128) | (i37 & 234881024) | (i37 & 1879048192), 0, 0);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    nVar4 = nVar3;
                    fVar4 = fVar3;
                    i25 = i24;
                    aVar5 = aVar4;
                    gVar3 = gVar11;
                    j1Var3 = j1Var11;
                    z13 = z111;
                } else {
                    pVarF.W();
                    if ((i11 & 1) != 0) {
                        if (i26 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if (i14 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if ((i12 & 16) != 0) {
                            fVarE = fi.t.e(0.0f, 1.0f);
                            i13 &= -57345;
                        } else {
                            fVarE = fVar2;
                        }
                        if (i16 != 0) {
                            i23 = 0;
                        } else {
                            i23 = i17;
                        }
                        if (i19 != 0) {
                            aVar3 = null;
                        } else {
                            aVar3 = aVar2;
                        }
                        if ((i12 & 128) != 0) {
                            j1VarC = SliderDefaults.f10488a.c(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, pVarF, 0, 6, 1023);
                            i13 &= -29360129;
                        }
                        if (i21 != 0) {
                            pVarF.T(-492369756);
                            objU = pVarF.U();
                            if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                                objU = androidx.compose.foundation.interaction.f.a();
                                pVarF.N(objU);
                            }
                            pVarF.c0();
                            nVar3 = nVar2;
                            z12 = z11;
                            fVar3 = fVarE;
                            j1Var2 = j1VarC;
                            i24 = i23;
                            aVar4 = aVar3;
                            gVar2 = (androidx.compose.foundation.interaction.g) objU;
                        } else {
                            nVar3 = nVar2;
                            z12 = z11;
                            fVar3 = fVarE;
                            j1Var2 = j1VarC;
                            i24 = i23;
                            aVar4 = aVar3;
                            gVar2 = gVar;
                        }
                    } else {
                        if (i26 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if (i14 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if ((i12 & 16) != 0) {
                            fVarE = fi.t.e(0.0f, 1.0f);
                            i13 &= -57345;
                        } else {
                            fVarE = fVar2;
                        }
                        if (i16 != 0) {
                            i23 = 0;
                        } else {
                            i23 = i17;
                        }
                        if (i19 != 0) {
                            aVar3 = null;
                        } else {
                            aVar3 = aVar2;
                        }
                        if ((i12 & 128) != 0) {
                            j1VarC = SliderDefaults.f10488a.c(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, pVarF, 0, 6, 1023);
                            i13 &= -29360129;
                        }
                        if (i21 != 0) {
                            pVarF.T(-492369756);
                            objU = pVarF.U();
                            if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                                objU = androidx.compose.foundation.interaction.f.a();
                                pVarF.N(objU);
                            }
                            pVarF.c0();
                            nVar3 = nVar2;
                            z12 = z11;
                            fVar3 = fVarE;
                            j1Var2 = j1VarC;
                            i24 = i23;
                            aVar4 = aVar3;
                            gVar2 = (androidx.compose.foundation.interaction.g) objU;
                        } else {
                            nVar3 = nVar2;
                            z12 = z11;
                            fVar3 = fVarE;
                            j1Var2 = j1VarC;
                            i24 = i23;
                            aVar4 = aVar3;
                            gVar2 = gVar;
                        }
                    }
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(-202044027, i13, -1, "androidx.compose.material3.Slider (Slider.kt:154)");
                    }
                    Boolean boolValueOf17 = Boolean.valueOf(z12);
                    pVarF.T(1618982084);
                    zS = pVarF.s(boolValueOf17) | pVarF.s(gVar2) | pVarF.s(j1Var2);
                    objU2 = pVarF.U();
                    if (zS) {
                        objU2 = androidx.compose.runtime.internal.b.c(-1923353268, true, new yh.q<k1, androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.SliderKt$Slider$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(3);
                            }

                            @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                            @androidx.compose.runtime.h
                            public final void a(@dl.d k1 it, @dl.e androidx.compose.runtime.p pVar2, int i217) {
                                kotlin.jvm.internal.f0.p(it, "it");
                                if ((i217 & 81) == 16 && pVar2.b()) {
                                    pVar2.l();
                                    return;
                                }
                                if (ComposerKt.g0()) {
                                    ComposerKt.w0(-1923353268, i217, -1, "androidx.compose.material3.Slider.<anonymous>.<anonymous> (Slider.kt:176)");
                                }
                                SliderDefaults sliderDefaults = SliderDefaults.f10488a;
                                androidx.compose.foundation.interaction.g gVar12 = gVar2;
                                j1 j1Var12 = j1Var2;
                                boolean z112 = z12;
                                int i38 = i13;
                                sliderDefaults.a(gVar12, null, j1Var12, z112, 0L, pVar2, 196608 | ((i38 >> 24) & 14) | ((i38 >> 15) & bb.c.b.f30796me) | (i38 & bb.c.g.f32954lc), 18);
                                if (ComposerKt.g0()) {
                                    ComposerKt.v0();
                                }
                            }

                            @Override // yh.q
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(k1 k1Var, androidx.compose.runtime.p pVar2, Integer num) {
                                a(k1Var, pVar2, num.intValue());
                                return kotlin.b2.f124493a;
                            }
                        });
                        pVarF.N(objU2);
                    } else {
                        objU2 = androidx.compose.runtime.internal.b.c(-1923353268, true, new yh.q<k1, androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.SliderKt$Slider$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(3);
                            }

                            @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                            @androidx.compose.runtime.h
                            public final void a(@dl.d k1 it, @dl.e androidx.compose.runtime.p pVar2, int i217) {
                                kotlin.jvm.internal.f0.p(it, "it");
                                if ((i217 & 81) == 16 && pVar2.b()) {
                                    pVar2.l();
                                    return;
                                }
                                if (ComposerKt.g0()) {
                                    ComposerKt.w0(-1923353268, i217, -1, "androidx.compose.material3.Slider.<anonymous>.<anonymous> (Slider.kt:176)");
                                }
                                SliderDefaults sliderDefaults = SliderDefaults.f10488a;
                                androidx.compose.foundation.interaction.g gVar12 = gVar2;
                                j1 j1Var12 = j1Var2;
                                boolean z112 = z12;
                                int i38 = i13;
                                sliderDefaults.a(gVar12, null, j1Var12, z112, 0L, pVar2, 196608 | ((i38 >> 24) & 14) | ((i38 >> 15) & bb.c.b.f30796me) | (i38 & bb.c.g.f32954lc), 18);
                                if (ComposerKt.g0()) {
                                    ComposerKt.v0();
                                }
                            }

                            @Override // yh.q
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(k1 k1Var, androidx.compose.runtime.p pVar2, Integer num) {
                                a(k1Var, pVar2, num.intValue());
                                return kotlin.b2.f124493a;
                            }
                        });
                        pVarF.N(objU2);
                    }
                    pVarF.c0();
                    yh.q qVar9 = (yh.q) objU2;
                    Boolean boolValueOf18 = Boolean.valueOf(z12);
                    pVarF.T(511388516);
                    zS2 = pVarF.s(boolValueOf18) | pVarF.s(j1Var2);
                    objU3 = pVarF.U();
                    if (zS2) {
                        objU3 = androidx.compose.runtime.internal.b.c(1022381539, true, new yh.q<k1, androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.SliderKt$Slider$3$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(3);
                            }

                            @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                            @androidx.compose.runtime.h
                            public final void a(@dl.d k1 sliderPositions, @dl.e androidx.compose.runtime.p pVar2, int i217) {
                                kotlin.jvm.internal.f0.p(sliderPositions, "sliderPositions");
                                if ((i217 & 14) == 0) {
                                    i217 |= pVar2.s(sliderPositions) ? 4 : 2;
                                }
                                if ((i217 & 91) == 18 && pVar2.b()) {
                                    pVar2.l();
                                    return;
                                }
                                if (ComposerKt.g0()) {
                                    ComposerKt.w0(1022381539, i217, -1, "androidx.compose.material3.Slider.<anonymous>.<anonymous> (Slider.kt:183)");
                                }
                                SliderDefaults sliderDefaults = SliderDefaults.f10488a;
                                j1 j1Var12 = j1Var2;
                                boolean z112 = z12;
                                int i38 = i13;
                                sliderDefaults.b(sliderPositions, null, j1Var12, z112, pVar2, (i217 & 14) | 24576 | ((i38 >> 15) & bb.c.b.f30796me) | (i38 & bb.c.g.f32954lc), 2);
                                if (ComposerKt.g0()) {
                                    ComposerKt.v0();
                                }
                            }

                            @Override // yh.q
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(k1 k1Var, androidx.compose.runtime.p pVar2, Integer num) {
                                a(k1Var, pVar2, num.intValue());
                                return kotlin.b2.f124493a;
                            }
                        });
                        pVarF.N(objU3);
                    } else {
                        objU3 = androidx.compose.runtime.internal.b.c(1022381539, true, new yh.q<k1, androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.SliderKt$Slider$3$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(3);
                            }

                            @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                            @androidx.compose.runtime.h
                            public final void a(@dl.d k1 sliderPositions, @dl.e androidx.compose.runtime.p pVar2, int i217) {
                                kotlin.jvm.internal.f0.p(sliderPositions, "sliderPositions");
                                if ((i217 & 14) == 0) {
                                    i217 |= pVar2.s(sliderPositions) ? 4 : 2;
                                }
                                if ((i217 & 91) == 18 && pVar2.b()) {
                                    pVar2.l();
                                    return;
                                }
                                if (ComposerKt.g0()) {
                                    ComposerKt.w0(1022381539, i217, -1, "androidx.compose.material3.Slider.<anonymous>.<anonymous> (Slider.kt:183)");
                                }
                                SliderDefaults sliderDefaults = SliderDefaults.f10488a;
                                j1 j1Var12 = j1Var2;
                                boolean z112 = z12;
                                int i38 = i13;
                                sliderDefaults.b(sliderPositions, null, j1Var12, z112, pVar2, (i217 & 14) | 24576 | ((i38 >> 15) & bb.c.b.f30796me) | (i38 & bb.c.g.f32954lc), 2);
                                if (ComposerKt.g0()) {
                                    ComposerKt.v0();
                                }
                            }

                            @Override // yh.q
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(k1 k1Var, androidx.compose.runtime.p pVar2, Integer num) {
                                a(k1Var, pVar2, num.intValue());
                                return kotlin.b2.f124493a;
                            }
                        });
                        pVarF.N(objU3);
                    }
                    pVarF.c0();
                    int i217 = (i13 & 14) | (i13 & 112);
                    int i38 = i13 << 3;
                    androidx.compose.foundation.interaction.g gVar12 = gVar2;
                    j1 j1Var12 = j1Var2;
                    boolean z112 = z12;
                    e(f10, onValueChange, (yh.q) objU3, nVar3, z12, fVar3, i24, aVar4, j1Var2, gVar12, qVar9, pVarF, i217 | (i38 & bb.c.g.f32954lc) | (57344 & i38) | (458752 & i38) | (i38 & 3670016) | (i38 & 29360128) | (i38 & 234881024) | (i38 & 1879048192), 0, 0);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    nVar4 = nVar3;
                    fVar4 = fVar3;
                    i25 = i24;
                    aVar5 = aVar4;
                    gVar3 = gVar12;
                    j1Var3 = j1Var12;
                    z13 = z112;
                }
                u1VarH = pVarF.H();
                if (u1VarH == null) {
                    return;
                }
                u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.SliderKt$Slider$4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public final void a(@dl.e androidx.compose.runtime.p pVar2, int i39) {
                        SliderKt.c(f10, onValueChange, nVar4, z13, fVar4, i25, aVar5, j1Var3, gVar3, pVar2, i11 | 1, i12);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                        a(pVar2, num.intValue());
                        return kotlin.b2.f124493a;
                    }
                });
            }
            i13 |= androidx.profileinstaller.o.c.f26824k;
            i17 = i10;
            i19 = i12 & 64;
            if (i19 != 0) {
                i13 |= 1572864;
                aVar2 = aVar;
            } else {
                aVar2 = aVar;
                if ((i11 & 3670016) == 0) {
                    if (pVarF.s(aVar2)) {
                        i20 = 1048576;
                    } else {
                        i20 = 524288;
                    }
                    i13 |= i20;
                }
            }
            if ((i11 & 29360128) == 0) {
                if ((i12 & 128) == 0) {
                    j1VarC = j1Var;
                    if (pVarF.s(j1VarC)) {
                    }
                    i13 |= i28;
                } else {
                    j1VarC = j1Var;
                }
                i13 |= i28;
            } else {
                j1VarC = j1Var;
            }
            i21 = i12 & 256;
            if (i21 != 0) {
                i13 |= 100663296;
            } else if ((i11 & 234881024) == 0) {
                if (pVarF.s(gVar)) {
                    i22 = 67108864;
                } else {
                    i22 = 33554432;
                }
                i13 |= i22;
            }
            if ((i13 & 191739611) == 38347922) {
                pVarF.W();
                if ((i11 & 1) != 0) {
                    if (i26 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar2 = nVar;
                    }
                    if (i14 != 0) {
                        z11 = true;
                    } else {
                        z11 = z10;
                    }
                    if ((i12 & 16) != 0) {
                        fVarE = fi.t.e(0.0f, 1.0f);
                        i13 &= -57345;
                    } else {
                        fVarE = fVar2;
                    }
                    if (i16 != 0) {
                        i23 = 0;
                    } else {
                        i23 = i17;
                    }
                    if (i19 != 0) {
                        aVar3 = null;
                    } else {
                        aVar3 = aVar2;
                    }
                    if ((i12 & 128) != 0) {
                        j1VarC = SliderDefaults.f10488a.c(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, pVarF, 0, 6, 1023);
                        i13 &= -29360129;
                    }
                    if (i21 != 0) {
                        pVarF.T(-492369756);
                        objU = pVarF.U();
                        if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                            objU = androidx.compose.foundation.interaction.f.a();
                            pVarF.N(objU);
                        }
                        pVarF.c0();
                        nVar3 = nVar2;
                        z12 = z11;
                        fVar3 = fVarE;
                        j1Var2 = j1VarC;
                        i24 = i23;
                        aVar4 = aVar3;
                        gVar2 = (androidx.compose.foundation.interaction.g) objU;
                    } else {
                        nVar3 = nVar2;
                        z12 = z11;
                        fVar3 = fVarE;
                        j1Var2 = j1VarC;
                        i24 = i23;
                        aVar4 = aVar3;
                        gVar2 = gVar;
                    }
                } else {
                    if (i26 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar2 = nVar;
                    }
                    if (i14 != 0) {
                        z11 = true;
                    } else {
                        z11 = z10;
                    }
                    if ((i12 & 16) != 0) {
                        fVarE = fi.t.e(0.0f, 1.0f);
                        i13 &= -57345;
                    } else {
                        fVarE = fVar2;
                    }
                    if (i16 != 0) {
                        i23 = 0;
                    } else {
                        i23 = i17;
                    }
                    if (i19 != 0) {
                        aVar3 = null;
                    } else {
                        aVar3 = aVar2;
                    }
                    if ((i12 & 128) != 0) {
                        j1VarC = SliderDefaults.f10488a.c(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, pVarF, 0, 6, 1023);
                        i13 &= -29360129;
                    }
                    if (i21 != 0) {
                        pVarF.T(-492369756);
                        objU = pVarF.U();
                        if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                            objU = androidx.compose.foundation.interaction.f.a();
                            pVarF.N(objU);
                        }
                        pVarF.c0();
                        nVar3 = nVar2;
                        z12 = z11;
                        fVar3 = fVarE;
                        j1Var2 = j1VarC;
                        i24 = i23;
                        aVar4 = aVar3;
                        gVar2 = (androidx.compose.foundation.interaction.g) objU;
                    } else {
                        nVar3 = nVar2;
                        z12 = z11;
                        fVar3 = fVarE;
                        j1Var2 = j1VarC;
                        i24 = i23;
                        aVar4 = aVar3;
                        gVar2 = gVar;
                    }
                }
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(-202044027, i13, -1, "androidx.compose.material3.Slider (Slider.kt:154)");
                }
                Boolean boolValueOf19 = Boolean.valueOf(z12);
                pVarF.T(1618982084);
                zS = pVarF.s(boolValueOf19) | pVarF.s(gVar2) | pVarF.s(j1Var2);
                objU2 = pVarF.U();
                if (zS) {
                    objU2 = androidx.compose.runtime.internal.b.c(-1923353268, true, new yh.q<k1, androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.SliderKt$Slider$2$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(3);
                        }

                        @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                        @androidx.compose.runtime.h
                        public final void a(@dl.d k1 it, @dl.e androidx.compose.runtime.p pVar2, int i218) {
                            kotlin.jvm.internal.f0.p(it, "it");
                            if ((i218 & 81) == 16 && pVar2.b()) {
                                pVar2.l();
                                return;
                            }
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(-1923353268, i218, -1, "androidx.compose.material3.Slider.<anonymous>.<anonymous> (Slider.kt:176)");
                            }
                            SliderDefaults sliderDefaults = SliderDefaults.f10488a;
                            androidx.compose.foundation.interaction.g gVar13 = gVar2;
                            j1 j1Var13 = j1Var2;
                            boolean z113 = z12;
                            int i39 = i13;
                            sliderDefaults.a(gVar13, null, j1Var13, z113, 0L, pVar2, 196608 | ((i39 >> 24) & 14) | ((i39 >> 15) & bb.c.b.f30796me) | (i39 & bb.c.g.f32954lc), 18);
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                        }

                        @Override // yh.q
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(k1 k1Var, androidx.compose.runtime.p pVar2, Integer num) {
                            a(k1Var, pVar2, num.intValue());
                            return kotlin.b2.f124493a;
                        }
                    });
                    pVarF.N(objU2);
                } else {
                    objU2 = androidx.compose.runtime.internal.b.c(-1923353268, true, new yh.q<k1, androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.SliderKt$Slider$2$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(3);
                        }

                        @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                        @androidx.compose.runtime.h
                        public final void a(@dl.d k1 it, @dl.e androidx.compose.runtime.p pVar2, int i218) {
                            kotlin.jvm.internal.f0.p(it, "it");
                            if ((i218 & 81) == 16 && pVar2.b()) {
                                pVar2.l();
                                return;
                            }
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(-1923353268, i218, -1, "androidx.compose.material3.Slider.<anonymous>.<anonymous> (Slider.kt:176)");
                            }
                            SliderDefaults sliderDefaults = SliderDefaults.f10488a;
                            androidx.compose.foundation.interaction.g gVar13 = gVar2;
                            j1 j1Var13 = j1Var2;
                            boolean z113 = z12;
                            int i39 = i13;
                            sliderDefaults.a(gVar13, null, j1Var13, z113, 0L, pVar2, 196608 | ((i39 >> 24) & 14) | ((i39 >> 15) & bb.c.b.f30796me) | (i39 & bb.c.g.f32954lc), 18);
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                        }

                        @Override // yh.q
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(k1 k1Var, androidx.compose.runtime.p pVar2, Integer num) {
                            a(k1Var, pVar2, num.intValue());
                            return kotlin.b2.f124493a;
                        }
                    });
                    pVarF.N(objU2);
                }
                pVarF.c0();
                yh.q qVar10 = (yh.q) objU2;
                Boolean boolValueOf110 = Boolean.valueOf(z12);
                pVarF.T(511388516);
                zS2 = pVarF.s(boolValueOf110) | pVarF.s(j1Var2);
                objU3 = pVarF.U();
                if (zS2) {
                    objU3 = androidx.compose.runtime.internal.b.c(1022381539, true, new yh.q<k1, androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.SliderKt$Slider$3$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(3);
                        }

                        @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                        @androidx.compose.runtime.h
                        public final void a(@dl.d k1 sliderPositions, @dl.e androidx.compose.runtime.p pVar2, int i218) {
                            kotlin.jvm.internal.f0.p(sliderPositions, "sliderPositions");
                            if ((i218 & 14) == 0) {
                                i218 |= pVar2.s(sliderPositions) ? 4 : 2;
                            }
                            if ((i218 & 91) == 18 && pVar2.b()) {
                                pVar2.l();
                                return;
                            }
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(1022381539, i218, -1, "androidx.compose.material3.Slider.<anonymous>.<anonymous> (Slider.kt:183)");
                            }
                            SliderDefaults sliderDefaults = SliderDefaults.f10488a;
                            j1 j1Var13 = j1Var2;
                            boolean z113 = z12;
                            int i39 = i13;
                            sliderDefaults.b(sliderPositions, null, j1Var13, z113, pVar2, (i218 & 14) | 24576 | ((i39 >> 15) & bb.c.b.f30796me) | (i39 & bb.c.g.f32954lc), 2);
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                        }

                        @Override // yh.q
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(k1 k1Var, androidx.compose.runtime.p pVar2, Integer num) {
                            a(k1Var, pVar2, num.intValue());
                            return kotlin.b2.f124493a;
                        }
                    });
                    pVarF.N(objU3);
                } else {
                    objU3 = androidx.compose.runtime.internal.b.c(1022381539, true, new yh.q<k1, androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.SliderKt$Slider$3$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(3);
                        }

                        @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                        @androidx.compose.runtime.h
                        public final void a(@dl.d k1 sliderPositions, @dl.e androidx.compose.runtime.p pVar2, int i218) {
                            kotlin.jvm.internal.f0.p(sliderPositions, "sliderPositions");
                            if ((i218 & 14) == 0) {
                                i218 |= pVar2.s(sliderPositions) ? 4 : 2;
                            }
                            if ((i218 & 91) == 18 && pVar2.b()) {
                                pVar2.l();
                                return;
                            }
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(1022381539, i218, -1, "androidx.compose.material3.Slider.<anonymous>.<anonymous> (Slider.kt:183)");
                            }
                            SliderDefaults sliderDefaults = SliderDefaults.f10488a;
                            j1 j1Var13 = j1Var2;
                            boolean z113 = z12;
                            int i39 = i13;
                            sliderDefaults.b(sliderPositions, null, j1Var13, z113, pVar2, (i218 & 14) | 24576 | ((i39 >> 15) & bb.c.b.f30796me) | (i39 & bb.c.g.f32954lc), 2);
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                        }

                        @Override // yh.q
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(k1 k1Var, androidx.compose.runtime.p pVar2, Integer num) {
                            a(k1Var, pVar2, num.intValue());
                            return kotlin.b2.f124493a;
                        }
                    });
                    pVarF.N(objU3);
                }
                pVarF.c0();
                int i218 = (i13 & 14) | (i13 & 112);
                int i39 = i13 << 3;
                androidx.compose.foundation.interaction.g gVar13 = gVar2;
                j1 j1Var13 = j1Var2;
                boolean z113 = z12;
                e(f10, onValueChange, (yh.q) objU3, nVar3, z12, fVar3, i24, aVar4, j1Var2, gVar13, qVar10, pVarF, i218 | (i39 & bb.c.g.f32954lc) | (57344 & i39) | (458752 & i39) | (i39 & 3670016) | (i39 & 29360128) | (i39 & 234881024) | (i39 & 1879048192), 0, 0);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                nVar4 = nVar3;
                fVar4 = fVar3;
                i25 = i24;
                aVar5 = aVar4;
                gVar3 = gVar13;
                j1Var3 = j1Var13;
                z13 = z113;
            } else {
                pVarF.W();
                if ((i11 & 1) != 0) {
                    if (i26 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar2 = nVar;
                    }
                    if (i14 != 0) {
                        z11 = true;
                    } else {
                        z11 = z10;
                    }
                    if ((i12 & 16) != 0) {
                        fVarE = fi.t.e(0.0f, 1.0f);
                        i13 &= -57345;
                    } else {
                        fVarE = fVar2;
                    }
                    if (i16 != 0) {
                        i23 = 0;
                    } else {
                        i23 = i17;
                    }
                    if (i19 != 0) {
                        aVar3 = null;
                    } else {
                        aVar3 = aVar2;
                    }
                    if ((i12 & 128) != 0) {
                        j1VarC = SliderDefaults.f10488a.c(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, pVarF, 0, 6, 1023);
                        i13 &= -29360129;
                    }
                    if (i21 != 0) {
                        pVarF.T(-492369756);
                        objU = pVarF.U();
                        if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                            objU = androidx.compose.foundation.interaction.f.a();
                            pVarF.N(objU);
                        }
                        pVarF.c0();
                        nVar3 = nVar2;
                        z12 = z11;
                        fVar3 = fVarE;
                        j1Var2 = j1VarC;
                        i24 = i23;
                        aVar4 = aVar3;
                        gVar2 = (androidx.compose.foundation.interaction.g) objU;
                    } else {
                        nVar3 = nVar2;
                        z12 = z11;
                        fVar3 = fVarE;
                        j1Var2 = j1VarC;
                        i24 = i23;
                        aVar4 = aVar3;
                        gVar2 = gVar;
                    }
                } else {
                    if (i26 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar2 = nVar;
                    }
                    if (i14 != 0) {
                        z11 = true;
                    } else {
                        z11 = z10;
                    }
                    if ((i12 & 16) != 0) {
                        fVarE = fi.t.e(0.0f, 1.0f);
                        i13 &= -57345;
                    } else {
                        fVarE = fVar2;
                    }
                    if (i16 != 0) {
                        i23 = 0;
                    } else {
                        i23 = i17;
                    }
                    if (i19 != 0) {
                        aVar3 = null;
                    } else {
                        aVar3 = aVar2;
                    }
                    if ((i12 & 128) != 0) {
                        j1VarC = SliderDefaults.f10488a.c(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, pVarF, 0, 6, 1023);
                        i13 &= -29360129;
                    }
                    if (i21 != 0) {
                        pVarF.T(-492369756);
                        objU = pVarF.U();
                        if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                            objU = androidx.compose.foundation.interaction.f.a();
                            pVarF.N(objU);
                        }
                        pVarF.c0();
                        nVar3 = nVar2;
                        z12 = z11;
                        fVar3 = fVarE;
                        j1Var2 = j1VarC;
                        i24 = i23;
                        aVar4 = aVar3;
                        gVar2 = (androidx.compose.foundation.interaction.g) objU;
                    } else {
                        nVar3 = nVar2;
                        z12 = z11;
                        fVar3 = fVarE;
                        j1Var2 = j1VarC;
                        i24 = i23;
                        aVar4 = aVar3;
                        gVar2 = gVar;
                    }
                }
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(-202044027, i13, -1, "androidx.compose.material3.Slider (Slider.kt:154)");
                }
                Boolean boolValueOf111 = Boolean.valueOf(z12);
                pVarF.T(1618982084);
                zS = pVarF.s(boolValueOf111) | pVarF.s(gVar2) | pVarF.s(j1Var2);
                objU2 = pVarF.U();
                if (zS) {
                    objU2 = androidx.compose.runtime.internal.b.c(-1923353268, true, new yh.q<k1, androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.SliderKt$Slider$2$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(3);
                        }

                        @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                        @androidx.compose.runtime.h
                        public final void a(@dl.d k1 it, @dl.e androidx.compose.runtime.p pVar2, int i219) {
                            kotlin.jvm.internal.f0.p(it, "it");
                            if ((i219 & 81) == 16 && pVar2.b()) {
                                pVar2.l();
                                return;
                            }
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(-1923353268, i219, -1, "androidx.compose.material3.Slider.<anonymous>.<anonymous> (Slider.kt:176)");
                            }
                            SliderDefaults sliderDefaults = SliderDefaults.f10488a;
                            androidx.compose.foundation.interaction.g gVar14 = gVar2;
                            j1 j1Var14 = j1Var2;
                            boolean z114 = z12;
                            int i310 = i13;
                            sliderDefaults.a(gVar14, null, j1Var14, z114, 0L, pVar2, 196608 | ((i310 >> 24) & 14) | ((i310 >> 15) & bb.c.b.f30796me) | (i310 & bb.c.g.f32954lc), 18);
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                        }

                        @Override // yh.q
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(k1 k1Var, androidx.compose.runtime.p pVar2, Integer num) {
                            a(k1Var, pVar2, num.intValue());
                            return kotlin.b2.f124493a;
                        }
                    });
                    pVarF.N(objU2);
                } else {
                    objU2 = androidx.compose.runtime.internal.b.c(-1923353268, true, new yh.q<k1, androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.SliderKt$Slider$2$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(3);
                        }

                        @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                        @androidx.compose.runtime.h
                        public final void a(@dl.d k1 it, @dl.e androidx.compose.runtime.p pVar2, int i219) {
                            kotlin.jvm.internal.f0.p(it, "it");
                            if ((i219 & 81) == 16 && pVar2.b()) {
                                pVar2.l();
                                return;
                            }
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(-1923353268, i219, -1, "androidx.compose.material3.Slider.<anonymous>.<anonymous> (Slider.kt:176)");
                            }
                            SliderDefaults sliderDefaults = SliderDefaults.f10488a;
                            androidx.compose.foundation.interaction.g gVar14 = gVar2;
                            j1 j1Var14 = j1Var2;
                            boolean z114 = z12;
                            int i310 = i13;
                            sliderDefaults.a(gVar14, null, j1Var14, z114, 0L, pVar2, 196608 | ((i310 >> 24) & 14) | ((i310 >> 15) & bb.c.b.f30796me) | (i310 & bb.c.g.f32954lc), 18);
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                        }

                        @Override // yh.q
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(k1 k1Var, androidx.compose.runtime.p pVar2, Integer num) {
                            a(k1Var, pVar2, num.intValue());
                            return kotlin.b2.f124493a;
                        }
                    });
                    pVarF.N(objU2);
                }
                pVarF.c0();
                yh.q qVar11 = (yh.q) objU2;
                Boolean boolValueOf112 = Boolean.valueOf(z12);
                pVarF.T(511388516);
                zS2 = pVarF.s(boolValueOf112) | pVarF.s(j1Var2);
                objU3 = pVarF.U();
                if (zS2) {
                    objU3 = androidx.compose.runtime.internal.b.c(1022381539, true, new yh.q<k1, androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.SliderKt$Slider$3$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(3);
                        }

                        @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                        @androidx.compose.runtime.h
                        public final void a(@dl.d k1 sliderPositions, @dl.e androidx.compose.runtime.p pVar2, int i219) {
                            kotlin.jvm.internal.f0.p(sliderPositions, "sliderPositions");
                            if ((i219 & 14) == 0) {
                                i219 |= pVar2.s(sliderPositions) ? 4 : 2;
                            }
                            if ((i219 & 91) == 18 && pVar2.b()) {
                                pVar2.l();
                                return;
                            }
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(1022381539, i219, -1, "androidx.compose.material3.Slider.<anonymous>.<anonymous> (Slider.kt:183)");
                            }
                            SliderDefaults sliderDefaults = SliderDefaults.f10488a;
                            j1 j1Var14 = j1Var2;
                            boolean z114 = z12;
                            int i310 = i13;
                            sliderDefaults.b(sliderPositions, null, j1Var14, z114, pVar2, (i219 & 14) | 24576 | ((i310 >> 15) & bb.c.b.f30796me) | (i310 & bb.c.g.f32954lc), 2);
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                        }

                        @Override // yh.q
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(k1 k1Var, androidx.compose.runtime.p pVar2, Integer num) {
                            a(k1Var, pVar2, num.intValue());
                            return kotlin.b2.f124493a;
                        }
                    });
                    pVarF.N(objU3);
                } else {
                    objU3 = androidx.compose.runtime.internal.b.c(1022381539, true, new yh.q<k1, androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.SliderKt$Slider$3$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(3);
                        }

                        @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                        @androidx.compose.runtime.h
                        public final void a(@dl.d k1 sliderPositions, @dl.e androidx.compose.runtime.p pVar2, int i219) {
                            kotlin.jvm.internal.f0.p(sliderPositions, "sliderPositions");
                            if ((i219 & 14) == 0) {
                                i219 |= pVar2.s(sliderPositions) ? 4 : 2;
                            }
                            if ((i219 & 91) == 18 && pVar2.b()) {
                                pVar2.l();
                                return;
                            }
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(1022381539, i219, -1, "androidx.compose.material3.Slider.<anonymous>.<anonymous> (Slider.kt:183)");
                            }
                            SliderDefaults sliderDefaults = SliderDefaults.f10488a;
                            j1 j1Var14 = j1Var2;
                            boolean z114 = z12;
                            int i310 = i13;
                            sliderDefaults.b(sliderPositions, null, j1Var14, z114, pVar2, (i219 & 14) | 24576 | ((i310 >> 15) & bb.c.b.f30796me) | (i310 & bb.c.g.f32954lc), 2);
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                        }

                        @Override // yh.q
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(k1 k1Var, androidx.compose.runtime.p pVar2, Integer num) {
                            a(k1Var, pVar2, num.intValue());
                            return kotlin.b2.f124493a;
                        }
                    });
                    pVarF.N(objU3);
                }
                pVarF.c0();
                int i219 = (i13 & 14) | (i13 & 112);
                int i310 = i13 << 3;
                androidx.compose.foundation.interaction.g gVar14 = gVar2;
                j1 j1Var14 = j1Var2;
                boolean z114 = z12;
                e(f10, onValueChange, (yh.q) objU3, nVar3, z12, fVar3, i24, aVar4, j1Var2, gVar14, qVar11, pVarF, i219 | (i310 & bb.c.g.f32954lc) | (57344 & i310) | (458752 & i310) | (i310 & 3670016) | (i310 & 29360128) | (i310 & 234881024) | (i310 & 1879048192), 0, 0);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                nVar4 = nVar3;
                fVar4 = fVar3;
                i25 = i24;
                aVar5 = aVar4;
                gVar3 = gVar14;
                j1Var3 = j1Var14;
                z13 = z114;
            }
            u1VarH = pVarF.H();
            if (u1VarH == null) {
                return;
            }
            u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.SliderKt$Slider$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void a(@dl.e androidx.compose.runtime.p pVar2, int i311) {
                    SliderKt.c(f10, onValueChange, nVar4, z13, fVar4, i25, aVar5, j1Var3, gVar3, pVar2, i11 | 1, i12);
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                    a(pVar2, num.intValue());
                    return kotlin.b2.f124493a;
                }
            });
        }
        i13 |= bb.c.d.f31193dj;
        if ((i11 & 57344) == 0) {
            if ((i12 & 16) == 0) {
                fVar2 = fVar;
                if (pVarF.s(fVar2)) {
                }
                i13 |= i27;
            } else {
                fVar2 = fVar;
            }
            i13 |= i27;
        } else {
            fVar2 = fVar;
        }
        i16 = i12 & 32;
        if (i16 != 0) {
            if ((i11 & 458752) == 0) {
                i17 = i10;
                if (pVarF.y(i17)) {
                    i18 = 131072;
                } else {
                    i18 = 65536;
                }
                i13 |= i18;
            }
            i19 = i12 & 64;
            if (i19 != 0) {
                i13 |= 1572864;
                aVar2 = aVar;
            } else {
                aVar2 = aVar;
                if ((i11 & 3670016) == 0) {
                    if (pVarF.s(aVar2)) {
                        i20 = 1048576;
                    } else {
                        i20 = 524288;
                    }
                    i13 |= i20;
                }
            }
            if ((i11 & 29360128) == 0) {
                if ((i12 & 128) == 0) {
                    j1VarC = j1Var;
                    if (pVarF.s(j1VarC)) {
                    }
                    i13 |= i28;
                } else {
                    j1VarC = j1Var;
                }
                i13 |= i28;
            } else {
                j1VarC = j1Var;
            }
            i21 = i12 & 256;
            if (i21 != 0) {
                i13 |= 100663296;
            } else if ((i11 & 234881024) == 0) {
                if (pVarF.s(gVar)) {
                    i22 = 67108864;
                } else {
                    i22 = 33554432;
                }
                i13 |= i22;
            }
            if ((i13 & 191739611) == 38347922) {
                pVarF.W();
                if ((i11 & 1) != 0) {
                    if (i26 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar2 = nVar;
                    }
                    if (i14 != 0) {
                        z11 = true;
                    } else {
                        z11 = z10;
                    }
                    if ((i12 & 16) != 0) {
                        fVarE = fi.t.e(0.0f, 1.0f);
                        i13 &= -57345;
                    } else {
                        fVarE = fVar2;
                    }
                    if (i16 != 0) {
                        i23 = 0;
                    } else {
                        i23 = i17;
                    }
                    if (i19 != 0) {
                        aVar3 = null;
                    } else {
                        aVar3 = aVar2;
                    }
                    if ((i12 & 128) != 0) {
                        j1VarC = SliderDefaults.f10488a.c(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, pVarF, 0, 6, 1023);
                        i13 &= -29360129;
                    }
                    if (i21 != 0) {
                        pVarF.T(-492369756);
                        objU = pVarF.U();
                        if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                            objU = androidx.compose.foundation.interaction.f.a();
                            pVarF.N(objU);
                        }
                        pVarF.c0();
                        nVar3 = nVar2;
                        z12 = z11;
                        fVar3 = fVarE;
                        j1Var2 = j1VarC;
                        i24 = i23;
                        aVar4 = aVar3;
                        gVar2 = (androidx.compose.foundation.interaction.g) objU;
                    } else {
                        nVar3 = nVar2;
                        z12 = z11;
                        fVar3 = fVarE;
                        j1Var2 = j1VarC;
                        i24 = i23;
                        aVar4 = aVar3;
                        gVar2 = gVar;
                    }
                } else {
                    if (i26 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar2 = nVar;
                    }
                    if (i14 != 0) {
                        z11 = true;
                    } else {
                        z11 = z10;
                    }
                    if ((i12 & 16) != 0) {
                        fVarE = fi.t.e(0.0f, 1.0f);
                        i13 &= -57345;
                    } else {
                        fVarE = fVar2;
                    }
                    if (i16 != 0) {
                        i23 = 0;
                    } else {
                        i23 = i17;
                    }
                    if (i19 != 0) {
                        aVar3 = null;
                    } else {
                        aVar3 = aVar2;
                    }
                    if ((i12 & 128) != 0) {
                        j1VarC = SliderDefaults.f10488a.c(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, pVarF, 0, 6, 1023);
                        i13 &= -29360129;
                    }
                    if (i21 != 0) {
                        pVarF.T(-492369756);
                        objU = pVarF.U();
                        if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                            objU = androidx.compose.foundation.interaction.f.a();
                            pVarF.N(objU);
                        }
                        pVarF.c0();
                        nVar3 = nVar2;
                        z12 = z11;
                        fVar3 = fVarE;
                        j1Var2 = j1VarC;
                        i24 = i23;
                        aVar4 = aVar3;
                        gVar2 = (androidx.compose.foundation.interaction.g) objU;
                    } else {
                        nVar3 = nVar2;
                        z12 = z11;
                        fVar3 = fVarE;
                        j1Var2 = j1VarC;
                        i24 = i23;
                        aVar4 = aVar3;
                        gVar2 = gVar;
                    }
                }
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(-202044027, i13, -1, "androidx.compose.material3.Slider (Slider.kt:154)");
                }
                Boolean boolValueOf113 = Boolean.valueOf(z12);
                pVarF.T(1618982084);
                zS = pVarF.s(boolValueOf113) | pVarF.s(gVar2) | pVarF.s(j1Var2);
                objU2 = pVarF.U();
                if (zS) {
                    objU2 = androidx.compose.runtime.internal.b.c(-1923353268, true, new yh.q<k1, androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.SliderKt$Slider$2$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(3);
                        }

                        @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                        @androidx.compose.runtime.h
                        public final void a(@dl.d k1 it, @dl.e androidx.compose.runtime.p pVar2, int i2110) {
                            kotlin.jvm.internal.f0.p(it, "it");
                            if ((i2110 & 81) == 16 && pVar2.b()) {
                                pVar2.l();
                                return;
                            }
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(-1923353268, i2110, -1, "androidx.compose.material3.Slider.<anonymous>.<anonymous> (Slider.kt:176)");
                            }
                            SliderDefaults sliderDefaults = SliderDefaults.f10488a;
                            androidx.compose.foundation.interaction.g gVar15 = gVar2;
                            j1 j1Var15 = j1Var2;
                            boolean z115 = z12;
                            int i311 = i13;
                            sliderDefaults.a(gVar15, null, j1Var15, z115, 0L, pVar2, 196608 | ((i311 >> 24) & 14) | ((i311 >> 15) & bb.c.b.f30796me) | (i311 & bb.c.g.f32954lc), 18);
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                        }

                        @Override // yh.q
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(k1 k1Var, androidx.compose.runtime.p pVar2, Integer num) {
                            a(k1Var, pVar2, num.intValue());
                            return kotlin.b2.f124493a;
                        }
                    });
                    pVarF.N(objU2);
                } else {
                    objU2 = androidx.compose.runtime.internal.b.c(-1923353268, true, new yh.q<k1, androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.SliderKt$Slider$2$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(3);
                        }

                        @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                        @androidx.compose.runtime.h
                        public final void a(@dl.d k1 it, @dl.e androidx.compose.runtime.p pVar2, int i2110) {
                            kotlin.jvm.internal.f0.p(it, "it");
                            if ((i2110 & 81) == 16 && pVar2.b()) {
                                pVar2.l();
                                return;
                            }
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(-1923353268, i2110, -1, "androidx.compose.material3.Slider.<anonymous>.<anonymous> (Slider.kt:176)");
                            }
                            SliderDefaults sliderDefaults = SliderDefaults.f10488a;
                            androidx.compose.foundation.interaction.g gVar15 = gVar2;
                            j1 j1Var15 = j1Var2;
                            boolean z115 = z12;
                            int i311 = i13;
                            sliderDefaults.a(gVar15, null, j1Var15, z115, 0L, pVar2, 196608 | ((i311 >> 24) & 14) | ((i311 >> 15) & bb.c.b.f30796me) | (i311 & bb.c.g.f32954lc), 18);
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                        }

                        @Override // yh.q
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(k1 k1Var, androidx.compose.runtime.p pVar2, Integer num) {
                            a(k1Var, pVar2, num.intValue());
                            return kotlin.b2.f124493a;
                        }
                    });
                    pVarF.N(objU2);
                }
                pVarF.c0();
                yh.q qVar12 = (yh.q) objU2;
                Boolean boolValueOf114 = Boolean.valueOf(z12);
                pVarF.T(511388516);
                zS2 = pVarF.s(boolValueOf114) | pVarF.s(j1Var2);
                objU3 = pVarF.U();
                if (zS2) {
                    objU3 = androidx.compose.runtime.internal.b.c(1022381539, true, new yh.q<k1, androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.SliderKt$Slider$3$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(3);
                        }

                        @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                        @androidx.compose.runtime.h
                        public final void a(@dl.d k1 sliderPositions, @dl.e androidx.compose.runtime.p pVar2, int i2110) {
                            kotlin.jvm.internal.f0.p(sliderPositions, "sliderPositions");
                            if ((i2110 & 14) == 0) {
                                i2110 |= pVar2.s(sliderPositions) ? 4 : 2;
                            }
                            if ((i2110 & 91) == 18 && pVar2.b()) {
                                pVar2.l();
                                return;
                            }
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(1022381539, i2110, -1, "androidx.compose.material3.Slider.<anonymous>.<anonymous> (Slider.kt:183)");
                            }
                            SliderDefaults sliderDefaults = SliderDefaults.f10488a;
                            j1 j1Var15 = j1Var2;
                            boolean z115 = z12;
                            int i311 = i13;
                            sliderDefaults.b(sliderPositions, null, j1Var15, z115, pVar2, (i2110 & 14) | 24576 | ((i311 >> 15) & bb.c.b.f30796me) | (i311 & bb.c.g.f32954lc), 2);
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                        }

                        @Override // yh.q
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(k1 k1Var, androidx.compose.runtime.p pVar2, Integer num) {
                            a(k1Var, pVar2, num.intValue());
                            return kotlin.b2.f124493a;
                        }
                    });
                    pVarF.N(objU3);
                } else {
                    objU3 = androidx.compose.runtime.internal.b.c(1022381539, true, new yh.q<k1, androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.SliderKt$Slider$3$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(3);
                        }

                        @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                        @androidx.compose.runtime.h
                        public final void a(@dl.d k1 sliderPositions, @dl.e androidx.compose.runtime.p pVar2, int i2110) {
                            kotlin.jvm.internal.f0.p(sliderPositions, "sliderPositions");
                            if ((i2110 & 14) == 0) {
                                i2110 |= pVar2.s(sliderPositions) ? 4 : 2;
                            }
                            if ((i2110 & 91) == 18 && pVar2.b()) {
                                pVar2.l();
                                return;
                            }
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(1022381539, i2110, -1, "androidx.compose.material3.Slider.<anonymous>.<anonymous> (Slider.kt:183)");
                            }
                            SliderDefaults sliderDefaults = SliderDefaults.f10488a;
                            j1 j1Var15 = j1Var2;
                            boolean z115 = z12;
                            int i311 = i13;
                            sliderDefaults.b(sliderPositions, null, j1Var15, z115, pVar2, (i2110 & 14) | 24576 | ((i311 >> 15) & bb.c.b.f30796me) | (i311 & bb.c.g.f32954lc), 2);
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                        }

                        @Override // yh.q
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(k1 k1Var, androidx.compose.runtime.p pVar2, Integer num) {
                            a(k1Var, pVar2, num.intValue());
                            return kotlin.b2.f124493a;
                        }
                    });
                    pVarF.N(objU3);
                }
                pVarF.c0();
                int i2110 = (i13 & 14) | (i13 & 112);
                int i311 = i13 << 3;
                androidx.compose.foundation.interaction.g gVar15 = gVar2;
                j1 j1Var15 = j1Var2;
                boolean z115 = z12;
                e(f10, onValueChange, (yh.q) objU3, nVar3, z12, fVar3, i24, aVar4, j1Var2, gVar15, qVar12, pVarF, i2110 | (i311 & bb.c.g.f32954lc) | (57344 & i311) | (458752 & i311) | (i311 & 3670016) | (i311 & 29360128) | (i311 & 234881024) | (i311 & 1879048192), 0, 0);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                nVar4 = nVar3;
                fVar4 = fVar3;
                i25 = i24;
                aVar5 = aVar4;
                gVar3 = gVar15;
                j1Var3 = j1Var15;
                z13 = z115;
            } else {
                pVarF.W();
                if ((i11 & 1) != 0) {
                    if (i26 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar2 = nVar;
                    }
                    if (i14 != 0) {
                        z11 = true;
                    } else {
                        z11 = z10;
                    }
                    if ((i12 & 16) != 0) {
                        fVarE = fi.t.e(0.0f, 1.0f);
                        i13 &= -57345;
                    } else {
                        fVarE = fVar2;
                    }
                    if (i16 != 0) {
                        i23 = 0;
                    } else {
                        i23 = i17;
                    }
                    if (i19 != 0) {
                        aVar3 = null;
                    } else {
                        aVar3 = aVar2;
                    }
                    if ((i12 & 128) != 0) {
                        j1VarC = SliderDefaults.f10488a.c(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, pVarF, 0, 6, 1023);
                        i13 &= -29360129;
                    }
                    if (i21 != 0) {
                        pVarF.T(-492369756);
                        objU = pVarF.U();
                        if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                            objU = androidx.compose.foundation.interaction.f.a();
                            pVarF.N(objU);
                        }
                        pVarF.c0();
                        nVar3 = nVar2;
                        z12 = z11;
                        fVar3 = fVarE;
                        j1Var2 = j1VarC;
                        i24 = i23;
                        aVar4 = aVar3;
                        gVar2 = (androidx.compose.foundation.interaction.g) objU;
                    } else {
                        nVar3 = nVar2;
                        z12 = z11;
                        fVar3 = fVarE;
                        j1Var2 = j1VarC;
                        i24 = i23;
                        aVar4 = aVar3;
                        gVar2 = gVar;
                    }
                } else {
                    if (i26 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar2 = nVar;
                    }
                    if (i14 != 0) {
                        z11 = true;
                    } else {
                        z11 = z10;
                    }
                    if ((i12 & 16) != 0) {
                        fVarE = fi.t.e(0.0f, 1.0f);
                        i13 &= -57345;
                    } else {
                        fVarE = fVar2;
                    }
                    if (i16 != 0) {
                        i23 = 0;
                    } else {
                        i23 = i17;
                    }
                    if (i19 != 0) {
                        aVar3 = null;
                    } else {
                        aVar3 = aVar2;
                    }
                    if ((i12 & 128) != 0) {
                        j1VarC = SliderDefaults.f10488a.c(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, pVarF, 0, 6, 1023);
                        i13 &= -29360129;
                    }
                    if (i21 != 0) {
                        pVarF.T(-492369756);
                        objU = pVarF.U();
                        if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                            objU = androidx.compose.foundation.interaction.f.a();
                            pVarF.N(objU);
                        }
                        pVarF.c0();
                        nVar3 = nVar2;
                        z12 = z11;
                        fVar3 = fVarE;
                        j1Var2 = j1VarC;
                        i24 = i23;
                        aVar4 = aVar3;
                        gVar2 = (androidx.compose.foundation.interaction.g) objU;
                    } else {
                        nVar3 = nVar2;
                        z12 = z11;
                        fVar3 = fVarE;
                        j1Var2 = j1VarC;
                        i24 = i23;
                        aVar4 = aVar3;
                        gVar2 = gVar;
                    }
                }
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(-202044027, i13, -1, "androidx.compose.material3.Slider (Slider.kt:154)");
                }
                Boolean boolValueOf115 = Boolean.valueOf(z12);
                pVarF.T(1618982084);
                zS = pVarF.s(boolValueOf115) | pVarF.s(gVar2) | pVarF.s(j1Var2);
                objU2 = pVarF.U();
                if (zS) {
                    objU2 = androidx.compose.runtime.internal.b.c(-1923353268, true, new yh.q<k1, androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.SliderKt$Slider$2$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(3);
                        }

                        @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                        @androidx.compose.runtime.h
                        public final void a(@dl.d k1 it, @dl.e androidx.compose.runtime.p pVar2, int i2111) {
                            kotlin.jvm.internal.f0.p(it, "it");
                            if ((i2111 & 81) == 16 && pVar2.b()) {
                                pVar2.l();
                                return;
                            }
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(-1923353268, i2111, -1, "androidx.compose.material3.Slider.<anonymous>.<anonymous> (Slider.kt:176)");
                            }
                            SliderDefaults sliderDefaults = SliderDefaults.f10488a;
                            androidx.compose.foundation.interaction.g gVar16 = gVar2;
                            j1 j1Var16 = j1Var2;
                            boolean z116 = z12;
                            int i312 = i13;
                            sliderDefaults.a(gVar16, null, j1Var16, z116, 0L, pVar2, 196608 | ((i312 >> 24) & 14) | ((i312 >> 15) & bb.c.b.f30796me) | (i312 & bb.c.g.f32954lc), 18);
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                        }

                        @Override // yh.q
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(k1 k1Var, androidx.compose.runtime.p pVar2, Integer num) {
                            a(k1Var, pVar2, num.intValue());
                            return kotlin.b2.f124493a;
                        }
                    });
                    pVarF.N(objU2);
                } else {
                    objU2 = androidx.compose.runtime.internal.b.c(-1923353268, true, new yh.q<k1, androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.SliderKt$Slider$2$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(3);
                        }

                        @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                        @androidx.compose.runtime.h
                        public final void a(@dl.d k1 it, @dl.e androidx.compose.runtime.p pVar2, int i2111) {
                            kotlin.jvm.internal.f0.p(it, "it");
                            if ((i2111 & 81) == 16 && pVar2.b()) {
                                pVar2.l();
                                return;
                            }
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(-1923353268, i2111, -1, "androidx.compose.material3.Slider.<anonymous>.<anonymous> (Slider.kt:176)");
                            }
                            SliderDefaults sliderDefaults = SliderDefaults.f10488a;
                            androidx.compose.foundation.interaction.g gVar16 = gVar2;
                            j1 j1Var16 = j1Var2;
                            boolean z116 = z12;
                            int i312 = i13;
                            sliderDefaults.a(gVar16, null, j1Var16, z116, 0L, pVar2, 196608 | ((i312 >> 24) & 14) | ((i312 >> 15) & bb.c.b.f30796me) | (i312 & bb.c.g.f32954lc), 18);
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                        }

                        @Override // yh.q
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(k1 k1Var, androidx.compose.runtime.p pVar2, Integer num) {
                            a(k1Var, pVar2, num.intValue());
                            return kotlin.b2.f124493a;
                        }
                    });
                    pVarF.N(objU2);
                }
                pVarF.c0();
                yh.q qVar13 = (yh.q) objU2;
                Boolean boolValueOf116 = Boolean.valueOf(z12);
                pVarF.T(511388516);
                zS2 = pVarF.s(boolValueOf116) | pVarF.s(j1Var2);
                objU3 = pVarF.U();
                if (zS2) {
                    objU3 = androidx.compose.runtime.internal.b.c(1022381539, true, new yh.q<k1, androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.SliderKt$Slider$3$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(3);
                        }

                        @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                        @androidx.compose.runtime.h
                        public final void a(@dl.d k1 sliderPositions, @dl.e androidx.compose.runtime.p pVar2, int i2111) {
                            kotlin.jvm.internal.f0.p(sliderPositions, "sliderPositions");
                            if ((i2111 & 14) == 0) {
                                i2111 |= pVar2.s(sliderPositions) ? 4 : 2;
                            }
                            if ((i2111 & 91) == 18 && pVar2.b()) {
                                pVar2.l();
                                return;
                            }
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(1022381539, i2111, -1, "androidx.compose.material3.Slider.<anonymous>.<anonymous> (Slider.kt:183)");
                            }
                            SliderDefaults sliderDefaults = SliderDefaults.f10488a;
                            j1 j1Var16 = j1Var2;
                            boolean z116 = z12;
                            int i312 = i13;
                            sliderDefaults.b(sliderPositions, null, j1Var16, z116, pVar2, (i2111 & 14) | 24576 | ((i312 >> 15) & bb.c.b.f30796me) | (i312 & bb.c.g.f32954lc), 2);
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                        }

                        @Override // yh.q
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(k1 k1Var, androidx.compose.runtime.p pVar2, Integer num) {
                            a(k1Var, pVar2, num.intValue());
                            return kotlin.b2.f124493a;
                        }
                    });
                    pVarF.N(objU3);
                } else {
                    objU3 = androidx.compose.runtime.internal.b.c(1022381539, true, new yh.q<k1, androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.SliderKt$Slider$3$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(3);
                        }

                        @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                        @androidx.compose.runtime.h
                        public final void a(@dl.d k1 sliderPositions, @dl.e androidx.compose.runtime.p pVar2, int i2111) {
                            kotlin.jvm.internal.f0.p(sliderPositions, "sliderPositions");
                            if ((i2111 & 14) == 0) {
                                i2111 |= pVar2.s(sliderPositions) ? 4 : 2;
                            }
                            if ((i2111 & 91) == 18 && pVar2.b()) {
                                pVar2.l();
                                return;
                            }
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(1022381539, i2111, -1, "androidx.compose.material3.Slider.<anonymous>.<anonymous> (Slider.kt:183)");
                            }
                            SliderDefaults sliderDefaults = SliderDefaults.f10488a;
                            j1 j1Var16 = j1Var2;
                            boolean z116 = z12;
                            int i312 = i13;
                            sliderDefaults.b(sliderPositions, null, j1Var16, z116, pVar2, (i2111 & 14) | 24576 | ((i312 >> 15) & bb.c.b.f30796me) | (i312 & bb.c.g.f32954lc), 2);
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                        }

                        @Override // yh.q
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(k1 k1Var, androidx.compose.runtime.p pVar2, Integer num) {
                            a(k1Var, pVar2, num.intValue());
                            return kotlin.b2.f124493a;
                        }
                    });
                    pVarF.N(objU3);
                }
                pVarF.c0();
                int i2111 = (i13 & 14) | (i13 & 112);
                int i312 = i13 << 3;
                androidx.compose.foundation.interaction.g gVar16 = gVar2;
                j1 j1Var16 = j1Var2;
                boolean z116 = z12;
                e(f10, onValueChange, (yh.q) objU3, nVar3, z12, fVar3, i24, aVar4, j1Var2, gVar16, qVar13, pVarF, i2111 | (i312 & bb.c.g.f32954lc) | (57344 & i312) | (458752 & i312) | (i312 & 3670016) | (i312 & 29360128) | (i312 & 234881024) | (i312 & 1879048192), 0, 0);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                nVar4 = nVar3;
                fVar4 = fVar3;
                i25 = i24;
                aVar5 = aVar4;
                gVar3 = gVar16;
                j1Var3 = j1Var16;
                z13 = z116;
            }
            u1VarH = pVarF.H();
            if (u1VarH == null) {
                return;
            }
            u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.SliderKt$Slider$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void a(@dl.e androidx.compose.runtime.p pVar2, int i313) {
                    SliderKt.c(f10, onValueChange, nVar4, z13, fVar4, i25, aVar5, j1Var3, gVar3, pVar2, i11 | 1, i12);
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                    a(pVar2, num.intValue());
                    return kotlin.b2.f124493a;
                }
            });
        }
        i13 |= androidx.profileinstaller.o.c.f26824k;
        i17 = i10;
        i19 = i12 & 64;
        if (i19 != 0) {
            i13 |= 1572864;
            aVar2 = aVar;
        } else {
            aVar2 = aVar;
            if ((i11 & 3670016) == 0) {
                if (pVarF.s(aVar2)) {
                    i20 = 1048576;
                } else {
                    i20 = 524288;
                }
                i13 |= i20;
            }
        }
        if ((i11 & 29360128) == 0) {
            if ((i12 & 128) == 0) {
                j1VarC = j1Var;
                if (pVarF.s(j1VarC)) {
                }
                i13 |= i28;
            } else {
                j1VarC = j1Var;
            }
            i13 |= i28;
        } else {
            j1VarC = j1Var;
        }
        i21 = i12 & 256;
        if (i21 != 0) {
            i13 |= 100663296;
        } else if ((i11 & 234881024) == 0) {
            if (pVarF.s(gVar)) {
                i22 = 67108864;
            } else {
                i22 = 33554432;
            }
            i13 |= i22;
        }
        if ((i13 & 191739611) == 38347922) {
            pVarF.W();
            if ((i11 & 1) != 0) {
                if (i26 != 0) {
                    nVar2 = androidx.compose.ui.n.INSTANCE;
                } else {
                    nVar2 = nVar;
                }
                if (i14 != 0) {
                    z11 = true;
                } else {
                    z11 = z10;
                }
                if ((i12 & 16) != 0) {
                    fVarE = fi.t.e(0.0f, 1.0f);
                    i13 &= -57345;
                } else {
                    fVarE = fVar2;
                }
                if (i16 != 0) {
                    i23 = 0;
                } else {
                    i23 = i17;
                }
                if (i19 != 0) {
                    aVar3 = null;
                } else {
                    aVar3 = aVar2;
                }
                if ((i12 & 128) != 0) {
                    j1VarC = SliderDefaults.f10488a.c(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, pVarF, 0, 6, 1023);
                    i13 &= -29360129;
                }
                if (i21 != 0) {
                    pVarF.T(-492369756);
                    objU = pVarF.U();
                    if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                        objU = androidx.compose.foundation.interaction.f.a();
                        pVarF.N(objU);
                    }
                    pVarF.c0();
                    nVar3 = nVar2;
                    z12 = z11;
                    fVar3 = fVarE;
                    j1Var2 = j1VarC;
                    i24 = i23;
                    aVar4 = aVar3;
                    gVar2 = (androidx.compose.foundation.interaction.g) objU;
                } else {
                    nVar3 = nVar2;
                    z12 = z11;
                    fVar3 = fVarE;
                    j1Var2 = j1VarC;
                    i24 = i23;
                    aVar4 = aVar3;
                    gVar2 = gVar;
                }
            } else {
                if (i26 != 0) {
                    nVar2 = androidx.compose.ui.n.INSTANCE;
                } else {
                    nVar2 = nVar;
                }
                if (i14 != 0) {
                    z11 = true;
                } else {
                    z11 = z10;
                }
                if ((i12 & 16) != 0) {
                    fVarE = fi.t.e(0.0f, 1.0f);
                    i13 &= -57345;
                } else {
                    fVarE = fVar2;
                }
                if (i16 != 0) {
                    i23 = 0;
                } else {
                    i23 = i17;
                }
                if (i19 != 0) {
                    aVar3 = null;
                } else {
                    aVar3 = aVar2;
                }
                if ((i12 & 128) != 0) {
                    j1VarC = SliderDefaults.f10488a.c(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, pVarF, 0, 6, 1023);
                    i13 &= -29360129;
                }
                if (i21 != 0) {
                    pVarF.T(-492369756);
                    objU = pVarF.U();
                    if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                        objU = androidx.compose.foundation.interaction.f.a();
                        pVarF.N(objU);
                    }
                    pVarF.c0();
                    nVar3 = nVar2;
                    z12 = z11;
                    fVar3 = fVarE;
                    j1Var2 = j1VarC;
                    i24 = i23;
                    aVar4 = aVar3;
                    gVar2 = (androidx.compose.foundation.interaction.g) objU;
                } else {
                    nVar3 = nVar2;
                    z12 = z11;
                    fVar3 = fVarE;
                    j1Var2 = j1VarC;
                    i24 = i23;
                    aVar4 = aVar3;
                    gVar2 = gVar;
                }
            }
            pVarF.O();
            if (ComposerKt.g0()) {
                ComposerKt.w0(-202044027, i13, -1, "androidx.compose.material3.Slider (Slider.kt:154)");
            }
            Boolean boolValueOf117 = Boolean.valueOf(z12);
            pVarF.T(1618982084);
            zS = pVarF.s(boolValueOf117) | pVarF.s(gVar2) | pVarF.s(j1Var2);
            objU2 = pVarF.U();
            if (zS) {
                objU2 = androidx.compose.runtime.internal.b.c(-1923353268, true, new yh.q<k1, androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.SliderKt$Slider$2$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(3);
                    }

                    @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                    @androidx.compose.runtime.h
                    public final void a(@dl.d k1 it, @dl.e androidx.compose.runtime.p pVar2, int i2112) {
                        kotlin.jvm.internal.f0.p(it, "it");
                        if ((i2112 & 81) == 16 && pVar2.b()) {
                            pVar2.l();
                            return;
                        }
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(-1923353268, i2112, -1, "androidx.compose.material3.Slider.<anonymous>.<anonymous> (Slider.kt:176)");
                        }
                        SliderDefaults sliderDefaults = SliderDefaults.f10488a;
                        androidx.compose.foundation.interaction.g gVar17 = gVar2;
                        j1 j1Var17 = j1Var2;
                        boolean z117 = z12;
                        int i313 = i13;
                        sliderDefaults.a(gVar17, null, j1Var17, z117, 0L, pVar2, 196608 | ((i313 >> 24) & 14) | ((i313 >> 15) & bb.c.b.f30796me) | (i313 & bb.c.g.f32954lc), 18);
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                    }

                    @Override // yh.q
                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(k1 k1Var, androidx.compose.runtime.p pVar2, Integer num) {
                        a(k1Var, pVar2, num.intValue());
                        return kotlin.b2.f124493a;
                    }
                });
                pVarF.N(objU2);
            } else {
                objU2 = androidx.compose.runtime.internal.b.c(-1923353268, true, new yh.q<k1, androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.SliderKt$Slider$2$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(3);
                    }

                    @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                    @androidx.compose.runtime.h
                    public final void a(@dl.d k1 it, @dl.e androidx.compose.runtime.p pVar2, int i2112) {
                        kotlin.jvm.internal.f0.p(it, "it");
                        if ((i2112 & 81) == 16 && pVar2.b()) {
                            pVar2.l();
                            return;
                        }
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(-1923353268, i2112, -1, "androidx.compose.material3.Slider.<anonymous>.<anonymous> (Slider.kt:176)");
                        }
                        SliderDefaults sliderDefaults = SliderDefaults.f10488a;
                        androidx.compose.foundation.interaction.g gVar17 = gVar2;
                        j1 j1Var17 = j1Var2;
                        boolean z117 = z12;
                        int i313 = i13;
                        sliderDefaults.a(gVar17, null, j1Var17, z117, 0L, pVar2, 196608 | ((i313 >> 24) & 14) | ((i313 >> 15) & bb.c.b.f30796me) | (i313 & bb.c.g.f32954lc), 18);
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                    }

                    @Override // yh.q
                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(k1 k1Var, androidx.compose.runtime.p pVar2, Integer num) {
                        a(k1Var, pVar2, num.intValue());
                        return kotlin.b2.f124493a;
                    }
                });
                pVarF.N(objU2);
            }
            pVarF.c0();
            yh.q qVar14 = (yh.q) objU2;
            Boolean boolValueOf118 = Boolean.valueOf(z12);
            pVarF.T(511388516);
            zS2 = pVarF.s(boolValueOf118) | pVarF.s(j1Var2);
            objU3 = pVarF.U();
            if (zS2) {
                objU3 = androidx.compose.runtime.internal.b.c(1022381539, true, new yh.q<k1, androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.SliderKt$Slider$3$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(3);
                    }

                    @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                    @androidx.compose.runtime.h
                    public final void a(@dl.d k1 sliderPositions, @dl.e androidx.compose.runtime.p pVar2, int i2112) {
                        kotlin.jvm.internal.f0.p(sliderPositions, "sliderPositions");
                        if ((i2112 & 14) == 0) {
                            i2112 |= pVar2.s(sliderPositions) ? 4 : 2;
                        }
                        if ((i2112 & 91) == 18 && pVar2.b()) {
                            pVar2.l();
                            return;
                        }
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(1022381539, i2112, -1, "androidx.compose.material3.Slider.<anonymous>.<anonymous> (Slider.kt:183)");
                        }
                        SliderDefaults sliderDefaults = SliderDefaults.f10488a;
                        j1 j1Var17 = j1Var2;
                        boolean z117 = z12;
                        int i313 = i13;
                        sliderDefaults.b(sliderPositions, null, j1Var17, z117, pVar2, (i2112 & 14) | 24576 | ((i313 >> 15) & bb.c.b.f30796me) | (i313 & bb.c.g.f32954lc), 2);
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                    }

                    @Override // yh.q
                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(k1 k1Var, androidx.compose.runtime.p pVar2, Integer num) {
                        a(k1Var, pVar2, num.intValue());
                        return kotlin.b2.f124493a;
                    }
                });
                pVarF.N(objU3);
            } else {
                objU3 = androidx.compose.runtime.internal.b.c(1022381539, true, new yh.q<k1, androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.SliderKt$Slider$3$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(3);
                    }

                    @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                    @androidx.compose.runtime.h
                    public final void a(@dl.d k1 sliderPositions, @dl.e androidx.compose.runtime.p pVar2, int i2112) {
                        kotlin.jvm.internal.f0.p(sliderPositions, "sliderPositions");
                        if ((i2112 & 14) == 0) {
                            i2112 |= pVar2.s(sliderPositions) ? 4 : 2;
                        }
                        if ((i2112 & 91) == 18 && pVar2.b()) {
                            pVar2.l();
                            return;
                        }
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(1022381539, i2112, -1, "androidx.compose.material3.Slider.<anonymous>.<anonymous> (Slider.kt:183)");
                        }
                        SliderDefaults sliderDefaults = SliderDefaults.f10488a;
                        j1 j1Var17 = j1Var2;
                        boolean z117 = z12;
                        int i313 = i13;
                        sliderDefaults.b(sliderPositions, null, j1Var17, z117, pVar2, (i2112 & 14) | 24576 | ((i313 >> 15) & bb.c.b.f30796me) | (i313 & bb.c.g.f32954lc), 2);
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                    }

                    @Override // yh.q
                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(k1 k1Var, androidx.compose.runtime.p pVar2, Integer num) {
                        a(k1Var, pVar2, num.intValue());
                        return kotlin.b2.f124493a;
                    }
                });
                pVarF.N(objU3);
            }
            pVarF.c0();
            int i2112 = (i13 & 14) | (i13 & 112);
            int i313 = i13 << 3;
            androidx.compose.foundation.interaction.g gVar17 = gVar2;
            j1 j1Var17 = j1Var2;
            boolean z117 = z12;
            e(f10, onValueChange, (yh.q) objU3, nVar3, z12, fVar3, i24, aVar4, j1Var2, gVar17, qVar14, pVarF, i2112 | (i313 & bb.c.g.f32954lc) | (57344 & i313) | (458752 & i313) | (i313 & 3670016) | (i313 & 29360128) | (i313 & 234881024) | (i313 & 1879048192), 0, 0);
            if (ComposerKt.g0()) {
                ComposerKt.v0();
            }
            nVar4 = nVar3;
            fVar4 = fVar3;
            i25 = i24;
            aVar5 = aVar4;
            gVar3 = gVar17;
            j1Var3 = j1Var17;
            z13 = z117;
        } else {
            pVarF.W();
            if ((i11 & 1) != 0) {
                if (i26 != 0) {
                    nVar2 = androidx.compose.ui.n.INSTANCE;
                } else {
                    nVar2 = nVar;
                }
                if (i14 != 0) {
                    z11 = true;
                } else {
                    z11 = z10;
                }
                if ((i12 & 16) != 0) {
                    fVarE = fi.t.e(0.0f, 1.0f);
                    i13 &= -57345;
                } else {
                    fVarE = fVar2;
                }
                if (i16 != 0) {
                    i23 = 0;
                } else {
                    i23 = i17;
                }
                if (i19 != 0) {
                    aVar3 = null;
                } else {
                    aVar3 = aVar2;
                }
                if ((i12 & 128) != 0) {
                    j1VarC = SliderDefaults.f10488a.c(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, pVarF, 0, 6, 1023);
                    i13 &= -29360129;
                }
                if (i21 != 0) {
                    pVarF.T(-492369756);
                    objU = pVarF.U();
                    if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                        objU = androidx.compose.foundation.interaction.f.a();
                        pVarF.N(objU);
                    }
                    pVarF.c0();
                    nVar3 = nVar2;
                    z12 = z11;
                    fVar3 = fVarE;
                    j1Var2 = j1VarC;
                    i24 = i23;
                    aVar4 = aVar3;
                    gVar2 = (androidx.compose.foundation.interaction.g) objU;
                } else {
                    nVar3 = nVar2;
                    z12 = z11;
                    fVar3 = fVarE;
                    j1Var2 = j1VarC;
                    i24 = i23;
                    aVar4 = aVar3;
                    gVar2 = gVar;
                }
            } else {
                if (i26 != 0) {
                    nVar2 = androidx.compose.ui.n.INSTANCE;
                } else {
                    nVar2 = nVar;
                }
                if (i14 != 0) {
                    z11 = true;
                } else {
                    z11 = z10;
                }
                if ((i12 & 16) != 0) {
                    fVarE = fi.t.e(0.0f, 1.0f);
                    i13 &= -57345;
                } else {
                    fVarE = fVar2;
                }
                if (i16 != 0) {
                    i23 = 0;
                } else {
                    i23 = i17;
                }
                if (i19 != 0) {
                    aVar3 = null;
                } else {
                    aVar3 = aVar2;
                }
                if ((i12 & 128) != 0) {
                    j1VarC = SliderDefaults.f10488a.c(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, pVarF, 0, 6, 1023);
                    i13 &= -29360129;
                }
                if (i21 != 0) {
                    pVarF.T(-492369756);
                    objU = pVarF.U();
                    if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                        objU = androidx.compose.foundation.interaction.f.a();
                        pVarF.N(objU);
                    }
                    pVarF.c0();
                    nVar3 = nVar2;
                    z12 = z11;
                    fVar3 = fVarE;
                    j1Var2 = j1VarC;
                    i24 = i23;
                    aVar4 = aVar3;
                    gVar2 = (androidx.compose.foundation.interaction.g) objU;
                } else {
                    nVar3 = nVar2;
                    z12 = z11;
                    fVar3 = fVarE;
                    j1Var2 = j1VarC;
                    i24 = i23;
                    aVar4 = aVar3;
                    gVar2 = gVar;
                }
            }
            pVarF.O();
            if (ComposerKt.g0()) {
                ComposerKt.w0(-202044027, i13, -1, "androidx.compose.material3.Slider (Slider.kt:154)");
            }
            Boolean boolValueOf119 = Boolean.valueOf(z12);
            pVarF.T(1618982084);
            zS = pVarF.s(boolValueOf119) | pVarF.s(gVar2) | pVarF.s(j1Var2);
            objU2 = pVarF.U();
            if (zS) {
                objU2 = androidx.compose.runtime.internal.b.c(-1923353268, true, new yh.q<k1, androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.SliderKt$Slider$2$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(3);
                    }

                    @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                    @androidx.compose.runtime.h
                    public final void a(@dl.d k1 it, @dl.e androidx.compose.runtime.p pVar2, int i2113) {
                        kotlin.jvm.internal.f0.p(it, "it");
                        if ((i2113 & 81) == 16 && pVar2.b()) {
                            pVar2.l();
                            return;
                        }
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(-1923353268, i2113, -1, "androidx.compose.material3.Slider.<anonymous>.<anonymous> (Slider.kt:176)");
                        }
                        SliderDefaults sliderDefaults = SliderDefaults.f10488a;
                        androidx.compose.foundation.interaction.g gVar18 = gVar2;
                        j1 j1Var18 = j1Var2;
                        boolean z118 = z12;
                        int i314 = i13;
                        sliderDefaults.a(gVar18, null, j1Var18, z118, 0L, pVar2, 196608 | ((i314 >> 24) & 14) | ((i314 >> 15) & bb.c.b.f30796me) | (i314 & bb.c.g.f32954lc), 18);
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                    }

                    @Override // yh.q
                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(k1 k1Var, androidx.compose.runtime.p pVar2, Integer num) {
                        a(k1Var, pVar2, num.intValue());
                        return kotlin.b2.f124493a;
                    }
                });
                pVarF.N(objU2);
            } else {
                objU2 = androidx.compose.runtime.internal.b.c(-1923353268, true, new yh.q<k1, androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.SliderKt$Slider$2$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(3);
                    }

                    @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                    @androidx.compose.runtime.h
                    public final void a(@dl.d k1 it, @dl.e androidx.compose.runtime.p pVar2, int i2113) {
                        kotlin.jvm.internal.f0.p(it, "it");
                        if ((i2113 & 81) == 16 && pVar2.b()) {
                            pVar2.l();
                            return;
                        }
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(-1923353268, i2113, -1, "androidx.compose.material3.Slider.<anonymous>.<anonymous> (Slider.kt:176)");
                        }
                        SliderDefaults sliderDefaults = SliderDefaults.f10488a;
                        androidx.compose.foundation.interaction.g gVar18 = gVar2;
                        j1 j1Var18 = j1Var2;
                        boolean z118 = z12;
                        int i314 = i13;
                        sliderDefaults.a(gVar18, null, j1Var18, z118, 0L, pVar2, 196608 | ((i314 >> 24) & 14) | ((i314 >> 15) & bb.c.b.f30796me) | (i314 & bb.c.g.f32954lc), 18);
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                    }

                    @Override // yh.q
                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(k1 k1Var, androidx.compose.runtime.p pVar2, Integer num) {
                        a(k1Var, pVar2, num.intValue());
                        return kotlin.b2.f124493a;
                    }
                });
                pVarF.N(objU2);
            }
            pVarF.c0();
            yh.q qVar15 = (yh.q) objU2;
            Boolean boolValueOf1110 = Boolean.valueOf(z12);
            pVarF.T(511388516);
            zS2 = pVarF.s(boolValueOf1110) | pVarF.s(j1Var2);
            objU3 = pVarF.U();
            if (zS2) {
                objU3 = androidx.compose.runtime.internal.b.c(1022381539, true, new yh.q<k1, androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.SliderKt$Slider$3$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(3);
                    }

                    @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                    @androidx.compose.runtime.h
                    public final void a(@dl.d k1 sliderPositions, @dl.e androidx.compose.runtime.p pVar2, int i2113) {
                        kotlin.jvm.internal.f0.p(sliderPositions, "sliderPositions");
                        if ((i2113 & 14) == 0) {
                            i2113 |= pVar2.s(sliderPositions) ? 4 : 2;
                        }
                        if ((i2113 & 91) == 18 && pVar2.b()) {
                            pVar2.l();
                            return;
                        }
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(1022381539, i2113, -1, "androidx.compose.material3.Slider.<anonymous>.<anonymous> (Slider.kt:183)");
                        }
                        SliderDefaults sliderDefaults = SliderDefaults.f10488a;
                        j1 j1Var18 = j1Var2;
                        boolean z118 = z12;
                        int i314 = i13;
                        sliderDefaults.b(sliderPositions, null, j1Var18, z118, pVar2, (i2113 & 14) | 24576 | ((i314 >> 15) & bb.c.b.f30796me) | (i314 & bb.c.g.f32954lc), 2);
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                    }

                    @Override // yh.q
                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(k1 k1Var, androidx.compose.runtime.p pVar2, Integer num) {
                        a(k1Var, pVar2, num.intValue());
                        return kotlin.b2.f124493a;
                    }
                });
                pVarF.N(objU3);
            } else {
                objU3 = androidx.compose.runtime.internal.b.c(1022381539, true, new yh.q<k1, androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.SliderKt$Slider$3$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(3);
                    }

                    @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                    @androidx.compose.runtime.h
                    public final void a(@dl.d k1 sliderPositions, @dl.e androidx.compose.runtime.p pVar2, int i2113) {
                        kotlin.jvm.internal.f0.p(sliderPositions, "sliderPositions");
                        if ((i2113 & 14) == 0) {
                            i2113 |= pVar2.s(sliderPositions) ? 4 : 2;
                        }
                        if ((i2113 & 91) == 18 && pVar2.b()) {
                            pVar2.l();
                            return;
                        }
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(1022381539, i2113, -1, "androidx.compose.material3.Slider.<anonymous>.<anonymous> (Slider.kt:183)");
                        }
                        SliderDefaults sliderDefaults = SliderDefaults.f10488a;
                        j1 j1Var18 = j1Var2;
                        boolean z118 = z12;
                        int i314 = i13;
                        sliderDefaults.b(sliderPositions, null, j1Var18, z118, pVar2, (i2113 & 14) | 24576 | ((i314 >> 15) & bb.c.b.f30796me) | (i314 & bb.c.g.f32954lc), 2);
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                    }

                    @Override // yh.q
                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(k1 k1Var, androidx.compose.runtime.p pVar2, Integer num) {
                        a(k1Var, pVar2, num.intValue());
                        return kotlin.b2.f124493a;
                    }
                });
                pVarF.N(objU3);
            }
            pVarF.c0();
            int i2113 = (i13 & 14) | (i13 & 112);
            int i314 = i13 << 3;
            androidx.compose.foundation.interaction.g gVar18 = gVar2;
            j1 j1Var18 = j1Var2;
            boolean z118 = z12;
            e(f10, onValueChange, (yh.q) objU3, nVar3, z12, fVar3, i24, aVar4, j1Var2, gVar18, qVar15, pVarF, i2113 | (i314 & bb.c.g.f32954lc) | (57344 & i314) | (458752 & i314) | (i314 & 3670016) | (i314 & 29360128) | (i314 & 234881024) | (i314 & 1879048192), 0, 0);
            if (ComposerKt.g0()) {
                ComposerKt.v0();
            }
            nVar4 = nVar3;
            fVar4 = fVar3;
            i25 = i24;
            aVar5 = aVar4;
            gVar3 = gVar18;
            j1Var3 = j1Var18;
            z13 = z118;
        }
        u1VarH = pVarF.H();
        if (u1VarH == null) {
            return;
        }
        u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.SliderKt$Slider$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            public final void a(@dl.e androidx.compose.runtime.p pVar2, int i315) {
                SliderKt.c(f10, onValueChange, nVar4, z13, fVar4, i25, aVar5, j1Var3, gVar3, pVar2, i11 | 1, i12);
            }

            @Override // yh.p
            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                a(pVar2, num.intValue());
                return kotlin.b2.f124493a;
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:101:0x012b  */
    /* JADX WARN: Code duplicated, block: B:103:0x012f  */
    /* JADX WARN: Code duplicated, block: B:105:0x0135  */
    /* JADX WARN: Code duplicated, block: B:106:0x0138  */
    /* JADX WARN: Code duplicated, block: B:109:0x0144  */
    /* JADX WARN: Code duplicated, block: B:113:0x015d  */
    /* JADX WARN: Code duplicated, block: B:115:0x0168  */
    /* JADX WARN: Code duplicated, block: B:125:0x0190 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:126:0x0192  */
    /* JADX WARN: Code duplicated, block: B:127:0x0195  */
    /* JADX WARN: Code duplicated, block: B:129:0x0199  */
    /* JADX WARN: Code duplicated, block: B:130:0x019b  */
    /* JADX WARN: Code duplicated, block: B:133:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:134:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:136:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:137:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:139:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:142:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:143:0x01df  */
    /* JADX WARN: Code duplicated, block: B:145:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:147:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:149:0x0204  */
    /* JADX WARN: Code duplicated, block: B:153:0x0218  */
    /* JADX WARN: Code duplicated, block: B:156:0x023a  */
    /* JADX WARN: Code duplicated, block: B:158:0x0242  */
    /* JADX WARN: Code duplicated, block: B:161:0x02a2  */
    /* JADX WARN: Code duplicated, block: B:166:0x02ba  */
    /* JADX WARN: Code duplicated, block: B:168:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x006d  */
    /* JADX WARN: Code duplicated, block: B:37:0x0070  */
    /* JADX WARN: Code duplicated, block: B:39:0x0074  */
    /* JADX WARN: Code duplicated, block: B:41:0x007c  */
    /* JADX WARN: Code duplicated, block: B:42:0x007f  */
    /* JADX WARN: Code duplicated, block: B:47:0x008c  */
    /* JADX WARN: Code duplicated, block: B:49:0x0090  */
    /* JADX WARN: Code duplicated, block: B:51:0x0098  */
    /* JADX WARN: Code duplicated, block: B:52:0x009b  */
    /* JADX WARN: Code duplicated, block: B:55:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:59:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:61:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:63:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:64:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:69:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:71:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:73:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:74:0x00df  */
    /* JADX WARN: Code duplicated, block: B:78:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:80:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:83:0x00f8 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:86:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:89:0x0107  */
    /* JADX WARN: Code duplicated, block: B:90:0x010e  */
    /* JADX WARN: Code duplicated, block: B:92:0x0114  */
    /* JADX WARN: Code duplicated, block: B:94:0x011a  */
    /* JADX WARN: Code duplicated, block: B:95:0x011d  */
    /* JADX WARN: Code duplicated, block: B:99:0x0127  */
    @w
    @androidx.compose.runtime.i(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.h
    public static final void d(final float f10, @dl.d final yh.l<? super Float, kotlin.b2> onValueChange, @dl.e androidx.compose.ui.n nVar, boolean z10, @dl.e fi.f<Float> fVar, int i10, @dl.e yh.a<kotlin.b2> aVar, @dl.e j1 j1Var, @dl.e androidx.compose.foundation.interaction.g gVar, @dl.d final yh.q<? super k1, ? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> thumb, @dl.e androidx.compose.runtime.p pVar, final int i11, final int i12) {
        final int i13;
        int i14;
        int i15;
        fi.f<Float> fVar2;
        int i16;
        int i17;
        int i18;
        int i19;
        yh.a<kotlin.b2> aVar2;
        int i20;
        int i21;
        int i22;
        int i23;
        androidx.compose.ui.n nVar2;
        boolean z11;
        fi.f<Float> fVarE;
        int i24;
        final j1 j1VarC;
        androidx.compose.foundation.interaction.g gVar2;
        androidx.compose.ui.n nVar3;
        final boolean z12;
        fi.f<Float> fVar3;
        yh.a<kotlin.b2> aVar3;
        int i25;
        Object objU;
        boolean zS;
        Object objU2;
        final androidx.compose.ui.n nVar4;
        final fi.f<Float> fVar4;
        final int i26;
        final yh.a<kotlin.b2> aVar4;
        final androidx.compose.foundation.interaction.g gVar3;
        final j1 j1Var2;
        final boolean z13;
        androidx.compose.runtime.u1 u1VarH;
        kotlin.jvm.internal.f0.p(onValueChange, "onValueChange");
        kotlin.jvm.internal.f0.p(thumb, "thumb");
        androidx.compose.runtime.p pVarF = pVar.F(1785516312);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 14) == 0) {
            i13 = (pVarF.w(f10) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i12 & 2) != 0) {
            i13 |= 48;
        } else if ((i11 & 112) == 0) {
            i13 |= pVarF.s(onValueChange) ? 32 : 16;
        }
        int i27 = i12 & 4;
        if (i27 == 0) {
            if ((i11 & bb.c.b.f30796me) == 0) {
                i13 |= pVarF.s(nVar) ? 256 : 128;
            }
            i14 = i12 & 8;
            if (i14 != 0) {
                if ((i11 & bb.c.g.f32954lc) == 0) {
                    if (pVarF.u(z10)) {
                        i15 = 2048;
                    } else {
                        i15 = 1024;
                    }
                    i13 |= i15;
                }
                if ((i11 & 57344) == 0) {
                    if ((i12 & 16) == 0) {
                        fVar2 = fVar;
                        int i28 = pVarF.s(fVar2) ? 16384 : 8192;
                        i13 |= i28;
                    } else {
                        fVar2 = fVar;
                    }
                    i13 |= i28;
                } else {
                    fVar2 = fVar;
                }
                i16 = i12 & 32;
                if (i16 != 0) {
                    i13 |= androidx.profileinstaller.o.c.f26824k;
                    i17 = i10;
                } else {
                    i17 = i10;
                    if ((i11 & 458752) == 0) {
                        if (pVarF.y(i17)) {
                            i18 = 131072;
                        } else {
                            i18 = 65536;
                        }
                        i13 |= i18;
                    }
                }
                i19 = i12 & 64;
                if (i19 != 0) {
                    i13 |= 1572864;
                    aVar2 = aVar;
                } else {
                    aVar2 = aVar;
                    if ((i11 & 3670016) == 0) {
                        if (pVarF.s(aVar2)) {
                            i20 = 1048576;
                        } else {
                            i20 = 524288;
                        }
                        i13 |= i20;
                    }
                }
                if ((i11 & 29360128) != 0) {
                    i13 |= ((i12 & 128) == 0 || !pVarF.s(j1Var)) ? 4194304 : 8388608;
                }
                i21 = i12 & 256;
                if (i21 != 0) {
                    i13 |= 100663296;
                } else if ((i11 & 234881024) == 0) {
                    if (pVarF.s(gVar)) {
                        i22 = 67108864;
                    } else {
                        i22 = 33554432;
                    }
                    i13 |= i22;
                }
                if ((i12 & 512) != 0) {
                    if ((i11 & 1879048192) == 0) {
                        if (pVarF.s(thumb)) {
                            i23 = 536870912;
                        } else {
                            i23 = 268435456;
                        }
                    }
                    if ((1533916891 & i13) == 306783378 || !pVarF.b()) {
                        pVarF.W();
                        if ((i11 & 1) != 0 || pVarF.o()) {
                            if (i27 != 0) {
                                nVar2 = androidx.compose.ui.n.INSTANCE;
                            } else {
                                nVar2 = nVar;
                            }
                            if (i14 != 0) {
                                z11 = true;
                            } else {
                                z11 = z10;
                            }
                            if ((i12 & 16) != 0) {
                                fVarE = fi.t.e(0.0f, 1.0f);
                                i13 &= -57345;
                            } else {
                                fVarE = fVar2;
                            }
                            if (i16 != 0) {
                                i24 = 0;
                            } else {
                                i24 = i17;
                            }
                            if (i19 != 0) {
                                aVar2 = null;
                            }
                            if ((i12 & 128) != 0) {
                                j1VarC = SliderDefaults.f10488a.c(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, pVarF, 0, 6, 1023);
                                i13 &= -29360129;
                            } else {
                                j1VarC = j1Var;
                            }
                            if (i21 != 0) {
                                pVarF.T(-492369756);
                                objU = pVarF.U();
                                if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                                    objU = androidx.compose.foundation.interaction.f.a();
                                    pVarF.N(objU);
                                }
                                pVarF.c0();
                                gVar2 = (androidx.compose.foundation.interaction.g) objU;
                            } else {
                                gVar2 = gVar;
                            }
                            nVar3 = nVar2;
                            z12 = z11;
                            fVar3 = fVarE;
                            aVar3 = aVar2;
                            i25 = i24;
                        } else {
                            pVarF.l();
                            if ((i12 & 16) != 0) {
                                i13 &= -57345;
                            }
                            if ((i12 & 128) != 0) {
                                i13 &= -29360129;
                            }
                            nVar3 = nVar;
                            j1VarC = j1Var;
                            gVar2 = gVar;
                            aVar3 = aVar2;
                            fVar3 = fVar2;
                            i25 = i17;
                            z12 = z10;
                        }
                        pVarF.O();
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(1785516312, i13, -1, "androidx.compose.material3.Slider (Slider.kt:235)");
                        }
                        Boolean boolValueOf = Boolean.valueOf(z12);
                        pVarF.T(511388516);
                        zS = pVarF.s(boolValueOf) | pVarF.s(j1VarC);
                        objU2 = pVarF.U();
                        if (zS || objU2 == androidx.compose.runtime.p.INSTANCE.a()) {
                            objU2 = androidx.compose.runtime.internal.b.c(1252336501, true, new yh.q<k1, androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.SliderKt$Slider$6$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(3);
                                }

                                @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                                @androidx.compose.runtime.h
                                public final void a(@dl.d k1 sliderPositions, @dl.e androidx.compose.runtime.p pVar2, int i29) {
                                    kotlin.jvm.internal.f0.p(sliderPositions, "sliderPositions");
                                    if ((i29 & 14) == 0) {
                                        i29 |= pVar2.s(sliderPositions) ? 4 : 2;
                                    }
                                    if ((i29 & 91) == 18 && pVar2.b()) {
                                        pVar2.l();
                                        return;
                                    }
                                    if (ComposerKt.g0()) {
                                        ComposerKt.w0(1252336501, i29, -1, "androidx.compose.material3.Slider.<anonymous>.<anonymous> (Slider.kt:259)");
                                    }
                                    SliderDefaults sliderDefaults = SliderDefaults.f10488a;
                                    j1 j1Var3 = j1VarC;
                                    boolean z14 = z12;
                                    int i30 = i13;
                                    sliderDefaults.b(sliderPositions, null, j1Var3, z14, pVar2, (i29 & 14) | 24576 | ((i30 >> 15) & bb.c.b.f30796me) | (i30 & bb.c.g.f32954lc), 2);
                                    if (ComposerKt.g0()) {
                                        ComposerKt.v0();
                                    }
                                }

                                @Override // yh.q
                                public /* bridge */ /* synthetic */ kotlin.b2 invoke(k1 k1Var, androidx.compose.runtime.p pVar2, Integer num) {
                                    a(k1Var, pVar2, num.intValue());
                                    return kotlin.b2.f124493a;
                                }
                            });
                            pVarF.N(objU2);
                        }
                        pVarF.c0();
                        int i29 = i13 << 3;
                        j1 j1Var3 = j1VarC;
                        boolean z14 = z12;
                        e(f10, onValueChange, (yh.q) objU2, nVar3, z12, fVar3, i25, aVar3, j1VarC, gVar2, thumb, pVarF, (i13 & 14) | (i13 & 112) | (i29 & bb.c.g.f32954lc) | (57344 & i29) | (458752 & i29) | (i29 & 3670016) | (i29 & 29360128) | (i29 & 234881024) | (i29 & 1879048192), (i13 >> 27) & 14, 0);
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                        nVar4 = nVar3;
                        fVar4 = fVar3;
                        i26 = i25;
                        aVar4 = aVar3;
                        gVar3 = gVar2;
                        j1Var2 = j1Var3;
                        z13 = z14;
                    } else {
                        pVarF.l();
                        nVar4 = nVar;
                        z13 = z10;
                        j1Var2 = j1Var;
                        fVar4 = fVar2;
                        aVar4 = aVar2;
                        i26 = i17;
                        gVar3 = gVar;
                    }
                    u1VarH = pVarF.H();
                    if (u1VarH == null) {
                        return;
                    }
                    u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.SliderKt$Slider$7
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        public final void a(@dl.e androidx.compose.runtime.p pVar2, int i30) {
                            SliderKt.d(f10, onValueChange, nVar4, z13, fVar4, i26, aVar4, j1Var2, gVar3, thumb, pVar2, i11 | 1, i12);
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                            a(pVar2, num.intValue());
                            return kotlin.b2.f124493a;
                        }
                    });
                }
                i23 = com.google.android.exoplayer2.j.G;
                i13 |= i23;
                if ((1533916891 & i13) == 306783378) {
                    pVarF.W();
                    if ((i11 & 1) != 0) {
                        if (i27 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if (i14 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if ((i12 & 16) != 0) {
                            fVarE = fi.t.e(0.0f, 1.0f);
                            i13 &= -57345;
                        } else {
                            fVarE = fVar2;
                        }
                        if (i16 != 0) {
                            i24 = 0;
                        } else {
                            i24 = i17;
                        }
                        if (i19 != 0) {
                            aVar2 = null;
                        }
                        if ((i12 & 128) != 0) {
                            j1VarC = SliderDefaults.f10488a.c(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, pVarF, 0, 6, 1023);
                            i13 &= -29360129;
                        } else {
                            j1VarC = j1Var;
                        }
                        if (i21 != 0) {
                            pVarF.T(-492369756);
                            objU = pVarF.U();
                            if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                                objU = androidx.compose.foundation.interaction.f.a();
                                pVarF.N(objU);
                            }
                            pVarF.c0();
                            gVar2 = (androidx.compose.foundation.interaction.g) objU;
                        } else {
                            gVar2 = gVar;
                        }
                        nVar3 = nVar2;
                        z12 = z11;
                        fVar3 = fVarE;
                        aVar3 = aVar2;
                        i25 = i24;
                    } else {
                        if (i27 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if (i14 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if ((i12 & 16) != 0) {
                            fVarE = fi.t.e(0.0f, 1.0f);
                            i13 &= -57345;
                        } else {
                            fVarE = fVar2;
                        }
                        if (i16 != 0) {
                            i24 = 0;
                        } else {
                            i24 = i17;
                        }
                        if (i19 != 0) {
                            aVar2 = null;
                        }
                        if ((i12 & 128) != 0) {
                            j1VarC = SliderDefaults.f10488a.c(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, pVarF, 0, 6, 1023);
                            i13 &= -29360129;
                        } else {
                            j1VarC = j1Var;
                        }
                        if (i21 != 0) {
                            pVarF.T(-492369756);
                            objU = pVarF.U();
                            if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                                objU = androidx.compose.foundation.interaction.f.a();
                                pVarF.N(objU);
                            }
                            pVarF.c0();
                            gVar2 = (androidx.compose.foundation.interaction.g) objU;
                        } else {
                            gVar2 = gVar;
                        }
                        nVar3 = nVar2;
                        z12 = z11;
                        fVar3 = fVarE;
                        aVar3 = aVar2;
                        i25 = i24;
                    }
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(1785516312, i13, -1, "androidx.compose.material3.Slider (Slider.kt:235)");
                    }
                    Boolean boolValueOf2 = Boolean.valueOf(z12);
                    pVarF.T(511388516);
                    zS = pVarF.s(boolValueOf2) | pVarF.s(j1VarC);
                    objU2 = pVarF.U();
                    if (zS) {
                        objU2 = androidx.compose.runtime.internal.b.c(1252336501, true, new yh.q<k1, androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.SliderKt$Slider$6$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(3);
                            }

                            @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                            @androidx.compose.runtime.h
                            public final void a(@dl.d k1 sliderPositions, @dl.e androidx.compose.runtime.p pVar2, int i210) {
                                kotlin.jvm.internal.f0.p(sliderPositions, "sliderPositions");
                                if ((i210 & 14) == 0) {
                                    i210 |= pVar2.s(sliderPositions) ? 4 : 2;
                                }
                                if ((i210 & 91) == 18 && pVar2.b()) {
                                    pVar2.l();
                                    return;
                                }
                                if (ComposerKt.g0()) {
                                    ComposerKt.w0(1252336501, i210, -1, "androidx.compose.material3.Slider.<anonymous>.<anonymous> (Slider.kt:259)");
                                }
                                SliderDefaults sliderDefaults = SliderDefaults.f10488a;
                                j1 j1Var4 = j1VarC;
                                boolean z15 = z12;
                                int i30 = i13;
                                sliderDefaults.b(sliderPositions, null, j1Var4, z15, pVar2, (i210 & 14) | 24576 | ((i30 >> 15) & bb.c.b.f30796me) | (i30 & bb.c.g.f32954lc), 2);
                                if (ComposerKt.g0()) {
                                    ComposerKt.v0();
                                }
                            }

                            @Override // yh.q
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(k1 k1Var, androidx.compose.runtime.p pVar2, Integer num) {
                                a(k1Var, pVar2, num.intValue());
                                return kotlin.b2.f124493a;
                            }
                        });
                        pVarF.N(objU2);
                    } else {
                        objU2 = androidx.compose.runtime.internal.b.c(1252336501, true, new yh.q<k1, androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.SliderKt$Slider$6$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(3);
                            }

                            @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                            @androidx.compose.runtime.h
                            public final void a(@dl.d k1 sliderPositions, @dl.e androidx.compose.runtime.p pVar2, int i210) {
                                kotlin.jvm.internal.f0.p(sliderPositions, "sliderPositions");
                                if ((i210 & 14) == 0) {
                                    i210 |= pVar2.s(sliderPositions) ? 4 : 2;
                                }
                                if ((i210 & 91) == 18 && pVar2.b()) {
                                    pVar2.l();
                                    return;
                                }
                                if (ComposerKt.g0()) {
                                    ComposerKt.w0(1252336501, i210, -1, "androidx.compose.material3.Slider.<anonymous>.<anonymous> (Slider.kt:259)");
                                }
                                SliderDefaults sliderDefaults = SliderDefaults.f10488a;
                                j1 j1Var4 = j1VarC;
                                boolean z15 = z12;
                                int i30 = i13;
                                sliderDefaults.b(sliderPositions, null, j1Var4, z15, pVar2, (i210 & 14) | 24576 | ((i30 >> 15) & bb.c.b.f30796me) | (i30 & bb.c.g.f32954lc), 2);
                                if (ComposerKt.g0()) {
                                    ComposerKt.v0();
                                }
                            }

                            @Override // yh.q
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(k1 k1Var, androidx.compose.runtime.p pVar2, Integer num) {
                                a(k1Var, pVar2, num.intValue());
                                return kotlin.b2.f124493a;
                            }
                        });
                        pVarF.N(objU2);
                    }
                    pVarF.c0();
                    int i210 = i13 << 3;
                    j1 j1Var4 = j1VarC;
                    boolean z15 = z12;
                    e(f10, onValueChange, (yh.q) objU2, nVar3, z12, fVar3, i25, aVar3, j1VarC, gVar2, thumb, pVarF, (i13 & 14) | (i13 & 112) | (i210 & bb.c.g.f32954lc) | (57344 & i210) | (458752 & i210) | (i210 & 3670016) | (i210 & 29360128) | (i210 & 234881024) | (i210 & 1879048192), (i13 >> 27) & 14, 0);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    nVar4 = nVar3;
                    fVar4 = fVar3;
                    i26 = i25;
                    aVar4 = aVar3;
                    gVar3 = gVar2;
                    j1Var2 = j1Var4;
                    z13 = z15;
                } else {
                    pVarF.W();
                    if ((i11 & 1) != 0) {
                        if (i27 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if (i14 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if ((i12 & 16) != 0) {
                            fVarE = fi.t.e(0.0f, 1.0f);
                            i13 &= -57345;
                        } else {
                            fVarE = fVar2;
                        }
                        if (i16 != 0) {
                            i24 = 0;
                        } else {
                            i24 = i17;
                        }
                        if (i19 != 0) {
                            aVar2 = null;
                        }
                        if ((i12 & 128) != 0) {
                            j1VarC = SliderDefaults.f10488a.c(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, pVarF, 0, 6, 1023);
                            i13 &= -29360129;
                        } else {
                            j1VarC = j1Var;
                        }
                        if (i21 != 0) {
                            pVarF.T(-492369756);
                            objU = pVarF.U();
                            if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                                objU = androidx.compose.foundation.interaction.f.a();
                                pVarF.N(objU);
                            }
                            pVarF.c0();
                            gVar2 = (androidx.compose.foundation.interaction.g) objU;
                        } else {
                            gVar2 = gVar;
                        }
                        nVar3 = nVar2;
                        z12 = z11;
                        fVar3 = fVarE;
                        aVar3 = aVar2;
                        i25 = i24;
                    } else {
                        if (i27 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if (i14 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if ((i12 & 16) != 0) {
                            fVarE = fi.t.e(0.0f, 1.0f);
                            i13 &= -57345;
                        } else {
                            fVarE = fVar2;
                        }
                        if (i16 != 0) {
                            i24 = 0;
                        } else {
                            i24 = i17;
                        }
                        if (i19 != 0) {
                            aVar2 = null;
                        }
                        if ((i12 & 128) != 0) {
                            j1VarC = SliderDefaults.f10488a.c(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, pVarF, 0, 6, 1023);
                            i13 &= -29360129;
                        } else {
                            j1VarC = j1Var;
                        }
                        if (i21 != 0) {
                            pVarF.T(-492369756);
                            objU = pVarF.U();
                            if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                                objU = androidx.compose.foundation.interaction.f.a();
                                pVarF.N(objU);
                            }
                            pVarF.c0();
                            gVar2 = (androidx.compose.foundation.interaction.g) objU;
                        } else {
                            gVar2 = gVar;
                        }
                        nVar3 = nVar2;
                        z12 = z11;
                        fVar3 = fVarE;
                        aVar3 = aVar2;
                        i25 = i24;
                    }
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(1785516312, i13, -1, "androidx.compose.material3.Slider (Slider.kt:235)");
                    }
                    Boolean boolValueOf3 = Boolean.valueOf(z12);
                    pVarF.T(511388516);
                    zS = pVarF.s(boolValueOf3) | pVarF.s(j1VarC);
                    objU2 = pVarF.U();
                    if (zS) {
                        objU2 = androidx.compose.runtime.internal.b.c(1252336501, true, new yh.q<k1, androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.SliderKt$Slider$6$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(3);
                            }

                            @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                            @androidx.compose.runtime.h
                            public final void a(@dl.d k1 sliderPositions, @dl.e androidx.compose.runtime.p pVar2, int i211) {
                                kotlin.jvm.internal.f0.p(sliderPositions, "sliderPositions");
                                if ((i211 & 14) == 0) {
                                    i211 |= pVar2.s(sliderPositions) ? 4 : 2;
                                }
                                if ((i211 & 91) == 18 && pVar2.b()) {
                                    pVar2.l();
                                    return;
                                }
                                if (ComposerKt.g0()) {
                                    ComposerKt.w0(1252336501, i211, -1, "androidx.compose.material3.Slider.<anonymous>.<anonymous> (Slider.kt:259)");
                                }
                                SliderDefaults sliderDefaults = SliderDefaults.f10488a;
                                j1 j1Var5 = j1VarC;
                                boolean z16 = z12;
                                int i30 = i13;
                                sliderDefaults.b(sliderPositions, null, j1Var5, z16, pVar2, (i211 & 14) | 24576 | ((i30 >> 15) & bb.c.b.f30796me) | (i30 & bb.c.g.f32954lc), 2);
                                if (ComposerKt.g0()) {
                                    ComposerKt.v0();
                                }
                            }

                            @Override // yh.q
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(k1 k1Var, androidx.compose.runtime.p pVar2, Integer num) {
                                a(k1Var, pVar2, num.intValue());
                                return kotlin.b2.f124493a;
                            }
                        });
                        pVarF.N(objU2);
                    } else {
                        objU2 = androidx.compose.runtime.internal.b.c(1252336501, true, new yh.q<k1, androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.SliderKt$Slider$6$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(3);
                            }

                            @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                            @androidx.compose.runtime.h
                            public final void a(@dl.d k1 sliderPositions, @dl.e androidx.compose.runtime.p pVar2, int i211) {
                                kotlin.jvm.internal.f0.p(sliderPositions, "sliderPositions");
                                if ((i211 & 14) == 0) {
                                    i211 |= pVar2.s(sliderPositions) ? 4 : 2;
                                }
                                if ((i211 & 91) == 18 && pVar2.b()) {
                                    pVar2.l();
                                    return;
                                }
                                if (ComposerKt.g0()) {
                                    ComposerKt.w0(1252336501, i211, -1, "androidx.compose.material3.Slider.<anonymous>.<anonymous> (Slider.kt:259)");
                                }
                                SliderDefaults sliderDefaults = SliderDefaults.f10488a;
                                j1 j1Var5 = j1VarC;
                                boolean z16 = z12;
                                int i30 = i13;
                                sliderDefaults.b(sliderPositions, null, j1Var5, z16, pVar2, (i211 & 14) | 24576 | ((i30 >> 15) & bb.c.b.f30796me) | (i30 & bb.c.g.f32954lc), 2);
                                if (ComposerKt.g0()) {
                                    ComposerKt.v0();
                                }
                            }

                            @Override // yh.q
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(k1 k1Var, androidx.compose.runtime.p pVar2, Integer num) {
                                a(k1Var, pVar2, num.intValue());
                                return kotlin.b2.f124493a;
                            }
                        });
                        pVarF.N(objU2);
                    }
                    pVarF.c0();
                    int i211 = i13 << 3;
                    j1 j1Var5 = j1VarC;
                    boolean z16 = z12;
                    e(f10, onValueChange, (yh.q) objU2, nVar3, z12, fVar3, i25, aVar3, j1VarC, gVar2, thumb, pVarF, (i13 & 14) | (i13 & 112) | (i211 & bb.c.g.f32954lc) | (57344 & i211) | (458752 & i211) | (i211 & 3670016) | (i211 & 29360128) | (i211 & 234881024) | (i211 & 1879048192), (i13 >> 27) & 14, 0);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    nVar4 = nVar3;
                    fVar4 = fVar3;
                    i26 = i25;
                    aVar4 = aVar3;
                    gVar3 = gVar2;
                    j1Var2 = j1Var5;
                    z13 = z16;
                }
                u1VarH = pVarF.H();
                if (u1VarH == null) {
                    return;
                }
                u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.SliderKt$Slider$7
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public final void a(@dl.e androidx.compose.runtime.p pVar2, int i30) {
                        SliderKt.d(f10, onValueChange, nVar4, z13, fVar4, i26, aVar4, j1Var2, gVar3, thumb, pVar2, i11 | 1, i12);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                        a(pVar2, num.intValue());
                        return kotlin.b2.f124493a;
                    }
                });
            }
            i13 |= bb.c.d.f31193dj;
            if ((i11 & 57344) == 0) {
                if ((i12 & 16) == 0) {
                    fVar2 = fVar;
                    if (pVarF.s(fVar2)) {
                    }
                    i13 |= i28;
                } else {
                    fVar2 = fVar;
                }
                i13 |= i28;
            } else {
                fVar2 = fVar;
            }
            i16 = i12 & 32;
            if (i16 != 0) {
                i13 |= androidx.profileinstaller.o.c.f26824k;
                i17 = i10;
            } else {
                i17 = i10;
                if ((i11 & 458752) == 0) {
                    if (pVarF.y(i17)) {
                        i18 = 131072;
                    } else {
                        i18 = 65536;
                    }
                    i13 |= i18;
                }
            }
            i19 = i12 & 64;
            if (i19 != 0) {
                i13 |= 1572864;
                aVar2 = aVar;
            } else {
                aVar2 = aVar;
                if ((i11 & 3670016) == 0) {
                    if (pVarF.s(aVar2)) {
                        i20 = 1048576;
                    } else {
                        i20 = 524288;
                    }
                    i13 |= i20;
                }
            }
            if ((i11 & 29360128) != 0) {
                i13 |= ((i12 & 128) == 0 || !pVarF.s(j1Var)) ? 4194304 : 8388608;
            }
            i21 = i12 & 256;
            if (i21 != 0) {
                i13 |= 100663296;
            } else if ((i11 & 234881024) == 0) {
                if (pVarF.s(gVar)) {
                    i22 = 67108864;
                } else {
                    i22 = 33554432;
                }
                i13 |= i22;
            }
            if ((i12 & 512) != 0) {
                if ((i11 & 1879048192) == 0) {
                    if (pVarF.s(thumb)) {
                        i23 = 536870912;
                    } else {
                        i23 = 268435456;
                    }
                }
                if ((1533916891 & i13) == 306783378) {
                    pVarF.W();
                    if ((i11 & 1) != 0) {
                        if (i27 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if (i14 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if ((i12 & 16) != 0) {
                            fVarE = fi.t.e(0.0f, 1.0f);
                            i13 &= -57345;
                        } else {
                            fVarE = fVar2;
                        }
                        if (i16 != 0) {
                            i24 = 0;
                        } else {
                            i24 = i17;
                        }
                        if (i19 != 0) {
                            aVar2 = null;
                        }
                        if ((i12 & 128) != 0) {
                            j1VarC = SliderDefaults.f10488a.c(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, pVarF, 0, 6, 1023);
                            i13 &= -29360129;
                        } else {
                            j1VarC = j1Var;
                        }
                        if (i21 != 0) {
                            pVarF.T(-492369756);
                            objU = pVarF.U();
                            if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                                objU = androidx.compose.foundation.interaction.f.a();
                                pVarF.N(objU);
                            }
                            pVarF.c0();
                            gVar2 = (androidx.compose.foundation.interaction.g) objU;
                        } else {
                            gVar2 = gVar;
                        }
                        nVar3 = nVar2;
                        z12 = z11;
                        fVar3 = fVarE;
                        aVar3 = aVar2;
                        i25 = i24;
                    } else {
                        if (i27 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if (i14 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if ((i12 & 16) != 0) {
                            fVarE = fi.t.e(0.0f, 1.0f);
                            i13 &= -57345;
                        } else {
                            fVarE = fVar2;
                        }
                        if (i16 != 0) {
                            i24 = 0;
                        } else {
                            i24 = i17;
                        }
                        if (i19 != 0) {
                            aVar2 = null;
                        }
                        if ((i12 & 128) != 0) {
                            j1VarC = SliderDefaults.f10488a.c(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, pVarF, 0, 6, 1023);
                            i13 &= -29360129;
                        } else {
                            j1VarC = j1Var;
                        }
                        if (i21 != 0) {
                            pVarF.T(-492369756);
                            objU = pVarF.U();
                            if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                                objU = androidx.compose.foundation.interaction.f.a();
                                pVarF.N(objU);
                            }
                            pVarF.c0();
                            gVar2 = (androidx.compose.foundation.interaction.g) objU;
                        } else {
                            gVar2 = gVar;
                        }
                        nVar3 = nVar2;
                        z12 = z11;
                        fVar3 = fVarE;
                        aVar3 = aVar2;
                        i25 = i24;
                    }
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(1785516312, i13, -1, "androidx.compose.material3.Slider (Slider.kt:235)");
                    }
                    Boolean boolValueOf4 = Boolean.valueOf(z12);
                    pVarF.T(511388516);
                    zS = pVarF.s(boolValueOf4) | pVarF.s(j1VarC);
                    objU2 = pVarF.U();
                    if (zS) {
                        objU2 = androidx.compose.runtime.internal.b.c(1252336501, true, new yh.q<k1, androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.SliderKt$Slider$6$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(3);
                            }

                            @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                            @androidx.compose.runtime.h
                            public final void a(@dl.d k1 sliderPositions, @dl.e androidx.compose.runtime.p pVar2, int i212) {
                                kotlin.jvm.internal.f0.p(sliderPositions, "sliderPositions");
                                if ((i212 & 14) == 0) {
                                    i212 |= pVar2.s(sliderPositions) ? 4 : 2;
                                }
                                if ((i212 & 91) == 18 && pVar2.b()) {
                                    pVar2.l();
                                    return;
                                }
                                if (ComposerKt.g0()) {
                                    ComposerKt.w0(1252336501, i212, -1, "androidx.compose.material3.Slider.<anonymous>.<anonymous> (Slider.kt:259)");
                                }
                                SliderDefaults sliderDefaults = SliderDefaults.f10488a;
                                j1 j1Var6 = j1VarC;
                                boolean z17 = z12;
                                int i30 = i13;
                                sliderDefaults.b(sliderPositions, null, j1Var6, z17, pVar2, (i212 & 14) | 24576 | ((i30 >> 15) & bb.c.b.f30796me) | (i30 & bb.c.g.f32954lc), 2);
                                if (ComposerKt.g0()) {
                                    ComposerKt.v0();
                                }
                            }

                            @Override // yh.q
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(k1 k1Var, androidx.compose.runtime.p pVar2, Integer num) {
                                a(k1Var, pVar2, num.intValue());
                                return kotlin.b2.f124493a;
                            }
                        });
                        pVarF.N(objU2);
                    } else {
                        objU2 = androidx.compose.runtime.internal.b.c(1252336501, true, new yh.q<k1, androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.SliderKt$Slider$6$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(3);
                            }

                            @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                            @androidx.compose.runtime.h
                            public final void a(@dl.d k1 sliderPositions, @dl.e androidx.compose.runtime.p pVar2, int i212) {
                                kotlin.jvm.internal.f0.p(sliderPositions, "sliderPositions");
                                if ((i212 & 14) == 0) {
                                    i212 |= pVar2.s(sliderPositions) ? 4 : 2;
                                }
                                if ((i212 & 91) == 18 && pVar2.b()) {
                                    pVar2.l();
                                    return;
                                }
                                if (ComposerKt.g0()) {
                                    ComposerKt.w0(1252336501, i212, -1, "androidx.compose.material3.Slider.<anonymous>.<anonymous> (Slider.kt:259)");
                                }
                                SliderDefaults sliderDefaults = SliderDefaults.f10488a;
                                j1 j1Var6 = j1VarC;
                                boolean z17 = z12;
                                int i30 = i13;
                                sliderDefaults.b(sliderPositions, null, j1Var6, z17, pVar2, (i212 & 14) | 24576 | ((i30 >> 15) & bb.c.b.f30796me) | (i30 & bb.c.g.f32954lc), 2);
                                if (ComposerKt.g0()) {
                                    ComposerKt.v0();
                                }
                            }

                            @Override // yh.q
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(k1 k1Var, androidx.compose.runtime.p pVar2, Integer num) {
                                a(k1Var, pVar2, num.intValue());
                                return kotlin.b2.f124493a;
                            }
                        });
                        pVarF.N(objU2);
                    }
                    pVarF.c0();
                    int i212 = i13 << 3;
                    j1 j1Var6 = j1VarC;
                    boolean z17 = z12;
                    e(f10, onValueChange, (yh.q) objU2, nVar3, z12, fVar3, i25, aVar3, j1VarC, gVar2, thumb, pVarF, (i13 & 14) | (i13 & 112) | (i212 & bb.c.g.f32954lc) | (57344 & i212) | (458752 & i212) | (i212 & 3670016) | (i212 & 29360128) | (i212 & 234881024) | (i212 & 1879048192), (i13 >> 27) & 14, 0);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    nVar4 = nVar3;
                    fVar4 = fVar3;
                    i26 = i25;
                    aVar4 = aVar3;
                    gVar3 = gVar2;
                    j1Var2 = j1Var6;
                    z13 = z17;
                } else {
                    pVarF.W();
                    if ((i11 & 1) != 0) {
                        if (i27 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if (i14 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if ((i12 & 16) != 0) {
                            fVarE = fi.t.e(0.0f, 1.0f);
                            i13 &= -57345;
                        } else {
                            fVarE = fVar2;
                        }
                        if (i16 != 0) {
                            i24 = 0;
                        } else {
                            i24 = i17;
                        }
                        if (i19 != 0) {
                            aVar2 = null;
                        }
                        if ((i12 & 128) != 0) {
                            j1VarC = SliderDefaults.f10488a.c(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, pVarF, 0, 6, 1023);
                            i13 &= -29360129;
                        } else {
                            j1VarC = j1Var;
                        }
                        if (i21 != 0) {
                            pVarF.T(-492369756);
                            objU = pVarF.U();
                            if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                                objU = androidx.compose.foundation.interaction.f.a();
                                pVarF.N(objU);
                            }
                            pVarF.c0();
                            gVar2 = (androidx.compose.foundation.interaction.g) objU;
                        } else {
                            gVar2 = gVar;
                        }
                        nVar3 = nVar2;
                        z12 = z11;
                        fVar3 = fVarE;
                        aVar3 = aVar2;
                        i25 = i24;
                    } else {
                        if (i27 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if (i14 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if ((i12 & 16) != 0) {
                            fVarE = fi.t.e(0.0f, 1.0f);
                            i13 &= -57345;
                        } else {
                            fVarE = fVar2;
                        }
                        if (i16 != 0) {
                            i24 = 0;
                        } else {
                            i24 = i17;
                        }
                        if (i19 != 0) {
                            aVar2 = null;
                        }
                        if ((i12 & 128) != 0) {
                            j1VarC = SliderDefaults.f10488a.c(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, pVarF, 0, 6, 1023);
                            i13 &= -29360129;
                        } else {
                            j1VarC = j1Var;
                        }
                        if (i21 != 0) {
                            pVarF.T(-492369756);
                            objU = pVarF.U();
                            if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                                objU = androidx.compose.foundation.interaction.f.a();
                                pVarF.N(objU);
                            }
                            pVarF.c0();
                            gVar2 = (androidx.compose.foundation.interaction.g) objU;
                        } else {
                            gVar2 = gVar;
                        }
                        nVar3 = nVar2;
                        z12 = z11;
                        fVar3 = fVarE;
                        aVar3 = aVar2;
                        i25 = i24;
                    }
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(1785516312, i13, -1, "androidx.compose.material3.Slider (Slider.kt:235)");
                    }
                    Boolean boolValueOf5 = Boolean.valueOf(z12);
                    pVarF.T(511388516);
                    zS = pVarF.s(boolValueOf5) | pVarF.s(j1VarC);
                    objU2 = pVarF.U();
                    if (zS) {
                        objU2 = androidx.compose.runtime.internal.b.c(1252336501, true, new yh.q<k1, androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.SliderKt$Slider$6$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(3);
                            }

                            @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                            @androidx.compose.runtime.h
                            public final void a(@dl.d k1 sliderPositions, @dl.e androidx.compose.runtime.p pVar2, int i213) {
                                kotlin.jvm.internal.f0.p(sliderPositions, "sliderPositions");
                                if ((i213 & 14) == 0) {
                                    i213 |= pVar2.s(sliderPositions) ? 4 : 2;
                                }
                                if ((i213 & 91) == 18 && pVar2.b()) {
                                    pVar2.l();
                                    return;
                                }
                                if (ComposerKt.g0()) {
                                    ComposerKt.w0(1252336501, i213, -1, "androidx.compose.material3.Slider.<anonymous>.<anonymous> (Slider.kt:259)");
                                }
                                SliderDefaults sliderDefaults = SliderDefaults.f10488a;
                                j1 j1Var7 = j1VarC;
                                boolean z18 = z12;
                                int i30 = i13;
                                sliderDefaults.b(sliderPositions, null, j1Var7, z18, pVar2, (i213 & 14) | 24576 | ((i30 >> 15) & bb.c.b.f30796me) | (i30 & bb.c.g.f32954lc), 2);
                                if (ComposerKt.g0()) {
                                    ComposerKt.v0();
                                }
                            }

                            @Override // yh.q
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(k1 k1Var, androidx.compose.runtime.p pVar2, Integer num) {
                                a(k1Var, pVar2, num.intValue());
                                return kotlin.b2.f124493a;
                            }
                        });
                        pVarF.N(objU2);
                    } else {
                        objU2 = androidx.compose.runtime.internal.b.c(1252336501, true, new yh.q<k1, androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.SliderKt$Slider$6$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(3);
                            }

                            @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                            @androidx.compose.runtime.h
                            public final void a(@dl.d k1 sliderPositions, @dl.e androidx.compose.runtime.p pVar2, int i213) {
                                kotlin.jvm.internal.f0.p(sliderPositions, "sliderPositions");
                                if ((i213 & 14) == 0) {
                                    i213 |= pVar2.s(sliderPositions) ? 4 : 2;
                                }
                                if ((i213 & 91) == 18 && pVar2.b()) {
                                    pVar2.l();
                                    return;
                                }
                                if (ComposerKt.g0()) {
                                    ComposerKt.w0(1252336501, i213, -1, "androidx.compose.material3.Slider.<anonymous>.<anonymous> (Slider.kt:259)");
                                }
                                SliderDefaults sliderDefaults = SliderDefaults.f10488a;
                                j1 j1Var7 = j1VarC;
                                boolean z18 = z12;
                                int i30 = i13;
                                sliderDefaults.b(sliderPositions, null, j1Var7, z18, pVar2, (i213 & 14) | 24576 | ((i30 >> 15) & bb.c.b.f30796me) | (i30 & bb.c.g.f32954lc), 2);
                                if (ComposerKt.g0()) {
                                    ComposerKt.v0();
                                }
                            }

                            @Override // yh.q
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(k1 k1Var, androidx.compose.runtime.p pVar2, Integer num) {
                                a(k1Var, pVar2, num.intValue());
                                return kotlin.b2.f124493a;
                            }
                        });
                        pVarF.N(objU2);
                    }
                    pVarF.c0();
                    int i213 = i13 << 3;
                    j1 j1Var7 = j1VarC;
                    boolean z18 = z12;
                    e(f10, onValueChange, (yh.q) objU2, nVar3, z12, fVar3, i25, aVar3, j1VarC, gVar2, thumb, pVarF, (i13 & 14) | (i13 & 112) | (i213 & bb.c.g.f32954lc) | (57344 & i213) | (458752 & i213) | (i213 & 3670016) | (i213 & 29360128) | (i213 & 234881024) | (i213 & 1879048192), (i13 >> 27) & 14, 0);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    nVar4 = nVar3;
                    fVar4 = fVar3;
                    i26 = i25;
                    aVar4 = aVar3;
                    gVar3 = gVar2;
                    j1Var2 = j1Var7;
                    z13 = z18;
                }
                u1VarH = pVarF.H();
                if (u1VarH == null) {
                    return;
                }
                u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.SliderKt$Slider$7
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public final void a(@dl.e androidx.compose.runtime.p pVar2, int i30) {
                        SliderKt.d(f10, onValueChange, nVar4, z13, fVar4, i26, aVar4, j1Var2, gVar3, thumb, pVar2, i11 | 1, i12);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                        a(pVar2, num.intValue());
                        return kotlin.b2.f124493a;
                    }
                });
            }
            i23 = com.google.android.exoplayer2.j.G;
            i13 |= i23;
            if ((1533916891 & i13) == 306783378) {
                pVarF.W();
                if ((i11 & 1) != 0) {
                    if (i27 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar2 = nVar;
                    }
                    if (i14 != 0) {
                        z11 = true;
                    } else {
                        z11 = z10;
                    }
                    if ((i12 & 16) != 0) {
                        fVarE = fi.t.e(0.0f, 1.0f);
                        i13 &= -57345;
                    } else {
                        fVarE = fVar2;
                    }
                    if (i16 != 0) {
                        i24 = 0;
                    } else {
                        i24 = i17;
                    }
                    if (i19 != 0) {
                        aVar2 = null;
                    }
                    if ((i12 & 128) != 0) {
                        j1VarC = SliderDefaults.f10488a.c(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, pVarF, 0, 6, 1023);
                        i13 &= -29360129;
                    } else {
                        j1VarC = j1Var;
                    }
                    if (i21 != 0) {
                        pVarF.T(-492369756);
                        objU = pVarF.U();
                        if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                            objU = androidx.compose.foundation.interaction.f.a();
                            pVarF.N(objU);
                        }
                        pVarF.c0();
                        gVar2 = (androidx.compose.foundation.interaction.g) objU;
                    } else {
                        gVar2 = gVar;
                    }
                    nVar3 = nVar2;
                    z12 = z11;
                    fVar3 = fVarE;
                    aVar3 = aVar2;
                    i25 = i24;
                } else {
                    if (i27 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar2 = nVar;
                    }
                    if (i14 != 0) {
                        z11 = true;
                    } else {
                        z11 = z10;
                    }
                    if ((i12 & 16) != 0) {
                        fVarE = fi.t.e(0.0f, 1.0f);
                        i13 &= -57345;
                    } else {
                        fVarE = fVar2;
                    }
                    if (i16 != 0) {
                        i24 = 0;
                    } else {
                        i24 = i17;
                    }
                    if (i19 != 0) {
                        aVar2 = null;
                    }
                    if ((i12 & 128) != 0) {
                        j1VarC = SliderDefaults.f10488a.c(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, pVarF, 0, 6, 1023);
                        i13 &= -29360129;
                    } else {
                        j1VarC = j1Var;
                    }
                    if (i21 != 0) {
                        pVarF.T(-492369756);
                        objU = pVarF.U();
                        if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                            objU = androidx.compose.foundation.interaction.f.a();
                            pVarF.N(objU);
                        }
                        pVarF.c0();
                        gVar2 = (androidx.compose.foundation.interaction.g) objU;
                    } else {
                        gVar2 = gVar;
                    }
                    nVar3 = nVar2;
                    z12 = z11;
                    fVar3 = fVarE;
                    aVar3 = aVar2;
                    i25 = i24;
                }
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(1785516312, i13, -1, "androidx.compose.material3.Slider (Slider.kt:235)");
                }
                Boolean boolValueOf6 = Boolean.valueOf(z12);
                pVarF.T(511388516);
                zS = pVarF.s(boolValueOf6) | pVarF.s(j1VarC);
                objU2 = pVarF.U();
                if (zS) {
                    objU2 = androidx.compose.runtime.internal.b.c(1252336501, true, new yh.q<k1, androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.SliderKt$Slider$6$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(3);
                        }

                        @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                        @androidx.compose.runtime.h
                        public final void a(@dl.d k1 sliderPositions, @dl.e androidx.compose.runtime.p pVar2, int i214) {
                            kotlin.jvm.internal.f0.p(sliderPositions, "sliderPositions");
                            if ((i214 & 14) == 0) {
                                i214 |= pVar2.s(sliderPositions) ? 4 : 2;
                            }
                            if ((i214 & 91) == 18 && pVar2.b()) {
                                pVar2.l();
                                return;
                            }
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(1252336501, i214, -1, "androidx.compose.material3.Slider.<anonymous>.<anonymous> (Slider.kt:259)");
                            }
                            SliderDefaults sliderDefaults = SliderDefaults.f10488a;
                            j1 j1Var8 = j1VarC;
                            boolean z19 = z12;
                            int i30 = i13;
                            sliderDefaults.b(sliderPositions, null, j1Var8, z19, pVar2, (i214 & 14) | 24576 | ((i30 >> 15) & bb.c.b.f30796me) | (i30 & bb.c.g.f32954lc), 2);
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                        }

                        @Override // yh.q
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(k1 k1Var, androidx.compose.runtime.p pVar2, Integer num) {
                            a(k1Var, pVar2, num.intValue());
                            return kotlin.b2.f124493a;
                        }
                    });
                    pVarF.N(objU2);
                } else {
                    objU2 = androidx.compose.runtime.internal.b.c(1252336501, true, new yh.q<k1, androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.SliderKt$Slider$6$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(3);
                        }

                        @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                        @androidx.compose.runtime.h
                        public final void a(@dl.d k1 sliderPositions, @dl.e androidx.compose.runtime.p pVar2, int i214) {
                            kotlin.jvm.internal.f0.p(sliderPositions, "sliderPositions");
                            if ((i214 & 14) == 0) {
                                i214 |= pVar2.s(sliderPositions) ? 4 : 2;
                            }
                            if ((i214 & 91) == 18 && pVar2.b()) {
                                pVar2.l();
                                return;
                            }
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(1252336501, i214, -1, "androidx.compose.material3.Slider.<anonymous>.<anonymous> (Slider.kt:259)");
                            }
                            SliderDefaults sliderDefaults = SliderDefaults.f10488a;
                            j1 j1Var8 = j1VarC;
                            boolean z19 = z12;
                            int i30 = i13;
                            sliderDefaults.b(sliderPositions, null, j1Var8, z19, pVar2, (i214 & 14) | 24576 | ((i30 >> 15) & bb.c.b.f30796me) | (i30 & bb.c.g.f32954lc), 2);
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                        }

                        @Override // yh.q
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(k1 k1Var, androidx.compose.runtime.p pVar2, Integer num) {
                            a(k1Var, pVar2, num.intValue());
                            return kotlin.b2.f124493a;
                        }
                    });
                    pVarF.N(objU2);
                }
                pVarF.c0();
                int i214 = i13 << 3;
                j1 j1Var8 = j1VarC;
                boolean z19 = z12;
                e(f10, onValueChange, (yh.q) objU2, nVar3, z12, fVar3, i25, aVar3, j1VarC, gVar2, thumb, pVarF, (i13 & 14) | (i13 & 112) | (i214 & bb.c.g.f32954lc) | (57344 & i214) | (458752 & i214) | (i214 & 3670016) | (i214 & 29360128) | (i214 & 234881024) | (i214 & 1879048192), (i13 >> 27) & 14, 0);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                nVar4 = nVar3;
                fVar4 = fVar3;
                i26 = i25;
                aVar4 = aVar3;
                gVar3 = gVar2;
                j1Var2 = j1Var8;
                z13 = z19;
            } else {
                pVarF.W();
                if ((i11 & 1) != 0) {
                    if (i27 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar2 = nVar;
                    }
                    if (i14 != 0) {
                        z11 = true;
                    } else {
                        z11 = z10;
                    }
                    if ((i12 & 16) != 0) {
                        fVarE = fi.t.e(0.0f, 1.0f);
                        i13 &= -57345;
                    } else {
                        fVarE = fVar2;
                    }
                    if (i16 != 0) {
                        i24 = 0;
                    } else {
                        i24 = i17;
                    }
                    if (i19 != 0) {
                        aVar2 = null;
                    }
                    if ((i12 & 128) != 0) {
                        j1VarC = SliderDefaults.f10488a.c(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, pVarF, 0, 6, 1023);
                        i13 &= -29360129;
                    } else {
                        j1VarC = j1Var;
                    }
                    if (i21 != 0) {
                        pVarF.T(-492369756);
                        objU = pVarF.U();
                        if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                            objU = androidx.compose.foundation.interaction.f.a();
                            pVarF.N(objU);
                        }
                        pVarF.c0();
                        gVar2 = (androidx.compose.foundation.interaction.g) objU;
                    } else {
                        gVar2 = gVar;
                    }
                    nVar3 = nVar2;
                    z12 = z11;
                    fVar3 = fVarE;
                    aVar3 = aVar2;
                    i25 = i24;
                } else {
                    if (i27 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar2 = nVar;
                    }
                    if (i14 != 0) {
                        z11 = true;
                    } else {
                        z11 = z10;
                    }
                    if ((i12 & 16) != 0) {
                        fVarE = fi.t.e(0.0f, 1.0f);
                        i13 &= -57345;
                    } else {
                        fVarE = fVar2;
                    }
                    if (i16 != 0) {
                        i24 = 0;
                    } else {
                        i24 = i17;
                    }
                    if (i19 != 0) {
                        aVar2 = null;
                    }
                    if ((i12 & 128) != 0) {
                        j1VarC = SliderDefaults.f10488a.c(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, pVarF, 0, 6, 1023);
                        i13 &= -29360129;
                    } else {
                        j1VarC = j1Var;
                    }
                    if (i21 != 0) {
                        pVarF.T(-492369756);
                        objU = pVarF.U();
                        if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                            objU = androidx.compose.foundation.interaction.f.a();
                            pVarF.N(objU);
                        }
                        pVarF.c0();
                        gVar2 = (androidx.compose.foundation.interaction.g) objU;
                    } else {
                        gVar2 = gVar;
                    }
                    nVar3 = nVar2;
                    z12 = z11;
                    fVar3 = fVarE;
                    aVar3 = aVar2;
                    i25 = i24;
                }
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(1785516312, i13, -1, "androidx.compose.material3.Slider (Slider.kt:235)");
                }
                Boolean boolValueOf7 = Boolean.valueOf(z12);
                pVarF.T(511388516);
                zS = pVarF.s(boolValueOf7) | pVarF.s(j1VarC);
                objU2 = pVarF.U();
                if (zS) {
                    objU2 = androidx.compose.runtime.internal.b.c(1252336501, true, new yh.q<k1, androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.SliderKt$Slider$6$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(3);
                        }

                        @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                        @androidx.compose.runtime.h
                        public final void a(@dl.d k1 sliderPositions, @dl.e androidx.compose.runtime.p pVar2, int i215) {
                            kotlin.jvm.internal.f0.p(sliderPositions, "sliderPositions");
                            if ((i215 & 14) == 0) {
                                i215 |= pVar2.s(sliderPositions) ? 4 : 2;
                            }
                            if ((i215 & 91) == 18 && pVar2.b()) {
                                pVar2.l();
                                return;
                            }
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(1252336501, i215, -1, "androidx.compose.material3.Slider.<anonymous>.<anonymous> (Slider.kt:259)");
                            }
                            SliderDefaults sliderDefaults = SliderDefaults.f10488a;
                            j1 j1Var9 = j1VarC;
                            boolean z110 = z12;
                            int i30 = i13;
                            sliderDefaults.b(sliderPositions, null, j1Var9, z110, pVar2, (i215 & 14) | 24576 | ((i30 >> 15) & bb.c.b.f30796me) | (i30 & bb.c.g.f32954lc), 2);
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                        }

                        @Override // yh.q
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(k1 k1Var, androidx.compose.runtime.p pVar2, Integer num) {
                            a(k1Var, pVar2, num.intValue());
                            return kotlin.b2.f124493a;
                        }
                    });
                    pVarF.N(objU2);
                } else {
                    objU2 = androidx.compose.runtime.internal.b.c(1252336501, true, new yh.q<k1, androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.SliderKt$Slider$6$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(3);
                        }

                        @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                        @androidx.compose.runtime.h
                        public final void a(@dl.d k1 sliderPositions, @dl.e androidx.compose.runtime.p pVar2, int i215) {
                            kotlin.jvm.internal.f0.p(sliderPositions, "sliderPositions");
                            if ((i215 & 14) == 0) {
                                i215 |= pVar2.s(sliderPositions) ? 4 : 2;
                            }
                            if ((i215 & 91) == 18 && pVar2.b()) {
                                pVar2.l();
                                return;
                            }
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(1252336501, i215, -1, "androidx.compose.material3.Slider.<anonymous>.<anonymous> (Slider.kt:259)");
                            }
                            SliderDefaults sliderDefaults = SliderDefaults.f10488a;
                            j1 j1Var9 = j1VarC;
                            boolean z110 = z12;
                            int i30 = i13;
                            sliderDefaults.b(sliderPositions, null, j1Var9, z110, pVar2, (i215 & 14) | 24576 | ((i30 >> 15) & bb.c.b.f30796me) | (i30 & bb.c.g.f32954lc), 2);
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                        }

                        @Override // yh.q
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(k1 k1Var, androidx.compose.runtime.p pVar2, Integer num) {
                            a(k1Var, pVar2, num.intValue());
                            return kotlin.b2.f124493a;
                        }
                    });
                    pVarF.N(objU2);
                }
                pVarF.c0();
                int i215 = i13 << 3;
                j1 j1Var9 = j1VarC;
                boolean z110 = z12;
                e(f10, onValueChange, (yh.q) objU2, nVar3, z12, fVar3, i25, aVar3, j1VarC, gVar2, thumb, pVarF, (i13 & 14) | (i13 & 112) | (i215 & bb.c.g.f32954lc) | (57344 & i215) | (458752 & i215) | (i215 & 3670016) | (i215 & 29360128) | (i215 & 234881024) | (i215 & 1879048192), (i13 >> 27) & 14, 0);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                nVar4 = nVar3;
                fVar4 = fVar3;
                i26 = i25;
                aVar4 = aVar3;
                gVar3 = gVar2;
                j1Var2 = j1Var9;
                z13 = z110;
            }
            u1VarH = pVarF.H();
            if (u1VarH == null) {
                return;
            }
            u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.SliderKt$Slider$7
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void a(@dl.e androidx.compose.runtime.p pVar2, int i30) {
                    SliderKt.d(f10, onValueChange, nVar4, z13, fVar4, i26, aVar4, j1Var2, gVar3, thumb, pVar2, i11 | 1, i12);
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                    a(pVar2, num.intValue());
                    return kotlin.b2.f124493a;
                }
            });
        }
        i13 |= bb.c.b.f30966u4;
        i14 = i12 & 8;
        if (i14 != 0) {
            if ((i11 & bb.c.g.f32954lc) == 0) {
                if (pVarF.u(z10)) {
                    i15 = 2048;
                } else {
                    i15 = 1024;
                }
                i13 |= i15;
            }
            if ((i11 & 57344) == 0) {
                if ((i12 & 16) == 0) {
                    fVar2 = fVar;
                    if (pVarF.s(fVar2)) {
                    }
                    i13 |= i28;
                } else {
                    fVar2 = fVar;
                }
                i13 |= i28;
            } else {
                fVar2 = fVar;
            }
            i16 = i12 & 32;
            if (i16 != 0) {
                i13 |= androidx.profileinstaller.o.c.f26824k;
                i17 = i10;
            } else {
                i17 = i10;
                if ((i11 & 458752) == 0) {
                    if (pVarF.y(i17)) {
                        i18 = 131072;
                    } else {
                        i18 = 65536;
                    }
                    i13 |= i18;
                }
            }
            i19 = i12 & 64;
            if (i19 != 0) {
                i13 |= 1572864;
                aVar2 = aVar;
            } else {
                aVar2 = aVar;
                if ((i11 & 3670016) == 0) {
                    if (pVarF.s(aVar2)) {
                        i20 = 1048576;
                    } else {
                        i20 = 524288;
                    }
                    i13 |= i20;
                }
            }
            if ((i11 & 29360128) != 0) {
                i13 |= ((i12 & 128) == 0 || !pVarF.s(j1Var)) ? 4194304 : 8388608;
            }
            i21 = i12 & 256;
            if (i21 != 0) {
                i13 |= 100663296;
            } else if ((i11 & 234881024) == 0) {
                if (pVarF.s(gVar)) {
                    i22 = 67108864;
                } else {
                    i22 = 33554432;
                }
                i13 |= i22;
            }
            if ((i12 & 512) != 0) {
                if ((i11 & 1879048192) == 0) {
                    if (pVarF.s(thumb)) {
                        i23 = 536870912;
                    } else {
                        i23 = 268435456;
                    }
                }
                if ((1533916891 & i13) == 306783378) {
                    pVarF.W();
                    if ((i11 & 1) != 0) {
                        if (i27 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if (i14 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if ((i12 & 16) != 0) {
                            fVarE = fi.t.e(0.0f, 1.0f);
                            i13 &= -57345;
                        } else {
                            fVarE = fVar2;
                        }
                        if (i16 != 0) {
                            i24 = 0;
                        } else {
                            i24 = i17;
                        }
                        if (i19 != 0) {
                            aVar2 = null;
                        }
                        if ((i12 & 128) != 0) {
                            j1VarC = SliderDefaults.f10488a.c(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, pVarF, 0, 6, 1023);
                            i13 &= -29360129;
                        } else {
                            j1VarC = j1Var;
                        }
                        if (i21 != 0) {
                            pVarF.T(-492369756);
                            objU = pVarF.U();
                            if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                                objU = androidx.compose.foundation.interaction.f.a();
                                pVarF.N(objU);
                            }
                            pVarF.c0();
                            gVar2 = (androidx.compose.foundation.interaction.g) objU;
                        } else {
                            gVar2 = gVar;
                        }
                        nVar3 = nVar2;
                        z12 = z11;
                        fVar3 = fVarE;
                        aVar3 = aVar2;
                        i25 = i24;
                    } else {
                        if (i27 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if (i14 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if ((i12 & 16) != 0) {
                            fVarE = fi.t.e(0.0f, 1.0f);
                            i13 &= -57345;
                        } else {
                            fVarE = fVar2;
                        }
                        if (i16 != 0) {
                            i24 = 0;
                        } else {
                            i24 = i17;
                        }
                        if (i19 != 0) {
                            aVar2 = null;
                        }
                        if ((i12 & 128) != 0) {
                            j1VarC = SliderDefaults.f10488a.c(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, pVarF, 0, 6, 1023);
                            i13 &= -29360129;
                        } else {
                            j1VarC = j1Var;
                        }
                        if (i21 != 0) {
                            pVarF.T(-492369756);
                            objU = pVarF.U();
                            if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                                objU = androidx.compose.foundation.interaction.f.a();
                                pVarF.N(objU);
                            }
                            pVarF.c0();
                            gVar2 = (androidx.compose.foundation.interaction.g) objU;
                        } else {
                            gVar2 = gVar;
                        }
                        nVar3 = nVar2;
                        z12 = z11;
                        fVar3 = fVarE;
                        aVar3 = aVar2;
                        i25 = i24;
                    }
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(1785516312, i13, -1, "androidx.compose.material3.Slider (Slider.kt:235)");
                    }
                    Boolean boolValueOf8 = Boolean.valueOf(z12);
                    pVarF.T(511388516);
                    zS = pVarF.s(boolValueOf8) | pVarF.s(j1VarC);
                    objU2 = pVarF.U();
                    if (zS) {
                        objU2 = androidx.compose.runtime.internal.b.c(1252336501, true, new yh.q<k1, androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.SliderKt$Slider$6$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(3);
                            }

                            @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                            @androidx.compose.runtime.h
                            public final void a(@dl.d k1 sliderPositions, @dl.e androidx.compose.runtime.p pVar2, int i216) {
                                kotlin.jvm.internal.f0.p(sliderPositions, "sliderPositions");
                                if ((i216 & 14) == 0) {
                                    i216 |= pVar2.s(sliderPositions) ? 4 : 2;
                                }
                                if ((i216 & 91) == 18 && pVar2.b()) {
                                    pVar2.l();
                                    return;
                                }
                                if (ComposerKt.g0()) {
                                    ComposerKt.w0(1252336501, i216, -1, "androidx.compose.material3.Slider.<anonymous>.<anonymous> (Slider.kt:259)");
                                }
                                SliderDefaults sliderDefaults = SliderDefaults.f10488a;
                                j1 j1Var10 = j1VarC;
                                boolean z111 = z12;
                                int i30 = i13;
                                sliderDefaults.b(sliderPositions, null, j1Var10, z111, pVar2, (i216 & 14) | 24576 | ((i30 >> 15) & bb.c.b.f30796me) | (i30 & bb.c.g.f32954lc), 2);
                                if (ComposerKt.g0()) {
                                    ComposerKt.v0();
                                }
                            }

                            @Override // yh.q
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(k1 k1Var, androidx.compose.runtime.p pVar2, Integer num) {
                                a(k1Var, pVar2, num.intValue());
                                return kotlin.b2.f124493a;
                            }
                        });
                        pVarF.N(objU2);
                    } else {
                        objU2 = androidx.compose.runtime.internal.b.c(1252336501, true, new yh.q<k1, androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.SliderKt$Slider$6$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(3);
                            }

                            @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                            @androidx.compose.runtime.h
                            public final void a(@dl.d k1 sliderPositions, @dl.e androidx.compose.runtime.p pVar2, int i216) {
                                kotlin.jvm.internal.f0.p(sliderPositions, "sliderPositions");
                                if ((i216 & 14) == 0) {
                                    i216 |= pVar2.s(sliderPositions) ? 4 : 2;
                                }
                                if ((i216 & 91) == 18 && pVar2.b()) {
                                    pVar2.l();
                                    return;
                                }
                                if (ComposerKt.g0()) {
                                    ComposerKt.w0(1252336501, i216, -1, "androidx.compose.material3.Slider.<anonymous>.<anonymous> (Slider.kt:259)");
                                }
                                SliderDefaults sliderDefaults = SliderDefaults.f10488a;
                                j1 j1Var10 = j1VarC;
                                boolean z111 = z12;
                                int i30 = i13;
                                sliderDefaults.b(sliderPositions, null, j1Var10, z111, pVar2, (i216 & 14) | 24576 | ((i30 >> 15) & bb.c.b.f30796me) | (i30 & bb.c.g.f32954lc), 2);
                                if (ComposerKt.g0()) {
                                    ComposerKt.v0();
                                }
                            }

                            @Override // yh.q
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(k1 k1Var, androidx.compose.runtime.p pVar2, Integer num) {
                                a(k1Var, pVar2, num.intValue());
                                return kotlin.b2.f124493a;
                            }
                        });
                        pVarF.N(objU2);
                    }
                    pVarF.c0();
                    int i216 = i13 << 3;
                    j1 j1Var10 = j1VarC;
                    boolean z111 = z12;
                    e(f10, onValueChange, (yh.q) objU2, nVar3, z12, fVar3, i25, aVar3, j1VarC, gVar2, thumb, pVarF, (i13 & 14) | (i13 & 112) | (i216 & bb.c.g.f32954lc) | (57344 & i216) | (458752 & i216) | (i216 & 3670016) | (i216 & 29360128) | (i216 & 234881024) | (i216 & 1879048192), (i13 >> 27) & 14, 0);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    nVar4 = nVar3;
                    fVar4 = fVar3;
                    i26 = i25;
                    aVar4 = aVar3;
                    gVar3 = gVar2;
                    j1Var2 = j1Var10;
                    z13 = z111;
                } else {
                    pVarF.W();
                    if ((i11 & 1) != 0) {
                        if (i27 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if (i14 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if ((i12 & 16) != 0) {
                            fVarE = fi.t.e(0.0f, 1.0f);
                            i13 &= -57345;
                        } else {
                            fVarE = fVar2;
                        }
                        if (i16 != 0) {
                            i24 = 0;
                        } else {
                            i24 = i17;
                        }
                        if (i19 != 0) {
                            aVar2 = null;
                        }
                        if ((i12 & 128) != 0) {
                            j1VarC = SliderDefaults.f10488a.c(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, pVarF, 0, 6, 1023);
                            i13 &= -29360129;
                        } else {
                            j1VarC = j1Var;
                        }
                        if (i21 != 0) {
                            pVarF.T(-492369756);
                            objU = pVarF.U();
                            if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                                objU = androidx.compose.foundation.interaction.f.a();
                                pVarF.N(objU);
                            }
                            pVarF.c0();
                            gVar2 = (androidx.compose.foundation.interaction.g) objU;
                        } else {
                            gVar2 = gVar;
                        }
                        nVar3 = nVar2;
                        z12 = z11;
                        fVar3 = fVarE;
                        aVar3 = aVar2;
                        i25 = i24;
                    } else {
                        if (i27 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if (i14 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if ((i12 & 16) != 0) {
                            fVarE = fi.t.e(0.0f, 1.0f);
                            i13 &= -57345;
                        } else {
                            fVarE = fVar2;
                        }
                        if (i16 != 0) {
                            i24 = 0;
                        } else {
                            i24 = i17;
                        }
                        if (i19 != 0) {
                            aVar2 = null;
                        }
                        if ((i12 & 128) != 0) {
                            j1VarC = SliderDefaults.f10488a.c(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, pVarF, 0, 6, 1023);
                            i13 &= -29360129;
                        } else {
                            j1VarC = j1Var;
                        }
                        if (i21 != 0) {
                            pVarF.T(-492369756);
                            objU = pVarF.U();
                            if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                                objU = androidx.compose.foundation.interaction.f.a();
                                pVarF.N(objU);
                            }
                            pVarF.c0();
                            gVar2 = (androidx.compose.foundation.interaction.g) objU;
                        } else {
                            gVar2 = gVar;
                        }
                        nVar3 = nVar2;
                        z12 = z11;
                        fVar3 = fVarE;
                        aVar3 = aVar2;
                        i25 = i24;
                    }
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(1785516312, i13, -1, "androidx.compose.material3.Slider (Slider.kt:235)");
                    }
                    Boolean boolValueOf9 = Boolean.valueOf(z12);
                    pVarF.T(511388516);
                    zS = pVarF.s(boolValueOf9) | pVarF.s(j1VarC);
                    objU2 = pVarF.U();
                    if (zS) {
                        objU2 = androidx.compose.runtime.internal.b.c(1252336501, true, new yh.q<k1, androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.SliderKt$Slider$6$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(3);
                            }

                            @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                            @androidx.compose.runtime.h
                            public final void a(@dl.d k1 sliderPositions, @dl.e androidx.compose.runtime.p pVar2, int i217) {
                                kotlin.jvm.internal.f0.p(sliderPositions, "sliderPositions");
                                if ((i217 & 14) == 0) {
                                    i217 |= pVar2.s(sliderPositions) ? 4 : 2;
                                }
                                if ((i217 & 91) == 18 && pVar2.b()) {
                                    pVar2.l();
                                    return;
                                }
                                if (ComposerKt.g0()) {
                                    ComposerKt.w0(1252336501, i217, -1, "androidx.compose.material3.Slider.<anonymous>.<anonymous> (Slider.kt:259)");
                                }
                                SliderDefaults sliderDefaults = SliderDefaults.f10488a;
                                j1 j1Var11 = j1VarC;
                                boolean z112 = z12;
                                int i30 = i13;
                                sliderDefaults.b(sliderPositions, null, j1Var11, z112, pVar2, (i217 & 14) | 24576 | ((i30 >> 15) & bb.c.b.f30796me) | (i30 & bb.c.g.f32954lc), 2);
                                if (ComposerKt.g0()) {
                                    ComposerKt.v0();
                                }
                            }

                            @Override // yh.q
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(k1 k1Var, androidx.compose.runtime.p pVar2, Integer num) {
                                a(k1Var, pVar2, num.intValue());
                                return kotlin.b2.f124493a;
                            }
                        });
                        pVarF.N(objU2);
                    } else {
                        objU2 = androidx.compose.runtime.internal.b.c(1252336501, true, new yh.q<k1, androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.SliderKt$Slider$6$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(3);
                            }

                            @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                            @androidx.compose.runtime.h
                            public final void a(@dl.d k1 sliderPositions, @dl.e androidx.compose.runtime.p pVar2, int i217) {
                                kotlin.jvm.internal.f0.p(sliderPositions, "sliderPositions");
                                if ((i217 & 14) == 0) {
                                    i217 |= pVar2.s(sliderPositions) ? 4 : 2;
                                }
                                if ((i217 & 91) == 18 && pVar2.b()) {
                                    pVar2.l();
                                    return;
                                }
                                if (ComposerKt.g0()) {
                                    ComposerKt.w0(1252336501, i217, -1, "androidx.compose.material3.Slider.<anonymous>.<anonymous> (Slider.kt:259)");
                                }
                                SliderDefaults sliderDefaults = SliderDefaults.f10488a;
                                j1 j1Var11 = j1VarC;
                                boolean z112 = z12;
                                int i30 = i13;
                                sliderDefaults.b(sliderPositions, null, j1Var11, z112, pVar2, (i217 & 14) | 24576 | ((i30 >> 15) & bb.c.b.f30796me) | (i30 & bb.c.g.f32954lc), 2);
                                if (ComposerKt.g0()) {
                                    ComposerKt.v0();
                                }
                            }

                            @Override // yh.q
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(k1 k1Var, androidx.compose.runtime.p pVar2, Integer num) {
                                a(k1Var, pVar2, num.intValue());
                                return kotlin.b2.f124493a;
                            }
                        });
                        pVarF.N(objU2);
                    }
                    pVarF.c0();
                    int i217 = i13 << 3;
                    j1 j1Var11 = j1VarC;
                    boolean z112 = z12;
                    e(f10, onValueChange, (yh.q) objU2, nVar3, z12, fVar3, i25, aVar3, j1VarC, gVar2, thumb, pVarF, (i13 & 14) | (i13 & 112) | (i217 & bb.c.g.f32954lc) | (57344 & i217) | (458752 & i217) | (i217 & 3670016) | (i217 & 29360128) | (i217 & 234881024) | (i217 & 1879048192), (i13 >> 27) & 14, 0);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    nVar4 = nVar3;
                    fVar4 = fVar3;
                    i26 = i25;
                    aVar4 = aVar3;
                    gVar3 = gVar2;
                    j1Var2 = j1Var11;
                    z13 = z112;
                }
                u1VarH = pVarF.H();
                if (u1VarH == null) {
                    return;
                }
                u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.SliderKt$Slider$7
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public final void a(@dl.e androidx.compose.runtime.p pVar2, int i30) {
                        SliderKt.d(f10, onValueChange, nVar4, z13, fVar4, i26, aVar4, j1Var2, gVar3, thumb, pVar2, i11 | 1, i12);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                        a(pVar2, num.intValue());
                        return kotlin.b2.f124493a;
                    }
                });
            }
            i23 = com.google.android.exoplayer2.j.G;
            i13 |= i23;
            if ((1533916891 & i13) == 306783378) {
                pVarF.W();
                if ((i11 & 1) != 0) {
                    if (i27 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar2 = nVar;
                    }
                    if (i14 != 0) {
                        z11 = true;
                    } else {
                        z11 = z10;
                    }
                    if ((i12 & 16) != 0) {
                        fVarE = fi.t.e(0.0f, 1.0f);
                        i13 &= -57345;
                    } else {
                        fVarE = fVar2;
                    }
                    if (i16 != 0) {
                        i24 = 0;
                    } else {
                        i24 = i17;
                    }
                    if (i19 != 0) {
                        aVar2 = null;
                    }
                    if ((i12 & 128) != 0) {
                        j1VarC = SliderDefaults.f10488a.c(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, pVarF, 0, 6, 1023);
                        i13 &= -29360129;
                    } else {
                        j1VarC = j1Var;
                    }
                    if (i21 != 0) {
                        pVarF.T(-492369756);
                        objU = pVarF.U();
                        if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                            objU = androidx.compose.foundation.interaction.f.a();
                            pVarF.N(objU);
                        }
                        pVarF.c0();
                        gVar2 = (androidx.compose.foundation.interaction.g) objU;
                    } else {
                        gVar2 = gVar;
                    }
                    nVar3 = nVar2;
                    z12 = z11;
                    fVar3 = fVarE;
                    aVar3 = aVar2;
                    i25 = i24;
                } else {
                    if (i27 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar2 = nVar;
                    }
                    if (i14 != 0) {
                        z11 = true;
                    } else {
                        z11 = z10;
                    }
                    if ((i12 & 16) != 0) {
                        fVarE = fi.t.e(0.0f, 1.0f);
                        i13 &= -57345;
                    } else {
                        fVarE = fVar2;
                    }
                    if (i16 != 0) {
                        i24 = 0;
                    } else {
                        i24 = i17;
                    }
                    if (i19 != 0) {
                        aVar2 = null;
                    }
                    if ((i12 & 128) != 0) {
                        j1VarC = SliderDefaults.f10488a.c(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, pVarF, 0, 6, 1023);
                        i13 &= -29360129;
                    } else {
                        j1VarC = j1Var;
                    }
                    if (i21 != 0) {
                        pVarF.T(-492369756);
                        objU = pVarF.U();
                        if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                            objU = androidx.compose.foundation.interaction.f.a();
                            pVarF.N(objU);
                        }
                        pVarF.c0();
                        gVar2 = (androidx.compose.foundation.interaction.g) objU;
                    } else {
                        gVar2 = gVar;
                    }
                    nVar3 = nVar2;
                    z12 = z11;
                    fVar3 = fVarE;
                    aVar3 = aVar2;
                    i25 = i24;
                }
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(1785516312, i13, -1, "androidx.compose.material3.Slider (Slider.kt:235)");
                }
                Boolean boolValueOf10 = Boolean.valueOf(z12);
                pVarF.T(511388516);
                zS = pVarF.s(boolValueOf10) | pVarF.s(j1VarC);
                objU2 = pVarF.U();
                if (zS) {
                    objU2 = androidx.compose.runtime.internal.b.c(1252336501, true, new yh.q<k1, androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.SliderKt$Slider$6$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(3);
                        }

                        @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                        @androidx.compose.runtime.h
                        public final void a(@dl.d k1 sliderPositions, @dl.e androidx.compose.runtime.p pVar2, int i218) {
                            kotlin.jvm.internal.f0.p(sliderPositions, "sliderPositions");
                            if ((i218 & 14) == 0) {
                                i218 |= pVar2.s(sliderPositions) ? 4 : 2;
                            }
                            if ((i218 & 91) == 18 && pVar2.b()) {
                                pVar2.l();
                                return;
                            }
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(1252336501, i218, -1, "androidx.compose.material3.Slider.<anonymous>.<anonymous> (Slider.kt:259)");
                            }
                            SliderDefaults sliderDefaults = SliderDefaults.f10488a;
                            j1 j1Var12 = j1VarC;
                            boolean z113 = z12;
                            int i30 = i13;
                            sliderDefaults.b(sliderPositions, null, j1Var12, z113, pVar2, (i218 & 14) | 24576 | ((i30 >> 15) & bb.c.b.f30796me) | (i30 & bb.c.g.f32954lc), 2);
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                        }

                        @Override // yh.q
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(k1 k1Var, androidx.compose.runtime.p pVar2, Integer num) {
                            a(k1Var, pVar2, num.intValue());
                            return kotlin.b2.f124493a;
                        }
                    });
                    pVarF.N(objU2);
                } else {
                    objU2 = androidx.compose.runtime.internal.b.c(1252336501, true, new yh.q<k1, androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.SliderKt$Slider$6$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(3);
                        }

                        @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                        @androidx.compose.runtime.h
                        public final void a(@dl.d k1 sliderPositions, @dl.e androidx.compose.runtime.p pVar2, int i218) {
                            kotlin.jvm.internal.f0.p(sliderPositions, "sliderPositions");
                            if ((i218 & 14) == 0) {
                                i218 |= pVar2.s(sliderPositions) ? 4 : 2;
                            }
                            if ((i218 & 91) == 18 && pVar2.b()) {
                                pVar2.l();
                                return;
                            }
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(1252336501, i218, -1, "androidx.compose.material3.Slider.<anonymous>.<anonymous> (Slider.kt:259)");
                            }
                            SliderDefaults sliderDefaults = SliderDefaults.f10488a;
                            j1 j1Var12 = j1VarC;
                            boolean z113 = z12;
                            int i30 = i13;
                            sliderDefaults.b(sliderPositions, null, j1Var12, z113, pVar2, (i218 & 14) | 24576 | ((i30 >> 15) & bb.c.b.f30796me) | (i30 & bb.c.g.f32954lc), 2);
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                        }

                        @Override // yh.q
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(k1 k1Var, androidx.compose.runtime.p pVar2, Integer num) {
                            a(k1Var, pVar2, num.intValue());
                            return kotlin.b2.f124493a;
                        }
                    });
                    pVarF.N(objU2);
                }
                pVarF.c0();
                int i218 = i13 << 3;
                j1 j1Var12 = j1VarC;
                boolean z113 = z12;
                e(f10, onValueChange, (yh.q) objU2, nVar3, z12, fVar3, i25, aVar3, j1VarC, gVar2, thumb, pVarF, (i13 & 14) | (i13 & 112) | (i218 & bb.c.g.f32954lc) | (57344 & i218) | (458752 & i218) | (i218 & 3670016) | (i218 & 29360128) | (i218 & 234881024) | (i218 & 1879048192), (i13 >> 27) & 14, 0);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                nVar4 = nVar3;
                fVar4 = fVar3;
                i26 = i25;
                aVar4 = aVar3;
                gVar3 = gVar2;
                j1Var2 = j1Var12;
                z13 = z113;
            } else {
                pVarF.W();
                if ((i11 & 1) != 0) {
                    if (i27 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar2 = nVar;
                    }
                    if (i14 != 0) {
                        z11 = true;
                    } else {
                        z11 = z10;
                    }
                    if ((i12 & 16) != 0) {
                        fVarE = fi.t.e(0.0f, 1.0f);
                        i13 &= -57345;
                    } else {
                        fVarE = fVar2;
                    }
                    if (i16 != 0) {
                        i24 = 0;
                    } else {
                        i24 = i17;
                    }
                    if (i19 != 0) {
                        aVar2 = null;
                    }
                    if ((i12 & 128) != 0) {
                        j1VarC = SliderDefaults.f10488a.c(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, pVarF, 0, 6, 1023);
                        i13 &= -29360129;
                    } else {
                        j1VarC = j1Var;
                    }
                    if (i21 != 0) {
                        pVarF.T(-492369756);
                        objU = pVarF.U();
                        if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                            objU = androidx.compose.foundation.interaction.f.a();
                            pVarF.N(objU);
                        }
                        pVarF.c0();
                        gVar2 = (androidx.compose.foundation.interaction.g) objU;
                    } else {
                        gVar2 = gVar;
                    }
                    nVar3 = nVar2;
                    z12 = z11;
                    fVar3 = fVarE;
                    aVar3 = aVar2;
                    i25 = i24;
                } else {
                    if (i27 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar2 = nVar;
                    }
                    if (i14 != 0) {
                        z11 = true;
                    } else {
                        z11 = z10;
                    }
                    if ((i12 & 16) != 0) {
                        fVarE = fi.t.e(0.0f, 1.0f);
                        i13 &= -57345;
                    } else {
                        fVarE = fVar2;
                    }
                    if (i16 != 0) {
                        i24 = 0;
                    } else {
                        i24 = i17;
                    }
                    if (i19 != 0) {
                        aVar2 = null;
                    }
                    if ((i12 & 128) != 0) {
                        j1VarC = SliderDefaults.f10488a.c(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, pVarF, 0, 6, 1023);
                        i13 &= -29360129;
                    } else {
                        j1VarC = j1Var;
                    }
                    if (i21 != 0) {
                        pVarF.T(-492369756);
                        objU = pVarF.U();
                        if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                            objU = androidx.compose.foundation.interaction.f.a();
                            pVarF.N(objU);
                        }
                        pVarF.c0();
                        gVar2 = (androidx.compose.foundation.interaction.g) objU;
                    } else {
                        gVar2 = gVar;
                    }
                    nVar3 = nVar2;
                    z12 = z11;
                    fVar3 = fVarE;
                    aVar3 = aVar2;
                    i25 = i24;
                }
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(1785516312, i13, -1, "androidx.compose.material3.Slider (Slider.kt:235)");
                }
                Boolean boolValueOf11 = Boolean.valueOf(z12);
                pVarF.T(511388516);
                zS = pVarF.s(boolValueOf11) | pVarF.s(j1VarC);
                objU2 = pVarF.U();
                if (zS) {
                    objU2 = androidx.compose.runtime.internal.b.c(1252336501, true, new yh.q<k1, androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.SliderKt$Slider$6$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(3);
                        }

                        @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                        @androidx.compose.runtime.h
                        public final void a(@dl.d k1 sliderPositions, @dl.e androidx.compose.runtime.p pVar2, int i219) {
                            kotlin.jvm.internal.f0.p(sliderPositions, "sliderPositions");
                            if ((i219 & 14) == 0) {
                                i219 |= pVar2.s(sliderPositions) ? 4 : 2;
                            }
                            if ((i219 & 91) == 18 && pVar2.b()) {
                                pVar2.l();
                                return;
                            }
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(1252336501, i219, -1, "androidx.compose.material3.Slider.<anonymous>.<anonymous> (Slider.kt:259)");
                            }
                            SliderDefaults sliderDefaults = SliderDefaults.f10488a;
                            j1 j1Var13 = j1VarC;
                            boolean z114 = z12;
                            int i30 = i13;
                            sliderDefaults.b(sliderPositions, null, j1Var13, z114, pVar2, (i219 & 14) | 24576 | ((i30 >> 15) & bb.c.b.f30796me) | (i30 & bb.c.g.f32954lc), 2);
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                        }

                        @Override // yh.q
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(k1 k1Var, androidx.compose.runtime.p pVar2, Integer num) {
                            a(k1Var, pVar2, num.intValue());
                            return kotlin.b2.f124493a;
                        }
                    });
                    pVarF.N(objU2);
                } else {
                    objU2 = androidx.compose.runtime.internal.b.c(1252336501, true, new yh.q<k1, androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.SliderKt$Slider$6$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(3);
                        }

                        @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                        @androidx.compose.runtime.h
                        public final void a(@dl.d k1 sliderPositions, @dl.e androidx.compose.runtime.p pVar2, int i219) {
                            kotlin.jvm.internal.f0.p(sliderPositions, "sliderPositions");
                            if ((i219 & 14) == 0) {
                                i219 |= pVar2.s(sliderPositions) ? 4 : 2;
                            }
                            if ((i219 & 91) == 18 && pVar2.b()) {
                                pVar2.l();
                                return;
                            }
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(1252336501, i219, -1, "androidx.compose.material3.Slider.<anonymous>.<anonymous> (Slider.kt:259)");
                            }
                            SliderDefaults sliderDefaults = SliderDefaults.f10488a;
                            j1 j1Var13 = j1VarC;
                            boolean z114 = z12;
                            int i30 = i13;
                            sliderDefaults.b(sliderPositions, null, j1Var13, z114, pVar2, (i219 & 14) | 24576 | ((i30 >> 15) & bb.c.b.f30796me) | (i30 & bb.c.g.f32954lc), 2);
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                        }

                        @Override // yh.q
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(k1 k1Var, androidx.compose.runtime.p pVar2, Integer num) {
                            a(k1Var, pVar2, num.intValue());
                            return kotlin.b2.f124493a;
                        }
                    });
                    pVarF.N(objU2);
                }
                pVarF.c0();
                int i219 = i13 << 3;
                j1 j1Var13 = j1VarC;
                boolean z114 = z12;
                e(f10, onValueChange, (yh.q) objU2, nVar3, z12, fVar3, i25, aVar3, j1VarC, gVar2, thumb, pVarF, (i13 & 14) | (i13 & 112) | (i219 & bb.c.g.f32954lc) | (57344 & i219) | (458752 & i219) | (i219 & 3670016) | (i219 & 29360128) | (i219 & 234881024) | (i219 & 1879048192), (i13 >> 27) & 14, 0);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                nVar4 = nVar3;
                fVar4 = fVar3;
                i26 = i25;
                aVar4 = aVar3;
                gVar3 = gVar2;
                j1Var2 = j1Var13;
                z13 = z114;
            }
            u1VarH = pVarF.H();
            if (u1VarH == null) {
                return;
            }
            u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.SliderKt$Slider$7
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void a(@dl.e androidx.compose.runtime.p pVar2, int i30) {
                    SliderKt.d(f10, onValueChange, nVar4, z13, fVar4, i26, aVar4, j1Var2, gVar3, thumb, pVar2, i11 | 1, i12);
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                    a(pVar2, num.intValue());
                    return kotlin.b2.f124493a;
                }
            });
        }
        i13 |= bb.c.d.f31193dj;
        if ((i11 & 57344) == 0) {
            if ((i12 & 16) == 0) {
                fVar2 = fVar;
                if (pVarF.s(fVar2)) {
                }
                i13 |= i28;
            } else {
                fVar2 = fVar;
            }
            i13 |= i28;
        } else {
            fVar2 = fVar;
        }
        i16 = i12 & 32;
        if (i16 != 0) {
            i13 |= androidx.profileinstaller.o.c.f26824k;
            i17 = i10;
        } else {
            i17 = i10;
            if ((i11 & 458752) == 0) {
                if (pVarF.y(i17)) {
                    i18 = 131072;
                } else {
                    i18 = 65536;
                }
                i13 |= i18;
            }
        }
        i19 = i12 & 64;
        if (i19 != 0) {
            i13 |= 1572864;
            aVar2 = aVar;
        } else {
            aVar2 = aVar;
            if ((i11 & 3670016) == 0) {
                if (pVarF.s(aVar2)) {
                    i20 = 1048576;
                } else {
                    i20 = 524288;
                }
                i13 |= i20;
            }
        }
        if ((i11 & 29360128) != 0) {
            i13 |= ((i12 & 128) == 0 || !pVarF.s(j1Var)) ? 4194304 : 8388608;
        }
        i21 = i12 & 256;
        if (i21 != 0) {
            i13 |= 100663296;
        } else if ((i11 & 234881024) == 0) {
            if (pVarF.s(gVar)) {
                i22 = 67108864;
            } else {
                i22 = 33554432;
            }
            i13 |= i22;
        }
        if ((i12 & 512) != 0) {
            if ((i11 & 1879048192) == 0) {
                if (pVarF.s(thumb)) {
                    i23 = 536870912;
                } else {
                    i23 = 268435456;
                }
            }
            if ((1533916891 & i13) == 306783378) {
                pVarF.W();
                if ((i11 & 1) != 0) {
                    if (i27 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar2 = nVar;
                    }
                    if (i14 != 0) {
                        z11 = true;
                    } else {
                        z11 = z10;
                    }
                    if ((i12 & 16) != 0) {
                        fVarE = fi.t.e(0.0f, 1.0f);
                        i13 &= -57345;
                    } else {
                        fVarE = fVar2;
                    }
                    if (i16 != 0) {
                        i24 = 0;
                    } else {
                        i24 = i17;
                    }
                    if (i19 != 0) {
                        aVar2 = null;
                    }
                    if ((i12 & 128) != 0) {
                        j1VarC = SliderDefaults.f10488a.c(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, pVarF, 0, 6, 1023);
                        i13 &= -29360129;
                    } else {
                        j1VarC = j1Var;
                    }
                    if (i21 != 0) {
                        pVarF.T(-492369756);
                        objU = pVarF.U();
                        if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                            objU = androidx.compose.foundation.interaction.f.a();
                            pVarF.N(objU);
                        }
                        pVarF.c0();
                        gVar2 = (androidx.compose.foundation.interaction.g) objU;
                    } else {
                        gVar2 = gVar;
                    }
                    nVar3 = nVar2;
                    z12 = z11;
                    fVar3 = fVarE;
                    aVar3 = aVar2;
                    i25 = i24;
                } else {
                    if (i27 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar2 = nVar;
                    }
                    if (i14 != 0) {
                        z11 = true;
                    } else {
                        z11 = z10;
                    }
                    if ((i12 & 16) != 0) {
                        fVarE = fi.t.e(0.0f, 1.0f);
                        i13 &= -57345;
                    } else {
                        fVarE = fVar2;
                    }
                    if (i16 != 0) {
                        i24 = 0;
                    } else {
                        i24 = i17;
                    }
                    if (i19 != 0) {
                        aVar2 = null;
                    }
                    if ((i12 & 128) != 0) {
                        j1VarC = SliderDefaults.f10488a.c(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, pVarF, 0, 6, 1023);
                        i13 &= -29360129;
                    } else {
                        j1VarC = j1Var;
                    }
                    if (i21 != 0) {
                        pVarF.T(-492369756);
                        objU = pVarF.U();
                        if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                            objU = androidx.compose.foundation.interaction.f.a();
                            pVarF.N(objU);
                        }
                        pVarF.c0();
                        gVar2 = (androidx.compose.foundation.interaction.g) objU;
                    } else {
                        gVar2 = gVar;
                    }
                    nVar3 = nVar2;
                    z12 = z11;
                    fVar3 = fVarE;
                    aVar3 = aVar2;
                    i25 = i24;
                }
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(1785516312, i13, -1, "androidx.compose.material3.Slider (Slider.kt:235)");
                }
                Boolean boolValueOf12 = Boolean.valueOf(z12);
                pVarF.T(511388516);
                zS = pVarF.s(boolValueOf12) | pVarF.s(j1VarC);
                objU2 = pVarF.U();
                if (zS) {
                    objU2 = androidx.compose.runtime.internal.b.c(1252336501, true, new yh.q<k1, androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.SliderKt$Slider$6$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(3);
                        }

                        @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                        @androidx.compose.runtime.h
                        public final void a(@dl.d k1 sliderPositions, @dl.e androidx.compose.runtime.p pVar2, int i2110) {
                            kotlin.jvm.internal.f0.p(sliderPositions, "sliderPositions");
                            if ((i2110 & 14) == 0) {
                                i2110 |= pVar2.s(sliderPositions) ? 4 : 2;
                            }
                            if ((i2110 & 91) == 18 && pVar2.b()) {
                                pVar2.l();
                                return;
                            }
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(1252336501, i2110, -1, "androidx.compose.material3.Slider.<anonymous>.<anonymous> (Slider.kt:259)");
                            }
                            SliderDefaults sliderDefaults = SliderDefaults.f10488a;
                            j1 j1Var14 = j1VarC;
                            boolean z115 = z12;
                            int i30 = i13;
                            sliderDefaults.b(sliderPositions, null, j1Var14, z115, pVar2, (i2110 & 14) | 24576 | ((i30 >> 15) & bb.c.b.f30796me) | (i30 & bb.c.g.f32954lc), 2);
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                        }

                        @Override // yh.q
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(k1 k1Var, androidx.compose.runtime.p pVar2, Integer num) {
                            a(k1Var, pVar2, num.intValue());
                            return kotlin.b2.f124493a;
                        }
                    });
                    pVarF.N(objU2);
                } else {
                    objU2 = androidx.compose.runtime.internal.b.c(1252336501, true, new yh.q<k1, androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.SliderKt$Slider$6$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(3);
                        }

                        @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                        @androidx.compose.runtime.h
                        public final void a(@dl.d k1 sliderPositions, @dl.e androidx.compose.runtime.p pVar2, int i2110) {
                            kotlin.jvm.internal.f0.p(sliderPositions, "sliderPositions");
                            if ((i2110 & 14) == 0) {
                                i2110 |= pVar2.s(sliderPositions) ? 4 : 2;
                            }
                            if ((i2110 & 91) == 18 && pVar2.b()) {
                                pVar2.l();
                                return;
                            }
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(1252336501, i2110, -1, "androidx.compose.material3.Slider.<anonymous>.<anonymous> (Slider.kt:259)");
                            }
                            SliderDefaults sliderDefaults = SliderDefaults.f10488a;
                            j1 j1Var14 = j1VarC;
                            boolean z115 = z12;
                            int i30 = i13;
                            sliderDefaults.b(sliderPositions, null, j1Var14, z115, pVar2, (i2110 & 14) | 24576 | ((i30 >> 15) & bb.c.b.f30796me) | (i30 & bb.c.g.f32954lc), 2);
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                        }

                        @Override // yh.q
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(k1 k1Var, androidx.compose.runtime.p pVar2, Integer num) {
                            a(k1Var, pVar2, num.intValue());
                            return kotlin.b2.f124493a;
                        }
                    });
                    pVarF.N(objU2);
                }
                pVarF.c0();
                int i2110 = i13 << 3;
                j1 j1Var14 = j1VarC;
                boolean z115 = z12;
                e(f10, onValueChange, (yh.q) objU2, nVar3, z12, fVar3, i25, aVar3, j1VarC, gVar2, thumb, pVarF, (i13 & 14) | (i13 & 112) | (i2110 & bb.c.g.f32954lc) | (57344 & i2110) | (458752 & i2110) | (i2110 & 3670016) | (i2110 & 29360128) | (i2110 & 234881024) | (i2110 & 1879048192), (i13 >> 27) & 14, 0);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                nVar4 = nVar3;
                fVar4 = fVar3;
                i26 = i25;
                aVar4 = aVar3;
                gVar3 = gVar2;
                j1Var2 = j1Var14;
                z13 = z115;
            } else {
                pVarF.W();
                if ((i11 & 1) != 0) {
                    if (i27 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar2 = nVar;
                    }
                    if (i14 != 0) {
                        z11 = true;
                    } else {
                        z11 = z10;
                    }
                    if ((i12 & 16) != 0) {
                        fVarE = fi.t.e(0.0f, 1.0f);
                        i13 &= -57345;
                    } else {
                        fVarE = fVar2;
                    }
                    if (i16 != 0) {
                        i24 = 0;
                    } else {
                        i24 = i17;
                    }
                    if (i19 != 0) {
                        aVar2 = null;
                    }
                    if ((i12 & 128) != 0) {
                        j1VarC = SliderDefaults.f10488a.c(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, pVarF, 0, 6, 1023);
                        i13 &= -29360129;
                    } else {
                        j1VarC = j1Var;
                    }
                    if (i21 != 0) {
                        pVarF.T(-492369756);
                        objU = pVarF.U();
                        if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                            objU = androidx.compose.foundation.interaction.f.a();
                            pVarF.N(objU);
                        }
                        pVarF.c0();
                        gVar2 = (androidx.compose.foundation.interaction.g) objU;
                    } else {
                        gVar2 = gVar;
                    }
                    nVar3 = nVar2;
                    z12 = z11;
                    fVar3 = fVarE;
                    aVar3 = aVar2;
                    i25 = i24;
                } else {
                    if (i27 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar2 = nVar;
                    }
                    if (i14 != 0) {
                        z11 = true;
                    } else {
                        z11 = z10;
                    }
                    if ((i12 & 16) != 0) {
                        fVarE = fi.t.e(0.0f, 1.0f);
                        i13 &= -57345;
                    } else {
                        fVarE = fVar2;
                    }
                    if (i16 != 0) {
                        i24 = 0;
                    } else {
                        i24 = i17;
                    }
                    if (i19 != 0) {
                        aVar2 = null;
                    }
                    if ((i12 & 128) != 0) {
                        j1VarC = SliderDefaults.f10488a.c(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, pVarF, 0, 6, 1023);
                        i13 &= -29360129;
                    } else {
                        j1VarC = j1Var;
                    }
                    if (i21 != 0) {
                        pVarF.T(-492369756);
                        objU = pVarF.U();
                        if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                            objU = androidx.compose.foundation.interaction.f.a();
                            pVarF.N(objU);
                        }
                        pVarF.c0();
                        gVar2 = (androidx.compose.foundation.interaction.g) objU;
                    } else {
                        gVar2 = gVar;
                    }
                    nVar3 = nVar2;
                    z12 = z11;
                    fVar3 = fVarE;
                    aVar3 = aVar2;
                    i25 = i24;
                }
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(1785516312, i13, -1, "androidx.compose.material3.Slider (Slider.kt:235)");
                }
                Boolean boolValueOf13 = Boolean.valueOf(z12);
                pVarF.T(511388516);
                zS = pVarF.s(boolValueOf13) | pVarF.s(j1VarC);
                objU2 = pVarF.U();
                if (zS) {
                    objU2 = androidx.compose.runtime.internal.b.c(1252336501, true, new yh.q<k1, androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.SliderKt$Slider$6$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(3);
                        }

                        @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                        @androidx.compose.runtime.h
                        public final void a(@dl.d k1 sliderPositions, @dl.e androidx.compose.runtime.p pVar2, int i2111) {
                            kotlin.jvm.internal.f0.p(sliderPositions, "sliderPositions");
                            if ((i2111 & 14) == 0) {
                                i2111 |= pVar2.s(sliderPositions) ? 4 : 2;
                            }
                            if ((i2111 & 91) == 18 && pVar2.b()) {
                                pVar2.l();
                                return;
                            }
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(1252336501, i2111, -1, "androidx.compose.material3.Slider.<anonymous>.<anonymous> (Slider.kt:259)");
                            }
                            SliderDefaults sliderDefaults = SliderDefaults.f10488a;
                            j1 j1Var15 = j1VarC;
                            boolean z116 = z12;
                            int i30 = i13;
                            sliderDefaults.b(sliderPositions, null, j1Var15, z116, pVar2, (i2111 & 14) | 24576 | ((i30 >> 15) & bb.c.b.f30796me) | (i30 & bb.c.g.f32954lc), 2);
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                        }

                        @Override // yh.q
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(k1 k1Var, androidx.compose.runtime.p pVar2, Integer num) {
                            a(k1Var, pVar2, num.intValue());
                            return kotlin.b2.f124493a;
                        }
                    });
                    pVarF.N(objU2);
                } else {
                    objU2 = androidx.compose.runtime.internal.b.c(1252336501, true, new yh.q<k1, androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.SliderKt$Slider$6$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(3);
                        }

                        @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                        @androidx.compose.runtime.h
                        public final void a(@dl.d k1 sliderPositions, @dl.e androidx.compose.runtime.p pVar2, int i2111) {
                            kotlin.jvm.internal.f0.p(sliderPositions, "sliderPositions");
                            if ((i2111 & 14) == 0) {
                                i2111 |= pVar2.s(sliderPositions) ? 4 : 2;
                            }
                            if ((i2111 & 91) == 18 && pVar2.b()) {
                                pVar2.l();
                                return;
                            }
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(1252336501, i2111, -1, "androidx.compose.material3.Slider.<anonymous>.<anonymous> (Slider.kt:259)");
                            }
                            SliderDefaults sliderDefaults = SliderDefaults.f10488a;
                            j1 j1Var15 = j1VarC;
                            boolean z116 = z12;
                            int i30 = i13;
                            sliderDefaults.b(sliderPositions, null, j1Var15, z116, pVar2, (i2111 & 14) | 24576 | ((i30 >> 15) & bb.c.b.f30796me) | (i30 & bb.c.g.f32954lc), 2);
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                        }

                        @Override // yh.q
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(k1 k1Var, androidx.compose.runtime.p pVar2, Integer num) {
                            a(k1Var, pVar2, num.intValue());
                            return kotlin.b2.f124493a;
                        }
                    });
                    pVarF.N(objU2);
                }
                pVarF.c0();
                int i2111 = i13 << 3;
                j1 j1Var15 = j1VarC;
                boolean z116 = z12;
                e(f10, onValueChange, (yh.q) objU2, nVar3, z12, fVar3, i25, aVar3, j1VarC, gVar2, thumb, pVarF, (i13 & 14) | (i13 & 112) | (i2111 & bb.c.g.f32954lc) | (57344 & i2111) | (458752 & i2111) | (i2111 & 3670016) | (i2111 & 29360128) | (i2111 & 234881024) | (i2111 & 1879048192), (i13 >> 27) & 14, 0);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                nVar4 = nVar3;
                fVar4 = fVar3;
                i26 = i25;
                aVar4 = aVar3;
                gVar3 = gVar2;
                j1Var2 = j1Var15;
                z13 = z116;
            }
            u1VarH = pVarF.H();
            if (u1VarH == null) {
                return;
            }
            u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.SliderKt$Slider$7
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void a(@dl.e androidx.compose.runtime.p pVar2, int i30) {
                    SliderKt.d(f10, onValueChange, nVar4, z13, fVar4, i26, aVar4, j1Var2, gVar3, thumb, pVar2, i11 | 1, i12);
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                    a(pVar2, num.intValue());
                    return kotlin.b2.f124493a;
                }
            });
        }
        i23 = com.google.android.exoplayer2.j.G;
        i13 |= i23;
        if ((1533916891 & i13) == 306783378) {
            pVarF.W();
            if ((i11 & 1) != 0) {
                if (i27 != 0) {
                    nVar2 = androidx.compose.ui.n.INSTANCE;
                } else {
                    nVar2 = nVar;
                }
                if (i14 != 0) {
                    z11 = true;
                } else {
                    z11 = z10;
                }
                if ((i12 & 16) != 0) {
                    fVarE = fi.t.e(0.0f, 1.0f);
                    i13 &= -57345;
                } else {
                    fVarE = fVar2;
                }
                if (i16 != 0) {
                    i24 = 0;
                } else {
                    i24 = i17;
                }
                if (i19 != 0) {
                    aVar2 = null;
                }
                if ((i12 & 128) != 0) {
                    j1VarC = SliderDefaults.f10488a.c(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, pVarF, 0, 6, 1023);
                    i13 &= -29360129;
                } else {
                    j1VarC = j1Var;
                }
                if (i21 != 0) {
                    pVarF.T(-492369756);
                    objU = pVarF.U();
                    if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                        objU = androidx.compose.foundation.interaction.f.a();
                        pVarF.N(objU);
                    }
                    pVarF.c0();
                    gVar2 = (androidx.compose.foundation.interaction.g) objU;
                } else {
                    gVar2 = gVar;
                }
                nVar3 = nVar2;
                z12 = z11;
                fVar3 = fVarE;
                aVar3 = aVar2;
                i25 = i24;
            } else {
                if (i27 != 0) {
                    nVar2 = androidx.compose.ui.n.INSTANCE;
                } else {
                    nVar2 = nVar;
                }
                if (i14 != 0) {
                    z11 = true;
                } else {
                    z11 = z10;
                }
                if ((i12 & 16) != 0) {
                    fVarE = fi.t.e(0.0f, 1.0f);
                    i13 &= -57345;
                } else {
                    fVarE = fVar2;
                }
                if (i16 != 0) {
                    i24 = 0;
                } else {
                    i24 = i17;
                }
                if (i19 != 0) {
                    aVar2 = null;
                }
                if ((i12 & 128) != 0) {
                    j1VarC = SliderDefaults.f10488a.c(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, pVarF, 0, 6, 1023);
                    i13 &= -29360129;
                } else {
                    j1VarC = j1Var;
                }
                if (i21 != 0) {
                    pVarF.T(-492369756);
                    objU = pVarF.U();
                    if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                        objU = androidx.compose.foundation.interaction.f.a();
                        pVarF.N(objU);
                    }
                    pVarF.c0();
                    gVar2 = (androidx.compose.foundation.interaction.g) objU;
                } else {
                    gVar2 = gVar;
                }
                nVar3 = nVar2;
                z12 = z11;
                fVar3 = fVarE;
                aVar3 = aVar2;
                i25 = i24;
            }
            pVarF.O();
            if (ComposerKt.g0()) {
                ComposerKt.w0(1785516312, i13, -1, "androidx.compose.material3.Slider (Slider.kt:235)");
            }
            Boolean boolValueOf14 = Boolean.valueOf(z12);
            pVarF.T(511388516);
            zS = pVarF.s(boolValueOf14) | pVarF.s(j1VarC);
            objU2 = pVarF.U();
            if (zS) {
                objU2 = androidx.compose.runtime.internal.b.c(1252336501, true, new yh.q<k1, androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.SliderKt$Slider$6$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(3);
                    }

                    @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                    @androidx.compose.runtime.h
                    public final void a(@dl.d k1 sliderPositions, @dl.e androidx.compose.runtime.p pVar2, int i2112) {
                        kotlin.jvm.internal.f0.p(sliderPositions, "sliderPositions");
                        if ((i2112 & 14) == 0) {
                            i2112 |= pVar2.s(sliderPositions) ? 4 : 2;
                        }
                        if ((i2112 & 91) == 18 && pVar2.b()) {
                            pVar2.l();
                            return;
                        }
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(1252336501, i2112, -1, "androidx.compose.material3.Slider.<anonymous>.<anonymous> (Slider.kt:259)");
                        }
                        SliderDefaults sliderDefaults = SliderDefaults.f10488a;
                        j1 j1Var16 = j1VarC;
                        boolean z117 = z12;
                        int i30 = i13;
                        sliderDefaults.b(sliderPositions, null, j1Var16, z117, pVar2, (i2112 & 14) | 24576 | ((i30 >> 15) & bb.c.b.f30796me) | (i30 & bb.c.g.f32954lc), 2);
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                    }

                    @Override // yh.q
                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(k1 k1Var, androidx.compose.runtime.p pVar2, Integer num) {
                        a(k1Var, pVar2, num.intValue());
                        return kotlin.b2.f124493a;
                    }
                });
                pVarF.N(objU2);
            } else {
                objU2 = androidx.compose.runtime.internal.b.c(1252336501, true, new yh.q<k1, androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.SliderKt$Slider$6$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(3);
                    }

                    @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                    @androidx.compose.runtime.h
                    public final void a(@dl.d k1 sliderPositions, @dl.e androidx.compose.runtime.p pVar2, int i2112) {
                        kotlin.jvm.internal.f0.p(sliderPositions, "sliderPositions");
                        if ((i2112 & 14) == 0) {
                            i2112 |= pVar2.s(sliderPositions) ? 4 : 2;
                        }
                        if ((i2112 & 91) == 18 && pVar2.b()) {
                            pVar2.l();
                            return;
                        }
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(1252336501, i2112, -1, "androidx.compose.material3.Slider.<anonymous>.<anonymous> (Slider.kt:259)");
                        }
                        SliderDefaults sliderDefaults = SliderDefaults.f10488a;
                        j1 j1Var16 = j1VarC;
                        boolean z117 = z12;
                        int i30 = i13;
                        sliderDefaults.b(sliderPositions, null, j1Var16, z117, pVar2, (i2112 & 14) | 24576 | ((i30 >> 15) & bb.c.b.f30796me) | (i30 & bb.c.g.f32954lc), 2);
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                    }

                    @Override // yh.q
                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(k1 k1Var, androidx.compose.runtime.p pVar2, Integer num) {
                        a(k1Var, pVar2, num.intValue());
                        return kotlin.b2.f124493a;
                    }
                });
                pVarF.N(objU2);
            }
            pVarF.c0();
            int i2112 = i13 << 3;
            j1 j1Var16 = j1VarC;
            boolean z117 = z12;
            e(f10, onValueChange, (yh.q) objU2, nVar3, z12, fVar3, i25, aVar3, j1VarC, gVar2, thumb, pVarF, (i13 & 14) | (i13 & 112) | (i2112 & bb.c.g.f32954lc) | (57344 & i2112) | (458752 & i2112) | (i2112 & 3670016) | (i2112 & 29360128) | (i2112 & 234881024) | (i2112 & 1879048192), (i13 >> 27) & 14, 0);
            if (ComposerKt.g0()) {
                ComposerKt.v0();
            }
            nVar4 = nVar3;
            fVar4 = fVar3;
            i26 = i25;
            aVar4 = aVar3;
            gVar3 = gVar2;
            j1Var2 = j1Var16;
            z13 = z117;
        } else {
            pVarF.W();
            if ((i11 & 1) != 0) {
                if (i27 != 0) {
                    nVar2 = androidx.compose.ui.n.INSTANCE;
                } else {
                    nVar2 = nVar;
                }
                if (i14 != 0) {
                    z11 = true;
                } else {
                    z11 = z10;
                }
                if ((i12 & 16) != 0) {
                    fVarE = fi.t.e(0.0f, 1.0f);
                    i13 &= -57345;
                } else {
                    fVarE = fVar2;
                }
                if (i16 != 0) {
                    i24 = 0;
                } else {
                    i24 = i17;
                }
                if (i19 != 0) {
                    aVar2 = null;
                }
                if ((i12 & 128) != 0) {
                    j1VarC = SliderDefaults.f10488a.c(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, pVarF, 0, 6, 1023);
                    i13 &= -29360129;
                } else {
                    j1VarC = j1Var;
                }
                if (i21 != 0) {
                    pVarF.T(-492369756);
                    objU = pVarF.U();
                    if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                        objU = androidx.compose.foundation.interaction.f.a();
                        pVarF.N(objU);
                    }
                    pVarF.c0();
                    gVar2 = (androidx.compose.foundation.interaction.g) objU;
                } else {
                    gVar2 = gVar;
                }
                nVar3 = nVar2;
                z12 = z11;
                fVar3 = fVarE;
                aVar3 = aVar2;
                i25 = i24;
            } else {
                if (i27 != 0) {
                    nVar2 = androidx.compose.ui.n.INSTANCE;
                } else {
                    nVar2 = nVar;
                }
                if (i14 != 0) {
                    z11 = true;
                } else {
                    z11 = z10;
                }
                if ((i12 & 16) != 0) {
                    fVarE = fi.t.e(0.0f, 1.0f);
                    i13 &= -57345;
                } else {
                    fVarE = fVar2;
                }
                if (i16 != 0) {
                    i24 = 0;
                } else {
                    i24 = i17;
                }
                if (i19 != 0) {
                    aVar2 = null;
                }
                if ((i12 & 128) != 0) {
                    j1VarC = SliderDefaults.f10488a.c(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, pVarF, 0, 6, 1023);
                    i13 &= -29360129;
                } else {
                    j1VarC = j1Var;
                }
                if (i21 != 0) {
                    pVarF.T(-492369756);
                    objU = pVarF.U();
                    if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                        objU = androidx.compose.foundation.interaction.f.a();
                        pVarF.N(objU);
                    }
                    pVarF.c0();
                    gVar2 = (androidx.compose.foundation.interaction.g) objU;
                } else {
                    gVar2 = gVar;
                }
                nVar3 = nVar2;
                z12 = z11;
                fVar3 = fVarE;
                aVar3 = aVar2;
                i25 = i24;
            }
            pVarF.O();
            if (ComposerKt.g0()) {
                ComposerKt.w0(1785516312, i13, -1, "androidx.compose.material3.Slider (Slider.kt:235)");
            }
            Boolean boolValueOf15 = Boolean.valueOf(z12);
            pVarF.T(511388516);
            zS = pVarF.s(boolValueOf15) | pVarF.s(j1VarC);
            objU2 = pVarF.U();
            if (zS) {
                objU2 = androidx.compose.runtime.internal.b.c(1252336501, true, new yh.q<k1, androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.SliderKt$Slider$6$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(3);
                    }

                    @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                    @androidx.compose.runtime.h
                    public final void a(@dl.d k1 sliderPositions, @dl.e androidx.compose.runtime.p pVar2, int i2113) {
                        kotlin.jvm.internal.f0.p(sliderPositions, "sliderPositions");
                        if ((i2113 & 14) == 0) {
                            i2113 |= pVar2.s(sliderPositions) ? 4 : 2;
                        }
                        if ((i2113 & 91) == 18 && pVar2.b()) {
                            pVar2.l();
                            return;
                        }
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(1252336501, i2113, -1, "androidx.compose.material3.Slider.<anonymous>.<anonymous> (Slider.kt:259)");
                        }
                        SliderDefaults sliderDefaults = SliderDefaults.f10488a;
                        j1 j1Var17 = j1VarC;
                        boolean z118 = z12;
                        int i30 = i13;
                        sliderDefaults.b(sliderPositions, null, j1Var17, z118, pVar2, (i2113 & 14) | 24576 | ((i30 >> 15) & bb.c.b.f30796me) | (i30 & bb.c.g.f32954lc), 2);
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                    }

                    @Override // yh.q
                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(k1 k1Var, androidx.compose.runtime.p pVar2, Integer num) {
                        a(k1Var, pVar2, num.intValue());
                        return kotlin.b2.f124493a;
                    }
                });
                pVarF.N(objU2);
            } else {
                objU2 = androidx.compose.runtime.internal.b.c(1252336501, true, new yh.q<k1, androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.SliderKt$Slider$6$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(3);
                    }

                    @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                    @androidx.compose.runtime.h
                    public final void a(@dl.d k1 sliderPositions, @dl.e androidx.compose.runtime.p pVar2, int i2113) {
                        kotlin.jvm.internal.f0.p(sliderPositions, "sliderPositions");
                        if ((i2113 & 14) == 0) {
                            i2113 |= pVar2.s(sliderPositions) ? 4 : 2;
                        }
                        if ((i2113 & 91) == 18 && pVar2.b()) {
                            pVar2.l();
                            return;
                        }
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(1252336501, i2113, -1, "androidx.compose.material3.Slider.<anonymous>.<anonymous> (Slider.kt:259)");
                        }
                        SliderDefaults sliderDefaults = SliderDefaults.f10488a;
                        j1 j1Var17 = j1VarC;
                        boolean z118 = z12;
                        int i30 = i13;
                        sliderDefaults.b(sliderPositions, null, j1Var17, z118, pVar2, (i2113 & 14) | 24576 | ((i30 >> 15) & bb.c.b.f30796me) | (i30 & bb.c.g.f32954lc), 2);
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                    }

                    @Override // yh.q
                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(k1 k1Var, androidx.compose.runtime.p pVar2, Integer num) {
                        a(k1Var, pVar2, num.intValue());
                        return kotlin.b2.f124493a;
                    }
                });
                pVarF.N(objU2);
            }
            pVarF.c0();
            int i2113 = i13 << 3;
            j1 j1Var17 = j1VarC;
            boolean z118 = z12;
            e(f10, onValueChange, (yh.q) objU2, nVar3, z12, fVar3, i25, aVar3, j1VarC, gVar2, thumb, pVarF, (i13 & 14) | (i13 & 112) | (i2113 & bb.c.g.f32954lc) | (57344 & i2113) | (458752 & i2113) | (i2113 & 3670016) | (i2113 & 29360128) | (i2113 & 234881024) | (i2113 & 1879048192), (i13 >> 27) & 14, 0);
            if (ComposerKt.g0()) {
                ComposerKt.v0();
            }
            nVar4 = nVar3;
            fVar4 = fVar3;
            i26 = i25;
            aVar4 = aVar3;
            gVar3 = gVar2;
            j1Var2 = j1Var17;
            z13 = z118;
        }
        u1VarH = pVarF.H();
        if (u1VarH == null) {
            return;
        }
        u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.SliderKt$Slider$7
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            public final void a(@dl.e androidx.compose.runtime.p pVar2, int i30) {
                SliderKt.d(f10, onValueChange, nVar4, z13, fVar4, i26, aVar4, j1Var2, gVar3, thumb, pVar2, i11 | 1, i12);
            }

            @Override // yh.p
            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                a(pVar2, num.intValue());
                return kotlin.b2.f124493a;
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:101:0x012c  */
    /* JADX WARN: Code duplicated, block: B:103:0x0132  */
    /* JADX WARN: Code duplicated, block: B:104:0x0135  */
    /* JADX WARN: Code duplicated, block: B:108:0x013d  */
    /* JADX WARN: Code duplicated, block: B:110:0x0141  */
    /* JADX WARN: Code duplicated, block: B:113:0x014c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:116:0x0155  */
    /* JADX WARN: Code duplicated, block: B:119:0x0163  */
    /* JADX WARN: Code duplicated, block: B:125:0x0183  */
    /* JADX WARN: Code duplicated, block: B:127:0x018d  */
    /* JADX WARN: Code duplicated, block: B:140:0x01c0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:141:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:142:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:144:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:147:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:148:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:150:0x01db  */
    /* JADX WARN: Code duplicated, block: B:151:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:153:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:154:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:157:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:158:0x020f  */
    /* JADX WARN: Code duplicated, block: B:160:0x0213  */
    /* JADX WARN: Code duplicated, block: B:162:0x0225  */
    /* JADX WARN: Code duplicated, block: B:164:0x0232  */
    /* JADX WARN: Code duplicated, block: B:167:0x0238  */
    /* JADX WARN: Code duplicated, block: B:169:0x0257  */
    /* JADX WARN: Code duplicated, block: B:173:0x0264  */
    /* JADX WARN: Code duplicated, block: B:175:0x028a  */
    /* JADX WARN: Code duplicated, block: B:179:0x02a8  */
    /* JADX WARN: Code duplicated, block: B:181:0x02b2  */
    /* JADX WARN: Code duplicated, block: B:182:0x02b4  */
    /* JADX WARN: Code duplicated, block: B:184:0x02b7  */
    /* JADX WARN: Code duplicated, block: B:186:0x0308  */
    /* JADX WARN: Code duplicated, block: B:191:0x0322  */
    /* JADX WARN: Code duplicated, block: B:193:0x0340  */
    /* JADX WARN: Code duplicated, block: B:195:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:0x0087  */
    /* JADX WARN: Code duplicated, block: B:47:0x008a  */
    /* JADX WARN: Code duplicated, block: B:49:0x008e  */
    /* JADX WARN: Code duplicated, block: B:51:0x0096  */
    /* JADX WARN: Code duplicated, block: B:52:0x0099  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:59:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:67:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:70:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:72:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:77:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:78:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:80:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:82:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:83:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:87:0x0101  */
    /* JADX WARN: Code duplicated, block: B:89:0x0105  */
    /* JADX WARN: Code duplicated, block: B:92:0x0110 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:95:0x0117  */
    /* JADX WARN: Code duplicated, block: B:98:0x011f  */
    /* JADX WARN: Code duplicated, block: B:99:0x0126  */
    @w
    @androidx.compose.runtime.i(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.h
    public static final void e(final float f10, @dl.d final yh.l<? super Float, kotlin.b2> onValueChange, @dl.d final yh.q<? super k1, ? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> track, @dl.e androidx.compose.ui.n nVar, boolean z10, @dl.e fi.f<Float> fVar, int i10, @dl.e yh.a<kotlin.b2> aVar, @dl.e j1 j1Var, @dl.e androidx.compose.foundation.interaction.g gVar, @dl.e yh.q<? super k1, ? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> qVar, @dl.e androidx.compose.runtime.p pVar, final int i11, final int i12, final int i13) {
        final int i14;
        androidx.compose.ui.n nVar2;
        int i15;
        final boolean z11;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        androidx.compose.ui.n nVar3;
        fi.f<Float> fVarE;
        int i25;
        yh.a<kotlin.b2> aVar2;
        final j1 j1VarC;
        final androidx.compose.foundation.interaction.g gVar2;
        boolean z12;
        yh.q<? super k1, ? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> qVar2;
        androidx.compose.foundation.interaction.g gVar3;
        androidx.compose.ui.n nVar4;
        int i26;
        boolean zS;
        Object objU;
        Object objU2;
        boolean z13;
        final androidx.compose.ui.n nVar5;
        final boolean z14;
        final fi.f<Float> fVar2;
        final int i27;
        final yh.a<kotlin.b2> aVar3;
        final j1 j1Var2;
        final androidx.compose.foundation.interaction.g gVar4;
        final yh.q<? super k1, ? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> qVar3;
        androidx.compose.runtime.u1 u1VarH;
        int i28;
        kotlin.jvm.internal.f0.p(onValueChange, "onValueChange");
        kotlin.jvm.internal.f0.p(track, "track");
        androidx.compose.runtime.p pVarF = pVar.F(387052651);
        if ((i13 & 1) != 0) {
            i14 = i11 | 6;
        } else if ((i11 & 14) == 0) {
            i14 = (pVarF.w(f10) ? 4 : 2) | i11;
        } else {
            i14 = i11;
        }
        if ((i13 & 2) != 0) {
            i14 |= 48;
        } else if ((i11 & 112) == 0) {
            i14 |= pVarF.s(onValueChange) ? 32 : 16;
        }
        if ((i13 & 4) != 0) {
            i14 |= bb.c.b.f30966u4;
        } else if ((i11 & bb.c.b.f30796me) == 0) {
            i14 |= pVarF.s(track) ? 256 : 128;
        }
        int i29 = i13 & 8;
        if (i29 == 0) {
            if ((i11 & bb.c.g.f32954lc) == 0) {
                nVar2 = nVar;
                i14 |= pVarF.s(nVar2) ? 2048 : 1024;
            }
            i15 = i13 & 16;
            if (i15 != 0) {
                if ((i11 & 57344) == 0) {
                    z11 = z10;
                    if (pVarF.u(z11)) {
                        i16 = 16384;
                    } else {
                        i16 = 8192;
                    }
                    i14 |= i16;
                }
                if ((i11 & 458752) != 0) {
                    if ((i13 & 32) == 0 || !pVarF.s(fVar)) {
                        i28 = 65536;
                    } else {
                        i28 = 131072;
                    }
                    i14 |= i28;
                }
                i17 = i13 & 64;
                if (i17 != 0) {
                    i14 |= 1572864;
                    i18 = i10;
                } else {
                    i18 = i10;
                    if ((i11 & 3670016) == 0) {
                        if (pVarF.y(i18)) {
                            i19 = 1048576;
                        } else {
                            i19 = 524288;
                        }
                        i14 |= i19;
                    }
                }
                i20 = i13 & 128;
                if (i20 != 0) {
                    i14 |= 12582912;
                } else if ((i11 & 29360128) == 0) {
                    if (pVarF.s(aVar)) {
                        i21 = 8388608;
                    } else {
                        i21 = 4194304;
                    }
                    i14 |= i21;
                }
                if ((i11 & 234881024) != 0) {
                    i14 |= ((i13 & 256) == 0 || !pVarF.s(j1Var)) ? 33554432 : 67108864;
                }
                i22 = i13 & 512;
                if (i22 != 0) {
                    i14 |= com.google.android.exoplayer2.j.G;
                } else if ((i11 & 1879048192) == 0) {
                    if (pVarF.s(gVar)) {
                        i23 = 536870912;
                    } else {
                        i23 = 268435456;
                    }
                    i14 |= i23;
                }
                if ((i12 & 14) == 0) {
                    i24 = i12 | (((i13 & 1024) == 0 || !pVarF.s(qVar)) ? 2 : 4);
                } else {
                    i24 = i12;
                }
                if ((i14 & 1533916891) != 306783378 && (i24 & 11) == 2 && pVarF.b()) {
                    pVarF.l();
                    fVar2 = fVar;
                    gVar4 = gVar;
                    nVar5 = nVar2;
                    z14 = z11;
                    i27 = i18;
                    aVar3 = aVar;
                    j1Var2 = j1Var;
                    qVar3 = qVar;
                } else {
                    pVarF.W();
                    if ((i11 & 1) != 0 || pVarF.o()) {
                        if (i29 != 0) {
                            nVar3 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar3 = nVar2;
                        }
                        if (i15 != 0) {
                            z11 = true;
                        }
                        if ((i13 & 32) != 0) {
                            fVarE = fi.t.e(0.0f, 1.0f);
                            i14 &= -458753;
                        } else {
                            fVarE = fVar;
                        }
                        if (i17 != 0) {
                            i25 = 0;
                        } else {
                            i25 = i18;
                        }
                        if (i20 != 0) {
                            aVar2 = null;
                        } else {
                            aVar2 = aVar;
                        }
                        if ((i13 & 256) != 0) {
                            j1VarC = SliderDefaults.f10488a.c(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, pVarF, 0, 6, 1023);
                            i14 &= -234881025;
                        } else {
                            j1VarC = j1Var;
                        }
                        if (i22 != 0) {
                            pVarF.T(-492369756);
                            objU2 = pVarF.U();
                            if (objU2 == androidx.compose.runtime.p.INSTANCE.a()) {
                                objU2 = androidx.compose.foundation.interaction.f.a();
                                pVarF.N(objU2);
                            }
                            pVarF.c0();
                            gVar2 = (androidx.compose.foundation.interaction.g) objU2;
                        } else {
                            gVar2 = gVar;
                        }
                        if ((i13 & 1024) != 0) {
                            Boolean boolValueOf = Boolean.valueOf(z11);
                            pVarF.T(1618982084);
                            zS = pVarF.s(gVar2) | pVarF.s(j1VarC) | pVarF.s(boolValueOf);
                            objU = pVarF.U();
                            if (!zS || objU == androidx.compose.runtime.p.INSTANCE.a()) {
                                yh.q<k1, androidx.compose.runtime.p, Integer, kotlin.b2> qVar4 = new yh.q<k1, androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.SliderKt$Slider$9$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(3);
                                    }

                                    @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                                    @androidx.compose.runtime.h
                                    public final void a(@dl.d k1 it, @dl.e androidx.compose.runtime.p pVar2, int i30) {
                                        kotlin.jvm.internal.f0.p(it, "it");
                                        if ((i30 & 81) == 16 && pVar2.b()) {
                                            pVar2.l();
                                            return;
                                        }
                                        if (ComposerKt.g0()) {
                                            ComposerKt.w0(1647281944, i30, -1, "androidx.compose.material3.Slider.<anonymous>.<anonymous> (Slider.kt:325)");
                                        }
                                        SliderDefaults sliderDefaults = SliderDefaults.f10488a;
                                        androidx.compose.foundation.interaction.g gVar5 = gVar2;
                                        j1 j1Var3 = j1VarC;
                                        boolean z15 = z11;
                                        int i31 = i14;
                                        sliderDefaults.a(gVar5, null, j1Var3, z15, 0L, pVar2, 196608 | ((i31 >> 27) & 14) | ((i31 >> 18) & bb.c.b.f30796me) | ((i31 >> 3) & bb.c.g.f32954lc), 18);
                                        if (ComposerKt.g0()) {
                                            ComposerKt.v0();
                                        }
                                    }

                                    @Override // yh.q
                                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(k1 k1Var, androidx.compose.runtime.p pVar2, Integer num) {
                                        a(k1Var, pVar2, num.intValue());
                                        return kotlin.b2.f124493a;
                                    }
                                };
                                z12 = true;
                                objU = androidx.compose.runtime.internal.b.c(1647281944, true, qVar4);
                                pVarF.N(objU);
                            } else {
                                z12 = true;
                            }
                            pVarF.c0();
                            i24 &= -15;
                            qVar2 = (yh.q) objU;
                        } else {
                            gVar2 = gVar2;
                            z12 = true;
                            qVar2 = qVar;
                        }
                        gVar3 = gVar2;
                        nVar4 = nVar3;
                        i26 = i24;
                    } else {
                        pVarF.l();
                        if ((i13 & 32) != 0) {
                            i14 &= -458753;
                        }
                        if ((i13 & 256) != 0) {
                            i14 &= -234881025;
                        }
                        if ((i13 & 1024) != 0) {
                            i24 &= -15;
                        }
                        fVarE = fVar;
                        aVar2 = aVar;
                        j1VarC = j1Var;
                        gVar3 = gVar;
                        qVar2 = qVar;
                        nVar4 = nVar2;
                        z11 = z11;
                        i25 = i18;
                        i26 = i24;
                        z12 = true;
                    }
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(387052651, i14, i26, "androidx.compose.material3.Slider (Slider.kt:312)");
                    }
                    if (i25 >= 0) {
                        z13 = z12;
                    } else {
                        z13 = false;
                    }
                    if (!z13) {
                        throw new IllegalArgumentException("steps should be >= 0".toString());
                    }
                    int i30 = i14 >> 9;
                    int i31 = i14 << 6;
                    f(nVar4, z11, gVar3, onValueChange, aVar2, i25, f10, fVarE, qVar2, track, pVarF, (i30 & 57344) | (i30 & 14) | (i30 & 112) | ((i14 >> 21) & bb.c.b.f30796me) | (i31 & bb.c.g.f32954lc) | ((i14 >> 3) & 458752) | ((i14 << 18) & 3670016) | (i31 & 29360128) | ((i26 << 24) & 234881024) | ((i14 << 21) & 1879048192));
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    nVar5 = nVar4;
                    z14 = z11;
                    fVar2 = fVarE;
                    i27 = i25;
                    aVar3 = aVar2;
                    j1Var2 = j1VarC;
                    gVar4 = gVar3;
                    qVar3 = qVar2;
                }
                u1VarH = pVarF.H();
                if (u1VarH == null) {
                    return;
                }
                u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.SliderKt$Slider$11
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public final void a(@dl.e androidx.compose.runtime.p pVar2, int i32) {
                        SliderKt.e(f10, onValueChange, track, nVar5, z14, fVar2, i27, aVar3, j1Var2, gVar4, qVar3, pVar2, i11 | 1, i12, i13);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                        a(pVar2, num.intValue());
                        return kotlin.b2.f124493a;
                    }
                });
            }
            i14 |= 24576;
            z11 = z10;
            if ((i11 & 458752) != 0) {
                if ((i13 & 32) == 0) {
                    i28 = 65536;
                } else {
                    i28 = 65536;
                }
                i14 |= i28;
            }
            i17 = i13 & 64;
            if (i17 != 0) {
                i14 |= 1572864;
                i18 = i10;
            } else {
                i18 = i10;
                if ((i11 & 3670016) == 0) {
                    if (pVarF.y(i18)) {
                        i19 = 1048576;
                    } else {
                        i19 = 524288;
                    }
                    i14 |= i19;
                }
            }
            i20 = i13 & 128;
            if (i20 != 0) {
                i14 |= 12582912;
            } else if ((i11 & 29360128) == 0) {
                if (pVarF.s(aVar)) {
                    i21 = 8388608;
                } else {
                    i21 = 4194304;
                }
                i14 |= i21;
            }
            if ((i11 & 234881024) != 0) {
                i14 |= ((i13 & 256) == 0 || !pVarF.s(j1Var)) ? 33554432 : 67108864;
            }
            i22 = i13 & 512;
            if (i22 != 0) {
                i14 |= com.google.android.exoplayer2.j.G;
            } else if ((i11 & 1879048192) == 0) {
                if (pVarF.s(gVar)) {
                    i23 = 536870912;
                } else {
                    i23 = 268435456;
                }
                i14 |= i23;
            }
            if ((i12 & 14) == 0) {
                i24 = i12 | (((i13 & 1024) == 0 || !pVarF.s(qVar)) ? 2 : 4);
            } else {
                i24 = i12;
            }
            if ((i14 & 1533916891) != 306783378) {
                pVarF.W();
                if ((i11 & 1) != 0) {
                    if (i29 != 0) {
                        nVar3 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar3 = nVar2;
                    }
                    if (i15 != 0) {
                        z11 = true;
                    }
                    if ((i13 & 32) != 0) {
                        fVarE = fi.t.e(0.0f, 1.0f);
                        i14 &= -458753;
                    } else {
                        fVarE = fVar;
                    }
                    if (i17 != 0) {
                        i25 = 0;
                    } else {
                        i25 = i18;
                    }
                    if (i20 != 0) {
                        aVar2 = null;
                    } else {
                        aVar2 = aVar;
                    }
                    if ((i13 & 256) != 0) {
                        j1VarC = SliderDefaults.f10488a.c(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, pVarF, 0, 6, 1023);
                        i14 &= -234881025;
                    } else {
                        j1VarC = j1Var;
                    }
                    if (i22 != 0) {
                        pVarF.T(-492369756);
                        objU2 = pVarF.U();
                        if (objU2 == androidx.compose.runtime.p.INSTANCE.a()) {
                            objU2 = androidx.compose.foundation.interaction.f.a();
                            pVarF.N(objU2);
                        }
                        pVarF.c0();
                        gVar2 = (androidx.compose.foundation.interaction.g) objU2;
                    } else {
                        gVar2 = gVar;
                    }
                    if ((i13 & 1024) != 0) {
                        Boolean boolValueOf2 = Boolean.valueOf(z11);
                        pVarF.T(1618982084);
                        zS = pVarF.s(gVar2) | pVarF.s(j1VarC) | pVarF.s(boolValueOf2);
                        objU = pVarF.U();
                        if (zS) {
                            yh.q<k1, androidx.compose.runtime.p, Integer, kotlin.b2> qVar5 = new yh.q<k1, androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.SliderKt$Slider$9$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(3);
                                }

                                @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                                @androidx.compose.runtime.h
                                public final void a(@dl.d k1 it, @dl.e androidx.compose.runtime.p pVar2, int i32) {
                                    kotlin.jvm.internal.f0.p(it, "it");
                                    if ((i32 & 81) == 16 && pVar2.b()) {
                                        pVar2.l();
                                        return;
                                    }
                                    if (ComposerKt.g0()) {
                                        ComposerKt.w0(1647281944, i32, -1, "androidx.compose.material3.Slider.<anonymous>.<anonymous> (Slider.kt:325)");
                                    }
                                    SliderDefaults sliderDefaults = SliderDefaults.f10488a;
                                    androidx.compose.foundation.interaction.g gVar5 = gVar2;
                                    j1 j1Var3 = j1VarC;
                                    boolean z15 = z11;
                                    int i33 = i14;
                                    sliderDefaults.a(gVar5, null, j1Var3, z15, 0L, pVar2, 196608 | ((i33 >> 27) & 14) | ((i33 >> 18) & bb.c.b.f30796me) | ((i33 >> 3) & bb.c.g.f32954lc), 18);
                                    if (ComposerKt.g0()) {
                                        ComposerKt.v0();
                                    }
                                }

                                @Override // yh.q
                                public /* bridge */ /* synthetic */ kotlin.b2 invoke(k1 k1Var, androidx.compose.runtime.p pVar2, Integer num) {
                                    a(k1Var, pVar2, num.intValue());
                                    return kotlin.b2.f124493a;
                                }
                            };
                            z12 = true;
                            objU = androidx.compose.runtime.internal.b.c(1647281944, true, qVar5);
                            pVarF.N(objU);
                        } else {
                            yh.q<k1, androidx.compose.runtime.p, Integer, kotlin.b2> qVar6 = new yh.q<k1, androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.SliderKt$Slider$9$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(3);
                                }

                                @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                                @androidx.compose.runtime.h
                                public final void a(@dl.d k1 it, @dl.e androidx.compose.runtime.p pVar2, int i32) {
                                    kotlin.jvm.internal.f0.p(it, "it");
                                    if ((i32 & 81) == 16 && pVar2.b()) {
                                        pVar2.l();
                                        return;
                                    }
                                    if (ComposerKt.g0()) {
                                        ComposerKt.w0(1647281944, i32, -1, "androidx.compose.material3.Slider.<anonymous>.<anonymous> (Slider.kt:325)");
                                    }
                                    SliderDefaults sliderDefaults = SliderDefaults.f10488a;
                                    androidx.compose.foundation.interaction.g gVar5 = gVar2;
                                    j1 j1Var3 = j1VarC;
                                    boolean z15 = z11;
                                    int i33 = i14;
                                    sliderDefaults.a(gVar5, null, j1Var3, z15, 0L, pVar2, 196608 | ((i33 >> 27) & 14) | ((i33 >> 18) & bb.c.b.f30796me) | ((i33 >> 3) & bb.c.g.f32954lc), 18);
                                    if (ComposerKt.g0()) {
                                        ComposerKt.v0();
                                    }
                                }

                                @Override // yh.q
                                public /* bridge */ /* synthetic */ kotlin.b2 invoke(k1 k1Var, androidx.compose.runtime.p pVar2, Integer num) {
                                    a(k1Var, pVar2, num.intValue());
                                    return kotlin.b2.f124493a;
                                }
                            };
                            z12 = true;
                            objU = androidx.compose.runtime.internal.b.c(1647281944, true, qVar6);
                            pVarF.N(objU);
                        }
                        pVarF.c0();
                        i24 &= -15;
                        qVar2 = (yh.q) objU;
                    } else {
                        gVar2 = gVar2;
                        z12 = true;
                        qVar2 = qVar;
                    }
                    gVar3 = gVar2;
                    nVar4 = nVar3;
                    i26 = i24;
                } else {
                    if (i29 != 0) {
                        nVar3 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar3 = nVar2;
                    }
                    if (i15 != 0) {
                        z11 = true;
                    }
                    if ((i13 & 32) != 0) {
                        fVarE = fi.t.e(0.0f, 1.0f);
                        i14 &= -458753;
                    } else {
                        fVarE = fVar;
                    }
                    if (i17 != 0) {
                        i25 = 0;
                    } else {
                        i25 = i18;
                    }
                    if (i20 != 0) {
                        aVar2 = null;
                    } else {
                        aVar2 = aVar;
                    }
                    if ((i13 & 256) != 0) {
                        j1VarC = SliderDefaults.f10488a.c(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, pVarF, 0, 6, 1023);
                        i14 &= -234881025;
                    } else {
                        j1VarC = j1Var;
                    }
                    if (i22 != 0) {
                        pVarF.T(-492369756);
                        objU2 = pVarF.U();
                        if (objU2 == androidx.compose.runtime.p.INSTANCE.a()) {
                            objU2 = androidx.compose.foundation.interaction.f.a();
                            pVarF.N(objU2);
                        }
                        pVarF.c0();
                        gVar2 = (androidx.compose.foundation.interaction.g) objU2;
                    } else {
                        gVar2 = gVar;
                    }
                    if ((i13 & 1024) != 0) {
                        Boolean boolValueOf3 = Boolean.valueOf(z11);
                        pVarF.T(1618982084);
                        zS = pVarF.s(gVar2) | pVarF.s(j1VarC) | pVarF.s(boolValueOf3);
                        objU = pVarF.U();
                        if (zS) {
                            yh.q<k1, androidx.compose.runtime.p, Integer, kotlin.b2> qVar7 = new yh.q<k1, androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.SliderKt$Slider$9$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(3);
                                }

                                @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                                @androidx.compose.runtime.h
                                public final void a(@dl.d k1 it, @dl.e androidx.compose.runtime.p pVar2, int i32) {
                                    kotlin.jvm.internal.f0.p(it, "it");
                                    if ((i32 & 81) == 16 && pVar2.b()) {
                                        pVar2.l();
                                        return;
                                    }
                                    if (ComposerKt.g0()) {
                                        ComposerKt.w0(1647281944, i32, -1, "androidx.compose.material3.Slider.<anonymous>.<anonymous> (Slider.kt:325)");
                                    }
                                    SliderDefaults sliderDefaults = SliderDefaults.f10488a;
                                    androidx.compose.foundation.interaction.g gVar5 = gVar2;
                                    j1 j1Var3 = j1VarC;
                                    boolean z15 = z11;
                                    int i33 = i14;
                                    sliderDefaults.a(gVar5, null, j1Var3, z15, 0L, pVar2, 196608 | ((i33 >> 27) & 14) | ((i33 >> 18) & bb.c.b.f30796me) | ((i33 >> 3) & bb.c.g.f32954lc), 18);
                                    if (ComposerKt.g0()) {
                                        ComposerKt.v0();
                                    }
                                }

                                @Override // yh.q
                                public /* bridge */ /* synthetic */ kotlin.b2 invoke(k1 k1Var, androidx.compose.runtime.p pVar2, Integer num) {
                                    a(k1Var, pVar2, num.intValue());
                                    return kotlin.b2.f124493a;
                                }
                            };
                            z12 = true;
                            objU = androidx.compose.runtime.internal.b.c(1647281944, true, qVar7);
                            pVarF.N(objU);
                        } else {
                            yh.q<k1, androidx.compose.runtime.p, Integer, kotlin.b2> qVar8 = new yh.q<k1, androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.SliderKt$Slider$9$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(3);
                                }

                                @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                                @androidx.compose.runtime.h
                                public final void a(@dl.d k1 it, @dl.e androidx.compose.runtime.p pVar2, int i32) {
                                    kotlin.jvm.internal.f0.p(it, "it");
                                    if ((i32 & 81) == 16 && pVar2.b()) {
                                        pVar2.l();
                                        return;
                                    }
                                    if (ComposerKt.g0()) {
                                        ComposerKt.w0(1647281944, i32, -1, "androidx.compose.material3.Slider.<anonymous>.<anonymous> (Slider.kt:325)");
                                    }
                                    SliderDefaults sliderDefaults = SliderDefaults.f10488a;
                                    androidx.compose.foundation.interaction.g gVar5 = gVar2;
                                    j1 j1Var3 = j1VarC;
                                    boolean z15 = z11;
                                    int i33 = i14;
                                    sliderDefaults.a(gVar5, null, j1Var3, z15, 0L, pVar2, 196608 | ((i33 >> 27) & 14) | ((i33 >> 18) & bb.c.b.f30796me) | ((i33 >> 3) & bb.c.g.f32954lc), 18);
                                    if (ComposerKt.g0()) {
                                        ComposerKt.v0();
                                    }
                                }

                                @Override // yh.q
                                public /* bridge */ /* synthetic */ kotlin.b2 invoke(k1 k1Var, androidx.compose.runtime.p pVar2, Integer num) {
                                    a(k1Var, pVar2, num.intValue());
                                    return kotlin.b2.f124493a;
                                }
                            };
                            z12 = true;
                            objU = androidx.compose.runtime.internal.b.c(1647281944, true, qVar8);
                            pVarF.N(objU);
                        }
                        pVarF.c0();
                        i24 &= -15;
                        qVar2 = (yh.q) objU;
                    } else {
                        gVar2 = gVar2;
                        z12 = true;
                        qVar2 = qVar;
                    }
                    gVar3 = gVar2;
                    nVar4 = nVar3;
                    i26 = i24;
                }
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(387052651, i14, i26, "androidx.compose.material3.Slider (Slider.kt:312)");
                }
                if (i25 >= 0) {
                    z13 = z12;
                } else {
                    z13 = false;
                }
                if (!z13) {
                    throw new IllegalArgumentException("steps should be >= 0".toString());
                }
                int i32 = i14 >> 9;
                int i33 = i14 << 6;
                f(nVar4, z11, gVar3, onValueChange, aVar2, i25, f10, fVarE, qVar2, track, pVarF, (i32 & 57344) | (i32 & 14) | (i32 & 112) | ((i14 >> 21) & bb.c.b.f30796me) | (i33 & bb.c.g.f32954lc) | ((i14 >> 3) & 458752) | ((i14 << 18) & 3670016) | (i33 & 29360128) | ((i26 << 24) & 234881024) | ((i14 << 21) & 1879048192));
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                nVar5 = nVar4;
                z14 = z11;
                fVar2 = fVarE;
                i27 = i25;
                aVar3 = aVar2;
                j1Var2 = j1VarC;
                gVar4 = gVar3;
                qVar3 = qVar2;
            } else {
                pVarF.W();
                if ((i11 & 1) != 0) {
                    if (i29 != 0) {
                        nVar3 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar3 = nVar2;
                    }
                    if (i15 != 0) {
                        z11 = true;
                    }
                    if ((i13 & 32) != 0) {
                        fVarE = fi.t.e(0.0f, 1.0f);
                        i14 &= -458753;
                    } else {
                        fVarE = fVar;
                    }
                    if (i17 != 0) {
                        i25 = 0;
                    } else {
                        i25 = i18;
                    }
                    if (i20 != 0) {
                        aVar2 = null;
                    } else {
                        aVar2 = aVar;
                    }
                    if ((i13 & 256) != 0) {
                        j1VarC = SliderDefaults.f10488a.c(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, pVarF, 0, 6, 1023);
                        i14 &= -234881025;
                    } else {
                        j1VarC = j1Var;
                    }
                    if (i22 != 0) {
                        pVarF.T(-492369756);
                        objU2 = pVarF.U();
                        if (objU2 == androidx.compose.runtime.p.INSTANCE.a()) {
                            objU2 = androidx.compose.foundation.interaction.f.a();
                            pVarF.N(objU2);
                        }
                        pVarF.c0();
                        gVar2 = (androidx.compose.foundation.interaction.g) objU2;
                    } else {
                        gVar2 = gVar;
                    }
                    if ((i13 & 1024) != 0) {
                        Boolean boolValueOf4 = Boolean.valueOf(z11);
                        pVarF.T(1618982084);
                        zS = pVarF.s(gVar2) | pVarF.s(j1VarC) | pVarF.s(boolValueOf4);
                        objU = pVarF.U();
                        if (zS) {
                            yh.q<k1, androidx.compose.runtime.p, Integer, kotlin.b2> qVar9 = new yh.q<k1, androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.SliderKt$Slider$9$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(3);
                                }

                                @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                                @androidx.compose.runtime.h
                                public final void a(@dl.d k1 it, @dl.e androidx.compose.runtime.p pVar2, int i34) {
                                    kotlin.jvm.internal.f0.p(it, "it");
                                    if ((i34 & 81) == 16 && pVar2.b()) {
                                        pVar2.l();
                                        return;
                                    }
                                    if (ComposerKt.g0()) {
                                        ComposerKt.w0(1647281944, i34, -1, "androidx.compose.material3.Slider.<anonymous>.<anonymous> (Slider.kt:325)");
                                    }
                                    SliderDefaults sliderDefaults = SliderDefaults.f10488a;
                                    androidx.compose.foundation.interaction.g gVar5 = gVar2;
                                    j1 j1Var3 = j1VarC;
                                    boolean z15 = z11;
                                    int i35 = i14;
                                    sliderDefaults.a(gVar5, null, j1Var3, z15, 0L, pVar2, 196608 | ((i35 >> 27) & 14) | ((i35 >> 18) & bb.c.b.f30796me) | ((i35 >> 3) & bb.c.g.f32954lc), 18);
                                    if (ComposerKt.g0()) {
                                        ComposerKt.v0();
                                    }
                                }

                                @Override // yh.q
                                public /* bridge */ /* synthetic */ kotlin.b2 invoke(k1 k1Var, androidx.compose.runtime.p pVar2, Integer num) {
                                    a(k1Var, pVar2, num.intValue());
                                    return kotlin.b2.f124493a;
                                }
                            };
                            z12 = true;
                            objU = androidx.compose.runtime.internal.b.c(1647281944, true, qVar9);
                            pVarF.N(objU);
                        } else {
                            yh.q<k1, androidx.compose.runtime.p, Integer, kotlin.b2> qVar10 = new yh.q<k1, androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.SliderKt$Slider$9$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(3);
                                }

                                @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                                @androidx.compose.runtime.h
                                public final void a(@dl.d k1 it, @dl.e androidx.compose.runtime.p pVar2, int i34) {
                                    kotlin.jvm.internal.f0.p(it, "it");
                                    if ((i34 & 81) == 16 && pVar2.b()) {
                                        pVar2.l();
                                        return;
                                    }
                                    if (ComposerKt.g0()) {
                                        ComposerKt.w0(1647281944, i34, -1, "androidx.compose.material3.Slider.<anonymous>.<anonymous> (Slider.kt:325)");
                                    }
                                    SliderDefaults sliderDefaults = SliderDefaults.f10488a;
                                    androidx.compose.foundation.interaction.g gVar5 = gVar2;
                                    j1 j1Var3 = j1VarC;
                                    boolean z15 = z11;
                                    int i35 = i14;
                                    sliderDefaults.a(gVar5, null, j1Var3, z15, 0L, pVar2, 196608 | ((i35 >> 27) & 14) | ((i35 >> 18) & bb.c.b.f30796me) | ((i35 >> 3) & bb.c.g.f32954lc), 18);
                                    if (ComposerKt.g0()) {
                                        ComposerKt.v0();
                                    }
                                }

                                @Override // yh.q
                                public /* bridge */ /* synthetic */ kotlin.b2 invoke(k1 k1Var, androidx.compose.runtime.p pVar2, Integer num) {
                                    a(k1Var, pVar2, num.intValue());
                                    return kotlin.b2.f124493a;
                                }
                            };
                            z12 = true;
                            objU = androidx.compose.runtime.internal.b.c(1647281944, true, qVar10);
                            pVarF.N(objU);
                        }
                        pVarF.c0();
                        i24 &= -15;
                        qVar2 = (yh.q) objU;
                    } else {
                        gVar2 = gVar2;
                        z12 = true;
                        qVar2 = qVar;
                    }
                    gVar3 = gVar2;
                    nVar4 = nVar3;
                    i26 = i24;
                } else {
                    if (i29 != 0) {
                        nVar3 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar3 = nVar2;
                    }
                    if (i15 != 0) {
                        z11 = true;
                    }
                    if ((i13 & 32) != 0) {
                        fVarE = fi.t.e(0.0f, 1.0f);
                        i14 &= -458753;
                    } else {
                        fVarE = fVar;
                    }
                    if (i17 != 0) {
                        i25 = 0;
                    } else {
                        i25 = i18;
                    }
                    if (i20 != 0) {
                        aVar2 = null;
                    } else {
                        aVar2 = aVar;
                    }
                    if ((i13 & 256) != 0) {
                        j1VarC = SliderDefaults.f10488a.c(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, pVarF, 0, 6, 1023);
                        i14 &= -234881025;
                    } else {
                        j1VarC = j1Var;
                    }
                    if (i22 != 0) {
                        pVarF.T(-492369756);
                        objU2 = pVarF.U();
                        if (objU2 == androidx.compose.runtime.p.INSTANCE.a()) {
                            objU2 = androidx.compose.foundation.interaction.f.a();
                            pVarF.N(objU2);
                        }
                        pVarF.c0();
                        gVar2 = (androidx.compose.foundation.interaction.g) objU2;
                    } else {
                        gVar2 = gVar;
                    }
                    if ((i13 & 1024) != 0) {
                        Boolean boolValueOf5 = Boolean.valueOf(z11);
                        pVarF.T(1618982084);
                        zS = pVarF.s(gVar2) | pVarF.s(j1VarC) | pVarF.s(boolValueOf5);
                        objU = pVarF.U();
                        if (zS) {
                            yh.q<k1, androidx.compose.runtime.p, Integer, kotlin.b2> qVar11 = new yh.q<k1, androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.SliderKt$Slider$9$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(3);
                                }

                                @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                                @androidx.compose.runtime.h
                                public final void a(@dl.d k1 it, @dl.e androidx.compose.runtime.p pVar2, int i34) {
                                    kotlin.jvm.internal.f0.p(it, "it");
                                    if ((i34 & 81) == 16 && pVar2.b()) {
                                        pVar2.l();
                                        return;
                                    }
                                    if (ComposerKt.g0()) {
                                        ComposerKt.w0(1647281944, i34, -1, "androidx.compose.material3.Slider.<anonymous>.<anonymous> (Slider.kt:325)");
                                    }
                                    SliderDefaults sliderDefaults = SliderDefaults.f10488a;
                                    androidx.compose.foundation.interaction.g gVar5 = gVar2;
                                    j1 j1Var3 = j1VarC;
                                    boolean z15 = z11;
                                    int i35 = i14;
                                    sliderDefaults.a(gVar5, null, j1Var3, z15, 0L, pVar2, 196608 | ((i35 >> 27) & 14) | ((i35 >> 18) & bb.c.b.f30796me) | ((i35 >> 3) & bb.c.g.f32954lc), 18);
                                    if (ComposerKt.g0()) {
                                        ComposerKt.v0();
                                    }
                                }

                                @Override // yh.q
                                public /* bridge */ /* synthetic */ kotlin.b2 invoke(k1 k1Var, androidx.compose.runtime.p pVar2, Integer num) {
                                    a(k1Var, pVar2, num.intValue());
                                    return kotlin.b2.f124493a;
                                }
                            };
                            z12 = true;
                            objU = androidx.compose.runtime.internal.b.c(1647281944, true, qVar11);
                            pVarF.N(objU);
                        } else {
                            yh.q<k1, androidx.compose.runtime.p, Integer, kotlin.b2> qVar12 = new yh.q<k1, androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.SliderKt$Slider$9$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(3);
                                }

                                @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                                @androidx.compose.runtime.h
                                public final void a(@dl.d k1 it, @dl.e androidx.compose.runtime.p pVar2, int i34) {
                                    kotlin.jvm.internal.f0.p(it, "it");
                                    if ((i34 & 81) == 16 && pVar2.b()) {
                                        pVar2.l();
                                        return;
                                    }
                                    if (ComposerKt.g0()) {
                                        ComposerKt.w0(1647281944, i34, -1, "androidx.compose.material3.Slider.<anonymous>.<anonymous> (Slider.kt:325)");
                                    }
                                    SliderDefaults sliderDefaults = SliderDefaults.f10488a;
                                    androidx.compose.foundation.interaction.g gVar5 = gVar2;
                                    j1 j1Var3 = j1VarC;
                                    boolean z15 = z11;
                                    int i35 = i14;
                                    sliderDefaults.a(gVar5, null, j1Var3, z15, 0L, pVar2, 196608 | ((i35 >> 27) & 14) | ((i35 >> 18) & bb.c.b.f30796me) | ((i35 >> 3) & bb.c.g.f32954lc), 18);
                                    if (ComposerKt.g0()) {
                                        ComposerKt.v0();
                                    }
                                }

                                @Override // yh.q
                                public /* bridge */ /* synthetic */ kotlin.b2 invoke(k1 k1Var, androidx.compose.runtime.p pVar2, Integer num) {
                                    a(k1Var, pVar2, num.intValue());
                                    return kotlin.b2.f124493a;
                                }
                            };
                            z12 = true;
                            objU = androidx.compose.runtime.internal.b.c(1647281944, true, qVar12);
                            pVarF.N(objU);
                        }
                        pVarF.c0();
                        i24 &= -15;
                        qVar2 = (yh.q) objU;
                    } else {
                        gVar2 = gVar2;
                        z12 = true;
                        qVar2 = qVar;
                    }
                    gVar3 = gVar2;
                    nVar4 = nVar3;
                    i26 = i24;
                }
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(387052651, i14, i26, "androidx.compose.material3.Slider (Slider.kt:312)");
                }
                if (i25 >= 0) {
                    z13 = z12;
                } else {
                    z13 = false;
                }
                if (!z13) {
                    throw new IllegalArgumentException("steps should be >= 0".toString());
                }
                int i34 = i14 >> 9;
                int i35 = i14 << 6;
                f(nVar4, z11, gVar3, onValueChange, aVar2, i25, f10, fVarE, qVar2, track, pVarF, (i34 & 57344) | (i34 & 14) | (i34 & 112) | ((i14 >> 21) & bb.c.b.f30796me) | (i35 & bb.c.g.f32954lc) | ((i14 >> 3) & 458752) | ((i14 << 18) & 3670016) | (i35 & 29360128) | ((i26 << 24) & 234881024) | ((i14 << 21) & 1879048192));
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                nVar5 = nVar4;
                z14 = z11;
                fVar2 = fVarE;
                i27 = i25;
                aVar3 = aVar2;
                j1Var2 = j1VarC;
                gVar4 = gVar3;
                qVar3 = qVar2;
            }
            u1VarH = pVarF.H();
            if (u1VarH == null) {
                return;
            }
            u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.SliderKt$Slider$11
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void a(@dl.e androidx.compose.runtime.p pVar2, int i36) {
                    SliderKt.e(f10, onValueChange, track, nVar5, z14, fVar2, i27, aVar3, j1Var2, gVar4, qVar3, pVar2, i11 | 1, i12, i13);
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                    a(pVar2, num.intValue());
                    return kotlin.b2.f124493a;
                }
            });
        }
        i14 |= bb.c.d.f31193dj;
        nVar2 = nVar;
        i15 = i13 & 16;
        if (i15 != 0) {
            if ((i11 & 57344) == 0) {
                z11 = z10;
                if (pVarF.u(z11)) {
                    i16 = 16384;
                } else {
                    i16 = 8192;
                }
                i14 |= i16;
            }
            if ((i11 & 458752) != 0) {
                if ((i13 & 32) == 0) {
                    i28 = 65536;
                } else {
                    i28 = 65536;
                }
                i14 |= i28;
            }
            i17 = i13 & 64;
            if (i17 != 0) {
                i14 |= 1572864;
                i18 = i10;
            } else {
                i18 = i10;
                if ((i11 & 3670016) == 0) {
                    if (pVarF.y(i18)) {
                        i19 = 1048576;
                    } else {
                        i19 = 524288;
                    }
                    i14 |= i19;
                }
            }
            i20 = i13 & 128;
            if (i20 != 0) {
                i14 |= 12582912;
            } else if ((i11 & 29360128) == 0) {
                if (pVarF.s(aVar)) {
                    i21 = 8388608;
                } else {
                    i21 = 4194304;
                }
                i14 |= i21;
            }
            if ((i11 & 234881024) != 0) {
                i14 |= ((i13 & 256) == 0 || !pVarF.s(j1Var)) ? 33554432 : 67108864;
            }
            i22 = i13 & 512;
            if (i22 != 0) {
                i14 |= com.google.android.exoplayer2.j.G;
            } else if ((i11 & 1879048192) == 0) {
                if (pVarF.s(gVar)) {
                    i23 = 536870912;
                } else {
                    i23 = 268435456;
                }
                i14 |= i23;
            }
            if ((i12 & 14) == 0) {
                i24 = i12 | (((i13 & 1024) == 0 || !pVarF.s(qVar)) ? 2 : 4);
            } else {
                i24 = i12;
            }
            if ((i14 & 1533916891) != 306783378) {
                pVarF.W();
                if ((i11 & 1) != 0) {
                    if (i29 != 0) {
                        nVar3 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar3 = nVar2;
                    }
                    if (i15 != 0) {
                        z11 = true;
                    }
                    if ((i13 & 32) != 0) {
                        fVarE = fi.t.e(0.0f, 1.0f);
                        i14 &= -458753;
                    } else {
                        fVarE = fVar;
                    }
                    if (i17 != 0) {
                        i25 = 0;
                    } else {
                        i25 = i18;
                    }
                    if (i20 != 0) {
                        aVar2 = null;
                    } else {
                        aVar2 = aVar;
                    }
                    if ((i13 & 256) != 0) {
                        j1VarC = SliderDefaults.f10488a.c(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, pVarF, 0, 6, 1023);
                        i14 &= -234881025;
                    } else {
                        j1VarC = j1Var;
                    }
                    if (i22 != 0) {
                        pVarF.T(-492369756);
                        objU2 = pVarF.U();
                        if (objU2 == androidx.compose.runtime.p.INSTANCE.a()) {
                            objU2 = androidx.compose.foundation.interaction.f.a();
                            pVarF.N(objU2);
                        }
                        pVarF.c0();
                        gVar2 = (androidx.compose.foundation.interaction.g) objU2;
                    } else {
                        gVar2 = gVar;
                    }
                    if ((i13 & 1024) != 0) {
                        Boolean boolValueOf6 = Boolean.valueOf(z11);
                        pVarF.T(1618982084);
                        zS = pVarF.s(gVar2) | pVarF.s(j1VarC) | pVarF.s(boolValueOf6);
                        objU = pVarF.U();
                        if (zS) {
                            yh.q<k1, androidx.compose.runtime.p, Integer, kotlin.b2> qVar13 = new yh.q<k1, androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.SliderKt$Slider$9$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(3);
                                }

                                @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                                @androidx.compose.runtime.h
                                public final void a(@dl.d k1 it, @dl.e androidx.compose.runtime.p pVar2, int i36) {
                                    kotlin.jvm.internal.f0.p(it, "it");
                                    if ((i36 & 81) == 16 && pVar2.b()) {
                                        pVar2.l();
                                        return;
                                    }
                                    if (ComposerKt.g0()) {
                                        ComposerKt.w0(1647281944, i36, -1, "androidx.compose.material3.Slider.<anonymous>.<anonymous> (Slider.kt:325)");
                                    }
                                    SliderDefaults sliderDefaults = SliderDefaults.f10488a;
                                    androidx.compose.foundation.interaction.g gVar5 = gVar2;
                                    j1 j1Var3 = j1VarC;
                                    boolean z15 = z11;
                                    int i37 = i14;
                                    sliderDefaults.a(gVar5, null, j1Var3, z15, 0L, pVar2, 196608 | ((i37 >> 27) & 14) | ((i37 >> 18) & bb.c.b.f30796me) | ((i37 >> 3) & bb.c.g.f32954lc), 18);
                                    if (ComposerKt.g0()) {
                                        ComposerKt.v0();
                                    }
                                }

                                @Override // yh.q
                                public /* bridge */ /* synthetic */ kotlin.b2 invoke(k1 k1Var, androidx.compose.runtime.p pVar2, Integer num) {
                                    a(k1Var, pVar2, num.intValue());
                                    return kotlin.b2.f124493a;
                                }
                            };
                            z12 = true;
                            objU = androidx.compose.runtime.internal.b.c(1647281944, true, qVar13);
                            pVarF.N(objU);
                        } else {
                            yh.q<k1, androidx.compose.runtime.p, Integer, kotlin.b2> qVar14 = new yh.q<k1, androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.SliderKt$Slider$9$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(3);
                                }

                                @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                                @androidx.compose.runtime.h
                                public final void a(@dl.d k1 it, @dl.e androidx.compose.runtime.p pVar2, int i36) {
                                    kotlin.jvm.internal.f0.p(it, "it");
                                    if ((i36 & 81) == 16 && pVar2.b()) {
                                        pVar2.l();
                                        return;
                                    }
                                    if (ComposerKt.g0()) {
                                        ComposerKt.w0(1647281944, i36, -1, "androidx.compose.material3.Slider.<anonymous>.<anonymous> (Slider.kt:325)");
                                    }
                                    SliderDefaults sliderDefaults = SliderDefaults.f10488a;
                                    androidx.compose.foundation.interaction.g gVar5 = gVar2;
                                    j1 j1Var3 = j1VarC;
                                    boolean z15 = z11;
                                    int i37 = i14;
                                    sliderDefaults.a(gVar5, null, j1Var3, z15, 0L, pVar2, 196608 | ((i37 >> 27) & 14) | ((i37 >> 18) & bb.c.b.f30796me) | ((i37 >> 3) & bb.c.g.f32954lc), 18);
                                    if (ComposerKt.g0()) {
                                        ComposerKt.v0();
                                    }
                                }

                                @Override // yh.q
                                public /* bridge */ /* synthetic */ kotlin.b2 invoke(k1 k1Var, androidx.compose.runtime.p pVar2, Integer num) {
                                    a(k1Var, pVar2, num.intValue());
                                    return kotlin.b2.f124493a;
                                }
                            };
                            z12 = true;
                            objU = androidx.compose.runtime.internal.b.c(1647281944, true, qVar14);
                            pVarF.N(objU);
                        }
                        pVarF.c0();
                        i24 &= -15;
                        qVar2 = (yh.q) objU;
                    } else {
                        gVar2 = gVar2;
                        z12 = true;
                        qVar2 = qVar;
                    }
                    gVar3 = gVar2;
                    nVar4 = nVar3;
                    i26 = i24;
                } else {
                    if (i29 != 0) {
                        nVar3 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar3 = nVar2;
                    }
                    if (i15 != 0) {
                        z11 = true;
                    }
                    if ((i13 & 32) != 0) {
                        fVarE = fi.t.e(0.0f, 1.0f);
                        i14 &= -458753;
                    } else {
                        fVarE = fVar;
                    }
                    if (i17 != 0) {
                        i25 = 0;
                    } else {
                        i25 = i18;
                    }
                    if (i20 != 0) {
                        aVar2 = null;
                    } else {
                        aVar2 = aVar;
                    }
                    if ((i13 & 256) != 0) {
                        j1VarC = SliderDefaults.f10488a.c(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, pVarF, 0, 6, 1023);
                        i14 &= -234881025;
                    } else {
                        j1VarC = j1Var;
                    }
                    if (i22 != 0) {
                        pVarF.T(-492369756);
                        objU2 = pVarF.U();
                        if (objU2 == androidx.compose.runtime.p.INSTANCE.a()) {
                            objU2 = androidx.compose.foundation.interaction.f.a();
                            pVarF.N(objU2);
                        }
                        pVarF.c0();
                        gVar2 = (androidx.compose.foundation.interaction.g) objU2;
                    } else {
                        gVar2 = gVar;
                    }
                    if ((i13 & 1024) != 0) {
                        Boolean boolValueOf7 = Boolean.valueOf(z11);
                        pVarF.T(1618982084);
                        zS = pVarF.s(gVar2) | pVarF.s(j1VarC) | pVarF.s(boolValueOf7);
                        objU = pVarF.U();
                        if (zS) {
                            yh.q<k1, androidx.compose.runtime.p, Integer, kotlin.b2> qVar15 = new yh.q<k1, androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.SliderKt$Slider$9$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(3);
                                }

                                @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                                @androidx.compose.runtime.h
                                public final void a(@dl.d k1 it, @dl.e androidx.compose.runtime.p pVar2, int i36) {
                                    kotlin.jvm.internal.f0.p(it, "it");
                                    if ((i36 & 81) == 16 && pVar2.b()) {
                                        pVar2.l();
                                        return;
                                    }
                                    if (ComposerKt.g0()) {
                                        ComposerKt.w0(1647281944, i36, -1, "androidx.compose.material3.Slider.<anonymous>.<anonymous> (Slider.kt:325)");
                                    }
                                    SliderDefaults sliderDefaults = SliderDefaults.f10488a;
                                    androidx.compose.foundation.interaction.g gVar5 = gVar2;
                                    j1 j1Var3 = j1VarC;
                                    boolean z15 = z11;
                                    int i37 = i14;
                                    sliderDefaults.a(gVar5, null, j1Var3, z15, 0L, pVar2, 196608 | ((i37 >> 27) & 14) | ((i37 >> 18) & bb.c.b.f30796me) | ((i37 >> 3) & bb.c.g.f32954lc), 18);
                                    if (ComposerKt.g0()) {
                                        ComposerKt.v0();
                                    }
                                }

                                @Override // yh.q
                                public /* bridge */ /* synthetic */ kotlin.b2 invoke(k1 k1Var, androidx.compose.runtime.p pVar2, Integer num) {
                                    a(k1Var, pVar2, num.intValue());
                                    return kotlin.b2.f124493a;
                                }
                            };
                            z12 = true;
                            objU = androidx.compose.runtime.internal.b.c(1647281944, true, qVar15);
                            pVarF.N(objU);
                        } else {
                            yh.q<k1, androidx.compose.runtime.p, Integer, kotlin.b2> qVar16 = new yh.q<k1, androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.SliderKt$Slider$9$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(3);
                                }

                                @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                                @androidx.compose.runtime.h
                                public final void a(@dl.d k1 it, @dl.e androidx.compose.runtime.p pVar2, int i36) {
                                    kotlin.jvm.internal.f0.p(it, "it");
                                    if ((i36 & 81) == 16 && pVar2.b()) {
                                        pVar2.l();
                                        return;
                                    }
                                    if (ComposerKt.g0()) {
                                        ComposerKt.w0(1647281944, i36, -1, "androidx.compose.material3.Slider.<anonymous>.<anonymous> (Slider.kt:325)");
                                    }
                                    SliderDefaults sliderDefaults = SliderDefaults.f10488a;
                                    androidx.compose.foundation.interaction.g gVar5 = gVar2;
                                    j1 j1Var3 = j1VarC;
                                    boolean z15 = z11;
                                    int i37 = i14;
                                    sliderDefaults.a(gVar5, null, j1Var3, z15, 0L, pVar2, 196608 | ((i37 >> 27) & 14) | ((i37 >> 18) & bb.c.b.f30796me) | ((i37 >> 3) & bb.c.g.f32954lc), 18);
                                    if (ComposerKt.g0()) {
                                        ComposerKt.v0();
                                    }
                                }

                                @Override // yh.q
                                public /* bridge */ /* synthetic */ kotlin.b2 invoke(k1 k1Var, androidx.compose.runtime.p pVar2, Integer num) {
                                    a(k1Var, pVar2, num.intValue());
                                    return kotlin.b2.f124493a;
                                }
                            };
                            z12 = true;
                            objU = androidx.compose.runtime.internal.b.c(1647281944, true, qVar16);
                            pVarF.N(objU);
                        }
                        pVarF.c0();
                        i24 &= -15;
                        qVar2 = (yh.q) objU;
                    } else {
                        gVar2 = gVar2;
                        z12 = true;
                        qVar2 = qVar;
                    }
                    gVar3 = gVar2;
                    nVar4 = nVar3;
                    i26 = i24;
                }
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(387052651, i14, i26, "androidx.compose.material3.Slider (Slider.kt:312)");
                }
                if (i25 >= 0) {
                    z13 = z12;
                } else {
                    z13 = false;
                }
                if (!z13) {
                    throw new IllegalArgumentException("steps should be >= 0".toString());
                }
                int i36 = i14 >> 9;
                int i37 = i14 << 6;
                f(nVar4, z11, gVar3, onValueChange, aVar2, i25, f10, fVarE, qVar2, track, pVarF, (i36 & 57344) | (i36 & 14) | (i36 & 112) | ((i14 >> 21) & bb.c.b.f30796me) | (i37 & bb.c.g.f32954lc) | ((i14 >> 3) & 458752) | ((i14 << 18) & 3670016) | (i37 & 29360128) | ((i26 << 24) & 234881024) | ((i14 << 21) & 1879048192));
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                nVar5 = nVar4;
                z14 = z11;
                fVar2 = fVarE;
                i27 = i25;
                aVar3 = aVar2;
                j1Var2 = j1VarC;
                gVar4 = gVar3;
                qVar3 = qVar2;
            } else {
                pVarF.W();
                if ((i11 & 1) != 0) {
                    if (i29 != 0) {
                        nVar3 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar3 = nVar2;
                    }
                    if (i15 != 0) {
                        z11 = true;
                    }
                    if ((i13 & 32) != 0) {
                        fVarE = fi.t.e(0.0f, 1.0f);
                        i14 &= -458753;
                    } else {
                        fVarE = fVar;
                    }
                    if (i17 != 0) {
                        i25 = 0;
                    } else {
                        i25 = i18;
                    }
                    if (i20 != 0) {
                        aVar2 = null;
                    } else {
                        aVar2 = aVar;
                    }
                    if ((i13 & 256) != 0) {
                        j1VarC = SliderDefaults.f10488a.c(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, pVarF, 0, 6, 1023);
                        i14 &= -234881025;
                    } else {
                        j1VarC = j1Var;
                    }
                    if (i22 != 0) {
                        pVarF.T(-492369756);
                        objU2 = pVarF.U();
                        if (objU2 == androidx.compose.runtime.p.INSTANCE.a()) {
                            objU2 = androidx.compose.foundation.interaction.f.a();
                            pVarF.N(objU2);
                        }
                        pVarF.c0();
                        gVar2 = (androidx.compose.foundation.interaction.g) objU2;
                    } else {
                        gVar2 = gVar;
                    }
                    if ((i13 & 1024) != 0) {
                        Boolean boolValueOf8 = Boolean.valueOf(z11);
                        pVarF.T(1618982084);
                        zS = pVarF.s(gVar2) | pVarF.s(j1VarC) | pVarF.s(boolValueOf8);
                        objU = pVarF.U();
                        if (zS) {
                            yh.q<k1, androidx.compose.runtime.p, Integer, kotlin.b2> qVar17 = new yh.q<k1, androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.SliderKt$Slider$9$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(3);
                                }

                                @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                                @androidx.compose.runtime.h
                                public final void a(@dl.d k1 it, @dl.e androidx.compose.runtime.p pVar2, int i38) {
                                    kotlin.jvm.internal.f0.p(it, "it");
                                    if ((i38 & 81) == 16 && pVar2.b()) {
                                        pVar2.l();
                                        return;
                                    }
                                    if (ComposerKt.g0()) {
                                        ComposerKt.w0(1647281944, i38, -1, "androidx.compose.material3.Slider.<anonymous>.<anonymous> (Slider.kt:325)");
                                    }
                                    SliderDefaults sliderDefaults = SliderDefaults.f10488a;
                                    androidx.compose.foundation.interaction.g gVar5 = gVar2;
                                    j1 j1Var3 = j1VarC;
                                    boolean z15 = z11;
                                    int i39 = i14;
                                    sliderDefaults.a(gVar5, null, j1Var3, z15, 0L, pVar2, 196608 | ((i39 >> 27) & 14) | ((i39 >> 18) & bb.c.b.f30796me) | ((i39 >> 3) & bb.c.g.f32954lc), 18);
                                    if (ComposerKt.g0()) {
                                        ComposerKt.v0();
                                    }
                                }

                                @Override // yh.q
                                public /* bridge */ /* synthetic */ kotlin.b2 invoke(k1 k1Var, androidx.compose.runtime.p pVar2, Integer num) {
                                    a(k1Var, pVar2, num.intValue());
                                    return kotlin.b2.f124493a;
                                }
                            };
                            z12 = true;
                            objU = androidx.compose.runtime.internal.b.c(1647281944, true, qVar17);
                            pVarF.N(objU);
                        } else {
                            yh.q<k1, androidx.compose.runtime.p, Integer, kotlin.b2> qVar18 = new yh.q<k1, androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.SliderKt$Slider$9$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(3);
                                }

                                @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                                @androidx.compose.runtime.h
                                public final void a(@dl.d k1 it, @dl.e androidx.compose.runtime.p pVar2, int i38) {
                                    kotlin.jvm.internal.f0.p(it, "it");
                                    if ((i38 & 81) == 16 && pVar2.b()) {
                                        pVar2.l();
                                        return;
                                    }
                                    if (ComposerKt.g0()) {
                                        ComposerKt.w0(1647281944, i38, -1, "androidx.compose.material3.Slider.<anonymous>.<anonymous> (Slider.kt:325)");
                                    }
                                    SliderDefaults sliderDefaults = SliderDefaults.f10488a;
                                    androidx.compose.foundation.interaction.g gVar5 = gVar2;
                                    j1 j1Var3 = j1VarC;
                                    boolean z15 = z11;
                                    int i39 = i14;
                                    sliderDefaults.a(gVar5, null, j1Var3, z15, 0L, pVar2, 196608 | ((i39 >> 27) & 14) | ((i39 >> 18) & bb.c.b.f30796me) | ((i39 >> 3) & bb.c.g.f32954lc), 18);
                                    if (ComposerKt.g0()) {
                                        ComposerKt.v0();
                                    }
                                }

                                @Override // yh.q
                                public /* bridge */ /* synthetic */ kotlin.b2 invoke(k1 k1Var, androidx.compose.runtime.p pVar2, Integer num) {
                                    a(k1Var, pVar2, num.intValue());
                                    return kotlin.b2.f124493a;
                                }
                            };
                            z12 = true;
                            objU = androidx.compose.runtime.internal.b.c(1647281944, true, qVar18);
                            pVarF.N(objU);
                        }
                        pVarF.c0();
                        i24 &= -15;
                        qVar2 = (yh.q) objU;
                    } else {
                        gVar2 = gVar2;
                        z12 = true;
                        qVar2 = qVar;
                    }
                    gVar3 = gVar2;
                    nVar4 = nVar3;
                    i26 = i24;
                } else {
                    if (i29 != 0) {
                        nVar3 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar3 = nVar2;
                    }
                    if (i15 != 0) {
                        z11 = true;
                    }
                    if ((i13 & 32) != 0) {
                        fVarE = fi.t.e(0.0f, 1.0f);
                        i14 &= -458753;
                    } else {
                        fVarE = fVar;
                    }
                    if (i17 != 0) {
                        i25 = 0;
                    } else {
                        i25 = i18;
                    }
                    if (i20 != 0) {
                        aVar2 = null;
                    } else {
                        aVar2 = aVar;
                    }
                    if ((i13 & 256) != 0) {
                        j1VarC = SliderDefaults.f10488a.c(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, pVarF, 0, 6, 1023);
                        i14 &= -234881025;
                    } else {
                        j1VarC = j1Var;
                    }
                    if (i22 != 0) {
                        pVarF.T(-492369756);
                        objU2 = pVarF.U();
                        if (objU2 == androidx.compose.runtime.p.INSTANCE.a()) {
                            objU2 = androidx.compose.foundation.interaction.f.a();
                            pVarF.N(objU2);
                        }
                        pVarF.c0();
                        gVar2 = (androidx.compose.foundation.interaction.g) objU2;
                    } else {
                        gVar2 = gVar;
                    }
                    if ((i13 & 1024) != 0) {
                        Boolean boolValueOf9 = Boolean.valueOf(z11);
                        pVarF.T(1618982084);
                        zS = pVarF.s(gVar2) | pVarF.s(j1VarC) | pVarF.s(boolValueOf9);
                        objU = pVarF.U();
                        if (zS) {
                            yh.q<k1, androidx.compose.runtime.p, Integer, kotlin.b2> qVar19 = new yh.q<k1, androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.SliderKt$Slider$9$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(3);
                                }

                                @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                                @androidx.compose.runtime.h
                                public final void a(@dl.d k1 it, @dl.e androidx.compose.runtime.p pVar2, int i38) {
                                    kotlin.jvm.internal.f0.p(it, "it");
                                    if ((i38 & 81) == 16 && pVar2.b()) {
                                        pVar2.l();
                                        return;
                                    }
                                    if (ComposerKt.g0()) {
                                        ComposerKt.w0(1647281944, i38, -1, "androidx.compose.material3.Slider.<anonymous>.<anonymous> (Slider.kt:325)");
                                    }
                                    SliderDefaults sliderDefaults = SliderDefaults.f10488a;
                                    androidx.compose.foundation.interaction.g gVar5 = gVar2;
                                    j1 j1Var3 = j1VarC;
                                    boolean z15 = z11;
                                    int i39 = i14;
                                    sliderDefaults.a(gVar5, null, j1Var3, z15, 0L, pVar2, 196608 | ((i39 >> 27) & 14) | ((i39 >> 18) & bb.c.b.f30796me) | ((i39 >> 3) & bb.c.g.f32954lc), 18);
                                    if (ComposerKt.g0()) {
                                        ComposerKt.v0();
                                    }
                                }

                                @Override // yh.q
                                public /* bridge */ /* synthetic */ kotlin.b2 invoke(k1 k1Var, androidx.compose.runtime.p pVar2, Integer num) {
                                    a(k1Var, pVar2, num.intValue());
                                    return kotlin.b2.f124493a;
                                }
                            };
                            z12 = true;
                            objU = androidx.compose.runtime.internal.b.c(1647281944, true, qVar19);
                            pVarF.N(objU);
                        } else {
                            yh.q<k1, androidx.compose.runtime.p, Integer, kotlin.b2> qVar110 = new yh.q<k1, androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.SliderKt$Slider$9$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(3);
                                }

                                @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                                @androidx.compose.runtime.h
                                public final void a(@dl.d k1 it, @dl.e androidx.compose.runtime.p pVar2, int i38) {
                                    kotlin.jvm.internal.f0.p(it, "it");
                                    if ((i38 & 81) == 16 && pVar2.b()) {
                                        pVar2.l();
                                        return;
                                    }
                                    if (ComposerKt.g0()) {
                                        ComposerKt.w0(1647281944, i38, -1, "androidx.compose.material3.Slider.<anonymous>.<anonymous> (Slider.kt:325)");
                                    }
                                    SliderDefaults sliderDefaults = SliderDefaults.f10488a;
                                    androidx.compose.foundation.interaction.g gVar5 = gVar2;
                                    j1 j1Var3 = j1VarC;
                                    boolean z15 = z11;
                                    int i39 = i14;
                                    sliderDefaults.a(gVar5, null, j1Var3, z15, 0L, pVar2, 196608 | ((i39 >> 27) & 14) | ((i39 >> 18) & bb.c.b.f30796me) | ((i39 >> 3) & bb.c.g.f32954lc), 18);
                                    if (ComposerKt.g0()) {
                                        ComposerKt.v0();
                                    }
                                }

                                @Override // yh.q
                                public /* bridge */ /* synthetic */ kotlin.b2 invoke(k1 k1Var, androidx.compose.runtime.p pVar2, Integer num) {
                                    a(k1Var, pVar2, num.intValue());
                                    return kotlin.b2.f124493a;
                                }
                            };
                            z12 = true;
                            objU = androidx.compose.runtime.internal.b.c(1647281944, true, qVar110);
                            pVarF.N(objU);
                        }
                        pVarF.c0();
                        i24 &= -15;
                        qVar2 = (yh.q) objU;
                    } else {
                        gVar2 = gVar2;
                        z12 = true;
                        qVar2 = qVar;
                    }
                    gVar3 = gVar2;
                    nVar4 = nVar3;
                    i26 = i24;
                }
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(387052651, i14, i26, "androidx.compose.material3.Slider (Slider.kt:312)");
                }
                if (i25 >= 0) {
                    z13 = z12;
                } else {
                    z13 = false;
                }
                if (!z13) {
                    throw new IllegalArgumentException("steps should be >= 0".toString());
                }
                int i38 = i14 >> 9;
                int i39 = i14 << 6;
                f(nVar4, z11, gVar3, onValueChange, aVar2, i25, f10, fVarE, qVar2, track, pVarF, (i38 & 57344) | (i38 & 14) | (i38 & 112) | ((i14 >> 21) & bb.c.b.f30796me) | (i39 & bb.c.g.f32954lc) | ((i14 >> 3) & 458752) | ((i14 << 18) & 3670016) | (i39 & 29360128) | ((i26 << 24) & 234881024) | ((i14 << 21) & 1879048192));
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                nVar5 = nVar4;
                z14 = z11;
                fVar2 = fVarE;
                i27 = i25;
                aVar3 = aVar2;
                j1Var2 = j1VarC;
                gVar4 = gVar3;
                qVar3 = qVar2;
            }
            u1VarH = pVarF.H();
            if (u1VarH == null) {
                return;
            }
            u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.SliderKt$Slider$11
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void a(@dl.e androidx.compose.runtime.p pVar2, int i310) {
                    SliderKt.e(f10, onValueChange, track, nVar5, z14, fVar2, i27, aVar3, j1Var2, gVar4, qVar3, pVar2, i11 | 1, i12, i13);
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                    a(pVar2, num.intValue());
                    return kotlin.b2.f124493a;
                }
            });
        }
        i14 |= 24576;
        z11 = z10;
        if ((i11 & 458752) != 0) {
            if ((i13 & 32) == 0) {
                i28 = 65536;
            } else {
                i28 = 65536;
            }
            i14 |= i28;
        }
        i17 = i13 & 64;
        if (i17 != 0) {
            i14 |= 1572864;
            i18 = i10;
        } else {
            i18 = i10;
            if ((i11 & 3670016) == 0) {
                if (pVarF.y(i18)) {
                    i19 = 1048576;
                } else {
                    i19 = 524288;
                }
                i14 |= i19;
            }
        }
        i20 = i13 & 128;
        if (i20 != 0) {
            i14 |= 12582912;
        } else if ((i11 & 29360128) == 0) {
            if (pVarF.s(aVar)) {
                i21 = 8388608;
            } else {
                i21 = 4194304;
            }
            i14 |= i21;
        }
        if ((i11 & 234881024) != 0) {
            i14 |= ((i13 & 256) == 0 || !pVarF.s(j1Var)) ? 33554432 : 67108864;
        }
        i22 = i13 & 512;
        if (i22 != 0) {
            i14 |= com.google.android.exoplayer2.j.G;
        } else if ((i11 & 1879048192) == 0) {
            if (pVarF.s(gVar)) {
                i23 = 536870912;
            } else {
                i23 = 268435456;
            }
            i14 |= i23;
        }
        if ((i12 & 14) == 0) {
            i24 = i12 | (((i13 & 1024) == 0 || !pVarF.s(qVar)) ? 2 : 4);
        } else {
            i24 = i12;
        }
        if ((i14 & 1533916891) != 306783378) {
            pVarF.W();
            if ((i11 & 1) != 0) {
                if (i29 != 0) {
                    nVar3 = androidx.compose.ui.n.INSTANCE;
                } else {
                    nVar3 = nVar2;
                }
                if (i15 != 0) {
                    z11 = true;
                }
                if ((i13 & 32) != 0) {
                    fVarE = fi.t.e(0.0f, 1.0f);
                    i14 &= -458753;
                } else {
                    fVarE = fVar;
                }
                if (i17 != 0) {
                    i25 = 0;
                } else {
                    i25 = i18;
                }
                if (i20 != 0) {
                    aVar2 = null;
                } else {
                    aVar2 = aVar;
                }
                if ((i13 & 256) != 0) {
                    j1VarC = SliderDefaults.f10488a.c(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, pVarF, 0, 6, 1023);
                    i14 &= -234881025;
                } else {
                    j1VarC = j1Var;
                }
                if (i22 != 0) {
                    pVarF.T(-492369756);
                    objU2 = pVarF.U();
                    if (objU2 == androidx.compose.runtime.p.INSTANCE.a()) {
                        objU2 = androidx.compose.foundation.interaction.f.a();
                        pVarF.N(objU2);
                    }
                    pVarF.c0();
                    gVar2 = (androidx.compose.foundation.interaction.g) objU2;
                } else {
                    gVar2 = gVar;
                }
                if ((i13 & 1024) != 0) {
                    Boolean boolValueOf10 = Boolean.valueOf(z11);
                    pVarF.T(1618982084);
                    zS = pVarF.s(gVar2) | pVarF.s(j1VarC) | pVarF.s(boolValueOf10);
                    objU = pVarF.U();
                    if (zS) {
                        yh.q<k1, androidx.compose.runtime.p, Integer, kotlin.b2> qVar111 = new yh.q<k1, androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.SliderKt$Slider$9$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(3);
                            }

                            @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                            @androidx.compose.runtime.h
                            public final void a(@dl.d k1 it, @dl.e androidx.compose.runtime.p pVar2, int i310) {
                                kotlin.jvm.internal.f0.p(it, "it");
                                if ((i310 & 81) == 16 && pVar2.b()) {
                                    pVar2.l();
                                    return;
                                }
                                if (ComposerKt.g0()) {
                                    ComposerKt.w0(1647281944, i310, -1, "androidx.compose.material3.Slider.<anonymous>.<anonymous> (Slider.kt:325)");
                                }
                                SliderDefaults sliderDefaults = SliderDefaults.f10488a;
                                androidx.compose.foundation.interaction.g gVar5 = gVar2;
                                j1 j1Var3 = j1VarC;
                                boolean z15 = z11;
                                int i311 = i14;
                                sliderDefaults.a(gVar5, null, j1Var3, z15, 0L, pVar2, 196608 | ((i311 >> 27) & 14) | ((i311 >> 18) & bb.c.b.f30796me) | ((i311 >> 3) & bb.c.g.f32954lc), 18);
                                if (ComposerKt.g0()) {
                                    ComposerKt.v0();
                                }
                            }

                            @Override // yh.q
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(k1 k1Var, androidx.compose.runtime.p pVar2, Integer num) {
                                a(k1Var, pVar2, num.intValue());
                                return kotlin.b2.f124493a;
                            }
                        };
                        z12 = true;
                        objU = androidx.compose.runtime.internal.b.c(1647281944, true, qVar111);
                        pVarF.N(objU);
                    } else {
                        yh.q<k1, androidx.compose.runtime.p, Integer, kotlin.b2> qVar112 = new yh.q<k1, androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.SliderKt$Slider$9$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(3);
                            }

                            @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                            @androidx.compose.runtime.h
                            public final void a(@dl.d k1 it, @dl.e androidx.compose.runtime.p pVar2, int i310) {
                                kotlin.jvm.internal.f0.p(it, "it");
                                if ((i310 & 81) == 16 && pVar2.b()) {
                                    pVar2.l();
                                    return;
                                }
                                if (ComposerKt.g0()) {
                                    ComposerKt.w0(1647281944, i310, -1, "androidx.compose.material3.Slider.<anonymous>.<anonymous> (Slider.kt:325)");
                                }
                                SliderDefaults sliderDefaults = SliderDefaults.f10488a;
                                androidx.compose.foundation.interaction.g gVar5 = gVar2;
                                j1 j1Var3 = j1VarC;
                                boolean z15 = z11;
                                int i311 = i14;
                                sliderDefaults.a(gVar5, null, j1Var3, z15, 0L, pVar2, 196608 | ((i311 >> 27) & 14) | ((i311 >> 18) & bb.c.b.f30796me) | ((i311 >> 3) & bb.c.g.f32954lc), 18);
                                if (ComposerKt.g0()) {
                                    ComposerKt.v0();
                                }
                            }

                            @Override // yh.q
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(k1 k1Var, androidx.compose.runtime.p pVar2, Integer num) {
                                a(k1Var, pVar2, num.intValue());
                                return kotlin.b2.f124493a;
                            }
                        };
                        z12 = true;
                        objU = androidx.compose.runtime.internal.b.c(1647281944, true, qVar112);
                        pVarF.N(objU);
                    }
                    pVarF.c0();
                    i24 &= -15;
                    qVar2 = (yh.q) objU;
                } else {
                    gVar2 = gVar2;
                    z12 = true;
                    qVar2 = qVar;
                }
                gVar3 = gVar2;
                nVar4 = nVar3;
                i26 = i24;
            } else {
                if (i29 != 0) {
                    nVar3 = androidx.compose.ui.n.INSTANCE;
                } else {
                    nVar3 = nVar2;
                }
                if (i15 != 0) {
                    z11 = true;
                }
                if ((i13 & 32) != 0) {
                    fVarE = fi.t.e(0.0f, 1.0f);
                    i14 &= -458753;
                } else {
                    fVarE = fVar;
                }
                if (i17 != 0) {
                    i25 = 0;
                } else {
                    i25 = i18;
                }
                if (i20 != 0) {
                    aVar2 = null;
                } else {
                    aVar2 = aVar;
                }
                if ((i13 & 256) != 0) {
                    j1VarC = SliderDefaults.f10488a.c(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, pVarF, 0, 6, 1023);
                    i14 &= -234881025;
                } else {
                    j1VarC = j1Var;
                }
                if (i22 != 0) {
                    pVarF.T(-492369756);
                    objU2 = pVarF.U();
                    if (objU2 == androidx.compose.runtime.p.INSTANCE.a()) {
                        objU2 = androidx.compose.foundation.interaction.f.a();
                        pVarF.N(objU2);
                    }
                    pVarF.c0();
                    gVar2 = (androidx.compose.foundation.interaction.g) objU2;
                } else {
                    gVar2 = gVar;
                }
                if ((i13 & 1024) != 0) {
                    Boolean boolValueOf11 = Boolean.valueOf(z11);
                    pVarF.T(1618982084);
                    zS = pVarF.s(gVar2) | pVarF.s(j1VarC) | pVarF.s(boolValueOf11);
                    objU = pVarF.U();
                    if (zS) {
                        yh.q<k1, androidx.compose.runtime.p, Integer, kotlin.b2> qVar113 = new yh.q<k1, androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.SliderKt$Slider$9$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(3);
                            }

                            @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                            @androidx.compose.runtime.h
                            public final void a(@dl.d k1 it, @dl.e androidx.compose.runtime.p pVar2, int i310) {
                                kotlin.jvm.internal.f0.p(it, "it");
                                if ((i310 & 81) == 16 && pVar2.b()) {
                                    pVar2.l();
                                    return;
                                }
                                if (ComposerKt.g0()) {
                                    ComposerKt.w0(1647281944, i310, -1, "androidx.compose.material3.Slider.<anonymous>.<anonymous> (Slider.kt:325)");
                                }
                                SliderDefaults sliderDefaults = SliderDefaults.f10488a;
                                androidx.compose.foundation.interaction.g gVar5 = gVar2;
                                j1 j1Var3 = j1VarC;
                                boolean z15 = z11;
                                int i311 = i14;
                                sliderDefaults.a(gVar5, null, j1Var3, z15, 0L, pVar2, 196608 | ((i311 >> 27) & 14) | ((i311 >> 18) & bb.c.b.f30796me) | ((i311 >> 3) & bb.c.g.f32954lc), 18);
                                if (ComposerKt.g0()) {
                                    ComposerKt.v0();
                                }
                            }

                            @Override // yh.q
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(k1 k1Var, androidx.compose.runtime.p pVar2, Integer num) {
                                a(k1Var, pVar2, num.intValue());
                                return kotlin.b2.f124493a;
                            }
                        };
                        z12 = true;
                        objU = androidx.compose.runtime.internal.b.c(1647281944, true, qVar113);
                        pVarF.N(objU);
                    } else {
                        yh.q<k1, androidx.compose.runtime.p, Integer, kotlin.b2> qVar114 = new yh.q<k1, androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.SliderKt$Slider$9$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(3);
                            }

                            @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                            @androidx.compose.runtime.h
                            public final void a(@dl.d k1 it, @dl.e androidx.compose.runtime.p pVar2, int i310) {
                                kotlin.jvm.internal.f0.p(it, "it");
                                if ((i310 & 81) == 16 && pVar2.b()) {
                                    pVar2.l();
                                    return;
                                }
                                if (ComposerKt.g0()) {
                                    ComposerKt.w0(1647281944, i310, -1, "androidx.compose.material3.Slider.<anonymous>.<anonymous> (Slider.kt:325)");
                                }
                                SliderDefaults sliderDefaults = SliderDefaults.f10488a;
                                androidx.compose.foundation.interaction.g gVar5 = gVar2;
                                j1 j1Var3 = j1VarC;
                                boolean z15 = z11;
                                int i311 = i14;
                                sliderDefaults.a(gVar5, null, j1Var3, z15, 0L, pVar2, 196608 | ((i311 >> 27) & 14) | ((i311 >> 18) & bb.c.b.f30796me) | ((i311 >> 3) & bb.c.g.f32954lc), 18);
                                if (ComposerKt.g0()) {
                                    ComposerKt.v0();
                                }
                            }

                            @Override // yh.q
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(k1 k1Var, androidx.compose.runtime.p pVar2, Integer num) {
                                a(k1Var, pVar2, num.intValue());
                                return kotlin.b2.f124493a;
                            }
                        };
                        z12 = true;
                        objU = androidx.compose.runtime.internal.b.c(1647281944, true, qVar114);
                        pVarF.N(objU);
                    }
                    pVarF.c0();
                    i24 &= -15;
                    qVar2 = (yh.q) objU;
                } else {
                    gVar2 = gVar2;
                    z12 = true;
                    qVar2 = qVar;
                }
                gVar3 = gVar2;
                nVar4 = nVar3;
                i26 = i24;
            }
            pVarF.O();
            if (ComposerKt.g0()) {
                ComposerKt.w0(387052651, i14, i26, "androidx.compose.material3.Slider (Slider.kt:312)");
            }
            if (i25 >= 0) {
                z13 = z12;
            } else {
                z13 = false;
            }
            if (!z13) {
                throw new IllegalArgumentException("steps should be >= 0".toString());
            }
            int i310 = i14 >> 9;
            int i311 = i14 << 6;
            f(nVar4, z11, gVar3, onValueChange, aVar2, i25, f10, fVarE, qVar2, track, pVarF, (i310 & 57344) | (i310 & 14) | (i310 & 112) | ((i14 >> 21) & bb.c.b.f30796me) | (i311 & bb.c.g.f32954lc) | ((i14 >> 3) & 458752) | ((i14 << 18) & 3670016) | (i311 & 29360128) | ((i26 << 24) & 234881024) | ((i14 << 21) & 1879048192));
            if (ComposerKt.g0()) {
                ComposerKt.v0();
            }
            nVar5 = nVar4;
            z14 = z11;
            fVar2 = fVarE;
            i27 = i25;
            aVar3 = aVar2;
            j1Var2 = j1VarC;
            gVar4 = gVar3;
            qVar3 = qVar2;
        } else {
            pVarF.W();
            if ((i11 & 1) != 0) {
                if (i29 != 0) {
                    nVar3 = androidx.compose.ui.n.INSTANCE;
                } else {
                    nVar3 = nVar2;
                }
                if (i15 != 0) {
                    z11 = true;
                }
                if ((i13 & 32) != 0) {
                    fVarE = fi.t.e(0.0f, 1.0f);
                    i14 &= -458753;
                } else {
                    fVarE = fVar;
                }
                if (i17 != 0) {
                    i25 = 0;
                } else {
                    i25 = i18;
                }
                if (i20 != 0) {
                    aVar2 = null;
                } else {
                    aVar2 = aVar;
                }
                if ((i13 & 256) != 0) {
                    j1VarC = SliderDefaults.f10488a.c(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, pVarF, 0, 6, 1023);
                    i14 &= -234881025;
                } else {
                    j1VarC = j1Var;
                }
                if (i22 != 0) {
                    pVarF.T(-492369756);
                    objU2 = pVarF.U();
                    if (objU2 == androidx.compose.runtime.p.INSTANCE.a()) {
                        objU2 = androidx.compose.foundation.interaction.f.a();
                        pVarF.N(objU2);
                    }
                    pVarF.c0();
                    gVar2 = (androidx.compose.foundation.interaction.g) objU2;
                } else {
                    gVar2 = gVar;
                }
                if ((i13 & 1024) != 0) {
                    Boolean boolValueOf12 = Boolean.valueOf(z11);
                    pVarF.T(1618982084);
                    zS = pVarF.s(gVar2) | pVarF.s(j1VarC) | pVarF.s(boolValueOf12);
                    objU = pVarF.U();
                    if (zS) {
                        yh.q<k1, androidx.compose.runtime.p, Integer, kotlin.b2> qVar115 = new yh.q<k1, androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.SliderKt$Slider$9$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(3);
                            }

                            @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                            @androidx.compose.runtime.h
                            public final void a(@dl.d k1 it, @dl.e androidx.compose.runtime.p pVar2, int i312) {
                                kotlin.jvm.internal.f0.p(it, "it");
                                if ((i312 & 81) == 16 && pVar2.b()) {
                                    pVar2.l();
                                    return;
                                }
                                if (ComposerKt.g0()) {
                                    ComposerKt.w0(1647281944, i312, -1, "androidx.compose.material3.Slider.<anonymous>.<anonymous> (Slider.kt:325)");
                                }
                                SliderDefaults sliderDefaults = SliderDefaults.f10488a;
                                androidx.compose.foundation.interaction.g gVar5 = gVar2;
                                j1 j1Var3 = j1VarC;
                                boolean z15 = z11;
                                int i313 = i14;
                                sliderDefaults.a(gVar5, null, j1Var3, z15, 0L, pVar2, 196608 | ((i313 >> 27) & 14) | ((i313 >> 18) & bb.c.b.f30796me) | ((i313 >> 3) & bb.c.g.f32954lc), 18);
                                if (ComposerKt.g0()) {
                                    ComposerKt.v0();
                                }
                            }

                            @Override // yh.q
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(k1 k1Var, androidx.compose.runtime.p pVar2, Integer num) {
                                a(k1Var, pVar2, num.intValue());
                                return kotlin.b2.f124493a;
                            }
                        };
                        z12 = true;
                        objU = androidx.compose.runtime.internal.b.c(1647281944, true, qVar115);
                        pVarF.N(objU);
                    } else {
                        yh.q<k1, androidx.compose.runtime.p, Integer, kotlin.b2> qVar116 = new yh.q<k1, androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.SliderKt$Slider$9$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(3);
                            }

                            @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                            @androidx.compose.runtime.h
                            public final void a(@dl.d k1 it, @dl.e androidx.compose.runtime.p pVar2, int i312) {
                                kotlin.jvm.internal.f0.p(it, "it");
                                if ((i312 & 81) == 16 && pVar2.b()) {
                                    pVar2.l();
                                    return;
                                }
                                if (ComposerKt.g0()) {
                                    ComposerKt.w0(1647281944, i312, -1, "androidx.compose.material3.Slider.<anonymous>.<anonymous> (Slider.kt:325)");
                                }
                                SliderDefaults sliderDefaults = SliderDefaults.f10488a;
                                androidx.compose.foundation.interaction.g gVar5 = gVar2;
                                j1 j1Var3 = j1VarC;
                                boolean z15 = z11;
                                int i313 = i14;
                                sliderDefaults.a(gVar5, null, j1Var3, z15, 0L, pVar2, 196608 | ((i313 >> 27) & 14) | ((i313 >> 18) & bb.c.b.f30796me) | ((i313 >> 3) & bb.c.g.f32954lc), 18);
                                if (ComposerKt.g0()) {
                                    ComposerKt.v0();
                                }
                            }

                            @Override // yh.q
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(k1 k1Var, androidx.compose.runtime.p pVar2, Integer num) {
                                a(k1Var, pVar2, num.intValue());
                                return kotlin.b2.f124493a;
                            }
                        };
                        z12 = true;
                        objU = androidx.compose.runtime.internal.b.c(1647281944, true, qVar116);
                        pVarF.N(objU);
                    }
                    pVarF.c0();
                    i24 &= -15;
                    qVar2 = (yh.q) objU;
                } else {
                    gVar2 = gVar2;
                    z12 = true;
                    qVar2 = qVar;
                }
                gVar3 = gVar2;
                nVar4 = nVar3;
                i26 = i24;
            } else {
                if (i29 != 0) {
                    nVar3 = androidx.compose.ui.n.INSTANCE;
                } else {
                    nVar3 = nVar2;
                }
                if (i15 != 0) {
                    z11 = true;
                }
                if ((i13 & 32) != 0) {
                    fVarE = fi.t.e(0.0f, 1.0f);
                    i14 &= -458753;
                } else {
                    fVarE = fVar;
                }
                if (i17 != 0) {
                    i25 = 0;
                } else {
                    i25 = i18;
                }
                if (i20 != 0) {
                    aVar2 = null;
                } else {
                    aVar2 = aVar;
                }
                if ((i13 & 256) != 0) {
                    j1VarC = SliderDefaults.f10488a.c(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, pVarF, 0, 6, 1023);
                    i14 &= -234881025;
                } else {
                    j1VarC = j1Var;
                }
                if (i22 != 0) {
                    pVarF.T(-492369756);
                    objU2 = pVarF.U();
                    if (objU2 == androidx.compose.runtime.p.INSTANCE.a()) {
                        objU2 = androidx.compose.foundation.interaction.f.a();
                        pVarF.N(objU2);
                    }
                    pVarF.c0();
                    gVar2 = (androidx.compose.foundation.interaction.g) objU2;
                } else {
                    gVar2 = gVar;
                }
                if ((i13 & 1024) != 0) {
                    Boolean boolValueOf13 = Boolean.valueOf(z11);
                    pVarF.T(1618982084);
                    zS = pVarF.s(gVar2) | pVarF.s(j1VarC) | pVarF.s(boolValueOf13);
                    objU = pVarF.U();
                    if (zS) {
                        yh.q<k1, androidx.compose.runtime.p, Integer, kotlin.b2> qVar117 = new yh.q<k1, androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.SliderKt$Slider$9$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(3);
                            }

                            @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                            @androidx.compose.runtime.h
                            public final void a(@dl.d k1 it, @dl.e androidx.compose.runtime.p pVar2, int i312) {
                                kotlin.jvm.internal.f0.p(it, "it");
                                if ((i312 & 81) == 16 && pVar2.b()) {
                                    pVar2.l();
                                    return;
                                }
                                if (ComposerKt.g0()) {
                                    ComposerKt.w0(1647281944, i312, -1, "androidx.compose.material3.Slider.<anonymous>.<anonymous> (Slider.kt:325)");
                                }
                                SliderDefaults sliderDefaults = SliderDefaults.f10488a;
                                androidx.compose.foundation.interaction.g gVar5 = gVar2;
                                j1 j1Var3 = j1VarC;
                                boolean z15 = z11;
                                int i313 = i14;
                                sliderDefaults.a(gVar5, null, j1Var3, z15, 0L, pVar2, 196608 | ((i313 >> 27) & 14) | ((i313 >> 18) & bb.c.b.f30796me) | ((i313 >> 3) & bb.c.g.f32954lc), 18);
                                if (ComposerKt.g0()) {
                                    ComposerKt.v0();
                                }
                            }

                            @Override // yh.q
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(k1 k1Var, androidx.compose.runtime.p pVar2, Integer num) {
                                a(k1Var, pVar2, num.intValue());
                                return kotlin.b2.f124493a;
                            }
                        };
                        z12 = true;
                        objU = androidx.compose.runtime.internal.b.c(1647281944, true, qVar117);
                        pVarF.N(objU);
                    } else {
                        yh.q<k1, androidx.compose.runtime.p, Integer, kotlin.b2> qVar118 = new yh.q<k1, androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.SliderKt$Slider$9$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(3);
                            }

                            @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                            @androidx.compose.runtime.h
                            public final void a(@dl.d k1 it, @dl.e androidx.compose.runtime.p pVar2, int i312) {
                                kotlin.jvm.internal.f0.p(it, "it");
                                if ((i312 & 81) == 16 && pVar2.b()) {
                                    pVar2.l();
                                    return;
                                }
                                if (ComposerKt.g0()) {
                                    ComposerKt.w0(1647281944, i312, -1, "androidx.compose.material3.Slider.<anonymous>.<anonymous> (Slider.kt:325)");
                                }
                                SliderDefaults sliderDefaults = SliderDefaults.f10488a;
                                androidx.compose.foundation.interaction.g gVar5 = gVar2;
                                j1 j1Var3 = j1VarC;
                                boolean z15 = z11;
                                int i313 = i14;
                                sliderDefaults.a(gVar5, null, j1Var3, z15, 0L, pVar2, 196608 | ((i313 >> 27) & 14) | ((i313 >> 18) & bb.c.b.f30796me) | ((i313 >> 3) & bb.c.g.f32954lc), 18);
                                if (ComposerKt.g0()) {
                                    ComposerKt.v0();
                                }
                            }

                            @Override // yh.q
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(k1 k1Var, androidx.compose.runtime.p pVar2, Integer num) {
                                a(k1Var, pVar2, num.intValue());
                                return kotlin.b2.f124493a;
                            }
                        };
                        z12 = true;
                        objU = androidx.compose.runtime.internal.b.c(1647281944, true, qVar118);
                        pVarF.N(objU);
                    }
                    pVarF.c0();
                    i24 &= -15;
                    qVar2 = (yh.q) objU;
                } else {
                    gVar2 = gVar2;
                    z12 = true;
                    qVar2 = qVar;
                }
                gVar3 = gVar2;
                nVar4 = nVar3;
                i26 = i24;
            }
            pVarF.O();
            if (ComposerKt.g0()) {
                ComposerKt.w0(387052651, i14, i26, "androidx.compose.material3.Slider (Slider.kt:312)");
            }
            if (i25 >= 0) {
                z13 = z12;
            } else {
                z13 = false;
            }
            if (!z13) {
                throw new IllegalArgumentException("steps should be >= 0".toString());
            }
            int i312 = i14 >> 9;
            int i313 = i14 << 6;
            f(nVar4, z11, gVar3, onValueChange, aVar2, i25, f10, fVarE, qVar2, track, pVarF, (i312 & 57344) | (i312 & 14) | (i312 & 112) | ((i14 >> 21) & bb.c.b.f30796me) | (i313 & bb.c.g.f32954lc) | ((i14 >> 3) & 458752) | ((i14 << 18) & 3670016) | (i313 & 29360128) | ((i26 << 24) & 234881024) | ((i14 << 21) & 1879048192));
            if (ComposerKt.g0()) {
                ComposerKt.v0();
            }
            nVar5 = nVar4;
            z14 = z11;
            fVar2 = fVarE;
            i27 = i25;
            aVar3 = aVar2;
            j1Var2 = j1VarC;
            gVar4 = gVar3;
            qVar3 = qVar2;
        }
        u1VarH = pVarF.H();
        if (u1VarH == null) {
            return;
        }
        u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.SliderKt$Slider$11
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            public final void a(@dl.e androidx.compose.runtime.p pVar2, int i314) {
                SliderKt.e(f10, onValueChange, track, nVar5, z14, fVar2, i27, aVar3, j1Var2, gVar4, qVar3, pVar2, i11 | 1, i12, i13);
            }

            @Override // yh.p
            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                a(pVar2, num.intValue());
                return kotlin.b2.f124493a;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    @androidx.compose.runtime.i(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.h
    public static final void f(final androidx.compose.ui.n nVar, final boolean z10, final androidx.compose.foundation.interaction.g gVar, final yh.l<? super Float, kotlin.b2> lVar, final yh.a<kotlin.b2> aVar, final int i10, final float f10, final fi.f<Float> fVar, final yh.q<? super k1, ? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> qVar, final yh.q<? super k1, ? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> qVar2, androidx.compose.runtime.p pVar, final int i11) {
        int i12;
        int i13;
        boolean z11;
        androidx.compose.runtime.d2 d2Var;
        final androidx.compose.runtime.a1 a1Var;
        androidx.compose.runtime.p pVar2;
        androidx.compose.runtime.p pVar3;
        androidx.compose.runtime.p pVarF = pVar.F(851260148);
        if ((i11 & 14) == 0) {
            i12 = (pVarF.s(nVar) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 112) == 0) {
            i12 |= pVarF.u(z10) ? 32 : 16;
        }
        if ((i11 & bb.c.b.f30796me) == 0) {
            i12 |= pVarF.s(gVar) ? 256 : 128;
        }
        if ((i11 & bb.c.g.f32954lc) == 0) {
            i12 |= pVarF.s(lVar) ? 2048 : 1024;
        }
        if ((57344 & i11) == 0) {
            i12 |= pVarF.s(aVar) ? 16384 : 8192;
        }
        if ((458752 & i11) == 0) {
            i12 |= pVarF.y(i10) ? 131072 : 65536;
        }
        if ((3670016 & i11) == 0) {
            i12 |= pVarF.w(f10) ? 1048576 : 524288;
        }
        if ((29360128 & i11) == 0) {
            i12 |= pVarF.s(fVar) ? 8388608 : 4194304;
        }
        if ((234881024 & i11) == 0) {
            i12 |= pVarF.s(qVar) ? 67108864 : 33554432;
        }
        if ((1879048192 & i11) == 0) {
            i12 |= pVarF.s(qVar2) ? 536870912 : 268435456;
        }
        int i14 = i12;
        if ((1533916891 & i14) == 306783378 && pVarF.b()) {
            pVarF.l();
            pVar3 = pVarF;
        } else {
            if (ComposerKt.g0()) {
                ComposerKt.w0(851260148, i14, -1, "androidx.compose.material3.SliderImpl (Slider.kt:798)");
            }
            Float fValueOf = Float.valueOf(f10);
            pVarF.T(511388516);
            boolean zS = pVarF.s(fValueOf) | pVarF.s(lVar);
            Object objU = pVarF.U();
            if (zS || objU == androidx.compose.runtime.p.INSTANCE.a()) {
                objU = new yh.l<Float, kotlin.b2>() { // from class: androidx.compose.material3.SliderKt$SliderImpl$onValueChangeState$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    public final void a(float f11) {
                        if (f11 == f10) {
                            return;
                        }
                        lVar.invoke(Float.valueOf(f11));
                    }

                    @Override // yh.l
                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(Float f11) {
                        a(f11.floatValue());
                        return kotlin.b2.f124493a;
                    }
                };
                pVarF.N(objU);
            }
            pVarF.c0();
            final m2 m2VarT = androidx.compose.runtime.e2.t(objU, pVarF, 0);
            Integer numValueOf = Integer.valueOf(i10);
            pVarF.T(1157296644);
            boolean zS2 = pVarF.s(numValueOf);
            Object objU2 = pVarF.U();
            if (zS2 || objU2 == androidx.compose.runtime.p.INSTANCE.a()) {
                objU2 = Q(i10);
                pVarF.N(objU2);
            }
            pVarF.c0();
            final float[] fArr = (float[]) objU2;
            pVarF.T(-492369756);
            Object objU3 = pVarF.U();
            androidx.compose.runtime.p.Companion companion = androidx.compose.runtime.p.INSTANCE;
            if (objU3 == companion.a()) {
                androidx.compose.runtime.a1 a1VarG = h2.g(Float.valueOf(H()), null, 2, null);
                pVarF.N(a1VarG);
                objU3 = a1VarG;
            }
            pVarF.c0();
            androidx.compose.runtime.a1 a1Var2 = (androidx.compose.runtime.a1) objU3;
            pVarF.T(-492369756);
            Object objU4 = pVarF.U();
            if (objU4 == companion.a()) {
                objU4 = h2.g(0, null, 2, null);
                pVarF.N(objU4);
            }
            pVarF.c0();
            final androidx.compose.runtime.a1 a1Var3 = (androidx.compose.runtime.a1) objU4;
            if (pVarF.K(CompositionLocalsKt.p()) == LayoutDirection.Rtl) {
                z11 = true;
                i13 = -492369756;
            } else {
                i13 = -492369756;
                z11 = false;
            }
            pVarF.T(i13);
            Object objU5 = pVarF.U();
            if (objU5 == companion.a()) {
                d2Var = null;
                objU5 = h2.g(Float.valueOf(g(fVar, 0.0f, 0.0f, f10)), null, 2, null);
                pVarF.N(objU5);
            } else {
                d2Var = null;
            }
            pVarF.c0();
            final androidx.compose.runtime.a1 a1Var4 = (androidx.compose.runtime.a1) objU5;
            pVarF.T(-492369756);
            Object objU6 = pVarF.U();
            if (objU6 == companion.a()) {
                objU6 = h2.g(Float.valueOf(0.0f), d2Var, 2, d2Var);
                pVarF.N(objU6);
            }
            pVarF.c0();
            final androidx.compose.runtime.a1 a1Var5 = (androidx.compose.runtime.a1) objU6;
            final float fG = G(fVar.D().floatValue(), fVar.e().floatValue(), fi.u.H(f10, fVar.D().floatValue(), fVar.e().floatValue()));
            pVarF.T(-492369756);
            Object objU7 = pVarF.U();
            if (objU7 == companion.a()) {
                objU7 = new k1(fG, fArr);
                pVarF.N(objU7);
            }
            pVarF.c0();
            k1 k1Var = (k1) objU7;
            k1Var.c(fG);
            k1Var.d(fArr);
            int i15 = i14 >> 21;
            pVarF.T(1157296644);
            boolean zS3 = pVarF.s(fVar);
            Object objU8 = pVarF.U();
            if (zS3 || objU8 == companion.a()) {
                a1Var = a1Var2;
                pVar2 = pVarF;
                SliderDraggableState sliderDraggableState = new SliderDraggableState(new yh.l<Float, kotlin.b2>() { // from class: androidx.compose.material3.SliderKt$SliderImpl$draggableState$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    public final void a(float f11) {
                        float f12 = 2;
                        float fMax = Math.max(a1Var3.getValue().floatValue() - (a1Var.getValue().floatValue() / f12), 0.0f);
                        float fMin = Math.min(a1Var.getValue().floatValue() / f12, fMax);
                        androidx.compose.runtime.a1<Float> a1Var6 = a1Var4;
                        a1Var6.setValue(Float.valueOf(a1Var6.getValue().floatValue() + f11 + a1Var5.getValue().floatValue()));
                        a1Var5.setValue(Float.valueOf(0.0f));
                        m2VarT.getValue().invoke(Float.valueOf(SliderKt.h(fVar, fMin, fMax, SliderKt.P(a1Var4.getValue().floatValue(), fArr, fMin, fMax))));
                    }

                    @Override // yh.l
                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(Float f11) {
                        a(f11.floatValue());
                        return kotlin.b2.f124493a;
                    }
                });
                pVar2.N(sliderDraggableState);
                objU8 = sliderDraggableState;
            } else {
                pVar2 = pVarF;
                a1Var = a1Var2;
            }
            pVar2.c0();
            final SliderDraggableState sliderDraggableState2 = (SliderDraggableState) objU8;
            m2 m2VarT2 = androidx.compose.runtime.e2.t(new yh.a<kotlin.b2>() { // from class: androidx.compose.material3.SliderKt$SliderImpl$gestureEndAction$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // yh.a
                public /* bridge */ /* synthetic */ kotlin.b2 invoke() {
                    invoke2();
                    return kotlin.b2.f124493a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    yh.a<kotlin.b2> aVar2;
                    if (sliderDraggableState2.g() || (aVar2 = aVar) == null) {
                        return;
                    }
                    aVar2.invoke();
                }
            }, pVar2, 0);
            androidx.compose.ui.n.Companion companion2 = androidx.compose.ui.n.INSTANCE;
            androidx.compose.ui.n nVarO = O(companion2, sliderDraggableState2, gVar, ((Number) a1Var3.getValue()).intValue(), z11, a1Var4, m2VarT2, a1Var5, z10);
            Orientation orientation = Orientation.Horizontal;
            boolean zG = sliderDraggableState2.g();
            pVar2.T(1157296644);
            boolean zS4 = pVar2.s(m2VarT2);
            Object objU9 = pVar2.U();
            if (zS4 || objU9 == companion.a()) {
                objU9 = new SliderKt$SliderImpl$drag$1$1(m2VarT2, null);
                pVar2.N(objU9);
            }
            pVar2.c0();
            pVar3 = pVar2;
            androidx.compose.ui.n nVarH = DraggableKt.h(companion2, sliderDraggableState2, orientation, (188 & 4) != 0 ? true : z10, (188 & 8) != 0 ? null : gVar, (188 & 16) != 0 ? false : zG, (188 & 32) != 0 ? new DraggableKt$draggable$1(null) : null, (188 & 64) != 0 ? new DraggableKt$draggable$2(null) : (yh.q) objU9, (188 & 128) != 0 ? false : z11);
            androidx.compose.ui.n nVarC = TouchTargetKt.c(nVar);
            t0.s0 s0Var = t0.s0.f140323a;
            androidx.compose.ui.n nVarS0 = FocusableKt.c(M(SizeKt.y(nVarC, s0Var.m(), s0Var.k(), 0.0f, 0.0f, 12, null), f10, z10, lVar, aVar, fVar, i10), z10, gVar).s0(nVarO).s0(nVarH);
            final androidx.compose.runtime.a1 a1Var6 = a1Var;
            androidx.compose.ui.layout.i0 i0Var = new androidx.compose.ui.layout.i0() { // from class: androidx.compose.material3.SliderKt$SliderImpl$2
                @Override // androidx.compose.ui.layout.i0
                @dl.d
                public final androidx.compose.ui.layout.j0 a(@dl.d androidx.compose.ui.layout.l0 Layout, @dl.d List<? extends androidx.compose.ui.layout.g0> measurables, long j10) {
                    kotlin.jvm.internal.f0.p(Layout, "$this$Layout");
                    kotlin.jvm.internal.f0.p(measurables, "measurables");
                    for (androidx.compose.ui.layout.g0 g0Var : measurables) {
                        if (LayoutIdKt.a(g0Var) == SliderComponents.THUMB) {
                            final androidx.compose.ui.layout.e1 e1VarZ1 = g0Var.z1(j10);
                            int iP = s1.b.p(j10) - e1VarZ1.getWidth();
                            for (androidx.compose.ui.layout.g0 g0Var2 : measurables) {
                                if (LayoutIdKt.a(g0Var2) == SliderComponents.TRACK) {
                                    final androidx.compose.ui.layout.e1 e1VarZ2 = g0Var2.z1(s1.b.e(j10, 0, iP, 0, 0, 8, null));
                                    int width = e1VarZ1.getWidth() + e1VarZ2.getWidth();
                                    int iMax = Math.max(e1VarZ2.getHeight(), e1VarZ1.getHeight());
                                    a1Var6.setValue(Float.valueOf(e1VarZ1.getWidth()));
                                    a1Var3.setValue(Integer.valueOf(width));
                                    final int width2 = e1VarZ1.getWidth() / 2;
                                    final int iL0 = di.d.L0(e1VarZ2.getWidth() * fG);
                                    final int height = (iMax - e1VarZ2.getHeight()) / 2;
                                    final int height2 = (iMax - e1VarZ1.getHeight()) / 2;
                                    return androidx.compose.ui.layout.k0.p(Layout, width, iMax, null, new yh.l<androidx.compose.ui.layout.e1.a, kotlin.b2>() { // from class: androidx.compose.material3.SliderKt$SliderImpl$2$measure$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(1);
                                        }

                                        public final void a(@dl.d androidx.compose.ui.layout.e1.a layout) {
                                            kotlin.jvm.internal.f0.p(layout, "$this$layout");
                                            androidx.compose.ui.layout.e1.a.v(layout, e1VarZ2, width2, height, 0.0f, 4, null);
                                            androidx.compose.ui.layout.e1.a.v(layout, e1VarZ1, iL0, height2, 0.0f, 4, null);
                                        }

                                        @Override // yh.l
                                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.ui.layout.e1.a aVar2) {
                                            a(aVar2);
                                            return kotlin.b2.f124493a;
                                        }
                                    }, 4, null);
                                }
                            }
                            throw new NoSuchElementException("Collection contains no element matching the predicate.");
                        }
                    }
                    throw new NoSuchElementException("Collection contains no element matching the predicate.");
                }

                @Override // androidx.compose.ui.layout.i0
                public /* synthetic */ int b(androidx.compose.ui.layout.n nVar2, List list, int i16) {
                    return androidx.compose.ui.layout.h0.c(this, nVar2, list, i16);
                }

                @Override // androidx.compose.ui.layout.i0
                public /* synthetic */ int c(androidx.compose.ui.layout.n nVar2, List list, int i16) {
                    return androidx.compose.ui.layout.h0.d(this, nVar2, list, i16);
                }

                @Override // androidx.compose.ui.layout.i0
                public /* synthetic */ int d(androidx.compose.ui.layout.n nVar2, List list, int i16) {
                    return androidx.compose.ui.layout.h0.a(this, nVar2, list, i16);
                }

                @Override // androidx.compose.ui.layout.i0
                public /* synthetic */ int e(androidx.compose.ui.layout.n nVar2, List list, int i16) {
                    return androidx.compose.ui.layout.h0.b(this, nVar2, list, i16);
                }
            };
            pVar3.T(-1323940314);
            s1.e eVar = (s1.e) pVar3.K(CompositionLocalsKt.i());
            LayoutDirection layoutDirection = (LayoutDirection) pVar3.K(CompositionLocalsKt.p());
            androidx.compose.ui.platform.d2 d2Var2 = (androidx.compose.ui.platform.d2) pVar3.K(CompositionLocalsKt.u());
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            yh.a<ComposeUiNode> aVarA = companion3.a();
            yh.q<androidx.compose.runtime.v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, kotlin.b2> qVarF = LayoutKt.f(nVarS0);
            if (!(pVar3.G() instanceof androidx.compose.runtime.e)) {
                ComposablesKt.n();
            }
            pVar3.h();
            if (pVar3.D()) {
                pVar3.L(aVarA);
            } else {
                pVar3.d();
            }
            pVar3.Y();
            androidx.compose.runtime.p pVarB = Updater.b(pVar3);
            Updater.j(pVarB, i0Var, companion3.d());
            Updater.j(pVarB, eVar, companion3.b());
            Updater.j(pVarB, layoutDirection, companion3.c());
            Updater.j(pVarB, d2Var2, companion3.f());
            pVar3.x();
            qVarF.invoke(androidx.compose.runtime.v1.a(androidx.compose.runtime.v1.b(pVar3)), pVar3, 0);
            pVar3.T(2058660585);
            pVar3.T(1870435165);
            androidx.compose.ui.n nVarB = LayoutIdKt.b(companion2, SliderComponents.THUMB);
            pVar3.T(733328855);
            androidx.compose.ui.c.Companion companion4 = androidx.compose.ui.c.INSTANCE;
            androidx.compose.ui.layout.i0 i0VarK = BoxKt.k(companion4.C(), false, pVar3, 0);
            pVar3.T(-1323940314);
            s1.e eVar2 = (s1.e) pVar3.K(CompositionLocalsKt.i());
            LayoutDirection layoutDirection2 = (LayoutDirection) pVar3.K(CompositionLocalsKt.p());
            androidx.compose.ui.platform.d2 d2Var3 = (androidx.compose.ui.platform.d2) pVar3.K(CompositionLocalsKt.u());
            yh.a<ComposeUiNode> aVarA2 = companion3.a();
            yh.q<androidx.compose.runtime.v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, kotlin.b2> qVarF2 = LayoutKt.f(nVarB);
            if (!(pVar3.G() instanceof androidx.compose.runtime.e)) {
                ComposablesKt.n();
            }
            pVar3.h();
            if (pVar3.D()) {
                pVar3.L(aVarA2);
            } else {
                pVar3.d();
            }
            pVar3.Y();
            androidx.compose.runtime.p pVarB2 = Updater.b(pVar3);
            Updater.j(pVarB2, i0VarK, companion3.d());
            Updater.j(pVarB2, eVar2, companion3.b());
            Updater.j(pVarB2, layoutDirection2, companion3.c());
            Updater.j(pVarB2, d2Var3, companion3.f());
            pVar3.x();
            qVarF2.invoke(androidx.compose.runtime.v1.a(androidx.compose.runtime.v1.b(pVar3)), pVar3, 0);
            pVar3.T(2058660585);
            pVar3.T(-2137368960);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.f5954a;
            pVar3.T(-1220826601);
            qVar.invoke(k1Var, pVar3, Integer.valueOf((i15 & 112) | 6));
            pVar3.c0();
            pVar3.c0();
            pVar3.c0();
            pVar3.f();
            pVar3.c0();
            pVar3.c0();
            androidx.compose.ui.n nVarB2 = LayoutIdKt.b(companion2, SliderComponents.TRACK);
            pVar3.T(733328855);
            androidx.compose.ui.layout.i0 i0VarK2 = BoxKt.k(companion4.C(), false, pVar3, 0);
            pVar3.T(-1323940314);
            s1.e eVar3 = (s1.e) pVar3.K(CompositionLocalsKt.i());
            LayoutDirection layoutDirection3 = (LayoutDirection) pVar3.K(CompositionLocalsKt.p());
            androidx.compose.ui.platform.d2 d2Var4 = (androidx.compose.ui.platform.d2) pVar3.K(CompositionLocalsKt.u());
            yh.a<ComposeUiNode> aVarA3 = companion3.a();
            yh.q<androidx.compose.runtime.v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, kotlin.b2> qVarF3 = LayoutKt.f(nVarB2);
            if (!(pVar3.G() instanceof androidx.compose.runtime.e)) {
                ComposablesKt.n();
            }
            pVar3.h();
            if (pVar3.D()) {
                pVar3.L(aVarA3);
            } else {
                pVar3.d();
            }
            pVar3.Y();
            androidx.compose.runtime.p pVarB3 = Updater.b(pVar3);
            Updater.j(pVarB3, i0VarK2, companion3.d());
            Updater.j(pVarB3, eVar3, companion3.b());
            Updater.j(pVarB3, layoutDirection3, companion3.c());
            Updater.j(pVarB3, d2Var4, companion3.f());
            pVar3.x();
            qVarF3.invoke(androidx.compose.runtime.v1.a(androidx.compose.runtime.v1.b(pVar3)), pVar3, 0);
            pVar3.T(2058660585);
            pVar3.T(-2137368960);
            pVar3.T(971611456);
            qVar2.invoke(k1Var, pVar3, Integer.valueOf(((i14 >> 24) & 112) | 6));
            pVar3.c0();
            pVar3.c0();
            pVar3.c0();
            pVar3.f();
            pVar3.c0();
            pVar3.c0();
            pVar3.c0();
            pVar3.c0();
            pVar3.f();
            pVar3.c0();
            if (ComposerKt.g0()) {
                ComposerKt.v0();
            }
        }
        androidx.compose.runtime.u1 u1VarH = pVar3.H();
        if (u1VarH == null) {
            return;
        }
        u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.SliderKt$SliderImpl$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            public final void a(@dl.e androidx.compose.runtime.p pVar4, int i16) {
                SliderKt.f(nVar, z10, gVar, lVar, aVar, i10, f10, fVar, qVar, qVar2, pVar4, i11 | 1);
            }

            @Override // yh.p
            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar4, Integer num) {
                a(pVar4, num.intValue());
                return kotlin.b2.f124493a;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float g(fi.f<Float> fVar, float f10, float f11, float f12) {
        return K(fVar.D().floatValue(), fVar.e().floatValue(), f12, f10, f11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float h(fi.f<Float> fVar, float f10, float f11, float f12) {
        return K(f10, f11, f12, fVar.D().floatValue(), fVar.e().floatValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    @androidx.compose.runtime.i(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.h
    public static final void i(final androidx.compose.foundation.layout.k kVar, final float f10, final yh.q<? super androidx.compose.foundation.layout.k, ? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> qVar, androidx.compose.runtime.p pVar, final int i10) {
        int i11;
        androidx.compose.runtime.p pVarF = pVar.F(-2104116536);
        if ((i10 & 14) == 0) {
            i11 = (pVarF.s(kVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 112) == 0) {
            i11 |= pVarF.w(f10) ? 32 : 16;
        }
        if ((i10 & bb.c.b.f30796me) == 0) {
            i11 |= pVarF.s(qVar) ? 256 : 128;
        }
        int i12 = i11;
        if ((i12 & bb.c.b.f30586db) == 146 && pVarF.b()) {
            pVarF.l();
        } else {
            if (ComposerKt.g0()) {
                ComposerKt.w0(-2104116536, i12, -1, "androidx.compose.material3.TempRangeSliderThumb (Slider.kt:946)");
            }
            androidx.compose.ui.n nVarO = PaddingKt.o(androidx.compose.ui.n.INSTANCE, f10, 0.0f, 0.0f, 0.0f, 14, null);
            androidx.compose.ui.c.Companion companion = androidx.compose.ui.c.INSTANCE;
            androidx.compose.ui.n nVarB = kVar.b(nVarO, companion.o());
            int i13 = (i12 << 3) & bb.c.g.f32954lc;
            pVarF.T(733328855);
            int i14 = i13 >> 3;
            androidx.compose.ui.layout.i0 i0VarK = BoxKt.k(companion.C(), false, pVarF, (i14 & 112) | (i14 & 14));
            pVarF.T(-1323940314);
            s1.e eVar = (s1.e) pVarF.K(CompositionLocalsKt.i());
            LayoutDirection layoutDirection = (LayoutDirection) pVarF.K(CompositionLocalsKt.p());
            androidx.compose.ui.platform.d2 d2Var = (androidx.compose.ui.platform.d2) pVarF.K(CompositionLocalsKt.u());
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            yh.a<ComposeUiNode> aVarA = companion2.a();
            yh.q<androidx.compose.runtime.v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, kotlin.b2> qVarF = LayoutKt.f(nVarB);
            int i15 = ((((i13 << 3) & 112) << 9) & bb.c.g.f32954lc) | 6;
            if (!(pVarF.G() instanceof androidx.compose.runtime.e)) {
                ComposablesKt.n();
            }
            pVarF.h();
            if (pVarF.D()) {
                pVarF.L(aVarA);
            } else {
                pVarF.d();
            }
            pVarF.Y();
            androidx.compose.runtime.p pVarB = Updater.b(pVarF);
            Updater.j(pVarB, i0VarK, companion2.d());
            Updater.j(pVarB, eVar, companion2.b());
            Updater.j(pVarB, layoutDirection, companion2.c());
            Updater.j(pVarB, d2Var, companion2.f());
            pVarF.x();
            qVarF.invoke(androidx.compose.runtime.v1.a(androidx.compose.runtime.v1.b(pVarF)), pVarF, Integer.valueOf((i15 >> 3) & 112));
            pVarF.T(2058660585);
            pVarF.T(-2137368960);
            if (((i15 >> 9) & 14 & 11) == 2 && pVarF.b()) {
                pVarF.l();
            } else {
                qVar.invoke(BoxScopeInstance.f5954a, pVarF, Integer.valueOf(((i13 >> 6) & 112) | 6));
            }
            pVarF.c0();
            pVarF.c0();
            pVarF.f();
            pVarF.c0();
            pVarF.c0();
            if (ComposerKt.g0()) {
                ComposerKt.v0();
            }
        }
        androidx.compose.runtime.u1 u1VarH = pVarF.H();
        if (u1VarH == null) {
            return;
        }
        u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.SliderKt$TempRangeSliderThumb$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            public final void a(@dl.e androidx.compose.runtime.p pVar2, int i16) {
                SliderKt.i(kVar, f10, qVar, pVar2, i10 | 1);
            }

            @Override // yh.p
            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                a(pVar2, num.intValue());
                return kotlin.b2.f124493a;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.h
    public static final void j(final androidx.compose.ui.n nVar, final j1 j1Var, final boolean z10, final float f10, final float f11, final float[] fArr, final float f12, final float f13, androidx.compose.runtime.p pVar, final int i10) {
        androidx.compose.runtime.p pVarF = pVar.F(1015664062);
        if (ComposerKt.g0()) {
            ComposerKt.w0(1015664062, i10, -1, "androidx.compose.material3.TempRangeSliderTrack (Slider.kt:960)");
        }
        final Ref.FloatRef floatRef = new Ref.FloatRef();
        final Ref.FloatRef floatRef2 = new Ref.FloatRef();
        s1.e eVar = (s1.e) pVarF.K(CompositionLocalsKt.i());
        floatRef.f124888b = eVar.E1(f12) / 2;
        floatRef2.f124888b = eVar.E1(f10528f);
        int i11 = ((i10 >> 6) & 14) | 48 | ((i10 << 3) & bb.c.b.f30796me);
        final m2<androidx.compose.ui.graphics.l0> m2VarC = j1Var.c(z10, false, pVarF, i11);
        final m2<androidx.compose.ui.graphics.l0> m2VarC2 = j1Var.c(z10, true, pVarF, i11);
        final m2<androidx.compose.ui.graphics.l0> m2VarB = j1Var.b(z10, false, pVarF, i11);
        final m2<androidx.compose.ui.graphics.l0> m2VarB2 = j1Var.b(z10, true, pVarF, i11);
        CanvasKt.b(nVar, new yh.l<androidx.compose.ui.graphics.drawscope.g, kotlin.b2>() { // from class: androidx.compose.material3.SliderKt$TempRangeSliderTrack$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void a(@dl.d androidx.compose.ui.graphics.drawscope.g Canvas) {
                kotlin.jvm.internal.f0.p(Canvas, "$this$Canvas");
                boolean z11 = Canvas.getLayoutDirection() == LayoutDirection.Rtl;
                long jA = b1.g.a(floatRef.f124888b, b1.f.r(Canvas.I()));
                long jA2 = b1.g.a(b1.m.t(Canvas.c()) - floatRef.f124888b, b1.f.r(Canvas.I()));
                long j10 = z11 ? jA2 : jA;
                long j11 = z11 ? jA : jA2;
                long jM = m2VarC.getValue().M();
                float f14 = f13;
                j2.Companion companion = j2.INSTANCE;
                long j12 = j11;
                long j13 = j10;
                androidx.compose.ui.graphics.drawscope.f.C(Canvas, jM, j10, j11, f14, companion.b(), null, 0.0f, null, 0, 480, null);
                androidx.compose.ui.graphics.drawscope.f.C(Canvas, m2VarC2.getValue().M(), b1.g.a(b1.f.p(j13) + ((b1.f.p(j12) - b1.f.p(j13)) * f10), b1.f.r(Canvas.I())), b1.g.a(b1.f.p(j13) + ((b1.f.p(j12) - b1.f.p(j13)) * f11), b1.f.r(Canvas.I())), f13, companion.b(), null, 0.0f, null, 0, 480, null);
                float[] fArr2 = fArr;
                float f15 = f11;
                float f16 = f10;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                int length = fArr2.length;
                for (int i12 = 0; i12 < length; i12++) {
                    float f17 = fArr2[i12];
                    Boolean boolValueOf = Boolean.valueOf(f17 > f15 || f17 < f16);
                    Object arrayList = linkedHashMap.get(boolValueOf);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                        linkedHashMap.put(boolValueOf, arrayList);
                    }
                    ((List) arrayList).add(Float.valueOf(f17));
                }
                m2<androidx.compose.ui.graphics.l0> m2Var = m2VarB;
                m2<androidx.compose.ui.graphics.l0> m2Var2 = m2VarB2;
                Ref.FloatRef floatRef3 = floatRef2;
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    boolean zBooleanValue = ((Boolean) entry.getKey()).booleanValue();
                    List list = (List) entry.getValue();
                    ArrayList arrayList2 = new ArrayList(kotlin.collections.t.Y(list, 10));
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(b1.f.d(b1.g.a(b1.f.p(b1.g.h(j13, j12, ((Number) it.next()).floatValue())), b1.f.r(Canvas.I()))));
                    }
                    long j14 = j12;
                    long j15 = j13;
                    androidx.compose.ui.graphics.drawscope.f.H(Canvas, arrayList2, androidx.compose.ui.graphics.t1.INSTANCE.b(), (zBooleanValue ? m2Var : m2Var2).getValue().M(), floatRef3.f124888b, j2.INSTANCE.b(), null, 0.0f, null, 0, 480, null);
                    j13 = j15;
                    floatRef3 = floatRef3;
                    j12 = j14;
                }
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.ui.graphics.drawscope.g gVar) {
                a(gVar);
                return kotlin.b2.f124493a;
            }
        }, pVarF, i10 & 14);
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        androidx.compose.runtime.u1 u1VarH = pVarF.H();
        if (u1VarH == null) {
            return;
        }
        u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.SliderKt$TempRangeSliderTrack$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            public final void a(@dl.e androidx.compose.runtime.p pVar2, int i12) {
                SliderKt.j(nVar, j1Var, z10, f10, f11, fArr, f12, f13, pVar2, i10 | 1);
            }

            @Override // yh.p
            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                a(pVar2, num.intValue());
                return kotlin.b2.f124493a;
            }
        });
    }
}
