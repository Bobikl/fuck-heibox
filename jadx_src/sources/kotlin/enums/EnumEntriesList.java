package kotlin.enums;

import dl.d;
import dl.e;
import java.io.Serializable;
import java.lang.Enum;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.b;
import kotlin.jvm.internal.f0;
import kotlin.q;
import kotlin.u0;
import org.apache.tools.ant.util.s0;

/* JADX INFO: compiled from: EnumEntries.kt */
/* JADX INFO: loaded from: classes5.dex */
@u0(version = s0.f136934y)
@q
public final class EnumEntriesList<T extends Enum<T>> extends b<T> implements a<T>, Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @d
    private final yh.a<T[]> f124730b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @e
    private volatile T[] f124731c;

    public EnumEntriesList(@d yh.a<T[]> entriesProvider) {
        f0.p(entriesProvider, "entriesProvider");
        this.f124730b = entriesProvider;
    }

    private final T[] e() {
        T[] tArr = this.f124731c;
        if (tArr != null) {
            return tArr;
        }
        T[] tArrInvoke = this.f124730b.invoke();
        this.f124731c = tArrInvoke;
        return tArrInvoke;
    }

    private final Object i() {
        return new EnumEntriesSerializationProxy(e());
    }

    public boolean a(@d T element) {
        f0.p(element, "element");
        return ((Enum) ArraysKt___ArraysKt.qf(e(), element.ordinal())) == element;
    }

    @Override // kotlin.collections.b, java.util.List
    @d
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public T get(int i10) {
        Enum[] enumArrE = e();
        b.Companion.b(i10, enumArrE.length);
        return (T) enumArrE[i10];
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Enum) {
            return a((Enum) obj);
        }
        return false;
    }

    public int g(@d T element) {
        f0.p(element, "element");
        int iOrdinal = element.ordinal();
        if (((Enum) ArraysKt___ArraysKt.qf(e(), iOrdinal)) == element) {
            return iOrdinal;
        }
        return -1;
    }

    @Override // kotlin.collections.b, kotlin.collections.AbstractCollection
    /* JADX INFO: renamed from: getSize */
    public int getCom.max.hbuikit.bean.param.UiKitSpanObj.TYPE_SIZE java.lang.String() {
        return e().length;
    }

    public int h(@d T element) {
        f0.p(element, "element");
        return indexOf(element);
    }

    @Override // kotlin.collections.b, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof Enum) {
            return g((Enum) obj);
        }
        return -1;
    }

    @Override // kotlin.collections.b, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof Enum) {
            return h((Enum) obj);
        }
        return -1;
    }
}
