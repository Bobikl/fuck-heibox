package androidx.compose.ui.platform;

import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: InspectableValue.kt */
/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0014\u0010\u0015R$\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005\"\u0004\b\u0006\u0010\u0007R$\u0010\u000f\u001a\u0004\u0018\u00010\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0017\u0010\u0013\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0011\u001a\u0004\b\t\u0010\u0012¨\u0006\u0016"}, d2 = {"Landroidx/compose/ui/platform/x0;", "", "", ak.av, "Ljava/lang/String;", "()Ljava/lang/String;", "d", "(Ljava/lang/String;)V", "name", "b", "Ljava/lang/Object;", ak.aF, "()Ljava/lang/Object;", "e", "(Ljava/lang/Object;)V", "value", "Landroidx/compose/ui/platform/a2;", "Landroidx/compose/ui/platform/a2;", "()Landroidx/compose/ui/platform/a2;", "properties", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 7, 1})
public final class x0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f15993d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private String name;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private Object value;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final a2 properties = new a2();

    @dl.e
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @dl.d
    /* JADX INFO: renamed from: b, reason: from getter */
    public final a2 getProperties() {
        return this.properties;
    }

    @dl.e
    /* JADX INFO: renamed from: c, reason: from getter */
    public final Object getValue() {
        return this.value;
    }

    public final void d(@dl.e String str) {
        this.name = str;
    }

    public final void e(@dl.e Object obj) {
        this.value = obj;
    }
}
