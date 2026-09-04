package com.airbnb.lottie.animation.content;

import android.annotation.TargetApi;
import android.graphics.Path;
import com.airbnb.lottie.model.content.MergePaths;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: compiled from: MergePathsContent.java */
/* JADX INFO: loaded from: classes6.dex */
@TargetApi(19)
public class l implements n, j {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f37191d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final MergePaths f37193f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Path f37188a = new Path();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Path f37189b = new Path();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Path f37190c = new Path();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List<n> f37192e = new ArrayList();

    /* JADX INFO: compiled from: MergePathsContent.java */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f37194a;

        static {
            int[] iArr = new int[MergePaths.MergePathsMode.values().length];
            f37194a = iArr;
            try {
                iArr[MergePaths.MergePathsMode.MERGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f37194a[MergePaths.MergePathsMode.ADD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f37194a[MergePaths.MergePathsMode.SUBTRACT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f37194a[MergePaths.MergePathsMode.INTERSECT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f37194a[MergePaths.MergePathsMode.EXCLUDE_INTERSECTIONS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public l(MergePaths mergePaths) {
        this.f37191d = mergePaths.c();
        this.f37193f = mergePaths;
    }

    private void d() {
        for (int i10 = 0; i10 < this.f37192e.size(); i10++) {
            this.f37190c.addPath(this.f37192e.get(i10).getPath());
        }
    }

    @TargetApi(19)
    private void f(Path.Op op) {
        this.f37189b.reset();
        this.f37188a.reset();
        for (int size = this.f37192e.size() - 1; size >= 1; size--) {
            n nVar = this.f37192e.get(size);
            if (nVar instanceof d) {
                d dVar = (d) nVar;
                List<n> listI = dVar.i();
                for (int size2 = listI.size() - 1; size2 >= 0; size2--) {
                    Path path = listI.get(size2).getPath();
                    path.transform(dVar.j());
                    this.f37189b.addPath(path);
                }
            } else {
                this.f37189b.addPath(nVar.getPath());
            }
        }
        n nVar2 = this.f37192e.get(0);
        if (nVar2 instanceof d) {
            d dVar2 = (d) nVar2;
            List<n> listI2 = dVar2.i();
            for (int i10 = 0; i10 < listI2.size(); i10++) {
                Path path2 = listI2.get(i10).getPath();
                path2.transform(dVar2.j());
                this.f37188a.addPath(path2);
            }
        } else {
            this.f37188a.set(nVar2.getPath());
        }
        this.f37190c.op(this.f37188a, this.f37189b, op);
    }

    @Override // com.airbnb.lottie.animation.content.j
    public void b(ListIterator<c> listIterator) {
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        while (listIterator.hasPrevious()) {
            c cVarPrevious = listIterator.previous();
            if (cVarPrevious instanceof n) {
                this.f37192e.add((n) cVarPrevious);
                listIterator.remove();
            }
        }
    }

    @Override // com.airbnb.lottie.animation.content.c
    public void e(List<c> list, List<c> list2) {
        for (int i10 = 0; i10 < this.f37192e.size(); i10++) {
            this.f37192e.get(i10).e(list, list2);
        }
    }

    @Override // com.airbnb.lottie.animation.content.c
    public String getName() {
        return this.f37191d;
    }

    @Override // com.airbnb.lottie.animation.content.n
    public Path getPath() {
        this.f37190c.reset();
        if (this.f37193f.d()) {
            return this.f37190c;
        }
        int i10 = a.f37194a[this.f37193f.b().ordinal()];
        if (i10 == 1) {
            d();
        } else if (i10 == 2) {
            f(Path.Op.UNION);
        } else if (i10 == 3) {
            f(Path.Op.REVERSE_DIFFERENCE);
        } else if (i10 == 4) {
            f(Path.Op.INTERSECT);
        } else if (i10 == 5) {
            f(Path.Op.XOR);
        }
        return this.f37190c;
    }
}
