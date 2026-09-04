package androidx.recyclerview.widget;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class OpReorderer {
    final Callback mCallback;

    public interface Callback {
        AdapterHelper.UpdateOp obtainUpdateOp(int i10, int i11, int i12, Object obj);

        void recycleUpdateOp(AdapterHelper.UpdateOp updateOp);
    }

    OpReorderer(Callback callback) {
        this.mCallback = callback;
    }

    private int getLastMoveOutOfOrder(List<AdapterHelper.UpdateOp> list) {
        boolean z10 = false;
        for (int size = list.size() - 1; size >= 0; size--) {
            if (list.get(size).cmd != 8) {
                z10 = true;
            } else if (z10) {
                return size;
            }
        }
        return -1;
    }

    private void swapMoveAdd(List<AdapterHelper.UpdateOp> list, int i10, AdapterHelper.UpdateOp updateOp, int i11, AdapterHelper.UpdateOp updateOp2) {
        int i12 = updateOp.itemCount;
        int i13 = updateOp2.positionStart;
        int i14 = i12 < i13 ? -1 : 0;
        int i15 = updateOp.positionStart;
        if (i15 < i13) {
            i14++;
        }
        if (i13 <= i15) {
            updateOp.positionStart = i15 + updateOp2.itemCount;
        }
        int i16 = updateOp2.positionStart;
        if (i16 <= i12) {
            updateOp.itemCount = i12 + updateOp2.itemCount;
        }
        updateOp2.positionStart = i16 + i14;
        list.set(i10, updateOp2);
        list.set(i11, updateOp);
    }

    private void swapMoveOp(List<AdapterHelper.UpdateOp> list, int i10, int i11) {
        AdapterHelper.UpdateOp updateOp = list.get(i10);
        AdapterHelper.UpdateOp updateOp2 = list.get(i11);
        int i12 = updateOp2.cmd;
        if (i12 == 1) {
            swapMoveAdd(list, i10, updateOp, i11, updateOp2);
        } else if (i12 == 2) {
            swapMoveRemove(list, i10, updateOp, i11, updateOp2);
        } else {
            if (i12 != 4) {
                return;
            }
            swapMoveUpdate(list, i10, updateOp, i11, updateOp2);
        }
    }

    void reorderOps(List<AdapterHelper.UpdateOp> list) {
        while (true) {
            int lastMoveOutOfOrder = getLastMoveOutOfOrder(list);
            if (lastMoveOutOfOrder == -1) {
                return;
            } else {
                swapMoveOp(list, lastMoveOutOfOrder, lastMoveOutOfOrder + 1);
            }
        }
    }

    void swapMoveRemove(List<AdapterHelper.UpdateOp> list, int i10, AdapterHelper.UpdateOp updateOp, int i11, AdapterHelper.UpdateOp updateOp2) {
        boolean z10;
        int i12 = updateOp.positionStart;
        int i13 = updateOp.itemCount;
        boolean z11 = false;
        if (i12 < i13) {
            if (updateOp2.positionStart == i12 && updateOp2.itemCount == i13 - i12) {
                z10 = false;
                z11 = true;
            } else {
                z10 = false;
            }
        } else if (updateOp2.positionStart == i13 + 1 && updateOp2.itemCount == i12 - i13) {
            z10 = true;
            z11 = true;
        } else {
            z10 = true;
        }
        int i14 = updateOp2.positionStart;
        if (i13 < i14) {
            updateOp2.positionStart = i14 - 1;
        } else {
            int i15 = updateOp2.itemCount;
            if (i13 < i14 + i15) {
                updateOp2.itemCount = i15 - 1;
                updateOp.cmd = 2;
                updateOp.itemCount = 1;
                if (updateOp2.itemCount == 0) {
                    list.remove(i11);
                    this.mCallback.recycleUpdateOp(updateOp2);
                    return;
                }
                return;
            }
        }
        int i16 = updateOp.positionStart;
        int i17 = updateOp2.positionStart;
        AdapterHelper.UpdateOp updateOpObtainUpdateOp = null;
        if (i16 <= i17) {
            updateOp2.positionStart = i17 + 1;
        } else {
            int i18 = updateOp2.itemCount;
            if (i16 < i17 + i18) {
                updateOpObtainUpdateOp = this.mCallback.obtainUpdateOp(2, i16 + 1, (i17 + i18) - i16, null);
                updateOp2.itemCount = updateOp.positionStart - updateOp2.positionStart;
            }
        }
        if (z11) {
            list.set(i10, updateOp2);
            list.remove(i11);
            this.mCallback.recycleUpdateOp(updateOp);
            return;
        }
        if (z10) {
            if (updateOpObtainUpdateOp != null) {
                int i19 = updateOp.positionStart;
                if (i19 > updateOpObtainUpdateOp.positionStart) {
                    updateOp.positionStart = i19 - updateOpObtainUpdateOp.itemCount;
                }
                int i20 = updateOp.itemCount;
                if (i20 > updateOpObtainUpdateOp.positionStart) {
                    updateOp.itemCount = i20 - updateOpObtainUpdateOp.itemCount;
                }
            }
            int i21 = updateOp.positionStart;
            if (i21 > updateOp2.positionStart) {
                updateOp.positionStart = i21 - updateOp2.itemCount;
            }
            int i22 = updateOp.itemCount;
            if (i22 > updateOp2.positionStart) {
                updateOp.itemCount = i22 - updateOp2.itemCount;
            }
        } else {
            if (updateOpObtainUpdateOp != null) {
                int i23 = updateOp.positionStart;
                if (i23 >= updateOpObtainUpdateOp.positionStart) {
                    updateOp.positionStart = i23 - updateOpObtainUpdateOp.itemCount;
                }
                int i24 = updateOp.itemCount;
                if (i24 >= updateOpObtainUpdateOp.positionStart) {
                    updateOp.itemCount = i24 - updateOpObtainUpdateOp.itemCount;
                }
            }
            int i25 = updateOp.positionStart;
            if (i25 >= updateOp2.positionStart) {
                updateOp.positionStart = i25 - updateOp2.itemCount;
            }
            int i26 = updateOp.itemCount;
            if (i26 >= updateOp2.positionStart) {
                updateOp.itemCount = i26 - updateOp2.itemCount;
            }
        }
        list.set(i10, updateOp2);
        if (updateOp.positionStart != updateOp.itemCount) {
            list.set(i11, updateOp);
        } else {
            list.remove(i11);
        }
        if (updateOpObtainUpdateOp != null) {
            list.add(i10, updateOpObtainUpdateOp);
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0027  */
    /* JADX WARN: Code duplicated, block: B:12:0x002b  */
    /* JADX WARN: Code duplicated, block: B:14:0x0031  */
    /* JADX WARN: Code duplicated, block: B:17:0x0048  */
    /* JADX WARN: Code duplicated, block: B:18:0x004c  */
    /* JADX WARN: Code duplicated, block: B:20:0x0056  */
    /* JADX WARN: Code duplicated, block: B:22:0x005b  */
    /* JADX WARN: Code duplicated, block: B:24:? A[RETURN, SYNTHETIC] */
    void swapMoveUpdate(List<AdapterHelper.UpdateOp> list, int i10, AdapterHelper.UpdateOp updateOp, int i11, AdapterHelper.UpdateOp updateOp2) {
        AdapterHelper.UpdateOp updateOpObtainUpdateOp;
        int i12;
        int i13;
        int i14;
        int i15 = updateOp.itemCount;
        int i16 = updateOp2.positionStart;
        AdapterHelper.UpdateOp updateOpObtainUpdateOp2 = null;
        if (i15 >= i16) {
            int i17 = updateOp2.itemCount;
            if (i15 < i16 + i17) {
                updateOp2.itemCount = i17 - 1;
                updateOpObtainUpdateOp = this.mCallback.obtainUpdateOp(4, updateOp.positionStart, 1, updateOp2.payload);
            }
            i12 = updateOp.positionStart;
            i13 = updateOp2.positionStart;
            if (i12 <= i13) {
                updateOp2.positionStart = i13 + 1;
            } else {
                i14 = updateOp2.itemCount;
                if (i12 < i13 + i14) {
                    int i18 = (i13 + i14) - i12;
                    updateOpObtainUpdateOp2 = this.mCallback.obtainUpdateOp(4, i12 + 1, i18, updateOp2.payload);
                    updateOp2.itemCount -= i18;
                }
            }
            list.set(i11, updateOp);
            if (updateOp2.itemCount > 0) {
                list.set(i10, updateOp2);
            } else {
                list.remove(i10);
                this.mCallback.recycleUpdateOp(updateOp2);
            }
            if (updateOpObtainUpdateOp != null) {
                list.add(i10, updateOpObtainUpdateOp);
            }
            if (updateOpObtainUpdateOp2 != null) {
                list.add(i10, updateOpObtainUpdateOp2);
            }
        }
        updateOp2.positionStart = i16 - 1;
        updateOpObtainUpdateOp = null;
        i12 = updateOp.positionStart;
        i13 = updateOp2.positionStart;
        if (i12 <= i13) {
            updateOp2.positionStart = i13 + 1;
        } else {
            i14 = updateOp2.itemCount;
            if (i12 < i13 + i14) {
                int i19 = (i13 + i14) - i12;
                updateOpObtainUpdateOp2 = this.mCallback.obtainUpdateOp(4, i12 + 1, i19, updateOp2.payload);
                updateOp2.itemCount -= i19;
            }
        }
        list.set(i11, updateOp);
        if (updateOp2.itemCount > 0) {
            list.set(i10, updateOp2);
        } else {
            list.remove(i10);
            this.mCallback.recycleUpdateOp(updateOp2);
        }
        if (updateOpObtainUpdateOp != null) {
            list.add(i10, updateOpObtainUpdateOp);
        }
        if (updateOpObtainUpdateOp2 != null) {
            list.add(i10, updateOpObtainUpdateOp2);
        }
    }
}
