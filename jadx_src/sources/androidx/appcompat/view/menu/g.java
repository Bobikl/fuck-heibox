package androidx.appcompat.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.annotation.RestrictTo;
import androidx.annotation.n0;
import androidx.core.view.v2;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: MenuBuilder.java */
/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class g implements y1.a {
    private static final String L = "MenuBuilder";
    private static final String M = "android:menu:presenters";
    private static final String N = "android:menu:actionviewstates";
    private static final String O = "android:menu:expandedactionview";
    private static final int[] P = {1, 4, 5, 3, 2, 0};
    View A;
    private j I;
    private boolean K;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final Context f2187l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Resources f2188m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f2189n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f2190o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private a f2191p;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private ContextMenu.ContextMenuInfo f2199x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    CharSequence f2200y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    Drawable f2201z;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f2198w = 0;
    private boolean B = false;
    private boolean C = false;
    private boolean D = false;
    private boolean E = false;
    private boolean F = false;
    private ArrayList<j> G = new ArrayList<>();
    private CopyOnWriteArrayList<WeakReference<m>> H = new CopyOnWriteArrayList<>();
    private boolean J = false;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private ArrayList<j> f2192q = new ArrayList<>();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private ArrayList<j> f2193r = new ArrayList<>();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f2194s = true;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private ArrayList<j> f2195t = new ArrayList<>();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private ArrayList<j> f2196u = new ArrayList<>();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f2197v = true;

    /* JADX INFO: compiled from: MenuBuilder.java */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public interface a {
        boolean a(@n0 g gVar, @n0 MenuItem menuItem);

        void b(@n0 g gVar);
    }

    /* JADX INFO: compiled from: MenuBuilder.java */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public interface b {
        boolean b(j jVar);
    }

    public g(Context context) {
        this.f2187l = context;
        this.f2188m = context.getResources();
        k0(true);
    }

    private static int E(int i10) {
        int i11 = ((-65536) & i10) >> 16;
        if (i11 >= 0) {
            int[] iArr = P;
            if (i11 < iArr.length) {
                return (i10 & 65535) | (iArr[i11] << 16);
            }
        }
        throw new IllegalArgumentException("order does not contain a valid category.");
    }

    private void R(int i10, boolean z10) {
        if (i10 < 0 || i10 >= this.f2192q.size()) {
            return;
        }
        this.f2192q.remove(i10);
        if (z10) {
            N(true);
        }
    }

    private void d0(int i10, CharSequence charSequence, int i11, Drawable drawable, View view) {
        Resources resourcesF = F();
        if (view != null) {
            this.A = view;
            this.f2200y = null;
            this.f2201z = null;
        } else {
            if (i10 > 0) {
                this.f2200y = resourcesF.getText(i10);
            } else if (charSequence != null) {
                this.f2200y = charSequence;
            }
            if (i11 > 0) {
                this.f2201z = androidx.core.content.d.i(x(), i11);
            } else if (drawable != null) {
                this.f2201z = drawable;
            }
            this.A = null;
        }
        N(false);
    }

    private j h(int i10, int i11, int i12, int i13, CharSequence charSequence, int i14) {
        return new j(this, i10, i11, i12, i13, charSequence, i14);
    }

    private void j(boolean z10) {
        if (this.H.isEmpty()) {
            return;
        }
        m0();
        for (WeakReference<m> weakReference : this.H) {
            m mVar = weakReference.get();
            if (mVar == null) {
                this.H.remove(weakReference);
            } else {
                mVar.e(z10);
            }
        }
        l0();
    }

    private void k(Bundle bundle) {
        Parcelable parcelable;
        SparseArray sparseParcelableArray = bundle.getSparseParcelableArray(M);
        if (sparseParcelableArray == null || this.H.isEmpty()) {
            return;
        }
        for (WeakReference<m> weakReference : this.H) {
            m mVar = weakReference.get();
            if (mVar == null) {
                this.H.remove(weakReference);
            } else {
                int id2 = mVar.getId();
                if (id2 > 0 && (parcelable = (Parcelable) sparseParcelableArray.get(id2)) != null) {
                    mVar.k(parcelable);
                }
            }
        }
    }

    private void k0(boolean z10) {
        this.f2190o = z10 && this.f2188m.getConfiguration().keyboard != 1 && v2.g(ViewConfiguration.get(this.f2187l), this.f2187l);
    }

    private void l(Bundle bundle) {
        Parcelable parcelableD;
        if (this.H.isEmpty()) {
            return;
        }
        SparseArray<? extends Parcelable> sparseArray = new SparseArray<>();
        for (WeakReference<m> weakReference : this.H) {
            m mVar = weakReference.get();
            if (mVar == null) {
                this.H.remove(weakReference);
            } else {
                int id2 = mVar.getId();
                if (id2 > 0 && (parcelableD = mVar.d()) != null) {
                    sparseArray.put(id2, parcelableD);
                }
            }
        }
        bundle.putSparseParcelableArray(M, sparseArray);
    }

    private boolean m(r rVar, m mVar) {
        if (this.H.isEmpty()) {
            return false;
        }
        boolean zL = mVar != null ? mVar.l(rVar) : false;
        for (WeakReference<m> weakReference : this.H) {
            m mVar2 = weakReference.get();
            if (mVar2 == null) {
                this.H.remove(weakReference);
            } else if (!zL) {
                zL = mVar2.l(rVar);
            }
        }
        return zL;
    }

    private static int q(ArrayList<j> arrayList, int i10) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size).i() <= i10) {
                return size + 1;
            }
        }
        return 0;
    }

    public CharSequence A() {
        return this.f2200y;
    }

    public View B() {
        return this.A;
    }

    public ArrayList<j> C() {
        u();
        return this.f2196u;
    }

    boolean D() {
        return this.E;
    }

    Resources F() {
        return this.f2188m;
    }

    public g G() {
        return this;
    }

    @n0
    public ArrayList<j> H() {
        if (!this.f2194s) {
            return this.f2193r;
        }
        this.f2193r.clear();
        int size = this.f2192q.size();
        for (int i10 = 0; i10 < size; i10++) {
            j jVar = this.f2192q.get(i10);
            if (jVar.isVisible()) {
                this.f2193r.add(jVar);
            }
        }
        this.f2194s = false;
        this.f2197v = true;
        return this.f2193r;
    }

    public boolean I() {
        return this.J;
    }

    boolean J() {
        return this.f2189n;
    }

    public boolean K() {
        return this.f2190o;
    }

    void L(j jVar) {
        this.f2197v = true;
        N(true);
    }

    void M(j jVar) {
        this.f2194s = true;
        N(true);
    }

    public void N(boolean z10) {
        if (this.B) {
            this.C = true;
            if (z10) {
                this.D = true;
                return;
            }
            return;
        }
        if (z10) {
            this.f2194s = true;
            this.f2197v = true;
        }
        j(z10);
    }

    public boolean O(MenuItem menuItem, int i10) {
        return P(menuItem, null, i10);
    }

    public boolean P(MenuItem menuItem, m mVar, int i10) {
        j jVar = (j) menuItem;
        if (jVar == null || !jVar.isEnabled()) {
            return false;
        }
        boolean zN = jVar.n();
        androidx.core.view.b bVarA = jVar.a();
        boolean z10 = bVarA != null && bVarA.b();
        if (jVar.m()) {
            zN |= jVar.expandActionView();
            if (zN) {
                f(true);
            }
        } else if (jVar.hasSubMenu() || z10) {
            if ((i10 & 4) == 0) {
                f(false);
            }
            if (!jVar.hasSubMenu()) {
                jVar.A(new r(x(), this, jVar));
            }
            r rVar = (r) jVar.getSubMenu();
            if (z10) {
                bVarA.g(rVar);
            }
            zN |= m(rVar, mVar);
            if (!zN) {
                f(true);
            }
        } else if ((i10 & 1) == 0) {
            f(true);
        }
        return zN;
    }

    public void Q(int i10) {
        R(i10, true);
    }

    public void S(m mVar) {
        for (WeakReference<m> weakReference : this.H) {
            m mVar2 = weakReference.get();
            if (mVar2 == null || mVar2 == mVar) {
                this.H.remove(weakReference);
            }
        }
    }

    public void T(Bundle bundle) {
        MenuItem menuItemFindItem;
        if (bundle == null) {
            return;
        }
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(w());
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            MenuItem item = getItem(i10);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                ((r) item.getSubMenu()).T(bundle);
            }
        }
        int i11 = bundle.getInt(O);
        if (i11 <= 0 || (menuItemFindItem = findItem(i11)) == null) {
            return;
        }
        menuItemFindItem.expandActionView();
    }

    public void U(Bundle bundle) {
        k(bundle);
    }

    public void V(Bundle bundle) {
        int size = size();
        SparseArray<? extends Parcelable> sparseArray = null;
        for (int i10 = 0; i10 < size; i10++) {
            MenuItem item = getItem(i10);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt(O, item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((r) item.getSubMenu()).V(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(w(), sparseArray);
        }
    }

    public void W(Bundle bundle) {
        l(bundle);
    }

    public void X(a aVar) {
        this.f2191p = aVar;
    }

    public void Y(ContextMenu.ContextMenuInfo contextMenuInfo) {
        this.f2199x = contextMenuInfo;
    }

    public g Z(int i10) {
        this.f2198w = i10;
        return this;
    }

    protected MenuItem a(int i10, int i11, int i12, CharSequence charSequence) {
        int iE = E(i12);
        j jVarH = h(i10, i11, i12, iE, charSequence, this.f2198w);
        ContextMenu.ContextMenuInfo contextMenuInfo = this.f2199x;
        if (contextMenuInfo != null) {
            jVarH.y(contextMenuInfo);
        }
        ArrayList<j> arrayList = this.f2192q;
        arrayList.add(q(arrayList, iE), jVarH);
        N(true);
        return jVarH;
    }

    void a0(MenuItem menuItem) {
        int groupId = menuItem.getGroupId();
        int size = this.f2192q.size();
        m0();
        for (int i10 = 0; i10 < size; i10++) {
            j jVar = this.f2192q.get(i10);
            if (jVar.getGroupId() == groupId && jVar.p() && jVar.isCheckable()) {
                jVar.v(jVar == menuItem);
            }
        }
        l0();
    }

    @Override // android.view.Menu
    public MenuItem add(int i10) {
        return a(0, 0, 0, this.f2188m.getString(i10));
    }

    @Override // android.view.Menu
    public MenuItem add(int i10, int i11, int i12, int i13) {
        return a(i10, i11, i12, this.f2188m.getString(i13));
    }

    @Override // android.view.Menu
    public MenuItem add(int i10, int i11, int i12, CharSequence charSequence) {
        return a(i10, i11, i12, charSequence);
    }

    @Override // android.view.Menu
    public MenuItem add(CharSequence charSequence) {
        return a(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public int addIntentOptions(int i10, int i11, int i12, ComponentName componentName, Intent[] intentArr, Intent intent, int i13, MenuItem[] menuItemArr) {
        int i14;
        PackageManager packageManager = this.f2187l.getPackageManager();
        List<ResolveInfo> listQueryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = listQueryIntentActivityOptions != null ? listQueryIntentActivityOptions.size() : 0;
        if ((i13 & 1) == 0) {
            removeGroup(i10);
        }
        for (int i15 = 0; i15 < size; i15++) {
            ResolveInfo resolveInfo = listQueryIntentActivityOptions.get(i15);
            int i16 = resolveInfo.specificIndex;
            Intent intent2 = new Intent(i16 < 0 ? intent : intentArr[i16]);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            MenuItem intent3 = add(i10, i11, i12, resolveInfo.loadLabel(packageManager)).setIcon(resolveInfo.loadIcon(packageManager)).setIntent(intent2);
            if (menuItemArr != null && (i14 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i14] = intent3;
            }
        }
        return size;
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i10) {
        return addSubMenu(0, 0, 0, this.f2188m.getString(i10));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i10, int i11, int i12, int i13) {
        return addSubMenu(i10, i11, i12, this.f2188m.getString(i13));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i10, int i11, int i12, CharSequence charSequence) {
        j jVar = (j) a(i10, i11, i12, charSequence);
        r rVar = new r(this.f2187l, this, jVar);
        jVar.A(rVar);
        return rVar;
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    public void b(m mVar) {
        c(mVar, this.f2187l);
    }

    protected g b0(int i10) {
        d0(0, null, i10, null, null);
        return this;
    }

    public void c(m mVar, Context context) {
        this.H.add(new WeakReference<>(mVar));
        mVar.h(context, this);
        this.f2197v = true;
    }

    protected g c0(Drawable drawable) {
        d0(0, null, 0, drawable, null);
        return this;
    }

    @Override // android.view.Menu
    public void clear() {
        j jVar = this.I;
        if (jVar != null) {
            g(jVar);
        }
        this.f2192q.clear();
        N(true);
    }

    public void clearHeader() {
        this.f2201z = null;
        this.f2200y = null;
        this.A = null;
        N(false);
    }

    @Override // android.view.Menu
    public void close() {
        f(true);
    }

    public void d() {
        a aVar = this.f2191p;
        if (aVar != null) {
            aVar.b(this);
        }
    }

    public void e() {
        this.B = true;
        clear();
        clearHeader();
        this.H.clear();
        this.B = false;
        this.C = false;
        this.D = false;
        N(true);
    }

    protected g e0(int i10) {
        d0(i10, null, 0, null, null);
        return this;
    }

    public final void f(boolean z10) {
        if (this.F) {
            return;
        }
        this.F = true;
        for (WeakReference<m> weakReference : this.H) {
            m mVar = weakReference.get();
            if (mVar == null) {
                this.H.remove(weakReference);
            } else {
                mVar.a(this, z10);
            }
        }
        this.F = false;
    }

    protected g f0(CharSequence charSequence) {
        d0(0, charSequence, 0, null, null);
        return this;
    }

    @Override // android.view.Menu
    public MenuItem findItem(int i10) {
        MenuItem menuItemFindItem;
        int size = size();
        for (int i11 = 0; i11 < size; i11++) {
            j jVar = this.f2192q.get(i11);
            if (jVar.getItemId() == i10) {
                return jVar;
            }
            if (jVar.hasSubMenu() && (menuItemFindItem = jVar.getSubMenu().findItem(i10)) != null) {
                return menuItemFindItem;
            }
        }
        return null;
    }

    public boolean g(j jVar) {
        boolean zG = false;
        if (!this.H.isEmpty() && this.I == jVar) {
            m0();
            for (WeakReference<m> weakReference : this.H) {
                m mVar = weakReference.get();
                if (mVar != null) {
                    zG = mVar.g(this, jVar);
                    if (zG) {
                        break;
                    }
                } else {
                    this.H.remove(weakReference);
                }
            }
            l0();
            if (zG) {
                this.I = null;
            }
        }
        return zG;
    }

    protected g g0(View view) {
        d0(0, null, 0, null, view);
        return this;
    }

    @Override // android.view.Menu
    public MenuItem getItem(int i10) {
        return this.f2192q.get(i10);
    }

    public void h0(boolean z10) {
        this.E = z10;
    }

    @Override // android.view.Menu
    public boolean hasVisibleItems() {
        if (this.K) {
            return true;
        }
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.f2192q.get(i10).isVisible()) {
                return true;
            }
        }
        return false;
    }

    boolean i(@n0 g gVar, @n0 MenuItem menuItem) {
        a aVar = this.f2191p;
        return aVar != null && aVar.a(gVar, menuItem);
    }

    public void i0(boolean z10) {
        this.K = z10;
    }

    @Override // android.view.Menu
    public boolean isShortcutKey(int i10, KeyEvent keyEvent) {
        return s(i10, keyEvent) != null;
    }

    public void j0(boolean z10) {
        if (this.f2190o == z10) {
            return;
        }
        k0(z10);
        N(false);
    }

    public void l0() {
        this.B = false;
        if (this.C) {
            this.C = false;
            N(this.D);
        }
    }

    public void m0() {
        if (this.B) {
            return;
        }
        this.B = true;
        this.C = false;
        this.D = false;
    }

    public boolean n(j jVar) {
        boolean zC = false;
        if (this.H.isEmpty()) {
            return false;
        }
        m0();
        for (WeakReference<m> weakReference : this.H) {
            m mVar = weakReference.get();
            if (mVar != null) {
                zC = mVar.c(this, jVar);
                if (zC) {
                    break;
                }
            } else {
                this.H.remove(weakReference);
            }
        }
        l0();
        if (zC) {
            this.I = jVar;
        }
        return zC;
    }

    public int o(int i10) {
        return p(i10, 0);
    }

    public int p(int i10, int i11) {
        int size = size();
        if (i11 < 0) {
            i11 = 0;
        }
        while (i11 < size) {
            if (this.f2192q.get(i11).getGroupId() == i10) {
                return i11;
            }
            i11++;
        }
        return -1;
    }

    @Override // android.view.Menu
    public boolean performIdentifierAction(int i10, int i11) {
        return O(findItem(i10), i11);
    }

    @Override // android.view.Menu
    public boolean performShortcut(int i10, KeyEvent keyEvent, int i11) {
        j jVarS = s(i10, keyEvent);
        boolean zO = jVarS != null ? O(jVarS, i11) : false;
        if ((i11 & 2) != 0) {
            f(true);
        }
        return zO;
    }

    public int r(int i10) {
        int size = size();
        for (int i11 = 0; i11 < size; i11++) {
            if (this.f2192q.get(i11).getItemId() == i10) {
                return i11;
            }
        }
        return -1;
    }

    @Override // android.view.Menu
    public void removeGroup(int i10) {
        int iO = o(i10);
        if (iO >= 0) {
            int size = this.f2192q.size() - iO;
            int i11 = 0;
            while (true) {
                int i12 = i11 + 1;
                if (i11 >= size || this.f2192q.get(iO).getGroupId() != i10) {
                    break;
                }
                R(iO, false);
                i11 = i12;
            }
            N(true);
        }
    }

    @Override // android.view.Menu
    public void removeItem(int i10) {
        R(r(i10), true);
    }

    j s(int i10, KeyEvent keyEvent) {
        ArrayList<j> arrayList = this.G;
        arrayList.clear();
        t(arrayList, i10, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return arrayList.get(0);
        }
        boolean zJ = J();
        for (int i11 = 0; i11 < size; i11++) {
            j jVar = arrayList.get(i11);
            char alphabeticShortcut = zJ ? jVar.getAlphabeticShortcut() : jVar.getNumericShortcut();
            char[] cArr = keyData.meta;
            if ((alphabeticShortcut == cArr[0] && (metaState & 2) == 0) || ((alphabeticShortcut == cArr[2] && (metaState & 2) != 0) || (zJ && alphabeticShortcut == '\b' && i10 == 67))) {
                return jVar;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public void setGroupCheckable(int i10, boolean z10, boolean z11) {
        int size = this.f2192q.size();
        for (int i11 = 0; i11 < size; i11++) {
            j jVar = this.f2192q.get(i11);
            if (jVar.getGroupId() == i10) {
                jVar.w(z11);
                jVar.setCheckable(z10);
            }
        }
    }

    @Override // y1.a, android.view.Menu
    public void setGroupDividerEnabled(boolean z10) {
        this.J = z10;
    }

    @Override // android.view.Menu
    public void setGroupEnabled(int i10, boolean z10) {
        int size = this.f2192q.size();
        for (int i11 = 0; i11 < size; i11++) {
            j jVar = this.f2192q.get(i11);
            if (jVar.getGroupId() == i10) {
                jVar.setEnabled(z10);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupVisible(int i10, boolean z10) {
        int size = this.f2192q.size();
        boolean z11 = false;
        for (int i11 = 0; i11 < size; i11++) {
            j jVar = this.f2192q.get(i11);
            if (jVar.getGroupId() == i10 && jVar.B(z10)) {
                z11 = true;
            }
        }
        if (z11) {
            N(true);
        }
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z10) {
        this.f2189n = z10;
        N(false);
    }

    @Override // android.view.Menu
    public int size() {
        return this.f2192q.size();
    }

    void t(List<j> list, int i10, KeyEvent keyEvent) {
        boolean zJ = J();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i10 == 67) {
            int size = this.f2192q.size();
            for (int i11 = 0; i11 < size; i11++) {
                j jVar = this.f2192q.get(i11);
                if (jVar.hasSubMenu()) {
                    ((g) jVar.getSubMenu()).t(list, i10, keyEvent);
                }
                char alphabeticShortcut = zJ ? jVar.getAlphabeticShortcut() : jVar.getNumericShortcut();
                if (((modifiers & y1.a.f141528e) == ((zJ ? jVar.getAlphabeticModifiers() : jVar.getNumericModifiers()) & y1.a.f141528e)) && alphabeticShortcut != 0) {
                    char[] cArr = keyData.meta;
                    if ((alphabeticShortcut == cArr[0] || alphabeticShortcut == cArr[2] || (zJ && alphabeticShortcut == '\b' && i10 == 67)) && jVar.isEnabled()) {
                        list.add(jVar);
                    }
                }
            }
        }
    }

    public void u() {
        ArrayList<j> arrayListH = H();
        if (this.f2197v) {
            boolean zF = false;
            for (WeakReference<m> weakReference : this.H) {
                m mVar = weakReference.get();
                if (mVar == null) {
                    this.H.remove(weakReference);
                } else {
                    zF |= mVar.f();
                }
            }
            if (zF) {
                this.f2195t.clear();
                this.f2196u.clear();
                int size = arrayListH.size();
                for (int i10 = 0; i10 < size; i10++) {
                    j jVar = arrayListH.get(i10);
                    if (jVar.o()) {
                        this.f2195t.add(jVar);
                    } else {
                        this.f2196u.add(jVar);
                    }
                }
            } else {
                this.f2195t.clear();
                this.f2196u.clear();
                this.f2196u.addAll(H());
            }
            this.f2197v = false;
        }
    }

    public ArrayList<j> v() {
        u();
        return this.f2195t;
    }

    protected String w() {
        return N;
    }

    public Context x() {
        return this.f2187l;
    }

    public j y() {
        return this.I;
    }

    public Drawable z() {
        return this.f2201z;
    }
}
