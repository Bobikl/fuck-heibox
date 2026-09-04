package androidx.compose.ui.semantics;

import androidx.compose.foundation.b0;
import androidx.compose.ui.platform.a1;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;
import kotlin.u;

/* JADX INFO: compiled from: SemanticsConfiguration.kt */
/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0010&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010%\n\u0002\b\u0010\b\u0007\u0018\u00002\u00020\u00012\u001a\u0012\u0016\u0012\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00030\u0002B\u0007¢\u0006\u0004\b1\u00102J$\u0010\b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0086\u0002¢\u0006\u0004\b\b\u0010\tJ/\u0010\f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n¢\u0006\u0004\b\f\u0010\rJ3\u0010\u000e\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u000e\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\n¢\u0006\u0004\b\u000e\u0010\rJ!\u0010\u0010\u001a\u001a\u0012\u0016\u0012\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00030\u000fH\u0096\u0002J,\u0010\u0013\u001a\u00020\u0012\"\u0004\b\u0000\u0010\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\u0011\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0016\u001a\u00020\u0015\"\u0004\b\u0000\u0010\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0086\u0002J\u0017\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u001b\u0010\u0019J\u0006\u0010\u001c\u001a\u00020\u0000J\u0013\u0010\u001e\u001a\u00020\u00152\b\u0010\u001d\u001a\u0004\u0018\u00010\u0005H\u0096\u0002J\b\u0010 \u001a\u00020\u001fH\u0016J\b\u0010\"\u001a\u00020!H\u0016R&\u0010%\u001a\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010$R\"\u0010,\u001a\u00020\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\"\u00100\u001a\u00020\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b-\u0010'\u001a\u0004\b.\u0010)\"\u0004\b/\u0010+¨\u00063"}, d2 = {"Landroidx/compose/ui/semantics/j;", "Landroidx/compose/ui/semantics/r;", "", "", "Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "", androidx.exifinterface.media.a.f23244d5, "key", RXScreenCaptureService.KEY_HEIGHT, "(Landroidx/compose/ui/semantics/SemanticsPropertyKey;)Ljava/lang/Object;", "Lkotlin/Function0;", "defaultValue", "i", "(Landroidx/compose/ui/semantics/SemanticsPropertyKey;Lyh/a;)Ljava/lang/Object;", "j", "", "iterator", "value", "Lkotlin/b2;", ak.av, "(Landroidx/compose/ui/semantics/SemanticsPropertyKey;Ljava/lang/Object;)V", "", "e", "child", ak.aB, "(Landroidx/compose/ui/semantics/j;)V", "peer", "b", "g", "other", "equals", "", "hashCode", "", "toString", "", "Ljava/util/Map;", "props", ak.aF, "Z", "o", "()Z", "v", "(Z)V", "isMergingSemanticsOfDescendants", "d", "l", ak.aG, "isClearingSemantics", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 7, 1})
public final class j implements r, Iterable<Map.Entry<? extends SemanticsPropertyKey<?>, ? extends Object>>, zh.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f16147e = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final Map<SemanticsPropertyKey<?>, Object> props = new LinkedHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private boolean isMergingSemanticsOfDescendants;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private boolean isClearingSemantics;

    @Override // androidx.compose.ui.semantics.r
    public <T> void a(@dl.d SemanticsPropertyKey<T> key, T value) {
        f0.p(key, "key");
        this.props.put(key, value);
    }

    public final void b(@dl.d j peer) {
        f0.p(peer, "peer");
        if (peer.isMergingSemanticsOfDescendants) {
            this.isMergingSemanticsOfDescendants = true;
        }
        if (peer.isClearingSemantics) {
            this.isClearingSemantics = true;
        }
        for (Map.Entry<SemanticsPropertyKey<?>, Object> entry : peer.props.entrySet()) {
            SemanticsPropertyKey<?> key = entry.getKey();
            Object value = entry.getValue();
            if (!this.props.containsKey(key)) {
                this.props.put(key, value);
            } else if (value instanceof AccessibilityAction) {
                Object obj = this.props.get(key);
                f0.n(obj, "null cannot be cast to non-null type androidx.compose.ui.semantics.AccessibilityAction<*>");
                AccessibilityAction accessibilityAction = (AccessibilityAction) obj;
                Map<SemanticsPropertyKey<?>, Object> map = this.props;
                String label = accessibilityAction.getLabel();
                if (label == null) {
                    label = ((AccessibilityAction) value).getLabel();
                }
                u uVarA = accessibilityAction.a();
                if (uVarA == null) {
                    uVarA = ((AccessibilityAction) value).a();
                }
                map.put(key, new AccessibilityAction(label, uVarA));
            }
        }
    }

    public final <T> boolean e(@dl.d SemanticsPropertyKey<T> key) {
        f0.p(key, "key");
        return this.props.containsKey(key);
    }

    public boolean equals(@dl.e Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof j)) {
            return false;
        }
        j jVar = (j) other;
        return f0.g(this.props, jVar.props) && this.isMergingSemanticsOfDescendants == jVar.isMergingSemanticsOfDescendants && this.isClearingSemantics == jVar.isClearingSemantics;
    }

    @dl.d
    public final j g() {
        j jVar = new j();
        jVar.isMergingSemanticsOfDescendants = this.isMergingSemanticsOfDescendants;
        jVar.isClearingSemantics = this.isClearingSemantics;
        jVar.props.putAll(this.props);
        return jVar;
    }

    public final <T> T h(@dl.d SemanticsPropertyKey<T> key) {
        f0.p(key, "key");
        T t10 = (T) this.props.get(key);
        if (t10 != null) {
            return t10;
        }
        throw new IllegalStateException("Key not present: " + key + " - consider getOrElse or getOrNull");
    }

    public int hashCode() {
        return (((this.props.hashCode() * 31) + b0.a(this.isMergingSemanticsOfDescendants)) * 31) + b0.a(this.isClearingSemantics);
    }

    public final <T> T i(@dl.d SemanticsPropertyKey<T> key, @dl.d yh.a<? extends T> defaultValue) {
        f0.p(key, "key");
        f0.p(defaultValue, "defaultValue");
        T t10 = (T) this.props.get(key);
        return t10 == null ? defaultValue.invoke() : t10;
    }

    @Override // java.lang.Iterable
    @dl.d
    public Iterator<Map.Entry<? extends SemanticsPropertyKey<?>, ? extends Object>> iterator() {
        return this.props.entrySet().iterator();
    }

    @dl.e
    public final <T> T j(@dl.d SemanticsPropertyKey<T> key, @dl.d yh.a<? extends T> defaultValue) {
        f0.p(key, "key");
        f0.p(defaultValue, "defaultValue");
        T t10 = (T) this.props.get(key);
        return t10 == null ? defaultValue.invoke() : t10;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final boolean getIsClearingSemantics() {
        return this.isClearingSemantics;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final boolean getIsMergingSemanticsOfDescendants() {
        return this.isMergingSemanticsOfDescendants;
    }

    public final void s(@dl.d j child) {
        f0.p(child, "child");
        for (Map.Entry<SemanticsPropertyKey<?>, Object> entry : child.props.entrySet()) {
            SemanticsPropertyKey<?> key = entry.getKey();
            Object value = entry.getValue();
            Object obj = this.props.get(key);
            f0.n(key, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsPropertyKey<kotlin.Any?>");
            Object objD = key.d(obj, value);
            if (objD != null) {
                this.props.put(key, objD);
            }
        }
    }

    @dl.d
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        String str = "";
        if (this.isMergingSemanticsOfDescendants) {
            sb2.append("");
            sb2.append("mergeDescendants=true");
            str = ", ";
        }
        if (this.isClearingSemantics) {
            sb2.append(str);
            sb2.append("isClearingSemantics=true");
            str = ", ";
        }
        for (Map.Entry<SemanticsPropertyKey<?>, Object> entry : this.props.entrySet()) {
            SemanticsPropertyKey<?> key = entry.getKey();
            Object value = entry.getValue();
            sb2.append(str);
            sb2.append(key.getName());
            sb2.append(" : ");
            sb2.append(value);
            str = ", ";
        }
        return a1.b(this, null) + "{ " + ((Object) sb2) + " }";
    }

    public final void u(boolean z10) {
        this.isClearingSemantics = z10;
    }

    public final void v(boolean z10) {
        this.isMergingSemanticsOfDescendants = z10;
    }
}
