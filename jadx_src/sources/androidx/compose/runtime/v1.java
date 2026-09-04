package androidx.compose.runtime;

import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: Composer.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087@\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0012\u0012\u0006\u0010\u0019\u001a\u00020\u0014ø\u0001\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ5\u0010\b\u001a\u00020\u00052\u001d\u0010\u0007\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0086\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0019\u001a\u00020\u00148\u0000X\u0081\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u0012\u0004\b\u0017\u0010\u0018\u0088\u0001\u0019\u0092\u0001\u00020\u0014ø\u0001\u0001\u0082\u0002\u000b\n\u0005\b\u009920\u0001\n\u0002\b\u0019¨\u0006\u001c"}, d2 = {"Landroidx/compose/runtime/v1;", androidx.exifinterface.media.a.f23244d5, "", "Lkotlin/Function1;", "Landroidx/compose/runtime/Updater;", "Lkotlin/b2;", "Lkotlin/t;", "block", "i", "(Landroidx/compose/runtime/p;Lyh/l;)V", "", "g", "(Landroidx/compose/runtime/p;)Ljava/lang/String;", "", "f", "(Landroidx/compose/runtime/p;)I", "other", "", ak.aF, "(Landroidx/compose/runtime/p;Ljava/lang/Object;)Z", "Landroidx/compose/runtime/p;", ak.av, "Landroidx/compose/runtime/p;", "getComposer$annotations", "()V", "composer", "b", "(Landroidx/compose/runtime/p;)Landroidx/compose/runtime/p;", "runtime_release"}, k = 1, mv = {1, 7, 1})
@xh.f
public final class v1<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final p composer;

    private /* synthetic */ v1(p pVar) {
        this.composer = pVar;
    }

    public static final /* synthetic */ v1 a(p pVar) {
        return new v1(pVar);
    }

    @dl.d
    public static <T> p b(@dl.d p composer) {
        kotlin.jvm.internal.f0.p(composer, "composer");
        return composer;
    }

    public static boolean c(p pVar, Object obj) {
        return (obj instanceof v1) && kotlin.jvm.internal.f0.g(pVar, ((v1) obj).getComposer());
    }

    public static final boolean d(p pVar, p pVar2) {
        return kotlin.jvm.internal.f0.g(pVar, pVar2);
    }

    @kotlin.r0
    public static /* synthetic */ void e() {
    }

    public static int f(p pVar) {
        return pVar.hashCode();
    }

    public static String g(p pVar) {
        return "SkippableUpdater(composer=" + pVar + ')';
    }

    public static final void i(p pVar, @dl.d yh.l<? super Updater<T>, kotlin.b2> block) {
        kotlin.jvm.internal.f0.p(block, "block");
        pVar.T(509942095);
        block.invoke(Updater.a(Updater.b(pVar)));
        pVar.c0();
    }

    public boolean equals(Object obj) {
        return c(this.composer, obj);
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final /* synthetic */ p getComposer() {
        return this.composer;
    }

    public int hashCode() {
        return f(this.composer);
    }

    public String toString() {
        return g(this.composer);
    }
}
