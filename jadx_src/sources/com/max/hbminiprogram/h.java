package com.max.hbminiprogram;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import java.util.Map;

/* JADX INFO: compiled from: MiniProgramContext.kt */
/* JADX INFO: loaded from: classes11.dex */
public interface h extends f, com.max.hbcommon.base.n {
    @dl.e
    String B();

    void B0(boolean z10);

    void E(@dl.e Intent intent);

    void F(@dl.e String str, @dl.e Map<String, Object> map);

    void N();

    void Q();

    @dl.e
    Fragment T();

    void V(@dl.e io.reactivex.disposables.b bVar);

    void a();

    @dl.d
    Context getContext();

    boolean isDestroyed();

    boolean isFinishing();

    void j(@dl.e Fragment fragment);

    @dl.e
    i k0();

    boolean p();

    boolean p0();

    boolean s0(@dl.d String str, @dl.e Bundle bundle);

    void x0();
}
