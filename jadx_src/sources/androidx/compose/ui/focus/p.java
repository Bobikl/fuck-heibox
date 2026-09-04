package androidx.compose.ui.focus;

import com.umeng.socialize.net.dplus.CommonNetImpl;
import kotlin.Metadata;

/* JADX INFO: compiled from: FocusProperties.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\bf\u0018\u00002\u00020\u0001R\u001c\u0010\u0007\u001a\u00020\u00028&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0003\u0010\u0004\"\u0004\b\u0005\u0010\u0006R$\u0010\u000e\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR$\u0010\u0011\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u000f\u0010\u000b\"\u0004\b\u0010\u0010\rR$\u0010\u0014\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0012\u0010\u000b\"\u0004\b\u0013\u0010\rR$\u0010\u0017\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0015\u0010\u000b\"\u0004\b\u0016\u0010\rR$\u0010\u001a\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0018\u0010\u000b\"\u0004\b\u0019\u0010\rR$\u0010\u001d\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u001b\u0010\u000b\"\u0004\b\u001c\u0010\rR$\u0010 \u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u001e\u0010\u000b\"\u0004\b\u001f\u0010\rR$\u0010#\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b!\u0010\u000b\"\u0004\b\"\u0010\rRE\u0010,\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\b0$2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\b0$8W@WX\u0097\u000eø\u0001\u0000¢\u0006\u0012\u0012\u0004\b*\u0010+\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)RE\u00100\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\b0$2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\b0$8W@WX\u0097\u000eø\u0001\u0000¢\u0006\u0012\u0012\u0004\b/\u0010+\u001a\u0004\b-\u0010'\"\u0004\b.\u0010)ø\u0001\u0001\u0082\u0002\n\n\u0002\b\u0019\n\u0004\b!0\u0001¨\u00061À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/focus/p;", "", "", androidx.exifinterface.media.a.T4, "()Z", "L", "(Z)V", "canFocus", "Landroidx/compose/ui/focus/FocusRequester;", "<anonymous parameter 0>", "getNext", "()Landroidx/compose/ui/focus/FocusRequester;", "X", "(Landroidx/compose/ui/focus/FocusRequester;)V", "next", "P", "Q", "previous", "H", "J", CommonNetImpl.UP, "K", "M", "down", "F", "U", com.google.android.exoplayer2.text.ttml.d.f49793l0, androidx.exifinterface.media.a.S4, androidx.exifinterface.media.a.X4, com.google.android.exoplayer2.text.ttml.d.f49796n0, "D", "O", com.google.android.exoplayer2.text.ttml.d.f49798o0, "G", androidx.exifinterface.media.a.f23244d5, com.google.android.exoplayer2.text.ttml.d.f49800p0, "Lkotlin/Function1;", "Landroidx/compose/ui/focus/b;", androidx.exifinterface.media.a.R4, "()Lyh/l;", "N", "(Lyh/l;)V", "getEnter$annotations", "()V", "enter", "I", "R", "getExit$annotations", com.alipay.sdk.m.x.d.A, "ui_release"}, k = 1, mv = {1, 7, 1})
public interface p {
    @dl.d
    FocusRequester D();

    @dl.d
    FocusRequester E();

    @dl.d
    FocusRequester F();

    @dl.d
    FocusRequester G();

    @dl.d
    FocusRequester H();

    @androidx.compose.ui.g
    @dl.d
    yh.l<b, FocusRequester> I();

    void J(@dl.d FocusRequester focusRequester);

    @dl.d
    FocusRequester K();

    void L(boolean z10);

    void M(@dl.d FocusRequester focusRequester);

    @androidx.compose.ui.g
    void N(@dl.d yh.l<? super b, FocusRequester> lVar);

    void O(@dl.d FocusRequester focusRequester);

    @dl.d
    FocusRequester P();

    void Q(@dl.d FocusRequester focusRequester);

    @androidx.compose.ui.g
    void R(@dl.d yh.l<? super b, FocusRequester> lVar);

    @androidx.compose.ui.g
    @dl.d
    yh.l<b, FocusRequester> S();

    void T(@dl.d FocusRequester focusRequester);

    void U(@dl.d FocusRequester focusRequester);

    void V(@dl.d FocusRequester focusRequester);

    boolean W();

    void X(@dl.d FocusRequester focusRequester);

    @dl.d
    FocusRequester getNext();
}
