package androidx.recyclerview.widget;

/* JADX INFO: loaded from: classes6.dex */
public interface ThreadUtil<T> {

    public interface BackgroundCallback<T> {
        void loadTile(int i10, int i11);

        void recycleTile(TileList.Tile<T> tile);

        void refresh(int i10);

        void updateRange(int i10, int i11, int i12, int i13, int i14);
    }

    public interface MainThreadCallback<T> {
        void addTile(int i10, TileList.Tile<T> tile);

        void removeTile(int i10, int i11);

        void updateItemCount(int i10, int i11);
    }

    BackgroundCallback<T> getBackgroundProxy(BackgroundCallback<T> backgroundCallback);

    MainThreadCallback<T> getMainThreadProxy(MainThreadCallback<T> mainThreadCallback);
}
