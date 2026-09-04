package androidx.compose.foundation.text;

import androidx.compose.runtime.a1;
import androidx.compose.runtime.e2;
import androidx.compose.ui.graphics.l0;
import androidx.compose.ui.text.TextLayoutResult;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: CoreText.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b<\u0010=R\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u0017\u0010\u000f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR$\u0010\u0017\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R$\u0010\u001e\u001a\u0004\u0018\u00010\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u000b\u0010\u001b\"\u0004\b\u001c\u0010\u001dR.\u0010&\u001a\u0004\u0018\u00010\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u001f8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R+\u0010*\u001a\u00020'8\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b\r\u0010\f\u001a\u0004\b\u0019\u0010\u000e\"\u0004\b(\u0010)R+\u0010.\u001a\u00020+8\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b,\u0010\f\u001a\u0004\b,\u0010\u000e\"\u0004\b-\u0010)R+\u00105\u001a\u00020/2\u0006\u00100\u001a\u00020/8F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0005\u00101\u001a\u0004\b\u0003\u00102\"\u0004\b3\u00104R.\u00107\u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020/068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b7\u00108\u001a\u0004\b\u0011\u00109\"\u0004\b:\u0010;\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006>"}, d2 = {"Landroidx/compose/foundation/text/TextState;", "", "Landroidx/compose/foundation/text/p;", ak.av, "Landroidx/compose/foundation/text/p;", "i", "()Landroidx/compose/foundation/text/p;", "q", "(Landroidx/compose/foundation/text/p;)V", "textDelegate", "", "b", "J", "g", "()J", "selectableId", "Landroidx/compose/foundation/text/selection/i;", "d", "Landroidx/compose/foundation/text/selection/i;", "f", "()Landroidx/compose/foundation/text/selection/i;", "o", "(Landroidx/compose/foundation/text/selection/i;)V", "selectable", "Landroidx/compose/ui/layout/q;", "e", "Landroidx/compose/ui/layout/q;", "()Landroidx/compose/ui/layout/q;", "k", "(Landroidx/compose/ui/layout/q;)V", "layoutCoordinates", "Landroidx/compose/ui/text/i0;", "value", "Landroidx/compose/ui/text/i0;", ak.aF, "()Landroidx/compose/ui/text/i0;", "l", "(Landroidx/compose/ui/text/i0;)V", "layoutResult", "Lb1/f;", "n", "(J)V", "previousGlobalPosition", "Landroidx/compose/ui/graphics/l0;", RXScreenCaptureService.KEY_HEIGHT, "p", "selectionBackgroundColor", "Lkotlin/b2;", "<set-?>", "Landroidx/compose/runtime/a1;", "()Lkotlin/b2;", "j", "(Lkotlin/b2;)V", "drawScopeInvalidation", "Lkotlin/Function1;", "onTextLayout", "Lyh/l;", "()Lyh/l;", "m", "(Lyh/l;)V", "<init>", "(Landroidx/compose/foundation/text/p;J)V", "foundation_release"}, k = 1, mv = {1, 7, 1})
public final class TextState {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private p textDelegate;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final long selectableId;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private yh.l<? super TextLayoutResult, b2> f8035c;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private androidx.compose.foundation.text.selection.i selectable;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private androidx.compose.ui.layout.q layoutCoordinates;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private TextLayoutResult layoutResult;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private long previousGlobalPosition;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private long selectionBackgroundColor;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final a1 drawScopeInvalidation;

    public TextState(@dl.d p textDelegate, long j10) {
        f0.p(textDelegate, "textDelegate");
        this.textDelegate = textDelegate;
        this.selectableId = j10;
        this.f8035c = new yh.l<TextLayoutResult, b2>() { // from class: androidx.compose.foundation.text.TextState$onTextLayout$1
            public final void a(@dl.d TextLayoutResult it) {
                f0.p(it, "it");
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(TextLayoutResult textLayoutResult) {
                a(textLayoutResult);
                return b2.f124493a;
            }
        };
        this.previousGlobalPosition = b1.f.f30364b.e();
        this.selectionBackgroundColor = l0.INSTANCE.u();
        this.drawScopeInvalidation = e2.j(b2.f124493a, e2.l());
    }

    private final void j(b2 b2Var) {
        this.drawScopeInvalidation.setValue(b2Var);
    }

    @dl.d
    public final b2 a() {
        this.drawScopeInvalidation.getValue();
        return b2.f124493a;
    }

    @dl.e
    /* JADX INFO: renamed from: b, reason: from getter */
    public final androidx.compose.ui.layout.q getLayoutCoordinates() {
        return this.layoutCoordinates;
    }

    @dl.e
    /* JADX INFO: renamed from: c, reason: from getter */
    public final TextLayoutResult getLayoutResult() {
        return this.layoutResult;
    }

    @dl.d
    public final yh.l<TextLayoutResult, b2> d() {
        return this.f8035c;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final long getPreviousGlobalPosition() {
        return this.previousGlobalPosition;
    }

    @dl.e
    /* JADX INFO: renamed from: f, reason: from getter */
    public final androidx.compose.foundation.text.selection.i getSelectable() {
        return this.selectable;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final long getSelectableId() {
        return this.selectableId;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final long getSelectionBackgroundColor() {
        return this.selectionBackgroundColor;
    }

    @dl.d
    /* JADX INFO: renamed from: i, reason: from getter */
    public final p getTextDelegate() {
        return this.textDelegate;
    }

    public final void k(@dl.e androidx.compose.ui.layout.q qVar) {
        this.layoutCoordinates = qVar;
    }

    public final void l(@dl.e TextLayoutResult textLayoutResult) {
        j(b2.f124493a);
        this.layoutResult = textLayoutResult;
    }

    public final void m(@dl.d yh.l<? super TextLayoutResult, b2> lVar) {
        f0.p(lVar, "<set-?>");
        this.f8035c = lVar;
    }

    public final void n(long j10) {
        this.previousGlobalPosition = j10;
    }

    public final void o(@dl.e androidx.compose.foundation.text.selection.i iVar) {
        this.selectable = iVar;
    }

    public final void p(long j10) {
        this.selectionBackgroundColor = j10;
    }

    public final void q(@dl.d p pVar) {
        f0.p(pVar, "<set-?>");
        this.textDelegate = pVar;
    }
}
