package androidx.compose.ui.modifier;

import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: ModifierLocalNode.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0014\u001a\u0006\u0012\u0002\b\u00030\u000e¢\u0006\u0004\b\u0015\u0010\u0013J,\u0010\u0007\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0005\u001a\u00028\u0000H\u0090\u0002¢\u0006\u0004\b\u0007\u0010\bJ&\u0010\t\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0090\u0002¢\u0006\u0004\b\t\u0010\nJ\u001c\u0010\f\u001a\u00020\u000b2\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0090\u0002¢\u0006\u0004\b\f\u0010\rR&\u0010\u0014\u001a\u0006\u0012\u0002\b\u00030\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, d2 = {"Landroidx/compose/ui/modifier/a;", "Landroidx/compose/ui/modifier/h;", androidx.exifinterface.media.a.f23244d5, "Landroidx/compose/ui/modifier/c;", "key", "value", "Lkotlin/b2;", ak.aF, "(Landroidx/compose/ui/modifier/c;Ljava/lang/Object;)V", "b", "(Landroidx/compose/ui/modifier/c;)Ljava/lang/Object;", "", ak.av, "(Landroidx/compose/ui/modifier/c;)Z", "Landroidx/compose/ui/modifier/m;", "Landroidx/compose/ui/modifier/m;", "d", "()Landroidx/compose/ui/modifier/m;", "e", "(Landroidx/compose/ui/modifier/m;)V", "element", "<init>", "ui_release"}, k = 1, mv = {1, 7, 1})
public final class a extends h {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private m<?> element;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(@dl.d m<?> element) {
        super(null);
        f0.p(element, "element");
        this.element = element;
    }

    @Override // androidx.compose.ui.modifier.h
    public boolean a(@dl.d c<?> key) {
        f0.p(key, "key");
        return key == this.element.getKey();
    }

    @Override // androidx.compose.ui.modifier.h
    @dl.e
    public <T> T b(@dl.d c<T> key) {
        f0.p(key, "key");
        if (key == this.element.getKey()) {
            return (T) this.element.getValue();
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    @Override // androidx.compose.ui.modifier.h
    public <T> void c(@dl.d c<T> key, T value) {
        f0.p(key, "key");
        throw new IllegalStateException("Set is not allowed on a backwards compat provider".toString());
    }

    @dl.d
    public final m<?> d() {
        return this.element;
    }

    public final void e(@dl.d m<?> mVar) {
        f0.p(mVar, "<set-?>");
        this.element = mVar;
    }
}
