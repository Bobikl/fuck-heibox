package kotlin.io;

import java.io.File;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.b2;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;
import yh.p;

/* JADX INFO: compiled from: FileTreeWalk.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class h implements kotlin.sequences.m<File> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final File f124754a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final FileWalkDirection f124755b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.e
    private final yh.l<File, Boolean> f124756c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.e
    private final yh.l<File, b2> f124757d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.e
    private final p<File, IOException, b2> f124758e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f124759f;

    /* JADX INFO: compiled from: FileTreeWalk.kt */
    public static abstract class a extends c {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@dl.d File rootDir) {
            super(rootDir);
            f0.p(rootDir, "rootDir");
        }
    }

    /* JADX INFO: compiled from: FileTreeWalk.kt */
    public final class b extends kotlin.collections.a<File> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @dl.d
        private final ArrayDeque<c> f124760d;

        /* JADX INFO: compiled from: FileTreeWalk.kt */
        public final class a extends a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private boolean f124762b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            @dl.e
            private File[] f124763c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private int f124764d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private boolean f124765e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ b f124766f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(@dl.d b bVar, File rootDir) {
                super(rootDir);
                f0.p(rootDir, "rootDir");
                this.f124766f = bVar;
            }

            @Override // kotlin.io.h.c
            @dl.e
            public File b() {
                if (!this.f124765e && this.f124763c == null) {
                    yh.l lVar = h.this.f124756c;
                    boolean z10 = false;
                    if (lVar != null && !((Boolean) lVar.invoke(a())).booleanValue()) {
                        z10 = true;
                    }
                    if (z10) {
                        return null;
                    }
                    File[] fileArrListFiles = a().listFiles();
                    this.f124763c = fileArrListFiles;
                    if (fileArrListFiles == null) {
                        p pVar = h.this.f124758e;
                        if (pVar != null) {
                            pVar.invoke(a(), new AccessDeniedException(a(), null, "Cannot list files in a directory", 2, null));
                        }
                        this.f124765e = true;
                    }
                }
                File[] fileArr = this.f124763c;
                if (fileArr != null) {
                    int i10 = this.f124764d;
                    f0.m(fileArr);
                    if (i10 < fileArr.length) {
                        File[] fileArr2 = this.f124763c;
                        f0.m(fileArr2);
                        int i11 = this.f124764d;
                        this.f124764d = i11 + 1;
                        return fileArr2[i11];
                    }
                }
                if (!this.f124762b) {
                    this.f124762b = true;
                    return a();
                }
                yh.l lVar2 = h.this.f124757d;
                if (lVar2 != null) {
                    lVar2.invoke(a());
                }
                return null;
            }
        }

        /* JADX INFO: renamed from: kotlin.io.h$b$b, reason: collision with other inner class name */
        /* JADX INFO: compiled from: FileTreeWalk.kt */
        public final class C1130b extends c {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private boolean f124767b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ b f124768c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1130b(@dl.d b bVar, File rootFile) {
                super(rootFile);
                f0.p(rootFile, "rootFile");
                this.f124768c = bVar;
            }

            @Override // kotlin.io.h.c
            @dl.e
            public File b() {
                if (this.f124767b) {
                    return null;
                }
                this.f124767b = true;
                return a();
            }
        }

        /* JADX INFO: compiled from: FileTreeWalk.kt */
        public final class c extends a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private boolean f124769b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            @dl.e
            private File[] f124770c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private int f124771d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ b f124772e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(@dl.d b bVar, File rootDir) {
                super(rootDir);
                f0.p(rootDir, "rootDir");
                this.f124772e = bVar;
            }

            /* JADX WARN: Code restructure failed: missing block: B:32:0x0083, code lost:
            
                if (r0.length == 0) goto L33;
             */
            @Override // kotlin.io.h.c
            @dl.e
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public java.io.File b() {
                /*
                    r10 = this;
                    boolean r0 = r10.f124769b
                    r1 = 0
                    if (r0 != 0) goto L2c
                    kotlin.io.h$b r0 = r10.f124772e
                    kotlin.io.h r0 = kotlin.io.h.this
                    yh.l r0 = kotlin.io.h.e(r0)
                    r2 = 0
                    r3 = 1
                    if (r0 == 0) goto L22
                    java.io.File r4 = r10.a()
                    java.lang.Object r0 = r0.invoke(r4)
                    java.lang.Boolean r0 = (java.lang.Boolean) r0
                    boolean r0 = r0.booleanValue()
                    if (r0 != 0) goto L22
                    r2 = r3
                L22:
                    if (r2 == 0) goto L25
                    return r1
                L25:
                    r10.f124769b = r3
                    java.io.File r0 = r10.a()
                    return r0
                L2c:
                    java.io.File[] r0 = r10.f124770c
                    if (r0 == 0) goto L4b
                    int r2 = r10.f124771d
                    kotlin.jvm.internal.f0.m(r0)
                    int r0 = r0.length
                    if (r2 >= r0) goto L39
                    goto L4b
                L39:
                    kotlin.io.h$b r0 = r10.f124772e
                    kotlin.io.h r0 = kotlin.io.h.this
                    yh.l r0 = kotlin.io.h.g(r0)
                    if (r0 == 0) goto L4a
                    java.io.File r2 = r10.a()
                    r0.invoke(r2)
                L4a:
                    return r1
                L4b:
                    java.io.File[] r0 = r10.f124770c
                    if (r0 != 0) goto L97
                    java.io.File r0 = r10.a()
                    java.io.File[] r0 = r0.listFiles()
                    r10.f124770c = r0
                    if (r0 != 0) goto L7b
                    kotlin.io.h$b r0 = r10.f124772e
                    kotlin.io.h r0 = kotlin.io.h.this
                    yh.p r0 = kotlin.io.h.f(r0)
                    if (r0 == 0) goto L7b
                    java.io.File r2 = r10.a()
                    kotlin.io.AccessDeniedException r9 = new kotlin.io.AccessDeniedException
                    java.io.File r4 = r10.a()
                    r5 = 0
                    r7 = 2
                    r8 = 0
                    java.lang.String r6 = "Cannot list files in a directory"
                    r3 = r9
                    r3.<init>(r4, r5, r6, r7, r8)
                    r0.invoke(r2, r9)
                L7b:
                    java.io.File[] r0 = r10.f124770c
                    if (r0 == 0) goto L85
                    kotlin.jvm.internal.f0.m(r0)
                    int r0 = r0.length
                    if (r0 != 0) goto L97
                L85:
                    kotlin.io.h$b r0 = r10.f124772e
                    kotlin.io.h r0 = kotlin.io.h.this
                    yh.l r0 = kotlin.io.h.g(r0)
                    if (r0 == 0) goto L96
                    java.io.File r2 = r10.a()
                    r0.invoke(r2)
                L96:
                    return r1
                L97:
                    java.io.File[] r0 = r10.f124770c
                    kotlin.jvm.internal.f0.m(r0)
                    int r1 = r10.f124771d
                    int r2 = r1 + 1
                    r10.f124771d = r2
                    r0 = r0[r1]
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlin.io.h.b.c.b():java.io.File");
            }
        }

        /* JADX INFO: compiled from: FileTreeWalk.kt */
        public final /* synthetic */ class d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f124773a;

            static {
                int[] iArr = new int[FileWalkDirection.values().length];
                try {
                    iArr[FileWalkDirection.TOP_DOWN.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[FileWalkDirection.BOTTOM_UP.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f124773a = iArr;
            }
        }

        public b() {
            ArrayDeque<c> arrayDeque = new ArrayDeque<>();
            this.f124760d = arrayDeque;
            if (h.this.f124754a.isDirectory()) {
                arrayDeque.push(e(h.this.f124754a));
            } else if (h.this.f124754a.isFile()) {
                arrayDeque.push(new C1130b(this, h.this.f124754a));
            } else {
                b();
            }
        }

        private final a e(File file) {
            int i10 = d.f124773a[h.this.f124755b.ordinal()];
            if (i10 == 1) {
                return new c(this, file);
            }
            if (i10 == 2) {
                return new a(this, file);
            }
            throw new NoWhenBranchMatchedException();
        }

        private final File g() {
            while (true) {
                c cVarPeek = this.f124760d.peek();
                if (cVarPeek == null) {
                    return null;
                }
                File fileB = cVarPeek.b();
                if (fileB == null) {
                    this.f124760d.pop();
                } else {
                    if (f0.g(fileB, cVarPeek.a()) || !fileB.isDirectory() || this.f124760d.size() >= h.this.f124759f) {
                        return fileB;
                    }
                    this.f124760d.push(e(fileB));
                }
            }
        }

        @Override // kotlin.collections.a
        protected void a() {
            File fileG = g();
            if (fileG != null) {
                c(fileG);
            } else {
                b();
            }
        }
    }

    /* JADX INFO: compiled from: FileTreeWalk.kt */
    public static abstract class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @dl.d
        private final File f124774a;

        public c(@dl.d File root) {
            f0.p(root, "root");
            this.f124774a = root;
        }

        @dl.d
        public final File a() {
            return this.f124774a;
        }

        @dl.e
        public abstract File b();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public h(@dl.d File start, @dl.d FileWalkDirection direction) {
        this(start, direction, null, null, null, 0, 32, null);
        f0.p(start, "start");
        f0.p(direction, "direction");
    }

    public /* synthetic */ h(File file, FileWalkDirection fileWalkDirection, int i10, u uVar) {
        this(file, (i10 & 2) != 0 ? FileWalkDirection.TOP_DOWN : fileWalkDirection);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private h(File file, FileWalkDirection fileWalkDirection, yh.l<? super File, Boolean> lVar, yh.l<? super File, b2> lVar2, p<? super File, ? super IOException, b2> pVar, int i10) {
        this.f124754a = file;
        this.f124755b = fileWalkDirection;
        this.f124756c = lVar;
        this.f124757d = lVar2;
        this.f124758e = pVar;
        this.f124759f = i10;
    }

    /* synthetic */ h(File file, FileWalkDirection fileWalkDirection, yh.l lVar, yh.l lVar2, p pVar, int i10, int i11, u uVar) {
        this(file, (i11 & 2) != 0 ? FileWalkDirection.TOP_DOWN : fileWalkDirection, lVar, lVar2, pVar, (i11 & 32) != 0 ? Integer.MAX_VALUE : i10);
    }

    @dl.d
    public final h i(int i10) {
        if (i10 > 0) {
            return new h(this.f124754a, this.f124755b, this.f124756c, this.f124757d, this.f124758e, i10);
        }
        throw new IllegalArgumentException("depth must be positive, but was " + i10 + lg.a.f131414g);
    }

    @Override // kotlin.sequences.m
    @dl.d
    public Iterator<File> iterator() {
        return new b();
    }

    @dl.d
    public final h j(@dl.d yh.l<? super File, Boolean> function) {
        f0.p(function, "function");
        return new h(this.f124754a, this.f124755b, function, this.f124757d, this.f124758e, this.f124759f);
    }

    @dl.d
    public final h k(@dl.d p<? super File, ? super IOException, b2> function) {
        f0.p(function, "function");
        return new h(this.f124754a, this.f124755b, this.f124756c, this.f124757d, function, this.f124759f);
    }

    @dl.d
    public final h l(@dl.d yh.l<? super File, b2> function) {
        f0.p(function, "function");
        return new h(this.f124754a, this.f124755b, this.f124756c, function, this.f124758e, this.f124759f);
    }
}
