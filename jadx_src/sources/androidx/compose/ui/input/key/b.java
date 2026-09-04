package androidx.compose.ui.input.key;

import android.view.KeyEvent;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: KeyEvent.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087@\u0018\u00002\u00020\u0001B\u0016\u0012\n\u0010\u0012\u001a\u00060\fj\u0002`\rø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u001b\u0010\u0012\u001a\u00060\fj\u0002`\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\u0088\u0001\u0012\u0092\u0001\u00060\fj\u0002`\rø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0015"}, d2 = {"Landroidx/compose/ui/input/key/b;", "", "", "g", "(Landroid/view/KeyEvent;)Ljava/lang/String;", "", "f", "(Landroid/view/KeyEvent;)I", "other", "", ak.aF, "(Landroid/view/KeyEvent;Ljava/lang/Object;)Z", "Landroid/view/KeyEvent;", "Landroidx/compose/ui/input/key/NativeKeyEvent;", ak.av, "Landroid/view/KeyEvent;", "e", "()Landroid/view/KeyEvent;", "nativeKeyEvent", "b", "(Landroid/view/KeyEvent;)Landroid/view/KeyEvent;", "ui_release"}, k = 1, mv = {1, 7, 1})
@xh.f
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final KeyEvent nativeKeyEvent;

    private /* synthetic */ b(KeyEvent keyEvent) {
        this.nativeKeyEvent = keyEvent;
    }

    public static final /* synthetic */ b a(KeyEvent keyEvent) {
        return new b(keyEvent);
    }

    @dl.d
    public static KeyEvent b(@dl.d KeyEvent nativeKeyEvent) {
        f0.p(nativeKeyEvent, "nativeKeyEvent");
        return nativeKeyEvent;
    }

    public static boolean c(KeyEvent keyEvent, Object obj) {
        return (obj instanceof b) && f0.g(keyEvent, ((b) obj).h());
    }

    public static final boolean d(KeyEvent keyEvent, KeyEvent keyEvent2) {
        return f0.g(keyEvent, keyEvent2);
    }

    public static int f(KeyEvent keyEvent) {
        return keyEvent.hashCode();
    }

    public static String g(KeyEvent keyEvent) {
        return "KeyEvent(nativeKeyEvent=" + keyEvent + ')';
    }

    @dl.d
    /* JADX INFO: renamed from: e, reason: from getter */
    public final KeyEvent getNativeKeyEvent() {
        return this.nativeKeyEvent;
    }

    public boolean equals(Object obj) {
        return c(this.nativeKeyEvent, obj);
    }

    public final /* synthetic */ KeyEvent h() {
        return this.nativeKeyEvent;
    }

    public int hashCode() {
        return f(this.nativeKeyEvent);
    }

    public String toString() {
        return g(this.nativeKeyEvent);
    }
}
