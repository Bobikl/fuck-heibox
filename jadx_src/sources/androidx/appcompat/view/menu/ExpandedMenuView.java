package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import androidx.annotation.RestrictTo;
import androidx.appcompat.widget.x0;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public final class ExpandedMenuView extends ListView implements g.b, n, AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int[] f2072d = {R.attr.background, R.attr.divider};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private g f2073b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f2074c;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.listViewStyle);
    }

    public ExpandedMenuView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        x0 x0VarG = x0.G(context, attributeSet, f2072d, i10, 0);
        if (x0VarG.C(0)) {
            setBackgroundDrawable(x0VarG.h(0));
        }
        if (x0VarG.C(1)) {
            setDivider(x0VarG.h(1));
        }
        x0VarG.I();
    }

    @Override // androidx.appcompat.view.menu.n
    public void a(g gVar) {
        this.f2073b = gVar;
    }

    @Override // androidx.appcompat.view.menu.g.b
    public boolean b(j jVar) {
        return this.f2073b.O(jVar, 0);
    }

    @Override // androidx.appcompat.view.menu.n
    public int getWindowAnimations() {
        return this.f2074c;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView adapterView, View view, int i10, long j10) {
        b((j) getAdapter().getItem(i10));
    }
}
