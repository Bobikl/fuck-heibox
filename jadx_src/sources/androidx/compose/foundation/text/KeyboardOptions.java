package androidx.compose.foundation.text;

import androidx.compose.runtime.m0;
import androidx.compose.ui.text.input.ImeOptions;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import com.umeng.message.common.UPushNotificationChannel;
import kotlin.Metadata;

/* JADX INFO: renamed from: androidx.compose.foundation.text.k, reason: from toString */
/* JADX INFO: compiled from: KeyboardOptions.kt */
/* JADX INFO: loaded from: classes.dex */
@m0
@Metadata(bv = {}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0007\u0018\u0000 \u00182\u00020\u0001:\u0001\u0016B2\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\fø\u0001\u0001¢\u0006\u0004\b \u0010!J\u0019\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006J;\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\fø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u0011\u001a\u00020\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0013\u001a\u00020\u0012H\u0016J\b\u0010\u0015\u001a\u00020\u0014H\u0016R \u0010\b\u001a\u00020\u00078\u0006ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR \u0010\u000b\u001a\u00020\n8\u0006ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u0017\u001a\u0004\b\u001e\u0010\u0019R \u0010\r\u001a\u00020\f8\u0006ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u0017\u001a\u0004\b\u001f\u0010\u0019\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006\""}, d2 = {"Landroidx/compose/foundation/text/k;", "", "", "singleLine", "Landroidx/compose/ui/text/input/p;", RXScreenCaptureService.KEY_HEIGHT, "(Z)Landroidx/compose/ui/text/input/p;", "Landroidx/compose/ui/text/input/u;", "capitalization", "autoCorrect", "Landroidx/compose/ui/text/input/v;", "keyboardType", "Landroidx/compose/ui/text/input/o;", "imeAction", "b", "(IZII)Landroidx/compose/foundation/text/k;", "other", "equals", "", "hashCode", "", "toString", ak.av, "I", "e", "()I", "Z", "d", "()Z", ak.aF, "g", "f", "<init>", "(IZIILkotlin/jvm/internal/u;)V", "foundation_release"}, k = 1, mv = {1, 7, 1})
public final class KeyboardOptions {

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @dl.d
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.d
    private static final KeyboardOptions f8082f = new KeyboardOptions(0, false, 0, 0, 15, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final int capitalization;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean autoCorrect;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final int keyboardType;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final int imeAction;

    /* JADX INFO: renamed from: androidx.compose.foundation.text.k$a, reason: from kotlin metadata */
    /* JADX INFO: compiled from: KeyboardOptions.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Landroidx/compose/foundation/text/k$a;", "", "Landroidx/compose/foundation/text/k;", UPushNotificationChannel.DEFAULT_NOTIFICATION_CHANNEL_NAME, "Landroidx/compose/foundation/text/k;", ak.av, "()Landroidx/compose/foundation/text/k;", "<init>", "()V", "foundation_release"}, k = 1, mv = {1, 7, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.u uVar) {
            this();
        }

        @dl.d
        public final KeyboardOptions a() {
            return KeyboardOptions.f8082f;
        }
    }

    private KeyboardOptions(int i10, boolean z10, int i11, int i12) {
        this.capitalization = i10;
        this.autoCorrect = z10;
        this.keyboardType = i11;
        this.imeAction = i12;
    }

    public /* synthetic */ KeyboardOptions(int i10, boolean z10, int i11, int i12, int i13, kotlin.jvm.internal.u uVar) {
        this((i13 & 1) != 0 ? androidx.compose.ui.text.input.u.INSTANCE.b() : i10, (i13 & 2) != 0 ? true : z10, (i13 & 4) != 0 ? androidx.compose.ui.text.input.v.INSTANCE.h() : i11, (i13 & 8) != 0 ? androidx.compose.ui.text.input.o.INSTANCE.a() : i12, null);
    }

    public /* synthetic */ KeyboardOptions(int i10, boolean z10, int i11, int i12, kotlin.jvm.internal.u uVar) {
        this(i10, z10, i11, i12);
    }

    public static /* synthetic */ KeyboardOptions c(KeyboardOptions keyboardOptions, int i10, boolean z10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i10 = keyboardOptions.capitalization;
        }
        if ((i13 & 2) != 0) {
            z10 = keyboardOptions.autoCorrect;
        }
        if ((i13 & 4) != 0) {
            i11 = keyboardOptions.keyboardType;
        }
        if ((i13 & 8) != 0) {
            i12 = keyboardOptions.imeAction;
        }
        return keyboardOptions.b(i10, z10, i11, i12);
    }

    public static /* synthetic */ ImeOptions i(KeyboardOptions keyboardOptions, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = ImeOptions.INSTANCE.a().getSingleLine();
        }
        return keyboardOptions.h(z10);
    }

    @dl.d
    public final KeyboardOptions b(int capitalization, boolean autoCorrect, int keyboardType, int imeAction) {
        return new KeyboardOptions(capitalization, autoCorrect, keyboardType, imeAction, null);
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
        if (!(other instanceof KeyboardOptions)) {
            return false;
        }
        KeyboardOptions keyboardOptions = (KeyboardOptions) other;
        return androidx.compose.ui.text.input.u.h(this.capitalization, keyboardOptions.capitalization) && this.autoCorrect == keyboardOptions.autoCorrect && androidx.compose.ui.text.input.v.m(this.keyboardType, keyboardOptions.keyboardType) && androidx.compose.ui.text.input.o.l(this.imeAction, keyboardOptions.imeAction);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final int getImeAction() {
        return this.imeAction;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final int getKeyboardType() {
        return this.keyboardType;
    }

    @dl.d
    public final ImeOptions h(boolean singleLine) {
        return new ImeOptions(singleLine, this.capitalization, this.autoCorrect, this.keyboardType, this.imeAction, null);
    }

    public int hashCode() {
        return (((((androidx.compose.ui.text.input.u.i(this.capitalization) * 31) + androidx.compose.foundation.b0.a(this.autoCorrect)) * 31) + androidx.compose.ui.text.input.v.n(this.keyboardType)) * 31) + androidx.compose.ui.text.input.o.m(this.imeAction);
    }

    @dl.d
    public String toString() {
        return "KeyboardOptions(capitalization=" + ((Object) androidx.compose.ui.text.input.u.j(this.capitalization)) + ", autoCorrect=" + this.autoCorrect + ", keyboardType=" + ((Object) androidx.compose.ui.text.input.v.o(this.keyboardType)) + ", imeAction=" + ((Object) androidx.compose.ui.text.input.o.n(this.imeAction)) + ')';
    }
}
