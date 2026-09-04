package androidx.compose.ui;

import androidx.compose.runtime.j2;
import androidx.compose.ui.platform.x0;
import com.taobao.aranger.constant.Constants;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: ComposedModifier.kt */
/* JADX INFO: loaded from: classes.dex */
@j2
@Metadata(bv = {}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001BX\u0012\u0006\u0010\r\u001a\u00020\b\u0012\u0010\u0010\u0012\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00020\u000e\u0012\u0017\u0010\u0017\u001a\u0013\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u0013¢\u0006\u0002\b\u0016\u0012\u001c\u0010\u001a\u001a\u0018\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00180\u0013¢\u0006\u0002\b\u0019¢\u0006\u0002\b\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0013\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016R\u0017\u0010\r\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR!\u0010\u0012\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001d"}, d2 = {"Landroidx/compose/ui/l;", "Landroidx/compose/ui/f;", "", "other", "", "equals", "", "hashCode", "", "f", "Ljava/lang/String;", "g", "()Ljava/lang/String;", "fqName", "", "[Ljava/lang/Object;", "m", "()[Ljava/lang/Object;", Constants.PARAM_KEYS, "Lkotlin/Function1;", "Landroidx/compose/ui/platform/x0;", "Lkotlin/b2;", "Lkotlin/t;", "inspectorInfo", "Landroidx/compose/ui/n;", "Landroidx/compose/runtime/h;", "factory", "<init>", "(Ljava/lang/String;[Ljava/lang/Object;Lyh/l;Lyh/q;)V", "ui_release"}, k = 1, mv = {1, 7, 1})
public final class l extends f {

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final String fqName;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final Object[] keys;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(@dl.d String fqName, @dl.d Object[] keys, @dl.d yh.l<? super x0, b2> inspectorInfo, @dl.d yh.q<? super n, ? super androidx.compose.runtime.p, ? super Integer, ? extends n> factory) {
        super(inspectorInfo, factory);
        f0.p(fqName, "fqName");
        f0.p(keys, "keys");
        f0.p(inspectorInfo, "inspectorInfo");
        f0.p(factory, "factory");
        this.fqName = fqName;
        this.keys = keys;
    }

    public boolean equals(@dl.e Object other) {
        if (other instanceof l) {
            l lVar = (l) other;
            if (f0.g(this.fqName, lVar.fqName) && Arrays.equals(this.keys, lVar.keys)) {
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
        return (this.fqName.hashCode() * 31) + Arrays.hashCode(this.keys);
    }

    @dl.d
    /* JADX INFO: renamed from: m, reason: from getter */
    public final Object[] getKeys() {
        return this.keys;
    }
}
