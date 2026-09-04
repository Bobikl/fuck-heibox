package androidx.paging;

import androidx.recyclerview.widget.ListUpdateCallback;
import com.igexin.assist.sdk.AssistPushConsts;
import com.umeng.analytics.pro.ak;
import com.umeng.socialize.net.dplus.CommonNetImpl;
import kotlin.Metadata;

/* JADX INFO: compiled from: NullPaddedListDiffHelper.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u000b\b\u0002\u0018\u00002\u00020\u0001B\u0019\b\u0000\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\u0018\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\u0018\u0010\n\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0002H\u0016J\"\u0010\r\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016R\u0014\u0010\u0010\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, d2 = {"Landroidx/paging/d0;", "Landroidx/recyclerview/widget/ListUpdateCallback;", "", CommonNetImpl.POSITION, "count", "Lkotlin/b2;", "onInserted", "onRemoved", "fromPosition", "toPosition", "onMoved", "", AssistPushConsts.MSG_TYPE_PAYLOAD, "onChanged", "b", "I", androidx.constraintlayout.core.motion.utils.w.c.R, ak.aF, "Landroidx/recyclerview/widget/ListUpdateCallback;", "callback", "<init>", "(ILandroidx/recyclerview/widget/ListUpdateCallback;)V", "paging-runtime_release"}, k = 1, mv = {1, 4, 2})
public final class d0 implements ListUpdateCallback {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int offset;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ListUpdateCallback callback;

    public d0(int i10, @dl.d ListUpdateCallback callback) {
        kotlin.jvm.internal.f0.p(callback, "callback");
        this.offset = i10;
        this.callback = callback;
    }

    @Override // androidx.recyclerview.widget.ListUpdateCallback
    public void onChanged(int i10, int i11, @dl.e Object obj) {
        this.callback.onChanged(i10 + this.offset, i11, obj);
    }

    @Override // androidx.recyclerview.widget.ListUpdateCallback
    public void onInserted(int i10, int i11) {
        this.callback.onInserted(i10 + this.offset, i11);
    }

    @Override // androidx.recyclerview.widget.ListUpdateCallback
    public void onMoved(int i10, int i11) {
        ListUpdateCallback listUpdateCallback = this.callback;
        int i12 = this.offset;
        listUpdateCallback.onMoved(i10 + i12, i11 + i12);
    }

    @Override // androidx.recyclerview.widget.ListUpdateCallback
    public void onRemoved(int i10, int i11) {
        this.callback.onRemoved(i10 + this.offset, i11);
    }
}
