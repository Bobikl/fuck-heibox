package u0;

import com.umeng.analytics.pro.ak;
import java.util.Collection;
import java.util.Set;
import kotlin.Metadata;
import yh.l;

/* JADX INFO: compiled from: ImmutableSet.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001\u0014J\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0004\u001a\u00028\u0000H&¢\u0006\u0004\b\u0005\u0010\u0006J\u001c\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H&J\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0004\u001a\u00028\u0000H&¢\u0006\u0004\b\n\u0010\u0006J\u001c\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H&J\"\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\r0\fH&J\u001c\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H&J\u000e\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000H&J\u000e\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0015À\u0006\u0001"}, d2 = {"Lu0/j;", androidx.exifinterface.media.a.S4, "Lu0/f;", "Lu0/g;", "element", "add", "(Ljava/lang/Object;)Lu0/j;", "", "elements", "addAll", "remove", "removeAll", "Lkotlin/Function1;", "", "predicate", "f", "retainAll", "clear", "Lu0/j$a;", "builder", ak.av, "runtime_release"}, k = 1, mv = {1, 7, 1})
public interface j<E> extends f<E>, g<E> {

    /* JADX INFO: compiled from: ImmutableSet.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u00022\b\u0012\u0004\u0012\u00028\u00010\u0003J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Lu0/j$a;", androidx.exifinterface.media.a.S4, "", "Lu0/g$a;", "Lu0/j;", "build", "runtime_release"}, k = 1, mv = {1, 7, 1})
    public interface a<E> extends Set<E>, g.a<E>, zh.h {
        @Override // u0.g.a
        @dl.d
        j<E> build();
    }

    @dl.d
    j<E> add(E element);

    @dl.d
    j<E> addAll(@dl.d Collection<? extends E> elements);

    @dl.d
    a<E> builder();

    @dl.d
    j<E> clear();

    @dl.d
    j<E> f(@dl.d l<? super E, Boolean> lVar);

    @dl.d
    j<E> remove(E element);

    @dl.d
    j<E> removeAll(@dl.d Collection<? extends E> elements);

    @dl.d
    j<E> retainAll(@dl.d Collection<? extends E> elements);
}
