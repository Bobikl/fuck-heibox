package cn.fly.verify;

import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes6.dex */
public class co extends cg {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private a f36037c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f36038d;

    public static class a extends ContentObserver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f36039a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private co f36040b;

        public a(co coVar, int i10) {
            super(null);
            this.f36039a = i10;
            this.f36040b = coVar;
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z10) {
            co coVar = this.f36040b;
            if (coVar != null) {
                coVar.a(z10, this.f36039a);
            }
        }
    }

    public co(Context context) {
        super(context);
        this.f36037c = null;
        this.f36038d = "100215079";
        if (!TextUtils.isEmpty(eh.f36286j)) {
            this.f36038d = eh.f36286j;
        }
        es.a().a("oamt vivo appid: " + this.f36038d, new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z10, int i10) {
        try {
            String strA = a(i10);
            if (i10 == 0) {
                a(strA);
            }
        } catch (Throwable unused) {
        }
    }

    private String b(int i10) {
        if (i10 == 0) {
            return ei.a("051c@dkMeifeikllc<dkdfdldddidddkdldddffidleedcgldjdkdddidcWfMdj)lPeedc:feiOdiefdi$fDdjeedcVlPghfdeefl");
        }
        return null;
    }

    private void c(int i10) {
        if (i10 == 0 && this.f36037c == null) {
            this.f36037c = new a(this, 0);
            this.f36018a.getContentResolver().registerContentObserver(Uri.parse(b(0)), true, this.f36037c);
        }
    }

    /* JADX WARN: Code duplicated, block: B:50:0x003b A[DONT_GENERATE, EXC_TOP_SPLITTER, PHI: r0
  0x003b: PHI (r0v3 android.database.Cursor) = (r0v2 android.database.Cursor), (r0v5 android.database.Cursor) binds: [B:22:0x004b, B:15:0x0039] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    public String a(int i10) {
        Cursor cursorQuery;
        String strB = b(i10);
        if (strB == null) {
            return null;
        }
        try {
            cursorQuery = this.f36018a.getContentResolver().query(Uri.parse(strB), null, null, null, null);
            if (cursorQuery != null) {
                try {
                    if (cursorQuery.moveToNext()) {
                        String string = cursorQuery.getString(cursorQuery.getColumnIndex(ei.a("005Tdd3dg2dg;f")));
                        try {
                            cursorQuery.close();
                        } catch (Throwable unused) {
                        }
                        try {
                            c(i10);
                        } catch (Throwable unused2) {
                        }
                        return string;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    try {
                        es.a().a(th);
                    } finally {
                        if (cursorQuery != null) {
                            try {
                                cursorQuery.close();
                            } catch (Throwable unused3) {
                            }
                        }
                        try {
                            c(i10);
                        } catch (Throwable unused4) {
                        }
                    }
                }
            }
            if (cursorQuery != null) {
            }
        } catch (Throwable th3) {
            th = th3;
            cursorQuery = null;
        }
        return null;
    }

    @Override // cn.fly.verify.cg
    protected cg.b b() {
        cg.b bVar = new cg.b();
        bVar.f36026a = a(0);
        return bVar;
    }
}
