package androidx.compose.ui;

import androidx.compose.runtime.j2;
import androidx.compose.ui.platform.x0;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: ComposedModifier.kt */
/* JADX INFO: loaded from: classes.dex */
@j2
@Metadata(bv = {}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001BZ\u0012\u0006\u0010\r\u001a\u00020\b\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\u0017\u0010\u0019\u001a\u0013\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00170\u0015¢\u0006\u0002\b\u0018\u0012\u001c\u0010\u001c\u001a\u0018\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001a0\u0015¢\u0006\u0002\b\u001b¢\u0006\u0002\b\u0018¢\u0006\u0004\b\u001d\u0010\u001eJ\u0013\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016R\u0017\u0010\r\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u000e\u001a\u0004\b\u0013\u0010\u0010¨\u0006\u001f"}, d2 = {"Landroidx/compose/ui/j;", "Landroidx/compose/ui/f;", "", "other", "", "equals", "", "hashCode", "", "f", "Ljava/lang/String;", "g", "()Ljava/lang/String;", "fqName", "Ljava/lang/Object;", "m", "()Ljava/lang/Object;", "key1", RXScreenCaptureService.KEY_HEIGHT, "n", "key2", "Lkotlin/Function1;", "Landroidx/compose/ui/platform/x0;", "Lkotlin/b2;", "Lkotlin/t;", "inspectorInfo", "Landroidx/compose/ui/n;", "Landroidx/compose/runtime/h;", "factory", "<init>", "(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Lyh/l;Lyh/q;)V", "ui_release"}, k = 1, mv = {1, 7, 1})
public final class j extends f {

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final String fqName;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private final Object key1;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private final Object key2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(@dl.d String fqName, @dl.e Object obj, @dl.e Object obj2, @dl.d yh.l<? super x0, b2> inspectorInfo, @dl.d yh.q<? super n, ? super androidx.compose.runtime.p, ? super Integer, ? extends n> factory) {
        super(inspectorInfo, factory);
        f0.p(fqName, "fqName");
        f0.p(inspectorInfo, "inspectorInfo");
        f0.p(factory, "factory");
        this.fqName = fqName;
        this.key1 = obj;
        this.key2 = obj2;
    }

    public boolean equals(@dl.e Object other) {
        if (other instanceof j) {
            j jVar = (j) other;
            if (f0.g(this.fqName, jVar.fqName) && f0.g(this.key1, jVar.key1) && f0.g(this.key2, jVar.key2)) {
                return true;
            }
        }
        return false;
    }

    @dl.d
    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getFqName() {
        return this.fqName;
    }

    public int hashCode() {
        int iHashCode = this.fqName.hashCode() * 31;
        Object obj = this.key1;
        int iHashCode2 = (iHashCode + (obj != null ? obj.hashCode() : 0)) * 31;
        Object obj2 = this.key2;
        return iHashCode2 + (obj2 != null ? obj2.hashCode() : 0);
    }

    @dl.e
    /* JADX INFO: renamed from: m, reason: from getter */
    public final Object getKey1() {
        return this.key1;
    }

    @dl.e
    /* JADX INFO: renamed from: n, reason: from getter */
    public final Object getKey2() {
        return this.key2;
    }
}
