package androidx.media;

import android.content.Context;
import androidx.annotation.n0;
import androidx.annotation.w0;

/* JADX INFO: compiled from: MediaSessionManagerImplApi21.java */
/* JADX INFO: loaded from: classes6.dex */
@w0(21)
public class m extends o {
    m(Context context) {
        super(context);
        this.f24634a = context;
    }

    private boolean d(@n0 l.c cVar) {
        return getContext().checkPermission("android.permission.MEDIA_CONTENT_CONTROL", cVar.a(), cVar.getUid()) == 0;
    }

    @Override // androidx.media.o, androidx.media.l.a
    public boolean a(@n0 l.c cVar) {
        return d(cVar) || super.a(cVar);
    }
}
