package androidx.cursoradapter.widget;

import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.FilterQueryProvider;
import android.widget.Filterable;
import androidx.annotation.RestrictTo;
import com.umeng.analytics.pro.ao;

/* JADX INFO: compiled from: CursorAdapter.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class a extends BaseAdapter implements Filterable, androidx.cursoradapter.widget.b.a {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Deprecated
    public static final int f21960k = 1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f21961l = 2;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    protected boolean f21962b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    protected boolean f21963c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    protected Cursor f21964d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    protected Context f21965e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    protected int f21966f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    protected C0153a f21967g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    protected DataSetObserver f21968h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    protected androidx.cursoradapter.widget.b f21969i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    protected FilterQueryProvider f21970j;

    /* JADX INFO: renamed from: androidx.cursoradapter.widget.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: CursorAdapter.java */
    public class C0153a extends ContentObserver {
        C0153a() {
            super(new Handler());
        }

        @Override // android.database.ContentObserver
        public boolean deliverSelfNotifications() {
            return true;
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z10) {
            a.this.j();
        }
    }

    /* JADX INFO: compiled from: CursorAdapter.java */
    public class b extends DataSetObserver {
        b() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            a aVar = a.this;
            aVar.f21962b = true;
            aVar.notifyDataSetChanged();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            a aVar = a.this;
            aVar.f21962b = false;
            aVar.notifyDataSetInvalidated();
        }
    }

    @Deprecated
    public a(Context context, Cursor cursor) {
        f(context, cursor, 1);
    }

    public a(Context context, Cursor cursor, int i10) {
        f(context, cursor, i10);
    }

    public a(Context context, Cursor cursor, boolean z10) {
        f(context, cursor, z10 ? 1 : 2);
    }

    public void a(Cursor cursor) {
        Cursor cursorL = l(cursor);
        if (cursorL != null) {
            cursorL.close();
        }
    }

    @Override // androidx.cursoradapter.widget.b.a
    public Cursor b() {
        return this.f21964d;
    }

    public Cursor c(CharSequence charSequence) {
        FilterQueryProvider filterQueryProvider = this.f21970j;
        return filterQueryProvider != null ? filterQueryProvider.runQuery(charSequence) : this.f21964d;
    }

    public CharSequence convertToString(Cursor cursor) {
        return cursor == null ? "" : cursor.toString();
    }

    public abstract void d(View view, Context context, Cursor cursor);

    public FilterQueryProvider e() {
        return this.f21970j;
    }

    void f(Context context, Cursor cursor, int i10) {
        if ((i10 & 1) == 1) {
            i10 |= 2;
            this.f21963c = true;
        } else {
            this.f21963c = false;
        }
        boolean z10 = cursor != null;
        this.f21964d = cursor;
        this.f21962b = z10;
        this.f21965e = context;
        this.f21966f = z10 ? cursor.getColumnIndexOrThrow(ao.f104522d) : -1;
        if ((i10 & 2) == 2) {
            this.f21967g = new C0153a();
            this.f21968h = new b();
        } else {
            this.f21967g = null;
            this.f21968h = null;
        }
        if (z10) {
            C0153a c0153a = this.f21967g;
            if (c0153a != null) {
                cursor.registerContentObserver(c0153a);
            }
            DataSetObserver dataSetObserver = this.f21968h;
            if (dataSetObserver != null) {
                cursor.registerDataSetObserver(dataSetObserver);
            }
        }
    }

    @Deprecated
    protected void g(Context context, Cursor cursor, boolean z10) {
        f(context, cursor, z10 ? 1 : 2);
    }

    @Override // android.widget.Adapter
    public int getCount() {
        Cursor cursor;
        if (!this.f21962b || (cursor = this.f21964d) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i10, View view, ViewGroup viewGroup) {
        if (!this.f21962b) {
            return null;
        }
        this.f21964d.moveToPosition(i10);
        if (view == null) {
            view = h(this.f21965e, this.f21964d, viewGroup);
        }
        d(view, this.f21965e, this.f21964d);
        return view;
    }

    @Override // android.widget.Filterable
    public Filter getFilter() {
        if (this.f21969i == null) {
            this.f21969i = new androidx.cursoradapter.widget.b(this);
        }
        return this.f21969i;
    }

    @Override // android.widget.Adapter
    public Object getItem(int i10) {
        Cursor cursor;
        if (!this.f21962b || (cursor = this.f21964d) == null) {
            return null;
        }
        cursor.moveToPosition(i10);
        return this.f21964d;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i10) {
        Cursor cursor;
        if (this.f21962b && (cursor = this.f21964d) != null && cursor.moveToPosition(i10)) {
            return this.f21964d.getLong(this.f21966f);
        }
        return 0L;
    }

    @Override // android.widget.Adapter
    public View getView(int i10, View view, ViewGroup viewGroup) {
        if (!this.f21962b) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        }
        if (this.f21964d.moveToPosition(i10)) {
            if (view == null) {
                view = i(this.f21965e, this.f21964d, viewGroup);
            }
            d(view, this.f21965e, this.f21964d);
            return view;
        }
        throw new IllegalStateException("couldn't move cursor to position " + i10);
    }

    public View h(Context context, Cursor cursor, ViewGroup viewGroup) {
        return i(context, cursor, viewGroup);
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return true;
    }

    public abstract View i(Context context, Cursor cursor, ViewGroup viewGroup);

    protected void j() {
        Cursor cursor;
        if (!this.f21963c || (cursor = this.f21964d) == null || cursor.isClosed()) {
            return;
        }
        this.f21962b = this.f21964d.requery();
    }

    public void k(FilterQueryProvider filterQueryProvider) {
        this.f21970j = filterQueryProvider;
    }

    public Cursor l(Cursor cursor) {
        Cursor cursor2 = this.f21964d;
        if (cursor == cursor2) {
            return null;
        }
        if (cursor2 != null) {
            C0153a c0153a = this.f21967g;
            if (c0153a != null) {
                cursor2.unregisterContentObserver(c0153a);
            }
            DataSetObserver dataSetObserver = this.f21968h;
            if (dataSetObserver != null) {
                cursor2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f21964d = cursor;
        if (cursor != null) {
            C0153a c0153a2 = this.f21967g;
            if (c0153a2 != null) {
                cursor.registerContentObserver(c0153a2);
            }
            DataSetObserver dataSetObserver2 = this.f21968h;
            if (dataSetObserver2 != null) {
                cursor.registerDataSetObserver(dataSetObserver2);
            }
            this.f21966f = cursor.getColumnIndexOrThrow(ao.f104522d);
            this.f21962b = true;
            notifyDataSetChanged();
        } else {
            this.f21966f = -1;
            this.f21962b = false;
            notifyDataSetInvalidated();
        }
        return cursor2;
    }
}
