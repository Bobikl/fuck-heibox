package androidx.core.view;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import androidx.annotation.RestrictTo;
import androidx.core.R;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: AccessibilityDelegateCompat.java */
/* JADX INFO: loaded from: classes.dex */
public class a {
    private static final View.AccessibilityDelegate DEFAULT_DELEGATE = new View.AccessibilityDelegate();
    private final View.AccessibilityDelegate mBridge;
    private final View.AccessibilityDelegate mOriginalDelegate;

    /* JADX INFO: renamed from: androidx.core.view.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: AccessibilityDelegateCompat.java */
    public static final class C0144a extends View.AccessibilityDelegate {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final a f21326a;

        C0144a(a aVar) {
            this.f21326a = aVar;
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            return this.f21326a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        @androidx.annotation.w0(16)
        public AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
            androidx.core.view.accessibility.c0 accessibilityNodeProvider = this.f21326a.getAccessibilityNodeProvider(view);
            if (accessibilityNodeProvider != null) {
                return (AccessibilityNodeProvider) accessibilityNodeProvider.e();
            }
            return null;
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f21326a.onInitializeAccessibilityEvent(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            androidx.core.view.accessibility.a0 a0VarG2 = androidx.core.view.accessibility.a0.g2(accessibilityNodeInfo);
            a0VarG2.L1(j1.Z0(view));
            a0VarG2.p1(j1.N0(view));
            a0VarG2.E1(j1.J(view));
            a0VarG2.R1(j1.v0(view));
            this.f21326a.onInitializeAccessibilityNodeInfo(view, a0VarG2);
            a0VarG2.f(accessibilityNodeInfo.getText(), view);
            List<androidx.core.view.accessibility.a0.a> actionList = a.getActionList(view);
            for (int i10 = 0; i10 < actionList.size(); i10++) {
                a0VarG2.b(actionList.get(i10));
            }
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f21326a.onPopulateAccessibilityEvent(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            return this.f21326a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean performAccessibilityAction(View view, int i10, Bundle bundle) {
            return this.f21326a.performAccessibilityAction(view, i10, bundle);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void sendAccessibilityEvent(View view, int i10) {
            this.f21326a.sendAccessibilityEvent(view, i10);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
            this.f21326a.sendAccessibilityEventUnchecked(view, accessibilityEvent);
        }
    }

    /* JADX INFO: compiled from: AccessibilityDelegateCompat.java */
    @androidx.annotation.w0(16)
    public static class b {
        private b() {
        }

        @androidx.annotation.u
        static AccessibilityNodeProvider a(View.AccessibilityDelegate accessibilityDelegate, View view) {
            return accessibilityDelegate.getAccessibilityNodeProvider(view);
        }

        @androidx.annotation.u
        static boolean b(View.AccessibilityDelegate accessibilityDelegate, View view, int i10, Bundle bundle) {
            return accessibilityDelegate.performAccessibilityAction(view, i10, bundle);
        }
    }

    public a() {
        this(DEFAULT_DELEGATE);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public a(@androidx.annotation.n0 View.AccessibilityDelegate accessibilityDelegate) {
        this.mOriginalDelegate = accessibilityDelegate;
        this.mBridge = new C0144a(this);
    }

    static List<androidx.core.view.accessibility.a0.a> getActionList(View view) {
        List<androidx.core.view.accessibility.a0.a> list = (List) view.getTag(R.id.tag_accessibility_actions);
        return list == null ? Collections.emptyList() : list;
    }

    private boolean isSpanStillValid(ClickableSpan clickableSpan, View view) {
        if (clickableSpan != null) {
            ClickableSpan[] clickableSpanArrX = androidx.core.view.accessibility.a0.x(view.createAccessibilityNodeInfo().getText());
            for (int i10 = 0; clickableSpanArrX != null && i10 < clickableSpanArrX.length; i10++) {
                if (clickableSpan.equals(clickableSpanArrX[i10])) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean performClickableSpanAction(int i10, View view) {
        WeakReference weakReference;
        SparseArray sparseArray = (SparseArray) view.getTag(R.id.tag_accessibility_clickable_spans);
        if (sparseArray == null || (weakReference = (WeakReference) sparseArray.get(i10)) == null) {
            return false;
        }
        ClickableSpan clickableSpan = (ClickableSpan) weakReference.get();
        if (!isSpanStillValid(clickableSpan, view)) {
            return false;
        }
        clickableSpan.onClick(view);
        return true;
    }

    public boolean dispatchPopulateAccessibilityEvent(@androidx.annotation.n0 View view, @androidx.annotation.n0 AccessibilityEvent accessibilityEvent) {
        return this.mOriginalDelegate.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    @androidx.annotation.p0
    public androidx.core.view.accessibility.c0 getAccessibilityNodeProvider(@androidx.annotation.n0 View view) {
        AccessibilityNodeProvider accessibilityNodeProviderA = b.a(this.mOriginalDelegate, view);
        if (accessibilityNodeProviderA != null) {
            return new androidx.core.view.accessibility.c0(accessibilityNodeProviderA);
        }
        return null;
    }

    View.AccessibilityDelegate getBridge() {
        return this.mBridge;
    }

    public void onInitializeAccessibilityEvent(@androidx.annotation.n0 View view, @androidx.annotation.n0 AccessibilityEvent accessibilityEvent) {
        this.mOriginalDelegate.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public void onInitializeAccessibilityNodeInfo(@androidx.annotation.n0 View view, @androidx.annotation.n0 androidx.core.view.accessibility.a0 a0Var) {
        this.mOriginalDelegate.onInitializeAccessibilityNodeInfo(view, a0Var.f2());
    }

    public void onPopulateAccessibilityEvent(@androidx.annotation.n0 View view, @androidx.annotation.n0 AccessibilityEvent accessibilityEvent) {
        this.mOriginalDelegate.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public boolean onRequestSendAccessibilityEvent(@androidx.annotation.n0 ViewGroup viewGroup, @androidx.annotation.n0 View view, @androidx.annotation.n0 AccessibilityEvent accessibilityEvent) {
        return this.mOriginalDelegate.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    public boolean performAccessibilityAction(@androidx.annotation.n0 View view, int i10, @androidx.annotation.p0 Bundle bundle) {
        List<androidx.core.view.accessibility.a0.a> actionList = getActionList(view);
        boolean zB = false;
        for (int i11 = 0; i11 < actionList.size(); i11++) {
            androidx.core.view.accessibility.a0.a aVar = actionList.get(i11);
            if (aVar.b() == i10) {
                zB = aVar.d(view, bundle);
                break;
            }
        }
        if (!zB) {
            zB = b.b(this.mOriginalDelegate, view, i10, bundle);
        }
        return (zB || i10 != R.id.accessibility_action_clickable_span || bundle == null) ? zB : performClickableSpanAction(bundle.getInt(androidx.core.view.accessibility.a.f21330e, -1), view);
    }

    public void sendAccessibilityEvent(@androidx.annotation.n0 View view, int i10) {
        this.mOriginalDelegate.sendAccessibilityEvent(view, i10);
    }

    public void sendAccessibilityEventUnchecked(@androidx.annotation.n0 View view, @androidx.annotation.n0 AccessibilityEvent accessibilityEvent) {
        this.mOriginalDelegate.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }
}
