package androidx.window.embedding;

import android.content.Intent;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: SplitPlaceholderRule.kt */
/* JADX INFO: loaded from: classes6.dex */
@androidx.window.core.d
@Metadata(bv = {}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001BE\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u0012\u0012\u0006\u0010\u0011\u001a\u00020\f\u0012\b\b\u0002\u0010\u0017\u001a\u00020\n\u0012\b\b\u0002\u0010\u0018\u001a\u00020\n\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0019\u0012\b\b\u0002\u0010\u001b\u001a\u00020\n¢\u0006\u0004\b\u001c\u0010\u001dJ\u0018\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0080\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0096\u0002J\b\u0010\u000b\u001a\u00020\nH\u0016R\u0017\u0010\u0011\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015¨\u0006\u001e"}, d2 = {"Landroidx/window/embedding/w;", "Landroidx/window/embedding/x;", "Landroidx/window/embedding/a;", "filter", RXScreenCaptureService.KEY_HEIGHT, "(Landroidx/window/embedding/a;)Landroidx/window/embedding/w;", "", "other", "", "equals", "", "hashCode", "Landroid/content/Intent;", "e", "Landroid/content/Intent;", "g", "()Landroid/content/Intent;", "placeholderIntent", "", "f", "Ljava/util/Set;", "()Ljava/util/Set;", "filters", "minWidth", "minSmallestWidth", "", "splitRatio", "layoutDirection", "<init>", "(Ljava/util/Set;Landroid/content/Intent;IIFI)V", "window_release"}, k = 1, mv = {1, 6, 0})
public final class w extends x {

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final Intent placeholderIntent;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final Set<ActivityFilter> filters;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(@dl.d Set<ActivityFilter> filters, @dl.d Intent placeholderIntent, int i10, int i11, float f10, int i12) {
        super(i10, i11, f10, i12);
        f0.p(filters, "filters");
        f0.p(placeholderIntent, "placeholderIntent");
        this.placeholderIntent = placeholderIntent;
        this.filters = CollectionsKt___CollectionsKt.V5(filters);
    }

    public /* synthetic */ w(Set set, Intent intent, int i10, int i11, float f10, int i12, int i13, kotlin.jvm.internal.u uVar) {
        this(set, intent, (i13 & 4) != 0 ? 0 : i10, (i13 & 8) != 0 ? 0 : i11, (i13 & 16) != 0 ? 0.5f : f10, (i13 & 32) != 0 ? 3 : i12);
    }

    @Override // androidx.window.embedding.x
    public boolean equals(@dl.e Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof w) || !super.equals(other) || !super.equals(other)) {
            return false;
        }
        w wVar = (w) other;
        return f0.g(this.filters, wVar.filters) && f0.g(this.placeholderIntent, wVar.placeholderIntent);
    }

    @dl.d
    public final Set<ActivityFilter> f() {
        return this.filters;
    }

    @dl.d
    /* JADX INFO: renamed from: g, reason: from getter */
    public final Intent getPlaceholderIntent() {
        return this.placeholderIntent;
    }

    @dl.d
    public final w h(@dl.d ActivityFilter filter) {
        f0.p(filter, "filter");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.addAll(this.filters);
        linkedHashSet.add(filter);
        return new w(CollectionsKt___CollectionsKt.V5(linkedHashSet), this.placeholderIntent, getMinWidth(), getMinSmallestWidth(), getSplitRatio(), getLayoutDirection());
    }

    @Override // androidx.window.embedding.x
    public int hashCode() {
        return (((super.hashCode() * 31) + this.filters.hashCode()) * 31) + this.placeholderIntent.hashCode();
    }
}
