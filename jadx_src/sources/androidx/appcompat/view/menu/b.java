package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.RestrictTo;
import java.util.ArrayList;

/* JADX INFO: compiled from: BaseMenuPresenter.java */
/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public abstract class b implements m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected Context f2120b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected Context f2121c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected g f2122d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected LayoutInflater f2123e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected LayoutInflater f2124f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private m.a f2125g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f2126h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f2127i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected n f2128j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f2129k;

    public b(Context context, int i10, int i11) {
        this.f2120b = context;
        this.f2123e = LayoutInflater.from(context);
        this.f2126h = i10;
        this.f2127i = i11;
    }

    @Override // androidx.appcompat.view.menu.m
    public void a(g gVar, boolean z10) {
        m.a aVar = this.f2125g;
        if (aVar != null) {
            aVar.a(gVar, z10);
        }
    }

    @Override // androidx.appcompat.view.menu.m
    public boolean c(g gVar, j jVar) {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.appcompat.view.menu.m
    public void e(boolean z10) {
        ViewGroup viewGroup = (ViewGroup) this.f2128j;
        if (viewGroup == null) {
            return;
        }
        g gVar = this.f2122d;
        int i10 = 0;
        if (gVar != null) {
            gVar.u();
            ArrayList<j> arrayListH = this.f2122d.H();
            int size = arrayListH.size();
            int i11 = 0;
            for (int i12 = 0; i12 < size; i12++) {
                j jVar = arrayListH.get(i12);
                if (t(i11, jVar)) {
                    View childAt = viewGroup.getChildAt(i11);
                    j itemData = childAt instanceof n.a ? ((n.a) childAt).getItemData() : null;
                    View viewR = r(jVar, childAt, viewGroup);
                    if (jVar != itemData) {
                        viewR.setPressed(false);
                        viewR.jumpDrawablesToCurrentState();
                    }
                    if (viewR != childAt) {
                        j(viewR, i11);
                    }
                    i11++;
                }
            }
            i10 = i11;
        }
        while (i10 < viewGroup.getChildCount()) {
            if (!p(viewGroup, i10)) {
                i10++;
            }
        }
    }

    @Override // androidx.appcompat.view.menu.m
    public boolean f() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.m
    public boolean g(g gVar, j jVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.m
    public int getId() {
        return this.f2129k;
    }

    @Override // androidx.appcompat.view.menu.m
    public void h(Context context, g gVar) {
        this.f2121c = context;
        this.f2124f = LayoutInflater.from(context);
        this.f2122d = gVar;
    }

    @Override // androidx.appcompat.view.menu.m
    public void i(m.a aVar) {
        this.f2125g = aVar;
    }

    protected void j(View view, int i10) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(view);
        }
        ((ViewGroup) this.f2128j).addView(view, i10);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // androidx.appcompat.view.menu.m
    public boolean l(r rVar) {
        m.a aVar = this.f2125g;
        g gVar = rVar;
        if (aVar == null) {
            return false;
        }
        if (rVar == null) {
            gVar = this.f2122d;
        }
        return aVar.b(gVar);
    }

    @Override // androidx.appcompat.view.menu.m
    public n m(ViewGroup viewGroup) {
        if (this.f2128j == null) {
            n nVar = (n) this.f2123e.inflate(this.f2126h, viewGroup, false);
            this.f2128j = nVar;
            nVar.a(this.f2122d);
            e(true);
        }
        return this.f2128j;
    }

    public abstract void n(j jVar, n.a aVar);

    public n.a o(ViewGroup viewGroup) {
        return (n.a) this.f2123e.inflate(this.f2127i, viewGroup, false);
    }

    protected boolean p(ViewGroup viewGroup, int i10) {
        viewGroup.removeViewAt(i10);
        return true;
    }

    public m.a q() {
        return this.f2125g;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View r(j jVar, View view, ViewGroup viewGroup) {
        n.a aVarO = view instanceof n.a ? (n.a) view : o(viewGroup);
        n(jVar, aVarO);
        return (View) aVarO;
    }

    public void s(int i10) {
        this.f2129k = i10;
    }

    public boolean t(int i10, j jVar) {
        return true;
    }
}
