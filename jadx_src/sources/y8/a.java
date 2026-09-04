package y8;

import android.database.AbstractWindowedCursor;
import android.database.CrossProcessCursor;
import android.database.Cursor;
import android.database.CursorWindow;
import android.database.CursorWrapper;
import androidx.annotation.n0;
import androidx.annotation.p0;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* JADX INFO: loaded from: classes7.dex */
@v8.a
public class a extends CursorWrapper implements CrossProcessCursor {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private AbstractWindowedCursor f141608b;

    @v8.a
    public a(@n0 Cursor cursor) {
        super(cursor);
        for (int i10 = 0; i10 < 10 && (cursor instanceof CursorWrapper); i10++) {
            cursor = ((CursorWrapper) cursor).getWrappedCursor();
        }
        if (!(cursor instanceof AbstractWindowedCursor)) {
            throw new IllegalArgumentException("Unknown type: ".concat(cursor.getClass().getName()));
        }
        this.f141608b = (AbstractWindowedCursor) cursor;
    }

    @v8.a
    public void a(@p0 CursorWindow cursorWindow) {
        this.f141608b.setWindow(cursorWindow);
    }

    @Override // android.database.CrossProcessCursor
    @v8.a
    public void fillWindow(int i10, @n0 CursorWindow cursorWindow) {
        this.f141608b.fillWindow(i10, cursorWindow);
    }

    @Override // android.database.CrossProcessCursor
    @v8.a
    @p0
    public CursorWindow getWindow() {
        return this.f141608b.getWindow();
    }

    @Override // android.database.CursorWrapper
    @n0
    public final /* synthetic */ Cursor getWrappedCursor() {
        return this.f141608b;
    }

    @Override // android.database.CrossProcessCursor
    public final boolean onMove(int i10, int i11) {
        return this.f141608b.onMove(i10, i11);
    }
}
