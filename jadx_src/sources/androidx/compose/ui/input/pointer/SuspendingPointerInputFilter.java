package androidx.compose.ui.input.pointer;

import androidx.compose.runtime.j2;
import androidx.compose.ui.platform.d2;
import com.max.hbuikit.bean.param.UiKitSpanObj;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.b2;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.t0;
import kotlinx.coroutines.q0;
import kotlinx.coroutines.v1;
import s1.DpRect;

/* JADX INFO: compiled from: SuspendingPointerInputFilter.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000¦\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001kB\u0019\u0012\u0006\u0010>\u001a\u000209\u0012\b\b\u0002\u0010`\u001a\u00020\u0004¢\u0006\u0004\bi\u0010jJ-\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u001a\u0010\n\u001a\u0016\u0012\f\u0012\n\u0012\u0002\b\u00030\bR\u00020\u0000\u0012\u0004\u0012\u00020\t0\u0007H\u0082\bJ\u0018\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u001a\u0010\u0011\u001a\u00020\u0010*\u00020\u000fH\u0097\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0014\u001a\u00020\u0010*\u00020\u0013H\u0097\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0016\u001a\u00020\u000f*\u00020\u0013H\u0097\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u0019\u001a\u00020\u000f*\u00020\u0018H\u0097\u0001ø\u0001\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001d\u0010\u001b\u001a\u00020\u000f*\u00020\u0010H\u0097\u0001ø\u0001\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e*\u00020\u001dH\u0097\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010!\u001a\u00020\u0018*\u00020\u000fH\u0097\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b!\u0010\u001aJ\u001a\u0010\"\u001a\u00020\u0018*\u00020\u0013H\u0097\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\"\u0010\u0017J\r\u0010%\u001a\u00020$*\u00020#H\u0097\u0001J\u001a\u0010&\u001a\u00020\u001d*\u00020\u001eH\u0097\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b&\u0010 J\u001a\u0010'\u001a\u00020\u0013*\u00020\u000fH\u0097\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b'\u0010(J\u001d\u0010)\u001a\u00020\u0013*\u00020\u0018H\u0097\u0001ø\u0001\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b)\u0010(J\u001d\u0010*\u001a\u00020\u0013*\u00020\u0010H\u0097\u0001ø\u0001\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b*\u0010+J-\u0010.\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010-\u001a\u00020,H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b.\u0010/J\b\u00100\u001a\u00020\tH\u0016JB\u00107\u001a\u00028\u0000\"\u0004\b\u0000\u001012'\u0010\n\u001a#\b\u0001\u0012\u0004\u0012\u000203\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u000004\u0012\u0006\u0012\u0004\u0018\u00010502¢\u0006\u0002\b6H\u0096@ø\u0001\u0001¢\u0006\u0004\b7\u00108R\u001a\u0010>\u001a\u0002098\u0016X\u0096\u0004¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R\u0016\u0010A\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@R\"\u0010E\u001a\u0010\u0012\f\u0012\n\u0012\u0002\b\u00030\bR\u00020\u00000B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\"\u0010G\u001a\u0010\u0012\f\u0012\n\u0012\u0002\b\u00030\bR\u00020\u00000B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010DR\u0018\u0010I\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010@R\u001f\u0010K\u001a\u00020,8\u0002@\u0002X\u0082\u000eø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\n\u0004\bJ\u0010&R(\u0010U\u001a\u00020L8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0004\bM\u0010N\u0012\u0004\bS\u0010T\u001a\u0004\bO\u0010P\"\u0004\bQ\u0010RR\"\u0010]\u001a\u00020V8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bW\u0010X\u001a\u0004\bY\u0010Z\"\u0004\b[\u0010\\R\u0014\u0010`\u001a\u00020\u00188\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\b^\u0010_R\u0014\u0010b\u001a\u00020\u00188\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\ba\u0010_R\u0014\u0010e\u001a\u00020\u00018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bc\u0010dR\u001d\u0010h\u001a\u00020\u001d8VX\u0096\u0004ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\u001a\u0004\bf\u0010g\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006l"}, d2 = {"Landroidx/compose/ui/input/pointer/SuspendingPointerInputFilter;", "Landroidx/compose/ui/input/pointer/e0;", "Landroidx/compose/ui/input/pointer/g0;", "Landroidx/compose/ui/input/pointer/i0;", "Ls1/e;", "Landroidx/compose/ui/input/pointer/PointerEventPass;", "pass", "Lkotlin/Function1;", "Landroidx/compose/ui/input/pointer/SuspendingPointerInputFilter$PointerEventHandlerCoroutine;", "Lkotlin/b2;", "block", "B0", "Landroidx/compose/ui/input/pointer/p;", "pointerEvent", "A0", "Ls1/h;", "", "e1", "(F)I", "Ls1/u;", "J1", "(J)I", "q", "(J)F", "", "F", "(F)F", androidx.exifinterface.media.a.S4, "(I)F", "Lb1/m;", "Ls1/l;", "n", "(J)J", "E1", "k1", "Ls1/k;", "Lb1/i;", "h0", "J", "M", "(F)J", ak.aB, "r", "(I)J", "Ls1/r;", "bounds", "d0", "(Landroidx/compose/ui/input/pointer/p;Landroidx/compose/ui/input/pointer/PointerEventPass;J)V", "Y", "R", "Lkotlin/Function2;", "Landroidx/compose/ui/input/pointer/d;", "Lkotlin/coroutines/c;", "", "Lkotlin/t;", "n1", "(Lyh/p;Lkotlin/coroutines/c;)Ljava/lang/Object;", "Landroidx/compose/ui/platform/d2;", "e", "Landroidx/compose/ui/platform/d2;", "getViewConfiguration", "()Landroidx/compose/ui/platform/d2;", "viewConfiguration", "g", "Landroidx/compose/ui/input/pointer/p;", "currentEvent", "Landroidx/compose/runtime/collection/e;", RXScreenCaptureService.KEY_HEIGHT, "Landroidx/compose/runtime/collection/e;", "pointerHandlers", "i", "dispatchingPointerHandlers", "j", "lastPointerEvent", "k", "boundsSize", "Lkotlinx/coroutines/q0;", "l", "Lkotlinx/coroutines/q0;", "C0", "()Lkotlinx/coroutines/q0;", "N0", "(Lkotlinx/coroutines/q0;)V", "getCoroutineScope$annotations", "()V", "coroutineScope", "", "m", "Z", "F1", "()Z", "o1", "(Z)V", "interceptOutOfBoundsChildEvents", "getDensity", "()F", "density", "C1", "fontScale", "z1", "()Landroidx/compose/ui/input/pointer/e0;", "pointerInputFilter", "Q", "()J", "extendedTouchPadding", "<init>", "(Landroidx/compose/ui/platform/d2;Ls1/e;)V", "PointerEventHandlerCoroutine", "ui_release"}, k = 1, mv = {1, 7, 1})
public final class SuspendingPointerInputFilter extends e0 implements g0, i0, s1.e {

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final d2 viewConfiguration;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final /* synthetic */ s1.e f14697f;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private p currentEvent;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final androidx.compose.runtime.collection.e<PointerEventHandlerCoroutine<?>> pointerHandlers;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final androidx.compose.runtime.collection.e<PointerEventHandlerCoroutine<?>> dispatchingPointerHandlers;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private p lastPointerEvent;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private long boundsSize;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private q0 coroutineScope;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private boolean interceptOutOfBoundsChildEvents;

    /* JADX INFO: compiled from: SuspendingPointerInputFilter.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0082\u0004\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u00022\u00020\u00032\b\u0012\u0004\u0012\u00028\u00000\u0004B\u0015\u0012\f\u0010=\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0004\b]\u0010^J\u001a\u0010\u0007\u001a\u00020\u0006*\u00020\u0005H\u0097\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\n\u001a\u00020\u0006*\u00020\tH\u0097\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\f\u001a\u00020\u0005*\u00020\tH\u0097\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u000f\u001a\u00020\u0005*\u00020\u000eH\u0097\u0001ø\u0001\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0011\u001a\u00020\u0005*\u00020\u0006H\u0097\u0001ø\u0001\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u0014*\u00020\u0013H\u0097\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0017\u001a\u00020\u000e*\u00020\u0005H\u0097\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0017\u0010\u0010J\u001a\u0010\u0018\u001a\u00020\u000e*\u00020\tH\u0097\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0018\u0010\rJ\r\u0010\u001b\u001a\u00020\u001a*\u00020\u0019H\u0097\u0001J\u001a\u0010\u001c\u001a\u00020\u0013*\u00020\u0014H\u0097\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001c\u0010\u0016J\u001a\u0010\u001d\u001a\u00020\t*\u00020\u0005H\u0097\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001d\u0010\u001f\u001a\u00020\t*\u00020\u000eH\u0097\u0001ø\u0001\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001f\u0010\u001eJ\u001d\u0010 \u001a\u00020\t*\u00020\u0006H\u0097\u0001ø\u0001\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b \u0010!J\u0016\u0010'\u001a\u00020&2\u0006\u0010#\u001a\u00020\"2\u0006\u0010%\u001a\u00020$J\u0010\u0010*\u001a\u00020&2\b\u0010)\u001a\u0004\u0018\u00010(J \u0010-\u001a\u00020&2\f\u0010,\u001a\b\u0012\u0004\u0012\u00028\u00000+H\u0016ø\u0001\u0001¢\u0006\u0004\b-\u0010.J\u001b\u0010/\u001a\u00020\"2\u0006\u0010%\u001a\u00020$H\u0096@ø\u0001\u0001¢\u0006\u0004\b/\u00100JL\u00108\u001a\u0004\u0018\u00018\u0001\"\u0004\b\u0001\u001012\u0006\u00103\u001a\u0002022'\u00107\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010504¢\u0006\u0002\b6H\u0096@ø\u0001\u0001¢\u0006\u0004\b8\u00109JJ\u0010:\u001a\u00028\u0001\"\u0004\b\u0001\u001012\u0006\u00103\u001a\u0002022'\u00107\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010504¢\u0006\u0002\b6H\u0096@ø\u0001\u0001¢\u0006\u0004\b:\u00109R\u001a\u0010=\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u001e\u0010A\u001a\n\u0012\u0004\u0012\u00020\"\u0018\u00010>8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@R\u0016\u0010D\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010CR\u001a\u0010J\u001a\u00020E8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bH\u0010IR\u0014\u0010M\u001a\u00020\u000e8\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\bK\u0010LR\u0014\u0010O\u001a\u00020\u000e8\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\bN\u0010LR\u0014\u0010R\u001a\u00020\"8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bP\u0010QR\u001d\u0010V\u001a\u00020S8VX\u0096\u0004ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\u001a\u0004\bT\u0010UR\u0014\u0010Z\u001a\u00020W8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bX\u0010YR\u001d\u0010\\\u001a\u00020\u00138VX\u0096\u0004ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b[\u0010U\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006_"}, d2 = {"Landroidx/compose/ui/input/pointer/SuspendingPointerInputFilter$PointerEventHandlerCoroutine;", "R", "Landroidx/compose/ui/input/pointer/d;", "Ls1/e;", "Lkotlin/coroutines/c;", "Ls1/h;", "", "e1", "(F)I", "Ls1/u;", "J1", "(J)I", "q", "(J)F", "", "F", "(F)F", androidx.exifinterface.media.a.S4, "(I)F", "Lb1/m;", "Ls1/l;", "n", "(J)J", "E1", "k1", "Ls1/k;", "Lb1/i;", "h0", "J", "M", "(F)J", ak.aB, "r", "(I)J", "Landroidx/compose/ui/input/pointer/p;", androidx.core.app.o0.I0, "Landroidx/compose/ui/input/pointer/PointerEventPass;", "pass", "Lkotlin/b2;", "l", "", "cause", "k", "Lkotlin/Result;", "result", "resumeWith", "(Ljava/lang/Object;)V", "r1", "(Landroidx/compose/ui/input/pointer/PointerEventPass;Lkotlin/coroutines/c;)Ljava/lang/Object;", androidx.exifinterface.media.a.f23244d5, "", "timeMillis", "Lkotlin/Function2;", "", "Lkotlin/t;", "block", "j1", "(JLyh/p;Lkotlin/coroutines/c;)Ljava/lang/Object;", "f0", "b", "Lkotlin/coroutines/c;", "completion", "Lkotlinx/coroutines/p;", "d", "Lkotlinx/coroutines/p;", "pointerAwaiter", "e", "Landroidx/compose/ui/input/pointer/PointerEventPass;", "awaitPass", "Lkotlin/coroutines/CoroutineContext;", "f", "Lkotlin/coroutines/CoroutineContext;", "getContext", "()Lkotlin/coroutines/CoroutineContext;", com.umeng.analytics.pro.d.R, "getDensity", "()F", "density", "C1", "fontScale", "s1", "()Landroidx/compose/ui/input/pointer/p;", "currentEvent", "Ls1/r;", ak.av, "()J", UiKitSpanObj.TYPE_SIZE, "Landroidx/compose/ui/platform/d2;", "getViewConfiguration", "()Landroidx/compose/ui/platform/d2;", "viewConfiguration", "Q", "extendedTouchPadding", "<init>", "(Landroidx/compose/ui/input/pointer/SuspendingPointerInputFilter;Lkotlin/coroutines/c;)V", "ui_release"}, k = 1, mv = {1, 7, 1})
    public final class PointerEventHandlerCoroutine<R> implements d, s1.e, kotlin.coroutines.c<R> {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @dl.d
        private final kotlin.coroutines.c<R> completion;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final /* synthetic */ SuspendingPointerInputFilter f14706c;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        @dl.e
        private kotlinx.coroutines.p<? super p> pointerAwaiter;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        @dl.d
        private PointerEventPass awaitPass;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        @dl.d
        private final CoroutineContext context;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ SuspendingPointerInputFilter f14710g;

        /* JADX WARN: Multi-variable type inference failed */
        public PointerEventHandlerCoroutine(@dl.d SuspendingPointerInputFilter suspendingPointerInputFilter, kotlin.coroutines.c<? super R> completion) {
            kotlin.jvm.internal.f0.p(completion, "completion");
            this.f14710g = suspendingPointerInputFilter;
            this.completion = completion;
            this.f14706c = suspendingPointerInputFilter;
            this.awaitPass = PointerEventPass.Main;
            this.context = EmptyCoroutineContext.f124694b;
        }

        @Override // s1.e
        /* JADX INFO: renamed from: C1 */
        public float getF139218c() {
            return this.f14706c.getF139218c();
        }

        @Override // s1.e
        @j2
        public float E(int i10) {
            return this.f14706c.E(i10);
        }

        @Override // s1.e
        @j2
        public float E1(float f10) {
            return this.f14706c.E1(f10);
        }

        @Override // s1.e
        @j2
        public float F(float f10) {
            return this.f14706c.F(f10);
        }

        @Override // s1.e
        @j2
        public long J(long j10) {
            return this.f14706c.J(j10);
        }

        @Override // s1.e
        @j2
        public int J1(long j10) {
            return this.f14706c.J1(j10);
        }

        @Override // s1.e
        @j2
        public long M(float f10) {
            return this.f14706c.M(f10);
        }

        @Override // androidx.compose.ui.input.pointer.d
        public long Q() {
            return this.f14710g.Q();
        }

        @Override // androidx.compose.ui.input.pointer.d
        public long a() {
            return this.f14710g.boundsSize;
        }

        @Override // s1.e
        @j2
        public int e1(float f10) {
            return this.f14706c.e1(f10);
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r12v0, types: [long] */
        /* JADX WARN: Type inference failed for: r12v1, types: [kotlinx.coroutines.d2] */
        /* JADX WARN: Type inference failed for: r12v3, types: [kotlinx.coroutines.d2] */
        /* JADX WARN: Type inference failed for: r12v7 */
        /* JADX WARN: Type inference failed for: r12v8 */
        @Override // androidx.compose.ui.input.pointer.d
        @dl.e
        public <T> Object f0(long j10, @dl.d yh.p<? super d, ? super kotlin.coroutines.c<? super T>, ? extends Object> pVar, @dl.d kotlin.coroutines.c<? super T> cVar) throws Throwable {
            SuspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeout$1 suspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeout$1;
            kotlinx.coroutines.p<? super p> pVar2;
            if (cVar instanceof SuspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeout$1) {
                suspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeout$1 = (SuspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeout$1) cVar;
                int i10 = suspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeout$1.f14714e;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    suspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeout$1.f14714e = i10 - Integer.MIN_VALUE;
                } else {
                    suspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeout$1 = new SuspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeout$1(this, cVar);
                }
            } else {
                suspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeout$1 = new SuspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeout$1(this, cVar);
            }
            Object objInvoke = suspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeout$1.f14712c;
            Object objH = kotlin.coroutines.intrinsics.b.h();
            int i11 = suspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeout$1.f14714e;
            try {
                if (i11 == 0) {
                    t0.n(objInvoke);
                    if (j10 <= 0 && (pVar2 = this.pointerAwaiter) != null) {
                        Result.a aVar = Result.f124476c;
                        pVar2.resumeWith(Result.b(t0.a(new PointerEventTimeoutCancellationException(j10))));
                    }
                    kotlinx.coroutines.d2 d2VarF = kotlinx.coroutines.k.f(this.f14710g.getCoroutineScope(), null, null, new SuspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeout$job$1(j10, this, null), 3, null);
                    suspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeout$1.f14711b = d2VarF;
                    suspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeout$1.f14714e = 1;
                    objInvoke = pVar.invoke(this, suspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeout$1);
                    j10 = d2VarF;
                    if (objInvoke == objH) {
                        return objH;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlinx.coroutines.d2 d2Var = (kotlinx.coroutines.d2) suspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeout$1.f14711b;
                    t0.n(objInvoke);
                    j10 = d2Var;
                }
                kotlinx.coroutines.d2.a.b(j10, null, 1, null);
                return objInvoke;
            } catch (Throwable th2) {
                kotlinx.coroutines.d2.a.b(j10, null, 1, null);
                throw th2;
            }
        }

        @Override // kotlin.coroutines.c
        @dl.d
        public CoroutineContext getContext() {
            return this.context;
        }

        @Override // s1.e
        /* JADX INFO: renamed from: getDensity */
        public float getF139217b() {
            return this.f14706c.getF139217b();
        }

        @Override // androidx.compose.ui.input.pointer.d
        @dl.d
        public d2 getViewConfiguration() {
            return this.f14710g.getViewConfiguration();
        }

        @Override // s1.e
        @j2
        @dl.d
        public b1.i h0(@dl.d DpRect dpRect) {
            kotlin.jvm.internal.f0.p(dpRect, "<this>");
            return this.f14706c.h0(dpRect);
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // androidx.compose.ui.input.pointer.d
        @dl.e
        public <T> Object j1(long j10, @dl.d yh.p<? super d, ? super kotlin.coroutines.c<? super T>, ? extends Object> pVar, @dl.d kotlin.coroutines.c<? super T> cVar) throws Throwable {
            SuspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeoutOrNull$1 suspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeoutOrNull$1;
            if (cVar instanceof SuspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeoutOrNull$1) {
                suspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeoutOrNull$1 = (SuspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeoutOrNull$1) cVar;
                int i10 = suspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeoutOrNull$1.f14720d;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    suspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeoutOrNull$1.f14720d = i10 - Integer.MIN_VALUE;
                } else {
                    suspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeoutOrNull$1 = new SuspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeoutOrNull$1(this, cVar);
                }
            } else {
                suspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeoutOrNull$1 = new SuspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeoutOrNull$1(this, cVar);
            }
            Object objF0 = suspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeoutOrNull$1.f14718b;
            Object objH = kotlin.coroutines.intrinsics.b.h();
            int i11 = suspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeoutOrNull$1.f14720d;
            try {
                if (i11 == 0) {
                    t0.n(objF0);
                    suspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeoutOrNull$1.f14720d = 1;
                    objF0 = f0(j10, pVar, suspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeoutOrNull$1);
                    if (objF0 == objH) {
                        return objH;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t0.n(objF0);
                }
                return objF0;
            } catch (PointerEventTimeoutCancellationException unused) {
                return null;
            }
        }

        public final void k(@dl.e Throwable th2) {
            kotlinx.coroutines.p<? super p> pVar = this.pointerAwaiter;
            if (pVar != null) {
                pVar.b(th2);
            }
            this.pointerAwaiter = null;
        }

        @Override // s1.e
        @j2
        public float k1(long j10) {
            return this.f14706c.k1(j10);
        }

        public final void l(@dl.d p event, @dl.d PointerEventPass pass) {
            kotlinx.coroutines.p<? super p> pVar;
            kotlin.jvm.internal.f0.p(event, "event");
            kotlin.jvm.internal.f0.p(pass, "pass");
            if (pass != this.awaitPass || (pVar = this.pointerAwaiter) == null) {
                return;
            }
            this.pointerAwaiter = null;
            Result.a aVar = Result.f124476c;
            pVar.resumeWith(Result.b(event));
        }

        @Override // s1.e
        @j2
        public long n(long j10) {
            return this.f14706c.n(j10);
        }

        @Override // s1.e
        @j2
        public float q(long j10) {
            return this.f14706c.q(j10);
        }

        @Override // s1.e
        @j2
        public long r(int i10) {
            return this.f14706c.r(i10);
        }

        @Override // androidx.compose.ui.input.pointer.d
        @dl.e
        public Object r1(@dl.d PointerEventPass pointerEventPass, @dl.d kotlin.coroutines.c<? super p> cVar) {
            kotlinx.coroutines.q qVar = new kotlinx.coroutines.q(IntrinsicsKt__IntrinsicsJvmKt.d(cVar), 1);
            qVar.F0();
            this.awaitPass = pointerEventPass;
            this.pointerAwaiter = qVar;
            Object objT = qVar.t();
            if (objT == kotlin.coroutines.intrinsics.b.h()) {
                kotlin.coroutines.jvm.internal.f.c(cVar);
            }
            return objT;
        }

        @Override // kotlin.coroutines.c
        public void resumeWith(@dl.d Object result) {
            androidx.compose.runtime.collection.e eVar = this.f14710g.pointerHandlers;
            SuspendingPointerInputFilter suspendingPointerInputFilter = this.f14710g;
            synchronized (eVar) {
                suspendingPointerInputFilter.pointerHandlers.c0(this);
                b2 b2Var = b2.f124493a;
            }
            this.completion.resumeWith(result);
        }

        @Override // s1.e
        @j2
        public long s(float f10) {
            return this.f14706c.s(f10);
        }

        @Override // androidx.compose.ui.input.pointer.d
        @dl.d
        public p s1() {
            return this.f14710g.currentEvent;
        }
    }

    /* JADX INFO: compiled from: SuspendingPointerInputFilter.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f14721a;

        static {
            int[] iArr = new int[PointerEventPass.values().length];
            iArr[PointerEventPass.Initial.ordinal()] = 1;
            iArr[PointerEventPass.Final.ordinal()] = 2;
            iArr[PointerEventPass.Main.ordinal()] = 3;
            f14721a = iArr;
        }
    }

    public SuspendingPointerInputFilter(@dl.d d2 viewConfiguration, @dl.d s1.e density) {
        kotlin.jvm.internal.f0.p(viewConfiguration, "viewConfiguration");
        kotlin.jvm.internal.f0.p(density, "density");
        this.viewConfiguration = viewConfiguration;
        this.f14697f = density;
        this.currentEvent = SuspendingPointerInputFilterKt.f14724b;
        this.pointerHandlers = new androidx.compose.runtime.collection.e<>(new PointerEventHandlerCoroutine[16], 0);
        this.dispatchingPointerHandlers = new androidx.compose.runtime.collection.e<>(new PointerEventHandlerCoroutine[16], 0);
        this.boundsSize = s1.r.f139246b.a();
        this.coroutineScope = v1.f130503b;
    }

    public /* synthetic */ SuspendingPointerInputFilter(d2 d2Var, s1.e eVar, int i10, kotlin.jvm.internal.u uVar) {
        this(d2Var, (i10 & 2) != 0 ? s1.g.b(1.0f, 0.0f, 2, null) : eVar);
    }

    private final void A0(p pVar, PointerEventPass pointerEventPass) {
        androidx.compose.runtime.collection.e<PointerEventHandlerCoroutine<?>> eVar;
        int i10;
        synchronized (this.pointerHandlers) {
            androidx.compose.runtime.collection.e<PointerEventHandlerCoroutine<?>> eVar2 = this.dispatchingPointerHandlers;
            eVar2.c(eVar2.getCom.max.hbuikit.bean.param.UiKitSpanObj.TYPE_SIZE java.lang.String(), this.pointerHandlers);
        }
        try {
            int i11 = a.f14721a[pointerEventPass.ordinal()];
            if (i11 == 1 || i11 == 2) {
                androidx.compose.runtime.collection.e<PointerEventHandlerCoroutine<?>> eVar3 = this.dispatchingPointerHandlers;
                int i12 = eVar3.getCom.max.hbuikit.bean.param.UiKitSpanObj.TYPE_SIZE java.lang.String();
                if (i12 > 0) {
                    int i13 = 0;
                    PointerEventHandlerCoroutine<?>[] pointerEventHandlerCoroutineArrG = eVar3.G();
                    kotlin.jvm.internal.f0.n(pointerEventHandlerCoroutineArrG, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
                    do {
                        pointerEventHandlerCoroutineArrG[i13].l(pVar, pointerEventPass);
                        i13++;
                    } while (i13 < i12);
                }
            } else if (i11 == 3 && (i10 = (eVar = this.dispatchingPointerHandlers).getCom.max.hbuikit.bean.param.UiKitSpanObj.TYPE_SIZE java.lang.String()) > 0) {
                int i14 = i10 - 1;
                PointerEventHandlerCoroutine<?>[] pointerEventHandlerCoroutineArrG2 = eVar.G();
                kotlin.jvm.internal.f0.n(pointerEventHandlerCoroutineArrG2, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
                do {
                    pointerEventHandlerCoroutineArrG2[i14].l(pVar, pointerEventPass);
                    i14--;
                } while (i14 >= 0);
            }
        } finally {
            this.dispatchingPointerHandlers.m();
        }
    }

    private final void B0(PointerEventPass pointerEventPass, yh.l<? super PointerEventHandlerCoroutine<?>, b2> lVar) {
        androidx.compose.runtime.collection.e<PointerEventHandlerCoroutine<?>> eVar;
        int i10;
        synchronized (this.pointerHandlers) {
            try {
                androidx.compose.runtime.collection.e<PointerEventHandlerCoroutine<?>> eVar2 = this.dispatchingPointerHandlers;
                eVar2.c(eVar2.getCom.max.hbuikit.bean.param.UiKitSpanObj.TYPE_SIZE java.lang.String(), this.pointerHandlers);
                kotlin.jvm.internal.c0.d(1);
            } catch (Throwable th2) {
                kotlin.jvm.internal.c0.d(1);
                kotlin.jvm.internal.c0.c(1);
                throw th2;
            }
        }
        kotlin.jvm.internal.c0.c(1);
        try {
            int i11 = a.f14721a[pointerEventPass.ordinal()];
            if (i11 == 1 || i11 == 2) {
                androidx.compose.runtime.collection.e<PointerEventHandlerCoroutine<?>> eVar3 = this.dispatchingPointerHandlers;
                int i12 = eVar3.getCom.max.hbuikit.bean.param.UiKitSpanObj.TYPE_SIZE java.lang.String();
                if (i12 > 0) {
                    int i13 = 0;
                    PointerEventHandlerCoroutine<?>[] pointerEventHandlerCoroutineArrG = eVar3.G();
                    kotlin.jvm.internal.f0.n(pointerEventHandlerCoroutineArrG, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
                    do {
                        lVar.invoke(pointerEventHandlerCoroutineArrG[i13]);
                        i13++;
                    } while (i13 < i12);
                }
            } else if (i11 == 3 && (i10 = (eVar = this.dispatchingPointerHandlers).getCom.max.hbuikit.bean.param.UiKitSpanObj.TYPE_SIZE java.lang.String()) > 0) {
                int i14 = i10 - 1;
                PointerEventHandlerCoroutine<?>[] pointerEventHandlerCoroutineArrG2 = eVar.G();
                kotlin.jvm.internal.f0.n(pointerEventHandlerCoroutineArrG2, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
                do {
                    lVar.invoke(pointerEventHandlerCoroutineArrG2[i14]);
                    i14--;
                } while (i14 >= 0);
            }
        } finally {
            kotlin.jvm.internal.c0.d(1);
            this.dispatchingPointerHandlers.m();
            kotlin.jvm.internal.c0.c(1);
        }
    }

    public static /* synthetic */ void J0() {
    }

    @dl.d
    /* JADX INFO: renamed from: C0, reason: from getter */
    public final q0 getCoroutineScope() {
        return this.coroutineScope;
    }

    @Override // s1.e
    /* JADX INFO: renamed from: C1 */
    public float getF139218c() {
        return this.f14697f.getF139218c();
    }

    @Override // s1.e
    @j2
    public float E(int i10) {
        return this.f14697f.E(i10);
    }

    @Override // s1.e
    @j2
    public float E1(float f10) {
        return this.f14697f.E1(f10);
    }

    @Override // s1.e
    @j2
    public float F(float f10) {
        return this.f14697f.F(f10);
    }

    @Override // androidx.compose.ui.input.pointer.e0, androidx.compose.ui.input.pointer.i0
    /* JADX INFO: renamed from: F1, reason: from getter */
    public boolean getInterceptOutOfBoundsChildEvents() {
        return this.interceptOutOfBoundsChildEvents;
    }

    @Override // s1.e
    @j2
    public long J(long j10) {
        return this.f14697f.J(j10);
    }

    @Override // s1.e
    @j2
    public int J1(long j10) {
        return this.f14697f.J1(j10);
    }

    @Override // s1.e
    @j2
    public long M(float f10) {
        return this.f14697f.M(f10);
    }

    public final void N0(@dl.d q0 q0Var) {
        kotlin.jvm.internal.f0.p(q0Var, "<set-?>");
        this.coroutineScope = q0Var;
    }

    @Override // androidx.compose.ui.input.pointer.i0
    public long Q() {
        long J = J(getViewConfiguration().e());
        long jA = a();
        return b1.n.a(Math.max(0.0f, b1.m.t(J) - s1.r.m(jA)) / 2.0f, Math.max(0.0f, b1.m.m(J) - s1.r.j(jA)) / 2.0f);
    }

    @Override // androidx.compose.ui.input.pointer.e0
    public void Y() {
        boolean z10;
        p pVar = this.lastPointerEvent;
        if (pVar == null) {
            return;
        }
        List<PointerInputChange> listE = pVar.e();
        int size = listE.size();
        int i10 = 0;
        while (true) {
            z10 = true;
            if (i10 >= size) {
                break;
            }
            if (!(true ^ listE.get(i10).getPressed())) {
                z10 = false;
                break;
            }
            i10++;
        }
        if (z10) {
            return;
        }
        List<PointerInputChange> listE2 = pVar.e();
        ArrayList arrayList = new ArrayList(listE2.size());
        int size2 = listE2.size();
        for (int i11 = 0; i11 < size2; i11++) {
            PointerInputChange pointerInputChange = listE2.get(i11);
            arrayList.add(new PointerInputChange(pointerInputChange.getId(), pointerInputChange.getUptimeMillis(), pointerInputChange.getPosition(), false, pointerInputChange.s(), pointerInputChange.getUptimeMillis(), pointerInputChange.getPosition(), pointerInputChange.getPressed(), pointerInputChange.getPressed(), 0, 0L, bb.c.b.Cq, (kotlin.jvm.internal.u) null));
        }
        p pVar2 = new p(arrayList);
        this.currentEvent = pVar2;
        A0(pVar2, PointerEventPass.Initial);
        A0(pVar2, PointerEventPass.Main);
        A0(pVar2, PointerEventPass.Final);
        this.lastPointerEvent = null;
    }

    @Override // androidx.compose.ui.n.c, androidx.compose.ui.n
    public /* synthetic */ boolean a0(yh.l lVar) {
        return androidx.compose.ui.o.a(this, lVar);
    }

    @Override // androidx.compose.ui.input.pointer.e0
    public void d0(@dl.d p pointerEvent, @dl.d PointerEventPass pass, long bounds) {
        kotlin.jvm.internal.f0.p(pointerEvent, "pointerEvent");
        kotlin.jvm.internal.f0.p(pass, "pass");
        this.boundsSize = bounds;
        if (pass == PointerEventPass.Initial) {
            this.currentEvent = pointerEvent;
        }
        A0(pointerEvent, pass);
        List<PointerInputChange> listE = pointerEvent.e();
        int size = listE.size();
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                z10 = true;
                break;
            } else if (!q.e(listE.get(i10))) {
                break;
            } else {
                i10++;
            }
        }
        if (!(!z10)) {
            pointerEvent = null;
        }
        this.lastPointerEvent = pointerEvent;
    }

    @Override // s1.e
    @j2
    public int e1(float f10) {
        return this.f14697f.e1(f10);
    }

    @Override // s1.e
    /* JADX INFO: renamed from: getDensity */
    public float getF139217b() {
        return this.f14697f.getF139217b();
    }

    @Override // androidx.compose.ui.input.pointer.i0
    @dl.d
    public d2 getViewConfiguration() {
        return this.viewConfiguration;
    }

    @Override // s1.e
    @j2
    @dl.d
    public b1.i h0(@dl.d DpRect dpRect) {
        kotlin.jvm.internal.f0.p(dpRect, "<this>");
        return this.f14697f.h0(dpRect);
    }

    @Override // s1.e
    @j2
    public float k1(long j10) {
        return this.f14697f.k1(j10);
    }

    @Override // s1.e
    @j2
    public long n(long j10) {
        return this.f14697f.n(j10);
    }

    @Override // androidx.compose.ui.input.pointer.i0
    @dl.e
    public <R> Object n1(@dl.d yh.p<? super d, ? super kotlin.coroutines.c<? super R>, ? extends Object> pVar, @dl.d kotlin.coroutines.c<? super R> cVar) {
        kotlinx.coroutines.q qVar = new kotlinx.coroutines.q(IntrinsicsKt__IntrinsicsJvmKt.d(cVar), 1);
        qVar.F0();
        final PointerEventHandlerCoroutine pointerEventHandlerCoroutine = new PointerEventHandlerCoroutine(this, qVar);
        synchronized (this.pointerHandlers) {
            this.pointerHandlers.b(pointerEventHandlerCoroutine);
            kotlin.coroutines.c<b2> cVarC = kotlin.coroutines.e.c(pVar, pointerEventHandlerCoroutine, pointerEventHandlerCoroutine);
            Result.a aVar = Result.f124476c;
            cVarC.resumeWith(Result.b(b2.f124493a));
        }
        qVar.L(new yh.l<Throwable, b2>() { // from class: androidx.compose.ui.input.pointer.SuspendingPointerInputFilter$awaitPointerEventScope$2$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(Throwable th2) {
                invoke2(th2);
                return b2.f124493a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@dl.e Throwable th2) {
                pointerEventHandlerCoroutine.k(th2);
            }
        });
        Object objT = qVar.t();
        if (objT == kotlin.coroutines.intrinsics.b.h()) {
            kotlin.coroutines.jvm.internal.f.c(cVar);
        }
        return objT;
    }

    @Override // androidx.compose.ui.input.pointer.i0
    public void o1(boolean z10) {
        this.interceptOutOfBoundsChildEvents = z10;
    }

    @Override // s1.e
    @j2
    public float q(long j10) {
        return this.f14697f.q(j10);
    }

    @Override // s1.e
    @j2
    public long r(int i10) {
        return this.f14697f.r(i10);
    }

    @Override // s1.e
    @j2
    public long s(float f10) {
        return this.f14697f.s(f10);
    }

    @Override // androidx.compose.ui.n
    public /* synthetic */ androidx.compose.ui.n s0(androidx.compose.ui.n nVar) {
        return androidx.compose.ui.m.a(this, nVar);
    }

    @Override // androidx.compose.ui.n.c, androidx.compose.ui.n
    public /* synthetic */ boolean t(yh.l lVar) {
        return androidx.compose.ui.o.b(this, lVar);
    }

    @Override // androidx.compose.ui.n.c, androidx.compose.ui.n
    public /* synthetic */ Object v(Object obj, yh.p pVar) {
        return androidx.compose.ui.o.d(this, obj, pVar);
    }

    @Override // androidx.compose.ui.n.c, androidx.compose.ui.n
    public /* synthetic */ Object x(Object obj, yh.p pVar) {
        return androidx.compose.ui.o.c(this, obj, pVar);
    }

    @Override // androidx.compose.ui.input.pointer.g0
    @dl.d
    /* JADX INFO: renamed from: z1 */
    public e0 getPointerInputFilter() {
        return this;
    }
}
