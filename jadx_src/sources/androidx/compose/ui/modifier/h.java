package androidx.compose.ui.modifier;

import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: ModifierLocalNode.kt */
/* JADX INFO: loaded from: classes.dex */
@androidx.compose.ui.g
@androidx.compose.runtime.internal.o(parameters = 0)
@Metadata(bv = {}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001B\t\b\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ,\u0010\u0007\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0005\u001a\u00028\u0000H \u0002¢\u0006\u0004\b\u0007\u0010\bJ&\u0010\t\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H \u0002¢\u0006\u0004\b\t\u0010\nJ\u001c\u0010\f\u001a\u00020\u000b2\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003H \u0002¢\u0006\u0004\b\f\u0010\r\u0082\u0001\u0004\u0010\u0011\u0012\u0013¨\u0006\u0014"}, d2 = {"Landroidx/compose/ui/modifier/h;", "", androidx.exifinterface.media.a.f23244d5, "Landroidx/compose/ui/modifier/c;", "key", "value", "Lkotlin/b2;", ak.aF, "(Landroidx/compose/ui/modifier/c;Ljava/lang/Object;)V", "b", "(Landroidx/compose/ui/modifier/c;)Ljava/lang/Object;", "", ak.av, "(Landroidx/compose/ui/modifier/c;)Z", "<init>", "()V", "Landroidx/compose/ui/modifier/a;", "Landroidx/compose/ui/modifier/b;", "Landroidx/compose/ui/modifier/o;", "Landroidx/compose/ui/modifier/q;", "ui_release"}, k = 1, mv = {1, 7, 1})
public abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f15066a = 0;

    private h() {
    }

    public /* synthetic */ h(u uVar) {
        this();
    }

    public abstract boolean a(@dl.d c<?> key);

    @dl.e
    public abstract <T> T b(@dl.d c<T> key);

    public abstract <T> void c(@dl.d c<T> key, T value);
}
