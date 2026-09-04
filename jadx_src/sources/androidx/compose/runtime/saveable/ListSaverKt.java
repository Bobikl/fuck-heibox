package androidx.compose.runtime.saveable;

import com.umeng.analytics.pro.ak;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.w0;
import yh.l;
import yh.p;

/* JADX INFO: compiled from: ListSaver.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u00002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u001a}\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000e0\r\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u000122\u0010\t\u001a.\u0012\u0004\u0012\u00020\u0003\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00070\u0002¢\u0006\u0002\b\b2)\u0010\f\u001a%\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00028\u00010\u0007¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u000b\u0012\u0006\u0012\u0004\u0018\u00018\u00000\n¨\u0006\u0010"}, d2 = {"Original", "Saveable", "Lkotlin/Function2;", "Landroidx/compose/runtime/saveable/f;", "Lkotlin/m0;", "name", "value", "", "Lkotlin/t;", "save", "Lkotlin/Function1;", "list", "restore", "Landroidx/compose/runtime/saveable/e;", "", ak.av, "runtime-saveable_release"}, k = 2, mv = {1, 7, 1})
public final class ListSaverKt {
    @dl.d
    public static final <Original, Saveable> e<Original, Object> a(@dl.d final p<? super f, ? super Original, ? extends List<? extends Saveable>> save, @dl.d l<? super List<? extends Saveable>, ? extends Original> restore) {
        f0.p(save, "save");
        f0.p(restore, "restore");
        return SaverKt.a(new p<f, Original, Object>() { // from class: androidx.compose.runtime.saveable.ListSaverKt$listSaver$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            @Override // yh.p
            @dl.e
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(@dl.d f Saver, Original original) {
                f0.p(Saver, "$this$Saver");
                List list = (List) save.invoke(Saver, original);
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    Object obj = list.get(i10);
                    if (obj != null && !Saver.a(obj)) {
                        throw new IllegalArgumentException("Failed requirement.".toString());
                    }
                }
                if (!list.isEmpty()) {
                    return new ArrayList(list);
                }
                return null;
            }
        }, (l) w0.q(restore, 1));
    }
}
