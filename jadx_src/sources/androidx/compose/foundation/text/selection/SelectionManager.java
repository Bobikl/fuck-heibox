package androidx.compose.foundation.text.selection;

import android.view.KeyEvent;
import androidx.compose.foundation.FocusableKt;
import androidx.compose.foundation.gestures.ForEachGestureKt;
import androidx.compose.foundation.text.Handle;
import androidx.compose.runtime.a1;
import androidx.compose.runtime.h2;
import androidx.compose.ui.focus.FocusChangedModifierKt;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.focus.FocusRequesterModifierKt;
import androidx.compose.ui.input.key.KeyInputModifierKt;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.input.pointer.i0;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.platform.TextToolbarStatus;
import androidx.compose.ui.platform.k0;
import androidx.compose.ui.platform.v1;
import androidx.compose.ui.platform.w1;
import androidx.compose.ui.text.o0;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import com.umeng.socialize.net.dplus.CommonNetImpl;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.b2;
import kotlin.collections.s0;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: SelectionManager.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000¶\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u0001B\u0011\u0012\u0006\u0010D\u001a\u00020A¢\u0006\u0006\b¡\u0001\u0010¢\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0002J.\u0010\u000b\u001a\u00020\u0002*\u00020\u00072\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00020\bH\u0082@ø\u0001\u0000ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\r*\u00020\r2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000eH\u0002J'\u0010\u0014\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\tH\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J-\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u0019\u0010 \u001a\u0004\u0018\u00010\u001f2\u0006\u0010\u001e\u001a\u00020\u001dH\u0000¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0011H\u0000¢\u0006\u0004\b\"\u0010#J;\u0010*\u001a\u001c\u0012\u0006\u0012\u0004\u0018\u00010&\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020&0)0(2\u0006\u0010%\u001a\u00020$2\b\u0010'\u001a\u0004\u0018\u00010&H\u0000¢\u0006\u0004\b*\u0010+J\u0011\u0010-\u001a\u0004\u0018\u00010,H\u0000¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020\u0002H\u0000¢\u0006\u0004\b/\u00100J\u000f\u00101\u001a\u00020\u0002H\u0000¢\u0006\u0004\b1\u00100J\u000f\u00102\u001a\u00020\u0002H\u0000¢\u0006\u0004\b2\u00100J\u0006\u00103\u001a\u00020\u0002J\u000e\u00105\u001a\u0002042\u0006\u0010\u0018\u001a\u00020\u0017J9\u00108\u001a\u00020\u00172\b\u00106\u001a\u0004\u0018\u00010\t2\b\u00107\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0000ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b8\u00109J?\u0010=\u001a\u00020\u00172\u0006\u0010:\u001a\u00020\t2\u0006\u0010;\u001a\u00020\t2\b\u0010<\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0000ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b=\u0010>J\u001b\u0010?\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\tø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b?\u0010@R\u0014\u0010D\u001a\u00020A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u001c\u0010H\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010&0E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\"\u0010O\u001a\u00020\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bI\u0010J\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR$\u0010W\u001a\u0004\u0018\u00010P8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bQ\u0010R\u001a\u0004\bS\u0010T\"\u0004\bU\u0010VR$\u0010_\u001a\u0004\u0018\u00010X8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bY\u0010Z\u001a\u0004\b[\u0010\\\"\u0004\b]\u0010^R\"\u0010g\u001a\u00020`8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\ba\u0010b\u001a\u0004\bc\u0010d\"\u0004\be\u0010fR+\u0010k\u001a\u00020\u00172\u0006\u0010h\u001a\u00020\u00178F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bi\u0010G\u001a\u0004\bj\u0010L\"\u0004\bJ\u0010NR.\u0010r\u001a\u0004\u0018\u00010\u00112\b\u0010l\u001a\u0004\u0018\u00010\u00118\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bm\u0010n\u001a\u0004\bo\u0010#\"\u0004\bp\u0010qR4\u0010w\u001a\u00020\t2\u0006\u0010h\u001a\u00020\t8@@BX\u0080\u008e\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\bs\u0010G\u001a\u0004\bt\u0010u\"\u0004\bv\u0010@R4\u0010z\u001a\u00020\t2\u0006\u0010h\u001a\u00020\t8@@BX\u0080\u008e\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b?\u0010G\u001a\u0004\bx\u0010u\"\u0004\by\u0010@R8\u0010:\u001a\u0004\u0018\u00010\t2\b\u0010h\u001a\u0004\u0018\u00010\t8F@BX\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b\u0014\u0010G\u001a\u0004\b{\u0010|\"\u0004\b}\u0010~R9\u0010;\u001a\u0004\u0018\u00010\t2\b\u0010h\u001a\u0004\u0018\u00010\t8F@BX\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0013\n\u0004\b/\u0010G\u001a\u0004\b\u007f\u0010|\"\u0005\b\u0080\u0001\u0010~R6\u0010\u0086\u0001\u001a\u0005\u0018\u00010\u0081\u00012\t\u0010h\u001a\u0005\u0018\u00010\u0081\u00018F@BX\u0086\u008e\u0002¢\u0006\u0016\n\u0004\b\u000b\u0010G\u001a\u0006\b\u0082\u0001\u0010\u0083\u0001\"\u0006\b\u0084\u0001\u0010\u0085\u0001R;\u0010\u0089\u0001\u001a\u0004\u0018\u00010\t2\b\u0010h\u001a\u0004\u0018\u00010\t8F@BX\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0014\n\u0004\b \u0010G\u001a\u0005\b\u0087\u0001\u0010|\"\u0005\b\u0088\u0001\u0010~R\u0016\u0010\u008b\u0001\u001a\u00020\u00178BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b\u008a\u0001\u0010LR-\u0010\u0090\u0001\u001a\u0004\u0018\u00010&2\b\u0010l\u001a\u0004\u0018\u00010&8F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\b\u008c\u0001\u0010\u008d\u0001\"\u0006\b\u008e\u0001\u0010\u008f\u0001R7\u0010\u0091\u0001\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010&\u0012\u0004\u0012\u00020\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u0091\u0001\u0010\u0092\u0001\u001a\u0006\b\u0093\u0001\u0010\u0094\u0001\"\u0006\b\u0095\u0001\u0010\u0096\u0001R,\u0010\u0098\u0001\u001a\u0005\u0018\u00010\u0097\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u0098\u0001\u0010\u0099\u0001\u001a\u0006\b\u009a\u0001\u0010\u009b\u0001\"\u0006\b\u009c\u0001\u0010\u009d\u0001R\u0014\u0010 \u0001\u001a\u00020\r8F¢\u0006\b\u001a\u0006\b\u009e\u0001\u0010\u009f\u0001\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006£\u0001"}, d2 = {"Landroidx/compose/foundation/text/selection/SelectionManager;", "", "Lkotlin/b2;", "h0", "k0", "Lb1/i;", "t", "Landroidx/compose/ui/input/pointer/i0;", "Lkotlin/Function1;", "Lb1/f;", "onTap", "p", "(Landroidx/compose/ui/input/pointer/i0;Lyh/l;Lkotlin/coroutines/c;)Ljava/lang/Object;", "Landroidx/compose/ui/n;", "Lkotlin/Function0;", "block", "M", "Landroidx/compose/ui/layout/q;", "layoutCoordinates", androidx.constraintlayout.core.motion.utils.w.c.R, "n", "(Landroidx/compose/ui/layout/q;J)Lb1/f;", CommonNetImpl.POSITION, "", "isStartHandle", "Landroidx/compose/foundation/text/selection/SelectionAdjustment;", "adjustment", "g0", "(JZLandroidx/compose/foundation/text/selection/SelectionAdjustment;)V", "Landroidx/compose/foundation/text/selection/j$a;", "anchor", "Landroidx/compose/foundation/text/selection/i;", "q", "(Landroidx/compose/foundation/text/selection/j$a;)Landroidx/compose/foundation/text/selection/i;", "O", "()Landroidx/compose/ui/layout/q;", "", "selectableId", "Landroidx/compose/foundation/text/selection/j;", "previousSelection", "Lkotlin/Pair;", "", "P", "(JLandroidx/compose/foundation/text/selection/j;)Lkotlin/Pair;", "Landroidx/compose/ui/text/d;", androidx.exifinterface.media.a.S4, "()Landroidx/compose/ui/text/d;", "o", "()V", "f0", "L", "N", "Landroidx/compose/foundation/text/r;", "K", "newPosition", "previousPosition", "j0", "(Lb1/f;Lb1/f;ZLandroidx/compose/foundation/text/selection/SelectionAdjustment;)Z", "startHandlePosition", "endHandlePosition", "previousHandlePosition", "i0", "(JJLb1/f;ZLandroidx/compose/foundation/text/selection/SelectionAdjustment;)Z", "m", "(J)V", "Landroidx/compose/foundation/text/selection/q;", ak.av, "Landroidx/compose/foundation/text/selection/q;", "selectionRegistrar", "Landroidx/compose/runtime/a1;", "b", "Landroidx/compose/runtime/a1;", "_selection", ak.aF, "Z", "J", "()Z", "e0", "(Z)V", "touchMode", "Landroidx/compose/ui/platform/k0;", "f", "Landroidx/compose/ui/platform/k0;", "r", "()Landroidx/compose/ui/platform/k0;", "Q", "(Landroidx/compose/ui/platform/k0;)V", "clipboardManager", "Landroidx/compose/ui/platform/w1;", "g", "Landroidx/compose/ui/platform/w1;", "I", "()Landroidx/compose/ui/platform/w1;", "d0", "(Landroidx/compose/ui/platform/w1;)V", "textToolbar", "Landroidx/compose/ui/focus/FocusRequester;", RXScreenCaptureService.KEY_HEIGHT, "Landroidx/compose/ui/focus/FocusRequester;", ak.aD, "()Landroidx/compose/ui/focus/FocusRequester;", "X", "(Landroidx/compose/ui/focus/FocusRequester;)V", "focusRequester", "<set-?>", "i", "B", "hasFocus", "value", "k", "Landroidx/compose/ui/layout/q;", ak.aB, "R", "(Landroidx/compose/ui/layout/q;)V", "containerLayoutCoordinates", "l", "v", "()J", androidx.exifinterface.media.a.f23244d5, "dragBeginPosition", RXScreenCaptureService.KEY_WIDTH, "U", "dragTotalDistance", "H", "()Lb1/f;", "c0", "(Lb1/f;)V", "y", androidx.exifinterface.media.a.T4, "Landroidx/compose/foundation/text/Handle;", "x", "()Landroidx/compose/foundation/text/Handle;", androidx.exifinterface.media.a.X4, "(Landroidx/compose/foundation/text/Handle;)V", "draggingHandle", ak.aG, androidx.exifinterface.media.a.R4, "currentDragPosition", "G", "shouldShowMagnifier", "F", "()Landroidx/compose/foundation/text/selection/j;", "b0", "(Landroidx/compose/foundation/text/selection/j;)V", "selection", "onSelectionChange", "Lyh/l;", "D", "()Lyh/l;", "a0", "(Lyh/l;)V", "Ld1/a;", "hapticFeedBack", "Ld1/a;", androidx.exifinterface.media.a.W4, "()Ld1/a;", "Y", "(Ld1/a;)V", "C", "()Landroidx/compose/ui/n;", "modifier", "<init>", "(Landroidx/compose/foundation/text/selection/q;)V", "foundation_release"}, k = 1, mv = {1, 7, 1})
public final class SelectionManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final q selectionRegistrar;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final a1<Selection> _selection;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private boolean touchMode;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private yh.l<? super Selection, b2> f8219d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.e
    private d1.a f8220e;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private k0 clipboardManager;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private w1 textToolbar;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private FocusRequester focusRequester;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final a1 hasFocus;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @dl.e
    private b1.f f8225j;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private androidx.compose.ui.layout.q containerLayoutCoordinates;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final a1 dragBeginPosition;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final a1 dragTotalDistance;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final a1 startHandlePosition;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final a1 endHandlePosition;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final a1 draggingHandle;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final a1 currentDragPosition;

    /* JADX INFO: compiled from: SelectionManager.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001d\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0007\u001a\u00020\u0004H\u0016J\u001d\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\u0006J\u001d\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0002H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\u0006J\b\u0010\f\u001a\u00020\u0004H\u0016J\b\u0010\r\u001a\u00020\u0004H\u0016\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u000e"}, d2 = {"androidx/compose/foundation/text/selection/SelectionManager$a", "Landroidx/compose/foundation/text/r;", "Lb1/f;", "point", "Lkotlin/b2;", ak.av, "(J)V", "d", "startPoint", ak.aF, "delta", "b", "onStop", "onCancel", "foundation_release"}, k = 1, mv = {1, 7, 1})
    public static final class a implements androidx.compose.foundation.text.r {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f8241b;

        a(boolean z10) {
            this.f8241b = z10;
        }

        @Override // androidx.compose.foundation.text.r
        public void a(long point) {
            androidx.compose.ui.layout.q qVarD;
            Selection selectionF = SelectionManager.this.F();
            if (selectionF == null) {
                return;
            }
            i iVarQ = SelectionManager.this.q(this.f8241b ? selectionF.h() : selectionF.f());
            if (iVarQ == null || (qVarD = iVarQ.d()) == null) {
                return;
            }
            long jA = m.a(iVarQ.e(selectionF, this.f8241b));
            SelectionManager selectionManager = SelectionManager.this;
            selectionManager.S(b1.f.d(selectionManager.O().a0(qVarD, jA)));
            SelectionManager.this.V(this.f8241b ? Handle.SelectionStart : Handle.SelectionEnd);
        }

        @Override // androidx.compose.foundation.text.r
        public void b(long delta) {
            SelectionManager selectionManager = SelectionManager.this;
            selectionManager.U(b1.f.v(selectionManager.w(), delta));
            long jV = b1.f.v(SelectionManager.this.v(), SelectionManager.this.w());
            if (SelectionManager.this.j0(b1.f.d(jV), b1.f.d(SelectionManager.this.v()), this.f8241b, SelectionAdjustment.INSTANCE.d())) {
                SelectionManager.this.T(jV);
                SelectionManager.this.U(b1.f.f30364b.e());
            }
        }

        @Override // androidx.compose.foundation.text.r
        public void c(long startPoint) {
            androidx.compose.ui.layout.q qVarD;
            long jE;
            SelectionManager.this.L();
            Selection selectionF = SelectionManager.this.F();
            f0.m(selectionF);
            i iVar = SelectionManager.this.selectionRegistrar.s().get(Long.valueOf(selectionF.h().h()));
            i iVar2 = SelectionManager.this.selectionRegistrar.s().get(Long.valueOf(selectionF.f().h()));
            if (this.f8241b) {
                qVarD = iVar != null ? iVar.d() : null;
                f0.m(qVarD);
            } else {
                qVarD = iVar2 != null ? iVar2.d() : null;
                f0.m(qVarD);
            }
            if (this.f8241b) {
                f0.m(iVar);
                jE = iVar.e(selectionF, true);
            } else {
                f0.m(iVar2);
                jE = iVar2.e(selectionF, false);
            }
            long jA = m.a(jE);
            SelectionManager selectionManager = SelectionManager.this;
            selectionManager.T(selectionManager.O().a0(qVarD, jA));
            SelectionManager.this.U(b1.f.f30364b.e());
        }

        @Override // androidx.compose.foundation.text.r
        public void d() {
            SelectionManager.this.V(null);
            SelectionManager.this.S(null);
        }

        @Override // androidx.compose.foundation.text.r
        public void onCancel() {
            SelectionManager.this.f0();
            SelectionManager.this.V(null);
            SelectionManager.this.S(null);
        }

        @Override // androidx.compose.foundation.text.r
        public void onStop() {
            SelectionManager.this.f0();
            SelectionManager.this.V(null);
            SelectionManager.this.S(null);
        }
    }

    public SelectionManager(@dl.d q selectionRegistrar) {
        f0.p(selectionRegistrar, "selectionRegistrar");
        this.selectionRegistrar = selectionRegistrar;
        this._selection = h2.g(null, null, 2, null);
        this.touchMode = true;
        this.f8219d = new yh.l<Selection, b2>() { // from class: androidx.compose.foundation.text.selection.SelectionManager$onSelectionChange$1
            public final void a(@dl.e Selection selection) {
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(Selection selection) {
                a(selection);
                return b2.f124493a;
            }
        };
        this.focusRequester = new FocusRequester();
        this.hasFocus = h2.g(Boolean.FALSE, null, 2, null);
        b1.f.a aVar = b1.f.f30364b;
        this.dragBeginPosition = h2.g(b1.f.d(aVar.e()), null, 2, null);
        this.dragTotalDistance = h2.g(b1.f.d(aVar.e()), null, 2, null);
        this.startHandlePosition = h2.g(null, null, 2, null);
        this.endHandlePosition = h2.g(null, null, 2, null);
        this.draggingHandle = h2.g(null, null, 2, null);
        this.currentDragPosition = h2.g(null, null, 2, null);
        selectionRegistrar.w(new yh.l<Long, b2>() { // from class: androidx.compose.foundation.text.selection.SelectionManager.1
            {
                super(1);
            }

            public final void a(long j10) {
                Selection.AnchorInfo anchorInfoF;
                Selection.AnchorInfo anchorInfoH;
                Selection selectionF = SelectionManager.this.F();
                if (!((selectionF == null || (anchorInfoH = selectionF.h()) == null || j10 != anchorInfoH.h()) ? false : true)) {
                    Selection selectionF2 = SelectionManager.this.F();
                    if (!((selectionF2 == null || (anchorInfoF = selectionF2.f()) == null || j10 != anchorInfoF.h()) ? false : true)) {
                        return;
                    }
                }
                SelectionManager.this.h0();
                SelectionManager.this.k0();
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(Long l10) {
                a(l10.longValue());
                return b2.f124493a;
            }
        });
        selectionRegistrar.B(new yh.q<androidx.compose.ui.layout.q, b1.f, SelectionAdjustment, b2>() { // from class: androidx.compose.foundation.text.selection.SelectionManager.2
            {
                super(3);
            }

            public final void a(@dl.d androidx.compose.ui.layout.q layoutCoordinates, long j10, @dl.d SelectionAdjustment selectionMode) {
                f0.p(layoutCoordinates, "layoutCoordinates");
                f0.p(selectionMode, "selectionMode");
                b1.f fVarN = SelectionManager.this.n(layoutCoordinates, j10);
                if (fVarN != null) {
                    SelectionManager.this.g0(fVarN.getF30368a(), false, selectionMode);
                    SelectionManager.this.getFocusRequester().g();
                    SelectionManager.this.L();
                }
            }

            @Override // yh.q
            public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.ui.layout.q qVar, b1.f fVar, SelectionAdjustment selectionAdjustment) {
                a(qVar, fVar.getF30368a(), selectionAdjustment);
                return b2.f124493a;
            }
        });
        selectionRegistrar.A(new yh.l<Long, b2>() { // from class: androidx.compose.foundation.text.selection.SelectionManager.3
            {
                super(1);
            }

            public final void a(long j10) {
                SelectionManager selectionManager = SelectionManager.this;
                Pair<Selection, Map<Long, Selection>> pairP = selectionManager.P(j10, selectionManager.F());
                Selection selectionA = pairP.a();
                Map<Long, Selection> mapB = pairP.b();
                if (!f0.g(selectionA, SelectionManager.this.F())) {
                    SelectionManager.this.selectionRegistrar.D(mapB);
                    SelectionManager.this.D().invoke(selectionA);
                }
                SelectionManager.this.getFocusRequester().g();
                SelectionManager.this.L();
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(Long l10) {
                a(l10.longValue());
                return b2.f124493a;
            }
        });
        selectionRegistrar.y(new yh.s<androidx.compose.ui.layout.q, b1.f, b1.f, Boolean, SelectionAdjustment, Boolean>() { // from class: androidx.compose.foundation.text.selection.SelectionManager.4
            {
                super(5);
            }

            @Override // yh.s
            public /* bridge */ /* synthetic */ Boolean N0(androidx.compose.ui.layout.q qVar, b1.f fVar, b1.f fVar2, Boolean bool, SelectionAdjustment selectionAdjustment) {
                return a(qVar, fVar.getF30368a(), fVar2.getF30368a(), bool.booleanValue(), selectionAdjustment);
            }

            @dl.d
            public final Boolean a(@dl.d androidx.compose.ui.layout.q layoutCoordinates, long j10, long j11, boolean z10, @dl.d SelectionAdjustment selectionMode) {
                f0.p(layoutCoordinates, "layoutCoordinates");
                f0.p(selectionMode, "selectionMode");
                return Boolean.valueOf(SelectionManager.this.j0(SelectionManager.this.n(layoutCoordinates, j10), SelectionManager.this.n(layoutCoordinates, j11), z10, selectionMode));
            }
        });
        selectionRegistrar.z(new yh.a<b2>() { // from class: androidx.compose.foundation.text.selection.SelectionManager.5
            {
                super(0);
            }

            @Override // yh.a
            public /* bridge */ /* synthetic */ b2 invoke() {
                invoke2();
                return b2.f124493a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                SelectionManager.this.f0();
                SelectionManager.this.V(null);
                SelectionManager.this.S(null);
            }
        });
        selectionRegistrar.x(new yh.l<Long, b2>() { // from class: androidx.compose.foundation.text.selection.SelectionManager.6
            {
                super(1);
            }

            public final void a(long j10) {
                if (SelectionManager.this.selectionRegistrar.f().containsKey(Long.valueOf(j10))) {
                    SelectionManager.this.N();
                    SelectionManager.this.b0(null);
                }
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(Long l10) {
                a(l10.longValue());
                return b2.f124493a;
            }
        });
        selectionRegistrar.v(new yh.l<Long, b2>() { // from class: androidx.compose.foundation.text.selection.SelectionManager.7
            {
                super(1);
            }

            public final void a(long j10) {
                Selection.AnchorInfo anchorInfoF;
                Selection.AnchorInfo anchorInfoH;
                Selection selectionF = SelectionManager.this.F();
                if (!((selectionF == null || (anchorInfoH = selectionF.h()) == null || j10 != anchorInfoH.h()) ? false : true)) {
                    Selection selectionF2 = SelectionManager.this.F();
                    if (!((selectionF2 == null || (anchorInfoF = selectionF2.f()) == null || j10 != anchorInfoF.h()) ? false : true)) {
                        return;
                    }
                }
                SelectionManager.this.c0(null);
                SelectionManager.this.W(null);
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(Long l10) {
                a(l10.longValue());
                return b2.f124493a;
            }
        });
    }

    private final boolean G() {
        return x() != null;
    }

    private final androidx.compose.ui.n M(androidx.compose.ui.n nVar, yh.a<b2> aVar) {
        return B() ? SuspendingPointerInputFilterKt.c(nVar, b2.f124493a, new SelectionManager$onClearSelectionRequested$1(this, aVar, null)) : nVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void S(b1.f fVar) {
        this.currentDragPosition.setValue(fVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void T(long j10) {
        this.dragBeginPosition.setValue(b1.f.d(j10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void U(long j10) {
        this.dragTotalDistance.setValue(b1.f.d(j10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void V(Handle handle) {
        this.draggingHandle.setValue(handle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void W(b1.f fVar) {
        this.endHandlePosition.setValue(fVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c0(b1.f fVar) {
        this.startHandlePosition.setValue(fVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void g0(long position, boolean isStartHandle, SelectionAdjustment adjustment) {
        i0(position, position, null, isStartHandle, adjustment);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void h0() {
        Selection.AnchorInfo anchorInfoF;
        Selection.AnchorInfo anchorInfoH;
        Selection selectionF = F();
        androidx.compose.ui.layout.q qVar = this.containerLayoutCoordinates;
        i iVarQ = (selectionF == null || (anchorInfoH = selectionF.h()) == null) ? null : q(anchorInfoH);
        i iVarQ2 = (selectionF == null || (anchorInfoF = selectionF.f()) == null) ? null : q(anchorInfoF);
        androidx.compose.ui.layout.q qVarD = iVarQ != null ? iVarQ.d() : null;
        androidx.compose.ui.layout.q qVarD2 = iVarQ2 != null ? iVarQ2.d() : null;
        if (selectionF == null || qVar == null || !qVar.p() || qVarD == null || qVarD2 == null) {
            c0(null);
            W(null);
            return;
        }
        long jA0 = qVar.a0(qVarD, iVarQ.e(selectionF, true));
        long jA1 = qVar.a0(qVarD2, iVarQ2.e(selectionF, false));
        b1.i iVarF = n.f(qVar);
        c0(n.c(iVarF, jA0) ? b1.f.d(jA0) : null);
        W(n.c(iVarF, jA1) ? b1.f.d(jA1) : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void k0() {
        if (B()) {
            w1 w1Var = this.textToolbar;
            if ((w1Var != null ? w1Var.getStatus() : null) == TextToolbarStatus.Shown) {
                f0();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final b1.f n(androidx.compose.ui.layout.q layoutCoordinates, long offset) {
        androidx.compose.ui.layout.q qVar = this.containerLayoutCoordinates;
        if (qVar == null || !qVar.p()) {
            return null;
        }
        return b1.f.d(O().a0(layoutCoordinates, offset));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object p(i0 i0Var, yh.l<? super b1.f, b2> lVar, kotlin.coroutines.c<? super b2> cVar) {
        Object objD = ForEachGestureKt.d(i0Var, new SelectionManager$detectNonConsumingTap$2(lVar, null), cVar);
        return objD == kotlin.coroutines.intrinsics.b.h() ? objD : b2.f124493a;
    }

    private final b1.i t() {
        androidx.compose.ui.layout.q qVarD;
        androidx.compose.ui.layout.q qVarD2;
        Selection selectionF = F();
        if (selectionF == null) {
            return b1.i.f30369e.a();
        }
        i iVarQ = q(selectionF.h());
        i iVarQ2 = q(selectionF.f());
        if (iVarQ == null || (qVarD = iVarQ.d()) == null) {
            return b1.i.f30369e.a();
        }
        if (iVarQ2 == null || (qVarD2 = iVarQ2.d()) == null) {
            return b1.i.f30369e.a();
        }
        androidx.compose.ui.layout.q qVar = this.containerLayoutCoordinates;
        if (qVar == null || !qVar.p()) {
            return b1.i.f30369e.a();
        }
        long jA0 = qVar.a0(qVarD, iVarQ.e(selectionF, true));
        long jA1 = qVar.a0(qVarD2, iVarQ2.e(selectionF, false));
        long jL = qVar.L(jA0);
        long jL2 = qVar.L(jA1);
        return new b1.i(Math.min(b1.f.p(jL), b1.f.p(jL2)), Math.min(b1.f.r(qVar.L(qVar.a0(qVarD, b1.g.a(0.0f, iVarQ.c(selectionF.h().g()).getF30372b())))), b1.f.r(qVar.L(qVar.a0(qVarD2, b1.g.a(0.0f, iVarQ2.c(selectionF.f().g()).getF30372b()))))), Math.max(b1.f.p(jL), b1.f.p(jL2)), Math.max(b1.f.r(jL), b1.f.r(jL2)) + ((float) (((double) m.b()) * 4.0d)));
    }

    @dl.e
    /* JADX INFO: renamed from: A, reason: from getter */
    public final d1.a getF8220e() {
        return this.f8220e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean B() {
        return ((Boolean) this.hasFocus.getValue()).booleanValue();
    }

    @dl.d
    public final androidx.compose.ui.n C() {
        androidx.compose.ui.n nVarB = androidx.compose.ui.n.INSTANCE;
        androidx.compose.ui.n nVarB2 = KeyInputModifierKt.b(FocusableKt.d(FocusChangedModifierKt.a(FocusRequesterModifierKt.a(OnGloballyPositionedModifierKt.a(M(nVarB, new yh.a<b2>() { // from class: androidx.compose.foundation.text.selection.SelectionManager$modifier$1
            {
                super(0);
            }

            @Override // yh.a
            public /* bridge */ /* synthetic */ b2 invoke() {
                invoke2();
                return b2.f124493a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.f8251b.N();
            }
        }), new yh.l<androidx.compose.ui.layout.q, b2>() { // from class: androidx.compose.foundation.text.selection.SelectionManager$modifier$2
            {
                super(1);
            }

            public final void a(@dl.d androidx.compose.ui.layout.q it) {
                f0.p(it, "it");
                this.f8252b.R(it);
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.ui.layout.q qVar) {
                a(qVar);
                return b2.f124493a;
            }
        }), this.focusRequester), new yh.l<androidx.compose.ui.focus.v, b2>() { // from class: androidx.compose.foundation.text.selection.SelectionManager$modifier$3
            {
                super(1);
            }

            public final void a(@dl.d androidx.compose.ui.focus.v focusState) {
                f0.p(focusState, "focusState");
                if (!focusState.isFocused() && this.f8253b.B()) {
                    this.f8253b.N();
                }
                this.f8253b.Z(focusState.isFocused());
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.ui.focus.v vVar) {
                a(vVar);
                return b2.f124493a;
            }
        }), false, null, 3, null), new yh.l<androidx.compose.ui.input.key.b, Boolean>() { // from class: androidx.compose.foundation.text.selection.SelectionManager$modifier$4
            {
                super(1);
            }

            @dl.d
            public final Boolean a(@dl.d KeyEvent it) {
                boolean z10;
                f0.p(it, "it");
                if (SelectionManager_androidKt.a(it)) {
                    this.f8254b.o();
                    z10 = true;
                } else {
                    z10 = false;
                }
                return Boolean.valueOf(z10);
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ Boolean invoke(androidx.compose.ui.input.key.b bVar) {
                return a(bVar.h());
            }
        });
        if (G()) {
            nVarB = SelectionManager_androidKt.b(nVarB, this);
        }
        return nVarB2.s0(nVarB);
    }

    @dl.d
    public final yh.l<Selection, b2> D() {
        return this.f8219d;
    }

    @dl.e
    public final androidx.compose.ui.text.d E() {
        androidx.compose.ui.text.d dVarK;
        List<i> listE = this.selectionRegistrar.E(O());
        Selection selectionF = F();
        androidx.compose.ui.text.d dVar = null;
        if (selectionF == null) {
            return null;
        }
        int size = listE.size();
        for (int i10 = 0; i10 < size; i10++) {
            i iVar = listE.get(i10);
            if (iVar.getSelectableId() == selectionF.h().h() || iVar.getSelectableId() == selectionF.f().h() || dVar != null) {
                androidx.compose.ui.text.d dVarD = n.d(iVar, selectionF);
                if (dVar != null && (dVarK = dVar.k(dVarD)) != null) {
                    dVarD = dVarK;
                }
                if ((iVar.getSelectableId() == selectionF.f().h() && !selectionF.g()) || (iVar.getSelectableId() == selectionF.h().h() && selectionF.g())) {
                    return dVarD;
                }
                dVar = dVarD;
            }
        }
        return dVar;
    }

    @dl.e
    public final Selection F() {
        return this._selection.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @dl.e
    public final b1.f H() {
        return (b1.f) this.startHandlePosition.getValue();
    }

    @dl.e
    /* JADX INFO: renamed from: I, reason: from getter */
    public final w1 getTextToolbar() {
        return this.textToolbar;
    }

    /* JADX INFO: renamed from: J, reason: from getter */
    public final boolean getTouchMode() {
        return this.touchMode;
    }

    @dl.d
    public final androidx.compose.foundation.text.r K(boolean isStartHandle) {
        return new a(isStartHandle);
    }

    public final void L() {
        w1 w1Var;
        if (B()) {
            w1 w1Var2 = this.textToolbar;
            if ((w1Var2 != null ? w1Var2.getStatus() : null) != TextToolbarStatus.Shown || (w1Var = this.textToolbar) == null) {
                return;
            }
            w1Var.hide();
        }
    }

    public final void N() {
        this.selectionRegistrar.D(s0.z());
        L();
        if (F() != null) {
            this.f8219d.invoke(null);
            d1.a aVar = this.f8220e;
            if (aVar != null) {
                aVar.a(d1.b.f108126b.b());
            }
        }
    }

    @dl.d
    public final androidx.compose.ui.layout.q O() {
        androidx.compose.ui.layout.q qVar = this.containerLayoutCoordinates;
        if (!(qVar != null)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (qVar.p()) {
            return qVar;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    @dl.d
    public final Pair<Selection, Map<Long, Selection>> P(long selectableId, @dl.e Selection previousSelection) {
        d1.a aVar;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        List<i> listE = this.selectionRegistrar.E(O());
        int size = listE.size();
        Selection selectionE = null;
        for (int i10 = 0; i10 < size; i10++) {
            i iVar = listE.get(i10);
            Selection selectionG = iVar.getSelectableId() == selectableId ? iVar.g() : null;
            if (selectionG != null) {
                linkedHashMap.put(Long.valueOf(iVar.getSelectableId()), selectionG);
            }
            selectionE = n.e(selectionE, selectionG);
        }
        if (!f0.g(selectionE, previousSelection) && (aVar = this.f8220e) != null) {
            aVar.a(d1.b.f108126b.b());
        }
        return new Pair<>(selectionE, linkedHashMap);
    }

    public final void Q(@dl.e k0 k0Var) {
        this.clipboardManager = k0Var;
    }

    public final void R(@dl.e androidx.compose.ui.layout.q qVar) {
        this.containerLayoutCoordinates = qVar;
        if (!B() || F() == null) {
            return;
        }
        b1.f fVarD = qVar != null ? b1.f.d(androidx.compose.ui.layout.r.g(qVar)) : null;
        if (f0.g(this.f8225j, fVarD)) {
            return;
        }
        this.f8225j = fVarD;
        h0();
        k0();
    }

    public final void X(@dl.d FocusRequester focusRequester) {
        f0.p(focusRequester, "<set-?>");
        this.focusRequester = focusRequester;
    }

    public final void Y(@dl.e d1.a aVar) {
        this.f8220e = aVar;
    }

    public final void Z(boolean z10) {
        this.hasFocus.setValue(Boolean.valueOf(z10));
    }

    public final void a0(@dl.d yh.l<? super Selection, b2> lVar) {
        f0.p(lVar, "<set-?>");
        this.f8219d = lVar;
    }

    public final void b0(@dl.e Selection selection) {
        this._selection.setValue(selection);
        if (selection != null) {
            h0();
        }
    }

    public final void d0(@dl.e w1 w1Var) {
        this.textToolbar = w1Var;
    }

    public final void e0(boolean z10) {
        this.touchMode = z10;
    }

    public final void f0() {
        w1 w1Var;
        if (!B() || F() == null || (w1Var = this.textToolbar) == null) {
            return;
        }
        v1.a(w1Var, t(), new yh.a<b2>() { // from class: androidx.compose.foundation.text.selection.SelectionManager$showSelectionToolbar$1$1
            {
                super(0);
            }

            @Override // yh.a
            public /* bridge */ /* synthetic */ b2 invoke() {
                invoke2();
                return b2.f124493a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.f8261b.o();
                this.f8261b.N();
            }
        }, null, null, null, 28, null);
    }

    public final boolean i0(long startHandlePosition, long endHandlePosition, @dl.e b1.f previousHandlePosition, boolean isStartHandle, @dl.d SelectionAdjustment adjustment) {
        f0.p(adjustment, "adjustment");
        V(isStartHandle ? Handle.SelectionStart : Handle.SelectionEnd);
        S(isStartHandle ? b1.f.d(startHandlePosition) : b1.f.d(endHandlePosition));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        List<i> listE = this.selectionRegistrar.E(O());
        int size = listE.size();
        Selection selectionE = null;
        int i10 = 0;
        boolean z10 = false;
        while (i10 < size) {
            i iVar = listE.get(i10);
            int i11 = i10;
            Selection selection = selectionE;
            Pair<Selection, Boolean> pairI = iVar.i(startHandlePosition, endHandlePosition, previousHandlePosition, isStartHandle, O(), adjustment, this.selectionRegistrar.f().get(Long.valueOf(iVar.getSelectableId())));
            Selection selectionA = pairI.a();
            z10 = z10 || pairI.b().booleanValue();
            if (selectionA != null) {
                linkedHashMap.put(Long.valueOf(iVar.getSelectableId()), selectionA);
            }
            selectionE = n.e(selection, selectionA);
            i10 = i11 + 1;
        }
        Selection selection2 = selectionE;
        if (!f0.g(selection2, F())) {
            d1.a aVar = this.f8220e;
            if (aVar != null) {
                aVar.a(d1.b.f108126b.b());
            }
            this.selectionRegistrar.D(linkedHashMap);
            this.f8219d.invoke(selection2);
        }
        return z10;
    }

    public final boolean j0(@dl.e b1.f newPosition, @dl.e b1.f previousPosition, boolean isStartHandle, @dl.d SelectionAdjustment adjustment) {
        Selection selectionF;
        b1.f fVarN;
        f0.p(adjustment, "adjustment");
        if (newPosition == null || (selectionF = F()) == null) {
            return false;
        }
        i iVar = this.selectionRegistrar.s().get(Long.valueOf(isStartHandle ? selectionF.f().h() : selectionF.h().h()));
        if (iVar == null) {
            fVarN = null;
        } else {
            androidx.compose.ui.layout.q qVarD = iVar.d();
            f0.m(qVarD);
            fVarN = n(qVarD, m.a(iVar.e(selectionF, !isStartHandle)));
        }
        if (fVarN == null) {
            return false;
        }
        long f30368a = fVarN.getF30368a();
        long f30368a2 = isStartHandle ? newPosition.getF30368a() : f30368a;
        if (!isStartHandle) {
            f30368a = newPosition.getF30368a();
        }
        return i0(f30368a2, f30368a, previousPosition, isStartHandle, adjustment);
    }

    public final void m(long position) {
        Selection selectionF = F();
        if (selectionF != null ? o0.h(selectionF.j()) : true) {
            g0(position, true, SelectionAdjustment.INSTANCE.g());
        }
    }

    public final void o() {
        k0 k0Var;
        androidx.compose.ui.text.d dVarE = E();
        if (dVarE == null || (k0Var = this.clipboardManager) == null) {
            return;
        }
        k0Var.a(dVarE);
    }

    @dl.e
    public final i q(@dl.d Selection.AnchorInfo anchor) {
        f0.p(anchor, "anchor");
        return this.selectionRegistrar.s().get(Long.valueOf(anchor.h()));
    }

    @dl.e
    /* JADX INFO: renamed from: r, reason: from getter */
    public final k0 getClipboardManager() {
        return this.clipboardManager;
    }

    @dl.e
    /* JADX INFO: renamed from: s, reason: from getter */
    public final androidx.compose.ui.layout.q getContainerLayoutCoordinates() {
        return this.containerLayoutCoordinates;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @dl.e
    public final b1.f u() {
        return (b1.f) this.currentDragPosition.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long v() {
        return ((b1.f) this.dragBeginPosition.getValue()).getF30368a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long w() {
        return ((b1.f) this.dragTotalDistance.getValue()).getF30368a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @dl.e
    public final Handle x() {
        return (Handle) this.draggingHandle.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @dl.e
    public final b1.f y() {
        return (b1.f) this.endHandlePosition.getValue();
    }

    @dl.d
    /* JADX INFO: renamed from: z, reason: from getter */
    public final FocusRequester getFocusRequester() {
        return this.focusRequester;
    }
}
