package androidx.compose.ui.text.font;

import android.content.Context;
import com.max.hbuikit.bean.param.UiKitSpanObj;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: DelegatingFontLoaderForDeprecatedUsage.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\r\u001a\u00020\b\u0012\u0006\u0010\u0010\u001a\u00020\u000e¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u001d\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\r\u001a\u00020\b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0010\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u000fR\u001a\u0010\u0013\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\t\u0010\u0012\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0016"}, d2 = {"Landroidx/compose/ui/text/font/m;", "Landroidx/compose/ui/text/font/q0;", "Landroidx/compose/ui/text/font/u;", UiKitSpanObj.TYPE_FONT, "", ak.aF, "b", "(Landroidx/compose/ui/text/font/u;Lkotlin/coroutines/c;)Ljava/lang/Object;", "Landroidx/compose/ui/text/font/u$b;", ak.av, "Landroidx/compose/ui/text/font/u$b;", "d", "()Landroidx/compose/ui/text/font/u$b;", "loader", "Landroid/content/Context;", "Landroid/content/Context;", com.umeng.analytics.pro.d.R, "Ljava/lang/Object;", "()Ljava/lang/Object;", "cacheKey", "<init>", "(Landroidx/compose/ui/text/font/u$b;Landroid/content/Context;)V", "ui-text_release"}, k = 1, mv = {1, 7, 1})
public final class m implements q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final u.b loader;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final Context context;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final Object cacheKey;

    public m(@dl.d u.b loader, @dl.d Context context) {
        kotlin.jvm.internal.f0.p(loader, "loader");
        kotlin.jvm.internal.f0.p(context, "context");
        this.loader = loader;
        this.context = context;
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
        if (!(uVar instanceof d)) {
            return this.loader.a(uVar);
        }
        d dVar = (d) uVar;
        return dVar.getTypefaceLoader().b(this.context, dVar, cVar);
    }

    @Override // androidx.compose.ui.text.font.q0
    @dl.e
    public Object c(@dl.d u font) {
        kotlin.jvm.internal.f0.p(font, "font");
        if (!(font instanceof d)) {
            return this.loader.a(font);
        }
        d dVar = (d) font;
        return dVar.getTypefaceLoader().a(this.context, dVar);
    }

    @dl.d
    /* JADX INFO: renamed from: d, reason: from getter */
    public final u.b getLoader() {
        return this.loader;
    }
}
