package io.flutter.plugin.editing;

import androidx.annotation.j1;
import androidx.annotation.n0;
import io.flutter.Log;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class TextEditingDelta {
    private static final String TAG = "TextEditingDelta";
    private int deltaEnd;
    private int deltaStart;

    @n0
    private CharSequence deltaText;
    private int newComposingEnd;
    private int newComposingStart;
    private int newSelectionEnd;
    private int newSelectionStart;

    @n0
    private CharSequence oldText;

    public TextEditingDelta(@n0 CharSequence charSequence, int i10, int i11, int i12, int i13) {
        this.newSelectionStart = i10;
        this.newSelectionEnd = i11;
        this.newComposingStart = i12;
        this.newComposingEnd = i13;
        setDeltas(charSequence, "", -1, -1);
    }

    public TextEditingDelta(@n0 CharSequence charSequence, int i10, int i11, @n0 CharSequence charSequence2, int i12, int i13, int i14, int i15) {
        this.newSelectionStart = i12;
        this.newSelectionEnd = i13;
        this.newComposingStart = i14;
        this.newComposingEnd = i15;
        setDeltas(charSequence, charSequence2.toString(), i10, i11);
    }

    private void setDeltas(@n0 CharSequence charSequence, @n0 CharSequence charSequence2, int i10, int i11) {
        this.oldText = charSequence;
        this.deltaText = charSequence2;
        this.deltaStart = i10;
        this.deltaEnd = i11;
    }

    @j1
    public int getDeltaEnd() {
        return this.deltaEnd;
    }

    @j1
    public int getDeltaStart() {
        return this.deltaStart;
    }

    @j1
    @n0
    public CharSequence getDeltaText() {
        return this.deltaText;
    }

    @j1
    public int getNewComposingEnd() {
        return this.newComposingEnd;
    }

    @j1
    public int getNewComposingStart() {
        return this.newComposingStart;
    }

    @j1
    public int getNewSelectionEnd() {
        return this.newSelectionEnd;
    }

    @j1
    public int getNewSelectionStart() {
        return this.newSelectionStart;
    }

    @j1
    @n0
    public CharSequence getOldText() {
        return this.oldText;
    }

    @n0
    public JSONObject toJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("oldText", this.oldText.toString());
            jSONObject.put("deltaText", this.deltaText.toString());
            jSONObject.put("deltaStart", this.deltaStart);
            jSONObject.put("deltaEnd", this.deltaEnd);
            jSONObject.put("selectionBase", this.newSelectionStart);
            jSONObject.put("selectionExtent", this.newSelectionEnd);
            jSONObject.put("composingBase", this.newComposingStart);
            jSONObject.put("composingExtent", this.newComposingEnd);
        } catch (JSONException e10) {
            Log.e(TAG, "unable to create JSONObject: " + e10);
        }
        return jSONObject;
    }
}
