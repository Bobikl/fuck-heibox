package com.tencent.beacon.module;

import android.content.Context;
import com.tencent.beacon.base.net.c.e;
import com.tencent.beacon.base.util.c;
import com.tencent.beacon.e.a;
import com.tencent.beacon.e.b;
import com.tencent.beacon.e.g;
import com.tencent.beacon.e.h;

/* JADX INFO: loaded from: classes4.dex */
public class StrategyModule implements BeaconModule {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f99245a = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private h f99247c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f99249e = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private b f99248d = b.a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private a f99246b = a.a();

    public StrategyModule() {
        g.b().a(this.f99246b);
        this.f99247c = new h(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void d() {
        if (!this.f99247c.a()) {
            com.tencent.beacon.a.b.a.a().a(this.f99247c);
        }
    }

    public a a() {
        return this.f99246b;
    }

    @Override // com.tencent.beacon.module.BeaconModule
    public void a(Context context) {
        c.a("[module] strategy module > TRUE", new Object[0]);
        this.f99247c.b();
        d();
        e.a(context, new e.a() { // from class: com.tencent.beacon.module.StrategyModule.1
            @Override // com.tencent.beacon.base.net.c.e.a
            public void a() {
                synchronized (StrategyModule.this) {
                    if (!StrategyModule.this.c() && !StrategyModule.this.f99247c.a()) {
                        StrategyModule.this.d();
                    }
                }
            }

            @Override // com.tencent.beacon.base.net.c.e.a
            public void b() {
            }
        });
    }

    public void a(boolean z10) {
        synchronized (f99245a) {
            this.f99249e = z10;
        }
    }

    public b b() {
        return this.f99248d;
    }

    public boolean c() {
        boolean z10;
        synchronized (f99245a) {
            z10 = this.f99249e;
        }
        return z10;
    }
}
