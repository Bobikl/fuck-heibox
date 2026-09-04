package com.ishumei.smantifraud.l1111l111111Il;

import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes6.dex */
public final class l111l1111llIl implements com.ishumei.smantifraud.l111l1111l1Il.l1111l111111Il.l11l1111lIIl.l111l11111lIl<com.ishumei.smantifraud.l111l11111Il.l111l11111lIl> {
    private /* synthetic */ l111l1111l1Il l1111l111111Il;

    private l111l1111llIl(l111l1111l1Il l111l1111l1il) {
        this.l1111l111111Il = l111l1111l1il;
    }

    /* JADX INFO: renamed from: l1111l111111Il, reason: avoid collision after fix types in other method */
    public final void l1111l111111Il2(com.ishumei.smantifraud.l111l11111Il.l111l11111lIl l111l11111lil) {
        if (l111l11111lil.l1111l111111Il() == null) {
            return;
        }
        String string = l111l11111lil.l1111l111111Il().toString();
        this.l1111l111111Il.l111l11111Il = l111l1111l1Il.l1111l111111Il(string);
        SharedPreferences.Editor editorEdit = com.ishumei.smantifraud.l111l11111lIl.l111l1111l1Il.l1111l111111Il().getSharedPreferences("cloudms.conf", 0).edit();
        editorEdit.putString("conf", string);
        editorEdit.apply();
    }

    @Override // com.ishumei.smantifraud.l111l1111l1Il.l1111l111111Il.l11l1111lIIl.l111l11111lIl
    public final /* synthetic */ void l1111l111111Il(com.ishumei.smantifraud.l111l11111Il.l111l11111lIl l111l11111lil) {
        com.ishumei.smantifraud.l111l11111Il.l111l11111lIl l111l11111lil2 = l111l11111lil;
        if (l111l11111lil2.l1111l111111Il() != null) {
            String string = l111l11111lil2.l1111l111111Il().toString();
            this.l1111l111111Il.l111l11111Il = l111l1111l1Il.l1111l111111Il(string);
            SharedPreferences.Editor editorEdit = com.ishumei.smantifraud.l111l11111lIl.l111l1111l1Il.l1111l111111Il().getSharedPreferences("cloudms.conf", 0).edit();
            editorEdit.putString("conf", string);
            editorEdit.apply();
        }
    }
}
