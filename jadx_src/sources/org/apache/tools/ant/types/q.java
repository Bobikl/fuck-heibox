package org.apache.tools.ant.types;

import com.max.xiaoheihe.bean.bbs.BBSTopicObj;
import java.util.Arrays;
import org.apache.tools.ant.BuildException;

/* JADX INFO: compiled from: Comparison.java */
/* JADX INFO: loaded from: classes5.dex */
public class q extends w {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String[] f136291c = {"equal", "greater", "less", "ne", "ge", "le", "eq", "gt", "lt", BBSTopicObj.VIRTUAL_TAG_MORE};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final q f136292d = new q("equal");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final q f136293e = new q("ne");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final q f136294f = new q("greater");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final q f136295g = new q("less");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final q f136296h = new q("ge");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final q f136297i = new q("le");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int[] f136298j = {0, 4, 5, 6};

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final int[] f136299k = {2, 3, 5, 8};

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final int[] f136300l = {1, 3, 4, 7, 9};

    public q() {
    }

    public q(String str) {
        g(str);
    }

    @Override // org.apache.tools.ant.types.w
    public String[] e() {
        return f136291c;
    }

    public boolean h(int i10) {
        int[] iArr;
        if (b() == -1) {
            throw new BuildException("Comparison value not set.");
        }
        if (i10 < 0) {
            iArr = f136299k;
        } else {
            iArr = i10 > 0 ? f136300l : f136298j;
        }
        return Arrays.binarySearch(iArr, b()) >= 0;
    }
}
