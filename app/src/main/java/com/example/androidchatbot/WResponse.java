package com.example.androidchatbot;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

//  This is what our response looks like:
//        {
//        "status": true,
//        "response": "Hello, how are you feeling today?"
//        }
//

public class WResponse {
    @SerializedName("status")
    @Expose
    private String status;

    @SerializedName("response")
    @Expose
    private String response;

    public String getStatus(){
        return status;
    }

    public void setStatus(String Status) {
        this.status = status;
    }

    public String getResponse(){
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }
}
