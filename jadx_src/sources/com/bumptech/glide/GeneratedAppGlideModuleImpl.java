package com.bumptech.glide;

import android.content.Context;
import android.util.Log;
import androidx.annotation.n0;
import com.max.hbimage.image.MyAppGlideModule;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public final class GeneratedAppGlideModuleImpl extends GeneratedAppGlideModule {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final MyAppGlideModule f40514a = new MyAppGlideModule();

    public GeneratedAppGlideModuleImpl(Context context) {
        if (Log.isLoggable("Glide", 3)) {
            Log.d("Glide", "Discovered AppGlideModule from annotation: com.max.hbimage.image.MyAppGlideModule");
            Log.d("Glide", "Discovered LibraryGlideModule from annotation: com.bumptech.glide.integration.okhttp3.OkHttpLibraryGlideModule");
        }
    }

    @Override // y6.a, y6.b
    public void a(@n0 Context context, @n0 c cVar) {
        this.f40514a.a(context, cVar);
    }

    @Override // y6.d, y6.f
    public void b(@n0 Context context, @n0 Glide glide, @n0 Registry registry) {
        new com.bumptech.glide.integration.okhttp3.a().b(context, glide, registry);
        this.f40514a.b(context, glide, registry);
    }

    @Override // y6.a
    public boolean c() {
        return this.f40514a.c();
    }

    @Override // com.bumptech.glide.GeneratedAppGlideModule
    @n0
    public Set<Class<?>> d() {
        return Collections.emptySet();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.bumptech.glide.GeneratedAppGlideModule
    @n0
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public a e() {
        return new a();
    }
}
