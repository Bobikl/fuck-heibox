package androidx.compose.ui.text.font;

import com.max.hbuikit.bean.param.UiKitSpanObj;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.starlightc.ucropplus.ui.UCropPlusActivity;
import com.umeng.analytics.pro.ak;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;
import kotlin.Metadata;

/* JADX INFO: renamed from: androidx.compose.ui.text.font.c0, reason: from toString */
/* JADX INFO: compiled from: FontFamily.kt */
/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.m0
@Metadata(bv = {}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010*\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\u0017\b\u0000\u0012\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b%\u0010&J\u0011\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0096\u0003J\u0017\u0010\t\u001a\u00020\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007H\u0096\u0001J\u0011\u0010\f\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\nH\u0096\u0003J\u0011\u0010\r\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u0003H\u0096\u0001J\t\u0010\u000e\u001a\u00020\u0005H\u0096\u0001J\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u000fH\u0096\u0003J\u0011\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u0003H\u0096\u0001J\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u0012H\u0096\u0001J\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u00122\u0006\u0010\u000b\u001a\u00020\nH\u0096\u0001J\u001f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\nH\u0096\u0001J\u0013\u0010\u0019\u001a\u00020\u00052\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0096\u0002J\b\u0010\u001a\u001a\u00020\nH\u0016J\b\u0010\u001c\u001a\u00020\u001bH\u0016R\u001d\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0014\u0010$\u001a\u00020\n8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\"\u0010#¨\u0006'"}, d2 = {"Landroidx/compose/ui/text/font/c0;", "Landroidx/compose/ui/text/font/s;", "", "Landroidx/compose/ui/text/font/u;", "element", "", ak.aB, "", "elements", "containsAll", "", UCropPlusActivity.ARG_INDEX, ak.aG, "x", "isEmpty", "", "iterator", "y", "", "listIterator", "fromIndex", "toIndex", "subList", "", "other", "equals", "hashCode", "", "toString", "k", "Ljava/util/List;", "v", "()Ljava/util/List;", "fonts", RXScreenCaptureService.KEY_WIDTH, "()I", UiKitSpanObj.TYPE_SIZE, "<init>", "(Ljava/util/List;)V", "ui-text_release"}, k = 1, mv = {1, 7, 1})
public final class FontListFontFamily extends s implements List<u>, zh.a {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final /* synthetic */ List<u> f16527j;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
    @dl.d
    private final List<u> fonts;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FontListFontFamily(@dl.d List<? extends u> fonts) {
        super(null);
        kotlin.jvm.internal.f0.p(fonts, "fonts");
        this.f16527j = fonts;
        if (!(!fonts.isEmpty())) {
            throw new IllegalStateException("At least one font should be passed to FontFamily".toString());
        }
        this.fonts = new ArrayList(fonts);
    }

    public u A(int i10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public u B(int i10, u uVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ void add(int i10, u uVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public boolean addAll(int i10, Collection<? extends u> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(Collection<? extends u> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof u) {
            return s((u) obj);
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(@dl.d Collection<? extends Object> elements) {
        kotlin.jvm.internal.f0.p(elements, "elements");
        return this.f16527j.containsAll(elements);
    }

    @Override // java.util.List, java.util.Collection
    public boolean equals(@dl.e Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof FontListFontFamily) && kotlin.jvm.internal.f0.g(this.fonts, ((FontListFontFamily) other).fonts);
    }

    @Override // java.util.List, java.util.Collection
    public int hashCode() {
        return this.fonts.hashCode();
    }

    @Override // java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof u) {
            return x((u) obj);
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return this.f16527j.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    @dl.d
    public Iterator<u> iterator() {
        return this.f16527j.iterator();
    }

    public void l(int i10, u uVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof u) {
            return y((u) obj);
        }
        return -1;
    }

    @Override // java.util.List
    @dl.d
    public ListIterator<u> listIterator() {
        return this.f16527j.listIterator();
    }

    @Override // java.util.List
    @dl.d
    public ListIterator<u> listIterator(int index) {
        return this.f16527j.listIterator(index);
    }

    public boolean o(u uVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ u remove(int i10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public void replaceAll(UnaryOperator<u> unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean s(@dl.d u element) {
        kotlin.jvm.internal.f0.p(element, "element");
        return this.f16527j.contains(element);
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ u set(int i10, u uVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ int size() {
        return w();
    }

    @Override // java.util.List
    public void sort(Comparator<? super u> comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    @dl.d
    public List<u> subList(int fromIndex, int toIndex) {
        return this.f16527j.subList(fromIndex, toIndex);
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        return kotlin.jvm.internal.t.a(this);
    }

    @Override // java.util.List, java.util.Collection
    public <T> T[] toArray(T[] array) {
        kotlin.jvm.internal.f0.p(array, "array");
        return (T[]) kotlin.jvm.internal.t.b(this, array);
    }

    @dl.d
    public String toString() {
        return "FontListFontFamily(fonts=" + this.fonts + ')';
    }

    @Override // java.util.List
    @dl.d
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public u get(int index) {
        return this.f16527j.get(index);
    }

    @dl.d
    public final List<u> v() {
        return this.fonts;
    }

    public int w() {
        return this.f16527j.size();
    }

    public int x(@dl.d u element) {
        kotlin.jvm.internal.f0.p(element, "element");
        return this.f16527j.indexOf(element);
    }

    public int y(@dl.d u element) {
        kotlin.jvm.internal.f0.p(element, "element");
        return this.f16527j.lastIndexOf(element);
    }
}
