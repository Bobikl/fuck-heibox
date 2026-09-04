package androidx.compose.ui.text.font;

import android.content.Context;
import android.graphics.Typeface;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import kotlin.Metadata;

/* JADX INFO: compiled from: AndroidPreloadedFont.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001B$\b\u0004\u0012\u0006\u0010\f\u001a\u00020\b\u0012\u0006\u0010\u0012\u001a\u00020\r\u0012\u0006\u0010 \u001a\u00020\u001fø\u0001\u0000¢\u0006\u0004\b!\u0010\"J\u001b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H ¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0007\u0010\u0006R\u0017\u0010\f\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0005\u0010\t\u001a\u0004\b\n\u0010\u000bR \u0010\u0012\u001a\u00020\r8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0016\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R$\u0010\u001b\u001a\u0004\u0018\u00010\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u0017\u001a\u0004\b\u0014\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001e\u001a\u0004\u0018\u00010\u001c8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u001d\u0082\u0001\u0003#$%\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006&"}, d2 = {"Landroidx/compose/ui/text/font/i;", "Landroidx/compose/ui/text/font/d;", "Landroid/content/Context;", com.umeng.analytics.pro.d.R, "Landroid/graphics/Typeface;", "g", "(Landroid/content/Context;)Landroid/graphics/Typeface;", "j", "Landroidx/compose/ui/text/font/k0;", "Landroidx/compose/ui/text/font/k0;", "b", "()Landroidx/compose/ui/text/font/k0;", "weight", "Landroidx/compose/ui/text/font/g0;", RXScreenCaptureService.KEY_HEIGHT, "I", "d", "()I", "style", "", "i", "Z", "didInitWithContext", "Landroid/graphics/Typeface;", "()Landroid/graphics/Typeface;", "k", "(Landroid/graphics/Typeface;)V", "typeface", "", "()Ljava/lang/String;", "cacheKey", "Landroidx/compose/ui/text/font/j0$e;", "variationSettings", "<init>", "(Landroidx/compose/ui/text/font/k0;ILandroidx/compose/ui/text/font/j0$e;)V", "Landroidx/compose/ui/text/font/a;", "Landroidx/compose/ui/text/font/b;", "Landroidx/compose/ui/text/font/c;", "ui-text_release"}, k = 1, mv = {1, 7, 1})
public abstract class i extends d {

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final FontWeight weight;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final int style;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private boolean didInitWithContext;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private Typeface typeface;

    private i(FontWeight fontWeight, int i10, j0.e eVar) {
        super(e0.INSTANCE.b(), j.f16564a, eVar, null);
        this.weight = fontWeight;
        this.style = i10;
    }

    public /* synthetic */ i(FontWeight fontWeight, int i10, j0.e eVar, kotlin.jvm.internal.u uVar) {
        this(fontWeight, i10, eVar);
    }

    @Override // androidx.compose.ui.text.font.u
    @dl.d
    /* JADX INFO: renamed from: b, reason: from getter */
    public final FontWeight getWeight() {
        return this.weight;
    }

    @Override // androidx.compose.ui.text.font.u
    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getStyle() {
        return this.style;
    }

    @dl.e
    public abstract Typeface g(@dl.e Context context);

    @dl.e
    public abstract String h();

    @dl.e
    /* JADX INFO: renamed from: i, reason: from getter */
    public final Typeface getTypeface() {
        return this.typeface;
    }

    @dl.e
    public final Typeface j(@dl.d Context context) {
        kotlin.jvm.internal.f0.p(context, "context");
        if (!this.didInitWithContext && this.typeface == null) {
            this.typeface = g(context);
        }
        this.didInitWithContext = true;
        return this.typeface;
    }

    public final void k(@dl.e Typeface typeface) {
        this.typeface = typeface;
    }
}
