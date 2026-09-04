package androidx.compose.ui.modifier;

import androidx.compose.runtime.e2;
import androidx.compose.runtime.snapshots.t;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.s0;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: ModifierLocalNode.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B?\u00126\u0010\u0014\u001a\u001c\u0012\u0018\b\u0001\u0012\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u00130\u0012\"\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u0013¢\u0006\u0004\b\u0015\u0010\u0016J,\u0010\u0007\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0005\u001a\u00028\u0000H\u0090\u0002¢\u0006\u0004\b\u0007\u0010\bJ&\u0010\t\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0090\u0002¢\u0006\u0004\b\t\u0010\nJ\u001c\u0010\f\u001a\u00020\u000b2\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0090\u0002¢\u0006\u0004\b\f\u0010\rR&\u0010\u0011\u001a\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0010¨\u0006\u0017"}, d2 = {"Landroidx/compose/ui/modifier/o;", "Landroidx/compose/ui/modifier/h;", androidx.exifinterface.media.a.f23244d5, "Landroidx/compose/ui/modifier/c;", "key", "value", "Lkotlin/b2;", ak.aF, "(Landroidx/compose/ui/modifier/c;Ljava/lang/Object;)V", "b", "(Landroidx/compose/ui/modifier/c;)Ljava/lang/Object;", "", ak.av, "(Landroidx/compose/ui/modifier/c;)Z", "Landroidx/compose/runtime/snapshots/t;", "", "Landroidx/compose/runtime/snapshots/t;", "map", "", "Lkotlin/Pair;", "entries", "<init>", "([Lkotlin/Pair;)V", "ui_release"}, k = 1, mv = {1, 7, 1})
public final class o extends h {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final t<c<?>, Object> map;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(@dl.d Pair<? extends c<?>, ? extends Object>... entries) {
        super(null);
        f0.p(entries, "entries");
        t<c<?>, Object> tVarH = e2.h();
        this.map = tVarH;
        tVarH.putAll(s0.H0(entries));
    }

    @Override // androidx.compose.ui.modifier.h
    public boolean a(@dl.d c<?> key) {
        f0.p(key, "key");
        return this.map.containsKey(key);
    }

    @Override // androidx.compose.ui.modifier.h
    @dl.e
    public <T> T b(@dl.d c<T> key) {
        f0.p(key, "key");
        T t10 = (T) this.map.get(key);
        if (t10 == null) {
            return null;
        }
        return t10;
    }

    @Override // androidx.compose.ui.modifier.h
    public <T> void c(@dl.d c<T> key, T value) {
        f0.p(key, "key");
        this.map.put(key, value);
    }
}
