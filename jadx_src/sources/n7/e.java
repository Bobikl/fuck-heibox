package n7;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.Window;
import android.widget.LinearLayout;

/* JADX INFO: loaded from: classes6.dex */
public final class e {
    private e() {
        throw new IllegalStateException("no instance.");
    }

    private static View a(Activity activity, int i10) {
        View view = new View(activity);
        view.setLayoutParams(new LinearLayout.LayoutParams(-1, b(activity)));
        view.setBackgroundColor(i10);
        return view;
    }

    public static int b(Context context) {
        return context.getResources().getDimensionPixelSize(context.getResources().getIdentifier("status_bar_height", "dimen", "android"));
    }

    public static void c(Activity activity, int i10) {
        activity.getWindow().setStatusBarColor(i10);
    }

    public static void d(Activity activity) {
        Window window = activity.getWindow();
        window.clearFlags(67108864);
        window.getDecorView().setSystemUiVisibility(1280);
        window.addFlags(Integer.MIN_VALUE);
        window.setStatusBarColor(0);
    }
}
