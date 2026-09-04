package androidx.compose.ui.text.font;

import com.max.hbuikit.bean.param.UiKitSpanObj;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: DelegatingFontLoaderForDeprecatedUsage.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\r\u001a\u00020\b¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u001b\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\r\u001a\u00020\b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0010\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000e\u001a\u0004\b\t\u0010\u000f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0013"}, d2 = {"Landroidx/compose/ui/text/font/n;", "Landroidx/compose/ui/text/font/q0;", "Landroidx/compose/ui/text/font/u;", UiKitSpanObj.TYPE_FONT, "", ak.aF, "b", "(Landroidx/compose/ui/text/font/u;Lkotlin/coroutines/c;)Ljava/lang/Object;", "Landroidx/compose/ui/text/font/u$b;", ak.av, "Landroidx/compose/ui/text/font/u$b;", "d", "()Landroidx/compose/ui/text/font/u$b;", "loader", "Ljava/lang/Object;", "()Ljava/lang/Object;", "cacheKey", "<init>", "(Landroidx/compose/ui/text/font/u$b;)V", "ui-text_release"}, k = 1, mv = {1, 7, 1})
public final class n implements q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final u.b loader;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final Object cacheKey;

    public n(@dl.d u.b loader) {
        kotlin.jvm.internal.f0.p(loader, "loader");
        this.loader = loader;
        this.cacheKey = new Object();
    }

    @Override // androidx.compose.ui.text.font.q0
    @dl.d
    /* JADX INFO: renamed from: a, reason: from getter */
    public Object getCacheKey() {
        return this.cacheKey;
    }

    @Override // androidx.compose.ui.text.font.q0
    @dl.e
    public Object b(@dl.d u uVar, @dl.d kotlin.coroutines.c<Object> cVar) {
        return this.loader.a(uVar);
    }

    @Override // androidx.compose.ui.text.font.q0
    @dl.d
    public Object c(@dl.d u font) {
        kotlin.jvm.internal.f0.p(font, "font");
        return this.loader.a(font);
    }

    @dl.d
    /* JADX INFO: renamed from: d, reason: from getter */
    public final u.b getLoader() {
        return this.loader;
    }
}
