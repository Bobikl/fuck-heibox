package kotlin.enums;

import dl.d;
import kotlin.jvm.internal.f0;
import kotlin.q;
import kotlin.r0;
import kotlin.u0;
import org.apache.tools.ant.util.s0;

/* JADX INFO: compiled from: EnumEntries.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class EnumEntriesKt {
    @u0(version = s0.f136934y)
    @d
    @r0
    @q
    public static final <E extends Enum<E>> a<E> a(@d yh.a<E[]> entriesProvider) {
        f0.p(entriesProvider, "entriesProvider");
        return new EnumEntriesList(entriesProvider);
    }

    @u0(version = s0.f136934y)
    @d
    @r0
    @q
    public static final <E extends Enum<E>> a<E> b(@d final E[] entries) {
        f0.p(entries, "entries");
        EnumEntriesList enumEntriesList = new EnumEntriesList(new yh.a<E[]>() { // from class: kotlin.enums.EnumEntriesKt$enumEntries$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Incorrect types in method signature: ([TE;)V */
            {
                super(0);
            }

            /* JADX WARN: Incorrect return type in method signature: ()[TE; */
            @Override // yh.a
            @d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Enum[] invoke() {
                return entries;
            }
        });
        enumEntriesList.size();
        return enumEntriesList;
    }
}
