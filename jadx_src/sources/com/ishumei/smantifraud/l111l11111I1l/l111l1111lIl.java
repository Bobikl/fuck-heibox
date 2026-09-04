package com.ishumei.smantifraud.l111l11111I1l;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.view.Display;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class l111l1111lIl {
    private final List<Map<String, Object>> l1111l111111Il = new ArrayList();
    private DisplayManager l111l11111I1l;
    private int l111l11111lIl;

    public final int l1111l111111Il() {
        return this.l111l11111lIl;
    }

    public final boolean l1111l111111Il(Context context, boolean z10) {
        Display[] displays;
        try {
            if (this.l111l11111I1l == null) {
                this.l111l11111I1l = (DisplayManager) context.getSystemService("display");
            }
            DisplayManager displayManager = this.l111l11111I1l;
            if (displayManager != null && (displays = displayManager.getDisplays()) != null && displays.length > 1) {
                if (this.l111l11111lIl == 0) {
                    this.l111l11111lIl = 1;
                }
                this.l1111l111111Il.clear();
                for (Display display : displays) {
                    HashMap map = new HashMap();
                    try {
                        map.put("flg", Integer.valueOf(display.getFlags()));
                        Field declaredField = Display.class.getDeclaredField("mOwnerPackageName");
                        declaredField.setAccessible(true);
                        map.put("opn", declaredField.get(display));
                    } catch (Throwable unused) {
                    }
                    this.l1111l111111Il.add(map);
                }
                return true;
            }
        } catch (Throwable unused2) {
        }
        return false;
    }

    public final List<Map<String, Object>> l111l11111lIl() {
        return new ArrayList(this.l1111l111111Il);
    }
}
