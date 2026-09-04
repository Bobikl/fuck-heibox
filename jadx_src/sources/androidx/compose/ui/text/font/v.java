package androidx.compose.ui.text.font;

import androidx.compose.runtime.m2;
import com.umeng.analytics.pro.ak;
import com.umeng.message.common.UPushNotificationChannel;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.b2;

/* JADX INFO: compiled from: FontFamily.kt */
/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.m0
@Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \f2\u00020\u0001:\u0002\r\u0003B\u0011\b\u0004\u0012\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bR\u001d\u0010\t\u001a\u00020\u00028G¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u0012\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0003\u000e\u000f\u0010¨\u0006\u0011"}, d2 = {"Landroidx/compose/ui/text/font/v;", "", "", "b", "Z", "i", "()Z", "getCanLoadSynchronously$annotations", "()V", "canLoadSynchronously", "<init>", "(Z)V", ak.aF, ak.av, "Landroidx/compose/ui/text/font/s;", "Landroidx/compose/ui/text/font/n0;", "Landroidx/compose/ui/text/font/z0;", "ui-text_release"}, k = 1, mv = {1, 7, 1})
public abstract class v {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @dl.d
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private static final z0 f16623d = new l();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    private static final m0 f16624e = new m0(com.google.android.exoplayer2.j.f46445s, "FontFamily.SansSerif");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.d
    private static final m0 f16625f = new m0(com.google.android.exoplayer2.j.f46441r, "FontFamily.Serif");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @dl.d
    private static final m0 f16626g = new m0("monospace", "FontFamily.Monospace");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @dl.d
    private static final m0 f16627h = new m0("cursive", "FontFamily.Cursive");

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final boolean canLoadSynchronously;

    /* JADX INFO: renamed from: androidx.compose.ui.text.font.v$a, reason: from kotlin metadata */
    /* JADX INFO: compiled from: FontFamily.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\f\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\f\u0010\t\u001a\u0004\b\r\u0010\u000bR\u0017\u0010\u000e\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u000e\u0010\t\u001a\u0004\b\u000f\u0010\u000bR\u0017\u0010\u0010\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0010\u0010\t\u001a\u0004\b\u0011\u0010\u000b¨\u0006\u0014"}, d2 = {"Landroidx/compose/ui/text/font/v$a;", "", "Landroidx/compose/ui/text/font/z0;", UPushNotificationChannel.DEFAULT_NOTIFICATION_CHANNEL_NAME, "Landroidx/compose/ui/text/font/z0;", "b", "()Landroidx/compose/ui/text/font/z0;", "Landroidx/compose/ui/text/font/m0;", "SansSerif", "Landroidx/compose/ui/text/font/m0;", "d", "()Landroidx/compose/ui/text/font/m0;", "Serif", "e", "Monospace", ak.aF, "Cursive", ak.av, "<init>", "()V", "ui-text_release"}, k = 1, mv = {1, 7, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.u uVar) {
            this();
        }

        @dl.d
        public final m0 a() {
            return v.f16627h;
        }

        @dl.d
        public final z0 b() {
            return v.f16623d;
        }

        @dl.d
        public final m0 c() {
            return v.f16626g;
        }

        @dl.d
        public final m0 d() {
            return v.f16624e;
        }

        @dl.d
        public final m0 e() {
            return v.f16625f;
        }
    }

    /* JADX INFO: compiled from: FontFamily.kt */
    @Metadata(bv = {}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001J\u001b\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006JE\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00010\r2\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000bH&ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u0082\u0001\u0001\u0010ø\u0001\u0002\u0082\u0002\u0011\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0004\b!0\u0001¨\u0006\u0011À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/text/font/v$b;", "", "Landroidx/compose/ui/text/font/v;", com.google.android.exoplayer2.text.ttml.d.K, "Lkotlin/b2;", ak.av, "(Landroidx/compose/ui/text/font/v;Lkotlin/coroutines/c;)Ljava/lang/Object;", "Landroidx/compose/ui/text/font/k0;", com.google.android.exoplayer2.text.ttml.d.L, "Landroidx/compose/ui/text/font/g0;", com.google.android.exoplayer2.text.ttml.d.I, "Landroidx/compose/ui/text/font/h0;", "fontSynthesis", "Landroidx/compose/runtime/m2;", "b", "(Landroidx/compose/ui/text/font/v;Landroidx/compose/ui/text/font/k0;II)Landroidx/compose/runtime/m2;", "Landroidx/compose/ui/text/font/FontFamilyResolverImpl;", "ui-text_release"}, k = 1, mv = {1, 7, 1})
    public interface b {
        @dl.e
        Object a(@dl.d v vVar, @dl.d kotlin.coroutines.c<? super b2> cVar);

        @dl.d
        m2<Object> b(@dl.e v fontFamily, @dl.d FontWeight fontWeight, int fontStyle, int fontSynthesis);
    }

    private v(boolean z10) {
        this.canLoadSynchronously = z10;
    }

    public /* synthetic */ v(boolean z10, kotlin.jvm.internal.u uVar) {
        this(z10);
    }

    public static /* synthetic */ void j() {
    }

    @kotlin.k(level = DeprecationLevel.ERROR, message = "Unused property that has no meaning. Do not use.")
    /* JADX INFO: renamed from: i, reason: from getter */
    public final boolean getCanLoadSynchronously() {
        return this.canLoadSynchronously;
    }
}
