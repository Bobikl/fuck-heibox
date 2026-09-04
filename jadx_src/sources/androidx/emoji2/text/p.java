package androidx.emoji2.text;

import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.util.SparseArray;
import androidx.annotation.RestrictTo;
import androidx.annotation.j1;
import androidx.annotation.n0;
import androidx.annotation.w0;
import androidx.core.os.e0;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: MetadataRepo.java */
/* JADX INFO: loaded from: classes6.dex */
@androidx.annotation.d
@w0(19)
public final class p {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f23171e = 1024;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f23172f = "EmojiCompat.MetadataRepo.create";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @n0
    private final androidx.emoji2.text.flatbuffer.o f23173a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @n0
    private final char[] f23174b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @n0
    private final a f23175c = new a(1024);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @n0
    private final Typeface f23176d;

    /* JADX INFO: compiled from: MetadataRepo.java */
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final SparseArray<a> f23177a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private i f23178b;

        private a() {
            this(1);
        }

        a(int i10) {
            this.f23177a = new SparseArray<>(i10);
        }

        a a(int i10) {
            SparseArray<a> sparseArray = this.f23177a;
            if (sparseArray == null) {
                return null;
            }
            return sparseArray.get(i10);
        }

        final i b() {
            return this.f23178b;
        }

        void c(@n0 i iVar, int i10, int i11) {
            a aVarA = a(iVar.b(i10));
            if (aVarA == null) {
                aVarA = new a();
                this.f23177a.put(iVar.b(i10), aVarA);
            }
            if (i11 > i10) {
                aVarA.c(iVar, i10 + 1, i11);
            } else {
                aVarA.f23178b = iVar;
            }
        }
    }

    private p(@n0 Typeface typeface, @n0 androidx.emoji2.text.flatbuffer.o oVar) {
        this.f23176d = typeface;
        this.f23173a = oVar;
        this.f23174b = new char[oVar.K() * 2];
        a(oVar);
    }

    private void a(androidx.emoji2.text.flatbuffer.o oVar) {
        int iK = oVar.K();
        for (int i10 = 0; i10 < iK; i10++) {
            i iVar = new i(this, i10);
            Character.toChars(iVar.g(), this.f23174b, i10 * 2);
            k(iVar);
        }
    }

    @n0
    public static p b(@n0 AssetManager assetManager, @n0 String str) throws IOException {
        try {
            e0.b(f23172f);
            return new p(Typeface.createFromAsset(assetManager, str), o.b(assetManager, str));
        } finally {
            e0.d();
        }
    }

    @n0
    @RestrictTo({RestrictTo.Scope.TESTS})
    public static p c(@n0 Typeface typeface) {
        try {
            e0.b(f23172f);
            return new p(typeface, new androidx.emoji2.text.flatbuffer.o());
        } finally {
            e0.d();
        }
    }

    @n0
    public static p d(@n0 Typeface typeface, @n0 InputStream inputStream) throws IOException {
        try {
            e0.b(f23172f);
            return new p(typeface, o.c(inputStream));
        } finally {
            e0.d();
        }
    }

    @n0
    public static p e(@n0 Typeface typeface, @n0 ByteBuffer byteBuffer) throws IOException {
        try {
            e0.b(f23172f);
            return new p(typeface, o.d(byteBuffer));
        } finally {
            e0.d();
        }
    }

    @n0
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public char[] f() {
        return this.f23174b;
    }

    @n0
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public androidx.emoji2.text.flatbuffer.o g() {
        return this.f23173a;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    int h() {
        return this.f23173a.S();
    }

    @n0
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    a i() {
        return this.f23175c;
    }

    @n0
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    Typeface j() {
        return this.f23176d;
    }

    @j1
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    void k(@n0 i iVar) {
        androidx.core.util.o.m(iVar, "emoji metadata cannot be null");
        androidx.core.util.o.b(iVar.c() > 0, "invalid metadata codepoint length");
        this.f23175c.c(iVar, 0, iVar.c() - 1);
    }
}
