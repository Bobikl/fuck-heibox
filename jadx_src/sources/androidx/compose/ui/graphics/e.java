package androidx.compose.ui.graphics;

import android.graphics.Bitmap;
import android.os.Build;
import androidx.compose.ui.graphics.colorspace.ColorSpaces;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: AndroidImageBitmap.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u000e¢\u0006\u0004\b!\u0010\"J@\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004H\u0016J\b\u0010\r\u001a\u00020\u000bH\u0016R\u001a\u0010\u0012\u001a\u00020\u000e8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\r\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0007\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\b\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0014R\u001d\u0010\u0018\u001a\u00020\u00168VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0014R\u0014\u0010\u001c\u001a\u00020\u00198VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010 \u001a\u00020\u001d8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006#"}, d2 = {"Landroidx/compose/ui/graphics/e;", "Landroidx/compose/ui/graphics/y0;", "", "buffer", "", "startX", "startY", "width", "height", "bufferOffset", "stride", "Lkotlin/b2;", ak.av, "b", "Landroid/graphics/Bitmap;", "Landroid/graphics/Bitmap;", "e", "()Landroid/graphics/Bitmap;", "bitmap", "getWidth", "()I", "getHeight", "Landroidx/compose/ui/graphics/z0;", "d", "config", "Landroidx/compose/ui/graphics/colorspace/c;", "getColorSpace", "()Landroidx/compose/ui/graphics/colorspace/c;", "colorSpace", "", ak.aF, "()Z", "hasAlpha", "<init>", "(Landroid/graphics/Bitmap;)V", "ui-graphics_release"}, k = 1, mv = {1, 7, 1})
public final class e implements y0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final Bitmap bitmap;

    public e(@dl.d Bitmap bitmap) {
        kotlin.jvm.internal.f0.p(bitmap, "bitmap");
        this.bitmap = bitmap;
    }

    @Override // androidx.compose.ui.graphics.y0
    public void a(@dl.d int[] buffer, int i10, int i11, int i12, int i13, int i14, int i15) {
        boolean z10;
        kotlin.jvm.internal.f0.p(buffer, "buffer");
        Bitmap bitmapB = f.b(this);
        if (Build.VERSION.SDK_INT < 26 || bitmapB.getConfig() != Bitmap.Config.HARDWARE) {
            z10 = false;
        } else {
            bitmapB = bitmapB.copy(Bitmap.Config.ARGB_8888, false);
            z10 = true;
        }
        bitmapB.getPixels(buffer, i14, i15, i10, i11, i12, i13);
        if (z10) {
            bitmapB.recycle();
        }
    }

    @Override // androidx.compose.ui.graphics.y0
    public void b() {
        this.bitmap.prepareToDraw();
    }

    @Override // androidx.compose.ui.graphics.y0
    public boolean c() {
        return this.bitmap.hasAlpha();
    }

    @Override // androidx.compose.ui.graphics.y0
    public int d() {
        Bitmap.Config config = this.bitmap.getConfig();
        kotlin.jvm.internal.f0.o(config, "bitmap.config");
        return f.e(config);
    }

    @dl.d
    /* JADX INFO: renamed from: e, reason: from getter */
    public final Bitmap getBitmap() {
        return this.bitmap;
    }

    @Override // androidx.compose.ui.graphics.y0
    @dl.d
    public androidx.compose.ui.graphics.colorspace.c getColorSpace() {
        if (Build.VERSION.SDK_INT < 26) {
            return ColorSpaces.f13697a.t();
        }
        w wVar = w.f14405a;
        return w.a(this.bitmap);
    }

    @Override // androidx.compose.ui.graphics.y0
    public int getHeight() {
        return this.bitmap.getHeight();
    }

    @Override // androidx.compose.ui.graphics.y0
    public int getWidth() {
        return this.bitmap.getWidth();
    }
}
