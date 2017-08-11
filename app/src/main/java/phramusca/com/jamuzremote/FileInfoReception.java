package phramusca.com.jamuzremote;

import android.media.MediaMetadataRetriever;
import android.util.Log;

import com.google.gson.Gson;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.File;

/**
 * Created by raph on 01/05/17.
 */
public class FileInfoReception {
    public String relativeFullPath;
    public long size;
    public int idFile;

    public FileInfoReception(String relativeFullPath, long size, int idFile) {
        this.relativeFullPath = relativeFullPath;
        this.size = size;
        this.idFile = idFile;
    }

    public FileInfoReception(String json) throws JSONException {
        this(new JSONObject(json));
    }

    public FileInfoReception(JSONObject file) {
        try {
            relativeFullPath = file.getString("path");
            size = file.getLong("size");
            idFile = file.getInt("idFile");
        } catch (JSONException e) {
        }
    }

    @Override
    public String toString() {
        return relativeFullPath+"\nSize: "+size+" bytes. idFile="+idFile;
    }
}