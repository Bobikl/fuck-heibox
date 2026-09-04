package p1;

import androidx.compose.runtime.m0;
import com.max.hbuikit.bean.param.UiKitSpanObj;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import com.xiaomi.mipush.sdk.Constants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: renamed from: p1.f, reason: from toString */
/* JADX INFO: compiled from: LocaleList.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010(\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\f\n\u0002\u0010\u0011\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001$B\u0015\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u0014¢\u0006\u0004\b\u001d\u0010\u001eB\u0011\b\u0016\u0012\u0006\u0010\u001f\u001a\u00020\u0012¢\u0006\u0004\b\u001d\u0010 B\u001d\b\u0016\u0012\u0012\u0010\"\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020!\"\u00020\u0002¢\u0006\u0004\b\u001d\u0010#J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0086\u0002J\u0011\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0002H\u0096\u0002J\u0016\u0010\n\u001a\u00020\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u0016J\b\u0010\u000b\u001a\u00020\u0007H\u0016J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\fH\u0096\u0002J\u0013\u0010\u0010\u001a\u00020\u00072\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0096\u0002J\b\u0010\u0011\u001a\u00020\u0003H\u0016J\b\u0010\u0013\u001a\u00020\u0012H\u0016R\u001d\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006%"}, d2 = {"Lp1/f;", "", "Lp1/e;", "", "i", "e", "element", "", "b", "elements", "containsAll", "isEmpty", "", "iterator", "", "other", "equals", "hashCode", "", "toString", "", "localeList", "Ljava/util/List;", "g", "()Ljava/util/List;", UiKitSpanObj.TYPE_SIZE, "I", RXScreenCaptureService.KEY_HEIGHT, "()I", "<init>", "(Ljava/util/List;)V", "languageTags", "(Ljava/lang/String;)V", "", "locales", "([Lp1/e;)V", ak.av, "ui-text_release"}, k = 1, mv = {1, 7, 1})
@m0
public final class LocaleList implements Collection<e>, zh.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    public static final a f138137d = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name and from toString */
    @dl.d
    private final List<e> localeList;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f138139c;

    /* JADX INFO: renamed from: p1.f$a */
    /* JADX INFO: compiled from: LocaleList.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0005\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lp1/f$a;", "", "Lp1/f;", ak.av, "()Lp1/f;", org.apache.tools.ant.taskdefs.optional.vss.g.H2, "<init>", "()V", "ui-text_release"}, k = 1, mv = {1, 7, 1})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(u uVar) {
            this();
        }

        @dl.d
        public final LocaleList a() {
            List<g> current = i.a().getCurrent();
            ArrayList arrayList = new ArrayList(current.size());
            int size = current.size();
            for (int i10 = 0; i10 < size; i10++) {
                arrayList.add(new e(current.get(i10)));
            }
            return new LocaleList(arrayList);
        }
    }

    public LocaleList(@dl.d String languageTags) {
        f0.p(languageTags, "languageTags");
        List listU4 = StringsKt__StringsKt.U4(languageTags, new String[]{Constants.ACCEPT_TIME_SEPARATOR_SP}, false, 0, 6, null);
        ArrayList arrayList = new ArrayList(listU4.size());
        int size = listU4.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.add(StringsKt__StringsKt.F5((String) listU4.get(i10)).toString());
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i11 = 0; i11 < size2; i11++) {
            arrayList2.add(new e((String) arrayList.get(i11)));
        }
        this(arrayList2);
    }

    public LocaleList(@dl.d List<e> localeList) {
        f0.p(localeList, "localeList");
        this.localeList = localeList;
        this.f138139c = localeList.size();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LocaleList(@dl.d e... locales) {
        this((List<e>) ArraysKt___ArraysKt.kz(locales));
        f0.p(locales, "locales");
    }

    public boolean a(e eVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(e eVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends e> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean b(@dl.d e element) {
        f0.p(element, "element");
        return this.localeList.contains(element);
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof e) {
            return b((e) obj);
        }
        return false;
    }

    @Override // java.util.Collection
    public boolean containsAll(@dl.d Collection<? extends Object> elements) {
        f0.p(elements, "elements");
        return this.localeList.containsAll(elements);
    }

    @dl.d
    public final e e(int i10) {
        return this.localeList.get(i10);
    }

    @Override // java.util.Collection
    public boolean equals(@dl.e Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof LocaleList) && f0.g(this.localeList, ((LocaleList) other).localeList);
    }

    @dl.d
    public final List<e> g() {
        return this.localeList;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public int getF138139c() {
        return this.f138139c;
    }

    @Override // java.util.Collection
    public int hashCode() {
        return this.localeList.hashCode();
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return this.localeList.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    @dl.d
    public Iterator<e> iterator() {
        return this.localeList.iterator();
    }

    @Override // java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean removeIf(Predicate<? super e> predicate) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final /* bridge */ int size() {
        return getF138139c();
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        return t.a(this);
    }

    @Override // java.util.Collection
    public <T> T[] toArray(T[] array) {
        f0.p(array, "array");
        return (T[]) t.b(this, array);
    }

    @dl.d
    public String toString() {
        return "LocaleList(localeList=" + this.localeList + ')';
    }
}
