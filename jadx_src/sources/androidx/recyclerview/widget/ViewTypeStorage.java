package androidx.recyclerview.widget;

import android.util.SparseArray;
import android.util.SparseIntArray;
import androidx.annotation.n0;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public interface ViewTypeStorage {

    public static class IsolatedViewTypeStorage implements ViewTypeStorage {
        SparseArray<NestedAdapterWrapper> mGlobalTypeToWrapper = new SparseArray<>();
        int mNextViewType = 0;

        public class WrapperViewTypeLookup implements ViewTypeLookup {
            final NestedAdapterWrapper mWrapper;
            private SparseIntArray mLocalToGlobalMapping = new SparseIntArray(1);
            private SparseIntArray mGlobalToLocalMapping = new SparseIntArray(1);

            WrapperViewTypeLookup(NestedAdapterWrapper nestedAdapterWrapper) {
                this.mWrapper = nestedAdapterWrapper;
            }

            @Override // androidx.recyclerview.widget.ViewTypeStorage.ViewTypeLookup
            public void dispose() {
                IsolatedViewTypeStorage.this.removeWrapper(this.mWrapper);
            }

            @Override // androidx.recyclerview.widget.ViewTypeStorage.ViewTypeLookup
            public int globalToLocal(int i10) {
                int iIndexOfKey = this.mGlobalToLocalMapping.indexOfKey(i10);
                if (iIndexOfKey >= 0) {
                    return this.mGlobalToLocalMapping.valueAt(iIndexOfKey);
                }
                throw new IllegalStateException("requested global type " + i10 + " does not belong to the adapter:" + this.mWrapper.adapter);
            }

            @Override // androidx.recyclerview.widget.ViewTypeStorage.ViewTypeLookup
            public int localToGlobal(int i10) {
                int iIndexOfKey = this.mLocalToGlobalMapping.indexOfKey(i10);
                if (iIndexOfKey > -1) {
                    return this.mLocalToGlobalMapping.valueAt(iIndexOfKey);
                }
                int iObtainViewType = IsolatedViewTypeStorage.this.obtainViewType(this.mWrapper);
                this.mLocalToGlobalMapping.put(i10, iObtainViewType);
                this.mGlobalToLocalMapping.put(iObtainViewType, i10);
                return iObtainViewType;
            }
        }

        @Override // androidx.recyclerview.widget.ViewTypeStorage
        @n0
        public ViewTypeLookup createViewTypeWrapper(@n0 NestedAdapterWrapper nestedAdapterWrapper) {
            return new WrapperViewTypeLookup(nestedAdapterWrapper);
        }

        @Override // androidx.recyclerview.widget.ViewTypeStorage
        @n0
        public NestedAdapterWrapper getWrapperForGlobalType(int i10) {
            NestedAdapterWrapper nestedAdapterWrapper = this.mGlobalTypeToWrapper.get(i10);
            if (nestedAdapterWrapper != null) {
                return nestedAdapterWrapper;
            }
            throw new IllegalArgumentException("Cannot find the wrapper for global view type " + i10);
        }

        int obtainViewType(NestedAdapterWrapper nestedAdapterWrapper) {
            int i10 = this.mNextViewType;
            this.mNextViewType = i10 + 1;
            this.mGlobalTypeToWrapper.put(i10, nestedAdapterWrapper);
            return i10;
        }

        void removeWrapper(@n0 NestedAdapterWrapper nestedAdapterWrapper) {
            for (int size = this.mGlobalTypeToWrapper.size() - 1; size >= 0; size--) {
                if (this.mGlobalTypeToWrapper.valueAt(size) == nestedAdapterWrapper) {
                    this.mGlobalTypeToWrapper.removeAt(size);
                }
            }
        }
    }

    public static class SharedIdRangeViewTypeStorage implements ViewTypeStorage {
        SparseArray<List<NestedAdapterWrapper>> mGlobalTypeToWrapper = new SparseArray<>();

        public class WrapperViewTypeLookup implements ViewTypeLookup {
            final NestedAdapterWrapper mWrapper;

            WrapperViewTypeLookup(NestedAdapterWrapper nestedAdapterWrapper) {
                this.mWrapper = nestedAdapterWrapper;
            }

            @Override // androidx.recyclerview.widget.ViewTypeStorage.ViewTypeLookup
            public void dispose() {
                SharedIdRangeViewTypeStorage.this.removeWrapper(this.mWrapper);
            }

            @Override // androidx.recyclerview.widget.ViewTypeStorage.ViewTypeLookup
            public int globalToLocal(int i10) {
                return i10;
            }

            @Override // androidx.recyclerview.widget.ViewTypeStorage.ViewTypeLookup
            public int localToGlobal(int i10) {
                List<NestedAdapterWrapper> arrayList = SharedIdRangeViewTypeStorage.this.mGlobalTypeToWrapper.get(i10);
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                    SharedIdRangeViewTypeStorage.this.mGlobalTypeToWrapper.put(i10, arrayList);
                }
                if (!arrayList.contains(this.mWrapper)) {
                    arrayList.add(this.mWrapper);
                }
                return i10;
            }
        }

        @Override // androidx.recyclerview.widget.ViewTypeStorage
        @n0
        public ViewTypeLookup createViewTypeWrapper(@n0 NestedAdapterWrapper nestedAdapterWrapper) {
            return new WrapperViewTypeLookup(nestedAdapterWrapper);
        }

        @Override // androidx.recyclerview.widget.ViewTypeStorage
        @n0
        public NestedAdapterWrapper getWrapperForGlobalType(int i10) {
            List<NestedAdapterWrapper> list = this.mGlobalTypeToWrapper.get(i10);
            if (list != null && !list.isEmpty()) {
                return list.get(0);
            }
            throw new IllegalArgumentException("Cannot find the wrapper for global view type " + i10);
        }

        void removeWrapper(@n0 NestedAdapterWrapper nestedAdapterWrapper) {
            for (int size = this.mGlobalTypeToWrapper.size() - 1; size >= 0; size--) {
                List<NestedAdapterWrapper> listValueAt = this.mGlobalTypeToWrapper.valueAt(size);
                if (listValueAt.remove(nestedAdapterWrapper) && listValueAt.isEmpty()) {
                    this.mGlobalTypeToWrapper.removeAt(size);
                }
            }
        }
    }

    public interface ViewTypeLookup {
        void dispose();

        int globalToLocal(int i10);

        int localToGlobal(int i10);
    }

    @n0
    ViewTypeLookup createViewTypeWrapper(@n0 NestedAdapterWrapper nestedAdapterWrapper);

    @n0
    NestedAdapterWrapper getWrapperForGlobalType(int i10);
}
