package androidx.compose.foundation.lazy.layout;

import com.max.hbuikit.bean.param.UiKitSpanObj;
import com.starlightc.ucropplus.ui.UCropPlusActivity;
import com.umeng.analytics.pro.ak;
import io.flutter.plugin.editing.SpellCheckPlugin;
import kotlin.Metadata;
import kotlin.b2;

/* JADX INFO: compiled from: IntervalList.kt */
/* JADX INFO: loaded from: classes.dex */
@androidx.compose.foundation.t
@Metadata(bv = {}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\bw\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002:\u0001\rJ\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\u0006\u0010\u0004\u001a\u00020\u0003H¦\u0002J6\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\u0018\u0010\u000b\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0004\u0012\u00020\n0\tH&R\u0014\u0010\u000f\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e\u0082\u0001\u0001\u0010ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0011À\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/lazy/layout/c;", androidx.exifinterface.media.a.f23244d5, "", "", UCropPlusActivity.ARG_INDEX, "Landroidx/compose/foundation/lazy/layout/c$a;", "get", "fromIndex", "toIndex", "Lkotlin/Function1;", "Lkotlin/b2;", "block", "b", ak.av, "()I", UiKitSpanObj.TYPE_SIZE, "Landroidx/compose/foundation/lazy/layout/s;", "foundation_release"}, k = 1, mv = {1, 7, 1})
public interface c<T> {

    /* JADX INFO: compiled from: IntervalList.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\r\b\u0007\u0018\u0000*\u0006\b\u0001\u0010\u0001 \u00012\u00020\u0002B!\b\u0000\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00028\u0001¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\b\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u0017\u0010\t\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0005\u001a\u0004\b\u0004\u0010\u0007R\u0017\u0010\r\u001a\u00028\u00018\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\f¨\u0006\u0010"}, d2 = {"Landroidx/compose/foundation/lazy/layout/c$a;", androidx.exifinterface.media.a.f23244d5, "", "", ak.av, "I", "b", "()I", SpellCheckPlugin.START_INDEX_KEY, UiKitSpanObj.TYPE_SIZE, ak.aF, "Ljava/lang/Object;", "()Ljava/lang/Object;", "value", "<init>", "(IILjava/lang/Object;)V", "foundation_release"}, k = 1, mv = {1, 7, 1})
    @androidx.compose.runtime.internal.o(parameters = 1)
    public static final class a<T> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f7135d = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final int startIndex;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final int size;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final T value;

        public a(int i10, int i11, T t10) {
            this.startIndex = i10;
            this.size = i11;
            this.value = t10;
            if (!(i10 >= 0)) {
                throw new IllegalArgumentException(("startIndex should be >= 0, but was " + i10).toString());
            }
            if (i11 > 0) {
                return;
            }
            throw new IllegalArgumentException(("size should be >0, but was " + i11).toString());
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final int getSize() {
            return this.size;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final int getStartIndex() {
            return this.startIndex;
        }

        public final T c() {
            return this.value;
        }
    }

    int a();

    void b(int i10, int i11, @dl.d yh.l<? super a<? extends T>, b2> lVar);

    @dl.d
    a<T> get(int index);
}
