package butterknife;

import android.util.Property;
import android.view.View;
import androidx.annotation.i1;
import androidx.annotation.n0;
import androidx.annotation.p0;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class ViewCollections {
    private ViewCollections() {
    }

    @i1
    public static <T extends View> void a(@n0 T t10, @n0 Action<? super T> action) {
        action.a(t10, 0);
    }

    @SafeVarargs
    @i1
    public static <T extends View> void b(@n0 T t10, @n0 Action<? super T>... actionArr) {
        for (Action<? super T> action : actionArr) {
            action.a(t10, 0);
        }
    }

    @i1
    public static <T extends View> void c(@n0 List<T> list, @n0 Action<? super T> action) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            action.a(list.get(i10), i10);
        }
    }

    @SafeVarargs
    @i1
    public static <T extends View> void d(@n0 List<T> list, @n0 Action<? super T>... actionArr) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            for (Action<? super T> action : actionArr) {
                action.a(list.get(i10), i10);
            }
        }
    }

    @i1
    public static <T extends View> void e(@n0 T[] tArr, @n0 Action<? super T> action) {
        int length = tArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            action.a(tArr[i10], i10);
        }
    }

    @SafeVarargs
    @i1
    public static <T extends View> void f(@n0 T[] tArr, @n0 Action<? super T>... actionArr) {
        int length = tArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            for (Action<? super T> action : actionArr) {
                action.a(tArr[i10], i10);
            }
        }
    }

    @i1
    public static <T extends View, V> void g(@n0 T t10, @n0 Property<? super T, V> property, @p0 V v10) {
        property.set(t10, v10);
    }

    @i1
    public static <T extends View, V> void h(@n0 T t10, @n0 Setter<? super T, V> setter, @p0 V v10) {
        setter.a(t10, v10, 0);
    }

    @i1
    public static <T extends View, V> void i(@n0 List<T> list, @n0 Property<? super T, V> property, @p0 V v10) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            property.set(list.get(i10), v10);
        }
    }

    @i1
    public static <T extends View, V> void j(@n0 List<T> list, @n0 Setter<? super T, V> setter, @p0 V v10) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            setter.a(list.get(i10), v10, i10);
        }
    }

    @i1
    public static <T extends View, V> void k(@n0 T[] tArr, @n0 Property<? super T, V> property, @p0 V v10) {
        for (T t10 : tArr) {
            property.set(t10, v10);
        }
    }

    @i1
    public static <T extends View, V> void l(@n0 T[] tArr, @n0 Setter<? super T, V> setter, @p0 V v10) {
        int length = tArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            setter.a(tArr[i10], v10, i10);
        }
    }
}
