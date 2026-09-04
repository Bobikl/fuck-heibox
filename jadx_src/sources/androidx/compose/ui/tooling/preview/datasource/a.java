package androidx.compose.ui.tooling.preview.datasource;

import androidx.compose.runtime.internal.o;
import com.umeng.analytics.pro.ak;
import dl.d;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.f0;
import kotlin.sequences.m;
import r1.e;
import r1.f;

/* JADX INFO: compiled from: CollectionPreviewParameterProvider.kt */
/* JADX INFO: loaded from: classes.dex */
@o(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0017\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0015\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\r"}, d2 = {"Landroidx/compose/ui/tooling/preview/datasource/a;", androidx.exifinterface.media.a.f23244d5, "Lr1/f;", "", ak.av, "Ljava/util/Collection;", "collection", "Lkotlin/sequences/m;", "t", "()Lkotlin/sequences/m;", "values", "<init>", "(Ljava/util/Collection;)V", "ui-tooling-preview_release"}, k = 1, mv = {1, 7, 1})
public class a<T> implements f<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f17011b = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @d
    private final Collection<T> collection;

    /* JADX WARN: Multi-variable type inference failed */
    public a(@d Collection<? extends T> collection) {
        f0.p(collection, "collection");
        this.collection = collection;
    }

    @Override // r1.f
    public /* synthetic */ int getCount() {
        return e.a(this);
    }

    @Override // r1.f
    @d
    public m<T> t() {
        return CollectionsKt___CollectionsKt.v1(this.collection);
    }
}
