package com.vw.CertificateManager.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "master_table")
public class database {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String System;
    private String Stage;
    private String Systemuser;

    @Column(name = "Server/Ablageort")
    private String ServerAblageort;

    @Column(name = "Zertifikatsname/DNS")
    private String ZertifikatsnameDNS;

    @Column(name = "Gültigkeit")
    private String Gültigkeit; // z. B. "19.01.2024 - 25.01.2025"

    private String Zweck;
    private String MQ;
    private String Channel;
    private String Issuer;

    @Column(name = "RVS Station")
    private String RVSStation;

    @Column(name = "Odette-ID")
    private String OdetteID;

    private String MySQLUser;
    private String OracleUser;
    private String Typ;

    // Getter und Setter
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getSystem() { return System; }
    public void setSystem(String system) { this.System = system; }

    public String getStage() { return Stage; }
    public void setStage(String stage) { this.Stage = stage; }

    public String getSystemuser() { return Systemuser; }
    public void setSystemuser(String systemuser) { this.Systemuser = systemuser; }

    public String getServerAblageort() { return ServerAblageort; }
    public void setServerAblageort(String serverAblageort) { this.ServerAblageort = serverAblageort; }

    public String getZertifikatsnameDNS() { return ZertifikatsnameDNS; }
    public void setZertifikatsnameDNS(String zertifikatsnameDNS) { this.ZertifikatsnameDNS = zertifikatsnameDNS; }

    public String getGültigkeit() { return Gültigkeit; }
    public void setGültigkeit(String gültigkeit) { this.Gültigkeit = gültigkeit; }

    public String getZweck() { return Zweck; }
    public void setZweck(String zweck) { this.Zweck = zweck; }

    public String getMQ() { return MQ; }
    public void setMQ(String mq) { this.MQ = mq; }

    public String getChannel() { return Channel; }
    public void setChannel(String channel) { this.Channel = channel; }

    public String getIssuer() { return Issuer; }
    public void setIssuer(String issuer) { this.Issuer = issuer; }

    public String getRVSStation() { return RVSStation; }
    public void setRVSStation(String rvsStation) { this.RVSStation = rvsStation; }

    public String getOdetteID() { return OdetteID; }
    public void setOdetteID(String odetteID) { this.OdetteID = odetteID; }

    public String getMySQLUser() { return MySQLUser; }
    public void setMySQLUser(String mySQLUser) { this.MySQLUser = mySQLUser; }

    public String getOracleUser() { return OracleUser; }
    public void setOracleUser(String oracleUser) { this.OracleUser = oracleUser; }

    public String getTyp() { return Typ; }
    public void setTyp(String typ) { this.Typ = typ; }
}
