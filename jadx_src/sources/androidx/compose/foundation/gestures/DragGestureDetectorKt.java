package androidx.compose.foundation.gestures;

import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.i0;
import androidx.compose.ui.input.pointer.m0;
import androidx.compose.ui.input.pointer.x;
import androidx.compose.ui.platform.d2;
import androidx.constraintlayout.core.motion.utils.w;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import java.util.List;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.c0;
import kotlin.jvm.internal.f0;
import kotlin.t0;

/* JADX INFO: compiled from: DragGestureDetector.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a_\u0010\f\u001a\u0004\u0018\u00010\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u000126\u0010\u000b\u001a2\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\b¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n0\u0003H\u0086@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0001¢\u0006\u0004\b\f\u0010\r\u001a9\u0010\u0011\u001a\u00020\u0010*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\n0\u000eH\u0086@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u0012\u001a'\u0010\u0013\u001a\u0004\u0018\u00010\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0001¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u0088\u0001\u0010\u001b\u001a\u00020\n*\u00020\u00152\u0014\b\u0002\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\n0\u000e2\u000e\b\u0002\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\n0\u00172\u000e\b\u0002\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\n0\u001726\u0010\u000f\u001a2\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\b¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u001a\u0012\u0004\u0012\u00020\n0\u0003H\u0086@ø\u0001\u0001ø\u0001\u0001¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u0088\u0001\u0010\u001d\u001a\u00020\n*\u00020\u00152\u0014\b\u0002\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\n0\u000e2\u000e\b\u0002\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\n0\u00172\u000e\b\u0002\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\n0\u001726\u0010\u000f\u001a2\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\b¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u001a\u0012\u0004\u0012\u00020\n0\u0003H\u0086@ø\u0001\u0001ø\u0001\u0001¢\u0006\u0004\b\u001d\u0010\u001c\u001a_\u0010\u001f\u001a\u0004\u0018\u00010\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u000126\u0010\u000b\u001a2\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\u001e¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n0\u0003H\u0086@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0001¢\u0006\u0004\b\u001f\u0010\r\u001ag\u0010\"\u001a\u0004\u0018\u00010\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010!\u001a\u00020 26\u0010\u000b\u001a2\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\u001e¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n0\u0003H\u0080@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0001¢\u0006\u0004\b\"\u0010#\u001a9\u0010$\u001a\u00020\u0010*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\n0\u000eH\u0086@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0001¢\u0006\u0004\b$\u0010\u0012\u001a'\u0010%\u001a\u0004\u0018\u00010\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0001¢\u0006\u0004\b%\u0010\u0014\u001a\u0088\u0001\u0010'\u001a\u00020\n*\u00020\u00152\u0014\b\u0002\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\n0\u000e2\u000e\b\u0002\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\n0\u00172\u000e\b\u0002\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\n0\u001726\u0010&\u001a2\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\u001e¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u001a\u0012\u0004\u0012\u00020\n0\u0003H\u0086@ø\u0001\u0001ø\u0001\u0001¢\u0006\u0004\b'\u0010\u001c\u001a_\u0010(\u001a\u0004\u0018\u00010\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u000126\u0010\u000b\u001a2\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\u001e¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n0\u0003H\u0086@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0001¢\u0006\u0004\b(\u0010\r\u001ag\u0010*\u001a\u0004\u0018\u00010\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010!\u001a\u00020 26\u0010)\u001a2\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\u001e¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n0\u0003H\u0080@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0001¢\u0006\u0004\b*\u0010#\u001a9\u0010+\u001a\u00020\u0010*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\n0\u000eH\u0086@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0001¢\u0006\u0004\b+\u0010\u0012\u001a'\u0010,\u001a\u0004\u0018\u00010\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0001¢\u0006\u0004\b,\u0010\u0014\u001a\u0088\u0001\u0010.\u001a\u00020\n*\u00020\u00152\u0014\b\u0002\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\n0\u000e2\u000e\b\u0002\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\n0\u00172\u000e\b\u0002\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\n0\u001726\u0010-\u001a2\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\u001e¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u001a\u0012\u0004\u0012\u00020\n0\u0003H\u0086@ø\u0001\u0001ø\u0001\u0001¢\u0006\u0004\b.\u0010\u001c\u001aa\u00101\u001a\u00020\u0010*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\n0\u000e2\u0012\u0010/\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u001e0\u000e2\u0012\u00100\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00100\u000eH\u0082Hø\u0001\u0000ø\u0001\u0001ø\u0001\u0001¢\u0006\u0004\b1\u00102\u001a;\u00104\u001a\u0004\u0018\u00010\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u00103\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00100\u000eH\u0082Hø\u0001\u0000ø\u0001\u0001ø\u0001\u0001¢\u0006\u0004\b4\u0010\u0012\u001a]\u00108\u001a\u0004\u0018\u00010\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010!\u001a\u00020 2\b\b\u0002\u00106\u001a\u0002052\b\b\u0002\u00107\u001a\u00020\u00102\u0018\u0010)\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\n0\u0003H\u0080Hø\u0001\u0000ø\u0001\u0001ø\u0001\u0001¢\u0006\u0004\b8\u00109\u001a\f\u0010;\u001a\u000205*\u00020:H\u0000\u001a'\u0010<\u001a\u0004\u0018\u00010\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0001¢\u0006\u0004\b<\u0010\u0014\u001a!\u0010>\u001a\u00020\u0010*\u00020=2\u0006\u0010\u0002\u001a\u00020\u0001H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b>\u0010?\u001a!\u0010A\u001a\u00020\u001e*\u00020@2\u0006\u0010!\u001a\u00020 H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bA\u0010B\"\u001a\u0010G\u001a\u0002058\u0000X\u0080\u0004¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bE\u0010F\"\u001a\u0010I\u001a\u0002058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0013\u0010D\u001a\u0004\bH\u0010F\"\u0017\u0010L\u001a\u00020J8\u0002X\u0082\u0004ø\u0001\u0001¢\u0006\u0006\n\u0004\b4\u0010K\"\u0017\u0010M\u001a\u00020J8\u0002X\u0082\u0004ø\u0001\u0001¢\u0006\u0006\n\u0004\b,\u0010K\"\u0014\u0010N\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010K\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006O"}, d2 = {"Landroidx/compose/ui/input/pointer/d;", "Landroidx/compose/ui/input/pointer/x;", "pointerId", "Lkotlin/Function2;", "Landroidx/compose/ui/input/pointer/y;", "Lkotlin/m0;", "name", "change", "Lb1/f;", "overSlop", "Lkotlin/b2;", "onTouchSlopReached", "k", "(Landroidx/compose/ui/input/pointer/d;JLyh/p;Lkotlin/coroutines/c;)Ljava/lang/Object;", "Lkotlin/Function1;", "onDrag", "", "x", "(Landroidx/compose/ui/input/pointer/d;JLyh/l;Lkotlin/coroutines/c;)Ljava/lang/Object;", "b", "(Landroidx/compose/ui/input/pointer/d;JLkotlin/coroutines/c;)Ljava/lang/Object;", "Landroidx/compose/ui/input/pointer/i0;", "onDragStart", "Lkotlin/Function0;", "onDragEnd", "onDragCancel", "dragAmount", "o", "(Landroidx/compose/ui/input/pointer/i0;Lyh/l;Lyh/a;Lyh/a;Lyh/p;Lkotlin/coroutines/c;)Ljava/lang/Object;", "q", "", "n", "Landroidx/compose/ui/input/pointer/m0;", "pointerType", "m", "(Landroidx/compose/ui/input/pointer/d;JILyh/p;Lkotlin/coroutines/c;)Ljava/lang/Object;", androidx.exifinterface.media.a.S4, "l", "onVerticalDrag", ak.aG, "f", "onPointerSlopReached", "e", androidx.exifinterface.media.a.W4, "d", "onHorizontalDrag", ak.aB, "motionFromChange", "motionConsumed", RXScreenCaptureService.KEY_WIDTH, "(Landroidx/compose/ui/input/pointer/d;JLyh/l;Lyh/l;Lyh/l;Lkotlin/coroutines/c;)Ljava/lang/Object;", "hasDragged", ak.aF, "Landroidx/compose/foundation/gestures/i;", "pointerDirectionConfig", "triggerOnMainAxisSlop", RXScreenCaptureService.KEY_HEIGHT, "(Landroidx/compose/ui/input/pointer/d;JILandroidx/compose/foundation/gestures/i;ZLyh/p;Lkotlin/coroutines/c;)Ljava/lang/Object;", "Landroidx/compose/foundation/gestures/Orientation;", "D", "g", "Landroidx/compose/ui/input/pointer/p;", "B", "(Landroidx/compose/ui/input/pointer/p;J)Z", "Landroidx/compose/ui/platform/d2;", "C", "(Landroidx/compose/ui/platform/d2;I)F", ak.av, "Landroidx/compose/foundation/gestures/i;", "y", "()Landroidx/compose/foundation/gestures/i;", "HorizontalPointerDirectionConfig", ak.aD, "VerticalPointerDirectionConfig", "Ls1/h;", "F", "mouseSlop", "defaultTouchSlop", "mouseToTouchSlopRatio", "foundation_release"}, k = 2, mv = {1, 7, 1})
public final class DragGestureDetectorKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private static final i f5175a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private static final i f5176b = new b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final float f5177c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final float f5178d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final float f5179e;

    /* JADX INFO: compiled from: DragGestureDetector.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001d\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0007\u0010\u0006J(\u0010\n\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004H\u0016ø\u0001\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\n\u0010\u000b\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006\f"}, d2 = {"androidx/compose/foundation/gestures/DragGestureDetectorKt$a", "Landroidx/compose/foundation/gestures/i;", "Lb1/f;", w.c.R, "", ak.av, "(J)F", ak.aF, "mainChange", "crossChange", "b", "(FF)J", "foundation_release"}, k = 1, mv = {1, 7, 1})
    public static final class a implements i {
        a() {
        }

        @Override // androidx.compose.foundation.gestures.i
        public float a(long offset) {
            return b1.f.p(offset);
        }

        @Override // androidx.compose.foundation.gestures.i
        public long b(float mainChange, float crossChange) {
            return b1.g.a(mainChange, crossChange);
        }

        @Override // androidx.compose.foundation.gestures.i
        public float c(long offset) {
            return b1.f.r(offset);
        }
    }

    /* JADX INFO: compiled from: DragGestureDetector.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001d\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0007\u0010\u0006J(\u0010\n\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004H\u0016ø\u0001\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\n\u0010\u000b\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006\f"}, d2 = {"androidx/compose/foundation/gestures/DragGestureDetectorKt$b", "Landroidx/compose/foundation/gestures/i;", "Lb1/f;", w.c.R, "", ak.av, "(J)F", ak.aF, "mainChange", "crossChange", "b", "(FF)J", "foundation_release"}, k = 1, mv = {1, 7, 1})
    public static final class b implements i {
        b() {
        }

        @Override // androidx.compose.foundation.gestures.i
        public float a(long offset) {
            return b1.f.r(offset);
        }

        @Override // androidx.compose.foundation.gestures.i
        public long b(float mainChange, float crossChange) {
            return b1.g.a(crossChange, mainChange);
        }

        @Override // androidx.compose.foundation.gestures.i
        public float c(long offset) {
            return b1.f.p(offset);
        }
    }

    static {
        float fG = s1.h.g((float) 0.125d);
        f5177c = fG;
        float fG2 = s1.h.g(18);
        f5178d = fG2;
        f5179e = fG / fG2;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0095  */
    /* JADX WARN: Code duplicated, block: B:28:0x00a9 A[LOOP:0: B:24:0x0093->B:28:0x00a9, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:64:0x00af A[EDGE_INSN: B:64:0x00af->B:30:0x00af BREAK  A[LOOP:0: B:24:0x0093->B:28:0x00a9], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0082 -> B:23:0x0088). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @dl.e
    public static final java.lang.Object A(@dl.d androidx.compose.ui.input.pointer.d r18, long r19, @dl.d yh.l<? super androidx.compose.ui.input.pointer.PointerInputChange, kotlin.b2> r21, @dl.d kotlin.coroutines.c<? super java.lang.Boolean> r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 302
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.A(androidx.compose.ui.input.pointer.d, long, yh.l, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean B(androidx.compose.ui.input.pointer.p pVar, long j10) {
        PointerInputChange pointerInputChange;
        List<PointerInputChange> listE = pVar.e();
        int size = listE.size();
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                pointerInputChange = null;
                break;
            }
            pointerInputChange = listE.get(i10);
            if (x.d(pointerInputChange.getId(), j10)) {
                break;
            }
            i10++;
        }
        PointerInputChange pointerInputChange2 = pointerInputChange;
        if (pointerInputChange2 != null && pointerInputChange2.getPressed()) {
            z10 = true;
        }
        return true ^ z10;
    }

    public static final float C(@dl.d d2 pointerSlop, int i10) {
        f0.p(pointerSlop, "$this$pointerSlop");
        return m0.i(i10, m0.INSTANCE.b()) ? pointerSlop.b() * f5179e : pointerSlop.b();
    }

    @dl.d
    public static final i D(@dl.d Orientation orientation) {
        f0.p(orientation, "<this>");
        return orientation == Orientation.Vertical ? f5176b : f5175a;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0095  */
    /* JADX WARN: Code duplicated, block: B:28:0x00a9 A[LOOP:0: B:24:0x0093->B:28:0x00a9, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:64:0x00af A[EDGE_INSN: B:64:0x00af->B:30:0x00af BREAK  A[LOOP:0: B:24:0x0093->B:28:0x00a9], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0082 -> B:23:0x0088). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @dl.e
    public static final java.lang.Object E(@dl.d androidx.compose.ui.input.pointer.d r18, long r19, @dl.d yh.l<? super androidx.compose.ui.input.pointer.PointerInputChange, kotlin.b2> r21, @dl.d kotlin.coroutines.c<? super java.lang.Boolean> r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 302
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.E(androidx.compose.ui.input.pointer.d, long, yh.l, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:24:0x007a  */
    /* JADX WARN: Code duplicated, block: B:27:0x008e A[LOOP:0: B:23:0x0078->B:27:0x008e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:57:0x0092 A[EDGE_INSN: B:57:0x0092->B:29:0x0092 BREAK  A[LOOP:0: B:23:0x0078->B:27:0x008e], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0067 -> B:22:0x006c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @dl.e
    public static final java.lang.Object b(@dl.d androidx.compose.ui.input.pointer.d r17, long r18, @dl.d kotlin.coroutines.c<? super androidx.compose.ui.input.pointer.PointerInputChange> r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 222
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.b(androidx.compose.ui.input.pointer.d, long, kotlin.coroutines.c):java.lang.Object");
    }

    private static final Object c(androidx.compose.ui.input.pointer.d dVar, long j10, yh.l<? super PointerInputChange, Boolean> lVar, kotlin.coroutines.c<? super PointerInputChange> cVar) {
        PointerInputChange pointerInputChange;
        while (true) {
            c0.e(0);
            PointerInputChange pointerInputChange2 = null;
            Object objT = androidx.compose.ui.input.pointer.c.t(dVar, null, cVar, 1, null);
            c0.e(1);
            androidx.compose.ui.input.pointer.p pVar = (androidx.compose.ui.input.pointer.p) objT;
            List<PointerInputChange> listE = pVar.e();
            int size = listE.size();
            int i10 = 0;
            while (true) {
                if (i10 >= size) {
                    pointerInputChange = null;
                    break;
                }
                pointerInputChange = listE.get(i10);
                if (x.d(pointerInputChange.getId(), j10)) {
                    break;
                }
                i10++;
            }
            PointerInputChange pointerInputChange3 = pointerInputChange;
            if (pointerInputChange3 == null) {
                return null;
            }
            if (androidx.compose.ui.input.pointer.q.e(pointerInputChange3)) {
                List<PointerInputChange> listE2 = pVar.e();
                int size2 = listE2.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    PointerInputChange pointerInputChange4 = listE2.get(i11);
                    if (pointerInputChange4.getPressed()) {
                        pointerInputChange2 = pointerInputChange4;
                        break;
                    }
                }
                PointerInputChange pointerInputChange5 = pointerInputChange2;
                if (pointerInputChange5 == null) {
                    return pointerInputChange3;
                }
                j10 = pointerInputChange5.getId();
            } else if (lVar.invoke(pointerInputChange3).booleanValue()) {
                return pointerInputChange3;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x007a  */
    /* JADX WARN: Code duplicated, block: B:27:0x008e A[LOOP:0: B:23:0x0078->B:27:0x008e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:61:0x0092 A[EDGE_INSN: B:61:0x0092->B:29:0x0092 BREAK  A[LOOP:0: B:23:0x0078->B:27:0x008e], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0067 -> B:22:0x006c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @dl.e
    public static final java.lang.Object d(@dl.d androidx.compose.ui.input.pointer.d r17, long r18, @dl.d kotlin.coroutines.c<? super androidx.compose.ui.input.pointer.PointerInputChange> r20) {
        /*
            Method dump skipped, instruction units count: 235
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.d(androidx.compose.ui.input.pointer.d, long, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:29:0x0105 A[LOOP:0: B:25:0x00ea->B:29:0x0105, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:75:0x0112 A[EDGE_INSN: B:75:0x0112->B:31:0x0112 BREAK  A[LOOP:0: B:25:0x00ea->B:29:0x0105], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x014c -> B:64:0x01c0). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:59:0x01aa -> B:60:0x01b6). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:73:0x01f7 -> B:64:0x01c0). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @dl.e
    public static final java.lang.Object e(@dl.d androidx.compose.ui.input.pointer.d r21, long r22, int r24, @dl.d yh.p<? super androidx.compose.ui.input.pointer.PointerInputChange, ? super java.lang.Float, kotlin.b2> r25, @dl.d kotlin.coroutines.c<? super androidx.compose.ui.input.pointer.PointerInputChange> r26) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 509
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.e(androidx.compose.ui.input.pointer.d, long, int, yh.p, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:29:0x0108 A[LOOP:0: B:25:0x00ed->B:29:0x0108, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:75:0x0115 A[EDGE_INSN: B:75:0x0115->B:31:0x0115 BREAK  A[LOOP:0: B:25:0x00ed->B:29:0x0108], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x014f -> B:20:0x00b9). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:59:0x01b1 -> B:60:0x01ba). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:73:0x01fc -> B:64:0x01c5). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @dl.e
    public static final java.lang.Object f(@dl.d androidx.compose.ui.input.pointer.d r20, long r21, @dl.d yh.p<? super androidx.compose.ui.input.pointer.PointerInputChange, ? super java.lang.Float, kotlin.b2> r23, @dl.d kotlin.coroutines.c<? super androidx.compose.ui.input.pointer.PointerInputChange> r24) {
        /*
            Method dump skipped, instruction units count: 517
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.f(androidx.compose.ui.input.pointer.d, long, yh.p, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v2, types: [T, androidx.compose.ui.input.pointer.y, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v6, types: [androidx.compose.ui.input.pointer.y] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object] */
    @dl.e
    public static final Object g(@dl.d androidx.compose.ui.input.pointer.d dVar, long j10, @dl.d kotlin.coroutines.c<? super PointerInputChange> cVar) throws Throwable {
        DragGestureDetectorKt$awaitLongPressOrCancellation$1 dragGestureDetectorKt$awaitLongPressOrCancellation$1;
        PointerInputChange pointerInputChange;
        ?? r10;
        Ref.ObjectRef objectRef;
        if (cVar instanceof DragGestureDetectorKt$awaitLongPressOrCancellation$1) {
            dragGestureDetectorKt$awaitLongPressOrCancellation$1 = (DragGestureDetectorKt$awaitLongPressOrCancellation$1) cVar;
            int i10 = dragGestureDetectorKt$awaitLongPressOrCancellation$1.f5213e;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                dragGestureDetectorKt$awaitLongPressOrCancellation$1.f5213e = i10 - Integer.MIN_VALUE;
            } else {
                dragGestureDetectorKt$awaitLongPressOrCancellation$1 = new DragGestureDetectorKt$awaitLongPressOrCancellation$1(cVar);
            }
        } else {
            dragGestureDetectorKt$awaitLongPressOrCancellation$1 = new DragGestureDetectorKt$awaitLongPressOrCancellation$1(cVar);
        }
        Object obj = dragGestureDetectorKt$awaitLongPressOrCancellation$1.f5212d;
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i11 = dragGestureDetectorKt$awaitLongPressOrCancellation$1.f5213e;
        if (i11 == 0) {
            t0.n(obj);
            if (B(dVar.s1(), j10)) {
                return null;
            }
            List<PointerInputChange> listE = dVar.s1().e();
            int i12 = 0;
            int size = listE.size();
            while (true) {
                if (i12 >= size) {
                    pointerInputChange = null;
                    break;
                }
                pointerInputChange = listE.get(i12);
                if (x.d(pointerInputChange.getId(), j10)) {
                    break;
                }
                i12++;
            }
            r10 = pointerInputChange;
            if (r10 == 0) {
                return null;
            }
            Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
            Ref.ObjectRef objectRef3 = new Ref.ObjectRef();
            objectRef3.f124891b = r10;
            long jD = dVar.getViewConfiguration().d();
            try {
                DragGestureDetectorKt$awaitLongPressOrCancellation$2 dragGestureDetectorKt$awaitLongPressOrCancellation$2 = new DragGestureDetectorKt$awaitLongPressOrCancellation$2(objectRef3, objectRef2, null);
                dragGestureDetectorKt$awaitLongPressOrCancellation$1.f5210b = r10;
                dragGestureDetectorKt$awaitLongPressOrCancellation$1.f5211c = objectRef2;
                dragGestureDetectorKt$awaitLongPressOrCancellation$1.f5213e = 1;
                if (dVar.f0(jD, dragGestureDetectorKt$awaitLongPressOrCancellation$2, dragGestureDetectorKt$awaitLongPressOrCancellation$1) == objH) {
                    return objH;
                }
                return null;
            } catch (PointerEventTimeoutCancellationException unused) {
                objectRef = objectRef2;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            objectRef = (Ref.ObjectRef) dragGestureDetectorKt$awaitLongPressOrCancellation$1.f5211c;
            r10 = (PointerInputChange) dragGestureDetectorKt$awaitLongPressOrCancellation$1.f5210b;
            try {
                t0.n(obj);
                return null;
            } catch (PointerEventTimeoutCancellationException unused2) {
            }
        }
        PointerInputChange pointerInputChange2 = (PointerInputChange) objectRef.f124891b;
        return pointerInputChange2 == null ? r10 : pointerInputChange2;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:29:0x0106 A[LOOP:0: B:25:0x00eb->B:29:0x0106, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:79:0x0113 A[EDGE_INSN: B:79:0x0113->B:31:0x0113 BREAK  A[LOOP:0: B:25:0x00eb->B:29:0x0106], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:62:0x01aa -> B:63:0x01ae). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @dl.e
    public static final java.lang.Object h(@dl.d androidx.compose.ui.input.pointer.d r21, long r22, int r24, @dl.d androidx.compose.foundation.gestures.i r25, boolean r26, @dl.d yh.p<? super androidx.compose.ui.input.pointer.PointerInputChange, ? super b1.f, kotlin.b2> r27, @dl.d kotlin.coroutines.c<? super androidx.compose.ui.input.pointer.PointerInputChange> r28) {
        /*
            Method dump skipped, instruction units count: 502
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.h(androidx.compose.ui.input.pointer.d, long, int, androidx.compose.foundation.gestures.i, boolean, yh.p, kotlin.coroutines.c):java.lang.Object");
    }

    private static final Object i(androidx.compose.ui.input.pointer.d dVar, long j10, int i10, i iVar, boolean z10, yh.p<? super PointerInputChange, ? super b1.f, b2> pVar, kotlin.coroutines.c<? super PointerInputChange> cVar) {
        PointerInputChange pointerInputChange;
        PointerInputChange pointerInputChange2;
        PointerInputChange pointerInputChange3;
        float fAbs;
        long jU;
        long id2 = j10;
        if (B(dVar.s1(), id2)) {
            return null;
        }
        float fC = C(dVar.getViewConfiguration(), i10);
        do {
            float fA = 0.0f;
            float fC2 = 0.0f;
            while (true) {
                c0.e(0);
                Object objT = androidx.compose.ui.input.pointer.c.t(dVar, null, cVar, 1, null);
                c0.e(1);
                androidx.compose.ui.input.pointer.p pVar2 = (androidx.compose.ui.input.pointer.p) objT;
                List<PointerInputChange> listE = pVar2.e();
                int size = listE.size();
                int i11 = 0;
                while (true) {
                    if (i11 >= size) {
                        pointerInputChange = null;
                        break;
                    }
                    pointerInputChange = listE.get(i11);
                    if (x.d(pointerInputChange.getId(), id2)) {
                        break;
                    }
                    i11++;
                }
                pointerInputChange2 = pointerInputChange;
                if (pointerInputChange2 == null || pointerInputChange2.A()) {
                    return null;
                }
                if (androidx.compose.ui.input.pointer.q.e(pointerInputChange2)) {
                    List<PointerInputChange> listE2 = pVar2.e();
                    int size2 = listE2.size();
                    int i12 = 0;
                    while (true) {
                        if (i12 >= size2) {
                            pointerInputChange3 = null;
                            break;
                        }
                        pointerInputChange3 = listE2.get(i12);
                        if (pointerInputChange3.getPressed()) {
                            break;
                        }
                        i12++;
                    }
                    PointerInputChange pointerInputChange4 = pointerInputChange3;
                    if (pointerInputChange4 == null) {
                        return null;
                    }
                    id2 = pointerInputChange4.getId();
                } else {
                    long position = pointerInputChange2.getPosition();
                    long previousPosition = pointerInputChange2.getPreviousPosition();
                    fA += iVar.a(position) - iVar.a(previousPosition);
                    fC2 += iVar.c(position) - iVar.c(previousPosition);
                    fAbs = z10 ? Math.abs(fA) : b1.f.m(iVar.b(fA, fC2));
                    if (fAbs < fC) {
                        PointerEventPass pointerEventPass = PointerEventPass.Final;
                        c0.e(0);
                        dVar.r1(pointerEventPass, cVar);
                        c0.e(1);
                        if (pointerInputChange2.A()) {
                            return null;
                        }
                    }
                }
            }
            if (z10) {
                jU = iVar.b(fA - (Math.signum(fA) * fC), fC2);
            } else {
                long jB = iVar.b(fA, fC2);
                jU = b1.f.u(jB, b1.f.x(b1.f.j(jB, fAbs), fC));
            }
            pVar.invoke(pointerInputChange2, b1.f.d(jU));
        } while (!pointerInputChange2.A());
        return pointerInputChange2;
    }

    public static /* synthetic */ Object j(androidx.compose.ui.input.pointer.d dVar, long j10, int i10, i iVar, boolean z10, yh.p pVar, kotlin.coroutines.c cVar, int i11, Object obj) {
        Object obj2;
        PointerInputChange pointerInputChange;
        Object obj3;
        float fAbs;
        long jU;
        i iVarY = (i11 & 4) != 0 ? y() : iVar;
        int i12 = 1;
        boolean z11 = (i11 & 8) != 0 ? true : z10;
        long id2 = j10;
        PointerEventPass pointerEventPass = null;
        if (B(dVar.s1(), id2)) {
            return null;
        }
        float fC = C(dVar.getViewConfiguration(), i10);
        while (true) {
            float fA = 0.0f;
            float fC2 = 0.0f;
            while (true) {
                int i13 = 0;
                c0.e(0);
                Object objT = androidx.compose.ui.input.pointer.c.t(dVar, pointerEventPass, cVar, i12, pointerEventPass);
                c0.e(i12);
                androidx.compose.ui.input.pointer.p pVar2 = (androidx.compose.ui.input.pointer.p) objT;
                List<PointerInputChange> listE = pVar2.e();
                int size = listE.size();
                int i14 = 0;
                while (true) {
                    if (i14 >= size) {
                        fC = fC;
                        obj2 = pointerEventPass;
                        break;
                    }
                    obj2 = listE.get(i14);
                    fC = fC;
                    if (x.d(((PointerInputChange) obj2).getId(), id2)) {
                        break;
                    }
                    i14++;
                    fC = fC;
                }
                pointerInputChange = (PointerInputChange) obj2;
                if (pointerInputChange == null || pointerInputChange.A()) {
                    return pointerEventPass;
                }
                if (androidx.compose.ui.input.pointer.q.e(pointerInputChange)) {
                    List<PointerInputChange> listE2 = pVar2.e();
                    int size2 = listE2.size();
                    while (true) {
                        if (i13 >= size2) {
                            obj3 = pointerEventPass;
                            break;
                        }
                        obj3 = listE2.get(i13);
                        if (((PointerInputChange) obj3).getPressed()) {
                            break;
                        }
                        i13++;
                    }
                    PointerInputChange pointerInputChange2 = (PointerInputChange) obj3;
                    if (pointerInputChange2 == null) {
                        return pointerEventPass;
                    }
                    id2 = pointerInputChange2.getId();
                    i12 = 1;
                } else {
                    long position = pointerInputChange.getPosition();
                    long previousPosition = pointerInputChange.getPreviousPosition();
                    fA += iVarY.a(position) - iVarY.a(previousPosition);
                    fC2 += iVarY.c(position) - iVarY.c(previousPosition);
                    fAbs = z11 ? Math.abs(fA) : b1.f.m(iVarY.b(fA, fC2));
                    if (fAbs < fC) {
                        PointerEventPass pointerEventPass2 = PointerEventPass.Final;
                        c0.e(0);
                        dVar.r1(pointerEventPass2, cVar);
                        c0.e(1);
                        if (pointerInputChange.A()) {
                            return null;
                        }
                        i12 = 1;
                        pointerEventPass = null;
                    }
                }
            }
            if (z11) {
                jU = iVarY.b(fA - (Math.signum(fA) * fC), fC2);
                fC = fC;
            } else {
                long jB = iVarY.b(fA, fC2);
                long j11 = b1.f.j(jB, fAbs);
                fC = fC;
                jU = b1.f.u(jB, b1.f.x(j11, fC));
            }
            pVar.invoke(pointerInputChange, b1.f.d(jU));
            if (pointerInputChange.A()) {
                return pointerInputChange;
            }
            i12 = 1;
            pointerEventPass = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:29:0x0108 A[LOOP:0: B:25:0x00ed->B:29:0x0108, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:75:0x0117 A[EDGE_INSN: B:75:0x0117->B:31:0x0117 BREAK  A[LOOP:0: B:25:0x00ed->B:29:0x0108], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x0150 -> B:20:0x00bc). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:59:0x01b5 -> B:60:0x01c0). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:73:0x0200 -> B:64:0x01cb). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @dl.e
    public static final java.lang.Object k(@dl.d androidx.compose.ui.input.pointer.d r19, long r20, @dl.d yh.p<? super androidx.compose.ui.input.pointer.PointerInputChange, ? super b1.f, kotlin.b2> r22, @dl.d kotlin.coroutines.c<? super androidx.compose.ui.input.pointer.PointerInputChange> r23) {
        /*
            Method dump skipped, instruction units count: 521
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.k(androidx.compose.ui.input.pointer.d, long, yh.p, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:24:0x007a  */
    /* JADX WARN: Code duplicated, block: B:27:0x008e A[LOOP:0: B:23:0x0078->B:27:0x008e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:61:0x0092 A[EDGE_INSN: B:61:0x0092->B:29:0x0092 BREAK  A[LOOP:0: B:23:0x0078->B:27:0x008e], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0067 -> B:22:0x006c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @dl.e
    public static final java.lang.Object l(@dl.d androidx.compose.ui.input.pointer.d r17, long r18, @dl.d kotlin.coroutines.c<? super androidx.compose.ui.input.pointer.PointerInputChange> r20) {
        /*
            Method dump skipped, instruction units count: 235
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.l(androidx.compose.ui.input.pointer.d, long, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:29:0x0105 A[LOOP:0: B:25:0x00ea->B:29:0x0105, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:75:0x0112 A[EDGE_INSN: B:75:0x0112->B:31:0x0112 BREAK  A[LOOP:0: B:25:0x00ea->B:29:0x0105], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x014c -> B:64:0x01c0). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:59:0x01aa -> B:60:0x01b6). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:73:0x01f7 -> B:64:0x01c0). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @dl.e
    public static final java.lang.Object m(@dl.d androidx.compose.ui.input.pointer.d r21, long r22, int r24, @dl.d yh.p<? super androidx.compose.ui.input.pointer.PointerInputChange, ? super java.lang.Float, kotlin.b2> r25, @dl.d kotlin.coroutines.c<? super androidx.compose.ui.input.pointer.PointerInputChange> r26) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 509
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.m(androidx.compose.ui.input.pointer.d, long, int, yh.p, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:29:0x0108 A[LOOP:0: B:25:0x00ed->B:29:0x0108, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:75:0x0115 A[EDGE_INSN: B:75:0x0115->B:31:0x0115 BREAK  A[LOOP:0: B:25:0x00ed->B:29:0x0108], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x014f -> B:20:0x00b9). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:59:0x01b1 -> B:60:0x01ba). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:73:0x01fc -> B:64:0x01c5). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @dl.e
    public static final java.lang.Object n(@dl.d androidx.compose.ui.input.pointer.d r20, long r21, @dl.d yh.p<? super androidx.compose.ui.input.pointer.PointerInputChange, ? super java.lang.Float, kotlin.b2> r23, @dl.d kotlin.coroutines.c<? super androidx.compose.ui.input.pointer.PointerInputChange> r24) {
        /*
            Method dump skipped, instruction units count: 517
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.n(androidx.compose.ui.input.pointer.d, long, yh.p, kotlin.coroutines.c):java.lang.Object");
    }

    @dl.e
    public static final Object o(@dl.d i0 i0Var, @dl.d yh.l<? super b1.f, b2> lVar, @dl.d yh.a<b2> aVar, @dl.d yh.a<b2> aVar2, @dl.d yh.p<? super PointerInputChange, ? super b1.f, b2> pVar, @dl.d kotlin.coroutines.c<? super b2> cVar) {
        Object objD = ForEachGestureKt.d(i0Var, new DragGestureDetectorKt$detectDragGestures$5(lVar, pVar, aVar2, aVar, null), cVar);
        return objD == kotlin.coroutines.intrinsics.b.h() ? objD : b2.f124493a;
    }

    public static /* synthetic */ Object p(i0 i0Var, yh.l lVar, yh.a aVar, yh.a aVar2, yh.p pVar, kotlin.coroutines.c cVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            lVar = new yh.l<b1.f, b2>() { // from class: androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGestures$2
                public final void a(long j10) {
                }

                @Override // yh.l
                public /* bridge */ /* synthetic */ b2 invoke(b1.f fVar) {
                    a(fVar.getF30368a());
                    return b2.f124493a;
                }
            };
        }
        yh.l lVar2 = lVar;
        if ((i10 & 2) != 0) {
            aVar = new yh.a<b2>() { // from class: androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGestures$3
                @Override // yh.a
                public /* bridge */ /* synthetic */ b2 invoke() {
                    invoke2();
                    return b2.f124493a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }
            };
        }
        yh.a aVar3 = aVar;
        if ((i10 & 4) != 0) {
            aVar2 = new yh.a<b2>() { // from class: androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGestures$4
                @Override // yh.a
                public /* bridge */ /* synthetic */ b2 invoke() {
                    invoke2();
                    return b2.f124493a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }
            };
        }
        return o(i0Var, lVar2, aVar3, aVar2, pVar, cVar);
    }

    @dl.e
    public static final Object q(@dl.d i0 i0Var, @dl.d yh.l<? super b1.f, b2> lVar, @dl.d yh.a<b2> aVar, @dl.d yh.a<b2> aVar2, @dl.d yh.p<? super PointerInputChange, ? super b1.f, b2> pVar, @dl.d kotlin.coroutines.c<? super b2> cVar) {
        Object objD = ForEachGestureKt.d(i0Var, new DragGestureDetectorKt$detectDragGesturesAfterLongPress$5(aVar2, lVar, aVar, pVar, null), cVar);
        return objD == kotlin.coroutines.intrinsics.b.h() ? objD : b2.f124493a;
    }

    public static /* synthetic */ Object r(i0 i0Var, yh.l lVar, yh.a aVar, yh.a aVar2, yh.p pVar, kotlin.coroutines.c cVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            lVar = new yh.l<b1.f, b2>() { // from class: androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGesturesAfterLongPress$2
                public final void a(long j10) {
                }

                @Override // yh.l
                public /* bridge */ /* synthetic */ b2 invoke(b1.f fVar) {
                    a(fVar.getF30368a());
                    return b2.f124493a;
                }
            };
        }
        yh.l lVar2 = lVar;
        if ((i10 & 2) != 0) {
            aVar = new yh.a<b2>() { // from class: androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGesturesAfterLongPress$3
                @Override // yh.a
                public /* bridge */ /* synthetic */ b2 invoke() {
                    invoke2();
                    return b2.f124493a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }
            };
        }
        yh.a aVar3 = aVar;
        if ((i10 & 4) != 0) {
            aVar2 = new yh.a<b2>() { // from class: androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGesturesAfterLongPress$4
                @Override // yh.a
                public /* bridge */ /* synthetic */ b2 invoke() {
                    invoke2();
                    return b2.f124493a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }
            };
        }
        return q(i0Var, lVar2, aVar3, aVar2, pVar, cVar);
    }

    @dl.e
    public static final Object s(@dl.d i0 i0Var, @dl.d yh.l<? super b1.f, b2> lVar, @dl.d yh.a<b2> aVar, @dl.d yh.a<b2> aVar2, @dl.d yh.p<? super PointerInputChange, ? super Float, b2> pVar, @dl.d kotlin.coroutines.c<? super b2> cVar) {
        Object objD = ForEachGestureKt.d(i0Var, new DragGestureDetectorKt$detectHorizontalDragGestures$5(lVar, pVar, aVar, aVar2, null), cVar);
        return objD == kotlin.coroutines.intrinsics.b.h() ? objD : b2.f124493a;
    }

    public static /* synthetic */ Object t(i0 i0Var, yh.l lVar, yh.a aVar, yh.a aVar2, yh.p pVar, kotlin.coroutines.c cVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            lVar = new yh.l<b1.f, b2>() { // from class: androidx.compose.foundation.gestures.DragGestureDetectorKt$detectHorizontalDragGestures$2
                public final void a(long j10) {
                }

                @Override // yh.l
                public /* bridge */ /* synthetic */ b2 invoke(b1.f fVar) {
                    a(fVar.getF30368a());
                    return b2.f124493a;
                }
            };
        }
        yh.l lVar2 = lVar;
        if ((i10 & 2) != 0) {
            aVar = new yh.a<b2>() { // from class: androidx.compose.foundation.gestures.DragGestureDetectorKt$detectHorizontalDragGestures$3
                @Override // yh.a
                public /* bridge */ /* synthetic */ b2 invoke() {
                    invoke2();
                    return b2.f124493a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }
            };
        }
        yh.a aVar3 = aVar;
        if ((i10 & 4) != 0) {
            aVar2 = new yh.a<b2>() { // from class: androidx.compose.foundation.gestures.DragGestureDetectorKt$detectHorizontalDragGestures$4
                @Override // yh.a
                public /* bridge */ /* synthetic */ b2 invoke() {
                    invoke2();
                    return b2.f124493a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }
            };
        }
        return s(i0Var, lVar2, aVar3, aVar2, pVar, cVar);
    }

    @dl.e
    public static final Object u(@dl.d i0 i0Var, @dl.d yh.l<? super b1.f, b2> lVar, @dl.d yh.a<b2> aVar, @dl.d yh.a<b2> aVar2, @dl.d yh.p<? super PointerInputChange, ? super Float, b2> pVar, @dl.d kotlin.coroutines.c<? super b2> cVar) {
        Object objD = ForEachGestureKt.d(i0Var, new DragGestureDetectorKt$detectVerticalDragGestures$5(lVar, pVar, aVar, aVar2, null), cVar);
        return objD == kotlin.coroutines.intrinsics.b.h() ? objD : b2.f124493a;
    }

    public static /* synthetic */ Object v(i0 i0Var, yh.l lVar, yh.a aVar, yh.a aVar2, yh.p pVar, kotlin.coroutines.c cVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            lVar = new yh.l<b1.f, b2>() { // from class: androidx.compose.foundation.gestures.DragGestureDetectorKt$detectVerticalDragGestures$2
                public final void a(long j10) {
                }

                @Override // yh.l
                public /* bridge */ /* synthetic */ b2 invoke(b1.f fVar) {
                    a(fVar.getF30368a());
                    return b2.f124493a;
                }
            };
        }
        yh.l lVar2 = lVar;
        if ((i10 & 2) != 0) {
            aVar = new yh.a<b2>() { // from class: androidx.compose.foundation.gestures.DragGestureDetectorKt$detectVerticalDragGestures$3
                @Override // yh.a
                public /* bridge */ /* synthetic */ b2 invoke() {
                    invoke2();
                    return b2.f124493a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }
            };
        }
        yh.a aVar3 = aVar;
        if ((i10 & 4) != 0) {
            aVar2 = new yh.a<b2>() { // from class: androidx.compose.foundation.gestures.DragGestureDetectorKt$detectVerticalDragGestures$4
                @Override // yh.a
                public /* bridge */ /* synthetic */ b2 invoke() {
                    invoke2();
                    return b2.f124493a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }
            };
        }
        return u(i0Var, lVar2, aVar3, aVar2, pVar, cVar);
    }

    private static final Object w(androidx.compose.ui.input.pointer.d dVar, long j10, yh.l<? super PointerInputChange, b2> lVar, yh.l<? super PointerInputChange, Float> lVar2, yh.l<? super PointerInputChange, Boolean> lVar3, kotlin.coroutines.c<? super Boolean> cVar) {
        PointerInputChange pointerInputChange;
        long id2 = j10;
        if (B(dVar.s1(), id2)) {
            return Boolean.FALSE;
        }
        while (true) {
            c0.e(0);
            PointerInputChange pointerInputChange2 = null;
            Object objT = androidx.compose.ui.input.pointer.c.t(dVar, null, cVar, 1, null);
            c0.e(1);
            androidx.compose.ui.input.pointer.p pVar = (androidx.compose.ui.input.pointer.p) objT;
            List<PointerInputChange> listE = pVar.e();
            int size = listE.size();
            int i10 = 0;
            while (true) {
                if (i10 >= size) {
                    pointerInputChange = null;
                    break;
                }
                pointerInputChange = listE.get(i10);
                if (x.d(pointerInputChange.getId(), id2)) {
                    break;
                }
                i10++;
            }
            PointerInputChange pointerInputChange3 = pointerInputChange;
            if (pointerInputChange3 != null) {
                if (androidx.compose.ui.input.pointer.q.e(pointerInputChange3)) {
                    List<PointerInputChange> listE2 = pVar.e();
                    int size2 = listE2.size();
                    for (int i11 = 0; i11 < size2; i11++) {
                        PointerInputChange pointerInputChange4 = listE2.get(i11);
                        if (pointerInputChange4.getPressed()) {
                            pointerInputChange2 = pointerInputChange4;
                            break;
                        }
                    }
                    PointerInputChange pointerInputChange5 = pointerInputChange2;
                    if (pointerInputChange5 == null) {
                        pointerInputChange2 = pointerInputChange3;
                    } else {
                        id2 = pointerInputChange5.getId();
                    }
                } else if (((lVar2.invoke(pointerInputChange3).floatValue() == 0.0f ? 1 : 0) ^ 1) != 0) {
                    pointerInputChange2 = pointerInputChange3;
                } else {
                    continue;
                }
            }
            if (pointerInputChange2 != null && !lVar3.invoke(pointerInputChange2).booleanValue()) {
                if (androidx.compose.ui.input.pointer.q.e(pointerInputChange2)) {
                    return Boolean.TRUE;
                }
                lVar.invoke(pointerInputChange2);
                id2 = pointerInputChange2.getId();
            }
            return Boolean.FALSE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x004a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:22:0x0055  */
    /* JADX WARN: Code duplicated, block: B:24:0x005b  */
    /* JADX WARN: Code duplicated, block: B:26:0x0060  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0048 -> B:18:0x004b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @dl.e
    public static final java.lang.Object x(@dl.d androidx.compose.ui.input.pointer.d r4, long r5, @dl.d yh.l<? super androidx.compose.ui.input.pointer.PointerInputChange, kotlin.b2> r7, @dl.d kotlin.coroutines.c<? super java.lang.Boolean> r8) throws java.lang.Throwable {
        /*
            boolean r0 = r8 instanceof androidx.compose.foundation.gestures.DragGestureDetectorKt$drag$1
            if (r0 == 0) goto L13
            r0 = r8
            androidx.compose.foundation.gestures.DragGestureDetectorKt$drag$1 r0 = (androidx.compose.foundation.gestures.DragGestureDetectorKt$drag$1) r0
            int r1 = r0.f5349e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f5349e = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.DragGestureDetectorKt$drag$1 r0 = new androidx.compose.foundation.gestures.DragGestureDetectorKt$drag$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f5348d
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.h()
            int r2 = r0.f5349e
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r4 = r0.f5347c
            yh.l r4 = (yh.l) r4
            java.lang.Object r5 = r0.f5346b
            androidx.compose.ui.input.pointer.d r5 = (androidx.compose.ui.input.pointer.d) r5
            kotlin.t0.n(r8)
            r7 = r4
            r4 = r5
            goto L4b
        L33:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L3b:
            kotlin.t0.n(r8)
        L3e:
            r0.f5346b = r4
            r0.f5347c = r7
            r0.f5349e = r3
            java.lang.Object r8 = b(r4, r5, r0)
            if (r8 != r1) goto L4b
            return r1
        L4b:
            androidx.compose.ui.input.pointer.y r8 = (androidx.compose.ui.input.pointer.PointerInputChange) r8
            if (r8 != 0) goto L55
            r4 = 0
            java.lang.Boolean r4 = kotlin.coroutines.jvm.internal.a.a(r4)
            return r4
        L55:
            boolean r5 = androidx.compose.ui.input.pointer.q.e(r8)
            if (r5 == 0) goto L60
            java.lang.Boolean r4 = kotlin.coroutines.jvm.internal.a.a(r3)
            return r4
        L60:
            r7.invoke(r8)
            long r5 = r8.getId()
            goto L3e
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.x(androidx.compose.ui.input.pointer.d, long, yh.l, kotlin.coroutines.c):java.lang.Object");
    }

    @dl.d
    public static final i y() {
        return f5175a;
    }

    @dl.d
    public static final i z() {
        return f5176b;
    }
}
