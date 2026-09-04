package androidx.compose.ui.text.font;

import android.content.Context;
import android.graphics.Typeface;
import com.max.hbuikit.bean.param.UiKitSpanObj;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: AndroidFont.kt */
/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\b'\u0018\u00002\u00020\u0001:\u0001\nB$\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0007\u0012\u0006\u0010\u0013\u001a\u00020\rø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015B\u001c\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0007ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0016R \u0010\u0006\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005R\u0017\u0010\f\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR \u0010\u0013\u001a\u00020\r8GX\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u0012\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000e\u0010\u0010\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0017"}, d2 = {"Landroidx/compose/ui/text/font/d;", "Landroidx/compose/ui/text/font/u;", "Landroidx/compose/ui/text/font/e0;", ak.aF, "I", "()I", "loadingStrategy", "Landroidx/compose/ui/text/font/d$a;", "d", "Landroidx/compose/ui/text/font/d$a;", ak.av, "()Landroidx/compose/ui/text/font/d$a;", "typefaceLoader", "Landroidx/compose/ui/text/font/j0$e;", "e", "Landroidx/compose/ui/text/font/j0$e;", "()Landroidx/compose/ui/text/font/j0$e;", "getVariationSettings$annotations", "()V", "variationSettings", "<init>", "(ILandroidx/compose/ui/text/font/d$a;Landroidx/compose/ui/text/font/j0$e;Lkotlin/jvm/internal/u;)V", "(ILandroidx/compose/ui/text/font/d$a;Lkotlin/jvm/internal/u;)V", "ui-text_release"}, k = 1, mv = {1, 7, 1})
public abstract class d implements u {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f16529f = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int loadingStrategy;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final a typefaceLoader;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final j0.e variationSettings;

    /* JADX INFO: compiled from: AndroidFont.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&J%\u0010\b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H¦@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tø\u0001\u0001\u0082\u0002\n\n\u0002\b\u0019\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, d2 = {"Landroidx/compose/ui/text/font/d$a;", "", "Landroid/content/Context;", com.umeng.analytics.pro.d.R, "Landroidx/compose/ui/text/font/d;", UiKitSpanObj.TYPE_FONT, "Landroid/graphics/Typeface;", ak.av, "b", "(Landroid/content/Context;Landroidx/compose/ui/text/font/d;Lkotlin/coroutines/c;)Ljava/lang/Object;", "ui-text_release"}, k = 1, mv = {1, 7, 1})
    public interface a {
        @dl.e
        Typeface a(@dl.d Context context, @dl.d d font);

        @dl.e
        Object b(@dl.d Context context, @dl.d d dVar, @dl.d kotlin.coroutines.c<? super Typeface> cVar);
    }

    private d(int i10, a aVar) {
        this(i10, aVar, new j0.e(new j0.a[0]), null);
    }

    private d(int i10, a aVar, j0.e eVar) {
        this.loadingStrategy = i10;
        this.typefaceLoader = aVar;
        this.variationSettings = eVar;
    }

    @androidx.compose.ui.text.g
    public /* synthetic */ d(int i10, a aVar, j0.e eVar, kotlin.jvm.internal.u uVar) {
        this(i10, aVar, eVar);
    }

    public /* synthetic */ d(int i10, a aVar, kotlin.jvm.internal.u uVar) {
        this(i10, aVar);
    }

    @androidx.compose.ui.text.g
    public static /* synthetic */ void f() {
    }

    @dl.d
    /* JADX INFO: renamed from: a, reason: from getter */
    public final a getTypefaceLoader() {
        return this.typefaceLoader;
    }

    @Override // androidx.compose.ui.text.font.u
    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getLoadingStrategy() {
        return this.loadingStrategy;
    }

    @dl.d
    @androidx.compose.ui.text.g
    /* JADX INFO: renamed from: e, reason: from getter */
    public final j0.e getVariationSettings() {
        return this.variationSettings;
    }
}
