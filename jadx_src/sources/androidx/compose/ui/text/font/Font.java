package androidx.compose.ui.text.font;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import kotlin.Metadata;

/* JADX INFO: renamed from: androidx.compose.ui.text.font.b, reason: from toString */
/* JADX INFO: compiled from: AndroidPreloadedFont.kt */
/* JADX INFO: loaded from: classes.dex */
@androidx.annotation.w0(26)
@Metadata(bv = {}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B.\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u001b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0010¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\b\u001a\u00020\u0007H\u0016R\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001b"}, d2 = {"Landroidx/compose/ui/text/font/b;", "Landroidx/compose/ui/text/font/i;", "Landroid/content/Context;", com.umeng.analytics.pro.d.R, "Landroid/graphics/Typeface;", "g", "(Landroid/content/Context;)Landroid/graphics/Typeface;", "", "toString", "Landroid/os/ParcelFileDescriptor;", "k", "Landroid/os/ParcelFileDescriptor;", "l", "()Landroid/os/ParcelFileDescriptor;", "fileDescriptor", "Ljava/lang/String;", RXScreenCaptureService.KEY_HEIGHT, "()Ljava/lang/String;", "cacheKey", "Landroidx/compose/ui/text/font/k0;", "weight", "Landroidx/compose/ui/text/font/g0;", "style", "Landroidx/compose/ui/text/font/j0$e;", "variationSettings", "<init>", "(Landroid/os/ParcelFileDescriptor;Landroidx/compose/ui/text/font/k0;ILandroidx/compose/ui/text/font/j0$e;Lkotlin/jvm/internal/u;)V", "ui-text_release"}, k = 1, mv = {1, 7, 1})
public final class Font extends i {

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
    @dl.d
    private final ParcelFileDescriptor fileDescriptor;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private final String cacheKey;

    private Font(ParcelFileDescriptor parcelFileDescriptor, FontWeight fontWeight, int i10, j0.e eVar) {
        super(fontWeight, i10, eVar, null);
        this.fileDescriptor = parcelFileDescriptor;
        k(g(null));
    }

    public /* synthetic */ Font(ParcelFileDescriptor parcelFileDescriptor, FontWeight fontWeight, int i10, j0.e eVar, int i11, kotlin.jvm.internal.u uVar) {
        this(parcelFileDescriptor, (i11 & 2) != 0 ? FontWeight.INSTANCE.m() : fontWeight, (i11 & 4) != 0 ? g0.INSTANCE.b() : i10, eVar, null);
    }

    public /* synthetic */ Font(ParcelFileDescriptor parcelFileDescriptor, FontWeight fontWeight, int i10, j0.e eVar, kotlin.jvm.internal.u uVar) {
        this(parcelFileDescriptor, fontWeight, i10, eVar);
    }

    @Override // androidx.compose.ui.text.font.i
    @dl.e
    public Typeface g(@dl.e Context context) {
        if (Build.VERSION.SDK_INT >= 26) {
            return b1.f16524a.c(this.fileDescriptor, context, getVariationSettings());
        }
        throw new IllegalArgumentException("Cannot create font from file descriptor for SDK < 26");
    }

    @Override // androidx.compose.ui.text.font.i
    @dl.e
    /* JADX INFO: renamed from: h, reason: from getter */
    public String getCacheKey() {
        return this.cacheKey;
    }

    @dl.d
    /* JADX INFO: renamed from: l, reason: from getter */
    public final ParcelFileDescriptor getFileDescriptor() {
        return this.fileDescriptor;
    }

    @dl.d
    public String toString() {
        return "Font(fileDescriptor=" + this.fileDescriptor + ", weight=" + getWeight() + ", style=" + ((Object) g0.i(getStyle())) + ')';
    }
}
