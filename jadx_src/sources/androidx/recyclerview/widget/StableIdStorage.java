package androidx.recyclerview.widget;

import androidx.annotation.n0;
import androidx.collection.x0;

/* JADX INFO: loaded from: classes6.dex */
public interface StableIdStorage {

    public static class IsolatedStableIdStorage implements StableIdStorage {
        long mNextStableId = 0;

        public class WrapperStableIdLookup implements StableIdLookup {
            private final x0<Long> mLocalToGlobalLookup = new x0<>();

            WrapperStableIdLookup() {
            }

            @Override // androidx.recyclerview.widget.StableIdStorage.StableIdLookup
            public long localToGlobal(long j10) {
                Long lG = this.mLocalToGlobalLookup.g(j10);
                if (lG == null) {
                    lG = Long.valueOf(IsolatedStableIdStorage.this.obtainId());
                    this.mLocalToGlobalLookup.m(j10, lG);
                }
                return lG.longValue();
            }
        }

        @Override // androidx.recyclerview.widget.StableIdStorage
        @n0
        public StableIdLookup createStableIdLookup() {
            return new WrapperStableIdLookup();
        }

        long obtainId() {
            long j10 = this.mNextStableId;
            this.mNextStableId = 1 + j10;
            return j10;
        }
    }

    public static class NoStableIdStorage implements StableIdStorage {
        private final StableIdLookup mNoIdLookup = new StableIdLookup() { // from class: androidx.recyclerview.widget.StableIdStorage.NoStableIdStorage.1
            @Override // androidx.recyclerview.widget.StableIdStorage.StableIdLookup
            public long localToGlobal(long j10) {
                return -1L;
            }
        };

        @Override // androidx.recyclerview.widget.StableIdStorage
        @n0
        public StableIdLookup createStableIdLookup() {
            return this.mNoIdLookup;
        }
    }

    public static class SharedPoolStableIdStorage implements StableIdStorage {
        private final StableIdLookup mSameIdLookup = new StableIdLookup() { // from class: androidx.recyclerview.widget.StableIdStorage.SharedPoolStableIdStorage.1
            @Override // androidx.recyclerview.widget.StableIdStorage.StableIdLookup
            public long localToGlobal(long j10) {
                return j10;
            }
        };

        @Override // androidx.recyclerview.widget.StableIdStorage
        @n0
        public StableIdLookup createStableIdLookup() {
            return this.mSameIdLookup;
        }
    }

    public interface StableIdLookup {
        long localToGlobal(long j10);
    }

    @n0
    StableIdLookup createStableIdLookup();
}
