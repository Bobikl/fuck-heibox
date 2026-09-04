package androidx.documentfile.provider;

import android.content.Context;
import android.net.Uri;
import android.provider.DocumentsContract;
import androidx.annotation.p0;
import androidx.annotation.w0;

/* JADX INFO: compiled from: SingleDocumentFile.java */
/* JADX INFO: loaded from: classes6.dex */
@w0(19)
public class d extends a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f22784c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Uri f22785d;

    d(@p0 a aVar, Context context, Uri uri) {
        super(aVar);
        this.f22784c = context;
        this.f22785d = uri;
    }

    @Override // androidx.documentfile.provider.a
    public boolean a() {
        return b.a(this.f22784c, this.f22785d);
    }

    @Override // androidx.documentfile.provider.a
    public boolean b() {
        return b.b(this.f22784c, this.f22785d);
    }

    @Override // androidx.documentfile.provider.a
    public a c(String str) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.documentfile.provider.a
    public a d(String str, String str2) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.documentfile.provider.a
    public boolean e() {
        try {
            return DocumentsContract.deleteDocument(this.f22784c.getContentResolver(), this.f22785d);
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // androidx.documentfile.provider.a
    public boolean f() {
        return b.d(this.f22784c, this.f22785d);
    }

    @Override // androidx.documentfile.provider.a
    @p0
    public String k() {
        return b.f(this.f22784c, this.f22785d);
    }

    @Override // androidx.documentfile.provider.a
    @p0
    public String m() {
        return b.h(this.f22784c, this.f22785d);
    }

    @Override // androidx.documentfile.provider.a
    public Uri n() {
        return this.f22785d;
    }

    @Override // androidx.documentfile.provider.a
    public boolean o() {
        return b.i(this.f22784c, this.f22785d);
    }

    @Override // androidx.documentfile.provider.a
    public boolean q() {
        return b.j(this.f22784c, this.f22785d);
    }

    @Override // androidx.documentfile.provider.a
    public boolean r() {
        return b.k(this.f22784c, this.f22785d);
    }

    @Override // androidx.documentfile.provider.a
    public long s() {
        return b.l(this.f22784c, this.f22785d);
    }

    @Override // androidx.documentfile.provider.a
    public long t() {
        return b.m(this.f22784c, this.f22785d);
    }

    @Override // androidx.documentfile.provider.a
    public a[] u() {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.documentfile.provider.a
    public boolean v(String str) {
        throw new UnsupportedOperationException();
    }
}
