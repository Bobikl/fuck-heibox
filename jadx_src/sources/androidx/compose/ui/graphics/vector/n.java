package androidx.compose.ui.graphics.vector;

import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;
import org.apache.tools.ant.taskdefs.condition.a0;

/* JADX INFO: compiled from: VectorPainter.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J+\u0010\u0006\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0005\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0006\u0010\u0007ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0003"}, d2 = {"Landroidx/compose/ui/graphics/vector/n;", "", androidx.exifinterface.media.a.f23244d5, "Landroidx/compose/ui/graphics/vector/s;", a0.f133862j, "defaultValue", ak.av, "(Landroidx/compose/ui/graphics/vector/s;Ljava/lang/Object;)Ljava/lang/Object;", "ui_release"}, k = 1, mv = {1, 7, 1})
public interface n {

    /* JADX INFO: compiled from: VectorPainter.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class a {
        @Deprecated
        public static <T> T a(@dl.d n nVar, @dl.d s<T> property, T t10) {
            f0.p(property, "property");
            return (T) m.a(nVar, property, t10);
        }
    }

    <T> T a(@dl.d s<T> property, T defaultValue);
}
