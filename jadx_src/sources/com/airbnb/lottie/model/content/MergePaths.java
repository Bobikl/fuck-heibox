package com.airbnb.lottie.model.content;

import androidx.annotation.p0;

/* JADX INFO: loaded from: classes6.dex */
public class MergePaths implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f37490a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final MergePathsMode f37491b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f37492c;

    public enum MergePathsMode {
        MERGE,
        ADD,
        SUBTRACT,
        INTERSECT,
        EXCLUDE_INTERSECTIONS;

        public static MergePathsMode forId(int i10) {
            if (i10 == 1) {
                return MERGE;
            }
            if (i10 == 2) {
                return ADD;
            }
            if (i10 == 3) {
                return SUBTRACT;
            }
            if (i10 != 4) {
                return i10 != 5 ? MERGE : EXCLUDE_INTERSECTIONS;
            }
            return INTERSECT;
        }
    }

    public MergePaths(String str, MergePathsMode mergePathsMode, boolean z10) {
        this.f37490a = str;
        this.f37491b = mergePathsMode;
        this.f37492c = z10;
    }

    @Override // com.airbnb.lottie.model.content.c
    @p0
    public com.airbnb.lottie.animation.content.c a(com.airbnb.lottie.j jVar, com.airbnb.lottie.model.layer.a aVar) {
        if (jVar.v()) {
            return new com.airbnb.lottie.animation.content.l(this);
        }
        com.airbnb.lottie.utils.f.e("Animation contains merge paths but they are disabled.");
        return null;
    }

    public MergePathsMode b() {
        return this.f37491b;
    }

    public String c() {
        return this.f37490a;
    }

    public boolean d() {
        return this.f37492c;
    }

    public String toString() {
        return "MergePaths{mode=" + this.f37491b + '}';
    }
}
