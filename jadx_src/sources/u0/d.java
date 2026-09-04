package u0;

import com.max.hbuikit.bean.param.UiKitSpanObj;
import com.starlightc.ucropplus.ui.UCropPlusActivity;
import com.umeng.analytics.pro.ak;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: ImmutableList.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b`\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001\bJ\u001e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\tÀ\u0006\u0001"}, d2 = {"Lu0/d;", androidx.exifinterface.media.a.S4, "", "Lu0/b;", "", "fromIndex", "toIndex", "subList", ak.av, "runtime_release"}, k = 1, mv = {1, 7, 1})
public interface d<E> extends List<E>, b<E>, zh.a {

    /* JADX INFO: compiled from: ImmutableList.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\r\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u00022\b\u0012\u0004\u0012\u00028\u00010\u0003B%\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0006\u001a\u00028\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\u0096\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001e\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004H\u0016R\u0014\u0010\r\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u0011"}, d2 = {"Lu0/d$a;", androidx.exifinterface.media.a.S4, "Lu0/d;", "Lkotlin/collections/b;", "", UCropPlusActivity.ARG_INDEX, "get", "(I)Ljava/lang/Object;", "fromIndex", "toIndex", "subList", "getSize", "()I", UiKitSpanObj.TYPE_SIZE, "source", "<init>", "(Lu0/d;II)V", "runtime_release"}, k = 1, mv = {1, 7, 1})
    public static final class a<E> extends kotlin.collections.b<E> implements d<E> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @dl.d
        private final d<E> f140738b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f140739c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f140740d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f140741e;

        /* JADX WARN: Multi-variable type inference failed */
        public a(@dl.d d<? extends E> source, int i10, int i11) {
            f0.p(source, "source");
            this.f140738b = source;
            this.f140739c = i10;
            this.f140740d = i11;
            y0.e.c(i10, i11, source.size());
            this.f140741e = i11 - i10;
        }

        @Override // kotlin.collections.b, java.util.List
        public E get(int index) {
            y0.e.a(index, this.f140741e);
            return this.f140738b.get(this.f140739c + index);
        }

        @Override // kotlin.collections.b, kotlin.collections.AbstractCollection
        /* JADX INFO: renamed from: getSize, reason: from getter */
        public int getF140741e() {
            return this.f140741e;
        }

        @Override // kotlin.collections.b, java.util.List, u0.d
        @dl.d
        public d<E> subList(int fromIndex, int toIndex) {
            y0.e.c(fromIndex, toIndex, this.f140741e);
            d<E> dVar = this.f140738b;
            int i10 = this.f140739c;
            return new a(dVar, fromIndex + i10, i10 + toIndex);
        }
    }

    /* bridge */ /* synthetic */ List subList(int i10, int i11);

    @Override // java.util.List
    @dl.d
    d<E> subList(int fromIndex, int toIndex);
}
