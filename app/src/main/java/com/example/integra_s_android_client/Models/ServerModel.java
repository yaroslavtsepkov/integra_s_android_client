package com.example.integra_s_android_client.Models;

import com.example.integra_s_android_client.IModels.IServerModel;

public class ServerModel implements IServerModel {
    String ip;

    public ServerModel(String ip){
        this.ip = ip;
    }

    @Override
    public String getIp() {
        return ip;
    }

    @Override
    public boolean isIpValidate(String ip) {
        if (ip.isEmpty()) {
            return false;
        }
        else {
            String PATTERN = "^((0|1\\d?\\d?|2[0-4]?\\d?|25[0-5]?|[3-9]\\d?)\\.){3}(0|1\\d?\\d?|2[0-4]?\\d?|25[0-5]?|[3-9]\\d?)$";
            return ip.matches(PATTERN);
        }
    }

}
