package androidx.compose.ui.modifier;

import androidx.compose.runtime.a1;
import androidx.compose.runtime.h2;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: ModifierLocalNode.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\b¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006J,\u0010\n\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b2\u0006\u0010\u0003\u001a\u00028\u0000H\u0090\u0002¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0090\u0002¢\u0006\u0004\b\f\u0010\rJ\u001c\u0010\u000f\u001a\u00020\u000e2\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\bH\u0090\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u0018\u0010\t\u001a\u0006\u0012\u0002\b\u00030\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0011R/\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0012\u001a\u0004\u0018\u00010\u00028B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\n\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0006¨\u0006\u0019"}, d2 = {"Landroidx/compose/ui/modifier/q;", "Landroidx/compose/ui/modifier/h;", "", "value", "Lkotlin/b2;", "d", "(Ljava/lang/Object;)V", androidx.exifinterface.media.a.f23244d5, "Landroidx/compose/ui/modifier/c;", "key", ak.aF, "(Landroidx/compose/ui/modifier/c;Ljava/lang/Object;)V", "b", "(Landroidx/compose/ui/modifier/c;)Ljava/lang/Object;", "", ak.av, "(Landroidx/compose/ui/modifier/c;)Z", "Landroidx/compose/ui/modifier/c;", "<set-?>", "Landroidx/compose/runtime/a1;", "e", "()Ljava/lang/Object;", "f", "<init>", "(Landroidx/compose/ui/modifier/c;)V", "ui_release"}, k = 1, mv = {1, 7, 1})
public final class q extends h {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final c<?> key;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final a1 value;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(@dl.d c<?> key) {
        super(null);
        f0.p(key, "key");
        this.key = key;
        this.value = h2.g(null, null, 2, null);
    }

    private final Object e() {
        return this.value.getValue();
    }

    private final void f(Object obj) {
        this.value.setValue(obj);
    }

    @Override // androidx.compose.ui.modifier.h
    public boolean a(@dl.d c<?> key) {
        f0.p(key, "key");
        return key == this.key;
    }

    @Override // androidx.compose.ui.modifier.h
    @dl.e
    public <T> T b(@dl.d c<T> key) {
        f0.p(key, "key");
        if (!(key == this.key)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        T t10 = (T) e();
        if (t10 == null) {
            return null;
        }
        return t10;
    }

    @Override // androidx.compose.ui.modifier.h
    public <T> void c(@dl.d c<T> key, T value) {
        f0.p(key, "key");
        if (!(key == this.key)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        f(value);
    }

    public final void d(@dl.e Object value) {
        f(value);
    }
}
