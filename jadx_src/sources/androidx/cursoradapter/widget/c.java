package androidx.cursoradapter.widget;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: compiled from: ResourceCursorAdapter.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class c extends a {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f21974m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f21975n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private LayoutInflater f21976o;

    @Deprecated
    public c(Context context, int i10, Cursor cursor) {
        super(context, cursor);
        this.f21975n = i10;
        this.f21974m = i10;
        this.f21976o = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    public c(Context context, int i10, Cursor cursor, int i11) {
        super(context, cursor, i11);
        this.f21975n = i10;
        this.f21974m = i10;
        this.f21976o = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    @Deprecated
    public c(Context context, int i10, Cursor cursor, boolean z10) {
        super(context, cursor, z10);
        this.f21975n = i10;
        this.f21974m = i10;
        this.f21976o = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    @Override // androidx.cursoradapter.widget.a
    public View h(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f21976o.inflate(this.f21975n, viewGroup, false);
    }

    @Override // androidx.cursoradapter.widget.a
    public View i(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f21976o.inflate(this.f21974m, viewGroup, false);
    }

    public void m(int i10) {
        this.f21975n = i10;
    }

    public void n(int i10) {
        this.f21974m = i10;
    }
}
