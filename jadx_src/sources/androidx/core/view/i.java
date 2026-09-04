package androidx.core.view;

import android.app.Activity;
import android.os.Build;
import android.view.DragAndDropPermissions;
import android.view.DragEvent;
import androidx.annotation.RestrictTo;

/* JADX INFO: compiled from: DragAndDropPermissionsCompat.java */
/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final DragAndDropPermissions f21545a;

    /* JADX INFO: compiled from: DragAndDropPermissionsCompat.java */
    @androidx.annotation.w0(24)
    public static class a {
        private a() {
        }

        @androidx.annotation.u
        static void a(DragAndDropPermissions dragAndDropPermissions) {
            dragAndDropPermissions.release();
        }

        @androidx.annotation.u
        static DragAndDropPermissions b(Activity activity, DragEvent dragEvent) {
            return activity.requestDragAndDropPermissions(dragEvent);
        }
    }

    private i(DragAndDropPermissions dragAndDropPermissions) {
        this.f21545a = dragAndDropPermissions;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @androidx.annotation.p0
    public static i b(@androidx.annotation.n0 Activity activity, @androidx.annotation.n0 DragEvent dragEvent) {
        DragAndDropPermissions dragAndDropPermissionsB;
        if (Build.VERSION.SDK_INT < 24 || (dragAndDropPermissionsB = a.b(activity, dragEvent)) == null) {
            return null;
        }
        return new i(dragAndDropPermissionsB);
    }

    public void a() {
        if (Build.VERSION.SDK_INT >= 24) {
            a.a(this.f21545a);
        }
    }
}
