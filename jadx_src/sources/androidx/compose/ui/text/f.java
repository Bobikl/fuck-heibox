package androidx.compose.ui.text;

import com.max.hbuikit.bean.param.UiKitSpanObj;
import com.umeng.analytics.pro.ak;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: compiled from: TextLayoutResult.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u0000 \u000b2\u00020\u0001:\u0001\u0005B\u0011\b\u0002\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0017R\u0014\u0010\b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0007¨\u0006\f"}, d2 = {"Landroidx/compose/ui/text/f;", "Landroidx/compose/ui/text/font/u$b;", "Landroidx/compose/ui/text/font/u;", UiKitSpanObj.TYPE_FONT, "", ak.av, "Landroidx/compose/ui/text/font/v$b;", "Landroidx/compose/ui/text/font/v$b;", "fontFamilyResolver", "<init>", "(Landroidx/compose/ui/text/font/v$b;)V", "b", "ui-text_release"}, k = 1, mv = {1, 7, 1})
public final class f implements androidx.compose.ui.text.font.u.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private static Map<androidx.compose.ui.text.font.v.b, androidx.compose.ui.text.font.u.b> f16421c = new LinkedHashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private static final androidx.compose.ui.text.platform.s f16422d = androidx.compose.ui.text.platform.r.a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final androidx.compose.ui.text.font.v.b fontFamilyResolver;

    /* JADX INFO: renamed from: androidx.compose.ui.text.f$a, reason: from kotlin metadata */
    /* JADX INFO: compiled from: TextLayoutResult.kt */
    @Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R.\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Landroidx/compose/ui/text/f$a;", "", "Landroidx/compose/ui/text/font/v$b;", "fontFamilyResolver", "Landroidx/compose/ui/text/font/u$b;", ak.av, "", "cache", "Ljava/util/Map;", "b", "()Ljava/util/Map;", "d", "(Ljava/util/Map;)V", "Landroidx/compose/ui/text/platform/s;", "lock", "Landroidx/compose/ui/text/platform/s;", ak.aF, "()Landroidx/compose/ui/text/platform/s;", "<init>", "()V", "ui-text_release"}, k = 1, mv = {1, 7, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.u uVar) {
            this();
        }

        @dl.d
        public final androidx.compose.ui.text.font.u.b a(@dl.d androidx.compose.ui.text.font.v.b fontFamilyResolver) {
            kotlin.jvm.internal.f0.p(fontFamilyResolver, "fontFamilyResolver");
            synchronized (c()) {
                Companion companion = f.INSTANCE;
                androidx.compose.ui.text.font.u.b bVar = companion.b().get(fontFamilyResolver);
                if (bVar != null) {
                    return bVar;
                }
                f fVar = new f(fontFamilyResolver, null);
                companion.b().put(fontFamilyResolver, fVar);
                return fVar;
            }
        }

        @dl.d
        public final Map<androidx.compose.ui.text.font.v.b, androidx.compose.ui.text.font.u.b> b() {
            return f.f16421c;
        }

        @dl.d
        public final androidx.compose.ui.text.platform.s c() {
            return f.f16422d;
        }

        public final void d(@dl.d Map<androidx.compose.ui.text.font.v.b, androidx.compose.ui.text.font.u.b> map) {
            kotlin.jvm.internal.f0.p(map, "<set-?>");
            f.f16421c = map;
        }
    }

    private f(androidx.compose.ui.text.font.v.b bVar) {
        this.fontFamilyResolver = bVar;
    }

    public /* synthetic */ f(androidx.compose.ui.text.font.v.b bVar, kotlin.jvm.internal.u uVar) {
        this(bVar);
    }

    @Override // androidx.compose.ui.text.font.u.b
    @dl.d
    @kotlin.k(message = "Replaced by FontFamily.Resolver, this method should not be called", replaceWith = @kotlin.s0(expression = "FontFamily.Resolver.resolve(font, )", imports = {}))
    public Object a(@dl.d androidx.compose.ui.text.font.u font) {
        kotlin.jvm.internal.f0.p(font, "font");
        return androidx.compose.ui.text.font.w.a(this.fontFamilyResolver, androidx.compose.ui.text.font.b0.g(font), font.getWeight(), font.getStyle(), 0, 8, null).getValue();
    }
}
