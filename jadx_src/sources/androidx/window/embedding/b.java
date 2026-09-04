package androidx.window.embedding;

import androidx.compose.foundation.b0;
import com.umeng.analytics.pro.ak;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: ActivityRule.kt */
/* JADX INFO: loaded from: classes6.dex */
@androidx.window.core.d
@Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00020\u0010\u0012\b\b\u0002\u0010\u000f\u001a\u00020\b¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0080\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0096\u0002J\b\u0010\u000b\u001a\u00020\nH\u0016R\u0017\u0010\u000f\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000eR\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0017"}, d2 = {"Landroidx/window/embedding/b;", "Landroidx/window/embedding/m;", "Landroidx/window/embedding/a;", "filter", ak.aF, "(Landroidx/window/embedding/a;)Landroidx/window/embedding/b;", "", "other", "", "equals", "", "hashCode", ak.av, "Z", "()Z", "alwaysExpand", "", "b", "Ljava/util/Set;", "()Ljava/util/Set;", "filters", "<init>", "(Ljava/util/Set;Z)V", "window_release"}, k = 1, mv = {1, 6, 0})
public final class b extends m {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final boolean alwaysExpand;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final Set<ActivityFilter> filters;

    public b(@dl.d Set<ActivityFilter> filters, boolean z10) {
        f0.p(filters, "filters");
        this.alwaysExpand = z10;
        this.filters = CollectionsKt___CollectionsKt.V5(filters);
    }

    public /* synthetic */ b(Set set, boolean z10, int i10, kotlin.jvm.internal.u uVar) {
        this(set, (i10 & 2) != 0 ? false : z10);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getAlwaysExpand() {
        return this.alwaysExpand;
    }

    @dl.d
    public final Set<ActivityFilter> b() {
        return this.filters;
    }

    @dl.d
    public final b c(@dl.d ActivityFilter filter) {
        f0.p(filter, "filter");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.addAll(this.filters);
        linkedHashSet.add(filter);
        return new b(CollectionsKt___CollectionsKt.V5(linkedHashSet), this.alwaysExpand);
    }

    public boolean equals(@dl.e Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof b)) {
            return false;
        }
        b bVar = (b) other;
        return f0.g(this.filters, bVar.filters) && this.alwaysExpand == bVar.alwaysExpand;
    }

    public int hashCode() {
        return (this.filters.hashCode() * 31) + b0.a(this.alwaysExpand);
    }
}
