package androidx.compose.ui.text.font;

import android.content.res.AssetManager;
import android.os.ParcelFileDescriptor;
import androidx.compose.runtime.j2;
import com.max.xiaoheihe.okflutter.containers.FlutterActivityLaunchConfigs;
import com.umeng.analytics.pro.ak;
import java.io.File;
import kotlin.DeprecationLevel;
import kotlin.Metadata;

/* JADX INFO: compiled from: AndroidFont.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a9\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\n\u001aC\u0010\r\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\u000bH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\r\u0010\u000e\u001a;\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\u000bH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u0012\u001a;\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\u000bH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0015\u0010\u0016\u001a\b\u0010\u0018\u001a\u00020\u0017H\u0002\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0019"}, d2 = {"Landroid/content/res/AssetManager;", "assetManager", "", FlutterActivityLaunchConfigs.EXTRA_PATH, "Landroidx/compose/ui/text/font/k0;", "weight", "Landroidx/compose/ui/text/font/g0;", "style", "Landroidx/compose/ui/text/font/u;", "g", "(Landroid/content/res/AssetManager;Ljava/lang/String;Landroidx/compose/ui/text/font/k0;I)Landroidx/compose/ui/text/font/u;", "Landroidx/compose/ui/text/font/j0$e;", "variationSettings", "e", "(Ljava/lang/String;Landroid/content/res/AssetManager;Landroidx/compose/ui/text/font/k0;ILandroidx/compose/ui/text/font/j0$e;)Landroidx/compose/ui/text/font/u;", "Ljava/io/File;", "file", "b", "(Ljava/io/File;Landroidx/compose/ui/text/font/k0;ILandroidx/compose/ui/text/font/j0$e;)Landroidx/compose/ui/text/font/u;", "Landroid/os/ParcelFileDescriptor;", "fileDescriptor", ak.av, "(Landroid/os/ParcelFileDescriptor;Landroidx/compose/ui/text/font/k0;ILandroidx/compose/ui/text/font/j0$e;)Landroidx/compose/ui/text/font/u;", "Lkotlin/b2;", "i", "ui-text_release"}, k = 2, mv = {1, 7, 1})
public final class e {
    @j2
    @dl.d
    @androidx.compose.ui.text.g
    @androidx.annotation.w0(26)
    public static final u a(@dl.d ParcelFileDescriptor fileDescriptor, @dl.d FontWeight weight, int i10, @dl.d j0.e variationSettings) {
        kotlin.jvm.internal.f0.p(fileDescriptor, "fileDescriptor");
        kotlin.jvm.internal.f0.p(weight, "weight");
        kotlin.jvm.internal.f0.p(variationSettings, "variationSettings");
        return new Font(fileDescriptor, weight, i10, variationSettings, null);
    }

    @j2
    @dl.d
    @androidx.compose.ui.text.g
    public static final u b(@dl.d File file, @dl.d FontWeight weight, int i10, @dl.d j0.e variationSettings) {
        kotlin.jvm.internal.f0.p(file, "file");
        kotlin.jvm.internal.f0.p(weight, "weight");
        kotlin.jvm.internal.f0.p(variationSettings, "variationSettings");
        return new Font(file, weight, i10, variationSettings, null);
    }

    public static /* synthetic */ u c(ParcelFileDescriptor parcelFileDescriptor, FontWeight fontWeight, int i10, j0.e eVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            fontWeight = FontWeight.INSTANCE.m();
        }
        if ((i11 & 4) != 0) {
            i10 = g0.INSTANCE.b();
        }
        if ((i11 & 8) != 0) {
            eVar = j0.f16565a.b(fontWeight, i10, new j0.a[0]);
        }
        return a(parcelFileDescriptor, fontWeight, i10, eVar);
    }

    public static /* synthetic */ u d(File file, FontWeight fontWeight, int i10, j0.e eVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            fontWeight = FontWeight.INSTANCE.m();
        }
        if ((i11 & 4) != 0) {
            i10 = g0.INSTANCE.b();
        }
        if ((i11 & 8) != 0) {
            eVar = j0.f16565a.b(fontWeight, i10, new j0.a[0]);
        }
        return b(file, fontWeight, i10, eVar);
    }

    @j2
    @dl.d
    @androidx.compose.ui.text.g
    public static final u e(@dl.d String path, @dl.d AssetManager assetManager, @dl.d FontWeight weight, int i10, @dl.d j0.e variationSettings) {
        kotlin.jvm.internal.f0.p(path, "path");
        kotlin.jvm.internal.f0.p(assetManager, "assetManager");
        kotlin.jvm.internal.f0.p(weight, "weight");
        kotlin.jvm.internal.f0.p(variationSettings, "variationSettings");
        return new Font(assetManager, path, weight, i10, variationSettings, null);
    }

    public static /* synthetic */ u f(String str, AssetManager assetManager, FontWeight fontWeight, int i10, j0.e eVar, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            fontWeight = FontWeight.INSTANCE.m();
        }
        if ((i11 & 8) != 0) {
            i10 = g0.INSTANCE.b();
        }
        if ((i11 & 16) != 0) {
            eVar = j0.f16565a.b(fontWeight, i10, new j0.a[0]);
        }
        return e(str, assetManager, fontWeight, i10, eVar);
    }

    @j2
    @dl.d
    @kotlin.k(level = DeprecationLevel.WARNING, message = "This experimental Font is replaced by Font(path, assetManager, ...)", replaceWith = @kotlin.s0(expression = "Font(path, assetManager, weight, style)", imports = {}))
    @androidx.compose.ui.text.g
    public static final u g(@dl.d AssetManager assetManager, @dl.d String path, @dl.d FontWeight weight, int i10) {
        kotlin.jvm.internal.f0.p(assetManager, "assetManager");
        kotlin.jvm.internal.f0.p(path, "path");
        kotlin.jvm.internal.f0.p(weight, "weight");
        return new Font(assetManager, path, weight, i10, j0.f16565a.b(weight, i10, new j0.a[0]), null);
    }

    public static /* synthetic */ u h(AssetManager assetManager, String str, FontWeight fontWeight, int i10, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            fontWeight = FontWeight.INSTANCE.m();
        }
        if ((i11 & 8) != 0) {
            i10 = g0.INSTANCE.b();
        }
        return g(assetManager, str, fontWeight, i10);
    }

    private static final void i() {
    }
}
