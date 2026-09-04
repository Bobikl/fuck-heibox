package androidx.paging;

import androidx.recyclerview.widget.ListUpdateCallback;
import com.igexin.assist.sdk.AssistPushConsts;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: NullPaddedListDiffHelper.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0011\u0010\u0012J8\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0001H\u0002J4\u0010\u0010\u001a\u00020\n\"\b\b\u0000\u0010\f*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\r2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\r¨\u0006\u0013"}, d2 = {"Landroidx/paging/f;", "", "Landroidx/recyclerview/widget/ListUpdateCallback;", "callback", "", "startBoundary", "endBoundary", com.google.android.exoplayer2.text.ttml.d.f49798o0, com.google.android.exoplayer2.text.ttml.d.f49800p0, AssistPushConsts.MSG_TYPE_PAYLOAD, "Lkotlin/b2;", ak.av, androidx.exifinterface.media.a.f23244d5, "Landroidx/paging/b0;", "oldList", "newList", "b", "<init>", "()V", "paging-runtime_release"}, k = 1, mv = {1, 4, 2})
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final f f26407a = new f();

    private f() {
    }

    private final void a(ListUpdateCallback listUpdateCallback, int i10, int i11, int i12, int i13, Object obj) {
        int i14 = i10 - i12;
        if (i14 > 0) {
            listUpdateCallback.onChanged(i12, i14, obj);
        }
        int i15 = i13 - i11;
        if (i15 > 0) {
            listUpdateCallback.onChanged(i11, i15, obj);
        }
    }

    public final <T> void b(@dl.d ListUpdateCallback callback, @dl.d b0<T> oldList, @dl.d b0<T> newList) {
        kotlin.jvm.internal.f0.p(callback, "callback");
        kotlin.jvm.internal.f0.p(oldList, "oldList");
        kotlin.jvm.internal.f0.p(newList, "newList");
        int iMax = Math.max(oldList.e(), newList.e());
        int iMin = Math.min(oldList.e() + oldList.b(), newList.e() + newList.b());
        int i10 = iMin - iMax;
        if (i10 > 0) {
            callback.onRemoved(iMax, i10);
            callback.onInserted(iMax, i10);
        }
        int iMin2 = Math.min(iMax, iMin);
        int iMax2 = Math.max(iMax, iMin);
        a(callback, iMin2, iMax2, fi.u.B(oldList.e(), newList.a()), fi.u.B(oldList.e() + oldList.b(), newList.a()), DiffingChangePayload.ITEM_TO_PLACEHOLDER);
        a(callback, iMin2, iMax2, fi.u.B(newList.e(), oldList.a()), fi.u.B(newList.e() + newList.b(), oldList.a()), DiffingChangePayload.PLACEHOLDER_TO_ITEM);
        int iA = newList.a() - oldList.a();
        if (iA > 0) {
            callback.onInserted(oldList.a(), iA);
        } else if (iA < 0) {
            callback.onRemoved(oldList.a() + iA, -iA);
        }
    }
}
