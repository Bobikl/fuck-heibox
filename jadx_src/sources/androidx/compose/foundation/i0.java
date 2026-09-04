package androidx.compose.foundation;

import com.max.hbuikit.bean.param.UiKitSpanObj;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: PlatformMagnifier.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J-\u0010\t\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000b\u001a\u00020\u0002H&R\u001d\u0010\u000f\u001a\u00020\f8&X¦\u0004ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eø\u0001\u0003\u0082\u0002\u0015\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!\n\u0004\b!0\u0001¨\u0006\u0010À\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/i0;", "", "Lkotlin/b2;", ak.aF, "Lb1/f;", "sourceCenter", "magnifierCenter", "", "zoom", "b", "(JJF)V", com.heybox.imageviewer.l.f59758c, "Ls1/r;", ak.av, "()J", UiKitSpanObj.TYPE_SIZE, "foundation_release"}, k = 1, mv = {1, 7, 1})
public interface i0 {
    long a();

    void b(long sourceCenter, long magnifierCenter, float zoom);

    void c();

    void dismiss();
}
