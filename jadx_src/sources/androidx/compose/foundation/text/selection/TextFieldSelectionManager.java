package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.Handle;
import androidx.compose.foundation.text.HandleState;
import androidx.compose.foundation.text.TextFieldCursorKt;
import androidx.compose.foundation.text.TextFieldState;
import androidx.compose.foundation.text.a0;
import androidx.compose.foundation.text.e0;
import androidx.compose.runtime.a1;
import androidx.compose.runtime.h2;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.platform.TextToolbarStatus;
import androidx.compose.ui.platform.k0;
import androidx.compose.ui.platform.w1;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.h0;
import androidx.compose.ui.text.input.m0;
import androidx.compose.ui.text.input.x;
import androidx.compose.ui.text.input.z;
import androidx.compose.ui.text.o0;
import androidx.compose.ui.text.p0;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import com.umeng.socialize.net.dplus.CommonNetImpl;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: TextFieldSelectionManager.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000´\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\n\b\u0002\u0010;\u001a\u0004\u0018\u000106¢\u0006\u0006\b\u009e\u0001\u0010\u009f\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0002J0\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0002J\u0010\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002J%\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0018H\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\rH\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\rH\u0000¢\u0006\u0004\b\u001f\u0010\u001eJ!\u0010\"\u001a\u00020\r2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\"\u0010#J\u0019\u0010%\u001a\u00020\r2\b\b\u0002\u0010$\u001a\u00020\tH\u0000¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\rH\u0000¢\u0006\u0004\b'\u0010\u001eJ\u000f\u0010(\u001a\u00020\rH\u0000¢\u0006\u0004\b(\u0010\u001eJ\u000f\u0010)\u001a\u00020\rH\u0000¢\u0006\u0004\b)\u0010\u001eJ \u0010*\u001a\u00020 2\u0006\u0010\n\u001a\u00020\tH\u0000ø\u0001\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b*\u0010+J \u0010.\u001a\u00020 2\u0006\u0010-\u001a\u00020,H\u0000ø\u0001\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b.\u0010/J\u000f\u00100\u001a\u00020\rH\u0000¢\u0006\u0004\b0\u0010\u001eJ\u000f\u00101\u001a\u00020\rH\u0000¢\u0006\u0004\b1\u0010\u001eJ\u001b\u00102\u001a\u00020\r2\u0006\u0010!\u001a\u00020 ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b2\u00103J\u000f\u00104\u001a\u00020\tH\u0000¢\u0006\u0004\b4\u00105R\u0019\u0010;\u001a\u0004\u0018\u0001068\u0006¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R\"\u0010C\u001a\u00020<8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR$\u0010K\u001a\u0004\u0018\u00010D8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bE\u0010F\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR+\u0010\u0005\u001a\u00020\u00042\u0006\u0010L\u001a\u00020\u00048@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\bM\u0010N\u001a\u0004\bO\u0010P\"\u0004\bQ\u0010RR\"\u0010Z\u001a\u00020S8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bT\u0010U\u001a\u0004\bV\u0010W\"\u0004\bX\u0010YR$\u0010b\u001a\u0004\u0018\u00010[8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\\\u0010]\u001a\u0004\b^\u0010_\"\u0004\b`\u0010aR$\u0010j\u001a\u0004\u0018\u00010c8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bd\u0010e\u001a\u0004\bf\u0010g\"\u0004\bh\u0010iR$\u0010r\u001a\u0004\u0018\u00010k8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bl\u0010m\u001a\u0004\bn\u0010o\"\u0004\bp\u0010qR+\u0010u\u001a\u00020\t2\u0006\u0010L\u001a\u00020\t8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b2\u0010N\u001a\u0004\bs\u00105\"\u0004\bt\u0010&R\u001f\u0010v\u001a\u00020 8\u0002@\u0002X\u0082\u000eø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\n\u0004\b%\u00109R\u0018\u0010y\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bw\u0010xR\u001f\u0010z\u001a\u00020 8\u0002@\u0002X\u0082\u000eø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u0016\u00109R0\u0010\u0080\u0001\u001a\u0004\u0018\u00010{2\b\u0010L\u001a\u0004\u0018\u00010{8F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001b\u0010N\u001a\u0004\b|\u0010}\"\u0004\b~\u0010\u007fR<\u0010\u0084\u0001\u001a\u0004\u0018\u00010 2\b\u0010L\u001a\u0004\u0018\u00010 8F@BX\u0086\u008e\u0002ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0015\n\u0004\b(\u0010N\u001a\u0006\b\u0081\u0001\u0010\u0082\u0001\"\u0005\b\u0083\u0001\u0010#R\u0018\u0010\u0086\u0001\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\"\u0010\u0085\u0001R\u001e\u0010\u008a\u0001\u001a\u00020\u00188\u0000X\u0080\u0004¢\u0006\u000f\n\u0006\b\u0087\u0001\u0010\u0088\u0001\u001a\u0005\b\u0089\u0001\u0010\u001cR\u001f\u0010\u008f\u0001\u001a\u00030\u008b\u00018\u0000X\u0080\u0004¢\u0006\u000f\n\u0005\b\u001d\u0010\u008c\u0001\u001a\u0006\b\u008d\u0001\u0010\u008e\u0001R6\u0010\u0091\u0001\u001a\u000f\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\r0\u0090\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b\u0091\u0001\u0010\u0092\u0001\u001a\u0006\b\u0093\u0001\u0010\u0094\u0001\"\u0006\b\u0095\u0001\u0010\u0096\u0001R,\u0010\u0098\u0001\u001a\u0005\u0018\u00010\u0097\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u0098\u0001\u0010\u0099\u0001\u001a\u0006\b\u009a\u0001\u0010\u009b\u0001\"\u0006\b\u009c\u0001\u0010\u009d\u0001\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006 \u0001"}, d2 = {"Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;", "", "Lb1/i;", "v", "Landroidx/compose/ui/text/input/TextFieldValue;", "value", "", "transformedStartOffset", "transformedEndOffset", "", "isStartHandle", "Landroidx/compose/foundation/text/selection/SelectionAdjustment;", "adjustment", "Lkotlin/b2;", "f0", "Landroidx/compose/foundation/text/HandleState;", "handleState", androidx.exifinterface.media.a.T4, "Landroidx/compose/ui/text/d;", "annotatedString", "Landroidx/compose/ui/text/o0;", "selection", "n", "(Landroidx/compose/ui/text/d;J)Landroidx/compose/ui/text/input/TextFieldValue;", "Landroidx/compose/foundation/text/r;", "M", "(Z)Landroidx/compose/foundation/text/r;", "o", "()Landroidx/compose/foundation/text/r;", ak.aB, "()V", "t", "Lb1/f;", CommonNetImpl.POSITION, "q", "(Lb1/f;)V", "cancelSelection", "l", "(Z)V", "P", "p", "Q", "B", "(Z)J", "Ls1/e;", "density", "x", "(Ls1/e;)J", "e0", "N", "k", "(J)V", "O", "()Z", "Landroidx/compose/foundation/text/a0;", ak.av, "Landroidx/compose/foundation/text/a0;", "J", "()Landroidx/compose/foundation/text/a0;", "undoManager", "Landroidx/compose/ui/text/input/x;", "b", "Landroidx/compose/ui/text/input/x;", androidx.exifinterface.media.a.S4, "()Landroidx/compose/ui/text/input/x;", "Y", "(Landroidx/compose/ui/text/input/x;)V", "offsetMapping", "Landroidx/compose/foundation/text/TextFieldState;", "d", "Landroidx/compose/foundation/text/TextFieldState;", "G", "()Landroidx/compose/foundation/text/TextFieldState;", "a0", "(Landroidx/compose/foundation/text/TextFieldState;)V", "state", "<set-?>", "e", "Landroidx/compose/runtime/a1;", "K", "()Landroidx/compose/ui/text/input/TextFieldValue;", "c0", "(Landroidx/compose/ui/text/input/TextFieldValue;)V", "Landroidx/compose/ui/text/input/m0;", "f", "Landroidx/compose/ui/text/input/m0;", "L", "()Landroidx/compose/ui/text/input/m0;", "d0", "(Landroidx/compose/ui/text/input/m0;)V", "visualTransformation", "Landroidx/compose/ui/platform/k0;", "g", "Landroidx/compose/ui/platform/k0;", ak.aG, "()Landroidx/compose/ui/platform/k0;", "R", "(Landroidx/compose/ui/platform/k0;)V", "clipboardManager", "Landroidx/compose/ui/platform/w1;", RXScreenCaptureService.KEY_HEIGHT, "Landroidx/compose/ui/platform/w1;", "H", "()Landroidx/compose/ui/platform/w1;", "b0", "(Landroidx/compose/ui/platform/w1;)V", "textToolbar", "Landroidx/compose/ui/focus/FocusRequester;", "j", "Landroidx/compose/ui/focus/FocusRequester;", androidx.exifinterface.media.a.W4, "()Landroidx/compose/ui/focus/FocusRequester;", androidx.exifinterface.media.a.X4, "(Landroidx/compose/ui/focus/FocusRequester;)V", "focusRequester", ak.aD, "U", "editable", "dragBeginPosition", "m", "Ljava/lang/Integer;", "dragBeginOffsetInText", "dragTotalDistance", "Landroidx/compose/foundation/text/Handle;", "y", "()Landroidx/compose/foundation/text/Handle;", androidx.exifinterface.media.a.f23244d5, "(Landroidx/compose/foundation/text/Handle;)V", "draggingHandle", RXScreenCaptureService.KEY_WIDTH, "()Lb1/f;", androidx.exifinterface.media.a.R4, "currentDragPosition", "Landroidx/compose/ui/text/input/TextFieldValue;", "oldValue", "r", "Landroidx/compose/foundation/text/r;", "I", "touchSelectionObserver", "Landroidx/compose/foundation/text/selection/e;", "Landroidx/compose/foundation/text/selection/e;", "D", "()Landroidx/compose/foundation/text/selection/e;", "mouseSelectionObserver", "Lkotlin/Function1;", "onValueChange", "Lyh/l;", "F", "()Lyh/l;", "Z", "(Lyh/l;)V", "Ld1/a;", "hapticFeedBack", "Ld1/a;", "C", "()Ld1/a;", "X", "(Ld1/a;)V", "<init>", "(Landroidx/compose/foundation/text/a0;)V", "foundation_release"}, k = 1, mv = {1, 7, 1})
public final class TextFieldSelectionManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private final a0 undoManager;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private x offsetMapping;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private yh.l<? super TextFieldValue, b2> f8280c;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private TextFieldState state;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final a1 value;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private m0 visualTransformation;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private k0 clipboardManager;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private w1 textToolbar;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @dl.e
    private d1.a f8286i;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private FocusRequester focusRequester;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final a1 editable;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private long dragBeginPosition;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private Integer dragBeginOffsetInText;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private long dragTotalDistance;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final a1 draggingHandle;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final a1 currentDragPosition;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private TextFieldValue oldValue;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final androidx.compose.foundation.text.r touchSelectionObserver;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final e mouseSelectionObserver;

    /* JADX INFO: compiled from: TextFieldSelectionManager.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001d\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0007\u001a\u00020\u0004H\u0016J\u001d\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\u0006J\u001d\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0002H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\u0006J\b\u0010\f\u001a\u00020\u0004H\u0016J\b\u0010\r\u001a\u00020\u0004H\u0016\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u000e"}, d2 = {"androidx/compose/foundation/text/selection/TextFieldSelectionManager$a", "Landroidx/compose/foundation/text/r;", "Lb1/f;", "point", "Lkotlin/b2;", ak.av, "(J)V", "d", "startPoint", ak.aF, "delta", "b", "onStop", "onCancel", "foundation_release"}, k = 1, mv = {1, 7, 1})
    public static final class a implements androidx.compose.foundation.text.r {
        a() {
        }

        @Override // androidx.compose.foundation.text.r
        public void a(long point) {
            TextFieldSelectionManager.this.T(Handle.Cursor);
            TextFieldSelectionManager textFieldSelectionManager = TextFieldSelectionManager.this;
            textFieldSelectionManager.S(b1.f.d(m.a(textFieldSelectionManager.B(true))));
        }

        @Override // androidx.compose.foundation.text.r
        public void b(long delta) {
            androidx.compose.foundation.text.w wVarG;
            TextLayoutResult value;
            TextFieldSelectionManager textFieldSelectionManager = TextFieldSelectionManager.this;
            textFieldSelectionManager.dragTotalDistance = b1.f.v(textFieldSelectionManager.dragTotalDistance, delta);
            TextFieldState state = TextFieldSelectionManager.this.getState();
            if (state == null || (wVarG = state.g()) == null || (value = wVarG.getValue()) == null) {
                return;
            }
            TextFieldSelectionManager textFieldSelectionManager2 = TextFieldSelectionManager.this;
            textFieldSelectionManager2.S(b1.f.d(b1.f.v(textFieldSelectionManager2.dragBeginPosition, textFieldSelectionManager2.dragTotalDistance)));
            x offsetMapping = textFieldSelectionManager2.getOffsetMapping();
            b1.f fVarW = textFieldSelectionManager2.w();
            f0.m(fVarW);
            int iA = offsetMapping.a(value.x(fVarW.getF30368a()));
            long jB = p0.b(iA, iA);
            if (o0.g(jB, textFieldSelectionManager2.K().getSelection())) {
                return;
            }
            d1.a f8286i = textFieldSelectionManager2.getF8286i();
            if (f8286i != null) {
                f8286i.a(d1.b.f108126b.b());
            }
            textFieldSelectionManager2.F().invoke(textFieldSelectionManager2.n(textFieldSelectionManager2.K().getText(), jB));
        }

        @Override // androidx.compose.foundation.text.r
        public void c(long startPoint) {
            TextFieldSelectionManager textFieldSelectionManager = TextFieldSelectionManager.this;
            textFieldSelectionManager.dragBeginPosition = m.a(textFieldSelectionManager.B(true));
            TextFieldSelectionManager textFieldSelectionManager2 = TextFieldSelectionManager.this;
            textFieldSelectionManager2.S(b1.f.d(textFieldSelectionManager2.dragBeginPosition));
            TextFieldSelectionManager.this.dragTotalDistance = b1.f.f30364b.e();
            TextFieldSelectionManager.this.T(Handle.Cursor);
        }

        @Override // androidx.compose.foundation.text.r
        public void d() {
            TextFieldSelectionManager.this.T(null);
            TextFieldSelectionManager.this.S(null);
        }

        @Override // androidx.compose.foundation.text.r
        public void onCancel() {
        }

        @Override // androidx.compose.foundation.text.r
        public void onStop() {
            TextFieldSelectionManager.this.T(null);
            TextFieldSelectionManager.this.S(null);
        }
    }

    /* JADX INFO: compiled from: TextFieldSelectionManager.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001d\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0007\u001a\u00020\u0004H\u0016J\u001d\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\u0006J\u001d\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0002H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\u0006J\b\u0010\f\u001a\u00020\u0004H\u0016J\b\u0010\r\u001a\u00020\u0004H\u0016\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u000e"}, d2 = {"androidx/compose/foundation/text/selection/TextFieldSelectionManager$b", "Landroidx/compose/foundation/text/r;", "Lb1/f;", "point", "Lkotlin/b2;", ak.av, "(J)V", "d", "startPoint", ak.aF, "delta", "b", "onStop", "onCancel", "foundation_release"}, k = 1, mv = {1, 7, 1})
    public static final class b implements androidx.compose.foundation.text.r {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f8299b;

        b(boolean z10) {
            this.f8299b = z10;
        }

        @Override // androidx.compose.foundation.text.r
        public void a(long point) {
            TextFieldSelectionManager.this.T(this.f8299b ? Handle.SelectionStart : Handle.SelectionEnd);
            TextFieldSelectionManager textFieldSelectionManager = TextFieldSelectionManager.this;
            textFieldSelectionManager.S(b1.f.d(m.a(textFieldSelectionManager.B(this.f8299b))));
        }

        @Override // androidx.compose.foundation.text.r
        public void b(long delta) {
            androidx.compose.foundation.text.w wVarG;
            TextLayoutResult value;
            int iB;
            int iX;
            TextFieldSelectionManager textFieldSelectionManager = TextFieldSelectionManager.this;
            textFieldSelectionManager.dragTotalDistance = b1.f.v(textFieldSelectionManager.dragTotalDistance, delta);
            TextFieldState state = TextFieldSelectionManager.this.getState();
            if (state != null && (wVarG = state.g()) != null && (value = wVarG.getValue()) != null) {
                TextFieldSelectionManager textFieldSelectionManager2 = TextFieldSelectionManager.this;
                boolean z10 = this.f8299b;
                textFieldSelectionManager2.S(b1.f.d(b1.f.v(textFieldSelectionManager2.dragBeginPosition, textFieldSelectionManager2.dragTotalDistance)));
                if (z10) {
                    b1.f fVarW = textFieldSelectionManager2.w();
                    f0.m(fVarW);
                    iB = value.x(fVarW.getF30368a());
                } else {
                    iB = textFieldSelectionManager2.getOffsetMapping().b(o0.n(textFieldSelectionManager2.K().getSelection()));
                }
                int i10 = iB;
                if (z10) {
                    iX = textFieldSelectionManager2.getOffsetMapping().b(o0.i(textFieldSelectionManager2.K().getSelection()));
                } else {
                    b1.f fVarW2 = textFieldSelectionManager2.w();
                    f0.m(fVarW2);
                    iX = value.x(fVarW2.getF30368a());
                }
                textFieldSelectionManager2.f0(textFieldSelectionManager2.K(), i10, iX, z10, SelectionAdjustment.INSTANCE.c());
            }
            TextFieldState state2 = TextFieldSelectionManager.this.getState();
            if (state2 == null) {
                return;
            }
            state2.B(false);
        }

        @Override // androidx.compose.foundation.text.r
        public void c(long startPoint) {
            TextFieldSelectionManager textFieldSelectionManager = TextFieldSelectionManager.this;
            textFieldSelectionManager.dragBeginPosition = m.a(textFieldSelectionManager.B(this.f8299b));
            TextFieldSelectionManager textFieldSelectionManager2 = TextFieldSelectionManager.this;
            textFieldSelectionManager2.S(b1.f.d(textFieldSelectionManager2.dragBeginPosition));
            TextFieldSelectionManager.this.dragTotalDistance = b1.f.f30364b.e();
            TextFieldSelectionManager.this.T(this.f8299b ? Handle.SelectionStart : Handle.SelectionEnd);
            TextFieldState state = TextFieldSelectionManager.this.getState();
            if (state == null) {
                return;
            }
            state.B(false);
        }

        @Override // androidx.compose.foundation.text.r
        public void d() {
            TextFieldSelectionManager.this.T(null);
            TextFieldSelectionManager.this.S(null);
        }

        @Override // androidx.compose.foundation.text.r
        public void onCancel() {
        }

        @Override // androidx.compose.foundation.text.r
        public void onStop() {
            TextFieldSelectionManager.this.T(null);
            TextFieldSelectionManager.this.S(null);
            TextFieldState state = TextFieldSelectionManager.this.getState();
            if (state != null) {
                state.B(true);
            }
            w1 textToolbar = TextFieldSelectionManager.this.getTextToolbar();
            if ((textToolbar != null ? textToolbar.getStatus() : null) == TextToolbarStatus.Hidden) {
                TextFieldSelectionManager.this.e0();
            }
        }
    }

    /* JADX INFO: compiled from: TextFieldSelectionManager.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001d\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0002H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\b\u0010\u0006J%\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\fJ%\u0010\r\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\r\u0010\f\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u000e"}, d2 = {"androidx/compose/foundation/text/selection/TextFieldSelectionManager$c", "Landroidx/compose/foundation/text/selection/e;", "Lb1/f;", "downPosition", "", "d", "(J)Z", "dragPosition", "b", "Landroidx/compose/foundation/text/selection/SelectionAdjustment;", "adjustment", ak.aF, "(JLandroidx/compose/foundation/text/selection/SelectionAdjustment;)Z", ak.av, "foundation_release"}, k = 1, mv = {1, 7, 1})
    public static final class c implements e {
        c() {
        }

        @Override // androidx.compose.foundation.text.selection.e
        public boolean a(long dragPosition, @dl.d SelectionAdjustment adjustment) {
            TextFieldState state;
            androidx.compose.foundation.text.w wVarG;
            f0.p(adjustment, "adjustment");
            if ((TextFieldSelectionManager.this.K().i().length() == 0) || (state = TextFieldSelectionManager.this.getState()) == null || (wVarG = state.g()) == null) {
                return false;
            }
            TextFieldSelectionManager textFieldSelectionManager = TextFieldSelectionManager.this;
            int iG = wVarG.g(dragPosition, false);
            TextFieldValue textFieldValueK = textFieldSelectionManager.K();
            Integer num = textFieldSelectionManager.dragBeginOffsetInText;
            f0.m(num);
            textFieldSelectionManager.f0(textFieldValueK, num.intValue(), iG, false, adjustment);
            return true;
        }

        @Override // androidx.compose.foundation.text.selection.e
        public boolean b(long dragPosition) {
            TextFieldState state;
            androidx.compose.foundation.text.w wVarG;
            if ((TextFieldSelectionManager.this.K().i().length() == 0) || (state = TextFieldSelectionManager.this.getState()) == null || (wVarG = state.g()) == null) {
                return false;
            }
            TextFieldSelectionManager textFieldSelectionManager = TextFieldSelectionManager.this;
            textFieldSelectionManager.f0(textFieldSelectionManager.K(), textFieldSelectionManager.getOffsetMapping().b(o0.n(textFieldSelectionManager.K().getSelection())), wVarG.g(dragPosition, false), false, SelectionAdjustment.INSTANCE.e());
            return true;
        }

        @Override // androidx.compose.foundation.text.selection.e
        public boolean c(long downPosition, @dl.d SelectionAdjustment adjustment) {
            androidx.compose.foundation.text.w wVarG;
            f0.p(adjustment, "adjustment");
            FocusRequester focusRequester = TextFieldSelectionManager.this.getFocusRequester();
            if (focusRequester != null) {
                focusRequester.g();
            }
            TextFieldSelectionManager.this.dragBeginPosition = downPosition;
            TextFieldState state = TextFieldSelectionManager.this.getState();
            if (state == null || (wVarG = state.g()) == null) {
                return false;
            }
            TextFieldSelectionManager textFieldSelectionManager = TextFieldSelectionManager.this;
            textFieldSelectionManager.dragBeginOffsetInText = Integer.valueOf(androidx.compose.foundation.text.w.h(wVarG, downPosition, false, 2, null));
            int iH = androidx.compose.foundation.text.w.h(wVarG, textFieldSelectionManager.dragBeginPosition, false, 2, null);
            textFieldSelectionManager.f0(textFieldSelectionManager.K(), iH, iH, false, adjustment);
            return true;
        }

        @Override // androidx.compose.foundation.text.selection.e
        public boolean d(long downPosition) {
            androidx.compose.foundation.text.w wVarG;
            TextFieldState state = TextFieldSelectionManager.this.getState();
            if (state == null || (wVarG = state.g()) == null) {
                return false;
            }
            TextFieldSelectionManager textFieldSelectionManager = TextFieldSelectionManager.this;
            textFieldSelectionManager.f0(textFieldSelectionManager.K(), textFieldSelectionManager.getOffsetMapping().b(o0.n(textFieldSelectionManager.K().getSelection())), androidx.compose.foundation.text.w.h(wVarG, downPosition, false, 2, null), false, SelectionAdjustment.INSTANCE.e());
            return true;
        }
    }

    /* JADX INFO: compiled from: TextFieldSelectionManager.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001d\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0007\u001a\u00020\u0004H\u0016J\u001d\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\u0006J\u001d\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0002H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\u0006J\b\u0010\f\u001a\u00020\u0004H\u0016J\b\u0010\r\u001a\u00020\u0004H\u0016\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u000e"}, d2 = {"androidx/compose/foundation/text/selection/TextFieldSelectionManager$d", "Landroidx/compose/foundation/text/r;", "Lb1/f;", "point", "Lkotlin/b2;", ak.av, "(J)V", "d", "startPoint", ak.aF, "delta", "b", "onStop", "onCancel", "foundation_release"}, k = 1, mv = {1, 7, 1})
    public static final class d implements androidx.compose.foundation.text.r {
        d() {
        }

        @Override // androidx.compose.foundation.text.r
        public void a(long point) {
        }

        @Override // androidx.compose.foundation.text.r
        public void b(long delta) {
            androidx.compose.foundation.text.w wVarG;
            if (TextFieldSelectionManager.this.K().i().length() == 0) {
                return;
            }
            TextFieldSelectionManager textFieldSelectionManager = TextFieldSelectionManager.this;
            textFieldSelectionManager.dragTotalDistance = b1.f.v(textFieldSelectionManager.dragTotalDistance, delta);
            TextFieldState state = TextFieldSelectionManager.this.getState();
            if (state != null && (wVarG = state.g()) != null) {
                TextFieldSelectionManager textFieldSelectionManager2 = TextFieldSelectionManager.this;
                textFieldSelectionManager2.S(b1.f.d(b1.f.v(textFieldSelectionManager2.dragBeginPosition, textFieldSelectionManager2.dragTotalDistance)));
                Integer num = textFieldSelectionManager2.dragBeginOffsetInText;
                int iIntValue = num != null ? num.intValue() : wVarG.g(textFieldSelectionManager2.dragBeginPosition, false);
                b1.f fVarW = textFieldSelectionManager2.w();
                f0.m(fVarW);
                textFieldSelectionManager2.f0(textFieldSelectionManager2.K(), iIntValue, wVarG.g(fVarW.getF30368a(), false), false, SelectionAdjustment.INSTANCE.g());
            }
            TextFieldState state2 = TextFieldSelectionManager.this.getState();
            if (state2 == null) {
                return;
            }
            state2.B(false);
        }

        @Override // androidx.compose.foundation.text.r
        public void c(long startPoint) {
            androidx.compose.foundation.text.w wVarG;
            TextFieldState state;
            androidx.compose.foundation.text.w wVarG2;
            androidx.compose.foundation.text.w wVarG3;
            if (TextFieldSelectionManager.this.y() != null) {
                return;
            }
            TextFieldSelectionManager.this.T(Handle.SelectionEnd);
            TextFieldSelectionManager.this.N();
            TextFieldState state2 = TextFieldSelectionManager.this.getState();
            if (!((state2 == null || (wVarG3 = state2.g()) == null || !wVarG3.j(startPoint)) ? false : true) && (state = TextFieldSelectionManager.this.getState()) != null && (wVarG2 = state.g()) != null) {
                TextFieldSelectionManager textFieldSelectionManager = TextFieldSelectionManager.this;
                int iA = textFieldSelectionManager.getOffsetMapping().a(androidx.compose.foundation.text.w.e(wVarG2, wVarG2.f(b1.f.r(startPoint)), false, 2, null));
                d1.a f8286i = textFieldSelectionManager.getF8286i();
                if (f8286i != null) {
                    f8286i.a(d1.b.f108126b.b());
                }
                TextFieldValue textFieldValueN = textFieldSelectionManager.n(textFieldSelectionManager.K().getText(), p0.b(iA, iA));
                textFieldSelectionManager.s();
                textFieldSelectionManager.F().invoke(textFieldValueN);
                return;
            }
            if (TextFieldSelectionManager.this.K().i().length() == 0) {
                return;
            }
            TextFieldSelectionManager.this.s();
            TextFieldState state3 = TextFieldSelectionManager.this.getState();
            if (state3 != null && (wVarG = state3.g()) != null) {
                TextFieldSelectionManager textFieldSelectionManager2 = TextFieldSelectionManager.this;
                int iH = androidx.compose.foundation.text.w.h(wVarG, startPoint, false, 2, null);
                textFieldSelectionManager2.f0(textFieldSelectionManager2.K(), iH, iH, false, SelectionAdjustment.INSTANCE.g());
                textFieldSelectionManager2.dragBeginOffsetInText = Integer.valueOf(iH);
            }
            TextFieldSelectionManager.this.dragBeginPosition = startPoint;
            TextFieldSelectionManager textFieldSelectionManager3 = TextFieldSelectionManager.this;
            textFieldSelectionManager3.S(b1.f.d(textFieldSelectionManager3.dragBeginPosition));
            TextFieldSelectionManager.this.dragTotalDistance = b1.f.f30364b.e();
        }

        @Override // androidx.compose.foundation.text.r
        public void d() {
        }

        @Override // androidx.compose.foundation.text.r
        public void onCancel() {
        }

        @Override // androidx.compose.foundation.text.r
        public void onStop() {
            TextFieldSelectionManager.this.T(null);
            TextFieldSelectionManager.this.S(null);
            TextFieldState state = TextFieldSelectionManager.this.getState();
            if (state != null) {
                state.B(true);
            }
            w1 textToolbar = TextFieldSelectionManager.this.getTextToolbar();
            if ((textToolbar != null ? textToolbar.getStatus() : null) == TextToolbarStatus.Hidden) {
                TextFieldSelectionManager.this.e0();
            }
            TextFieldSelectionManager.this.dragBeginOffsetInText = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TextFieldSelectionManager() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public TextFieldSelectionManager(@dl.e a0 a0Var) {
        this.undoManager = a0Var;
        this.offsetMapping = e0.b();
        this.f8280c = new yh.l<TextFieldValue, b2>() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManager$onValueChange$1
            public final void a(@dl.d TextFieldValue it) {
                f0.p(it, "it");
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(TextFieldValue textFieldValue) {
                a(textFieldValue);
                return b2.f124493a;
            }
        };
        this.value = h2.g(new TextFieldValue((String) null, 0L, (o0) null, 7, (kotlin.jvm.internal.u) null), null, 2, null);
        this.visualTransformation = m0.INSTANCE.a();
        this.editable = h2.g(Boolean.TRUE, null, 2, null);
        b1.f.a aVar = b1.f.f30364b;
        this.dragBeginPosition = aVar.e();
        this.dragTotalDistance = aVar.e();
        this.draggingHandle = h2.g(null, null, 2, null);
        this.currentDragPosition = h2.g(null, null, 2, null);
        this.oldValue = new TextFieldValue((String) null, 0L, (o0) null, 7, (kotlin.jvm.internal.u) null);
        this.touchSelectionObserver = new d();
        this.mouseSelectionObserver = new c();
    }

    public /* synthetic */ TextFieldSelectionManager(a0 a0Var, int i10, kotlin.jvm.internal.u uVar) {
        this((i10 & 1) != 0 ? null : a0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void S(b1.f fVar) {
        this.currentDragPosition.setValue(fVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void T(Handle handle) {
        this.draggingHandle.setValue(handle);
    }

    private final void W(HandleState handleState) {
        TextFieldState textFieldState = this.state;
        if (textFieldState != null) {
            textFieldState.u(handleState);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void f0(TextFieldValue textFieldValue, int i10, int i11, boolean z10, SelectionAdjustment selectionAdjustment) {
        androidx.compose.foundation.text.w wVarG;
        long jB = p0.b(this.offsetMapping.b(o0.n(textFieldValue.getSelection())), this.offsetMapping.b(o0.i(textFieldValue.getSelection())));
        TextFieldState textFieldState = this.state;
        long jA = s.a((textFieldState == null || (wVarG = textFieldState.g()) == null) ? null : wVarG.getValue(), i10, i11, o0.h(jB) ? null : o0.b(jB), z10, selectionAdjustment);
        long jB2 = p0.b(this.offsetMapping.a(o0.n(jA)), this.offsetMapping.a(o0.i(jA)));
        if (o0.g(jB2, textFieldValue.getSelection())) {
            return;
        }
        d1.a aVar = this.f8286i;
        if (aVar != null) {
            aVar.a(d1.b.f108126b.b());
        }
        this.f8280c.invoke(n(textFieldValue.getText(), jB2));
        TextFieldState textFieldState2 = this.state;
        if (textFieldState2 != null) {
            textFieldState2.D(TextFieldSelectionManagerKt.c(this, true));
        }
        TextFieldState textFieldState3 = this.state;
        if (textFieldState3 == null) {
            return;
        }
        textFieldState3.C(TextFieldSelectionManagerKt.c(this, false));
    }

    public static /* synthetic */ void m(TextFieldSelectionManager textFieldSelectionManager, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        textFieldSelectionManager.l(z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TextFieldValue n(androidx.compose.ui.text.d annotatedString, long selection) {
        return new TextFieldValue(annotatedString, selection, (o0) null, 4, (kotlin.jvm.internal.u) null);
    }

    public static /* synthetic */ void r(TextFieldSelectionManager textFieldSelectionManager, b1.f fVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            fVar = null;
        }
        textFieldSelectionManager.q(fVar);
    }

    private final b1.i v() {
        float fR;
        androidx.compose.ui.layout.q qVarF;
        TextLayoutResult value;
        b1.i iVarE;
        androidx.compose.ui.layout.q qVarF2;
        TextLayoutResult value2;
        b1.i iVarE2;
        androidx.compose.ui.layout.q qVarF3;
        androidx.compose.ui.layout.q qVarF4;
        TextFieldState textFieldState = this.state;
        if (textFieldState == null) {
            return b1.i.f30369e.a();
        }
        long jE = (textFieldState == null || (qVarF4 = textFieldState.getLayoutCoordinates()) == null) ? b1.f.f30364b.e() : qVarF4.L(B(true));
        TextFieldState textFieldState2 = this.state;
        long jE2 = (textFieldState2 == null || (qVarF3 = textFieldState2.getLayoutCoordinates()) == null) ? b1.f.f30364b.e() : qVarF3.L(B(false));
        TextFieldState textFieldState3 = this.state;
        float fR2 = 0.0f;
        if (textFieldState3 == null || (qVarF2 = textFieldState3.getLayoutCoordinates()) == null) {
            fR = 0.0f;
        } else {
            androidx.compose.foundation.text.w wVarG = textFieldState.g();
            fR = b1.f.r(qVarF2.L(b1.g.a(0.0f, (wVarG == null || (value2 = wVarG.getValue()) == null || (iVarE2 = value2.e(fi.u.I(o0.n(K().getSelection()), 0, Math.max(0, K().i().length() - 1)))) == null) ? 0.0f : iVarE2.getF30372b())));
        }
        TextFieldState textFieldState4 = this.state;
        if (textFieldState4 != null && (qVarF = textFieldState4.getLayoutCoordinates()) != null) {
            androidx.compose.foundation.text.w wVarG2 = textFieldState.g();
            fR2 = b1.f.r(qVarF.L(b1.g.a(0.0f, (wVarG2 == null || (value = wVarG2.getValue()) == null || (iVarE = value.e(fi.u.I(o0.i(K().getSelection()), 0, Math.max(0, K().i().length() - 1)))) == null) ? 0.0f : iVarE.getF30372b())));
        }
        return new b1.i(Math.min(b1.f.p(jE), b1.f.p(jE2)), Math.min(fR, fR2), Math.max(b1.f.p(jE), b1.f.p(jE2)), Math.max(b1.f.r(jE), b1.f.r(jE2)) + (s1.h.g(25) * textFieldState.getTextDelegate().getF8116f().getF139217b()));
    }

    @dl.e
    /* JADX INFO: renamed from: A, reason: from getter */
    public final FocusRequester getFocusRequester() {
        return this.focusRequester;
    }

    public final long B(boolean isStartHandle) {
        long selection = K().getSelection();
        int iN = isStartHandle ? o0.n(selection) : o0.i(selection);
        TextFieldState textFieldState = this.state;
        androidx.compose.foundation.text.w wVarG = textFieldState != null ? textFieldState.g() : null;
        f0.m(wVarG);
        return w.b(wVarG.getValue(), this.offsetMapping.b(iN), isStartHandle, o0.m(K().getSelection()));
    }

    @dl.e
    /* JADX INFO: renamed from: C, reason: from getter */
    public final d1.a getF8286i() {
        return this.f8286i;
    }

    @dl.d
    /* JADX INFO: renamed from: D, reason: from getter */
    public final e getMouseSelectionObserver() {
        return this.mouseSelectionObserver;
    }

    @dl.d
    /* JADX INFO: renamed from: E, reason: from getter */
    public final x getOffsetMapping() {
        return this.offsetMapping;
    }

    @dl.d
    public final yh.l<TextFieldValue, b2> F() {
        return this.f8280c;
    }

    @dl.e
    /* JADX INFO: renamed from: G, reason: from getter */
    public final TextFieldState getState() {
        return this.state;
    }

    @dl.e
    /* JADX INFO: renamed from: H, reason: from getter */
    public final w1 getTextToolbar() {
        return this.textToolbar;
    }

    @dl.d
    /* JADX INFO: renamed from: I, reason: from getter */
    public final androidx.compose.foundation.text.r getTouchSelectionObserver() {
        return this.touchSelectionObserver;
    }

    @dl.e
    /* JADX INFO: renamed from: J, reason: from getter */
    public final a0 getUndoManager() {
        return this.undoManager;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @dl.d
    public final TextFieldValue K() {
        return (TextFieldValue) this.value.getValue();
    }

    @dl.d
    /* JADX INFO: renamed from: L, reason: from getter */
    public final m0 getVisualTransformation() {
        return this.visualTransformation;
    }

    @dl.d
    public final androidx.compose.foundation.text.r M(boolean isStartHandle) {
        return new b(isStartHandle);
    }

    public final void N() {
        w1 w1Var;
        w1 w1Var2 = this.textToolbar;
        if ((w1Var2 != null ? w1Var2.getStatus() : null) != TextToolbarStatus.Shown || (w1Var = this.textToolbar) == null) {
            return;
        }
        w1Var.hide();
    }

    public final boolean O() {
        return !f0.g(this.oldValue.i(), K().i());
    }

    public final void P() {
        androidx.compose.ui.text.d text;
        k0 k0Var = this.clipboardManager;
        if (k0Var == null || (text = k0Var.getText()) == null) {
            return;
        }
        androidx.compose.ui.text.d dVarK = h0.c(K(), K().i().length()).k(text).k(h0.b(K(), K().i().length()));
        int iL = o0.l(K().getSelection()) + text.length();
        this.f8280c.invoke(n(dVarK, p0.b(iL, iL)));
        W(HandleState.None);
        a0 a0Var = this.undoManager;
        if (a0Var != null) {
            a0Var.a();
        }
    }

    public final void Q() {
        TextFieldValue textFieldValueN = n(K().getText(), p0.b(0, K().i().length()));
        this.f8280c.invoke(textFieldValueN);
        this.oldValue = TextFieldValue.d(this.oldValue, null, textFieldValueN.getSelection(), null, 5, null);
        TextFieldState textFieldState = this.state;
        if (textFieldState == null) {
            return;
        }
        textFieldState.B(true);
    }

    public final void R(@dl.e k0 k0Var) {
        this.clipboardManager = k0Var;
    }

    public final void U(boolean z10) {
        this.editable.setValue(Boolean.valueOf(z10));
    }

    public final void V(@dl.e FocusRequester focusRequester) {
        this.focusRequester = focusRequester;
    }

    public final void X(@dl.e d1.a aVar) {
        this.f8286i = aVar;
    }

    public final void Y(@dl.d x xVar) {
        f0.p(xVar, "<set-?>");
        this.offsetMapping = xVar;
    }

    public final void Z(@dl.d yh.l<? super TextFieldValue, b2> lVar) {
        f0.p(lVar, "<set-?>");
        this.f8280c = lVar;
    }

    public final void a0(@dl.e TextFieldState textFieldState) {
        this.state = textFieldState;
    }

    public final void b0(@dl.e w1 w1Var) {
        this.textToolbar = w1Var;
    }

    public final void c0(@dl.d TextFieldValue textFieldValue) {
        f0.p(textFieldValue, "<set-?>");
        this.value.setValue(textFieldValue);
    }

    public final void d0(@dl.d m0 m0Var) {
        f0.p(m0Var, "<set-?>");
        this.visualTransformation = m0Var;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0054  */
    public final void e0() {
        yh.a<b2> aVar;
        boolean z10 = this.visualTransformation instanceof z;
        yh.a<b2> aVar2 = (o0.h(K().getSelection()) || z10) ? null : new yh.a<b2>() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManager$showSelectionToolbar$copy$1
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
                TextFieldSelectionManager.m(this.f8303b, false, 1, null);
                this.f8303b.N();
            }
        };
        yh.a<b2> aVar3 = (o0.h(K().getSelection()) || !z() || z10) ? null : new yh.a<b2>() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManager$showSelectionToolbar$cut$1
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
                this.f8304b.p();
                this.f8304b.N();
            }
        };
        if (z()) {
            k0 k0Var = this.clipboardManager;
            if ((k0Var != null ? k0Var.getText() : null) != null) {
                aVar = new yh.a<b2>() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManager$showSelectionToolbar$paste$1
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
                        this.f8305b.P();
                        this.f8305b.N();
                    }
                };
            } else {
                aVar = null;
            }
        } else {
            aVar = null;
        }
        yh.a<b2> aVar4 = o0.j(K().getSelection()) != K().i().length() ? new yh.a<b2>() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManager$showSelectionToolbar$selectAll$1
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
                this.f8306b.Q();
            }
        } : null;
        w1 w1Var = this.textToolbar;
        if (w1Var != null) {
            w1Var.b(v(), aVar2, aVar, aVar3, aVar4);
        }
    }

    public final void k(long position) {
        androidx.compose.foundation.text.w wVarG;
        TextFieldState textFieldState = this.state;
        if (textFieldState == null || (wVarG = textFieldState.g()) == null) {
            return;
        }
        int iH = androidx.compose.foundation.text.w.h(wVarG, position, false, 2, null);
        if (o0.e(K().getSelection(), iH)) {
            return;
        }
        f0(K(), iH, iH, false, SelectionAdjustment.INSTANCE.g());
    }

    public final void l(boolean cancelSelection) {
        if (o0.h(K().getSelection())) {
            return;
        }
        k0 k0Var = this.clipboardManager;
        if (k0Var != null) {
            k0Var.a(h0.a(K()));
        }
        if (cancelSelection) {
            int iK = o0.k(K().getSelection());
            this.f8280c.invoke(n(K().getText(), p0.b(iK, iK)));
            W(HandleState.None);
        }
    }

    @dl.d
    public final androidx.compose.foundation.text.r o() {
        return new a();
    }

    public final void p() {
        if (o0.h(K().getSelection())) {
            return;
        }
        k0 k0Var = this.clipboardManager;
        if (k0Var != null) {
            k0Var.a(h0.a(K()));
        }
        androidx.compose.ui.text.d dVarK = h0.c(K(), K().i().length()).k(h0.b(K(), K().i().length()));
        int iL = o0.l(K().getSelection());
        this.f8280c.invoke(n(dVarK, p0.b(iL, iL)));
        W(HandleState.None);
        a0 a0Var = this.undoManager;
        if (a0Var != null) {
            a0Var.a();
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0068  */
    public final void q(@dl.e b1.f position) {
        HandleState handleState;
        if (!o0.h(K().getSelection())) {
            TextFieldState textFieldState = this.state;
            androidx.compose.foundation.text.w wVarG = textFieldState != null ? textFieldState.g() : null;
            this.f8280c.invoke(TextFieldValue.d(K(), null, p0.a((position == null || wVarG == null) ? o0.k(K().getSelection()) : this.offsetMapping.a(androidx.compose.foundation.text.w.h(wVarG, position.getF30368a(), false, 2, null))), null, 5, null));
        }
        if (position == null) {
            handleState = HandleState.None;
        } else {
            if (K().i().length() > 0) {
                handleState = HandleState.Cursor;
            } else {
                handleState = HandleState.None;
            }
        }
        W(handleState);
        N();
    }

    public final void s() {
        FocusRequester focusRequester;
        TextFieldState textFieldState = this.state;
        boolean z10 = false;
        if (textFieldState != null && !textFieldState.d()) {
            z10 = true;
        }
        if (z10 && (focusRequester = this.focusRequester) != null) {
            focusRequester.g();
        }
        this.oldValue = K();
        TextFieldState textFieldState2 = this.state;
        if (textFieldState2 != null) {
            textFieldState2.B(true);
        }
        W(HandleState.Selection);
    }

    public final void t() {
        TextFieldState textFieldState = this.state;
        if (textFieldState != null) {
            textFieldState.B(false);
        }
        W(HandleState.None);
    }

    @dl.e
    /* JADX INFO: renamed from: u, reason: from getter */
    public final k0 getClipboardManager() {
        return this.clipboardManager;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @dl.e
    public final b1.f w() {
        return (b1.f) this.currentDragPosition.getValue();
    }

    public final long x(@dl.d s1.e density) {
        f0.p(density, "density");
        int iB = this.offsetMapping.b(o0.n(K().getSelection()));
        TextFieldState textFieldState = this.state;
        androidx.compose.foundation.text.w wVarG = textFieldState != null ? textFieldState.g() : null;
        f0.m(wVarG);
        TextLayoutResult value = wVarG.getValue();
        b1.i iVarE = value.e(fi.u.I(iB, 0, value.getLayoutInput().getText().length()));
        return b1.g.a(iVarE.t() + (density.E1(TextFieldCursorKt.c()) / 2), iVarE.j());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @dl.e
    public final Handle y() {
        return (Handle) this.draggingHandle.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean z() {
        return ((Boolean) this.editable.getValue()).booleanValue();
    }
}
