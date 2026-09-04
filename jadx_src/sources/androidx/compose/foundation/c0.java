package androidx.compose.foundation;

import android.os.Build;
import androidx.compose.runtime.j2;
import com.max.hbuikit.bean.param.UiKitSpanObj;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import com.umeng.message.common.UPushNotificationChannel;
import kotlin.Metadata;

/* JADX INFO: compiled from: Magnifier.kt */
/* JADX INFO: loaded from: classes.dex */
@t
@j2
@Metadata(bv = {}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0007\u0018\u0000 \u00112\u00020\u0001:\u0001\tB<\b\u0000\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u0013\u001a\u00020\u000e\u0012\u0006\u0010\u0019\u001a\u00020\u0014\u0012\u0006\u0010\u001b\u001a\u00020\u0014\u0012\u0006\u0010\u001c\u001a\u00020\u0003\u0012\u0006\u0010\u001e\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0004\b!\u0010\"B>\b\u0017\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0004\b!\u0010#J\u0013\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016R\u001a\u0010\r\u001a\u00020\u00038\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR#\u0010\u0013\u001a\u00020\u000e8\u0000X\u0080\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R#\u0010\u0019\u001a\u00020\u00148\u0000X\u0080\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R#\u0010\u001b\u001a\u00020\u00148\u0000X\u0080\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018R\u001a\u0010\u001c\u001a\u00020\u00038\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001a\u0010\n\u001a\u0004\b\u0015\u0010\fR\u001a\u0010\u001e\u001a\u00020\u00038\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001d\u0010\n\u001a\u0004\b\u001d\u0010\fR\u0011\u0010 \u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u001f\u0010\f\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006$"}, d2 = {"Landroidx/compose/foundation/c0;", "", "other", "", "equals", "", "hashCode", "", "toString", ak.av, "Z", RXScreenCaptureService.KEY_HEIGHT, "()Z", "useTextDefault", "Ls1/l;", "b", "J", "g", "()J", UiKitSpanObj.TYPE_SIZE, "Ls1/h;", ak.aF, "F", "d", "()F", "cornerRadius", "e", "elevation", "clippingEnabled", "f", "fishEyeEnabled", "i", "isSupported", "<init>", "(ZJFFZZLkotlin/jvm/internal/u;)V", "(JFFZZLkotlin/jvm/internal/u;)V", "foundation_release"}, k = 1, mv = {1, 7, 1})
public final class c0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @dl.d
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @dl.d
    private static final c0 f5085h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @dl.d
    private static final c0 f5086i;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final boolean useTextDefault;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final long size;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final float cornerRadius;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final float elevation;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final boolean clippingEnabled;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final boolean fishEyeEnabled;

    /* JADX INFO: renamed from: androidx.compose.foundation.c0$a, reason: from kotlin metadata */
    /* JADX INFO: compiled from: Magnifier.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0012\u0010\u000eJ!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\bR \u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010\n\u0012\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR \u0010\u000f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010\n\u0012\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u0010\u0010\f¨\u0006\u0013"}, d2 = {"Landroidx/compose/foundation/c0$a;", "", "Landroidx/compose/foundation/c0;", "style", "", "sdkVersion", "", "e", "(Landroidx/compose/foundation/c0;I)Z", UPushNotificationChannel.DEFAULT_NOTIFICATION_CHANNEL_NAME, "Landroidx/compose/foundation/c0;", ak.av, "()Landroidx/compose/foundation/c0;", "getDefault$annotations", "()V", "TextDefault", ak.aF, "getTextDefault$annotations", "<init>", "foundation_release"}, k = 1, mv = {1, 7, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.u uVar) {
            this();
        }

        @t
        public static /* synthetic */ void b() {
        }

        @t
        public static /* synthetic */ void d() {
        }

        public static /* synthetic */ boolean f(Companion companion, c0 c0Var, int i10, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                i10 = Build.VERSION.SDK_INT;
            }
            return companion.e(c0Var, i10);
        }

        @dl.d
        public final c0 a() {
            return c0.f5085h;
        }

        @dl.d
        public final c0 c() {
            return c0.f5086i;
        }

        public final boolean e(@dl.d c0 style, int sdkVersion) {
            kotlin.jvm.internal.f0.p(style, "style");
            return MagnifierKt.b(sdkVersion) && !style.getFishEyeEnabled() && (style.getUseTextDefault() || kotlin.jvm.internal.f0.g(style, a()) || sdkVersion >= 29);
        }
    }

    static {
        c0 c0Var = new c0(0L, 0.0f, 0.0f, false, false, 31, (kotlin.jvm.internal.u) null);
        f5085h = c0Var;
        f5086i = new c0(true, c0Var.size, c0Var.cornerRadius, c0Var.elevation, c0Var.clippingEnabled, c0Var.fishEyeEnabled, (kotlin.jvm.internal.u) null);
    }

    private c0(long j10, float f10, float f11, boolean z10, boolean z11) {
        this(false, j10, f10, f11, z10, z11, (kotlin.jvm.internal.u) null);
    }

    public /* synthetic */ c0(long j10, float f10, float f11, boolean z10, boolean z11, int i10, kotlin.jvm.internal.u uVar) {
        this((i10 & 1) != 0 ? s1.l.f139233b.a() : j10, (i10 & 2) != 0 ? s1.h.f139219c.e() : f10, (i10 & 4) != 0 ? s1.h.f139219c.e() : f11, (i10 & 8) != 0 ? true : z10, (i10 & 16) != 0 ? false : z11, (kotlin.jvm.internal.u) null);
    }

    @t
    public /* synthetic */ c0(long j10, float f10, float f11, boolean z10, boolean z11, kotlin.jvm.internal.u uVar) {
        this(j10, f10, f11, z10, z11);
    }

    private c0(boolean z10, long j10, float f10, float f11, boolean z11, boolean z12) {
        this.useTextDefault = z10;
        this.size = j10;
        this.cornerRadius = f10;
        this.elevation = f11;
        this.clippingEnabled = z11;
        this.fishEyeEnabled = z12;
    }

    public /* synthetic */ c0(boolean z10, long j10, float f10, float f11, boolean z11, boolean z12, kotlin.jvm.internal.u uVar) {
        this(z10, j10, f10, f11, z11, z12);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getClippingEnabled() {
        return this.clippingEnabled;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final float getCornerRadius() {
        return this.cornerRadius;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final float getElevation() {
        return this.elevation;
    }

    public boolean equals(@dl.e Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) other;
        return this.useTextDefault == c0Var.useTextDefault && s1.l.l(this.size, c0Var.size) && s1.h.l(this.cornerRadius, c0Var.cornerRadius) && s1.h.l(this.elevation, c0Var.elevation) && this.clippingEnabled == c0Var.clippingEnabled && this.fishEyeEnabled == c0Var.fishEyeEnabled;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final boolean getFishEyeEnabled() {
        return this.fishEyeEnabled;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final long getSize() {
        return this.size;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final boolean getUseTextDefault() {
        return this.useTextDefault;
    }

    public int hashCode() {
        return (((((((((b0.a(this.useTextDefault) * 31) + s1.l.r(this.size)) * 31) + s1.h.n(this.cornerRadius)) * 31) + s1.h.n(this.elevation)) * 31) + b0.a(this.clippingEnabled)) * 31) + b0.a(this.fishEyeEnabled);
    }

    public final boolean i() {
        return Companion.f(INSTANCE, this, 0, 2, null);
    }

    @dl.d
    public String toString() {
        if (this.useTextDefault) {
            return "MagnifierStyle.TextDefault";
        }
        return "MagnifierStyle(size=" + ((Object) s1.l.w(this.size)) + ", cornerRadius=" + ((Object) s1.h.s(this.cornerRadius)) + ", elevation=" + ((Object) s1.h.s(this.elevation)) + ", clippingEnabled=" + this.clippingEnabled + ", fishEyeEnabled=" + this.fishEyeEnabled + ')';
    }
}
