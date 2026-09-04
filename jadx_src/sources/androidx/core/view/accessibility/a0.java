package androidx.core.view.accessibility;

import android.R;
import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.graphics.Region;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeInfo$TouchDelegateInfo;
import androidx.annotation.RestrictTo;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.annotation.r0;
import androidx.annotation.w0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: AccessibilityNodeInfoCompat.java */
/* JADX INFO: loaded from: classes.dex */
public class a0 {
    public static final int A = 32;
    public static final int B = 64;
    public static final int C = 128;
    public static final int D = 256;
    public static final int E = 512;
    public static final int F = 1024;
    public static final int G = 2048;
    public static final int H = 4096;
    public static final int I = 8192;
    public static final int J = 16384;
    public static final int K = 32768;
    public static final int L = 65536;
    public static final int M = 131072;
    public static final int N = 262144;
    public static final int O = 524288;
    public static final int P = 1048576;
    public static final int Q = 2097152;
    public static final String R = "ACTION_ARGUMENT_MOVEMENT_GRANULARITY_INT";
    public static final String S = "ACTION_ARGUMENT_HTML_ELEMENT_STRING";
    public static final String T = "ACTION_ARGUMENT_EXTEND_SELECTION_BOOLEAN";
    public static final String U = "ACTION_ARGUMENT_SELECTION_START_INT";
    public static final String V = "ACTION_ARGUMENT_SELECTION_END_INT";
    public static final String W = "ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE";
    public static final String X = "android.view.accessibility.action.ARGUMENT_ROW_INT";
    public static final String Y = "android.view.accessibility.action.ARGUMENT_COLUMN_INT";
    public static final String Z = "android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE";

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final String f21334a0 = "ACTION_ARGUMENT_MOVE_WINDOW_X";

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final String f21335b0 = "ACTION_ARGUMENT_MOVE_WINDOW_Y";

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    @SuppressLint({"ActionValue"})
    public static final String f21336c0 = "android.view.accessibility.action.ARGUMENT_PRESS_AND_HOLD_DURATION_MILLIS_INT";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f21337d = "AccessibilityNodeInfo.roleDescription";

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final int f21338d0 = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f21339e = "androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY";

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final int f21340e0 = 2;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f21341f = "androidx.view.accessibility.AccessibilityNodeInfoCompat.TOOLTIP_TEXT_KEY";

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public static final int f21342f0 = 1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f21343g = "androidx.view.accessibility.AccessibilityNodeInfoCompat.HINT_TEXT_KEY";

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public static final int f21344g0 = 2;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f21345h = "androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY";

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public static final int f21346h0 = 4;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f21347i = "androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY";

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public static final int f21348i0 = 8;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String f21349j = "androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY";

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public static final int f21350j0 = 16;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final String f21351k = "androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY";

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public static final String f21352k0 = "android.core.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String f21353l = "androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY";

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public static final String f21354l0 = "android.core.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_START_INDEX";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final String f21355m = "androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY";

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public static final String f21356m0 = "android.core.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_LENGTH";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final String f21357n = "androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY";

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public static final int f21358n0 = 20000;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final String f21359o = "androidx.view.accessibility.AccessibilityNodeInfoCompat.UNIQUE_ID_KEY";

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    private static int f21360o0 = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final String f21361p = "androidx.view.accessibility.AccessibilityNodeInfoCompat.MIN_DURATION_BETWEEN_CONTENT_CHANGES_KEY";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final int f21362q = 1;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final int f21363r = 2;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final int f21364s = 4;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final int f21365t = 8;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final int f21366u = 32;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f21367v = 1;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f21368w = 2;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final int f21369x = 4;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int f21370y = 8;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int f21371z = 16;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AccessibilityNodeInfo f21372a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public int f21373b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f21374c = -1;

    /* JADX INFO: compiled from: AccessibilityNodeInfoCompat.java */
    public static class a {
        public static final a B;
        public static final a C;
        public static final a D;
        public static final a E;
        public static final a F;
        public static final a G;

        @n0
        public static final a H;

        @n0
        public static final a I;

        @n0
        public static final a J;

        @n0
        public static final a K;
        public static final a L;
        public static final a M;
        public static final a N;
        public static final a O;
        public static final a P;

        @n0
        public static final a Q;

        @n0
        public static final a R;

        @n0
        public static final a S;

        @n0
        public static final a T;

        @n0
        public static final a U;

        @n0
        public static final a V;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final String f21375e = "A11yActionCompat";

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Object f21397a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f21398b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Class<? extends e0.a> f21399c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        protected final e0 f21400d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f21376f = new a(1, null);

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final a f21377g = new a(2, null);

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final a f21378h = new a(4, null);

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final a f21379i = new a(8, null);

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final a f21380j = new a(16, null);

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final a f21381k = new a(32, null);

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final a f21382l = new a(64, null);

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final a f21383m = new a(128, null);

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final a f21384n = new a(256, (CharSequence) null, (Class<? extends e0.a>) e0.b.class);

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public static final a f21385o = new a(512, (CharSequence) null, (Class<? extends e0.a>) e0.b.class);

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public static final a f21386p = new a(1024, (CharSequence) null, (Class<? extends e0.a>) e0.c.class);

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public static final a f21387q = new a(2048, (CharSequence) null, (Class<? extends e0.a>) e0.c.class);

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final a f21388r = new a(4096, null);

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public static final a f21389s = new a(8192, null);

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public static final a f21390t = new a(16384, null);

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public static final a f21391u = new a(32768, null);

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public static final a f21392v = new a(65536, null);

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public static final a f21393w = new a(131072, (CharSequence) null, (Class<? extends e0.a>) e0.g.class);

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public static final a f21394x = new a(262144, null);

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public static final a f21395y = new a(524288, null);

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public static final a f21396z = new a(1048576, null);
        public static final a A = new a(2097152, (CharSequence) null, (Class<? extends e0.a>) e0.h.class);

        static {
            int i10 = Build.VERSION.SDK_INT;
            B = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN, R.id.accessibilityActionShowOnScreen, null, null, null);
            C = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION, R.id.accessibilityActionScrollToPosition, null, null, e0.e.class);
            D = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP, R.id.accessibilityActionScrollUp, null, null, null);
            E = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT, R.id.accessibilityActionScrollLeft, null, null, null);
            F = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN, R.id.accessibilityActionScrollDown, null, null, null);
            G = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT, R.id.accessibilityActionScrollRight, null, null, null);
            H = new a(i10 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP : null, R.id.accessibilityActionPageUp, null, null, null);
            I = new a(i10 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN : null, R.id.accessibilityActionPageDown, null, null, null);
            J = new a(i10 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT : null, R.id.accessibilityActionPageLeft, null, null, null);
            K = new a(i10 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT : null, R.id.accessibilityActionPageRight, null, null, null);
            L = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK, R.id.accessibilityActionContextClick, null, null, null);
            M = new a(i10 >= 24 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS : null, R.id.accessibilityActionSetProgress, null, null, e0.f.class);
            N = new a(i10 >= 26 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW : null, R.id.accessibilityActionMoveWindow, null, null, e0.d.class);
            O = new a(i10 >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP : null, R.id.accessibilityActionShowTooltip, null, null, null);
            P = new a(i10 >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP : null, R.id.accessibilityActionHideTooltip, null, null, null);
            Q = new a(i10 >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD : null, R.id.accessibilityActionPressAndHold, null, null, null);
            R = new a(i10 >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER : null, R.id.accessibilityActionImeEnter, null, null, null);
            S = new a(i10 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START : null, R.id.accessibilityActionDragStart, null, null, null);
            T = new a(i10 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP : null, R.id.accessibilityActionDragDrop, null, null, null);
            U = new a(i10 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_CANCEL : null, R.id.accessibilityActionDragCancel, null, null, null);
            V = new a(i10 >= 33 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS : null, R.id.accessibilityActionShowTextSuggestions, null, null, null);
        }

        public a(int i10, CharSequence charSequence) {
            this(null, i10, charSequence, null, null);
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public a(int i10, CharSequence charSequence, e0 e0Var) {
            this(null, i10, charSequence, e0Var, null);
        }

        private a(int i10, CharSequence charSequence, Class<? extends e0.a> cls) {
            this(null, i10, charSequence, null, cls);
        }

        a(Object obj) {
            this(obj, 0, null, null, null);
        }

        a(Object obj, int i10, CharSequence charSequence, e0 e0Var, Class<? extends e0.a> cls) {
            this.f21398b = i10;
            this.f21400d = e0Var;
            if (obj == null) {
                this.f21397a = new AccessibilityNodeInfo.AccessibilityAction(i10, charSequence);
            } else {
                this.f21397a = obj;
            }
            this.f21399c = cls;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public a a(CharSequence charSequence, e0 e0Var) {
            return new a(null, this.f21398b, charSequence, e0Var, this.f21399c);
        }

        public int b() {
            return ((AccessibilityNodeInfo.AccessibilityAction) this.f21397a).getId();
        }

        public CharSequence c() {
            return ((AccessibilityNodeInfo.AccessibilityAction) this.f21397a).getLabel();
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public boolean d(View view, Bundle bundle) {
            if (this.f21400d == null) {
                return false;
            }
            e0.a aVar = null;
            Class<? extends e0.a> cls = this.f21399c;
            if (cls != null) {
                try {
                    e0.a aVarNewInstance = cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                    try {
                        aVarNewInstance.a(bundle);
                        aVar = aVarNewInstance;
                    } catch (Exception e10) {
                        e = e10;
                        aVar = aVarNewInstance;
                        Class<? extends e0.a> cls2 = this.f21399c;
                        Log.e(f21375e, "Failed to execute command with argument class ViewCommandArgument: " + (cls2 == null ? "null" : cls2.getName()), e);
                    }
                } catch (Exception e11) {
                    e = e11;
                }
            }
            return this.f21400d.perform(view, aVar);
        }

        public boolean equals(@p0 Object obj) {
            if (obj == null || !(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            Object obj2 = this.f21397a;
            if (obj2 == null) {
                return aVar.f21397a == null;
            }
            return obj2.equals(aVar.f21397a);
        }

        public int hashCode() {
            Object obj = this.f21397a;
            if (obj != null) {
                return obj.hashCode();
            }
            return 0;
        }

        @n0
        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("AccessibilityActionCompat: ");
            String strO = a0.o(this.f21398b);
            if (strO.equals("ACTION_UNKNOWN") && c() != null) {
                strO = c().toString();
            }
            sb2.append(strO);
            return sb2.toString();
        }
    }

    /* JADX INFO: compiled from: AccessibilityNodeInfoCompat.java */
    @w0(19)
    public static class b {
        private b() {
        }

        @androidx.annotation.u
        public static Bundle a(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getExtras();
        }
    }

    /* JADX INFO: compiled from: AccessibilityNodeInfoCompat.java */
    @w0(33)
    public static class c {
        private c() {
        }

        @androidx.annotation.u
        public static AccessibilityNodeInfo.ExtraRenderingInfo a(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getExtraRenderingInfo();
        }

        @androidx.annotation.u
        public static boolean b(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.isTextSelectable();
        }

        @androidx.annotation.u
        public static void c(AccessibilityNodeInfo accessibilityNodeInfo, boolean z10) {
            accessibilityNodeInfo.setTextSelectable(z10);
        }
    }

    /* JADX INFO: compiled from: AccessibilityNodeInfoCompat.java */
    public static class d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f21401b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f21402c = 1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f21403d = 2;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Object f21404a;

        d(Object obj) {
            this.f21404a = obj;
        }

        public static d e(int i10, int i11, boolean z10) {
            return new d(AccessibilityNodeInfo.CollectionInfo.obtain(i10, i11, z10));
        }

        public static d f(int i10, int i11, boolean z10, int i12) {
            return new d(AccessibilityNodeInfo.CollectionInfo.obtain(i10, i11, z10, i12));
        }

        public int a() {
            return ((AccessibilityNodeInfo.CollectionInfo) this.f21404a).getColumnCount();
        }

        public int b() {
            return ((AccessibilityNodeInfo.CollectionInfo) this.f21404a).getRowCount();
        }

        public int c() {
            return ((AccessibilityNodeInfo.CollectionInfo) this.f21404a).getSelectionMode();
        }

        public boolean d() {
            return ((AccessibilityNodeInfo.CollectionInfo) this.f21404a).isHierarchical();
        }
    }

    /* JADX INFO: compiled from: AccessibilityNodeInfoCompat.java */
    public static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Object f21405a;

        e(Object obj) {
            this.f21405a = obj;
        }

        public static e g(int i10, int i11, int i12, int i13, boolean z10) {
            return new e(AccessibilityNodeInfo.CollectionItemInfo.obtain(i10, i11, i12, i13, z10));
        }

        public static e h(int i10, int i11, int i12, int i13, boolean z10, boolean z11) {
            return new e(AccessibilityNodeInfo.CollectionItemInfo.obtain(i10, i11, i12, i13, z10, z11));
        }

        public int a() {
            return ((AccessibilityNodeInfo.CollectionItemInfo) this.f21405a).getColumnIndex();
        }

        public int b() {
            return ((AccessibilityNodeInfo.CollectionItemInfo) this.f21405a).getColumnSpan();
        }

        public int c() {
            return ((AccessibilityNodeInfo.CollectionItemInfo) this.f21405a).getRowIndex();
        }

        public int d() {
            return ((AccessibilityNodeInfo.CollectionItemInfo) this.f21405a).getRowSpan();
        }

        @Deprecated
        public boolean e() {
            return ((AccessibilityNodeInfo.CollectionItemInfo) this.f21405a).isHeading();
        }

        public boolean f() {
            return ((AccessibilityNodeInfo.CollectionItemInfo) this.f21405a).isSelected();
        }
    }

    /* JADX INFO: compiled from: AccessibilityNodeInfoCompat.java */
    public static class f {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f21406b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f21407c = 1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f21408d = 2;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Object f21409a;

        f(Object obj) {
            this.f21409a = obj;
        }

        public static f e(int i10, float f10, float f11, float f12) {
            return new f(AccessibilityNodeInfo.RangeInfo.obtain(i10, f10, f11, f12));
        }

        public float a() {
            return ((AccessibilityNodeInfo.RangeInfo) this.f21409a).getCurrent();
        }

        public float b() {
            return ((AccessibilityNodeInfo.RangeInfo) this.f21409a).getMax();
        }

        public float c() {
            return ((AccessibilityNodeInfo.RangeInfo) this.f21409a).getMin();
        }

        public int d() {
            return ((AccessibilityNodeInfo.RangeInfo) this.f21409a).getType();
        }
    }

    /* JADX INFO: compiled from: AccessibilityNodeInfoCompat.java */
    public static final class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final AccessibilityNodeInfo$TouchDelegateInfo f21410a;

        g(@n0 AccessibilityNodeInfo$TouchDelegateInfo accessibilityNodeInfo$TouchDelegateInfo) {
            this.f21410a = accessibilityNodeInfo$TouchDelegateInfo;
        }

        public g(@n0 Map<Region, View> map) {
            if (Build.VERSION.SDK_INT >= 29) {
                this.f21410a = new AccessibilityNodeInfo$TouchDelegateInfo(map);
            } else {
                this.f21410a = null;
            }
        }

        @p0
        public Region a(@androidx.annotation.f0(from = 0) int i10) {
            if (Build.VERSION.SDK_INT >= 29) {
                return this.f21410a.getRegionAt(i10);
            }
            return null;
        }

        @androidx.annotation.f0(from = 0)
        public int b() {
            if (Build.VERSION.SDK_INT >= 29) {
                return this.f21410a.getRegionCount();
            }
            return 0;
        }

        @p0
        public a0 c(@n0 Region region) {
            AccessibilityNodeInfo targetForRegion;
            if (Build.VERSION.SDK_INT < 29 || (targetForRegion = this.f21410a.getTargetForRegion(region)) == null) {
                return null;
            }
            return a0.g2(targetForRegion);
        }
    }

    private a0(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.f21372a = accessibilityNodeInfo;
    }

    @Deprecated
    public a0(Object obj) {
        this.f21372a = (AccessibilityNodeInfo) obj;
    }

    public static a0 H0() {
        return g2(AccessibilityNodeInfo.obtain());
    }

    public static a0 I0(View view) {
        return g2(AccessibilityNodeInfo.obtain(view));
    }

    public static a0 J0(View view, int i10) {
        return h2(AccessibilityNodeInfo.obtain(view, i10));
    }

    public static a0 K0(a0 a0Var) {
        return g2(AccessibilityNodeInfo.obtain(a0Var.f21372a));
    }

    private SparseArray<WeakReference<ClickableSpan>> O(View view) {
        SparseArray<WeakReference<ClickableSpan>> sparseArrayU = U(view);
        if (sparseArrayU != null) {
            return sparseArrayU;
        }
        SparseArray<WeakReference<ClickableSpan>> sparseArray = new SparseArray<>();
        view.setTag(androidx.core.R.id.tag_accessibility_clickable_spans, sparseArray);
        return sparseArray;
    }

    private void S0(View view) {
        SparseArray<WeakReference<ClickableSpan>> sparseArrayU = U(view);
        if (sparseArrayU != null) {
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < sparseArrayU.size(); i10++) {
                if (sparseArrayU.valueAt(i10).get() == null) {
                    arrayList.add(Integer.valueOf(i10));
                }
            }
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                sparseArrayU.remove(((Integer) arrayList.get(i11)).intValue());
            }
        }
    }

    private SparseArray<WeakReference<ClickableSpan>> U(View view) {
        return (SparseArray) view.getTag(androidx.core.R.id.tag_accessibility_clickable_spans);
    }

    private void V0(int i10, boolean z10) {
        Bundle bundleE = E();
        if (bundleE != null) {
            int i11 = bundleE.getInt(f21345h, 0) & (~i10);
            if (!z10) {
                i10 = 0;
            }
            bundleE.putInt(f21345h, i10 | i11);
        }
    }

    private void e(ClickableSpan clickableSpan, Spanned spanned, int i10) {
        i(f21349j).add(Integer.valueOf(spanned.getSpanStart(clickableSpan)));
        i(f21351k).add(Integer.valueOf(spanned.getSpanEnd(clickableSpan)));
        i(f21353l).add(Integer.valueOf(spanned.getSpanFlags(clickableSpan)));
        i(f21347i).add(Integer.valueOf(i10));
    }

    public static a0 g2(@n0 AccessibilityNodeInfo accessibilityNodeInfo) {
        return new a0(accessibilityNodeInfo);
    }

    private void h() {
        b.a(this.f21372a).remove(f21349j);
        b.a(this.f21372a).remove(f21351k);
        b.a(this.f21372a).remove(f21353l);
        b.a(this.f21372a).remove(f21347i);
    }

    static a0 h2(Object obj) {
        if (obj != null) {
            return new a0(obj);
        }
        return null;
    }

    private List<Integer> i(String str) {
        ArrayList<Integer> integerArrayList = b.a(this.f21372a).getIntegerArrayList(str);
        if (integerArrayList != null) {
            return integerArrayList;
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        b.a(this.f21372a).putIntegerArrayList(str, arrayList);
        return arrayList;
    }

    private boolean i0() {
        return !i(f21349j).isEmpty();
    }

    private int j0(ClickableSpan clickableSpan, SparseArray<WeakReference<ClickableSpan>> sparseArray) {
        if (sparseArray != null) {
            for (int i10 = 0; i10 < sparseArray.size(); i10++) {
                if (clickableSpan.equals(sparseArray.valueAt(i10).get())) {
                    return sparseArray.keyAt(i10);
                }
            }
        }
        int i11 = f21360o0;
        f21360o0 = i11 + 1;
        return i11;
    }

    static String o(int i10) {
        if (i10 == 1) {
            return "ACTION_FOCUS";
        }
        if (i10 == 2) {
            return "ACTION_CLEAR_FOCUS";
        }
        switch (i10) {
            case 4:
                return "ACTION_SELECT";
            case 8:
                return "ACTION_CLEAR_SELECTION";
            case 16:
                return "ACTION_CLICK";
            case 32:
                return "ACTION_LONG_CLICK";
            case 64:
                return "ACTION_ACCESSIBILITY_FOCUS";
            case 128:
                return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
            case 256:
                return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
            case 512:
                return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
            case 1024:
                return "ACTION_NEXT_HTML_ELEMENT";
            case 2048:
                return "ACTION_PREVIOUS_HTML_ELEMENT";
            case 4096:
                return "ACTION_SCROLL_FORWARD";
            case 8192:
                return "ACTION_SCROLL_BACKWARD";
            case 16384:
                return "ACTION_COPY";
            case 32768:
                return "ACTION_PASTE";
            case 65536:
                return "ACTION_CUT";
            case 131072:
                return "ACTION_SET_SELECTION";
            case 262144:
                return "ACTION_EXPAND";
            case 524288:
                return "ACTION_COLLAPSE";
            case 2097152:
                return "ACTION_SET_TEXT";
            case R.id.accessibilityActionMoveWindow:
                return "ACTION_MOVE_WINDOW";
            default:
                switch (i10) {
                    case R.id.accessibilityActionShowOnScreen:
                        return "ACTION_SHOW_ON_SCREEN";
                    case R.id.accessibilityActionScrollToPosition:
                        return "ACTION_SCROLL_TO_POSITION";
                    case R.id.accessibilityActionScrollUp:
                        return "ACTION_SCROLL_UP";
                    case R.id.accessibilityActionScrollLeft:
                        return "ACTION_SCROLL_LEFT";
                    case R.id.accessibilityActionScrollDown:
                        return "ACTION_SCROLL_DOWN";
                    case R.id.accessibilityActionScrollRight:
                        return "ACTION_SCROLL_RIGHT";
                    case R.id.accessibilityActionContextClick:
                        return "ACTION_CONTEXT_CLICK";
                    case R.id.accessibilityActionSetProgress:
                        return "ACTION_SET_PROGRESS";
                    default:
                        switch (i10) {
                            case R.id.accessibilityActionShowTooltip:
                                return "ACTION_SHOW_TOOLTIP";
                            case R.id.accessibilityActionHideTooltip:
                                return "ACTION_HIDE_TOOLTIP";
                            case R.id.accessibilityActionPageUp:
                                return "ACTION_PAGE_UP";
                            case R.id.accessibilityActionPageDown:
                                return "ACTION_PAGE_DOWN";
                            case R.id.accessibilityActionPageLeft:
                                return "ACTION_PAGE_LEFT";
                            case R.id.accessibilityActionPageRight:
                                return "ACTION_PAGE_RIGHT";
                            case R.id.accessibilityActionPressAndHold:
                                return "ACTION_PRESS_AND_HOLD";
                            default:
                                switch (i10) {
                                    case R.id.accessibilityActionImeEnter:
                                        return "ACTION_IME_ENTER";
                                    case R.id.accessibilityActionDragStart:
                                        return "ACTION_DRAG_START";
                                    case R.id.accessibilityActionDragDrop:
                                        return "ACTION_DRAG_DROP";
                                    case R.id.accessibilityActionDragCancel:
                                        return "ACTION_DRAG_CANCEL";
                                    default:
                                        return "ACTION_UNKNOWN";
                                }
                        }
                }
        }
    }

    private boolean r(int i10) {
        Bundle bundleE = E();
        return bundleE != null && (bundleE.getInt(f21345h, 0) & i10) == i10;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static ClickableSpan[] x(CharSequence charSequence) {
        if (charSequence instanceof Spanned) {
            return (ClickableSpan[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), ClickableSpan.class);
        }
        return null;
    }

    public CharSequence A() {
        return this.f21372a.getContentDescription();
    }

    public boolean A0() {
        return Build.VERSION.SDK_INT >= 28 ? this.f21372a.isScreenReaderFocusable() : r(1);
    }

    public void A1(long j10) {
        b.a(this.f21372a).putLong(f21361p, j10);
    }

    public int B() {
        if (Build.VERSION.SDK_INT >= 24) {
            return this.f21372a.getDrawingOrder();
        }
        return 0;
    }

    public boolean B0() {
        return this.f21372a.isScrollable();
    }

    public void B1(int i10) {
        this.f21372a.setMovementGranularities(i10);
    }

    public CharSequence C() {
        return this.f21372a.getError();
    }

    public boolean C0() {
        return this.f21372a.isSelected();
    }

    public void C1(boolean z10) {
        this.f21372a.setMultiLine(z10);
    }

    @p0
    public AccessibilityNodeInfo.ExtraRenderingInfo D() {
        if (Build.VERSION.SDK_INT >= 33) {
            return c.a(this.f21372a);
        }
        return null;
    }

    public boolean D0() {
        return Build.VERSION.SDK_INT >= 26 ? this.f21372a.isShowingHintText() : r(4);
    }

    public void D1(CharSequence charSequence) {
        this.f21372a.setPackageName(charSequence);
    }

    public Bundle E() {
        return b.a(this.f21372a);
    }

    public boolean E0() {
        return Build.VERSION.SDK_INT >= 29 ? this.f21372a.isTextEntryKey() : r(8);
    }

    public void E1(@p0 CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f21372a.setPaneTitle(charSequence);
        } else {
            b.a(this.f21372a).putCharSequence(f21339e, charSequence);
        }
    }

    @p0
    public CharSequence F() {
        return Build.VERSION.SDK_INT >= 26 ? this.f21372a.getHintText() : b.a(this.f21372a).getCharSequence(f21343g);
    }

    public boolean F0() {
        if (Build.VERSION.SDK_INT >= 33) {
            return c.b(this.f21372a);
        }
        return false;
    }

    public void F1(View view) {
        this.f21373b = -1;
        this.f21372a.setParent(view);
    }

    @Deprecated
    public Object G() {
        return this.f21372a;
    }

    public boolean G0() {
        return this.f21372a.isVisibleToUser();
    }

    public void G1(View view, int i10) {
        this.f21373b = i10;
        this.f21372a.setParent(view, i10);
    }

    public int H() {
        return this.f21372a.getInputType();
    }

    public void H1(boolean z10) {
        this.f21372a.setPassword(z10);
    }

    public a0 I() {
        return h2(this.f21372a.getLabelFor());
    }

    public void I1(f fVar) {
        this.f21372a.setRangeInfo((AccessibilityNodeInfo.RangeInfo) fVar.f21409a);
    }

    public a0 J() {
        return h2(this.f21372a.getLabeledBy());
    }

    @SuppressLint({"GetterSetterNames"})
    public void J1(boolean z10) {
        V0(32, z10);
    }

    public int K() {
        return this.f21372a.getLiveRegion();
    }

    public void K1(@p0 CharSequence charSequence) {
        b.a(this.f21372a).putCharSequence(f21337d, charSequence);
    }

    public int L() {
        return this.f21372a.getMaxTextLength();
    }

    public boolean L0(int i10) {
        return this.f21372a.performAction(i10);
    }

    public void L1(boolean z10) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f21372a.setScreenReaderFocusable(z10);
        } else {
            V0(1, z10);
        }
    }

    public long M() {
        return b.a(this.f21372a).getLong(f21361p);
    }

    public boolean M0(int i10, Bundle bundle) {
        return this.f21372a.performAction(i10, bundle);
    }

    public void M1(boolean z10) {
        this.f21372a.setScrollable(z10);
    }

    public int N() {
        return this.f21372a.getMovementGranularities();
    }

    @Deprecated
    public void N0() {
    }

    public void N1(boolean z10) {
        this.f21372a.setSelected(z10);
    }

    public boolean O0() {
        return this.f21372a.refresh();
    }

    public void O1(boolean z10) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f21372a.setShowingHintText(z10);
        } else {
            V0(4, z10);
        }
    }

    public CharSequence P() {
        return this.f21372a.getPackageName();
    }

    public boolean P0(a aVar) {
        return this.f21372a.removeAction((AccessibilityNodeInfo.AccessibilityAction) aVar.f21397a);
    }

    public void P1(View view) {
        this.f21374c = -1;
        this.f21372a.setSource(view);
    }

    @p0
    public CharSequence Q() {
        return Build.VERSION.SDK_INT >= 28 ? this.f21372a.getPaneTitle() : b.a(this.f21372a).getCharSequence(f21339e);
    }

    public boolean Q0(View view) {
        return this.f21372a.removeChild(view);
    }

    public void Q1(View view, int i10) {
        this.f21374c = i10;
        this.f21372a.setSource(view, i10);
    }

    public a0 R() {
        return h2(this.f21372a.getParent());
    }

    public boolean R0(View view, int i10) {
        return this.f21372a.removeChild(view, i10);
    }

    public void R1(@p0 CharSequence charSequence) {
        if (androidx.core.os.a.h()) {
            this.f21372a.setStateDescription(charSequence);
        } else {
            b.a(this.f21372a).putCharSequence(f21357n, charSequence);
        }
    }

    public f S() {
        AccessibilityNodeInfo.RangeInfo rangeInfo = this.f21372a.getRangeInfo();
        if (rangeInfo != null) {
            return new f(rangeInfo);
        }
        return null;
    }

    public void S1(CharSequence charSequence) {
        this.f21372a.setText(charSequence);
    }

    @p0
    public CharSequence T() {
        return b.a(this.f21372a).getCharSequence(f21337d);
    }

    public void T0(boolean z10) {
        this.f21372a.setAccessibilityFocused(z10);
    }

    public void T1(boolean z10) {
        if (Build.VERSION.SDK_INT >= 29) {
            this.f21372a.setTextEntryKey(z10);
        } else {
            V0(8, z10);
        }
    }

    public void U0(@n0 List<String> list) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f21372a.setAvailableExtraData(list);
        }
    }

    public void U1(boolean z10) {
        if (Build.VERSION.SDK_INT >= 33) {
            c.c(this.f21372a, z10);
        }
    }

    @p0
    public CharSequence V() {
        return androidx.core.os.a.h() ? this.f21372a.getStateDescription() : b.a(this.f21372a).getCharSequence(f21357n);
    }

    public void V1(int i10, int i11) {
        this.f21372a.setTextSelection(i10, i11);
    }

    public CharSequence W() {
        if (!i0()) {
            return this.f21372a.getText();
        }
        List<Integer> listI = i(f21349j);
        List<Integer> listI2 = i(f21351k);
        List<Integer> listI3 = i(f21353l);
        List<Integer> listI4 = i(f21347i);
        SpannableString spannableString = new SpannableString(TextUtils.substring(this.f21372a.getText(), 0, this.f21372a.getText().length()));
        for (int i10 = 0; i10 < listI.size(); i10++) {
            spannableString.setSpan(new androidx.core.view.accessibility.a(listI4.get(i10).intValue(), this, E().getInt(f21355m)), listI.get(i10).intValue(), listI2.get(i10).intValue(), listI3.get(i10).intValue());
        }
        return spannableString;
    }

    @Deprecated
    public void W0(Rect rect) {
        this.f21372a.setBoundsInParent(rect);
    }

    public void W1(@p0 CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f21372a.setTooltipText(charSequence);
        } else {
            b.a(this.f21372a).putCharSequence(f21341f, charSequence);
        }
    }

    public int X() {
        return this.f21372a.getTextSelectionEnd();
    }

    public void X0(Rect rect) {
        this.f21372a.setBoundsInScreen(rect);
    }

    public void X1(@n0 g gVar) {
        if (Build.VERSION.SDK_INT >= 29) {
            this.f21372a.setTouchDelegateInfo(gVar.f21410a);
        }
    }

    public int Y() {
        return this.f21372a.getTextSelectionStart();
    }

    public void Y0(boolean z10) {
        this.f21372a.setCanOpenPopup(z10);
    }

    public void Y1(View view) {
        this.f21372a.setTraversalAfter(view);
    }

    @p0
    public CharSequence Z() {
        return Build.VERSION.SDK_INT >= 28 ? this.f21372a.getTooltipText() : b.a(this.f21372a).getCharSequence(f21341f);
    }

    public void Z0(boolean z10) {
        this.f21372a.setCheckable(z10);
    }

    public void Z1(View view, int i10) {
        this.f21372a.setTraversalAfter(view, i10);
    }

    public void a(int i10) {
        this.f21372a.addAction(i10);
    }

    @p0
    public g a0() {
        AccessibilityNodeInfo$TouchDelegateInfo touchDelegateInfo;
        if (Build.VERSION.SDK_INT < 29 || (touchDelegateInfo = this.f21372a.getTouchDelegateInfo()) == null) {
            return null;
        }
        return new g(touchDelegateInfo);
    }

    public void a1(boolean z10) {
        this.f21372a.setChecked(z10);
    }

    public void a2(View view) {
        this.f21372a.setTraversalBefore(view);
    }

    public void b(a aVar) {
        this.f21372a.addAction((AccessibilityNodeInfo.AccessibilityAction) aVar.f21397a);
    }

    public a0 b0() {
        return h2(this.f21372a.getTraversalAfter());
    }

    public void b1(CharSequence charSequence) {
        this.f21372a.setClassName(charSequence);
    }

    public void b2(View view, int i10) {
        this.f21372a.setTraversalBefore(view, i10);
    }

    public void c(View view) {
        this.f21372a.addChild(view);
    }

    public a0 c0() {
        return h2(this.f21372a.getTraversalBefore());
    }

    public void c1(boolean z10) {
        this.f21372a.setClickable(z10);
    }

    @r0(markerClass = {androidx.core.os.a.b.class})
    public void c2(@p0 String str) {
        if (androidx.core.os.a.k()) {
            this.f21372a.setUniqueId(str);
        } else {
            b.a(this.f21372a).putString(f21359o, str);
        }
    }

    public void d(View view, int i10) {
        this.f21372a.addChild(view, i10);
    }

    @r0(markerClass = {androidx.core.os.a.b.class})
    @p0
    public String d0() {
        return androidx.core.os.a.k() ? this.f21372a.getUniqueId() : b.a(this.f21372a).getString(f21359o);
    }

    public void d1(Object obj) {
        this.f21372a.setCollectionInfo(obj == null ? null : (AccessibilityNodeInfo.CollectionInfo) ((d) obj).f21404a);
    }

    public void d2(String str) {
        this.f21372a.setViewIdResourceName(str);
    }

    public String e0() {
        return this.f21372a.getViewIdResourceName();
    }

    public void e1(Object obj) {
        this.f21372a.setCollectionItemInfo(obj == null ? null : (AccessibilityNodeInfo.CollectionItemInfo) ((e) obj).f21405a);
    }

    public void e2(boolean z10) {
        this.f21372a.setVisibleToUser(z10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        AccessibilityNodeInfo accessibilityNodeInfo = this.f21372a;
        if (accessibilityNodeInfo == null) {
            if (a0Var.f21372a != null) {
                return false;
            }
        } else if (!accessibilityNodeInfo.equals(a0Var.f21372a)) {
            return false;
        }
        return this.f21374c == a0Var.f21374c && this.f21373b == a0Var.f21373b;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void f(CharSequence charSequence, View view) {
        if (Build.VERSION.SDK_INT < 26) {
            h();
            S0(view);
            ClickableSpan[] clickableSpanArrX = x(charSequence);
            if (clickableSpanArrX == null || clickableSpanArrX.length <= 0) {
                return;
            }
            E().putInt(f21355m, androidx.core.R.id.accessibility_action_clickable_span);
            SparseArray<WeakReference<ClickableSpan>> sparseArrayO = O(view);
            for (int i10 = 0; i10 < clickableSpanArrX.length; i10++) {
                int iJ0 = j0(clickableSpanArrX[i10], sparseArrayO);
                sparseArrayO.put(iJ0, new WeakReference<>(clickableSpanArrX[i10]));
                e(clickableSpanArrX[i10], (Spanned) charSequence, iJ0);
            }
        }
    }

    public f0 f0() {
        return f0.v(this.f21372a.getWindow());
    }

    public void f1(CharSequence charSequence) {
        this.f21372a.setContentDescription(charSequence);
    }

    public AccessibilityNodeInfo f2() {
        return this.f21372a;
    }

    public boolean g() {
        return this.f21372a.canOpenPopup();
    }

    public int g0() {
        return this.f21372a.getWindowId();
    }

    public void g1(boolean z10) {
        this.f21372a.setContentInvalid(z10);
    }

    @SuppressLint({"KotlinPropertyAccess"})
    public boolean h0() {
        return r(32);
    }

    public void h1(boolean z10) {
        this.f21372a.setContextClickable(z10);
    }

    public int hashCode() {
        AccessibilityNodeInfo accessibilityNodeInfo = this.f21372a;
        if (accessibilityNodeInfo == null) {
            return 0;
        }
        return accessibilityNodeInfo.hashCode();
    }

    public void i1(boolean z10) {
        this.f21372a.setDismissable(z10);
    }

    public List<a0> j(String str) {
        ArrayList arrayList = new ArrayList();
        List<AccessibilityNodeInfo> listFindAccessibilityNodeInfosByText = this.f21372a.findAccessibilityNodeInfosByText(str);
        int size = listFindAccessibilityNodeInfosByText.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.add(g2(listFindAccessibilityNodeInfosByText.get(i10)));
        }
        return arrayList;
    }

    public void j1(int i10) {
        if (Build.VERSION.SDK_INT >= 24) {
            this.f21372a.setDrawingOrder(i10);
        }
    }

    public List<a0> k(String str) {
        List<AccessibilityNodeInfo> listFindAccessibilityNodeInfosByViewId = this.f21372a.findAccessibilityNodeInfosByViewId(str);
        ArrayList arrayList = new ArrayList();
        Iterator<AccessibilityNodeInfo> it = listFindAccessibilityNodeInfosByViewId.iterator();
        while (it.hasNext()) {
            arrayList.add(g2(it.next()));
        }
        return arrayList;
    }

    public boolean k0() {
        return this.f21372a.isAccessibilityFocused();
    }

    public void k1(boolean z10) {
        this.f21372a.setEditable(z10);
    }

    public a0 l(int i10) {
        return h2(this.f21372a.findFocus(i10));
    }

    public boolean l0() {
        return this.f21372a.isCheckable();
    }

    public void l1(boolean z10) {
        this.f21372a.setEnabled(z10);
    }

    public a0 m(int i10) {
        return h2(this.f21372a.focusSearch(i10));
    }

    public boolean m0() {
        return this.f21372a.isChecked();
    }

    public void m1(CharSequence charSequence) {
        this.f21372a.setError(charSequence);
    }

    public List<a> n() {
        List<AccessibilityNodeInfo.AccessibilityAction> actionList = this.f21372a.getActionList();
        if (actionList == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        int size = actionList.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.add(new a(actionList.get(i10)));
        }
        return arrayList;
    }

    public boolean n0() {
        return this.f21372a.isClickable();
    }

    public void n1(boolean z10) {
        this.f21372a.setFocusable(z10);
    }

    public boolean o0() {
        return this.f21372a.isContentInvalid();
    }

    public void o1(boolean z10) {
        this.f21372a.setFocused(z10);
    }

    @Deprecated
    public int p() {
        return this.f21372a.getActions();
    }

    public boolean p0() {
        return this.f21372a.isContextClickable();
    }

    public void p1(boolean z10) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f21372a.setHeading(z10);
        } else {
            V0(2, z10);
        }
    }

    @n0
    public List<String> q() {
        return Build.VERSION.SDK_INT >= 26 ? this.f21372a.getAvailableExtraData() : Collections.emptyList();
    }

    public boolean q0() {
        return this.f21372a.isDismissable();
    }

    public void q1(@p0 CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f21372a.setHintText(charSequence);
        } else {
            b.a(this.f21372a).putCharSequence(f21343g, charSequence);
        }
    }

    public boolean r0() {
        return this.f21372a.isEditable();
    }

    public void r1(boolean z10) {
        if (Build.VERSION.SDK_INT >= 24) {
            this.f21372a.setImportantForAccessibility(z10);
        }
    }

    @Deprecated
    public void s(Rect rect) {
        this.f21372a.getBoundsInParent(rect);
    }

    public boolean s0() {
        return this.f21372a.isEnabled();
    }

    public void s1(int i10) {
        this.f21372a.setInputType(i10);
    }

    public void t(Rect rect) {
        this.f21372a.getBoundsInScreen(rect);
    }

    public boolean t0() {
        return this.f21372a.isFocusable();
    }

    public void t1(View view) {
        this.f21372a.setLabelFor(view);
    }

    @n0
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        Rect rect = new Rect();
        s(rect);
        sb2.append("; boundsInParent: " + rect);
        t(rect);
        sb2.append("; boundsInScreen: " + rect);
        sb2.append("; packageName: ");
        sb2.append(P());
        sb2.append("; className: ");
        sb2.append(w());
        sb2.append("; text: ");
        sb2.append(W());
        sb2.append("; contentDescription: ");
        sb2.append(A());
        sb2.append("; viewId: ");
        sb2.append(e0());
        sb2.append("; uniqueId: ");
        sb2.append(d0());
        sb2.append("; checkable: ");
        sb2.append(l0());
        sb2.append("; checked: ");
        sb2.append(m0());
        sb2.append("; focusable: ");
        sb2.append(t0());
        sb2.append("; focused: ");
        sb2.append(u0());
        sb2.append("; selected: ");
        sb2.append(C0());
        sb2.append("; clickable: ");
        sb2.append(n0());
        sb2.append("; longClickable: ");
        sb2.append(x0());
        sb2.append("; enabled: ");
        sb2.append(s0());
        sb2.append("; password: ");
        sb2.append(z0());
        sb2.append("; scrollable: " + B0());
        sb2.append("; [");
        List<a> listN = n();
        for (int i10 = 0; i10 < listN.size(); i10++) {
            a aVar = listN.get(i10);
            String strO = o(aVar.b());
            if (strO.equals("ACTION_UNKNOWN") && aVar.c() != null) {
                strO = aVar.c().toString();
            }
            sb2.append(strO);
            if (i10 != listN.size() - 1) {
                sb2.append(", ");
            }
        }
        sb2.append("]");
        return sb2.toString();
    }

    public a0 u(int i10) {
        return h2(this.f21372a.getChild(i10));
    }

    public boolean u0() {
        return this.f21372a.isFocused();
    }

    public void u1(View view, int i10) {
        this.f21372a.setLabelFor(view, i10);
    }

    public int v() {
        return this.f21372a.getChildCount();
    }

    public boolean v0() {
        if (Build.VERSION.SDK_INT >= 28) {
            return this.f21372a.isHeading();
        }
        if (r(2)) {
            return true;
        }
        e eVarZ = z();
        return eVarZ != null && eVarZ.e();
    }

    public void v1(View view) {
        this.f21372a.setLabeledBy(view);
    }

    public CharSequence w() {
        return this.f21372a.getClassName();
    }

    public boolean w0() {
        if (Build.VERSION.SDK_INT >= 24) {
            return this.f21372a.isImportantForAccessibility();
        }
        return true;
    }

    public void w1(View view, int i10) {
        this.f21372a.setLabeledBy(view, i10);
    }

    public boolean x0() {
        return this.f21372a.isLongClickable();
    }

    public void x1(int i10) {
        this.f21372a.setLiveRegion(i10);
    }

    public d y() {
        AccessibilityNodeInfo.CollectionInfo collectionInfo = this.f21372a.getCollectionInfo();
        if (collectionInfo != null) {
            return new d(collectionInfo);
        }
        return null;
    }

    public boolean y0() {
        return this.f21372a.isMultiLine();
    }

    public void y1(boolean z10) {
        this.f21372a.setLongClickable(z10);
    }

    public e z() {
        AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo = this.f21372a.getCollectionItemInfo();
        if (collectionItemInfo != null) {
            return new e(collectionItemInfo);
        }
        return null;
    }

    public boolean z0() {
        return this.f21372a.isPassword();
    }

    public void z1(int i10) {
        this.f21372a.setMaxTextLength(i10);
    }
}
