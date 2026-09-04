package androidx.recyclerview.widget;

import androidx.core.util.n;
import com.meituan.robust.Constants;
import com.umeng.socialize.net.dplus.CommonNetImpl;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class AdapterHelper implements OpReorderer.Callback {
    private static final boolean DEBUG = false;
    static final int POSITION_TYPE_INVISIBLE = 0;
    static final int POSITION_TYPE_NEW_OR_LAID_OUT = 1;
    private static final String TAG = "AHT";
    final Callback mCallback;
    final boolean mDisableRecycler;
    private int mExistingUpdateTypes;
    Runnable mOnItemProcessedCallback;
    final OpReorderer mOpReorderer;
    final ArrayList<UpdateOp> mPendingUpdates;
    final ArrayList<UpdateOp> mPostponedList;
    private n.a<UpdateOp> mUpdateOpPool;

    public interface Callback {
        RecyclerView.ViewHolder findViewHolder(int i10);

        void markViewHoldersUpdated(int i10, int i11, Object obj);

        void offsetPositionsForAdd(int i10, int i11);

        void offsetPositionsForMove(int i10, int i11);

        void offsetPositionsForRemovingInvisible(int i10, int i11);

        void offsetPositionsForRemovingLaidOutOrNewView(int i10, int i11);

        void onDispatchFirstPass(UpdateOp updateOp);

        void onDispatchSecondPass(UpdateOp updateOp);
    }

    public static final class UpdateOp {
        static final int ADD = 1;
        static final int MOVE = 8;
        static final int POOL_SIZE = 30;
        static final int REMOVE = 2;
        static final int UPDATE = 4;
        int cmd;
        int itemCount;
        Object payload;
        int positionStart;

        UpdateOp(int i10, int i11, int i12, Object obj) {
            this.cmd = i10;
            this.positionStart = i11;
            this.itemCount = i12;
            this.payload = obj;
        }

        String cmdToString() {
            int i10 = this.cmd;
            if (i10 == 1) {
                return "add";
            }
            if (i10 == 2) {
                return "rm";
            }
            if (i10 != 4) {
                return i10 != 8 ? "??" : "mv";
            }
            return CommonNetImpl.UP;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof UpdateOp)) {
                return false;
            }
            UpdateOp updateOp = (UpdateOp) obj;
            int i10 = this.cmd;
            if (i10 != updateOp.cmd) {
                return false;
            }
            if (i10 == 8 && Math.abs(this.itemCount - this.positionStart) == 1 && this.itemCount == updateOp.positionStart && this.positionStart == updateOp.itemCount) {
                return true;
            }
            if (this.itemCount != updateOp.itemCount || this.positionStart != updateOp.positionStart) {
                return false;
            }
            Object obj2 = this.payload;
            if (obj2 != null) {
                if (!obj2.equals(updateOp.payload)) {
                    return false;
                }
            } else if (updateOp.payload != null) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return (((this.cmd * 31) + this.positionStart) * 31) + this.itemCount;
        }

        public String toString() {
            return Integer.toHexString(System.identityHashCode(this)) + Constants.ARRAY_TYPE + cmdToString() + ",s:" + this.positionStart + "c:" + this.itemCount + ",p:" + this.payload + "]";
        }
    }

    AdapterHelper(Callback callback) {
        this(callback, false);
    }

    AdapterHelper(Callback callback, boolean z10) {
        this.mUpdateOpPool = new n.b(30);
        this.mPendingUpdates = new ArrayList<>();
        this.mPostponedList = new ArrayList<>();
        this.mExistingUpdateTypes = 0;
        this.mCallback = callback;
        this.mDisableRecycler = z10;
        this.mOpReorderer = new OpReorderer(this);
    }

    private void applyAdd(UpdateOp updateOp) {
        postponeAndUpdateViewHolders(updateOp);
    }

    private void applyMove(UpdateOp updateOp) {
        postponeAndUpdateViewHolders(updateOp);
    }

    private void applyRemove(UpdateOp updateOp) {
        boolean z10;
        byte b10;
        int i10 = updateOp.positionStart;
        int i11 = updateOp.itemCount + i10;
        byte b11 = -1;
        int i12 = i10;
        int i13 = 0;
        while (i12 < i11) {
            if (this.mCallback.findViewHolder(i12) != null || canFindInPreLayout(i12)) {
                if (b11 == 0) {
                    dispatchAndUpdateViewHolders(obtainUpdateOp(2, i10, i13, null));
                    z10 = true;
                } else {
                    z10 = false;
                }
                b10 = 1;
            } else {
                if (b11 == 1) {
                    postponeAndUpdateViewHolders(obtainUpdateOp(2, i10, i13, null));
                    z10 = true;
                } else {
                    z10 = false;
                }
                b10 = 0;
            }
            if (z10) {
                i12 -= i13;
                i11 -= i13;
                i13 = 1;
            } else {
                i13++;
            }
            i12++;
            b11 = b10;
        }
        if (i13 != updateOp.itemCount) {
            recycleUpdateOp(updateOp);
            updateOp = obtainUpdateOp(2, i10, i13, null);
        }
        if (b11 == 0) {
            dispatchAndUpdateViewHolders(updateOp);
        } else {
            postponeAndUpdateViewHolders(updateOp);
        }
    }

    private void applyUpdate(UpdateOp updateOp) {
        int i10 = updateOp.positionStart;
        int i11 = updateOp.itemCount + i10;
        int i12 = 0;
        byte b10 = -1;
        int i13 = i10;
        while (i10 < i11) {
            if (this.mCallback.findViewHolder(i10) != null || canFindInPreLayout(i10)) {
                if (b10 == 0) {
                    dispatchAndUpdateViewHolders(obtainUpdateOp(4, i13, i12, updateOp.payload));
                    i13 = i10;
                    i12 = 0;
                }
                b10 = 1;
            } else {
                if (b10 == 1) {
                    postponeAndUpdateViewHolders(obtainUpdateOp(4, i13, i12, updateOp.payload));
                    i13 = i10;
                    i12 = 0;
                }
                b10 = 0;
            }
            i12++;
            i10++;
        }
        if (i12 != updateOp.itemCount) {
            Object obj = updateOp.payload;
            recycleUpdateOp(updateOp);
            updateOp = obtainUpdateOp(4, i13, i12, obj);
        }
        if (b10 == 0) {
            dispatchAndUpdateViewHolders(updateOp);
        } else {
            postponeAndUpdateViewHolders(updateOp);
        }
    }

    private boolean canFindInPreLayout(int i10) {
        int size = this.mPostponedList.size();
        for (int i11 = 0; i11 < size; i11++) {
            UpdateOp updateOp = this.mPostponedList.get(i11);
            int i12 = updateOp.cmd;
            if (i12 == 8) {
                if (findPositionOffset(updateOp.itemCount, i11 + 1) == i10) {
                    return true;
                }
            } else if (i12 == 1) {
                int i13 = updateOp.positionStart;
                int i14 = updateOp.itemCount + i13;
                while (i13 < i14) {
                    if (findPositionOffset(i13, i11 + 1) == i10) {
                        return true;
                    }
                    i13++;
                }
            } else {
                continue;
            }
        }
        return false;
    }

    private void dispatchAndUpdateViewHolders(UpdateOp updateOp) {
        int i10;
        int i11 = updateOp.cmd;
        if (i11 == 1 || i11 == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int iUpdatePositionWithPostponed = updatePositionWithPostponed(updateOp.positionStart, i11);
        int i12 = updateOp.positionStart;
        int i13 = updateOp.cmd;
        if (i13 == 2) {
            i10 = 0;
        } else {
            if (i13 != 4) {
                throw new IllegalArgumentException("op should be remove or update." + updateOp);
            }
            i10 = 1;
        }
        int i14 = 1;
        for (int i15 = 1; i15 < updateOp.itemCount; i15++) {
            int iUpdatePositionWithPostponed2 = updatePositionWithPostponed(updateOp.positionStart + (i10 * i15), updateOp.cmd);
            int i16 = updateOp.cmd;
            if (i16 == 2 ? iUpdatePositionWithPostponed2 == iUpdatePositionWithPostponed : i16 == 4 && iUpdatePositionWithPostponed2 == iUpdatePositionWithPostponed + 1) {
                i14++;
            } else {
                UpdateOp updateOpObtainUpdateOp = obtainUpdateOp(i16, iUpdatePositionWithPostponed, i14, updateOp.payload);
                dispatchFirstPassAndUpdateViewHolders(updateOpObtainUpdateOp, i12);
                recycleUpdateOp(updateOpObtainUpdateOp);
                if (updateOp.cmd == 4) {
                    i12 += i14;
                }
                i14 = 1;
                iUpdatePositionWithPostponed = iUpdatePositionWithPostponed2;
            }
        }
        Object obj = updateOp.payload;
        recycleUpdateOp(updateOp);
        if (i14 > 0) {
            UpdateOp updateOpObtainUpdateOp2 = obtainUpdateOp(updateOp.cmd, iUpdatePositionWithPostponed, i14, obj);
            dispatchFirstPassAndUpdateViewHolders(updateOpObtainUpdateOp2, i12);
            recycleUpdateOp(updateOpObtainUpdateOp2);
        }
    }

    private void postponeAndUpdateViewHolders(UpdateOp updateOp) {
        this.mPostponedList.add(updateOp);
        int i10 = updateOp.cmd;
        if (i10 == 1) {
            this.mCallback.offsetPositionsForAdd(updateOp.positionStart, updateOp.itemCount);
            return;
        }
        if (i10 == 2) {
            this.mCallback.offsetPositionsForRemovingLaidOutOrNewView(updateOp.positionStart, updateOp.itemCount);
            return;
        }
        if (i10 == 4) {
            this.mCallback.markViewHoldersUpdated(updateOp.positionStart, updateOp.itemCount, updateOp.payload);
        } else {
            if (i10 == 8) {
                this.mCallback.offsetPositionsForMove(updateOp.positionStart, updateOp.itemCount);
                return;
            }
            throw new IllegalArgumentException("Unknown update op type for " + updateOp);
        }
    }

    private int updatePositionWithPostponed(int i10, int i11) {
        int i12;
        int i13;
        for (int size = this.mPostponedList.size() - 1; size >= 0; size--) {
            UpdateOp updateOp = this.mPostponedList.get(size);
            int i14 = updateOp.cmd;
            if (i14 == 8) {
                int i15 = updateOp.positionStart;
                int i16 = updateOp.itemCount;
                if (i15 < i16) {
                    i13 = i15;
                    i12 = i16;
                } else {
                    i12 = i15;
                    i13 = i16;
                }
                if (i10 < i13 || i10 > i12) {
                    if (i10 < i15) {
                        if (i11 == 1) {
                            updateOp.positionStart = i15 + 1;
                            updateOp.itemCount = i16 + 1;
                        } else if (i11 == 2) {
                            updateOp.positionStart = i15 - 1;
                            updateOp.itemCount = i16 - 1;
                        }
                    }
                } else if (i13 == i15) {
                    if (i11 == 1) {
                        updateOp.itemCount = i16 + 1;
                    } else if (i11 == 2) {
                        updateOp.itemCount = i16 - 1;
                    }
                    i10++;
                } else {
                    if (i11 == 1) {
                        updateOp.positionStart = i15 + 1;
                    } else if (i11 == 2) {
                        updateOp.positionStart = i15 - 1;
                    }
                    i10--;
                }
            } else {
                int i17 = updateOp.positionStart;
                if (i17 <= i10) {
                    if (i14 == 1) {
                        i10 -= updateOp.itemCount;
                    } else if (i14 == 2) {
                        i10 += updateOp.itemCount;
                    }
                } else if (i11 == 1) {
                    updateOp.positionStart = i17 + 1;
                } else if (i11 == 2) {
                    updateOp.positionStart = i17 - 1;
                }
            }
        }
        for (int size2 = this.mPostponedList.size() - 1; size2 >= 0; size2--) {
            UpdateOp updateOp2 = this.mPostponedList.get(size2);
            if (updateOp2.cmd == 8) {
                int i18 = updateOp2.itemCount;
                if (i18 == updateOp2.positionStart || i18 < 0) {
                    this.mPostponedList.remove(size2);
                    recycleUpdateOp(updateOp2);
                }
            } else if (updateOp2.itemCount <= 0) {
                this.mPostponedList.remove(size2);
                recycleUpdateOp(updateOp2);
            }
        }
        return i10;
    }

    AdapterHelper addUpdateOp(UpdateOp... updateOpArr) {
        Collections.addAll(this.mPendingUpdates, updateOpArr);
        return this;
    }

    public int applyPendingUpdatesToPosition(int i10) {
        int size = this.mPendingUpdates.size();
        for (int i11 = 0; i11 < size; i11++) {
            UpdateOp updateOp = this.mPendingUpdates.get(i11);
            int i12 = updateOp.cmd;
            if (i12 != 1) {
                if (i12 == 2) {
                    int i13 = updateOp.positionStart;
                    if (i13 <= i10) {
                        int i14 = updateOp.itemCount;
                        if (i13 + i14 > i10) {
                            return -1;
                        }
                        i10 -= i14;
                    } else {
                        continue;
                    }
                } else if (i12 == 8) {
                    int i15 = updateOp.positionStart;
                    if (i15 == i10) {
                        i10 = updateOp.itemCount;
                    } else {
                        if (i15 < i10) {
                            i10--;
                        }
                        if (updateOp.itemCount <= i10) {
                            i10++;
                        }
                    }
                }
            } else if (updateOp.positionStart <= i10) {
                i10 += updateOp.itemCount;
            }
        }
        return i10;
    }

    void consumePostponedUpdates() {
        int size = this.mPostponedList.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.mCallback.onDispatchSecondPass(this.mPostponedList.get(i10));
        }
        recycleUpdateOpsAndClearList(this.mPostponedList);
        this.mExistingUpdateTypes = 0;
    }

    void consumeUpdatesInOnePass() {
        consumePostponedUpdates();
        int size = this.mPendingUpdates.size();
        for (int i10 = 0; i10 < size; i10++) {
            UpdateOp updateOp = this.mPendingUpdates.get(i10);
            int i11 = updateOp.cmd;
            if (i11 == 1) {
                this.mCallback.onDispatchSecondPass(updateOp);
                this.mCallback.offsetPositionsForAdd(updateOp.positionStart, updateOp.itemCount);
            } else if (i11 == 2) {
                this.mCallback.onDispatchSecondPass(updateOp);
                this.mCallback.offsetPositionsForRemovingInvisible(updateOp.positionStart, updateOp.itemCount);
            } else if (i11 == 4) {
                this.mCallback.onDispatchSecondPass(updateOp);
                this.mCallback.markViewHoldersUpdated(updateOp.positionStart, updateOp.itemCount, updateOp.payload);
            } else if (i11 == 8) {
                this.mCallback.onDispatchSecondPass(updateOp);
                this.mCallback.offsetPositionsForMove(updateOp.positionStart, updateOp.itemCount);
            }
            Runnable runnable = this.mOnItemProcessedCallback;
            if (runnable != null) {
                runnable.run();
            }
        }
        recycleUpdateOpsAndClearList(this.mPendingUpdates);
        this.mExistingUpdateTypes = 0;
    }

    void dispatchFirstPassAndUpdateViewHolders(UpdateOp updateOp, int i10) {
        this.mCallback.onDispatchFirstPass(updateOp);
        int i11 = updateOp.cmd;
        if (i11 == 2) {
            this.mCallback.offsetPositionsForRemovingInvisible(i10, updateOp.itemCount);
        } else {
            if (i11 != 4) {
                throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
            }
            this.mCallback.markViewHoldersUpdated(i10, updateOp.itemCount, updateOp.payload);
        }
    }

    int findPositionOffset(int i10) {
        return findPositionOffset(i10, 0);
    }

    int findPositionOffset(int i10, int i11) {
        int size = this.mPostponedList.size();
        while (i11 < size) {
            UpdateOp updateOp = this.mPostponedList.get(i11);
            int i12 = updateOp.cmd;
            if (i12 == 8) {
                int i13 = updateOp.positionStart;
                if (i13 == i10) {
                    i10 = updateOp.itemCount;
                } else {
                    if (i13 < i10) {
                        i10--;
                    }
                    if (updateOp.itemCount <= i10) {
                        i10++;
                    }
                }
            } else {
                int i14 = updateOp.positionStart;
                if (i14 > i10) {
                    continue;
                } else if (i12 == 2) {
                    int i15 = updateOp.itemCount;
                    if (i10 < i14 + i15) {
                        return -1;
                    }
                    i10 -= i15;
                } else if (i12 == 1) {
                    i10 += updateOp.itemCount;
                }
            }
            i11++;
        }
        return i10;
    }

    boolean hasAnyUpdateTypes(int i10) {
        return (i10 & this.mExistingUpdateTypes) != 0;
    }

    boolean hasPendingUpdates() {
        return this.mPendingUpdates.size() > 0;
    }

    boolean hasUpdates() {
        return (this.mPostponedList.isEmpty() || this.mPendingUpdates.isEmpty()) ? false : true;
    }

    @Override // androidx.recyclerview.widget.OpReorderer.Callback
    public UpdateOp obtainUpdateOp(int i10, int i11, int i12, Object obj) {
        UpdateOp updateOpA = this.mUpdateOpPool.a();
        if (updateOpA == null) {
            return new UpdateOp(i10, i11, i12, obj);
        }
        updateOpA.cmd = i10;
        updateOpA.positionStart = i11;
        updateOpA.itemCount = i12;
        updateOpA.payload = obj;
        return updateOpA;
    }

    boolean onItemRangeChanged(int i10, int i11, Object obj) {
        if (i11 < 1) {
            return false;
        }
        this.mPendingUpdates.add(obtainUpdateOp(4, i10, i11, obj));
        this.mExistingUpdateTypes |= 4;
        return this.mPendingUpdates.size() == 1;
    }

    boolean onItemRangeInserted(int i10, int i11) {
        if (i11 < 1) {
            return false;
        }
        this.mPendingUpdates.add(obtainUpdateOp(1, i10, i11, null));
        this.mExistingUpdateTypes |= 1;
        return this.mPendingUpdates.size() == 1;
    }

    boolean onItemRangeMoved(int i10, int i11, int i12) {
        if (i10 == i11) {
            return false;
        }
        if (i12 != 1) {
            throw new IllegalArgumentException("Moving more than 1 item is not supported yet");
        }
        this.mPendingUpdates.add(obtainUpdateOp(8, i10, i11, null));
        this.mExistingUpdateTypes |= 8;
        return this.mPendingUpdates.size() == 1;
    }

    boolean onItemRangeRemoved(int i10, int i11) {
        if (i11 < 1) {
            return false;
        }
        this.mPendingUpdates.add(obtainUpdateOp(2, i10, i11, null));
        this.mExistingUpdateTypes |= 2;
        return this.mPendingUpdates.size() == 1;
    }

    void preProcess() {
        this.mOpReorderer.reorderOps(this.mPendingUpdates);
        int size = this.mPendingUpdates.size();
        for (int i10 = 0; i10 < size; i10++) {
            UpdateOp updateOp = this.mPendingUpdates.get(i10);
            int i11 = updateOp.cmd;
            if (i11 == 1) {
                applyAdd(updateOp);
            } else if (i11 == 2) {
                applyRemove(updateOp);
            } else if (i11 == 4) {
                applyUpdate(updateOp);
            } else if (i11 == 8) {
                applyMove(updateOp);
            }
            Runnable runnable = this.mOnItemProcessedCallback;
            if (runnable != null) {
                runnable.run();
            }
        }
        this.mPendingUpdates.clear();
    }

    @Override // androidx.recyclerview.widget.OpReorderer.Callback
    public void recycleUpdateOp(UpdateOp updateOp) {
        if (this.mDisableRecycler) {
            return;
        }
        updateOp.payload = null;
        this.mUpdateOpPool.b(updateOp);
    }

    void recycleUpdateOpsAndClearList(List<UpdateOp> list) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            recycleUpdateOp(list.get(i10));
        }
        list.clear();
    }

    void reset() {
        recycleUpdateOpsAndClearList(this.mPendingUpdates);
        recycleUpdateOpsAndClearList(this.mPostponedList);
        this.mExistingUpdateTypes = 0;
    }
}
