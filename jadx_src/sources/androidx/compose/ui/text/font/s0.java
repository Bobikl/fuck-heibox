package androidx.compose.ui.text.font;

import com.umeng.analytics.pro.ak;
import com.umeng.message.common.UPushNotificationChannel;
import kotlin.Metadata;

/* JADX INFO: compiled from: FontFamilyResolver.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004J\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u001d\u0010\n\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u000e\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000e\u0010\u000bø\u0001\u0002\u0082\u0002\u0011\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0004\b!0\u0001¨\u0006\u000fÀ\u0006\u0001"}, d2 = {"Landroidx/compose/ui/text/font/s0;", "", "Landroidx/compose/ui/text/font/v;", com.google.android.exoplayer2.text.ttml.d.K, ak.av, "Landroidx/compose/ui/text/font/k0;", com.google.android.exoplayer2.text.ttml.d.L, "b", "Landroidx/compose/ui/text/font/g0;", com.google.android.exoplayer2.text.ttml.d.I, ak.aF, "(I)I", "Landroidx/compose/ui/text/font/h0;", "fontSynthesis", "d", "ui-text_release"}, k = 1, mv = {1, 7, 1})
public interface s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.d
    public static final Companion INSTANCE = Companion.f16616a;

    /* JADX INFO: renamed from: androidx.compose.ui.text.font.s0$a, reason: from kotlin metadata */
    /* JADX INFO: compiled from: FontFamilyResolver.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0007\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Landroidx/compose/ui/text/font/s0$a;", "", "Landroidx/compose/ui/text/font/s0;", "b", "Landroidx/compose/ui/text/font/s0;", ak.av, "()Landroidx/compose/ui/text/font/s0;", UPushNotificationChannel.DEFAULT_NOTIFICATION_CHANNEL_NAME, "<init>", "()V", "ui-text_release"}, k = 1, mv = {1, 7, 1})
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f16616a = new Companion();

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @dl.d
        private static final s0 Default = new C0104a();

        /* JADX INFO: renamed from: androidx.compose.ui.text.font.s0$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: FontFamilyResolver.kt */
        @Metadata(bv = {}, d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"androidx/compose/ui/text/font/s0$a$a", "Landroidx/compose/ui/text/font/s0;", "ui-text_release"}, k = 1, mv = {1, 7, 1})
        public static final class C0104a implements s0 {
            C0104a() {
            }

            @Override // androidx.compose.ui.text.font.s0
            public /* synthetic */ v a(v vVar) {
                return r0.a(this, vVar);
            }

            @Override // androidx.compose.ui.text.font.s0
            public /* synthetic */ FontWeight b(FontWeight fontWeight) {
                return r0.d(this, fontWeight);
            }

            @Override // androidx.compose.ui.text.font.s0
            public /* synthetic */ int c(int i10) {
                return r0.b(this, i10);
            }

            @Override // androidx.compose.ui.text.font.s0
            public /* synthetic */ int d(int i10) {
                return r0.c(this, i10);
            }
        }

        private Companion() {
        }

        @dl.d
        public final s0 a() {
            return Default;
        }
    }

    @dl.e
    v a(@dl.e v fontFamily);

    @dl.d
    FontWeight b(@dl.d FontWeight fontWeight);

    int c(int fontStyle);

    int d(int fontSynthesis);
}
