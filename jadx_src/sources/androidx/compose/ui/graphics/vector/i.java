package androidx.compose.ui.graphics.vector;

import com.max.hbuikit.bean.param.UiKitSpanObj;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: ImageVector.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0083@\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B$\u0012\u0018\b\u0002\u0010\u0016\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0012j\b\u0012\u0004\u0012\u00028\u0000`\u0013ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\u0007\u001a\u00028\u0000¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00028\u0000¢\u0006\u0004\b\t\u0010\bJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0006R$\u0010\u0016\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0012j\b\u0012\u0004\u0012\u00028\u0000`\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0018\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u000f\u0088\u0001\u0016\u0092\u0001\u0012\u0012\u0004\u0012\u00028\u00000\u0012j\b\u0012\u0004\u0012\u00028\u0000`\u0013ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001b"}, d2 = {"Landroidx/compose/ui/graphics/vector/i;", androidx.exifinterface.media.a.f23244d5, "", "value", "", "j", "(Ljava/util/ArrayList;Ljava/lang/Object;)Z", "i", "(Ljava/util/ArrayList;)Ljava/lang/Object;", RXScreenCaptureService.KEY_HEIGHT, "", "k", "(Ljava/util/ArrayList;)Ljava/lang/String;", "", "g", "(Ljava/util/ArrayList;)I", "other", "d", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", ak.av, "Ljava/util/ArrayList;", "backing", "f", UiKitSpanObj.TYPE_SIZE, "b", "(Ljava/util/ArrayList;)Ljava/util/ArrayList;", "ui_release"}, k = 1, mv = {1, 7, 1})
@xh.f
public final class i<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final ArrayList<T> backing;

    private /* synthetic */ i(ArrayList arrayList) {
        this.backing = arrayList;
    }

    public static final /* synthetic */ i a(ArrayList arrayList) {
        return new i(arrayList);
    }

    @dl.d
    public static <T> ArrayList<T> b(@dl.d ArrayList<T> backing) {
        f0.p(backing, "backing");
        return backing;
    }

    public static /* synthetic */ ArrayList c(ArrayList arrayList, int i10, u uVar) {
        if ((i10 & 1) != 0) {
            arrayList = new ArrayList();
        }
        return b(arrayList);
    }

    public static boolean d(ArrayList<T> arrayList, Object obj) {
        return (obj instanceof i) && f0.g(arrayList, ((i) obj).getBacking());
    }

    public static final boolean e(ArrayList<T> arrayList, ArrayList<T> arrayList2) {
        return f0.g(arrayList, arrayList2);
    }

    public static final int f(ArrayList<T> arrayList) {
        return arrayList.size();
    }

    public static int g(ArrayList<T> arrayList) {
        return arrayList.hashCode();
    }

    public static final T h(ArrayList<T> arrayList) {
        return arrayList.get(f(arrayList) - 1);
    }

    public static final T i(ArrayList<T> arrayList) {
        return arrayList.remove(f(arrayList) - 1);
    }

    public static final boolean j(ArrayList<T> arrayList, T t10) {
        return arrayList.add(t10);
    }

    public static String k(ArrayList<T> arrayList) {
        return "Stack(backing=" + arrayList + ')';
    }

    public boolean equals(Object obj) {
        return d(this.backing, obj);
    }

    public int hashCode() {
        return g(this.backing);
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final /* synthetic */ ArrayList getBacking() {
        return this.backing;
    }

    public String toString() {
        return k(this.backing);
    }
}
