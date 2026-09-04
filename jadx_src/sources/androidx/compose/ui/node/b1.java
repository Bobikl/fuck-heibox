package androidx.compose.ui.node;

import android.view.KeyEvent;
import androidx.compose.ui.modifier.ModifierLocalManager;
import androidx.compose.ui.platform.d2;
import androidx.compose.ui.platform.o2;
import androidx.compose.ui.platform.w1;
import androidx.compose.ui.unit.LayoutDirection;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.b2;

/* JADX INFO: compiled from: Owner.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0084\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b`\u0018\u0000 \u0090\u00012\u00020\u0001:\u0003\u0091\u0001\u0016J$\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004H&J$\u0010\t\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004H&J\u0010\u0010\n\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0002H&J\u0010\u0010\r\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0002H&J\u001d\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u000eH&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0013\u0010\u0011J\b\u0010\u0014\u001a\u00020\u0004H&J\u0012\u0010\u0016\u001a\u00020\u00072\b\b\u0002\u0010\u0015\u001a\u00020\u0004H&J%\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0017H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H&J*\u0010\"\u001a\u00020!2\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u00070\u001c2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00070\u001fH&J\b\u0010#\u001a\u00020\u0007H&J\u0010\u0010$\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H&J\u001f\u0010(\u001a\u0004\u0018\u00010'2\u0006\u0010&\u001a\u00020%H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b(\u0010)J\u0016\u0010+\u001a\u00020\u00072\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00070\u001fH&J\b\u0010,\u001a\u00020\u0007H&J\u0010\u0010.\u001a\u00020\u00072\u0006\u0010*\u001a\u00020-H&R\u0014\u00101\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b/\u00100R\u0014\u00105\u001a\u0002028&X¦\u0004¢\u0006\u0006\u001a\u0004\b3\u00104R\u0014\u00109\u001a\u0002068&X¦\u0004¢\u0006\u0006\u001a\u0004\b7\u00108R\u0014\u0010=\u001a\u00020:8&X¦\u0004¢\u0006\u0006\u001a\u0004\b;\u0010<R\u0014\u0010A\u001a\u00020>8&X¦\u0004¢\u0006\u0006\u001a\u0004\b?\u0010@R\u0014\u0010E\u001a\u00020B8&X¦\u0004¢\u0006\u0006\u001a\u0004\bC\u0010DR\u0014\u0010I\u001a\u00020F8&X¦\u0004¢\u0006\u0006\u001a\u0004\bG\u0010HR\u0014\u0010M\u001a\u00020J8&X¦\u0004¢\u0006\u0006\u001a\u0004\bK\u0010LR\u001a\u0010S\u001a\u00020N8gX§\u0004¢\u0006\f\u0012\u0004\bQ\u0010R\u001a\u0004\bO\u0010PR\u001c\u0010X\u001a\u0004\u0018\u00010T8gX§\u0004¢\u0006\f\u0012\u0004\bW\u0010R\u001a\u0004\bU\u0010VR\u0014\u0010\\\u001a\u00020Y8&X¦\u0004¢\u0006\u0006\u001a\u0004\bZ\u0010[R\u0014\u0010`\u001a\u00020]8&X¦\u0004¢\u0006\u0006\u001a\u0004\b^\u0010_R\u0014\u0010d\u001a\u00020a8&X¦\u0004¢\u0006\u0006\u001a\u0004\bb\u0010cR\u0014\u0010h\u001a\u00020e8&X¦\u0004¢\u0006\u0006\u001a\u0004\bf\u0010gR\u0014\u0010l\u001a\u00020i8&X¦\u0004¢\u0006\u0006\u001a\u0004\bj\u0010kR\u001a\u0010q\u001a\u00020m8&X§\u0004¢\u0006\f\u0012\u0004\bp\u0010R\u001a\u0004\bn\u0010oR\u0014\u0010u\u001a\u00020r8&X¦\u0004¢\u0006\u0006\u001a\u0004\bs\u0010tR\u0014\u0010y\u001a\u00020v8&X¦\u0004¢\u0006\u0006\u001a\u0004\bw\u0010xR$\u0010\u007f\u001a\u00020\u00042\u0006\u0010z\u001a\u00020\u00048&@gX¦\u000e¢\u0006\f\u001a\u0004\b{\u0010|\"\u0004\b}\u0010~R\u0018\u0010\u0083\u0001\u001a\u00030\u0080\u00018&X¦\u0004¢\u0006\b\u001a\u0006\b\u0081\u0001\u0010\u0082\u0001R\u0018\u0010\u0087\u0001\u001a\u00030\u0084\u00018&X¦\u0004¢\u0006\b\u001a\u0006\b\u0085\u0001\u0010\u0086\u0001R\u0018\u0010\u008b\u0001\u001a\u00030\u0088\u00018&X¦\u0004¢\u0006\b\u001a\u0006\b\u0089\u0001\u0010\u008a\u0001R\u0018\u0010\u008f\u0001\u001a\u00030\u008c\u00018&X¦\u0004¢\u0006\b\u001a\u0006\b\u008d\u0001\u0010\u008e\u0001ø\u0001\u0002\u0082\u0002\u0011\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0004\b!0\u0001¨\u0006\u0092\u0001À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/node/b1;", "", "Landroidx/compose/ui/node/LayoutNode;", "layoutNode", "", "affectsLookahead", "forceRequest", "Lkotlin/b2;", ak.aF, "r", "e", "node", RXScreenCaptureService.KEY_WIDTH, "x", "Lb1/f;", "localPosition", ak.aB, "(J)J", "positionInWindow", "m", "requestFocus", "sendPointerUpdate", "b", "Ls1/b;", "constraints", "i", "(Landroidx/compose/ui/node/LayoutNode;J)V", ak.aG, "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/d0;", "drawBlock", "Lkotlin/Function0;", "invalidateParentLayer", "Landroidx/compose/ui/node/z0;", "o", androidx.exifinterface.media.a.W4, "t", "Landroidx/compose/ui/input/key/b;", "keyEvent", "Landroidx/compose/ui/focus/b;", "v", "(Landroid/view/KeyEvent;)Landroidx/compose/ui/focus/b;", com.google.android.gms.common.internal.s.a.f52543a, "n", "p", "Landroidx/compose/ui/node/b1$b;", "f", "getRoot", "()Landroidx/compose/ui/node/LayoutNode;", "root", "Landroidx/compose/ui/node/b0;", "getSharedDrawScope", "()Landroidx/compose/ui/node/b0;", "sharedDrawScope", "Landroidx/compose/ui/node/i1;", "getRootForTest", "()Landroidx/compose/ui/node/i1;", "rootForTest", "Ld1/a;", "getHapticFeedBack", "()Ld1/a;", "hapticFeedBack", "Le1/b;", "getInputModeManager", "()Le1/b;", "inputModeManager", "Landroidx/compose/ui/platform/k0;", "getClipboardManager", "()Landroidx/compose/ui/platform/k0;", "clipboardManager", "Landroidx/compose/ui/platform/c;", "getAccessibilityManager", "()Landroidx/compose/ui/platform/c;", "accessibilityManager", "Landroidx/compose/ui/platform/w1;", "getTextToolbar", "()Landroidx/compose/ui/platform/w1;", "textToolbar", "La1/n;", "getAutofillTree", "()La1/n;", "getAutofillTree$annotations", "()V", "autofillTree", "La1/e;", "getAutofill", "()La1/e;", "getAutofill$annotations", "autofill", "Ls1/e;", "getDensity", "()Ls1/e;", "density", "Landroidx/compose/ui/text/input/i0;", "getTextInputService", "()Landroidx/compose/ui/text/input/i0;", "textInputService", "Landroidx/compose/ui/input/pointer/v;", "getPointerIconService", "()Landroidx/compose/ui/input/pointer/v;", "pointerIconService", "Landroidx/compose/ui/focus/g;", "getFocusManager", "()Landroidx/compose/ui/focus/g;", "focusManager", "Landroidx/compose/ui/platform/o2;", "getWindowInfo", "()Landroidx/compose/ui/platform/o2;", "windowInfo", "Landroidx/compose/ui/text/font/u$b;", "getFontLoader", "()Landroidx/compose/ui/text/font/u$b;", "getFontLoader$annotations", "fontLoader", "Landroidx/compose/ui/text/font/v$b;", "getFontFamilyResolver", "()Landroidx/compose/ui/text/font/v$b;", "fontFamilyResolver", "Landroidx/compose/ui/unit/LayoutDirection;", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "<set-?>", "getShowLayoutBounds", "()Z", "setShowLayoutBounds", "(Z)V", "showLayoutBounds", "", "getMeasureIteration", "()J", "measureIteration", "Landroidx/compose/ui/platform/d2;", "getViewConfiguration", "()Landroidx/compose/ui/platform/d2;", "viewConfiguration", "Landroidx/compose/ui/node/OwnerSnapshotObserver;", "getSnapshotObserver", "()Landroidx/compose/ui/node/OwnerSnapshotObserver;", "snapshotObserver", "Landroidx/compose/ui/modifier/ModifierLocalManager;", "getModifierLocalManager", "()Landroidx/compose/ui/modifier/ModifierLocalManager;", "modifierLocalManager", "o0", ak.av, "ui_release"}, k = 1, mv = {1, 7, 1})
public interface b1 {

    /* JADX INFO: renamed from: o0, reason: collision with root package name and from kotlin metadata */
    @dl.d
    public static final Companion INSTANCE = Companion.f15302a;

    /* JADX INFO: renamed from: androidx.compose.ui.node.b1$a, reason: from kotlin metadata */
    /* JADX INFO: compiled from: Owner.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nR\"\u0010\b\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0003\u0010\u0007¨\u0006\u000b"}, d2 = {"Landroidx/compose/ui/node/b1$a;", "", "", "b", "Z", ak.av, "()Z", "(Z)V", "enableExtraAssertions", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 7, 1})
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f15302a = new Companion();

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private static boolean enableExtraAssertions;

        private Companion() {
        }

        public final boolean a() {
            return enableExtraAssertions;
        }

        public final void b(boolean z10) {
            enableExtraAssertions = z10;
        }
    }

    /* JADX INFO: compiled from: Owner.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/node/b1$b;", "", "Lkotlin/b2;", "n", "ui_release"}, k = 1, mv = {1, 7, 1})
    public interface b {
        void n();
    }

    void A();

    void b(boolean z10);

    void c(@dl.d LayoutNode layoutNode, boolean z10, boolean z11);

    void e(@dl.d LayoutNode layoutNode);

    void f(@dl.d b bVar);

    @dl.d
    androidx.compose.ui.platform.c getAccessibilityManager();

    @androidx.compose.ui.g
    @dl.e
    a1.e getAutofill();

    @androidx.compose.ui.g
    @dl.d
    a1.n getAutofillTree();

    @dl.d
    androidx.compose.ui.platform.k0 getClipboardManager();

    @dl.d
    s1.e getDensity();

    @dl.d
    androidx.compose.ui.focus.g getFocusManager();

    @dl.d
    androidx.compose.ui.text.font.v.b getFontFamilyResolver();

    @dl.d
    androidx.compose.ui.text.font.u.b getFontLoader();

    @dl.d
    d1.a getHapticFeedBack();

    @dl.d
    e1.b getInputModeManager();

    @dl.d
    LayoutDirection getLayoutDirection();

    long getMeasureIteration();

    @dl.d
    ModifierLocalManager getModifierLocalManager();

    @dl.d
    androidx.compose.ui.input.pointer.v getPointerIconService();

    @dl.d
    LayoutNode getRoot();

    @dl.d
    i1 getRootForTest();

    @dl.d
    b0 getSharedDrawScope();

    boolean getShowLayoutBounds();

    @dl.d
    OwnerSnapshotObserver getSnapshotObserver();

    @dl.d
    androidx.compose.ui.text.input.i0 getTextInputService();

    @dl.d
    w1 getTextToolbar();

    @dl.d
    d2 getViewConfiguration();

    @dl.d
    o2 getWindowInfo();

    void i(@dl.d LayoutNode layoutNode, long constraints);

    long m(long positionInWindow);

    void n(@dl.d yh.a<b2> aVar);

    @dl.d
    z0 o(@dl.d yh.l<? super androidx.compose.ui.graphics.d0, b2> lVar, @dl.d yh.a<b2> aVar);

    void p();

    void r(@dl.d LayoutNode layoutNode, boolean z10, boolean z11);

    boolean requestFocus();

    long s(long localPosition);

    @p
    void setShowLayoutBounds(boolean z10);

    void t(@dl.d LayoutNode layoutNode);

    void u(@dl.d LayoutNode layoutNode);

    @dl.e
    androidx.compose.ui.focus.b v(@dl.d KeyEvent keyEvent);

    void w(@dl.d LayoutNode layoutNode);

    void x(@dl.d LayoutNode layoutNode);
}
