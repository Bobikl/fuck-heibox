package androidx.appcompat.app;

import android.R;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.media.AudioManager;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.annotation.RestrictTo;
import androidx.annotation.d0;
import androidx.annotation.e1;
import androidx.annotation.j1;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.annotation.w0;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.ViewStubCompat;
import androidx.appcompat.widget.e0;
import androidx.appcompat.widget.g1;
import androidx.appcompat.widget.h1;
import androidx.appcompat.widget.x0;
import androidx.appcompat.widget.z;
import androidx.collection.j2;
import androidx.core.app.c0;
import androidx.core.view.c3;
import androidx.core.view.e3;
import androidx.core.view.n3;
import androidx.core.view.z0;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.y;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class AppCompatDelegateImpl extends androidx.appcompat.app.e implements androidx.appcompat.view.menu.g.a, LayoutInflater.Factory2 {
    private static final j2<String, Integer> L3 = new j2<>();
    private static final boolean M3 = false;
    private static final int[] N3 = {R.attr.windowBackground};
    private static final boolean O3 = !"robolectric".equals(Build.FINGERPRINT);
    private static final boolean P3 = true;
    private static boolean Q3 = false;
    static final String R3 = ". If the resource you are trying to use is a vector resource, you may be referencing it in an unsupported way. See AppCompatDelegate.setCompatVectorFromResourcesEnabled() for more info.";
    private t A;
    androidx.appcompat.view.b B;
    ActionBarContextView C;
    PopupWindow D;
    Runnable E;
    c3 F;
    private boolean G;
    private boolean G2;
    private Rect G3;
    private boolean H;
    ViewGroup I;
    private TextView J;
    private androidx.appcompat.app.k J3;
    private View K;
    private androidx.appcompat.app.l K3;
    private boolean L;
    private boolean M;
    boolean N;
    boolean O;
    boolean P;
    boolean Q;
    boolean R;
    private boolean S;
    private PanelFeatureState[] T;
    private PanelFeatureState U;
    private boolean V;
    private boolean W;
    private boolean X;
    boolean Y;
    private Configuration Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private int f1687a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private int f1688b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private boolean f1689c0;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    private boolean f1690p1;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    boolean f1691p2;

    /* JADX INFO: renamed from: p3, reason: collision with root package name */
    private Rect f1692p3;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    final Object f1693q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    final Context f1694r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    Window f1695s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private p f1696t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    final androidx.appcompat.app.d f1697u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    ActionBar f1698v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    MenuInflater f1699w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private CharSequence f1700x;

    /* JADX INFO: renamed from: x1, reason: collision with root package name */
    private AutoNightModeManager f1701x1;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    int f1702x2;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private z f1703y;

    /* JADX INFO: renamed from: y1, reason: collision with root package name */
    private AutoNightModeManager f1704y1;

    /* JADX INFO: renamed from: y2, reason: collision with root package name */
    private final Runnable f1705y2;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private j f1706z;

    @j1
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public abstract class AutoNightModeManager {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private BroadcastReceiver f1707a;

        AutoNightModeManager() {
        }

        void a() {
            BroadcastReceiver broadcastReceiver = this.f1707a;
            if (broadcastReceiver != null) {
                try {
                    AppCompatDelegateImpl.this.f1694r.unregisterReceiver(broadcastReceiver);
                } catch (IllegalArgumentException unused) {
                }
                this.f1707a = null;
            }
        }

        @p0
        abstract IntentFilter b();

        abstract int c();

        boolean d() {
            return this.f1707a != null;
        }

        abstract void e();

        void f() {
            a();
            IntentFilter intentFilterB = b();
            if (intentFilterB == null || intentFilterB.countActions() == 0) {
                return;
            }
            if (this.f1707a == null) {
                this.f1707a = new BroadcastReceiver() { // from class: androidx.appcompat.app.AppCompatDelegateImpl.AutoNightModeManager.1
                    @Override // android.content.BroadcastReceiver
                    public void onReceive(Context context, Intent intent) {
                        AutoNightModeManager.this.e();
                    }
                };
            }
            AppCompatDelegateImpl.this.f1694r.registerReceiver(this.f1707a, intentFilterB);
        }
    }

    public class ListMenuDecorView extends ContentFrameLayout {
        public ListMenuDecorView(Context context) {
            super(context);
        }

        private boolean b(int i10, int i11) {
            return i10 < -5 || i11 < -5 || i10 > getWidth() + 5 || i11 > getHeight() + 5;
        }

        @Override // android.view.ViewGroup, android.view.View
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return AppCompatDelegateImpl.this.g0(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        @Override // android.view.ViewGroup
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() != 0 || !b((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return super.onInterceptTouchEvent(motionEvent);
            }
            AppCompatDelegateImpl.this.b0(0);
            return true;
        }

        @Override // android.view.View
        public void setBackgroundResource(int i10) {
            setBackgroundDrawable(b0.a.b(getContext(), i10));
        }
    }

    public static final class PanelFeatureState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f1711a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f1712b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f1713c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f1714d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f1715e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f1716f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        ViewGroup f1717g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        View f1718h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        View f1719i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        androidx.appcompat.view.menu.g f1720j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        androidx.appcompat.view.menu.e f1721k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Context f1722l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        boolean f1723m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        boolean f1724n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        boolean f1725o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public boolean f1726p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        boolean f1727q = false;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        boolean f1728r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        boolean f1729s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Bundle f1730t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        Bundle f1731u;

        @SuppressLint({"BanParcelableUsage"})
        public static class SavedState implements Parcelable {
            public static final Parcelable.Creator<SavedState> CREATOR = new a();

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            int f1732b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            boolean f1733c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            Bundle f1734d;

            public class a implements Parcelable.ClassLoaderCreator<SavedState> {
                a() {
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public SavedState createFromParcel(Parcel parcel) {
                    return SavedState.a(parcel, null);
                }

                @Override // android.os.Parcelable.ClassLoaderCreator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                    return SavedState.a(parcel, classLoader);
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
                public SavedState[] newArray(int i10) {
                    return new SavedState[i10];
                }
            }

            SavedState() {
            }

            static SavedState a(Parcel parcel, ClassLoader classLoader) {
                SavedState savedState = new SavedState();
                savedState.f1732b = parcel.readInt();
                boolean z10 = parcel.readInt() == 1;
                savedState.f1733c = z10;
                if (z10) {
                    savedState.f1734d = parcel.readBundle(classLoader);
                }
                return savedState;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int i10) {
                parcel.writeInt(this.f1732b);
                parcel.writeInt(this.f1733c ? 1 : 0);
                if (this.f1733c) {
                    parcel.writeBundle(this.f1734d);
                }
            }
        }

        PanelFeatureState(int i10) {
            this.f1711a = i10;
        }

        void a() {
            Bundle bundle;
            androidx.appcompat.view.menu.g gVar = this.f1720j;
            if (gVar == null || (bundle = this.f1730t) == null) {
                return;
            }
            gVar.U(bundle);
            this.f1730t = null;
        }

        public void b() {
            androidx.appcompat.view.menu.g gVar = this.f1720j;
            if (gVar != null) {
                gVar.S(this.f1721k);
            }
            this.f1721k = null;
        }

        androidx.appcompat.view.menu.n c(androidx.appcompat.view.menu.m.a aVar) {
            if (this.f1720j == null) {
                return null;
            }
            if (this.f1721k == null) {
                androidx.appcompat.view.menu.e eVar = new androidx.appcompat.view.menu.e(this.f1722l, androidx.appcompat.R.layout.abc_list_menu_item_layout);
                this.f1721k = eVar;
                eVar.i(aVar);
                this.f1720j.b(this.f1721k);
            }
            return this.f1721k.m(this.f1717g);
        }

        public boolean d() {
            if (this.f1718h == null) {
                return false;
            }
            return this.f1719i != null || this.f1721k.b().getCount() > 0;
        }

        void e(Parcelable parcelable) {
            SavedState savedState = (SavedState) parcelable;
            this.f1711a = savedState.f1732b;
            this.f1729s = savedState.f1733c;
            this.f1730t = savedState.f1734d;
            this.f1718h = null;
            this.f1717g = null;
        }

        Parcelable f() {
            SavedState savedState = new SavedState();
            savedState.f1732b = this.f1711a;
            savedState.f1733c = this.f1725o;
            if (this.f1720j != null) {
                Bundle bundle = new Bundle();
                savedState.f1734d = bundle;
                this.f1720j.W(bundle);
            }
            return savedState;
        }

        void g(androidx.appcompat.view.menu.g gVar) {
            androidx.appcompat.view.menu.e eVar;
            androidx.appcompat.view.menu.g gVar2 = this.f1720j;
            if (gVar == gVar2) {
                return;
            }
            if (gVar2 != null) {
                gVar2.S(this.f1721k);
            }
            this.f1720j = gVar;
            if (gVar == null || (eVar = this.f1721k) == null) {
                return;
            }
            gVar.b(eVar);
        }

        void h(Context context) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme themeNewTheme = context.getResources().newTheme();
            themeNewTheme.setTo(context.getTheme());
            themeNewTheme.resolveAttribute(androidx.appcompat.R.attr.actionBarPopupTheme, typedValue, true);
            int i10 = typedValue.resourceId;
            if (i10 != 0) {
                themeNewTheme.applyStyle(i10, true);
            }
            themeNewTheme.resolveAttribute(androidx.appcompat.R.attr.panelMenuListTheme, typedValue, true);
            int i11 = typedValue.resourceId;
            if (i11 != 0) {
                themeNewTheme.applyStyle(i11, true);
            } else {
                themeNewTheme.applyStyle(androidx.appcompat.R.style.Theme_AppCompat_CompactMenu, true);
            }
            androidx.appcompat.view.d dVar = new androidx.appcompat.view.d(context, 0);
            dVar.getTheme().setTo(themeNewTheme);
            this.f1722l = dVar;
            TypedArray typedArrayObtainStyledAttributes = dVar.obtainStyledAttributes(androidx.appcompat.R.styleable.f1580m);
            this.f1712b = typedArrayObtainStyledAttributes.getResourceId(androidx.appcompat.R.styleable.AppCompatTheme_panelBackground, 0);
            this.f1716f = typedArrayObtainStyledAttributes.getResourceId(androidx.appcompat.R.styleable.AppCompatTheme_android_windowAnimationStyle, 0);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public class a implements Thread.UncaughtExceptionHandler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Thread.UncaughtExceptionHandler f1735a;

        a(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
            this.f1735a = uncaughtExceptionHandler;
        }

        private boolean a(Throwable th2) {
            String message;
            if (!(th2 instanceof Resources.NotFoundException) || (message = th2.getMessage()) == null) {
                return false;
            }
            return message.contains("drawable") || message.contains("Drawable");
        }

        @Override // java.lang.Thread.UncaughtExceptionHandler
        public void uncaughtException(@n0 Thread thread, @n0 Throwable th2) {
            if (!a(th2)) {
                this.f1735a.uncaughtException(thread, th2);
                return;
            }
            Resources.NotFoundException notFoundException = new Resources.NotFoundException(th2.getMessage() + AppCompatDelegateImpl.R3);
            notFoundException.initCause(th2.getCause());
            notFoundException.setStackTrace(th2.getStackTrace());
            this.f1735a.uncaughtException(thread, notFoundException);
        }
    }

    public class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
            if ((appCompatDelegateImpl.f1702x2 & 1) != 0) {
                appCompatDelegateImpl.h0(0);
            }
            AppCompatDelegateImpl appCompatDelegateImpl2 = AppCompatDelegateImpl.this;
            if ((appCompatDelegateImpl2.f1702x2 & 4096) != 0) {
                appCompatDelegateImpl2.h0(108);
            }
            AppCompatDelegateImpl appCompatDelegateImpl3 = AppCompatDelegateImpl.this;
            appCompatDelegateImpl3.f1691p2 = false;
            appCompatDelegateImpl3.f1702x2 = 0;
        }
    }

    public class c implements z0 {
        c() {
        }

        @Override // androidx.core.view.z0
        public n3 a(View view, n3 n3Var) {
            int iR = n3Var.r();
            int iY0 = AppCompatDelegateImpl.this.Y0(n3Var, null);
            if (iR != iY0) {
                n3Var = n3Var.D(n3Var.p(), iY0, n3Var.q(), n3Var.o());
            }
            return androidx.core.view.j1.g1(view, n3Var);
        }
    }

    public class d implements e0.a {
        d() {
        }

        @Override // androidx.appcompat.widget.e0.a
        public void a(Rect rect) {
            rect.top = AppCompatDelegateImpl.this.Y0(null, rect);
        }
    }

    public class e implements ContentFrameLayout.a {
        e() {
        }

        @Override // androidx.appcompat.widget.ContentFrameLayout.a
        public void a() {
        }

        @Override // androidx.appcompat.widget.ContentFrameLayout.a
        public void onDetachedFromWindow() {
            AppCompatDelegateImpl.this.f0();
        }
    }

    public class f implements Runnable {

        public class a extends e3 {
            a() {
            }

            @Override // androidx.core.view.e3, androidx.core.view.d3
            public void b(View view) {
                AppCompatDelegateImpl.this.C.setAlpha(1.0f);
                AppCompatDelegateImpl.this.F.u(null);
                AppCompatDelegateImpl.this.F = null;
            }

            @Override // androidx.core.view.e3, androidx.core.view.d3
            public void c(View view) {
                AppCompatDelegateImpl.this.C.setVisibility(0);
            }
        }

        f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
            appCompatDelegateImpl.D.showAtLocation(appCompatDelegateImpl.C, 55, 0, 0);
            AppCompatDelegateImpl.this.i0();
            if (!AppCompatDelegateImpl.this.R0()) {
                AppCompatDelegateImpl.this.C.setAlpha(1.0f);
                AppCompatDelegateImpl.this.C.setVisibility(0);
            } else {
                AppCompatDelegateImpl.this.C.setAlpha(0.0f);
                AppCompatDelegateImpl appCompatDelegateImpl2 = AppCompatDelegateImpl.this;
                appCompatDelegateImpl2.F = androidx.core.view.j1.g(appCompatDelegateImpl2.C).b(1.0f);
                AppCompatDelegateImpl.this.F.u(new a());
            }
        }
    }

    public class g extends e3 {
        g() {
        }

        @Override // androidx.core.view.e3, androidx.core.view.d3
        public void b(View view) {
            AppCompatDelegateImpl.this.C.setAlpha(1.0f);
            AppCompatDelegateImpl.this.F.u(null);
            AppCompatDelegateImpl.this.F = null;
        }

        @Override // androidx.core.view.e3, androidx.core.view.d3
        public void c(View view) {
            AppCompatDelegateImpl.this.C.setVisibility(0);
            if (AppCompatDelegateImpl.this.C.getParent() instanceof View) {
                androidx.core.view.j1.v1((View) AppCompatDelegateImpl.this.C.getParent());
            }
        }
    }

    public class h implements androidx.appcompat.app.a.b {
        h() {
        }

        @Override // androidx.appcompat.app.a.b
        public Drawable a() {
            x0 x0VarF = x0.F(d(), null, new int[]{androidx.appcompat.R.attr.homeAsUpIndicator});
            Drawable drawableH = x0VarF.h(0);
            x0VarF.I();
            return drawableH;
        }

        @Override // androidx.appcompat.app.a.b
        public void b(Drawable drawable, int i10) {
            ActionBar actionBarS = AppCompatDelegateImpl.this.s();
            if (actionBarS != null) {
                actionBarS.k0(drawable);
                actionBarS.h0(i10);
            }
        }

        @Override // androidx.appcompat.app.a.b
        public void c(int i10) {
            ActionBar actionBarS = AppCompatDelegateImpl.this.s();
            if (actionBarS != null) {
                actionBarS.h0(i10);
            }
        }

        @Override // androidx.appcompat.app.a.b
        public Context d() {
            return AppCompatDelegateImpl.this.n0();
        }

        @Override // androidx.appcompat.app.a.b
        public boolean e() {
            ActionBar actionBarS = AppCompatDelegateImpl.this.s();
            return (actionBarS == null || (actionBarS.o() & 4) == 0) ? false : true;
        }
    }

    public interface i {
        boolean a(int i10);

        @p0
        View onCreatePanelView(int i10);
    }

    public final class j implements androidx.appcompat.view.menu.m.a {
        j() {
        }

        @Override // androidx.appcompat.view.menu.m.a
        public void a(@n0 androidx.appcompat.view.menu.g gVar, boolean z10) {
            AppCompatDelegateImpl.this.Z(gVar);
        }

        @Override // androidx.appcompat.view.menu.m.a
        public boolean b(@n0 androidx.appcompat.view.menu.g gVar) {
            Window.Callback callbackU0 = AppCompatDelegateImpl.this.u0();
            if (callbackU0 == null) {
                return true;
            }
            callbackU0.onMenuOpened(108, gVar);
            return true;
        }
    }

    public class k implements androidx.appcompat.view.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private androidx.appcompat.view.b.a f1745a;

        public class a extends e3 {
            a() {
            }

            @Override // androidx.core.view.e3, androidx.core.view.d3
            public void b(View view) {
                AppCompatDelegateImpl.this.C.setVisibility(8);
                AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
                PopupWindow popupWindow = appCompatDelegateImpl.D;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (appCompatDelegateImpl.C.getParent() instanceof View) {
                    androidx.core.view.j1.v1((View) AppCompatDelegateImpl.this.C.getParent());
                }
                AppCompatDelegateImpl.this.C.t();
                AppCompatDelegateImpl.this.F.u(null);
                AppCompatDelegateImpl appCompatDelegateImpl2 = AppCompatDelegateImpl.this;
                appCompatDelegateImpl2.F = null;
                androidx.core.view.j1.v1(appCompatDelegateImpl2.I);
            }
        }

        public k(androidx.appcompat.view.b.a aVar) {
            this.f1745a = aVar;
        }

        @Override // androidx.appcompat.view.b.a
        public boolean a(androidx.appcompat.view.b bVar, Menu menu) {
            return this.f1745a.a(bVar, menu);
        }

        @Override // androidx.appcompat.view.b.a
        public boolean b(androidx.appcompat.view.b bVar, MenuItem menuItem) {
            return this.f1745a.b(bVar, menuItem);
        }

        @Override // androidx.appcompat.view.b.a
        public boolean c(androidx.appcompat.view.b bVar, Menu menu) {
            androidx.core.view.j1.v1(AppCompatDelegateImpl.this.I);
            return this.f1745a.c(bVar, menu);
        }

        @Override // androidx.appcompat.view.b.a
        public void d(androidx.appcompat.view.b bVar) {
            this.f1745a.d(bVar);
            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
            if (appCompatDelegateImpl.D != null) {
                appCompatDelegateImpl.f1695s.getDecorView().removeCallbacks(AppCompatDelegateImpl.this.E);
            }
            AppCompatDelegateImpl appCompatDelegateImpl2 = AppCompatDelegateImpl.this;
            if (appCompatDelegateImpl2.C != null) {
                appCompatDelegateImpl2.i0();
                AppCompatDelegateImpl appCompatDelegateImpl3 = AppCompatDelegateImpl.this;
                appCompatDelegateImpl3.F = androidx.core.view.j1.g(appCompatDelegateImpl3.C).b(0.0f);
                AppCompatDelegateImpl.this.F.u(new a());
            }
            AppCompatDelegateImpl appCompatDelegateImpl4 = AppCompatDelegateImpl.this;
            androidx.appcompat.app.d dVar = appCompatDelegateImpl4.f1697u;
            if (dVar != null) {
                dVar.onSupportActionModeFinished(appCompatDelegateImpl4.B);
            }
            AppCompatDelegateImpl appCompatDelegateImpl5 = AppCompatDelegateImpl.this;
            appCompatDelegateImpl5.B = null;
            androidx.core.view.j1.v1(appCompatDelegateImpl5.I);
        }
    }

    @w0(17)
    public static class l {
        private l() {
        }

        static Context a(@n0 Context context, @n0 Configuration configuration) {
            return context.createConfigurationContext(configuration);
        }

        static void b(@n0 Configuration configuration, @n0 Configuration configuration2, @n0 Configuration configuration3) {
            int i10 = configuration.densityDpi;
            int i11 = configuration2.densityDpi;
            if (i10 != i11) {
                configuration3.densityDpi = i11;
            }
        }
    }

    @w0(21)
    public static class m {
        private m() {
        }

        static boolean a(PowerManager powerManager) {
            return powerManager.isPowerSaveMode();
        }
    }

    @w0(24)
    public static class n {
        private n() {
        }

        static void a(@n0 Configuration configuration, @n0 Configuration configuration2, @n0 Configuration configuration3) {
            LocaleList locales = configuration.getLocales();
            LocaleList locales2 = configuration2.getLocales();
            if (locales.equals(locales2)) {
                return;
            }
            configuration3.setLocales(locales2);
            configuration3.locale = configuration2.locale;
        }
    }

    @w0(26)
    public static class o {
        private o() {
        }

        static void a(@n0 Configuration configuration, @n0 Configuration configuration2, @n0 Configuration configuration3) {
            int i10 = configuration.colorMode & 3;
            int i11 = configuration2.colorMode;
            if (i10 != (i11 & 3)) {
                configuration3.colorMode |= i11 & 3;
            }
            int i12 = configuration.colorMode & 12;
            int i13 = configuration2.colorMode;
            if (i12 != (i13 & 12)) {
                configuration3.colorMode |= i13 & 12;
            }
        }
    }

    public class p extends androidx.appcompat.view.i {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private i f1748c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f1749d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f1750e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f1751f;

        p(Window.Callback callback) {
            super(callback);
        }

        public boolean b(Window.Callback callback, KeyEvent keyEvent) {
            try {
                this.f1750e = true;
                return callback.dispatchKeyEvent(keyEvent);
            } finally {
                this.f1750e = false;
            }
        }

        public void c(Window.Callback callback) {
            try {
                this.f1749d = true;
                callback.onContentChanged();
            } finally {
                this.f1749d = false;
            }
        }

        public void d(Window.Callback callback, int i10, Menu menu) {
            try {
                this.f1751f = true;
                callback.onPanelClosed(i10, menu);
            } finally {
                this.f1751f = false;
            }
        }

        @Override // androidx.appcompat.view.i, android.view.Window.Callback
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            if (this.f1750e) {
                return a().dispatchKeyEvent(keyEvent);
            }
            return AppCompatDelegateImpl.this.g0(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        @Override // androidx.appcompat.view.i, android.view.Window.Callback
        public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
            return super.dispatchKeyShortcutEvent(keyEvent) || AppCompatDelegateImpl.this.F0(keyEvent.getKeyCode(), keyEvent);
        }

        void e(@p0 i iVar) {
            this.f1748c = iVar;
        }

        final ActionMode f(ActionMode.Callback callback) {
            androidx.appcompat.view.f.a aVar = new androidx.appcompat.view.f.a(AppCompatDelegateImpl.this.f1694r, callback);
            androidx.appcompat.view.b bVarT = AppCompatDelegateImpl.this.T(aVar);
            if (bVarT != null) {
                return aVar.e(bVarT);
            }
            return null;
        }

        @Override // androidx.appcompat.view.i, android.view.Window.Callback
        public void onContentChanged() {
            if (this.f1749d) {
                a().onContentChanged();
            }
        }

        @Override // androidx.appcompat.view.i, android.view.Window.Callback
        public boolean onCreatePanelMenu(int i10, Menu menu) {
            if (i10 != 0 || (menu instanceof androidx.appcompat.view.menu.g)) {
                return super.onCreatePanelMenu(i10, menu);
            }
            return false;
        }

        @Override // androidx.appcompat.view.i, android.view.Window.Callback
        public View onCreatePanelView(int i10) {
            View viewOnCreatePanelView;
            i iVar = this.f1748c;
            return (iVar == null || (viewOnCreatePanelView = iVar.onCreatePanelView(i10)) == null) ? super.onCreatePanelView(i10) : viewOnCreatePanelView;
        }

        @Override // androidx.appcompat.view.i, android.view.Window.Callback
        public boolean onMenuOpened(int i10, Menu menu) {
            super.onMenuOpened(i10, menu);
            AppCompatDelegateImpl.this.I0(i10);
            return true;
        }

        @Override // androidx.appcompat.view.i, android.view.Window.Callback
        public void onPanelClosed(int i10, Menu menu) {
            if (this.f1751f) {
                a().onPanelClosed(i10, menu);
            } else {
                super.onPanelClosed(i10, menu);
                AppCompatDelegateImpl.this.J0(i10);
            }
        }

        @Override // androidx.appcompat.view.i, android.view.Window.Callback
        public boolean onPreparePanel(int i10, View view, Menu menu) {
            androidx.appcompat.view.menu.g gVar = menu instanceof androidx.appcompat.view.menu.g ? (androidx.appcompat.view.menu.g) menu : null;
            if (i10 == 0 && gVar == null) {
                return false;
            }
            if (gVar != null) {
                gVar.i0(true);
            }
            i iVar = this.f1748c;
            boolean zOnPreparePanel = iVar != null && iVar.a(i10);
            if (!zOnPreparePanel) {
                zOnPreparePanel = super.onPreparePanel(i10, view, menu);
            }
            if (gVar != null) {
                gVar.i0(false);
            }
            return zOnPreparePanel;
        }

        @Override // androidx.appcompat.view.i, android.view.Window.Callback
        @w0(24)
        public void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i10) {
            androidx.appcompat.view.menu.g gVar;
            PanelFeatureState panelFeatureStateR0 = AppCompatDelegateImpl.this.r0(0, true);
            if (panelFeatureStateR0 == null || (gVar = panelFeatureStateR0.f1720j) == null) {
                super.onProvideKeyboardShortcuts(list, menu, i10);
            } else {
                super.onProvideKeyboardShortcuts(list, gVar, i10);
            }
        }

        @Override // androidx.appcompat.view.i, android.view.Window.Callback
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            return null;
        }

        @Override // androidx.appcompat.view.i, android.view.Window.Callback
        @w0(23)
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i10) {
            return (AppCompatDelegateImpl.this.x() && i10 == 0) ? f(callback) : super.onWindowStartingActionMode(callback, i10);
        }
    }

    public class q extends AutoNightModeManager {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final PowerManager f1753c;

        q(Context context) {
            super();
            this.f1753c = (PowerManager) context.getApplicationContext().getSystemService("power");
        }

        @Override // androidx.appcompat.app.AppCompatDelegateImpl.AutoNightModeManager
        IntentFilter b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
            return intentFilter;
        }

        @Override // androidx.appcompat.app.AppCompatDelegateImpl.AutoNightModeManager
        public int c() {
            return m.a(this.f1753c) ? 2 : 1;
        }

        @Override // androidx.appcompat.app.AppCompatDelegateImpl.AutoNightModeManager
        public void e() {
            AppCompatDelegateImpl.this.e();
        }
    }

    public class r extends AutoNightModeManager {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final androidx.appcompat.app.q f1755c;

        r(androidx.appcompat.app.q qVar) {
            super();
            this.f1755c = qVar;
        }

        @Override // androidx.appcompat.app.AppCompatDelegateImpl.AutoNightModeManager
        IntentFilter b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.TIME_SET");
            intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
            intentFilter.addAction("android.intent.action.TIME_TICK");
            return intentFilter;
        }

        @Override // androidx.appcompat.app.AppCompatDelegateImpl.AutoNightModeManager
        public int c() {
            return this.f1755c.d() ? 2 : 1;
        }

        @Override // androidx.appcompat.app.AppCompatDelegateImpl.AutoNightModeManager
        public void e() {
            AppCompatDelegateImpl.this.e();
        }
    }

    @w0(17)
    public static class s {
        private s() {
        }

        static void a(ContextThemeWrapper contextThemeWrapper, Configuration configuration) {
            contextThemeWrapper.applyOverrideConfiguration(configuration);
        }
    }

    public final class t implements androidx.appcompat.view.menu.m.a {
        t() {
        }

        @Override // androidx.appcompat.view.menu.m.a
        public void a(@n0 androidx.appcompat.view.menu.g gVar, boolean z10) {
            androidx.appcompat.view.menu.g gVarG = gVar.G();
            boolean z11 = gVarG != gVar;
            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
            if (z11) {
                gVar = gVarG;
            }
            PanelFeatureState panelFeatureStateL0 = appCompatDelegateImpl.l0(gVar);
            if (panelFeatureStateL0 != null) {
                if (!z11) {
                    AppCompatDelegateImpl.this.c0(panelFeatureStateL0, z10);
                } else {
                    AppCompatDelegateImpl.this.Y(panelFeatureStateL0.f1711a, panelFeatureStateL0, gVarG);
                    AppCompatDelegateImpl.this.c0(panelFeatureStateL0, true);
                }
            }
        }

        @Override // androidx.appcompat.view.menu.m.a
        public boolean b(@n0 androidx.appcompat.view.menu.g gVar) {
            Window.Callback callbackU0;
            if (gVar != gVar.G()) {
                return true;
            }
            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
            if (!appCompatDelegateImpl.N || (callbackU0 = appCompatDelegateImpl.u0()) == null || AppCompatDelegateImpl.this.Y) {
                return true;
            }
            callbackU0.onMenuOpened(108, gVar);
            return true;
        }
    }

    AppCompatDelegateImpl(Activity activity, androidx.appcompat.app.d dVar) {
        this(activity, null, dVar, activity);
    }

    AppCompatDelegateImpl(Dialog dialog, androidx.appcompat.app.d dVar) {
        this(dialog.getContext(), dialog.getWindow(), dVar, dialog);
    }

    AppCompatDelegateImpl(Context context, Activity activity, androidx.appcompat.app.d dVar) {
        this(context, null, dVar, activity);
    }

    AppCompatDelegateImpl(Context context, Window window, androidx.appcompat.app.d dVar) {
        this(context, window, dVar, context);
    }

    private AppCompatDelegateImpl(Context context, Window window, androidx.appcompat.app.d dVar, Object obj) {
        j2<String, Integer> j2Var;
        Integer num;
        AppCompatActivity appCompatActivityV0;
        this.F = null;
        this.G = true;
        this.f1687a0 = -100;
        this.f1705y2 = new b();
        this.f1694r = context;
        this.f1697u = dVar;
        this.f1693q = obj;
        if (this.f1687a0 == -100 && (obj instanceof Dialog) && (appCompatActivityV0 = V0()) != null) {
            this.f1687a0 = appCompatActivityV0.getDelegate().q();
        }
        if (this.f1687a0 == -100 && (num = (j2Var = L3).get(obj.getClass().getName())) != null) {
            this.f1687a0 = num.intValue();
            j2Var.remove(obj.getClass().getName());
        }
        if (window != null) {
            W(window);
        }
        androidx.appcompat.widget.f.i();
    }

    private boolean A0(Context context) {
        int i10;
        if (!this.f1690p1 && (this.f1693q instanceof Activity)) {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                return false;
            }
            try {
                int i11 = Build.VERSION.SDK_INT;
                if (i11 >= 29) {
                    i10 = 269221888;
                } else {
                    i10 = i11 >= 24 ? 786432 : 0;
                }
                ActivityInfo activityInfo = packageManager.getActivityInfo(new ComponentName(context, this.f1693q.getClass()), i10);
                this.f1689c0 = (activityInfo == null || (activityInfo.configChanges & 512) == 0) ? false : true;
            } catch (PackageManager.NameNotFoundException e10) {
                Log.d("AppCompatDelegate", "Exception while getting ActivityInfo", e10);
                this.f1689c0 = false;
            }
        }
        this.f1690p1 = true;
        return this.f1689c0;
    }

    private boolean E0(int i10, KeyEvent keyEvent) {
        if (keyEvent.getRepeatCount() != 0) {
            return false;
        }
        PanelFeatureState panelFeatureStateR0 = r0(i10, true);
        if (panelFeatureStateR0.f1725o) {
            return false;
        }
        return O0(panelFeatureStateR0, keyEvent);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0062  */
    private boolean H0(int i10, KeyEvent keyEvent) {
        boolean zO0;
        z zVar;
        if (this.B != null) {
            return false;
        }
        boolean zF = true;
        PanelFeatureState panelFeatureStateR0 = r0(i10, true);
        if (i10 != 0 || (zVar = this.f1703y) == null || !zVar.b() || ViewConfiguration.get(this.f1694r).hasPermanentMenuKey()) {
            boolean z10 = panelFeatureStateR0.f1725o;
            if (z10 || panelFeatureStateR0.f1724n) {
                c0(panelFeatureStateR0, true);
                zF = z10;
            } else if (panelFeatureStateR0.f1723m) {
                if (panelFeatureStateR0.f1728r) {
                    panelFeatureStateR0.f1723m = false;
                    zO0 = O0(panelFeatureStateR0, keyEvent);
                } else {
                    zO0 = true;
                }
                if (zO0) {
                    L0(panelFeatureStateR0, keyEvent);
                } else {
                    zF = false;
                }
            } else {
                zF = false;
            }
        } else if (this.f1703y.d()) {
            zF = this.f1703y.f();
        } else if (this.Y || !O0(panelFeatureStateR0, keyEvent)) {
            zF = false;
        } else {
            zF = this.f1703y.c();
        }
        if (zF) {
            AudioManager audioManager = (AudioManager) this.f1694r.getApplicationContext().getSystemService("audio");
            if (audioManager != null) {
                audioManager.playSoundEffect(0);
            } else {
                Log.w("AppCompatDelegate", "Couldn't get audio manager");
            }
        }
        return zF;
    }

    private void L0(PanelFeatureState panelFeatureState, KeyEvent keyEvent) {
        int i10;
        ViewGroup.LayoutParams layoutParams;
        if (panelFeatureState.f1725o || this.Y) {
            return;
        }
        if (panelFeatureState.f1711a == 0) {
            if ((this.f1694r.getResources().getConfiguration().screenLayout & 15) == 4) {
                return;
            }
        }
        Window.Callback callbackU0 = u0();
        if (callbackU0 != null && !callbackU0.onMenuOpened(panelFeatureState.f1711a, panelFeatureState.f1720j)) {
            c0(panelFeatureState, true);
            return;
        }
        WindowManager windowManager = (WindowManager) this.f1694r.getSystemService("window");
        if (windowManager != null && O0(panelFeatureState, keyEvent)) {
            ViewGroup viewGroup = panelFeatureState.f1717g;
            if (viewGroup != null && !panelFeatureState.f1727q) {
                View view = panelFeatureState.f1719i;
                if (view != null && (layoutParams = view.getLayoutParams()) != null && layoutParams.width == -1) {
                    i10 = -1;
                }
                panelFeatureState.f1724n = false;
                WindowManager.LayoutParams layoutParams2 = new WindowManager.LayoutParams(i10, -2, panelFeatureState.f1714d, panelFeatureState.f1715e, 1002, 8519680, -3);
                layoutParams2.gravity = panelFeatureState.f1713c;
                layoutParams2.windowAnimations = panelFeatureState.f1716f;
                windowManager.addView(panelFeatureState.f1717g, layoutParams2);
                panelFeatureState.f1725o = true;
            }
            if (viewGroup == null) {
                if (!x0(panelFeatureState) || panelFeatureState.f1717g == null) {
                    return;
                }
            } else if (panelFeatureState.f1727q && viewGroup.getChildCount() > 0) {
                panelFeatureState.f1717g.removeAllViews();
            }
            if (!w0(panelFeatureState) || !panelFeatureState.d()) {
                panelFeatureState.f1727q = true;
                return;
            }
            ViewGroup.LayoutParams layoutParams3 = panelFeatureState.f1718h.getLayoutParams();
            if (layoutParams3 == null) {
                layoutParams3 = new ViewGroup.LayoutParams(-2, -2);
            }
            panelFeatureState.f1717g.setBackgroundResource(panelFeatureState.f1712b);
            ViewParent parent = panelFeatureState.f1718h.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(panelFeatureState.f1718h);
            }
            panelFeatureState.f1717g.addView(panelFeatureState.f1718h, layoutParams3);
            if (!panelFeatureState.f1718h.hasFocus()) {
                panelFeatureState.f1718h.requestFocus();
            }
            i10 = -2;
            panelFeatureState.f1724n = false;
            WindowManager.LayoutParams layoutParams4 = new WindowManager.LayoutParams(i10, -2, panelFeatureState.f1714d, panelFeatureState.f1715e, 1002, 8519680, -3);
            layoutParams4.gravity = panelFeatureState.f1713c;
            layoutParams4.windowAnimations = panelFeatureState.f1716f;
            windowManager.addView(panelFeatureState.f1717g, layoutParams4);
            panelFeatureState.f1725o = true;
        }
    }

    private boolean N0(PanelFeatureState panelFeatureState, int i10, KeyEvent keyEvent, int i11) {
        androidx.appcompat.view.menu.g gVar;
        boolean zPerformShortcut = false;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((panelFeatureState.f1723m || O0(panelFeatureState, keyEvent)) && (gVar = panelFeatureState.f1720j) != null) {
            zPerformShortcut = gVar.performShortcut(i10, keyEvent, i11);
        }
        if (zPerformShortcut && (i11 & 1) == 0 && this.f1703y == null) {
            c0(panelFeatureState, true);
        }
        return zPerformShortcut;
    }

    private boolean O0(PanelFeatureState panelFeatureState, KeyEvent keyEvent) {
        z zVar;
        z zVar2;
        z zVar3;
        if (this.Y) {
            return false;
        }
        if (panelFeatureState.f1723m) {
            return true;
        }
        PanelFeatureState panelFeatureState2 = this.U;
        if (panelFeatureState2 != null && panelFeatureState2 != panelFeatureState) {
            c0(panelFeatureState2, false);
        }
        Window.Callback callbackU0 = u0();
        if (callbackU0 != null) {
            panelFeatureState.f1719i = callbackU0.onCreatePanelView(panelFeatureState.f1711a);
        }
        int i10 = panelFeatureState.f1711a;
        boolean z10 = i10 == 0 || i10 == 108;
        if (z10 && (zVar3 = this.f1703y) != null) {
            zVar3.setMenuPrepared();
        }
        if (panelFeatureState.f1719i == null && (!z10 || !(M0() instanceof androidx.appcompat.app.o))) {
            androidx.appcompat.view.menu.g gVar = panelFeatureState.f1720j;
            if (gVar == null || panelFeatureState.f1728r) {
                if (gVar == null && (!y0(panelFeatureState) || panelFeatureState.f1720j == null)) {
                    return false;
                }
                if (z10 && this.f1703y != null) {
                    if (this.f1706z == null) {
                        this.f1706z = new j();
                    }
                    this.f1703y.setMenu(panelFeatureState.f1720j, this.f1706z);
                }
                panelFeatureState.f1720j.m0();
                if (!callbackU0.onCreatePanelMenu(panelFeatureState.f1711a, panelFeatureState.f1720j)) {
                    panelFeatureState.g(null);
                    if (z10 && (zVar = this.f1703y) != null) {
                        zVar.setMenu(null, this.f1706z);
                    }
                    return false;
                }
                panelFeatureState.f1728r = false;
            }
            panelFeatureState.f1720j.m0();
            Bundle bundle = panelFeatureState.f1731u;
            if (bundle != null) {
                panelFeatureState.f1720j.T(bundle);
                panelFeatureState.f1731u = null;
            }
            if (!callbackU0.onPreparePanel(0, panelFeatureState.f1719i, panelFeatureState.f1720j)) {
                if (z10 && (zVar2 = this.f1703y) != null) {
                    zVar2.setMenu(null, this.f1706z);
                }
                panelFeatureState.f1720j.l0();
                return false;
            }
            boolean z11 = KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1;
            panelFeatureState.f1726p = z11;
            panelFeatureState.f1720j.setQwertyMode(z11);
            panelFeatureState.f1720j.l0();
        }
        panelFeatureState.f1723m = true;
        panelFeatureState.f1724n = false;
        this.U = panelFeatureState;
        return true;
    }

    private void P0(boolean z10) {
        z zVar = this.f1703y;
        if (zVar == null || !zVar.b() || (ViewConfiguration.get(this.f1694r).hasPermanentMenuKey() && !this.f1703y.h())) {
            PanelFeatureState panelFeatureStateR0 = r0(0, true);
            panelFeatureStateR0.f1727q = true;
            c0(panelFeatureStateR0, false);
            L0(panelFeatureStateR0, null);
            return;
        }
        Window.Callback callbackU0 = u0();
        if (this.f1703y.d() && z10) {
            this.f1703y.f();
            if (this.Y) {
                return;
            }
            callbackU0.onPanelClosed(108, r0(0, true).f1720j);
            return;
        }
        if (callbackU0 == null || this.Y) {
            return;
        }
        if (this.f1691p2 && (this.f1702x2 & 1) != 0) {
            this.f1695s.getDecorView().removeCallbacks(this.f1705y2);
            this.f1705y2.run();
        }
        PanelFeatureState panelFeatureStateR1 = r0(0, true);
        androidx.appcompat.view.menu.g gVar = panelFeatureStateR1.f1720j;
        if (gVar == null || panelFeatureStateR1.f1728r || !callbackU0.onPreparePanel(0, panelFeatureStateR1.f1719i, gVar)) {
            return;
        }
        callbackU0.onMenuOpened(108, panelFeatureStateR1.f1720j);
        this.f1703y.c();
    }

    private int Q0(int i10) {
        if (i10 == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            return 108;
        }
        if (i10 != 9) {
            return i10;
        }
        Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
        return 109;
    }

    private boolean S0(ViewParent viewParent) {
        if (viewParent == null) {
            return false;
        }
        View decorView = this.f1695s.getDecorView();
        while (viewParent != null) {
            if (viewParent == decorView || !(viewParent instanceof View) || androidx.core.view.j1.O0((View) viewParent)) {
                return false;
            }
            viewParent = viewParent.getParent();
        }
        return true;
    }

    private boolean U(boolean z10) {
        if (this.Y) {
            return false;
        }
        int iX = X();
        boolean zW0 = W0(B0(this.f1694r, iX), z10);
        if (iX == 0) {
            q0(this.f1694r).f();
        } else {
            AutoNightModeManager autoNightModeManager = this.f1701x1;
            if (autoNightModeManager != null) {
                autoNightModeManager.a();
            }
        }
        if (iX == 3) {
            o0(this.f1694r).f();
        } else {
            AutoNightModeManager autoNightModeManager2 = this.f1704y1;
            if (autoNightModeManager2 != null) {
                autoNightModeManager2.a();
            }
        }
        return zW0;
    }

    private void U0() {
        if (this.H) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    private void V() {
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) this.I.findViewById(R.id.content);
        View decorView = this.f1695s.getDecorView();
        contentFrameLayout.setDecorPadding(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        TypedArray typedArrayObtainStyledAttributes = this.f1694r.obtainStyledAttributes(androidx.appcompat.R.styleable.f1580m);
        typedArrayObtainStyledAttributes.getValue(androidx.appcompat.R.styleable.AppCompatTheme_windowMinWidthMajor, contentFrameLayout.getMinWidthMajor());
        typedArrayObtainStyledAttributes.getValue(androidx.appcompat.R.styleable.AppCompatTheme_windowMinWidthMinor, contentFrameLayout.getMinWidthMinor());
        int i10 = androidx.appcompat.R.styleable.AppCompatTheme_windowFixedWidthMajor;
        if (typedArrayObtainStyledAttributes.hasValue(i10)) {
            typedArrayObtainStyledAttributes.getValue(i10, contentFrameLayout.getFixedWidthMajor());
        }
        int i11 = androidx.appcompat.R.styleable.AppCompatTheme_windowFixedWidthMinor;
        if (typedArrayObtainStyledAttributes.hasValue(i11)) {
            typedArrayObtainStyledAttributes.getValue(i11, contentFrameLayout.getFixedWidthMinor());
        }
        int i12 = androidx.appcompat.R.styleable.AppCompatTheme_windowFixedHeightMajor;
        if (typedArrayObtainStyledAttributes.hasValue(i12)) {
            typedArrayObtainStyledAttributes.getValue(i12, contentFrameLayout.getFixedHeightMajor());
        }
        int i13 = androidx.appcompat.R.styleable.AppCompatTheme_windowFixedHeightMinor;
        if (typedArrayObtainStyledAttributes.hasValue(i13)) {
            typedArrayObtainStyledAttributes.getValue(i13, contentFrameLayout.getFixedHeightMinor());
        }
        typedArrayObtainStyledAttributes.recycle();
        contentFrameLayout.requestLayout();
    }

    @p0
    private AppCompatActivity V0() {
        for (Context baseContext = this.f1694r; baseContext != null; baseContext = ((ContextWrapper) baseContext).getBaseContext()) {
            if (baseContext instanceof AppCompatActivity) {
                return (AppCompatActivity) baseContext;
            }
            if (!(baseContext instanceof ContextWrapper)) {
                break;
            }
        }
        return null;
    }

    private void W(@n0 Window window) {
        if (this.f1695s != null) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        Window.Callback callback = window.getCallback();
        if (callback instanceof p) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        p pVar = new p(callback);
        this.f1696t = pVar;
        window.setCallback(pVar);
        x0 x0VarF = x0.F(this.f1694r, null, N3);
        Drawable drawableI = x0VarF.i(0);
        if (drawableI != null) {
            window.setBackgroundDrawable(drawableI);
        }
        x0VarF.I();
        this.f1695s = window;
    }

    private boolean W0(int i10, boolean z10) {
        boolean z11 = false;
        Configuration configurationD0 = d0(this.f1694r, i10, null, false);
        boolean zA0 = A0(this.f1694r);
        Configuration configuration = this.Z;
        if (configuration == null) {
            configuration = this.f1694r.getResources().getConfiguration();
        }
        int i11 = configuration.uiMode & 48;
        int i12 = configurationD0.uiMode & 48;
        boolean z12 = true;
        if (i11 != i12 && z10 && !zA0 && this.W && (O3 || this.X)) {
            Object obj = this.f1693q;
            if ((obj instanceof Activity) && !((Activity) obj).isChild()) {
                androidx.core.app.b.H((Activity) this.f1693q);
                z11 = true;
            }
        }
        if (z11 || i11 == i12) {
            z12 = z11;
        } else {
            X0(i12, zA0, null);
        }
        if (z12) {
            Object obj2 = this.f1693q;
            if (obj2 instanceof AppCompatActivity) {
                ((AppCompatActivity) obj2).onNightModeChanged(i10);
            }
        }
        return z12;
    }

    private int X() {
        int i10 = this.f1687a0;
        return i10 != -100 ? i10 : androidx.appcompat.app.e.o();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void X0(int i10, boolean z10, @p0 Configuration configuration) {
        Resources resources = this.f1694r.getResources();
        Configuration configuration2 = new Configuration(resources.getConfiguration());
        if (configuration != null) {
            configuration2.updateFrom(configuration);
        }
        configuration2.uiMode = i10 | (resources.getConfiguration().uiMode & (-49));
        resources.updateConfiguration(configuration2, null);
        if (Build.VERSION.SDK_INT < 26) {
            androidx.appcompat.app.n.a(resources);
        }
        int i11 = this.f1688b0;
        if (i11 != 0) {
            this.f1694r.setTheme(i11);
            this.f1694r.getTheme().applyStyle(this.f1688b0, true);
        }
        if (z10) {
            Object obj = this.f1693q;
            if (obj instanceof Activity) {
                Activity activity = (Activity) obj;
                if (activity instanceof y) {
                    if (((y) activity).getLifecycle().b().isAtLeast(Lifecycle.State.CREATED)) {
                        activity.onConfigurationChanged(configuration2);
                    }
                } else {
                    if (!this.X || this.Y) {
                        return;
                    }
                    activity.onConfigurationChanged(configuration2);
                }
            }
        }
    }

    private void Z0(View view) {
        view.setBackgroundColor((androidx.core.view.j1.C0(view) & 8192) != 0 ? androidx.core.content.d.f(this.f1694r, androidx.appcompat.R.color.abc_decor_view_status_guard_light) : androidx.core.content.d.f(this.f1694r, androidx.appcompat.R.color.abc_decor_view_status_guard));
    }

    private void a0() {
        AutoNightModeManager autoNightModeManager = this.f1701x1;
        if (autoNightModeManager != null) {
            autoNightModeManager.a();
        }
        AutoNightModeManager autoNightModeManager2 = this.f1704y1;
        if (autoNightModeManager2 != null) {
            autoNightModeManager2.a();
        }
    }

    @n0
    private Configuration d0(@n0 Context context, int i10, @p0 Configuration configuration, boolean z10) {
        int i11;
        if (i10 == 1) {
            i11 = 16;
        } else if (i10 != 2) {
            i11 = z10 ? 0 : context.getApplicationContext().getResources().getConfiguration().uiMode & 48;
        } else {
            i11 = 32;
        }
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i11 | (configuration2.uiMode & (-49));
        return configuration2;
    }

    private ViewGroup e0() {
        ViewGroup viewGroup;
        TypedArray typedArrayObtainStyledAttributes = this.f1694r.obtainStyledAttributes(androidx.appcompat.R.styleable.f1580m);
        int i10 = androidx.appcompat.R.styleable.AppCompatTheme_windowActionBar;
        if (!typedArrayObtainStyledAttributes.hasValue(i10)) {
            typedArrayObtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
        if (typedArrayObtainStyledAttributes.getBoolean(androidx.appcompat.R.styleable.AppCompatTheme_windowNoTitle, false)) {
            I(1);
        } else if (typedArrayObtainStyledAttributes.getBoolean(i10, false)) {
            I(108);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(androidx.appcompat.R.styleable.AppCompatTheme_windowActionBarOverlay, false)) {
            I(109);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(androidx.appcompat.R.styleable.AppCompatTheme_windowActionModeOverlay, false)) {
            I(10);
        }
        this.Q = typedArrayObtainStyledAttributes.getBoolean(androidx.appcompat.R.styleable.AppCompatTheme_android_windowIsFloating, false);
        typedArrayObtainStyledAttributes.recycle();
        k0();
        this.f1695s.getDecorView();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.f1694r);
        if (this.R) {
            viewGroup = this.P ? (ViewGroup) layoutInflaterFrom.inflate(androidx.appcompat.R.layout.abc_screen_simple_overlay_action_mode, (ViewGroup) null) : (ViewGroup) layoutInflaterFrom.inflate(androidx.appcompat.R.layout.abc_screen_simple, (ViewGroup) null);
        } else if (this.Q) {
            viewGroup = (ViewGroup) layoutInflaterFrom.inflate(androidx.appcompat.R.layout.abc_dialog_title_material, (ViewGroup) null);
            this.O = false;
            this.N = false;
        } else if (this.N) {
            TypedValue typedValue = new TypedValue();
            this.f1694r.getTheme().resolveAttribute(androidx.appcompat.R.attr.actionBarTheme, typedValue, true);
            viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new androidx.appcompat.view.d(this.f1694r, typedValue.resourceId) : this.f1694r).inflate(androidx.appcompat.R.layout.abc_screen_toolbar, (ViewGroup) null);
            z zVar = (z) viewGroup.findViewById(androidx.appcompat.R.id.decor_content_parent);
            this.f1703y = zVar;
            zVar.setWindowCallback(u0());
            if (this.O) {
                this.f1703y.m(109);
            }
            if (this.L) {
                this.f1703y.m(2);
            }
            if (this.M) {
                this.f1703y.m(5);
            }
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.N + ", windowActionBarOverlay: " + this.O + ", android:windowIsFloating: " + this.Q + ", windowActionModeOverlay: " + this.P + ", windowNoTitle: " + this.R + " }");
        }
        androidx.core.view.j1.a2(viewGroup, new c());
        if (this.f1703y == null) {
            this.J = (TextView) viewGroup.findViewById(androidx.appcompat.R.id.title);
        }
        h1.c(viewGroup);
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(androidx.appcompat.R.id.action_bar_activity_content);
        ViewGroup viewGroup2 = (ViewGroup) this.f1695s.findViewById(R.id.content);
        if (viewGroup2 != null) {
            while (viewGroup2.getChildCount() > 0) {
                View childAt = viewGroup2.getChildAt(0);
                viewGroup2.removeViewAt(0);
                contentFrameLayout.addView(childAt);
            }
            viewGroup2.setId(-1);
            contentFrameLayout.setId(R.id.content);
            if (viewGroup2 instanceof FrameLayout) {
                ((FrameLayout) viewGroup2).setForeground(null);
            }
        }
        this.f1695s.setContentView(viewGroup);
        contentFrameLayout.setAttachListener(new e());
        return viewGroup;
    }

    private void j0() {
        if (this.H) {
            return;
        }
        this.I = e0();
        CharSequence charSequenceT0 = t0();
        if (!TextUtils.isEmpty(charSequenceT0)) {
            z zVar = this.f1703y;
            if (zVar != null) {
                zVar.setWindowTitle(charSequenceT0);
            } else if (M0() != null) {
                M0().A0(charSequenceT0);
            } else {
                TextView textView = this.J;
                if (textView != null) {
                    textView.setText(charSequenceT0);
                }
            }
        }
        V();
        K0(this.I);
        this.H = true;
        PanelFeatureState panelFeatureStateR0 = r0(0, false);
        if (this.Y) {
            return;
        }
        if (panelFeatureStateR0 == null || panelFeatureStateR0.f1720j == null) {
            z0(108);
        }
    }

    private void k0() {
        if (this.f1695s == null) {
            Object obj = this.f1693q;
            if (obj instanceof Activity) {
                W(((Activity) obj).getWindow());
            }
        }
        if (this.f1695s == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    @n0
    private static Configuration m0(@n0 Configuration configuration, @p0 Configuration configuration2) {
        Configuration configuration3 = new Configuration();
        configuration3.fontScale = 0.0f;
        if (configuration2 != null && configuration.diff(configuration2) != 0) {
            float f10 = configuration.fontScale;
            float f11 = configuration2.fontScale;
            if (f10 != f11) {
                configuration3.fontScale = f11;
            }
            int i10 = configuration.mcc;
            int i11 = configuration2.mcc;
            if (i10 != i11) {
                configuration3.mcc = i11;
            }
            int i12 = configuration.mnc;
            int i13 = configuration2.mnc;
            if (i12 != i13) {
                configuration3.mnc = i13;
            }
            int i14 = Build.VERSION.SDK_INT;
            if (i14 >= 24) {
                n.a(configuration, configuration2, configuration3);
            } else if (!androidx.core.util.j.a(configuration.locale, configuration2.locale)) {
                configuration3.locale = configuration2.locale;
            }
            int i15 = configuration.touchscreen;
            int i16 = configuration2.touchscreen;
            if (i15 != i16) {
                configuration3.touchscreen = i16;
            }
            int i17 = configuration.keyboard;
            int i18 = configuration2.keyboard;
            if (i17 != i18) {
                configuration3.keyboard = i18;
            }
            int i19 = configuration.keyboardHidden;
            int i20 = configuration2.keyboardHidden;
            if (i19 != i20) {
                configuration3.keyboardHidden = i20;
            }
            int i21 = configuration.navigation;
            int i22 = configuration2.navigation;
            if (i21 != i22) {
                configuration3.navigation = i22;
            }
            int i23 = configuration.navigationHidden;
            int i24 = configuration2.navigationHidden;
            if (i23 != i24) {
                configuration3.navigationHidden = i24;
            }
            int i25 = configuration.orientation;
            int i26 = configuration2.orientation;
            if (i25 != i26) {
                configuration3.orientation = i26;
            }
            int i27 = configuration.screenLayout & 15;
            int i28 = configuration2.screenLayout;
            if (i27 != (i28 & 15)) {
                configuration3.screenLayout |= i28 & 15;
            }
            int i29 = configuration.screenLayout & 192;
            int i30 = configuration2.screenLayout;
            if (i29 != (i30 & 192)) {
                configuration3.screenLayout |= i30 & 192;
            }
            int i31 = configuration.screenLayout & 48;
            int i32 = configuration2.screenLayout;
            if (i31 != (i32 & 48)) {
                configuration3.screenLayout |= i32 & 48;
            }
            int i33 = configuration.screenLayout & 768;
            int i34 = configuration2.screenLayout;
            if (i33 != (i34 & 768)) {
                configuration3.screenLayout |= i34 & 768;
            }
            if (i14 >= 26) {
                o.a(configuration, configuration2, configuration3);
            }
            int i35 = configuration.uiMode & 15;
            int i36 = configuration2.uiMode;
            if (i35 != (i36 & 15)) {
                configuration3.uiMode |= i36 & 15;
            }
            int i37 = configuration.uiMode & 48;
            int i38 = configuration2.uiMode;
            if (i37 != (i38 & 48)) {
                configuration3.uiMode |= i38 & 48;
            }
            int i39 = configuration.screenWidthDp;
            int i40 = configuration2.screenWidthDp;
            if (i39 != i40) {
                configuration3.screenWidthDp = i40;
            }
            int i41 = configuration.screenHeightDp;
            int i42 = configuration2.screenHeightDp;
            if (i41 != i42) {
                configuration3.screenHeightDp = i42;
            }
            int i43 = configuration.smallestScreenWidthDp;
            int i44 = configuration2.smallestScreenWidthDp;
            if (i43 != i44) {
                configuration3.smallestScreenWidthDp = i44;
            }
            l.b(configuration, configuration2, configuration3);
        }
        return configuration3;
    }

    private AutoNightModeManager o0(@n0 Context context) {
        if (this.f1704y1 == null) {
            this.f1704y1 = new q(context);
        }
        return this.f1704y1;
    }

    private AutoNightModeManager q0(@n0 Context context) {
        if (this.f1701x1 == null) {
            this.f1701x1 = new r(androidx.appcompat.app.q.a(context));
        }
        return this.f1701x1;
    }

    private void v0() {
        j0();
        if (this.N && this.f1698v == null) {
            Object obj = this.f1693q;
            if (obj instanceof Activity) {
                this.f1698v = new androidx.appcompat.app.r((Activity) this.f1693q, this.O);
            } else if (obj instanceof Dialog) {
                this.f1698v = new androidx.appcompat.app.r((Dialog) this.f1693q);
            }
            ActionBar actionBar = this.f1698v;
            if (actionBar != null) {
                actionBar.W(this.G2);
            }
        }
    }

    private boolean w0(PanelFeatureState panelFeatureState) {
        View view = panelFeatureState.f1719i;
        if (view != null) {
            panelFeatureState.f1718h = view;
            return true;
        }
        if (panelFeatureState.f1720j == null) {
            return false;
        }
        if (this.A == null) {
            this.A = new t();
        }
        View view2 = (View) panelFeatureState.c(this.A);
        panelFeatureState.f1718h = view2;
        return view2 != null;
    }

    private boolean x0(PanelFeatureState panelFeatureState) {
        panelFeatureState.h(n0());
        panelFeatureState.f1717g = new ListMenuDecorView(panelFeatureState.f1722l);
        panelFeatureState.f1713c = 81;
        return true;
    }

    private boolean y0(PanelFeatureState panelFeatureState) {
        Context context = this.f1694r;
        int i10 = panelFeatureState.f1711a;
        if ((i10 == 0 || i10 == 108) && this.f1703y != null) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme theme = context.getTheme();
            theme.resolveAttribute(androidx.appcompat.R.attr.actionBarTheme, typedValue, true);
            Resources.Theme themeNewTheme = null;
            if (typedValue.resourceId != 0) {
                themeNewTheme = context.getResources().newTheme();
                themeNewTheme.setTo(theme);
                themeNewTheme.applyStyle(typedValue.resourceId, true);
                themeNewTheme.resolveAttribute(androidx.appcompat.R.attr.actionBarWidgetTheme, typedValue, true);
            } else {
                theme.resolveAttribute(androidx.appcompat.R.attr.actionBarWidgetTheme, typedValue, true);
            }
            if (typedValue.resourceId != 0) {
                if (themeNewTheme == null) {
                    themeNewTheme = context.getResources().newTheme();
                    themeNewTheme.setTo(theme);
                }
                themeNewTheme.applyStyle(typedValue.resourceId, true);
            }
            if (themeNewTheme != null) {
                androidx.appcompat.view.d dVar = new androidx.appcompat.view.d(context, 0);
                dVar.getTheme().setTo(themeNewTheme);
                context = dVar;
            }
        }
        androidx.appcompat.view.menu.g gVar = new androidx.appcompat.view.menu.g(context);
        gVar.X(this);
        panelFeatureState.g(gVar);
        return true;
    }

    private void z0(int i10) {
        this.f1702x2 = (1 << i10) | this.f1702x2;
        if (this.f1691p2) {
            return;
        }
        androidx.core.view.j1.p1(this.f1695s.getDecorView(), this.f1705y2);
        this.f1691p2 = true;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0045  */
    @Override // androidx.appcompat.app.e
    public void A() {
        if (this.f1693q instanceof Activity) {
            androidx.appcompat.app.e.G(this);
        }
        if (this.f1691p2) {
            this.f1695s.getDecorView().removeCallbacks(this.f1705y2);
        }
        this.Y = true;
        if (this.f1687a0 != -100) {
            Object obj = this.f1693q;
            if ((obj instanceof Activity) && ((Activity) obj).isChangingConfigurations()) {
                L3.put(this.f1693q.getClass().getName(), Integer.valueOf(this.f1687a0));
            } else {
                L3.remove(this.f1693q.getClass().getName());
            }
        } else {
            L3.remove(this.f1693q.getClass().getName());
        }
        ActionBar actionBar = this.f1698v;
        if (actionBar != null) {
            actionBar.I();
        }
        a0();
    }

    @Override // androidx.appcompat.app.e
    public void B(Bundle bundle) {
        j0();
    }

    int B0(@n0 Context context, int i10) {
        if (i10 == -100) {
            return -1;
        }
        if (i10 != -1) {
            if (i10 == 0) {
                if (((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() == 0) {
                    return -1;
                }
                return q0(context).c();
            }
            if (i10 != 1 && i10 != 2) {
                if (i10 == 3) {
                    return o0(context).c();
                }
                throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
            }
        }
        return i10;
    }

    @Override // androidx.appcompat.app.e
    public void C() {
        ActionBar actionBarS = s();
        if (actionBarS != null) {
            actionBarS.t0(true);
        }
    }

    boolean C0() {
        androidx.appcompat.view.b bVar = this.B;
        if (bVar != null) {
            bVar.c();
            return true;
        }
        ActionBar actionBarS = s();
        return actionBarS != null && actionBarS.l();
    }

    @Override // androidx.appcompat.app.e
    public void D(Bundle bundle) {
    }

    boolean D0(int i10, KeyEvent keyEvent) {
        if (i10 == 4) {
            this.V = (keyEvent.getFlags() & 128) != 0;
        } else if (i10 == 82) {
            E0(0, keyEvent);
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.app.e
    public void E() {
        e();
    }

    @Override // androidx.appcompat.app.e
    public void F() {
        ActionBar actionBarS = s();
        if (actionBarS != null) {
            actionBarS.t0(false);
        }
    }

    boolean F0(int i10, KeyEvent keyEvent) {
        ActionBar actionBarS = s();
        if (actionBarS != null && actionBarS.J(i10, keyEvent)) {
            return true;
        }
        PanelFeatureState panelFeatureState = this.U;
        if (panelFeatureState != null && N0(panelFeatureState, keyEvent.getKeyCode(), keyEvent, 1)) {
            PanelFeatureState panelFeatureState2 = this.U;
            if (panelFeatureState2 != null) {
                panelFeatureState2.f1724n = true;
            }
            return true;
        }
        if (this.U == null) {
            PanelFeatureState panelFeatureStateR0 = r0(0, true);
            O0(panelFeatureStateR0, keyEvent);
            boolean zN0 = N0(panelFeatureStateR0, keyEvent.getKeyCode(), keyEvent, 1);
            panelFeatureStateR0.f1723m = false;
            if (zN0) {
                return true;
            }
        }
        return false;
    }

    boolean G0(int i10, KeyEvent keyEvent) {
        if (i10 == 4) {
            boolean z10 = this.V;
            this.V = false;
            PanelFeatureState panelFeatureStateR0 = r0(0, false);
            if (panelFeatureStateR0 != null && panelFeatureStateR0.f1725o) {
                if (!z10) {
                    c0(panelFeatureStateR0, true);
                }
                return true;
            }
            if (C0()) {
                return true;
            }
        } else if (i10 == 82) {
            H0(0, keyEvent);
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.app.e
    public boolean I(int i10) {
        int iQ0 = Q0(i10);
        if (this.R && iQ0 == 108) {
            return false;
        }
        if (this.N && iQ0 == 1) {
            this.N = false;
        }
        if (iQ0 == 1) {
            U0();
            this.R = true;
            return true;
        }
        if (iQ0 == 2) {
            U0();
            this.L = true;
            return true;
        }
        if (iQ0 == 5) {
            U0();
            this.M = true;
            return true;
        }
        if (iQ0 == 10) {
            U0();
            this.P = true;
            return true;
        }
        if (iQ0 == 108) {
            U0();
            this.N = true;
            return true;
        }
        if (iQ0 != 109) {
            return this.f1695s.requestFeature(iQ0);
        }
        U0();
        this.O = true;
        return true;
    }

    void I0(int i10) {
        ActionBar actionBarS;
        if (i10 != 108 || (actionBarS = s()) == null) {
            return;
        }
        actionBarS.m(true);
    }

    void J0(int i10) {
        if (i10 == 108) {
            ActionBar actionBarS = s();
            if (actionBarS != null) {
                actionBarS.m(false);
                return;
            }
            return;
        }
        if (i10 == 0) {
            PanelFeatureState panelFeatureStateR0 = r0(i10, true);
            if (panelFeatureStateR0.f1725o) {
                c0(panelFeatureStateR0, false);
            }
        }
    }

    @Override // androidx.appcompat.app.e
    public void K(int i10) {
        j0();
        ViewGroup viewGroup = (ViewGroup) this.I.findViewById(R.id.content);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f1694r).inflate(i10, viewGroup);
        this.f1696t.c(this.f1695s.getCallback());
    }

    void K0(ViewGroup viewGroup) {
    }

    @Override // androidx.appcompat.app.e
    public void L(View view) {
        j0();
        ViewGroup viewGroup = (ViewGroup) this.I.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.f1696t.c(this.f1695s.getCallback());
    }

    @Override // androidx.appcompat.app.e
    public void M(View view, ViewGroup.LayoutParams layoutParams) {
        j0();
        ViewGroup viewGroup = (ViewGroup) this.I.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.f1696t.c(this.f1695s.getCallback());
    }

    final ActionBar M0() {
        return this.f1698v;
    }

    @Override // androidx.appcompat.app.e
    public void O(boolean z10) {
        this.G = z10;
    }

    @Override // androidx.appcompat.app.e
    @w0(17)
    public void P(int i10) {
        if (this.f1687a0 != i10) {
            this.f1687a0 = i10;
            if (this.W) {
                e();
            }
        }
    }

    @Override // androidx.appcompat.app.e
    public void Q(Toolbar toolbar) {
        if (this.f1693q instanceof Activity) {
            ActionBar actionBarS = s();
            if (actionBarS instanceof androidx.appcompat.app.r) {
                throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
            }
            this.f1699w = null;
            if (actionBarS != null) {
                actionBarS.I();
            }
            this.f1698v = null;
            if (toolbar != null) {
                androidx.appcompat.app.o oVar = new androidx.appcompat.app.o(toolbar, t0(), this.f1696t);
                this.f1698v = oVar;
                this.f1696t.e(oVar.f1829k);
            } else {
                this.f1696t.e(null);
            }
            v();
        }
    }

    @Override // androidx.appcompat.app.e
    public void R(@e1 int i10) {
        this.f1688b0 = i10;
    }

    final boolean R0() {
        ViewGroup viewGroup;
        return this.H && (viewGroup = this.I) != null && androidx.core.view.j1.U0(viewGroup);
    }

    @Override // androidx.appcompat.app.e
    public final void S(CharSequence charSequence) {
        this.f1700x = charSequence;
        z zVar = this.f1703y;
        if (zVar != null) {
            zVar.setWindowTitle(charSequence);
            return;
        }
        if (M0() != null) {
            M0().A0(charSequence);
            return;
        }
        TextView textView = this.J;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    @Override // androidx.appcompat.app.e
    public androidx.appcompat.view.b T(@n0 androidx.appcompat.view.b.a aVar) {
        androidx.appcompat.app.d dVar;
        if (aVar == null) {
            throw new IllegalArgumentException("ActionMode callback can not be null.");
        }
        androidx.appcompat.view.b bVar = this.B;
        if (bVar != null) {
            bVar.c();
        }
        k kVar = new k(aVar);
        ActionBar actionBarS = s();
        if (actionBarS != null) {
            androidx.appcompat.view.b bVarC0 = actionBarS.C0(kVar);
            this.B = bVarC0;
            if (bVarC0 != null && (dVar = this.f1697u) != null) {
                dVar.onSupportActionModeStarted(bVarC0);
            }
        }
        if (this.B == null) {
            this.B = T0(kVar);
        }
        return this.B;
    }

    androidx.appcompat.view.b T0(@n0 androidx.appcompat.view.b.a aVar) {
        androidx.appcompat.view.b bVarOnWindowStartingSupportActionMode;
        Context dVar;
        androidx.appcompat.app.d dVar2;
        i0();
        androidx.appcompat.view.b bVar = this.B;
        if (bVar != null) {
            bVar.c();
        }
        if (!(aVar instanceof k)) {
            aVar = new k(aVar);
        }
        androidx.appcompat.app.d dVar3 = this.f1697u;
        if (dVar3 == null || this.Y) {
            bVarOnWindowStartingSupportActionMode = null;
        } else {
            try {
                bVarOnWindowStartingSupportActionMode = dVar3.onWindowStartingSupportActionMode(aVar);
            } catch (AbstractMethodError unused) {
                bVarOnWindowStartingSupportActionMode = null;
            }
        }
        if (bVarOnWindowStartingSupportActionMode != null) {
            this.B = bVarOnWindowStartingSupportActionMode;
        } else {
            if (this.C == null) {
                if (this.Q) {
                    TypedValue typedValue = new TypedValue();
                    Resources.Theme theme = this.f1694r.getTheme();
                    theme.resolveAttribute(androidx.appcompat.R.attr.actionBarTheme, typedValue, true);
                    if (typedValue.resourceId != 0) {
                        Resources.Theme themeNewTheme = this.f1694r.getResources().newTheme();
                        themeNewTheme.setTo(theme);
                        themeNewTheme.applyStyle(typedValue.resourceId, true);
                        dVar = new androidx.appcompat.view.d(this.f1694r, 0);
                        dVar.getTheme().setTo(themeNewTheme);
                    } else {
                        dVar = this.f1694r;
                    }
                    this.C = new ActionBarContextView(dVar);
                    PopupWindow popupWindow = new PopupWindow(dVar, (AttributeSet) null, androidx.appcompat.R.attr.actionModePopupWindowStyle);
                    this.D = popupWindow;
                    androidx.core.widget.o.d(popupWindow, 2);
                    this.D.setContentView(this.C);
                    this.D.setWidth(-1);
                    dVar.getTheme().resolveAttribute(androidx.appcompat.R.attr.actionBarSize, typedValue, true);
                    this.C.setContentHeight(TypedValue.complexToDimensionPixelSize(typedValue.data, dVar.getResources().getDisplayMetrics()));
                    this.D.setHeight(-2);
                    this.E = new f();
                } else {
                    ViewStubCompat viewStubCompat = (ViewStubCompat) this.I.findViewById(androidx.appcompat.R.id.action_mode_bar_stub);
                    if (viewStubCompat != null) {
                        viewStubCompat.setLayoutInflater(LayoutInflater.from(n0()));
                        this.C = (ActionBarContextView) viewStubCompat.a();
                    }
                }
            }
            if (this.C != null) {
                i0();
                this.C.t();
                androidx.appcompat.view.e eVar = new androidx.appcompat.view.e(this.C.getContext(), this.C, aVar, this.D == null);
                if (aVar.a(eVar, eVar.e())) {
                    eVar.k();
                    this.C.q(eVar);
                    this.B = eVar;
                    if (R0()) {
                        this.C.setAlpha(0.0f);
                        c3 c3VarB = androidx.core.view.j1.g(this.C).b(1.0f);
                        this.F = c3VarB;
                        c3VarB.u(new g());
                    } else {
                        this.C.setAlpha(1.0f);
                        this.C.setVisibility(0);
                        if (this.C.getParent() instanceof View) {
                            androidx.core.view.j1.v1((View) this.C.getParent());
                        }
                    }
                    if (this.D != null) {
                        this.f1695s.getDecorView().post(this.E);
                    }
                } else {
                    this.B = null;
                }
            }
        }
        androidx.appcompat.view.b bVar2 = this.B;
        if (bVar2 != null && (dVar2 = this.f1697u) != null) {
            dVar2.onSupportActionModeStarted(bVar2);
        }
        return this.B;
    }

    void Y(int i10, PanelFeatureState panelFeatureState, Menu menu) {
        if (menu == null) {
            if (panelFeatureState == null && i10 >= 0) {
                PanelFeatureState[] panelFeatureStateArr = this.T;
                if (i10 < panelFeatureStateArr.length) {
                    panelFeatureState = panelFeatureStateArr[i10];
                }
            }
            if (panelFeatureState != null) {
                menu = panelFeatureState.f1720j;
            }
        }
        if ((panelFeatureState == null || panelFeatureState.f1725o) && !this.Y) {
            this.f1696t.d(this.f1695s.getCallback(), i10, menu);
        }
    }

    final int Y0(@p0 n3 n3Var, @p0 Rect rect) {
        int iR;
        boolean z10;
        boolean z11;
        if (n3Var != null) {
            iR = n3Var.r();
        } else {
            iR = rect != null ? rect.top : 0;
        }
        ActionBarContextView actionBarContextView = this.C;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            z10 = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.C.getLayoutParams();
            boolean z12 = true;
            if (this.C.isShown()) {
                if (this.f1692p3 == null) {
                    this.f1692p3 = new Rect();
                    this.G3 = new Rect();
                }
                Rect rect2 = this.f1692p3;
                Rect rect3 = this.G3;
                if (n3Var == null) {
                    rect2.set(rect);
                } else {
                    rect2.set(n3Var.p(), n3Var.r(), n3Var.q(), n3Var.o());
                }
                h1.a(this.I, rect2, rect3);
                int i10 = rect2.top;
                int i11 = rect2.left;
                int i12 = rect2.right;
                n3 n3VarO0 = androidx.core.view.j1.o0(this.I);
                int iP = n3VarO0 == null ? 0 : n3VarO0.p();
                int iQ = n3VarO0 == null ? 0 : n3VarO0.q();
                if (marginLayoutParams.topMargin == i10 && marginLayoutParams.leftMargin == i11 && marginLayoutParams.rightMargin == i12) {
                    z11 = false;
                } else {
                    marginLayoutParams.topMargin = i10;
                    marginLayoutParams.leftMargin = i11;
                    marginLayoutParams.rightMargin = i12;
                    z11 = true;
                }
                if (i10 <= 0 || this.K != null) {
                    View view = this.K;
                    if (view != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                        int i13 = marginLayoutParams2.height;
                        int i14 = marginLayoutParams.topMargin;
                        if (i13 != i14 || marginLayoutParams2.leftMargin != iP || marginLayoutParams2.rightMargin != iQ) {
                            marginLayoutParams2.height = i14;
                            marginLayoutParams2.leftMargin = iP;
                            marginLayoutParams2.rightMargin = iQ;
                            this.K.setLayoutParams(marginLayoutParams2);
                        }
                    }
                } else {
                    View view2 = new View(this.f1694r);
                    this.K = view2;
                    view2.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = iP;
                    layoutParams.rightMargin = iQ;
                    this.I.addView(this.K, -1, layoutParams);
                }
                View view3 = this.K;
                z12 = view3 != null;
                if (z12 && view3.getVisibility() != 0) {
                    Z0(this.K);
                }
                if (!this.P && z12) {
                    iR = 0;
                }
                z10 = z12;
                z12 = z11;
            } else if (marginLayoutParams.topMargin != 0) {
                marginLayoutParams.topMargin = 0;
                z10 = false;
            } else {
                z10 = false;
                z12 = false;
            }
            if (z12) {
                this.C.setLayoutParams(marginLayoutParams);
            }
        }
        View view4 = this.K;
        if (view4 != null) {
            view4.setVisibility(z10 ? 0 : 8);
        }
        return iR;
    }

    void Z(@n0 androidx.appcompat.view.menu.g gVar) {
        if (this.S) {
            return;
        }
        this.S = true;
        this.f1703y.n();
        Window.Callback callbackU0 = u0();
        if (callbackU0 != null && !this.Y) {
            callbackU0.onPanelClosed(108, gVar);
        }
        this.S = false;
    }

    @Override // androidx.appcompat.view.menu.g.a
    public boolean a(@n0 androidx.appcompat.view.menu.g gVar, @n0 MenuItem menuItem) {
        PanelFeatureState panelFeatureStateL0;
        Window.Callback callbackU0 = u0();
        if (callbackU0 == null || this.Y || (panelFeatureStateL0 = l0(gVar.G())) == null) {
            return false;
        }
        return callbackU0.onMenuItemSelected(panelFeatureStateL0.f1711a, menuItem);
    }

    @Override // androidx.appcompat.view.menu.g.a
    public void b(@n0 androidx.appcompat.view.menu.g gVar) {
        P0(true);
    }

    void b0(int i10) {
        c0(r0(i10, true), true);
    }

    void c0(PanelFeatureState panelFeatureState, boolean z10) {
        ViewGroup viewGroup;
        z zVar;
        if (z10 && panelFeatureState.f1711a == 0 && (zVar = this.f1703y) != null && zVar.d()) {
            Z(panelFeatureState.f1720j);
            return;
        }
        WindowManager windowManager = (WindowManager) this.f1694r.getSystemService("window");
        if (windowManager != null && panelFeatureState.f1725o && (viewGroup = panelFeatureState.f1717g) != null) {
            windowManager.removeView(viewGroup);
            if (z10) {
                Y(panelFeatureState.f1711a, panelFeatureState, null);
            }
        }
        panelFeatureState.f1723m = false;
        panelFeatureState.f1724n = false;
        panelFeatureState.f1725o = false;
        panelFeatureState.f1718h = null;
        panelFeatureState.f1727q = true;
        if (this.U == panelFeatureState) {
            this.U = null;
        }
    }

    @Override // androidx.appcompat.app.e
    public void d(View view, ViewGroup.LayoutParams layoutParams) {
        j0();
        ((ViewGroup) this.I.findViewById(R.id.content)).addView(view, layoutParams);
        this.f1696t.c(this.f1695s.getCallback());
    }

    @Override // androidx.appcompat.app.e
    public boolean e() {
        return U(true);
    }

    void f0() {
        androidx.appcompat.view.menu.g gVar;
        z zVar = this.f1703y;
        if (zVar != null) {
            zVar.n();
        }
        if (this.D != null) {
            this.f1695s.getDecorView().removeCallbacks(this.E);
            if (this.D.isShowing()) {
                try {
                    this.D.dismiss();
                } catch (IllegalArgumentException unused) {
                }
            }
            this.D = null;
        }
        i0();
        PanelFeatureState panelFeatureStateR0 = r0(0, false);
        if (panelFeatureStateR0 == null || (gVar = panelFeatureStateR0.f1720j) == null) {
            return;
        }
        gVar.close();
    }

    boolean g0(KeyEvent keyEvent) {
        View decorView;
        Object obj = this.f1693q;
        if (((obj instanceof androidx.core.view.p.a) || (obj instanceof androidx.appcompat.app.i)) && (decorView = this.f1695s.getDecorView()) != null && androidx.core.view.p.d(decorView, keyEvent)) {
            return true;
        }
        if (keyEvent.getKeyCode() == 82 && this.f1696t.b(this.f1695s.getCallback(), keyEvent)) {
            return true;
        }
        int keyCode = keyEvent.getKeyCode();
        return keyEvent.getAction() == 0 ? D0(keyCode, keyEvent) : G0(keyCode, keyEvent);
    }

    @Override // androidx.appcompat.app.e
    @androidx.annotation.i
    @n0
    public Context h(@n0 Context context) {
        this.W = true;
        int iB0 = B0(context, X());
        boolean z10 = false;
        if (P3 && (context instanceof ContextThemeWrapper)) {
            try {
                s.a((ContextThemeWrapper) context, d0(context, iB0, null, false));
                return context;
            } catch (IllegalStateException unused) {
            }
        }
        if (context instanceof androidx.appcompat.view.d) {
            try {
                ((androidx.appcompat.view.d) context).a(d0(context, iB0, null, false));
                return context;
            } catch (IllegalStateException unused2) {
            }
        }
        if (!O3) {
            return super.h(context);
        }
        Configuration configuration = new Configuration();
        configuration.uiMode = -1;
        configuration.fontScale = 0.0f;
        Configuration configuration2 = l.a(context, configuration).getResources().getConfiguration();
        Configuration configuration3 = context.getResources().getConfiguration();
        configuration2.uiMode = configuration3.uiMode;
        Configuration configurationD0 = d0(context, iB0, configuration2.equals(configuration3) ? null : m0(configuration2, configuration3), true);
        androidx.appcompat.view.d dVar = new androidx.appcompat.view.d(context, androidx.appcompat.R.style.Theme_AppCompat_Empty);
        dVar.a(configurationD0);
        try {
            z10 = context.getTheme() != null;
        } catch (NullPointerException unused3) {
        }
        if (z10) {
            androidx.core.content.res.i.h.a(dVar.getTheme());
        }
        return super.h(dVar);
    }

    void h0(int i10) {
        PanelFeatureState panelFeatureStateR0;
        PanelFeatureState panelFeatureStateR1 = r0(i10, true);
        if (panelFeatureStateR1.f1720j != null) {
            Bundle bundle = new Bundle();
            panelFeatureStateR1.f1720j.V(bundle);
            if (bundle.size() > 0) {
                panelFeatureStateR1.f1731u = bundle;
            }
            panelFeatureStateR1.f1720j.m0();
            panelFeatureStateR1.f1720j.clear();
        }
        panelFeatureStateR1.f1728r = true;
        panelFeatureStateR1.f1727q = true;
        if ((i10 != 108 && i10 != 0) || this.f1703y == null || (panelFeatureStateR0 = r0(0, false)) == null) {
            return;
        }
        panelFeatureStateR0.f1723m = false;
        O0(panelFeatureStateR0, null);
    }

    void i0() {
        c3 c3Var = this.F;
        if (c3Var != null) {
            c3Var.d();
        }
    }

    PanelFeatureState l0(Menu menu) {
        PanelFeatureState[] panelFeatureStateArr = this.T;
        int length = panelFeatureStateArr != null ? panelFeatureStateArr.length : 0;
        for (int i10 = 0; i10 < length; i10++) {
            PanelFeatureState panelFeatureState = panelFeatureStateArr[i10];
            if (panelFeatureState != null && panelFeatureState.f1720j == menu) {
                return panelFeatureState;
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.appcompat.app.e
    public View m(View view, String str, @n0 Context context, @n0 AttributeSet attributeSet) {
        boolean z10;
        boolean z11 = false;
        if (this.J3 == null) {
            String string = this.f1694r.obtainStyledAttributes(androidx.appcompat.R.styleable.f1580m).getString(androidx.appcompat.R.styleable.AppCompatTheme_viewInflaterClass);
            if (string == null) {
                this.J3 = new androidx.appcompat.app.k();
            } else {
                try {
                    this.J3 = (androidx.appcompat.app.k) this.f1694r.getClassLoader().loadClass(string).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                } catch (Throwable th2) {
                    Log.i("AppCompatDelegate", "Failed to instantiate custom view inflater " + string + ". Falling back to default.", th2);
                    this.J3 = new androidx.appcompat.app.k();
                }
            }
        }
        boolean z12 = M3;
        boolean zS0 = true;
        if (z12) {
            if (this.K3 == null) {
                this.K3 = new androidx.appcompat.app.l();
            }
            if (this.K3.a(attributeSet)) {
                z10 = true;
            } else {
                if (attributeSet instanceof XmlPullParser) {
                    if (((XmlPullParser) attributeSet).getDepth() > 1) {
                    }
                    z10 = z11;
                } else {
                    zS0 = S0((ViewParent) view);
                }
                z11 = zS0;
                z10 = z11;
            }
        } else {
            z10 = z11;
        }
        return this.J3.r(view, str, context, attributeSet, z10, z12, true, g1.d());
    }

    @Override // androidx.appcompat.app.e
    @p0
    public <T extends View> T n(@d0 int i10) {
        j0();
        return (T) this.f1695s.findViewById(i10);
    }

    final Context n0() {
        ActionBar actionBarS = s();
        Context contextZ = actionBarS != null ? actionBarS.z() : null;
        return contextZ == null ? this.f1694r : contextZ;
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return m(view, str, context, attributeSet);
    }

    @Override // android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    @Override // androidx.appcompat.app.e
    public final androidx.appcompat.app.a.b p() {
        return new h();
    }

    @j1
    @n0
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    final AutoNightModeManager p0() {
        return q0(this.f1694r);
    }

    @Override // androidx.appcompat.app.e
    public int q() {
        return this.f1687a0;
    }

    @Override // androidx.appcompat.app.e
    public MenuInflater r() {
        if (this.f1699w == null) {
            v0();
            ActionBar actionBar = this.f1698v;
            this.f1699w = new androidx.appcompat.view.g(actionBar != null ? actionBar.z() : this.f1694r);
        }
        return this.f1699w;
    }

    protected PanelFeatureState r0(int i10, boolean z10) {
        PanelFeatureState[] panelFeatureStateArr = this.T;
        if (panelFeatureStateArr == null || panelFeatureStateArr.length <= i10) {
            PanelFeatureState[] panelFeatureStateArr2 = new PanelFeatureState[i10 + 1];
            if (panelFeatureStateArr != null) {
                System.arraycopy(panelFeatureStateArr, 0, panelFeatureStateArr2, 0, panelFeatureStateArr.length);
            }
            this.T = panelFeatureStateArr2;
            panelFeatureStateArr = panelFeatureStateArr2;
        }
        PanelFeatureState panelFeatureState = panelFeatureStateArr[i10];
        if (panelFeatureState != null) {
            return panelFeatureState;
        }
        PanelFeatureState panelFeatureState2 = new PanelFeatureState(i10);
        panelFeatureStateArr[i10] = panelFeatureState2;
        return panelFeatureState2;
    }

    @Override // androidx.appcompat.app.e
    public ActionBar s() {
        v0();
        return this.f1698v;
    }

    ViewGroup s0() {
        return this.I;
    }

    @Override // androidx.appcompat.app.e
    public boolean t(int i10) {
        boolean z10;
        int iQ0 = Q0(i10);
        if (iQ0 == 1) {
            z10 = this.R;
        } else if (iQ0 == 2) {
            z10 = this.L;
        } else if (iQ0 == 5) {
            z10 = this.M;
        } else if (iQ0 == 10) {
            z10 = this.P;
        } else if (iQ0 != 108) {
            z10 = iQ0 != 109 ? false : this.O;
        } else {
            z10 = this.N;
        }
        return z10 || this.f1695s.hasFeature(i10);
    }

    final CharSequence t0() {
        Object obj = this.f1693q;
        return obj instanceof Activity ? ((Activity) obj).getTitle() : this.f1700x;
    }

    @Override // androidx.appcompat.app.e
    public void u() {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.f1694r);
        if (layoutInflaterFrom.getFactory() == null) {
            androidx.core.view.q.d(layoutInflaterFrom, this);
        } else {
            if (layoutInflaterFrom.getFactory2() instanceof AppCompatDelegateImpl) {
                return;
            }
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    final Window.Callback u0() {
        return this.f1695s.getCallback();
    }

    @Override // androidx.appcompat.app.e
    public void v() {
        if (M0() == null || s().C()) {
            return;
        }
        z0(0);
    }

    @Override // androidx.appcompat.app.e
    public boolean x() {
        return this.G;
    }

    @Override // androidx.appcompat.app.e
    public void y(Configuration configuration) {
        ActionBar actionBarS;
        if (this.N && this.H && (actionBarS = s()) != null) {
            actionBarS.H(configuration);
        }
        androidx.appcompat.widget.f.b().g(this.f1694r);
        this.Z = new Configuration(this.f1694r.getResources().getConfiguration());
        U(false);
        configuration.updateFrom(this.f1694r.getResources().getConfiguration());
    }

    @Override // androidx.appcompat.app.e
    public void z(Bundle bundle) {
        this.W = true;
        U(false);
        k0();
        Object obj = this.f1693q;
        if (obj instanceof Activity) {
            String strD = null;
            try {
                strD = c0.d((Activity) obj);
            } catch (IllegalArgumentException unused) {
            }
            if (strD != null) {
                ActionBar actionBarM0 = M0();
                if (actionBarM0 == null) {
                    this.G2 = true;
                } else {
                    actionBarM0.W(true);
                }
            }
            androidx.appcompat.app.e.c(this);
        }
        this.Z = new Configuration(this.f1694r.getResources().getConfiguration());
        this.X = true;
    }
}
