package com.example.certificatemanager.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "BIGTABLE")
public class BigTable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 1000)
    private String systemuser;
    @Column(length = 1000)
    private String server;
    @Column(length = 1000)
    private String zertifikatsname;
    private String gueltigkeit;
    @Column(length = 1000)
    private String zweck;
    private String mq;
    private String channel;
    private String issuer;
    private String rvsStation;
    private String odetteId;
    private String mysqlUser;
    private String oracleUser;
    private String typ;
    private String zone;
    @Column(length = 1000)
    private String installationsverzeichnis;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "systemID", referencedColumnName = "systemID")
    private SystemStage systemStage;

    // Getter und Setter
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSystemuser() {
        return systemuser;
    }

    public void setSystemuser(String systemuser) {
        this.systemuser = systemuser;
    }

    public String getServer() {
        return server;
    }

    public void setServer(String server) {
        this.server = server;
    }

    public String getZertifikatsname() {
        return zertifikatsname;
    }

    public void setZertifikatsname(String zertifikatsname) {
        this.zertifikatsname = zertifikatsname;
    }

    public String getGueltigkeit() {
        return gueltigkeit;
    }

    public void setGueltigkeit(String gueltigkeit) {
        this.gueltigkeit = gueltigkeit;
    }

    public String getZweck() {
        return zweck;
    }

    public void setZweck(String zweck) {
        this.zweck = zweck;
    }

    public String getMq() {
        return mq;
    }

    public void setMq(String mq) {
        this.mq = mq;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public String getIssuer() {
        return issuer;
    }

    public void setIssuer(String issuer) {
        this.issuer = issuer;
    }

    public String getRvsStation() {
        return rvsStation;
    }

    public void setRvsStation(String rvsStation) {
        this.rvsStation = rvsStation;
    }

    public String getOdetteId() {
        return odetteId;
    }

    public void setOdetteId(String odetteId) {
        this.odetteId = odetteId;
    }

    public String getMysqlUser() {
        return mysqlUser;
    }

    public void setMysqlUser(String mysqlUser) {
        this.mysqlUser = mysqlUser;
    }

    public String getOracleUser() {
        return oracleUser;
    }

    public void setOracleUser(String oracleUser) {
        this.oracleUser = oracleUser;
    }

    public String getTyp() {
        return typ;
    }

    public void setTyp(String typ) {
        this.typ = typ;
    }

    public String getZone() {
        return zone;
    }

    public void setZone(String zone) {
        this.zone = zone;
    }

    public String getInstallationsverzeichnis() {
        return installationsverzeichnis;
    }

    public void setInstallationsverzeichnis(String installationsverzeichnis) {
        this.installationsverzeichnis = installationsverzeichnis;
    }

    public SystemStage getSystemStage() {
        return systemStage;
    }

    public void setSystemStage(SystemStage systemStage) {
        this.systemStage = systemStage;
    }
}
