package androidx.compose.runtime;

import com.umeng.analytics.pro.ak;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;

/* JADX INFO: compiled from: Composer.kt */
/* JADX INFO: loaded from: classes.dex */
@o0
@androidx.compose.runtime.internal.o(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0085\u0001\b\u0000\u0012\u000e\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010\u0010\u001a\u00020\r\u0012\u0006\u0010\u0016\u001a\u00020\u0011\u0012\u0006\u0010\u001b\u001a\u00020\u0017\u0012 \u0010\"\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u001e\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u001f0\u001d0\u001c\u0012&\u0010'\u001a\"\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010$\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010%0#j\u0002`&¢\u0006\u0004\b*\u0010+R\"\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00018\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0010\u001a\u00020\r8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\b\u0010\u000fR\u001a\u0010\u0016\u001a\u00020\u00118\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u001b\u001a\u00020\u00178\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0003\u0010\u001aR4\u0010\"\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u001e\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u001f0\u001d0\u001c8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\n\u0010 \u001a\u0004\b\u0012\u0010!R:\u0010'\u001a\"\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010$\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010%0#j\u0002`&8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b\u0018\u0010)¨\u0006,"}, d2 = {"Landroidx/compose/runtime/z0;", "", "Landroidx/compose/runtime/x0;", ak.av, "Landroidx/compose/runtime/x0;", ak.aF, "()Landroidx/compose/runtime/x0;", "content", "b", "Ljava/lang/Object;", "f", "()Ljava/lang/Object;", "parameter", "Landroidx/compose/runtime/z;", "Landroidx/compose/runtime/z;", "()Landroidx/compose/runtime/z;", "composition", "Landroidx/compose/runtime/x1;", "d", "Landroidx/compose/runtime/x1;", "g", "()Landroidx/compose/runtime/x1;", "slotTable", "Landroidx/compose/runtime/c;", "e", "Landroidx/compose/runtime/c;", "()Landroidx/compose/runtime/c;", "anchor", "", "Lkotlin/Pair;", "Landroidx/compose/runtime/RecomposeScopeImpl;", "Landroidx/compose/runtime/collection/c;", "Ljava/util/List;", "()Ljava/util/List;", "invalidations", "Lu0/i;", "Landroidx/compose/runtime/v;", "Landroidx/compose/runtime/m2;", "Landroidx/compose/runtime/CompositionLocalMap;", "locals", "Lu0/i;", "()Lu0/i;", "<init>", "(Landroidx/compose/runtime/x0;Ljava/lang/Object;Landroidx/compose/runtime/z;Landroidx/compose/runtime/x1;Landroidx/compose/runtime/c;Ljava/util/List;Lu0/i;)V", "runtime_release"}, k = 1, mv = {1, 7, 1})
public final class z0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f13355h = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final x0<Object> content;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private final Object parameter;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final z composition;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final x1 slotTable;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final c anchor;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final List<Pair<RecomposeScopeImpl, androidx.compose.runtime.collection.c<Object>>> invalidations;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @dl.d
    private final u0.i<v<Object>, m2<Object>> f13362g;

    /* JADX WARN: Multi-variable type inference failed */
    public z0(@dl.d x0<Object> content, @dl.e Object obj, @dl.d z composition, @dl.d x1 slotTable, @dl.d c anchor, @dl.d List<Pair<RecomposeScopeImpl, androidx.compose.runtime.collection.c<Object>>> invalidations, @dl.d u0.i<v<Object>, ? extends m2<? extends Object>> locals) {
        kotlin.jvm.internal.f0.p(content, "content");
        kotlin.jvm.internal.f0.p(composition, "composition");
        kotlin.jvm.internal.f0.p(slotTable, "slotTable");
        kotlin.jvm.internal.f0.p(anchor, "anchor");
        kotlin.jvm.internal.f0.p(invalidations, "invalidations");
        kotlin.jvm.internal.f0.p(locals, "locals");
        this.content = content;
        this.parameter = obj;
        this.composition = composition;
        this.slotTable = slotTable;
        this.anchor = anchor;
        this.invalidations = invalidations;
        this.f13362g = locals;
    }

    @dl.d
    /* JADX INFO: renamed from: a, reason: from getter */
    public final c getAnchor() {
        return this.anchor;
    }

    @dl.d
    /* JADX INFO: renamed from: b, reason: from getter */
    public final z getComposition() {
        return this.composition;
    }

    @dl.d
    public final x0<Object> c() {
        return this.content;
    }

    @dl.d
    public final List<Pair<RecomposeScopeImpl, androidx.compose.runtime.collection.c<Object>>> d() {
        return this.invalidations;
    }

    @dl.d
    public final u0.i<v<Object>, m2<Object>> e() {
        return this.f13362g;
    }

    @dl.e
    /* JADX INFO: renamed from: f, reason: from getter */
    public final Object getParameter() {
        return this.parameter;
    }

    @dl.d
    /* JADX INFO: renamed from: g, reason: from getter */
    public final x1 getSlotTable() {
        return this.slotTable;
    }
}
