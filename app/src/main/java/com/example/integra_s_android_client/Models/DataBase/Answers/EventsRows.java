package com.example.integra_s_android_client.Models.DataBase.Answers;

import java.io.Serializable;

public class EventsRows implements Serializable {
        String server_id;
        int evtid;
        String evtcreatetime;
        String evttime;
        int evtgroupid;
        int evttypeid;
        String evtdevkey1;
        String evtdevkey2;
        String evtdevkey3;
        String evtip;
        int evtport;
        String evtcomment;
        String evtimagepath;
        int evtuserid;
        String evtuser;
        String evtisreaded;
        String evtsysinfo;
        String evtonvifxml;
        String evtrowhash;
        String evttype_str;

        String event_type;

        public EventsRows(
                String server_id,
                int evtid,
                String evtcreatetime,
                String evttime,
                int evtgroupid,
                int evttypeid,
                String evtdevkey1,
                String evtdevkey2,
                String evtdevkey3,
                String evtip,
                int evtport,
                String evtcomment,
                String evtimagepath,
                int evtuserid,
                String evtuser,
                String evtisreaded,
                String evtsysinfo,
                String evtonvifxml,
                String evtrowhash,
                String evttype_str,
                String event_type
        ) {
            this.server_id = server_id;
            this.evtid = evtid;
            this.evtcreatetime = evtcreatetime;
            this.evttime = evttime;
            this.evtgroupid = evtgroupid;
            this.evttypeid = evttypeid;
            this.evtdevkey1 = evtdevkey1;
            this.evtdevkey2 = evtdevkey2;
            this.evtdevkey3 = evtdevkey3;
            this.evtip = evtip ;
            this.evtport = evtport;
            this.evtcomment = evtcomment;
            this.evtimagepath = evtimagepath;
            this.evtuserid = evtuserid;
            this.evtuser = evtuser;
            this.evtisreaded = evtisreaded;
            this.evtsysinfo = evtsysinfo;
            this.evtonvifxml = evtonvifxml;
            this.evtrowhash = evtrowhash;
            this.evttype_str = evttype_str;
            this.event_type = event_type;
        }

        public String getEvtType(){
            return this.event_type;
        }

        public void setEvtType(String event_type){
            this.event_type = event_type;
        }

        public Integer getEvtTypeId(){ return this.evttypeid; }

        public String getSrvEvtTime() {
            return this.evttime;
        }

        public String getSrvEvtComm() {
            return this.evtcomment;
        }

        public String getSrvEvtSysInfo(){
            return this.evtsysinfo;
        }

        public String getSrvEvtType(){
            return this.evttype_str;
        }

        public String getEvtkey2(){ return this.evtdevkey2; }

        public String getEvtsys() { return this.evtsysinfo; }

        public String getEvtuser() { return this.evtuser; }

        public String getEvtimagepath() { return this.evtimagepath; }

        public int getSrvEvtId() {
            return this.evtid;
        }

    }
