package com.max.xiaoheihe.module.story;

import androidx.compose.runtime.internal.o;
import com.max.hbstory.bean.StoryItemsObj;
import com.max.hbstory.bean.StoryNextOffsetCardObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import dl.e;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: StoryNormalDataRepository.kt */
/* JADX INFO: loaded from: classes12.dex */
@o(parameters = 0)
public final class b implements qd.a {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f91946i = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f91947a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f91948b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private List<StoryItemsObj> f91949c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f91950d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f91951e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f91952f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f91953g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @e
    private StoryNextOffsetCardObj f91954h;

    @Override // qd.a
    public void a(boolean z10) {
        this.f91948b = z10;
    }

    @Override // qd.a
    public void b(int i10) {
        this.f91953g = i10;
    }

    @Override // qd.a
    @e
    public StoryNextOffsetCardObj c() {
        return this.f91954h;
    }

    @Override // qd.a
    public void d(boolean z10) {
        this.f91947a = z10;
    }

    @Override // qd.a
    public int e() {
        return this.f91952f;
    }

    @Override // qd.a
    public int f() {
        return this.f91950d;
    }

    @Override // qd.a
    @dl.d
    public List<StoryItemsObj> g() {
        return this.f91949c;
    }

    @Override // qd.a
    public void h(int i10) {
        this.f91952f = i10;
    }

    @Override // qd.a
    public void i(int i10) {
        this.f91950d = i10;
    }

    @Override // qd.a
    public void j(boolean z10) {
        this.f91951e = z10;
    }

    @Override // qd.a
    public boolean k() {
        return this.f91947a;
    }

    @Override // qd.a
    public void l(@e StoryNextOffsetCardObj storyNextOffsetCardObj) {
        this.f91954h = storyNextOffsetCardObj;
    }

    @Override // qd.a
    public void m(@dl.d List<StoryItemsObj> list) {
        if (PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, 43525, new Class[]{List.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(list, "<set-?>");
        this.f91949c = list;
    }

    @Override // qd.a
    public boolean n() {
        return this.f91948b;
    }

    @Override // qd.a
    public int o() {
        return this.f91953g;
    }

    @Override // qd.a
    public boolean p() {
        return this.f91951e;
    }
}
