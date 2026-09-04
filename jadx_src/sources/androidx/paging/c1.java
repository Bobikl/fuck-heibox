package androidx.paging;

import com.starlightc.ucropplus.ui.UCropPlusActivity;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.b2;

/* JADX INFO: compiled from: SnapshotPagedList.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0015\u0012\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\b\u0010\u0005\u001a\u00020\u0004H\u0016J\"\u0010\n\u001a\u00020\u00042\u0018\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00040\u0006H\u0016J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0016R\u001a\u0010\u0013\u001a\u00020\u000e8\u0016X\u0096D¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0016\u001a\u00020\u000e8\u0016X\u0096D¢\u0006\f\n\u0004\b\u0014\u0010\u0010\u001a\u0004\b\u0015\u0010\u0012R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001c\u001a\u0004\u0018\u00010\u00018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001f"}, d2 = {"Landroidx/paging/c1;", "", androidx.exifinterface.media.a.f23244d5, "Landroidx/paging/PagedList;", "Lkotlin/b2;", "t", "Lkotlin/Function2;", "Landroidx/paging/LoadType;", "Landroidx/paging/v;", "callback", ak.aG, "", UCropPlusActivity.ARG_INDEX, "U", "", "l", "Z", "R", "()Z", "isImmutable", "m", "Q", "isDetached", "n", "Landroidx/paging/PagedList;", "pagedList", "B", "()Ljava/lang/Object;", "lastKey", "<init>", "(Landroidx/paging/PagedList;)V", "paging-common"}, k = 1, mv = {1, 4, 2})
public final class c1<T> extends PagedList<T> {

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final boolean isImmutable;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final boolean isDetached;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final PagedList<T> pagedList;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(@dl.d PagedList<T> pagedList) {
        super(pagedList.G(), pagedList.getCoroutineScope(), pagedList.getNotifyDispatcher(), pagedList.N().L(), pagedList.getConfig());
        kotlin.jvm.internal.f0.p(pagedList, "pagedList");
        this.pagedList = pagedList;
        this.isImmutable = true;
        this.isDetached = true;
    }

    @Override // androidx.paging.PagedList
    @dl.e
    public Object B() {
        return this.pagedList.B();
    }

    @Override // androidx.paging.PagedList
    /* JADX INFO: renamed from: Q, reason: from getter */
    public boolean getIsDetached() {
        return this.isDetached;
    }

    @Override // androidx.paging.PagedList
    /* JADX INFO: renamed from: R, reason: from getter */
    public boolean getIsImmutable() {
        return this.isImmutable;
    }

    @Override // androidx.paging.PagedList
    public void U(int i10) {
    }

    @Override // androidx.paging.PagedList
    public void t() {
    }

    @Override // androidx.paging.PagedList
    public void u(@dl.d yh.p<? super LoadType, ? super v, b2> callback) {
        kotlin.jvm.internal.f0.p(callback, "callback");
    }
}
