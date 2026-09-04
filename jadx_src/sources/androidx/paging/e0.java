package androidx.paging;

import androidx.recyclerview.widget.ListUpdateCallback;
import com.igexin.assist.sdk.AssistPushConsts;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import com.umeng.socialize.net.dplus.CommonNetImpl;
import kotlin.Metadata;

/* JADX INFO: compiled from: NullPaddedListDiffHelper.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001:\u0001\u000bB\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ8\u0010\u000b\u001a\u00020\n\"\u0004\b\u0000\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¨\u0006\u000e"}, d2 = {"Landroidx/paging/e0;", "", androidx.exifinterface.media.a.f23244d5, "Landroidx/paging/b0;", "oldList", "newList", "Landroidx/recyclerview/widget/ListUpdateCallback;", "callback", "Landroidx/paging/a0;", "diffResult", "Lkotlin/b2;", ak.av, "<init>", "()V", "paging-runtime_release"}, k = 1, mv = {1, 4, 2})
public final class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final e0 f26394a = new e0();

    /* JADX INFO: compiled from: NullPaddedListDiffHelper.kt */
    @Metadata(bv = {}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\n\b\u0002\u0018\u0000 '*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001(B+\u0012\f\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000\u001f\u0012\f\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000\u001f\u0012\u0006\u0010$\u001a\u00020\u0002¢\u0006\u0004\b%\u0010&J\r\u0010\u0004\u001a\u00020\u0003*\u00020\u0003H\u0082\bJ\b\u0010\u0006\u001a\u00020\u0005H\u0002J\b\u0010\u0007\u001a\u00020\u0005H\u0002J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0003H\u0002J\u0018\u0010\f\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0003H\u0002J\u0018\u0010\r\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0003H\u0002J\u0018\u0010\u000e\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0003H\u0002J\u0006\u0010\u000f\u001a\u00020\u0005J\u0018\u0010\u0010\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0003H\u0016J\u0018\u0010\u0011\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0003H\u0016J\u0018\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0003H\u0016J\"\u0010\u0017\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u00032\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016R\u0016\u0010\u001a\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001b\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u0019R\u0016\u0010\u001c\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u0019R\u0016\u0010\u001d\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u0019R\u0016\u0010\u001e\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u0019R\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010 R\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010 R\u0014\u0010$\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010#¨\u0006)"}, d2 = {"Landroidx/paging/e0$a;", androidx.exifinterface.media.a.f23244d5, "Landroidx/recyclerview/widget/ListUpdateCallback;", "", "j", "Lkotlin/b2;", "i", "g", CommonNetImpl.POSITION, "count", "", "d", ak.aF, "f", "e", RXScreenCaptureService.KEY_HEIGHT, "onInserted", "onRemoved", "fromPosition", "toPosition", "onMoved", "", AssistPushConsts.MSG_TYPE_PAYLOAD, "onChanged", "b", "I", "placeholdersBefore", "placeholdersAfter", "storageCount", "placeholdersBeforeState", "placeholdersAfterState", "Landroidx/paging/b0;", "Landroidx/paging/b0;", "oldList", "newList", "Landroidx/recyclerview/widget/ListUpdateCallback;", "callback", "<init>", "(Landroidx/paging/b0;Landroidx/paging/b0;Landroidx/recyclerview/widget/ListUpdateCallback;)V", "m", ak.av, "paging-runtime_release"}, k = 1, mv = {1, 4, 2})
    public static final class a<T> implements ListUpdateCallback {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static final int f26395j = 1;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static final int f26396k = 2;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private static final int f26397l = 3;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private int placeholdersBefore;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private int placeholdersAfter;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private int storageCount;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private int placeholdersBeforeState;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        private int placeholdersAfterState;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        private final b0<T> oldList;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
        private final b0<T> newList;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
        private final ListUpdateCallback callback;

        public a(@dl.d b0<T> oldList, @dl.d b0<T> newList, @dl.d ListUpdateCallback callback) {
            kotlin.jvm.internal.f0.p(oldList, "oldList");
            kotlin.jvm.internal.f0.p(newList, "newList");
            kotlin.jvm.internal.f0.p(callback, "callback");
            this.oldList = oldList;
            this.newList = newList;
            this.callback = callback;
            this.placeholdersBefore = oldList.e();
            this.placeholdersAfter = oldList.g();
            this.storageCount = oldList.b();
            this.placeholdersBeforeState = 1;
            this.placeholdersAfterState = 1;
        }

        private final boolean c(int position, int count) {
            if (position < this.storageCount || this.placeholdersAfterState == 2) {
                return false;
            }
            int iMin = Math.min(count, this.placeholdersAfter);
            if (iMin > 0) {
                this.placeholdersAfterState = 3;
                this.callback.onChanged(this.placeholdersBefore + position, iMin, DiffingChangePayload.PLACEHOLDER_TO_ITEM);
                this.placeholdersAfter -= iMin;
            }
            int i10 = count - iMin;
            if (i10 <= 0) {
                return true;
            }
            this.callback.onInserted(position + iMin + this.placeholdersBefore, i10);
            return true;
        }

        private final boolean d(int position, int count) {
            if (position > 0 || this.placeholdersBeforeState == 2) {
                return false;
            }
            int iMin = Math.min(count, this.placeholdersBefore);
            if (iMin > 0) {
                this.placeholdersBeforeState = 3;
                this.callback.onChanged((0 - iMin) + this.placeholdersBefore, iMin, DiffingChangePayload.PLACEHOLDER_TO_ITEM);
                this.placeholdersBefore -= iMin;
            }
            int i10 = count - iMin;
            if (i10 <= 0) {
                return true;
            }
            this.callback.onInserted(this.placeholdersBefore + 0, i10);
            return true;
        }

        private final boolean e(int position, int count) {
            if (position + count < this.storageCount || this.placeholdersAfterState == 3) {
                return false;
            }
            int iU = fi.u.u(Math.min(this.newList.g() - this.placeholdersAfter, count), 0);
            int i10 = count - iU;
            if (iU > 0) {
                this.placeholdersAfterState = 2;
                this.callback.onChanged(this.placeholdersBefore + position, iU, DiffingChangePayload.ITEM_TO_PLACEHOLDER);
                this.placeholdersAfter += iU;
            }
            if (i10 <= 0) {
                return true;
            }
            this.callback.onRemoved(position + iU + this.placeholdersBefore, i10);
            return true;
        }

        private final boolean f(int position, int count) {
            if (position > 0 || this.placeholdersBeforeState == 3) {
                return false;
            }
            int iU = fi.u.u(Math.min(this.newList.e() - this.placeholdersBefore, count), 0);
            int i10 = count - iU;
            if (i10 > 0) {
                this.callback.onRemoved(this.placeholdersBefore + 0, i10);
            }
            if (iU <= 0) {
                return true;
            }
            this.placeholdersBeforeState = 2;
            this.callback.onChanged(this.placeholdersBefore + 0, iU, DiffingChangePayload.ITEM_TO_PLACEHOLDER);
            this.placeholdersBefore += iU;
            return true;
        }

        private final void g() {
            int iMin = Math.min(this.oldList.e(), this.placeholdersBefore);
            int iE = this.newList.e() - this.placeholdersBefore;
            if (iE > 0) {
                if (iMin > 0) {
                    this.callback.onChanged(0, iMin, DiffingChangePayload.PLACEHOLDER_POSITION_CHANGE);
                }
                this.callback.onInserted(0, iE);
            } else if (iE < 0) {
                this.callback.onRemoved(0, -iE);
                int i10 = iMin + iE;
                if (i10 > 0) {
                    this.callback.onChanged(0, i10, DiffingChangePayload.PLACEHOLDER_POSITION_CHANGE);
                }
            }
            this.placeholdersBefore = this.newList.e();
        }

        private final void i() {
            int iMin = Math.min(this.oldList.g(), this.placeholdersAfter);
            int iG = this.newList.g();
            int i10 = this.placeholdersAfter;
            int i11 = iG - i10;
            int i12 = this.placeholdersBefore + this.storageCount + i10;
            int i13 = i12 - iMin;
            boolean z10 = i13 != this.oldList.a() - iMin;
            if (i11 > 0) {
                this.callback.onInserted(i12, i11);
            } else if (i11 < 0) {
                this.callback.onRemoved(i12 + i11, -i11);
                iMin += i11;
            }
            if (iMin > 0 && z10) {
                this.callback.onChanged(i13, iMin, DiffingChangePayload.PLACEHOLDER_POSITION_CHANGE);
            }
            this.placeholdersAfter = this.newList.g();
        }

        private final int j(int i10) {
            return i10 + this.placeholdersBefore;
        }

        public final void h() {
            g();
            i();
        }

        @Override // androidx.recyclerview.widget.ListUpdateCallback
        public void onChanged(int i10, int i11, @dl.e Object obj) {
            this.callback.onChanged(i10 + this.placeholdersBefore, i11, obj);
        }

        @Override // androidx.recyclerview.widget.ListUpdateCallback
        public void onInserted(int i10, int i11) {
            if (!c(i10, i11) && !d(i10, i11)) {
                this.callback.onInserted(i10 + this.placeholdersBefore, i11);
            }
            this.storageCount += i11;
        }

        @Override // androidx.recyclerview.widget.ListUpdateCallback
        public void onMoved(int i10, int i11) {
            this.callback.onMoved(i10 + this.placeholdersBefore, i11 + this.placeholdersBefore);
        }

        @Override // androidx.recyclerview.widget.ListUpdateCallback
        public void onRemoved(int i10, int i11) {
            if (!e(i10, i11) && !f(i10, i11)) {
                this.callback.onRemoved(i10 + this.placeholdersBefore, i11);
            }
            this.storageCount -= i11;
        }
    }

    private e0() {
    }

    public final <T> void a(@dl.d b0<T> oldList, @dl.d b0<T> newList, @dl.d ListUpdateCallback callback, @dl.d a0 diffResult) {
        kotlin.jvm.internal.f0.p(oldList, "oldList");
        kotlin.jvm.internal.f0.p(newList, "newList");
        kotlin.jvm.internal.f0.p(callback, "callback");
        kotlin.jvm.internal.f0.p(diffResult, "diffResult");
        a aVar = new a(oldList, newList, callback);
        diffResult.getDiff().dispatchUpdatesTo(aVar);
        aVar.h();
    }
}
