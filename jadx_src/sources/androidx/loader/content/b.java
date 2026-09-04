package androidx.loader.content;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.core.os.OperationCanceledException;
import androidx.core.os.f;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Arrays;

/* JADX INFO: compiled from: CursorLoader.java */
/* JADX INFO: loaded from: classes6.dex */
public class b extends a<Cursor> {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    final c<Cursor>.a f24357r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    Uri f24358s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    String[] f24359t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    String f24360u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    String[] f24361v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    String f24362w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    Cursor f24363x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    f f24364y;

    public b(@n0 Context context) {
        super(context);
        this.f24357r = new c.a();
    }

    public b(@n0 Context context, @n0 Uri uri, @p0 String[] strArr, @p0 String str, @p0 String[] strArr2, @p0 String str2) {
        super(context);
        this.f24357r = new c.a();
        this.f24358s = uri;
        this.f24359t = strArr;
        this.f24360u = str;
        this.f24361v = strArr2;
        this.f24362w = str2;
    }

    @Override // androidx.loader.content.a
    public void D() {
        super.D();
        synchronized (this) {
            f fVar = this.f24364y;
            if (fVar != null) {
                fVar.a();
            }
        }
    }

    @Override // androidx.loader.content.c
    /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
    public void f(Cursor cursor) {
        if (l()) {
            if (cursor != null) {
                cursor.close();
                return;
            }
            return;
        }
        Cursor cursor2 = this.f24363x;
        this.f24363x = cursor;
        if (m()) {
            super.f(cursor);
        }
        if (cursor2 == null || cursor2 == cursor || cursor2.isClosed()) {
            return;
        }
        cursor2.close();
    }

    @p0
    public String[] O() {
        return this.f24359t;
    }

    @p0
    public String P() {
        return this.f24360u;
    }

    @p0
    public String[] Q() {
        return this.f24361v;
    }

    @p0
    public String R() {
        return this.f24362w;
    }

    @n0
    public Uri S() {
        return this.f24358s;
    }

    @Override // androidx.loader.content.a
    /* JADX INFO: renamed from: T, reason: merged with bridge method [inline-methods] */
    public Cursor I() {
        synchronized (this) {
            if (H()) {
                throw new OperationCanceledException();
            }
            this.f24364y = new f();
        }
        try {
            Cursor cursorA = androidx.core.content.b.a(i().getContentResolver(), this.f24358s, this.f24359t, this.f24360u, this.f24361v, this.f24362w, this.f24364y);
            if (cursorA != null) {
                try {
                    cursorA.getCount();
                    cursorA.registerContentObserver(this.f24357r);
                } catch (RuntimeException e10) {
                    cursorA.close();
                    throw e10;
                }
            }
            synchronized (this) {
                this.f24364y = null;
            }
            return cursorA;
        } catch (Throwable th2) {
            synchronized (this) {
                this.f24364y = null;
                throw th2;
            }
        }
    }

    @Override // androidx.loader.content.a
    /* JADX INFO: renamed from: U, reason: merged with bridge method [inline-methods] */
    public void J(Cursor cursor) {
        if (cursor == null || cursor.isClosed()) {
            return;
        }
        cursor.close();
    }

    public void V(@p0 String[] strArr) {
        this.f24359t = strArr;
    }

    public void W(@p0 String str) {
        this.f24360u = str;
    }

    public void X(@p0 String[] strArr) {
        this.f24361v = strArr;
    }

    public void Y(@p0 String str) {
        this.f24362w = str;
    }

    public void Z(@n0 Uri uri) {
        this.f24358s = uri;
    }

    @Override // androidx.loader.content.a, androidx.loader.content.c
    @Deprecated
    public void g(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.g(str, fileDescriptor, printWriter, strArr);
        printWriter.print(str);
        printWriter.print("mUri=");
        printWriter.println(this.f24358s);
        printWriter.print(str);
        printWriter.print("mProjection=");
        printWriter.println(Arrays.toString(this.f24359t));
        printWriter.print(str);
        printWriter.print("mSelection=");
        printWriter.println(this.f24360u);
        printWriter.print(str);
        printWriter.print("mSelectionArgs=");
        printWriter.println(Arrays.toString(this.f24361v));
        printWriter.print(str);
        printWriter.print("mSortOrder=");
        printWriter.println(this.f24362w);
        printWriter.print(str);
        printWriter.print("mCursor=");
        printWriter.println(this.f24363x);
        printWriter.print(str);
        printWriter.print("mContentChanged=");
        printWriter.println(this.f24372h);
    }

    @Override // androidx.loader.content.c
    protected void r() {
        super.r();
        t();
        Cursor cursor = this.f24363x;
        if (cursor != null && !cursor.isClosed()) {
            this.f24363x.close();
        }
        this.f24363x = null;
    }

    @Override // androidx.loader.content.c
    protected void s() {
        Cursor cursor = this.f24363x;
        if (cursor != null) {
            f(cursor);
        }
        if (A() || this.f24363x == null) {
            h();
        }
    }

    @Override // androidx.loader.content.c
    protected void t() {
        b();
    }
}
