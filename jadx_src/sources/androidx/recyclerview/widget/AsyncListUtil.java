package androidx.recyclerview.widget;

import android.util.Log;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import androidx.annotation.i1;
import androidx.annotation.k1;
import androidx.annotation.n0;
import androidx.annotation.p0;

/* JADX INFO: loaded from: classes6.dex */
public class AsyncListUtil<T> {
    static final boolean DEBUG = false;
    static final String TAG = "AsyncListUtil";
    boolean mAllowScrollHints;
    private final ThreadUtil.BackgroundCallback<T> mBackgroundCallback;
    final ThreadUtil.BackgroundCallback<T> mBackgroundProxy;
    final DataCallback<T> mDataCallback;
    private final ThreadUtil.MainThreadCallback<T> mMainThreadCallback;
    final ThreadUtil.MainThreadCallback<T> mMainThreadProxy;
    final Class<T> mTClass;
    final TileList<T> mTileList;
    final int mTileSize;
    final ViewCallback mViewCallback;
    final int[] mTmpRange = new int[2];
    final int[] mPrevRange = new int[2];
    final int[] mTmpRangeExtended = new int[2];
    private int mScrollHint = 0;
    int mItemCount = 0;
    int mDisplayedGeneration = 0;
    int mRequestedGeneration = 0;
    final SparseIntArray mMissingPositions = new SparseIntArray();

    public static abstract class DataCallback<T> {
        @k1
        public abstract void fillData(@n0 T[] tArr, int i10, int i11);

        @k1
        public int getMaxCachedTiles() {
            return 10;
        }

        @k1
        public void recycleData(@n0 T[] tArr, int i10) {
        }

        @k1
        public abstract int refreshData();
    }

    public static abstract class ViewCallback {
        public static final int HINT_SCROLL_ASC = 2;
        public static final int HINT_SCROLL_DESC = 1;
        public static final int HINT_SCROLL_NONE = 0;

        @i1
        public void extendRangeInto(@n0 int[] iArr, @n0 int[] iArr2, int i10) {
            int i11 = iArr[1];
            int i12 = iArr[0];
            int i13 = (i11 - i12) + 1;
            int i14 = i13 / 2;
            iArr2[0] = i12 - (i10 == 1 ? i13 : i14);
            if (i10 != 2) {
                i13 = i14;
            }
            iArr2[1] = i11 + i13;
        }

        @i1
        public abstract void getItemRangeInto(@n0 int[] iArr);

        @i1
        public abstract void onDataRefresh();

        @i1
        public abstract void onItemLoaded(int i10);
    }

    public AsyncListUtil(@n0 Class<T> cls, int i10, @n0 DataCallback<T> dataCallback, @n0 ViewCallback viewCallback) {
        ThreadUtil.MainThreadCallback<T> mainThreadCallback = new ThreadUtil.MainThreadCallback<T>() { // from class: androidx.recyclerview.widget.AsyncListUtil.1
            private boolean isRequestedGeneration(int i11) {
                return i11 == AsyncListUtil.this.mRequestedGeneration;
            }

            private void recycleAllTiles() {
                for (int i11 = 0; i11 < AsyncListUtil.this.mTileList.size(); i11++) {
                    AsyncListUtil asyncListUtil = AsyncListUtil.this;
                    asyncListUtil.mBackgroundProxy.recycleTile(asyncListUtil.mTileList.getAtIndex(i11));
                }
                AsyncListUtil.this.mTileList.clear();
            }

            @Override // androidx.recyclerview.widget.ThreadUtil.MainThreadCallback
            public void addTile(int i11, TileList.Tile<T> tile) {
                if (!isRequestedGeneration(i11)) {
                    AsyncListUtil.this.mBackgroundProxy.recycleTile(tile);
                    return;
                }
                TileList.Tile<T> tileAddOrReplace = AsyncListUtil.this.mTileList.addOrReplace(tile);
                if (tileAddOrReplace != null) {
                    Log.e(AsyncListUtil.TAG, "duplicate tile @" + tileAddOrReplace.mStartPosition);
                    AsyncListUtil.this.mBackgroundProxy.recycleTile(tileAddOrReplace);
                }
                int i12 = tile.mStartPosition + tile.mItemCount;
                int i13 = 0;
                while (i13 < AsyncListUtil.this.mMissingPositions.size()) {
                    int iKeyAt = AsyncListUtil.this.mMissingPositions.keyAt(i13);
                    if (tile.mStartPosition > iKeyAt || iKeyAt >= i12) {
                        i13++;
                    } else {
                        AsyncListUtil.this.mMissingPositions.removeAt(i13);
                        AsyncListUtil.this.mViewCallback.onItemLoaded(iKeyAt);
                    }
                }
            }

            @Override // androidx.recyclerview.widget.ThreadUtil.MainThreadCallback
            public void removeTile(int i11, int i12) {
                if (isRequestedGeneration(i11)) {
                    TileList.Tile<T> tileRemoveAtPos = AsyncListUtil.this.mTileList.removeAtPos(i12);
                    if (tileRemoveAtPos != null) {
                        AsyncListUtil.this.mBackgroundProxy.recycleTile(tileRemoveAtPos);
                        return;
                    }
                    Log.e(AsyncListUtil.TAG, "tile not found @" + i12);
                }
            }

            @Override // androidx.recyclerview.widget.ThreadUtil.MainThreadCallback
            public void updateItemCount(int i11, int i12) {
                if (isRequestedGeneration(i11)) {
                    AsyncListUtil asyncListUtil = AsyncListUtil.this;
                    asyncListUtil.mItemCount = i12;
                    asyncListUtil.mViewCallback.onDataRefresh();
                    AsyncListUtil asyncListUtil2 = AsyncListUtil.this;
                    asyncListUtil2.mDisplayedGeneration = asyncListUtil2.mRequestedGeneration;
                    recycleAllTiles();
                    AsyncListUtil asyncListUtil3 = AsyncListUtil.this;
                    asyncListUtil3.mAllowScrollHints = false;
                    asyncListUtil3.updateRange();
                }
            }
        };
        this.mMainThreadCallback = mainThreadCallback;
        ThreadUtil.BackgroundCallback<T> backgroundCallback = new ThreadUtil.BackgroundCallback<T>() { // from class: androidx.recyclerview.widget.AsyncListUtil.2
            private int mFirstRequiredTileStart;
            private int mGeneration;
            private int mItemCount;
            private int mLastRequiredTileStart;
            final SparseBooleanArray mLoadedTiles = new SparseBooleanArray();
            private TileList.Tile<T> mRecycledRoot;

            private TileList.Tile<T> acquireTile() {
                TileList.Tile<T> tile = this.mRecycledRoot;
                if (tile != null) {
                    this.mRecycledRoot = tile.mNext;
                    return tile;
                }
                AsyncListUtil asyncListUtil = AsyncListUtil.this;
                return new TileList.Tile<>(asyncListUtil.mTClass, asyncListUtil.mTileSize);
            }

            private void addTile(TileList.Tile<T> tile) {
                this.mLoadedTiles.put(tile.mStartPosition, true);
                AsyncListUtil.this.mMainThreadProxy.addTile(this.mGeneration, tile);
            }

            private void flushTileCache(int i11) {
                int maxCachedTiles = AsyncListUtil.this.mDataCallback.getMaxCachedTiles();
                while (this.mLoadedTiles.size() >= maxCachedTiles) {
                    int iKeyAt = this.mLoadedTiles.keyAt(0);
                    SparseBooleanArray sparseBooleanArray = this.mLoadedTiles;
                    int iKeyAt2 = sparseBooleanArray.keyAt(sparseBooleanArray.size() - 1);
                    int i12 = this.mFirstRequiredTileStart - iKeyAt;
                    int i13 = iKeyAt2 - this.mLastRequiredTileStart;
                    if (i12 > 0 && (i12 >= i13 || i11 == 2)) {
                        removeTile(iKeyAt);
                    } else {
                        if (i13 <= 0) {
                            return;
                        }
                        if (i12 >= i13 && i11 != 1) {
                            return;
                        } else {
                            removeTile(iKeyAt2);
                        }
                    }
                }
            }

            private int getTileStart(int i11) {
                return i11 - (i11 % AsyncListUtil.this.mTileSize);
            }

            private boolean isTileLoaded(int i11) {
                return this.mLoadedTiles.get(i11);
            }

            private void log(String str, Object... objArr) {
                Log.d(AsyncListUtil.TAG, "[BKGR] " + String.format(str, objArr));
            }

            private void removeTile(int i11) {
                this.mLoadedTiles.delete(i11);
                AsyncListUtil.this.mMainThreadProxy.removeTile(this.mGeneration, i11);
            }

            private void requestTiles(int i11, int i12, int i13, boolean z10) {
                int i14 = i11;
                while (i14 <= i12) {
                    AsyncListUtil.this.mBackgroundProxy.loadTile(z10 ? (i12 + i11) - i14 : i14, i13);
                    i14 += AsyncListUtil.this.mTileSize;
                }
            }

            @Override // androidx.recyclerview.widget.ThreadUtil.BackgroundCallback
            public void loadTile(int i11, int i12) {
                if (isTileLoaded(i11)) {
                    return;
                }
                TileList.Tile<T> tileAcquireTile = acquireTile();
                tileAcquireTile.mStartPosition = i11;
                int iMin = Math.min(AsyncListUtil.this.mTileSize, this.mItemCount - i11);
                tileAcquireTile.mItemCount = iMin;
                AsyncListUtil.this.mDataCallback.fillData(tileAcquireTile.mItems, tileAcquireTile.mStartPosition, iMin);
                flushTileCache(i12);
                addTile(tileAcquireTile);
            }

            @Override // androidx.recyclerview.widget.ThreadUtil.BackgroundCallback
            public void recycleTile(TileList.Tile<T> tile) {
                AsyncListUtil.this.mDataCallback.recycleData(tile.mItems, tile.mItemCount);
                tile.mNext = this.mRecycledRoot;
                this.mRecycledRoot = tile;
            }

            @Override // androidx.recyclerview.widget.ThreadUtil.BackgroundCallback
            public void refresh(int i11) {
                this.mGeneration = i11;
                this.mLoadedTiles.clear();
                int iRefreshData = AsyncListUtil.this.mDataCallback.refreshData();
                this.mItemCount = iRefreshData;
                AsyncListUtil.this.mMainThreadProxy.updateItemCount(this.mGeneration, iRefreshData);
            }

            @Override // androidx.recyclerview.widget.ThreadUtil.BackgroundCallback
            public void updateRange(int i11, int i12, int i13, int i14, int i15) {
                if (i11 > i12) {
                    return;
                }
                int tileStart = getTileStart(i11);
                int tileStart2 = getTileStart(i12);
                this.mFirstRequiredTileStart = getTileStart(i13);
                int tileStart3 = getTileStart(i14);
                this.mLastRequiredTileStart = tileStart3;
                if (i15 == 1) {
                    requestTiles(this.mFirstRequiredTileStart, tileStart2, i15, true);
                    requestTiles(tileStart2 + AsyncListUtil.this.mTileSize, this.mLastRequiredTileStart, i15, false);
                } else {
                    requestTiles(tileStart, tileStart3, i15, false);
                    requestTiles(this.mFirstRequiredTileStart, tileStart - AsyncListUtil.this.mTileSize, i15, true);
                }
            }
        };
        this.mBackgroundCallback = backgroundCallback;
        this.mTClass = cls;
        this.mTileSize = i10;
        this.mDataCallback = dataCallback;
        this.mViewCallback = viewCallback;
        this.mTileList = new TileList<>(i10);
        MessageThreadUtil messageThreadUtil = new MessageThreadUtil();
        this.mMainThreadProxy = messageThreadUtil.getMainThreadProxy(mainThreadCallback);
        this.mBackgroundProxy = messageThreadUtil.getBackgroundProxy(backgroundCallback);
        refresh();
    }

    private boolean isRefreshPending() {
        return this.mRequestedGeneration != this.mDisplayedGeneration;
    }

    @p0
    public T getItem(int i10) {
        if (i10 < 0 || i10 >= this.mItemCount) {
            throw new IndexOutOfBoundsException(i10 + " is not within 0 and " + this.mItemCount);
        }
        T itemAt = this.mTileList.getItemAt(i10);
        if (itemAt == null && !isRefreshPending()) {
            this.mMissingPositions.put(i10, 0);
        }
        return itemAt;
    }

    public int getItemCount() {
        return this.mItemCount;
    }

    void log(String str, Object... objArr) {
        Log.d(TAG, "[MAIN] " + String.format(str, objArr));
    }

    public void onRangeChanged() {
        if (isRefreshPending()) {
            return;
        }
        updateRange();
        this.mAllowScrollHints = true;
    }

    public void refresh() {
        this.mMissingPositions.clear();
        ThreadUtil.BackgroundCallback<T> backgroundCallback = this.mBackgroundProxy;
        int i10 = this.mRequestedGeneration + 1;
        this.mRequestedGeneration = i10;
        backgroundCallback.refresh(i10);
    }

    void updateRange() {
        int i10;
        this.mViewCallback.getItemRangeInto(this.mTmpRange);
        int[] iArr = this.mTmpRange;
        int i11 = iArr[0];
        int i12 = iArr[1];
        if (i11 > i12 || i11 < 0 || i12 >= this.mItemCount) {
            return;
        }
        if (this.mAllowScrollHints) {
            int[] iArr2 = this.mPrevRange;
            if (i11 > iArr2[1] || (i10 = iArr2[0]) > i12) {
                this.mScrollHint = 0;
            } else if (i11 < i10) {
                this.mScrollHint = 1;
            } else if (i11 > i10) {
                this.mScrollHint = 2;
            }
        } else {
            this.mScrollHint = 0;
        }
        int[] iArr3 = this.mPrevRange;
        iArr3[0] = i11;
        iArr3[1] = i12;
        this.mViewCallback.extendRangeInto(iArr, this.mTmpRangeExtended, this.mScrollHint);
        int[] iArr4 = this.mTmpRangeExtended;
        iArr4[0] = Math.min(this.mTmpRange[0], Math.max(iArr4[0], 0));
        int[] iArr5 = this.mTmpRangeExtended;
        iArr5[1] = Math.max(this.mTmpRange[1], Math.min(iArr5[1], this.mItemCount - 1));
        ThreadUtil.BackgroundCallback<T> backgroundCallback = this.mBackgroundProxy;
        int[] iArr6 = this.mTmpRange;
        int i13 = iArr6[0];
        int i14 = iArr6[1];
        int[] iArr7 = this.mTmpRangeExtended;
        backgroundCallback.updateRange(i13, i14, iArr7[0], iArr7[1], this.mScrollHint);
    }
}
