package androidx.compose.ui.text.font;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.graphics.Typeface$Builder;
import android.graphics.fonts.FontVariationAxis;
import android.os.ParcelFileDescriptor;
import com.max.xiaoheihe.okflutter.containers.FlutterActivityLaunchConfigs;
import com.umeng.analytics.pro.ak;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: AndroidPreloadedFont.kt */
/* JADX INFO: loaded from: classes.dex */
@androidx.annotation.w0(api = 26)
@Metadata(bv = {}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0016\u0010\u0017J#\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005*\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0003¢\u0006\u0004\b\u0007\u0010\bJ,\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0006\u0010\r\u001a\u00020\u0002H\u0007J$\u0010\u0012\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0006\u0010\r\u001a\u00020\u0002H\u0007J$\u0010\u0015\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0006\u0010\r\u001a\u00020\u0002H\u0007¨\u0006\u0018"}, d2 = {"Landroidx/compose/ui/text/font/b1;", "", "Landroidx/compose/ui/text/font/j0$e;", "Landroid/content/Context;", com.umeng.analytics.pro.d.R, "", "Landroid/graphics/fonts/FontVariationAxis;", "d", "(Landroidx/compose/ui/text/font/j0$e;Landroid/content/Context;)[Landroid/graphics/fonts/FontVariationAxis;", "Landroid/content/res/AssetManager;", "assetManager", "", FlutterActivityLaunchConfigs.EXTRA_PATH, "variationSettings", "Landroid/graphics/Typeface;", ak.av, "Ljava/io/File;", "file", "b", "Landroid/os/ParcelFileDescriptor;", "fileDescriptor", ak.aF, "<init>", "()V", "ui-text_release"}, k = 1, mv = {1, 7, 1})
public final class b1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final b1 f16524a = new b1();

    private b1() {
    }

    @androidx.annotation.w0(26)
    @androidx.compose.ui.text.g
    private final FontVariationAxis[] d(j0.e eVar, Context context) {
        s1.e eVarA;
        if (context != null) {
            eVarA = s1.a.a(context);
        } else {
            if (eVar.getNeedsDensity()) {
                throw new IllegalStateException("Required density, but not provided");
            }
            eVarA = s1.g.a(1.0f, 1.0f);
        }
        List<j0.a> listB = eVar.b();
        ArrayList arrayList = new ArrayList(listB.size());
        int size = listB.size();
        for (int i10 = 0; i10 < size; i10++) {
            j0.a aVar = listB.get(i10);
            arrayList.add(new FontVariationAxis(aVar.getAxisName(), aVar.c(eVarA)));
        }
        Object[] array = arrayList.toArray(new FontVariationAxis[0]);
        kotlin.jvm.internal.f0.n(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        return (FontVariationAxis[]) array;
    }

    @androidx.annotation.u
    @dl.e
    @androidx.compose.ui.text.g
    public final Typeface a(@dl.d AssetManager assetManager, @dl.d String path, @dl.e Context context, @dl.d j0.e variationSettings) {
        kotlin.jvm.internal.f0.p(assetManager, "assetManager");
        kotlin.jvm.internal.f0.p(path, "path");
        kotlin.jvm.internal.f0.p(variationSettings, "variationSettings");
        if (context == null) {
            return null;
        }
        return new Typeface$Builder(assetManager, path).setFontVariationSettings(d(variationSettings, context)).build();
    }

    @androidx.annotation.u
    @dl.e
    @androidx.compose.ui.text.g
    public final Typeface b(@dl.d File file, @dl.e Context context, @dl.d j0.e variationSettings) {
        kotlin.jvm.internal.f0.p(file, "file");
        kotlin.jvm.internal.f0.p(variationSettings, "variationSettings");
        if (context == null) {
            return null;
        }
        return new Typeface$Builder(file).setFontVariationSettings(d(variationSettings, context)).build();
    }

    @androidx.annotation.u
    @dl.e
    @androidx.compose.ui.text.g
    public final Typeface c(@dl.d ParcelFileDescriptor fileDescriptor, @dl.e Context context, @dl.d j0.e variationSettings) {
        kotlin.jvm.internal.f0.p(fileDescriptor, "fileDescriptor");
        kotlin.jvm.internal.f0.p(variationSettings, "variationSettings");
        if (context == null) {
            return null;
        }
        return new Typeface$Builder(fileDescriptor.getFileDescriptor()).setFontVariationSettings(d(variationSettings, context)).build();
    }
}
