package androidx.compose.ui.text.style;

import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.a0;
import androidx.compose.ui.graphics.c2;
import androidx.compose.ui.graphics.l0;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: compiled from: TextForegroundStyle.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\b`\u0018\u0000 \u00072\u00020\u0001:\u0002\u0007\u0005J\u0010\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0016J\u0016\u0010\u0005\u001a\u00020\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004H\u0016R\u001d\u0010\t\u001a\u00020\u00068&X¦\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\r\u001a\u0004\u0018\u00010\n8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0011\u001a\u00020\u000e8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010ø\u0001\u0003\u0082\u0002\u0015\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!\n\u0004\b!0\u0001¨\u0006\u0012À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/text/style/l;", "", "other", ak.aF, "Lkotlin/Function0;", "b", "Landroidx/compose/ui/graphics/l0;", ak.av, "()J", "color", "Landroidx/compose/ui/graphics/a0;", "e", "()Landroidx/compose/ui/graphics/a0;", "brush", "", "d", "()F", "alpha", "ui-text_release"}, k = 1, mv = {1, 7, 1})
public interface l {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.d
    public static final Companion INSTANCE = Companion.f16958a;

    /* JADX INFO: renamed from: androidx.compose.ui.text.style.l$a, reason: from kotlin metadata */
    /* JADX INFO: compiled from: TextForegroundStyle.kt */
    @Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u000b\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\t\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u000e"}, d2 = {"Landroidx/compose/ui/text/style/l$a;", "", "Landroidx/compose/ui/graphics/l0;", "color", "Landroidx/compose/ui/text/style/l;", "b", "(J)Landroidx/compose/ui/text/style/l;", "Landroidx/compose/ui/graphics/a0;", "brush", "", "alpha", ak.av, "<init>", "()V", "ui-text_release"}, k = 1, mv = {1, 7, 1})
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f16958a = new Companion();

        private Companion() {
        }

        @dl.d
        public final l a(@dl.e a0 brush, float alpha) {
            if (brush == null) {
                return b.f16959b;
            }
            if (brush instanceof SolidColor) {
                return b(k.c(((SolidColor) brush).getValue(), alpha));
            }
            if (brush instanceof c2) {
                return new BrushStyle((c2) brush, alpha);
            }
            throw new NoWhenBranchMatchedException();
        }

        @dl.d
        public final l b(long color) {
            return (color > l0.INSTANCE.u() ? 1 : (color == l0.INSTANCE.u() ? 0 : -1)) != 0 ? new ColorStyle(color, null) : b.f16959b;
        }
    }

    /* JADX INFO: compiled from: TextForegroundStyle.kt */
    @androidx.compose.runtime.internal.o(parameters = 0)
    @Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u001d\u0010\u0005\u001a\u00020\u00028VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0016\u0010\t\u001a\u0004\u0018\u00010\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\r\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0010"}, d2 = {"Landroidx/compose/ui/text/style/l$b;", "Landroidx/compose/ui/text/style/l;", "Landroidx/compose/ui/graphics/l0;", ak.av, "()J", "color", "Landroidx/compose/ui/graphics/a0;", "e", "()Landroidx/compose/ui/graphics/a0;", "brush", "", "d", "()F", "alpha", "<init>", "()V", "ui-text_release"}, k = 1, mv = {1, 7, 1})
    public static final class b implements l {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @dl.d
        public static final b f16959b = new b();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f16960c = 0;

        private b() {
        }

        @Override // androidx.compose.ui.text.style.l
        /* JADX INFO: renamed from: a */
        public long getValue() {
            return l0.INSTANCE.u();
        }

        @Override // androidx.compose.ui.text.style.l
        public /* synthetic */ l b(yh.a aVar) {
            return TextForegroundStyle$CC.b(this, aVar);
        }

        @Override // androidx.compose.ui.text.style.l
        public /* synthetic */ l c(l lVar) {
            return TextForegroundStyle$CC.a(this, lVar);
        }

        @Override // androidx.compose.ui.text.style.l
        /* JADX INFO: renamed from: d */
        public float getAlpha() {
            return Float.NaN;
        }

        @Override // androidx.compose.ui.text.style.l
        @dl.e
        public a0 e() {
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    long getValue();

    @dl.d
    l b(@dl.d yh.a<? extends l> aVar);

    @dl.d
    l c(@dl.d l other);

    /* JADX INFO: renamed from: d */
    float getAlpha();

    @dl.e
    a0 e();
}
