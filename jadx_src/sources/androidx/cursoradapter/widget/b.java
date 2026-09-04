package androidx.cursoradapter.widget;

import android.database.Cursor;
import android.widget.Filter;

/* JADX INFO: compiled from: CursorFilter.java */
/* JADX INFO: loaded from: classes.dex */
public class b extends Filter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    a f21973a;

    /* JADX INFO: compiled from: CursorFilter.java */
    public interface a {
        void a(Cursor cursor);

        Cursor b();

        Cursor c(CharSequence charSequence);

        CharSequence convertToString(Cursor cursor);
    }

    b(a aVar) {
        this.f21973a = aVar;
    }

    @Override // android.widget.Filter
    public CharSequence convertResultToString(Object obj) {
        return this.f21973a.convertToString((Cursor) obj);
    }

    @Override // android.widget.Filter
    protected Filter.FilterResults performFiltering(CharSequence charSequence) {
        Cursor cursorC = this.f21973a.c(charSequence);
        Filter.FilterResults filterResults = new Filter.FilterResults();
        if (cursorC != null) {
            filterResults.count = cursorC.getCount();
            filterResults.values = cursorC;
        } else {
            filterResults.count = 0;
            filterResults.values = null;
        }
        return filterResults;
    }

    @Override // android.widget.Filter
    protected void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        Cursor cursorB = this.f21973a.b();
        Object obj = filterResults.values;
        if (obj == null || obj == cursorB) {
            return;
        }
        this.f21973a.a((Cursor) obj);
    }
}
