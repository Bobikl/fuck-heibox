package androidx.compose.ui.input.pointer;

import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: PointerEvent.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087@\u0018\u00002\u00020\u0001B\u0016\u0012\n\u0010\u000f\u001a\u00060\u0005j\u0002`\fø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u0018\u0010\u000f\u001a\u00060\u0005j\u0002`\f8\u0000X\u0080\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e\u0088\u0001\u000f\u0092\u0001\u00060\u0005j\u0002`\fø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0011"}, d2 = {"Landroidx/compose/ui/input/pointer/l0;", "", "", "f", "(I)Ljava/lang/String;", "", "e", "(I)I", "other", "", ak.aF, "(ILjava/lang/Object;)Z", "Landroidx/compose/ui/input/pointer/NativePointerKeyboardModifiers;", ak.av, "I", "packedValue", "b", "ui_release"}, k = 1, mv = {1, 7, 1})
@xh.f
public final class l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int packedValue;

    private /* synthetic */ l0(int i10) {
        this.packedValue = i10;
    }

    public static final /* synthetic */ l0 a(int i10) {
        return new l0(i10);
    }

    public static int b(int i10) {
        return i10;
    }

    public static boolean c(int i10, Object obj) {
        return (obj instanceof l0) && i10 == ((l0) obj).getPackedValue();
    }

    public static final boolean d(int i10, int i11) {
        return i10 == i11;
    }

    public static int e(int i10) {
        return i10;
    }

    public static String f(int i10) {
        return "PointerKeyboardModifiers(packedValue=" + i10 + ')';
    }

    public boolean equals(Object obj) {
        return c(this.packedValue, obj);
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final /* synthetic */ int getPackedValue() {
        return this.packedValue;
    }

    public int hashCode() {
        return e(this.packedValue);
    }

    public String toString() {
        return f(this.packedValue);
    }
}
