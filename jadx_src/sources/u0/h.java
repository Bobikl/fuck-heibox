package u0;

import com.starlightc.ucropplus.ui.UCropPlusActivity;
import com.umeng.analytics.pro.ak;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import yh.l;

/* JADX INFO: compiled from: ImmutableList.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001\u001aJ\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0004\u001a\u00028\u0000H&¢\u0006\u0004\b\u0005\u0010\u0006J\u001c\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H&J\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0004\u001a\u00028\u0000H&¢\u0006\u0004\b\n\u0010\u0006J\u001c\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H&J\"\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\r0\fH&J\u001c\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H&J\u000e\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000H&J$\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0013\u001a\u00020\u00122\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H&J%\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0004\u001a\u00028\u0000H&¢\u0006\u0004\b\u0015\u0010\u0016J%\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0004\u001a\u00028\u0000H&¢\u0006\u0004\b\u0005\u0010\u0016J\u0016\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0013\u001a\u00020\u0012H&J\u000e\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u001bÀ\u0006\u0001"}, d2 = {"Lu0/h;", androidx.exifinterface.media.a.S4, "Lu0/d;", "Lu0/g;", "element", "add", "(Ljava/lang/Object;)Lu0/h;", "", "elements", "addAll", "remove", "removeAll", "Lkotlin/Function1;", "", "predicate", "f", "retainAll", "clear", "", UCropPlusActivity.ARG_INDEX, ak.aF, "set", "(ILjava/lang/Object;)Lu0/h;", "K0", "Lu0/h$a;", "builder", ak.av, "runtime_release"}, k = 1, mv = {1, 7, 1})
public interface h<E> extends d<E>, g<E> {

    /* JADX INFO: compiled from: ImmutableList.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u00022\b\u0012\u0004\u0012\u00028\u00010\u0003J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Lu0/h$a;", androidx.exifinterface.media.a.S4, "", "Lu0/g$a;", "Lu0/h;", "build", "runtime_release"}, k = 1, mv = {1, 7, 1})
    public interface a<E> extends List<E>, g.a<E>, zh.e {
        @Override // u0.g.a
        @dl.d
        h<E> build();
    }

    @dl.d
    h<E> K0(int index);

    @dl.d
    h<E> add(int index, E element);

    @dl.d
    h<E> add(E element);

    @dl.d
    h<E> addAll(int index, @dl.d Collection<? extends E> c10);

    @dl.d
    h<E> addAll(@dl.d Collection<? extends E> elements);

    @dl.d
    a<E> builder();

    @dl.d
    h<E> clear();

    @dl.d
    h<E> f(@dl.d l<? super E, Boolean> lVar);

    @dl.d
    h<E> remove(E element);

    @dl.d
    h<E> removeAll(@dl.d Collection<? extends E> elements);

    @dl.d
    h<E> retainAll(@dl.d Collection<? extends E> elements);

    @dl.d
    h<E> set(int index, E element);
}
