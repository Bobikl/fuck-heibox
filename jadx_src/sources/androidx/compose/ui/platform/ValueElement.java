package androidx.compose.ui.platform;

import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: renamed from: androidx.compose.ui.platform.z1, reason: from toString */
/* JADX INFO: compiled from: InspectableValue.kt */
/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u000b\u0010\u0004\u001a\u0004\u0018\u00010\u0001HÆ\u0003J\u001f\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÆ\u0001J\t\u0010\b\u001a\u00020\u0002HÖ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, d2 = {"Landroidx/compose/ui/platform/z1;", "", "", ak.av, "b", "name", "value", ak.aF, "toString", "", "hashCode", "other", "", "equals", "Ljava/lang/String;", "e", "()Ljava/lang/String;", "Ljava/lang/Object;", "f", "()Ljava/lang/Object;", "<init>", "(Ljava/lang/String;Ljava/lang/Object;)V", "ui_release"}, k = 1, mv = {1, 7, 1})
public final /* data */ class ValueElement {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f16002c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @dl.d
    private final String name;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @dl.e
    private final Object value;

    public ValueElement(@dl.d String name, @dl.e Object obj) {
        kotlin.jvm.internal.f0.p(name, "name");
        this.name = name;
        this.value = obj;
    }

    public static /* synthetic */ ValueElement d(ValueElement valueElement, String str, Object obj, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            str = valueElement.name;
        }
        if ((i10 & 2) != 0) {
            obj = valueElement.value;
        }
        return valueElement.c(str, obj);
    }

    @dl.d
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @dl.e
    /* JADX INFO: renamed from: b, reason: from getter */
    public final Object getValue() {
        return this.value;
    }

    @dl.d
    public final ValueElement c(@dl.d String name, @dl.e Object value) {
        kotlin.jvm.internal.f0.p(name, "name");
        return new ValueElement(name, value);
    }

    @dl.d
    public final String e() {
        return this.name;
    }

    public boolean equals(@dl.e Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ValueElement)) {
            return false;
        }
        ValueElement valueElement = (ValueElement) other;
        return kotlin.jvm.internal.f0.g(this.name, valueElement.name) && kotlin.jvm.internal.f0.g(this.value, valueElement.value);
    }

    @dl.e
    public final Object f() {
        return this.value;
    }

    public int hashCode() {
        int iHashCode = this.name.hashCode() * 31;
        Object obj = this.value;
        return iHashCode + (obj == null ? 0 : obj.hashCode());
    }

    @dl.d
    public String toString() {
        return "ValueElement(name=" + this.name + ", value=" + this.value + ')';
    }
}
