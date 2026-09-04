package com.starlightc.ucropplus.network.gson;

import com.google.gson.Gson;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.max.hbutils.utils.k;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.starlightc.ucropplus.model.puzzle.BasePuzzleInfo;
import com.starlightc.ucropplus.model.puzzle.ColorPuzzle;
import com.starlightc.ucropplus.model.puzzle.ContentPicturePuzzle;
import com.starlightc.ucropplus.model.puzzle.LabelPuzzle;
import com.starlightc.ucropplus.model.puzzle.StaticPicturePuzzle;
import com.starlightc.ucropplus.model.puzzle.TextPuzzle;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes4.dex */
public class BasePuzzleInfoDeserializer implements JsonDeserializer<BasePuzzleInfo> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.gson.JsonDeserializer
    public BasePuzzleInfo deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{jsonElement, type, jsonDeserializationContext}, this, changeQuickRedirect, false, 50249, new Class[]{JsonElement.class, Type.class, JsonDeserializationContext.class}, BasePuzzleInfo.class);
        if (patchProxyResultProxy.isSupported) {
            return (BasePuzzleInfo) patchProxyResultProxy.result;
        }
        JsonObject asJsonObject = jsonElement.getAsJsonObject();
        String asString = asJsonObject.get("type") != null ? asJsonObject.get("type").getAsString() : null;
        if (BasePuzzleInfo.PUZZLE_TYPE_STATIC_PICTURE.equals(asString)) {
            return (BasePuzzleInfo) new Gson().fromJson(asJsonObject.toString(), StaticPicturePuzzle.class);
        }
        if (BasePuzzleInfo.PUZZLE_TYPE_CONTENT_PICTURE.equals(asString)) {
            return (BasePuzzleInfo) k.a(asJsonObject.toString(), ContentPicturePuzzle.class);
        }
        if ("text".equals(asString)) {
            return (BasePuzzleInfo) k.a(asJsonObject.toString(), TextPuzzle.class);
        }
        if ("color".equals(asString)) {
            return (BasePuzzleInfo) k.a(asJsonObject.toString(), ColorPuzzle.class);
        }
        return BasePuzzleInfo.PUZZLE_TYPE_LABEL.equals(asString) ? (BasePuzzleInfo) k.a(asJsonObject.toString(), LabelPuzzle.class) : (BasePuzzleInfo) new Gson().fromJson(asJsonObject.toString(), BasePuzzleInfo.class);
    }

    /* JADX WARN: Type inference failed for: r9v2, types: [com.starlightc.ucropplus.model.puzzle.BasePuzzleInfo, java.lang.Object] */
    @Override // com.google.gson.JsonDeserializer
    public /* bridge */ /* synthetic */ BasePuzzleInfo deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{jsonElement, type, jsonDeserializationContext}, this, changeQuickRedirect, false, 50250, new Class[]{JsonElement.class, Type.class, JsonDeserializationContext.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : deserialize(jsonElement, type, jsonDeserializationContext);
    }
}
