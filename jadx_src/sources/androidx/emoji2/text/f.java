package androidx.emoji2.text;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.annotation.RestrictTo;
import androidx.annotation.b0;
import androidx.annotation.f0;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.annotation.w0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: compiled from: EmojiCompat.java */
/* JADX INFO: loaded from: classes6.dex */
@androidx.annotation.d
public class f {
    public static final int A = 2;

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    static final int B = Integer.MAX_VALUE;
    private static final Object C = new Object();
    private static final Object D = new Object();

    @b0("INSTANCE_LOCK")
    @p0
    private static volatile f E = null;

    @b0("CONFIG_LOCK")
    private static volatile boolean F = false;
    private static final String G = "EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String f22947n = "android.support.text.emoji.emojiCompat_metadataVersion";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final String f22948o = "android.support.text.emoji.emojiCompat_replaceAll";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f22949p = 3;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f22950q = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f22951r = 1;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f22952s = 2;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f22953t = 0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int f22954u = 1;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f22955v = 2;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f22956w = 0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final int f22957x = 1;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int f22958y = 0;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int f22959z = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @n0
    @b0("mInitLock")
    private final Set<AbstractC0166f> f22961b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @n0
    private final c f22964e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @n0
    final i f22965f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final boolean f22966g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final boolean f22967h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @p0
    final int[] f22968i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final boolean f22969j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final int f22970k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final int f22971l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final e f22972m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @n0
    private final ReadWriteLock f22960a = new ReentrantReadWriteLock();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @b0("mInitLock")
    private volatile int f22962c = 3;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @n0
    private final Handler f22963d = new Handler(Looper.getMainLooper());

    /* JADX INFO: compiled from: EmojiCompat.java */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public @interface a {
    }

    /* JADX INFO: compiled from: EmojiCompat.java */
    @w0(19)
    public static final class b extends c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private volatile androidx.emoji2.text.j f22973b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private volatile p f22974c;

        /* JADX INFO: compiled from: EmojiCompat.java */
        public class a extends j {
            a() {
            }

            @Override // androidx.emoji2.text.f.j
            public void a(@p0 Throwable th2) {
                b.this.f22976a.s(th2);
            }

            @Override // androidx.emoji2.text.f.j
            public void b(@n0 p pVar) {
                b.this.h(pVar);
            }
        }

        b(f fVar) {
            super(fVar);
        }

        @Override // androidx.emoji2.text.f.c
        String a() {
            String strN = this.f22974c.g().N();
            return strN == null ? "" : strN;
        }

        @Override // androidx.emoji2.text.f.c
        public int b(CharSequence charSequence, int i10) {
            return this.f22973b.d(charSequence, i10);
        }

        @Override // androidx.emoji2.text.f.c
        boolean c(@n0 CharSequence charSequence) {
            return this.f22973b.c(charSequence) == 1;
        }

        @Override // androidx.emoji2.text.f.c
        boolean d(@n0 CharSequence charSequence, int i10) {
            return this.f22973b.d(charSequence, i10) == 1;
        }

        @Override // androidx.emoji2.text.f.c
        void e() {
            try {
                this.f22976a.f22965f.a(new a());
            } catch (Throwable th2) {
                this.f22976a.s(th2);
            }
        }

        @Override // androidx.emoji2.text.f.c
        CharSequence f(@n0 CharSequence charSequence, int i10, int i11, int i12, boolean z10) {
            return this.f22973b.j(charSequence, i10, i11, i12, z10);
        }

        @Override // androidx.emoji2.text.f.c
        void g(@n0 EditorInfo editorInfo) {
            editorInfo.extras.putInt(f.f22947n, this.f22974c.h());
            editorInfo.extras.putBoolean(f.f22948o, this.f22976a.f22966g);
        }

        void h(@n0 p pVar) {
            if (pVar == null) {
                this.f22976a.s(new IllegalArgumentException("metadataRepo cannot be null"));
                return;
            }
            this.f22974c = pVar;
            p pVar2 = this.f22974c;
            l lVar = new l();
            e eVar = this.f22976a.f22972m;
            f fVar = this.f22976a;
            this.f22973b = new androidx.emoji2.text.j(pVar2, lVar, eVar, fVar.f22967h, fVar.f22968i);
            this.f22976a.t();
        }
    }

    /* JADX INFO: compiled from: EmojiCompat.java */
    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final f f22976a;

        c(f fVar) {
            this.f22976a = fVar;
        }

        String a() {
            return "";
        }

        public int b(CharSequence charSequence, int i10) {
            return 0;
        }

        boolean c(@n0 CharSequence charSequence) {
            return false;
        }

        boolean d(@n0 CharSequence charSequence, int i10) {
            return false;
        }

        void e() {
            this.f22976a.t();
        }

        CharSequence f(@n0 CharSequence charSequence, @f0(from = 0) int i10, @f0(from = 0) int i11, @f0(from = 0) int i12, boolean z10) {
            return charSequence;
        }

        void g(@n0 EditorInfo editorInfo) {
        }
    }

    /* JADX INFO: compiled from: EmojiCompat.java */
    public static abstract class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @n0
        final i f22977a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        boolean f22978b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f22979c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @p0
        int[] f22980d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @p0
        Set<AbstractC0166f> f22981e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        boolean f22982f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f22983g = -16711936;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f22984h = 0;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @n0
        e f22985i = new androidx.emoji2.text.e();

        protected d(@n0 i iVar) {
            androidx.core.util.o.m(iVar, "metadataLoader cannot be null.");
            this.f22977a = iVar;
        }

        @n0
        protected final i a() {
            return this.f22977a;
        }

        @n0
        public d b(@n0 AbstractC0166f abstractC0166f) {
            androidx.core.util.o.m(abstractC0166f, "initCallback cannot be null");
            if (this.f22981e == null) {
                this.f22981e = new androidx.collection.c();
            }
            this.f22981e.add(abstractC0166f);
            return this;
        }

        @n0
        public d c(@androidx.annotation.l int i10) {
            this.f22983g = i10;
            return this;
        }

        @n0
        public d d(boolean z10) {
            this.f22982f = z10;
            return this;
        }

        @n0
        public d e(@n0 e eVar) {
            androidx.core.util.o.m(eVar, "GlyphChecker cannot be null");
            this.f22985i = eVar;
            return this;
        }

        @n0
        public d f(int i10) {
            this.f22984h = i10;
            return this;
        }

        @n0
        public d g(boolean z10) {
            this.f22978b = z10;
            return this;
        }

        @n0
        public d h(boolean z10) {
            return i(z10, null);
        }

        @n0
        public d i(boolean z10, @p0 List<Integer> list) {
            this.f22979c = z10;
            if (!z10 || list == null) {
                this.f22980d = null;
            } else {
                this.f22980d = new int[list.size()];
                int i10 = 0;
                Iterator<Integer> it = list.iterator();
                while (it.hasNext()) {
                    this.f22980d[i10] = it.next().intValue();
                    i10++;
                }
                Arrays.sort(this.f22980d);
            }
            return this;
        }

        @n0
        public d j(@n0 AbstractC0166f abstractC0166f) {
            androidx.core.util.o.m(abstractC0166f, "initCallback cannot be null");
            Set<AbstractC0166f> set = this.f22981e;
            if (set != null) {
                set.remove(abstractC0166f);
            }
            return this;
        }
    }

    /* JADX INFO: compiled from: EmojiCompat.java */
    public interface e {
        boolean a(@n0 CharSequence charSequence, @f0(from = 0) int i10, @f0(from = 0) int i11, @f0(from = 0) int i12);
    }

    /* JADX INFO: renamed from: androidx.emoji2.text.f$f, reason: collision with other inner class name */
    /* JADX INFO: compiled from: EmojiCompat.java */
    public static abstract class AbstractC0166f {
        public void a(@p0 Throwable th2) {
        }

        public void b() {
        }
    }

    /* JADX INFO: compiled from: EmojiCompat.java */
    public static class g implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final List<AbstractC0166f> f22986b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Throwable f22987c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f22988d;

        g(@n0 AbstractC0166f abstractC0166f, int i10) {
            this(Arrays.asList((AbstractC0166f) androidx.core.util.o.m(abstractC0166f, "initCallback cannot be null")), i10, null);
        }

        g(@n0 Collection<AbstractC0166f> collection, int i10) {
            this(collection, i10, null);
        }

        g(@n0 Collection<AbstractC0166f> collection, int i10, @p0 Throwable th2) {
            androidx.core.util.o.m(collection, "initCallbacks cannot be null");
            this.f22986b = new ArrayList(collection);
            this.f22988d = i10;
            this.f22987c = th2;
        }

        @Override // java.lang.Runnable
        public void run() {
            int size = this.f22986b.size();
            int i10 = 0;
            if (this.f22988d != 1) {
                while (i10 < size) {
                    this.f22986b.get(i10).a(this.f22987c);
                    i10++;
                }
            } else {
                while (i10 < size) {
                    this.f22986b.get(i10).b();
                    i10++;
                }
            }
        }
    }

    /* JADX INFO: compiled from: EmojiCompat.java */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public @interface h {
    }

    /* JADX INFO: compiled from: EmojiCompat.java */
    public interface i {
        void a(@n0 j jVar);
    }

    /* JADX INFO: compiled from: EmojiCompat.java */
    public static abstract class j {
        public abstract void a(@p0 Throwable th2);

        public abstract void b(@n0 p pVar);
    }

    /* JADX INFO: compiled from: EmojiCompat.java */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public @interface k {
    }

    /* JADX INFO: compiled from: EmojiCompat.java */
    @w0(19)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static class l {
        l() {
        }

        androidx.emoji2.text.k a(@n0 androidx.emoji2.text.i iVar) {
            return new r(iVar);
        }
    }

    private f(@n0 d dVar) {
        this.f22966g = dVar.f22978b;
        this.f22967h = dVar.f22979c;
        this.f22968i = dVar.f22980d;
        this.f22969j = dVar.f22982f;
        this.f22970k = dVar.f22983g;
        this.f22965f = dVar.f22977a;
        this.f22971l = dVar.f22984h;
        this.f22972m = dVar.f22985i;
        androidx.collection.c cVar = new androidx.collection.c();
        this.f22961b = cVar;
        Set<AbstractC0166f> set = dVar.f22981e;
        if (set != null && !set.isEmpty()) {
            cVar.addAll(dVar.f22981e);
        }
        this.f22964e = new b(this);
        r();
    }

    @RestrictTo({RestrictTo.Scope.TESTS})
    @p0
    public static f A(@p0 f fVar) {
        f fVar2;
        synchronized (C) {
            E = fVar;
            fVar2 = E;
        }
        return fVar2;
    }

    @RestrictTo({RestrictTo.Scope.TESTS})
    public static void B(boolean z10) {
        synchronized (D) {
            F = z10;
        }
    }

    @n0
    public static f b() {
        f fVar;
        synchronized (C) {
            fVar = E;
            androidx.core.util.o.o(fVar != null, G);
        }
        return fVar;
    }

    public static boolean g(@n0 InputConnection inputConnection, @n0 Editable editable, @f0(from = 0) int i10, @f0(from = 0) int i11, boolean z10) {
        return androidx.emoji2.text.j.e(inputConnection, editable, i10, i11, z10);
    }

    public static boolean h(@n0 Editable editable, int i10, @n0 KeyEvent keyEvent) {
        return androidx.emoji2.text.j.f(editable, i10, keyEvent);
    }

    @p0
    public static f k(@n0 Context context) {
        return l(context, null);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    @p0
    public static f l(@n0 Context context, @p0 androidx.emoji2.text.d.a aVar) {
        f fVar;
        if (F) {
            return E;
        }
        if (aVar == null) {
            aVar = new androidx.emoji2.text.d.a(null);
        }
        d dVarC = aVar.c(context);
        synchronized (D) {
            if (!F) {
                if (dVarC != null) {
                    m(dVarC);
                }
                F = true;
            }
            fVar = E;
        }
        return fVar;
    }

    @n0
    public static f m(@n0 d dVar) {
        f fVar = E;
        if (fVar == null) {
            synchronized (C) {
                fVar = E;
                if (fVar == null) {
                    fVar = new f(dVar);
                    E = fVar;
                }
            }
        }
        return fVar;
    }

    public static boolean n() {
        return E != null;
    }

    private boolean p() {
        return f() == 1;
    }

    private void r() {
        this.f22960a.writeLock().lock();
        try {
            if (this.f22971l == 0) {
                this.f22962c = 0;
            }
            this.f22960a.writeLock().unlock();
            if (f() == 0) {
                this.f22964e.e();
            }
        } catch (Throwable th2) {
            this.f22960a.writeLock().unlock();
            throw th2;
        }
    }

    @n0
    public static f z(@n0 d dVar) {
        f fVar;
        synchronized (C) {
            fVar = new f(dVar);
            E = fVar;
        }
        return fVar;
    }

    public void C(@n0 AbstractC0166f abstractC0166f) {
        androidx.core.util.o.m(abstractC0166f, "initCallback cannot be null");
        this.f22960a.writeLock().lock();
        try {
            this.f22961b.remove(abstractC0166f);
        } finally {
            this.f22960a.writeLock().unlock();
        }
    }

    public void D(@n0 EditorInfo editorInfo) {
        if (!p() || editorInfo == null) {
            return;
        }
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        this.f22964e.g(editorInfo);
    }

    @n0
    public String c() {
        androidx.core.util.o.o(p(), "Not initialized yet");
        return this.f22964e.a();
    }

    public int d(@n0 CharSequence charSequence, @f0(from = 0) int i10) {
        androidx.core.util.o.o(p(), "Not initialized yet");
        androidx.core.util.o.m(charSequence, "sequence cannot be null");
        return this.f22964e.b(charSequence, i10);
    }

    @androidx.annotation.l
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public int e() {
        return this.f22970k;
    }

    public int f() {
        this.f22960a.readLock().lock();
        try {
            return this.f22962c;
        } finally {
            this.f22960a.readLock().unlock();
        }
    }

    @Deprecated
    public boolean i(@n0 CharSequence charSequence) {
        androidx.core.util.o.o(p(), "Not initialized yet");
        androidx.core.util.o.m(charSequence, "sequence cannot be null");
        return this.f22964e.c(charSequence);
    }

    @Deprecated
    public boolean j(@n0 CharSequence charSequence, @f0(from = 0) int i10) {
        androidx.core.util.o.o(p(), "Not initialized yet");
        androidx.core.util.o.m(charSequence, "sequence cannot be null");
        return this.f22964e.d(charSequence, i10);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public boolean o() {
        return this.f22969j;
    }

    public void q() {
        androidx.core.util.o.o(this.f22971l == 1, "Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
        if (p()) {
            return;
        }
        this.f22960a.writeLock().lock();
        try {
            if (this.f22962c == 0) {
                this.f22960a.writeLock().unlock();
                return;
            }
            this.f22962c = 0;
            this.f22960a.writeLock().unlock();
            this.f22964e.e();
        } catch (Throwable th2) {
            this.f22960a.writeLock().unlock();
            throw th2;
        }
    }

    void s(@p0 Throwable th2) {
        ArrayList arrayList = new ArrayList();
        this.f22960a.writeLock().lock();
        try {
            this.f22962c = 2;
            arrayList.addAll(this.f22961b);
            this.f22961b.clear();
            this.f22960a.writeLock().unlock();
            this.f22963d.post(new g(arrayList, this.f22962c, th2));
        } catch (Throwable th3) {
            this.f22960a.writeLock().unlock();
            throw th3;
        }
    }

    void t() {
        ArrayList arrayList = new ArrayList();
        this.f22960a.writeLock().lock();
        try {
            this.f22962c = 1;
            arrayList.addAll(this.f22961b);
            this.f22961b.clear();
            this.f22960a.writeLock().unlock();
            this.f22963d.post(new g(arrayList, this.f22962c));
        } catch (Throwable th2) {
            this.f22960a.writeLock().unlock();
            throw th2;
        }
    }

    @androidx.annotation.j
    @p0
    public CharSequence u(@p0 CharSequence charSequence) {
        return v(charSequence, 0, charSequence == null ? 0 : charSequence.length());
    }

    @androidx.annotation.j
    @p0
    public CharSequence v(@p0 CharSequence charSequence, @f0(from = 0) int i10, @f0(from = 0) int i11) {
        return w(charSequence, i10, i11, Integer.MAX_VALUE);
    }

    @androidx.annotation.j
    @p0
    public CharSequence w(@p0 CharSequence charSequence, @f0(from = 0) int i10, @f0(from = 0) int i11, @f0(from = 0) int i12) {
        return x(charSequence, i10, i11, i12, 0);
    }

    @androidx.annotation.j
    @p0
    public CharSequence x(@p0 CharSequence charSequence, @f0(from = 0) int i10, @f0(from = 0) int i11, @f0(from = 0) int i12, int i13) {
        boolean z10;
        androidx.core.util.o.o(p(), "Not initialized yet");
        androidx.core.util.o.j(i10, "start cannot be negative");
        androidx.core.util.o.j(i11, "end cannot be negative");
        androidx.core.util.o.j(i12, "maxEmojiCount cannot be negative");
        androidx.core.util.o.b(i10 <= i11, "start should be <= than end");
        if (charSequence == null) {
            return null;
        }
        androidx.core.util.o.b(i10 <= charSequence.length(), "start should be < than charSequence length");
        androidx.core.util.o.b(i11 <= charSequence.length(), "end should be < than charSequence length");
        if (charSequence.length() == 0 || i10 == i11) {
            return charSequence;
        }
        if (i13 != 1) {
            z10 = i13 != 2 ? this.f22966g : false;
        } else {
            z10 = true;
        }
        return this.f22964e.f(charSequence, i10, i11, i12, z10);
    }

    public void y(@n0 AbstractC0166f abstractC0166f) {
        androidx.core.util.o.m(abstractC0166f, "initCallback cannot be null");
        this.f22960a.writeLock().lock();
        try {
            if (this.f22962c == 1 || this.f22962c == 2) {
                this.f22963d.post(new g(abstractC0166f, this.f22962c));
            } else {
                this.f22961b.add(abstractC0166f);
            }
        } finally {
            this.f22960a.writeLock().unlock();
        }
    }
}
