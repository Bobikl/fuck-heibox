package androidx.compose.ui.graphics;

import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: ImageBitmap.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000 \f2\u00020\u0001:\u0001\fJL\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u0004H&J\b\u0010\r\u001a\u00020\u000bH&R\u0014\u0010\u0007\u001a\u00020\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\b\u001a\u00020\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00158&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u001d\u0010\u001b\u001a\u00020\u00198&X¦\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u000fø\u0001\u0003\u0082\u0002\u0015\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!\n\u0004\b!0\u0001¨\u0006\u001cÀ\u0006\u0003"}, d2 = {"Landroidx/compose/ui/graphics/y0;", "", "", "buffer", "", "startX", "startY", "width", "height", "bufferOffset", "stride", "Lkotlin/b2;", ak.av, "b", "getWidth", "()I", "getHeight", "Landroidx/compose/ui/graphics/colorspace/c;", "getColorSpace", "()Landroidx/compose/ui/graphics/colorspace/c;", "colorSpace", "", ak.aF, "()Z", "hasAlpha", "Landroidx/compose/ui/graphics/z0;", "d", "config", "ui-graphics_release"}, k = 1, mv = {1, 7, 1})
public interface y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.d
    public static final Companion INSTANCE = Companion.f14437a;

    /* JADX INFO: renamed from: androidx.compose.ui.graphics.y0$a, reason: from kotlin metadata */
    /* JADX INFO: compiled from: ImageBitmap.kt */
    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/graphics/y0$a;", "", "<init>", "()V", "ui-graphics_release"}, k = 1, mv = {1, 7, 1})
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f14437a = new Companion();

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: ImageBitmap.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class b {
    }

    void a(@dl.d int[] iArr, int i10, int i11, int i12, int i13, int i14, int i15);

    void b();

    boolean c();

    int d();

    @dl.d
    androidx.compose.ui.graphics.colorspace.c getColorSpace();

    int getHeight();

    int getWidth();
}
