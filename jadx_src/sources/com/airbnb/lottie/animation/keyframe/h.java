package com.airbnb.lottie.animation.keyframe;

import android.graphics.Path;
import com.airbnb.lottie.model.content.Mask;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: MaskKeyframeAnimation.java */
/* JADX INFO: loaded from: classes6.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<a<com.airbnb.lottie.model.content.i, Path>> f37276a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<a<Integer, Integer>> f37277b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List<Mask> f37278c;

    public h(List<Mask> list) {
        this.f37278c = list;
        this.f37276a = new ArrayList(list.size());
        this.f37277b = new ArrayList(list.size());
        for (int i10 = 0; i10 < list.size(); i10++) {
            this.f37276a.add(list.get(i10).b().q());
            this.f37277b.add(list.get(i10).c().q());
        }
    }

    public List<a<com.airbnb.lottie.model.content.i, Path>> a() {
        return this.f37276a;
    }

    public List<Mask> b() {
        return this.f37278c;
    }

    public List<a<Integer, Integer>> c() {
        return this.f37277b;
    }
}
