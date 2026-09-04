package androidx.compose.ui.semantics;

import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;
import org.apache.tools.ant.taskdefs.condition.a0;

/* JADX INFO: compiled from: SemanticsProperties.kt */
/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
@Metadata(bv = {}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B/\u0012\u0006\u0010\u0017\u001a\u00020\u0011\u0012\u001e\b\u0002\u0010\u0019\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0018¢\u0006\u0004\b\u001c\u0010\u001dJ!\u0010\u0005\u001a\u0004\u0018\u00018\u00002\b\u0010\u0003\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0004\u001a\u00028\u0000¢\u0006\u0004\b\u0005\u0010\u0006J$\u0010\u000b\u001a\u00028\u00002\u0006\u0010\b\u001a\u00020\u00072\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\tH\u0086\u0002¢\u0006\u0004\b\u000b\u0010\fJ,\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\u00072\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\t2\u0006\u0010\r\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0012\u001a\u00020\u0011H\u0016R\u0017\u0010\u0017\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R0\u0010\u0019\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u00188\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0013\u0010\u001b¨\u0006\u001e"}, d2 = {"Landroidx/compose/ui/semantics/SemanticsPropertyKey;", androidx.exifinterface.media.a.f23244d5, "", "parentValue", "childValue", "d", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "Landroidx/compose/ui/semantics/r;", "thisRef", "Lkotlin/reflect/n;", a0.f133862j, ak.aF, "(Landroidx/compose/ui/semantics/r;Lkotlin/reflect/n;)Ljava/lang/Object;", "value", "Lkotlin/b2;", "e", "(Landroidx/compose/ui/semantics/r;Lkotlin/reflect/n;Ljava/lang/Object;)V", "", "toString", ak.av, "Ljava/lang/String;", "b", "()Ljava/lang/String;", "name", "Lkotlin/Function2;", "mergePolicy", "Lyh/p;", "()Lyh/p;", "<init>", "(Ljava/lang/String;Lyh/p;)V", "ui_release"}, k = 1, mv = {1, 7, 1})
public final class SemanticsPropertyKey<T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f16089c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final String name;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final yh.p<T, T, T> f16091b;

    /* JADX WARN: Multi-variable type inference failed */
    public SemanticsPropertyKey(@dl.d String name, @dl.d yh.p<? super T, ? super T, ? extends T> mergePolicy) {
        f0.p(name, "name");
        f0.p(mergePolicy, "mergePolicy");
        this.name = name;
        this.f16091b = mergePolicy;
    }

    public /* synthetic */ SemanticsPropertyKey(String str, yh.p pVar, int i10, u uVar) {
        this(str, (i10 & 2) != 0 ? new yh.p<T, T, T>() { // from class: androidx.compose.ui.semantics.SemanticsPropertyKey.1
            @Override // yh.p
            @dl.e
            public final T invoke(@dl.e T t10, T t11) {
                return t10 == null ? t11 : t10;
            }
        } : pVar);
    }

    @dl.d
    public final yh.p<T, T, T> a() {
        return this.f16091b;
    }

    @dl.d
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getName() {
        return this.name;
    }

    public final T c(@dl.d r thisRef, @dl.d kotlin.reflect.n<?> property) {
        f0.p(thisRef, "thisRef");
        f0.p(property, "property");
        return (T) SemanticsPropertiesKt.B0();
    }

    @dl.e
    public final T d(@dl.e T parentValue, T childValue) {
        return this.f16091b.invoke(parentValue, childValue);
    }

    public final void e(@dl.d r thisRef, @dl.d kotlin.reflect.n<?> property, T value) {
        f0.p(thisRef, "thisRef");
        f0.p(property, "property");
        thisRef.a(this, value);
    }

    @dl.d
    public String toString() {
        return "SemanticsPropertyKey: " + this.name;
    }
}
