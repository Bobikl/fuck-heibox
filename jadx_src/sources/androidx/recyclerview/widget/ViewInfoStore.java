package androidx.recyclerview.widget;

import androidx.annotation.j1;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.collection.j2;
import androidx.collection.x0;
import androidx.core.util.n;

/* JADX INFO: loaded from: classes6.dex */
public class ViewInfoStore {
    private static final boolean DEBUG = false;

    @j1
    final j2<RecyclerView.ViewHolder, InfoRecord> mLayoutHolderMap = new j2<>();

    @j1
    final x0<RecyclerView.ViewHolder> mOldChangedHolders = new x0<>();

    public static class InfoRecord {
        static final int FLAG_APPEAR = 2;
        static final int FLAG_APPEAR_AND_DISAPPEAR = 3;
        static final int FLAG_APPEAR_PRE_AND_POST = 14;
        static final int FLAG_DISAPPEARED = 1;
        static final int FLAG_POST = 8;
        static final int FLAG_PRE = 4;
        static final int FLAG_PRE_AND_POST = 12;
        static n.a<InfoRecord> sPool = new n.b(20);
        int flags;

        @p0
        RecyclerView.ItemAnimator.ItemHolderInfo postInfo;

        @p0
        RecyclerView.ItemAnimator.ItemHolderInfo preInfo;

        private InfoRecord() {
        }

        static void drainCache() {
            while (sPool.a() != null) {
            }
        }

        static InfoRecord obtain() {
            InfoRecord infoRecordA = sPool.a();
            return infoRecordA == null ? new InfoRecord() : infoRecordA;
        }

        static void recycle(InfoRecord infoRecord) {
            infoRecord.flags = 0;
            infoRecord.preInfo = null;
            infoRecord.postInfo = null;
            sPool.b(infoRecord);
        }
    }

    public interface ProcessCallback {
        void processAppeared(RecyclerView.ViewHolder viewHolder, @p0 RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo, RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo2);

        void processDisappeared(RecyclerView.ViewHolder viewHolder, @n0 RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo, @p0 RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo2);

        void processPersistent(RecyclerView.ViewHolder viewHolder, @n0 RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo, @n0 RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo2);

        void unused(RecyclerView.ViewHolder viewHolder);
    }

    ViewInfoStore() {
    }

    private RecyclerView.ItemAnimator.ItemHolderInfo popFromLayoutStep(RecyclerView.ViewHolder viewHolder, int i10) {
        InfoRecord infoRecordK;
        RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo;
        int iE = this.mLayoutHolderMap.e(viewHolder);
        if (iE >= 0 && (infoRecordK = this.mLayoutHolderMap.k(iE)) != null) {
            int i11 = infoRecordK.flags;
            if ((i11 & i10) != 0) {
                int i12 = (~i10) & i11;
                infoRecordK.flags = i12;
                if (i10 == 4) {
                    itemHolderInfo = infoRecordK.preInfo;
                } else {
                    if (i10 != 8) {
                        throw new IllegalArgumentException("Must provide flag PRE or POST");
                    }
                    itemHolderInfo = infoRecordK.postInfo;
                }
                if ((i12 & 12) == 0) {
                    this.mLayoutHolderMap.i(iE);
                    InfoRecord.recycle(infoRecordK);
                }
                return itemHolderInfo;
            }
        }
        return null;
    }

    void addToAppearedInPreLayoutHolders(RecyclerView.ViewHolder viewHolder, RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo) {
        InfoRecord infoRecordObtain = this.mLayoutHolderMap.get(viewHolder);
        if (infoRecordObtain == null) {
            infoRecordObtain = InfoRecord.obtain();
            this.mLayoutHolderMap.put(viewHolder, infoRecordObtain);
        }
        infoRecordObtain.flags |= 2;
        infoRecordObtain.preInfo = itemHolderInfo;
    }

    void addToDisappearedInLayout(RecyclerView.ViewHolder viewHolder) {
        InfoRecord infoRecordObtain = this.mLayoutHolderMap.get(viewHolder);
        if (infoRecordObtain == null) {
            infoRecordObtain = InfoRecord.obtain();
            this.mLayoutHolderMap.put(viewHolder, infoRecordObtain);
        }
        infoRecordObtain.flags |= 1;
    }

    void addToOldChangeHolders(long j10, RecyclerView.ViewHolder viewHolder) {
        this.mOldChangedHolders.m(j10, viewHolder);
    }

    void addToPostLayout(RecyclerView.ViewHolder viewHolder, RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo) {
        InfoRecord infoRecordObtain = this.mLayoutHolderMap.get(viewHolder);
        if (infoRecordObtain == null) {
            infoRecordObtain = InfoRecord.obtain();
            this.mLayoutHolderMap.put(viewHolder, infoRecordObtain);
        }
        infoRecordObtain.postInfo = itemHolderInfo;
        infoRecordObtain.flags |= 8;
    }

    void addToPreLayout(RecyclerView.ViewHolder viewHolder, RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo) {
        InfoRecord infoRecordObtain = this.mLayoutHolderMap.get(viewHolder);
        if (infoRecordObtain == null) {
            infoRecordObtain = InfoRecord.obtain();
            this.mLayoutHolderMap.put(viewHolder, infoRecordObtain);
        }
        infoRecordObtain.preInfo = itemHolderInfo;
        infoRecordObtain.flags |= 4;
    }

    void clear() {
        this.mLayoutHolderMap.clear();
        this.mOldChangedHolders.b();
    }

    RecyclerView.ViewHolder getFromOldChangeHolders(long j10) {
        return this.mOldChangedHolders.g(j10);
    }

    boolean isDisappearing(RecyclerView.ViewHolder viewHolder) {
        InfoRecord infoRecord = this.mLayoutHolderMap.get(viewHolder);
        return (infoRecord == null || (infoRecord.flags & 1) == 0) ? false : true;
    }

    boolean isInPreLayout(RecyclerView.ViewHolder viewHolder) {
        InfoRecord infoRecord = this.mLayoutHolderMap.get(viewHolder);
        return (infoRecord == null || (infoRecord.flags & 4) == 0) ? false : true;
    }

    void onDetach() {
        InfoRecord.drainCache();
    }

    public void onViewDetached(RecyclerView.ViewHolder viewHolder) {
        removeFromDisappearedInLayout(viewHolder);
    }

    @p0
    RecyclerView.ItemAnimator.ItemHolderInfo popFromPostLayout(RecyclerView.ViewHolder viewHolder) {
        return popFromLayoutStep(viewHolder, 8);
    }

    @p0
    RecyclerView.ItemAnimator.ItemHolderInfo popFromPreLayout(RecyclerView.ViewHolder viewHolder) {
        return popFromLayoutStep(viewHolder, 4);
    }

    void process(ProcessCallback processCallback) {
        for (int size = this.mLayoutHolderMap.size() - 1; size >= 0; size--) {
            RecyclerView.ViewHolder viewHolderG = this.mLayoutHolderMap.g(size);
            InfoRecord infoRecordI = this.mLayoutHolderMap.i(size);
            int i10 = infoRecordI.flags;
            if ((i10 & 3) == 3) {
                processCallback.unused(viewHolderG);
            } else if ((i10 & 1) != 0) {
                RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo = infoRecordI.preInfo;
                if (itemHolderInfo == null) {
                    processCallback.unused(viewHolderG);
                } else {
                    processCallback.processDisappeared(viewHolderG, itemHolderInfo, infoRecordI.postInfo);
                }
            } else if ((i10 & 14) == 14) {
                processCallback.processAppeared(viewHolderG, infoRecordI.preInfo, infoRecordI.postInfo);
            } else if ((i10 & 12) == 12) {
                processCallback.processPersistent(viewHolderG, infoRecordI.preInfo, infoRecordI.postInfo);
            } else if ((i10 & 4) != 0) {
                processCallback.processDisappeared(viewHolderG, infoRecordI.preInfo, null);
            } else if ((i10 & 8) != 0) {
                processCallback.processAppeared(viewHolderG, infoRecordI.preInfo, infoRecordI.postInfo);
            }
            InfoRecord.recycle(infoRecordI);
        }
    }

    void removeFromDisappearedInLayout(RecyclerView.ViewHolder viewHolder) {
        InfoRecord infoRecord = this.mLayoutHolderMap.get(viewHolder);
        if (infoRecord == null) {
            return;
        }
        infoRecord.flags &= -2;
    }

    void removeViewHolder(RecyclerView.ViewHolder viewHolder) {
        for (int iV = this.mOldChangedHolders.v() - 1; iV >= 0; iV--) {
            if (viewHolder == this.mOldChangedHolders.w(iV)) {
                this.mOldChangedHolders.r(iV);
                break;
            }
        }
        InfoRecord infoRecordRemove = this.mLayoutHolderMap.remove(viewHolder);
        if (infoRecordRemove != null) {
            InfoRecord.recycle(infoRecordRemove);
        }
    }
}
