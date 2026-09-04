package androidx.compose.ui.text.input;

import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import com.umeng.message.common.UPushNotificationChannel;
import kotlin.Metadata;

/* JADX INFO: renamed from: androidx.compose.ui.text.input.p, reason: from toString */
/* JADX INFO: compiled from: ImeOptions.kt */
/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.m0
@Metadata(bv = {}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0007\u0018\u0000 \u001d2\u00020\u0001:\u0001\u0013B<\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\tø\u0001\u0001¢\u0006\u0004\b\u001e\u0010\u001fJE\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\tø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0010\u001a\u00020\u000fH\u0016J\b\u0010\u0012\u001a\u00020\u0011H\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R \u0010\u0005\u001a\u00020\u00048\u0006ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\n\u0004\b\u000b\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0014\u001a\u0004\b\u001b\u0010\u0016R \u0010\b\u001a\u00020\u00078\u0006ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u0017\u001a\u0004\b\u001c\u0010\u0019R \u0010\n\u001a\u00020\t8\u0006ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0017\u001a\u0004\b\u001d\u0010\u0019\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006 "}, d2 = {"Landroidx/compose/ui/text/input/p;", "", "", "singleLine", "Landroidx/compose/ui/text/input/u;", "capitalization", "autoCorrect", "Landroidx/compose/ui/text/input/v;", "keyboardType", "Landroidx/compose/ui/text/input/o;", "imeAction", "b", "(ZIZII)Landroidx/compose/ui/text/input/p;", "other", "equals", "", "hashCode", "", "toString", ak.av, "Z", RXScreenCaptureService.KEY_HEIGHT, "()Z", "I", "e", "()I", ak.aF, "d", "g", "f", "<init>", "(ZIZIILkotlin/jvm/internal/u;)V", "ui-text_release"}, k = 1, mv = {1, 7, 1})
public final class ImeOptions {

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @dl.d
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @dl.d
    private static final ImeOptions f16765g = new ImeOptions(false, 0, false, 0, 0, 31, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean singleLine;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final int capitalization;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean autoCorrect;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final int keyboardType;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final int imeAction;

    /* JADX INFO: renamed from: androidx.compose.ui.text.input.p$a, reason: from kotlin metadata */
    /* JADX INFO: compiled from: ImeOptions.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Landroidx/compose/ui/text/input/p$a;", "", "Landroidx/compose/ui/text/input/p;", UPushNotificationChannel.DEFAULT_NOTIFICATION_CHANNEL_NAME, "Landroidx/compose/ui/text/input/p;", ak.av, "()Landroidx/compose/ui/text/input/p;", "<init>", "()V", "ui-text_release"}, k = 1, mv = {1, 7, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.u uVar) {
            this();
        }

        @dl.d
        public final ImeOptions a() {
            return ImeOptions.f16765g;
        }
    }

    private ImeOptions(boolean z10, int i10, boolean z11, int i11, int i12) {
        this.singleLine = z10;
        this.capitalization = i10;
        this.autoCorrect = z11;
        this.keyboardType = i11;
        this.imeAction = i12;
    }

    public /* synthetic */ ImeOptions(boolean z10, int i10, boolean z11, int i11, int i12, int i13, kotlin.jvm.internal.u uVar) {
        this((i13 & 1) != 0 ? false : z10, (i13 & 2) != 0 ? u.INSTANCE.b() : i10, (i13 & 4) != 0 ? true : z11, (i13 & 8) != 0 ? v.INSTANCE.h() : i11, (i13 & 16) != 0 ? o.INSTANCE.a() : i12, null);
    }

    public /* synthetic */ ImeOptions(boolean z10, int i10, boolean z11, int i11, int i12, kotlin.jvm.internal.u uVar) {
        this(z10, i10, z11, i11, i12);
    }

    public static /* synthetic */ ImeOptions c(ImeOptions imeOptions, boolean z10, int i10, boolean z11, int i11, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            z10 = imeOptions.singleLine;
        }
        if ((i13 & 2) != 0) {
            i10 = imeOptions.capitalization;
        }
        int i14 = i10;
        if ((i13 & 4) != 0) {
            z11 = imeOptions.autoCorrect;
        }
        boolean z12 = z11;
        if ((i13 & 8) != 0) {
            i11 = imeOptions.keyboardType;
        }
        int i15 = i11;
        if ((i13 & 16) != 0) {
            i12 = imeOptions.imeAction;
        }
        return imeOptions.b(z10, i14, z12, i15, i12);
    }

    @dl.d
    public final ImeOptions b(boolean singleLine, int capitalization, boolean autoCorrect, int keyboardType, int imeAction) {
        return new ImeOptions(singleLine, capitalization, autoCorrect, keyboardType, imeAction, null);
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getAutoCorrect() {
        return this.autoCorrect;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final int getCapitalization() {
        return this.capitalization;
    }

    public boolean equals(@dl.e Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ImeOptions)) {
            return false;
        }
        ImeOptions imeOptions = (ImeOptions) other;
        return this.singleLine == imeOptions.singleLine && u.h(this.capitalization, imeOptions.capitalization) && this.autoCorrect == imeOptions.autoCorrect && v.m(this.keyboardType, imeOptions.keyboardType) && o.l(this.imeAction, imeOptions.imeAction);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final int getImeAction() {
        return this.imeAction;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final int getKeyboardType() {
        return this.keyboardType;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final boolean getSingleLine() {
        return this.singleLine;
    }

    public int hashCode() {
        return (((((((androidx.compose.foundation.b0.a(this.singleLine) * 31) + u.i(this.capitalization)) * 31) + androidx.compose.foundation.b0.a(this.autoCorrect)) * 31) + v.n(this.keyboardType)) * 31) + o.m(this.imeAction);
    }

    @dl.d
    public String toString() {
        return "ImeOptions(singleLine=" + this.singleLine + ", capitalization=" + ((Object) u.j(this.capitalization)) + ", autoCorrect=" + this.autoCorrect + ", keyboardType=" + ((Object) v.o(this.keyboardType)) + ", imeAction=" + ((Object) o.n(this.imeAction)) + ')';
    }
}
