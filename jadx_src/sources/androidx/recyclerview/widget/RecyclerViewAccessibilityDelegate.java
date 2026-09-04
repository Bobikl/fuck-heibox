package androidx.recyclerview.widget;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.core.view.a;
import androidx.core.view.accessibility.a0;
import androidx.core.view.accessibility.c0;
import androidx.core.view.j1;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes6.dex */
public class RecyclerViewAccessibilityDelegate extends a {
    private final ItemDelegate mItemDelegate;
    final RecyclerView mRecyclerView;

    public static class ItemDelegate extends a {
        private Map<View, a> mOriginalItemDelegates = new WeakHashMap();
        final RecyclerViewAccessibilityDelegate mRecyclerViewDelegate;

        public ItemDelegate(@n0 RecyclerViewAccessibilityDelegate recyclerViewAccessibilityDelegate) {
            this.mRecyclerViewDelegate = recyclerViewAccessibilityDelegate;
        }

        @Override // androidx.core.view.a
        public boolean dispatchPopulateAccessibilityEvent(@n0 View view, @n0 AccessibilityEvent accessibilityEvent) {
            a aVar = this.mOriginalItemDelegates.get(view);
            return aVar != null ? aVar.dispatchPopulateAccessibilityEvent(view, accessibilityEvent) : super.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
        }

        @Override // androidx.core.view.a
        @p0
        public c0 getAccessibilityNodeProvider(@n0 View view) {
            a aVar = this.mOriginalItemDelegates.get(view);
            return aVar != null ? aVar.getAccessibilityNodeProvider(view) : super.getAccessibilityNodeProvider(view);
        }

        a getAndRemoveOriginalDelegateForItem(View view) {
            return this.mOriginalItemDelegates.remove(view);
        }

        @Override // androidx.core.view.a
        public void onInitializeAccessibilityEvent(@n0 View view, @n0 AccessibilityEvent accessibilityEvent) {
            a aVar = this.mOriginalItemDelegates.get(view);
            if (aVar != null) {
                aVar.onInitializeAccessibilityEvent(view, accessibilityEvent);
            } else {
                super.onInitializeAccessibilityEvent(view, accessibilityEvent);
            }
        }

        @Override // androidx.core.view.a
        public void onInitializeAccessibilityNodeInfo(View view, a0 a0Var) {
            if (this.mRecyclerViewDelegate.shouldIgnore() || this.mRecyclerViewDelegate.mRecyclerView.getLayoutManager() == null) {
                super.onInitializeAccessibilityNodeInfo(view, a0Var);
                return;
            }
            this.mRecyclerViewDelegate.mRecyclerView.getLayoutManager().onInitializeAccessibilityNodeInfoForItem(view, a0Var);
            a aVar = this.mOriginalItemDelegates.get(view);
            if (aVar != null) {
                aVar.onInitializeAccessibilityNodeInfo(view, a0Var);
            } else {
                super.onInitializeAccessibilityNodeInfo(view, a0Var);
            }
        }

        @Override // androidx.core.view.a
        public void onPopulateAccessibilityEvent(@n0 View view, @n0 AccessibilityEvent accessibilityEvent) {
            a aVar = this.mOriginalItemDelegates.get(view);
            if (aVar != null) {
                aVar.onPopulateAccessibilityEvent(view, accessibilityEvent);
            } else {
                super.onPopulateAccessibilityEvent(view, accessibilityEvent);
            }
        }

        @Override // androidx.core.view.a
        public boolean onRequestSendAccessibilityEvent(@n0 ViewGroup viewGroup, @n0 View view, @n0 AccessibilityEvent accessibilityEvent) {
            a aVar = this.mOriginalItemDelegates.get(viewGroup);
            return aVar != null ? aVar.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent) : super.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
        }

        @Override // androidx.core.view.a
        public boolean performAccessibilityAction(View view, int i10, Bundle bundle) {
            if (this.mRecyclerViewDelegate.shouldIgnore() || this.mRecyclerViewDelegate.mRecyclerView.getLayoutManager() == null) {
                return super.performAccessibilityAction(view, i10, bundle);
            }
            a aVar = this.mOriginalItemDelegates.get(view);
            if (aVar != null) {
                if (aVar.performAccessibilityAction(view, i10, bundle)) {
                    return true;
                }
            } else if (super.performAccessibilityAction(view, i10, bundle)) {
                return true;
            }
            return this.mRecyclerViewDelegate.mRecyclerView.getLayoutManager().performAccessibilityActionForItem(view, i10, bundle);
        }

        void saveOriginalDelegate(View view) {
            a aVarE = j1.E(view);
            if (aVarE == null || aVarE == this) {
                return;
            }
            this.mOriginalItemDelegates.put(view, aVarE);
        }

        @Override // androidx.core.view.a
        public void sendAccessibilityEvent(@n0 View view, int i10) {
            a aVar = this.mOriginalItemDelegates.get(view);
            if (aVar != null) {
                aVar.sendAccessibilityEvent(view, i10);
            } else {
                super.sendAccessibilityEvent(view, i10);
            }
        }

        @Override // androidx.core.view.a
        public void sendAccessibilityEventUnchecked(@n0 View view, @n0 AccessibilityEvent accessibilityEvent) {
            a aVar = this.mOriginalItemDelegates.get(view);
            if (aVar != null) {
                aVar.sendAccessibilityEventUnchecked(view, accessibilityEvent);
            } else {
                super.sendAccessibilityEventUnchecked(view, accessibilityEvent);
            }
        }
    }

    public RecyclerViewAccessibilityDelegate(@n0 RecyclerView recyclerView) {
        this.mRecyclerView = recyclerView;
        a itemDelegate = getItemDelegate();
        if (itemDelegate == null || !(itemDelegate instanceof ItemDelegate)) {
            this.mItemDelegate = new ItemDelegate(this);
        } else {
            this.mItemDelegate = (ItemDelegate) itemDelegate;
        }
    }

    @n0
    public a getItemDelegate() {
        return this.mItemDelegate;
    }

    @Override // androidx.core.view.a
    public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(view, accessibilityEvent);
        if (!(view instanceof RecyclerView) || shouldIgnore()) {
            return;
        }
        RecyclerView recyclerView = (RecyclerView) view;
        if (recyclerView.getLayoutManager() != null) {
            recyclerView.getLayoutManager().onInitializeAccessibilityEvent(accessibilityEvent);
        }
    }

    @Override // androidx.core.view.a
    public void onInitializeAccessibilityNodeInfo(View view, a0 a0Var) {
        super.onInitializeAccessibilityNodeInfo(view, a0Var);
        if (shouldIgnore() || this.mRecyclerView.getLayoutManager() == null) {
            return;
        }
        this.mRecyclerView.getLayoutManager().onInitializeAccessibilityNodeInfo(a0Var);
    }

    @Override // androidx.core.view.a
    public boolean performAccessibilityAction(View view, int i10, Bundle bundle) {
        if (super.performAccessibilityAction(view, i10, bundle)) {
            return true;
        }
        if (shouldIgnore() || this.mRecyclerView.getLayoutManager() == null) {
            return false;
        }
        return this.mRecyclerView.getLayoutManager().performAccessibilityAction(i10, bundle);
    }

    boolean shouldIgnore() {
        return this.mRecyclerView.hasPendingAdapterUpdates();
    }
}
