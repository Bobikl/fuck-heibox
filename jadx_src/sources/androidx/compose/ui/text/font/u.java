package androidx.compose.ui.text.font;

import com.max.hbuikit.bean.param.UiKitSpanObj;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: Font.kt */
/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.m0
@Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\bg\u0018\u0000 \u000f2\u00020\u0001:\u0002\u000f\u0003R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u001d\u0010\t\u001a\u00020\u00068&X¦\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR#\u0010\u000e\u001a\u00020\n8gX§\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\u0012\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\bø\u0001\u0003\u0082\u0002\u0015\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!\n\u0004\b!0\u0001¨\u0006\u0010À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/text/font/u;", "", "Landroidx/compose/ui/text/font/k0;", "b", "()Landroidx/compose/ui/text/font/k0;", "weight", "Landroidx/compose/ui/text/font/g0;", "d", "()I", "style", "Landroidx/compose/ui/text/font/e0;", ak.aF, "getLoadingStrategy-PKNRLFQ$annotations", "()V", "loadingStrategy", ak.av, "ui-text_release"}, k = 1, mv = {1, 7, 1})
public interface u {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.d
    public static final Companion INSTANCE = Companion.f16620a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f16619b = 15000;

    /* JADX INFO: renamed from: androidx.compose.ui.text.font.u$a, reason: from kotlin metadata */
    /* JADX INFO: compiled from: Font.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\u0006R\u001a\u0010\u0007\u001a\u00020\u00028\u0000X\u0081T¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u0012\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Landroidx/compose/ui/text/font/u$a;", "", "", "b", "J", "getMaximumAsyncTimeout$ui_text_release$annotations", "()V", "MaximumAsyncTimeout", "<init>", "ui-text_release"}, k = 1, mv = {1, 7, 1})
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f16620a = new Companion();

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        public static final long MaximumAsyncTimeout = 15000;

        private Companion() {
        }

        @androidx.compose.ui.text.g
        public static /* synthetic */ void a() {
        }
    }

    /* JADX INFO: compiled from: Font.kt */
    @kotlin.k(message = "Replaced with FontFamily.Resolver during the introduction of async fonts, all usages should be replaced. Custom subclasses can be converted into a FontFamily.Resolver by calling createFontFamilyResolver(myFontFamilyResolver, context)")
    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H'ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0005À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/text/font/u$b;", "", "Landroidx/compose/ui/text/font/u;", UiKitSpanObj.TYPE_FONT, ak.av, "ui-text_release"}, k = 1, mv = {1, 7, 1})
    public interface b {
        @dl.d
        @kotlin.k(message = "Replaced by FontFamily.Resolver, this method should not be called", replaceWith = @kotlin.s0(expression = "FontFamily.Resolver.resolve(font, )", imports = {}))
        Object a(@dl.d u font);
    }

    @dl.d
    FontWeight b();

    @androidx.compose.ui.text.g
    int c();

    int d();
}
