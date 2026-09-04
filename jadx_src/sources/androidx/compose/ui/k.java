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
@Metadata(bv = {}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001Bd\u0012\u0006\u0010\r\u001a\u00020\b\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0002\u0012\u0017\u0010\u001c\u001a\u0013\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a0\u0018¢\u0006\u0002\b\u001b\u0012\u001c\u0010\u001f\u001a\u0018\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001d0\u0018¢\u0006\u0002\b\u001e¢\u0006\u0002\b\u001b¢\u0006\u0004\b \u0010!J\u0013\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016R\u0017\u0010\r\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u000e\u001a\u0004\b\u0013\u0010\u0010R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u000e\u001a\u0004\b\u0016\u0010\u0010¨\u0006\""}, d2 = {"Landroidx/compose/ui/k;", "Landroidx/compose/ui/f;", "", "other", "", "equals", "", "hashCode", "", "f", "Ljava/lang/String;", "g", "()Ljava/lang/String;", "fqName", "Ljava/lang/Object;", "m", "()Ljava/lang/Object;", "key1", RXScreenCaptureService.KEY_HEIGHT, "n", "key2", "i", "o", "key3", "Lkotlin/Function1;", "Landroidx/compose/ui/platform/x0;", "Lkotlin/b2;", "Lkotlin/t;", "inspectorInfo", "Landroidx/compose/ui/n;", "Landroidx/compose/runtime/h;", "factory", "<init>", "(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lyh/l;Lyh/q;)V", "ui_release"}, k = 1, mv = {1, 7, 1})
public final class k extends f {

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final String fqName;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private final Object key1;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private final Object key2;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private final Object key3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(@dl.d String fqName, @dl.e Object obj, @dl.e Object obj2, @dl.e Object obj3, @dl.d yh.l<? super x0, b2> inspectorInfo, @dl.d yh.q<? super n, ? super androidx.compose.runtime.p, ? super Integer, ? extends n> factory) {
        super(inspectorInfo, factory);
        f0.p(fqName, "fqName");
        f0.p(inspectorInfo, "inspectorInfo");
        f0.p(factory, "factory");
        this.fqName = fqName;
        this.key1 = obj;
        this.key2 = obj2;
        this.key3 = obj3;
    }

    public boolean equals(@dl.e Object other) {
        if (other instanceof k) {
            k kVar = (k) other;
            if (f0.g(this.fqName, kVar.fqName) && f0.g(this.key1, kVar.key1) && f0.g(this.key2, kVar.key2) && f0.g(this.key3, kVar.key3)) {
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
        int iHashCode3 = (iHashCode2 + (obj2 != null ? obj2.hashCode() : 0)) * 31;
        Object obj3 = this.key3;
        return iHashCode3 + (obj3 != null ? obj3.hashCode() : 0);
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

    @dl.e
    /* JADX INFO: renamed from: o, reason: from getter */
    public final Object getKey3() {
        return this.key3;
    }
}
