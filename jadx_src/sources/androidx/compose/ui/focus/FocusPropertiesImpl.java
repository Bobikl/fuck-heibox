package androidx.compose.ui.focus;

import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import com.umeng.socialize.net.dplus.CommonNetImpl;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: FocusProperties.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b<\u00107R\"\u0010\t\u001a\u00020\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\u0011\u001a\u00020\n8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\"\u0010\u0015\u001a\u00020\n8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\f\u001a\u0004\b\u0013\u0010\u000e\"\u0004\b\u0014\u0010\u0010R\"\u0010\u0019\u001a\u00020\n8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\f\u001a\u0004\b\u0017\u0010\u000e\"\u0004\b\u0018\u0010\u0010R\"\u0010\u001d\u001a\u00020\n8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\f\u001a\u0004\b\u001b\u0010\u000e\"\u0004\b\u001c\u0010\u0010R\"\u0010!\u001a\u00020\n8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\f\u001a\u0004\b\u001f\u0010\u000e\"\u0004\b \u0010\u0010R\"\u0010%\u001a\u00020\n8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\"\u0010\f\u001a\u0004\b#\u0010\u000e\"\u0004\b$\u0010\u0010R\"\u0010)\u001a\u00020\n8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b&\u0010\f\u001a\u0004\b'\u0010\u000e\"\u0004\b(\u0010\u0010R\"\u0010-\u001a\u00020\n8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b*\u0010\f\u001a\u0004\b+\u0010\u000e\"\u0004\b,\u0010\u0010R7\u00100\u001a\u000e\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020\n0.8\u0016@\u0016X\u0096\u000eø\u0001\u0000¢\u0006\u0018\n\u0004\b0\u00101\u0012\u0004\b6\u00107\u001a\u0004\b2\u00103\"\u0004\b4\u00105R7\u00108\u001a\u000e\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020\n0.8\u0016@\u0016X\u0096\u000eø\u0001\u0000¢\u0006\u0018\n\u0004\b8\u00101\u0012\u0004\b;\u00107\u001a\u0004\b9\u00103\"\u0004\b:\u00105\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006="}, d2 = {"Landroidx/compose/ui/focus/FocusPropertiesImpl;", "Landroidx/compose/ui/focus/p;", "", ak.av, "Z", androidx.exifinterface.media.a.T4, "()Z", "L", "(Z)V", "canFocus", "Landroidx/compose/ui/focus/FocusRequester;", "b", "Landroidx/compose/ui/focus/FocusRequester;", "getNext", "()Landroidx/compose/ui/focus/FocusRequester;", "X", "(Landroidx/compose/ui/focus/FocusRequester;)V", "next", ak.aF, "P", "Q", "previous", "d", "H", "J", CommonNetImpl.UP, "e", "K", "M", "down", "f", "F", "U", com.google.android.exoplayer2.text.ttml.d.f49793l0, "g", androidx.exifinterface.media.a.S4, androidx.exifinterface.media.a.X4, com.google.android.exoplayer2.text.ttml.d.f49796n0, RXScreenCaptureService.KEY_HEIGHT, "D", "O", com.google.android.exoplayer2.text.ttml.d.f49798o0, "i", "G", androidx.exifinterface.media.a.f23244d5, com.google.android.exoplayer2.text.ttml.d.f49800p0, "Lkotlin/Function1;", "Landroidx/compose/ui/focus/b;", "enter", "Lyh/l;", androidx.exifinterface.media.a.R4, "()Lyh/l;", "N", "(Lyh/l;)V", "getEnter$annotations", "()V", com.alipay.sdk.m.x.d.A, "I", "R", "getExit$annotations", "<init>", "ui_release"}, k = 1, mv = {1, 7, 1})
public final class FocusPropertiesImpl implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private boolean canFocus = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private FocusRequester next;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private FocusRequester previous;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private FocusRequester up;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private FocusRequester down;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private FocusRequester left;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private FocusRequester right;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private FocusRequester start;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private FocusRequester end;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @dl.d
    private yh.l<? super b, FocusRequester> f13533j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @dl.d
    private yh.l<? super b, FocusRequester> f13534k;

    public FocusPropertiesImpl() {
        FocusRequester.Companion companion = FocusRequester.INSTANCE;
        this.next = companion.d();
        this.previous = companion.d();
        this.up = companion.d();
        this.down = companion.d();
        this.left = companion.d();
        this.right = companion.d();
        this.start = companion.d();
        this.end = companion.d();
        this.f13533j = new yh.l<b, FocusRequester>() { // from class: androidx.compose.ui.focus.FocusPropertiesImpl$enter$1
            @dl.d
            public final FocusRequester a(int i10) {
                return FocusRequester.INSTANCE.d();
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ FocusRequester invoke(b bVar) {
                return a(bVar.getValue());
            }
        };
        this.f13534k = new yh.l<b, FocusRequester>() { // from class: androidx.compose.ui.focus.FocusPropertiesImpl$exit$1
            @dl.d
            public final FocusRequester a(int i10) {
                return FocusRequester.INSTANCE.d();
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ FocusRequester invoke(b bVar) {
                return a(bVar.getValue());
            }
        };
    }

    public static /* synthetic */ void a() {
    }

    public static /* synthetic */ void b() {
    }

    @Override // androidx.compose.ui.focus.p
    @dl.d
    /* JADX INFO: renamed from: D, reason: from getter */
    public FocusRequester getStart() {
        return this.start;
    }

    @Override // androidx.compose.ui.focus.p
    @dl.d
    /* JADX INFO: renamed from: E, reason: from getter */
    public FocusRequester getRight() {
        return this.right;
    }

    @Override // androidx.compose.ui.focus.p
    @dl.d
    /* JADX INFO: renamed from: F, reason: from getter */
    public FocusRequester getLeft() {
        return this.left;
    }

    @Override // androidx.compose.ui.focus.p
    @dl.d
    /* JADX INFO: renamed from: G, reason: from getter */
    public FocusRequester getEnd() {
        return this.end;
    }

    @Override // androidx.compose.ui.focus.p
    @dl.d
    /* JADX INFO: renamed from: H, reason: from getter */
    public FocusRequester getUp() {
        return this.up;
    }

    @Override // androidx.compose.ui.focus.p
    @dl.d
    public yh.l<b, FocusRequester> I() {
        return this.f13534k;
    }

    @Override // androidx.compose.ui.focus.p
    public void J(@dl.d FocusRequester focusRequester) {
        f0.p(focusRequester, "<set-?>");
        this.up = focusRequester;
    }

    @Override // androidx.compose.ui.focus.p
    @dl.d
    /* JADX INFO: renamed from: K, reason: from getter */
    public FocusRequester getDown() {
        return this.down;
    }

    @Override // androidx.compose.ui.focus.p
    public void L(boolean z10) {
        this.canFocus = z10;
    }

    @Override // androidx.compose.ui.focus.p
    public void M(@dl.d FocusRequester focusRequester) {
        f0.p(focusRequester, "<set-?>");
        this.down = focusRequester;
    }

    @Override // androidx.compose.ui.focus.p
    public void N(@dl.d yh.l<? super b, FocusRequester> lVar) {
        f0.p(lVar, "<set-?>");
        this.f13533j = lVar;
    }

    @Override // androidx.compose.ui.focus.p
    public void O(@dl.d FocusRequester focusRequester) {
        f0.p(focusRequester, "<set-?>");
        this.start = focusRequester;
    }

    @Override // androidx.compose.ui.focus.p
    @dl.d
    /* JADX INFO: renamed from: P, reason: from getter */
    public FocusRequester getPrevious() {
        return this.previous;
    }

    @Override // androidx.compose.ui.focus.p
    public void Q(@dl.d FocusRequester focusRequester) {
        f0.p(focusRequester, "<set-?>");
        this.previous = focusRequester;
    }

    @Override // androidx.compose.ui.focus.p
    public void R(@dl.d yh.l<? super b, FocusRequester> lVar) {
        f0.p(lVar, "<set-?>");
        this.f13534k = lVar;
    }

    @Override // androidx.compose.ui.focus.p
    @dl.d
    public yh.l<b, FocusRequester> S() {
        return this.f13533j;
    }

    @Override // androidx.compose.ui.focus.p
    public void T(@dl.d FocusRequester focusRequester) {
        f0.p(focusRequester, "<set-?>");
        this.end = focusRequester;
    }

    @Override // androidx.compose.ui.focus.p
    public void U(@dl.d FocusRequester focusRequester) {
        f0.p(focusRequester, "<set-?>");
        this.left = focusRequester;
    }

    @Override // androidx.compose.ui.focus.p
    public void V(@dl.d FocusRequester focusRequester) {
        f0.p(focusRequester, "<set-?>");
        this.right = focusRequester;
    }

    @Override // androidx.compose.ui.focus.p
    /* JADX INFO: renamed from: W, reason: from getter */
    public boolean getCanFocus() {
        return this.canFocus;
    }

    @Override // androidx.compose.ui.focus.p
    public void X(@dl.d FocusRequester focusRequester) {
        f0.p(focusRequester, "<set-?>");
        this.next = focusRequester;
    }

    @Override // androidx.compose.ui.focus.p
    @dl.d
    public FocusRequester getNext() {
        return this.next;
    }
}
