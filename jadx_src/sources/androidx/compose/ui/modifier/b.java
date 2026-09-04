package androidx.compose.ui.modifier;

import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: ModifierLocalNode.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ,\u0010\u0007\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0005\u001a\u00028\u0000H\u0090\u0002¢\u0006\u0004\b\u0007\u0010\bJ&\u0010\t\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0090\u0002¢\u0006\u0004\b\t\u0010\nJ\u001c\u0010\f\u001a\u00020\u000b2\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0090\u0002¢\u0006\u0004\b\f\u0010\r¨\u0006\u0010"}, d2 = {"Landroidx/compose/ui/modifier/b;", "Landroidx/compose/ui/modifier/h;", androidx.exifinterface.media.a.f23244d5, "Landroidx/compose/ui/modifier/c;", "key", "value", "", "d", "(Landroidx/compose/ui/modifier/c;Ljava/lang/Object;)Ljava/lang/Void;", "b", "(Landroidx/compose/ui/modifier/c;)Ljava/lang/Object;", "", ak.av, "(Landroidx/compose/ui/modifier/c;)Z", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 7, 1})
public final class b extends h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    public static final b f15063b = new b();

    private b() {
        super(null);
    }

    @Override // androidx.compose.ui.modifier.h
    public boolean a(@dl.d c<?> key) {
        f0.p(key, "key");
        return false;
    }

    @Override // androidx.compose.ui.modifier.h
    @dl.e
    public <T> T b(@dl.d c<T> key) {
        f0.p(key, "key");
        throw new IllegalStateException("".toString());
    }

    @Override // androidx.compose.ui.modifier.h
    @dl.d
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public <T> Void c(@dl.d c<T> key, T value) {
        f0.p(key, "key");
        throw new IllegalStateException("".toString());
    }
}
