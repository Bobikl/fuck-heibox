package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.res.Resources;
import com.google.android.gms.common.R;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* JADX INFO: loaded from: classes7.dex */
@v8.a
public class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Resources f52555a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f52556b;

    public u(@androidx.annotation.n0 Context context) {
        p.l(context);
        Resources resources = context.getResources();
        this.f52555a = resources;
        this.f52556b = resources.getResourcePackageName(R.string.common_google_play_services_unknown_issue);
    }

    @v8.a
    @androidx.annotation.p0
    public String a(@androidx.annotation.n0 String str) {
        int identifier = this.f52555a.getIdentifier(str, androidx.constraintlayout.core.motion.utils.w.b.f17895e, this.f52556b);
        if (identifier == 0) {
            return null;
        }
        return this.f52555a.getString(identifier);
    }
}
