package org.ahocorasick.interval;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class IntervalNode {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private IntervalNode f132779a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private IntervalNode f132780b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f132781c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private List<c> f132782d = new ArrayList();

    public enum Direction {
        LEFT,
        RIGHT
    }

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f132783a;

        static {
            int[] iArr = new int[Direction.values().length];
            f132783a = iArr;
            try {
                iArr[Direction.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f132783a[Direction.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public IntervalNode(List<c> list) {
        this.f132779a = null;
        this.f132780b = null;
        this.f132781c = e(list);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (c cVar : list) {
            if (cVar.G() < this.f132781c) {
                arrayList.add(cVar);
            } else if (cVar.D() > this.f132781c) {
                arrayList2.add(cVar);
            } else {
                this.f132782d.add(cVar);
            }
        }
        if (arrayList.size() > 0) {
            this.f132779a = new IntervalNode(arrayList);
        }
        if (arrayList2.size() > 0) {
            this.f132780b = new IntervalNode(arrayList2);
        }
    }

    protected void a(c cVar, List<c> list, List<c> list2) {
        for (c cVar2 : list2) {
            if (!cVar2.equals(cVar)) {
                list.add(cVar2);
            }
        }
    }

    protected List<c> b(c cVar, Direction direction) {
        ArrayList arrayList = new ArrayList();
        for (c cVar2 : this.f132782d) {
            int i10 = a.f132783a[direction.ordinal()];
            if (i10 != 1) {
                if (i10 == 2 && cVar2.G() >= cVar.D()) {
                    arrayList.add(cVar2);
                }
            } else if (cVar2.D() <= cVar.G()) {
                arrayList.add(cVar2);
            }
        }
        return arrayList;
    }

    protected List<c> c(c cVar) {
        return b(cVar, Direction.LEFT);
    }

    protected List<c> d(c cVar) {
        return b(cVar, Direction.RIGHT);
    }

    public int e(List<c> list) {
        int i10 = -1;
        int i11 = -1;
        for (c cVar : list) {
            int iD = cVar.D();
            int iG = cVar.G();
            if (i10 == -1 || iD < i10) {
                i10 = iD;
            }
            if (i11 == -1 || iG > i11) {
                i11 = iG;
            }
        }
        return (i10 + i11) / 2;
    }

    protected List<c> f(IntervalNode intervalNode, c cVar) {
        return intervalNode != null ? intervalNode.g(cVar) : Collections.emptyList();
    }

    public List<c> g(c cVar) {
        ArrayList arrayList = new ArrayList();
        if (this.f132781c < cVar.D()) {
            a(cVar, arrayList, f(this.f132780b, cVar));
            a(cVar, arrayList, d(cVar));
        } else if (this.f132781c > cVar.G()) {
            a(cVar, arrayList, f(this.f132779a, cVar));
            a(cVar, arrayList, c(cVar));
        } else {
            a(cVar, arrayList, this.f132782d);
            a(cVar, arrayList, f(this.f132779a, cVar));
            a(cVar, arrayList, f(this.f132780b, cVar));
        }
        return arrayList;
    }
}
