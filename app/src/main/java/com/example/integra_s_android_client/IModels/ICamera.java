package com.example.integra_s_android_client.IModels;

public interface ICamera {
    public String getCamActive();

    public void setCamActive(String camActive);

    public Long getId();

    public void setId(Long id);

    public String getServerName();

    public void setServerName(String serverName);


    public String getCamKey1();

    public void setCamKey1(String camKey1);

    public String getCamKey2();

    public void setCamKey2(String camKey2);

    //camHash
    public String getCamHash();

    public void setCamHash(String camHash);

    public String getCamProfiles();

    public void setCamProfiles(String camProfiles);

    public Integer getCamRtsp();

    public void setCamRtsp(Integer camRtsp);

    public String getCreatedAt();

    public void setCreatedAt(String createdAt);

    public String getUpdatedAt();

    public void setUpdatedAt(String updatedAt);

    public Long getCamId();

    public void setCamId(Long camId);

    public String getCamUn ();

    public void setCamUn(String camUn);
}
