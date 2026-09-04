package androidx.compose.runtime;

import com.max.hbuikit.bean.param.UiKitSpanObj;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.starlightc.ucropplus.ui.UCropPlusActivity;
import com.umeng.analytics.pro.ak;
import java.util.ArrayList;
import kotlin.Metadata;

/* JADX INFO: compiled from: Stack.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\u0007\u001a\u00028\u0000¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00028\u0000¢\u0006\u0004\b\t\u0010\bJ\u0015\u0010\f\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0006\u0010\u000e\u001a\u00020\u0004J\u0006\u0010\u000f\u001a\u00020\u0004J\u0006\u0010\u0011\u001a\u00020\u0010J\u0013\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012¢\u0006\u0004\b\u0013\u0010\u0014R$\u0010\u0018\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0015j\b\u0012\u0004\u0012\u00028\u0000`\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0017R\u0011\u0010\u001b\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001e"}, d2 = {"Landroidx/compose/runtime/l2;", androidx.exifinterface.media.a.f23244d5, "", "value", "", RXScreenCaptureService.KEY_HEIGHT, "(Ljava/lang/Object;)Z", "g", "()Ljava/lang/Object;", "e", "", UCropPlusActivity.ARG_INDEX, "f", "(I)Ljava/lang/Object;", ak.aF, "d", "Lkotlin/b2;", ak.av, "", "i", "()[Ljava/lang/Object;", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "Ljava/util/ArrayList;", "backing", "b", "()I", UiKitSpanObj.TYPE_SIZE, "<init>", "()V", "runtime_release"}, k = 1, mv = {1, 7, 1})
public final class l2<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final ArrayList<T> backing = new ArrayList<>();

    public final void a() {
        this.backing.clear();
    }

    public final int b() {
        return this.backing.size();
    }

    public final boolean c() {
        return this.backing.isEmpty();
    }

    public final boolean d() {
        return !c();
    }

    public final T e() {
        return this.backing.get(b() - 1);
    }

    public final T f(int index) {
        return this.backing.get(index);
    }

    public final T g() {
        return this.backing.remove(b() - 1);
    }

    public final boolean h(T value) {
        return this.backing.add(value);
    }

    @dl.d
    public final T[] i() {
        int size = this.backing.size();
        T[] tArr = (T[]) new Object[size];
        for (int i10 = 0; i10 < size; i10++) {
            tArr[i10] = this.backing.get(i10);
        }
        return tArr;
    }
}
