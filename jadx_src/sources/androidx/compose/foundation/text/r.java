package androidx.compose.foundation.text;

import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: LongPressTextDragObserver.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b`\u0018\u00002\u00020\u0001J\u001d\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0007\u001a\u00020\u0004H&J\u001d\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\u0006J\u001d\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0002H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\u0006J\b\u0010\f\u001a\u00020\u0004H&J\b\u0010\r\u001a\u00020\u0004H&ø\u0001\u0002\u0082\u0002\u0011\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0004\b!0\u0001¨\u0006\u000eÀ\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/text/r;", "", "Lb1/f;", "point", "Lkotlin/b2;", ak.av, "(J)V", "d", "startPoint", ak.aF, "delta", "b", "onStop", "onCancel", "foundation_release"}, k = 1, mv = {1, 7, 1})
public interface r {
    void a(long point);

    void b(long delta);

    void c(long startPoint);

    void d();

    void onCancel();

    void onStop();
}
