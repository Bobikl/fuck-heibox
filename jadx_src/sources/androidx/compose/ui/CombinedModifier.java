package androidx.compose.ui;

import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: Modifier.kt */
/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0001\u0012\u0006\u0010\u001c\u001a\u00020\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ7\u0010\u0007\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00028\u00002\u0018\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00028\u00000\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ7\u0010\t\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00028\u00002\u0018\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000\u0004H\u0016¢\u0006\u0004\b\t\u0010\bJ\u001c\u0010\r\u001a\u00020\u000b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000b0\nH\u0016J\u001c\u0010\u000e\u001a\u00020\u000b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000b0\nH\u0016J\u0013\u0010\u0011\u001a\u00020\u000b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0096\u0002J\b\u0010\u0013\u001a\u00020\u0012H\u0016J\b\u0010\u0015\u001a\u00020\u0014H\u0016R\u001a\u0010\u001a\u001a\u00020\u00018\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001c\u001a\u00020\u00018\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019¨\u0006\u001f"}, d2 = {"Landroidx/compose/ui/CombinedModifier;", "Landroidx/compose/ui/n;", "R", "initial", "Lkotlin/Function2;", "Landroidx/compose/ui/n$c;", "operation", "x", "(Ljava/lang/Object;Lyh/p;)Ljava/lang/Object;", "v", "Lkotlin/Function1;", "", "predicate", "t", "a0", "", "other", "equals", "", "hashCode", "", "toString", "b", "Landroidx/compose/ui/n;", ak.aF, "()Landroidx/compose/ui/n;", "outer", ak.av, ak.au, "<init>", "(Landroidx/compose/ui/n;Landroidx/compose/ui/n;)V", "ui_release"}, k = 1, mv = {1, 7, 1})
public final class CombinedModifier implements n {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f13382d = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final n outer;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final n inner;

    public CombinedModifier(@dl.d n outer, @dl.d n inner) {
        f0.p(outer, "outer");
        f0.p(inner, "inner");
        this.outer = outer;
        this.inner = inner;
    }

    @dl.d
    /* JADX INFO: renamed from: a, reason: from getter */
    public final n getInner() {
        return this.inner;
    }

    @Override // androidx.compose.ui.n
    public boolean a0(@dl.d yh.l<? super n.c, Boolean> predicate) {
        f0.p(predicate, "predicate");
        return this.outer.a0(predicate) && this.inner.a0(predicate);
    }

    @dl.d
    /* JADX INFO: renamed from: c, reason: from getter */
    public final n getOuter() {
        return this.outer;
    }

    public boolean equals(@dl.e Object other) {
        if (other instanceof CombinedModifier) {
            CombinedModifier combinedModifier = (CombinedModifier) other;
            if (f0.g(this.outer, combinedModifier.outer) && f0.g(this.inner, combinedModifier.inner)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.outer.hashCode() + (this.inner.hashCode() * 31);
    }

    @Override // androidx.compose.ui.n
    public /* synthetic */ n s0(n nVar) {
        return m.a(this, nVar);
    }

    @Override // androidx.compose.ui.n
    public boolean t(@dl.d yh.l<? super n.c, Boolean> predicate) {
        f0.p(predicate, "predicate");
        return this.outer.t(predicate) || this.inner.t(predicate);
    }

    @dl.d
    public String toString() {
        return '[' + ((String) x("", new yh.p<String, n.c, String>() { // from class: androidx.compose.ui.CombinedModifier.toString.1
            @Override // yh.p
            @dl.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke(@dl.d String acc, @dl.d n.c element) {
                f0.p(acc, "acc");
                f0.p(element, "element");
                if (acc.length() == 0) {
                    return element.toString();
                }
                return acc + ", " + element;
            }
        })) + ']';
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.ui.n
    public <R> R v(R initial, @dl.d yh.p<? super n.c, ? super R, ? extends R> operation) {
        f0.p(operation, "operation");
        return (R) this.outer.v(this.inner.v(initial, operation), operation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.ui.n
    public <R> R x(R initial, @dl.d yh.p<? super R, ? super n.c, ? extends R> operation) {
        f0.p(operation, "operation");
        return (R) this.inner.x(this.outer.x(initial, operation), operation);
    }
}
