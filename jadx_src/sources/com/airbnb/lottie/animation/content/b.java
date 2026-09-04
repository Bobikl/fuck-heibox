package com.airbnb.lottie.animation.content;

import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: CompoundTrimPathContent.java */
/* JADX INFO: loaded from: classes6.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<t> f37123a = new ArrayList();

    void a(t tVar) {
        this.f37123a.add(tVar);
    }

    public void b(Path path) {
        for (int size = this.f37123a.size() - 1; size >= 0; size--) {
            com.airbnb.lottie.utils.j.b(path, this.f37123a.get(size));
        }
    }
}
