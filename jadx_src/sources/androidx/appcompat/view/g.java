package androidx.appcompat.view;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.annotation.RestrictTo;
import androidx.annotation.i0;
import androidx.appcompat.R;
import androidx.appcompat.view.menu.MenuItemWrapperICS;
import androidx.appcompat.widget.b0;
import androidx.appcompat.widget.x0;
import androidx.core.view.z;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: SupportMenuInflater.java */
/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class g extends MenuInflater {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final String f2008e = "SupportMenuInflater";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f2009f = "menu";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f2010g = "group";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f2011h = "item";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    static final int f2012i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    static final Class<?>[] f2013j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    static final Class<?>[] f2014k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Object[] f2015a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Object[] f2016b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    Context f2017c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Object f2018d;

    /* JADX INFO: compiled from: SupportMenuInflater.java */
    public static class a implements MenuItem.OnMenuItemClickListener {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final Class<?>[] f2019c = {MenuItem.class};

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Object f2020a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Method f2021b;

        public a(Object obj, String str) {
            this.f2020a = obj;
            Class<?> cls = obj.getClass();
            try {
                this.f2021b = cls.getMethod(str, f2019c);
            } catch (Exception e10) {
                InflateException inflateException = new InflateException("Couldn't resolve menu item onClick handler " + str + " in class " + cls.getName());
                inflateException.initCause(e10);
                throw inflateException;
            }
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            try {
                if (this.f2021b.getReturnType() == Boolean.TYPE) {
                    return ((Boolean) this.f2021b.invoke(this.f2020a, menuItem)).booleanValue();
                }
                this.f2021b.invoke(this.f2020a, menuItem);
                return true;
            } catch (Exception e10) {
                throw new RuntimeException(e10);
            }
        }
    }

    /* JADX INFO: compiled from: SupportMenuInflater.java */
    public class b {
        private static final int G = 0;
        private static final int H = 0;
        private static final int I = 0;
        private static final int J = 0;
        private static final int K = 0;
        private static final boolean L = false;
        private static final boolean M = true;
        private static final boolean N = true;
        androidx.core.view.b A;
        private CharSequence B;
        private CharSequence C;
        private ColorStateList D = null;
        private PorterDuff.Mode E = null;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Menu f2022a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f2023b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f2024c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f2025d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f2026e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f2027f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private boolean f2028g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private boolean f2029h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f2030i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private int f2031j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private CharSequence f2032k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private CharSequence f2033l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private int f2034m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private char f2035n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private int f2036o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private char f2037p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private int f2038q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private int f2039r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private boolean f2040s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private boolean f2041t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        private boolean f2042u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        private int f2043v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        private int f2044w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        private String f2045x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        private String f2046y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        private String f2047z;

        public b(Menu menu) {
            this.f2022a = menu;
            h();
        }

        private char c(String str) {
            if (str == null) {
                return (char) 0;
            }
            return str.charAt(0);
        }

        private <T> T e(String str, Class<?>[] clsArr, Object[] objArr) {
            try {
                Constructor<?> constructor = Class.forName(str, false, g.this.f2017c.getClassLoader()).getConstructor(clsArr);
                constructor.setAccessible(true);
                return (T) constructor.newInstance(objArr);
            } catch (Exception e10) {
                Log.w(g.f2008e, "Cannot instantiate class: " + str, e10);
                return null;
            }
        }

        private void i(MenuItem menuItem) {
            boolean z10 = false;
            menuItem.setChecked(this.f2040s).setVisible(this.f2041t).setEnabled(this.f2042u).setCheckable(this.f2039r >= 1).setTitleCondensed(this.f2033l).setIcon(this.f2034m);
            int i10 = this.f2043v;
            if (i10 >= 0) {
                menuItem.setShowAsAction(i10);
            }
            if (this.f2047z != null) {
                if (g.this.f2017c.isRestricted()) {
                    throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
                }
                menuItem.setOnMenuItemClickListener(new a(g.this.b(), this.f2047z));
            }
            if (this.f2039r >= 2) {
                if (menuItem instanceof androidx.appcompat.view.menu.j) {
                    ((androidx.appcompat.view.menu.j) menuItem).w(true);
                } else if (menuItem instanceof MenuItemWrapperICS) {
                    ((MenuItemWrapperICS) menuItem).j(true);
                }
            }
            String str = this.f2045x;
            if (str != null) {
                menuItem.setActionView((View) e(str, g.f2013j, g.this.f2015a));
                z10 = true;
            }
            int i11 = this.f2044w;
            if (i11 > 0) {
                if (z10) {
                    Log.w(g.f2008e, "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
                } else {
                    menuItem.setActionView(i11);
                }
            }
            androidx.core.view.b bVar = this.A;
            if (bVar != null) {
                z.l(menuItem, bVar);
            }
            z.p(menuItem, this.B);
            z.w(menuItem, this.C);
            z.o(menuItem, this.f2035n, this.f2036o);
            z.s(menuItem, this.f2037p, this.f2038q);
            PorterDuff.Mode mode = this.E;
            if (mode != null) {
                z.r(menuItem, mode);
            }
            ColorStateList colorStateList = this.D;
            if (colorStateList != null) {
                z.q(menuItem, colorStateList);
            }
        }

        public void a() {
            this.f2029h = true;
            i(this.f2022a.add(this.f2023b, this.f2030i, this.f2031j, this.f2032k));
        }

        public SubMenu b() {
            this.f2029h = true;
            SubMenu subMenuAddSubMenu = this.f2022a.addSubMenu(this.f2023b, this.f2030i, this.f2031j, this.f2032k);
            i(subMenuAddSubMenu.getItem());
            return subMenuAddSubMenu;
        }

        public boolean d() {
            return this.f2029h;
        }

        public void f(AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = g.this.f2017c.obtainStyledAttributes(attributeSet, R.styleable.f1588u);
            this.f2023b = typedArrayObtainStyledAttributes.getResourceId(R.styleable.MenuGroup_android_id, 0);
            this.f2024c = typedArrayObtainStyledAttributes.getInt(R.styleable.MenuGroup_android_menuCategory, 0);
            this.f2025d = typedArrayObtainStyledAttributes.getInt(R.styleable.MenuGroup_android_orderInCategory, 0);
            this.f2026e = typedArrayObtainStyledAttributes.getInt(R.styleable.MenuGroup_android_checkableBehavior, 0);
            this.f2027f = typedArrayObtainStyledAttributes.getBoolean(R.styleable.MenuGroup_android_visible, true);
            this.f2028g = typedArrayObtainStyledAttributes.getBoolean(R.styleable.MenuGroup_android_enabled, true);
            typedArrayObtainStyledAttributes.recycle();
        }

        public void g(AttributeSet attributeSet) {
            x0 x0VarF = x0.F(g.this.f2017c, attributeSet, R.styleable.f1589v);
            this.f2030i = x0VarF.u(R.styleable.MenuItem_android_id, 0);
            this.f2031j = (x0VarF.o(R.styleable.MenuItem_android_menuCategory, this.f2024c) & y1.a.f141526c) | (x0VarF.o(R.styleable.MenuItem_android_orderInCategory, this.f2025d) & 65535);
            this.f2032k = x0VarF.x(R.styleable.MenuItem_android_title);
            this.f2033l = x0VarF.x(R.styleable.MenuItem_android_titleCondensed);
            this.f2034m = x0VarF.u(R.styleable.MenuItem_android_icon, 0);
            this.f2035n = c(x0VarF.w(R.styleable.MenuItem_android_alphabeticShortcut));
            this.f2036o = x0VarF.o(R.styleable.MenuItem_alphabeticModifiers, 4096);
            this.f2037p = c(x0VarF.w(R.styleable.MenuItem_android_numericShortcut));
            this.f2038q = x0VarF.o(R.styleable.MenuItem_numericModifiers, 4096);
            int i10 = R.styleable.MenuItem_android_checkable;
            if (x0VarF.C(i10)) {
                this.f2039r = x0VarF.a(i10, false) ? 1 : 0;
            } else {
                this.f2039r = this.f2026e;
            }
            this.f2040s = x0VarF.a(R.styleable.MenuItem_android_checked, false);
            this.f2041t = x0VarF.a(R.styleable.MenuItem_android_visible, this.f2027f);
            this.f2042u = x0VarF.a(R.styleable.MenuItem_android_enabled, this.f2028g);
            this.f2043v = x0VarF.o(R.styleable.MenuItem_showAsAction, -1);
            this.f2047z = x0VarF.w(R.styleable.MenuItem_android_onClick);
            this.f2044w = x0VarF.u(R.styleable.MenuItem_actionLayout, 0);
            this.f2045x = x0VarF.w(R.styleable.MenuItem_actionViewClass);
            String strW = x0VarF.w(R.styleable.MenuItem_actionProviderClass);
            this.f2046y = strW;
            boolean z10 = strW != null;
            if (z10 && this.f2044w == 0 && this.f2045x == null) {
                this.A = (androidx.core.view.b) e(strW, g.f2014k, g.this.f2016b);
            } else {
                if (z10) {
                    Log.w(g.f2008e, "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                }
                this.A = null;
            }
            this.B = x0VarF.x(R.styleable.MenuItem_contentDescription);
            this.C = x0VarF.x(R.styleable.MenuItem_tooltipText);
            int i11 = R.styleable.MenuItem_iconTintMode;
            if (x0VarF.C(i11)) {
                this.E = b0.e(x0VarF.o(i11, -1), this.E);
            } else {
                this.E = null;
            }
            int i12 = R.styleable.MenuItem_iconTint;
            if (x0VarF.C(i12)) {
                this.D = x0VarF.d(i12);
            } else {
                this.D = null;
            }
            x0VarF.I();
            this.f2029h = false;
        }

        public void h() {
            this.f2023b = 0;
            this.f2024c = 0;
            this.f2025d = 0;
            this.f2026e = 0;
            this.f2027f = true;
            this.f2028g = true;
        }
    }

    static {
        Class<?>[] clsArr = {Context.class};
        f2013j = clsArr;
        f2014k = clsArr;
    }

    public g(Context context) {
        super(context);
        this.f2017c = context;
        Object[] objArr = {context};
        this.f2015a = objArr;
        this.f2016b = objArr;
    }

    private Object a(Object obj) {
        return (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) ? a(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    private void c(XmlPullParser xmlPullParser, AttributeSet attributeSet, Menu menu) throws XmlPullParserException, IOException {
        b bVar = new b(menu);
        int eventType = xmlPullParser.getEventType();
        do {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if (name.equals("menu")) {
                    eventType = xmlPullParser.next();
                    break;
                }
                throw new RuntimeException("Expecting menu, got " + name);
            }
            eventType = xmlPullParser.next();
        } while (eventType != 1);
        String str = null;
        boolean z10 = false;
        boolean z11 = false;
        while (!z10) {
            if (eventType == 1) {
                throw new RuntimeException("Unexpected end of document");
            }
            if (eventType != 2) {
                if (eventType == 3) {
                    String name2 = xmlPullParser.getName();
                    if (z11 && name2.equals(str)) {
                        str = null;
                        z11 = false;
                    } else if (name2.equals("group")) {
                        bVar.h();
                    } else if (name2.equals("item")) {
                        if (!bVar.d()) {
                            androidx.core.view.b bVar2 = bVar.A;
                            if (bVar2 == null || !bVar2.b()) {
                                bVar.a();
                            } else {
                                bVar.b();
                            }
                        }
                    } else if (name2.equals("menu")) {
                        z10 = true;
                    }
                }
            } else if (!z11) {
                String name3 = xmlPullParser.getName();
                if (name3.equals("group")) {
                    bVar.f(attributeSet);
                } else if (name3.equals("item")) {
                    bVar.g(attributeSet);
                } else if (name3.equals("menu")) {
                    c(xmlPullParser, attributeSet, bVar.b());
                } else {
                    str = name3;
                    z11 = true;
                }
            }
            eventType = xmlPullParser.next();
        }
    }

    Object b() {
        if (this.f2018d == null) {
            this.f2018d = a(this.f2017c);
        }
        return this.f2018d;
    }

    @Override // android.view.MenuInflater
    public void inflate(@i0 int i10, Menu menu) {
        if (!(menu instanceof y1.a)) {
            super.inflate(i10, menu);
            return;
        }
        XmlResourceParser layout = null;
        try {
            try {
                try {
                    layout = this.f2017c.getResources().getLayout(i10);
                    c(layout, Xml.asAttributeSet(layout), menu);
                    if (layout != null) {
                        layout.close();
                    }
                } catch (XmlPullParserException e10) {
                    throw new InflateException("Error inflating menu XML", e10);
                }
            } catch (IOException e11) {
                throw new InflateException("Error inflating menu XML", e11);
            }
        } catch (Throwable th2) {
            if (layout != null) {
                layout.close();
            }
            throw th2;
        }
    }
}
